package p000a.p001a.p002a.p003a.p004a.p010e;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0153l;

/* renamed from: a.a.a.a.a.e.h */
/* compiled from: PinningTrustManager */
class C0105h implements X509TrustManager {

    /* renamed from: a */
    private static final X509Certificate[] f191a = new X509Certificate[0];

    /* renamed from: b */
    private final TrustManager[] f192b;

    /* renamed from: c */
    private final C0106i f193c;

    /* renamed from: d */
    private final long f194d;

    /* renamed from: e */
    private final List<byte[]> f195e = new LinkedList();

    /* renamed from: f */
    private final Set<X509Certificate> f196f = Collections.synchronizedSet(new HashSet());

    public C0105h(C0106i iVar, C0104g gVar) {
        this.f192b = m308a(iVar);
        this.f193c = iVar;
        this.f194d = gVar.getPinCreationTimeInMillis();
        for (String a : gVar.getPins()) {
            this.f195e.add(m307a(a));
        }
    }

    /* renamed from: a */
    private TrustManager[] m308a(C0106i iVar) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(iVar.f197a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    private boolean m306a(X509Certificate x509Certificate) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f195e) {
                if (Arrays.equals(equals, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new CertificateException(e);
        }
    }

    /* renamed from: a */
    private void m305a(X509Certificate[] x509CertificateArr, String str) {
        for (TrustManager trustManager : this.f192b) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private void m304a(X509Certificate[] x509CertificateArr) {
        if (this.f194d == -1 || System.currentTimeMillis() - this.f194d <= 15552000000L) {
            X509Certificate[] a = C0090a.m228a(x509CertificateArr, this.f193c);
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!m306a(a[i])) {
                    i++;
                } else {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        C0153l g = C0139c.m394g();
        g.mo288d("Fabric", "Certificate pins are stale, (" + (System.currentTimeMillis() - this.f194d) + " millis vs " + 15552000000L + " millis) falling back to system trust.");
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.f196f.contains(x509CertificateArr[0])) {
            m305a(x509CertificateArr, str);
            m304a(x509CertificateArr);
            this.f196f.add(x509CertificateArr[0]);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f191a;
    }

    /* renamed from: a */
    private byte[] m307a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
