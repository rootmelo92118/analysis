package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.hf */
final class C2086hf {

    /* renamed from: a */
    private static final Logger f7866a = Logger.getLogger(C2086hf.class.getName());

    /* renamed from: b */
    private static final Unsafe f7867b = m10035c();

    /* renamed from: c */
    private static final Class<?> f7868c = C1955cu.m9066b();

    /* renamed from: d */
    private static final boolean f7869d = m10043d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f7870e = m10043d(Integer.TYPE);

    /* renamed from: f */
    private static final C2090d f7871f;

    /* renamed from: g */
    private static final boolean f7872g = m10050g();

    /* renamed from: h */
    private static final boolean f7873h = m10048f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f7874i = ((long) m10029b(byte[].class));

    /* renamed from: j */
    private static final long f7875j = ((long) m10029b(boolean[].class));

    /* renamed from: k */
    private static final long f7876k = ((long) m10034c(boolean[].class));

    /* renamed from: l */
    private static final long f7877l = ((long) m10029b(int[].class));

    /* renamed from: m */
    private static final long f7878m = ((long) m10034c(int[].class));

    /* renamed from: n */
    private static final long f7879n = ((long) m10029b(long[].class));

    /* renamed from: o */
    private static final long f7880o = ((long) m10034c(long[].class));

    /* renamed from: p */
    private static final long f7881p = ((long) m10029b(float[].class));

    /* renamed from: q */
    private static final long f7882q = ((long) m10034c(float[].class));

    /* renamed from: r */
    private static final long f7883r = ((long) m10029b(double[].class));

    /* renamed from: s */
    private static final long f7884s = ((long) m10034c(double[].class));

    /* renamed from: t */
    private static final long f7885t = ((long) m10029b(Object[].class));

    /* renamed from: u */
    private static final long f7886u = ((long) m10034c(Object[].class));

    /* renamed from: v */
    private static final long f7887v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final boolean f7888w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    private C2086hf() {
    }

    /* renamed from: com.google.android.gms.internal.measurement.hf$b */
    static final class C2088b extends C2090d {
        C2088b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo14028a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final byte mo14027a(Object obj, long j) {
            if (C2086hf.f7888w) {
                return C2086hf.m10055k(obj, j);
            }
            return C2086hf.m10056l(obj, j);
        }

        /* renamed from: a */
        public final void mo14029a(Object obj, long j, byte b) {
            if (C2086hf.f7888w) {
                C2086hf.m10036c(obj, j, b);
            } else {
                C2086hf.m10041d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo14034b(Object obj, long j) {
            if (C2086hf.f7888w) {
                return C2086hf.m10057m(obj, j);
            }
            return C2086hf.m10058n(obj, j);
        }

        /* renamed from: a */
        public final void mo14032a(Object obj, long j, boolean z) {
            if (C2086hf.f7888w) {
                C2086hf.m10042d(obj, j, z);
            } else {
                C2086hf.m10045e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo14035c(Object obj, long j) {
            return Float.intBitsToFloat(mo14039e(obj, j));
        }

        /* renamed from: a */
        public final void mo14031a(Object obj, long j, float f) {
            mo14037a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo14036d(Object obj, long j) {
            return Double.longBitsToDouble(mo14040f(obj, j));
        }

        /* renamed from: a */
        public final void mo14030a(Object obj, long j, double d) {
            mo14038a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo14033a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.hf$c */
    static final class C2089c extends C2090d {
        C2089c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo14028a(long j, byte b) {
            this.f7889a.putByte(j, b);
        }

        /* renamed from: a */
        public final byte mo14027a(Object obj, long j) {
            return this.f7889a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo14029a(Object obj, long j, byte b) {
            this.f7889a.putByte(obj, j, b);
        }

        /* renamed from: b */
        public final boolean mo14034b(Object obj, long j) {
            return this.f7889a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public final void mo14032a(Object obj, long j, boolean z) {
            this.f7889a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final float mo14035c(Object obj, long j) {
            return this.f7889a.getFloat(obj, j);
        }

        /* renamed from: a */
        public final void mo14031a(Object obj, long j, float f) {
            this.f7889a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final double mo14036d(Object obj, long j) {
            return this.f7889a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo14030a(Object obj, long j, double d) {
            this.f7889a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo14033a(byte[] bArr, long j, long j2, long j3) {
            this.f7889a.copyMemory(bArr, C2086hf.f7874i + j, (Object) null, j2, j3);
        }
    }

    /* renamed from: a */
    static boolean m10028a() {
        return f7873h;
    }

    /* renamed from: com.google.android.gms.internal.measurement.hf$d */
    static abstract class C2090d {

        /* renamed from: a */
        Unsafe f7889a;

        C2090d(Unsafe unsafe) {
            this.f7889a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo14027a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo14028a(long j, byte b);

        /* renamed from: a */
        public abstract void mo14029a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo14030a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo14031a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo14032a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo14033a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo14034b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo14035c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo14036d(Object obj, long j);

        /* renamed from: e */
        public final int mo14039e(Object obj, long j) {
            return this.f7889a.getInt(obj, j);
        }

        /* renamed from: a */
        public final void mo14037a(Object obj, long j, int i) {
            this.f7889a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final long mo14040f(Object obj, long j) {
            return this.f7889a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void mo14038a(Object obj, long j, long j2) {
            this.f7889a.putLong(obj, j, j2);
        }
    }

    /* renamed from: b */
    static boolean m10033b() {
        return f7872g;
    }

    /* renamed from: com.google.android.gms.internal.measurement.hf$a */
    static final class C2087a extends C2090d {
        C2087a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo14028a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final byte mo14027a(Object obj, long j) {
            if (C2086hf.f7888w) {
                return C2086hf.m10055k(obj, j);
            }
            return C2086hf.m10056l(obj, j);
        }

        /* renamed from: a */
        public final void mo14029a(Object obj, long j, byte b) {
            if (C2086hf.f7888w) {
                C2086hf.m10036c(obj, j, b);
            } else {
                C2086hf.m10041d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo14034b(Object obj, long j) {
            if (C2086hf.f7888w) {
                return C2086hf.m10057m(obj, j);
            }
            return C2086hf.m10058n(obj, j);
        }

        /* renamed from: a */
        public final void mo14032a(Object obj, long j, boolean z) {
            if (C2086hf.f7888w) {
                C2086hf.m10042d(obj, j, z);
            } else {
                C2086hf.m10045e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo14035c(Object obj, long j) {
            return Float.intBitsToFloat(mo14039e(obj, j));
        }

        /* renamed from: a */
        public final void mo14031a(Object obj, long j, float f) {
            mo14037a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo14036d(Object obj, long j) {
            return Double.longBitsToDouble(mo14040f(obj, j));
        }

        /* renamed from: a */
        public final void mo14030a(Object obj, long j, double d) {
            mo14038a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo14033a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: a */
    static <T> T m10016a(Class<T> cls) {
        try {
            return f7867b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static int m10029b(Class<?> cls) {
        if (f7873h) {
            return f7871f.f7889a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m10034c(Class<?> cls) {
        if (f7873h) {
            return f7871f.f7889a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m10014a(Object obj, long j) {
        return f7871f.mo14039e(obj, j);
    }

    /* renamed from: a */
    static void m10022a(Object obj, long j, int i) {
        f7871f.mo14037a(obj, j, i);
    }

    /* renamed from: b */
    static long m10030b(Object obj, long j) {
        return f7871f.mo14040f(obj, j);
    }

    /* renamed from: a */
    static void m10023a(Object obj, long j, long j2) {
        f7871f.mo14038a(obj, j, j2);
    }

    /* renamed from: c */
    static boolean m10038c(Object obj, long j) {
        return f7871f.mo14034b(obj, j);
    }

    /* renamed from: a */
    static void m10025a(Object obj, long j, boolean z) {
        f7871f.mo14032a(obj, j, z);
    }

    /* renamed from: d */
    static float m10039d(Object obj, long j) {
        return f7871f.mo14035c(obj, j);
    }

    /* renamed from: a */
    static void m10021a(Object obj, long j, float f) {
        f7871f.mo14031a(obj, j, f);
    }

    /* renamed from: e */
    static double m10044e(Object obj, long j) {
        return f7871f.mo14036d(obj, j);
    }

    /* renamed from: a */
    static void m10020a(Object obj, long j, double d) {
        f7871f.mo14030a(obj, j, d);
    }

    /* renamed from: f */
    static Object m10047f(Object obj, long j) {
        return f7871f.f7889a.getObject(obj, j);
    }

    /* renamed from: a */
    static void m10024a(Object obj, long j, Object obj2) {
        f7871f.f7889a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m10013a(byte[] bArr, long j) {
        return f7871f.mo14027a((Object) bArr, f7874i + j);
    }

    /* renamed from: a */
    static void m10026a(byte[] bArr, long j, byte b) {
        f7871f.mo14029a((Object) bArr, f7874i + j, b);
    }

    /* renamed from: a */
    static void m10027a(byte[] bArr, long j, long j2, long j3) {
        f7871f.mo14033a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static void m10018a(long j, byte b) {
        f7871f.mo14028a(j, b);
    }

    /* renamed from: a */
    static long m10015a(ByteBuffer byteBuffer) {
        return f7871f.mo14040f(byteBuffer, f7887v);
    }

    /* renamed from: c */
    static Unsafe m10035c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2091hg());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static boolean m10048f() {
        if (f7867b == null) {
            return false;
        }
        try {
            Class<?> cls = f7867b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C1955cu.m9065a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f7866a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m10050g() {
        if (f7867b == null) {
            return false;
        }
        try {
            Class<?> cls = f7867b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m10052h() == null) {
                return false;
            }
            if (C1955cu.m9065a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f7866a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m10043d(Class<?> cls) {
        if (!C1955cu.m9065a()) {
            return false;
        }
        try {
            Class<?> cls2 = f7868c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: h */
    private static Field m10052h() {
        Field a;
        if (C1955cu.m9065a() && (a = m10017a((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return a;
        }
        Field a2 = m10017a((Class<?>) Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    private static Field m10017a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m10055k(Object obj, long j) {
        return (byte) (m10014a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m10056l(Object obj, long j) {
        return (byte) (m10014a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m10036c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m10022a(obj, j2, ((255 & b) << i) | (m10014a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m10041d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m10022a(obj, j2, ((255 & b) << i) | (m10014a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m10057m(Object obj, long j) {
        return m10055k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m10058n(Object obj, long j) {
        return m10056l(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m10042d(Object obj, long j, boolean z) {
        m10036c(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m10045e(Object obj, long j, boolean z) {
        m10041d(obj, j, z ? (byte) 1 : 0);
    }

    static {
        C2090d dVar = null;
        if (f7867b != null) {
            if (!C1955cu.m9065a()) {
                dVar = new C2089c(f7867b);
            } else if (f7869d) {
                dVar = new C2088b(f7867b);
            } else if (f7870e) {
                dVar = new C2087a(f7867b);
            }
        }
        f7871f = dVar;
        Field h = m10052h();
        f7887v = (h == null || f7871f == null) ? -1 : f7871f.f7889a.objectFieldOffset(h);
    }
}
