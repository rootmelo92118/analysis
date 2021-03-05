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
/* renamed from: com.google.android.gms.internal.ads.bb */
public final class C1127bb extends C1261eb implements C1136bj {

    /* renamed from: a */
    private String f3381a;

    /* renamed from: b */
    private List<C1085at> f3382b;

    /* renamed from: c */
    private List<Object> f3383c;

    /* renamed from: d */
    private boolean f3384d;

    /* renamed from: e */
    private String f3385e;

    /* renamed from: f */
    private C1210ce f3386f;

    /* renamed from: g */
    private String f3387g;

    /* renamed from: h */
    private String f3388h;

    /* renamed from: i */
    private double f3389i;

    /* renamed from: j */
    private String f3390j;

    /* renamed from: k */
    private String f3391k;
    @Nullable

    /* renamed from: l */
    private C1068ap f3392l;
    @Nullable

    /* renamed from: m */
    private btb f3393m;
    @Nullable

    /* renamed from: n */
    private View f3394n;
    @Nullable

    /* renamed from: o */
    private C0719a f3395o;
    @Nullable

    /* renamed from: p */
    private String f3396p;

    /* renamed from: q */
    private Bundle f3397q;

    /* renamed from: r */
    private final Object f3398r = new Object();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C1133bg f3399s;

    public C1127bb(String str, List<C1085at> list, String str2, C1210ce ceVar, String str3, String str4, double d, String str5, String str6, @Nullable C1068ap apVar, btb btb, View view, C0719a aVar, String str7, Bundle bundle) {
        this.f3381a = str;
        this.f3382b = list;
        this.f3383c = null;
        this.f3384d = false;
        this.f3385e = str2;
        this.f3386f = ceVar;
        this.f3387g = str3;
        this.f3388h = str4;
        this.f3389i = d;
        this.f3390j = str5;
        this.f3391k = str6;
        this.f3392l = apVar;
        this.f3393m = btb;
        this.f3394n = view;
        this.f3395o = aVar;
        this.f3396p = str7;
        this.f3397q = bundle;
    }

    /* renamed from: a */
    public final String mo11090a() {
        return "6";
    }

    /* renamed from: a */
    public final void mo11585a(bst bst) {
    }

    /* renamed from: a */
    public final void mo11586a(bsx bsx) {
    }

    /* renamed from: b */
    public final String mo11093b() {
        return "";
    }

    /* renamed from: g */
    public final List mo11591g() {
        return null;
    }

    /* renamed from: h */
    public final boolean mo11592h() {
        return false;
    }

    /* renamed from: e */
    public final String mo11590e() {
        return this.f3381a;
    }

    /* renamed from: f */
    public final List mo11236f() {
        return this.f3382b;
    }

    /* renamed from: i */
    public final String mo11593i() {
        return this.f3385e;
    }

    /* renamed from: j */
    public final C1210ce mo11594j() {
        return this.f3386f;
    }

    /* renamed from: k */
    public final String mo11595k() {
        return this.f3387g;
    }

    /* renamed from: l */
    public final String mo11596l() {
        return this.f3388h;
    }

    /* renamed from: m */
    public final double mo11597m() {
        return this.f3389i;
    }

    /* renamed from: n */
    public final String mo11598n() {
        return this.f3390j;
    }

    /* renamed from: o */
    public final String mo11599o() {
        return this.f3391k;
    }

    /* renamed from: p */
    public final btb mo11600p() {
        return this.f3393m;
    }

    /* renamed from: q */
    public final C0719a mo11601q() {
        return C0722b.m769a(this.f3399s);
    }

    /* renamed from: a */
    public final void mo11092a(C1133bg bgVar) {
        synchronized (this.f3398r) {
            this.f3399s = bgVar;
        }
    }

    /* renamed from: c */
    public final C1068ap mo11094c() {
        return this.f3392l;
    }

    /* renamed from: d */
    public final View mo11095d() {
        return this.f3394n;
    }

    /* renamed from: r */
    public final C0719a mo11602r() {
        return this.f3395o;
    }

    @Nullable
    /* renamed from: s */
    public final String mo11603s() {
        return this.f3396p;
    }

    /* renamed from: t */
    public final Bundle mo11604t() {
        return this.f3397q;
    }

    /* renamed from: u */
    public final C1204bz mo11605u() {
        return this.f3392l;
    }

    /* renamed from: v */
    public final void mo11606v() {
        C1782xi.f6838a.post(new C1129bd(this));
    }

    /* renamed from: a */
    public final void mo11584a(Bundle bundle) {
        synchronized (this.f3398r) {
            if (this.f3399s == null) {
                C1772wz.m1626c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f3399s.mo11881b(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo11588b(Bundle bundle) {
        synchronized (this.f3398r) {
            if (this.f3399s == null) {
                C1772wz.m1626c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f3399s.mo11880a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final void mo11589c(Bundle bundle) {
        synchronized (this.f3398r) {
            if (this.f3399s == null) {
                C1772wz.m1626c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f3399s.mo11883c(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo11587a(C1256dx dxVar) {
        this.f3399s.mo11787a(dxVar);
    }

    /* renamed from: w */
    public final void mo11607w() {
        synchronized (this.f3398r) {
            if (this.f3399s != null) {
                this.f3399s.mo11794f();
            }
        }
    }

    /* renamed from: x */
    public final void mo11608x() {
        synchronized (this.f3398r) {
            if (this.f3399s != null) {
                this.f3399s.mo11795g();
            }
        }
    }

    /* renamed from: y */
    public final void mo11609y() {
        this.f3399s.mo11792d();
    }
}
