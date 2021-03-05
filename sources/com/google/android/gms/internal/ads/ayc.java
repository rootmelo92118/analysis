package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

public final class ayc extends aza {

    /* renamed from: d */
    private final Activity f3110d;

    /* renamed from: e */
    private final View f3111e;

    public ayc(axq axq, String str, String str2, akd akd, int i, int i2, View view, Activity activity) {
        super(axq, str, str2, akd, i, 62);
        this.f3111e = view;
        this.f3110d = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        if (this.f3111e != null) {
            boolean booleanValue = ((Boolean) bre.m6321e().mo12778a(C1557p.f5978bg)).booleanValue();
            Object[] objArr = (Object[]) this.f3149c.invoke((Object) null, new Object[]{this.f3111e, this.f3110d, Boolean.valueOf(booleanValue)});
            synchronized (this.f3148b) {
                this.f3148b.f1897Q = Long.valueOf(((Long) objArr[0]).longValue());
                this.f3148b.f1898R = Long.valueOf(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f3148b.f1899S = (String) objArr[2];
                }
            }
        }
    }
}
