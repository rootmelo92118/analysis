package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

public final class bjl implements bje {

    /* renamed from: a */
    private static final Pattern f4474a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b */
    private static final AtomicReference<byte[]> f4475b = new AtomicReference<>();

    /* renamed from: c */
    private final boolean f4476c;

    /* renamed from: d */
    private final int f4477d;

    /* renamed from: e */
    private final int f4478e;

    /* renamed from: f */
    private final String f4479f;

    /* renamed from: g */
    private final bkj<String> f4480g;

    /* renamed from: h */
    private final bjo f4481h;

    /* renamed from: i */
    private final bjo f4482i;

    /* renamed from: j */
    private final bjx<? super bjl> f4483j;

    /* renamed from: k */
    private bji f4484k;

    /* renamed from: l */
    private HttpURLConnection f4485l;

    /* renamed from: m */
    private InputStream f4486m;

    /* renamed from: n */
    private boolean f4487n;

    /* renamed from: o */
    private long f4488o;

    /* renamed from: p */
    private long f4489p;

    /* renamed from: q */
    private long f4490q;

    /* renamed from: r */
    private long f4491r;

    public bjl(String str, bkj<String> bkj, bjx<? super bjl> bjx, int i, int i2, boolean z, bjo bjo) {
        if (!TextUtils.isEmpty(str)) {
            this.f4479f = str;
            this.f4480g = null;
            this.f4483j = bjx;
            this.f4482i = new bjo();
            this.f4477d = i;
            this.f4478e = i2;
            this.f4476c = true;
            this.f4481h = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final Uri mo10214b() {
        if (this.f4485l == null) {
            return null;
        }
        return Uri.parse(this.f4485l.getURL().toString());
    }

    /* renamed from: c */
    public final Map<String, List<String>> mo12019c() {
        if (this.f4485l == null) {
            return null;
        }
        return this.f4485l.getHeaderFields();
    }

    /* renamed from: a */
    public final long mo10212a(bji bji) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection a;
        bji bji2 = bji;
        this.f4484k = bji2;
        long j = 0;
        this.f4491r = 0;
        this.f4490q = 0;
        try {
            URL url = new URL(bji2.f4453a.toString());
            byte[] bArr = bji2.f4454b;
            long j2 = bji2.f4456d;
            long j3 = bji2.f4457e;
            boolean a2 = bji2.mo12014a(1);
            if (!this.f4476c) {
                httpURLConnection = m5648a(url, bArr, j2, j3, a2, true);
            } else {
                URL url2 = url;
                byte[] bArr2 = bArr;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i <= 20) {
                        URL url3 = url2;
                        int i3 = i2;
                        long j4 = j3;
                        long j5 = j2;
                        a = m5648a(url2, bArr2, j2, j3, a2, false);
                        int responseCode = a.getResponseCode();
                        if (!(responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303)) {
                            if (bArr2 == null) {
                                if (responseCode != 307) {
                                    if (responseCode != 308) {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        bArr2 = null;
                        String headerField = a.getHeaderField("Location");
                        a.disconnect();
                        if (headerField != null) {
                            url2 = new URL(url3, headerField);
                            String protocol = url2.getProtocol();
                            if ("https".equals(protocol) || "http".equals(protocol)) {
                                i = i3;
                                j3 = j4;
                                j2 = j5;
                            } else {
                                String valueOf = String.valueOf(protocol);
                                throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
                            }
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i2);
                        throw new NoRouteToHostException(sb.toString());
                    }
                }
                httpURLConnection = a;
            }
            this.f4485l = httpURLConnection;
            try {
                int responseCode2 = this.f4485l.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map headerFields = this.f4485l.getHeaderFields();
                    m5649d();
                    bjn bjn = new bjn(responseCode2, headerFields, bji2);
                    if (responseCode2 == 416) {
                        bjn.initCause(new bjg(0));
                    }
                    throw bjn;
                }
                this.f4485l.getContentType();
                if (responseCode2 == 200 && bji2.f4456d != 0) {
                    j = bji2.f4456d;
                }
                this.f4488o = j;
                if (!bji2.mo12014a(1)) {
                    long j6 = -1;
                    if (bji2.f4457e != -1) {
                        this.f4489p = bji2.f4457e;
                    } else {
                        long a3 = m5647a(this.f4485l);
                        if (a3 != -1) {
                            j6 = a3 - this.f4488o;
                        }
                        this.f4489p = j6;
                    }
                } else {
                    this.f4489p = bji2.f4457e;
                }
                try {
                    this.f4486m = this.f4485l.getInputStream();
                    this.f4487n = true;
                    if (this.f4483j != null) {
                        this.f4483j.mo10247a(this, bji2);
                    }
                    return this.f4489p;
                } catch (IOException e) {
                    m5649d();
                    throw new bjm(e, bji2, 1);
                }
            } catch (IOException e2) {
                m5649d();
                String valueOf2 = String.valueOf(bji2.f4453a.toString());
                throw new bjm(valueOf2.length() != 0 ? "Unable to connect to ".concat(valueOf2) : new String("Unable to connect to "), e2, bji2, 1);
            }
        } catch (IOException e3) {
            String valueOf3 = String.valueOf(bji2.f4453a.toString());
            throw new bjm(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e3, bji2, 1);
        }
    }

    /* renamed from: a */
    public final int mo10211a(byte[] bArr, int i, int i2) {
        try {
            if (this.f4490q != this.f4488o) {
                byte[] andSet = f4475b.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.f4490q != this.f4488o) {
                    int read = this.f4486m.read(andSet, 0, (int) Math.min(this.f4488o - this.f4490q, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f4490q += (long) read;
                        if (this.f4483j != null) {
                            this.f4483j.mo10246a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f4475b.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.f4489p != -1) {
                long j = this.f4489p - this.f4491r;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j);
            }
            int read2 = this.f4486m.read(bArr, i, i2);
            if (read2 != -1) {
                this.f4491r += (long) read2;
                if (this.f4483j != null) {
                    this.f4483j.mo10246a(this, read2);
                }
                return read2;
            } else if (this.f4489p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new bjm(e, this.f4484k, 2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r3 > android.support.p034v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) goto L_0x003b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10213a() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.f4486m     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x007c
            java.net.HttpURLConnection r2 = r10.f4485l     // Catch:{ all -> 0x0092 }
            long r3 = r10.f4489p     // Catch:{ all -> 0x0092 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r10.f4489p     // Catch:{ all -> 0x0092 }
            goto L_0x0019
        L_0x0013:
            long r3 = r10.f4489p     // Catch:{ all -> 0x0092 }
            long r7 = r10.f4491r     // Catch:{ all -> 0x0092 }
            r9 = 0
            long r3 = r3 - r7
        L_0x0019:
            int r7 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ all -> 0x0092 }
            r8 = 19
            if (r7 == r8) goto L_0x0025
            int r7 = com.google.android.gms.internal.ads.bkp.f4570a     // Catch:{ all -> 0x0092 }
            r8 = 20
            if (r7 != r8) goto L_0x006c
        L_0x0025:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x006c }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0035
            int r3 = r2.read()     // Catch:{ Exception -> 0x006c }
            r4 = -1
            if (r3 != r4) goto L_0x003b
            goto L_0x006c
        L_0x0035:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x006c
        L_0x003b:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006c }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x006c }
            if (r4 != 0) goto L_0x0053
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x006c }
            if (r3 == 0) goto L_0x006c
        L_0x0053:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006c }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006c }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006c }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            java.io.InputStream r2 = r10.f4486m     // Catch:{ IOException -> 0x0072 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x007c
        L_0x0072:
            r2 = move-exception
            com.google.android.gms.internal.ads.bjm r3 = new com.google.android.gms.internal.ads.bjm     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.bji r4 = r10.f4484k     // Catch:{ all -> 0x0092 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.bji) r4, (int) r5)     // Catch:{ all -> 0x0092 }
            throw r3     // Catch:{ all -> 0x0092 }
        L_0x007c:
            r10.f4486m = r0
            r10.m5649d()
            boolean r0 = r10.f4487n
            if (r0 == 0) goto L_0x0091
            r10.f4487n = r1
            com.google.android.gms.internal.ads.bjx<? super com.google.android.gms.internal.ads.bjl> r0 = r10.f4483j
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.bjx<? super com.google.android.gms.internal.ads.bjl> r0 = r10.f4483j
            r0.mo10245a(r10)
            return
        L_0x0091:
            return
        L_0x0092:
            r2 = move-exception
            r10.f4486m = r0
            r10.m5649d()
            boolean r0 = r10.f4487n
            if (r0 == 0) goto L_0x00a7
            r10.f4487n = r1
            com.google.android.gms.internal.ads.bjx<? super com.google.android.gms.internal.ads.bjl> r0 = r10.f4483j
            if (r0 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.bjx<? super com.google.android.gms.internal.ads.bjl> r0 = r10.f4483j
            r0.mo10245a(r10)
        L_0x00a7:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bjl.mo10213a():void");
    }

    /* renamed from: a */
    private final HttpURLConnection m5648a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f4477d);
        httpURLConnection.setReadTimeout(this.f4478e);
        for (Map.Entry next : this.f4482i.mo12020a().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j + j2) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty(C0008a.HEADER_USER_AGENT, this.f4479f);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m5647a(java.net.HttpURLConnection r8) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r8.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0036
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0011 }
            goto L_0x0038
        L_0x0011:
            java.lang.String r1 = "DefaultHttpDataSource"
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected Content-Length ["
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.e(r1, r2)
        L_0x0036:
            r1 = -1
        L_0x0038:
            java.lang.String r3 = "Content-Range"
            java.lang.String r8 = r8.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x00d4
            java.util.regex.Pattern r3 = f4474a
            java.util.regex.Matcher r3 = r3.matcher(r8)
            boolean r4 = r3.find()
            if (r4 == 0) goto L_0x00d4
            r4 = 2
            java.lang.String r4 = r3.group(r4)     // Catch:{ NumberFormatException -> 0x00af }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x00af }
            r6 = 1
            java.lang.String r3 = r3.group(r6)     // Catch:{ NumberFormatException -> 0x00af }
            long r6 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x00af }
            r3 = 0
            long r4 = r4 - r6
            r6 = 1
            long r4 = r4 + r6
            r6 = 0
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x006f
            r1 = r4
            goto L_0x00d4
        L_0x006f:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00d4
            java.lang.String r3 = "DefaultHttpDataSource"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00af }
            int r6 = r6.length()     // Catch:{ NumberFormatException -> 0x00af }
            int r6 = r6 + 26
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch:{ NumberFormatException -> 0x00af }
            int r7 = r7.length()     // Catch:{ NumberFormatException -> 0x00af }
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00af }
            r7.<init>(r6)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r6 = "Inconsistent headers ["
            r7.append(r6)     // Catch:{ NumberFormatException -> 0x00af }
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r0 = "] ["
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00af }
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r0 = r7.toString()     // Catch:{ NumberFormatException -> 0x00af }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x00af }
            long r3 = java.lang.Math.max(r1, r4)     // Catch:{ NumberFormatException -> 0x00af }
            r1 = r3
            goto L_0x00d4
        L_0x00af:
            java.lang.String r0 = "DefaultHttpDataSource"
            java.lang.String r3 = java.lang.String.valueOf(r8)
            int r3 = r3.length()
            int r3 = r3 + 27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Range ["
            r4.append(r3)
            r4.append(r8)
            java.lang.String r8 = "]"
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            android.util.Log.e(r0, r8)
        L_0x00d4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bjl.m5647a(java.net.HttpURLConnection):long");
    }

    /* renamed from: d */
    private final void m5649d() {
        if (this.f4485l != null) {
            try {
                this.f4485l.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f4485l = null;
        }
    }
}
