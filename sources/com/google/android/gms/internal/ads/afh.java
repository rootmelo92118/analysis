package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class afh implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f1583a;

    afh(JsPromptResult jsPromptResult) {
        this.f1583a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f1583a.cancel();
    }
}
