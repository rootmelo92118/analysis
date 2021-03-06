package com.google.android.gms.internal.ads;

import android.support.annotation.VisibleForTesting;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.rd */
public final class C1615rd extends C1346he {

    /* renamed from: a */
    private final C1664sz f6287a;

    /* renamed from: b */
    private final SSLSocketFactory f6288b;

    public C1615rd() {
        this((C1664sz) null);
    }

    private C1615rd(C1664sz szVar) {
        this((C1664sz) null, (SSLSocketFactory) null);
    }

    private C1615rd(C1664sz szVar, SSLSocketFactory sSLSocketFactory) {
        this.f6287a = null;
        this.f6288b = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1559pb mo12548a(com.google.android.gms.internal.ads.blj<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.mo12122e()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.putAll(r8)
            java.util.Map r8 = r7.mo12116b()
            r1.putAll(r8)
            com.google.android.gms.internal.ads.sz r8 = r6.f6287a
            if (r8 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.sz r8 = r6.f6287a
            java.lang.String r8 = r8.mo12963a(r0)
            if (r8 != 0) goto L_0x003d
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "URL blocked by rewriter: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0032
            java.lang.String r8 = r8.concat(r0)
            goto L_0x0038
        L_0x0032:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8)
            r8 = r0
        L_0x0038:
            r7.<init>(r8)
            throw r7
        L_0x003c:
            r8 = r0
        L_0x003d:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r8)
            java.net.URLConnection r8 = r0.openConnection()
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r8.setInstanceFollowRedirects(r2)
            int r2 = r7.mo12127j()
            r8.setConnectTimeout(r2)
            r8.setReadTimeout(r2)
            r2 = 0
            r8.setUseCaches(r2)
            r3 = 1
            r8.setDoInput(r3)
            java.lang.String r4 = "https"
            java.lang.String r0 = r0.getProtocol()
            r4.equals(r0)
            java.util.Set r0 = r1.keySet()     // Catch:{ all -> 0x0127 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0127 }
        L_0x0072:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0127 }
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0127 }
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0127 }
            r8.setRequestProperty(r4, r5)     // Catch:{ all -> 0x0127 }
            goto L_0x0072
        L_0x0088:
            int r0 = r7.mo12118c()     // Catch:{ all -> 0x0127 }
            switch(r0) {
                case -1: goto L_0x00cb;
                case 0: goto L_0x00c6;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a8;
                case 5: goto L_0x00a2;
                case 6: goto L_0x009c;
                case 7: goto L_0x0093;
                default: goto L_0x008f;
            }     // Catch:{ all -> 0x0127 }
        L_0x008f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0127 }
            goto L_0x0121
        L_0x0093:
            java.lang.String r0 = "PATCH"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0127 }
            m7826a((java.net.HttpURLConnection) r8, (com.google.android.gms.internal.ads.blj<?>) r7)     // Catch:{ all -> 0x0127 }
            goto L_0x00cb
        L_0x009c:
            java.lang.String r0 = "TRACE"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x00cb
        L_0x00a2:
            java.lang.String r0 = "OPTIONS"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x00cb
        L_0x00a8:
            java.lang.String r0 = "HEAD"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x00cb
        L_0x00ae:
            java.lang.String r0 = "DELETE"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x00cb
        L_0x00b4:
            java.lang.String r0 = "PUT"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0127 }
            m7826a((java.net.HttpURLConnection) r8, (com.google.android.gms.internal.ads.blj<?>) r7)     // Catch:{ all -> 0x0127 }
            goto L_0x00cb
        L_0x00bd:
            java.lang.String r0 = "POST"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0127 }
            m7826a((java.net.HttpURLConnection) r8, (com.google.android.gms.internal.ads.blj<?>) r7)     // Catch:{ all -> 0x0127 }
            goto L_0x00cb
        L_0x00c6:
            java.lang.String r0 = "GET"
            r8.setRequestMethod(r0)     // Catch:{ all -> 0x0127 }
        L_0x00cb:
            int r0 = r8.getResponseCode()     // Catch:{ all -> 0x0127 }
            r1 = -1
            if (r0 == r1) goto L_0x0119
            int r7 = r7.mo12118c()     // Catch:{ all -> 0x0127 }
            r1 = 4
            if (r7 == r1) goto L_0x00eb
            r7 = 100
            if (r7 > r0) goto L_0x00e1
            r7 = 200(0xc8, float:2.8E-43)
            if (r0 < r7) goto L_0x00eb
        L_0x00e1:
            r7 = 204(0xcc, float:2.86E-43)
            if (r0 == r7) goto L_0x00eb
            r7 = 304(0x130, float:4.26E-43)
            if (r0 == r7) goto L_0x00eb
            r7 = 1
            goto L_0x00ec
        L_0x00eb:
            r7 = 0
        L_0x00ec:
            if (r7 != 0) goto L_0x00ff
            com.google.android.gms.internal.ads.pb r7 = new com.google.android.gms.internal.ads.pb     // Catch:{ all -> 0x0127 }
            java.util.Map r1 = r8.getHeaderFields()     // Catch:{ all -> 0x0127 }
            java.util.List r1 = m7825a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r1)     // Catch:{ all -> 0x0127 }
            r7.<init>(r0, r1)     // Catch:{ all -> 0x0127 }
            r8.disconnect()
            return r7
        L_0x00ff:
            com.google.android.gms.internal.ads.pb r7 = new com.google.android.gms.internal.ads.pb     // Catch:{ all -> 0x0116 }
            java.util.Map r1 = r8.getHeaderFields()     // Catch:{ all -> 0x0116 }
            java.util.List r1 = m7825a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r1)     // Catch:{ all -> 0x0116 }
            int r2 = r8.getContentLength()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.sa r4 = new com.google.android.gms.internal.ads.sa     // Catch:{ all -> 0x0116 }
            r4.<init>(r8)     // Catch:{ all -> 0x0116 }
            r7.<init>(r0, r1, r2, r4)     // Catch:{ all -> 0x0116 }
            return r7
        L_0x0116:
            r7 = move-exception
            r2 = 1
            goto L_0x0128
        L_0x0119:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r0)     // Catch:{ all -> 0x0127 }
            throw r7     // Catch:{ all -> 0x0127 }
        L_0x0121:
            java.lang.String r0 = "Unknown method type."
            r7.<init>(r0)     // Catch:{ all -> 0x0127 }
            throw r7     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r7 = move-exception
        L_0x0128:
            if (r2 != 0) goto L_0x012d
            r8.disconnect()
        L_0x012d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1615rd.mo12548a(com.google.android.gms.internal.ads.blj, java.util.Map):com.google.android.gms.internal.ads.pb");
    }

    @VisibleForTesting
    /* renamed from: a */
    private static List<bff> m7825a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String bff : (List) next.getValue()) {
                    arrayList.add(new bff((String) next.getKey(), bff));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static InputStream m7827b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: a */
    private static void m7826a(HttpURLConnection httpURLConnection, blj<?> blj) {
        byte[] a = blj.mo12115a();
        if (a != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                String valueOf = String.valueOf("UTF-8");
                httpURLConnection.setRequestProperty("Content-Type", valueOf.length() != 0 ? "application/x-www-form-urlencoded; charset=".concat(valueOf) : new String("application/x-www-form-urlencoded; charset="));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(a);
            dataOutputStream.close();
        }
    }
}
