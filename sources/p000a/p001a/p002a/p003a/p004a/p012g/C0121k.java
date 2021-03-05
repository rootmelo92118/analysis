package p000a.p001a.p002a.p003a.p004a.p012g;

import android.support.p034v4.app.NotificationCompat;
import com.crashlytics.android.beta.BuildConfig;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.p004a.p006b.C0026k;
import p000a.p001a.p002a.p003a.p004a.p009d.C0080b;

/* renamed from: a.a.a.a.a.g.k */
/* compiled from: DefaultSettingsJsonTransform */
class C0121k implements C0134v {
    C0121k() {
    }

    /* renamed from: a */
    public C0132t mo270a(C0026k kVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C0132t(m340a(kVar, (long) optInt2, jSONObject), m341a(jSONObject.getJSONObject("app")), m345e(jSONObject.getJSONObject("session")), m346f(jSONObject.getJSONObject("prompt")), m343c(jSONObject.getJSONObject("features")), m344d(jSONObject.getJSONObject("analytics")), m347g(jSONObject.getJSONObject(BuildConfig.ARTIFACT_ID)), optInt, optInt2);
    }

    /* renamed from: a */
    private C0115e m341a(JSONObject jSONObject) {
        return new C0115e(jSONObject.getString("identifier"), jSONObject.getString(NotificationCompat.CATEGORY_STATUS), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false), (!jSONObject.has("icon") || !jSONObject.getJSONObject("icon").has("hash")) ? null : m342b(jSONObject.getJSONObject("icon")));
    }

    /* renamed from: b */
    private C0113c m342b(JSONObject jSONObject) {
        return new C0113c(jSONObject.getString("hash"), jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    /* renamed from: c */
    private C0123m m343c(JSONObject jSONObject) {
        return new C0123m(jSONObject.optBoolean("prompt_enabled", false), jSONObject.optBoolean("collect_logged_exceptions", true), jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_analytics", false), jSONObject.optBoolean("firebase_crashlytics_enabled", false));
    }

    /* renamed from: d */
    private C0112b m344d(JSONObject jSONObject) {
        return new C0112b(jSONObject.optString("url", "https://e.crashlytics.com/spi/v2/events"), jSONObject.optInt("flush_interval_secs", 600), jSONObject.optInt("max_byte_size_per_file", C0080b.MAX_BYTE_SIZE_PER_FILE), jSONObject.optInt("max_file_count_per_send", 1), jSONObject.optInt("max_pending_send_file_count", 100), jSONObject.optBoolean("forward_to_google_analytics", false), jSONObject.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject.optBoolean("track_custom_events", true), jSONObject.optBoolean("track_predefined_events", true), jSONObject.optInt("sampling_rate", 1), jSONObject.optBoolean("flush_on_background", true));
    }

    /* renamed from: e */
    private C0126p m345e(JSONObject jSONObject) {
        return new C0126p(jSONObject.optInt("log_buffer_size", 64000), jSONObject.optInt("max_chained_exception_depth", 8), jSONObject.optInt("max_custom_exception_events", 64), jSONObject.optInt("max_custom_key_value_pairs", 64), jSONObject.optInt("identifier_mask", 255), jSONObject.optBoolean("send_session_without_crash", false), jSONObject.optInt("max_complete_sessions_count", 4));
    }

    /* renamed from: f */
    private C0125o m346f(JSONObject jSONObject) {
        return new C0125o(jSONObject.optString("title", "Send Crash Report?"), jSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject.optString("send_button_title", "Send"), jSONObject.optBoolean("show_cancel_button", true), jSONObject.optString("cancel_button_title", "Don't Send"), jSONObject.optBoolean("show_always_send_button", true), jSONObject.optString("always_send_button_title", "Always Send"));
    }

    /* renamed from: g */
    private C0116f m347g(JSONObject jSONObject) {
        return new C0116f(jSONObject.optString("update_endpoint", C0133u.f288a), jSONObject.optInt("update_suspend_duration", 3600));
    }

    /* renamed from: a */
    private long m340a(C0026k kVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.getLong("expires_at");
        }
        return (j * 1000) + kVar.mo50a();
    }
}
