package com.p051vm.shadowsocks.tunnel;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* renamed from: com.vm.shadowsocks.tunnel.RawTunnel */
public class RawTunnel extends Tunnel {
    /* access modifiers changed from: protected */
    public void afterReceived(ByteBuffer byteBuffer) {
    }

    /* access modifiers changed from: protected */
    public void beforeSend(ByteBuffer byteBuffer) {
    }

    /* access modifiers changed from: protected */
    public boolean isTunnelEstablished() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDispose() {
    }

    public RawTunnel(InetSocketAddress inetSocketAddress, Selector selector) {
        super(inetSocketAddress, selector);
    }

    public RawTunnel(SocketChannel socketChannel, Selector selector) {
        super(socketChannel, selector);
    }

    /* access modifiers changed from: protected */
    public void onConnected(ByteBuffer byteBuffer) {
        onTunnelEstablished();
    }
}
