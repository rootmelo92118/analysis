package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.annotation.WorkerThread;
import android.support.p034v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.internal.measurement.C1904ax;
import com.google.android.gms.internal.measurement.C1905ay;
import com.google.android.gms.internal.measurement.C1906az;
import com.google.android.gms.internal.measurement.C1909bb;
import com.google.android.gms.internal.measurement.C1911bd;
import com.google.android.gms.internal.measurement.C1912be;
import com.google.android.gms.internal.measurement.C1913bf;
import com.google.android.gms.internal.measurement.C2106hv;
import com.google.android.gms.internal.measurement.C2107hw;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.aq */
public final class C2160aq extends C2253eb implements C2274ev {

    /* renamed from: b */
    private static int f8097b = 65535;

    /* renamed from: c */
    private static int f8098c = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f8099d = new ArrayMap();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f8100e = new ArrayMap();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f8101f = new ArrayMap();

    /* renamed from: g */
    private final Map<String, C1912be> f8102g = new ArrayMap();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f8103h = new ArrayMap();

    /* renamed from: i */
    private final Map<String, String> f8104i = new ArrayMap();

    C2160aq(C2254ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14289e() {
        return false;
    }

    @WorkerThread
    /* renamed from: h */
    private final void m10464h(String str) {
        mo14508k();
        mo14221d();
        C0926p.m1308a(str);
        if (this.f8102g.get(str) == null) {
            byte[] d = mo14294i().mo14777d(str);
            if (d == null) {
                this.f8099d.put(str, (Object) null);
                this.f8100e.put(str, (Object) null);
                this.f8101f.put(str, (Object) null);
                this.f8102g.put(str, (Object) null);
                this.f8104i.put(str, (Object) null);
                this.f8103h.put(str, (Object) null);
                return;
            }
            C1912be a = m10461a(str, d);
            this.f8099d.put(str, m10462a(a));
            m10463a(str, a);
            this.f8102g.put(str, a);
            this.f8104i.put(str, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final C1912be mo14279a(String str) {
        mo14508k();
        mo14221d();
        C0926p.m1308a(str);
        m10464h(str);
        return this.f8102g.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public final String mo14282b(String str) {
        mo14221d();
        return this.f8104i.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: c */
    public final void mo14284c(String str) {
        mo14221d();
        this.f8104i.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: d */
    public final void mo14287d(String str) {
        mo14221d();
        this.f8102g.remove(str);
    }

    @WorkerThread
    /* renamed from: a */
    public final String mo14280a(String str, String str2) {
        mo14221d();
        m10464h(str);
        Map map = this.f8099d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m10462a(C1912be beVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (!(beVar == null || beVar.f7435c == null)) {
            for (C1913bf bfVar : beVar.f7435c) {
                if (bfVar != null) {
                    arrayMap.put(bfVar.f7442a, bfVar.f7443b);
                }
            }
        }
        return arrayMap;
    }

    /* renamed from: a */
    private final void m10463a(String str, C1912be beVar) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (!(beVar == null || beVar.f7436d == null)) {
            for (C1911bd bdVar : beVar.f7436d) {
                if (TextUtils.isEmpty(bdVar.f7429a)) {
                    mo14235r().mo14833i().mo14841a("EventConfig contained null event name");
                } else {
                    String a = C2192bv.m10634a(bdVar.f7429a);
                    if (!TextUtils.isEmpty(a)) {
                        bdVar.f7429a = a;
                    }
                    arrayMap.put(bdVar.f7429a, bdVar.f7430b);
                    arrayMap2.put(bdVar.f7429a, bdVar.f7431c);
                    if (bdVar.f7432d != null) {
                        if (bdVar.f7432d.intValue() < f8098c || bdVar.f7432d.intValue() > f8097b) {
                            mo14235r().mo14833i().mo14843a("Invalid sampling rate. Event name, sample rate", bdVar.f7429a, bdVar.f7432d);
                        } else {
                            arrayMap3.put(bdVar.f7429a, bdVar.f7432d);
                        }
                    }
                }
            }
        }
        this.f8100e.put(str, arrayMap);
        this.f8101f.put(str, arrayMap2);
        this.f8103h.put(str, arrayMap3);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final boolean mo14281a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        String str3 = str;
        mo14508k();
        mo14221d();
        C0926p.m1308a(str);
        C1912be a = m10461a(str, bArr);
        if (a == null) {
            return false;
        }
        m10463a(str3, a);
        this.f8102g.put(str3, a);
        this.f8104i.put(str3, str2);
        this.f8099d.put(str3, m10462a(a));
        C2269eq h = mo14293h();
        C1904ax[] axVarArr = a.f7437e;
        C0926p.m1306a(axVarArr);
        for (C1904ax axVar : axVarArr) {
            for (C1905ay ayVar : axVar.f7396c) {
                String a2 = C2192bv.m10634a(ayVar.f7401b);
                if (a2 != null) {
                    ayVar.f7401b = a2;
                }
                for (C1906az azVar : ayVar.f7402c) {
                    String a3 = C2193bw.m10635a(azVar.f7411d);
                    if (a3 != null) {
                        azVar.f7411d = a3;
                    }
                }
            }
            for (C1909bb bbVar : axVar.f7395b) {
                String a4 = C2194bx.m10636a(bbVar.f7420b);
                if (a4 != null) {
                    bbVar.f7420b = a4;
                }
            }
        }
        h.mo14294i().mo14764a(str3, axVarArr);
        try {
            a.f7437e = null;
            bArr2 = new byte[a.mo14106e()];
            a.mo13499a(C2107hw.m10220a(bArr2, 0, bArr2.length));
        } catch (IOException e) {
            mo14235r().mo14833i().mo14843a("Unable to serialize reduced-size config. Storing full config instead. appId", C2295r.m11413a(str), e);
            bArr2 = bArr;
        }
        C2275ew i = mo14294i();
        C0926p.m1308a(str);
        i.mo14221d();
        i.mo14508k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) i.mo14787y().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                i.mo14235r().mo14830d_().mo14842a("Failed to update remote config (got 0). appId", C2295r.m11413a(str));
            }
        } catch (SQLiteException e2) {
            i.mo14235r().mo14830d_().mo14843a("Error storing remote config. appId", C2295r.m11413a(str), e2);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final boolean mo14283b(String str, String str2) {
        Boolean bool;
        mo14221d();
        m10464h(str);
        if (mo14290f(str) && C2264el.m11035e(str2)) {
            return true;
        }
        if (mo14292g(str) && C2264el.m11025a(str2)) {
            return true;
        }
        Map map = this.f8100e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public final boolean mo14285c(String str, String str2) {
        Boolean bool;
        mo14221d();
        m10464h(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = this.f8101f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: d */
    public final int mo14286d(String str, String str2) {
        Integer num;
        mo14221d();
        m10464h(str);
        Map map = this.f8103h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: e */
    public final long mo14288e(String str) {
        String a = mo14280a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(a)) {
            return 0;
        }
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException e) {
            mo14235r().mo14833i().mo14843a("Unable to parse timezone offset. appId", C2295r.m11413a(str), e);
            return 0;
        }
    }

    @WorkerThread
    /* renamed from: a */
    private final C1912be m10461a(String str, byte[] bArr) {
        if (bArr == null) {
            return new C1912be();
        }
        C2106hv a = C2106hv.m10191a(bArr, 0, bArr.length);
        C1912be beVar = new C1912be();
        try {
            beVar.mo13498a(a);
            mo14235r().mo14838x().mo14843a("Parsed config. version, gmp_app_id", beVar.f7433a, beVar.f7434b);
            return beVar;
        } catch (IOException e) {
            mo14235r().mo14833i().mo14843a("Unable to merge remote config. appId", C2295r.m11413a(str), e);
            return new C1912be();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14290f(String str) {
        return "1".equals(mo14280a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo14292g(String str) {
        return "1".equals(mo14280a(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2261ei mo14291g() {
        return super.mo14291g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2269eq mo14293h() {
        return super.mo14293h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C2275ew mo14294i() {
        return super.mo14294i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
