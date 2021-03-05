package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;
import com.google.android.gms.internal.ads.aqn.C1078a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class aqn<MessageType extends aqn<MessageType, BuilderType>, BuilderType extends C1078a<MessageType, BuilderType>> extends aot<MessageType, BuilderType> {
    private static Map<Object, aqn<?, ?>> zzfpw = new ConcurrentHashMap();
    protected ath zzfpu = ath.m3874a();
    private int zzfpv = -1;

    /* renamed from: com.google.android.gms.internal.ads.aqn$c */
    public static abstract class C1080c<MessageType extends C1080c<MessageType, BuilderType>, BuilderType> extends aqn<MessageType, BuilderType> implements ary {
        protected aqd<Object> zzfqa = aqd.m3410a();
    }

    /* renamed from: com.google.android.gms.internal.ads.aqn$d */
    public static class C1081d<ContainingType extends arw, Type> extends apx<ContainingType, Type> {
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.ads.aqn$e */
    public static final class C1082e {

        /* renamed from: a */
        public static final int f2330a = 1;

        /* renamed from: b */
        public static final int f2331b = 2;

        /* renamed from: c */
        public static final int f2332c = 3;

        /* renamed from: d */
        public static final int f2333d = 4;

        /* renamed from: e */
        public static final int f2334e = 5;

        /* renamed from: f */
        public static final int f2335f = 6;

        /* renamed from: g */
        public static final int f2336g = 7;

        /* renamed from: h */
        public static final int f2337h = 1;

        /* renamed from: i */
        public static final int f2338i = 2;

        /* renamed from: j */
        public static final int f2339j = 1;

        /* renamed from: k */
        public static final int f2340k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f2341l = {f2330a, f2331b, f2332c, f2333d, f2334e, f2335f, f2336g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f2342m = {f2337h, f2338i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f2343n = {f2339j, f2340k};

        /* renamed from: a */
        public static int[] m3484a() {
            return (int[]) f2341l.clone();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo10613a(int i, Object obj, Object obj2);

    /* renamed from: com.google.android.gms.internal.ads.aqn$b */
    public static class C1079b<T extends aqn<T, ?>> extends aov<T> {

        /* renamed from: a */
        private final T f2329a;

        public C1079b(T t) {
            this.f2329a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo11031a(apo apo, apz apz) {
            return aqn.m3453a(this.f2329a, apo, apz);
        }
    }

    public String toString() {
        return arz.m3610a(this, super.toString());
    }

    public int hashCode() {
        if (this.zzfkx != 0) {
            return this.zzfkx;
        }
        this.zzfkx = asj.m3697a().mo11113a(this).mo11100a(this);
        return this.zzfkx;
    }

    /* renamed from: com.google.android.gms.internal.ads.aqn$a */
    public static abstract class C1078a<MessageType extends aqn<MessageType, BuilderType>, BuilderType extends C1078a<MessageType, BuilderType>> extends aou<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f2326a;

        /* renamed from: b */
        private final MessageType f2327b;

        /* renamed from: c */
        private boolean f2328c = false;

        protected C1078a(MessageType messagetype) {
            this.f2327b = messagetype;
            this.f2326a = (aqn) messagetype.mo10613a(C1082e.f2333d, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo11026b() {
            if (this.f2328c) {
                MessageType messagetype = (aqn) this.f2326a.mo10613a(C1082e.f2333d, (Object) null, (Object) null);
                m3472a(messagetype, this.f2326a);
                this.f2326a = messagetype;
                this.f2328c = false;
            }
        }

        /* renamed from: k */
        public final boolean mo11019k() {
            return aqn.m3459a(this.f2326a, false);
        }

        /* renamed from: c */
        public MessageType mo11029e() {
            if (this.f2328c) {
                return this.f2326a;
            }
            MessageType messagetype = this.f2326a;
            asj.m3697a().mo11113a(messagetype).mo11108c(messagetype);
            this.f2328c = true;
            return this.f2326a;
        }

        /* renamed from: d */
        public final MessageType mo11030f() {
            MessageType messagetype = (aqn) mo11029e();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo10613a(C1082e.f2330a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = asj.m3697a().mo11113a(messagetype).mo11109d(messagetype);
                    if (booleanValue) {
                        messagetype.mo10613a(C1082e.f2331b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new atf(messagetype);
        }

        /* renamed from: a */
        public final BuilderType mo10758a(MessageType messagetype) {
            mo11026b();
            m3472a(this.f2326a, messagetype);
            return this;
        }

        /* renamed from: a */
        private static void m3472a(MessageType messagetype, MessageType messagetype2) {
            asj.m3697a().mo11113a(messagetype).mo11107b(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final /* synthetic */ aou mo10757a() {
            return (C1078a) clone();
        }

        /* renamed from: q */
        public final /* synthetic */ arw mo11023q() {
            return this.f2327b;
        }

        public /* synthetic */ Object clone() {
            C1078a aVar = (C1078a) ((aqn) this.f2327b).mo10613a(C1082e.f2334e, (Object) null, (Object) null);
            aVar.mo10758a((aqn) mo11029e());
            return aVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((aqn) mo10613a(C1082e.f2335f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return asj.m3697a().mo11113a(this).mo11105a(this, (aqn) obj);
    }

    /* renamed from: k */
    public final boolean mo11019k() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo10613a(C1082e.f2330a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = asj.m3697a().mo11113a(this).mo11109d(this);
        if (booleanValue) {
            mo10613a(C1082e.f2331b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo10756j() {
        return this.zzfpv;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10753a(int i) {
        this.zzfpv = i;
    }

    /* renamed from: a */
    public final void mo11016a(apt apt) {
        asj.m3697a().mo11112a(getClass()).mo11103a(this, (auc) apv.m3323a(apt));
    }

    /* renamed from: l */
    public final int mo11020l() {
        if (this.zzfpv == -1) {
            this.zzfpv = asj.m3697a().mo11113a(this).mo11106b(this);
        }
        return this.zzfpv;
    }

    /* renamed from: a */
    static <T extends aqn<?, ?>> T m3455a(Class<T> cls) {
        T t = (aqn) zzfpw.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (aqn) zzfpw.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? "Unable to get default instance for: ".concat(valueOf) : new String("Unable to get default instance for: "));
    }

    /* renamed from: a */
    protected static <T extends aqn<?, ?>> void m3458a(Class<T> cls, T t) {
        zzfpw.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m3456a(arw arw, String str, Object[] objArr) {
        return new asm(arw, str, objArr);
    }

    /* renamed from: a */
    static Object m3457a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static final <T extends aqn<T, ?>> boolean m3459a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo10613a(C1082e.f2330a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return asj.m3697a().mo11113a(t).mo11109d(t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.aqo, com.google.android.gms.internal.ads.aqt] */
    /* renamed from: m */
    protected static aqt m3461m() {
        return aqo.m3486d();
    }

    /* renamed from: n */
    protected static <E> aqu<E> m3462n() {
        return ask.m3701d();
    }

    /* renamed from: a */
    static <T extends aqn<T, ?>> T m3453a(T t, apo apo, apz apz) {
        T t2 = (aqn) t.mo10613a(C1082e.f2333d, (Object) null, (Object) null);
        try {
            asj.m3697a().mo11113a(t2).mo11102a(t2, apr.m3095a(apo), apz);
            asj.m3697a().mo11113a(t2).mo11108c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof aqv) {
                throw ((aqv) e.getCause());
            }
            throw new aqv(e.getMessage()).mo11038a(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof aqv) {
                throw ((aqv) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: b */
    private static <T extends aqn<T, ?>> T m3460b(T t, byte[] bArr) {
        T t2 = (aqn) t.mo10613a(C1082e.f2333d, (Object) null, (Object) null);
        try {
            asj.m3697a().mo11113a(t2).mo11104a(t2, bArr, 0, bArr.length, new aoz());
            asj.m3697a().mo11113a(t2).mo11108c(t2);
            if (t2.zzfkx == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof aqv) {
                throw ((aqv) e.getCause());
            }
            throw new aqv(e.getMessage()).mo11038a(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw aqv.m3507a().mo11038a(t2);
        }
    }

    /* renamed from: a */
    protected static <T extends aqn<T, ?>> T m3451a(T t, apc apc) {
        boolean z;
        T a = m3452a(t, apc, apz.m3374a());
        boolean z2 = false;
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo10613a(C1082e.f2330a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = asj.m3697a().mo11113a(a).mo11109d(a);
                if (booleanValue) {
                    a.mo10613a(C1082e.f2331b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                throw new atf(a).mo11165a().mo11038a(a);
            }
        }
        if (a != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) a.mo10613a(C1082e.f2330a, (Object) null, (Object) null)).byteValue();
            if (byteValue2 == 1) {
                z2 = true;
            } else if (byteValue2 != 0) {
                z2 = asj.m3697a().mo11113a(a).mo11109d(a);
                if (booleanValue2) {
                    a.mo10613a(C1082e.f2331b, (Object) z2 ? a : null, (Object) null);
                }
            }
            if (!z2) {
                throw new atf(a).mo11165a().mo11038a(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static <T extends aqn<T, ?>> T m3452a(T t, apc apc, apz apz) {
        T a;
        try {
            apo e = apc.mo10801e();
            a = m3453a(t, e, apz);
            e.mo10819a(0);
            return a;
        } catch (aqv e2) {
            throw e2.mo11038a(a);
        } catch (aqv e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    protected static <T extends aqn<T, ?>> T m3454a(T t, byte[] bArr) {
        T b = m3460b(t, bArr);
        if (b != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) b.mo10613a(C1082e.f2330a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = asj.m3697a().mo11113a(b).mo11109d(b);
                    if (booleanValue) {
                        b.mo10613a(C1082e.f2331b, (Object) z ? b : null, (Object) null);
                    }
                }
            }
            if (!z) {
                throw new atf(b).mo11165a().mo11038a(b);
            }
        }
        return b;
    }

    /* renamed from: o */
    public final /* synthetic */ arx mo11021o() {
        C1078a aVar = (C1078a) mo10613a(C1082e.f2334e, (Object) null, (Object) null);
        aVar.mo10758a(this);
        return aVar;
    }

    /* renamed from: p */
    public final /* synthetic */ arx mo11022p() {
        return (C1078a) mo10613a(C1082e.f2334e, (Object) null, (Object) null);
    }

    /* renamed from: q */
    public final /* synthetic */ arw mo11023q() {
        return (aqn) mo10613a(C1082e.f2335f, (Object) null, (Object) null);
    }
}
