package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class afg implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f1582a;

    afg(JsResult jsResult) {
        this.f1582a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1582a.confirm();
    }
}
