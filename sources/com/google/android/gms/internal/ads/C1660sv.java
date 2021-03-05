package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.sv */
public final class C1660sv {

    /* renamed from: A */
    private boolean f6423A = false;

    /* renamed from: B */
    private zzaso f6424B;

    /* renamed from: C */
    private boolean f6425C = false;

    /* renamed from: D */
    private String f6426D;

    /* renamed from: E */
    private List<String> f6427E;

    /* renamed from: F */
    private boolean f6428F;

    /* renamed from: G */
    private String f6429G;

    /* renamed from: H */
    private zzawo f6430H;

    /* renamed from: I */
    private boolean f6431I;

    /* renamed from: J */
    private boolean f6432J;

    /* renamed from: K */
    private boolean f6433K;

    /* renamed from: L */
    private boolean f6434L;

    /* renamed from: M */
    private String f6435M;

    /* renamed from: N */
    private final zzasi f6436N;

    /* renamed from: a */
    private String f6437a;

    /* renamed from: b */
    private String f6438b;

    /* renamed from: c */
    private String f6439c;

    /* renamed from: d */
    private List<String> f6440d;

    /* renamed from: e */
    private String f6441e;

    /* renamed from: f */
    private String f6442f;

    /* renamed from: g */
    private String f6443g;

    /* renamed from: h */
    private List<String> f6444h;

    /* renamed from: i */
    private List<String> f6445i;

    /* renamed from: j */
    private long f6446j = -1;

    /* renamed from: k */
    private boolean f6447k = false;

    /* renamed from: l */
    private final long f6448l = -1;

    /* renamed from: m */
    private List<String> f6449m;

    /* renamed from: n */
    private long f6450n = -1;

    /* renamed from: o */
    private int f6451o = -1;

    /* renamed from: p */
    private boolean f6452p = false;

    /* renamed from: q */
    private boolean f6453q = false;

    /* renamed from: r */
    private boolean f6454r = false;

    /* renamed from: s */
    private boolean f6455s = true;

    /* renamed from: t */
    private boolean f6456t = true;

    /* renamed from: u */
    private String f6457u = "";

    /* renamed from: v */
    private boolean f6458v = false;

    /* renamed from: w */
    private boolean f6459w = false;

    /* renamed from: x */
    private zzawd f6460x;

    /* renamed from: y */
    private List<String> f6461y;

    /* renamed from: z */
    private List<String> f6462z;

    /* renamed from: a */
    private static String m7895a(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: b */
    private static long m7896b(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return -1;
        }
        String str2 = (String) list.get(0);
        try {
            return (long) (Float.parseFloat(str2) * 1000.0f);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
            sb.append("Could not parse float from ");
            sb.append(str);
            sb.append(" header: ");
            sb.append(str2);
            C1772wz.m1630e(sb.toString());
            return -1;
        }
    }

    /* renamed from: c */
    private static List<String> m7897c(Map<String, List<String>> map, String str) {
        String str2;
        List list = map.get(str);
        if (list == null || list.isEmpty() || (str2 = (String) list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    /* renamed from: d */
    private static boolean m7898d(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    public C1660sv(zzasi zzasi, String str) {
        this.f6438b = str;
        this.f6436N = zzasi;
    }

    /* renamed from: a */
    public final zzasm mo12951a(long j, C1662sx sxVar) {
        String str;
        int i;
        zzasi zzasi = this.f6436N;
        String str2 = this.f6438b;
        String str3 = this.f6439c;
        List<String> list = this.f6440d;
        List<String> list2 = this.f6444h;
        long j2 = this.f6446j;
        boolean z = this.f6447k;
        List<String> list3 = this.f6449m;
        long j3 = this.f6450n;
        int i2 = this.f6451o;
        String str4 = this.f6437a;
        String str5 = this.f6442f;
        String str6 = this.f6443g;
        String str7 = str5;
        boolean z2 = this.f6452p;
        boolean z3 = this.f6453q;
        boolean z4 = this.f6454r;
        boolean z5 = this.f6455s;
        String str8 = this.f6457u;
        boolean z6 = this.f6458v;
        boolean z7 = this.f6459w;
        zzawd zzawd = this.f6460x;
        List<String> list4 = this.f6461y;
        List<String> list5 = this.f6462z;
        boolean z8 = this.f6423A;
        zzaso zzaso = this.f6424B;
        boolean z9 = this.f6425C;
        String str9 = this.f6426D;
        List<String> list6 = this.f6427E;
        boolean z10 = this.f6428F;
        String str10 = this.f6429G;
        zzawo zzawo = this.f6430H;
        String str11 = this.f6441e;
        boolean z11 = this.f6456t;
        boolean z12 = this.f6431I;
        boolean z13 = this.f6432J;
        if (sxVar.mo12960g()) {
            str = str4;
            i = 2;
        } else {
            str = str4;
            i = 1;
        }
        return new zzasm(zzasi, str2, str3, list, list2, j2, z, -1, list3, j3, i2, str, j, str7, str6, z2, z3, z4, z5, false, str8, z6, z7, zzawd, list4, list5, z8, zzaso, z9, str9, list6, z10, str10, zzawo, str11, z11, z12, z13, i, this.f6433K, this.f6445i, this.f6434L, this.f6435M, sxVar.mo12961h(), sxVar.mo12962i());
    }

    /* renamed from: a */
    public final void mo12952a(String str, Map<String, List<String>> map, String str2) {
        this.f6439c = str2;
        mo12953a(map);
    }

    /* renamed from: a */
    public final void mo12953a(Map<String, List<String>> map) {
        this.f6437a = m7895a(map, "X-Afma-Ad-Size");
        this.f6429G = m7895a(map, "X-Afma-Ad-Slot-Size");
        List<String> c = m7897c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f6440d = c;
        }
        this.f6441e = m7895a(map, "X-Afma-Debug-Signals");
        List list = map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f6442f = (String) list.get(0);
        }
        List<String> c2 = m7897c(map, "X-Afma-Tracking-Urls");
        if (c2 != null) {
            this.f6444h = c2;
        }
        List<String> c3 = m7897c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c3 != null) {
            this.f6445i = c3;
        }
        long b = m7896b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f6446j = b;
        }
        this.f6447k |= m7898d(map, "X-Afma-Mediation");
        List<String> c4 = m7897c(map, "X-Afma-Manual-Tracking-Urls");
        if (c4 != null) {
            this.f6449m = c4;
        }
        long b2 = m7896b(map, "X-Afma-Refresh-Rate");
        if (b2 != -1) {
            this.f6450n = b2;
        }
        List list2 = map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = (String) list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f6451o = zzbv.zzlh().mo13235b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f6451o = zzbv.zzlh().mo13222a();
            }
        }
        this.f6443g = m7895a(map, "X-Afma-ActiveView");
        List list3 = map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.f6454r = Boolean.valueOf((String) list3.get(0)).booleanValue();
        }
        this.f6452p |= m7898d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f6453q = "native".equals(m7895a(map, "X-Afma-Ad-Format"));
        List list4 = map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.f6455s = Boolean.valueOf((String) list4.get(0)).booleanValue();
        }
        List list5 = map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.f6456t = Boolean.valueOf((String) list5.get(0)).booleanValue();
        }
        List list6 = map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.f6457u = (String) list6.get(0);
        }
        String a = m7895a(map, "X-Afma-Fluid");
        if (a != null && a.equals("height")) {
            this.f6458v = true;
        }
        this.f6459w = "native_express".equals(m7895a(map, "X-Afma-Ad-Format"));
        this.f6460x = zzawd.m8615a(m7895a(map, "X-Afma-Rewards"));
        if (this.f6461y == null) {
            this.f6461y = m7897c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f6462z == null) {
            this.f6462z = m7897c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f6423A |= m7898d(map, "X-Afma-Use-Displayed-Impression");
        this.f6425C |= m7898d(map, "X-Afma-Auto-Collect-Location");
        this.f6426D = m7895a(map, "Set-Cookie");
        String a2 = m7895a(map, "X-Afma-Auto-Protection-Configuration");
        if (a2 == null || TextUtils.isEmpty(a2)) {
            Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f6442f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f6442f);
            }
            String builder = buildUpon.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(builder).length() + 31);
            sb.append(builder);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.f6424B = new zzaso(true, Arrays.asList(new String[]{sb.toString()}));
        } else {
            try {
                this.f6424B = zzaso.m8611a(new JSONObject(a2));
            } catch (JSONException e) {
                C1772wz.m1627c("Error parsing configuration JSON", e);
                this.f6424B = new zzaso();
            }
        }
        List<String> c5 = m7897c(map, "X-Afma-Remote-Ping-Urls");
        if (c5 != null) {
            this.f6427E = c5;
        }
        String a3 = m7895a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a3)) {
            try {
                this.f6430H = zzawo.m8617a(new JSONObject(a3));
            } catch (JSONException e2) {
                C1772wz.m1627c("Error parsing safe browsing header", e2);
            }
        }
        this.f6428F |= m7898d(map, "X-Afma-Render-In-Browser");
        String a4 = m7895a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a4)) {
            try {
                this.f6431I = new JSONObject(a4).getBoolean("never_pool");
            } catch (JSONException e3) {
                C1772wz.m1627c("Error parsing interstitial pool header", e3);
            }
        }
        this.f6432J = m7898d(map, "X-Afma-Custom-Close-Blocked");
        this.f6433K = m7898d(map, "X-Afma-Enable-Omid");
        this.f6434L = m7898d(map, "X-Afma-Disable-Closable-Area");
        this.f6435M = m7895a(map, "X-Afma-Omid-Settings");
    }
}
