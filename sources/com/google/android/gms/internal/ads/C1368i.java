package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.i */
final class C1368i extends C1259e<Float> {
    C1368i(int i, String str, Float f) {
        super(i, str, f, (C1287f) null);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12511a(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(mo12510a(), ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12509a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo12510a(), (double) ((Float) mo12512b()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12508a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo12510a(), ((Float) mo12512b()).floatValue()));
    }
}
