package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.LinkedList;

public abstract class awv implements awu {

    /* renamed from: a */
    protected static volatile axq f2979a;

    /* renamed from: b */
    protected MotionEvent f2980b;

    /* renamed from: c */
    protected LinkedList<MotionEvent> f2981c = new LinkedList<>();

    /* renamed from: d */
    protected long f2982d = 0;

    /* renamed from: e */
    protected long f2983e = 0;

    /* renamed from: f */
    protected long f2984f = 0;

    /* renamed from: g */
    protected long f2985g = 0;

    /* renamed from: h */
    protected long f2986h = 0;

    /* renamed from: i */
    protected long f2987i = 0;

    /* renamed from: j */
    protected long f2988j = 0;

    /* renamed from: k */
    protected double f2989k;

    /* renamed from: l */
    protected float f2990l;

    /* renamed from: m */
    protected float f2991m;

    /* renamed from: n */
    protected float f2992n;

    /* renamed from: o */
    protected float f2993o;

    /* renamed from: p */
    protected boolean f2994p = false;

    /* renamed from: q */
    protected DisplayMetrics f2995q;

    /* renamed from: r */
    private double f2996r;

    /* renamed from: s */
    private double f2997s;

    /* renamed from: t */
    private boolean f2998t = false;

    protected awv(Context context) {
        try {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5985bn)).booleanValue()) {
                avo.m4289a();
            } else {
                axv.m4427a(f2979a);
            }
            this.f2995q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo11345a(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract akd mo11346a(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract akd mo11347a(Context context, ahf ahf);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract axw mo11348a(MotionEvent motionEvent);

    public void zzb(View view) {
    }

    public final String zza(Context context) {
        if (axx.m4434a()) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5987bp)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m4350a(context, (String) null, false, (View) null, (Activity) null, (byte[]) null);
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        return m4350a(context, str, true, view, activity, (byte[]) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.f2998t
            r1 = 0
            if (r0 == 0) goto L_0x0035
            r2 = 0
            r12.f2985g = r2
            r12.f2984f = r2
            r12.f2983e = r2
            r12.f2982d = r2
            r12.f2986h = r2
            r12.f2988j = r2
            r12.f2987i = r2
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f2981c
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            r2.recycle()
            goto L_0x001b
        L_0x002b:
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f2981c
            r0.clear()
            r0 = 0
            r12.f2980b = r0
            r12.f2998t = r1
        L_0x0035:
            int r0 = r13.getAction()
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x003d;
                case 2: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x007a
        L_0x003d:
            float r0 = r13.getRawX()
            double r2 = (double) r0
            float r0 = r13.getRawY()
            double r4 = (double) r0
            double r6 = r12.f2996r
            java.lang.Double.isNaN(r2)
            double r6 = r2 - r6
            double r8 = r12.f2997s
            java.lang.Double.isNaN(r4)
            double r8 = r4 - r8
            double r10 = r12.f2989k
            double r6 = r6 * r6
            double r8 = r8 * r8
            double r6 = r6 + r8
            double r6 = java.lang.Math.sqrt(r6)
            double r10 = r10 + r6
            r12.f2989k = r10
            r12.f2996r = r2
            r12.f2997s = r4
            goto L_0x007a
        L_0x0068:
            r2 = 0
            r12.f2989k = r2
            float r0 = r13.getRawX()
            double r2 = (double) r0
            r12.f2996r = r2
            float r0 = r13.getRawY()
            double r2 = (double) r0
            r12.f2997s = r2
        L_0x007a:
            int r0 = r13.getAction()
            r2 = 1
            r4 = 1
            switch(r0) {
                case 0: goto L_0x0119;
                case 1: goto L_0x00e3;
                case 2: goto L_0x008d;
                case 3: goto L_0x0086;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x0136
        L_0x0086:
            long r0 = r12.f2985g
            long r0 = r0 + r2
            r12.f2985g = r0
            goto L_0x0136
        L_0x008d:
            long r2 = r12.f2983e
            int r0 = r13.getHistorySize()
            int r0 = r0 + r4
            long r5 = (long) r0
            long r2 = r2 + r5
            r12.f2983e = r2
            com.google.android.gms.internal.ads.axw r13 = r12.mo11348a((android.view.MotionEvent) r13)     // Catch:{ axn -> 0x0136 }
            if (r13 == 0) goto L_0x00a8
            java.lang.Long r0 = r13.f3075d     // Catch:{ axn -> 0x0136 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Long r0 = r13.f3078g     // Catch:{ axn -> 0x0136 }
            if (r0 == 0) goto L_0x00a8
            r0 = 1
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            if (r0 == 0) goto L_0x00be
            long r2 = r12.f2987i     // Catch:{ axn -> 0x0136 }
            java.lang.Long r0 = r13.f3075d     // Catch:{ axn -> 0x0136 }
            long r5 = r0.longValue()     // Catch:{ axn -> 0x0136 }
            java.lang.Long r0 = r13.f3078g     // Catch:{ axn -> 0x0136 }
            long r7 = r0.longValue()     // Catch:{ axn -> 0x0136 }
            r0 = 0
            long r5 = r5 + r7
            long r2 = r2 + r5
            r12.f2987i = r2     // Catch:{ axn -> 0x0136 }
        L_0x00be:
            android.util.DisplayMetrics r0 = r12.f2995q     // Catch:{ axn -> 0x0136 }
            if (r0 == 0) goto L_0x00cd
            if (r13 == 0) goto L_0x00cd
            java.lang.Long r0 = r13.f3076e     // Catch:{ axn -> 0x0136 }
            if (r0 == 0) goto L_0x00cd
            java.lang.Long r0 = r13.f3079h     // Catch:{ axn -> 0x0136 }
            if (r0 == 0) goto L_0x00cd
            r1 = 1
        L_0x00cd:
            if (r1 == 0) goto L_0x0136
            long r0 = r12.f2988j     // Catch:{ axn -> 0x0136 }
            java.lang.Long r2 = r13.f3076e     // Catch:{ axn -> 0x0136 }
            long r2 = r2.longValue()     // Catch:{ axn -> 0x0136 }
            java.lang.Long r13 = r13.f3079h     // Catch:{ axn -> 0x0136 }
            long r5 = r13.longValue()     // Catch:{ axn -> 0x0136 }
            r13 = 0
            long r2 = r2 + r5
            long r0 = r0 + r2
            r12.f2988j = r0     // Catch:{ axn -> 0x0136 }
            goto L_0x0136
        L_0x00e3:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r13)
            r12.f2980b = r13
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f2981c
            android.view.MotionEvent r0 = r12.f2980b
            r13.add(r0)
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f2981c
            int r13 = r13.size()
            r0 = 6
            if (r13 <= r0) goto L_0x0104
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f2981c
            java.lang.Object r13 = r13.remove()
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            r13.recycle()
        L_0x0104:
            long r0 = r12.f2984f
            long r0 = r0 + r2
            r12.f2984f = r0
            java.lang.Throwable r13 = new java.lang.Throwable     // Catch:{ axn -> 0x0136 }
            r13.<init>()     // Catch:{ axn -> 0x0136 }
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()     // Catch:{ axn -> 0x0136 }
            long r0 = r12.mo11345a((java.lang.StackTraceElement[]) r13)     // Catch:{ axn -> 0x0136 }
            r12.f2986h = r0     // Catch:{ axn -> 0x0136 }
            goto L_0x0136
        L_0x0119:
            float r0 = r13.getX()
            r12.f2990l = r0
            float r0 = r13.getY()
            r12.f2991m = r0
            float r0 = r13.getRawX()
            r12.f2992n = r0
            float r13 = r13.getRawY()
            r12.f2993o = r13
            long r0 = r12.f2982d
            long r0 = r0 + r2
            r12.f2982d = r0
        L_0x0136:
            r12.f2994p = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.awv.zza(android.view.MotionEvent):void");
    }

    public final void zza(int i, int i2, int i3) {
        if (this.f2980b != null) {
            this.f2980b.recycle();
        }
        if (this.f2995q != null) {
            this.f2980b = MotionEvent.obtain(0, (long) i3, 1, this.f2995q.density * ((float) i), this.f2995q.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f2980b = null;
        }
        this.f2994p = false;
    }

    /* renamed from: a */
    private final String m4350a(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        akd akd;
        if (z) {
            try {
                akd = mo11346a(context, view, activity);
                this.f2998t = true;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                return Integer.toString(7);
            } catch (Throwable unused2) {
                return Integer.toString(3);
            }
        } else {
            akd = mo11347a(context, (ahf) null);
        }
        if (akd != null) {
            if (akd.mo11299d() != 0) {
                return avo.m4286a(akd, str);
            }
        }
        return Integer.toString(5);
    }
}
