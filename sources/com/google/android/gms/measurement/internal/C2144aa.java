package com.google.android.gms.measurement.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0926p;
import java.net.URL;
import java.util.Map;

@WorkerThread
/* renamed from: com.google.android.gms.measurement.internal.aa */
final class C2144aa implements Runnable {

    /* renamed from: a */
    private final URL f8030a;

    /* renamed from: b */
    private final byte[] f8031b;

    /* renamed from: c */
    private final C2301x f8032c;

    /* renamed from: d */
    private final String f8033d;

    /* renamed from: e */
    private final Map<String, String> f8034e;

    /* renamed from: f */
    private final /* synthetic */ C2299v f8035f;

    public C2144aa(C2299v vVar, String str, URL url, byte[] bArr, Map<String, String> map, C2301x xVar) {
        this.f8035f = vVar;
        C0926p.m1308a(str);
        C0926p.m1306a(url);
        C0926p.m1306a(xVar);
        this.f8030a = url;
        this.f8031b = bArr;
        this.f8032c = xVar;
        this.f8033d = str;
        this.f8034e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c4 A[SYNTHETIC, Splitter:B:44:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A[SYNTHETIC, Splitter:B:57:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.v r0 = r12.f8035f
            r0.mo14220c()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.v r2 = r12.f8035f     // Catch:{ IOException -> 0x00fa, all -> 0x00be }
            java.net.URL r3 = r12.f8030a     // Catch:{ IOException -> 0x00fa, all -> 0x00be }
            java.net.HttpURLConnection r2 = r2.mo14845a((java.net.URL) r3)     // Catch:{ IOException -> 0x00fa, all -> 0x00be }
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.f8034e     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.f8034e     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            goto L_0x001d
        L_0x0039:
            byte[] r3 = r12.f8031b     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            if (r3 == 0) goto L_0x0084
            com.google.android.gms.measurement.internal.v r3 = r12.f8035f     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            com.google.android.gms.measurement.internal.ei r3 = r3.mo14291g()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            byte[] r4 = r12.f8031b     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            byte[] r3 = r3.mo14556b((byte[]) r4)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            com.google.android.gms.measurement.internal.v r4 = r12.f8035f     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo14235r()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14838x()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.String r5 = "Uploading data. size"
            int r6 = r3.length     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r4.mo14842a(r5, r6)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r4 = 1
            r2.setDoOutput(r4)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r5 = "gzip"
            r2.addRequestProperty(r4, r5)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            int r4 = r3.length     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r2.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r2.connect()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r4.write(r3)     // Catch:{ IOException -> 0x007e, all -> 0x007a }
            r4.close()     // Catch:{ IOException -> 0x007e, all -> 0x007a }
            goto L_0x0084
        L_0x007a:
            r3 = move-exception
            r10 = r0
            r0 = r4
            goto L_0x00c1
        L_0x007e:
            r3 = move-exception
            r10 = r0
            r8 = r3
            r0 = r4
            goto L_0x00fe
        L_0x0084:
            int r7 = r2.getResponseCode()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.util.Map r10 = r2.getHeaderFields()     // Catch:{ IOException -> 0x00b4, all -> 0x00b1 }
            com.google.android.gms.measurement.internal.v r1 = r12.f8035f     // Catch:{ IOException -> 0x00af, all -> 0x00ad }
            byte[] r9 = com.google.android.gms.measurement.internal.C2299v.m11452a((java.net.HttpURLConnection) r2)     // Catch:{ IOException -> 0x00af, all -> 0x00ad }
            if (r2 == 0) goto L_0x0097
            r2.disconnect()
        L_0x0097:
            com.google.android.gms.measurement.internal.v r0 = r12.f8035f
            com.google.android.gms.measurement.internal.ar r0 = r0.mo14234q()
            com.google.android.gms.measurement.internal.y r1 = new com.google.android.gms.measurement.internal.y
            java.lang.String r5 = r12.f8033d
            com.google.android.gms.measurement.internal.x r6 = r12.f8032c
            r8 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo14296a((java.lang.Runnable) r1)
            return
        L_0x00ad:
            r3 = move-exception
            goto L_0x00c2
        L_0x00af:
            r3 = move-exception
            goto L_0x00b6
        L_0x00b1:
            r3 = move-exception
            r10 = r0
            goto L_0x00c2
        L_0x00b4:
            r3 = move-exception
            r10 = r0
        L_0x00b6:
            r8 = r3
            goto L_0x00ff
        L_0x00b8:
            r3 = move-exception
            r10 = r0
            goto L_0x00c1
        L_0x00bb:
            r3 = move-exception
            r10 = r0
            goto L_0x00fd
        L_0x00be:
            r3 = move-exception
            r2 = r0
            r10 = r2
        L_0x00c1:
            r7 = 0
        L_0x00c2:
            if (r0 == 0) goto L_0x00de
            r0.close()     // Catch:{ IOException -> 0x00c8 }
            goto L_0x00de
        L_0x00c8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.v r1 = r12.f8035f
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()
            java.lang.String r4 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r5 = r12.f8033d
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r5)
            r1.mo14843a(r4, r5, r0)
        L_0x00de:
            if (r2 == 0) goto L_0x00e3
            r2.disconnect()
        L_0x00e3:
            com.google.android.gms.measurement.internal.v r0 = r12.f8035f
            com.google.android.gms.measurement.internal.ar r0 = r0.mo14234q()
            com.google.android.gms.measurement.internal.y r1 = new com.google.android.gms.measurement.internal.y
            java.lang.String r5 = r12.f8033d
            com.google.android.gms.measurement.internal.x r6 = r12.f8032c
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo14296a((java.lang.Runnable) r1)
            throw r3
        L_0x00fa:
            r3 = move-exception
            r2 = r0
            r10 = r2
        L_0x00fd:
            r8 = r3
        L_0x00fe:
            r7 = 0
        L_0x00ff:
            if (r0 == 0) goto L_0x011b
            r0.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x011b
        L_0x0105:
            r0 = move-exception
            com.google.android.gms.measurement.internal.v r1 = r12.f8035f
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()
            java.lang.String r3 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r4 = r12.f8033d
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r4)
            r1.mo14843a(r3, r4, r0)
        L_0x011b:
            if (r2 == 0) goto L_0x0120
            r2.disconnect()
        L_0x0120:
            com.google.android.gms.measurement.internal.v r0 = r12.f8035f
            com.google.android.gms.measurement.internal.ar r0 = r0.mo14234q()
            com.google.android.gms.measurement.internal.y r1 = new com.google.android.gms.measurement.internal.y
            java.lang.String r5 = r12.f8033d
            com.google.android.gms.measurement.internal.x r6 = r12.f8032c
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo14296a((java.lang.Runnable) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2144aa.run():void");
    }
}
