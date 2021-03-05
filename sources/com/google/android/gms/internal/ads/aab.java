package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.support.p034v4.app.NotificationCompat;
import android.util.JsonWriter;
import com.google.android.gms.common.util.C0967c;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.common.util.C0972h;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@C1598qn
public final class aab {

    /* renamed from: a */
    private static Object f1266a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f1267b = false;
    @GuardedBy("sLock")

    /* renamed from: c */
    private static boolean f1268c = false;

    /* renamed from: d */
    private static C0969e f1269d = C0972h.m1482d();

    /* renamed from: e */
    private static final Set<String> f1270e = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: f */
    private final List<String> f1271f;

    public aab() {
        this((String) null);
    }

    public aab(@Nullable String str) {
        List<String> list;
        if (!m1602c()) {
            list = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? "ad_request_".concat(valueOf2) : new String("ad_request_");
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? "network_request_".concat(valueOf3) : new String("network_request_");
                list = Arrays.asList(strArr2);
            }
        }
        this.f1271f = list;
    }

    /* renamed from: a */
    public final void mo10031a(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        HashMap hashMap;
        if (m1602c()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            m1598b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    /* renamed from: a */
    public final void mo10029a(String str, String str2, @Nullable Map<String, ?> map, @Nullable byte[] bArr) {
        if (m1602c()) {
            m1598b(str, str2, map, bArr);
        }
    }

    /* renamed from: b */
    private final void m1598b(String str, String str2, @Nullable Map<String, ?> map, @Nullable byte[] bArr) {
        m1592a("onNetworkRequest", (aah) new aac(str, str2, map, bArr));
    }

    /* renamed from: a */
    public final void mo10030a(HttpURLConnection httpURLConnection, int i) {
        String str;
        if (m1602c()) {
            m1599b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    aai.m1630e(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                    str = null;
                }
                m1597b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo10032a(@Nullable Map<String, ?> map, int i) {
        if (m1602c()) {
            m1599b(map, i);
            if (i < 200 || i >= 300) {
                m1597b((String) null);
            }
        }
    }

    /* renamed from: b */
    private final void m1599b(@Nullable Map<String, ?> map, int i) {
        m1592a("onNetworkResponse", (aah) new aad(i, map));
    }

    /* renamed from: a */
    public final void mo10028a(@Nullable String str) {
        if (m1602c() && str != null) {
            mo10033a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void mo10033a(byte[] bArr) {
        m1592a("onNetworkResponseBody", (aah) new aaf(bArr));
    }

    /* renamed from: b */
    private final void m1597b(@Nullable String str) {
        m1592a("onNetworkRequestError", (aah) new aag(str));
    }

    /* renamed from: a */
    private static void m1590a(JsonWriter jsonWriter, @Nullable Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!f1270e.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            aai.m1626c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: a */
    private final void m1592a(String str, aah aah) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f1269d.mo9996a());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f1271f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            aah.mo10034a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            aai.m1625b("unable to log", e);
        }
        m1601c(stringWriter.toString());
    }

    /* renamed from: c */
    private static synchronized void m1601c(String str) {
        synchronized (aab.class) {
            aai.m1628d("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                aai.m1628d(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            aai.m1628d("GMA Debug FINISH");
        }
    }

    /* renamed from: a */
    public static void m1588a() {
        synchronized (f1266a) {
            f1267b = false;
            f1268c = false;
            aai.m1630e("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: a */
    public static void m1594a(boolean z) {
        synchronized (f1266a) {
            f1267b = true;
            f1268c = z;
        }
    }

    /* renamed from: b */
    public static boolean m1600b() {
        boolean z;
        synchronized (f1266a) {
            z = f1267b;
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m1602c() {
        boolean z;
        synchronized (f1266a) {
            z = f1267b && f1268c;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m1596a(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5909aQ)).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            aai.m1627c("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m1591a(String str, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m1595a(byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C0967c.m1462a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(a);
        } else {
            String a2 = C1851zx.m8585a(a);
            if (a2 != null) {
                jsonWriter.name("bodydigest").value(a2);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m1589a(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m1590a(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m1593a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m1590a(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(C0967c.m1462a(bArr));
        }
        jsonWriter.endObject();
    }
}
