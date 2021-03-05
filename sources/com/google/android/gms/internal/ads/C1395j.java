package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.j */
final class C1395j extends C1259e<String> {
    C1395j(int i, String str, String str2) {
        super(i, str, str2, (C1287f) null);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12511a(SharedPreferences.Editor editor, Object obj) {
        editor.putString(mo12510a(), (String) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12509a(JSONObject jSONObject) {
        return jSONObject.optString(mo12510a(), (String) mo12512b());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12508a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo12510a(), (String) mo12512b());
    }
}
