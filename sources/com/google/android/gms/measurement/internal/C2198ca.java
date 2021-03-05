package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.measurement.internal.ca */
public final class C2198ca {

    /* renamed from: a */
    final Context f8236a;

    /* renamed from: b */
    String f8237b;

    /* renamed from: c */
    String f8238c;

    /* renamed from: d */
    String f8239d;

    /* renamed from: e */
    boolean f8240e = true;

    /* renamed from: f */
    Boolean f8241f;

    /* renamed from: g */
    C2290m f8242g;

    public C2198ca(Context context, C2290m mVar) {
        C0926p.m1306a(context);
        Context applicationContext = context.getApplicationContext();
        C0926p.m1306a(applicationContext);
        this.f8236a = applicationContext;
        if (mVar != null) {
            this.f8242g = mVar;
            this.f8237b = mVar.f8607f;
            this.f8238c = mVar.f8606e;
            this.f8239d = mVar.f8605d;
            this.f8240e = mVar.f8604c;
            if (mVar.f8608g != null) {
                this.f8241f = Boolean.valueOf(mVar.f8608g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
