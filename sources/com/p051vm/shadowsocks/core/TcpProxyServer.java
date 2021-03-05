package com.p051vm.shadowsocks.core;

import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/* renamed from: com.vm.shadowsocks.core.TcpProxyServer */
public class TcpProxyServer implements Runnable {
    public short Port;
    public boolean Stopped;
    Selector m_Selector = Selector.open();
    ServerSocketChannel m_ServerSocketChannel = ServerSocketChannel.open();
    Thread m_ServerThread;

    public TcpProxyServer(int i) {
        this.m_ServerSocketChannel.configureBlocking(false);
        this.m_ServerSocketChannel.socket().bind(new InetSocketAddress(i));
        this.m_ServerSocketChannel.register(this.m_Selector, 16);
        this.Port = (short) this.m_ServerSocketChannel.socket().getLocalPort();
        System.out.printf("AsyncTcpServer listen on %d success.\n", new Object[]{Integer.valueOf(this.Port & 65535)});
    }

    public void start() {
        this.m_ServerThread = new Thread(this);
        this.m_ServerThread.setName("TcpProxyServerThread");
        this.m_ServerThread.start();
    }

    public void stop() {
        this.Stopped = true;
        if (this.m_Selector != null) {
            try {
                this.m_Selector.close();
                this.m_Selector = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.m_ServerSocketChannel != null) {
            try {
                this.m_ServerSocketChannel.close();
                this.m_ServerSocketChannel = null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[EDGE_INSN: B:0:0x0000->B:1:? ?: BREAK  , LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0015 A[Catch:{ Exception -> 0x006b, all -> 0x0069 }] */
    public void run() {
        /*
            r3 = this;
        L_0x0000:
            java.nio.channels.Selector r0 = r3.m_Selector     // Catch:{ Exception -> 0x006b }
            r0.select()     // Catch:{ Exception -> 0x006b }
            java.nio.channels.Selector r0 = r3.m_Selector     // Catch:{ Exception -> 0x006b }
            java.util.Set r0 = r0.selectedKeys()     // Catch:{ Exception -> 0x006b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x006b }
        L_0x000f:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x006b }
            if (r1 == 0) goto L_0x0000
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x006b }
            java.nio.channels.SelectionKey r1 = (java.nio.channels.SelectionKey) r1     // Catch:{ Exception -> 0x006b }
            boolean r2 = r1.isValid()     // Catch:{ Exception -> 0x006b }
            if (r2 == 0) goto L_0x0065
            boolean r2 = r1.isReadable()     // Catch:{ Exception -> 0x005b }
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.attachment()     // Catch:{ Exception -> 0x005b }
            com.vm.shadowsocks.tunnel.Tunnel r2 = (com.p051vm.shadowsocks.tunnel.Tunnel) r2     // Catch:{ Exception -> 0x005b }
            r2.onReadable(r1)     // Catch:{ Exception -> 0x005b }
            goto L_0x0065
        L_0x0031:
            boolean r2 = r1.isWritable()     // Catch:{ Exception -> 0x005b }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r1.attachment()     // Catch:{ Exception -> 0x005b }
            com.vm.shadowsocks.tunnel.Tunnel r2 = (com.p051vm.shadowsocks.tunnel.Tunnel) r2     // Catch:{ Exception -> 0x005b }
            r2.onWritable(r1)     // Catch:{ Exception -> 0x005b }
            goto L_0x0065
        L_0x0041:
            boolean r2 = r1.isConnectable()     // Catch:{ Exception -> 0x005b }
            if (r2 == 0) goto L_0x0051
            java.lang.Object r1 = r1.attachment()     // Catch:{ Exception -> 0x005b }
            com.vm.shadowsocks.tunnel.Tunnel r1 = (com.p051vm.shadowsocks.tunnel.Tunnel) r1     // Catch:{ Exception -> 0x005b }
            r1.onConnectable()     // Catch:{ Exception -> 0x005b }
            goto L_0x0065
        L_0x0051:
            boolean r2 = r1.isAcceptable()     // Catch:{ Exception -> 0x005b }
            if (r2 == 0) goto L_0x0065
            r3.onAccepted(r1)     // Catch:{ Exception -> 0x005b }
            goto L_0x0065
        L_0x005b:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ Exception -> 0x006b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x006b }
            r2.println(r1)     // Catch:{ Exception -> 0x006b }
        L_0x0065:
            r0.remove()     // Catch:{ Exception -> 0x006b }
            goto L_0x000f
        L_0x0069:
            r0 = move-exception
            goto L_0x007a
        L_0x006b:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0069 }
            r3.stop()
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "TcpServer thread exited."
            r0.println(r1)
            return
        L_0x007a:
            r3.stop()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "TcpServer thread exited."
            r1.println(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p051vm.shadowsocks.core.TcpProxyServer.run():void");
    }

    /* access modifiers changed from: package-private */
    public InetSocketAddress getDestAddress(SocketChannel socketChannel) {
        NatSession session = NatSessionManager.getSession((short) socketChannel.socket().getPort());
        if (session == null) {
            return null;
        }
        if (ProxyConfig.Instance.needProxy(session.RemoteHost, session.RemoteIP)) {
            return InetSocketAddress.createUnresolved(session.RemoteHost, session.RemotePort & 65535);
        }
        return new InetSocketAddress(socketChannel.socket().getInetAddress(), session.RemotePort & 65535);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccepted(java.nio.channels.SelectionKey r3) {
        /*
            r2 = this;
            r3 = 0
            java.nio.channels.ServerSocketChannel r0 = r2.m_ServerSocketChannel     // Catch:{ Exception -> 0x0029 }
            java.nio.channels.SocketChannel r0 = r0.accept()     // Catch:{ Exception -> 0x0029 }
            java.nio.channels.Selector r1 = r2.m_Selector     // Catch:{ Exception -> 0x0029 }
            com.vm.shadowsocks.tunnel.Tunnel r1 = com.p051vm.shadowsocks.core.TunnelFactory.wrap(r0, r1)     // Catch:{ Exception -> 0x0029 }
            java.net.InetSocketAddress r3 = r2.getDestAddress(r0)     // Catch:{ Exception -> 0x0027 }
            if (r3 == 0) goto L_0x0023
            java.nio.channels.Selector r0 = r2.m_Selector     // Catch:{ Exception -> 0x0027 }
            com.vm.shadowsocks.tunnel.Tunnel r0 = com.p051vm.shadowsocks.core.TunnelFactory.createTunnelByConfig(r3, r0)     // Catch:{ Exception -> 0x0027 }
            r0.setBrotherTunnel(r1)     // Catch:{ Exception -> 0x0027 }
            r1.setBrotherTunnel(r0)     // Catch:{ Exception -> 0x0027 }
            r0.connect(r3)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0034
        L_0x0023:
            r1.dispose()     // Catch:{ Exception -> 0x0027 }
            goto L_0x0034
        L_0x0027:
            r3 = move-exception
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            r1 = r3
            r3 = r0
        L_0x002c:
            r3.printStackTrace()
            if (r1 == 0) goto L_0x0034
            r1.dispose()
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p051vm.shadowsocks.core.TcpProxyServer.onAccepted(java.nio.channels.SelectionKey):void");
    }
}
