package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0888as;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.C0929s;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.c */
public final class C0819c {

    /* renamed from: a */
    private static final Object f890a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static C0819c f891b;

    /* renamed from: c */
    private final String f892c;

    /* renamed from: d */
    private final Status f893d;

    /* renamed from: e */
    private final boolean f894e;

    /* renamed from: f */
    private final boolean f895f;

    C0819c(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            z = resources.getInteger(identifier) == 0 ? false : z;
            this.f895f = !z;
        } else {
            this.f895f = false;
        }
        this.f894e = z;
        String a = C0888as.m1219a(context);
        a = a == null ? new C0929s(context).mo9915a("google_app_id") : a;
        if (TextUtils.isEmpty(a)) {
            this.f893d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f892c = null;
            return;
        }
        this.f892c = a;
        this.f893d = Status.f783a;
    }

    /* renamed from: a */
    public static Status m1055a(Context context) {
        Status status;
        C0926p.m1307a(context, (Object) "Context must not be null.");
        synchronized (f890a) {
            if (f891b == null) {
                f891b = new C0819c(context);
            }
            status = f891b.f893d;
        }
        return status;
    }

    /* renamed from: a */
    public static String m1057a() {
        return m1056a("getGoogleAppId").f892c;
    }

    /* renamed from: b */
    public static boolean m1058b() {
        return m1056a("isMeasurementExplicitlyDisabled").f895f;
    }

    /* renamed from: a */
    private static C0819c m1056a(String str) {
        C0819c cVar;
        synchronized (f890a) {
            if (f891b != null) {
                cVar = f891b;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return cVar;
    }
}
