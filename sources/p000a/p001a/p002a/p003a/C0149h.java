package p000a.p001a.p002a.p003a;

import p000a.p001a.p002a.p003a.p004a.p006b.C0047w;
import p000a.p001a.p002a.p003a.p004a.p007c.C0067e;
import p000a.p001a.p002a.p003a.p004a.p007c.C0068f;
import p000a.p001a.p002a.p003a.p004a.p007c.C0078m;

/* renamed from: a.a.a.a.h */
/* compiled from: InitializationTask */
class C0149h<Result> extends C0068f<Void, Void, Result> {

    /* renamed from: a */
    final C0150i<Result> f331a;

    public C0149h(C0150i<Result> iVar) {
        this.f331a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95a() {
        super.mo95a();
        C0047w a = m420a("onPreExecute");
        try {
            boolean onPreExecute = this.f331a.onPreExecute();
            a.mo92b();
            if (onPreExecute) {
                return;
            }
        } catch (C0078m e) {
            throw e;
        } catch (Exception e2) {
            C0139c.m394g().mo291e("Fabric", "Failure onPreExecute()", e2);
            a.mo92b();
        } catch (Throwable th) {
            a.mo92b();
            mo97a(true);
            throw th;
        }
        mo97a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Result mo94a(Void... voidArr) {
        C0047w a = m420a("doInBackground");
        Result doInBackground = !mo102d() ? this.f331a.doInBackground() : null;
        a.mo92b();
        return doInBackground;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96a(Result result) {
        this.f331a.onPostExecute(result);
        this.f331a.initializationCallback.mo303a(result);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo99b(Result result) {
        this.f331a.onCancelled(result);
        this.f331a.initializationCallback.mo302a((Exception) new C0148g(this.f331a.getIdentifier() + " Initialization was cancelled"));
    }

    public C0067e getPriority() {
        return C0067e.HIGH;
    }

    /* renamed from: a */
    private C0047w m420a(String str) {
        C0047w wVar = new C0047w(this.f331a.getIdentifier() + "." + str, "KitInitialization");
        wVar.mo91a();
        return wVar;
    }
}
