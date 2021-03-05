package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.em */
final class C2265em extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f8452a;

    C2265em() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C2265em(SSLSocketFactory sSLSocketFactory) {
        this.f8452a = sSLSocketFactory;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m11080a((SSLSocket) this.f8452a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f8452a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f8452a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) {
        return m11080a((SSLSocket) this.f8452a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m11080a((SSLSocket) this.f8452a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m11080a((SSLSocket) this.f8452a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m11080a((SSLSocket) this.f8452a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() {
        return m11080a((SSLSocket) this.f8452a.createSocket());
    }

    /* renamed from: a */
    private final SSLSocket m11080a(SSLSocket sSLSocket) {
        return new C2267eo(this, sSLSocket);
    }
}
