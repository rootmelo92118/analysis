package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class afj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f1585a;

    /* renamed from: b */
    private final /* synthetic */ EditText f1586b;

    afj(JsPromptResult jsPromptResult, EditText editText) {
        this.f1585a = jsPromptResult;
        this.f1586b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1585a.confirm(this.f1586b.getText().toString());
    }
}
