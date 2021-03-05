package com.google.ads;

import android.support.p037v7.widget.helper.ItemTouchHelper;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@Deprecated
/* renamed from: com.google.ads.b */
public final class C0696b {

    /* renamed from: a */
    public static final C0696b f621a = new C0696b(-1, -2, "mb");

    /* renamed from: b */
    public static final C0696b f622b = new C0696b(ModuleDescriptor.MODULE_VERSION, 50, "mb");

    /* renamed from: c */
    public static final C0696b f623c = new C0696b(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "as");

    /* renamed from: d */
    public static final C0696b f624d = new C0696b(468, 60, "as");

    /* renamed from: e */
    public static final C0696b f625e = new C0696b(728, 90, "as");

    /* renamed from: f */
    public static final C0696b f626f = new C0696b(160, 600, "as");

    /* renamed from: g */
    private final AdSize f627g;

    public C0696b(AdSize adSize) {
        this.f627g = adSize;
    }

    private C0696b(int i, int i2, String str) {
        this(new AdSize(i, i2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0696b)) {
            return false;
        }
        return this.f627g.equals(((C0696b) obj).f627g);
    }

    public final int hashCode() {
        return this.f627g.hashCode();
    }

    /* renamed from: a */
    public final int mo8342a() {
        return this.f627g.getWidth();
    }

    /* renamed from: b */
    public final int mo8343b() {
        return this.f627g.getHeight();
    }

    public final String toString() {
        return this.f627g.toString();
    }
}
