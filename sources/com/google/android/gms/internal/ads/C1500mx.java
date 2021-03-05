package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.mx */
final class C1500mx implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C1499mw f5738a;

    C1500mx(C1499mw mwVar) {
        this.f5738a = mwVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent b = this.f5738a.mo12802b();
        zzbv.zzlf();
        C1782xi.m8370a(this.f5738a.f5732b, b);
    }
}
