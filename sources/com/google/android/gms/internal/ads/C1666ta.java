package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.support.p034v4.app.NotificationCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0973i;
import com.google.android.gms.common.util.C0979o;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.ta */
public final class C1666ta {

    /* renamed from: A */
    private int f6506A;

    /* renamed from: B */
    private String f6507B;

    /* renamed from: C */
    private boolean f6508C;

    /* renamed from: a */
    private int f6509a;

    /* renamed from: b */
    private boolean f6510b;

    /* renamed from: c */
    private boolean f6511c;

    /* renamed from: d */
    private int f6512d;

    /* renamed from: e */
    private int f6513e;

    /* renamed from: f */
    private int f6514f;

    /* renamed from: g */
    private String f6515g;

    /* renamed from: h */
    private int f6516h;

    /* renamed from: i */
    private int f6517i;

    /* renamed from: j */
    private int f6518j;

    /* renamed from: k */
    private boolean f6519k;

    /* renamed from: l */
    private int f6520l;

    /* renamed from: m */
    private double f6521m;

    /* renamed from: n */
    private boolean f6522n;

    /* renamed from: o */
    private String f6523o;

    /* renamed from: p */
    private String f6524p;

    /* renamed from: q */
    private boolean f6525q;

    /* renamed from: r */
    private boolean f6526r;

    /* renamed from: s */
    private String f6527s;

    /* renamed from: t */
    private boolean f6528t;

    /* renamed from: u */
    private final boolean f6529u;

    /* renamed from: v */
    private boolean f6530v;

    /* renamed from: w */
    private String f6531w;

    /* renamed from: x */
    private String f6532x;

    /* renamed from: y */
    private float f6533y;

    /* renamed from: z */
    private int f6534z;

    public C1666ta(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        m7914a(context);
        m7915b(context);
        m7916c(context);
        Locale locale = Locale.getDefault();
        boolean z = false;
        this.f6525q = m7912a(packageManager, "geo:0,0?q=donuts") != null;
        this.f6526r = m7912a(packageManager, "http://www.google.com") != null ? true : z;
        this.f6527s = locale.getCountry();
        bre.m6317a();
        this.f6528t = C1851zx.m8591a();
        this.f6529u = C0973i.m1490d(context);
        this.f6530v = C0973i.m1489c(context);
        this.f6531w = locale.getLanguage();
        this.f6532x = m7913a(context, packageManager);
        this.f6507B = m7917d(context);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.f6533y = displayMetrics.density;
            this.f6534z = displayMetrics.widthPixels;
            this.f6506A = displayMetrics.heightPixels;
        }
    }

    public C1666ta(Context context, C1663sy syVar) {
        m7914a(context);
        m7915b(context);
        m7916c(context);
        this.f6523o = Build.FINGERPRINT;
        this.f6524p = Build.DEVICE;
        this.f6508C = C0979o.m1501b() && C1065an.m2853a(context);
        this.f6525q = syVar.f6480b;
        this.f6526r = syVar.f6481c;
        this.f6527s = syVar.f6483e;
        this.f6528t = syVar.f6484f;
        this.f6529u = syVar.f6485g;
        this.f6530v = syVar.f6486h;
        this.f6531w = syVar.f6489k;
        this.f6532x = syVar.f6490l;
        this.f6507B = syVar.f6491m;
        this.f6533y = syVar.f6498t;
        this.f6534z = syVar.f6499u;
        this.f6506A = syVar.f6500v;
    }

    /* renamed from: a */
    private final void m7914a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f6509a = audioManager.getMode();
                this.f6510b = audioManager.isMusicActive();
                this.f6511c = audioManager.isSpeakerphoneOn();
                this.f6512d = audioManager.getStreamVolume(3);
                this.f6513e = audioManager.getRingerMode();
                this.f6514f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzbv.zzlj().mo13119a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f6509a = -2;
        this.f6510b = false;
        this.f6511c = false;
        this.f6512d = 0;
        this.f6513e = 0;
        this.f6514f = 0;
    }

    @TargetApi(16)
    /* renamed from: b */
    private final void m7915b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6515g = telephonyManager.getNetworkOperator();
        this.f6517i = telephonyManager.getNetworkType();
        this.f6518j = telephonyManager.getPhoneType();
        this.f6516h = -2;
        this.f6519k = false;
        this.f6520l = -1;
        zzbv.zzlf();
        if (C1782xi.m8381a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f6516h = activeNetworkInfo.getType();
                this.f6520l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f6516h = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.f6519k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: c */
    private final void m7916c(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.f6521m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f6522n = z;
            return;
        }
        this.f6521m = -1.0d;
        this.f6522n = false;
    }

    /* renamed from: d */
    private static String m7917d(Context context) {
        try {
            PackageInfo b = C0771c.m904a(context).mo9540b("com.android.vending", 128);
            if (b == null) {
                return null;
            }
            int i = b.versionCode;
            String str = b.packageName;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(i);
            sb.append(".");
            sb.append(str);
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m7913a(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a = m7912a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null || (activityInfo = a.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo b = C0771c.m904a(context).mo9540b(activityInfo.packageName, 0);
            if (b == null) {
                return null;
            }
            int i = b.versionCode;
            String str = activityInfo.packageName;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(i);
            sb.append(".");
            sb.append(str);
            return sb.toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static ResolveInfo m7912a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzbv.zzlj().mo13119a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: a */
    public final C1663sy mo12965a() {
        return new C1663sy(this.f6509a, this.f6525q, this.f6526r, this.f6515g, this.f6527s, this.f6528t, this.f6529u, this.f6530v, this.f6510b, this.f6511c, this.f6531w, this.f6532x, this.f6507B, this.f6512d, this.f6516h, this.f6517i, this.f6518j, this.f6513e, this.f6514f, this.f6533y, this.f6534z, this.f6506A, this.f6521m, this.f6522n, this.f6519k, this.f6520l, this.f6523o, this.f6508C, this.f6524p);
    }
}
