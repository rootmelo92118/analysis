package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ox */
public final class C1554ox implements Callable<C1752wf> {

    /* renamed from: a */
    private static long f5848a = 10;

    /* renamed from: b */
    private final Context f5849b;

    /* renamed from: c */
    private final C1821yu f5850c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzbb f5851d;

    /* renamed from: e */
    private final awy f5852e;

    /* renamed from: f */
    private final C1575pr f5853f;

    /* renamed from: g */
    private final Object f5854g = new Object();

    /* renamed from: h */
    private final C1753wg f5855h;

    /* renamed from: i */
    private final C1019ad f5856i;

    /* renamed from: j */
    private boolean f5857j;

    /* renamed from: k */
    private int f5858k;

    /* renamed from: l */
    private List<String> f5859l;

    /* renamed from: m */
    private JSONObject f5860m;

    /* renamed from: n */
    private String f5861n;
    @Nullable

    /* renamed from: o */
    private String f5862o;

    public C1554ox(Context context, zzbb zzbb, C1821yu yuVar, awy awy, C1753wg wgVar, C1019ad adVar) {
        this.f5849b = context;
        this.f5851d = zzbb;
        this.f5850c = yuVar;
        this.f5855h = wgVar;
        this.f5852e = awy;
        this.f5856i = adVar;
        this.f5853f = zzbb.zzkn();
        this.f5857j = false;
        this.f5858k = -2;
        this.f5859l = null;
        this.f5861n = null;
        this.f5862o = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r3.length() != 0) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0178 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017a A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ec A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0221  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1752wf call() {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
            com.google.android.gms.ads.internal.zzbb r2 = r15.f5851d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r11 = r2.getUuid()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r2 = r15.m7731b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r2 != 0) goto L_0x006e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.wg r3 = r15.f5855h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasm r3 = r3.f6725b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r3 = r3.f7083b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r2.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.wg r4 = r15.f5855h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasm r4 = r4.f6725b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = r4.f7083b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            int r4 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = r3.optJSONArray(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x0037
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x0038
        L_0x0037:
            r3 = r1
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 != 0) goto L_0x0044
        L_0x0040:
            r3 = 3
            r15.m7725a((int) r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x0044:
            com.google.android.gms.internal.ads.pr r3 = r15.f5853f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.abg r2 = r3.mo12883a(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            long r3 = f5848a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.Object r2 = r2.get(r3, r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r3 = "success"
            boolean r3 = r2.optBoolean(r3, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = "json"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r3 = "ads"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            org.json.JSONObject r2 = r2.getJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r8 = r2
            goto L_0x006f
        L_0x006e:
            r8 = r1
        L_0x006f:
            if (r8 == 0) goto L_0x0078
            java.lang.String r2 = "enable_omid"
            boolean r2 = r8.optBoolean(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            if (r2 != 0) goto L_0x0081
            com.google.android.gms.internal.ads.abf r3 = com.google.android.gms.internal.ads.aau.m1646a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x007f:
            r12 = r3
            goto L_0x00af
        L_0x0081:
            java.lang.String r3 = "omid_settings"
            org.json.JSONObject r3 = r8.optJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 != 0) goto L_0x008e
            com.google.android.gms.internal.ads.abf r3 = com.google.android.gms.internal.ads.aau.m1646a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x007f
        L_0x008e:
            java.lang.String r4 = "omid_html"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 == 0) goto L_0x009f
            com.google.android.gms.internal.ads.abf r3 = com.google.android.gms.internal.ads.aau.m1646a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x007f
        L_0x009f:
            com.google.android.gms.internal.ads.abf r4 = com.google.android.gms.internal.ads.aau.m1646a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.oy r5 = new com.google.android.gms.internal.ads.oy     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r5.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.util.concurrent.Executor r3 = com.google.android.gms.internal.ads.abl.f1313a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.abg r3 = com.google.android.gms.internal.ads.aau.m1648a(r4, r5, (java.util.concurrent.Executor) r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x007f
        L_0x00af:
            boolean r3 = r15.m7731b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 != 0) goto L_0x016d
            if (r8 != 0) goto L_0x00b9
            goto L_0x016d
        L_0x00b9:
            java.lang.String r3 = "template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = "instream"
            java.lang.String r5 = "type"
            java.lang.String r5 = r8.optString(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r4 = r4.equals(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.wg r5 = r15.f5855h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r5 = r5.f6724a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzacp r5 = r5.f7054y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r5 == 0) goto L_0x00dc
            com.google.android.gms.internal.ads.wg r5 = r15.f5855h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r5 = r5.f6724a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzacp r5 = r5.f7054y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r5 = r5.f6973b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x00dd
        L_0x00dc:
            r5 = 0
        L_0x00dd:
            com.google.android.gms.internal.ads.wg r6 = r15.f5855h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r6 = r6.f6724a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzacp r6 = r6.f7054y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r6 == 0) goto L_0x00ee
            com.google.android.gms.internal.ads.wg r6 = r15.f5855h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r6 = r6.f6724a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzacp r6 = r6.f7054y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r6 = r6.f6975d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x00ef
        L_0x00ee:
            r6 = 0
        L_0x00ef:
            if (r4 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.ow r3 = new com.google.android.gms.internal.ads.ow     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016e
        L_0x00f8:
            java.lang.String r4 = "2"
            boolean r4 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 == 0) goto L_0x010a
            com.google.android.gms.internal.ads.ps r3 = new com.google.android.gms.internal.ads.ps     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.wg r4 = r15.f5855h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r4 = r4.f6733j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>(r5, r6, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016e
        L_0x010a:
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 == 0) goto L_0x011c
            com.google.android.gms.internal.ads.pt r3 = new com.google.android.gms.internal.ads.pt     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.wg r4 = r15.f5855h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r4 = r4.f6733j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>(r5, r6, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016e
        L_0x011c:
            java.lang.String r4 = "3"
            boolean r3 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x016a
            java.lang.String r3 = "custom_template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.abq r4 = new com.google.android.gms.internal.ads.abq     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r4.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            android.os.Handler r6 = com.google.android.gms.internal.ads.C1782xi.f6838a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.pa r7 = new com.google.android.gms.internal.ads.pa     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r7.<init>(r15, r4, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r6.post(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            long r6 = f5848a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.Object r3 = r4.get(r6, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x0149
            com.google.android.gms.internal.ads.pu r3 = new com.google.android.gms.internal.ads.pu     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016e
        L_0x0149:
            java.lang.String r3 = "No handler for custom template: "
            java.lang.String r4 = "custom_template_id"
            java.lang.String r4 = r8.getString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            int r5 = r4.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r5 == 0) goto L_0x0160
            java.lang.String r3 = r3.concat(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x0166
        L_0x0160:
            java.lang.String r4 = new java.lang.String     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r4.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3 = r4
        L_0x0166:
            com.google.android.gms.internal.ads.C1772wz.m1626c(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016d
        L_0x016a:
            r15.m7725a((int) r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x016d:
            r3 = r1
        L_0x016e:
            boolean r4 = r15.m7731b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 != 0) goto L_0x01e7
            if (r3 == 0) goto L_0x01e7
            if (r8 != 0) goto L_0x017a
            goto L_0x01e7
        L_0x017a:
            java.lang.String r4 = "tracking_urls_and_actions"
            org.json.JSONObject r4 = r8.getJSONObject(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r5 = "impression_tracking_urls"
            org.json.JSONArray r5 = r4.optJSONArray(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r5 != 0) goto L_0x018a
            r6 = r1
            goto L_0x01a0
        L_0x018a:
            int r6 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r7 = 0
        L_0x0191:
            int r9 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r7 >= r9) goto L_0x01a0
            java.lang.String r9 = r5.getString(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r6[r7] = r9     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            int r7 = r7 + 1
            goto L_0x0191
        L_0x01a0:
            if (r6 != 0) goto L_0x01a4
            r5 = r1
            goto L_0x01a8
        L_0x01a4:
            java.util.List r5 = java.util.Arrays.asList(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x01a8:
            r15.f5859l = r5     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r5 = "active_view"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r15.f5860m = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = "debug_signals"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r15.f5861n = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = "omid_settings"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r15.f5862o = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.bi r13 = r3.mo12857a(r15, r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r13 != 0) goto L_0x01ce
            java.lang.String r3 = "Failed to retrieve ad assets."
            com.google.android.gms.internal.ads.C1772wz.m1626c(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x01e7
        L_0x01ce:
            com.google.android.gms.internal.ads.bk r14 = new com.google.android.gms.internal.ads.bk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            android.content.Context r4 = r15.f5849b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.ads.internal.zzbb r5 = r15.f5851d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.pr r6 = r15.f5853f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.awy r7 = r15.f5852e     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.wg r3 = r15.f5855h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r3 = r3.f6724a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzbbi r10 = r3.f7040k     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3 = r14
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r13.mo11092a(r14)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x01e8
        L_0x01e7:
            r13 = r1
        L_0x01e8:
            boolean r3 = r13 instanceof com.google.android.gms.internal.ads.C1123ay     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x01fb
            r3 = r13
            com.google.android.gms.internal.ads.ay r3 = (com.google.android.gms.internal.ads.C1123ay) r3     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.pc r4 = new com.google.android.gms.internal.ads.pc     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r4.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.pr r3 = r15.f5853f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r5 = "/nativeAdCustomClick"
            r3.mo12885a((java.lang.String) r5, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x01fb:
            com.google.android.gms.internal.ads.wf r2 = r15.m7723a((com.google.android.gms.internal.ads.C1135bi) r13, (boolean) r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.ads.internal.zzbb r3 = r15.f5851d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.afl r4 = m7728b((com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.afl>) r12)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.zzg(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            return r2
        L_0x0209:
            r2 = move-exception
            java.lang.String r3 = "Error occured while doing native ads initialization."
            com.google.android.gms.internal.ads.C1772wz.m1627c(r3, r2)
            goto L_0x021d
        L_0x0210:
            r2 = move-exception
            java.lang.String r3 = "Timeout when loading native ad."
            com.google.android.gms.internal.ads.C1772wz.m1627c(r3, r2)
            goto L_0x021d
        L_0x0217:
            r2 = move-exception
            java.lang.String r3 = "Malformed native JSON response."
            com.google.android.gms.internal.ads.C1772wz.m1627c(r3, r2)
        L_0x021d:
            boolean r2 = r15.f5857j
            if (r2 != 0) goto L_0x0224
            r15.m7725a((int) r0)
        L_0x0224:
            com.google.android.gms.internal.ads.wf r0 = r15.m7723a((com.google.android.gms.internal.ads.C1135bi) r1, (boolean) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1554ox.call():com.google.android.gms.internal.ads.wf");
    }

    /* renamed from: b */
    private static afl m7728b(abg<afl> abg) {
        try {
            return (afl) abg.get((long) ((Integer) bre.m6321e().mo12778a(C1557p.f5946bA)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            aai.m1627c("", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            aai.m1627c("", e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7726a(C1233da daVar, String str) {
        try {
            C1244dl zzar = this.f5851d.zzar(daVar.mo11093b());
            if (zzar != null) {
                zzar.mo12502a(daVar, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            C1772wz.m1627c(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private final C1752wf m7723a(C1135bi biVar, boolean z) {
        int i;
        synchronized (this.f5854g) {
            i = (biVar == null && this.f5858k == -2) ? 0 : this.f5858k;
        }
        return new C1752wf(this.f5855h.f6724a.f7032c, (afl) null, this.f5855h.f6725b.f7084c, i, this.f5855h.f6725b.f7086e, this.f5859l, this.f5855h.f6725b.f7092k, this.f5855h.f6725b.f7091j, this.f5855h.f6724a.f7038i, false, (C1419jx) null, (C1440kr) null, (String) null, (C1420jy) null, (C1423ka) null, 0, this.f5855h.f6727d, this.f5855h.f6725b.f7087f, this.f5855h.f6729f, this.f5855h.f6730g, this.f5855h.f6725b.f7095n, this.f5860m, i != -2 ? null : biVar, (zzawd) null, (List<String>) null, (List<String>) null, this.f5855h.f6725b.f7059D, this.f5855h.f6725b.f7060E, (String) null, this.f5855h.f6725b.f7063H, this.f5861n, this.f5855h.f6732i, this.f5855h.f6725b.f7070O, this.f5855h.f6733j, z, this.f5855h.f6725b.f7073R, this.f5855h.f6725b.f7074S, this.f5862o, this.f5855h.f6725b.f7077V);
    }

    /* renamed from: a */
    public final abg<C1068ap> mo12860a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return aau.m1646a(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = m7729b(optJSONObject, "text_color");
        Integer b2 = m7729b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.f5855h.f6724a.f7054y == null || this.f5855h.f6724a.f7054y.f6972a < 2) ? 1 : this.f5855h.f6724a.f7054y.f6976e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<abg> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = mo12863a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(mo12862a(optJSONObject, "image", false, false));
        }
        abq abq = new abq();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (abg a : arrayList) {
            a.mo10059a(new C1563pf(atomicInteger, size, abq, arrayList), C1780xg.f6833a);
            arrayList = arrayList;
        }
        return aau.m1649a(abq, new C1561pd(this, optString, b2, b, optInt, optInt3, optInt2, i, optBoolean), (Executor) C1780xg.f6833a);
    }

    /* renamed from: b */
    private static Integer m7729b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Future<C1085at> mo12864a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m7719a(jSONObject2, optBoolean, z);
    }

    /* renamed from: a */
    public final abg<C1085at> mo12862a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m7719a(jSONObject2, z, z2);
    }

    /* renamed from: a */
    public final List<abg<C1085at>> mo12863a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            mo12865a(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m7719a(jSONObject2, false, z2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final abg<C1085at> m7719a(JSONObject jSONObject, boolean z, boolean z2) {
        String str;
        if (z) {
            str = jSONObject.getString("url");
        } else {
            str = jSONObject.optString("url");
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(str)) {
            mo12865a(0, z);
            return aau.m1646a(null);
        } else if (z2) {
            return aau.m1646a(new C1085at((Drawable) null, Uri.parse(str), optDouble));
        } else {
            return this.f5850c.mo13280a(str, new C1562pe(this, z, optDouble, optBoolean, str));
        }
    }

    /* renamed from: a */
    public final abg<afl> mo12861a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return aau.m1646a(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            C1772wz.m1630e("Required field 'vast_xml' is missing");
            return aau.m1646a(null);
        }
        C1565ph a = m7721a(this.f5849b, this.f5852e, this.f5855h, this.f5856i, this.f5851d);
        boolean equals = "instream".equals(jSONObject.optString("type"));
        abq abq = new abq();
        abl.f1313a.execute(new C1566pi(a, equals, optJSONObject, abq));
        return abq;
    }

    /* renamed from: a */
    public final abg<afl> mo12859a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return aau.m1646a(null);
        }
        C1565ph a = m7721a(this.f5849b, this.f5852e, this.f5855h, this.f5856i, this.f5851d);
        abq abq = new abq();
        abl.f1313a.execute(new C1567pj(a, true, abq, str, str2));
        return abq;
    }

    /* renamed from: b */
    private final boolean m7731b() {
        boolean z;
        synchronized (this.f5854g) {
            z = this.f5857j;
        }
        return z;
    }

    /* renamed from: a */
    private final void m7725a(int i) {
        synchronized (this.f5854g) {
            this.f5857j = true;
            this.f5858k = i;
        }
    }

    /* renamed from: a */
    public final void mo12865a(int i, boolean z) {
        if (z) {
            m7725a(i);
        }
    }

    /* renamed from: a */
    static afl m7720a(abg<afl> abg) {
        try {
            return (afl) abg.get((long) ((Integer) bre.m6321e().mo12778a(C1557p.f5997bz)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C1772wz.m1627c("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            C1772wz.m1627c("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <V> List<V> m7730b(List<abg<V>> list) {
        ArrayList arrayList = new ArrayList();
        for (abg<V> abg : list) {
            Object obj = abg.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static C1565ph m7721a(Context context, awy awy, C1753wg wgVar, C1019ad adVar, zzbb zzbb) {
        return new C1565ph(context, awy, wgVar, adVar, zzbb);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ abg mo12858a(String str, Object obj) {
        zzbv.zzlg();
        afl a = afr.m2018a(this.f5849b, agy.m2168a(), "native-omid", false, false, this.f5852e, this.f5855h.f6724a.f7040k, this.f5856i, (zzbo) null, this.f5851d.zzid(), this.f5855h.f6732i);
        abp a2 = abp.m1673a(a);
        a.mo10388u().mo10400a((agt) new C1556oz(a2));
        a.loadData(str, "text/html", "UTF-8");
        return a2;
    }
}
