package p000a.p001a.p002a.p003a.p004a.p010e;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

/* renamed from: a.a.a.a.a.e.d */
/* compiled from: HttpRequest */
public class C0094d {

    /* renamed from: b */
    private static final String[] f172b = new String[0];

    /* renamed from: c */
    private static C0097b f173c = C0097b.f189a;

    /* renamed from: a */
    public final URL f174a;

    /* renamed from: d */
    private HttpURLConnection f175d = null;

    /* renamed from: e */
    private final String f176e;

    /* renamed from: f */
    private C0101e f177f;

    /* renamed from: g */
    private boolean f178g;

    /* renamed from: h */
    private boolean f179h = true;

    /* renamed from: i */
    private boolean f180i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f181j = 8192;

    /* renamed from: k */
    private String f182k;

    /* renamed from: l */
    private int f183l;

    /* renamed from: a.a.a.a.a.e.d$b */
    /* compiled from: HttpRequest */
    public interface C0097b {

        /* renamed from: a */
        public static final C0097b f189a = new C0097b() {
            /* renamed from: a */
            public HttpURLConnection mo239a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }

            /* renamed from: a */
            public HttpURLConnection mo240a(URL url, Proxy proxy) {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        /* renamed from: a */
        HttpURLConnection mo239a(URL url);

        /* renamed from: a */
        HttpURLConnection mo240a(URL url, Proxy proxy);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m248f(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    /* renamed from: a */
    private static StringBuilder m240a(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    /* renamed from: b */
    private static StringBuilder m243b(String str, StringBuilder sb) {
        int indexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            sb.append('&');
        }
        return sb;
    }

    /* renamed from: a.a.a.a.a.e.d$c */
    /* compiled from: HttpRequest */
    public static class C0099c extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        protected C0099c(IOException iOException) {
            super(iOException);
        }

        /* renamed from: a */
        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    /* renamed from: a.a.a.a.a.e.d$d */
    /* compiled from: HttpRequest */
    protected static abstract class C0100d<V> implements Callable<V> {
        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract V mo237b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo238c();

        protected C0100d() {
        }

        public V call() {
            boolean z = true;
            try {
                V b = mo237b();
                try {
                    mo238c();
                    return b;
                } catch (IOException e) {
                    throw new C0099c(e);
                }
            } catch (C0099c e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C0099c(e3);
            } catch (Throwable th) {
                th = th;
                mo238c();
                throw th;
            }
        }
    }

    /* renamed from: a.a.a.a.a.e.d$a */
    /* compiled from: HttpRequest */
    protected static abstract class C0096a<V> extends C0100d<V> {

        /* renamed from: a */
        private final Closeable f187a;

        /* renamed from: b */
        private final boolean f188b;

        protected C0096a(Closeable closeable, boolean z) {
            this.f187a = closeable;
            this.f188b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo238c() {
            if (this.f187a instanceof Flushable) {
                ((Flushable) this.f187a).flush();
            }
            if (this.f188b) {
                try {
                    this.f187a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f187a.close();
            }
        }
    }

    /* renamed from: a.a.a.a.a.e.d$e */
    /* compiled from: HttpRequest */
    public static class C0101e extends BufferedOutputStream {

        /* renamed from: a */
        private final CharsetEncoder f190a;

        public C0101e(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f190a = Charset.forName(C0094d.m248f(str)).newEncoder();
        }

        /* renamed from: a */
        public C0101e mo244a(String str) {
            ByteBuffer encode = this.f190a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    /* renamed from: a */
    public static String m238a(CharSequence charSequence) {
        int i;
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                host = host + ':' + Integer.toString(port);
            }
            try {
                String aSCIIString = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i) + aSCIIString.substring(i).replace("+", "%2B").replace("#", "%23");
            } catch (URISyntaxException e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new C0099c(iOException);
            }
        } catch (IOException e2) {
            throw new C0099c(e2);
        }
    }

    /* renamed from: a */
    public static String m239a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        m240a(charSequence2, sb);
        m243b(charSequence2, sb);
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        sb.append(next.getKey().toString());
        sb.append('=');
        Object value = next.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (it.hasNext()) {
            sb.append('&');
            Map.Entry next2 = it.next();
            sb.append(next2.getKey().toString());
            sb.append('=');
            Object value2 = next2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static C0094d m241b(CharSequence charSequence) {
        return new C0094d(charSequence, "GET");
    }

    /* renamed from: a */
    public static C0094d m237a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a = m239a(charSequence, map);
        if (z) {
            a = m238a((CharSequence) a);
        }
        return m241b((CharSequence) a);
    }

    /* renamed from: c */
    public static C0094d m244c(CharSequence charSequence) {
        return new C0094d(charSequence, "POST");
    }

    /* renamed from: b */
    public static C0094d m242b(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a = m239a(charSequence, map);
        if (z) {
            a = m238a((CharSequence) a);
        }
        return m244c((CharSequence) a);
    }

    /* renamed from: d */
    public static C0094d m245d(CharSequence charSequence) {
        return new C0094d(charSequence, "PUT");
    }

    /* renamed from: e */
    public static C0094d m246e(CharSequence charSequence) {
        return new C0094d(charSequence, "DELETE");
    }

    public C0094d(CharSequence charSequence, String str) {
        try {
            this.f174a = new URL(charSequence.toString());
            this.f176e = str;
        } catch (MalformedURLException e) {
            throw new C0099c(e);
        }
    }

    /* renamed from: p */
    private Proxy m249p() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f182k, this.f183l));
    }

    /* renamed from: q */
    private HttpURLConnection m250q() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.f182k != null) {
                httpURLConnection = f173c.mo240a(this.f174a, m249p());
            } else {
                httpURLConnection = f173c.mo239a(this.f174a);
            }
            httpURLConnection.setRequestMethod(this.f176e);
            return httpURLConnection;
        } catch (IOException e) {
            throw new C0099c(e);
        }
    }

    public String toString() {
        return mo234o() + ' ' + mo233n();
    }

    /* renamed from: a */
    public HttpURLConnection mo210a() {
        if (this.f175d == null) {
            this.f175d = m250q();
        }
        return this.f175d;
    }

    /* renamed from: b */
    public int mo211b() {
        try {
            mo229j();
            return mo210a().getResponseCode();
        } catch (IOException e) {
            throw new C0099c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ByteArrayOutputStream mo216c() {
        int i = mo228i();
        if (i > 0) {
            return new ByteArrayOutputStream(i);
        }
        return new ByteArrayOutputStream();
    }

    /* renamed from: a */
    public String mo209a(String str) {
        ByteArrayOutputStream c = mo216c();
        try {
            mo199a((InputStream) mo222e(), (OutputStream) c);
            return c.toString(m248f(str));
        } catch (IOException e) {
            throw new C0099c(e);
        }
    }

    /* renamed from: d */
    public String mo220d() {
        return mo209a(mo226g());
    }

    /* renamed from: e */
    public BufferedInputStream mo222e() {
        return new BufferedInputStream(mo225f(), this.f181j);
    }

    /* renamed from: f */
    public InputStream mo225f() {
        InputStream inputStream;
        if (mo211b() < 400) {
            try {
                inputStream = mo210a().getInputStream();
            } catch (IOException e) {
                throw new C0099c(e);
            }
        } else {
            inputStream = mo210a().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = mo210a().getInputStream();
                } catch (IOException e2) {
                    throw new C0099c(e2);
                }
            }
        }
        if (!this.f180i || !"gzip".equals(mo227h())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e3) {
            throw new C0099c(e3);
        }
    }

    /* renamed from: a */
    public C0094d mo198a(int i) {
        mo210a().setConnectTimeout(i);
        return this;
    }

    /* renamed from: a */
    public C0094d mo201a(String str, String str2) {
        mo210a().setRequestProperty(str, str2);
        return this;
    }

    /* renamed from: a */
    public C0094d mo207a(Map.Entry<String, String> entry) {
        return mo201a(entry.getKey(), entry.getValue());
    }

    /* renamed from: b */
    public String mo213b(String str) {
        mo230k();
        return mo210a().getHeaderField(str);
    }

    /* renamed from: c */
    public int mo215c(String str) {
        return mo197a(str, -1);
    }

    /* renamed from: a */
    public int mo197a(String str, int i) {
        mo230k();
        return mo210a().getHeaderFieldInt(str, i);
    }

    /* renamed from: b */
    public String mo214b(String str, String str2) {
        return mo217c(mo213b(str), str2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    /* renamed from: c */
    protected java.lang.String mo217c(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0071
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x0071
        L_0x000a:
            int r1 = r9.length()
            r2 = 59
            int r3 = r9.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x0070
            if (r3 != r1) goto L_0x001b
            goto L_0x0070
        L_0x001b:
            int r5 = r9.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r9.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r9.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r9.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r9 = 2
            if (r7 <= r9) goto L_0x0065
            r9 = 0
            char r9 = r3.charAt(r9)
            r10 = 34
            if (r10 != r9) goto L_0x0065
            int r7 = r7 - r4
            char r9 = r3.charAt(r7)
            if (r10 != r9) goto L_0x0065
            java.lang.String r9 = r3.substring(r4, r7)
            return r9
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r9.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        L_0x0070:
            return r0
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p002a.p003a.p004a.p010e.C0094d.mo217c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    public String mo226g() {
        return mo214b("Content-Type", "charset");
    }

    /* renamed from: a */
    public C0094d mo208a(boolean z) {
        mo210a().setUseCaches(z);
        return this;
    }

    /* renamed from: h */
    public String mo227h() {
        return mo213b("Content-Encoding");
    }

    /* renamed from: d */
    public C0094d mo218d(String str) {
        return mo219d(str, (String) null);
    }

    /* renamed from: d */
    public C0094d mo219d(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return mo201a("Content-Type", str);
        }
        return mo201a("Content-Type", str + "; charset=" + str2);
    }

    /* renamed from: i */
    public int mo228i() {
        return mo215c("Content-Length");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0094d mo199a(InputStream inputStream, OutputStream outputStream) {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        return (C0094d) new C0096a<C0094d>(inputStream, this.f179h) {
            /* renamed from: a */
            public C0094d mo237b() {
                byte[] bArr = new byte[C0094d.this.f181j];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return C0094d.this;
                    }
                    outputStream2.write(bArr, 0, read);
                }
            }
        }.call();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0094d mo229j() {
        if (this.f177f == null) {
            return this;
        }
        if (this.f178g) {
            this.f177f.mo244a("\r\n--00content0boundary00--\r\n");
        }
        if (this.f179h) {
            try {
                this.f177f.close();
            } catch (IOException unused) {
            }
        } else {
            this.f177f.close();
        }
        this.f177f = null;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0094d mo230k() {
        try {
            return mo229j();
        } catch (IOException e) {
            throw new C0099c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0094d mo231l() {
        if (this.f177f != null) {
            return this;
        }
        mo210a().setDoOutput(true);
        this.f177f = new C0101e(mo210a().getOutputStream(), mo217c(mo210a().getRequestProperty("Content-Type"), "charset"), this.f181j);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0094d mo232m() {
        if (!this.f178g) {
            this.f178g = true;
            mo218d("multipart/form-data; boundary=00content0boundary00").mo231l();
            this.f177f.mo244a("--00content0boundary00\r\n");
        } else {
            this.f177f.mo244a("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0094d mo203a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        mo224f("Content-Disposition", sb.toString());
        if (str3 != null) {
            mo224f("Content-Type", str3);
        }
        return mo223f((CharSequence) "\r\n");
    }

    /* renamed from: e */
    public C0094d mo221e(String str, String str2) {
        return mo212b(str, (String) null, str2);
    }

    /* renamed from: b */
    public C0094d mo212b(String str, String str2, String str3) {
        return mo206a(str, str2, (String) null, str3);
    }

    /* renamed from: a */
    public C0094d mo206a(String str, String str2, String str3, String str4) {
        try {
            mo232m();
            mo203a(str, str2, str3);
            this.f177f.mo244a(str4);
            return this;
        } catch (IOException e) {
            throw new C0099c(e);
        }
    }

    /* renamed from: a */
    public C0094d mo200a(String str, Number number) {
        return mo202a(str, (String) null, number);
    }

    /* renamed from: a */
    public C0094d mo202a(String str, String str2, Number number) {
        return mo212b(str, str2, number != null ? number.toString() : null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0024 A[SYNTHETIC, Splitter:B:19:0x0024] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000a.p001a.p002a.p003a.p004a.p010e.C0094d mo204a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x001b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x001b }
            r2.<init>(r7)     // Catch:{ IOException -> 0x001b }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001b }
            a.a.a.a.a.e.d r4 = r3.mo205a((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.io.InputStream) r1)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return r4
        L_0x0013:
            r4 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x0016:
            r4 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0019:
            r4 = move-exception
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
        L_0x001c:
            a.a.a.a.a.e.d$c r5 = new a.a.a.a.a.e.d$c     // Catch:{ all -> 0x0019 }
            r5.<init>(r4)     // Catch:{ all -> 0x0019 }
            throw r5     // Catch:{ all -> 0x0019 }
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p002a.p003a.p004a.p010e.C0094d.mo204a(java.lang.String, java.lang.String, java.lang.String, java.io.File):a.a.a.a.a.e.d");
    }

    /* renamed from: a */
    public C0094d mo205a(String str, String str2, String str3, InputStream inputStream) {
        try {
            mo232m();
            mo203a(str, str2, str3);
            mo199a(inputStream, (OutputStream) this.f177f);
            return this;
        } catch (IOException e) {
            throw new C0099c(e);
        }
    }

    /* renamed from: f */
    public C0094d mo224f(String str, String str2) {
        return mo223f((CharSequence) str).mo223f((CharSequence) ": ").mo223f((CharSequence) str2).mo223f((CharSequence) "\r\n");
    }

    /* renamed from: f */
    public C0094d mo223f(CharSequence charSequence) {
        try {
            mo231l();
            this.f177f.mo244a(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new C0099c(e);
        }
    }

    /* renamed from: n */
    public URL mo233n() {
        return mo210a().getURL();
    }

    /* renamed from: o */
    public String mo234o() {
        return mo210a().getRequestMethod();
    }
}
