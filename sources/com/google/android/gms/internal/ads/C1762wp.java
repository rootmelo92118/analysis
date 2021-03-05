package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import javax.annotation.concurrent.GuardedBy;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.wp */
public final class C1762wp {

    /* renamed from: a */
    int f6781a = -1;

    /* renamed from: b */
    private long f6782b = -1;

    /* renamed from: c */
    private long f6783c = -1;
    @GuardedBy("mLock")

    /* renamed from: d */
    private int f6784d = -1;

    /* renamed from: e */
    private long f6785e = 0;

    /* renamed from: f */
    private final Object f6786f = new Object();

    /* renamed from: g */
    private final String f6787g;

    /* renamed from: h */
    private final C1776xc f6788h;
    @GuardedBy("mLock")

    /* renamed from: i */
    private int f6789i = 0;
    @GuardedBy("mLock")

    /* renamed from: j */
    private int f6790j = 0;

    public C1762wp(String str, C1776xc xcVar) {
        this.f6787g = str;
        this.f6788h = xcVar;
    }

    /* renamed from: a */
    public final void mo13142a() {
        synchronized (this.f6786f) {
            this.f6789i++;
        }
    }

    /* renamed from: b */
    public final void mo13144b() {
        synchronized (this.f6786f) {
            this.f6790j++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13143a(com.google.android.gms.internal.ads.zzwb r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f6786f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.xc r1 = r10.f6788h     // Catch:{ all -> 0x007c }
            long r1 = r1.mo13188i()     // Catch:{ all -> 0x007c }
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.zzbv.zzlm()     // Catch:{ all -> 0x007c }
            long r3 = r3.mo9996a()     // Catch:{ all -> 0x007c }
            long r5 = r10.f6783c     // Catch:{ all -> 0x007c }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0042
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.e<java.lang.Long> r5 = com.google.android.gms.internal.ads.C1557p.f5940av     // Catch:{ all -> 0x007c }
            com.google.android.gms.internal.ads.m r6 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x007c }
            java.lang.Object r5 = r6.mo12778a(r5)     // Catch:{ all -> 0x007c }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x007c }
            long r5 = r5.longValue()     // Catch:{ all -> 0x007c }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f6781a = r1     // Catch:{ all -> 0x007c }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.internal.ads.xc r1 = r10.f6788h     // Catch:{ all -> 0x007c }
            int r1 = r1.mo13189j()     // Catch:{ all -> 0x007c }
            r10.f6781a = r1     // Catch:{ all -> 0x007c }
        L_0x003b:
            r10.f6783c = r12     // Catch:{ all -> 0x007c }
            long r12 = r10.f6783c     // Catch:{ all -> 0x007c }
            r10.f6782b = r12     // Catch:{ all -> 0x007c }
            goto L_0x0044
        L_0x0042:
            r10.f6782b = r12     // Catch:{ all -> 0x007c }
        L_0x0044:
            r12 = 1
            if (r11 == 0) goto L_0x0058
            android.os.Bundle r13 = r11.f7273c     // Catch:{ all -> 0x007c }
            if (r13 == 0) goto L_0x0058
            android.os.Bundle r11 = r11.f7273c     // Catch:{ all -> 0x007c }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x007c }
            if (r11 != r12) goto L_0x0058
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return
        L_0x0058:
            int r11 = r10.f6784d     // Catch:{ all -> 0x007c }
            int r11 = r11 + r12
            r10.f6784d = r11     // Catch:{ all -> 0x007c }
            int r11 = r10.f6781a     // Catch:{ all -> 0x007c }
            int r11 = r11 + r12
            r10.f6781a = r11     // Catch:{ all -> 0x007c }
            int r11 = r10.f6781a     // Catch:{ all -> 0x007c }
            if (r11 != 0) goto L_0x0070
            r11 = 0
            r10.f6785e = r11     // Catch:{ all -> 0x007c }
            com.google.android.gms.internal.ads.xc r11 = r10.f6788h     // Catch:{ all -> 0x007c }
            r11.mo13172b((long) r3)     // Catch:{ all -> 0x007c }
            goto L_0x007a
        L_0x0070:
            com.google.android.gms.internal.ads.xc r11 = r10.f6788h     // Catch:{ all -> 0x007c }
            long r11 = r11.mo13190k()     // Catch:{ all -> 0x007c }
            r13 = 0
            long r3 = r3 - r11
            r10.f6785e = r3     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return
        L_0x007c:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1762wp.mo13143a(com.google.android.gms.internal.ads.zzwb, long):void");
    }

    /* renamed from: a */
    public final Bundle mo13141a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f6786f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f6787g);
            bundle.putLong("basets", this.f6783c);
            bundle.putLong("currts", this.f6782b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f6784d);
            bundle.putInt("preqs_in_session", this.f6781a);
            bundle.putLong("time_in_session", this.f6785e);
            bundle.putInt("pclick", this.f6789i);
            bundle.putInt("pimp", this.f6790j);
            bundle.putBoolean("support_transparent_background", m8266a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    private static boolean m8266a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", C0008a.ANDROID_CLIENT_TYPE);
        if (identifier == 0) {
            C1772wz.m1628d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            C1772wz.m1628d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            C1772wz.m1630e("Fail to fetch AdActivity theme");
            C1772wz.m1628d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
