package p000a.p001a.p002a.p003a.p004a.p012g;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0018g;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0027l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0036r;
import p000a.p001a.p002a.p003a.p004a.p006b.C0046v;
import p000a.p001a.p002a.p003a.p004a.p010e.C0102e;

/* renamed from: a.a.a.a.a.g.q */
/* compiled from: Settings */
public class C0127q {

    /* renamed from: a */
    private final AtomicReference<C0132t> f270a;

    /* renamed from: b */
    private final CountDownLatch f271b;

    /* renamed from: c */
    private C0131s f272c;

    /* renamed from: d */
    private boolean f273d;

    /* renamed from: a.a.a.a.a.g.q$a */
    /* compiled from: Settings */
    static class C0129a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C0127q f274a = new C0127q();
    }

    /* renamed from: a */
    public static C0127q m357a() {
        return C0129a.f274a;
    }

    private C0127q() {
        this.f270a = new AtomicReference<>();
        this.f271b = new CountDownLatch(1);
        this.f273d = false;
    }

    /* renamed from: a */
    public synchronized C0127q mo274a(C0150i iVar, C0036r rVar, C0102e eVar, String str, String str2, String str3) {
        C0150i iVar2 = iVar;
        synchronized (this) {
            if (this.f273d) {
                return this;
            }
            if (this.f272c == null) {
                Context context = iVar.getContext();
                String c = rVar.mo65c();
                String a = new C0018g().mo40a(context);
                String i = rVar.mo71i();
                C0046v vVar = new C0046v();
                C0121k kVar = new C0121k();
                C0119i iVar3 = new C0119i(iVar2);
                String k = C0020i.m80k(context);
                String str4 = str3;
                C0122l lVar = new C0122l(iVar2, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{c}), eVar);
                String g = rVar.mo69g();
                String f = rVar.mo68f();
                String str5 = f;
                String str6 = str2;
                String str7 = str;
                C0150i iVar4 = iVar;
                this.f272c = new C0120j(iVar4, new C0135w(a, g, str5, rVar.mo67e(), rVar.mo64b(), C0020i.m53a(C0020i.m82m(context)), str6, str7, C0027l.m90a(i).mo51a(), k), vVar, kVar, iVar3, lVar);
            }
            this.f273d = true;
            return this;
        }
    }

    /* renamed from: b */
    public C0132t mo275b() {
        try {
            this.f271b.await();
            return this.f270a.get();
        } catch (InterruptedException unused) {
            C0139c.m394g().mo290e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    /* renamed from: c */
    public synchronized boolean mo276c() {
        C0132t a;
        a = this.f272c.mo264a();
        m358a(a);
        return a != null;
    }

    /* renamed from: d */
    public synchronized boolean mo277d() {
        C0132t a;
        a = this.f272c.mo265a(C0130r.SKIP_CACHE_LOOKUP);
        m358a(a);
        if (a == null) {
            C0139c.m394g().mo291e("Fabric", "Failed to force reload of settings from Crashlytics.", (Throwable) null);
        }
        return a != null;
    }

    /* renamed from: a */
    private void m358a(C0132t tVar) {
        this.f270a.set(tVar);
        this.f271b.countDown();
    }
}
