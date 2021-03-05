package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.ym */
final class C1813ym implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f6894a;

    /* renamed from: b */
    private final /* synthetic */ String f6895b;

    /* renamed from: c */
    private final /* synthetic */ boolean f6896c;

    /* renamed from: d */
    private final /* synthetic */ boolean f6897d;

    C1813ym(C1812yl ylVar, Context context, String str, boolean z, boolean z2) {
        this.f6894a = context;
        this.f6895b = str;
        this.f6896c = z;
        this.f6897d = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f6894a);
        builder.setMessage(this.f6895b);
        if (this.f6896c) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f6897d) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new C1814yn(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
