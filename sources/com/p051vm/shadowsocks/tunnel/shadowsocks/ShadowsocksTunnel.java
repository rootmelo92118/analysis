package com.p051vm.shadowsocks.tunnel.shadowsocks;

import com.p051vm.shadowsocks.tunnel.Tunnel;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.ShadowsocksTunnel */
public class ShadowsocksTunnel extends Tunnel {
    private ShadowsocksConfig m_Config;
    private ICrypt m_Encryptor = CryptFactory.get(this.m_Config.EncryptMethod, this.m_Config.Password);
    private boolean m_TunnelEstablished;

    public ShadowsocksTunnel(ShadowsocksConfig shadowsocksConfig, Selector selector) {
        super(shadowsocksConfig.ServerAddress, selector);
        this.m_Config = shadowsocksConfig;
    }

    /* access modifiers changed from: protected */
    public void onConnected(ByteBuffer byteBuffer) {
        byteBuffer.clear();
        byteBuffer.put((byte) 3);
        byte[] bytes = this.m_DestAddress.getHostName().getBytes();
        byteBuffer.put((byte) bytes.length);
        byteBuffer.put(bytes);
        byteBuffer.putShort((short) this.m_DestAddress.getPort());
        byteBuffer.flip();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        byteBuffer.clear();
        byteBuffer.put(this.m_Encryptor.encrypt(bArr));
        byteBuffer.flip();
        if (write(byteBuffer, true)) {
            this.m_TunnelEstablished = true;
            onTunnelEstablished();
            return;
        }
        this.m_TunnelEstablished = true;
        beginReceive();
    }

    /* access modifiers changed from: protected */
    public boolean isTunnelEstablished() {
        return this.m_TunnelEstablished;
    }

    /* access modifiers changed from: protected */
    public void beforeSend(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        byte[] encrypt = this.m_Encryptor.encrypt(bArr);
        byteBuffer.clear();
        byteBuffer.put(encrypt);
        byteBuffer.flip();
    }

    /* access modifiers changed from: protected */
    public void afterReceived(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        byte[] decrypt = this.m_Encryptor.decrypt(bArr);
        new String(decrypt);
        byteBuffer.clear();
        byteBuffer.put(decrypt);
        byteBuffer.flip();
    }

    /* access modifiers changed from: protected */
    public void onDispose() {
        this.m_Config = null;
        this.m_Encryptor = null;
    }
}
