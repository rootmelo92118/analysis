package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.gx */
final class C1338gx {

    /* renamed from: a */
    private static final C1335gu f5420a = C1335gu.m6945a();

    /* renamed from: b */
    private static final float f5421b = ((Float) bre.m6321e().mo12778a(C1557p.f5907aO)).floatValue();

    /* renamed from: c */
    private static final long f5422c = ((Long) bre.m6321e().mo12778a(C1557p.f5905aM)).longValue();

    /* renamed from: d */
    private static final float f5423d = ((Float) bre.m6321e().mo12778a(C1557p.f5908aP)).floatValue();

    /* renamed from: e */
    private static final long f5424e = ((Long) bre.m6321e().mo12778a(C1557p.f5906aN)).longValue();

    /* renamed from: a */
    static boolean m6960a() {
        int i;
        int h = f5420a.mo12578h();
        int i2 = f5420a.mo12579i();
        int g = f5420a.mo12577g() + f5420a.mo12576f();
        int i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        if (h >= 16 || f5424e == 0) {
            i = f5423d != 0.0f ? ((int) (f5423d * ((float) h))) + 1 : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        } else {
            i = m6959a(f5424e, h);
        }
        if (i2 > i) {
            return false;
        }
        if (h < 16 && f5422c != 0) {
            i3 = m6959a(f5422c, h);
        } else if (f5421b != 0.0f) {
            i3 = (int) (f5421b * ((float) h));
        }
        if (g <= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m6959a(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }
}
