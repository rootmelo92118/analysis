package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.f */
final class C1287f extends C1259e<Boolean> {
    C1287f(int i, String str, Boolean bool) {
        super(i, str, bool, (C1287f) null);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12511a(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(mo12510a(), ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12509a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo12510a(), ((Boolean) mo12512b()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12508a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo12510a(), ((Boolean) mo12512b()).booleanValue()));
    }
}
