package p000a.p001a.p002a.p003a.p004a.p007c.p008a;

/* renamed from: a.a.a.a.a.c.a.e */
/* compiled from: RetryState */
public class C0063e {

    /* renamed from: a */
    private final int f132a;

    /* renamed from: b */
    private final C0059a f133b;

    /* renamed from: c */
    private final C0062d f134c;

    public C0063e(C0059a aVar, C0062d dVar) {
        this(0, aVar, dVar);
    }

    public C0063e(int i, C0059a aVar, C0062d dVar) {
        this.f132a = i;
        this.f133b = aVar;
        this.f134c = dVar;
    }

    /* renamed from: a */
    public long mo111a() {
        return this.f133b.getDelayMillis(this.f132a);
    }

    /* renamed from: b */
    public C0063e mo112b() {
        return new C0063e(this.f132a + 1, this.f133b, this.f134c);
    }

    /* renamed from: c */
    public C0063e mo113c() {
        return new C0063e(this.f133b, this.f134c);
    }
}
