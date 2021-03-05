package p000a.p013b.p020e.p029h;

/* renamed from: a.b.e.h.b */
/* compiled from: OpenHashSet */
public final class C0226b<T> {

    /* renamed from: a */
    final float f468a;

    /* renamed from: b */
    int f469b;

    /* renamed from: c */
    int f470c;

    /* renamed from: d */
    int f471d;

    /* renamed from: e */
    T[] f472e;

    /* renamed from: a */
    static int m616a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public C0226b() {
        this(16, 0.75f);
    }

    public C0226b(int i, float f) {
        this.f468a = f;
        int a = C0227c.m622a(i);
        this.f469b = a - 1;
        this.f471d = (int) (f * ((float) a));
        this.f472e = (Object[]) new Object[a];
    }

    /* renamed from: a */
    public boolean mo425a(T t) {
        T t2;
        T[] tArr = this.f472e;
        int i = this.f469b;
        int a = m616a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f470c + 1;
        this.f470c = i2;
        if (i2 >= this.f471d) {
            mo423a();
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo426b(T t) {
        T t2;
        T[] tArr = this.f472e;
        int i = this.f469b;
        int a = m616a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo424a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo424a(a, tArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo424a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f470c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m616a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo423a() {
        T[] tArr = this.f472e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (Object[]) new Object[i];
        int i3 = this.f470c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m616a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f469b = i2;
                this.f471d = (int) (((float) i) * this.f468a);
                this.f472e = tArr2;
                return;
            }
        }
    }

    /* renamed from: b */
    public Object[] mo427b() {
        return this.f472e;
    }
}
