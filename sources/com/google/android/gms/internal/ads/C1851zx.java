package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.p034v4.internal.view.SupportMenu;
import android.support.p034v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.C0851d;
import com.google.android.gms.common.C0858g;
import com.google.android.gms.common.util.C0979o;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.zx */
public final class C1851zx {

    /* renamed from: a */
    public static final Handler f6962a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static final String f6963b = AdView.class.getName();

    /* renamed from: c */
    private static final String f6964c = InterstitialAd.class.getName();

    /* renamed from: d */
    private static final String f6965d = PublisherAdView.class.getName();

    /* renamed from: e */
    private static final String f6966e = PublisherInterstitialAd.class.getName();

    /* renamed from: f */
    private static final String f6967f = SearchAdView.class.getName();

    /* renamed from: g */
    private static final String f6968g = AdLoader.class.getName();

    /* renamed from: a */
    public static void m8590a(boolean z, HttpURLConnection httpURLConnection, @Nullable String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty(C0008a.HEADER_USER_AGENT, str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static int m8582a(Context context, int i) {
        return m8583a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m8583a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: b */
    public static int m8592b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m8593b(displayMetrics, i);
    }

    /* renamed from: b */
    public static int m8593b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    public final void mo13303a(ViewGroup viewGroup, zzwf zzwf, String str, String str2) {
        aai.m1630e(str2);
        m8589a(viewGroup, zzwf, str, (int) SupportMenu.CATEGORY_MASK, (int) ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: a */
    public final void mo13302a(ViewGroup viewGroup, zzwf zzwf, String str) {
        m8589a(viewGroup, zzwf, str, (int) ViewCompat.MEASURED_STATE_MASK, -1);
    }

    /* renamed from: a */
    private final void m8589a(ViewGroup viewGroup, zzwf zzwf, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m8582a(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(zzwf.f7297f - a, zzwf.f7294c - a, 17));
            viewGroup.addView(frameLayout, zzwf.f7297f, zzwf.f7294c);
        }
    }

    /* renamed from: a */
    public static String m8584a(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || m8591a()) {
            str = "emulator";
        }
        return m8585a(str);
    }

    @Nullable
    /* renamed from: b */
    public static String m8594b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    /* renamed from: a */
    public static boolean m8591a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public static boolean m8595b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static String m8585a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m8599c(Context context, int i) {
        return C0851d.m1126b().mo9722b(context, i) == 0;
    }

    /* renamed from: c */
    public static boolean m8598c(Context context) {
        int b = C0851d.m1126b().mo9722b(context, (int) C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return b == 0 || b == 2;
    }

    /* renamed from: d */
    public static boolean m8600d(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600) {
            return true;
        }
        return false;
    }

    @TargetApi(17)
    /* renamed from: e */
    public static boolean m8601e(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (C0979o.m1503d()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
                return false;
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (i3 == i2 && i4 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static int m8602f(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", C0008a.ANDROID_CLIENT_TYPE);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Nullable
    /* renamed from: a */
    public static String m8586a(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f6963b.equalsIgnoreCase(className) && !f6964c.equalsIgnoreCase(className) && !f6965d.equalsIgnoreCase(className) && !f6966e.equalsIgnoreCase(className) && !f6967f.equalsIgnoreCase(className) && !f6968g.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo13301a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        m8588a(context, str, str2, bundle, true, new C1852zy(this));
    }

    /* renamed from: a */
    public static void m8588a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, aaa aaa) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", Build.VERSION.RELEASE);
            bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                int c = C0851d.m1126b().mo9729c(context);
                StringBuilder sb = new StringBuilder(20);
                sb.append(c);
                sb.append(".14300000");
                str = sb.toString();
            }
            bundle.putString("js", str);
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        aaa.mo10027a(appendQueryParameter.toString());
    }

    /* renamed from: c */
    public static String m8597c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: a */
    public static Throwable m8587a(Throwable th) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6104e)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m8596b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: b */
    public static boolean m8596b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) bre.m6321e().mo12778a(C1557p.f6129f))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(C1598qn.class);
        } catch (Exception e) {
            String valueOf = String.valueOf(str);
            aai.m1622a(valueOf.length() != 0 ? "Fail to check class type for class ".concat(valueOf) : new String("Fail to check class type for class "), e);
            return false;
        }
    }
}
