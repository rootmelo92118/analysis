package com.p051vm.shadowsocks.tunnel.httpconnect;

import com.p051vm.shadowsocks.core.ProxyConfig;
import com.p051vm.shadowsocks.tunnel.Tunnel;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;

/* renamed from: com.vm.shadowsocks.tunnel.httpconnect.HttpConnectTunnel */
public class HttpConnectTunnel extends Tunnel {
    private HttpConnectConfig m_Config;
    private boolean m_TunnelEstablished;

    public HttpConnectTunnel(HttpConnectConfig httpConnectConfig, Selector selector) {
        super(httpConnectConfig.ServerAddress, selector);
        this.m_Config = httpConnectConfig;
    }

    /* access modifiers changed from: protected */
    public void onConnected(ByteBuffer byteBuffer) {
        String format = String.format("CONNECT %s:%d HTTP/1.0\r\nProxy-Connection: keep-alive\r\nUser-Agent: %s\r\nX-App-Install-ID: %s\r\n\r\n", new Object[]{this.m_DestAddress.getHostName(), Integer.valueOf(this.m_DestAddress.getPort()), ProxyConfig.Instance.getUserAgent(), ProxyConfig.AppInstallID});
        byteBuffer.clear();
        byteBuffer.put(format.getBytes());
        byteBuffer.flip();
        if (write(byteBuffer, true)) {
            beginReceive();
        }
    }

    /* access modifiers changed from: package-private */
    public void trySendPartOfHeader(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() > 10) {
            String upperCase = new String(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), 10).toUpperCase();
            if (upperCase.startsWith("GET /") || upperCase.startsWith("POST /")) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + 10);
                super.write(byteBuffer, false);
                byteBuffer.remaining();
                byteBuffer.limit(limit);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void beforeSend(ByteBuffer byteBuffer) {
        if (ProxyConfig.Instance.isIsolateHttpHostHeader()) {
            trySendPartOfHeader(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void afterReceived(ByteBuffer byteBuffer) {
        if (!this.m_TunnelEstablished) {
            String str = new String(byteBuffer.array(), byteBuffer.position(), 12);
            if (str.matches("^HTTP/1.[01] 200$")) {
                byteBuffer.limit(byteBuffer.position());
                this.m_TunnelEstablished = true;
                super.onTunnelEstablished();
                return;
            }
            throw new Exception(String.format("Proxy server responsed an error: %s", new Object[]{str}));
        }
    }

    /* access modifiers changed from: protected */
    public boolean isTunnelEstablished() {
        return this.m_TunnelEstablished;
    }

    /* access modifiers changed from: protected */
    public void onDispose() {
        this.m_Config = null;
    }
}
