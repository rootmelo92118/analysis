package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.C0969e;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.v */
public final class C2299v extends C2253eb {

    /* renamed from: b */
    private final SSLSocketFactory f8638b;

    public C2299v(C2254ec ecVar) {
        super(ecVar);
        this.f8638b = Build.VERSION.SDK_INT < 19 ? new C2265em() : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14289e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo14846f() {
        NetworkInfo networkInfo;
        mo14508k();
        try {
            networkInfo = ((ConnectivityManager) mo14231n().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m11452a(java.net.HttpURLConnection r5) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0025 }
            r1.<init>()     // Catch:{ all -> 0x0025 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ all -> 0x0025 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0023 }
        L_0x000e:
            int r2 = r5.read(r0)     // Catch:{ all -> 0x0023 }
            if (r2 <= 0) goto L_0x0019
            r3 = 0
            r1.write(r0, r3, r2)     // Catch:{ all -> 0x0023 }
            goto L_0x000e
        L_0x0019:
            byte[] r0 = r1.toByteArray()     // Catch:{ all -> 0x0023 }
            if (r5 == 0) goto L_0x0022
            r5.close()
        L_0x0022:
            return r0
        L_0x0023:
            r0 = move-exception
            goto L_0x0029
        L_0x0025:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L_0x0029:
            if (r5 == 0) goto L_0x002e
            r5.close()
        L_0x002e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2299v.m11452a(java.net.HttpURLConnection):byte[]");
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final HttpURLConnection mo14845a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            if (this.f8638b != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(this.f8638b);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2261ei mo14291g() {
        return super.mo14291g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2269eq mo14293h() {
        return super.mo14293h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C2275ew mo14294i() {
        return super.mo14294i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
