package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s */
final class C2296s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f8627a;

    /* renamed from: b */
    private final /* synthetic */ String f8628b;

    /* renamed from: c */
    private final /* synthetic */ Object f8629c;

    /* renamed from: d */
    private final /* synthetic */ Object f8630d;

    /* renamed from: e */
    private final /* synthetic */ Object f8631e;

    /* renamed from: f */
    private final /* synthetic */ C2295r f8632f;

    C2296s(C2295r rVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f8632f = rVar;
        this.f8627a = i;
        this.f8628b = str;
        this.f8629c = obj;
        this.f8630d = obj2;
        this.f8631e = obj3;
    }

    public final void run() {
        C2147ad c = this.f8632f.f8222q.mo14318c();
        if (!c.mo14380z()) {
            this.f8632f.mo14827a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f8632f.f8615a == 0) {
            if (this.f8632f.mo14237t().mo14727g()) {
                C2295r rVar = this.f8632f;
                this.f8632f.mo14238u();
                char unused = rVar.f8615a = 'C';
            } else {
                C2295r rVar2 = this.f8632f;
                this.f8632f.mo14238u();
                char unused2 = rVar2.f8615a = 'c';
            }
        }
        if (this.f8632f.f8616b < 0) {
            long unused3 = this.f8632f.f8616b = this.f8632f.mo14237t().mo14725f();
        }
        char charAt = "01VDIWEA?".charAt(this.f8627a);
        char a = this.f8632f.f8615a;
        long b = this.f8632f.f8616b;
        String a2 = C2295r.m11415a(true, this.f8628b, this.f8629c, this.f8630d, this.f8631e);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(a);
        sb.append(b);
        sb.append(":");
        sb.append(a2);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f8628b.substring(0, 1024);
        }
        c.f8043b.mo14268a(sb2, 1);
    }
}
