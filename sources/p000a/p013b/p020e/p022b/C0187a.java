package p000a.p013b.p020e.p022b;

import p000a.p013b.p019d.C0179b;

/* renamed from: a.b.e.b.a */
/* compiled from: ObjectHelper */
public final class C0187a {

    /* renamed from: a */
    static final C0179b<Object, Object> f372a = new C0179b<Object, Object>() {
    };

    /* renamed from: a */
    public static int m521a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m523a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> T m524a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static int m522a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
