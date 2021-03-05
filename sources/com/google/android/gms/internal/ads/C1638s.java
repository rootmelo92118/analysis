package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.s */
public final class C1638s {

    /* renamed from: a */
    private BlockingQueue<C1019ad> f6359a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    private ExecutorService f6360b;

    /* renamed from: c */
    private LinkedHashMap<String, String> f6361c = new LinkedHashMap<>();

    /* renamed from: d */
    private Map<String, C1746w> f6362d = new HashMap();

    /* renamed from: e */
    private String f6363e;

    /* renamed from: f */
    private Context f6364f;

    /* renamed from: g */
    private String f6365g;

    /* renamed from: h */
    private AtomicBoolean f6366h;

    /* renamed from: i */
    private File f6367i;

    /* renamed from: a */
    public final void mo12934a(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f6364f = context;
        this.f6365g = str;
        this.f6363e = str2;
        this.f6366h = new AtomicBoolean(false);
        this.f6366h.set(((Boolean) bre.m6321e().mo12778a(C1557p.f5878M)).booleanValue());
        if (this.f6366h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f6367i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.f6361c.put((String) next.getKey(), (String) next.getValue());
        }
        this.f6360b = Executors.newSingleThreadExecutor();
        this.f6360b.execute(new C1665t(this));
        this.f6362d.put("action", C1746w.f6674b);
        this.f6362d.put("ad_format", C1746w.f6674b);
        this.f6362d.put("e", C1746w.f6675c);
    }

    /* renamed from: a */
    public final void mo12935a(@Nullable List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f6361c.put("e", TextUtils.join(",", list));
        }
    }

    /* renamed from: a */
    public final boolean mo12936a(C1019ad adVar) {
        return this.f6359a.offer(adVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f A[SYNTHETIC, Splitter:B:31:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae A[SYNTHETIC, Splitter:B:36:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0000 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m7856a() {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.ad> r0 = r5.f6359a     // Catch:{ InterruptedException -> 0x00cc }
            java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x00cc }
            com.google.android.gms.internal.ads.ad r0 = (com.google.android.gms.internal.ads.C1019ad) r0     // Catch:{ InterruptedException -> 0x00cc }
            java.lang.String r1 = r0.mo10156b()     // Catch:{ InterruptedException -> 0x00cc }
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0000
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r2 = r5.f6361c
            java.util.Map r0 = r0.mo10157c()
            java.util.Map r0 = r5.mo12933a(r2, r0)
            java.lang.String r2 = r5.f6363e
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.appendQueryParameter(r4, r3)
            goto L_0x002e
        L_0x004a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            android.net.Uri r2 = r2.build()
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.lang.String r2 = "&it="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.f6366h
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x00c0
            java.io.File r1 = r5.f6367i
            if (r1 == 0) goto L_0x00b9
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0097 }
            r4 = 1
            r3.<init>(r1, r4)     // Catch:{ IOException -> 0x0097 }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r3.write(r0)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r0 = 10
            r3.write(r0)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r3.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x0000
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.C1772wz.m1627c(r1, r0)
            goto L_0x0000
        L_0x008f:
            r0 = move-exception
            r2 = r3
            goto L_0x00ac
        L_0x0092:
            r0 = move-exception
            r2 = r3
            goto L_0x0098
        L_0x0095:
            r0 = move-exception
            goto L_0x00ac
        L_0x0097:
            r0 = move-exception
        L_0x0098:
            java.lang.String r1 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.C1772wz.m1627c(r1, r0)     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x0000
            r2.close()     // Catch:{ IOException -> 0x00a4 }
            goto L_0x0000
        L_0x00a4:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.C1772wz.m1627c(r1, r0)
            goto L_0x0000
        L_0x00ac:
            if (r2 == 0) goto L_0x00b8
            r2.close()     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00b8
        L_0x00b2:
            r1 = move-exception
            java.lang.String r2 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.C1772wz.m1627c(r2, r1)
        L_0x00b8:
            throw r0
        L_0x00b9:
            java.lang.String r0 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)
            goto L_0x0000
        L_0x00c0:
            com.google.android.gms.ads.internal.zzbv.zzlf()
            android.content.Context r1 = r5.f6364f
            java.lang.String r2 = r5.f6365g
            com.google.android.gms.internal.ads.C1782xi.m8372a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String) r0)
            goto L_0x0000
        L_0x00cc:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter:reporter interrupted"
            com.google.android.gms.internal.ads.C1772wz.m1627c(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1638s.m7856a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, String> mo12933a(Map<String, String> map, @Nullable Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo12932a(str).mo13090a(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final C1746w mo12932a(String str) {
        C1746w wVar = this.f6362d.get(str);
        if (wVar != null) {
            return wVar;
        }
        return C1746w.f6673a;
    }
}
