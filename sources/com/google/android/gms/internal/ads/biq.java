package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import android.text.TextUtils;

public final class biq {

    /* renamed from: a */
    public final String f4408a;

    /* renamed from: b */
    public final String f4409b;

    /* renamed from: c */
    public final boolean f4410c;

    /* renamed from: d */
    public final boolean f4411d;

    /* renamed from: e */
    public final int f4412e;

    /* renamed from: f */
    public final int f4413f;

    /* renamed from: g */
    public final int f4414g;

    /* renamed from: h */
    public final boolean f4415h;

    /* renamed from: i */
    public final boolean f4416i;

    /* renamed from: j */
    public final int f4417j;

    /* renamed from: k */
    public final int f4418k;

    /* renamed from: l */
    public final boolean f4419l;

    public biq() {
        this((String) null, (String) null, false, true, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true, true, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true);
    }

    private biq(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.f4408a = null;
        this.f4409b = null;
        this.f4410c = false;
        this.f4411d = true;
        this.f4412e = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f4413f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f4414g = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f4415h = true;
        this.f4416i = true;
        this.f4417j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f4418k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f4419l = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        biq biq = (biq) obj;
        return this.f4411d == biq.f4411d && this.f4412e == biq.f4412e && this.f4413f == biq.f4413f && this.f4415h == biq.f4415h && this.f4416i == biq.f4416i && this.f4419l == biq.f4419l && this.f4417j == biq.f4417j && this.f4418k == biq.f4418k && this.f4414g == biq.f4414g && TextUtils.equals((CharSequence) null, (CharSequence) null) && TextUtils.equals((CharSequence) null, (CharSequence) null);
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.f4411d ? 1 : 0)) * 31) + this.f4412e) * 31) + this.f4413f) * 31) + this.f4414g) * 31) + (this.f4415h ? 1 : 0)) * 31) + (this.f4416i ? 1 : 0)) * 31) + (this.f4419l ? 1 : 0)) * 31) + this.f4417j) * 31) + this.f4418k;
    }
}
