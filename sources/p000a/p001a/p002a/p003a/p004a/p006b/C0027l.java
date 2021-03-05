package p000a.p001a.p002a.p003a.p004a.p006b;

/* renamed from: a.a.a.a.a.b.l */
/* compiled from: DeliveryMechanism */
public enum C0027l {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: e */
    private final int f42e;

    private C0027l(int i) {
        this.f42e = i;
    }

    /* renamed from: a */
    public int mo51a() {
        return this.f42e;
    }

    public String toString() {
        return Integer.toString(this.f42e);
    }

    /* renamed from: a */
    public static C0027l m90a(String str) {
        if ("io.crash.air".equals(str)) {
            return TEST_DISTRIBUTION;
        }
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }
}
