package p000a.p001a.p002a.p003a.p004a.p010e;

import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: a.a.a.a.a.e.f */
/* compiled from: NetworkUtils */
public final class C0103f {
    /* renamed from: a */
    public static final SSLSocketFactory m303a(C0104g gVar) {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, new TrustManager[]{new C0105h(new C0106i(gVar.getKeyStoreStream(), gVar.getKeyStorePassword()), gVar)}, (SecureRandom) null);
        return instance.getSocketFactory();
    }
}
