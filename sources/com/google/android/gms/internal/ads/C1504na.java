package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C0970f;
import java.util.Set;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.na */
public final class C1504na extends C1514nk {

    /* renamed from: a */
    private static final Set<String> f5743a = C0970f.m1479b("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: b */
    private String f5744b = "top-right";

    /* renamed from: c */
    private boolean f5745c = true;

    /* renamed from: d */
    private int f5746d = 0;

    /* renamed from: e */
    private int f5747e = 0;

    /* renamed from: f */
    private int f5748f = -1;

    /* renamed from: g */
    private int f5749g = 0;

    /* renamed from: h */
    private int f5750h = 0;

    /* renamed from: i */
    private int f5751i = -1;

    /* renamed from: j */
    private final Object f5752j = new Object();

    /* renamed from: k */
    private final afl f5753k;

    /* renamed from: l */
    private final Activity f5754l;

    /* renamed from: m */
    private agy f5755m;

    /* renamed from: n */
    private ImageView f5756n;

    /* renamed from: o */
    private LinearLayout f5757o;

    /* renamed from: p */
    private C1515nl f5758p;

    /* renamed from: q */
    private PopupWindow f5759q;

    /* renamed from: r */
    private RelativeLayout f5760r;

    /* renamed from: s */
    private ViewGroup f5761s;

    public C1504na(afl afl, C1515nl nlVar) {
        super(afl, "resize");
        this.f5753k = afl;
        this.f5754l = afl.mo10174d();
        this.f5758p = nlVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12811a(java.util.Map<java.lang.String, java.lang.String> r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f5752j
            monitor-enter(r0)
            android.app.Activity r1 = r13.f5754l     // Catch:{ all -> 0x0320 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r14 = "Not an activity context. Cannot resize."
            r13.mo12828a(r14)     // Catch:{ all -> 0x0320 }
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x000e:
            com.google.android.gms.internal.ads.afl r1 = r13.f5753k     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.agy r1 = r1.mo10380s()     // Catch:{ all -> 0x0320 }
            if (r1 != 0) goto L_0x001d
            java.lang.String r14 = "Webview is not yet available, size is not set."
            r13.mo12828a(r14)     // Catch:{ all -> 0x0320 }
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.afl r1 = r13.f5753k     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.agy r1 = r1.mo10380s()     // Catch:{ all -> 0x0320 }
            boolean r1 = r1.mo10494e()     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0030
            java.lang.String r14 = "Is interstitial. Cannot resize an interstitial."
            r13.mo12828a(r14)     // Catch:{ all -> 0x0320 }
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x0030:
            com.google.android.gms.internal.ads.afl r1 = r13.f5753k     // Catch:{ all -> 0x0320 }
            boolean r1 = r1.mo10393z()     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x003f
            java.lang.String r14 = "Cannot resize an expanded banner."
            r13.mo12828a(r14)     // Catch:{ all -> 0x0320 }
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x003f:
            java.lang.String r1 = "width"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0320 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0320 }
            if (r1 != 0) goto L_0x005e
            com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ all -> 0x0320 }
            java.lang.String r1 = "width"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0320 }
            int r1 = com.google.android.gms.internal.ads.C1782xi.m8384b((java.lang.String) r1)     // Catch:{ all -> 0x0320 }
            r13.f5751i = r1     // Catch:{ all -> 0x0320 }
        L_0x005e:
            java.lang.String r1 = "height"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0320 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0320 }
            if (r1 != 0) goto L_0x007d
            com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ all -> 0x0320 }
            java.lang.String r1 = "height"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0320 }
            int r1 = com.google.android.gms.internal.ads.C1782xi.m8384b((java.lang.String) r1)     // Catch:{ all -> 0x0320 }
            r13.f5748f = r1     // Catch:{ all -> 0x0320 }
        L_0x007d:
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0320 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0320 }
            if (r1 != 0) goto L_0x009c
            com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ all -> 0x0320 }
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0320 }
            int r1 = com.google.android.gms.internal.ads.C1782xi.m8384b((java.lang.String) r1)     // Catch:{ all -> 0x0320 }
            r13.f5749g = r1     // Catch:{ all -> 0x0320 }
        L_0x009c:
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0320 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0320 }
            if (r1 != 0) goto L_0x00bb
            com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ all -> 0x0320 }
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0320 }
            int r1 = com.google.android.gms.internal.ads.C1782xi.m8384b((java.lang.String) r1)     // Catch:{ all -> 0x0320 }
            r13.f5750h = r1     // Catch:{ all -> 0x0320 }
        L_0x00bb:
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0320 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0320 }
            if (r1 != 0) goto L_0x00d7
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0320 }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ all -> 0x0320 }
            r13.f5745c = r1     // Catch:{ all -> 0x0320 }
        L_0x00d7:
            java.lang.String r1 = "customClosePosition"
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0320 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0320 }
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0320 }
            if (r1 != 0) goto L_0x00e7
            r13.f5744b = r14     // Catch:{ all -> 0x0320 }
        L_0x00e7:
            int r14 = r13.f5751i     // Catch:{ all -> 0x0320 }
            r1 = 1
            r2 = 0
            if (r14 < 0) goto L_0x00f3
            int r14 = r13.f5748f     // Catch:{ all -> 0x0320 }
            if (r14 < 0) goto L_0x00f3
            r14 = 1
            goto L_0x00f4
        L_0x00f3:
            r14 = 0
        L_0x00f4:
            if (r14 != 0) goto L_0x00fd
            java.lang.String r14 = "Invalid width and height options. Cannot resize."
            r13.mo12828a(r14)     // Catch:{ all -> 0x0320 }
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x00fd:
            android.app.Activity r14 = r13.f5754l     // Catch:{ all -> 0x0320 }
            android.view.Window r14 = r14.getWindow()     // Catch:{ all -> 0x0320 }
            if (r14 == 0) goto L_0x0319
            android.view.View r3 = r14.getDecorView()     // Catch:{ all -> 0x0320 }
            if (r3 != 0) goto L_0x010d
            goto L_0x0319
        L_0x010d:
            int[] r3 = r13.m7650b()     // Catch:{ all -> 0x0320 }
            if (r3 != 0) goto L_0x011a
            java.lang.String r14 = "Resize location out of screen or close button is not visible."
            r13.mo12828a(r14)     // Catch:{ all -> 0x0320 }
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x011a:
            com.google.android.gms.internal.ads.bre.m6317a()     // Catch:{ all -> 0x0320 }
            android.app.Activity r4 = r13.f5754l     // Catch:{ all -> 0x0320 }
            int r5 = r13.f5751i     // Catch:{ all -> 0x0320 }
            int r4 = com.google.android.gms.internal.ads.C1851zx.m8582a((android.content.Context) r4, (int) r5)     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.bre.m6317a()     // Catch:{ all -> 0x0320 }
            android.app.Activity r5 = r13.f5754l     // Catch:{ all -> 0x0320 }
            int r6 = r13.f5748f     // Catch:{ all -> 0x0320 }
            int r5 = com.google.android.gms.internal.ads.C1851zx.m8582a((android.content.Context) r5, (int) r6)     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.afl r6 = r13.f5753k     // Catch:{ all -> 0x0320 }
            android.view.View r6 = r6.getView()     // Catch:{ all -> 0x0320 }
            android.view.ViewParent r6 = r6.getParent()     // Catch:{ all -> 0x0320 }
            if (r6 == 0) goto L_0x0312
            boolean r7 = r6 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0320 }
            if (r7 == 0) goto L_0x0312
            r7 = r6
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.afl r8 = r13.f5753k     // Catch:{ all -> 0x0320 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x0320 }
            r7.removeView(r8)     // Catch:{ all -> 0x0320 }
            android.widget.PopupWindow r7 = r13.f5759q     // Catch:{ all -> 0x0320 }
            if (r7 != 0) goto L_0x017f
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x0320 }
            r13.f5761s = r6     // Catch:{ all -> 0x0320 }
            com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.afl r6 = r13.f5753k     // Catch:{ all -> 0x0320 }
            android.view.View r6 = r6.getView()     // Catch:{ all -> 0x0320 }
            android.graphics.Bitmap r6 = com.google.android.gms.internal.ads.C1782xi.m8356a((android.view.View) r6)     // Catch:{ all -> 0x0320 }
            android.widget.ImageView r7 = new android.widget.ImageView     // Catch:{ all -> 0x0320 }
            android.app.Activity r8 = r13.f5754l     // Catch:{ all -> 0x0320 }
            r7.<init>(r8)     // Catch:{ all -> 0x0320 }
            r13.f5756n = r7     // Catch:{ all -> 0x0320 }
            android.widget.ImageView r7 = r13.f5756n     // Catch:{ all -> 0x0320 }
            r7.setImageBitmap(r6)     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.afl r6 = r13.f5753k     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.agy r6 = r6.mo10380s()     // Catch:{ all -> 0x0320 }
            r13.f5755m = r6     // Catch:{ all -> 0x0320 }
            android.view.ViewGroup r6 = r13.f5761s     // Catch:{ all -> 0x0320 }
            android.widget.ImageView r7 = r13.f5756n     // Catch:{ all -> 0x0320 }
            r6.addView(r7)     // Catch:{ all -> 0x0320 }
            goto L_0x0184
        L_0x017f:
            android.widget.PopupWindow r6 = r13.f5759q     // Catch:{ all -> 0x0320 }
            r6.dismiss()     // Catch:{ all -> 0x0320 }
        L_0x0184:
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0320 }
            android.app.Activity r7 = r13.f5754l     // Catch:{ all -> 0x0320 }
            r6.<init>(r7)     // Catch:{ all -> 0x0320 }
            r13.f5760r = r6     // Catch:{ all -> 0x0320 }
            android.widget.RelativeLayout r6 = r13.f5760r     // Catch:{ all -> 0x0320 }
            r6.setBackgroundColor(r2)     // Catch:{ all -> 0x0320 }
            android.widget.RelativeLayout r6 = r13.f5760r     // Catch:{ all -> 0x0320 }
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x0320 }
            r7.<init>(r4, r5)     // Catch:{ all -> 0x0320 }
            r6.setLayoutParams(r7)     // Catch:{ all -> 0x0320 }
            com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ all -> 0x0320 }
            android.widget.RelativeLayout r6 = r13.f5760r     // Catch:{ all -> 0x0320 }
            android.widget.PopupWindow r6 = com.google.android.gms.internal.ads.C1782xi.m8360a((android.view.View) r6, (int) r4, (int) r5, (boolean) r2)     // Catch:{ all -> 0x0320 }
            r13.f5759q = r6     // Catch:{ all -> 0x0320 }
            android.widget.PopupWindow r6 = r13.f5759q     // Catch:{ all -> 0x0320 }
            r6.setOutsideTouchable(r1)     // Catch:{ all -> 0x0320 }
            android.widget.PopupWindow r6 = r13.f5759q     // Catch:{ all -> 0x0320 }
            r6.setTouchable(r1)     // Catch:{ all -> 0x0320 }
            android.widget.PopupWindow r6 = r13.f5759q     // Catch:{ all -> 0x0320 }
            boolean r7 = r13.f5745c     // Catch:{ all -> 0x0320 }
            r7 = r7 ^ r1
            r6.setClippingEnabled(r7)     // Catch:{ all -> 0x0320 }
            android.widget.RelativeLayout r6 = r13.f5760r     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.afl r7 = r13.f5753k     // Catch:{ all -> 0x0320 }
            android.view.View r7 = r7.getView()     // Catch:{ all -> 0x0320 }
            r8 = -1
            r6.addView(r7, r8, r8)     // Catch:{ all -> 0x0320 }
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch:{ all -> 0x0320 }
            android.app.Activity r7 = r13.f5754l     // Catch:{ all -> 0x0320 }
            r6.<init>(r7)     // Catch:{ all -> 0x0320 }
            r13.f5757o = r6     // Catch:{ all -> 0x0320 }
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.bre.m6317a()     // Catch:{ all -> 0x0320 }
            android.app.Activity r7 = r13.f5754l     // Catch:{ all -> 0x0320 }
            r9 = 50
            int r7 = com.google.android.gms.internal.ads.C1851zx.m8582a((android.content.Context) r7, (int) r9)     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.bre.m6317a()     // Catch:{ all -> 0x0320 }
            android.app.Activity r10 = r13.f5754l     // Catch:{ all -> 0x0320 }
            int r9 = com.google.android.gms.internal.ads.C1851zx.m8582a((android.content.Context) r10, (int) r9)     // Catch:{ all -> 0x0320 }
            r6.<init>(r7, r9)     // Catch:{ all -> 0x0320 }
            java.lang.String r7 = r13.f5744b     // Catch:{ all -> 0x0320 }
            int r9 = r7.hashCode()     // Catch:{ all -> 0x0320 }
            switch(r9) {
                case -1364013995: goto L_0x0223;
                case -1012429441: goto L_0x0219;
                case -655373719: goto L_0x020f;
                case 1163912186: goto L_0x0205;
                case 1288627767: goto L_0x01fb;
                case 1755462605: goto L_0x01f1;
                default: goto L_0x01f0;
            }     // Catch:{ all -> 0x0320 }
        L_0x01f0:
            goto L_0x022d
        L_0x01f1:
            java.lang.String r9 = "top-center"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0320 }
            if (r7 == 0) goto L_0x022d
            r7 = 1
            goto L_0x022e
        L_0x01fb:
            java.lang.String r9 = "bottom-center"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0320 }
            if (r7 == 0) goto L_0x022d
            r7 = 4
            goto L_0x022e
        L_0x0205:
            java.lang.String r9 = "bottom-right"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0320 }
            if (r7 == 0) goto L_0x022d
            r7 = 5
            goto L_0x022e
        L_0x020f:
            java.lang.String r9 = "bottom-left"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0320 }
            if (r7 == 0) goto L_0x022d
            r7 = 3
            goto L_0x022e
        L_0x0219:
            java.lang.String r9 = "top-left"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0320 }
            if (r7 == 0) goto L_0x022d
            r7 = 0
            goto L_0x022e
        L_0x0223:
            java.lang.String r9 = "center"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0320 }
            if (r7 == 0) goto L_0x022d
            r7 = 2
            goto L_0x022e
        L_0x022d:
            r7 = -1
        L_0x022e:
            r8 = 14
            r9 = 9
            r10 = 11
            r11 = 12
            r12 = 10
            switch(r7) {
                case 0: goto L_0x0261;
                case 1: goto L_0x025a;
                case 2: goto L_0x0254;
                case 3: goto L_0x024d;
                case 4: goto L_0x0246;
                case 5: goto L_0x023f;
                default: goto L_0x023b;
            }     // Catch:{ all -> 0x0320 }
        L_0x023b:
            r6.addRule(r12)     // Catch:{ all -> 0x0320 }
            goto L_0x0268
        L_0x023f:
            r6.addRule(r11)     // Catch:{ all -> 0x0320 }
            r6.addRule(r10)     // Catch:{ all -> 0x0320 }
            goto L_0x026b
        L_0x0246:
            r6.addRule(r11)     // Catch:{ all -> 0x0320 }
            r6.addRule(r8)     // Catch:{ all -> 0x0320 }
            goto L_0x026b
        L_0x024d:
            r6.addRule(r11)     // Catch:{ all -> 0x0320 }
            r6.addRule(r9)     // Catch:{ all -> 0x0320 }
            goto L_0x026b
        L_0x0254:
            r7 = 13
            r6.addRule(r7)     // Catch:{ all -> 0x0320 }
            goto L_0x026b
        L_0x025a:
            r6.addRule(r12)     // Catch:{ all -> 0x0320 }
            r6.addRule(r8)     // Catch:{ all -> 0x0320 }
            goto L_0x026b
        L_0x0261:
            r6.addRule(r12)     // Catch:{ all -> 0x0320 }
            r6.addRule(r9)     // Catch:{ all -> 0x0320 }
            goto L_0x026b
        L_0x0268:
            r6.addRule(r10)     // Catch:{ all -> 0x0320 }
        L_0x026b:
            android.widget.LinearLayout r7 = r13.f5757o     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.nb r8 = new com.google.android.gms.internal.ads.nb     // Catch:{ all -> 0x0320 }
            r8.<init>(r13)     // Catch:{ all -> 0x0320 }
            r7.setOnClickListener(r8)     // Catch:{ all -> 0x0320 }
            android.widget.LinearLayout r7 = r13.f5757o     // Catch:{ all -> 0x0320 }
            java.lang.String r8 = "Close button"
            r7.setContentDescription(r8)     // Catch:{ all -> 0x0320 }
            android.widget.RelativeLayout r7 = r13.f5760r     // Catch:{ all -> 0x0320 }
            android.widget.LinearLayout r8 = r13.f5757o     // Catch:{ all -> 0x0320 }
            r7.addView(r8, r6)     // Catch:{ all -> 0x0320 }
            android.widget.PopupWindow r6 = r13.f5759q     // Catch:{ RuntimeException -> 0x02ca }
            android.view.View r14 = r14.getDecorView()     // Catch:{ RuntimeException -> 0x02ca }
            com.google.android.gms.internal.ads.bre.m6317a()     // Catch:{ RuntimeException -> 0x02ca }
            android.app.Activity r7 = r13.f5754l     // Catch:{ RuntimeException -> 0x02ca }
            r8 = r3[r2]     // Catch:{ RuntimeException -> 0x02ca }
            int r7 = com.google.android.gms.internal.ads.C1851zx.m8582a((android.content.Context) r7, (int) r8)     // Catch:{ RuntimeException -> 0x02ca }
            com.google.android.gms.internal.ads.bre.m6317a()     // Catch:{ RuntimeException -> 0x02ca }
            android.app.Activity r8 = r13.f5754l     // Catch:{ RuntimeException -> 0x02ca }
            r9 = r3[r1]     // Catch:{ RuntimeException -> 0x02ca }
            int r8 = com.google.android.gms.internal.ads.C1851zx.m8582a((android.content.Context) r8, (int) r9)     // Catch:{ RuntimeException -> 0x02ca }
            r6.showAtLocation(r14, r2, r7, r8)     // Catch:{ RuntimeException -> 0x02ca }
            r14 = r3[r2]     // Catch:{ all -> 0x0320 }
            r6 = r3[r1]     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.nl r7 = r13.f5758p     // Catch:{ all -> 0x0320 }
            if (r7 == 0) goto L_0x02b3
            com.google.android.gms.internal.ads.nl r7 = r13.f5758p     // Catch:{ all -> 0x0320 }
            int r8 = r13.f5751i     // Catch:{ all -> 0x0320 }
            int r9 = r13.f5748f     // Catch:{ all -> 0x0320 }
            r7.zza(r14, r6, r8, r9)     // Catch:{ all -> 0x0320 }
        L_0x02b3:
            com.google.android.gms.internal.ads.afl r14 = r13.f5753k     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.agy r4 = com.google.android.gms.internal.ads.agy.m2169a(r4, r5)     // Catch:{ all -> 0x0320 }
            r14.mo10345a((com.google.android.gms.internal.ads.agy) r4)     // Catch:{ all -> 0x0320 }
            r14 = r3[r2]     // Catch:{ all -> 0x0320 }
            r1 = r3[r1]     // Catch:{ all -> 0x0320 }
            r13.m7649b(r14, r1)     // Catch:{ all -> 0x0320 }
            java.lang.String r14 = "resized"
            r13.mo12831c(r14)     // Catch:{ all -> 0x0320 }
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x02ca:
            r14 = move-exception
            java.lang.String r1 = "Cannot show popup window: "
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0320 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0320 }
            int r2 = r14.length()     // Catch:{ all -> 0x0320 }
            if (r2 == 0) goto L_0x02e0
            java.lang.String r14 = r1.concat(r14)     // Catch:{ all -> 0x0320 }
            goto L_0x02e5
        L_0x02e0:
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x0320 }
            r14.<init>(r1)     // Catch:{ all -> 0x0320 }
        L_0x02e5:
            r13.mo12828a(r14)     // Catch:{ all -> 0x0320 }
            android.widget.RelativeLayout r14 = r13.f5760r     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.afl r1 = r13.f5753k     // Catch:{ all -> 0x0320 }
            android.view.View r1 = r1.getView()     // Catch:{ all -> 0x0320 }
            r14.removeView(r1)     // Catch:{ all -> 0x0320 }
            android.view.ViewGroup r14 = r13.f5761s     // Catch:{ all -> 0x0320 }
            if (r14 == 0) goto L_0x0310
            android.view.ViewGroup r14 = r13.f5761s     // Catch:{ all -> 0x0320 }
            android.widget.ImageView r1 = r13.f5756n     // Catch:{ all -> 0x0320 }
            r14.removeView(r1)     // Catch:{ all -> 0x0320 }
            android.view.ViewGroup r14 = r13.f5761s     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.afl r1 = r13.f5753k     // Catch:{ all -> 0x0320 }
            android.view.View r1 = r1.getView()     // Catch:{ all -> 0x0320 }
            r14.addView(r1)     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.afl r14 = r13.f5753k     // Catch:{ all -> 0x0320 }
            com.google.android.gms.internal.ads.agy r1 = r13.f5755m     // Catch:{ all -> 0x0320 }
            r14.mo10345a((com.google.android.gms.internal.ads.agy) r1)     // Catch:{ all -> 0x0320 }
        L_0x0310:
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x0312:
            java.lang.String r14 = "Webview is detached, probably in the middle of a resize or expand."
            r13.mo12828a(r14)     // Catch:{ all -> 0x0320 }
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x0319:
            java.lang.String r14 = "Activity context is not ready, cannot get window or decor view."
            r13.mo12828a(r14)     // Catch:{ all -> 0x0320 }
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            return
        L_0x0320:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0320 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1504na.mo12811a(java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo12812a(boolean z) {
        synchronized (this.f5752j) {
            if (this.f5759q != null) {
                this.f5759q.dismiss();
                this.f5760r.removeView(this.f5753k.getView());
                if (this.f5761s != null) {
                    this.f5761s.removeView(this.f5756n);
                    this.f5761s.addView(this.f5753k.getView());
                    this.f5753k.mo10345a(this.f5755m);
                }
                if (z) {
                    mo12831c("default");
                    if (this.f5758p != null) {
                        this.f5758p.zzjk();
                    }
                }
                this.f5759q = null;
                this.f5760r = null;
                this.f5761s = null;
                this.f5757o = null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0113, code lost:
        if ((r5 + 50) <= r1[1]) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0126 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0128  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int[] m7650b() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.xi r0 = com.google.android.gms.ads.internal.zzbv.zzlf()
            android.app.Activity r1 = r9.f5754l
            int[] r0 = r0.mo13210b((android.app.Activity) r1)
            com.google.android.gms.internal.ads.xi r1 = com.google.android.gms.ads.internal.zzbv.zzlf()
            android.app.Activity r2 = r9.f5754l
            int[] r1 = r1.mo13212c((android.app.Activity) r2)
            r2 = 0
            r3 = r0[r2]
            r4 = 1
            r0 = r0[r4]
            int r5 = r9.f5751i
            r6 = 2
            r7 = 50
            if (r5 < r7) goto L_0x011e
            int r5 = r9.f5751i
            if (r5 <= r3) goto L_0x0027
            goto L_0x011e
        L_0x0027:
            int r5 = r9.f5748f
            if (r5 < r7) goto L_0x0118
            int r5 = r9.f5748f
            if (r5 <= r0) goto L_0x0031
            goto L_0x0118
        L_0x0031:
            int r5 = r9.f5748f
            if (r5 != r0) goto L_0x0040
            int r0 = r9.f5751i
            if (r0 != r3) goto L_0x0040
            java.lang.String r0 = "Cannot resize to a full-screen ad."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)
            goto L_0x0123
        L_0x0040:
            boolean r0 = r9.f5745c
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r9.f5744b
            r5 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1364013995: goto L_0x0081;
                case -1012429441: goto L_0x0077;
                case -655373719: goto L_0x006d;
                case 1163912186: goto L_0x0063;
                case 1288627767: goto L_0x0059;
                case 1755462605: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x008b
        L_0x004f:
            java.lang.String r8 = "top-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x008b
            r0 = 1
            goto L_0x008c
        L_0x0059:
            java.lang.String r8 = "bottom-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x008b
            r0 = 4
            goto L_0x008c
        L_0x0063:
            java.lang.String r8 = "bottom-right"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x008b
            r0 = 5
            goto L_0x008c
        L_0x006d:
            java.lang.String r8 = "bottom-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x008b
            r0 = 3
            goto L_0x008c
        L_0x0077:
            java.lang.String r8 = "top-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x008b
            r0 = 0
            goto L_0x008c
        L_0x0081:
            java.lang.String r8 = "center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x008b
            r0 = 2
            goto L_0x008c
        L_0x008b:
            r0 = -1
        L_0x008c:
            switch(r0) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00b1;
                case 5: goto L_0x009e;
                default: goto L_0x008f;
            }
        L_0x008f:
            int r0 = r9.f5746d
            int r5 = r9.f5749g
            int r0 = r0 + r5
            int r5 = r9.f5751i
            int r0 = r0 + r5
            int r0 = r0 - r7
            int r5 = r9.f5747e
            int r8 = r9.f5750h
            int r5 = r5 + r8
            goto L_0x0107
        L_0x009e:
            int r0 = r9.f5746d
            int r5 = r9.f5749g
            int r0 = r0 + r5
            int r5 = r9.f5751i
            int r0 = r0 + r5
            int r0 = r0 - r7
            int r5 = r9.f5747e
            int r8 = r9.f5750h
            int r5 = r5 + r8
            int r8 = r9.f5748f
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x0107
        L_0x00b1:
            int r0 = r9.f5746d
            int r5 = r9.f5749g
            int r0 = r0 + r5
            int r5 = r9.f5751i
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f5747e
            int r8 = r9.f5750h
            int r5 = r5 + r8
            int r8 = r9.f5748f
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x0107
        L_0x00c6:
            int r0 = r9.f5746d
            int r5 = r9.f5749g
            int r0 = r0 + r5
            int r5 = r9.f5747e
            int r8 = r9.f5750h
            int r5 = r5 + r8
            int r8 = r9.f5748f
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x0107
        L_0x00d5:
            int r0 = r9.f5746d
            int r5 = r9.f5749g
            int r0 = r0 + r5
            int r5 = r9.f5751i
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f5747e
            int r8 = r9.f5750h
            int r5 = r5 + r8
            int r8 = r9.f5748f
            int r8 = r8 / r6
            int r5 = r5 + r8
            int r5 = r5 + -25
            goto L_0x0107
        L_0x00ec:
            int r0 = r9.f5746d
            int r5 = r9.f5749g
            int r0 = r0 + r5
            int r5 = r9.f5751i
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f5747e
            int r8 = r9.f5750h
            int r5 = r5 + r8
            goto L_0x0107
        L_0x00fd:
            int r0 = r9.f5746d
            int r5 = r9.f5749g
            int r0 = r0 + r5
            int r5 = r9.f5747e
            int r8 = r9.f5750h
            int r5 = r5 + r8
        L_0x0107:
            if (r0 < 0) goto L_0x0123
            int r0 = r0 + r7
            if (r0 > r3) goto L_0x0123
            r0 = r1[r2]
            if (r5 < r0) goto L_0x0123
            int r5 = r5 + r7
            r0 = r1[r4]
            if (r5 <= r0) goto L_0x0116
            goto L_0x0123
        L_0x0116:
            r0 = 1
            goto L_0x0124
        L_0x0118:
            java.lang.String r0 = "Height is too small or too large."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)
            goto L_0x0123
        L_0x011e:
            java.lang.String r0 = "Width is too small or too large."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)
        L_0x0123:
            r0 = 0
        L_0x0124:
            if (r0 != 0) goto L_0x0128
            r0 = 0
            return r0
        L_0x0128:
            boolean r0 = r9.f5745c
            if (r0 == 0) goto L_0x013d
            int[] r0 = new int[r6]
            int r1 = r9.f5746d
            int r3 = r9.f5749g
            int r1 = r1 + r3
            r0[r2] = r1
            int r1 = r9.f5747e
            int r2 = r9.f5750h
            int r1 = r1 + r2
            r0[r4] = r1
            return r0
        L_0x013d:
            com.google.android.gms.internal.ads.xi r0 = com.google.android.gms.ads.internal.zzbv.zzlf()
            android.app.Activity r1 = r9.f5754l
            int[] r0 = r0.mo13210b((android.app.Activity) r1)
            com.google.android.gms.internal.ads.xi r1 = com.google.android.gms.ads.internal.zzbv.zzlf()
            android.app.Activity r3 = r9.f5754l
            int[] r1 = r1.mo13212c((android.app.Activity) r3)
            r0 = r0[r2]
            int r3 = r9.f5746d
            int r5 = r9.f5749g
            int r3 = r3 + r5
            int r5 = r9.f5747e
            int r7 = r9.f5750h
            int r5 = r5 + r7
            if (r3 >= 0) goto L_0x0161
            r0 = 0
            goto L_0x016b
        L_0x0161:
            int r7 = r9.f5751i
            int r7 = r7 + r3
            if (r7 <= r0) goto L_0x016a
            int r3 = r9.f5751i
            int r0 = r0 - r3
            goto L_0x016b
        L_0x016a:
            r0 = r3
        L_0x016b:
            r3 = r1[r2]
            if (r5 >= r3) goto L_0x0172
            r5 = r1[r2]
            goto L_0x017f
        L_0x0172:
            int r3 = r9.f5748f
            int r3 = r3 + r5
            r7 = r1[r4]
            if (r3 <= r7) goto L_0x017f
            r1 = r1[r4]
            int r3 = r9.f5748f
            int r5 = r1 - r3
        L_0x017f:
            int[] r1 = new int[r6]
            r1[r2] = r0
            r1[r4] = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1504na.m7650b():int[]");
    }

    /* renamed from: a */
    public final void mo12810a(int i, int i2, boolean z) {
        synchronized (this.f5752j) {
            this.f5746d = i;
            this.f5747e = i2;
            if (this.f5759q != null && z) {
                int[] b = m7650b();
                if (b != null) {
                    PopupWindow popupWindow = this.f5759q;
                    bre.m6317a();
                    int a = C1851zx.m8582a((Context) this.f5754l, b[0]);
                    bre.m6317a();
                    popupWindow.update(a, C1851zx.m8582a((Context) this.f5754l, b[1]), this.f5759q.getWidth(), this.f5759q.getHeight());
                    m7649b(b[0], b[1]);
                } else {
                    mo12812a(true);
                }
            }
        }
    }

    /* renamed from: b */
    private final void m7649b(int i, int i2) {
        mo12826a(i, i2 - zzbv.zzlf().mo13212c(this.f5754l)[0], this.f5751i, this.f5748f);
    }

    /* renamed from: a */
    public final boolean mo12813a() {
        boolean z;
        synchronized (this.f5752j) {
            z = this.f5759q != null;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo12809a(int i, int i2) {
        this.f5746d = i;
        this.f5747e = i2;
    }
}
