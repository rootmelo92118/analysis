package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.yg */
final /* synthetic */ class C1807yg implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C1805ye f6880a;

    /* renamed from: b */
    private final int f6881b;

    /* renamed from: c */
    private final int f6882c;

    /* renamed from: d */
    private final int f6883d;

    C1807yg(C1805ye yeVar, int i, int i2, int i3) {
        this.f6880a = yeVar;
        this.f6881b = i;
        this.f6882c = i2;
        this.f6883d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6880a.mo13249a(this.f6881b, this.f6882c, this.f6883d, dialogInterface, i);
    }
}
