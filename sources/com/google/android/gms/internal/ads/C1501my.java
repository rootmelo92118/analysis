package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.my */
final class C1501my implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C1499mw f5739a;

    C1501my(C1499mw mwVar) {
        this.f5739a = mwVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5739a.mo12828a("Operation denied by user.");
    }
}
