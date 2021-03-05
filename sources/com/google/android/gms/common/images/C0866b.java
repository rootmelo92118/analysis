package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.C0924o;

/* renamed from: com.google.android.gms.common.images.b */
final class C0866b {

    /* renamed from: a */
    public final Uri f1004a;

    public C0866b(Uri uri) {
        this.f1004a = uri;
    }

    public final int hashCode() {
        return C0924o.m1301a(this.f1004a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0866b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C0924o.m1303a(((C0866b) obj).f1004a, this.f1004a);
    }
}
