package com.google.android.gms.measurement.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.eo */
final class C2267eo extends SSLSocket {

    /* renamed from: a */
    private final SSLSocket f8482a;

    C2267eo(C2265em emVar, SSLSocket sSLSocket) {
        this.f8482a = sSLSocket;
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f8482a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f8482a.setEnabledProtocols(strArr);
    }

    public final String[] getSupportedCipherSuites() {
        return this.f8482a.getSupportedCipherSuites();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f8482a.getEnabledCipherSuites();
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f8482a.setEnabledCipherSuites(strArr);
    }

    public final String[] getSupportedProtocols() {
        return this.f8482a.getSupportedProtocols();
    }

    public final String[] getEnabledProtocols() {
        return this.f8482a.getEnabledProtocols();
    }

    public final SSLSession getSession() {
        return this.f8482a.getSession();
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f8482a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f8482a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void startHandshake() {
        this.f8482a.startHandshake();
    }

    public final void setUseClientMode(boolean z) {
        this.f8482a.setUseClientMode(z);
    }

    public final boolean getUseClientMode() {
        return this.f8482a.getUseClientMode();
    }

    public final void setNeedClientAuth(boolean z) {
        this.f8482a.setNeedClientAuth(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f8482a.setWantClientAuth(z);
    }

    public final boolean getNeedClientAuth() {
        return this.f8482a.getNeedClientAuth();
    }

    public final boolean getWantClientAuth() {
        return this.f8482a.getWantClientAuth();
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f8482a.setEnableSessionCreation(z);
    }

    public final boolean getEnableSessionCreation() {
        return this.f8482a.getEnableSessionCreation();
    }

    public final void bind(SocketAddress socketAddress) {
        this.f8482a.bind(socketAddress);
    }

    public final synchronized void close() {
        this.f8482a.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.f8482a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.f8482a.connect(socketAddress, i);
    }

    public final SocketChannel getChannel() {
        return this.f8482a.getChannel();
    }

    public final InetAddress getInetAddress() {
        return this.f8482a.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.f8482a.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.f8482a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f8482a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f8482a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f8482a.getLocalSocketAddress();
    }

    public final boolean getOOBInline() {
        return this.f8482a.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.f8482a.getOutputStream();
    }

    public final int getPort() {
        return this.f8482a.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.f8482a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f8482a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.f8482a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.f8482a.getSendBufferSize();
    }

    public final int getSoLinger() {
        return this.f8482a.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.f8482a.getSoTimeout();
    }

    public final boolean getTcpNoDelay() {
        return this.f8482a.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.f8482a.getTrafficClass();
    }

    public final boolean isBound() {
        return this.f8482a.isBound();
    }

    public final boolean isClosed() {
        return this.f8482a.isClosed();
    }

    public final boolean isConnected() {
        return this.f8482a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f8482a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f8482a.isOutputShutdown();
    }

    public final void sendUrgentData(int i) {
        this.f8482a.sendUrgentData(i);
    }

    public final void setKeepAlive(boolean z) {
        this.f8482a.setKeepAlive(z);
    }

    public final void setOOBInline(boolean z) {
        this.f8482a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f8482a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.f8482a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.f8482a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.f8482a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.f8482a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.f8482a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.f8482a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.f8482a.setTrafficClass(i);
    }

    public final void shutdownInput() {
        this.f8482a.shutdownInput();
    }

    public final void shutdownOutput() {
        this.f8482a.shutdownOutput();
    }

    public final String toString() {
        return this.f8482a.toString();
    }

    public final boolean equals(Object obj) {
        return this.f8482a.equals(obj);
    }
}
