package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C0924o;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.c */
public final class C0867c extends C0865a {

    /* renamed from: c */
    private WeakReference<ImageManager.C0861a> f1005c;

    public final int hashCode() {
        return C0924o.m1301a(this.f1002a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0867c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0867c cVar = (C0867c) obj;
        ImageManager.C0861a aVar = (ImageManager.C0861a) this.f1005c.get();
        ImageManager.C0861a aVar2 = (ImageManager.C0861a) cVar.f1005c.get();
        return aVar2 != null && aVar != null && C0924o.m1303a(aVar2, aVar) && C0924o.m1303a(cVar.f1002a, this.f1002a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9757a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.C0861a aVar;
        if (!z2 && (aVar = (ImageManager.C0861a) this.f1005c.get()) != null) {
            aVar.mo9745a(this.f1002a.f1004a, drawable, z3);
        }
    }
}
