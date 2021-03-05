package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class aff implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f1581a;

    aff(JsResult jsResult) {
        this.f1581a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1581a.cancel();
    }
}
