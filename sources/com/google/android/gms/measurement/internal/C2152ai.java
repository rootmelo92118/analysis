package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.measurement.internal.ai */
public final class C2152ai {

    /* renamed from: a */
    private final String f8077a;

    /* renamed from: b */
    private final String f8078b = null;

    /* renamed from: c */
    private boolean f8079c;

    /* renamed from: d */
    private String f8080d;

    /* renamed from: e */
    private final /* synthetic */ C2147ad f8081e;

    public C2152ai(C2147ad adVar, String str, String str2) {
        this.f8081e = adVar;
        C0926p.m1308a(str);
        this.f8077a = str;
    }

    @WorkerThread
    /* renamed from: a */
    public final String mo14269a() {
        if (!this.f8079c) {
            this.f8079c = true;
            this.f8080d = this.f8081e.m10423y().getString(this.f8077a, (String) null);
        }
        return this.f8080d;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14270a(String str) {
        if (!C2264el.m11033c(str, this.f8080d)) {
            SharedPreferences.Editor edit = this.f8081e.m10423y().edit();
            edit.putString(this.f8077a, str);
            edit.apply();
            this.f8080d = str;
        }
    }
}
