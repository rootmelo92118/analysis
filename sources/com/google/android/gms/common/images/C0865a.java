package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.C0891b;
import com.google.android.gms.internal.base.zak;

/* renamed from: com.google.android.gms.common.images.a */
public abstract class C0865a {

    /* renamed from: a */
    final C0866b f1002a;

    /* renamed from: b */
    protected int f1003b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9757a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9755a(Context context, Bitmap bitmap, boolean z) {
        C0891b.m1222a((Object) bitmap);
        mo9757a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9756a(Context context, zak zak, boolean z) {
        Drawable drawable;
        if (this.f1003b != 0) {
            drawable = context.getResources().getDrawable(this.f1003b);
        } else {
            drawable = null;
        }
        mo9757a(drawable, z, false, false);
    }
}
