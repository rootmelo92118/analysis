package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@C1598qn
public final class agx extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f1726a;

    /* renamed from: b */
    private Context f1727b;

    /* renamed from: c */
    private Context f1728c;

    public agx(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void setBaseContext(Context context) {
        this.f1727b = context.getApplicationContext();
        this.f1726a = context instanceof Activity ? (Activity) context : null;
        this.f1728c = context;
        super.setBaseContext(this.f1727b);
    }

    public final void startActivity(Intent intent) {
        if (this.f1726a != null) {
            this.f1726a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f1727b.startActivity(intent);
    }

    /* renamed from: a */
    public final Activity mo10488a() {
        return this.f1726a;
    }

    public final Object getSystemService(String str) {
        return this.f1728c.getSystemService(str);
    }

    /* renamed from: b */
    public final Context mo10489b() {
        return this.f1728c;
    }
}
