package com.p051vm.shadowsocks.tunnel;

import android.annotation.SuppressLint;
import com.p051vm.shadowsocks.core.LocalVpnService;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* renamed from: com.vm.shadowsocks.tunnel.Tunnel */
public abstract class Tunnel {
    static final ByteBuffer GL_BUFFER = ByteBuffer.allocate(20000);
    public static long SessionCount;
    private Tunnel m_BrotherTunnel;
    protected InetSocketAddress m_DestAddress;
    private boolean m_Disposed;
    private SocketChannel m_InnerChannel;
    private Selector m_Selector;
    private ByteBuffer m_SendRemainBuffer;
    private InetSocketAddress m_ServerEP;

    /* access modifiers changed from: protected */
    public abstract void afterReceived(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract void beforeSend(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract boolean isTunnelEstablished();

    /* access modifiers changed from: protected */
    public abstract void onConnected(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract void onDispose();

    public Tunnel(SocketChannel socketChannel, Selector selector) {
        this.m_InnerChannel = socketChannel;
        this.m_Selector = selector;
        SessionCount++;
    }

    public Tunnel(InetSocketAddress inetSocketAddress, Selector selector) {
        SocketChannel open = SocketChannel.open();
        open.configureBlocking(false);
        this.m_InnerChannel = open;
        this.m_Selector = selector;
        this.m_ServerEP = inetSocketAddress;
        SessionCount++;
    }

    public void setBrotherTunnel(Tunnel tunnel) {
        this.m_BrotherTunnel = tunnel;
    }

    public void connect(InetSocketAddress inetSocketAddress) {
        if (LocalVpnService.Instance.protect(this.m_InnerChannel.socket())) {
            this.m_DestAddress = inetSocketAddress;
            this.m_InnerChannel.register(this.m_Selector, 8, this);
            this.m_InnerChannel.connect(this.m_ServerEP);
            return;
        }
        throw new Exception("VPN protect socket failed.");
    }

    /* access modifiers changed from: protected */
    public void beginReceive() {
        if (this.m_InnerChannel.isBlocking()) {
            this.m_InnerChannel.configureBlocking(false);
        }
        this.m_InnerChannel.register(this.m_Selector, 1, this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000c, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean write(java.nio.ByteBuffer r2, boolean r3) {
        /*
            r1 = this;
        L_0x0000:
            boolean r0 = r2.hasRemaining()
            if (r0 == 0) goto L_0x000e
            java.nio.channels.SocketChannel r0 = r1.m_InnerChannel
            int r0 = r0.write(r2)
            if (r0 != 0) goto L_0x0000
        L_0x000e:
            boolean r0 = r2.hasRemaining()
            if (r0 == 0) goto L_0x003d
            if (r3 == 0) goto L_0x003b
            java.nio.ByteBuffer r3 = r1.m_SendRemainBuffer
            if (r3 != 0) goto L_0x0024
            int r3 = r2.capacity()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            r1.m_SendRemainBuffer = r3
        L_0x0024:
            java.nio.ByteBuffer r3 = r1.m_SendRemainBuffer
            r3.clear()
            java.nio.ByteBuffer r3 = r1.m_SendRemainBuffer
            r3.put(r2)
            java.nio.ByteBuffer r2 = r1.m_SendRemainBuffer
            r2.flip()
            java.nio.channels.SocketChannel r2 = r1.m_InnerChannel
            java.nio.channels.Selector r3 = r1.m_Selector
            r0 = 4
            r2.register(r3, r0, r1)
        L_0x003b:
            r2 = 0
            return r2
        L_0x003d:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p051vm.shadowsocks.tunnel.Tunnel.write(java.nio.ByteBuffer, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public void onTunnelEstablished() {
        beginReceive();
        this.m_BrotherTunnel.beginReceive();
    }

    @SuppressLint({"DefaultLocale"})
    public void onConnectable() {
        try {
            if (this.m_InnerChannel.finishConnect()) {
                onConnected(GL_BUFFER);
            } else {
                dispose();
            }
        } catch (Exception unused) {
            dispose();
        }
    }

    public void onReadable(SelectionKey selectionKey) {
        try {
            ByteBuffer byteBuffer = GL_BUFFER;
            byteBuffer.clear();
            int read = this.m_InnerChannel.read(byteBuffer);
            if (read > 0) {
                byteBuffer.flip();
                afterReceived(byteBuffer);
                if (isTunnelEstablished() && byteBuffer.hasRemaining()) {
                    this.m_BrotherTunnel.beforeSend(byteBuffer);
                    if (!this.m_BrotherTunnel.write(byteBuffer, true)) {
                        selectionKey.cancel();
                    }
                }
            } else if (read < 0) {
                dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
            dispose();
        }
    }

    public void onWritable(SelectionKey selectionKey) {
        try {
            beforeSend(this.m_SendRemainBuffer);
            if (write(this.m_SendRemainBuffer, false)) {
                selectionKey.cancel();
                if (isTunnelEstablished()) {
                    this.m_BrotherTunnel.beginReceive();
                } else {
                    beginReceive();
                }
            }
        } catch (Exception unused) {
            dispose();
        }
    }

    public void dispose() {
        disposeInternal(true);
    }

    /* access modifiers changed from: package-private */
    public void disposeInternal(boolean z) {
        if (!this.m_Disposed) {
            try {
                this.m_InnerChannel.close();
            } catch (Exception unused) {
            }
            if (this.m_BrotherTunnel != null && z) {
                this.m_BrotherTunnel.disposeInternal(false);
            }
            this.m_InnerChannel = null;
            this.m_SendRemainBuffer = null;
            this.m_Selector = null;
            this.m_BrotherTunnel = null;
            this.m_Disposed = true;
            SessionCount--;
            onDispose();
        }
    }
}
