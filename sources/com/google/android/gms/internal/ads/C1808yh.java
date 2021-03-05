package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.yh */
final /* synthetic */ class C1808yh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C1805ye f6884a;

    /* renamed from: b */
    private final String f6885b;

    C1808yh(C1805ye yeVar, String str) {
        this.f6884a = yeVar;
        this.f6885b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6884a.mo13252a(this.f6885b, dialogInterface, i);
    }
}
