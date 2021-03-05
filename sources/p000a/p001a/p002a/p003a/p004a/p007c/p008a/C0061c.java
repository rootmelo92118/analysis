package p000a.p001a.p002a.p003a.p004a.p007c.p008a;

/* renamed from: a.a.a.a.a.c.a.c */
/* compiled from: ExponentialBackoff */
public class C0061c implements C0059a {

    /* renamed from: a */
    private final long f130a;

    /* renamed from: b */
    private final int f131b;

    public C0061c(long j, int i) {
        this.f130a = j;
        this.f131b = i;
    }

    public long getDelayMillis(int i) {
        double d = (double) this.f130a;
        double pow = Math.pow((double) this.f131b, (double) i);
        Double.isNaN(d);
        return (long) (d * pow);
    }
}
