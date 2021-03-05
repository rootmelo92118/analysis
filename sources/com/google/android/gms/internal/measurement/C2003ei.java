package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2003ei;
import com.google.android.gms.internal.measurement.C2003ei.C2004a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.ei */
public abstract class C2003ei<MessageType extends C2003ei<MessageType, BuilderType>, BuilderType extends C2004a<MessageType, BuilderType>> extends C1950cp<MessageType, BuilderType> {
    private static Map<Object, C2003ei<?, ?>> zzbyf = new ConcurrentHashMap();
    protected C2081ha zzbyd = C2081ha.m9978a();
    private int zzbye = -1;

    /* renamed from: com.google.android.gms.internal.measurement.ei$c */
    public static abstract class C2006c<MessageType extends C2006c<MessageType, BuilderType>, BuilderType> extends C2003ei<MessageType, BuilderType> implements C2045fs {
        protected C1993dz<Object> zzbyj = C1993dz.m9483a();
    }

    /* renamed from: com.google.android.gms.internal.measurement.ei$d */
    public static class C2007d<ContainingType extends C2043fq, Type> extends C1985ds<ContainingType, Type> {
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.measurement.ei$e */
    public static final class C2008e {

        /* renamed from: a */
        public static final int f7730a = 1;

        /* renamed from: b */
        public static final int f7731b = 2;

        /* renamed from: c */
        public static final int f7732c = 3;

        /* renamed from: d */
        public static final int f7733d = 4;

        /* renamed from: e */
        public static final int f7734e = 5;

        /* renamed from: f */
        public static final int f7735f = 6;

        /* renamed from: g */
        public static final int f7736g = 7;

        /* renamed from: h */
        public static final int f7737h = 1;

        /* renamed from: i */
        public static final int f7738i = 2;

        /* renamed from: j */
        public static final int f7739j = 1;

        /* renamed from: k */
        public static final int f7740k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f7741l = {f7730a, f7731b, f7732c, f7733d, f7734e, f7735f, f7736g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f7742m = {f7737h, f7738i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f7743n = {f7739j, f7740k};

        /* renamed from: a */
        public static int[] m9550a() {
            return (int[]) f7741l.clone();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo13492a(int i, Object obj, Object obj2);

    /* renamed from: com.google.android.gms.internal.measurement.ei$b */
    public static class C2005b<T extends C2003ei<T, ?>> extends C1952cr<T> {

        /* renamed from: a */
        private final T f7729a;

        public C2005b(T t) {
            this.f7729a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo13829a(C1971dj djVar, C1988dv dvVar) {
            return C2003ei.m9521a(this.f7729a, djVar, dvVar);
        }
    }

    public String toString() {
        return C2046ft.m9708a(this, super.toString());
    }

    public int hashCode() {
        if (this.zzbti != 0) {
            return this.zzbti;
        }
        this.zzbti = C2057gd.m9772a().mo13937a(this).mo13925a(this);
        return this.zzbti;
    }

    /* renamed from: com.google.android.gms.internal.measurement.ei$a */
    public static abstract class C2004a<MessageType extends C2003ei<MessageType, BuilderType>, BuilderType extends C2004a<MessageType, BuilderType>> extends C1951cq<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f7726a;

        /* renamed from: b */
        private final MessageType f7727b;

        /* renamed from: c */
        private boolean f7728c = false;

        protected C2004a(MessageType messagetype) {
            this.f7727b = messagetype;
            this.f7726a = (C2003ei) messagetype.mo13492a(C2008e.f7733d, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo13824b() {
            if (this.f7728c) {
                MessageType messagetype = (C2003ei) this.f7726a.mo13492a(C2008e.f7733d, (Object) null, (Object) null);
                m9538a(messagetype, this.f7726a);
                this.f7726a = messagetype;
                this.f7728c = false;
            }
        }

        /* renamed from: f */
        public final boolean mo13815f() {
            return C2003ei.m9526a(this.f7726a, false);
        }

        /* renamed from: c */
        public MessageType mo13827e() {
            if (this.f7728c) {
                return this.f7726a;
            }
            MessageType messagetype = this.f7726a;
            C2057gd.m9772a().mo13937a(messagetype).mo13932c(messagetype);
            this.f7728c = true;
            return this.f7726a;
        }

        /* renamed from: d */
        public final MessageType mo13828g() {
            MessageType messagetype = (C2003ei) mo13827e();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo13492a(C2008e.f7730a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C2057gd.m9772a().mo13937a(messagetype).mo13933d(messagetype);
                    if (booleanValue) {
                        messagetype.mo13492a(C2008e.f7731b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new C2078gy(messagetype);
        }

        /* renamed from: a */
        public final BuilderType mo13570a(MessageType messagetype) {
            mo13824b();
            m9538a(this.f7726a, messagetype);
            return this;
        }

        /* renamed from: a */
        private static void m9538a(MessageType messagetype, MessageType messagetype2) {
            C2057gd.m9772a().mo13937a(messagetype).mo13931b(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final /* synthetic */ C1951cq mo13569a() {
            return (C2004a) clone();
        }

        /* renamed from: l */
        public final /* synthetic */ C2043fq mo13821l() {
            return this.f7727b;
        }

        public /* synthetic */ Object clone() {
            C2004a aVar = (C2004a) ((C2003ei) this.f7727b).mo13492a(C2008e.f7734e, (Object) null, (Object) null);
            aVar.mo13570a((C2003ei) mo13827e());
            return aVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C2003ei) mo13492a(C2008e.f7735f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C2057gd.m9772a().mo13937a(this).mo13929a(this, (C2003ei) obj);
    }

    /* renamed from: f */
    public final boolean mo13815f() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo13492a(C2008e.f7730a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C2057gd.m9772a().mo13937a(this).mo13933d(this);
        if (booleanValue) {
            mo13492a(C2008e.f7731b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* renamed from: g */
    public final BuilderType mo13816g() {
        BuilderType buildertype = (C2004a) mo13492a(C2008e.f7734e, (Object) null, (Object) null);
        buildertype.mo13570a(this);
        return buildertype;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo13568e() {
        return this.zzbye;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13566a(int i) {
        this.zzbye = i;
    }

    /* renamed from: a */
    public final void mo13813a(C1976do doVar) {
        C2057gd.m9772a().mo13936a(getClass()).mo13928a(this, (C2105hu) C1983dq.m9402a(doVar));
    }

    /* renamed from: h */
    public final int mo13817h() {
        if (this.zzbye == -1) {
            this.zzbye = C2057gd.m9772a().mo13937a(this).mo13930b(this);
        }
        return this.zzbye;
    }

    /* renamed from: a */
    static <T extends C2003ei<?, ?>> T m9522a(Class<T> cls) {
        T t = (C2003ei) zzbyf.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C2003ei) zzbyf.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C2003ei) ((C2003ei) C2086hf.m10016a(cls)).mo13492a(C2008e.f7735f, (Object) null, (Object) null);
            if (t != null) {
                zzbyf.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static <T extends C2003ei<?, ?>> void m9525a(Class<T> cls, T t) {
        zzbyf.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m9523a(C2043fq fqVar, String str, Object[] objArr) {
        return new C2059gf(fqVar, str, objArr);
    }

    /* renamed from: a */
    static Object m9524a(Method method, Object obj, Object... objArr) {
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
    protected static final <T extends C2003ei<T, ?>> boolean m9526a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo13492a(C2008e.f7730a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return C2057gd.m9772a().mo13937a(t).mo13933d(t);
    }

    /* renamed from: i */
    protected static <E> C2014eo<E> m9527i() {
        return C2058ge.m9775d();
    }

    /* renamed from: a */
    static <T extends C2003ei<T, ?>> T m9521a(T t, C1971dj djVar, C1988dv dvVar) {
        T t2 = (C2003ei) t.mo13492a(C2008e.f7733d, (Object) null, (Object) null);
        try {
            C2057gd.m9772a().mo13937a(t2).mo13927a(t2, C1974dm.m9175a(djVar), dvVar);
            C2057gd.m9772a().mo13937a(t2).mo13932c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C2015ep) {
                throw ((C2015ep) e.getCause());
            }
            throw new C2015ep(e.getMessage()).mo13835a(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C2015ep) {
                throw ((C2015ep) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: j */
    public final /* synthetic */ C2044fr mo13819j() {
        C2004a aVar = (C2004a) mo13492a(C2008e.f7734e, (Object) null, (Object) null);
        aVar.mo13570a(this);
        return aVar;
    }

    /* renamed from: k */
    public final /* synthetic */ C2044fr mo13820k() {
        return (C2004a) mo13492a(C2008e.f7734e, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public final /* synthetic */ C2043fq mo13821l() {
        return (C2003ei) mo13492a(C2008e.f7735f, (Object) null, (Object) null);
    }
}
