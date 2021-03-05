package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.li */
public final class C1458li implements C1830zc {

    /* renamed from: a */
    private final Map<String, C1477ma> f5660a;

    /* renamed from: b */
    private long f5661b;

    /* renamed from: c */
    private final File f5662c;

    /* renamed from: d */
    private final int f5663d;

    public C1458li(File file, int i) {
        this.f5660a = new LinkedHashMap(16, 0.75f, true);
        this.f5661b = 0;
        this.f5662c = file;
        this.f5663d = i;
    }

    public C1458li(File file) {
        this(file, 5242880);
    }

    /* renamed from: a */
    public final synchronized awd mo12769a(String str) {
        C1502mz mzVar;
        C1477ma maVar = this.f5660a.get(str);
        if (maVar == null) {
            return null;
        }
        File d = m7418d(str);
        try {
            mzVar = new C1502mz(new BufferedInputStream(m7406a(d)), d.length());
            C1477ma a = C1477ma.m7591a(mzVar);
            if (!TextUtils.equals(str, a.f5709b)) {
                C1264ee.m6817b("%s: key=%s, found=%s", d.getAbsolutePath(), str, a.f5709b);
                m7419e(str);
                mzVar.close();
                return null;
            }
            byte[] a2 = m7412a(mzVar, mzVar.mo12805a());
            awd awd = new awd();
            awd.f2953a = a2;
            awd.f2954b = maVar.f5710c;
            awd.f2955c = maVar.f5711d;
            awd.f2956d = maVar.f5712e;
            awd.f2957e = maVar.f5713f;
            awd.f2958f = maVar.f5714g;
            List<bff> list = maVar.f5715h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (bff next : list) {
                treeMap.put(next.mo11807a(), next.mo11808b());
            }
            awd.f2959g = treeMap;
            awd.f2960h = Collections.unmodifiableList(maVar.f5715h);
            mzVar.close();
            return awd;
        } catch (IOException e) {
            C1264ee.m6817b("%s: %s", d.getAbsolutePath(), e.toString());
            m7415b(str);
            return null;
        } catch (Throwable th) {
            mzVar.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12770a() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.f5662c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r9.f5662c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.io.File r3 = r9.f5662c     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r2[r1] = r3     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.C1264ee.m6818c(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File r0 = r9.f5662c     // Catch:{ all -> 0x0061 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x0061 }
        L_0x002f:
            if (r1 >= r2) goto L_0x005f
            r3 = r0[r1]     // Catch:{ all -> 0x0061 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.mz r6 = new com.google.android.gms.internal.ads.mz     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = m7406a((java.io.File) r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.ma r7 = com.google.android.gms.internal.ads.C1477ma.m7591a((com.google.android.gms.internal.ads.C1502mz) r6)     // Catch:{ all -> 0x0054 }
            r7.f5708a = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.f5709b     // Catch:{ all -> 0x0054 }
            r9.m7411a((java.lang.String) r4, (com.google.android.gms.internal.ads.C1477ma) r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0061 }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1458li.mo12770a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|(1:36)|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        if (r3.delete() == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
        com.google.android.gms.internal.ads.C1264ee.m6817b("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0115, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00ff */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12771a(java.lang.String r20, com.google.android.gms.internal.ads.awd r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            monitor-enter(r19)
            byte[] r3 = r2.f2953a     // Catch:{ all -> 0x0116 }
            int r3 = r3.length     // Catch:{ all -> 0x0116 }
            long r4 = r1.f5661b     // Catch:{ all -> 0x0116 }
            long r6 = (long) r3     // Catch:{ all -> 0x0116 }
            long r4 = r4 + r6
            int r3 = r1.f5663d     // Catch:{ all -> 0x0116 }
            long r8 = (long) r3     // Catch:{ all -> 0x0116 }
            r10 = 0
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x00c1
            boolean r4 = com.google.android.gms.internal.ads.C1264ee.f5336a     // Catch:{ all -> 0x0116 }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "Pruning old cache entries."
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.C1264ee.m6815a(r4, r5)     // Catch:{ all -> 0x0116 }
        L_0x0021:
            long r4 = r1.f5661b     // Catch:{ all -> 0x0116 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0116 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.ma> r11 = r1.f5660a     // Catch:{ all -> 0x0116 }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x0116 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0116 }
            r12 = 0
        L_0x0032:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x0116 }
            r14 = 2
            if (r13 == 0) goto L_0x0094
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x0116 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ all -> 0x0116 }
            java.lang.Object r13 = r13.getValue()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.ma r13 = (com.google.android.gms.internal.ads.C1477ma) r13     // Catch:{ all -> 0x0116 }
            java.lang.String r15 = r13.f5709b     // Catch:{ all -> 0x0116 }
            java.io.File r15 = r1.m7418d(r15)     // Catch:{ all -> 0x0116 }
            boolean r15 = r15.delete()     // Catch:{ all -> 0x0116 }
            if (r15 == 0) goto L_0x005e
            r16 = r4
            long r3 = r1.f5661b     // Catch:{ all -> 0x0116 }
            r18 = r11
            long r10 = r13.f5708a     // Catch:{ all -> 0x0116 }
            r5 = 0
            long r3 = r3 - r10
            r1.f5661b = r3     // Catch:{ all -> 0x0116 }
            goto L_0x0077
        L_0x005e:
            r16 = r4
            r18 = r11
            java.lang.String r3 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = r13.f5709b     // Catch:{ all -> 0x0116 }
            r10 = 0
            r4[r10] = r5     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = r13.f5709b     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = m7417c((java.lang.String) r5)     // Catch:{ all -> 0x0116 }
            r10 = 1
            r4[r10] = r5     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.C1264ee.m6817b(r3, r4)     // Catch:{ all -> 0x0116 }
        L_0x0077:
            r18.remove()     // Catch:{ all -> 0x0116 }
            int r12 = r12 + 1
            long r3 = r1.f5661b     // Catch:{ all -> 0x0116 }
            r5 = 0
            long r3 = r3 + r6
            float r3 = (float) r3     // Catch:{ all -> 0x0116 }
            int r4 = r1.f5663d     // Catch:{ all -> 0x0116 }
            float r4 = (float) r4     // Catch:{ all -> 0x0116 }
            r5 = 1063675494(0x3f666666, float:0.9)
            float r4 = r4 * r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x008e
            goto L_0x0096
        L_0x008e:
            r4 = r16
            r11 = r18
            r10 = 0
            goto L_0x0032
        L_0x0094:
            r16 = r4
        L_0x0096:
            boolean r3 = com.google.android.gms.internal.ads.C1264ee.f5336a     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x00c1
            java.lang.String r3 = "pruned %d files, %d bytes, %d ms"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0116 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0116 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0116 }
            long r5 = r1.f5661b     // Catch:{ all -> 0x0116 }
            r7 = 0
            long r5 = r5 - r16
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0116 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0116 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0116 }
            r7 = 0
            long r5 = r5 - r8
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0116 }
            r4[r14] = r5     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.C1264ee.m6815a(r3, r4)     // Catch:{ all -> 0x0116 }
        L_0x00c1:
            java.io.File r3 = r19.m7418d(r20)     // Catch:{ all -> 0x0116 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00ff }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ff }
            r5.<init>(r3)     // Catch:{ IOException -> 0x00ff }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00ff }
            com.google.android.gms.internal.ads.ma r5 = new com.google.android.gms.internal.ads.ma     // Catch:{ IOException -> 0x00ff }
            r5.<init>(r0, r2)     // Catch:{ IOException -> 0x00ff }
            boolean r6 = r5.mo12782a((java.io.OutputStream) r4)     // Catch:{ IOException -> 0x00ff }
            if (r6 == 0) goto L_0x00e7
            byte[] r2 = r2.f2953a     // Catch:{ IOException -> 0x00ff }
            r4.write(r2)     // Catch:{ IOException -> 0x00ff }
            r4.close()     // Catch:{ IOException -> 0x00ff }
            r1.m7411a((java.lang.String) r0, (com.google.android.gms.internal.ads.C1477ma) r5)     // Catch:{ IOException -> 0x00ff }
            monitor-exit(r19)
            return
        L_0x00e7:
            r4.close()     // Catch:{ IOException -> 0x00ff }
            java.lang.String r0 = "Failed to write header for %s"
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x00ff }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00ff }
            r5 = 0
            r4[r5] = r2     // Catch:{ IOException -> 0x00ff }
            com.google.android.gms.internal.ads.C1264ee.m6817b(r0, r4)     // Catch:{ IOException -> 0x00ff }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00ff }
            r0.<init>()     // Catch:{ IOException -> 0x00ff }
            throw r0     // Catch:{ IOException -> 0x00ff }
        L_0x00ff:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "Could not clean up file %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0116 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0116 }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.C1264ee.m6817b(r0, r2)     // Catch:{ all -> 0x0116 }
        L_0x0114:
            monitor-exit(r19)
            return
        L_0x0116:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1458li.mo12771a(java.lang.String, com.google.android.gms.internal.ads.awd):void");
    }

    /* renamed from: b */
    private final synchronized void m7415b(String str) {
        boolean delete = m7418d(str).delete();
        m7419e(str);
        if (!delete) {
            C1264ee.m6817b("Could not delete cache entry for key=%s, filename=%s", str, m7417c(str));
        }
    }

    /* renamed from: c */
    private static String m7417c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: d */
    private final File m7418d(String str) {
        return new File(this.f5662c, m7417c(str));
    }

    /* renamed from: a */
    private final void m7411a(String str, C1477ma maVar) {
        if (!this.f5660a.containsKey(str)) {
            this.f5661b += maVar.f5708a;
        } else {
            this.f5661b += maVar.f5708a - this.f5660a.get(str).f5708a;
        }
        this.f5660a.put(str, maVar);
    }

    /* renamed from: e */
    private final void m7419e(String str) {
        C1477ma remove = this.f5660a.remove(str);
        if (remove != null) {
            this.f5661b -= remove.f5708a;
        }
    }

    /* renamed from: a */
    private static byte[] m7412a(C1502mz mzVar, long j) {
        long a = mzVar.mo12805a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(mzVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    private static InputStream m7406a(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: c */
    private static int m7416c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static void m7408a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* renamed from: a */
    static int m7405a(InputStream inputStream) {
        return (m7416c(inputStream) << 24) | m7416c(inputStream) | 0 | (m7416c(inputStream) << 8) | (m7416c(inputStream) << 16);
    }

    /* renamed from: a */
    static void m7409a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: b */
    static long m7413b(InputStream inputStream) {
        return (((long) m7416c(inputStream)) & 255) | 0 | ((((long) m7416c(inputStream)) & 255) << 8) | ((((long) m7416c(inputStream)) & 255) << 16) | ((((long) m7416c(inputStream)) & 255) << 24) | ((((long) m7416c(inputStream)) & 255) << 32) | ((((long) m7416c(inputStream)) & 255) << 40) | ((((long) m7416c(inputStream)) & 255) << 48) | ((255 & ((long) m7416c(inputStream))) << 56);
    }

    /* renamed from: a */
    static void m7410a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m7409a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    static String m7407a(C1502mz mzVar) {
        return new String(m7412a(mzVar, m7413b((InputStream) mzVar)), "UTF-8");
    }

    /* renamed from: b */
    static List<bff> m7414b(C1502mz mzVar) {
        int a = m7405a((InputStream) mzVar);
        if (a >= 0) {
            List<bff> emptyList = a == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < a; i++) {
                emptyList.add(new bff(m7407a(mzVar).intern(), m7407a(mzVar).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(a);
        throw new IOException(sb.toString());
    }
}
