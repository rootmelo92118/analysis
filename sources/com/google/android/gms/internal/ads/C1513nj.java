package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.nj */
public final class C1513nj extends C1514nk implements zzu<afl> {

    /* renamed from: a */
    private final afl f5782a;

    /* renamed from: b */
    private final Context f5783b;

    /* renamed from: c */
    private final WindowManager f5784c;

    /* renamed from: d */
    private final bug f5785d;

    /* renamed from: e */
    private DisplayMetrics f5786e;

    /* renamed from: f */
    private float f5787f;

    /* renamed from: g */
    private int f5788g = -1;

    /* renamed from: h */
    private int f5789h = -1;

    /* renamed from: i */
    private int f5790i;

    /* renamed from: j */
    private int f5791j = -1;

    /* renamed from: k */
    private int f5792k = -1;

    /* renamed from: l */
    private int f5793l = -1;

    /* renamed from: m */
    private int f5794m = -1;

    public C1513nj(afl afl, Context context, bug bug) {
        super(afl);
        this.f5782a = afl;
        this.f5783b = context;
        this.f5785d = bug;
        this.f5784c = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final void mo12825a(int i, int i2) {
        int i3 = 0;
        if (this.f5783b instanceof Activity) {
            i3 = zzbv.zzlf().mo13212c((Activity) this.f5783b)[0];
        }
        if (this.f5782a.mo10380s() == null || !this.f5782a.mo10380s().mo10494e()) {
            bre.m6317a();
            this.f5793l = C1851zx.m8592b(this.f5783b, this.f5782a.getWidth());
            bre.m6317a();
            this.f5794m = C1851zx.m8592b(this.f5783b, this.f5782a.getHeight());
        }
        mo12829b(i, i2 - i3, this.f5793l, this.f5794m);
        this.f5782a.mo10388u().mo10396a(i, i2);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        this.f5786e = new DisplayMetrics();
        Display defaultDisplay = this.f5784c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f5786e);
        this.f5787f = this.f5786e.density;
        this.f5790i = defaultDisplay.getRotation();
        bre.m6317a();
        this.f5788g = C1851zx.m8593b(this.f5786e, this.f5786e.widthPixels);
        bre.m6317a();
        this.f5789h = C1851zx.m8593b(this.f5786e, this.f5786e.heightPixels);
        Activity d = this.f5782a.mo10174d();
        if (d == null || d.getWindow() == null) {
            this.f5791j = this.f5788g;
            this.f5792k = this.f5789h;
        } else {
            zzbv.zzlf();
            int[] a = C1782xi.m8383a(d);
            bre.m6317a();
            this.f5791j = C1851zx.m8593b(this.f5786e, a[0]);
            bre.m6317a();
            this.f5792k = C1851zx.m8593b(this.f5786e, a[1]);
        }
        if (this.f5782a.mo10380s().mo10494e()) {
            this.f5793l = this.f5788g;
            this.f5794m = this.f5789h;
        } else {
            this.f5782a.measure(0, 0);
        }
        mo12827a(this.f5788g, this.f5789h, this.f5791j, this.f5792k, this.f5787f, this.f5790i);
        this.f5782a.mo10444a("onDeviceFeaturesReceived", new C1510ng(new C1512ni().mo12821b(this.f5785d.mo12485a()).mo12820a(this.f5785d.mo12486b()).mo12822c(this.f5785d.mo12488d()).mo12823d(this.f5785d.mo12487c()).mo12824e(true)).mo12819a());
        int[] iArr = new int[2];
        this.f5782a.getLocationOnScreen(iArr);
        bre.m6317a();
        int b = C1851zx.m8592b(this.f5783b, iArr[0]);
        bre.m6317a();
        mo12825a(b, C1851zx.m8592b(this.f5783b, iArr[1]));
        if (C1772wz.m1623a(2)) {
            C1772wz.m1628d("Dispatching Ready Event.");
        }
        mo12830b(this.f5782a.mo10180i().f7135a);
    }
}
