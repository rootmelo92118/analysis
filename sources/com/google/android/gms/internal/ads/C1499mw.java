package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C0726R;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.mw */
public final class C1499mw extends C1514nk {

    /* renamed from: a */
    private final Map<String, String> f5731a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f5732b;

    /* renamed from: c */
    private String f5733c = m7644d("description");

    /* renamed from: d */
    private long f5734d = m7645e("start_ticks");

    /* renamed from: e */
    private long f5735e = m7645e("end_ticks");

    /* renamed from: f */
    private String f5736f = m7644d("summary");

    /* renamed from: g */
    private String f5737g = m7644d("location");

    public C1499mw(afl afl, Map<String, String> map) {
        super(afl, "createCalendarEvent");
        this.f5731a = map;
        this.f5732b = afl.mo10174d();
    }

    /* renamed from: d */
    private final String m7644d(String str) {
        return TextUtils.isEmpty(this.f5731a.get(str)) ? "" : this.f5731a.get(str);
    }

    /* renamed from: e */
    private final long m7645e(String str) {
        String str2 = this.f5731a.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo12801a() {
        if (this.f5732b == null) {
            mo12828a("Activity context is not available.");
            return;
        }
        zzbv.zzlf();
        if (!C1782xi.m8401f(this.f5732b).mo12488d()) {
            mo12828a("This feature is not available on the device.");
            return;
        }
        zzbv.zzlf();
        AlertDialog.Builder e = C1782xi.m8397e(this.f5732b);
        Resources g = zzbv.zzlj().mo13127g();
        e.setTitle(g != null ? g.getString(C0726R.string.f662s5) : "Create calendar event");
        e.setMessage(g != null ? g.getString(C0726R.string.f663s6) : "Allow Ad to create a calendar event?");
        e.setPositiveButton(g != null ? g.getString(C0726R.string.f660s3) : C0008a.HEADER_ACCEPT, new C1500mx(this));
        e.setNegativeButton(g != null ? g.getString(C0726R.string.f661s4) : "Decline", new C1501my(this));
        e.create().show();
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: b */
    public final Intent mo12802b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f5733c);
        data.putExtra("eventLocation", this.f5737g);
        data.putExtra("description", this.f5736f);
        if (this.f5734d > -1) {
            data.putExtra("beginTime", this.f5734d);
        }
        if (this.f5735e > -1) {
            data.putExtra("endTime", this.f5735e);
        }
        data.setFlags(268435456);
        return data;
    }
}
