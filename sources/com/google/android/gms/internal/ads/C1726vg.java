package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.C0851d;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0979o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.vg */
public final class C1726vg implements C1736vq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static List<Future<Void>> f6627a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static ScheduledExecutorService f6628b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public final avb f6629c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private final LinkedHashMap<String, avh> f6630d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private final List<String> f6631e = new ArrayList();
    @GuardedBy("mLock")

    /* renamed from: f */
    private final List<String> f6632f = new ArrayList();

    /* renamed from: g */
    private final Context f6633g;

    /* renamed from: h */
    private final C1738vs f6634h;
    @VisibleForTesting

    /* renamed from: i */
    private boolean f6635i;

    /* renamed from: j */
    private final zzawo f6636j;

    /* renamed from: k */
    private final C1739vt f6637k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f6638l = new Object();

    /* renamed from: m */
    private HashSet<String> f6639m = new HashSet<>();

    /* renamed from: n */
    private boolean f6640n = false;

    /* renamed from: o */
    private boolean f6641o = false;

    /* renamed from: p */
    private boolean f6642p = false;

    public C1726vg(Context context, zzbbi zzbbi, zzawo zzawo, String str, C1738vs vsVar) {
        C0926p.m1307a(zzawo, (Object) "SafeBrowsing config is not present.");
        this.f6633g = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6630d = new LinkedHashMap<>();
        this.f6634h = vsVar;
        this.f6636j = zzawo;
        for (String lowerCase : this.f6636j.f7131e) {
            this.f6639m.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f6639m.remove("cookie".toLowerCase(Locale.ENGLISH));
        avb avb = new avb();
        avb.f2641a = 8;
        avb.f2642b = str;
        avb.f2643c = str;
        avb.f2644d = new avc();
        avb.f2644d.f2659a = this.f6636j.f7127a;
        avi avi = new avi();
        avi.f2687a = zzbbi.f7135a;
        avi.f2689c = Boolean.valueOf(C0771c.m904a(this.f6633g).mo9537a());
        long c = (long) C0851d.m1126b().mo9729c(this.f6633g);
        if (c > 0) {
            avi.f2688b = Long.valueOf(c);
        }
        avb.f2648h = avi;
        this.f6629c = avb;
        this.f6637k = new C1739vt(this.f6633g, this.f6636j.f7134h, this);
    }

    /* renamed from: d */
    static final /* synthetic */ Void m8137d(String str) {
        return null;
    }

    /* renamed from: a */
    public final zzawo mo13053a() {
        return this.f6636j;
    }

    /* renamed from: a */
    public final void mo13055a(String str) {
        synchronized (this.f6638l) {
            this.f6629c.f2646f = str;
        }
    }

    /* renamed from: b */
    public final boolean mo13059b() {
        return C0979o.m1505f() && this.f6636j.f7129c && !this.f6641o;
    }

    /* renamed from: a */
    public final void mo13054a(View view) {
        if (this.f6636j.f7129c && !this.f6641o) {
            zzbv.zzlf();
            Bitmap b = C1782xi.m8385b(view);
            if (b == null) {
                C1735vp.m8157a("Failed to capture the webview bitmap.");
                return;
            }
            this.f6641o = true;
            C1782xi.m8375a((Runnable) new C1729vj(this, b));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13056a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f6638l
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x000d
            r2 = 1
            r6.f6642p = r2     // Catch:{ all -> 0x000a }
            goto L_0x000d
        L_0x000a:
            r7 = move-exception
            goto L_0x00ca
        L_0x000d:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.avh> r2 = r6.f6630d     // Catch:{ all -> 0x000a }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0027
            if (r9 != r1) goto L_0x0025
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.avh> r8 = r6.f6630d     // Catch:{ all -> 0x000a }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.avh r7 = (com.google.android.gms.internal.ads.avh) r7     // Catch:{ all -> 0x000a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r7.f2681d = r8     // Catch:{ all -> 0x000a }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0027:
            com.google.android.gms.internal.ads.avh r1 = new com.google.android.gms.internal.ads.avh     // Catch:{ all -> 0x000a }
            r1.<init>()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f2681d = r9     // Catch:{ all -> 0x000a }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.avh> r9 = r6.f6630d     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f2678a = r9     // Catch:{ all -> 0x000a }
            r1.f2679b = r7     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.ave r9 = new com.google.android.gms.internal.ads.ave     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            r1.f2680c = r9     // Catch:{ all -> 0x000a }
            java.util.HashSet<java.lang.String> r9 = r6.f6639m     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            if (r9 <= 0) goto L_0x00c3
            if (r8 == 0) goto L_0x00c3
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x000a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x000a }
        L_0x005e:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x000a }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x000a }
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0079
        L_0x0077:
            java.lang.String r3 = ""
        L_0x0079:
            java.lang.Object r4 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r2 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0088
        L_0x0086:
            java.lang.String r2 = ""
        L_0x0088:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.util.HashSet<java.lang.String> r5 = r6.f6639m     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            boolean r4 = r5.contains(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 != 0) goto L_0x0097
            goto L_0x005e
        L_0x0097:
            com.google.android.gms.internal.ads.avd r4 = new com.google.android.gms.internal.ads.avd     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f2661a = r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f2662b = r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r9.add(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x005e
        L_0x00b0:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.ads.C1735vp.m8157a(r2)     // Catch:{ all -> 0x000a }
            goto L_0x005e
        L_0x00b6:
            int r8 = r9.size()     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.avd[] r8 = new com.google.android.gms.internal.ads.avd[r8]     // Catch:{ all -> 0x000a }
            r9.toArray(r8)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.ave r9 = r1.f2680c     // Catch:{ all -> 0x000a }
            r9.f2663a = r8     // Catch:{ all -> 0x000a }
        L_0x00c3:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.avh> r8 = r6.f6630d     // Catch:{ all -> 0x000a }
            r8.put(r7, r1)     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x00ca:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1726vg.mo13056a(java.lang.String, java.util.Map, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13058b(String str) {
        synchronized (this.f6638l) {
            this.f6631e.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo13061c(String str) {
        synchronized (this.f6638l) {
            this.f6632f.add(str);
        }
    }

    /* renamed from: a */
    public final String[] mo13057a(String[] strArr) {
        return (String[]) this.f6637k.mo13069a(strArr).toArray(new String[0]);
    }

    /* renamed from: c */
    public final void mo13060c() {
        this.f6640n = true;
    }

    @Nullable
    /* renamed from: e */
    private final avh m8138e(String str) {
        avh avh;
        synchronized (this.f6638l) {
            avh = this.f6630d.get(str);
        }
        return avh;
    }

    /* renamed from: d */
    public final void mo13062d() {
        synchronized (this.f6638l) {
            abg<B> a = aau.m1648a(this.f6634h.mo13066a(this.f6633g, this.f6630d.keySet()), new C1727vh(this), abl.f1314b);
            abg<V> a2 = aau.m1647a(a, 10, TimeUnit.SECONDS, f6628b);
            aau.m1653a(a, new C1730vk(this, a2), abl.f1314b);
            f6627a.add(a2);
        }
    }

    @VisibleForTesting
    /* renamed from: f */
    private final abg<Void> m8140f() {
        abg<Void> a;
        if (!((this.f6635i && this.f6636j.f7133g) || (this.f6642p && this.f6636j.f7132f) || (!this.f6635i && this.f6636j.f7130d))) {
            return aau.m1646a(null);
        }
        synchronized (this.f6638l) {
            this.f6629c.f2645e = new avh[this.f6630d.size()];
            this.f6630d.values().toArray(this.f6629c.f2645e);
            this.f6629c.f2649i = (String[]) this.f6631e.toArray(new String[0]);
            this.f6629c.f2650j = (String[]) this.f6632f.toArray(new String[0]);
            if (C1735vp.m8158a()) {
                String str = this.f6629c.f2642b;
                String str2 = this.f6629c.f2646f;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (avh avh : this.f6629c.f2645e) {
                    sb2.append("    [");
                    sb2.append(avh.f2682e.length);
                    sb2.append("] ");
                    sb2.append(avh.f2679b);
                }
                C1735vp.m8157a(sb2.toString());
            }
            abg<String> a2 = new C1821yu(this.f6633g).mo13279a(1, this.f6636j.f7128b, (Map<String, String>) null, aum.m4186a((aum) this.f6629c));
            if (C1735vp.m8158a()) {
                a2.mo10059a(new C1731vl(this), C1780xg.f6833a);
            }
            a = aau.m1649a(a2, C1728vi.f6644a, abl.f1314b);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ abg mo13052a(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f6638l) {
                            int length = optJSONArray.length();
                            avh e = m8138e(str);
                            if (e == null) {
                                String valueOf = String.valueOf(str);
                                C1735vp.m8157a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                e.f2682e = new String[length];
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    e.f2682e[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                boolean z2 = this.f6635i;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f6635i = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) bre.m6321e().mo12778a(C1557p.f5966bU)).booleanValue()) {
                    C1772wz.m1622a("Failed to get SafeBrowsing metadata", e2);
                }
                return aau.m1645a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f6635i) {
            synchronized (this.f6638l) {
                this.f6629c.f2641a = 9;
            }
        }
        return m8140f();
    }
}
