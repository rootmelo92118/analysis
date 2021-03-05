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
/* renamed from: com.google.android.gms.internal.ads.aw */
public final class C1120aw extends C1229cx implements C1136bj {

    /* renamed from: a */
    private String f2743a;

    /* renamed from: b */
    private List<C1085at> f2744b;

    /* renamed from: c */
    private String f2745c;

    /* renamed from: d */
    private C1210ce f2746d;

    /* renamed from: e */
    private String f2747e;

    /* renamed from: f */
    private String f2748f;
    @Nullable

    /* renamed from: g */
    private C1068ap f2749g;

    /* renamed from: h */
    private Bundle f2750h;
    @Nullable

    /* renamed from: i */
    private btb f2751i;
    @Nullable

    /* renamed from: j */
    private View f2752j;
    @Nullable

    /* renamed from: k */
    private C0719a f2753k;
    @Nullable

    /* renamed from: l */
    private String f2754l;

    /* renamed from: m */
    private Object f2755m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1133bg f2756n;

    public C1120aw(String str, List<C1085at> list, String str2, C1210ce ceVar, String str3, String str4, @Nullable C1068ap apVar, Bundle bundle, btb btb, View view, C0719a aVar, String str5) {
        this.f2743a = str;
        this.f2744b = list;
        this.f2745c = str2;
        this.f2746d = ceVar;
        this.f2747e = str3;
        this.f2748f = str4;
        this.f2749g = apVar;
        this.f2750h = bundle;
        this.f2751i = btb;
        this.f2752j = view;
        this.f2753k = aVar;
        this.f2754l = str5;
    }

    /* renamed from: a */
    public final String mo11090a() {
        return "1";
    }

    /* renamed from: b */
    public final String mo11093b() {
        return "";
    }

    /* renamed from: e */
    public final String mo11328e() {
        return this.f2743a;
    }

    /* renamed from: g */
    public final C0719a mo11329g() {
        return this.f2753k;
    }

    @Nullable
    /* renamed from: h */
    public final String mo11330h() {
        return this.f2754l;
    }

    /* renamed from: f */
    public final List mo11236f() {
        return this.f2744b;
    }

    /* renamed from: i */
    public final String mo11331i() {
        return this.f2745c;
    }

    /* renamed from: j */
    public final C1210ce mo11332j() {
        return this.f2746d;
    }

    /* renamed from: k */
    public final String mo11333k() {
        return this.f2747e;
    }

    /* renamed from: l */
    public final String mo11334l() {
        return this.f2748f;
    }

    /* renamed from: m */
    public final btb mo11335m() {
        return this.f2751i;
    }

    /* renamed from: n */
    public final C0719a mo11336n() {
        return C0722b.m769a(this.f2756n);
    }

    /* renamed from: a */
    public final void mo11092a(C1133bg bgVar) {
        synchronized (this.f2755m) {
            this.f2756n = bgVar;
        }
    }

    /* renamed from: c */
    public final C1068ap mo11094c() {
        return this.f2749g;
    }

    /* renamed from: o */
    public final Bundle mo11337o() {
        return this.f2750h;
    }

    /* renamed from: d */
    public final View mo11095d() {
        return this.f2752j;
    }

    /* renamed from: p */
    public final C1204bz mo11338p() {
        return this.f2749g;
    }

    /* renamed from: q */
    public final void mo11339q() {
        C1782xi.f6838a.post(new C1121ax(this));
        this.f2743a = null;
        this.f2744b = null;
        this.f2745c = null;
        this.f2746d = null;
        this.f2747e = null;
        this.f2748f = null;
        this.f2749g = null;
        this.f2750h = null;
        this.f2755m = null;
        this.f2751i = null;
        this.f2752j = null;
    }

    /* renamed from: a */
    public final void mo11325a(Bundle bundle) {
        synchronized (this.f2755m) {
            if (this.f2756n == null) {
                C1772wz.m1626c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f2756n.mo11881b(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo11326b(Bundle bundle) {
        synchronized (this.f2755m) {
            if (this.f2756n == null) {
                C1772wz.m1626c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f2756n.mo11880a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final void mo11327c(Bundle bundle) {
        synchronized (this.f2755m) {
            if (this.f2756n == null) {
                C1772wz.m1626c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f2756n.mo11883c(bundle);
            }
        }
    }
}
