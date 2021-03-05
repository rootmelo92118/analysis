package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class afi implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f1584a;

    afi(JsPromptResult jsPromptResult) {
        this.f1584a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1584a.cancel();
    }
}
