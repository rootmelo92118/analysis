package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0971g;
import com.google.android.gms.common.util.C0975k;
import com.google.android.gms.common.util.C0979o;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.xi */
public final class C1782xi {

    /* renamed from: a */
    public static final Handler f6838a = new C1775xb(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f6839b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f6840c = true;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: d */
    public String f6841d;

    /* renamed from: e */
    private boolean f6842e = false;

    /* renamed from: f */
    private boolean f6843f = false;
    @GuardedBy("this")

    /* renamed from: g */
    private Pattern f6844g;
    @GuardedBy("this")

    /* renamed from: h */
    private Pattern f6845h;

    /* renamed from: a */
    public final void mo13203a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty(C0008a.HEADER_USER_AGENT, mo13207b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static boolean m8380a(Context context) {
        boolean z;
        Context a = C1678tm.m7946a(context);
        Intent intent = new Intent();
        intent.setClassName(a, AdActivity.CLASS_NAME);
        try {
            ResolveInfo resolveActivity = a.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                C1772wz.m1630e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
                return false;
            }
            if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                C1772wz.m1630e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"keyboard"}));
                z = false;
            } else {
                z = true;
            }
            if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                C1772wz.m1630e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"keyboardHidden"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                C1772wz.m1630e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"orientation"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                C1772wz.m1630e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"screenLayout"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                C1772wz.m1630e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"uiMode"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
                C1772wz.m1630e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"screenSize"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
                return z;
            }
            C1772wz.m1630e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"smallestScreenSize"}));
            return false;
        } catch (Exception e) {
            C1772wz.m1627c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", e);
            zzbv.zzlj().mo13119a((Throwable) e, "AdUtil.hasAdActivity");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m8381a(Context context, String str) {
        Context a = C1678tm.m7946a(context);
        return C0771c.m904a(a).mo9534a(str, a.getPackageName()) == 0;
    }

    /* renamed from: a */
    public static void m8373a(Context context, String str, List<String> list) {
        for (String zlVar : list) {
            new C1839zl(context, str, zlVar).zzwa();
        }
    }

    /* renamed from: a */
    public static void m8372a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        m8373a(context, str, (List<String>) arrayList);
    }

    /* renamed from: a */
    public final void mo13204a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(avx.m4304a(activity))) {
                if (list == null) {
                    C1772wz.m8287a("Cannot ping urls: empty list.");
                } else if (!C1065an.m2853a(context)) {
                    C1772wz.m8287a("Cannot ping url because custom tabs is not supported");
                } else {
                    C1065an anVar = new C1065an();
                    anVar.mo10730a((C1066ao) new C1785xl(this, list, anVar, context));
                    anVar.mo10732b(activity);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m8365a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: b */
    public final boolean mo13209b(Context context) {
        if (this.f6842e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C1789xp(this, (C1785xl) null), intentFilter);
        this.f6842e = true;
        return true;
    }

    /* renamed from: c */
    public final boolean mo13211c(Context context) {
        if (this.f6843f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C1788xo(this, (C1785xl) null), intentFilter);
        this.f6843f = true;
        return true;
    }

    /* renamed from: a */
    public final void mo13201a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(mo13207b(context, str));
    }

    /* renamed from: d */
    private static String m8395d() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x003b, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7 A[Catch:{ Exception -> 0x00b6 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo13207b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f6839b
            monitor-enter(r0)
            java.lang.String r1 = r4.f6841d     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.f6841d     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = m8395d()     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x0013:
            com.google.android.gms.internal.ads.xq r1 = com.google.android.gms.ads.internal.zzbv.zzlh()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.mo13226a((android.content.Context) r5)     // Catch:{ Exception -> 0x001d }
            r4.f6841d = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.f6841d     // Catch:{ all -> 0x00d2 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.bre.m6317a()     // Catch:{ all -> 0x00d2 }
            boolean r1 = com.google.android.gms.internal.ads.C1851zx.m8595b()     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x0068
            r1 = 0
            r4.f6841d = r1     // Catch:{ all -> 0x00d2 }
            android.os.Handler r1 = f6838a     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.internal.ads.xm r2 = new com.google.android.gms.internal.ads.xm     // Catch:{ all -> 0x00d2 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00d2 }
            r1.post(r2)     // Catch:{ all -> 0x00d2 }
        L_0x003b:
            java.lang.String r1 = r4.f6841d     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x006e
            java.lang.Object r1 = r4.f6839b     // Catch:{ InterruptedException -> 0x0045 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = m8395d()     // Catch:{ all -> 0x00d2 }
            r4.f6841d = r1     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "Interrupted, use default user agent: "
            java.lang.String r2 = r4.f6841d     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00d2 }
            int r3 = r2.length()     // Catch:{ all -> 0x00d2 }
            if (r3 == 0) goto L_0x005e
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00d2 }
            goto L_0x0064
        L_0x005e:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00d2 }
            r2.<init>(r1)     // Catch:{ all -> 0x00d2 }
            r1 = r2
        L_0x0064:
            com.google.android.gms.internal.ads.C1772wz.m1630e(r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x003b
        L_0x0068:
            java.lang.String r1 = m8396d((android.content.Context) r5)     // Catch:{ all -> 0x00d2 }
            r4.f6841d = r1     // Catch:{ all -> 0x00d2 }
        L_0x006e:
            java.lang.String r1 = r4.f6841d     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            int r2 = r2.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00d2 }
            int r3 = r3.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r3.<init>(r2)     // Catch:{ all -> 0x00d2 }
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            r3.append(r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00d2 }
            r4.f6841d = r6     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.common.a.b r5 = com.google.android.gms.common.p041a.C0771c.m904a(r5)     // Catch:{ Exception -> 0x00b6 }
            boolean r5 = r5.mo9537a()     // Catch:{ Exception -> 0x00b6 }
            if (r5 == 0) goto L_0x00c0
            java.lang.String r5 = r4.f6841d     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b6 }
            r4.f6841d = r5     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00c0
        L_0x00b6:
            r5 = move-exception
            com.google.android.gms.internal.ads.wk r6 = com.google.android.gms.ads.internal.zzbv.zzlj()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo13119a((java.lang.Throwable) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00d2 }
        L_0x00c0:
            java.lang.String r5 = r4.f6841d     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00d2 }
            r4.f6841d = r5     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = r4.f6841d     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x00d2:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1782xi.mo13207b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    protected static String m8396d(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m8395d();
        }
    }

    /* renamed from: a */
    public static String m8366a(String str) {
        return Uri.parse(str).buildUpon().query((String) null).build().toString();
    }

    /* renamed from: a */
    public final JSONObject mo13200a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                m8377a(jSONObject, next, (Object) map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* renamed from: a */
    public final JSONObject mo13199a(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return m8369a(bundle);
        } catch (JSONException e) {
            C1772wz.m1625b("Error converting Bundle to JSON", e);
            return null;
        }
    }

    /* renamed from: a */
    private final JSONObject m8369a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m8377a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONArray m8368a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m8376a(jSONArray, (Object) a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final void m8376a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m8369a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(mo13200a((Map<String, ?>) (Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m8368a((Collection<?>) (Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object a : (Object[]) obj) {
                m8376a(jSONArray2, a);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private final void m8377a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m8369a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, mo13200a((Map<String, ?>) (Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m8368a((Collection<?>) (Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m8368a((Collection<?>) Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    public static Map<String, String> m8367a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : zzbv.zzlh().mo13228a(uri)) {
            hashMap.put(next, uri.getQueryParameter(next));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m8362a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    public static int m8384b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            C1772wz.m1630e(sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public static String m8386b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: e */
    private static int[] m8399e() {
        return new int[]{0, 0};
    }

    /* renamed from: a */
    public static int[] m8383a(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return m8399e();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* renamed from: b */
    public final int[] mo13210b(Activity activity) {
        int[] a = m8383a(activity);
        bre.m6317a();
        bre.m6317a();
        return new int[]{C1851zx.m8592b((Context) activity, a[0]), C1851zx.m8592b((Context) activity, a[1])};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo13212c(android.app.Activity r7) {
        /*
            r6 = this;
            android.view.Window r0 = r7.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = m8399e()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.bre.m6317a()
            r1 = r4[r3]
            int r1 = com.google.android.gms.internal.ads.C1851zx.m8592b((android.content.Context) r7, (int) r1)
            r0[r3] = r1
            com.google.android.gms.internal.ads.bre.m6317a()
            r1 = r4[r2]
            int r7 = com.google.android.gms.internal.ads.C1851zx.m8592b((android.content.Context) r7, (int) r1)
            r0[r2] = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1782xi.mo13212c(android.app.Activity):int[]");
    }

    /* renamed from: c */
    public static boolean m8393c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: a */
    public static DisplayMetrics m8358a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: e */
    public static AlertDialog.Builder m8397e(Context context) {
        return new AlertDialog.Builder(context);
    }

    /* renamed from: f */
    public static bug m8401f(Context context) {
        return new bug(context);
    }

    /* renamed from: a */
    public static Bitmap m8356a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public static PopupWindow m8360a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    /* renamed from: p */
    private static String m8410p(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static String m8363a(Context context, View view, zzwf zzwf) {
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5920ab)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzwf.f7296e);
            jSONObject2.put("height", zzwf.f7293b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m8410p(context));
            if (!zzwf.f7295d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            C1772wz.m1627c("Fail to get view hierarchy json", e);
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m8403g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || !m8411q(context)) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m8404h(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || !m8411q(context)) {
                                return true;
                            }
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: q */
    private static boolean m8411q(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return false;
        }
        return powerManager.isScreenOn();
    }

    /* renamed from: a */
    public final void mo13202a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            zzbv.zzlf();
            bundle.putString("device", m8386b());
            bundle.putString("eids", TextUtils.join(",", C1557p.m7740a()));
        }
        bre.m6317a();
        C1851zx.m8588a(context, str, str2, bundle, z, new C1787xn(this, context, str));
    }

    /* renamed from: b */
    public final void mo13208b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5917aY)).booleanValue()) {
            mo13202a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: a */
    public static void m8375a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            C1780xg.m8353a(runnable);
        }
    }

    /* renamed from: b */
    public static Bitmap m8385b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap f = m8400f(view);
        return f == null ? m8398e(view) : f;
    }

    /* renamed from: e */
    private static Bitmap m8398e(@NonNull View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            C1772wz.m1630e("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            C1772wz.m1625b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: f */
    private static Bitmap m8400f(@NonNull View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            C1772wz.m1625b("Fail to capture the web view", e);
        }
        return bitmap;
    }

    /* renamed from: i */
    public static Bitmap m8405i(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                return m8400f(window.getDecorView().getRootView());
            }
            return null;
        } catch (RuntimeException e) {
            C1772wz.m1625b("Fail to capture screen shot", e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m8370a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: j */
    public static int m8406j(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    /* renamed from: a */
    public final boolean mo13205a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return mo13206a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m8412r(context));
    }

    @Nullable
    /* renamed from: r */
    private static KeyguardManager m8412r(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13206a(android.view.View r4, android.os.PowerManager r5, android.app.KeyguardManager r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.xi r0 = com.google.android.gms.ads.internal.zzbv.zzlf()
            boolean r0 = r0.f6840c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            if (r6 != 0) goto L_0x000e
            r6 = 0
            goto L_0x0012
        L_0x000e:
            boolean r6 = r6.inKeyguardRestrictedInputMode()
        L_0x0012:
            if (r6 == 0) goto L_0x001d
            boolean r6 = m8392c((android.view.View) r4)
            if (r6 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r6 = 0
            goto L_0x001e
        L_0x001d:
            r6 = 1
        L_0x001e:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L_0x0063
            if (r5 == 0) goto L_0x0035
            boolean r5 = r5.isScreenOn()
            if (r5 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r5 = 0
            goto L_0x0036
        L_0x0035:
            r5 = 1
        L_0x0036:
            if (r5 == 0) goto L_0x0063
            if (r6 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.C1557p.f5914aV
            com.google.android.gms.internal.ads.m r6 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r5 = r6.mo12778a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0062
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r4.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x0062
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r4 = r4.getGlobalVisibleRect(r5)
            if (r4 == 0) goto L_0x0063
        L_0x0062:
            return r1
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1782xi.mo13206a(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8392c(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1782xi.m8392c(android.view.View):boolean");
    }

    @TargetApi(16)
    /* renamed from: k */
    public static boolean m8407k(Context context) {
        KeyguardManager r;
        if (context == null || !C0979o.m1502c() || (r = m8412r(context)) == null || !r.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m8394d(@Nullable View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: l */
    public static boolean m8408l(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            C1772wz.m1625b("Error loading class.", th);
            zzbv.zzlj().mo13119a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: c */
    public static Bundle m8389c() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5868C)).booleanValue()) {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            Runtime runtime = Runtime.getRuntime();
            bundle.putLong("runtime_free_memory", runtime.freeMemory());
            bundle.putLong("runtime_max_memory", runtime.maxMemory());
            bundle.putLong("runtime_total_memory", runtime.totalMemory());
            bundle.putInt("web_view_count", zzbv.zzlj().mo13130j());
        } catch (Exception e) {
            C1772wz.m1627c("Unable to gather memory stats", e);
        }
        return bundle;
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m8371a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m8387b(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            C1772wz.m1624b(sb.toString());
        } catch (ActivityNotFoundException e) {
            C1772wz.m1625b("No browser is found.", e);
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    public static void m8387b(Context context, Intent intent) {
        if (intent != null && C0979o.m1504e()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: b */
    public static void m8388b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e) {
            C1772wz.m1625b("Error writing to file in internal storage.", e);
        }
    }

    /* renamed from: c */
    public static String m8391c(Context context, String str) {
        try {
            return new String(C0975k.m1496a(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            C1772wz.m1624b("Error reading from internal storage.");
            return "";
        }
    }

    @TargetApi(24)
    /* renamed from: a */
    public static boolean m8379a(Activity activity, Configuration configuration) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6043cs)).booleanValue()) {
            return !activity.isInMultiWindowMode();
        }
        bre.m6317a();
        int a = C1851zx.m8582a((Context) activity, configuration.screenHeightDp);
        int a2 = C1851zx.m8582a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a3 = m8358a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a3.heightPixels;
        int i2 = a3.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", C0008a.ANDROID_CLIENT_TYPE);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) bre.m6321e().mo12778a(C1557p.f6040cp)).intValue();
        return m8378a(i, a + dimensionPixelSize, round) && m8378a(i2, a2, round);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.bre.m6321e().mo12778a(com.google.android.gms.internal.ads.C1557p.f5922ad)).equals(r3.f6844g.pattern()) == false) goto L_0x0025;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13213d(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f6844g     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.e<java.lang.String> r0 = com.google.android.gms.internal.ads.C1557p.f5922ad     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo12778a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f6844g     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.e<java.lang.String> r0 = com.google.android.gms.internal.ads.C1557p.f5922ad     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo12778a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f6844g = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f6844g     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1782xi.mo13213d(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.bre.m6321e().mo12778a(com.google.android.gms.internal.ads.C1557p.f5923ae)).equals(r3.f6845h.pattern()) == false) goto L_0x0025;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13214e(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f6845h     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.e<java.lang.String> r0 = com.google.android.gms.internal.ads.C1557p.f5923ae     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo12778a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f6845h     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.e<java.lang.String> r0 = com.google.android.gms.internal.ads.C1557p.f5923ae     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo12778a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f6845h = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f6845h     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1782xi.mo13214e(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static boolean m8378a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    /* renamed from: a */
    public static Bundle m8357a(bni bni) {
        String str;
        String str2;
        String str3;
        if (bni == null) {
            return null;
        }
        if (zzbv.zzlj().mo13131k().mo13175b() && zzbv.zzlj().mo13131k().mo13181d()) {
            return null;
        }
        if (bni.mo12246d()) {
            bni.mo12245c();
        }
        bnc b = bni.mo12244b();
        if (b != null) {
            str3 = b.mo12207b();
            str2 = b.mo12209c();
            str = b.mo12210d();
            if (str3 != null) {
                zzbv.zzlj().mo13131k().mo13167a(str3);
            }
            if (str != null) {
                zzbv.zzlj().mo13131k().mo13173b(str);
            }
        } else {
            str3 = zzbv.zzlj().mo13131k().mo13176c();
            str = zzbv.zzlj().mo13131k().mo13182e();
            str2 = null;
        }
        Bundle bundle = new Bundle(1);
        if (str != null && !zzbv.zzlj().mo13131k().mo13181d()) {
            bundle.putString("v_fp_vertical", str);
        }
        if (str3 != null && !zzbv.zzlj().mo13131k().mo13175b()) {
            bundle.putString("fingerprint", str3);
            if (!str3.equals(str2)) {
                bundle.putString("v_fp", str2);
            }
        }
        if (!bundle.isEmpty()) {
            return bundle;
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public static WebResourceResponse m8390c(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(C0008a.HEADER_USER_AGENT, zzbv.zzlf().mo13207b(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new C1821yu(context).mo13281a(str2, (Map<String, String>) hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            C1772wz.m1627c("Could not fetch MRAID JS.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static WebResourceResponse m8359a(HttpURLConnection httpURLConnection) {
        String trim;
        String str;
        zzbv.zzlf();
        String contentType = httpURLConnection.getContentType();
        if (TextUtils.isEmpty(contentType)) {
            trim = "";
        } else {
            trim = contentType.split(";")[0].trim();
        }
        String str2 = trim;
        zzbv.zzlf();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        str = "";
        String str3 = str;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return zzbv.zzlh().mo13224a(str2, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: a */
    public static void m8374a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = ((Boolean) bre.m6321e().mo12778a(C1557p.f6051d)).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                C0971g.m1480a(context, th);
            }
        }
    }

    @Deprecated
    /* renamed from: m */
    public final String mo13215m(Context context) {
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6013cO)).booleanValue()) {
            return "";
        }
        try {
            return (String) C1780xg.m8354a(new C1783xj(this, context)).get();
        } catch (InterruptedException unused) {
            Thread.interrupted();
            return "";
        } catch (ExecutionException unused2) {
            return "";
        }
    }

    @Deprecated
    /* renamed from: n */
    public final Bundle mo13216n(Context context) {
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6014cP)).booleanValue()) {
            return null;
        }
        try {
            return (Bundle) C1780xg.m8354a(new C1784xk(this, context)).get();
        } catch (InterruptedException unused) {
            Thread.interrupted();
            return null;
        } catch (ExecutionException unused2) {
            return null;
        }
    }

    /* renamed from: o */
    public static boolean m8409o(Context context) {
        Window window;
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m8402f(String str) {
        if (!aab.m1602c()) {
            return false;
        }
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6048cx)).booleanValue()) {
            return false;
        }
        String str2 = (String) bre.m6321e().mo12778a(C1557p.f6050cz);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) bre.m6321e().mo12778a(C1557p.f6049cy);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
