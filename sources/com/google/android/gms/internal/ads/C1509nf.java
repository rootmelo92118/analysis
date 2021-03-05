package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.nf */
final class C1509nf implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C1507nd f5771a;

    C1509nf(C1507nd ndVar) {
        this.f5771a = ndVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5771a.mo12828a("User canceled the download.");
    }
}
