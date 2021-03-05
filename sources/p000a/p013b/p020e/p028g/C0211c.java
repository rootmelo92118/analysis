package p000a.p013b.p020e.p028g;

import p000a.p013b.C0240h;

/* renamed from: a.b.e.g.c */
/* compiled from: NewThreadScheduler */
public final class C0211c extends C0240h {

    /* renamed from: b */
    private static final C0213e f434b = new C0213e("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c */
    private static final C0211c f435c = new C0211c();

    /* renamed from: c */
    public static C0211c m589c() {
        return f435c;
    }

    private C0211c() {
    }

    /* renamed from: a */
    public C0240h.C0242a mo346a() {
        return new C0212d(f434b);
    }
}
