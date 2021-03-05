package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class afd implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f1579a;

    afd(JsResult jsResult) {
        this.f1579a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f1579a.cancel();
    }
}
