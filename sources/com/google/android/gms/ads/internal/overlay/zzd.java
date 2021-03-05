package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p034v4.view.ViewCompat;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C0979o;
import com.google.android.gms.internal.ads.C1514nk;
import com.google.android.gms.internal.ads.C1520nq;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.C1790xq;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.Collections;
import java.util.Map;

@C1598qn
public class zzd extends C1520nq implements zzw {
    private static final int zzdqt = Color.argb(0, 0, 0, 0);
    protected final Activity mActivity;
    afl zzdin;
    AdOverlayInfoParcel zzdqu;
    private zzi zzdqv;
    private zzo zzdqw;
    private boolean zzdqx = false;
    private FrameLayout zzdqy;
    private WebChromeClient.CustomViewCallback zzdqz;
    private boolean zzdra = false;
    private boolean zzdrb = false;
    private zzh zzdrc;
    private boolean zzdrd = false;
    int zzdre = 0;
    private final Object zzdrf = new Object();
    private Runnable zzdrg;
    private boolean zzdrh;
    private boolean zzdri;
    private boolean zzdrj = false;
    private boolean zzdrk = false;
    private boolean zzdrl = true;

    public zzd(Activity activity) {
        this.mActivity = activity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onRestart() {
    }

    public final void close() {
        this.zzdre = 2;
        this.mActivity.finish();
    }

    public final void zzvo() {
        if (this.zzdqu != null && this.zzdqx) {
            setRequestedOrientation(this.zzdqu.orientation);
        }
        if (this.zzdqy != null) {
            this.mActivity.setContentView(this.zzdrc);
            this.zzdri = true;
            this.zzdqy.removeAllViews();
            this.zzdqy = null;
        }
        if (this.zzdqz != null) {
            this.zzdqz.onCustomViewHidden();
            this.zzdqz = null;
        }
        this.zzdqx = false;
    }

    public final void zzvp() {
        this.zzdre = 1;
        this.mActivity.finish();
    }

    public final void onBackPressed() {
        this.zzdre = 0;
    }

    public final boolean zzvq() {
        this.zzdre = 0;
        if (this.zzdin == null) {
            return true;
        }
        boolean C = this.zzdin.mo10333C();
        if (!C) {
            this.zzdin.mo10443a("onbackblocked", (Map<String, ?>) Collections.emptyMap());
        }
        return C;
    }

    public void onCreate(Bundle bundle) {
        this.mActivity.requestWindowFeature(1);
        this.zzdra = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.zzdqu = AdOverlayInfoParcel.zzc(this.mActivity.getIntent());
            if (this.zzdqu != null) {
                if (this.zzdqu.zzbsp.f7137c > 7500000) {
                    this.zzdre = 3;
                }
                if (this.mActivity.getIntent() != null) {
                    this.zzdrl = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.zzdqu.zzdsc != null) {
                    this.zzdrb = this.zzdqu.zzdsc.zzbpa;
                } else {
                    this.zzdrb = false;
                }
                if (this.zzdrb && this.zzdqu.zzdsc.zzbpf != -1) {
                    new zzj(this, (zzf) null).zzyz();
                }
                if (bundle == null) {
                    if (this.zzdqu.zzdru != null && this.zzdrl) {
                        this.zzdqu.zzdru.zziw();
                    }
                    if (!(this.zzdqu.zzdsa == 1 || this.zzdqu.zzdrt == null)) {
                        this.zzdqu.zzdrt.onAdClicked();
                    }
                }
                this.zzdrc = new zzh(this.mActivity, this.zzdqu.zzdsb, this.zzdqu.zzbsp.f7135a);
                this.zzdrc.setId(1000);
                switch (this.zzdqu.zzdsa) {
                    case 1:
                        zzae(false);
                        return;
                    case 2:
                        this.zzdqv = new zzi(this.zzdqu.zzdrv);
                        zzae(false);
                        return;
                    case 3:
                        zzae(true);
                        return;
                    default:
                        throw new zzg("Could not determine ad overlay type.");
                }
            } else {
                throw new zzg("Could not get info for ad overlay.");
            }
        } catch (zzg e) {
            C1772wz.m1630e(e.getMessage());
            this.zzdre = 3;
            this.mActivity.finish();
        }
    }

    public final void onStart() {
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6042cr)).booleanValue()) {
            return;
        }
        if (this.zzdin == null || this.zzdin.mo10331A()) {
            C1772wz.m1630e("The webview does not exist. Ignoring action.");
            return;
        }
        zzbv.zzlh();
        C1790xq.m8435b(this.zzdin);
    }

    public final void onResume() {
        if (this.zzdqu.zzdru != null) {
            this.zzdqu.zzdru.onResume();
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6042cr)).booleanValue()) {
            return;
        }
        if (this.zzdin == null || this.zzdin.mo10331A()) {
            C1772wz.m1630e("The webview does not exist. Ignoring action.");
            return;
        }
        zzbv.zzlh();
        C1790xq.m8435b(this.zzdin);
    }

    public final void onPause() {
        zzvo();
        if (this.zzdqu.zzdru != null) {
            this.zzdqu.zzdru.onPause();
        }
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6042cr)).booleanValue() && this.zzdin != null && (!this.mActivity.isFinishing() || this.zzdqv == null)) {
            zzbv.zzlh();
            C1790xq.m8434a(this.zzdin);
        }
        zzvs();
    }

    public final void zzq(C0719a aVar) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6041cq)).booleanValue() && C0979o.m1509j()) {
            zzbv.zzlf();
            if (C1782xi.m8379a(this.mActivity, (Configuration) C0722b.m770a(aVar))) {
                this.mActivity.getWindow().addFlags(1024);
                this.mActivity.getWindow().clearFlags(2048);
                return;
            }
            this.mActivity.getWindow().addFlags(2048);
            this.mActivity.getWindow().clearFlags(1024);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdra);
    }

    public final void onStop() {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6042cr)).booleanValue() && this.zzdin != null && (!this.mActivity.isFinishing() || this.zzdqv == null)) {
            zzbv.zzlh();
            C1790xq.m8434a(this.zzdin);
        }
        zzvs();
    }

    public final void onDestroy() {
        if (this.zzdin != null) {
            this.zzdrc.removeView(this.zzdin.getView());
        }
        zzvs();
    }

    private final void zzad(boolean z) {
        int intValue = ((Integer) bre.m6321e().mo12778a(C1557p.f6044ct)).intValue();
        zzp zzp = new zzp();
        zzp.size = 50;
        zzp.paddingLeft = z ? intValue : 0;
        zzp.paddingRight = z ? 0 : intValue;
        zzp.paddingTop = 0;
        zzp.paddingBottom = intValue;
        this.zzdqw = new zzo(this.mActivity, zzp, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdqu.zzdrx);
        this.zzdrc.addView(this.zzdqw, layoutParams);
    }

    public final void zzay() {
        this.zzdri = true;
    }

    public final void zza(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = ((Boolean) bre.m6321e().mo12778a(C1557p.f5893aA)).booleanValue() && this.zzdqu != null && this.zzdqu.zzdsc != null && this.zzdqu.zzdsc.zzbph;
        boolean z5 = ((Boolean) bre.m6321e().mo12778a(C1557p.f5894aB)).booleanValue() && this.zzdqu != null && this.zzdqu.zzdsc != null && this.zzdqu.zzdsc.zzbpi;
        if (z && z2 && z4 && !z5) {
            new C1514nk(this.zzdin, "useCustomClose").mo12828a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.zzdqw != null) {
            zzo zzo = this.zzdqw;
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzo.zzaf(z3);
        }
    }

    public final void zzvr() {
        this.zzdrc.removeView(this.zzdqw);
        zzad(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.mActivity.getApplicationInfo().targetSdkVersion >= ((Integer) bre.m6321e().mo12778a(C1557p.f6009cK)).intValue()) {
            if (this.mActivity.getApplicationInfo().targetSdkVersion <= ((Integer) bre.m6321e().mo12778a(C1557p.f6010cL)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) bre.m6321e().mo12778a(C1557p.f6011cM)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) bre.m6321e().mo12778a(C1557p.f6012cN)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.mActivity.setRequestedOrientation(i);
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.zzdqy = new FrameLayout(this.mActivity);
        this.zzdqy.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzdqy.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzdqy);
        this.zzdri = true;
        this.zzdqz = customViewCallback;
        this.zzdqx = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0126 A[SYNTHETIC, Splitter:B:58:0x0126] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzae(boolean r19) {
        /*
            r18 = this;
            r1 = r18
            boolean r2 = r1.zzdri
            r3 = 1
            if (r2 != 0) goto L_0x000c
            android.app.Activity r2 = r1.mActivity
            r2.requestWindowFeature(r3)
        L_0x000c:
            android.app.Activity r2 = r1.mActivity
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L_0x0265
            boolean r4 = com.google.android.gms.common.util.C0979o.m1509j()
            if (r4 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C1557p.f6041cq
            com.google.android.gms.internal.ads.m r5 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r4 = r5.mo12778a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0040
            com.google.android.gms.ads.internal.zzbv.zzlf()
            android.app.Activity r4 = r1.mActivity
            android.app.Activity r5 = r1.mActivity
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            boolean r4 = com.google.android.gms.internal.ads.C1782xi.m8379a((android.app.Activity) r4, (android.content.res.Configuration) r5)
            goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.zzdqu
            com.google.android.gms.ads.internal.zzaq r5 = r5.zzdsc
            r6 = 0
            if (r5 == 0) goto L_0x0052
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.zzdqu
            com.google.android.gms.ads.internal.zzaq r5 = r5.zzdsc
            boolean r5 = r5.zzbpb
            if (r5 == 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            boolean r7 = r1.zzdrb
            if (r7 == 0) goto L_0x0059
            if (r5 == 0) goto L_0x007d
        L_0x0059:
            if (r4 == 0) goto L_0x007d
            r4 = 1024(0x400, float:1.435E-42)
            r2.setFlags(r4, r4)
            boolean r4 = com.google.android.gms.common.util.C0979o.m1505f()
            if (r4 == 0) goto L_0x007d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzdqu
            com.google.android.gms.ads.internal.zzaq r4 = r4.zzdsc
            if (r4 == 0) goto L_0x007d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzdqu
            com.google.android.gms.ads.internal.zzaq r4 = r4.zzdsc
            boolean r4 = r4.zzbpg
            if (r4 == 0) goto L_0x007d
            android.view.View r4 = r2.getDecorView()
            r5 = 4098(0x1002, float:5.743E-42)
            r4.setSystemUiVisibility(r5)
        L_0x007d:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzdqu
            com.google.android.gms.internal.ads.afl r4 = r4.zzdrv
            r5 = 0
            if (r4 == 0) goto L_0x008d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzdqu
            com.google.android.gms.internal.ads.afl r4 = r4.zzdrv
            com.google.android.gms.internal.ads.ags r4 = r4.mo10388u()
            goto L_0x008e
        L_0x008d:
            r4 = r5
        L_0x008e:
            if (r4 == 0) goto L_0x0095
            boolean r4 = r4.mo10413b()
            goto L_0x0096
        L_0x0095:
            r4 = 0
        L_0x0096:
            r1.zzdrd = r6
            if (r4 == 0) goto L_0x00da
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r1.zzdqu
            int r7 = r7.orientation
            com.google.android.gms.internal.ads.xq r8 = com.google.android.gms.ads.internal.zzbv.zzlh()
            int r8 = r8.mo13222a()
            if (r7 != r8) goto L_0x00ba
            android.app.Activity r7 = r1.mActivity
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            if (r7 != r3) goto L_0x00b7
            r6 = 1
        L_0x00b7:
            r1.zzdrd = r6
            goto L_0x00da
        L_0x00ba:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r1.zzdqu
            int r7 = r7.orientation
            com.google.android.gms.internal.ads.xq r8 = com.google.android.gms.ads.internal.zzbv.zzlh()
            int r8 = r8.mo13235b()
            if (r7 != r8) goto L_0x00da
            android.app.Activity r7 = r1.mActivity
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 != r8) goto L_0x00d8
            r6 = 1
        L_0x00d8:
            r1.zzdrd = r6
        L_0x00da:
            boolean r6 = r1.zzdrd
            r7 = 46
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Delay onShow to next orientation change: "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.google.android.gms.internal.ads.C1772wz.m1624b(r6)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.zzdqu
            int r6 = r6.orientation
            r1.setRequestedOrientation(r6)
            com.google.android.gms.internal.ads.xq r6 = com.google.android.gms.ads.internal.zzbv.zzlh()
            boolean r2 = r6.mo13234a((android.view.Window) r2)
            if (r2 == 0) goto L_0x0108
            java.lang.String r2 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r2)
        L_0x0108:
            boolean r2 = r1.zzdrb
            if (r2 != 0) goto L_0x0114
            com.google.android.gms.ads.internal.overlay.zzh r2 = r1.zzdrc
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setBackgroundColor(r6)
            goto L_0x011b
        L_0x0114:
            com.google.android.gms.ads.internal.overlay.zzh r2 = r1.zzdrc
            int r6 = zzdqt
            r2.setBackgroundColor(r6)
        L_0x011b:
            android.app.Activity r2 = r1.mActivity
            com.google.android.gms.ads.internal.overlay.zzh r6 = r1.zzdrc
            r2.setContentView(r6)
            r1.zzdri = r3
            if (r19 == 0) goto L_0x01fc
            com.google.android.gms.ads.internal.zzbv.zzlg()     // Catch:{ Exception -> 0x01ee }
            android.app.Activity r7 = r1.mActivity     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            if (r2 == 0) goto L_0x013b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.agy r2 = r2.mo10380s()     // Catch:{ Exception -> 0x01ee }
            r8 = r2
            goto L_0x013c
        L_0x013b:
            r8 = r5
        L_0x013c:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            if (r2 == 0) goto L_0x014c
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            java.lang.String r2 = r2.mo10387t()     // Catch:{ Exception -> 0x01ee }
            r9 = r2
            goto L_0x014d
        L_0x014c:
            r9 = r5
        L_0x014d:
            r10 = 1
            r12 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbbi r13 = r2.zzbsp     // Catch:{ Exception -> 0x01ee }
            r14 = 0
            r15 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            if (r2 == 0) goto L_0x0166
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.ads.internal.zzv r2 = r2.mo10175e()     // Catch:{ Exception -> 0x01ee }
            r16 = r2
            goto L_0x0168
        L_0x0166:
            r16 = r5
        L_0x0168:
            com.google.android.gms.internal.ads.box r17 = com.google.android.gms.internal.ads.box.m6117a()     // Catch:{ Exception -> 0x01ee }
            r11 = r4
            com.google.android.gms.internal.ads.afl r2 = com.google.android.gms.internal.ads.afr.m2018a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01ee }
            r1.zzdin = r2     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.afl r2 = r1.zzdin
            com.google.android.gms.internal.ads.ags r6 = r2.mo10388u()
            r7 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.ads.internal.gmsg.zzb r8 = r2.zzdsd
            r9 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.ads.internal.gmsg.zzd r10 = r2.zzdrw
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.ads.internal.overlay.zzt r11 = r2.zzdrz
            r12 = 1
            r13 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv
            if (r2 == 0) goto L_0x019b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv
            com.google.android.gms.internal.ads.ags r2 = r2.mo10388u()
            com.google.android.gms.ads.internal.zzw r5 = r2.mo10395a()
        L_0x019b:
            r14 = r5
            r15 = 0
            r16 = 0
            r6.mo10404a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.afl r2 = r1.zzdin
            com.google.android.gms.internal.ads.ags r2 = r2.mo10388u()
            com.google.android.gms.ads.internal.overlay.zze r5 = new com.google.android.gms.ads.internal.overlay.zze
            r5.<init>(r1)
            r2.mo10400a((com.google.android.gms.internal.ads.agt) r5)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            java.lang.String r2 = r2.url
            if (r2 == 0) goto L_0x01c0
            com.google.android.gms.internal.ads.afl r2 = r1.zzdin
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.zzdqu
            java.lang.String r5 = r5.url
            r2.loadUrl(r5)
            goto L_0x01d8
        L_0x01c0:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            java.lang.String r2 = r2.zzdry
            if (r2 == 0) goto L_0x01e6
            com.google.android.gms.internal.ads.afl r5 = r1.zzdin
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            java.lang.String r6 = r2.zzbde
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            java.lang.String r7 = r2.zzdry
            java.lang.String r8 = "text/html"
            java.lang.String r9 = "UTF-8"
            r10 = 0
            r5.loadDataWithBaseURL(r6, r7, r8, r9, r10)
        L_0x01d8:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv
            if (r2 == 0) goto L_0x0209
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv
            r2.mo10350b((com.google.android.gms.ads.internal.overlay.zzd) r1)
            goto L_0x0209
        L_0x01e6:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r0.<init>(r2)
            throw r0
        L_0x01ee:
            r0 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            com.google.android.gms.internal.ads.C1772wz.m1625b(r2, r0)
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Could not obtain webview for the overlay."
            r0.<init>(r2)
            throw r0
        L_0x01fc:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv
            r1.zzdin = r2
            com.google.android.gms.internal.ads.afl r2 = r1.zzdin
            android.app.Activity r5 = r1.mActivity
            r2.mo10342a((android.content.Context) r5)
        L_0x0209:
            com.google.android.gms.internal.ads.afl r2 = r1.zzdin
            r2.mo10344a((com.google.android.gms.ads.internal.overlay.zzd) r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv
            if (r2 == 0) goto L_0x0221
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.afl r2 = r2.zzdrv
            com.google.android.gms.a.a r2 = r2.mo10392y()
            com.google.android.gms.ads.internal.overlay.zzh r5 = r1.zzdrc
            zzb(r2, r5)
        L_0x0221:
            com.google.android.gms.internal.ads.afl r2 = r1.zzdin
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L_0x0238
            boolean r5 = r2 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0238
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            com.google.android.gms.internal.ads.afl r5 = r1.zzdin
            android.view.View r5 = r5.getView()
            r2.removeView(r5)
        L_0x0238:
            boolean r2 = r1.zzdrb
            if (r2 == 0) goto L_0x0241
            com.google.android.gms.internal.ads.afl r2 = r1.zzdin
            r2.mo10339I()
        L_0x0241:
            com.google.android.gms.ads.internal.overlay.zzh r2 = r1.zzdrc
            com.google.android.gms.internal.ads.afl r5 = r1.zzdin
            android.view.View r5 = r5.getView()
            r6 = -1
            r2.addView(r5, r6, r6)
            if (r19 != 0) goto L_0x0256
            boolean r0 = r1.zzdrd
            if (r0 != 0) goto L_0x0256
            r18.zzvv()
        L_0x0256:
            r1.zzad(r4)
            com.google.android.gms.internal.ads.afl r0 = r1.zzdin
            boolean r0 = r0.mo10390w()
            if (r0 == 0) goto L_0x0264
            r1.zza((boolean) r4, (boolean) r3)
        L_0x0264:
            return
        L_0x0265:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Invalid activity, no window available."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzd.zzae(boolean):void");
    }

    private final void zzvs() {
        if (this.mActivity.isFinishing() && !this.zzdrj) {
            this.zzdrj = true;
            if (this.zzdin != null) {
                this.zzdin.mo10341a(this.zzdre);
                synchronized (this.zzdrf) {
                    if (!this.zzdrh && this.zzdin.mo10335E()) {
                        this.zzdrg = new zzf(this);
                        C1782xi.f6838a.postDelayed(this.zzdrg, ((Long) bre.m6321e().mo12778a(C1557p.f5944az)).longValue());
                        return;
                    }
                }
            }
            zzvt();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzvt() {
        if (!this.zzdrk) {
            this.zzdrk = true;
            if (this.zzdin != null) {
                this.zzdrc.removeView(this.zzdin.getView());
                if (this.zzdqv != null) {
                    this.zzdin.mo10342a(this.zzdqv.zzsp);
                    this.zzdin.mo10353b(false);
                    this.zzdqv.parent.addView(this.zzdin.getView(), this.zzdqv.index, this.zzdqv.zzdrp);
                    this.zzdqv = null;
                } else if (this.mActivity.getApplicationContext() != null) {
                    this.zzdin.mo10342a(this.mActivity.getApplicationContext());
                }
                this.zzdin = null;
            }
            if (!(this.zzdqu == null || this.zzdqu.zzdru == null)) {
                this.zzdqu.zzdru.zziv();
            }
            if (this.zzdqu != null && this.zzdqu.zzdrv != null) {
                zzb(this.zzdqu.zzdrv.mo10392y(), this.zzdqu.zzdrv.getView());
            }
        }
    }

    private static void zzb(@Nullable C0719a aVar, @Nullable View view) {
        if (aVar != null && view != null) {
            zzbv.zzlw().mo12835a(aVar, view);
        }
    }

    public final void zzvu() {
        if (this.zzdrd) {
            this.zzdrd = false;
            zzvv();
        }
    }

    private final void zzvv() {
        this.zzdin.mo10373n();
    }

    public final void zzvw() {
        this.zzdrc.zzdro = true;
    }

    public final void zzvx() {
        synchronized (this.zzdrf) {
            this.zzdrh = true;
            if (this.zzdrg != null) {
                C1782xi.f6838a.removeCallbacks(this.zzdrg);
                C1782xi.f6838a.post(this.zzdrg);
            }
        }
    }
}
