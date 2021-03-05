package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.cg */
public abstract class C1941cg<T> {

    /* renamed from: a */
    private static final Object f7553a = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static Context f7554b = null;

    /* renamed from: c */
    private static boolean f7555c = false;

    /* renamed from: g */
    private static final AtomicInteger f7556g = new AtomicInteger();

    /* renamed from: d */
    private final C1947cm f7557d;

    /* renamed from: e */
    private final String f7558e;

    /* renamed from: f */
    private final T f7559f;

    /* renamed from: h */
    private volatile int f7560h;

    /* renamed from: i */
    private volatile T f7561i;

    /* renamed from: a */
    public static void m9024a(Context context) {
        synchronized (f7553a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f7554b != context) {
                synchronized (C1928bu.class) {
                    C1928bu.f7539a.clear();
                }
                synchronized (C1948cn.class) {
                    C1948cn.f7569a.clear();
                }
                synchronized (C1937cc.class) {
                    C1937cc.f7549a = null;
                }
                f7556g.incrementAndGet();
                f7554b = context;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo13555a(Object obj);

    /* renamed from: a */
    static void m9023a() {
        f7556g.incrementAndGet();
    }

    private C1941cg(C1947cm cmVar, String str, T t) {
        this.f7560h = -1;
        if (cmVar.f7563b != null) {
            this.f7557d = cmVar;
            this.f7558e = str;
            this.f7559f = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    private final String m9022a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f7558e;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f7558e);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: b */
    public final String mo13556b() {
        return m9022a(this.f7557d.f7565d);
    }

    /* renamed from: c */
    public final T mo13557c() {
        return this.f7559f;
    }

    /* renamed from: d */
    public final T mo13558d() {
        int i = f7556g.get();
        if (this.f7560h < i) {
            synchronized (this) {
                if (this.f7560h < i) {
                    if (f7554b != null) {
                        C1947cm cmVar = this.f7557d;
                        T e = m9030e();
                        if (e == null) {
                            e = m9031f();
                            if (e == null) {
                                e = this.f7559f;
                            }
                        }
                        this.f7561i = e;
                        this.f7560h = i;
                    } else {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                }
            }
        }
        return this.f7561i;
    }

    @Nullable
    /* renamed from: e */
    private final T m9030e() {
        C1933bz bzVar;
        Object a;
        C1947cm cmVar = this.f7557d;
        String str = (String) C1937cc.m9011a(f7554b).mo13546a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (!(str != null && C1925br.f7525b.matcher(str).matches())) {
            if (this.f7557d.f7563b != null) {
                bzVar = C1928bu.m8993a(f7554b.getContentResolver(), this.f7557d.f7563b);
            } else {
                Context context = f7554b;
                C1947cm cmVar2 = this.f7557d;
                bzVar = C1948cn.m9052a(context, (String) null);
            }
            if (!(bzVar == null || (a = bzVar.mo13546a(mo13556b())) == null)) {
                return mo13555a(a);
            }
        } else {
            String valueOf = String.valueOf(mo13556b());
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    private final T m9031f() {
        C1947cm cmVar = this.f7557d;
        C1937cc a = C1937cc.m9011a(f7554b);
        C1947cm cmVar2 = this.f7557d;
        Object a2 = a.mo13546a(m9022a(this.f7557d.f7564c));
        if (a2 != null) {
            return mo13555a(a2);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1941cg<Long> m9027b(C1947cm cmVar, String str, long j) {
        return new C1942ch(cmVar, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1941cg<Integer> m9026b(C1947cm cmVar, String str, int i) {
        return new C1943ci(cmVar, str, Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1941cg<Boolean> m9029b(C1947cm cmVar, String str, boolean z) {
        return new C1944cj(cmVar, str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1941cg<Double> m9025b(C1947cm cmVar, String str, double d) {
        return new C1945ck(cmVar, str, Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1941cg<String> m9028b(C1947cm cmVar, String str, String str2) {
        return new C1946cl(cmVar, str, str2);
    }

    /* synthetic */ C1941cg(C1947cm cmVar, String str, Object obj, C1942ch chVar) {
        this(cmVar, str, obj);
    }
}
