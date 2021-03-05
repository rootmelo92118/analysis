package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.g */
final class C1314g extends C1259e<Integer> {
    C1314g(int i, String str, Integer num) {
        super(i, str, num, (C1287f) null);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12511a(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(mo12510a(), ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12509a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo12510a(), ((Integer) mo12512b()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12508a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo12510a(), ((Integer) mo12512b()).intValue()));
    }
}
