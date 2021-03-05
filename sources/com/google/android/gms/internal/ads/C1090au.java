package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.au */
public final class C1090au extends C1225ct implements C1136bj {

    /* renamed from: a */
    private String f2527a;

    /* renamed from: b */
    private List<C1085at> f2528b;

    /* renamed from: c */
    private String f2529c;

    /* renamed from: d */
    private C1210ce f2530d;

    /* renamed from: e */
    private String f2531e;

    /* renamed from: f */
    private double f2532f;

    /* renamed from: g */
    private String f2533g;

    /* renamed from: h */
    private String f2534h;
    @Nullable

    /* renamed from: i */
    private C1068ap f2535i;

    /* renamed from: j */
    private Bundle f2536j;
    @Nullable

    /* renamed from: k */
    private btb f2537k;
    @Nullable

    /* renamed from: l */
    private View f2538l;
    @Nullable

    /* renamed from: m */
    private C0719a f2539m;
    @Nullable

    /* renamed from: n */
    private String f2540n;

    /* renamed from: o */
    private Object f2541o = new Object();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C1133bg f2542p;

    public C1090au(String str, List<C1085at> list, String str2, C1210ce ceVar, String str3, double d, String str4, String str5, @Nullable C1068ap apVar, Bundle bundle, btb btb, View view, C0719a aVar, String str6) {
        this.f2527a = str;
        this.f2528b = list;
        this.f2529c = str2;
        this.f2530d = ceVar;
        this.f2531e = str3;
        this.f2532f = d;
        this.f2533g = str4;
        this.f2534h = str5;
        this.f2535i = apVar;
        this.f2536j = bundle;
        this.f2537k = btb;
        this.f2538l = view;
        this.f2539m = aVar;
        this.f2540n = str6;
    }

    /* renamed from: a */
    public final String mo11090a() {
        return "2";
    }

    /* renamed from: b */
    public final String mo11093b() {
        return "";
    }

    /* renamed from: e */
    public final String mo11235e() {
        return this.f2527a;
    }

    /* renamed from: f */
    public final List mo11236f() {
        return this.f2528b;
    }

    /* renamed from: g */
    public final String mo11237g() {
        return this.f2529c;
    }

    /* renamed from: h */
    public final C1210ce mo11238h() {
        return this.f2530d;
    }

    /* renamed from: i */
    public final String mo11239i() {
        return this.f2531e;
    }

    /* renamed from: j */
    public final double mo11240j() {
        return this.f2532f;
    }

    /* renamed from: k */
    public final String mo11241k() {
        return this.f2533g;
    }

    /* renamed from: l */
    public final String mo11242l() {
        return this.f2534h;
    }

    /* renamed from: m */
    public final btb mo11243m() {
        return this.f2537k;
    }

    /* renamed from: n */
    public final C0719a mo11244n() {
        return C0722b.m769a(this.f2542p);
    }

    /* renamed from: a */
    public final void mo11092a(C1133bg bgVar) {
        synchronized (this.f2541o) {
            this.f2542p = bgVar;
        }
    }

    /* renamed from: c */
    public final C1068ap mo11094c() {
        return this.f2535i;
    }

    /* renamed from: o */
    public final Bundle mo11245o() {
        return this.f2536j;
    }

    /* renamed from: d */
    public final View mo11095d() {
        return this.f2538l;
    }

    /* renamed from: p */
    public final C0719a mo11246p() {
        return this.f2539m;
    }

    @Nullable
    /* renamed from: q */
    public final String mo11247q() {
        return this.f2540n;
    }

    /* renamed from: r */
    public final C1204bz mo11248r() {
        return this.f2535i;
    }

    /* renamed from: s */
    public final void mo11249s() {
        C1782xi.f6838a.post(new C1119av(this));
        this.f2527a = null;
        this.f2528b = null;
        this.f2529c = null;
        this.f2530d = null;
        this.f2531e = null;
        this.f2532f = 0.0d;
        this.f2533g = null;
        this.f2534h = null;
        this.f2535i = null;
        this.f2536j = null;
        this.f2541o = null;
        this.f2537k = null;
        this.f2538l = null;
    }

    /* renamed from: a */
    public final void mo11232a(Bundle bundle) {
        synchronized (this.f2541o) {
            if (this.f2542p == null) {
                C1772wz.m1626c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f2542p.mo11881b(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo11233b(Bundle bundle) {
        synchronized (this.f2541o) {
            if (this.f2542p == null) {
                C1772wz.m1626c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f2542p.mo11880a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final void mo11234c(Bundle bundle) {
        synchronized (this.f2541o) {
            if (this.f2542p == null) {
                C1772wz.m1626c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f2542p.mo11883c(bundle);
            }
        }
    }
}
