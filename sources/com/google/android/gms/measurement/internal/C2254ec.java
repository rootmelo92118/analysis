package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.support.p034v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.internal.measurement.C1912be;
import com.google.android.gms.internal.measurement.C1916bi;
import com.google.android.gms.internal.measurement.C1917bj;
import com.google.android.gms.internal.measurement.C1919bl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

/* renamed from: com.google.android.gms.measurement.internal.ec */
public class C2254ec implements C2191bu {

    /* renamed from: a */
    private static volatile C2254ec f8404a;

    /* renamed from: b */
    private C2160aq f8405b;

    /* renamed from: c */
    private C2299v f8406c;

    /* renamed from: d */
    private C2275ew f8407d;

    /* renamed from: e */
    private C2145ab f8408e;

    /* renamed from: f */
    private C2249dy f8409f;

    /* renamed from: g */
    private C2269eq f8410g;

    /* renamed from: h */
    private final C2261ei f8411h;

    /* renamed from: i */
    private C2210cm f8412i;

    /* renamed from: j */
    private final C2166aw f8413j;

    /* renamed from: k */
    private boolean f8414k;

    /* renamed from: l */
    private boolean f8415l;

    /* renamed from: m */
    private boolean f8416m;

    /* renamed from: n */
    private long f8417n;

    /* renamed from: o */
    private List<Runnable> f8418o;

    /* renamed from: p */
    private int f8419p;

    /* renamed from: q */
    private int f8420q;

    /* renamed from: r */
    private boolean f8421r;

    /* renamed from: s */
    private boolean f8422s;

    /* renamed from: t */
    private boolean f8423t;

    /* renamed from: u */
    private FileLock f8424u;

    /* renamed from: v */
    private FileChannel f8425v;

    /* renamed from: w */
    private List<Long> f8426w;

    /* renamed from: x */
    private List<Long> f8427x;

    /* renamed from: y */
    private long f8428y;

    /* renamed from: com.google.android.gms.measurement.internal.ec$a */
    class C2255a implements C2277ey {

        /* renamed from: a */
        C1919bl f8429a;

        /* renamed from: b */
        List<Long> f8430b;

        /* renamed from: c */
        List<C1916bi> f8431c;

        /* renamed from: d */
        private long f8432d;

        private C2255a() {
        }

        /* renamed from: a */
        public final void mo14541a(C1919bl blVar) {
            C0926p.m1306a(blVar);
            this.f8429a = blVar;
        }

        /* renamed from: a */
        public final boolean mo14542a(long j, C1916bi biVar) {
            C0926p.m1306a(biVar);
            if (this.f8431c == null) {
                this.f8431c = new ArrayList();
            }
            if (this.f8430b == null) {
                this.f8430b = new ArrayList();
            }
            if (this.f8431c.size() > 0 && m10971a(this.f8431c.get(0)) != m10971a(biVar)) {
                return false;
            }
            long e = this.f8432d + ((long) biVar.mo14106e());
            if (e >= ((long) Math.max(0, C2284h.f8577q.mo14804b().intValue()))) {
                return false;
            }
            this.f8432d = e;
            this.f8431c.add(biVar);
            this.f8430b.add(Long.valueOf(j));
            if (this.f8431c.size() >= Math.max(1, C2284h.f8578r.mo14804b().intValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private static long m10971a(C1916bi biVar) {
            return ((biVar.f7455c.longValue() / 1000) / 60) / 60;
        }

        /* synthetic */ C2255a(C2254ec ecVar, C2256ed edVar) {
            this();
        }
    }

    /* renamed from: a */
    public static C2254ec m10911a(Context context) {
        C0926p.m1306a(context);
        C0926p.m1306a(context.getApplicationContext());
        if (f8404a == null) {
            synchronized (C2254ec.class) {
                if (f8404a == null) {
                    f8404a = new C2254ec(new C2260eh(context));
                }
            }
        }
        return f8404a;
    }

    private C2254ec(C2260eh ehVar) {
        this(ehVar, (C2166aw) null);
    }

    private C2254ec(C2260eh ehVar, C2166aw awVar) {
        this.f8414k = false;
        C0926p.m1306a(ehVar);
        this.f8413j = C2166aw.m10527a(ehVar.f8441a, (C2290m) null);
        this.f8428y = -1;
        C2261ei eiVar = new C2261ei(this);
        eiVar.mo14509v();
        this.f8411h = eiVar;
        C2299v vVar = new C2299v(this);
        vVar.mo14509v();
        this.f8406c = vVar;
        C2160aq aqVar = new C2160aq(this);
        aqVar.mo14509v();
        this.f8405b = aqVar;
        this.f8413j.mo14234q().mo14296a((Runnable) new C2256ed(this, ehVar));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public final void m10916a(C2260eh ehVar) {
        this.f8413j.mo14234q().mo14221d();
        C2275ew ewVar = new C2275ew(this);
        ewVar.mo14509v();
        this.f8407d = ewVar;
        this.f8413j.mo14317b().mo14716a((C2274ev) this.f8405b);
        C2269eq eqVar = new C2269eq(this);
        eqVar.mo14509v();
        this.f8410g = eqVar;
        C2210cm cmVar = new C2210cm(this);
        cmVar.mo14509v();
        this.f8412i = cmVar;
        C2249dy dyVar = new C2249dy(this);
        dyVar.mo14509v();
        this.f8409f = dyVar;
        this.f8408e = new C2145ab(this);
        if (this.f8419p != this.f8420q) {
            this.f8413j.mo14235r().mo14830d_().mo14843a("Not all upload components initialized", Integer.valueOf(this.f8419p), Integer.valueOf(this.f8420q));
        }
        this.f8414k = true;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14510a() {
        this.f8413j.mo14234q().mo14221d();
        mo14529d().mo14747B();
        if (this.f8413j.mo14318c().f8044c.mo14265a() == 0) {
            this.f8413j.mo14318c().f8044c.mo14266a(this.f8413j.mo14230m().mo9996a());
        }
        m10934z();
    }

    /* renamed from: u */
    public final C2270er mo14238u() {
        return this.f8413j.mo14238u();
    }

    /* renamed from: b */
    public final C2272et mo14522b() {
        return this.f8413j.mo14317b();
    }

    /* renamed from: r */
    public final C2295r mo14235r() {
        return this.f8413j.mo14235r();
    }

    /* renamed from: q */
    public final C2161ar mo14234q() {
        return this.f8413j.mo14234q();
    }

    /* renamed from: s */
    private final C2160aq m10928s() {
        m10925b((C2253eb) this.f8405b);
        return this.f8405b;
    }

    /* renamed from: c */
    public final C2299v mo14527c() {
        m10925b((C2253eb) this.f8406c);
        return this.f8406c;
    }

    /* renamed from: d */
    public final C2275ew mo14529d() {
        m10925b((C2253eb) this.f8407d);
        return this.f8407d;
    }

    /* renamed from: t */
    private final C2145ab m10929t() {
        if (this.f8408e != null) {
            return this.f8408e;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: v */
    private final C2249dy m10930v() {
        m10925b((C2253eb) this.f8409f);
        return this.f8409f;
    }

    /* renamed from: e */
    public final C2269eq mo14531e() {
        m10925b((C2253eb) this.f8410g);
        return this.f8410g;
    }

    /* renamed from: f */
    public final C2210cm mo14532f() {
        m10925b((C2253eb) this.f8412i);
        return this.f8412i;
    }

    /* renamed from: g */
    public final C2261ei mo14533g() {
        m10925b((C2253eb) this.f8411h);
        return this.f8411h;
    }

    /* renamed from: h */
    public final C2293p mo14534h() {
        return this.f8413j.mo14326k();
    }

    /* renamed from: n */
    public final Context mo14231n() {
        return this.f8413j.mo14231n();
    }

    /* renamed from: m */
    public final C0969e mo14230m() {
        return this.f8413j.mo14230m();
    }

    /* renamed from: i */
    public final C2264el mo14535i() {
        return this.f8413j.mo14325j();
    }

    @WorkerThread
    /* renamed from: w */
    private final void m10931w() {
        this.f8413j.mo14234q().mo14221d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo14536j() {
        if (!this.f8414k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: b */
    private static void m10925b(C2253eb ebVar) {
        if (ebVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!ebVar.mo14507j()) {
            String valueOf = String.valueOf(ebVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14516a(zzk zzk) {
        m10931w();
        mo14536j();
        C0926p.m1308a(zzk.f8661a);
        m10927e(zzk);
    }

    /* renamed from: x */
    private final long m10932x() {
        long a = this.f8413j.mo14230m().mo9996a();
        C2147ad c = this.f8413j.mo14318c();
        c.mo14377A();
        c.mo14221d();
        long a2 = c.f8048g.mo14265a();
        if (a2 == 0) {
            a2 = 1 + ((long) c.mo14233p().mo14582h().nextInt(86400000));
            c.f8048g.mo14266a(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14514a(zzag zzag, String str) {
        zzag zzag2 = zzag;
        String str2 = str;
        C2266en b = mo14529d().mo14771b(str2);
        if (b == null || TextUtils.isEmpty(b.mo14626j())) {
            this.f8413j.mo14235r().mo14837w().mo14842a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = m10924b(b);
        if (b2 == null) {
            if (!"_ui".equals(zzag2.f8649a)) {
                this.f8413j.mo14235r().mo14833i().mo14842a("Could not find package. appId", C2295r.m11413a(str));
            }
        } else if (!b2.booleanValue()) {
            this.f8413j.mo14235r().mo14830d_().mo14842a("App version does not match; dropping event. appId", C2295r.m11413a(str));
            return;
        }
        zzk zzk = r2;
        C2266en enVar = b;
        zzk zzk2 = new zzk(str, b.mo14609d(), b.mo14626j(), b.mo14628k(), b.mo14630l(), b.mo14632m(), b.mo14634n(), (String) null, b.mo14637o(), false, enVar.mo14618g(), enVar.mo14594B(), 0, 0, enVar.mo14595C(), enVar.mo14596D(), false, enVar.mo14612e());
        mo14513a(zzag2, zzk);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14513a(zzag zzag, zzk zzk) {
        List<zzo> list;
        List<zzo> list2;
        List<zzo> list3;
        zzag zzag2 = zzag;
        zzk zzk2 = zzk;
        C0926p.m1306a(zzk);
        C0926p.m1308a(zzk2.f8661a);
        m10931w();
        mo14536j();
        String str = zzk2.f8661a;
        long j = zzag2.f8652d;
        if (mo14533g().mo14552a(zzag2, zzk2)) {
            if (!zzk2.f8668h) {
                m10927e(zzk2);
                return;
            }
            mo14529d().mo14782f();
            try {
                C2275ew d = mo14529d();
                C0926p.m1308a(str);
                d.mo14221d();
                d.mo14508k();
                if (j < 0) {
                    d.mo14235r().mo14833i().mo14843a("Invalid time querying timed out conditional properties", C2295r.m11413a(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = d.mo14761a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzo next : list) {
                    if (next != null) {
                        this.f8413j.mo14235r().mo14837w().mo14844a("User property timed out", next.f8679a, this.f8413j.mo14326k().mo14826c(next.f8681c.f8653a), next.f8681c.mo14860a());
                        if (next.f8685g != null) {
                            m10926b(new zzag(next.f8685g, j), zzk2);
                        }
                        mo14529d().mo14778e(str, next.f8681c.f8653a);
                    }
                }
                C2275ew d2 = mo14529d();
                C0926p.m1308a(str);
                d2.mo14221d();
                d2.mo14508k();
                if (j < 0) {
                    d2.mo14235r().mo14833i().mo14843a("Invalid time querying expired conditional properties", C2295r.m11413a(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = d2.mo14761a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzo next2 : list2) {
                    if (next2 != null) {
                        this.f8413j.mo14235r().mo14837w().mo14844a("User property expired", next2.f8679a, this.f8413j.mo14326k().mo14826c(next2.f8681c.f8653a), next2.f8681c.mo14860a());
                        mo14529d().mo14773b(str, next2.f8681c.f8653a);
                        if (next2.f8689k != null) {
                            arrayList.add(next2.f8689k);
                        }
                        mo14529d().mo14778e(str, next2.f8681c.f8653a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    m10926b(new zzag((zzag) obj, j), zzk2);
                }
                C2275ew d3 = mo14529d();
                String str2 = zzag2.f8649a;
                C0926p.m1308a(str);
                C0926p.m1308a(str2);
                d3.mo14221d();
                d3.mo14508k();
                if (j < 0) {
                    d3.mo14235r().mo14833i().mo14844a("Invalid time querying triggered conditional properties", C2295r.m11413a(str), d3.mo14232o().mo14824a(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = d3.mo14761a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                for (zzo next3 : list3) {
                    if (next3 != null) {
                        zzfv zzfv = next3.f8681c;
                        C2263ek ekVar = r4;
                        C2263ek ekVar2 = new C2263ek(next3.f8679a, next3.f8680b, zzfv.f8653a, j, zzfv.mo14860a());
                        if (mo14529d().mo14768a(ekVar)) {
                            this.f8413j.mo14235r().mo14837w().mo14844a("User property triggered", next3.f8679a, this.f8413j.mo14326k().mo14826c(ekVar.f8444c), ekVar.f8446e);
                        } else {
                            this.f8413j.mo14235r().mo14830d_().mo14844a("Too many active user properties, ignoring", C2295r.m11413a(next3.f8679a), this.f8413j.mo14326k().mo14826c(ekVar.f8444c), ekVar.f8446e);
                        }
                        if (next3.f8687i != null) {
                            arrayList3.add(next3.f8687i);
                        }
                        next3.f8681c = new zzfv(ekVar);
                        next3.f8683e = true;
                        mo14529d().mo14769a(next3);
                    }
                }
                m10926b(zzag, zzk);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    m10926b(new zzag((zzag) obj2, j), zzk2);
                }
                mo14529d().mo14785w();
            } finally {
                mo14529d().mo14786x();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:196:0x0781 A[Catch:{ SQLiteException -> 0x0226, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x07ae A[Catch:{ SQLiteException -> 0x0226, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0259 A[Catch:{ SQLiteException -> 0x0226, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x028c A[Catch:{ SQLiteException -> 0x0226, all -> 0x07f3 }] */
    @android.support.annotation.WorkerThread
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10926b(com.google.android.gms.measurement.internal.zzag r26, com.google.android.gms.measurement.internal.zzk r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r27
            com.google.android.gms.common.internal.C0926p.m1306a(r27)
            java.lang.String r0 = r3.f8661a
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r0)
            long r4 = java.lang.System.nanoTime()
            r25.m10931w()
            r25.mo14536j()
            java.lang.String r15 = r3.f8661a
            com.google.android.gms.measurement.internal.ei r0 = r25.mo14533g()
            boolean r0 = r0.mo14552a((com.google.android.gms.measurement.internal.zzag) r2, (com.google.android.gms.measurement.internal.zzk) r3)
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            boolean r0 = r3.f8668h
            if (r0 != 0) goto L_0x002d
            r1.m10927e(r3)
            return
        L_0x002d:
            com.google.android.gms.measurement.internal.aq r0 = r25.m10928s()
            java.lang.String r6 = r2.f8649a
            boolean r0 = r0.mo14283b(r15, r6)
            r14 = 0
            r21 = 1
            if (r0 == 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()
            java.lang.String r3 = "Dropping blacklisted event. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r15)
            com.google.android.gms.measurement.internal.aw r5 = r1.f8413j
            com.google.android.gms.measurement.internal.p r5 = r5.mo14326k()
            java.lang.String r6 = r2.f8649a
            java.lang.String r5 = r5.mo14824a((java.lang.String) r6)
            r0.mo14843a(r3, r4, r5)
            com.google.android.gms.measurement.internal.aq r0 = r25.m10928s()
            boolean r0 = r0.mo14290f(r15)
            if (r0 != 0) goto L_0x006f
            com.google.android.gms.measurement.internal.aq r0 = r25.m10928s()
            boolean r0 = r0.mo14292g(r15)
            if (r0 == 0) goto L_0x0070
        L_0x006f:
            r14 = 1
        L_0x0070:
            if (r14 != 0) goto L_0x008d
            java.lang.String r0 = "_err"
            java.lang.String r3 = r2.f8649a
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x008d
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j
            com.google.android.gms.measurement.internal.el r6 = r0.mo14325j()
            r8 = 11
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f8649a
            r11 = 0
            r7 = r15
            r6.mo14570a((java.lang.String) r7, (int) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)
        L_0x008d:
            if (r14 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()
            com.google.android.gms.measurement.internal.en r0 = r0.mo14771b(r15)
            if (r0 == 0) goto L_0x00d6
            long r2 = r0.mo14640r()
            long r4 = r0.mo14639q()
            long r2 = java.lang.Math.max(r2, r4)
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j
            com.google.android.gms.common.util.e r4 = r4.mo14230m()
            long r4 = r4.mo9996a()
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r4 = com.google.android.gms.measurement.internal.C2284h.f8515H
            java.lang.Object r4 = r4.mo14804b()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.aw r2 = r1.f8413j
            com.google.android.gms.measurement.internal.r r2 = r2.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14837w()
            java.lang.String r3 = "Fetching config for blacklisted app"
            r2.mo14841a(r3)
            r1.m10917a((com.google.android.gms.measurement.internal.C2266en) r0)
        L_0x00d6:
            return
        L_0x00d7:
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()
            r13 = 2
            boolean r0 = r0.mo14829a((int) r13)
            if (r0 == 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()
            java.lang.String r6 = "Logging event"
            com.google.android.gms.measurement.internal.aw r7 = r1.f8413j
            com.google.android.gms.measurement.internal.p r7 = r7.mo14326k()
            java.lang.String r7 = r7.mo14823a((com.google.android.gms.measurement.internal.zzag) r2)
            r0.mo14842a(r6, r7)
        L_0x00fd:
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()
            r0.mo14782f()
            r1.m10927e(r3)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "_iap"
            java.lang.String r6 = r2.f8649a     // Catch:{ all -> 0x07f3 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "ecommerce_purchase"
            java.lang.String r6 = r2.f8649a     // Catch:{ all -> 0x07f3 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x029b
        L_0x011b:
            com.google.android.gms.measurement.internal.zzad r0 = r2.f8650b     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "currency"
            java.lang.String r0 = r0.mo14854d(r6)     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "ecommerce_purchase"
            java.lang.String r7 = r2.f8649a     // Catch:{ all -> 0x07f3 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x0183
            com.google.android.gms.measurement.internal.zzad r6 = r2.f8650b     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "value"
            java.lang.Double r6 = r6.mo14853c(r7)     // Catch:{ all -> 0x07f3 }
            double r6 = r6.doubleValue()     // Catch:{ all -> 0x07f3 }
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 * r8
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0158
            com.google.android.gms.measurement.internal.zzad r6 = r2.f8650b     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "value"
            java.lang.Long r6 = r6.mo14852b(r7)     // Catch:{ all -> 0x07f3 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x07f3 }
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
        L_0x0158:
            r8 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0169
            r8 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0169
            long r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x07f3 }
            goto L_0x018f
        L_0x0169:
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r0.mo14843a(r8, r9, r6)     // Catch:{ all -> 0x07f3 }
            r0 = 0
            goto L_0x028a
        L_0x0183:
            com.google.android.gms.measurement.internal.zzad r6 = r2.f8650b     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "value"
            java.lang.Long r6 = r6.mo14852b(r7)     // Catch:{ all -> 0x07f3 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x07f3 }
        L_0x018f:
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07f3 }
            if (r8 != 0) goto L_0x0289
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r0.toUpperCase(r8)     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = "[A-Z]{3}"
            boolean r8 = r0.matches(r8)     // Catch:{ all -> 0x07f3 }
            if (r8 == 0) goto L_0x0289
            java.lang.String r8 = "_ltv_"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x07f3 }
            int r9 = r0.length()     // Catch:{ all -> 0x07f3 }
            if (r9 == 0) goto L_0x01b9
            java.lang.String r0 = r8.concat(r0)     // Catch:{ all -> 0x07f3 }
        L_0x01b7:
            r9 = r0
            goto L_0x01bf
        L_0x01b9:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x07f3 }
            r0.<init>(r8)     // Catch:{ all -> 0x07f3 }
            goto L_0x01b7
        L_0x01bf:
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r0 = r0.mo14775c(r15, r9)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x01f4
            java.lang.Object r8 = r0.f8446e     // Catch:{ all -> 0x07f3 }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x07f3 }
            if (r8 != 0) goto L_0x01d0
            goto L_0x01f4
        L_0x01d0:
            java.lang.Object r0 = r0.f8446e     // Catch:{ all -> 0x07f3 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x07f3 }
            long r10 = r0.longValue()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r0 = new com.google.android.gms.measurement.internal.ek     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r2.f8651c     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r12 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.util.e r12 = r12.mo14230m()     // Catch:{ all -> 0x07f3 }
            long r16 = r12.mo9996a()     // Catch:{ all -> 0x07f3 }
            r12 = 0
            long r10 = r10 + r6
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07f3 }
            r6 = r0
            r7 = r15
            r10 = r16
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x07f3 }
            goto L_0x024f
        L_0x01f4:
            com.google.android.gms.measurement.internal.ew r8 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.et r0 = r0.mo14317b()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C2284h.f8520M     // Catch:{ all -> 0x07f3 }
            int r0 = r0.mo14718b(r15, r10)     // Catch:{ all -> 0x07f3 }
            int r0 = r0 + -1
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r15)     // Catch:{ all -> 0x07f3 }
            r8.mo14221d()     // Catch:{ all -> 0x07f3 }
            r8.mo14508k()     // Catch:{ all -> 0x07f3 }
            android.database.sqlite.SQLiteDatabase r10 = r8.mo14787y()     // Catch:{ SQLiteException -> 0x0226 }
            java.lang.String r11 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12 = 3
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0226 }
            r12[r14] = r15     // Catch:{ SQLiteException -> 0x0226 }
            r12[r21] = r15     // Catch:{ SQLiteException -> 0x0226 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0226 }
            r12[r13] = r0     // Catch:{ SQLiteException -> 0x0226 }
            r10.execSQL(r11, r12)     // Catch:{ SQLiteException -> 0x0226 }
            goto L_0x0238
        L_0x0226:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r8 = r8.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo14830d_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r10 = "Error pruning currencies. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r15)     // Catch:{ all -> 0x07f3 }
            r8.mo14843a(r10, r11, r0)     // Catch:{ all -> 0x07f3 }
        L_0x0238:
            com.google.android.gms.measurement.internal.ek r0 = new com.google.android.gms.measurement.internal.ek     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r2.f8651c     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r10 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.util.e r10 = r10.mo14230m()     // Catch:{ all -> 0x07f3 }
            long r10 = r10.mo9996a()     // Catch:{ all -> 0x07f3 }
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r6 = r0
            r7 = r15
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x07f3 }
        L_0x024f:
            com.google.android.gms.measurement.internal.ew r6 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            boolean r6 = r6.mo14768a((com.google.android.gms.measurement.internal.C2263ek) r0)     // Catch:{ all -> 0x07f3 }
            if (r6 != 0) goto L_0x0289
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo14830d_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r15)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r9 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo14326k()     // Catch:{ all -> 0x07f3 }
            java.lang.String r10 = r0.f8444c     // Catch:{ all -> 0x07f3 }
            java.lang.String r9 = r9.mo14826c(r10)     // Catch:{ all -> 0x07f3 }
            java.lang.Object r0 = r0.f8446e     // Catch:{ all -> 0x07f3 }
            r6.mo14844a(r7, r8, r9, r0)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.el r6 = r0.mo14325j()     // Catch:{ all -> 0x07f3 }
            r8 = 9
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r15
            r6.mo14570a((java.lang.String) r7, (int) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)     // Catch:{ all -> 0x07f3 }
        L_0x0289:
            r0 = 1
        L_0x028a:
            if (r0 != 0) goto L_0x029b
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            r0.mo14785w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()
            r0.mo14786x()
            return
        L_0x029b:
            java.lang.String r0 = r2.f8649a     // Catch:{ all -> 0x07f3 }
            boolean r0 = com.google.android.gms.measurement.internal.C2264el.m11025a((java.lang.String) r0)     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "_err"
            java.lang.String r7 = r2.f8649a     // Catch:{ all -> 0x07f3 }
            boolean r16 = r6.equals(r7)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r6 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            long r7 = r25.m10932x()     // Catch:{ all -> 0x07f3 }
            r10 = 1
            r12 = 0
            r17 = 0
            r9 = r15
            r11 = r0
            r13 = r16
            r22 = r4
            r4 = 0
            r14 = r17
            com.google.android.gms.measurement.internal.ex r5 = r6.mo14756a(r7, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x07f3 }
            long r6 = r5.f8497b     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C2284h.f8579s     // Catch:{ all -> 0x07f3 }
            java.lang.Object r8 = r8.mo14804b()     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x07f3 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x07f3 }
            long r8 = (long) r8     // Catch:{ all -> 0x07f3 }
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = 1
            r13 = 0
            int r12 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0309
            long r6 = r6 % r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x02fa
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r2 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r15)     // Catch:{ all -> 0x07f3 }
            long r4 = r5.f8497b     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07f3 }
            r0.mo14843a(r2, r3, r4)     // Catch:{ all -> 0x07f3 }
        L_0x02fa:
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            r0.mo14785w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()
            r0.mo14786x()
            return
        L_0x0309:
            if (r0 == 0) goto L_0x0363
            long r6 = r5.f8496a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C2284h.f8581u     // Catch:{ all -> 0x07f3 }
            java.lang.Object r12 = r12.mo14804b()     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x07f3 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x07f3 }
            r24 = r5
            long r4 = (long) r12     // Catch:{ all -> 0x07f3 }
            long r6 = r6 - r4
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0361
            long r6 = r6 % r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0341
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r15)     // Catch:{ all -> 0x07f3 }
            r5 = r24
            long r5 = r5.f8496a     // Catch:{ all -> 0x07f3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x07f3 }
            r0.mo14843a(r3, r4, r5)     // Catch:{ all -> 0x07f3 }
        L_0x0341:
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.el r6 = r0.mo14325j()     // Catch:{ all -> 0x07f3 }
            r8 = 16
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f8649a     // Catch:{ all -> 0x07f3 }
            r11 = 0
            r7 = r15
            r6.mo14570a((java.lang.String) r7, (int) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            r0.mo14785w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()
            r0.mo14786x()
            return
        L_0x0361:
            r5 = r24
        L_0x0363:
            if (r16 == 0) goto L_0x03b3
            long r6 = r5.f8499d     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.et r4 = r4.mo14317b()     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.C2284h.f8580t     // Catch:{ all -> 0x07f3 }
            int r4 = r4.mo14718b(r8, r9)     // Catch:{ all -> 0x07f3 }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x07f3 }
            r12 = 0
            int r4 = java.lang.Math.max(r12, r4)     // Catch:{ all -> 0x07f3 }
            long r8 = (long) r4     // Catch:{ all -> 0x07f3 }
            long r6 = r6 - r8
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x03b4
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x03a4
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r2 = "Too many error events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r15)     // Catch:{ all -> 0x07f3 }
            long r4 = r5.f8499d     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07f3 }
            r0.mo14843a(r2, r3, r4)     // Catch:{ all -> 0x07f3 }
        L_0x03a4:
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            r0.mo14785w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()
            r0.mo14786x()
            return
        L_0x03b3:
            r12 = 0
        L_0x03b4:
            com.google.android.gms.measurement.internal.zzad r4 = r2.f8650b     // Catch:{ all -> 0x07f3 }
            android.os.Bundle r4 = r4.mo14851b()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r5 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.el r5 = r5.mo14325j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "_o"
            java.lang.String r7 = r2.f8651c     // Catch:{ all -> 0x07f3 }
            r5.mo14569a((android.os.Bundle) r4, (java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r5 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.el r5 = r5.mo14325j()     // Catch:{ all -> 0x07f3 }
            boolean r5 = r5.mo14580f(r15)     // Catch:{ all -> 0x07f3 }
            if (r5 == 0) goto L_0x03f1
            com.google.android.gms.measurement.internal.aw r5 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.el r5 = r5.mo14325j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "_dbg"
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07f3 }
            r5.mo14569a((android.os.Bundle) r4, (java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r5 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.el r5 = r5.mo14325j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "_r"
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07f3 }
            r5.mo14569a((android.os.Bundle) r4, (java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x07f3 }
        L_0x03f1:
            com.google.android.gms.measurement.internal.aw r5 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.et r5 = r5.mo14317b()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            boolean r5 = r5.mo14740q(r6)     // Catch:{ all -> 0x07f3 }
            if (r5 == 0) goto L_0x042a
            java.lang.String r5 = "_s"
            java.lang.String r6 = r2.f8649a     // Catch:{ all -> 0x07f3 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x07f3 }
            if (r5 == 0) goto L_0x042a
            com.google.android.gms.measurement.internal.ew r5 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "_sno"
            com.google.android.gms.measurement.internal.ek r5 = r5.mo14775c(r6, r7)     // Catch:{ all -> 0x07f3 }
            if (r5 == 0) goto L_0x042a
            java.lang.Object r6 = r5.f8446e     // Catch:{ all -> 0x07f3 }
            boolean r6 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x042a
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.el r6 = r6.mo14325j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "_sno"
            java.lang.Object r5 = r5.f8446e     // Catch:{ all -> 0x07f3 }
            r6.mo14569a((android.os.Bundle) r4, (java.lang.String) r7, (java.lang.Object) r5)     // Catch:{ all -> 0x07f3 }
        L_0x042a:
            com.google.android.gms.measurement.internal.ew r5 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            long r5 = r5.mo14774c(r15)     // Catch:{ all -> 0x07f3 }
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x044d
            com.google.android.gms.measurement.internal.aw r7 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo14833i()     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x07f3 }
            r7.mo14843a(r8, r9, r5)     // Catch:{ all -> 0x07f3 }
        L_0x044d:
            com.google.android.gms.measurement.internal.c r5 = new com.google.android.gms.measurement.internal.c     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r2.f8651c     // Catch:{ all -> 0x07f3 }
            java.lang.String r10 = r2.f8649a     // Catch:{ all -> 0x07f3 }
            long r12 = r2.f8652d     // Catch:{ all -> 0x07f3 }
            r16 = 0
            r6 = r5
            r9 = r15
            r2 = 0
            r11 = r12
            r13 = r16
            r2 = r15
            r15 = r4
            r6.<init>((com.google.android.gms.measurement.internal.C2166aw) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (long) r11, (long) r13, (android.os.Bundle) r15)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r4 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r5.f8231b     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.d r4 = r4.mo14755a((java.lang.String) r2, (java.lang.String) r6)     // Catch:{ all -> 0x07f3 }
            if (r4 != 0) goto L_0x04d6
            com.google.android.gms.measurement.internal.ew r4 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            long r6 = r4.mo14780f(r2)     // Catch:{ all -> 0x07f3 }
            r8 = 500(0x1f4, double:2.47E-321)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x04bc
            if (r0 == 0) goto L_0x04bc
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r2)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.p r6 = r6.mo14326k()     // Catch:{ all -> 0x07f3 }
            java.lang.String r5 = r5.f8231b     // Catch:{ all -> 0x07f3 }
            java.lang.String r5 = r6.mo14824a((java.lang.String) r5)     // Catch:{ all -> 0x07f3 }
            r6 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r0.mo14844a(r3, r4, r5, r6)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.el r6 = r0.mo14325j()     // Catch:{ all -> 0x07f3 }
            r8 = 8
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r2
            r6.mo14570a((java.lang.String) r7, (int) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()
            r0.mo14786x()
            return
        L_0x04bc:
            com.google.android.gms.measurement.internal.d r0 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r5.f8231b     // Catch:{ all -> 0x07f3 }
            r9 = 0
            r11 = 0
            long r13 = r5.f8232c     // Catch:{ all -> 0x07f3 }
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r0
            r7 = r2
            r6.<init>(r7, r8, r9, r11, r13, r15, r17, r18, r19, r20)     // Catch:{ all -> 0x07f3 }
            goto L_0x04e4
        L_0x04d6:
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            long r6 = r4.f8323e     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.c r5 = r5.mo14382a(r0, r6)     // Catch:{ all -> 0x07f3 }
            long r6 = r5.f8232c     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.d r0 = r4.mo14457a(r6)     // Catch:{ all -> 0x07f3 }
        L_0x04e4:
            com.google.android.gms.measurement.internal.ew r2 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            r2.mo14762a((com.google.android.gms.measurement.internal.C2224d) r0)     // Catch:{ all -> 0x07f3 }
            r25.m10931w()     // Catch:{ all -> 0x07f3 }
            r25.mo14536j()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.internal.C0926p.m1306a(r5)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.internal.C0926p.m1306a(r27)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r5.f8230a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r0)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r5.f8230a     // Catch:{ all -> 0x07f3 }
            java.lang.String r2 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.internal.C0926p.m1316b((boolean) r0)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.internal.measurement.bl r2 = new com.google.android.gms.internal.measurement.bl     // Catch:{ all -> 0x07f3 }
            r2.<init>()     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x07f3 }
            r2.f7481a = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "android"
            r2.f7489i = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            r2.f7495o = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r3.f8664d     // Catch:{ all -> 0x07f3 }
            r2.f7494n = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r3.f8663c     // Catch:{ all -> 0x07f3 }
            r2.f7496p = r0     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f8670j     // Catch:{ all -> 0x07f3 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            r0 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x052e
            r4 = r0
            goto L_0x0535
        L_0x052e:
            long r6 = r3.f8670j     // Catch:{ all -> 0x07f3 }
            int r4 = (int) r6     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07f3 }
        L_0x0535:
            r2.f7468C = r4     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f8665e     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r2.f7497q = r4     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f8662b     // Catch:{ all -> 0x07f3 }
            r2.f7505y = r4     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f8678r     // Catch:{ all -> 0x07f3 }
            r2.f7474I = r4     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f8666f     // Catch:{ all -> 0x07f3 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0551
            r4 = r0
            goto L_0x0557
        L_0x0551:
            long r6 = r3.f8666f     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
        L_0x0557:
            r2.f7502v = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.et r4 = r4.mo14317b()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C2284h.f8554as     // Catch:{ all -> 0x07f3 }
            boolean r4 = r4.mo14723d(r6, r7)     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x0573
            com.google.android.gms.measurement.internal.ei r4 = r25.mo14533g()     // Catch:{ all -> 0x07f3 }
            int[] r4 = r4.mo14557f()     // Catch:{ all -> 0x07f3 }
            r2.f7476K = r4     // Catch:{ all -> 0x07f3 }
        L_0x0573:
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ad r4 = r4.mo14318c()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            android.util.Pair r4 = r4.mo14244a((java.lang.String) r6)     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x059c
            java.lang.Object r6 = r4.first     // Catch:{ all -> 0x07f3 }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x07f3 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x07f3 }
            if (r6 != 0) goto L_0x059c
            boolean r6 = r3.f8675o     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x05f9
            java.lang.Object r6 = r4.first     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x07f3 }
            r2.f7499s = r6     // Catch:{ all -> 0x07f3 }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x07f3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x07f3 }
            r2.f7500t = r4     // Catch:{ all -> 0x07f3 }
            goto L_0x05f9
        L_0x059c:
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo14335y()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            android.content.Context r6 = r6.mo14231n()     // Catch:{ all -> 0x07f3 }
            boolean r4 = r4.mo14356a(r6)     // Catch:{ all -> 0x07f3 }
            if (r4 != 0) goto L_0x05f9
            boolean r4 = r3.f8676p     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x05f9
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            android.content.Context r4 = r4.mo14231n()     // Catch:{ all -> 0x07f3 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r6)     // Catch:{ all -> 0x07f3 }
            if (r4 != 0) goto L_0x05dc
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14833i()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "null secure ID. appId"
            java.lang.String r7 = r2.f7495o     // Catch:{ all -> 0x07f3 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r7)     // Catch:{ all -> 0x07f3 }
            r4.mo14842a(r6, r7)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = "null"
            goto L_0x05f7
        L_0x05dc:
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x05f7
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo14833i()     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "empty secure ID. appId"
            java.lang.String r10 = r2.f7495o     // Catch:{ all -> 0x07f3 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r10)     // Catch:{ all -> 0x07f3 }
            r6.mo14842a(r7, r10)     // Catch:{ all -> 0x07f3 }
        L_0x05f7:
            r2.f7469D = r4     // Catch:{ all -> 0x07f3 }
        L_0x05f9:
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo14335y()     // Catch:{ all -> 0x07f3 }
            r4.mo14377A()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x07f3 }
            r2.f7491k = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo14335y()     // Catch:{ all -> 0x07f3 }
            r4.mo14377A()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x07f3 }
            r2.f7490j = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo14335y()     // Catch:{ all -> 0x07f3 }
            long r6 = r4.mo14357c_()     // Catch:{ all -> 0x07f3 }
            int r4 = (int) r6     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07f3 }
            r2.f7493m = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo14335y()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r4.mo14358g()     // Catch:{ all -> 0x07f3 }
            r2.f7492l = r4     // Catch:{ all -> 0x07f3 }
            r2.f7498r = r0     // Catch:{ all -> 0x07f3 }
            r2.f7484d = r0     // Catch:{ all -> 0x07f3 }
            r2.f7485e = r0     // Catch:{ all -> 0x07f3 }
            r2.f7486f = r0     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f8672l     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r2.f7471F = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            boolean r4 = r4.mo14307C()     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x0650
            boolean r4 = com.google.android.gms.measurement.internal.C2272et.m11155w()     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x0650
            r2.f7472G = r0     // Catch:{ all -> 0x07f3 }
        L_0x0650:
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.en r0 = r0.mo14771b(r4)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x06be
            com.google.android.gms.measurement.internal.en r0 = new com.google.android.gms.measurement.internal.en     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.el r4 = r4.mo14325j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r4.mo14584k()     // Catch:{ all -> 0x07f3 }
            r0.mo14599a((java.lang.String) r4)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f8671k     // Catch:{ all -> 0x07f3 }
            r0.mo14614e((java.lang.String) r4)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f8662b     // Catch:{ all -> 0x07f3 }
            r0.mo14603b((java.lang.String) r4)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ad r4 = r4.mo14318c()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r4.mo14247b((java.lang.String) r6)     // Catch:{ all -> 0x07f3 }
            r0.mo14611d((java.lang.String) r4)     // Catch:{ all -> 0x07f3 }
            r0.mo14616f((long) r8)     // Catch:{ all -> 0x07f3 }
            r0.mo14598a((long) r8)     // Catch:{ all -> 0x07f3 }
            r0.mo14602b((long) r8)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f8663c     // Catch:{ all -> 0x07f3 }
            r0.mo14617f((java.lang.String) r4)     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f8670j     // Catch:{ all -> 0x07f3 }
            r0.mo14606c((long) r6)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f8664d     // Catch:{ all -> 0x07f3 }
            r0.mo14620g((java.lang.String) r4)     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f8665e     // Catch:{ all -> 0x07f3 }
            r0.mo14610d((long) r6)     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f8666f     // Catch:{ all -> 0x07f3 }
            r0.mo14613e((long) r6)     // Catch:{ all -> 0x07f3 }
            boolean r4 = r3.f8668h     // Catch:{ all -> 0x07f3 }
            r0.mo14600a((boolean) r4)     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f8672l     // Catch:{ all -> 0x07f3 }
            r0.mo14636o(r6)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r4 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            r4.mo14763a((com.google.android.gms.measurement.internal.C2266en) r0)     // Catch:{ all -> 0x07f3 }
        L_0x06be:
            java.lang.String r4 = r0.mo14605c()     // Catch:{ all -> 0x07f3 }
            r2.f7501u = r4     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r0.mo14618g()     // Catch:{ all -> 0x07f3 }
            r2.f7467B = r0     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = r3.f8661a     // Catch:{ all -> 0x07f3 }
            java.util.List r0 = r0.mo14758a((java.lang.String) r3)     // Catch:{ all -> 0x07f3 }
            int r3 = r0.size()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.internal.measurement.bo[] r3 = new com.google.android.gms.internal.measurement.C1922bo[r3]     // Catch:{ all -> 0x07f3 }
            r2.f7483c = r3     // Catch:{ all -> 0x07f3 }
            r3 = 0
        L_0x06dd:
            int r4 = r0.size()     // Catch:{ all -> 0x07f3 }
            if (r3 >= r4) goto L_0x0716
            com.google.android.gms.internal.measurement.bo r4 = new com.google.android.gms.internal.measurement.bo     // Catch:{ all -> 0x07f3 }
            r4.<init>()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.internal.measurement.bo[] r6 = r2.f7483c     // Catch:{ all -> 0x07f3 }
            r6[r3] = r4     // Catch:{ all -> 0x07f3 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r6 = (com.google.android.gms.measurement.internal.C2263ek) r6     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r6.f8444c     // Catch:{ all -> 0x07f3 }
            r4.f7516b = r6     // Catch:{ all -> 0x07f3 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r6 = (com.google.android.gms.measurement.internal.C2263ek) r6     // Catch:{ all -> 0x07f3 }
            long r6 = r6.f8445d     // Catch:{ all -> 0x07f3 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r4.f7515a = r6     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ei r6 = r25.mo14533g()     // Catch:{ all -> 0x07f3 }
            java.lang.Object r7 = r0.get(r3)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r7 = (com.google.android.gms.measurement.internal.C2263ek) r7     // Catch:{ all -> 0x07f3 }
            java.lang.Object r7 = r7.f8446e     // Catch:{ all -> 0x07f3 }
            r6.mo14550a((com.google.android.gms.internal.measurement.C1922bo) r4, (java.lang.Object) r7)     // Catch:{ all -> 0x07f3 }
            int r3 = r3 + 1
            goto L_0x06dd
        L_0x0716:
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ IOException -> 0x0784 }
            long r3 = r0.mo14753a((com.google.android.gms.internal.measurement.C1919bl) r2)     // Catch:{ IOException -> 0x0784 }
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.zzad r2 = r5.f8234e     // Catch:{ all -> 0x07f3 }
            if (r2 == 0) goto L_0x077a
            com.google.android.gms.measurement.internal.zzad r2 = r5.f8234e     // Catch:{ all -> 0x07f3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x07f3 }
        L_0x072c:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x0742
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "_r"
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x072c
        L_0x0740:
            r2 = 1
            goto L_0x077b
        L_0x0742:
            com.google.android.gms.measurement.internal.aq r2 = r25.m10928s()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r5.f8230a     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = r5.f8231b     // Catch:{ all -> 0x07f3 }
            boolean r2 = r2.mo14285c(r6, r7)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ew r10 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            long r11 = r25.m10932x()     // Catch:{ all -> 0x07f3 }
            java.lang.String r13 = r5.f8230a     // Catch:{ all -> 0x07f3 }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.google.android.gms.measurement.internal.ex r6 = r10.mo14756a(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x07f3 }
            if (r2 == 0) goto L_0x077a
            long r6 = r6.f8500e     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r2 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.et r2 = r2.mo14317b()     // Catch:{ all -> 0x07f3 }
            java.lang.String r10 = r5.f8230a     // Catch:{ all -> 0x07f3 }
            int r2 = r2.mo14714a((java.lang.String) r10)     // Catch:{ all -> 0x07f3 }
            long r10 = (long) r2     // Catch:{ all -> 0x07f3 }
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x077a
            goto L_0x0740
        L_0x077a:
            r2 = 0
        L_0x077b:
            boolean r0 = r0.mo14767a((com.google.android.gms.measurement.internal.C2197c) r5, (long) r3, (boolean) r2)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x079a
            r1.f8417n = r8     // Catch:{ all -> 0x07f3 }
            goto L_0x079a
        L_0x0784:
            r0 = move-exception
            com.google.android.gms.measurement.internal.aw r3 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo14830d_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.f7495o     // Catch:{ all -> 0x07f3 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r2)     // Catch:{ all -> 0x07f3 }
            r3.mo14843a(r4, r2, r0)     // Catch:{ all -> 0x07f3 }
        L_0x079a:
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()     // Catch:{ all -> 0x07f3 }
            r0.mo14785w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x07f3 }
            r2 = 2
            boolean r0 = r0.mo14829a((int) r2)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x07c7
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()     // Catch:{ all -> 0x07f3 }
            java.lang.String r2 = "Event recorded"
            com.google.android.gms.measurement.internal.aw r3 = r1.f8413j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.p r3 = r3.mo14326k()     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = r3.mo14822a((com.google.android.gms.measurement.internal.C2197c) r5)     // Catch:{ all -> 0x07f3 }
            r0.mo14842a(r2, r3)     // Catch:{ all -> 0x07f3 }
        L_0x07c7:
            com.google.android.gms.measurement.internal.ew r0 = r25.mo14529d()
            r0.mo14786x()
            r25.m10934z()
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()
            java.lang.String r2 = "Background event processing time, ms"
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r22
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.mo14842a(r2, r3)
            return
        L_0x07f3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ew r2 = r25.mo14529d()
            r2.mo14786x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2254ec.m10926b(com.google.android.gms.measurement.internal.zzag, com.google.android.gms.measurement.internal.zzk):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:88|89) */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r1.f8413j.mo14235r().mo14830d_().mo14843a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C2295r.m11413a(r5), r6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x029e */
    @android.support.annotation.WorkerThread
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14537k() {
        /*
            r17 = this;
            r1 = r17
            r17.m10931w()
            r17.mo14536j()
            r0 = 1
            r1.f8423t = r0
            r2 = 0
            com.google.android.gms.measurement.internal.aw r3 = r1.f8413j     // Catch:{ all -> 0x02db }
            r3.mo14238u()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.aw r3 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.ct r3 = r3.mo14334x()     // Catch:{ all -> 0x02db }
            java.lang.Boolean r3 = r3.mo14438B()     // Catch:{ all -> 0x02db }
            if (r3 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()     // Catch:{ all -> 0x02db }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.mo14841a(r3)     // Catch:{ all -> 0x02db }
            r1.f8423t = r2
            r17.m10907A()
            return
        L_0x0032:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x02db }
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x02db }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.mo14841a(r3)     // Catch:{ all -> 0x02db }
            r1.f8423t = r2
            r17.m10907A()
            return
        L_0x004d:
            long r3 = r1.f8417n     // Catch:{ all -> 0x02db }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x005e
            r17.m10934z()     // Catch:{ all -> 0x02db }
            r1.f8423t = r2
            r17.m10907A()
            return
        L_0x005e:
            r17.m10931w()     // Catch:{ all -> 0x02db }
            java.util.List<java.lang.Long> r3 = r1.f8426w     // Catch:{ all -> 0x02db }
            if (r3 == 0) goto L_0x0067
            r3 = 1
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()     // Catch:{ all -> 0x02db }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.mo14841a(r3)     // Catch:{ all -> 0x02db }
            r1.f8423t = r2
            r17.m10907A()
            return
        L_0x007f:
            com.google.android.gms.measurement.internal.v r3 = r17.mo14527c()     // Catch:{ all -> 0x02db }
            boolean r3 = r3.mo14846f()     // Catch:{ all -> 0x02db }
            if (r3 != 0) goto L_0x00a1
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()     // Catch:{ all -> 0x02db }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo14841a(r3)     // Catch:{ all -> 0x02db }
            r17.m10934z()     // Catch:{ all -> 0x02db }
            r1.f8423t = r2
            r17.m10907A()
            return
        L_0x00a1:
            com.google.android.gms.measurement.internal.aw r3 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.common.util.e r3 = r3.mo14230m()     // Catch:{ all -> 0x02db }
            long r3 = r3.mo9996a()     // Catch:{ all -> 0x02db }
            long r7 = com.google.android.gms.measurement.internal.C2272et.m11154k()     // Catch:{ all -> 0x02db }
            r9 = 0
            long r7 = r3 - r7
            r9 = 0
            r1.m10920a((java.lang.String) r9, (long) r7)     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.aw r7 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo14318c()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.ag r7 = r7.f8044c     // Catch:{ all -> 0x02db }
            long r7 = r7.mo14265a()     // Catch:{ all -> 0x02db }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00e0
            com.google.android.gms.measurement.internal.aw r5 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.r r5 = r5.mo14235r()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.t r5 = r5.mo14837w()     // Catch:{ all -> 0x02db }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            r10 = 0
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x02db }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02db }
            r5.mo14842a(r6, r7)     // Catch:{ all -> 0x02db }
        L_0x00e0:
            com.google.android.gms.measurement.internal.ew r5 = r17.mo14529d()     // Catch:{ all -> 0x02db }
            java.lang.String r5 = r5.mo14788z()     // Catch:{ all -> 0x02db }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x02db }
            r7 = -1
            if (r6 != 0) goto L_0x02b2
            long r10 = r1.f8428y     // Catch:{ all -> 0x02db }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0100
            com.google.android.gms.measurement.internal.ew r6 = r17.mo14529d()     // Catch:{ all -> 0x02db }
            long r6 = r6.mo14752G()     // Catch:{ all -> 0x02db }
            r1.f8428y = r6     // Catch:{ all -> 0x02db }
        L_0x0100:
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.et r6 = r6.mo14317b()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C2284h.f8575o     // Catch:{ all -> 0x02db }
            int r6 = r6.mo14718b(r5, r7)     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.aw r7 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.et r7 = r7.mo14317b()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C2284h.f8576p     // Catch:{ all -> 0x02db }
            int r7 = r7.mo14718b(r5, r8)     // Catch:{ all -> 0x02db }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.ew r8 = r17.mo14529d()     // Catch:{ all -> 0x02db }
            java.util.List r6 = r8.mo14759a((java.lang.String) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x02db }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x02db }
            if (r7 != 0) goto L_0x02d5
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x02db }
        L_0x012e:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02db }
            if (r8 == 0) goto L_0x0149
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02db }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x02db }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x02db }
            com.google.android.gms.internal.measurement.bl r8 = (com.google.android.gms.internal.measurement.C1919bl) r8     // Catch:{ all -> 0x02db }
            java.lang.String r10 = r8.f7499s     // Catch:{ all -> 0x02db }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02db }
            if (r10 != 0) goto L_0x012e
            java.lang.String r7 = r8.f7499s     // Catch:{ all -> 0x02db }
            goto L_0x014a
        L_0x0149:
            r7 = r9
        L_0x014a:
            if (r7 == 0) goto L_0x0175
            r8 = 0
        L_0x014d:
            int r10 = r6.size()     // Catch:{ all -> 0x02db }
            if (r8 >= r10) goto L_0x0175
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x02db }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x02db }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x02db }
            com.google.android.gms.internal.measurement.bl r10 = (com.google.android.gms.internal.measurement.C1919bl) r10     // Catch:{ all -> 0x02db }
            java.lang.String r11 = r10.f7499s     // Catch:{ all -> 0x02db }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x02db }
            if (r11 != 0) goto L_0x0172
            java.lang.String r10 = r10.f7499s     // Catch:{ all -> 0x02db }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x02db }
            if (r10 != 0) goto L_0x0172
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x02db }
            goto L_0x0175
        L_0x0172:
            int r8 = r8 + 1
            goto L_0x014d
        L_0x0175:
            com.google.android.gms.internal.measurement.bk r7 = new com.google.android.gms.internal.measurement.bk     // Catch:{ all -> 0x02db }
            r7.<init>()     // Catch:{ all -> 0x02db }
            int r8 = r6.size()     // Catch:{ all -> 0x02db }
            com.google.android.gms.internal.measurement.bl[] r8 = new com.google.android.gms.internal.measurement.C1919bl[r8]     // Catch:{ all -> 0x02db }
            r7.f7464a = r8     // Catch:{ all -> 0x02db }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02db }
            int r10 = r6.size()     // Catch:{ all -> 0x02db }
            r8.<init>(r10)     // Catch:{ all -> 0x02db }
            boolean r10 = com.google.android.gms.measurement.internal.C2272et.m11155w()     // Catch:{ all -> 0x02db }
            if (r10 == 0) goto L_0x019f
            com.google.android.gms.measurement.internal.aw r10 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.et r10 = r10.mo14317b()     // Catch:{ all -> 0x02db }
            boolean r10 = r10.mo14720c(r5)     // Catch:{ all -> 0x02db }
            if (r10 == 0) goto L_0x019f
            r10 = 1
            goto L_0x01a0
        L_0x019f:
            r10 = 0
        L_0x01a0:
            r11 = 0
        L_0x01a1:
            com.google.android.gms.internal.measurement.bl[] r12 = r7.f7464a     // Catch:{ all -> 0x02db }
            int r12 = r12.length     // Catch:{ all -> 0x02db }
            if (r11 >= r12) goto L_0x01f9
            com.google.android.gms.internal.measurement.bl[] r12 = r7.f7464a     // Catch:{ all -> 0x02db }
            java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x02db }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x02db }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x02db }
            com.google.android.gms.internal.measurement.bl r13 = (com.google.android.gms.internal.measurement.C1919bl) r13     // Catch:{ all -> 0x02db }
            r12[r11] = r13     // Catch:{ all -> 0x02db }
            java.lang.Object r12 = r6.get(r11)     // Catch:{ all -> 0x02db }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x02db }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x02db }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x02db }
            r8.add(r12)     // Catch:{ all -> 0x02db }
            com.google.android.gms.internal.measurement.bl[] r12 = r7.f7464a     // Catch:{ all -> 0x02db }
            r12 = r12[r11]     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.aw r13 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.et r13 = r13.mo14317b()     // Catch:{ all -> 0x02db }
            long r13 = r13.mo14725f()     // Catch:{ all -> 0x02db }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x02db }
            r12.f7498r = r13     // Catch:{ all -> 0x02db }
            com.google.android.gms.internal.measurement.bl[] r12 = r7.f7464a     // Catch:{ all -> 0x02db }
            r12 = r12[r11]     // Catch:{ all -> 0x02db }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x02db }
            r12.f7484d = r13     // Catch:{ all -> 0x02db }
            com.google.android.gms.internal.measurement.bl[] r12 = r7.f7464a     // Catch:{ all -> 0x02db }
            r12 = r12[r11]     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.aw r13 = r1.f8413j     // Catch:{ all -> 0x02db }
            r13.mo14238u()     // Catch:{ all -> 0x02db }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02db }
            r12.f7506z = r13     // Catch:{ all -> 0x02db }
            if (r10 != 0) goto L_0x01f6
            com.google.android.gms.internal.measurement.bl[] r12 = r7.f7464a     // Catch:{ all -> 0x02db }
            r12 = r12[r11]     // Catch:{ all -> 0x02db }
            r12.f7472G = r9     // Catch:{ all -> 0x02db }
        L_0x01f6:
            int r11 = r11 + 1
            goto L_0x01a1
        L_0x01f9:
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.r r6 = r6.mo14235r()     // Catch:{ all -> 0x02db }
            r10 = 2
            boolean r6 = r6.mo14829a((int) r10)     // Catch:{ all -> 0x02db }
            if (r6 == 0) goto L_0x020e
            com.google.android.gms.measurement.internal.ei r6 = r17.mo14533g()     // Catch:{ all -> 0x02db }
            java.lang.String r9 = r6.mo14555b((com.google.android.gms.internal.measurement.C1918bk) r7)     // Catch:{ all -> 0x02db }
        L_0x020e:
            com.google.android.gms.measurement.internal.ei r6 = r17.mo14533g()     // Catch:{ all -> 0x02db }
            byte[] r14 = r6.mo14553a((com.google.android.gms.internal.measurement.C1918bk) r7)     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.h$a<java.lang.String> r6 = com.google.android.gms.measurement.internal.C2284h.f8585y     // Catch:{ all -> 0x02db }
            java.lang.Object r6 = r6.mo14804b()     // Catch:{ all -> 0x02db }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x02db }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x029e }
            r13.<init>(r6)     // Catch:{ MalformedURLException -> 0x029e }
            boolean r10 = r8.isEmpty()     // Catch:{ MalformedURLException -> 0x029e }
            r10 = r10 ^ r0
            com.google.android.gms.common.internal.C0926p.m1316b((boolean) r10)     // Catch:{ MalformedURLException -> 0x029e }
            java.util.List<java.lang.Long> r10 = r1.f8426w     // Catch:{ MalformedURLException -> 0x029e }
            if (r10 == 0) goto L_0x023f
            com.google.android.gms.measurement.internal.aw r8 = r1.f8413j     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.r r8 = r8.mo14235r()     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.t r8 = r8.mo14830d_()     // Catch:{ MalformedURLException -> 0x029e }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r8.mo14841a(r10)     // Catch:{ MalformedURLException -> 0x029e }
            goto L_0x0246
        L_0x023f:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x029e }
            r10.<init>(r8)     // Catch:{ MalformedURLException -> 0x029e }
            r1.f8426w = r10     // Catch:{ MalformedURLException -> 0x029e }
        L_0x0246:
            com.google.android.gms.measurement.internal.aw r8 = r1.f8413j     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.ad r8 = r8.mo14318c()     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.ag r8 = r8.f8045d     // Catch:{ MalformedURLException -> 0x029e }
            r8.mo14266a(r3)     // Catch:{ MalformedURLException -> 0x029e }
            java.lang.String r3 = "?"
            com.google.android.gms.internal.measurement.bl[] r4 = r7.f7464a     // Catch:{ MalformedURLException -> 0x029e }
            int r4 = r4.length     // Catch:{ MalformedURLException -> 0x029e }
            if (r4 <= 0) goto L_0x025e
            com.google.android.gms.internal.measurement.bl[] r3 = r7.f7464a     // Catch:{ MalformedURLException -> 0x029e }
            r3 = r3[r2]     // Catch:{ MalformedURLException -> 0x029e }
            java.lang.String r3 = r3.f7495o     // Catch:{ MalformedURLException -> 0x029e }
        L_0x025e:
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.r r4 = r4.mo14235r()     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14838x()     // Catch:{ MalformedURLException -> 0x029e }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x029e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x029e }
            r4.mo14844a(r7, r3, r8, r9)     // Catch:{ MalformedURLException -> 0x029e }
            r1.f8422s = r0     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.v r11 = r17.mo14527c()     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.ee r0 = new com.google.android.gms.measurement.internal.ee     // Catch:{ MalformedURLException -> 0x029e }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x029e }
            r11.mo14221d()     // Catch:{ MalformedURLException -> 0x029e }
            r11.mo14508k()     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.common.internal.C0926p.m1306a(r13)     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.common.internal.C0926p.m1306a(r14)     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.common.internal.C0926p.m1306a(r0)     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.ar r3 = r11.mo14234q()     // Catch:{ MalformedURLException -> 0x029e }
            com.google.android.gms.measurement.internal.aa r4 = new com.google.android.gms.measurement.internal.aa     // Catch:{ MalformedURLException -> 0x029e }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x029e }
            r3.mo14298b((java.lang.Runnable) r4)     // Catch:{ MalformedURLException -> 0x029e }
            goto L_0x02d5
        L_0x029e:
            com.google.android.gms.measurement.internal.aw r0 = r1.f8413j     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.r r0 = r0.mo14235r()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x02db }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r5)     // Catch:{ all -> 0x02db }
            r0.mo14843a(r3, r4, r6)     // Catch:{ all -> 0x02db }
            goto L_0x02d5
        L_0x02b2:
            r1.f8428y = r7     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.ew r0 = r17.mo14529d()     // Catch:{ all -> 0x02db }
            long r5 = com.google.android.gms.measurement.internal.C2272et.m11154k()     // Catch:{ all -> 0x02db }
            r7 = 0
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo14757a((long) r3)     // Catch:{ all -> 0x02db }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02db }
            if (r3 != 0) goto L_0x02d5
            com.google.android.gms.measurement.internal.ew r3 = r17.mo14529d()     // Catch:{ all -> 0x02db }
            com.google.android.gms.measurement.internal.en r0 = r3.mo14771b(r0)     // Catch:{ all -> 0x02db }
            if (r0 == 0) goto L_0x02d5
            r1.m10917a((com.google.android.gms.measurement.internal.C2266en) r0)     // Catch:{ all -> 0x02db }
        L_0x02d5:
            r1.f8423t = r2
            r17.m10907A()
            return
        L_0x02db:
            r0 = move-exception
            r1.f8423t = r2
            r17.m10907A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2254ec.mo14537k():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r5 = r1;
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0b19, code lost:
        if (r18 != r14) goto L_0x0b1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v74 android.database.Cursor) = (r3v69 android.database.Cursor), (r3v69 android.database.Cursor), (r3v69 android.database.Cursor), (r3v77 android.database.Cursor), (r3v77 android.database.Cursor), (r3v77 android.database.Cursor), (r3v77 android.database.Cursor), (r3v0 android.database.Cursor), (r3v0 android.database.Cursor) binds: [B:47:0x00e2, B:53:0x00ef, B:54:?, B:24:0x0080, B:30:0x008d, B:32:0x0091, B:33:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0276 A[SYNTHETIC, Splitter:B:132:0x0276] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x027d A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x028b A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03a1 A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a3 A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03a6 A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03a7 A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05b2 A[ADDED_TO_REGION, Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0675 A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x06f6 A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0849 A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0863 A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0883 A[Catch:{ IOException -> 0x022c, all -> 0x0dcc }] */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b3b A[Catch:{ all -> 0x0bdb }] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0b87 A[Catch:{ all -> 0x0bdb }] */
    /* JADX WARNING: Removed duplicated region for block: B:566:0x0dae  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0dc5 A[SYNTHETIC, Splitter:B:574:0x0dc5] */
    /* JADX WARNING: Removed duplicated region for block: B:613:0x0860 A[SYNTHETIC] */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m10920a(java.lang.String r53, long r54) {
        /*
            r52 = this;
            r1 = r52
            com.google.android.gms.measurement.internal.ew r2 = r52.mo14529d()
            r2.mo14782f()
            com.google.android.gms.measurement.internal.ec$a r2 = new com.google.android.gms.measurement.internal.ec$a     // Catch:{ all -> 0x0dcc }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.ew r4 = r52.mo14529d()     // Catch:{ all -> 0x0dcc }
            long r5 = r1.f8428y     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.common.internal.C0926p.m1306a(r2)     // Catch:{ all -> 0x0dcc }
            r4.mo14221d()     // Catch:{ all -> 0x0dcc }
            r4.mo14508k()     // Catch:{ all -> 0x0dcc }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r4.mo14787y()     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            if (r13 == 0) goto L_0x00a0
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x004b
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r54)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r12] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            goto L_0x0053
        L_0x0040:
            r0 = move-exception
            r5 = r1
            r8 = r3
            goto L_0x025c
        L_0x0045:
            r0 = move-exception
            r7 = r3
            r8 = r7
        L_0x0048:
            r3 = r0
            goto L_0x0263
        L_0x004b:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            java.lang.String r14 = java.lang.String.valueOf(r54)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
        L_0x0053:
            int r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x005a
            java.lang.String r14 = "rowid <= ? and "
            goto L_0x005c
        L_0x005a:
            java.lang.String r14 = ""
        L_0x005c:
            java.lang.String r16 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            int r7 = r16.length()     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            int r7 = r7 + 148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r3.append(r7)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            r3.append(r14)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r3.append(r7)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            android.database.Cursor r3 = r15.rawQuery(r3, r13)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0254, all -> 0x0040 }
            if (r7 != 0) goto L_0x008d
            if (r3 == 0) goto L_0x0279
            r3.close()     // Catch:{ all -> 0x0dcc }
            goto L_0x0279
        L_0x008d:
            java.lang.String r7 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0254, all -> 0x0040 }
            java.lang.String r13 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x009d, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x009d, all -> 0x0040 }
            r22 = r3
            r3 = r7
            r7 = r13
            goto L_0x00fa
        L_0x009d:
            r0 = move-exception
            r8 = r3
            goto L_0x0048
        L_0x00a0:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00b0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            r3[r12] = r7     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            goto L_0x00b5
        L_0x00b0:
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
        L_0x00b5:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00bc
            java.lang.String r7 = " and rowid <= ?"
            goto L_0x00be
        L_0x00bc:
            java.lang.String r7 = ""
        L_0x00be:
            java.lang.String r13 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            int r13 = r13.length()     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            int r13 = r13 + 84
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            r14.<init>(r13)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r13)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            r14.append(r7)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            java.lang.String r7 = " order by rowid limit 1;"
            r14.append(r7)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            java.lang.String r7 = r14.toString()     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            android.database.Cursor r3 = r15.rawQuery(r7, r3)     // Catch:{ SQLiteException -> 0x025f, all -> 0x0259 }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0254, all -> 0x0040 }
            if (r7 != 0) goto L_0x00ef
            if (r3 == 0) goto L_0x0279
            r3.close()     // Catch:{ all -> 0x0dcc }
            goto L_0x0279
        L_0x00ef:
            java.lang.String r13 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0254, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x0254, all -> 0x0040 }
            r22 = r3
            r7 = r13
            r3 = 0
        L_0x00fa:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x024e, all -> 0x0249 }
            java.lang.String r16 = "metadata"
            r13[r11] = r16     // Catch:{ SQLiteException -> 0x024e, all -> 0x0249 }
            java.lang.String r16 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x024e, all -> 0x0249 }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x024e, all -> 0x0249 }
            r8[r12] = r7     // Catch:{ SQLiteException -> 0x024e, all -> 0x0249 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r9 = r13
            r13 = r15
            r23 = r15
            r15 = r9
            r17 = r8
            android.database.Cursor r8 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x024e, all -> 0x0249 }
            boolean r9 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0245 }
            if (r9 != 0) goto L_0x013b
            com.google.android.gms.measurement.internal.r r5 = r4.mo14235r()     // Catch:{ SQLiteException -> 0x0245 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo14830d_()     // Catch:{ SQLiteException -> 0x0245 }
            java.lang.String r6 = "Raw event metadata record is missing. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x0245 }
            r5.mo14842a(r6, r7)     // Catch:{ SQLiteException -> 0x0245 }
            if (r8 == 0) goto L_0x0279
            r8.close()     // Catch:{ all -> 0x0dcc }
            goto L_0x0279
        L_0x013b:
            byte[] r9 = r8.getBlob(r11)     // Catch:{ SQLiteException -> 0x0245 }
            int r13 = r9.length     // Catch:{ SQLiteException -> 0x0245 }
            com.google.android.gms.internal.measurement.hv r9 = com.google.android.gms.internal.measurement.C2106hv.m10191a(r9, r11, r13)     // Catch:{ SQLiteException -> 0x0245 }
            com.google.android.gms.internal.measurement.bl r13 = new com.google.android.gms.internal.measurement.bl     // Catch:{ SQLiteException -> 0x0245 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0245 }
            r13.mo13498a((com.google.android.gms.internal.measurement.C2106hv) r9)     // Catch:{ IOException -> 0x022c }
            boolean r9 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0245 }
            if (r9 == 0) goto L_0x0163
            com.google.android.gms.measurement.internal.r r9 = r4.mo14235r()     // Catch:{ SQLiteException -> 0x0245 }
            com.google.android.gms.measurement.internal.t r9 = r9.mo14833i()     // Catch:{ SQLiteException -> 0x0245 }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x0245 }
            r9.mo14842a(r14, r15)     // Catch:{ SQLiteException -> 0x0245 }
        L_0x0163:
            r8.close()     // Catch:{ SQLiteException -> 0x0245 }
            r2.mo14541a(r13)     // Catch:{ SQLiteException -> 0x0245 }
            r13 = -1
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0183
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0245 }
            r14[r11] = r3     // Catch:{ SQLiteException -> 0x0245 }
            r14[r12] = r7     // Catch:{ SQLiteException -> 0x0245 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0245 }
            r14[r10] = r5     // Catch:{ SQLiteException -> 0x0245 }
            r16 = r9
            r17 = r14
            goto L_0x018f
        L_0x0183:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0245 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0245 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0245 }
            r16 = r5
            r17 = r6
        L_0x018f:
            java.lang.String r14 = "raw_events"
            r5 = 4
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0245 }
            java.lang.String r5 = "rowid"
            r15[r11] = r5     // Catch:{ SQLiteException -> 0x0245 }
            java.lang.String r5 = "name"
            r15[r12] = r5     // Catch:{ SQLiteException -> 0x0245 }
            java.lang.String r5 = "timestamp"
            r15[r10] = r5     // Catch:{ SQLiteException -> 0x0245 }
            java.lang.String r5 = "data"
            r6 = 3
            r15[r6] = r5     // Catch:{ SQLiteException -> 0x0245 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r23
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0245 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            if (r6 != 0) goto L_0x01d1
            com.google.android.gms.measurement.internal.r r6 = r4.mo14235r()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo14833i()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r6.mo14842a(r7, r8)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            if (r5 == 0) goto L_0x0279
            r5.close()     // Catch:{ all -> 0x0dcc }
            goto L_0x0279
        L_0x01d1:
            long r6 = r5.getLong(r11)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r8 = 3
            byte[] r9 = r5.getBlob(r8)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            int r8 = r9.length     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.internal.measurement.hv r8 = com.google.android.gms.internal.measurement.C2106hv.m10191a(r9, r11, r8)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.internal.measurement.bi r9 = new com.google.android.gms.internal.measurement.bi     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r9.mo13498a((com.google.android.gms.internal.measurement.C2106hv) r8)     // Catch:{ IOException -> 0x0204 }
            java.lang.String r8 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r9.f7454b = r8     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            long r13 = r5.getLong(r10)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r9.f7455c = r8     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            boolean r6 = r2.mo14542a(r6, r9)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            if (r6 != 0) goto L_0x0217
            if (r5 == 0) goto L_0x0279
            r5.close()     // Catch:{ all -> 0x0dcc }
            goto L_0x0279
        L_0x0204:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.r r7 = r4.mo14235r()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo14830d_()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            java.lang.String r8 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r7.mo14843a(r8, r9, r6)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
        L_0x0217:
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            if (r6 != 0) goto L_0x01d1
            if (r5 == 0) goto L_0x0279
            r5.close()     // Catch:{ all -> 0x0dcc }
            goto L_0x0279
        L_0x0223:
            r0 = move-exception
            r8 = r5
            goto L_0x0dc0
        L_0x0227:
            r0 = move-exception
            r7 = r3
            r8 = r5
            goto L_0x0048
        L_0x022c:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.r r6 = r4.mo14235r()     // Catch:{ SQLiteException -> 0x0245 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo14830d_()     // Catch:{ SQLiteException -> 0x0245 }
            java.lang.String r7 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x0245 }
            r6.mo14843a(r7, r9, r5)     // Catch:{ SQLiteException -> 0x0245 }
            if (r8 == 0) goto L_0x0279
            r8.close()     // Catch:{ all -> 0x0dcc }
            goto L_0x0279
        L_0x0245:
            r0 = move-exception
            r7 = r3
            goto L_0x0048
        L_0x0249:
            r0 = move-exception
            r5 = r1
            r8 = r22
            goto L_0x025c
        L_0x024e:
            r0 = move-exception
            r7 = r3
            r8 = r22
            goto L_0x0048
        L_0x0254:
            r0 = move-exception
            r8 = r3
            r7 = 0
            goto L_0x0048
        L_0x0259:
            r0 = move-exception
            r5 = r1
            r8 = 0
        L_0x025c:
            r1 = r0
            goto L_0x0dc3
        L_0x025f:
            r0 = move-exception
            r3 = r0
            r7 = 0
            r8 = 0
        L_0x0263:
            com.google.android.gms.measurement.internal.r r4 = r4.mo14235r()     // Catch:{ all -> 0x0dbf }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ all -> 0x0dbf }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r7)     // Catch:{ all -> 0x0dbf }
            r4.mo14843a(r5, r6, r3)     // Catch:{ all -> 0x0dbf }
            if (r8 == 0) goto L_0x0279
            r8.close()     // Catch:{ all -> 0x0dcc }
        L_0x0279:
            java.util.List<com.google.android.gms.internal.measurement.bi> r3 = r2.f8431c     // Catch:{ all -> 0x0dcc }
            if (r3 == 0) goto L_0x0288
            java.util.List<com.google.android.gms.internal.measurement.bi> r3 = r2.f8431c     // Catch:{ all -> 0x0dcc }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0dcc }
            if (r3 == 0) goto L_0x0286
            goto L_0x0288
        L_0x0286:
            r3 = 0
            goto L_0x0289
        L_0x0288:
            r3 = 1
        L_0x0289:
            if (r3 != 0) goto L_0x0dae
            com.google.android.gms.internal.measurement.bl r3 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.util.List<com.google.android.gms.internal.measurement.bi> r4 = r2.f8431c     // Catch:{ all -> 0x0dcc }
            int r4 = r4.size()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bi[] r4 = new com.google.android.gms.internal.measurement.C1916bi[r4]     // Catch:{ all -> 0x0dcc }
            r3.f7482b = r4     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.et r4 = r4.mo14317b()     // Catch:{ all -> 0x0dcc }
            java.lang.String r5 = r3.f7495o     // Catch:{ all -> 0x0dcc }
            boolean r4 = r4.mo14724e(r5)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.aw r5 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.et r5 = r5.mo14317b()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r6 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r6 = r6.f7495o     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C2284h.f8550ao     // Catch:{ all -> 0x0dcc }
            boolean r5 = r5.mo14723d(r6, r7)     // Catch:{ all -> 0x0dcc }
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
        L_0x02ba:
            java.util.List<com.google.android.gms.internal.measurement.bi> r7 = r2.f8431c     // Catch:{ all -> 0x0dcc }
            int r7 = r7.size()     // Catch:{ all -> 0x0dcc }
            r16 = 1
            if (r8 >= r7) goto L_0x0756
            java.util.List<com.google.android.gms.internal.measurement.bi> r7 = r2.f8431c     // Catch:{ all -> 0x0dcc }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bi r7 = (com.google.android.gms.internal.measurement.C1916bi) r7     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.aq r12 = r52.m10928s()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r11 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = r11.f7495o     // Catch:{ all -> 0x0dcc }
            r24 = r9
            java.lang.String r9 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            boolean r9 = r12.mo14283b(r11, r9)     // Catch:{ all -> 0x0dcc }
            if (r9 == 0) goto L_0x034f
            com.google.android.gms.measurement.internal.aw r9 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r9 = r9.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r9 = r9.mo14833i()     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.bl r12 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = r12.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r12)     // Catch:{ all -> 0x0dcc }
            r25 = r8
            com.google.android.gms.measurement.internal.aw r8 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.p r8 = r8.mo14326k()     // Catch:{ all -> 0x0dcc }
            r26 = r13
            java.lang.String r13 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = r8.mo14824a((java.lang.String) r13)     // Catch:{ all -> 0x0dcc }
            r9.mo14843a(r11, r12, r8)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.aq r8 = r52.m10928s()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r9 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = r9.f7495o     // Catch:{ all -> 0x0dcc }
            boolean r8 = r8.mo14290f(r9)     // Catch:{ all -> 0x0dcc }
            if (r8 != 0) goto L_0x0324
            com.google.android.gms.measurement.internal.aq r8 = r52.m10928s()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r9 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = r9.f7495o     // Catch:{ all -> 0x0dcc }
            boolean r8 = r8.mo14292g(r9)     // Catch:{ all -> 0x0dcc }
            if (r8 == 0) goto L_0x0322
            goto L_0x0324
        L_0x0322:
            r8 = 0
            goto L_0x0325
        L_0x0324:
            r8 = 1
        L_0x0325:
            if (r8 != 0) goto L_0x034a
            java.lang.String r8 = "_err"
            java.lang.String r9 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0dcc }
            if (r8 != 0) goto L_0x034a
            com.google.android.gms.measurement.internal.aw r8 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.el r16 = r8.mo14325j()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r8 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = r8.f7495o     // Catch:{ all -> 0x0dcc }
            r18 = 11
            java.lang.String r19 = "_ev"
            java.lang.String r7 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            r21 = 0
            r17 = r8
            r20 = r7
            r16.mo14570a((java.lang.String) r17, (int) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21)     // Catch:{ all -> 0x0dcc }
        L_0x034a:
            r9 = r24
            r13 = 3
            goto L_0x074e
        L_0x034f:
            r25 = r8
            r26 = r13
            com.google.android.gms.measurement.internal.aq r8 = r52.m10928s()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r9 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = r9.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            boolean r8 = r8.mo14285c(r9, r11)     // Catch:{ all -> 0x0dcc }
            if (r8 != 0) goto L_0x03ad
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r11)     // Catch:{ all -> 0x0dcc }
            int r12 = r11.hashCode()     // Catch:{ all -> 0x0dcc }
            r13 = 94660(0x171c4, float:1.32647E-40)
            if (r12 == r13) goto L_0x0393
            r13 = 95025(0x17331, float:1.33158E-40)
            if (r12 == r13) goto L_0x0389
            r13 = 95027(0x17333, float:1.33161E-40)
            if (r12 == r13) goto L_0x037f
            goto L_0x039d
        L_0x037f:
            java.lang.String r12 = "_ui"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dcc }
            if (r11 == 0) goto L_0x039d
            r11 = 1
            goto L_0x039e
        L_0x0389:
            java.lang.String r12 = "_ug"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dcc }
            if (r11 == 0) goto L_0x039d
            r11 = 2
            goto L_0x039e
        L_0x0393:
            java.lang.String r12 = "_in"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dcc }
            if (r11 == 0) goto L_0x039d
            r11 = 0
            goto L_0x039e
        L_0x039d:
            r11 = -1
        L_0x039e:
            switch(r11) {
                case 0: goto L_0x03a3;
                case 1: goto L_0x03a3;
                case 2: goto L_0x03a3;
                default: goto L_0x03a1;
            }     // Catch:{ all -> 0x0dcc }
        L_0x03a1:
            r11 = 0
            goto L_0x03a4
        L_0x03a3:
            r11 = 1
        L_0x03a4:
            if (r11 == 0) goto L_0x03a7
            goto L_0x03ad
        L_0x03a7:
            r37 = r14
            r39 = r24
            goto L_0x05a2
        L_0x03ad:
            com.google.android.gms.internal.measurement.bj[] r11 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            if (r11 != 0) goto L_0x03b6
            r11 = 0
            com.google.android.gms.internal.measurement.bj[] r12 = new com.google.android.gms.internal.measurement.C1917bj[r11]     // Catch:{ all -> 0x0dcc }
            r7.f7453a = r12     // Catch:{ all -> 0x0dcc }
        L_0x03b6:
            com.google.android.gms.internal.measurement.bj[] r11 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            int r12 = r11.length     // Catch:{ all -> 0x0dcc }
            r13 = 0
            r18 = 0
            r19 = 0
        L_0x03be:
            if (r13 >= r12) goto L_0x03f2
            r9 = r11[r13]     // Catch:{ all -> 0x0dcc }
            r28 = r11
            java.lang.String r11 = "_c"
            r29 = r12
            java.lang.String r12 = r9.f7459a     // Catch:{ all -> 0x0dcc }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dcc }
            if (r11 == 0) goto L_0x03d9
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dcc }
            r9.f7461c = r11     // Catch:{ all -> 0x0dcc }
            r18 = 1
            goto L_0x03eb
        L_0x03d9:
            java.lang.String r11 = "_r"
            java.lang.String r12 = r9.f7459a     // Catch:{ all -> 0x0dcc }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dcc }
            if (r11 == 0) goto L_0x03eb
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dcc }
            r9.f7461c = r11     // Catch:{ all -> 0x0dcc }
            r19 = 1
        L_0x03eb:
            int r13 = r13 + 1
            r11 = r28
            r12 = r29
            goto L_0x03be
        L_0x03f2:
            if (r18 != 0) goto L_0x0434
            if (r8 == 0) goto L_0x0434
            com.google.android.gms.measurement.internal.aw r9 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r9 = r9.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r9 = r9.mo14838x()     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.aw r12 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.p r12 = r12.mo14326k()     // Catch:{ all -> 0x0dcc }
            java.lang.String r13 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = r12.mo14824a((java.lang.String) r13)     // Catch:{ all -> 0x0dcc }
            r9.mo14842a(r11, r12)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r9 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r11 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            int r11 = r11.length     // Catch:{ all -> 0x0dcc }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r9 = (com.google.android.gms.internal.measurement.C1917bj[]) r9     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj r11 = new com.google.android.gms.internal.measurement.bj     // Catch:{ all -> 0x0dcc }
            r11.<init>()     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = "_c"
            r11.f7459a = r12     // Catch:{ all -> 0x0dcc }
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dcc }
            r11.f7461c = r12     // Catch:{ all -> 0x0dcc }
            int r12 = r9.length     // Catch:{ all -> 0x0dcc }
            r13 = 1
            int r12 = r12 - r13
            r9[r12] = r11     // Catch:{ all -> 0x0dcc }
            r7.f7453a = r9     // Catch:{ all -> 0x0dcc }
        L_0x0434:
            if (r19 != 0) goto L_0x0474
            com.google.android.gms.measurement.internal.aw r9 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r9 = r9.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r9 = r9.mo14838x()     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.aw r12 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.p r12 = r12.mo14326k()     // Catch:{ all -> 0x0dcc }
            java.lang.String r13 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = r12.mo14824a((java.lang.String) r13)     // Catch:{ all -> 0x0dcc }
            r9.mo14842a(r11, r12)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r9 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r11 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            int r11 = r11.length     // Catch:{ all -> 0x0dcc }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r9 = (com.google.android.gms.internal.measurement.C1917bj[]) r9     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj r11 = new com.google.android.gms.internal.measurement.bj     // Catch:{ all -> 0x0dcc }
            r11.<init>()     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = "_r"
            r11.f7459a = r12     // Catch:{ all -> 0x0dcc }
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dcc }
            r11.f7461c = r12     // Catch:{ all -> 0x0dcc }
            int r12 = r9.length     // Catch:{ all -> 0x0dcc }
            r13 = 1
            int r12 = r12 - r13
            r9[r12] = r11     // Catch:{ all -> 0x0dcc }
            r7.f7453a = r9     // Catch:{ all -> 0x0dcc }
        L_0x0474:
            com.google.android.gms.measurement.internal.ew r28 = r52.mo14529d()     // Catch:{ all -> 0x0dcc }
            long r29 = r52.m10932x()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r9 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = r9.f7495o     // Catch:{ all -> 0x0dcc }
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 1
            r31 = r9
            com.google.android.gms.measurement.internal.ex r9 = r28.mo14756a(r29, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0dcc }
            long r11 = r9.f8500e     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.aw r9 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.et r9 = r9.mo14317b()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r13 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r13 = r13.f7495o     // Catch:{ all -> 0x0dcc }
            int r9 = r9.mo14714a((java.lang.String) r13)     // Catch:{ all -> 0x0dcc }
            r37 = r14
            long r13 = (long) r9     // Catch:{ all -> 0x0dcc }
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x04df
            r9 = 0
        L_0x04a8:
            com.google.android.gms.internal.measurement.bj[] r11 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            int r11 = r11.length     // Catch:{ all -> 0x0dcc }
            if (r9 >= r11) goto L_0x04dc
            java.lang.String r11 = "_r"
            com.google.android.gms.internal.measurement.bj[] r12 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            r12 = r12[r9]     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = r12.f7459a     // Catch:{ all -> 0x0dcc }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dcc }
            if (r11 == 0) goto L_0x04d9
            com.google.android.gms.internal.measurement.bj[] r11 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            int r11 = r11.length     // Catch:{ all -> 0x0dcc }
            r12 = 1
            int r11 = r11 - r12
            com.google.android.gms.internal.measurement.bj[] r11 = new com.google.android.gms.internal.measurement.C1917bj[r11]     // Catch:{ all -> 0x0dcc }
            if (r9 <= 0) goto L_0x04ca
            com.google.android.gms.internal.measurement.bj[] r12 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            r13 = 0
            java.lang.System.arraycopy(r12, r13, r11, r13, r9)     // Catch:{ all -> 0x0dcc }
        L_0x04ca:
            int r12 = r11.length     // Catch:{ all -> 0x0dcc }
            if (r9 >= r12) goto L_0x04d6
            com.google.android.gms.internal.measurement.bj[] r12 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            int r13 = r9 + 1
            int r14 = r11.length     // Catch:{ all -> 0x0dcc }
            int r14 = r14 - r9
            java.lang.System.arraycopy(r12, r13, r11, r9, r14)     // Catch:{ all -> 0x0dcc }
        L_0x04d6:
            r7.f7453a = r11     // Catch:{ all -> 0x0dcc }
            goto L_0x04dc
        L_0x04d9:
            int r9 = r9 + 1
            goto L_0x04a8
        L_0x04dc:
            r9 = r24
            goto L_0x04e0
        L_0x04df:
            r9 = 1
        L_0x04e0:
            java.lang.String r11 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            boolean r11 = com.google.android.gms.measurement.internal.C2264el.m11025a((java.lang.String) r11)     // Catch:{ all -> 0x0dcc }
            if (r11 == 0) goto L_0x05a0
            if (r8 == 0) goto L_0x05a0
            com.google.android.gms.measurement.internal.ew r12 = r52.mo14529d()     // Catch:{ all -> 0x0dcc }
            long r13 = r52.m10932x()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r11 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r15 = r11.f7495o     // Catch:{ all -> 0x0dcc }
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            com.google.android.gms.measurement.internal.ex r11 = r12.mo14756a(r13, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0dcc }
            long r11 = r11.f8498c     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.aw r13 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.et r13 = r13.mo14317b()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r14 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r14 = r14.f7495o     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C2284h.f8582v     // Catch:{ all -> 0x0dcc }
            int r13 = r13.mo14718b(r14, r15)     // Catch:{ all -> 0x0dcc }
            long r13 = (long) r13     // Catch:{ all -> 0x0dcc }
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x05a0
            com.google.android.gms.measurement.internal.aw r11 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r11 = r11.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r11 = r11.mo14833i()     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.bl r13 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r13 = r13.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r13)     // Catch:{ all -> 0x0dcc }
            r11.mo14842a(r12, r13)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r11 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            int r12 = r11.length     // Catch:{ all -> 0x0dcc }
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0538:
            if (r13 >= r12) goto L_0x0562
            r39 = r9
            r9 = r11[r13]     // Catch:{ all -> 0x0dcc }
            r40 = r11
            java.lang.String r11 = "_c"
            r41 = r12
            java.lang.String r12 = r9.f7459a     // Catch:{ all -> 0x0dcc }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dcc }
            if (r11 == 0) goto L_0x054e
            r15 = r9
            goto L_0x0559
        L_0x054e:
            java.lang.String r11 = "_err"
            java.lang.String r9 = r9.f7459a     // Catch:{ all -> 0x0dcc }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0dcc }
            if (r9 == 0) goto L_0x0559
            r14 = 1
        L_0x0559:
            int r13 = r13 + 1
            r9 = r39
            r11 = r40
            r12 = r41
            goto L_0x0538
        L_0x0562:
            r39 = r9
            if (r14 == 0) goto L_0x0579
            if (r15 == 0) goto L_0x0579
            com.google.android.gms.internal.measurement.bj[] r9 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            r11 = 1
            com.google.android.gms.internal.measurement.bj[] r12 = new com.google.android.gms.internal.measurement.C1917bj[r11]     // Catch:{ all -> 0x0dcc }
            r11 = 0
            r12[r11] = r15     // Catch:{ all -> 0x0dcc }
            java.lang.Object[] r9 = com.google.android.gms.common.util.C0966b.m1461a((T[]) r9, (T[]) r12)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r9 = (com.google.android.gms.internal.measurement.C1917bj[]) r9     // Catch:{ all -> 0x0dcc }
            r7.f7453a = r9     // Catch:{ all -> 0x0dcc }
            goto L_0x05a2
        L_0x0579:
            if (r15 == 0) goto L_0x0588
            java.lang.String r9 = "_err"
            r15.f7459a = r9     // Catch:{ all -> 0x0dcc }
            r11 = 10
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0dcc }
            r15.f7461c = r9     // Catch:{ all -> 0x0dcc }
            goto L_0x05a2
        L_0x0588:
            com.google.android.gms.measurement.internal.aw r9 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r9 = r9.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r9 = r9.mo14830d_()     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.bl r12 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = r12.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r12)     // Catch:{ all -> 0x0dcc }
            r9.mo14842a(r11, r12)     // Catch:{ all -> 0x0dcc }
            goto L_0x05a2
        L_0x05a0:
            r39 = r9
        L_0x05a2:
            com.google.android.gms.measurement.internal.aw r9 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.et r9 = r9.mo14317b()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r11 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = r11.f7495o     // Catch:{ all -> 0x0dcc }
            boolean r9 = r9.mo14736m(r11)     // Catch:{ all -> 0x0dcc }
            if (r9 == 0) goto L_0x0662
            if (r8 == 0) goto L_0x0662
            com.google.android.gms.internal.measurement.bj[] r8 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            r9 = 0
            r11 = -1
            r12 = -1
        L_0x05b9:
            int r13 = r8.length     // Catch:{ all -> 0x0dcc }
            if (r9 >= r13) goto L_0x05da
            java.lang.String r13 = "value"
            r14 = r8[r9]     // Catch:{ all -> 0x0dcc }
            java.lang.String r14 = r14.f7459a     // Catch:{ all -> 0x0dcc }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0dcc }
            if (r13 == 0) goto L_0x05ca
            r11 = r9
            goto L_0x05d7
        L_0x05ca:
            java.lang.String r13 = "currency"
            r14 = r8[r9]     // Catch:{ all -> 0x0dcc }
            java.lang.String r14 = r14.f7459a     // Catch:{ all -> 0x0dcc }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0dcc }
            if (r13 == 0) goto L_0x05d7
            r12 = r9
        L_0x05d7:
            int r9 = r9 + 1
            goto L_0x05b9
        L_0x05da:
            r9 = -1
            if (r11 == r9) goto L_0x060a
            r9 = r8[r11]     // Catch:{ all -> 0x0dcc }
            java.lang.Long r9 = r9.f7461c     // Catch:{ all -> 0x0dcc }
            if (r9 != 0) goto L_0x060c
            r9 = r8[r11]     // Catch:{ all -> 0x0dcc }
            java.lang.Double r9 = r9.f7462d     // Catch:{ all -> 0x0dcc }
            if (r9 != 0) goto L_0x060c
            com.google.android.gms.measurement.internal.aw r9 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r9 = r9.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r9 = r9.mo14835k()     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = "Value must be specified with a numeric type."
            r9.mo14841a(r12)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r8 = m10921a((com.google.android.gms.internal.measurement.C1917bj[]) r8, (int) r11)     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = "_c"
            com.google.android.gms.internal.measurement.bj[] r8 = m10923a((com.google.android.gms.internal.measurement.C1917bj[]) r8, (java.lang.String) r9)     // Catch:{ all -> 0x0dcc }
            r9 = 18
            java.lang.String r11 = "value"
            com.google.android.gms.internal.measurement.bj[] r8 = m10922a(r8, r9, r11)     // Catch:{ all -> 0x0dcc }
        L_0x060a:
            r13 = 3
            goto L_0x065f
        L_0x060c:
            r9 = -1
            if (r12 != r9) goto L_0x0612
            r9 = 1
            r13 = 3
            goto L_0x063c
        L_0x0612:
            r9 = r8[r12]     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = r9.f7460b     // Catch:{ all -> 0x0dcc }
            if (r9 == 0) goto L_0x063a
            int r12 = r9.length()     // Catch:{ all -> 0x0dcc }
            r13 = 3
            if (r12 == r13) goto L_0x0620
            goto L_0x063b
        L_0x0620:
            r12 = 0
        L_0x0621:
            int r14 = r9.length()     // Catch:{ all -> 0x0dcc }
            if (r12 >= r14) goto L_0x0638
            int r14 = r9.codePointAt(r12)     // Catch:{ all -> 0x0dcc }
            boolean r15 = java.lang.Character.isLetter(r14)     // Catch:{ all -> 0x0dcc }
            if (r15 != 0) goto L_0x0632
            goto L_0x063b
        L_0x0632:
            int r14 = java.lang.Character.charCount(r14)     // Catch:{ all -> 0x0dcc }
            int r12 = r12 + r14
            goto L_0x0621
        L_0x0638:
            r9 = 0
            goto L_0x063c
        L_0x063a:
            r13 = 3
        L_0x063b:
            r9 = 1
        L_0x063c:
            if (r9 == 0) goto L_0x065f
            com.google.android.gms.measurement.internal.aw r9 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r9 = r9.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r9 = r9.mo14835k()     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r9.mo14841a(r12)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r8 = m10921a((com.google.android.gms.internal.measurement.C1917bj[]) r8, (int) r11)     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = "_c"
            com.google.android.gms.internal.measurement.bj[] r8 = m10923a((com.google.android.gms.internal.measurement.C1917bj[]) r8, (java.lang.String) r9)     // Catch:{ all -> 0x0dcc }
            r9 = 19
            java.lang.String r11 = "currency"
            com.google.android.gms.internal.measurement.bj[] r8 = m10922a(r8, r9, r11)     // Catch:{ all -> 0x0dcc }
        L_0x065f:
            r7.f7453a = r8     // Catch:{ all -> 0x0dcc }
            goto L_0x0663
        L_0x0662:
            r13 = 3
        L_0x0663:
            com.google.android.gms.measurement.internal.aw r8 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.et r8 = r8.mo14317b()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r9 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = r9.f7495o     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C2284h.f8549an     // Catch:{ all -> 0x0dcc }
            boolean r8 = r8.mo14723d(r9, r11)     // Catch:{ all -> 0x0dcc }
            if (r8 == 0) goto L_0x06e4
            java.lang.String r8 = "_e"
            java.lang.String r9 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0dcc }
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L_0x06af
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = "_fr"
            com.google.android.gms.internal.measurement.bj r8 = com.google.android.gms.measurement.internal.C2261ei.m10976a((com.google.android.gms.internal.measurement.C1916bi) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0dcc }
            if (r8 != 0) goto L_0x06e4
            if (r6 == 0) goto L_0x06ad
            java.lang.Long r8 = r6.f7455c     // Catch:{ all -> 0x0dcc }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0dcc }
            java.lang.Long r10 = r7.f7455c     // Catch:{ all -> 0x0dcc }
            long r14 = r10.longValue()     // Catch:{ all -> 0x0dcc }
            r10 = 0
            long r8 = r8 - r14
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0dcc }
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x06ad
            boolean r8 = r1.m10919a((com.google.android.gms.internal.measurement.C1916bi) r7, (com.google.android.gms.internal.measurement.C1916bi) r6)     // Catch:{ all -> 0x0dcc }
            if (r8 == 0) goto L_0x06ad
        L_0x06aa:
            r6 = 0
            r10 = 0
            goto L_0x06e4
        L_0x06ad:
            r10 = r7
            goto L_0x06e4
        L_0x06af:
            java.lang.String r8 = "_vs"
            java.lang.String r9 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0dcc }
            if (r8 == 0) goto L_0x06e4
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = "_et"
            com.google.android.gms.internal.measurement.bj r8 = com.google.android.gms.measurement.internal.C2261ei.m10976a((com.google.android.gms.internal.measurement.C1916bi) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0dcc }
            if (r8 != 0) goto L_0x06e4
            if (r10 == 0) goto L_0x06e3
            java.lang.Long r6 = r10.f7455c     // Catch:{ all -> 0x0dcc }
            long r8 = r6.longValue()     // Catch:{ all -> 0x0dcc }
            java.lang.Long r6 = r7.f7455c     // Catch:{ all -> 0x0dcc }
            long r14 = r6.longValue()     // Catch:{ all -> 0x0dcc }
            r6 = 0
            long r8 = r8 - r14
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0dcc }
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x06e3
            boolean r6 = r1.m10919a((com.google.android.gms.internal.measurement.C1916bi) r10, (com.google.android.gms.internal.measurement.C1916bi) r7)     // Catch:{ all -> 0x0dcc }
            if (r6 == 0) goto L_0x06e3
            goto L_0x06aa
        L_0x06e3:
            r6 = r7
        L_0x06e4:
            if (r4 == 0) goto L_0x0742
            if (r5 != 0) goto L_0x0742
            java.lang.String r8 = "_e"
            java.lang.String r9 = r7.f7454b     // Catch:{ all -> 0x0dcc }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0dcc }
            if (r8 == 0) goto L_0x0742
            com.google.android.gms.internal.measurement.bj[] r8 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            if (r8 == 0) goto L_0x072b
            com.google.android.gms.internal.measurement.bj[] r8 = r7.f7453a     // Catch:{ all -> 0x0dcc }
            int r8 = r8.length     // Catch:{ all -> 0x0dcc }
            if (r8 != 0) goto L_0x06fc
            goto L_0x072b
        L_0x06fc:
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = "_et"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2261ei.m10986b(r7, r8)     // Catch:{ all -> 0x0dcc }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0dcc }
            if (r8 != 0) goto L_0x0721
            com.google.android.gms.measurement.internal.aw r8 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r8 = r8.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r8 = r8.mo14833i()     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.bl r11 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = r11.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r11)     // Catch:{ all -> 0x0dcc }
            r8.mo14842a(r9, r11)     // Catch:{ all -> 0x0dcc }
            goto L_0x0742
        L_0x0721:
            long r8 = r8.longValue()     // Catch:{ all -> 0x0dcc }
            r11 = 0
            long r14 = r37 + r8
            r37 = r14
            goto L_0x0742
        L_0x072b:
            com.google.android.gms.measurement.internal.aw r8 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r8 = r8.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r8 = r8.mo14833i()     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.bl r11 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r11 = r11.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r11)     // Catch:{ all -> 0x0dcc }
            r8.mo14842a(r9, r11)     // Catch:{ all -> 0x0dcc }
        L_0x0742:
            com.google.android.gms.internal.measurement.bi[] r8 = r3.f7482b     // Catch:{ all -> 0x0dcc }
            int r9 = r26 + 1
            r8[r26] = r7     // Catch:{ all -> 0x0dcc }
            r26 = r9
            r14 = r37
            r9 = r39
        L_0x074e:
            int r8 = r25 + 1
            r13 = r26
            r11 = 0
            r12 = 1
            goto L_0x02ba
        L_0x0756:
            r24 = r9
            r26 = r13
            r37 = r14
            if (r5 == 0) goto L_0x07b7
            r13 = r26
            r14 = r37
            r5 = 0
        L_0x0763:
            if (r5 >= r13) goto L_0x07b4
            com.google.android.gms.internal.measurement.bi[] r6 = r3.f7482b     // Catch:{ all -> 0x0dcc }
            r6 = r6[r5]     // Catch:{ all -> 0x0dcc }
            java.lang.String r7 = "_e"
            java.lang.String r8 = r6.f7454b     // Catch:{ all -> 0x0dcc }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0dcc }
            if (r7 == 0) goto L_0x0790
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            java.lang.String r7 = "_fr"
            com.google.android.gms.internal.measurement.bj r7 = com.google.android.gms.measurement.internal.C2261ei.m10976a((com.google.android.gms.internal.measurement.C1916bi) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0dcc }
            if (r7 == 0) goto L_0x0790
            com.google.android.gms.internal.measurement.bi[] r6 = r3.f7482b     // Catch:{ all -> 0x0dcc }
            int r7 = r5 + 1
            com.google.android.gms.internal.measurement.bi[] r8 = r3.f7482b     // Catch:{ all -> 0x0dcc }
            int r9 = r13 - r5
            r10 = 1
            int r9 = r9 - r10
            java.lang.System.arraycopy(r6, r7, r8, r5, r9)     // Catch:{ all -> 0x0dcc }
            int r13 = r13 + -1
            int r5 = r5 + -1
            goto L_0x07b1
        L_0x0790:
            if (r4 == 0) goto L_0x07b1
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            java.lang.String r7 = "_et"
            com.google.android.gms.internal.measurement.bj r6 = com.google.android.gms.measurement.internal.C2261ei.m10976a((com.google.android.gms.internal.measurement.C1916bi) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0dcc }
            if (r6 == 0) goto L_0x07b1
            java.lang.Long r6 = r6.f7461c     // Catch:{ all -> 0x0dcc }
            if (r6 == 0) goto L_0x07b1
            long r7 = r6.longValue()     // Catch:{ all -> 0x0dcc }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x07b1
            long r6 = r6.longValue()     // Catch:{ all -> 0x0dcc }
            r8 = 0
            long r14 = r14 + r6
        L_0x07b1:
            r6 = 1
            int r5 = r5 + r6
            goto L_0x0763
        L_0x07b4:
            r37 = r14
            goto L_0x07b9
        L_0x07b7:
            r13 = r26
        L_0x07b9:
            java.util.List<com.google.android.gms.internal.measurement.bi> r5 = r2.f8431c     // Catch:{ all -> 0x0dcc }
            int r5 = r5.size()     // Catch:{ all -> 0x0dcc }
            if (r13 >= r5) goto L_0x07cb
            com.google.android.gms.internal.measurement.bi[] r5 = r3.f7482b     // Catch:{ all -> 0x0dcc }
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r13)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bi[] r5 = (com.google.android.gms.internal.measurement.C1916bi[]) r5     // Catch:{ all -> 0x0dcc }
            r3.f7482b = r5     // Catch:{ all -> 0x0dcc }
        L_0x07cb:
            if (r4 == 0) goto L_0x089b
            com.google.android.gms.measurement.internal.ew r4 = r52.mo14529d()     // Catch:{ all -> 0x0dcc }
            java.lang.String r5 = r3.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.String r6 = "_lte"
            com.google.android.gms.measurement.internal.ek r4 = r4.mo14775c(r5, r6)     // Catch:{ all -> 0x0dcc }
            if (r4 == 0) goto L_0x0807
            java.lang.Object r5 = r4.f8446e     // Catch:{ all -> 0x0dcc }
            if (r5 != 0) goto L_0x07e0
            goto L_0x0807
        L_0x07e0:
            com.google.android.gms.measurement.internal.ek r5 = new com.google.android.gms.measurement.internal.ek     // Catch:{ all -> 0x0dcc }
            java.lang.String r7 = r3.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = "auto"
            java.lang.String r9 = "_lte"
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.common.util.e r6 = r6.mo14230m()     // Catch:{ all -> 0x0dcc }
            long r10 = r6.mo9996a()     // Catch:{ all -> 0x0dcc }
            java.lang.Object r4 = r4.f8446e     // Catch:{ all -> 0x0dcc }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0dcc }
            long r12 = r4.longValue()     // Catch:{ all -> 0x0dcc }
            r4 = 0
            long r12 = r12 + r37
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0dcc }
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0dcc }
            r4 = r5
            goto L_0x0824
        L_0x0807:
            com.google.android.gms.measurement.internal.ek r4 = new com.google.android.gms.measurement.internal.ek     // Catch:{ all -> 0x0dcc }
            java.lang.String r5 = r3.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.String r27 = "auto"
            java.lang.String r28 = "_lte"
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.common.util.e r6 = r6.mo14230m()     // Catch:{ all -> 0x0dcc }
            long r29 = r6.mo9996a()     // Catch:{ all -> 0x0dcc }
            java.lang.Long r31 = java.lang.Long.valueOf(r37)     // Catch:{ all -> 0x0dcc }
            r25 = r4
            r26 = r5
            r25.<init>(r26, r27, r28, r29, r31)     // Catch:{ all -> 0x0dcc }
        L_0x0824:
            com.google.android.gms.internal.measurement.bo r5 = new com.google.android.gms.internal.measurement.bo     // Catch:{ all -> 0x0dcc }
            r5.<init>()     // Catch:{ all -> 0x0dcc }
            java.lang.String r6 = "_lte"
            r5.f7516b = r6     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.common.util.e r6 = r6.mo14230m()     // Catch:{ all -> 0x0dcc }
            long r6 = r6.mo9996a()     // Catch:{ all -> 0x0dcc }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0dcc }
            r5.f7515a = r6     // Catch:{ all -> 0x0dcc }
            java.lang.Object r6 = r4.f8446e     // Catch:{ all -> 0x0dcc }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0dcc }
            r5.f7518d = r6     // Catch:{ all -> 0x0dcc }
            r6 = 0
        L_0x0844:
            com.google.android.gms.internal.measurement.bo[] r7 = r3.f7483c     // Catch:{ all -> 0x0dcc }
            int r7 = r7.length     // Catch:{ all -> 0x0dcc }
            if (r6 >= r7) goto L_0x0860
            java.lang.String r7 = "_lte"
            com.google.android.gms.internal.measurement.bo[] r8 = r3.f7483c     // Catch:{ all -> 0x0dcc }
            r8 = r8[r6]     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = r8.f7516b     // Catch:{ all -> 0x0dcc }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0dcc }
            if (r7 == 0) goto L_0x085d
            com.google.android.gms.internal.measurement.bo[] r7 = r3.f7483c     // Catch:{ all -> 0x0dcc }
            r7[r6] = r5     // Catch:{ all -> 0x0dcc }
            r6 = 1
            goto L_0x0861
        L_0x085d:
            int r6 = r6 + 1
            goto L_0x0844
        L_0x0860:
            r6 = 0
        L_0x0861:
            if (r6 != 0) goto L_0x087d
            com.google.android.gms.internal.measurement.bo[] r6 = r3.f7483c     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bo[] r7 = r3.f7483c     // Catch:{ all -> 0x0dcc }
            int r7 = r7.length     // Catch:{ all -> 0x0dcc }
            r8 = 1
            int r7 = r7 + r8
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bo[] r6 = (com.google.android.gms.internal.measurement.C1922bo[]) r6     // Catch:{ all -> 0x0dcc }
            r3.f7483c = r6     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bo[] r6 = r3.f7483c     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r7 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bo[] r7 = r7.f7483c     // Catch:{ all -> 0x0dcc }
            int r7 = r7.length     // Catch:{ all -> 0x0dcc }
            r8 = 1
            int r7 = r7 - r8
            r6[r7] = r5     // Catch:{ all -> 0x0dcc }
        L_0x087d:
            r5 = 0
            int r7 = (r37 > r5 ? 1 : (r37 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x089b
            com.google.android.gms.measurement.internal.ew r5 = r52.mo14529d()     // Catch:{ all -> 0x0dcc }
            r5.mo14768a((com.google.android.gms.measurement.internal.C2263ek) r4)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.aw r5 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r5 = r5.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r5 = r5.mo14837w()     // Catch:{ all -> 0x0dcc }
            java.lang.String r6 = "Updated lifetime engagement user property with value. Value"
            java.lang.Object r4 = r4.f8446e     // Catch:{ all -> 0x0dcc }
            r5.mo14842a(r6, r4)     // Catch:{ all -> 0x0dcc }
        L_0x089b:
            java.lang.String r4 = r3.f7495o     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bo[] r5 = r3.f7483c     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bi[] r6 = r3.f7482b     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r4)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.eq r7 = r52.mo14531e()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bg[] r4 = r7.mo14711a((java.lang.String) r4, (com.google.android.gms.internal.measurement.C1916bi[]) r6, (com.google.android.gms.internal.measurement.C1922bo[]) r5)     // Catch:{ all -> 0x0dcc }
            r3.f7466A = r4     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.aw r4 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.et r4 = r4.mo14317b()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r5 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r5 = r5.f7495o     // Catch:{ all -> 0x0dcc }
            boolean r4 = r4.mo14722d(r5)     // Catch:{ all -> 0x0dcc }
            if (r4 == 0) goto L_0x0be1
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0bdb }
            r4.<init>()     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bi[] r5 = r3.f7482b     // Catch:{ all -> 0x0bdb }
            int r5 = r5.length     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bi[] r5 = new com.google.android.gms.internal.measurement.C1916bi[r5]     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.measurement.internal.el r6 = r6.mo14325j()     // Catch:{ all -> 0x0bdb }
            java.security.SecureRandom r6 = r6.mo14582h()     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bi[] r7 = r3.f7482b     // Catch:{ all -> 0x0bdb }
            int r8 = r7.length     // Catch:{ all -> 0x0bdb }
            r9 = 0
            r10 = 0
        L_0x08d7:
            if (r9 >= r8) goto L_0x0ba9
            r11 = r7[r9]     // Catch:{ all -> 0x0bdb }
            java.lang.String r12 = r11.f7454b     // Catch:{ all -> 0x0bdb }
            java.lang.String r13 = "_ep"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0bdb }
            if (r12 == 0) goto L_0x0962
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = "_en"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2261ei.m10986b(r11, r12)     // Catch:{ all -> 0x0dcc }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0dcc }
            java.lang.Object r13 = r4.get(r12)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.d r13 = (com.google.android.gms.measurement.internal.C2224d) r13     // Catch:{ all -> 0x0dcc }
            if (r13 != 0) goto L_0x0907
            com.google.android.gms.measurement.internal.ew r13 = r52.mo14529d()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r14 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r14 = r14.f7495o     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.d r13 = r13.mo14755a((java.lang.String) r14, (java.lang.String) r12)     // Catch:{ all -> 0x0dcc }
            r4.put(r12, r13)     // Catch:{ all -> 0x0dcc }
        L_0x0907:
            java.lang.Long r12 = r13.f8326h     // Catch:{ all -> 0x0dcc }
            if (r12 != 0) goto L_0x0954
            java.lang.Long r12 = r13.f8327i     // Catch:{ all -> 0x0dcc }
            long r14 = r12.longValue()     // Catch:{ all -> 0x0dcc }
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x0924
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r12 = r11.f7453a     // Catch:{ all -> 0x0dcc }
            java.lang.String r14 = "_sr"
            java.lang.Long r15 = r13.f8327i     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r12 = com.google.android.gms.measurement.internal.C2261ei.m10985a((com.google.android.gms.internal.measurement.C1917bj[]) r12, (java.lang.String) r14, (java.lang.Object) r15)     // Catch:{ all -> 0x0dcc }
            r11.f7453a = r12     // Catch:{ all -> 0x0dcc }
        L_0x0924:
            java.lang.Boolean r12 = r13.f8328j     // Catch:{ all -> 0x0dcc }
            if (r12 == 0) goto L_0x0941
            java.lang.Boolean r12 = r13.f8328j     // Catch:{ all -> 0x0dcc }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0dcc }
            if (r12 == 0) goto L_0x0941
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r12 = r11.f7453a     // Catch:{ all -> 0x0dcc }
            java.lang.String r13 = "_efs"
            java.lang.Long r14 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r12 = com.google.android.gms.measurement.internal.C2261ei.m10985a((com.google.android.gms.internal.measurement.C1917bj[]) r12, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x0dcc }
            r11.f7453a = r12     // Catch:{ all -> 0x0dcc }
        L_0x0941:
            int r12 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0dcc }
            r50 = r2
            r44 = r3
            r49 = r6
            r42 = r7
            r43 = r8
            r45 = r9
            r10 = r12
            goto L_0x0b99
        L_0x0954:
            r50 = r2
            r44 = r3
            r49 = r6
            r42 = r7
            r43 = r8
            r45 = r9
            goto L_0x0b99
        L_0x0962:
            com.google.android.gms.measurement.internal.aq r12 = r52.m10928s()     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bl r13 = r2.f8429a     // Catch:{ all -> 0x0bdb }
            java.lang.String r13 = r13.f7495o     // Catch:{ all -> 0x0bdb }
            long r12 = r12.mo14288e(r13)     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.measurement.internal.aw r14 = r1.f8413j     // Catch:{ all -> 0x0bdb }
            r14.mo14325j()     // Catch:{ all -> 0x0bdb }
            java.lang.Long r14 = r11.f7455c     // Catch:{ all -> 0x0bdb }
            long r14 = r14.longValue()     // Catch:{ all -> 0x0bdb }
            long r14 = com.google.android.gms.measurement.internal.C2264el.m11017a((long) r14, (long) r12)     // Catch:{ all -> 0x0bdb }
            r42 = r7
            java.lang.String r7 = "_dbg"
            r43 = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0bdb }
            boolean r18 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0bdb }
            if (r18 != 0) goto L_0x09d3
            if (r8 != 0) goto L_0x0990
            goto L_0x09d3
        L_0x0990:
            r44 = r3
            com.google.android.gms.internal.measurement.bj[] r3 = r11.f7453a     // Catch:{ all -> 0x0dcc }
            r45 = r9
            int r9 = r3.length     // Catch:{ all -> 0x0dcc }
            r46 = r12
            r12 = 0
        L_0x099a:
            if (r12 >= r9) goto L_0x09d9
            r13 = r3[r12]     // Catch:{ all -> 0x0dcc }
            r48 = r3
            java.lang.String r3 = r13.f7459a     // Catch:{ all -> 0x0dcc }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0dcc }
            if (r3 == 0) goto L_0x09ce
            boolean r3 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x0dcc }
            if (r3 == 0) goto L_0x09b4
            java.lang.Long r3 = r13.f7461c     // Catch:{ all -> 0x0dcc }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0dcc }
            if (r3 != 0) goto L_0x09cc
        L_0x09b4:
            boolean r3 = r8 instanceof java.lang.String     // Catch:{ all -> 0x0dcc }
            if (r3 == 0) goto L_0x09c0
            java.lang.String r3 = r13.f7460b     // Catch:{ all -> 0x0dcc }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0dcc }
            if (r3 != 0) goto L_0x09cc
        L_0x09c0:
            boolean r3 = r8 instanceof java.lang.Double     // Catch:{ all -> 0x0dcc }
            if (r3 == 0) goto L_0x09d9
            java.lang.Double r3 = r13.f7462d     // Catch:{ all -> 0x0dcc }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0dcc }
            if (r3 == 0) goto L_0x09d9
        L_0x09cc:
            r3 = 1
            goto L_0x09da
        L_0x09ce:
            int r12 = r12 + 1
            r3 = r48
            goto L_0x099a
        L_0x09d3:
            r44 = r3
            r45 = r9
            r46 = r12
        L_0x09d9:
            r3 = 0
        L_0x09da:
            if (r3 != 0) goto L_0x09eb
            com.google.android.gms.measurement.internal.aq r3 = r52.m10928s()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r7 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r7 = r7.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = r11.f7454b     // Catch:{ all -> 0x0dcc }
            int r12 = r3.mo14286d(r7, r8)     // Catch:{ all -> 0x0dcc }
            goto L_0x09ec
        L_0x09eb:
            r12 = 1
        L_0x09ec:
            if (r12 > 0) goto L_0x0a0e
            com.google.android.gms.measurement.internal.aw r3 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r3 = r3.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r3 = r3.mo14833i()     // Catch:{ all -> 0x0dcc }
            java.lang.String r7 = "Sample rate must be positive. event, rate"
            java.lang.String r8 = r11.f7454b     // Catch:{ all -> 0x0dcc }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0dcc }
            r3.mo14843a(r7, r8, r9)     // Catch:{ all -> 0x0dcc }
            int r3 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0dcc }
            r50 = r2
            r10 = r3
            r49 = r6
            goto L_0x0b99
        L_0x0a0e:
            java.lang.String r3 = r11.f7454b     // Catch:{ all -> 0x0bdb }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.measurement.internal.d r3 = (com.google.android.gms.measurement.internal.C2224d) r3     // Catch:{ all -> 0x0bdb }
            if (r3 != 0) goto L_0x0a62
            com.google.android.gms.measurement.internal.ew r3 = r52.mo14529d()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r7 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r7 = r7.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = r11.f7454b     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.d r3 = r3.mo14755a((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0dcc }
            if (r3 != 0) goto L_0x0a62
            com.google.android.gms.measurement.internal.aw r3 = r1.f8413j     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.r r3 = r3.mo14235r()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.t r3 = r3.mo14833i()     // Catch:{ all -> 0x0dcc }
            java.lang.String r7 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.bl r8 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = r8.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = r11.f7454b     // Catch:{ all -> 0x0dcc }
            r3.mo14843a(r7, r8, r9)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.d r3 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bl r7 = r2.f8429a     // Catch:{ all -> 0x0dcc }
            java.lang.String r7 = r7.f7495o     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = r11.f7454b     // Catch:{ all -> 0x0dcc }
            r28 = 1
            r30 = 1
            java.lang.Long r9 = r11.f7455c     // Catch:{ all -> 0x0dcc }
            long r32 = r9.longValue()     // Catch:{ all -> 0x0dcc }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r25 = r3
            r26 = r7
            r27 = r8
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0dcc }
        L_0x0a62:
            r52.mo14533g()     // Catch:{ all -> 0x0bdb }
            java.lang.String r7 = "_eid"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2261ei.m10986b(r11, r7)     // Catch:{ all -> 0x0bdb }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0bdb }
            if (r7 == 0) goto L_0x0a71
            r8 = 1
            goto L_0x0a72
        L_0x0a71:
            r8 = 0
        L_0x0a72:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0bdb }
            r9 = 1
            if (r12 != r9) goto L_0x0aa0
            int r7 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0dcc }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0dcc }
            if (r8 == 0) goto L_0x0a99
            java.lang.Long r8 = r3.f8326h     // Catch:{ all -> 0x0dcc }
            if (r8 != 0) goto L_0x0a8f
            java.lang.Long r8 = r3.f8327i     // Catch:{ all -> 0x0dcc }
            if (r8 != 0) goto L_0x0a8f
            java.lang.Boolean r8 = r3.f8328j     // Catch:{ all -> 0x0dcc }
            if (r8 == 0) goto L_0x0a99
        L_0x0a8f:
            r8 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo14459a(r8, r8, r8)     // Catch:{ all -> 0x0dcc }
            java.lang.String r8 = r11.f7454b     // Catch:{ all -> 0x0dcc }
            r4.put(r8, r3)     // Catch:{ all -> 0x0dcc }
        L_0x0a99:
            r50 = r2
            r49 = r6
            r10 = r7
            goto L_0x0b99
        L_0x0aa0:
            int r9 = r6.nextInt(r12)     // Catch:{ all -> 0x0bdb }
            if (r9 != 0) goto L_0x0ae1
            r52.mo14533g()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r7 = r11.f7453a     // Catch:{ all -> 0x0dcc }
            java.lang.String r9 = "_sr"
            long r12 = (long) r12     // Catch:{ all -> 0x0dcc }
            r49 = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.internal.measurement.bj[] r6 = com.google.android.gms.measurement.internal.C2261ei.m10985a((com.google.android.gms.internal.measurement.C1917bj[]) r7, (java.lang.String) r9, (java.lang.Object) r6)     // Catch:{ all -> 0x0dcc }
            r11.f7453a = r6     // Catch:{ all -> 0x0dcc }
            int r6 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0dcc }
            boolean r7 = r8.booleanValue()     // Catch:{ all -> 0x0dcc }
            if (r7 == 0) goto L_0x0acd
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0dcc }
            r8 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo14459a(r8, r7, r8)     // Catch:{ all -> 0x0dcc }
        L_0x0acd:
            java.lang.String r7 = r11.f7454b     // Catch:{ all -> 0x0dcc }
            java.lang.Long r8 = r11.f7455c     // Catch:{ all -> 0x0dcc }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0dcc }
            com.google.android.gms.measurement.internal.d r3 = r3.mo14458a(r8, r14)     // Catch:{ all -> 0x0dcc }
            r4.put(r7, r3)     // Catch:{ all -> 0x0dcc }
            r50 = r2
            r10 = r6
            goto L_0x0b99
        L_0x0ae1:
            r49 = r6
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.measurement.internal.et r6 = r6.mo14317b()     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bl r9 = r2.f8429a     // Catch:{ all -> 0x0bdb }
            java.lang.String r9 = r9.f7495o     // Catch:{ all -> 0x0bdb }
            boolean r6 = r6.mo14738o(r9)     // Catch:{ all -> 0x0bdb }
            if (r6 == 0) goto L_0x0b1f
            java.lang.Long r6 = r3.f8325g     // Catch:{ all -> 0x0bdb }
            if (r6 == 0) goto L_0x0b02
            java.lang.Long r6 = r3.f8325g     // Catch:{ all -> 0x0dcc }
            long r18 = r6.longValue()     // Catch:{ all -> 0x0dcc }
            r50 = r2
            r51 = r7
            goto L_0x0b17
        L_0x0b02:
            com.google.android.gms.measurement.internal.aw r6 = r1.f8413j     // Catch:{ all -> 0x0bdb }
            r6.mo14325j()     // Catch:{ all -> 0x0bdb }
            java.lang.Long r6 = r11.f7456d     // Catch:{ all -> 0x0bdb }
            r50 = r2
            long r1 = r6.longValue()     // Catch:{ all -> 0x0bdb }
            r51 = r7
            r6 = r46
            long r18 = com.google.android.gms.measurement.internal.C2264el.m11017a((long) r1, (long) r6)     // Catch:{ all -> 0x0bdb }
        L_0x0b17:
            int r1 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0b1d
        L_0x0b1b:
            r1 = 1
            goto L_0x0b39
        L_0x0b1d:
            r1 = 0
            goto L_0x0b39
        L_0x0b1f:
            r50 = r2
            r51 = r7
            long r1 = r3.f8324f     // Catch:{ all -> 0x0bdb }
            java.lang.Long r6 = r11.f7455c     // Catch:{ all -> 0x0bdb }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0bdb }
            r9 = 0
            long r6 = r6 - r1
            long r1 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0bdb }
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x0b1d
            goto L_0x0b1b
        L_0x0b39:
            if (r1 == 0) goto L_0x0b87
            r52.mo14533g()     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bj[] r1 = r11.f7453a     // Catch:{ all -> 0x0bdb }
            java.lang.String r2 = "_efs"
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bj[] r1 = com.google.android.gms.measurement.internal.C2261ei.m10985a((com.google.android.gms.internal.measurement.C1917bj[]) r1, (java.lang.String) r2, (java.lang.Object) r6)     // Catch:{ all -> 0x0bdb }
            r11.f7453a = r1     // Catch:{ all -> 0x0bdb }
            r52.mo14533g()     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bj[] r1 = r11.f7453a     // Catch:{ all -> 0x0bdb }
            java.lang.String r2 = "_sr"
            long r6 = (long) r12     // Catch:{ all -> 0x0bdb }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bj[] r1 = com.google.android.gms.measurement.internal.C2261ei.m10985a((com.google.android.gms.internal.measurement.C1917bj[]) r1, (java.lang.String) r2, (java.lang.Object) r9)     // Catch:{ all -> 0x0bdb }
            r11.f7453a = r1     // Catch:{ all -> 0x0bdb }
            int r1 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0bdb }
            boolean r2 = r8.booleanValue()     // Catch:{ all -> 0x0bdb }
            if (r2 == 0) goto L_0x0b76
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0bdb }
            r6 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0bdb }
            r6 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo14459a(r6, r2, r7)     // Catch:{ all -> 0x0bdb }
        L_0x0b76:
            java.lang.String r2 = r11.f7454b     // Catch:{ all -> 0x0bdb }
            java.lang.Long r6 = r11.f7455c     // Catch:{ all -> 0x0bdb }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.measurement.internal.d r3 = r3.mo14458a(r6, r14)     // Catch:{ all -> 0x0bdb }
            r4.put(r2, r3)     // Catch:{ all -> 0x0bdb }
            r10 = r1
            goto L_0x0b99
        L_0x0b87:
            boolean r1 = r8.booleanValue()     // Catch:{ all -> 0x0bdb }
            if (r1 == 0) goto L_0x0b99
            java.lang.String r1 = r11.f7454b     // Catch:{ all -> 0x0bdb }
            r7 = r51
            r2 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo14459a(r7, r2, r2)     // Catch:{ all -> 0x0bdb }
            r4.put(r1, r3)     // Catch:{ all -> 0x0bdb }
        L_0x0b99:
            int r9 = r45 + 1
            r7 = r42
            r8 = r43
            r3 = r44
            r6 = r49
            r2 = r50
            r1 = r52
            goto L_0x08d7
        L_0x0ba9:
            r50 = r2
            r1 = r3
            com.google.android.gms.internal.measurement.bi[] r2 = r1.f7482b     // Catch:{ all -> 0x0bdb }
            int r2 = r2.length     // Catch:{ all -> 0x0bdb }
            if (r10 >= r2) goto L_0x0bb9
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r10)     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.internal.measurement.bi[] r2 = (com.google.android.gms.internal.measurement.C1916bi[]) r2     // Catch:{ all -> 0x0bdb }
            r1.f7482b = r2     // Catch:{ all -> 0x0bdb }
        L_0x0bb9:
            java.util.Set r2 = r4.entrySet()     // Catch:{ all -> 0x0bdb }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0bdb }
        L_0x0bc1:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0bdb }
            if (r3 == 0) goto L_0x0be4
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0bdb }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.measurement.internal.ew r4 = r52.mo14529d()     // Catch:{ all -> 0x0bdb }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0bdb }
            com.google.android.gms.measurement.internal.d r3 = (com.google.android.gms.measurement.internal.C2224d) r3     // Catch:{ all -> 0x0bdb }
            r4.mo14762a((com.google.android.gms.measurement.internal.C2224d) r3)     // Catch:{ all -> 0x0bdb }
            goto L_0x0bc1
        L_0x0bdb:
            r0 = move-exception
            r1 = r0
            r5 = r52
            goto L_0x0dcf
        L_0x0be1:
            r50 = r2
            r1 = r3
        L_0x0be4:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0daa }
            r1.f7485e = r2     // Catch:{ all -> 0x0daa }
            r2 = -9223372036854775808
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0daa }
            r1.f7486f = r2     // Catch:{ all -> 0x0daa }
            r2 = 0
        L_0x0bf8:
            com.google.android.gms.internal.measurement.bi[] r3 = r1.f7482b     // Catch:{ all -> 0x0daa }
            int r3 = r3.length     // Catch:{ all -> 0x0daa }
            if (r2 >= r3) goto L_0x0c2c
            com.google.android.gms.internal.measurement.bi[] r3 = r1.f7482b     // Catch:{ all -> 0x0bdb }
            r3 = r3[r2]     // Catch:{ all -> 0x0bdb }
            java.lang.Long r4 = r3.f7455c     // Catch:{ all -> 0x0bdb }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0bdb }
            java.lang.Long r6 = r1.f7485e     // Catch:{ all -> 0x0bdb }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0bdb }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0c15
            java.lang.Long r4 = r3.f7455c     // Catch:{ all -> 0x0bdb }
            r1.f7485e = r4     // Catch:{ all -> 0x0bdb }
        L_0x0c15:
            java.lang.Long r4 = r3.f7455c     // Catch:{ all -> 0x0bdb }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0bdb }
            java.lang.Long r6 = r1.f7486f     // Catch:{ all -> 0x0bdb }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0bdb }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0c29
            java.lang.Long r3 = r3.f7455c     // Catch:{ all -> 0x0bdb }
            r1.f7486f = r3     // Catch:{ all -> 0x0bdb }
        L_0x0c29:
            int r2 = r2 + 1
            goto L_0x0bf8
        L_0x0c2c:
            r2 = r50
            com.google.android.gms.internal.measurement.bl r3 = r2.f8429a     // Catch:{ all -> 0x0daa }
            java.lang.String r3 = r3.f7495o     // Catch:{ all -> 0x0daa }
            com.google.android.gms.measurement.internal.ew r4 = r52.mo14529d()     // Catch:{ all -> 0x0daa }
            com.google.android.gms.measurement.internal.en r4 = r4.mo14771b(r3)     // Catch:{ all -> 0x0daa }
            if (r4 != 0) goto L_0x0c56
            r5 = r52
            com.google.android.gms.measurement.internal.aw r4 = r5.f8413j     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo14235r()     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ all -> 0x0dc9 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.bl r7 = r2.f8429a     // Catch:{ all -> 0x0dc9 }
            java.lang.String r7 = r7.f7495o     // Catch:{ all -> 0x0dc9 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r7)     // Catch:{ all -> 0x0dc9 }
            r4.mo14842a(r6, r7)     // Catch:{ all -> 0x0dc9 }
            goto L_0x0cb4
        L_0x0c56:
            r5 = r52
            com.google.android.gms.internal.measurement.bi[] r6 = r1.f7482b     // Catch:{ all -> 0x0dc9 }
            int r6 = r6.length     // Catch:{ all -> 0x0dc9 }
            if (r6 <= 0) goto L_0x0cb4
            long r6 = r4.mo14624i()     // Catch:{ all -> 0x0dc9 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0c6c
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0dc9 }
            goto L_0x0c6d
        L_0x0c6c:
            r8 = 0
        L_0x0c6d:
            r1.f7488h = r8     // Catch:{ all -> 0x0dc9 }
            long r8 = r4.mo14621h()     // Catch:{ all -> 0x0dc9 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0c7a
            goto L_0x0c7b
        L_0x0c7a:
            r6 = r8
        L_0x0c7b:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c84
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0dc9 }
            goto L_0x0c85
        L_0x0c84:
            r6 = 0
        L_0x0c85:
            r1.f7487g = r6     // Catch:{ all -> 0x0dc9 }
            r4.mo14641s()     // Catch:{ all -> 0x0dc9 }
            long r6 = r4.mo14638p()     // Catch:{ all -> 0x0dc9 }
            int r6 = (int) r6     // Catch:{ all -> 0x0dc9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0dc9 }
            r1.f7503w = r6     // Catch:{ all -> 0x0dc9 }
            java.lang.Long r6 = r1.f7485e     // Catch:{ all -> 0x0dc9 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0dc9 }
            r4.mo14598a((long) r6)     // Catch:{ all -> 0x0dc9 }
            java.lang.Long r6 = r1.f7486f     // Catch:{ all -> 0x0dc9 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0dc9 }
            r4.mo14602b((long) r6)     // Catch:{ all -> 0x0dc9 }
            java.lang.String r6 = r4.mo14593A()     // Catch:{ all -> 0x0dc9 }
            r1.f7504x = r6     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.ew r6 = r52.mo14529d()     // Catch:{ all -> 0x0dc9 }
            r6.mo14763a((com.google.android.gms.measurement.internal.C2266en) r4)     // Catch:{ all -> 0x0dc9 }
        L_0x0cb4:
            com.google.android.gms.internal.measurement.bi[] r4 = r1.f7482b     // Catch:{ all -> 0x0dc9 }
            int r4 = r4.length     // Catch:{ all -> 0x0dc9 }
            if (r4 <= 0) goto L_0x0d09
            com.google.android.gms.measurement.internal.aw r4 = r5.f8413j     // Catch:{ all -> 0x0dc9 }
            r4.mo14238u()     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.aq r4 = r52.m10928s()     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.internal.measurement.bl r6 = r2.f8429a     // Catch:{ all -> 0x0dc9 }
            java.lang.String r6 = r6.f7495o     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.internal.measurement.be r4 = r4.mo14279a((java.lang.String) r6)     // Catch:{ all -> 0x0dc9 }
            if (r4 == 0) goto L_0x0cd6
            java.lang.Long r6 = r4.f7433a     // Catch:{ all -> 0x0dc9 }
            if (r6 != 0) goto L_0x0cd1
            goto L_0x0cd6
        L_0x0cd1:
            java.lang.Long r4 = r4.f7433a     // Catch:{ all -> 0x0dc9 }
            r1.f7470E = r4     // Catch:{ all -> 0x0dc9 }
            goto L_0x0d00
        L_0x0cd6:
            com.google.android.gms.internal.measurement.bl r4 = r2.f8429a     // Catch:{ all -> 0x0dc9 }
            java.lang.String r4 = r4.f7505y     // Catch:{ all -> 0x0dc9 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0dc9 }
            if (r4 == 0) goto L_0x0ce9
            r6 = -1
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0dc9 }
            r1.f7470E = r4     // Catch:{ all -> 0x0dc9 }
            goto L_0x0d00
        L_0x0ce9:
            com.google.android.gms.measurement.internal.aw r4 = r5.f8413j     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo14235r()     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14833i()     // Catch:{ all -> 0x0dc9 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.bl r7 = r2.f8429a     // Catch:{ all -> 0x0dc9 }
            java.lang.String r7 = r7.f7495o     // Catch:{ all -> 0x0dc9 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r7)     // Catch:{ all -> 0x0dc9 }
            r4.mo14842a(r6, r7)     // Catch:{ all -> 0x0dc9 }
        L_0x0d00:
            com.google.android.gms.measurement.internal.ew r4 = r52.mo14529d()     // Catch:{ all -> 0x0dc9 }
            r9 = r24
            r4.mo14766a((com.google.android.gms.internal.measurement.C1919bl) r1, (boolean) r9)     // Catch:{ all -> 0x0dc9 }
        L_0x0d09:
            com.google.android.gms.measurement.internal.ew r1 = r52.mo14529d()     // Catch:{ all -> 0x0dc9 }
            java.util.List<java.lang.Long> r2 = r2.f8430b     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.common.internal.C0926p.m1306a(r2)     // Catch:{ all -> 0x0dc9 }
            r1.mo14221d()     // Catch:{ all -> 0x0dc9 }
            r1.mo14508k()     // Catch:{ all -> 0x0dc9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dc9 }
            java.lang.String r6 = "rowid in ("
            r4.<init>(r6)     // Catch:{ all -> 0x0dc9 }
            r6 = 0
        L_0x0d20:
            int r7 = r2.size()     // Catch:{ all -> 0x0dc9 }
            if (r6 >= r7) goto L_0x0d3d
            if (r6 == 0) goto L_0x0d2d
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x0dc9 }
        L_0x0d2d:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0dc9 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0dc9 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0dc9 }
            r4.append(r7)     // Catch:{ all -> 0x0dc9 }
            int r6 = r6 + 1
            goto L_0x0d20
        L_0x0d3d:
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x0dc9 }
            android.database.sqlite.SQLiteDatabase r6 = r1.mo14787y()     // Catch:{ all -> 0x0dc9 }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0dc9 }
            r8 = 0
            int r4 = r6.delete(r7, r4, r8)     // Catch:{ all -> 0x0dc9 }
            int r6 = r2.size()     // Catch:{ all -> 0x0dc9 }
            if (r4 == r6) goto L_0x0d70
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ all -> 0x0dc9 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0dc9 }
            int r2 = r2.size()     // Catch:{ all -> 0x0dc9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0dc9 }
            r1.mo14843a(r6, r4, r2)     // Catch:{ all -> 0x0dc9 }
        L_0x0d70:
            com.google.android.gms.measurement.internal.ew r1 = r52.mo14529d()     // Catch:{ all -> 0x0dc9 }
            android.database.sqlite.SQLiteDatabase r2 = r1.mo14787y()     // Catch:{ all -> 0x0dc9 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0d87 }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0d87 }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0d87 }
            r2.execSQL(r4, r6)     // Catch:{ SQLiteException -> 0x0d87 }
            goto L_0x0d9a
        L_0x0d87:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ all -> 0x0dc9 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r3)     // Catch:{ all -> 0x0dc9 }
            r1.mo14843a(r4, r3, r2)     // Catch:{ all -> 0x0dc9 }
        L_0x0d9a:
            com.google.android.gms.measurement.internal.ew r1 = r52.mo14529d()     // Catch:{ all -> 0x0dc9 }
            r1.mo14785w()     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.ew r1 = r52.mo14529d()
            r1.mo14786x()
            r1 = 1
            return r1
        L_0x0daa:
            r0 = move-exception
            r5 = r52
            goto L_0x0dce
        L_0x0dae:
            r5 = r1
            com.google.android.gms.measurement.internal.ew r1 = r52.mo14529d()     // Catch:{ all -> 0x0dc9 }
            r1.mo14785w()     // Catch:{ all -> 0x0dc9 }
            com.google.android.gms.measurement.internal.ew r1 = r52.mo14529d()
            r1.mo14786x()
            r1 = 0
            return r1
        L_0x0dbf:
            r0 = move-exception
        L_0x0dc0:
            r5 = r1
            goto L_0x025c
        L_0x0dc3:
            if (r8 == 0) goto L_0x0dcb
            r8.close()     // Catch:{ all -> 0x0dc9 }
            goto L_0x0dcb
        L_0x0dc9:
            r0 = move-exception
            goto L_0x0dce
        L_0x0dcb:
            throw r1     // Catch:{ all -> 0x0dc9 }
        L_0x0dcc:
            r0 = move-exception
            r5 = r1
        L_0x0dce:
            r1 = r0
        L_0x0dcf:
            com.google.android.gms.measurement.internal.ew r2 = r52.mo14529d()
            r2.mo14786x()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2254ec.m10920a(java.lang.String, long):boolean");
    }

    /* renamed from: a */
    private final boolean m10919a(C1916bi biVar, C1916bi biVar2) {
        String str;
        C0926p.m1316b("_e".equals(biVar.f7454b));
        mo14533g();
        C1917bj a = C2261ei.m10976a(biVar, "_sc");
        String str2 = null;
        if (a == null) {
            str = null;
        } else {
            str = a.f7460b;
        }
        mo14533g();
        C1917bj a2 = C2261ei.m10976a(biVar2, "_pc");
        if (a2 != null) {
            str2 = a2.f7460b;
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        mo14533g();
        C1917bj a3 = C2261ei.m10976a(biVar, "_et");
        if (a3.f7461c == null || a3.f7461c.longValue() <= 0) {
            return true;
        }
        long longValue = a3.f7461c.longValue();
        mo14533g();
        C1917bj a4 = C2261ei.m10976a(biVar2, "_et");
        if (!(a4 == null || a4.f7461c == null || a4.f7461c.longValue() <= 0)) {
            longValue += a4.f7461c.longValue();
        }
        mo14533g();
        biVar2.f7453a = C2261ei.m10985a(biVar2.f7453a, "_et", (Object) Long.valueOf(longValue));
        mo14533g();
        biVar.f7453a = C2261ei.m10985a(biVar.f7453a, "_fr", (Object) 1L);
        return true;
    }

    /* renamed from: a */
    private static C1917bj[] m10923a(C1917bj[] bjVarArr, @NonNull String str) {
        int i = 0;
        while (true) {
            if (i >= bjVarArr.length) {
                i = -1;
                break;
            } else if (str.equals(bjVarArr[i].f7459a)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return bjVarArr;
        }
        return m10921a(bjVarArr, i);
    }

    /* renamed from: a */
    private static C1917bj[] m10921a(C1917bj[] bjVarArr, int i) {
        C1917bj[] bjVarArr2 = new C1917bj[(bjVarArr.length - 1)];
        if (i > 0) {
            System.arraycopy(bjVarArr, 0, bjVarArr2, 0, i);
        }
        if (i < bjVarArr2.length) {
            System.arraycopy(bjVarArr, i + 1, bjVarArr2, i, bjVarArr2.length - i);
        }
        return bjVarArr2;
    }

    /* renamed from: a */
    private static C1917bj[] m10922a(C1917bj[] bjVarArr, int i, String str) {
        for (C1917bj bjVar : bjVarArr) {
            if ("_err".equals(bjVar.f7459a)) {
                return bjVarArr;
            }
        }
        C1917bj[] bjVarArr2 = new C1917bj[(bjVarArr.length + 2)];
        System.arraycopy(bjVarArr, 0, bjVarArr2, 0, bjVarArr.length);
        C1917bj bjVar2 = new C1917bj();
        bjVar2.f7459a = "_err";
        bjVar2.f7461c = Long.valueOf((long) i);
        C1917bj bjVar3 = new C1917bj();
        bjVar3.f7459a = "_ev";
        bjVar3.f7460b = str;
        bjVarArr2[bjVarArr2.length - 2] = bjVar2;
        bjVarArr2[bjVarArr2.length - 1] = bjVar3;
        return bjVarArr2;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14511a(int i, Throwable th, byte[] bArr, String str) {
        C2275ew d;
        m10931w();
        mo14536j();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f8422s = false;
                m10907A();
                throw th2;
            }
        }
        List<Long> list = this.f8426w;
        this.f8426w = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f8413j.mo14318c().f8044c.mo14266a(this.f8413j.mo14230m().mo9996a());
                this.f8413j.mo14318c().f8045d.mo14266a(0);
                m10934z();
                this.f8413j.mo14235r().mo14838x().mo14843a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo14529d().mo14782f();
                try {
                    for (Long next : list) {
                        try {
                            d = mo14529d();
                            long longValue = next.longValue();
                            d.mo14221d();
                            d.mo14508k();
                            if (d.mo14787y().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            d.mo14235r().mo14830d_().mo14842a("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f8427x == null || !this.f8427x.contains(next)) {
                                throw e2;
                            }
                        }
                    }
                    mo14529d().mo14785w();
                    mo14529d().mo14786x();
                    this.f8427x = null;
                    if (!mo14527c().mo14846f() || !m10933y()) {
                        this.f8428y = -1;
                        m10934z();
                    } else {
                        mo14537k();
                    }
                    this.f8417n = 0;
                } catch (Throwable th3) {
                    mo14529d().mo14786x();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f8413j.mo14235r().mo14830d_().mo14842a("Database error while trying to delete uploaded bundles", e3);
                this.f8417n = this.f8413j.mo14230m().mo9997b();
                this.f8413j.mo14235r().mo14838x().mo14842a("Disable upload, time", Long.valueOf(this.f8417n));
            }
        } else {
            this.f8413j.mo14235r().mo14838x().mo14843a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f8413j.mo14318c().f8045d.mo14266a(this.f8413j.mo14230m().mo9996a());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f8413j.mo14318c().f8046e.mo14266a(this.f8413j.mo14230m().mo9996a());
            }
            if (this.f8413j.mo14317b().mo14728g(str)) {
                mo14529d().mo14765a(list);
            }
            m10934z();
        }
        this.f8422s = false;
        m10907A();
    }

    /* renamed from: y */
    private final boolean m10933y() {
        m10931w();
        mo14536j();
        return mo14529d().mo14750E() || !TextUtils.isEmpty(mo14529d().mo14788z());
    }

    @WorkerThread
    /* renamed from: a */
    private final void m10917a(C2266en enVar) {
        ArrayMap arrayMap;
        m10931w();
        if (!TextUtils.isEmpty(enVar.mo14609d()) || (C2272et.m11156y() && !TextUtils.isEmpty(enVar.mo14612e()))) {
            C2272et b = this.f8413j.mo14317b();
            Uri.Builder builder = new Uri.Builder();
            String d = enVar.mo14609d();
            if (TextUtils.isEmpty(d) && C2272et.m11156y()) {
                d = enVar.mo14612e();
            }
            Uri.Builder encodedAuthority = builder.scheme(C2284h.f8573m.mo14804b()).encodedAuthority(C2284h.f8574n.mo14804b());
            String valueOf = String.valueOf(d);
            encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", enVar.mo14605c()).appendQueryParameter("platform", C0008a.ANDROID_CLIENT_TYPE).appendQueryParameter("gmp_version", String.valueOf(b.mo14725f()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.f8413j.mo14235r().mo14838x().mo14842a("Fetching remote configuration", enVar.mo14601b());
                C1912be a = m10928s().mo14279a(enVar.mo14601b());
                String b2 = m10928s().mo14282b(enVar.mo14601b());
                if (a == null || TextUtils.isEmpty(b2)) {
                    arrayMap = null;
                } else {
                    ArrayMap arrayMap2 = new ArrayMap();
                    arrayMap2.put("If-Modified-Since", b2);
                    arrayMap = arrayMap2;
                }
                this.f8421r = true;
                C2299v c = mo14527c();
                String b3 = enVar.mo14601b();
                C2258ef efVar = new C2258ef(this);
                c.mo14221d();
                c.mo14508k();
                C0926p.m1306a(url);
                C0926p.m1306a(efVar);
                c.mo14234q().mo14298b((Runnable) new C2144aa(c, b3, url, (byte[]) null, arrayMap, efVar));
            } catch (MalformedURLException unused) {
                this.f8413j.mo14235r().mo14830d_().mo14843a("Failed to parse config URL. Not fetching. appId", C2295r.m11413a(enVar.mo14601b()), uri);
            }
        } else {
            mo14520a(enVar.mo14601b(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013e A[Catch:{ all -> 0x0191, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014e A[Catch:{ all -> 0x0191, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0176 A[Catch:{ all -> 0x0191, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017a A[Catch:{ all -> 0x0191, all -> 0x000f }] */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14520a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m10931w()
            r6.mo14536j()
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x000f }
            goto L_0x0012
        L_0x000f:
            r7 = move-exception
            goto L_0x019a
        L_0x0012:
            com.google.android.gms.measurement.internal.aw r1 = r6.f8413j     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()     // Catch:{ all -> 0x000f }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x000f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x000f }
            r1.mo14842a(r2, r3)     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ew r1 = r6.mo14529d()     // Catch:{ all -> 0x000f }
            r1.mo14782f()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ew r1 = r6.mo14529d()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.en r1 = r1.mo14771b(r7)     // Catch:{ all -> 0x0191 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L_0x0042
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0042
            if (r8 != r4) goto L_0x0046
        L_0x0042:
            if (r9 != 0) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r1 != 0) goto L_0x005e
            com.google.android.gms.measurement.internal.aw r8 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo14235r()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo14833i()     // Catch:{ all -> 0x0191 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r7)     // Catch:{ all -> 0x0191 }
            r8.mo14842a(r9, r7)     // Catch:{ all -> 0x0191 }
            goto L_0x017d
        L_0x005e:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ce
            if (r8 != r5) goto L_0x0065
            goto L_0x00ce
        L_0x0065:
            com.google.android.gms.measurement.internal.aw r10 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.common.util.e r10 = r10.mo14230m()     // Catch:{ all -> 0x0191 }
            long r10 = r10.mo9996a()     // Catch:{ all -> 0x0191 }
            r1.mo14622h((long) r10)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ew r10 = r6.mo14529d()     // Catch:{ all -> 0x0191 }
            r10.mo14763a((com.google.android.gms.measurement.internal.C2266en) r1)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aw r10 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.r r10 = r10.mo14235r()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.t r10 = r10.mo14838x()     // Catch:{ all -> 0x0191 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0191 }
            r10.mo14843a(r11, r1, r9)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aq r9 = r6.m10928s()     // Catch:{ all -> 0x0191 }
            r9.mo14284c(r7)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aw r7 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo14318c()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ag r7 = r7.f8045d     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aw r9 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.common.util.e r9 = r9.mo14230m()     // Catch:{ all -> 0x0191 }
            long r9 = r9.mo9996a()     // Catch:{ all -> 0x0191 }
            r7.mo14266a(r9)     // Catch:{ all -> 0x0191 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00b2
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r3 = 0
        L_0x00b2:
            if (r3 == 0) goto L_0x00c9
            com.google.android.gms.measurement.internal.aw r7 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo14318c()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ag r7 = r7.f8046e     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aw r8 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.common.util.e r8 = r8.mo14230m()     // Catch:{ all -> 0x0191 }
            long r8 = r8.mo9996a()     // Catch:{ all -> 0x0191 }
            r7.mo14266a(r8)     // Catch:{ all -> 0x0191 }
        L_0x00c9:
            r6.m10934z()     // Catch:{ all -> 0x0191 }
            goto L_0x017d
        L_0x00ce:
            r9 = 0
            if (r11 == 0) goto L_0x00da
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0191 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0191 }
            goto L_0x00db
        L_0x00da:
            r11 = r9
        L_0x00db:
            if (r11 == 0) goto L_0x00ea
            int r2 = r11.size()     // Catch:{ all -> 0x0191 }
            if (r2 <= 0) goto L_0x00ea
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0191 }
            goto L_0x00eb
        L_0x00ea:
            r11 = r9
        L_0x00eb:
            if (r8 == r5) goto L_0x0107
            if (r8 != r4) goto L_0x00f0
            goto L_0x0107
        L_0x00f0:
            com.google.android.gms.measurement.internal.aq r9 = r6.m10928s()     // Catch:{ all -> 0x0191 }
            boolean r9 = r9.mo14281a(r7, r10, r11)     // Catch:{ all -> 0x0191 }
            if (r9 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.ew r7 = r6.mo14529d()     // Catch:{ all -> 0x000f }
            r7.mo14786x()     // Catch:{ all -> 0x000f }
            r6.f8421r = r0
            r6.m10907A()
            return
        L_0x0107:
            com.google.android.gms.measurement.internal.aq r11 = r6.m10928s()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.internal.measurement.be r11 = r11.mo14279a((java.lang.String) r7)     // Catch:{ all -> 0x0191 }
            if (r11 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.aq r11 = r6.m10928s()     // Catch:{ all -> 0x0191 }
            boolean r9 = r11.mo14281a(r7, r9, r9)     // Catch:{ all -> 0x0191 }
            if (r9 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.ew r7 = r6.mo14529d()     // Catch:{ all -> 0x000f }
            r7.mo14786x()     // Catch:{ all -> 0x000f }
            r6.f8421r = r0
            r6.m10907A()
            return
        L_0x0128:
            com.google.android.gms.measurement.internal.aw r9 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.common.util.e r9 = r9.mo14230m()     // Catch:{ all -> 0x0191 }
            long r2 = r9.mo9996a()     // Catch:{ all -> 0x0191 }
            r1.mo14619g((long) r2)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ew r9 = r6.mo14529d()     // Catch:{ all -> 0x0191 }
            r9.mo14763a((com.google.android.gms.measurement.internal.C2266en) r1)     // Catch:{ all -> 0x0191 }
            if (r8 != r5) goto L_0x014e
            com.google.android.gms.measurement.internal.aw r8 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo14235r()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo14835k()     // Catch:{ all -> 0x0191 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo14842a(r9, r7)     // Catch:{ all -> 0x0191 }
            goto L_0x0166
        L_0x014e:
            com.google.android.gms.measurement.internal.aw r7 = r6.f8413j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo14235r()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo14838x()     // Catch:{ all -> 0x0191 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0191 }
            int r10 = r10.length     // Catch:{ all -> 0x0191 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0191 }
            r7.mo14843a(r9, r8, r10)     // Catch:{ all -> 0x0191 }
        L_0x0166:
            com.google.android.gms.measurement.internal.v r7 = r6.mo14527c()     // Catch:{ all -> 0x0191 }
            boolean r7 = r7.mo14846f()     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x017a
            boolean r7 = r6.m10933y()     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x017a
            r6.mo14537k()     // Catch:{ all -> 0x0191 }
            goto L_0x017d
        L_0x017a:
            r6.m10934z()     // Catch:{ all -> 0x0191 }
        L_0x017d:
            com.google.android.gms.measurement.internal.ew r7 = r6.mo14529d()     // Catch:{ all -> 0x0191 }
            r7.mo14785w()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ew r7 = r6.mo14529d()     // Catch:{ all -> 0x000f }
            r7.mo14786x()     // Catch:{ all -> 0x000f }
            r6.f8421r = r0
            r6.m10907A()
            return
        L_0x0191:
            r7 = move-exception
            com.google.android.gms.measurement.internal.ew r8 = r6.mo14529d()     // Catch:{ all -> 0x000f }
            r8.mo14786x()     // Catch:{ all -> 0x000f }
            throw r7     // Catch:{ all -> 0x000f }
        L_0x019a:
            r6.f8421r = r0
            r6.m10907A()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2254ec.mo14520a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01bf  */
    @android.support.annotation.WorkerThread
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10934z() {
        /*
            r20 = this;
            r0 = r20
            r20.m10931w()
            r20.mo14536j()
            boolean r1 = r20.m10909C()
            if (r1 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.measurement.internal.et r1 = r1.mo14317b()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2284h.f8553ar
            boolean r1 = r1.mo14717a((com.google.android.gms.measurement.internal.C2284h.C2285a<java.lang.Boolean>) r2)
            if (r1 != 0) goto L_0x001d
            return
        L_0x001d:
            long r1 = r0.f8417n
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.common.util.e r1 = r1.mo14230m()
            long r1 = r1.mo9997b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f8417n
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.mo14842a(r2, r3)
            com.google.android.gms.measurement.internal.ab r1 = r20.m10929t()
            r1.mo14241b()
            com.google.android.gms.measurement.internal.dy r1 = r20.m10930v()
            r1.mo14503f()
            return
        L_0x0060:
            r0.f8417n = r3
        L_0x0062:
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            boolean r1 = r1.mo14312H()
            if (r1 == 0) goto L_0x0268
            boolean r1 = r20.m10933y()
            if (r1 != 0) goto L_0x0072
            goto L_0x0268
        L_0x0072:
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.common.util.e r1 = r1.mo14230m()
            long r1 = r1.mo9996a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C2284h.f8516I
            java.lang.Object r5 = r5.mo14804b()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ew r7 = r20.mo14529d()
            boolean r7 = r7.mo14751F()
            if (r7 != 0) goto L_0x00a3
            com.google.android.gms.measurement.internal.ew r7 = r20.mo14529d()
            boolean r7 = r7.mo14746A()
            if (r7 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r7 = 0
            goto L_0x00a4
        L_0x00a3:
            r7 = 1
        L_0x00a4:
            if (r7 == 0) goto L_0x00e0
            com.google.android.gms.measurement.internal.aw r9 = r0.f8413j
            com.google.android.gms.measurement.internal.et r9 = r9.mo14317b()
            java.lang.String r9 = r9.mo14744v()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00cf
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C2284h.f8511D
            java.lang.Object r9 = r9.mo14804b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00f0
        L_0x00cf:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C2284h.f8510C
            java.lang.Object r9 = r9.mo14804b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00f0
        L_0x00e0:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C2284h.f8509B
            java.lang.Object r9 = r9.mo14804b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
        L_0x00f0:
            com.google.android.gms.measurement.internal.aw r11 = r0.f8413j
            com.google.android.gms.measurement.internal.ad r11 = r11.mo14318c()
            com.google.android.gms.measurement.internal.ag r11 = r11.f8044c
            long r11 = r11.mo14265a()
            com.google.android.gms.measurement.internal.aw r13 = r0.f8413j
            com.google.android.gms.measurement.internal.ad r13 = r13.mo14318c()
            com.google.android.gms.measurement.internal.ag r13 = r13.f8045d
            long r13 = r13.mo14265a()
            com.google.android.gms.measurement.internal.ew r15 = r20.mo14529d()
            r16 = r9
            long r8 = r15.mo14748C()
            com.google.android.gms.measurement.internal.ew r10 = r20.mo14529d()
            r18 = r5
            long r5 = r10.mo14749D()
            long r5 = java.lang.Math.max(r8, r5)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0127
        L_0x0124:
            r8 = r3
            goto L_0x019d
        L_0x0127:
            r8 = 0
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r11 = r11 - r1
            long r8 = java.lang.Math.abs(r11)
            long r8 = r1 - r8
            long r13 = r13 - r1
            long r10 = java.lang.Math.abs(r13)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r5 + r18
            if (r7 == 0) goto L_0x014e
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x014e
            long r10 = java.lang.Math.min(r5, r8)
            long r10 = r10 + r16
        L_0x014e:
            com.google.android.gms.measurement.internal.ei r7 = r20.mo14533g()
            r12 = r16
            boolean r7 = r7.mo14551a((long) r8, (long) r12)
            if (r7 != 0) goto L_0x015c
            long r8 = r8 + r12
            goto L_0x015d
        L_0x015c:
            r8 = r10
        L_0x015d:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x019d
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x019d
            r5 = 0
        L_0x0166:
            r6 = 20
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C2284h.f8518K
            java.lang.Object r7 = r7.mo14804b()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10 = 0
            int r7 = java.lang.Math.max(r10, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0124
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r11 = com.google.android.gms.measurement.internal.C2284h.f8517J
            java.lang.Object r11 = r11.mo14804b()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            long r11 = r11 * r6
            long r8 = r8 + r11
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x019a
            goto L_0x019d
        L_0x019a:
            int r5 = r5 + 1
            goto L_0x0166
        L_0x019d:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01bf
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo14841a(r2)
            com.google.android.gms.measurement.internal.ab r1 = r20.m10929t()
            r1.mo14241b()
            com.google.android.gms.measurement.internal.dy r1 = r20.m10930v()
            r1.mo14503f()
            return
        L_0x01bf:
            com.google.android.gms.measurement.internal.v r1 = r20.mo14527c()
            boolean r1 = r1.mo14846f()
            if (r1 != 0) goto L_0x01e7
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r2 = "No network"
            r1.mo14841a(r2)
            com.google.android.gms.measurement.internal.ab r1 = r20.m10929t()
            r1.mo14240a()
            com.google.android.gms.measurement.internal.dy r1 = r20.m10930v()
            r1.mo14503f()
            return
        L_0x01e7:
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.measurement.internal.ad r1 = r1.mo14318c()
            com.google.android.gms.measurement.internal.ag r1 = r1.f8046e
            long r1 = r1.mo14265a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C2284h.f8586z
            java.lang.Object r5 = r5.mo14804b()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ei r7 = r20.mo14533g()
            boolean r7 = r7.mo14551a((long) r1, (long) r5)
            if (r7 != 0) goto L_0x0212
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x0212:
            com.google.android.gms.measurement.internal.ab r1 = r20.m10929t()
            r1.mo14241b()
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.common.util.e r1 = r1.mo14230m()
            long r1 = r1.mo9996a()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x024d
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C2284h.f8512E
            java.lang.Object r1 = r1.mo14804b()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.measurement.internal.ad r1 = r1.mo14318c()
            com.google.android.gms.measurement.internal.ag r1 = r1.f8044c
            com.google.android.gms.measurement.internal.aw r2 = r0.f8413j
            com.google.android.gms.common.util.e r2 = r2.mo14230m()
            long r2 = r2.mo9996a()
            r1.mo14266a(r2)
        L_0x024d:
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r1.mo14842a(r2, r3)
            com.google.android.gms.measurement.internal.dy r1 = r20.m10930v()
            r1.mo14502a(r8)
            return
        L_0x0268:
            com.google.android.gms.measurement.internal.aw r1 = r0.f8413j
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo14841a(r2)
            com.google.android.gms.measurement.internal.ab r1 = r20.m10929t()
            r1.mo14241b()
            com.google.android.gms.measurement.internal.dy r1 = r20.m10930v()
            r1.mo14503f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2254ec.m10934z():void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14519a(Runnable runnable) {
        m10931w();
        if (this.f8418o == null) {
            this.f8418o = new ArrayList();
        }
        this.f8418o.add(runnable);
    }

    @WorkerThread
    /* renamed from: A */
    private final void m10907A() {
        m10931w();
        if (this.f8421r || this.f8422s || this.f8423t) {
            this.f8413j.mo14235r().mo14838x().mo14844a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f8421r), Boolean.valueOf(this.f8422s), Boolean.valueOf(this.f8423t));
            return;
        }
        this.f8413j.mo14235r().mo14838x().mo14841a("Stopping uploading service(s)");
        if (this.f8418o != null) {
            for (Runnable run : this.f8418o) {
                run.run();
            }
            this.f8418o.clear();
        }
    }

    @WorkerThread
    /* renamed from: b */
    private final Boolean m10924b(C2266en enVar) {
        try {
            if (enVar.mo14628k() != -2147483648L) {
                if (enVar.mo14628k() == ((long) C0771c.m904a(this.f8413j.mo14231n()).mo9540b(enVar.mo14601b(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = C0771c.m904a(this.f8413j.mo14231n()).mo9540b(enVar.mo14601b(), 0).versionName;
                if (enVar.mo14626j() != null && enVar.mo14626j().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    /* renamed from: B */
    private final boolean m10908B() {
        m10931w();
        try {
            this.f8425v = new RandomAccessFile(new File(this.f8413j.mo14231n().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f8424u = this.f8425v.tryLock();
            if (this.f8424u != null) {
                this.f8413j.mo14235r().mo14838x().mo14841a("Storage concurrent access okay");
                return true;
            }
            this.f8413j.mo14235r().mo14830d_().mo14841a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.f8413j.mo14235r().mo14830d_().mo14842a("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            this.f8413j.mo14235r().mo14830d_().mo14842a("Failed to access storage lock file", e2);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: a */
    private final int m10910a(FileChannel fileChannel) {
        m10931w();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f8413j.mo14235r().mo14830d_().mo14841a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f8413j.mo14235r().mo14833i().mo14842a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            this.f8413j.mo14235r().mo14830d_().mo14842a("Failed to read from channel", e);
            return 0;
        }
    }

    @WorkerThread
    /* renamed from: a */
    private final boolean m10918a(int i, FileChannel fileChannel) {
        m10931w();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f8413j.mo14235r().mo14830d_().mo14841a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f8413j.mo14235r().mo14830d_().mo14842a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f8413j.mo14235r().mo14830d_().mo14842a("Failed to write to channel", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: l */
    public final void mo14538l() {
        m10931w();
        mo14536j();
        if (!this.f8416m) {
            this.f8416m = true;
            m10931w();
            mo14536j();
            if ((this.f8413j.mo14317b().mo14717a(C2284h.f8553ar) || m10909C()) && m10908B()) {
                int a = m10910a(this.f8425v);
                int A = this.f8413j.mo14336z().mo14805A();
                m10931w();
                if (a > A) {
                    this.f8413j.mo14235r().mo14830d_().mo14843a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                } else if (a < A) {
                    if (m10918a(A, this.f8425v)) {
                        this.f8413j.mo14235r().mo14838x().mo14843a("Storage version upgraded. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                    } else {
                        this.f8413j.mo14235r().mo14830d_().mo14843a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                    }
                }
            }
        }
        if (!this.f8415l && !this.f8413j.mo14317b().mo14717a(C2284h.f8553ar)) {
            this.f8413j.mo14235r().mo14836v().mo14841a("This instance being marked as an uploader");
            this.f8415l = true;
            m10934z();
        }
    }

    @WorkerThread
    /* renamed from: C */
    private final boolean m10909C() {
        m10931w();
        mo14536j();
        return this.f8415l;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14524b(zzk zzk) {
        if (this.f8426w != null) {
            this.f8427x = new ArrayList();
            this.f8427x.addAll(this.f8426w);
        }
        C2275ew d = mo14529d();
        String str = zzk.f8661a;
        C0926p.m1308a(str);
        d.mo14221d();
        d.mo14508k();
        try {
            SQLiteDatabase y = d.mo14787y();
            String[] strArr = {str};
            int delete = y.delete("apps", "app_id=?", strArr) + 0 + y.delete("events", "app_id=?", strArr) + y.delete("user_attributes", "app_id=?", strArr) + y.delete("conditional_properties", "app_id=?", strArr) + y.delete("raw_events", "app_id=?", strArr) + y.delete("raw_events_metadata", "app_id=?", strArr) + y.delete("queue", "app_id=?", strArr) + y.delete("audience_filter_values", "app_id=?", strArr) + y.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                d.mo14235r().mo14838x().mo14843a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            d.mo14235r().mo14830d_().mo14843a("Error resetting analytics data. appId, error", C2295r.m11413a(str), e);
        }
        zzk a = m10913a(this.f8413j.mo14231n(), zzk.f8661a, zzk.f8662b, zzk.f8668h, zzk.f8675o, zzk.f8676p, zzk.f8673m, zzk.f8678r);
        if (!this.f8413j.mo14317b().mo14733j(zzk.f8661a) || zzk.f8668h) {
            mo14528c(a);
        }
    }

    /* renamed from: a */
    private final zzk m10913a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4;
        int i;
        String str5 = str;
        String str6 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f8413j.mo14235r().mo14830d_().mo14841a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str6 = packageManager.getInstallerPackageName(str5);
        } catch (IllegalArgumentException unused) {
            this.f8413j.mo14235r().mo14830d_().mo14842a("Error retrieving installer package name. appId", C2295r.m11413a(str));
        }
        if (str6 == null) {
            str6 = "manual_install";
        } else if ("com.android.vending".equals(str6)) {
            str6 = "";
        }
        String str7 = str6;
        try {
            PackageInfo b = C0771c.m904a(context).mo9540b(str5, 0);
            if (b != null) {
                CharSequence b2 = C0771c.m904a(context).mo9541b(str5);
                if (!TextUtils.isEmpty(b2)) {
                    String charSequence = b2.toString();
                }
                str4 = b.versionName;
                i = b.versionCode;
            } else {
                str4 = "Unknown";
                i = Integer.MIN_VALUE;
            }
            this.f8413j.mo14238u();
            return new zzk(str, str2, str4, (long) i, str7, this.f8413j.mo14317b().mo14725f(), this.f8413j.mo14325j().mo14561a(context, str5), (String) null, z, false, "", 0, this.f8413j.mo14317b().mo14735l(str5) ? j : 0, 0, z2, z3, false, str3);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.f8413j.mo14235r().mo14830d_().mo14843a("Error retrieving newly installed package info. appId, appName", C2295r.m11413a(str), "Unknown");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14515a(zzfv zzfv, zzk zzk) {
        m10931w();
        mo14536j();
        if (TextUtils.isEmpty(zzk.f8662b) && TextUtils.isEmpty(zzk.f8678r)) {
            return;
        }
        if (!zzk.f8668h) {
            m10927e(zzk);
            return;
        }
        int c = this.f8413j.mo14325j().mo14577c(zzfv.f8653a);
        if (c != 0) {
            this.f8413j.mo14325j();
            this.f8413j.mo14325j().mo14570a(zzk.f8661a, c, "_ev", C2264el.m11020a(zzfv.f8653a, 24, true), zzfv.f8653a != null ? zzfv.f8653a.length() : 0);
            return;
        }
        int b = this.f8413j.mo14325j().mo14575b(zzfv.f8653a, zzfv.mo14860a());
        if (b != 0) {
            this.f8413j.mo14325j();
            String a = C2264el.m11020a(zzfv.f8653a, 24, true);
            Object a2 = zzfv.mo14860a();
            this.f8413j.mo14325j().mo14570a(zzk.f8661a, b, "_ev", a, (a2 == null || (!(a2 instanceof String) && !(a2 instanceof CharSequence))) ? 0 : String.valueOf(a2).length());
            return;
        }
        Object c2 = this.f8413j.mo14325j().mo14578c(zzfv.f8653a, zzfv.mo14860a());
        if (c2 != null) {
            if (this.f8413j.mo14317b().mo14740q(zzk.f8661a) && "_sno".equals(zzfv.f8653a)) {
                long j = 0;
                C2263ek c3 = mo14529d().mo14775c(zzk.f8661a, "_sno");
                if (c3 == null || !(c3.f8446e instanceof Long)) {
                    C2224d a3 = mo14529d().mo14755a(zzk.f8661a, "_s");
                    if (a3 != null) {
                        j = a3.f8321c;
                        this.f8413j.mo14235r().mo14838x().mo14842a("Backfill the session number. Last used session number", Long.valueOf(j));
                    }
                } else {
                    j = ((Long) c3.f8446e).longValue();
                }
                c2 = Long.valueOf(j + 1);
            }
            C2263ek ekVar = new C2263ek(zzk.f8661a, zzfv.f8657e, zzfv.f8653a, zzfv.f8654b, c2);
            this.f8413j.mo14235r().mo14837w().mo14843a("Setting user property", this.f8413j.mo14326k().mo14826c(ekVar.f8444c), c2);
            mo14529d().mo14782f();
            try {
                m10927e(zzk);
                boolean a4 = mo14529d().mo14768a(ekVar);
                mo14529d().mo14785w();
                if (a4) {
                    this.f8413j.mo14235r().mo14837w().mo14843a("User property set", this.f8413j.mo14326k().mo14826c(ekVar.f8444c), ekVar.f8446e);
                } else {
                    this.f8413j.mo14235r().mo14830d_().mo14843a("Too many unique user properties are set. Ignoring user property", this.f8413j.mo14326k().mo14826c(ekVar.f8444c), ekVar.f8446e);
                    this.f8413j.mo14325j().mo14570a(zzk.f8661a, 9, (String) null, (String) null, 0);
                }
            } finally {
                mo14529d().mo14786x();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14523b(zzfv zzfv, zzk zzk) {
        m10931w();
        mo14536j();
        if (TextUtils.isEmpty(zzk.f8662b) && TextUtils.isEmpty(zzk.f8678r)) {
            return;
        }
        if (!zzk.f8668h) {
            m10927e(zzk);
            return;
        }
        this.f8413j.mo14235r().mo14837w().mo14842a("Removing user property", this.f8413j.mo14326k().mo14826c(zzfv.f8653a));
        mo14529d().mo14782f();
        try {
            m10927e(zzk);
            mo14529d().mo14773b(zzk.f8661a, zzfv.f8653a);
            mo14529d().mo14785w();
            this.f8413j.mo14235r().mo14837w().mo14842a("User property removed", this.f8413j.mo14326k().mo14826c(zzfv.f8653a));
        } finally {
            mo14529d().mo14786x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14512a(C2253eb ebVar) {
        this.f8419p++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo14539o() {
        this.f8420q++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C2166aw mo14540p() {
        return this.f8413j;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public final void mo14528c(zzk zzk) {
        int i;
        C2266en b;
        C2224d dVar;
        long j;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        boolean z;
        C2275ew d;
        String b2;
        zzk zzk2 = zzk;
        m10931w();
        mo14536j();
        C0926p.m1306a(zzk);
        C0926p.m1308a(zzk2.f8661a);
        if (!TextUtils.isEmpty(zzk2.f8662b) || !TextUtils.isEmpty(zzk2.f8678r)) {
            C2266en b3 = mo14529d().mo14771b(zzk2.f8661a);
            if (b3 != null && TextUtils.isEmpty(b3.mo14609d()) && !TextUtils.isEmpty(zzk2.f8662b)) {
                b3.mo14619g(0);
                mo14529d().mo14763a(b3);
                m10928s().mo14287d(zzk2.f8661a);
            }
            if (!zzk2.f8668h) {
                m10927e(zzk);
                return;
            }
            long j2 = zzk2.f8673m;
            if (j2 == 0) {
                j2 = this.f8413j.mo14230m().mo9996a();
            }
            int i2 = zzk2.f8674n;
            if (i2 == 0 || i2 == 1) {
                i = i2;
            } else {
                this.f8413j.mo14235r().mo14833i().mo14843a("Incorrect app type, assuming installed app. appId, appType", C2295r.m11413a(zzk2.f8661a), Integer.valueOf(i2));
                i = 0;
            }
            mo14529d().mo14782f();
            try {
                b = mo14529d().mo14771b(zzk2.f8661a);
                if (b != null) {
                    this.f8413j.mo14325j();
                    if (C2264el.m11027a(zzk2.f8662b, b.mo14609d(), zzk2.f8678r, b.mo14612e())) {
                        this.f8413j.mo14235r().mo14833i().mo14842a("New GMP App Id passed in. Removing cached database data. appId", C2295r.m11413a(b.mo14601b()));
                        d = mo14529d();
                        b2 = b.mo14601b();
                        d.mo14508k();
                        d.mo14221d();
                        C0926p.m1308a(b2);
                        SQLiteDatabase y = d.mo14787y();
                        String[] strArr = {b2};
                        int delete = y.delete("events", "app_id=?", strArr) + 0 + y.delete("user_attributes", "app_id=?", strArr) + y.delete("conditional_properties", "app_id=?", strArr) + y.delete("apps", "app_id=?", strArr) + y.delete("raw_events", "app_id=?", strArr) + y.delete("raw_events_metadata", "app_id=?", strArr) + y.delete("event_filters", "app_id=?", strArr) + y.delete("property_filters", "app_id=?", strArr) + y.delete("audience_filter_values", "app_id=?", strArr);
                        if (delete > 0) {
                            d.mo14235r().mo14838x().mo14843a("Deleted application data. app, records", b2, Integer.valueOf(delete));
                        }
                        b = null;
                    }
                }
            } catch (SQLiteException e) {
                d.mo14235r().mo14830d_().mo14843a("Error deleting application data. appId, error", C2295r.m11413a(b2), e);
            } catch (Throwable th) {
                mo14529d().mo14786x();
                throw th;
            }
            if (b != null) {
                if (b.mo14628k() != -2147483648L) {
                    if (b.mo14628k() != zzk2.f8670j) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", b.mo14626j());
                        mo14513a(new zzag("_au", new zzad(bundle), "auto", j2), zzk2);
                    }
                } else if (b.mo14626j() != null && !b.mo14626j().equals(zzk2.f8663c)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_pv", b.mo14626j());
                    mo14513a(new zzag("_au", new zzad(bundle2), "auto", j2), zzk2);
                }
            }
            m10927e(zzk);
            if (i == 0) {
                dVar = mo14529d().mo14755a(zzk2.f8661a, "_f");
            } else {
                dVar = i == 1 ? mo14529d().mo14755a(zzk2.f8661a, "_v") : null;
            }
            if (dVar == null) {
                long j3 = ((j2 / 3600000) + 1) * 3600000;
                if (i == 0) {
                    j = 1;
                    mo14515a(new zzfv("_fot", j2, Long.valueOf(j3), "auto"), zzk2);
                    if (this.f8413j.mo14317b().mo14737n(zzk2.f8662b)) {
                        m10931w();
                        this.f8413j.mo14321f().mo14272a(zzk2.f8661a);
                    }
                    m10931w();
                    mo14536j();
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("_c", 1);
                    bundle3.putLong("_r", 1);
                    bundle3.putLong("_uwa", 0);
                    bundle3.putLong("_pfo", 0);
                    bundle3.putLong("_sys", 0);
                    bundle3.putLong("_sysu", 0);
                    if (this.f8413j.mo14317b().mo14743t(zzk2.f8661a)) {
                        bundle3.putLong("_et", 1);
                    }
                    if (this.f8413j.mo14317b().mo14733j(zzk2.f8661a) && zzk2.f8677q) {
                        bundle3.putLong("_dac", 1);
                    }
                    if (this.f8413j.mo14231n().getPackageManager() == null) {
                        this.f8413j.mo14235r().mo14830d_().mo14842a("PackageManager is null, first open report might be inaccurate. appId", C2295r.m11413a(zzk2.f8661a));
                    } else {
                        try {
                            packageInfo = C0771c.m904a(this.f8413j.mo14231n()).mo9540b(zzk2.f8661a, 0);
                        } catch (PackageManager.NameNotFoundException e2) {
                            this.f8413j.mo14235r().mo14830d_().mo14843a("Package info is null, first open report might be inaccurate. appId", C2295r.m11413a(zzk2.f8661a), e2);
                            packageInfo = null;
                        }
                        if (!(packageInfo == null || packageInfo.firstInstallTime == 0)) {
                            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                bundle3.putLong("_uwa", 1);
                                z = false;
                            } else {
                                z = true;
                            }
                            zzfv zzfv = r7;
                            zzfv zzfv2 = new zzfv("_fi", j2, Long.valueOf(z ? 1 : 0), "auto");
                            mo14515a(zzfv, zzk2);
                        }
                        try {
                            applicationInfo = C0771c.m904a(this.f8413j.mo14231n()).mo9535a(zzk2.f8661a, 0);
                        } catch (PackageManager.NameNotFoundException e3) {
                            this.f8413j.mo14235r().mo14830d_().mo14843a("Application info is null, first open report might be inaccurate. appId", C2295r.m11413a(zzk2.f8661a), e3);
                            applicationInfo = null;
                        }
                        if (applicationInfo != null) {
                            if ((applicationInfo.flags & 1) != 0) {
                                bundle3.putLong("_sys", 1);
                            }
                            if ((applicationInfo.flags & 128) != 0) {
                                bundle3.putLong("_sysu", 1);
                            }
                        }
                    }
                    C2275ew d2 = mo14529d();
                    String str = zzk2.f8661a;
                    C0926p.m1308a(str);
                    d2.mo14221d();
                    d2.mo14508k();
                    long h = d2.mo14784h(str, "first_open_count");
                    if (h >= 0) {
                        bundle3.putLong("_pfo", h);
                    }
                    mo14513a(new zzag("_f", new zzad(bundle3), "auto", j2), zzk2);
                } else {
                    j = 1;
                    if (i == 1) {
                        mo14515a(new zzfv("_fvt", j2, Long.valueOf(j3), "auto"), zzk2);
                        m10931w();
                        mo14536j();
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("_c", 1);
                        bundle4.putLong("_r", 1);
                        if (this.f8413j.mo14317b().mo14743t(zzk2.f8661a)) {
                            bundle4.putLong("_et", 1);
                        }
                        if (this.f8413j.mo14317b().mo14733j(zzk2.f8661a) && zzk2.f8677q) {
                            bundle4.putLong("_dac", 1);
                        }
                        mo14513a(new zzag("_v", new zzad(bundle4), "auto", j2), zzk2);
                    }
                }
                if (!this.f8413j.mo14317b().mo14723d(zzk2.f8661a, C2284h.f8550ao)) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putLong("_et", j);
                    if (this.f8413j.mo14317b().mo14743t(zzk2.f8661a)) {
                        bundle5.putLong("_fr", j);
                    }
                    mo14513a(new zzag("_e", new zzad(bundle5), "auto", j2), zzk2);
                }
            } else if (zzk2.f8669i) {
                mo14513a(new zzag("_cd", new zzad(new Bundle()), "auto", j2), zzk2);
            }
            mo14529d().mo14785w();
            mo14529d().mo14786x();
        }
    }

    @WorkerThread
    /* renamed from: a */
    private final zzk m10914a(String str) {
        String str2 = str;
        C2266en b = mo14529d().mo14771b(str2);
        if (b == null || TextUtils.isEmpty(b.mo14626j())) {
            this.f8413j.mo14235r().mo14837w().mo14842a("No app data available; dropping", str2);
            return null;
        }
        Boolean b2 = m10924b(b);
        if (b2 == null || b2.booleanValue()) {
            C2266en enVar = b;
            return new zzk(str, b.mo14609d(), b.mo14626j(), b.mo14628k(), b.mo14630l(), b.mo14632m(), b.mo14634n(), (String) null, b.mo14637o(), false, b.mo14618g(), enVar.mo14594B(), 0, 0, enVar.mo14595C(), enVar.mo14596D(), false, enVar.mo14612e());
        }
        this.f8413j.mo14235r().mo14830d_().mo14842a("App version does not match; dropping. appId", C2295r.m11413a(str));
        return null;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14517a(zzo zzo) {
        zzk a = m10914a(zzo.f8679a);
        if (a != null) {
            mo14518a(zzo, a);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14518a(zzo zzo, zzk zzk) {
        C0926p.m1306a(zzo);
        C0926p.m1308a(zzo.f8679a);
        C0926p.m1306a(zzo.f8680b);
        C0926p.m1306a(zzo.f8681c);
        C0926p.m1308a(zzo.f8681c.f8653a);
        m10931w();
        mo14536j();
        if (TextUtils.isEmpty(zzk.f8662b) && TextUtils.isEmpty(zzk.f8678r)) {
            return;
        }
        if (!zzk.f8668h) {
            m10927e(zzk);
            return;
        }
        zzo zzo2 = new zzo(zzo);
        boolean z = false;
        zzo2.f8683e = false;
        mo14529d().mo14782f();
        try {
            zzo d = mo14529d().mo14776d(zzo2.f8679a, zzo2.f8681c.f8653a);
            if (d != null && !d.f8680b.equals(zzo2.f8680b)) {
                this.f8413j.mo14235r().mo14833i().mo14844a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f8413j.mo14326k().mo14826c(zzo2.f8681c.f8653a), zzo2.f8680b, d.f8680b);
            }
            if (d != null && d.f8683e) {
                zzo2.f8680b = d.f8680b;
                zzo2.f8682d = d.f8682d;
                zzo2.f8686h = d.f8686h;
                zzo2.f8684f = d.f8684f;
                zzo2.f8687i = d.f8687i;
                zzo2.f8683e = d.f8683e;
                zzo2.f8681c = new zzfv(zzo2.f8681c.f8653a, d.f8681c.f8654b, zzo2.f8681c.mo14860a(), d.f8681c.f8657e);
            } else if (TextUtils.isEmpty(zzo2.f8684f)) {
                zzo2.f8681c = new zzfv(zzo2.f8681c.f8653a, zzo2.f8682d, zzo2.f8681c.mo14860a(), zzo2.f8681c.f8657e);
                zzo2.f8683e = true;
                z = true;
            }
            if (zzo2.f8683e) {
                zzfv zzfv = zzo2.f8681c;
                C2263ek ekVar = new C2263ek(zzo2.f8679a, zzo2.f8680b, zzfv.f8653a, zzfv.f8654b, zzfv.mo14860a());
                if (mo14529d().mo14768a(ekVar)) {
                    this.f8413j.mo14235r().mo14837w().mo14844a("User property updated immediately", zzo2.f8679a, this.f8413j.mo14326k().mo14826c(ekVar.f8444c), ekVar.f8446e);
                } else {
                    this.f8413j.mo14235r().mo14830d_().mo14844a("(2)Too many active user properties, ignoring", C2295r.m11413a(zzo2.f8679a), this.f8413j.mo14326k().mo14826c(ekVar.f8444c), ekVar.f8446e);
                }
                if (z && zzo2.f8687i != null) {
                    m10926b(new zzag(zzo2.f8687i, zzo2.f8682d), zzk);
                }
            }
            if (mo14529d().mo14769a(zzo2)) {
                this.f8413j.mo14235r().mo14837w().mo14844a("Conditional property added", zzo2.f8679a, this.f8413j.mo14326k().mo14826c(zzo2.f8681c.f8653a), zzo2.f8681c.mo14860a());
            } else {
                this.f8413j.mo14235r().mo14830d_().mo14844a("Too many conditional properties, ignoring", C2295r.m11413a(zzo2.f8679a), this.f8413j.mo14326k().mo14826c(zzo2.f8681c.f8653a), zzo2.f8681c.mo14860a());
            }
            mo14529d().mo14785w();
        } finally {
            mo14529d().mo14786x();
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14525b(zzo zzo) {
        zzk a = m10914a(zzo.f8679a);
        if (a != null) {
            mo14526b(zzo, a);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14526b(zzo zzo, zzk zzk) {
        C0926p.m1306a(zzo);
        C0926p.m1308a(zzo.f8679a);
        C0926p.m1306a(zzo.f8681c);
        C0926p.m1308a(zzo.f8681c.f8653a);
        m10931w();
        mo14536j();
        if (TextUtils.isEmpty(zzk.f8662b) && TextUtils.isEmpty(zzk.f8678r)) {
            return;
        }
        if (!zzk.f8668h) {
            m10927e(zzk);
            return;
        }
        mo14529d().mo14782f();
        try {
            m10927e(zzk);
            zzo d = mo14529d().mo14776d(zzo.f8679a, zzo.f8681c.f8653a);
            if (d != null) {
                this.f8413j.mo14235r().mo14837w().mo14843a("Removing conditional user property", zzo.f8679a, this.f8413j.mo14326k().mo14826c(zzo.f8681c.f8653a));
                mo14529d().mo14778e(zzo.f8679a, zzo.f8681c.f8653a);
                if (d.f8683e) {
                    mo14529d().mo14773b(zzo.f8679a, zzo.f8681c.f8653a);
                }
                if (zzo.f8689k != null) {
                    Bundle bundle = null;
                    if (zzo.f8689k.f8650b != null) {
                        bundle = zzo.f8689k.f8650b.mo14851b();
                    }
                    Bundle bundle2 = bundle;
                    m10926b(this.f8413j.mo14325j().mo14565a(zzo.f8679a, zzo.f8689k.f8649a, bundle2, d.f8680b, zzo.f8689k.f8652d, true, false), zzk);
                }
            } else {
                this.f8413j.mo14235r().mo14833i().mo14843a("Conditional user property doesn't exist", C2295r.m11413a(zzo.f8679a), this.f8413j.mo14326k().mo14826c(zzo.f8681c.f8653a));
            }
            mo14529d().mo14785w();
        } finally {
            mo14529d().mo14786x();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015a  */
    @android.support.annotation.WorkerThread
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2266en m10927e(com.google.android.gms.measurement.internal.zzk r9) {
        /*
            r8 = this;
            r8.m10931w()
            r8.mo14536j()
            com.google.android.gms.common.internal.C0926p.m1306a(r9)
            java.lang.String r0 = r9.f8661a
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r0)
            com.google.android.gms.measurement.internal.ew r0 = r8.mo14529d()
            java.lang.String r1 = r9.f8661a
            com.google.android.gms.measurement.internal.en r0 = r0.mo14771b(r1)
            com.google.android.gms.measurement.internal.aw r1 = r8.f8413j
            com.google.android.gms.measurement.internal.ad r1 = r1.mo14318c()
            java.lang.String r2 = r9.f8661a
            java.lang.String r1 = r1.mo14247b((java.lang.String) r2)
            r2 = 1
            if (r0 != 0) goto L_0x0042
            com.google.android.gms.measurement.internal.en r0 = new com.google.android.gms.measurement.internal.en
            com.google.android.gms.measurement.internal.aw r3 = r8.f8413j
            java.lang.String r4 = r9.f8661a
            r0.<init>(r3, r4)
            com.google.android.gms.measurement.internal.aw r3 = r8.f8413j
            com.google.android.gms.measurement.internal.el r3 = r3.mo14325j()
            java.lang.String r3 = r3.mo14584k()
            r0.mo14599a((java.lang.String) r3)
            r0.mo14611d((java.lang.String) r1)
        L_0x0040:
            r1 = 1
            goto L_0x005e
        L_0x0042:
            java.lang.String r3 = r0.mo14615f()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005d
            r0.mo14611d((java.lang.String) r1)
            com.google.android.gms.measurement.internal.aw r1 = r8.f8413j
            com.google.android.gms.measurement.internal.el r1 = r1.mo14325j()
            java.lang.String r1 = r1.mo14584k()
            r0.mo14599a((java.lang.String) r1)
            goto L_0x0040
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r3 = r9.f8662b
            java.lang.String r4 = r0.mo14609d()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0070
            java.lang.String r1 = r9.f8662b
            r0.mo14603b((java.lang.String) r1)
            r1 = 1
        L_0x0070:
            java.lang.String r3 = r9.f8678r
            java.lang.String r4 = r0.mo14612e()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0082
            java.lang.String r1 = r9.f8678r
            r0.mo14607c((java.lang.String) r1)
            r1 = 1
        L_0x0082:
            java.lang.String r3 = r9.f8671k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r9.f8671k
            java.lang.String r4 = r0.mo14618g()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x009c
            java.lang.String r1 = r9.f8671k
            r0.mo14614e((java.lang.String) r1)
            r1 = 1
        L_0x009c:
            long r3 = r9.f8665e
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f8665e
            long r5 = r0.mo14632m()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f8665e
            r0.mo14610d((long) r3)
            r1 = 1
        L_0x00b4:
            java.lang.String r3 = r9.f8663c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r3 = r9.f8663c
            java.lang.String r4 = r0.mo14626j()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r1 = r9.f8663c
            r0.mo14617f((java.lang.String) r1)
            r1 = 1
        L_0x00ce:
            long r3 = r9.f8670j
            long r5 = r0.mo14628k()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00de
            long r3 = r9.f8670j
            r0.mo14606c((long) r3)
            r1 = 1
        L_0x00de:
            java.lang.String r3 = r9.f8664d
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = r9.f8664d
            java.lang.String r4 = r0.mo14630l()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f4
            java.lang.String r1 = r9.f8664d
            r0.mo14620g((java.lang.String) r1)
            r1 = 1
        L_0x00f4:
            long r3 = r9.f8666f
            long r5 = r0.mo14634n()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0104
            long r3 = r9.f8666f
            r0.mo14613e((long) r3)
            r1 = 1
        L_0x0104:
            boolean r3 = r9.f8668h
            boolean r4 = r0.mo14637o()
            if (r3 == r4) goto L_0x0112
            boolean r1 = r9.f8668h
            r0.mo14600a((boolean) r1)
            r1 = 1
        L_0x0112:
            java.lang.String r3 = r9.f8667g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x012c
            java.lang.String r3 = r9.f8667g
            java.lang.String r4 = r0.mo14648z()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012c
            java.lang.String r1 = r9.f8667g
            r0.mo14623h((java.lang.String) r1)
            r1 = 1
        L_0x012c:
            long r3 = r9.f8672l
            long r5 = r0.mo14594B()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013c
            long r3 = r9.f8672l
            r0.mo14636o(r3)
            r1 = 1
        L_0x013c:
            boolean r3 = r9.f8675o
            boolean r4 = r0.mo14595C()
            if (r3 == r4) goto L_0x014a
            boolean r1 = r9.f8675o
            r0.mo14604b((boolean) r1)
            r1 = 1
        L_0x014a:
            boolean r3 = r9.f8676p
            boolean r4 = r0.mo14596D()
            if (r3 == r4) goto L_0x0158
            boolean r9 = r9.f8676p
            r0.mo14608c((boolean) r9)
            r1 = 1
        L_0x0158:
            if (r1 == 0) goto L_0x0161
            com.google.android.gms.measurement.internal.ew r9 = r8.mo14529d()
            r9.mo14763a((com.google.android.gms.measurement.internal.C2266en) r0)
        L_0x0161:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2254ec.m10927e(com.google.android.gms.measurement.internal.zzk):com.google.android.gms.measurement.internal.en");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo14530d(zzk zzk) {
        try {
            return (String) this.f8413j.mo14234q().mo14295a(new C2259eg(this, zzk)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f8413j.mo14235r().mo14830d_().mo14843a("Failed to get app instance id. appId", C2295r.m11413a(zzk.f8661a), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14521a(boolean z) {
        m10934z();
    }
}
