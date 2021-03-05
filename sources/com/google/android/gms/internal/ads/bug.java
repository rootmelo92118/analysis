package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.p041a.C0771c;

@C1598qn
public final class bug {

    /* renamed from: a */
    private final Context f5288a;

    public bug(Context context) {
        C0926p.m1307a(context, (Object) "Context can not be null");
        this.f5288a = context;
    }

    /* renamed from: a */
    public final boolean mo12485a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m6571a(intent);
    }

    /* renamed from: b */
    public final boolean mo12486b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m6571a(intent);
    }

    /* renamed from: c */
    public final boolean mo12487c() {
        return ((Boolean) C1842zo.m8563a(this.f5288a, new buh())).booleanValue() && C0771c.m904a(this.f5288a).mo9533a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* renamed from: d */
    public final boolean mo12488d() {
        return m6571a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: a */
    private final boolean m6571a(Intent intent) {
        C0926p.m1307a(intent, (Object) "Intent can not be null");
        if (!this.f5288a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }
}
