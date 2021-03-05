package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@C1598qn
public final class zzawo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawo> CREATOR = new C1734vo();

    /* renamed from: a */
    public final String f7127a;

    /* renamed from: b */
    public final String f7128b;

    /* renamed from: c */
    public final boolean f7129c;

    /* renamed from: d */
    public final boolean f7130d;

    /* renamed from: e */
    public final List<String> f7131e;

    /* renamed from: f */
    public final boolean f7132f;

    /* renamed from: g */
    public final boolean f7133g;

    /* renamed from: h */
    public final List<String> f7134h;

    public zzawo(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f7127a = str;
        this.f7128b = str2;
        this.f7129c = z;
        this.f7130d = z2;
        this.f7131e = list;
        this.f7132f = z3;
        this.f7133g = z4;
        this.f7134h = list2 == null ? new ArrayList<>() : list2;
    }

    @Nullable
    /* renamed from: a */
    public static zzawo m8617a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new zzawo(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), C1834zg.m8553a(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), C1834zg.m8553a(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f7127a, false);
        C0932b.m1377a(parcel, 3, this.f7128b, false);
        C0932b.m1379a(parcel, 4, this.f7129c);
        C0932b.m1379a(parcel, 5, this.f7130d);
        C0932b.m1386b(parcel, 6, this.f7131e, false);
        C0932b.m1379a(parcel, 7, this.f7132f);
        C0932b.m1379a(parcel, 8, this.f7133g);
        C0932b.m1386b(parcel, 9, this.f7134h, false);
        C0932b.m1365a(parcel, a);
    }
}
