package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.zg */
public final class C1834zg {

    /* renamed from: a */
    private static final C1836zi<Map<String, ?>> f6928a = new C1835zh();

    @NonNull
    /* renamed from: a */
    public static List<String> m8553a(@Nullable JSONArray jSONArray, @Nullable List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONObject m8554a(JSONObject jSONObject, String... strArr) {
        int i = 0;
        while (true) {
            if (i >= strArr.length - 1) {
                break;
            } else if (jSONObject == null) {
                jSONObject = null;
                break;
            } else {
                jSONObject = jSONObject.optJSONObject(strArr[i]);
                i++;
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONObject(strArr[strArr.length - 1]);
    }
}
