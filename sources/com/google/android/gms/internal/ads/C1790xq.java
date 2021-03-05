package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@TargetApi(8)
@C1598qn
/* renamed from: com.google.android.gms.internal.ads.xq */
public class C1790xq {
    /* renamed from: a */
    public int mo13222a() {
        return 0;
    }

    /* renamed from: a */
    public String mo13226a(Context context) {
        return "";
    }

    /* renamed from: a */
    public String mo13227a(SslError sslError) {
        return "";
    }

    /* renamed from: a */
    public boolean mo13231a(DownloadManager.Request request) {
        return false;
    }

    /* renamed from: a */
    public boolean mo13232a(Context context, WebSettings webSettings) {
        return false;
    }

    /* renamed from: a */
    public boolean mo13233a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: a */
    public boolean mo13234a(Window window) {
        return false;
    }

    /* renamed from: b */
    public int mo13235b() {
        return 1;
    }

    /* renamed from: b */
    public void mo13236b(Context context) {
    }

    /* renamed from: b */
    public boolean mo13237b(View view) {
        return false;
    }

    /* renamed from: c */
    public int mo13238c() {
        return 5;
    }

    /* renamed from: c */
    public boolean mo13240c(View view) {
        return false;
    }

    /* renamed from: f */
    public int mo13242f() {
        return 0;
    }

    /* renamed from: a */
    public static boolean m8434a(afl afl) {
        if (afl == null) {
            return false;
        }
        afl.onPause();
        return true;
    }

    /* renamed from: b */
    public static boolean m8435b(afl afl) {
        if (afl == null) {
            return false;
        }
        afl.onResume();
        return true;
    }

    /* renamed from: a */
    public afm mo13225a(afl afl, box box, boolean z) {
        return new afm(afl, box, z);
    }

    /* renamed from: a */
    public Set<String> mo13228a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: a */
    public void mo13230a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: d */
    public ViewGroup.LayoutParams mo13241d() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: a */
    public void mo13229a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public Drawable mo13223a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: e */
    public static boolean m8436e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: c */
    public CookieManager mo13239c(Context context) {
        if (m8436e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C1772wz.m1625b("Failed to obtain CookieManager.", th);
            zzbv.zzlj().mo13119a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo13224a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    private C1790xq() {
    }
}
