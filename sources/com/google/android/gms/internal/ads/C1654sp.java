package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.zzbv;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.sp */
public final class C1654sp extends C1630rs {

    /* renamed from: a */
    private static final Object f6413a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static C1654sp f6414b;

    /* renamed from: c */
    private final Context f6415c;

    /* renamed from: d */
    private final C1653so f6416d;

    /* renamed from: e */
    private final ScheduledExecutorService f6417e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public static C1654sp m7878a(Context context, C1653so soVar) {
        C1654sp spVar;
        synchronized (f6413a) {
            if (f6414b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                C1557p.m7741a(context);
                f6414b = new C1654sp(context, soVar);
                if (context.getApplicationContext() != null) {
                    zzbv.zzlf().mo13211c(context);
                }
                C1770wx.m8286a(context);
            }
            spVar = f6414b;
        }
        return spVar;
    }

    /* renamed from: a */
    public final void mo12929a(zzatb zzatb, C1635rx rxVar) {
        C1772wz.m8287a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo12930b(zzatb zzatb, C1635rx rxVar) {
        C1772wz.m8287a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static zzasm m7879a(Context context, C1653so soVar, zzasi zzasi, ScheduledExecutorService scheduledExecutorService) {
        String str;
        char c;
        String string;
        Context context2 = context;
        C1653so soVar2 = soVar;
        zzasi zzasi2 = zzasi;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        C1772wz.m1624b("Starting ad request from service using: google.afma.request.getAdDictionary");
        C1019ad adVar = new C1019ad(((Boolean) bre.m6321e().mo12778a(C1557p.f5876K)).booleanValue(), "load_ad", zzasi2.f7033d.f7292a);
        if (zzasi2.f7023a > 10 && zzasi2.f6997A != -1) {
            adVar.mo10155a(adVar.mo10150a(zzasi2.f6997A), "cts");
        }
        C1016aa a = adVar.mo10149a();
        abg<V> a2 = aau.m1647a(soVar2.f6409h.mo12841a(context2), ((Long) bre.m6321e().mo12778a(C1557p.f5965bT)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future a3 = aau.m1646a(null);
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6006cH)).booleanValue()) {
            a3 = soVar2.f6404c.mo13091a(zzasi2.f7036g.packageName);
        }
        abg<String> b = soVar2.f6404c.mo13092b(zzasi2.f7036g.packageName);
        abg<String> a4 = soVar2.f6410i.mo13094a(zzasi2.f7037h, zzasi2.f7036g);
        Future<C1663sy> a5 = zzbv.zzlq().mo12966a(context2);
        abg a6 = aau.m1646a(null);
        Bundle bundle = zzasi2.f7032c.f7273c;
        boolean z = (bundle == null || bundle.getString("_ad") == null) ? false : true;
        if (zzasi2.f7003G && !z) {
            a6 = soVar2.f6407f.mo12637a(zzasi2.f7035f);
        }
        C1016aa aaVar = a;
        abg a7 = aau.m1647a(a6, ((Long) bre.m6321e().mo12778a(C1557p.f5956bK)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        abg<V> a8 = aau.m1646a(null);
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5941aw)).booleanValue()) {
            a8 = aau.m1647a(soVar2.f6410i.mo13093a(context2), ((Long) bre.m6321e().mo12778a(C1557p.f5942ax)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        }
        Bundle bundle2 = (zzasi2.f7023a < 4 || zzasi2.f7044o == null) ? null : zzasi2.f7044o;
        zzbv.zzlf();
        if (C1782xi.m8381a(context2, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            C1772wz.m1624b("Device is offline.");
        }
        if (zzasi2.f7023a >= 7) {
            str = zzasi2.f7051v;
        } else {
            str = UUID.randomUUID().toString();
        }
        if (zzasi2.f7032c.f7273c != null && (string = zzasi2.f7032c.f7273c.getString("_ad")) != null) {
            return C1659su.m7888a(context2, zzasi2, string);
        }
        List<String> a9 = soVar2.f6405d.mo12495a(zzasi2.f7052w);
        String str2 = str;
        C1019ad adVar2 = adVar;
        Bundle bundle3 = (Bundle) aau.m1652a(a2, null, ((Long) bre.m6321e().mo12778a(C1557p.f5965bT)).longValue(), TimeUnit.MILLISECONDS);
        Location location = (Location) aau.m1651a(a7, null);
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) aau.m1651a(a8, null);
        String str3 = (String) aau.m1651a(a4, null);
        String str4 = (String) aau.m1651a(a3, null);
        String str5 = (String) aau.m1651a(b, null);
        C1663sy syVar = (C1663sy) aau.m1651a(a5, null);
        if (syVar == null) {
            C1772wz.m1630e("Error fetching device info. This is not recoverable.");
            return new zzasm(0);
        }
        C1652sn snVar = new C1652sn();
        snVar.f6398i = zzasi2;
        snVar.f6399j = syVar;
        snVar.f6393d = location;
        snVar.f6391b = bundle3;
        snVar.f6396g = str3;
        snVar.f6397h = info;
        if (a9 == null) {
            snVar.f6392c.clear();
        }
        snVar.f6392c = a9;
        snVar.f6390a = bundle2;
        snVar.f6394e = str4;
        snVar.f6395f = str5;
        snVar.f6400k = soVar2.f6403b.mo12278a(context2);
        snVar.f6401l = soVar2.f6411j;
        JSONObject a10 = C1659su.m7892a(context2, snVar);
        if (a10 == null) {
            return new zzasm(0);
        }
        if (zzasi2.f7023a < 7) {
            try {
                a10.put("request_id", str2);
            } catch (JSONException unused) {
            }
        }
        C1016aa aaVar2 = aaVar;
        C1019ad adVar3 = adVar2;
        adVar3.mo10155a(aaVar2, "arc");
        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
        abg<V> a11 = aau.m1647a(aau.m1648a(soVar2.f6412k.mo12949a().mo12630a(a10), C1655sq.f6418a, (Executor) scheduledExecutorService3), 10, TimeUnit.SECONDS, scheduledExecutorService3);
        abg<Void> a12 = soVar2.f6406e.mo12968a();
        if (a12 != null) {
            aas.m1642a(a12, "AdRequestServiceImpl.loadAd.flags");
        }
        zzasm zzasm = null;
        C1662sx sxVar = (C1662sx) aau.m1651a(a11, null);
        if (sxVar == null) {
            return new zzasm(0);
        }
        if (sxVar.mo12954a() != -2) {
            return new zzasm(sxVar.mo12954a());
        }
        adVar3.mo10158d();
        if (!TextUtils.isEmpty(sxVar.mo12959f())) {
            zzasm = C1659su.m7888a(context2, zzasi2, sxVar.mo12959f());
        }
        if (zzasm == null && !TextUtils.isEmpty(sxVar.mo12957d())) {
            zzasm = m7880a(zzasi, context, zzasi2.f7040k.f7135a, sxVar.mo12957d(), str4, str5, sxVar, adVar3, soVar);
        }
        if (zzasm == null) {
            c = 0;
            zzasm = new zzasm(0);
        } else {
            c = 0;
        }
        String[] strArr = new String[1];
        strArr[c] = "tts";
        adVar3.mo10155a(aaVar2, strArr);
        zzasm.f7104w = adVar3.mo10156b();
        zzasm.f7076U = sxVar.mo12961h();
        return zzasm;
    }

    /* renamed from: a */
    private static void m7881a(String str, Map<String, List<String>> map, String str2, int i) {
        if (C1772wz.m1623a(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            C1772wz.m8287a(sb.toString());
            if (map != null) {
                for (String next : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 5);
                    sb2.append("    ");
                    sb2.append(next);
                    sb2.append(":");
                    C1772wz.m8287a(sb2.toString());
                    for (String valueOf : map.get(next)) {
                        String valueOf2 = String.valueOf(valueOf);
                        C1772wz.m8287a(valueOf2.length() != 0 ? "      ".concat(valueOf2) : new String("      "));
                    }
                }
            }
            C1772wz.m8287a("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    C1772wz.m8287a(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                C1772wz.m8287a("    null");
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            C1772wz.m8287a(sb3.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
        r0 = r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r7 = new java.io.InputStreamReader(r12.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        com.google.android.gms.ads.internal.zzbv.zzlf();
        r11 = com.google.android.gms.internal.ads.C1782xi.m8365a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        com.google.android.gms.common.util.C0975k.m1495a(r7);
        r4.mo10028a(r11);
        m7881a(r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r13, r11, r10);
        r6.mo12952a(r0, r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010b, code lost:
        if (r2 == null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010d, code lost:
        r2.mo10155a(r5, "ufe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0118, code lost:
        r0 = r6.mo12951a(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        if (r3 == null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3.f6408g.mo12971b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0126, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012c, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        com.google.android.gms.common.util.C0975k.m1495a(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0131, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014c, code lost:
        com.google.android.gms.internal.ads.C1772wz.m1630e("No location header to follow redirect.");
        r0 = new com.google.android.gms.internal.ads.zzasm(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015a, code lost:
        if (r3 == null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015c, code lost:
        r3.f6408g.mo12971b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0161, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017b, code lost:
        com.google.android.gms.internal.ads.C1772wz.m1630e("Too many redirects.");
        r0 = new com.google.android.gms.internal.ads.zzasm(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0189, code lost:
        if (r3 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018b, code lost:
        r3.f6408g.mo12971b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0190, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c A[Catch:{ all -> 0x00c2, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[Catch:{ all -> 0x00c2, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd A[Catch:{ all -> 0x00c2, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0140 A[Catch:{ all -> 0x00c2, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a3 A[EDGE_INSN: B:119:0x01a3->B:99:0x01a3 ?: BREAK  
    EDGE_INSN: B:120:0x01a3->B:99:0x01a3 ?: BREAK  ] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzasm m7880a(com.google.android.gms.internal.ads.zzasi r18, android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.google.android.gms.internal.ads.C1662sx r24, com.google.android.gms.internal.ads.C1019ad r25, com.google.android.gms.internal.ads.C1653so r26) {
        /*
            r0 = r18
            r1 = r24
            r2 = r25
            r3 = r26
            if (r2 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.aa r5 = r25.mo10149a()
            goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            com.google.android.gms.internal.ads.sv r6 = new com.google.android.gms.internal.ads.sv     // Catch:{ IOException -> 0x01d6 }
            java.lang.String r7 = r24.mo12955b()     // Catch:{ IOException -> 0x01d6 }
            r6.<init>(r0, r7)     // Catch:{ IOException -> 0x01d6 }
            java.lang.String r7 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r8 = java.lang.String.valueOf(r21)     // Catch:{ IOException -> 0x01d6 }
            int r9 = r8.length()     // Catch:{ IOException -> 0x01d6 }
            if (r9 == 0) goto L_0x002a
            java.lang.String r7 = r7.concat(r8)     // Catch:{ IOException -> 0x01d6 }
            goto L_0x0030
        L_0x002a:
            java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x01d6 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x01d6 }
            r7 = r8
        L_0x0030:
            com.google.android.gms.internal.ads.C1772wz.m1624b(r7)     // Catch:{ IOException -> 0x01d6 }
            java.net.URL r7 = new java.net.URL     // Catch:{ IOException -> 0x01d6 }
            r8 = r21
            r7.<init>(r8)     // Catch:{ IOException -> 0x01d6 }
            com.google.android.gms.common.util.e r8 = com.google.android.gms.ads.internal.zzbv.zzlm()     // Catch:{ IOException -> 0x01d6 }
            long r8 = r8.mo9997b()     // Catch:{ IOException -> 0x01d6 }
            r10 = 0
            r11 = 0
        L_0x0044:
            if (r3 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.th r12 = r3.f6408g     // Catch:{ IOException -> 0x01d6 }
            r12.mo12970a()     // Catch:{ IOException -> 0x01d6 }
        L_0x004b:
            java.net.URLConnection r12 = r7.openConnection()     // Catch:{ IOException -> 0x01d6 }
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ IOException -> 0x01d6 }
            com.google.android.gms.internal.ads.xi r13 = com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ all -> 0x01ca }
            r14 = r19
            r15 = r20
            r13.mo13203a((android.content.Context) r14, (java.lang.String) r15, (boolean) r10, (java.net.HttpURLConnection) r12)     // Catch:{ all -> 0x01ca }
            boolean r13 = r24.mo12958e()     // Catch:{ all -> 0x01ca }
            if (r13 == 0) goto L_0x0080
            boolean r13 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x01ca }
            if (r13 != 0) goto L_0x0070
            java.lang.String r13 = "x-afma-drt-cookie"
            r4 = r22
            r12.addRequestProperty(r13, r4)     // Catch:{ all -> 0x01ca }
            goto L_0x0072
        L_0x0070:
            r4 = r22
        L_0x0072:
            boolean r13 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x01ca }
            if (r13 != 0) goto L_0x0082
            java.lang.String r13 = "x-afma-drt-v2-cookie"
            r10 = r23
            r12.addRequestProperty(r13, r10)     // Catch:{ all -> 0x01ca }
            goto L_0x0084
        L_0x0080:
            r4 = r22
        L_0x0082:
            r10 = r23
        L_0x0084:
            java.lang.String r13 = r0.f7004H     // Catch:{ all -> 0x01ca }
            boolean r17 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01ca }
            if (r17 != 0) goto L_0x0096
            java.lang.String r17 = "Sending webview cookie in ad request header."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r17)     // Catch:{ all -> 0x01ca }
            java.lang.String r4 = "Cookie"
            r12.addRequestProperty(r4, r13)     // Catch:{ all -> 0x01ca }
        L_0x0096:
            r4 = 1
            if (r1 == 0) goto L_0x00cd
            java.lang.String r13 = r24.mo12956c()     // Catch:{ all -> 0x01ca }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01ca }
            if (r13 != 0) goto L_0x00cd
            r12.setDoOutput(r4)     // Catch:{ all -> 0x01ca }
            java.lang.String r13 = r24.mo12956c()     // Catch:{ all -> 0x01ca }
            byte[] r13 = r13.getBytes()     // Catch:{ all -> 0x01ca }
            int r4 = r13.length     // Catch:{ all -> 0x01ca }
            r12.setFixedLengthStreamingMode(r4)     // Catch:{ all -> 0x01ca }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c6 }
            java.io.OutputStream r10 = r12.getOutputStream()     // Catch:{ all -> 0x00c6 }
            r4.<init>(r10)     // Catch:{ all -> 0x00c6 }
            r4.write(r13)     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.common.util.C0975k.m1495a(r4)     // Catch:{ all -> 0x01ca }
            goto L_0x00ce
        L_0x00c2:
            r0 = move-exception
            r16 = r4
            goto L_0x00c9
        L_0x00c6:
            r0 = move-exception
            r16 = 0
        L_0x00c9:
            com.google.android.gms.common.util.C0975k.m1495a(r16)     // Catch:{ all -> 0x01ca }
            throw r0     // Catch:{ all -> 0x01ca }
        L_0x00cd:
            r13 = 0
        L_0x00ce:
            com.google.android.gms.internal.ads.aab r4 = new com.google.android.gms.internal.ads.aab     // Catch:{ all -> 0x01ca }
            java.lang.String r10 = r0.f7051v     // Catch:{ all -> 0x01ca }
            r4.<init>(r10)     // Catch:{ all -> 0x01ca }
            r4.mo10031a((java.net.HttpURLConnection) r12, (byte[]) r13)     // Catch:{ all -> 0x01ca }
            int r10 = r12.getResponseCode()     // Catch:{ all -> 0x01ca }
            java.util.Map r13 = r12.getHeaderFields()     // Catch:{ all -> 0x01ca }
            r4.mo10030a((java.net.HttpURLConnection) r12, (int) r10)     // Catch:{ all -> 0x01ca }
            r0 = 200(0xc8, float:2.8E-43)
            r14 = 300(0x12c, float:4.2E-43)
            if (r10 < r0) goto L_0x0132
            if (r10 >= r14) goto L_0x0132
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x01ca }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x012b }
            java.io.InputStream r11 = r12.getInputStream()     // Catch:{ all -> 0x012b }
            r7.<init>(r11)     // Catch:{ all -> 0x012b }
            com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ all -> 0x0127 }
            java.lang.String r11 = com.google.android.gms.internal.ads.C1782xi.m8365a((java.io.InputStreamReader) r7)     // Catch:{ all -> 0x0127 }
            com.google.android.gms.common.util.C0975k.m1495a(r7)     // Catch:{ all -> 0x01ca }
            r4.mo10028a((java.lang.String) r11)     // Catch:{ all -> 0x01ca }
            m7881a((java.lang.String) r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r13, (java.lang.String) r11, (int) r10)     // Catch:{ all -> 0x01ca }
            r6.mo12952a(r0, r13, r11)     // Catch:{ all -> 0x01ca }
            if (r2 == 0) goto L_0x0118
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x01ca }
            java.lang.String r4 = "ufe"
            r7 = 0
            r0[r7] = r4     // Catch:{ all -> 0x01ca }
            r2.mo10155a((com.google.android.gms.internal.ads.C1016aa) r5, (java.lang.String[]) r0)     // Catch:{ all -> 0x01ca }
        L_0x0118:
            com.google.android.gms.internal.ads.zzasm r0 = r6.mo12951a((long) r8, (com.google.android.gms.internal.ads.C1662sx) r1)     // Catch:{ all -> 0x01ca }
            r12.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r3 == 0) goto L_0x0126
            com.google.android.gms.internal.ads.th r1 = r3.f6408g     // Catch:{ IOException -> 0x01d6 }
            r1.mo12971b()     // Catch:{ IOException -> 0x01d6 }
        L_0x0126:
            return r0
        L_0x0127:
            r0 = move-exception
            r16 = r7
            goto L_0x012e
        L_0x012b:
            r0 = move-exception
            r16 = 0
        L_0x012e:
            com.google.android.gms.common.util.C0975k.m1495a(r16)     // Catch:{ all -> 0x01ca }
            throw r0     // Catch:{ all -> 0x01ca }
        L_0x0132:
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x01ca }
            r4 = 0
            m7881a((java.lang.String) r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r13, (java.lang.String) r4, (int) r10)     // Catch:{ all -> 0x01ca }
            if (r10 < r14) goto L_0x01a3
            r0 = 400(0x190, float:5.6E-43)
            if (r10 >= r0) goto L_0x01a3
            java.lang.String r0 = "Location"
            java.lang.String r0 = r12.getHeaderField(r0)     // Catch:{ all -> 0x01ca }
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01ca }
            if (r7 == 0) goto L_0x0162
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.zzasm r0 = new com.google.android.gms.internal.ads.zzasm     // Catch:{ all -> 0x01ca }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x01ca }
            r12.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r3 == 0) goto L_0x0161
            com.google.android.gms.internal.ads.th r1 = r3.f6408g     // Catch:{ IOException -> 0x01d6 }
            r1.mo12971b()     // Catch:{ IOException -> 0x01d6 }
        L_0x0161:
            return r0
        L_0x0162:
            java.net.URL r7 = new java.net.URL     // Catch:{ all -> 0x01ca }
            r7.<init>(r0)     // Catch:{ all -> 0x01ca }
            r0 = 1
            int r11 = r11 + r0
            com.google.android.gms.internal.ads.e<java.lang.Integer> r0 = com.google.android.gms.internal.ads.C1557p.f6000cB     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.m r10 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x01ca }
            java.lang.Object r0 = r10.mo12778a(r0)     // Catch:{ all -> 0x01ca }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01ca }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01ca }
            if (r11 <= r0) goto L_0x0191
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.zzasm r0 = new com.google.android.gms.internal.ads.zzasm     // Catch:{ all -> 0x01ca }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x01ca }
            r12.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r3 == 0) goto L_0x0190
            com.google.android.gms.internal.ads.th r1 = r3.f6408g     // Catch:{ IOException -> 0x01d6 }
            r1.mo12971b()     // Catch:{ IOException -> 0x01d6 }
        L_0x0190:
            return r0
        L_0x0191:
            r6.mo12953a(r13)     // Catch:{ all -> 0x01ca }
            r12.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r3 == 0) goto L_0x019e
            com.google.android.gms.internal.ads.th r0 = r3.f6408g     // Catch:{ IOException -> 0x01d6 }
            r0.mo12971b()     // Catch:{ IOException -> 0x01d6 }
        L_0x019e:
            r0 = r18
            r10 = 0
            goto L_0x0044
        L_0x01a3:
            r0 = 46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ca }
            r1.<init>(r0)     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = "Received error HTTP response code: "
            r1.append(r0)     // Catch:{ all -> 0x01ca }
            r1.append(r10)     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.zzasm r0 = new com.google.android.gms.internal.ads.zzasm     // Catch:{ all -> 0x01ca }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x01ca }
            r12.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r3 == 0) goto L_0x01c9
            com.google.android.gms.internal.ads.th r1 = r3.f6408g     // Catch:{ IOException -> 0x01d6 }
            r1.mo12971b()     // Catch:{ IOException -> 0x01d6 }
        L_0x01c9:
            return r0
        L_0x01ca:
            r0 = move-exception
            r12.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r3 == 0) goto L_0x01d5
            com.google.android.gms.internal.ads.th r1 = r3.f6408g     // Catch:{ IOException -> 0x01d6 }
            r1.mo12971b()     // Catch:{ IOException -> 0x01d6 }
        L_0x01d5:
            throw r0     // Catch:{ IOException -> 0x01d6 }
        L_0x01d6:
            r0 = move-exception
            java.lang.String r1 = "Error while connecting to ad server: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x01ec
            java.lang.String r0 = r1.concat(r0)
            goto L_0x01f1
        L_0x01ec:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x01f1:
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)
            com.google.android.gms.internal.ads.zzasm r0 = new com.google.android.gms.internal.ads.zzasm
            r1 = 2
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1654sp.m7880a(com.google.android.gms.internal.ads.zzasi, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.sx, com.google.android.gms.internal.ads.ad, com.google.android.gms.internal.ads.so):com.google.android.gms.internal.ads.zzasm");
    }

    private C1654sp(Context context, C1653so soVar) {
        this.f6415c = context;
        this.f6416d = soVar;
    }

    /* renamed from: a */
    public final zzasm mo12927a(zzasi zzasi) {
        return m7879a(this.f6415c, this.f6416d, zzasi, this.f6417e);
    }

    /* renamed from: a */
    public final void mo12928a(zzasi zzasi, C1632ru ruVar) {
        zzbv.zzlj().mo13117a(this.f6415c, zzasi.f7040k);
        abg<?> a = C1780xg.m8353a((Runnable) new C1656sr(this, zzasi, ruVar));
        zzbv.zzlv().mo13282a();
        zzbv.zzlv().mo13283b().postDelayed(new C1657ss(this, a), 60000);
    }
}
