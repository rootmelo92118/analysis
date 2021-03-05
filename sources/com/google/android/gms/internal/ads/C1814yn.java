package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.yn */
final class C1814yn implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C1813ym f6898a;

    C1814yn(C1813ym ymVar) {
        this.f6898a = ymVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbv.zzlf();
        C1782xi.m8371a(this.f6898a.f6894a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
