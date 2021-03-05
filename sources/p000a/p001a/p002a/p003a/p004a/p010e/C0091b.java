package p000a.p001a.p002a.p003a.p004a.p010e;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p000a.p001a.p002a.p003a.C0138b;
import p000a.p001a.p002a.p003a.C0153l;

/* renamed from: a.a.a.a.a.e.b */
/* compiled from: DefaultHttpRequestFactory */
public class C0091b implements C0102e {

    /* renamed from: a */
    private final C0153l f162a;

    /* renamed from: b */
    private C0104g f163b;

    /* renamed from: c */
    private SSLSocketFactory f164c;

    /* renamed from: d */
    private boolean f165d;

    public C0091b() {
        this(new C0138b());
    }

    public C0091b(C0153l lVar) {
        this.f162a = lVar;
    }

    /* renamed from: a */
    public void mo196a(C0104g gVar) {
        if (this.f163b != gVar) {
            this.f163b = gVar;
            m229a();
        }
    }

    /* renamed from: a */
    private synchronized void m229a() {
        this.f165d = false;
        this.f164c = null;
    }

    /* renamed from: a */
    public C0094d mo194a(C0093c cVar, String str) {
        return mo195a(cVar, str, Collections.emptyMap());
    }

    /* renamed from: a */
    public C0094d mo195a(C0093c cVar, String str, Map<String, String> map) {
        C0094d dVar;
        SSLSocketFactory b;
        switch (cVar) {
            case GET:
                dVar = C0094d.m237a((CharSequence) str, (Map<?, ?>) map, true);
                break;
            case POST:
                dVar = C0094d.m242b((CharSequence) str, (Map<?, ?>) map, true);
                break;
            case PUT:
                dVar = C0094d.m245d((CharSequence) str);
                break;
            case DELETE:
                dVar = C0094d.m246e((CharSequence) str);
                break;
            default:
                throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (!(!m230a(str) || this.f163b == null || (b = m231b()) == null)) {
            ((HttpsURLConnection) dVar.mo210a()).setSSLSocketFactory(b);
        }
        return dVar;
    }

    /* renamed from: a */
    private boolean m230a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("https");
    }

    /* renamed from: b */
    private synchronized SSLSocketFactory m231b() {
        if (this.f164c == null && !this.f165d) {
            this.f164c = m232c();
        }
        return this.f164c;
    }

    /* renamed from: c */
    private synchronized SSLSocketFactory m232c() {
        SSLSocketFactory a;
        this.f165d = true;
        try {
            a = C0103f.m303a(this.f163b);
            this.f162a.mo281a("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.f162a.mo291e("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return a;
    }
}
