package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.support.annotation.BinderThread;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.C0858g;
import com.google.android.gms.common.C0859h;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0984t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.ay */
public final class C2168ay extends C2287j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2254ec f8159a;

    /* renamed from: b */
    private Boolean f8160b;
    @Nullable

    /* renamed from: c */
    private String f8161c;

    public C2168ay(C2254ec ecVar) {
        this(ecVar, (String) null);
    }

    private C2168ay(C2254ec ecVar, @Nullable String str) {
        C0926p.m1306a(ecVar);
        this.f8159a = ecVar;
        this.f8161c = null;
    }

    @BinderThread
    /* renamed from: b */
    public final void mo14352b(zzk zzk) {
        m10573b(zzk, false);
        m10571a((Runnable) new C2169az(this, zzk));
    }

    @BinderThread
    /* renamed from: a */
    public final void mo14344a(zzag zzag, zzk zzk) {
        C0926p.m1306a(zzag);
        m10573b(zzk, false);
        m10571a((Runnable) new C2181bk(this, zzag, zzk));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzag mo14351b(zzag zzag, zzk zzk) {
        boolean z = false;
        if (!(!"_cmp".equals(zzag.f8649a) || zzag.f8650b == null || zzag.f8650b.mo14849a() == 0)) {
            String d = zzag.f8650b.mo14854d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && this.f8159a.mo14522b().mo14737n(zzk.f8661a))) {
                z = true;
            }
        }
        if (!z) {
            return zzag;
        }
        this.f8159a.mo14235r().mo14836v().mo14842a("Event has been filtered ", zzag.toString());
        return new zzag("_cmpx", zzag.f8650b, zzag.f8651c, zzag.f8652d);
    }

    @BinderThread
    /* renamed from: a */
    public final void mo14345a(zzag zzag, String str, String str2) {
        C0926p.m1306a(zzag);
        C0926p.m1308a(str);
        m10572a(str, true);
        m10571a((Runnable) new C2182bl(this, zzag, str));
    }

    @BinderThread
    /* renamed from: a */
    public final byte[] mo14350a(zzag zzag, String str) {
        C0926p.m1308a(str);
        C0926p.m1306a(zzag);
        m10572a(str, true);
        this.f8159a.mo14235r().mo14837w().mo14842a("Log and bundle. event", this.f8159a.mo14534h().mo14824a(zzag.f8649a));
        long c = this.f8159a.mo14230m().mo9998c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f8159a.mo14234q().mo14297b(new C2183bm(this, zzag, str)).get();
            if (bArr == null) {
                this.f8159a.mo14235r().mo14830d_().mo14842a("Log and bundle returned null. appId", C2295r.m11413a(str));
                bArr = new byte[0];
            }
            this.f8159a.mo14235r().mo14837w().mo14844a("Log and bundle processed. event, size, time_ms", this.f8159a.mo14534h().mo14824a(zzag.f8649a), Integer.valueOf(bArr.length), Long.valueOf((this.f8159a.mo14230m().mo9998c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f8159a.mo14235r().mo14830d_().mo14844a("Failed to log and bundle. appId, event, error", C2295r.m11413a(str), this.f8159a.mo14534h().mo14824a(zzag.f8649a), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: a */
    public final void mo14346a(zzfv zzfv, zzk zzk) {
        C0926p.m1306a(zzfv);
        m10573b(zzk, false);
        if (zzfv.mo14860a() == null) {
            m10571a((Runnable) new C2184bn(this, zzfv, zzk));
        } else {
            m10571a((Runnable) new C2185bo(this, zzfv, zzk));
        }
    }

    @BinderThread
    /* renamed from: a */
    public final List<zzfv> mo14338a(zzk zzk, boolean z) {
        m10573b(zzk, false);
        try {
            List<C2263ek> list = (List) this.f8159a.mo14234q().mo14295a(new C2186bp(this, zzk)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2263ek ekVar : list) {
                if (z || !C2264el.m11035e(ekVar.f8444c)) {
                    arrayList.add(new zzfv(ekVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f8159a.mo14235r().mo14830d_().mo14843a("Failed to get user attributes. appId", C2295r.m11413a(zzk.f8661a), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: a */
    public final void mo14347a(zzk zzk) {
        m10573b(zzk, false);
        m10571a((Runnable) new C2187bq(this, zzk));
    }

    @BinderThread
    /* renamed from: b */
    private final void m10573b(zzk zzk, boolean z) {
        C0926p.m1306a(zzk);
        m10572a(zzk.f8661a, false);
        this.f8159a.mo14535i().mo14576b(zzk.f8662b, zzk.f8678r);
    }

    @BinderThread
    /* renamed from: a */
    private final void m10572a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f8160b == null) {
                        if (!"com.google.android.gms".equals(this.f8161c) && !C0984t.m1517a(this.f8159a.mo14231n(), Binder.getCallingUid())) {
                            if (!C0859h.m1143a(this.f8159a.mo14231n()).mo9742a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f8160b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f8160b = Boolean.valueOf(z2);
                    }
                    if (this.f8160b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f8159a.mo14235r().mo14830d_().mo14842a("Measurement Service called with invalid calling package. appId", C2295r.m11413a(str));
                    throw e;
                }
            }
            if (this.f8161c == null && C0858g.uidHasPackageName(this.f8159a.mo14231n(), Binder.getCallingUid(), str)) {
                this.f8161c = str;
            }
            if (!str.equals(this.f8161c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f8159a.mo14235r().mo14830d_().mo14841a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @BinderThread
    /* renamed from: a */
    public final void mo14343a(long j, String str, String str2, String str3) {
        m10571a((Runnable) new C2188br(this, str2, str3, str, j));
    }

    @BinderThread
    /* renamed from: c */
    public final String mo14353c(zzk zzk) {
        m10573b(zzk, false);
        return this.f8159a.mo14530d(zzk);
    }

    @BinderThread
    /* renamed from: a */
    public final void mo14349a(zzo zzo, zzk zzk) {
        C0926p.m1306a(zzo);
        C0926p.m1306a(zzo.f8681c);
        m10573b(zzk, false);
        zzo zzo2 = new zzo(zzo);
        zzo2.f8679a = zzk.f8661a;
        if (zzo.f8681c.mo14860a() == null) {
            m10571a((Runnable) new C2172bb(this, zzo2, zzk));
        } else {
            m10571a((Runnable) new C2173bc(this, zzo2, zzk));
        }
    }

    @BinderThread
    /* renamed from: a */
    public final void mo14348a(zzo zzo) {
        C0926p.m1306a(zzo);
        C0926p.m1306a(zzo.f8681c);
        m10572a(zzo.f8679a, true);
        zzo zzo2 = new zzo(zzo);
        if (zzo.f8681c.mo14860a() == null) {
            m10571a((Runnable) new C2174bd(this, zzo2));
        } else {
            m10571a((Runnable) new C2175be(this, zzo2));
        }
    }

    @BinderThread
    /* renamed from: a */
    public final List<zzfv> mo14342a(String str, String str2, boolean z, zzk zzk) {
        m10573b(zzk, false);
        try {
            List<C2263ek> list = (List) this.f8159a.mo14234q().mo14295a(new C2176bf(this, zzk, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2263ek ekVar : list) {
                if (z || !C2264el.m11035e(ekVar.f8444c)) {
                    arrayList.add(new zzfv(ekVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f8159a.mo14235r().mo14830d_().mo14843a("Failed to get user attributes. appId", C2295r.m11413a(zzk.f8661a), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: a */
    public final List<zzfv> mo14341a(String str, String str2, String str3, boolean z) {
        m10572a(str, true);
        try {
            List<C2263ek> list = (List) this.f8159a.mo14234q().mo14295a(new C2177bg(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2263ek ekVar : list) {
                if (z || !C2264el.m11035e(ekVar.f8444c)) {
                    arrayList.add(new zzfv(ekVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f8159a.mo14235r().mo14830d_().mo14843a("Failed to get user attributes. appId", C2295r.m11413a(str), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: a */
    public final List<zzo> mo14339a(String str, String str2, zzk zzk) {
        m10573b(zzk, false);
        try {
            return (List) this.f8159a.mo14234q().mo14295a(new C2178bh(this, zzk, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f8159a.mo14235r().mo14830d_().mo14842a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: a */
    public final List<zzo> mo14340a(String str, String str2, String str3) {
        m10572a(str, true);
        try {
            return (List) this.f8159a.mo14234q().mo14295a(new C2179bi(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f8159a.mo14235r().mo14830d_().mo14842a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: d */
    public final void mo14354d(zzk zzk) {
        m10572a(zzk.f8661a, false);
        m10571a((Runnable) new C2180bj(this, zzk));
    }

    /* renamed from: a */
    private final void m10571a(Runnable runnable) {
        C0926p.m1306a(runnable);
        if (!C2284h.f8537ab.mo14804b().booleanValue() || !this.f8159a.mo14234q().mo14299g()) {
            this.f8159a.mo14234q().mo14296a(runnable);
        } else {
            runnable.run();
        }
    }
}
