package com.google.firebase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.C0929s;
import com.google.android.gms.common.util.C0983s;

/* renamed from: com.google.firebase.b */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public final class C2337b {

    /* renamed from: a */
    private final String f8757a;

    /* renamed from: b */
    private final String f8758b;

    /* renamed from: c */
    private final String f8759c;

    /* renamed from: d */
    private final String f8760d;

    /* renamed from: e */
    private final String f8761e;

    /* renamed from: f */
    private final String f8762f;

    /* renamed from: g */
    private final String f8763g;

    private C2337b(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        C0926p.m1313a(!C0983s.m1516a(str), (Object) "ApplicationId must be set.");
        this.f8758b = str;
        this.f8757a = str2;
        this.f8759c = str3;
        this.f8760d = str4;
        this.f8761e = str5;
        this.f8762f = str6;
        this.f8763g = str7;
    }

    /* renamed from: a */
    public static C2337b m11543a(Context context) {
        C0929s sVar = new C0929s(context);
        String a = sVar.mo9915a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C2337b(a, sVar.mo9915a("google_api_key"), sVar.mo9915a("firebase_database_url"), sVar.mo9915a("ga_trackingId"), sVar.mo9915a("gcm_defaultSenderId"), sVar.mo9915a("google_storage_bucket"), sVar.mo9915a("project_id"));
    }

    /* renamed from: a */
    public final String mo14913a() {
        return this.f8758b;
    }

    /* renamed from: b */
    public final String mo14914b() {
        return this.f8761e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2337b)) {
            return false;
        }
        C2337b bVar = (C2337b) obj;
        if (!C0924o.m1303a(this.f8758b, bVar.f8758b) || !C0924o.m1303a(this.f8757a, bVar.f8757a) || !C0924o.m1303a(this.f8759c, bVar.f8759c) || !C0924o.m1303a(this.f8760d, bVar.f8760d) || !C0924o.m1303a(this.f8761e, bVar.f8761e) || !C0924o.m1303a(this.f8762f, bVar.f8762f) || !C0924o.m1303a(this.f8763g, bVar.f8763g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0924o.m1301a(this.f8758b, this.f8757a, this.f8759c, this.f8760d, this.f8761e, this.f8762f, this.f8763g);
    }

    public final String toString() {
        return C0924o.m1302a((Object) this).mo9911a("applicationId", this.f8758b).mo9911a("apiKey", this.f8757a).mo9911a("databaseUrl", this.f8759c).mo9911a("gcmSenderId", this.f8761e).mo9911a("storageBucket", this.f8762f).mo9911a("projectId", this.f8763g).toString();
    }
}
