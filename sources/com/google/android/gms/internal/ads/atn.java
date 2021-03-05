package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class atn {

    /* renamed from: a */
    private static final Logger f2480a = Logger.getLogger(atn.class.getName());

    /* renamed from: b */
    private static final Unsafe f2481b = m3932c();

    /* renamed from: c */
    private static final Class<?> f2482c = aox.m2954b();

    /* renamed from: d */
    private static final boolean f2483d = m3935c(Long.TYPE);

    /* renamed from: e */
    private static final boolean f2484e = m3935c(Integer.TYPE);

    /* renamed from: f */
    private static final C1089d f2485f;

    /* renamed from: g */
    private static final boolean f2486g = m3947g();

    /* renamed from: h */
    private static final boolean f2487h = m3945f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f2488i = ((long) m3912a((Class<?>) byte[].class));

    /* renamed from: j */
    private static final long f2489j = ((long) m3912a((Class<?>) boolean[].class));

    /* renamed from: k */
    private static final long f2490k = ((long) m3927b(boolean[].class));

    /* renamed from: l */
    private static final long f2491l = ((long) m3912a((Class<?>) int[].class));

    /* renamed from: m */
    private static final long f2492m = ((long) m3927b(int[].class));

    /* renamed from: n */
    private static final long f2493n = ((long) m3912a((Class<?>) long[].class));

    /* renamed from: o */
    private static final long f2494o = ((long) m3927b(long[].class));

    /* renamed from: p */
    private static final long f2495p = ((long) m3912a((Class<?>) float[].class));

    /* renamed from: q */
    private static final long f2496q = ((long) m3927b(float[].class));

    /* renamed from: r */
    private static final long f2497r = ((long) m3912a((Class<?>) double[].class));

    /* renamed from: s */
    private static final long f2498s = ((long) m3927b(double[].class));

    /* renamed from: t */
    private static final long f2499t = ((long) m3912a((Class<?>) Object[].class));

    /* renamed from: u */
    private static final long f2500u = ((long) m3927b(Object[].class));

    /* renamed from: v */
    private static final long f2501v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final boolean f2502w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    private atn() {
    }

    /* renamed from: com.google.android.gms.internal.ads.atn$b */
    static final class C1087b extends C1089d {
        C1087b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo11211a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final byte mo11210a(Object obj, long j) {
            if (atn.f2502w) {
                return atn.m3952k(obj, j);
            }
            return atn.m3953l(obj, j);
        }

        /* renamed from: a */
        public final void mo11212a(Object obj, long j, byte b) {
            if (atn.f2502w) {
                atn.m3933c(obj, j, b);
            } else {
                atn.m3939d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo11217b(Object obj, long j) {
            if (atn.f2502w) {
                return atn.m3954m(obj, j);
            }
            return atn.m3955n(obj, j);
        }

        /* renamed from: a */
        public final void mo11215a(Object obj, long j, boolean z) {
            if (atn.f2502w) {
                atn.m3940d(obj, j, z);
            } else {
                atn.m3942e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo11218c(Object obj, long j) {
            return Float.intBitsToFloat(mo11222e(obj, j));
        }

        /* renamed from: a */
        public final void mo11214a(Object obj, long j, float f) {
            mo11220a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo11219d(Object obj, long j) {
            return Double.longBitsToDouble(mo11223f(obj, j));
        }

        /* renamed from: a */
        public final void mo11213a(Object obj, long j, double d) {
            mo11221a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo11216a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.atn$c */
    static final class C1088c extends C1089d {
        C1088c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo11211a(long j, byte b) {
            this.f2503a.putByte(j, b);
        }

        /* renamed from: a */
        public final byte mo11210a(Object obj, long j) {
            return this.f2503a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo11212a(Object obj, long j, byte b) {
            this.f2503a.putByte(obj, j, b);
        }

        /* renamed from: b */
        public final boolean mo11217b(Object obj, long j) {
            return this.f2503a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public final void mo11215a(Object obj, long j, boolean z) {
            this.f2503a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final float mo11218c(Object obj, long j) {
            return this.f2503a.getFloat(obj, j);
        }

        /* renamed from: a */
        public final void mo11214a(Object obj, long j, float f) {
            this.f2503a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final double mo11219d(Object obj, long j) {
            return this.f2503a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo11213a(Object obj, long j, double d) {
            this.f2503a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo11216a(byte[] bArr, long j, long j2, long j3) {
            this.f2503a.copyMemory(bArr, atn.f2488i + j, (Object) null, j2, j3);
        }
    }

    /* renamed from: a */
    static boolean m3926a() {
        return f2487h;
    }

    /* renamed from: com.google.android.gms.internal.ads.atn$d */
    static abstract class C1089d {

        /* renamed from: a */
        Unsafe f2503a;

        C1089d(Unsafe unsafe) {
            this.f2503a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo11210a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo11211a(long j, byte b);

        /* renamed from: a */
        public abstract void mo11212a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo11213a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo11214a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo11215a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo11216a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo11217b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo11218c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo11219d(Object obj, long j);

        /* renamed from: e */
        public final int mo11222e(Object obj, long j) {
            return this.f2503a.getInt(obj, j);
        }

        /* renamed from: a */
        public final void mo11220a(Object obj, long j, int i) {
            this.f2503a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final long mo11223f(Object obj, long j) {
            return this.f2503a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void mo11221a(Object obj, long j, long j2) {
            this.f2503a.putLong(obj, j, j2);
        }
    }

    /* renamed from: b */
    static boolean m3931b() {
        return f2486g;
    }

    /* renamed from: com.google.android.gms.internal.ads.atn$a */
    static final class C1086a extends C1089d {
        C1086a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo11211a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final byte mo11210a(Object obj, long j) {
            if (atn.f2502w) {
                return atn.m3952k(obj, j);
            }
            return atn.m3953l(obj, j);
        }

        /* renamed from: a */
        public final void mo11212a(Object obj, long j, byte b) {
            if (atn.f2502w) {
                atn.m3933c(obj, j, b);
            } else {
                atn.m3939d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo11217b(Object obj, long j) {
            if (atn.f2502w) {
                return atn.m3954m(obj, j);
            }
            return atn.m3955n(obj, j);
        }

        /* renamed from: a */
        public final void mo11215a(Object obj, long j, boolean z) {
            if (atn.f2502w) {
                atn.m3940d(obj, j, z);
            } else {
                atn.m3942e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo11218c(Object obj, long j) {
            return Float.intBitsToFloat(mo11222e(obj, j));
        }

        /* renamed from: a */
        public final void mo11214a(Object obj, long j, float f) {
            mo11220a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo11219d(Object obj, long j) {
            return Double.longBitsToDouble(mo11223f(obj, j));
        }

        /* renamed from: a */
        public final void mo11213a(Object obj, long j, double d) {
            mo11221a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo11216a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: a */
    private static int m3912a(Class<?> cls) {
        if (f2487h) {
            return f2485f.f2503a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static int m3927b(Class<?> cls) {
        if (f2487h) {
            return f2485f.f2503a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m3913a(Object obj, long j) {
        return f2485f.mo11222e(obj, j);
    }

    /* renamed from: a */
    static void m3920a(Object obj, long j, int i) {
        f2485f.mo11220a(obj, j, i);
    }

    /* renamed from: b */
    static long m3928b(Object obj, long j) {
        return f2485f.mo11223f(obj, j);
    }

    /* renamed from: a */
    static void m3921a(Object obj, long j, long j2) {
        f2485f.mo11221a(obj, j, j2);
    }

    /* renamed from: c */
    static boolean m3936c(Object obj, long j) {
        return f2485f.mo11217b(obj, j);
    }

    /* renamed from: a */
    static void m3923a(Object obj, long j, boolean z) {
        f2485f.mo11215a(obj, j, z);
    }

    /* renamed from: d */
    static float m3937d(Object obj, long j) {
        return f2485f.mo11218c(obj, j);
    }

    /* renamed from: a */
    static void m3919a(Object obj, long j, float f) {
        f2485f.mo11214a(obj, j, f);
    }

    /* renamed from: e */
    static double m3941e(Object obj, long j) {
        return f2485f.mo11219d(obj, j);
    }

    /* renamed from: a */
    static void m3918a(Object obj, long j, double d) {
        f2485f.mo11213a(obj, j, d);
    }

    /* renamed from: f */
    static Object m3944f(Object obj, long j) {
        return f2485f.f2503a.getObject(obj, j);
    }

    /* renamed from: a */
    static void m3922a(Object obj, long j, Object obj2) {
        f2485f.f2503a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m3911a(byte[] bArr, long j) {
        return f2485f.mo11210a((Object) bArr, f2488i + j);
    }

    /* renamed from: a */
    static void m3924a(byte[] bArr, long j, byte b) {
        f2485f.mo11212a((Object) bArr, f2488i + j, b);
    }

    /* renamed from: a */
    static void m3925a(byte[] bArr, long j, long j2, long j3) {
        f2485f.mo11216a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static void m3916a(long j, byte b) {
        f2485f.mo11211a(j, b);
    }

    /* renamed from: a */
    static long m3914a(ByteBuffer byteBuffer) {
        return f2485f.mo11223f(byteBuffer, f2501v);
    }

    /* renamed from: c */
    static Unsafe m3932c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ato());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static boolean m3945f() {
        if (f2481b == null) {
            return false;
        }
        try {
            Class<?> cls = f2481b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (aox.m2953a()) {
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
            Logger logger = f2480a;
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
    private static boolean m3947g() {
        if (f2481b == null) {
            return false;
        }
        try {
            Class<?> cls = f2481b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m3949h() == null) {
                return false;
            }
            if (aox.m2953a()) {
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
            Logger logger = f2480a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m3935c(Class<?> cls) {
        if (!aox.m2953a()) {
            return false;
        }
        try {
            Class<?> cls2 = f2482c;
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
    private static Field m3949h() {
        Field a;
        if (aox.m2953a() && (a = m3915a((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return a;
        }
        Field a2 = m3915a((Class<?>) Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    private static Field m3915a(Class<?> cls, String str) {
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
    public static byte m3952k(Object obj, long j) {
        return (byte) (m3913a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m3953l(Object obj, long j) {
        return (byte) (m3913a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m3933c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m3920a(obj, j2, ((255 & b) << i) | (m3913a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m3939d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m3920a(obj, j2, ((255 & b) << i) | (m3913a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m3954m(Object obj, long j) {
        return m3952k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m3955n(Object obj, long j) {
        return m3953l(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m3940d(Object obj, long j, boolean z) {
        m3933c(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m3942e(Object obj, long j, boolean z) {
        m3939d(obj, j, z ? (byte) 1 : 0);
    }

    static {
        C1089d dVar = null;
        if (f2481b != null) {
            if (!aox.m2953a()) {
                dVar = new C1088c(f2481b);
            } else if (f2483d) {
                dVar = new C1087b(f2481b);
            } else if (f2484e) {
                dVar = new C1086a(f2481b);
            }
        }
        f2485f = dVar;
        Field h = m3949h();
        f2501v = (h == null || f2485f == null) ? -1 : f2485f.f2503a.objectFieldOffset(h);
    }
}
