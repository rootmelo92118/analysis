package com.google.firebase.iid;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.z */
final class C2416z {

    /* renamed from: b */
    private static final long f8934b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f8935a;

    /* renamed from: c */
    private final String f8936c;

    /* renamed from: d */
    private final long f8937d;

    private C2416z(String str, String str2, long j) {
        this.f8935a = str;
        this.f8936c = str2;
        this.f8937d = j;
    }

    /* renamed from: a */
    static C2416z m11775a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C2416z(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2416z(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m11777a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m11776a(@Nullable C2416z zVar) {
        if (zVar == null) {
            return null;
        }
        return zVar.f8935a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo15048b(String str) {
        return System.currentTimeMillis() > this.f8937d + f8934b || !str.equals(this.f8936c);
    }
}
