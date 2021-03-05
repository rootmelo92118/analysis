package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.p034v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.yl */
public final class C1812yl {

    /* renamed from: a */
    private final Object f6889a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private String f6890b = "";
    @GuardedBy("mLock")

    /* renamed from: c */
    private String f6891c = "";
    @GuardedBy("mLock")

    /* renamed from: d */
    private boolean f6892d = false;

    /* renamed from: e */
    private String f6893e = "";

    /* renamed from: a */
    public final void mo13266a(Context context, String str, String str2) {
        if (!m8509b(context, str, str2)) {
            m8508a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f6893e)) {
            C1772wz.m1624b("Creative is not pushed for this device.");
            m8508a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f6893e)) {
            C1772wz.m1624b("The app is not linked for creative preview.");
            m8513e(context, str, str2);
        } else if ("0".equals(this.f6893e)) {
            C1772wz.m1624b("Device is linked for in app preview.");
            m8508a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: a */
    public final void mo13267a(Context context, String str, String str2, @Nullable String str3) {
        boolean b = mo13269b();
        if (m8511c(context, str, str2)) {
            if (!b && !TextUtils.isEmpty(str3)) {
                mo13268b(context, str2, str3, str);
            }
            C1772wz.m1624b("Device is linked for debug signals.");
            m8508a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        m8513e(context, str, str2);
    }

    /* renamed from: b */
    private final boolean m8509b(Context context, String str, String str2) {
        String d = m8512d(context, m8510c(context, (String) bre.m6321e().mo12778a(C1557p.f6036cl), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            C1772wz.m1624b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d.trim());
            String optString = jSONObject.optString("gct");
            this.f6893e = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            synchronized (this.f6889a) {
                this.f6891c = optString;
            }
            return true;
        } catch (JSONException e) {
            C1772wz.m1627c("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m8511c(Context context, String str, String str2) {
        String d = m8512d(context, m8510c(context, (String) bre.m6321e().mo12778a(C1557p.f6037cm), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            C1772wz.m1624b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d.trim()).optString("debug_mode"));
            synchronized (this.f6889a) {
                this.f6892d = equals;
            }
            return equals;
        } catch (JSONException e) {
            C1772wz.m1627c("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* renamed from: d */
    private static String m8512d(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(C0008a.HEADER_USER_AGENT, zzbv.zzlf().mo13207b(context, str2));
        abg<String> a = new C1821yu(context).mo13281a(str, (Map<String, String>) hashMap);
        try {
            return (String) a.get((long) ((Integer) bre.m6321e().mo12778a(C1557p.f6039co)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String valueOf = String.valueOf(str);
            C1772wz.m1625b(valueOf.length() != 0 ? "Timeout while retriving a response from: ".concat(valueOf) : new String("Timeout while retriving a response from: "), e);
            a.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            String valueOf2 = String.valueOf(str);
            C1772wz.m1625b(valueOf2.length() != 0 ? "Interrupted while retriving a response from: ".concat(valueOf2) : new String("Interrupted while retriving a response from: "), e2);
            a.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            C1772wz.m1625b(valueOf3.length() != 0 ? "Error retriving a response from: ".concat(valueOf3) : new String("Error retriving a response from: "), e3);
            return null;
        }
    }

    /* renamed from: e */
    private final void m8513e(Context context, String str, String str2) {
        zzbv.zzlf();
        C1782xi.m8371a(context, m8510c(context, (String) bre.m6321e().mo12778a(C1557p.f6035ck), str, str2));
    }

    /* renamed from: b */
    public final void mo13268b(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m8510c(context, (String) bre.m6321e().mo12778a(C1557p.f6038cn), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzbv.zzlf();
        C1782xi.m8372a(context, str, buildUpon.build().toString());
    }

    /* renamed from: c */
    private final Uri m8510c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m8507a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: a */
    private final String m8507a(Context context) {
        String str;
        synchronized (this.f6889a) {
            if (TextUtils.isEmpty(this.f6890b)) {
                zzbv.zzlf();
                this.f6890b = C1782xi.m8391c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f6890b)) {
                    zzbv.zzlf();
                    this.f6890b = C1782xi.m8362a();
                    zzbv.zzlf();
                    C1782xi.m8388b(context, "debug_signals_id.txt", this.f6890b);
                }
            }
            str = this.f6890b;
        }
        return str;
    }

    /* renamed from: a */
    public final String mo13265a() {
        String str;
        synchronized (this.f6889a) {
            str = this.f6891c;
        }
        return str;
    }

    /* renamed from: b */
    public final boolean mo13269b() {
        boolean z;
        synchronized (this.f6889a) {
            z = this.f6892d;
        }
        return z;
    }

    /* renamed from: a */
    private final void m8508a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            C1772wz.m1628d("Can not create dialog without Activity Context");
        } else {
            C1782xi.f6838a.post(new C1813ym(this, context, str, z, z2));
        }
    }
}
