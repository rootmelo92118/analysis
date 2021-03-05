package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.ad */
public final class C1019ad {

    /* renamed from: a */
    private boolean f1372a;

    /* renamed from: b */
    private final List<C1016aa> f1373b = new LinkedList();

    /* renamed from: c */
    private final Map<String, String> f1374c = new LinkedHashMap();

    /* renamed from: d */
    private final Object f1375d = new Object();

    /* renamed from: e */
    private String f1376e;
    @Nullable

    /* renamed from: f */
    private C1019ad f1377f;

    public C1019ad(boolean z, String str, String str2) {
        this.f1372a = z;
        this.f1374c.put("action", str);
        this.f1374c.put("ad_format", str2);
    }

    /* renamed from: a */
    public final void mo10151a(@Nullable C1019ad adVar) {
        synchronized (this.f1375d) {
            this.f1377f = adVar;
        }
    }

    /* renamed from: a */
    public final C1016aa mo10149a() {
        return mo10150a(zzbv.zzlm().mo9997b());
    }

    @Nullable
    /* renamed from: a */
    public final C1016aa mo10150a(long j) {
        if (!this.f1372a) {
            return null;
        }
        return new C1016aa(j, (String) null, (C1016aa) null);
    }

    /* renamed from: a */
    public final boolean mo10155a(@Nullable C1016aa aaVar, String... strArr) {
        if (!this.f1372a || aaVar == null) {
            return false;
        }
        return mo10154a(aaVar, zzbv.zzlm().mo9997b(), strArr);
    }

    /* renamed from: a */
    public final boolean mo10154a(C1016aa aaVar, long j, String... strArr) {
        synchronized (this.f1375d) {
            for (String aaVar2 : strArr) {
                this.f1373b.add(new C1016aa(j, aaVar2, aaVar));
            }
        }
        return true;
    }

    /* renamed from: b */
    public final String mo10156b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f1375d) {
            for (C1016aa next : this.f1373b) {
                long a = next.mo10024a();
                String b = next.mo10025b();
                C1016aa c = next.mo10026c();
                if (c != null && a > 0) {
                    sb2.append(b);
                    sb2.append('.');
                    sb2.append(a - c.mo10024a());
                    sb2.append(',');
                }
            }
            this.f1373b.clear();
            if (!TextUtils.isEmpty(this.f1376e)) {
                sb2.append(this.f1376e);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public final void mo10152a(String str) {
        if (this.f1372a) {
            synchronized (this.f1375d) {
                this.f1376e = str;
            }
        }
    }

    /* renamed from: a */
    public final void mo10153a(String str, String str2) {
        C1638s a;
        if (this.f1372a && !TextUtils.isEmpty(str2) && (a = zzbv.zzlj().mo13116a()) != null) {
            synchronized (this.f1375d) {
                C1746w a2 = a.mo12932a(str);
                Map<String, String> map = this.f1374c;
                map.put(str, a2.mo13090a(map.get(str), str2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<String, String> mo10157c() {
        synchronized (this.f1375d) {
            C1638s a = zzbv.zzlj().mo13116a();
            if (a != null) {
                if (this.f1377f != null) {
                    Map<String, String> a2 = a.mo12933a(this.f1374c, this.f1377f.mo10157c());
                    return a2;
                }
            }
            Map<String, String> map = this.f1374c;
            return map;
        }
    }

    /* renamed from: d */
    public final C1016aa mo10158d() {
        synchronized (this.f1375d) {
        }
        return null;
    }
}
