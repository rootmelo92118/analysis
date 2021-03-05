package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.h */
final class C1341h extends C1259e<Long> {
    C1341h(int i, String str, Long l) {
        super(i, str, l, (C1287f) null);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12511a(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(mo12510a(), ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12509a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo12510a(), ((Long) mo12512b()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12508a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo12510a(), ((Long) mo12512b()).longValue()));
    }
}
