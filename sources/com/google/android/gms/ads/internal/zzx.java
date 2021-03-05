package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.p034v4.util.ArrayMap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1450la;
import com.google.android.gms.internal.ads.C1453ld;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1736vq;
import com.google.android.gms.internal.ads.C1740vu;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.agy;
import com.google.android.gms.internal.ads.bmn;
import com.google.android.gms.internal.ads.bmr;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.btb;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzvv;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.p039a.C0722b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzx extends zzh implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private boolean zzbli;
    private boolean zzbmz;
    private WeakReference<Object> zzbna = new WeakReference<>((Object) null);

    public zzx(Context context, zzwf zzwf, String str, C1437ko koVar, zzbbi zzbbi, zzv zzv) {
        super(context, zzwf, str, koVar, zzbbi, zzv);
    }

    /* access modifiers changed from: protected */
    public final afl zza(C1753wg wgVar, @Nullable zzw zzw, @Nullable C1736vq vqVar) {
        zzwf zzwf;
        AdSize adSize;
        if (this.zzbls.zzbst.f7298g == null && this.zzbls.zzbst.f7300i) {
            zzbw zzbw = this.zzbls;
            if (wgVar.f6725b.f7106y) {
                zzwf = this.zzbls.zzbst;
            } else {
                String str = wgVar.f6725b.f7093l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    adSize = new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    adSize = this.zzbls.zzbst.mo13458b();
                }
                zzwf = new zzwf(this.zzbls.zzsp, adSize);
            }
            zzbw.zzbst = zzwf;
        }
        return super.zza(wgVar, zzw, vqVar);
    }

    public final boolean zzb(zzwb zzwb) {
        zzwb zzwb2 = zzwb;
        this.zzbmz = false;
        this.zzblx = null;
        if (zzwb2.f7278h != this.zzbli) {
            zzwb2 = new zzwb(zzwb2.f7271a, zzwb2.f7272b, zzwb2.f7273c, zzwb2.f7274d, zzwb2.f7275e, zzwb2.f7276f, zzwb2.f7277g, zzwb2.f7278h || this.zzbli, zzwb2.f7279i, zzwb2.f7280j, zzwb2.f7281k, zzwb2.f7282l, zzwb2.f7283m, zzwb2.f7284n, zzwb2.f7285o, zzwb2.f7286p, zzwb2.f7287q, zzwb2.f7288r, (zzvv) null, zzwb2.f7290t, zzwb2.f7291u);
        }
        return super.zzb(zzwb2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.bre.m6321e().mo12778a(com.google.android.gms.internal.ads.C1557p.f5994bw)).booleanValue() != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(@android.support.annotation.Nullable com.google.android.gms.internal.ads.C1752wf r5, com.google.android.gms.internal.ads.C1752wf r6) {
        /*
            r4 = this;
            boolean r0 = super.zza((com.google.android.gms.internal.ads.C1752wf) r5, (com.google.android.gms.internal.ads.C1752wf) r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            boolean r0 = r0.zzmj()
            if (r0 == 0) goto L_0x0025
            boolean r5 = r4.zzd(r5, r6)
            if (r5 != 0) goto L_0x0025
            com.google.android.gms.internal.ads.box r5 = r6.f6688K
            if (r5 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.box r5 = r6.f6688K
            com.google.android.gms.internal.ads.boz$a$b r6 = com.google.android.gms.internal.ads.boz.C1142a.C1144b.AD_FAILED_TO_LOAD
            r5.mo12285a((com.google.android.gms.internal.ads.boz.C1142a.C1144b) r6)
        L_0x0021:
            r4.zzbr(r1)
            return r1
        L_0x0025:
            r4.zzb(r6, r1)
            boolean r5 = r6.f6709l
            r0 = 0
            if (r5 == 0) goto L_0x0064
            r4.zzd(r6)
            com.google.android.gms.ads.internal.zzbv.zzme()
            com.google.android.gms.ads.internal.zzbw r5 = r4.zzbls
            com.google.android.gms.ads.internal.zzbx r5 = r5.zzbsq
            com.google.android.gms.internal.ads.aby.m1688a((android.view.View) r5, (android.view.ViewTreeObserver.OnGlobalLayoutListener) r4)
            com.google.android.gms.ads.internal.zzbv.zzme()
            com.google.android.gms.ads.internal.zzbw r5 = r4.zzbls
            com.google.android.gms.ads.internal.zzbx r5 = r5.zzbsq
            com.google.android.gms.internal.ads.aby.m1689a((android.view.View) r5, (android.view.ViewTreeObserver.OnScrollChangedListener) r4)
            boolean r5 = r6.f6710m
            if (r5 != 0) goto L_0x0081
            com.google.android.gms.ads.internal.zzy r5 = new com.google.android.gms.ads.internal.zzy
            r5.<init>(r4)
            com.google.android.gms.internal.ads.afl r1 = r6.f6699b
            if (r1 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.afl r1 = r6.f6699b
            com.google.android.gms.internal.ads.ags r1 = r1.mo10388u()
            goto L_0x0059
        L_0x0058:
            r1 = r0
        L_0x0059:
            if (r1 == 0) goto L_0x0081
            com.google.android.gms.ads.internal.zzz r2 = new com.google.android.gms.ads.internal.zzz
            r2.<init>(r6, r5)
            r1.mo10403a((com.google.android.gms.internal.ads.agw) r2)
            goto L_0x0081
        L_0x0064:
            com.google.android.gms.ads.internal.zzbw r5 = r4.zzbls
            boolean r5 = r5.zzmk()
            if (r5 == 0) goto L_0x007e
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.C1557p.f5994bw
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r5 = r2.mo12778a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0081
        L_0x007e:
            r4.zza((com.google.android.gms.internal.ads.C1752wf) r6, (boolean) r1)
        L_0x0081:
            com.google.android.gms.internal.ads.afl r5 = r6.f6699b
            if (r5 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.afl r5 = r6.f6699b
            com.google.android.gms.internal.ads.aga r5 = r5.mo10172b()
            com.google.android.gms.internal.ads.afl r1 = r6.f6699b
            com.google.android.gms.internal.ads.ags r1 = r1.mo10388u()
            if (r1 == 0) goto L_0x0096
            r1.mo10418g()
        L_0x0096:
            com.google.android.gms.ads.internal.zzbw r1 = r4.zzbls
            com.google.android.gms.internal.ads.zzzw r1 = r1.zzbtj
            if (r1 == 0) goto L_0x00a5
            if (r5 == 0) goto L_0x00a5
            com.google.android.gms.ads.internal.zzbw r1 = r4.zzbls
            com.google.android.gms.internal.ads.zzzw r1 = r1.zzbtj
            r5.mo10466a((com.google.android.gms.internal.ads.zzzw) r1)
        L_0x00a5:
            boolean r5 = com.google.android.gms.common.util.C0979o.m1500a()
            if (r5 == 0) goto L_0x0142
            com.google.android.gms.ads.internal.zzbw r5 = r4.zzbls
            boolean r5 = r5.zzmj()
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.afl r5 = r6.f6699b
            if (r5 == 0) goto L_0x0139
            org.json.JSONObject r5 = r6.f6708k
            if (r5 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.blp r5 = r4.zzblu
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            com.google.android.gms.internal.ads.zzwf r0 = r0.zzbst
            r5.mo12145a(r0, r6)
        L_0x00c4:
            com.google.android.gms.internal.ads.afl r5 = r6.f6699b
            android.view.View r0 = r5.getView()
            com.google.android.gms.internal.ads.bmn r5 = new com.google.android.gms.internal.ads.bmn
            com.google.android.gms.ads.internal.zzbw r1 = r4.zzbls
            android.content.Context r1 = r1.zzsp
            r5.<init>(r1, r0)
            com.google.android.gms.internal.ads.vv r1 = com.google.android.gms.ads.internal.zzbv.zzmf()
            com.google.android.gms.ads.internal.zzbw r2 = r4.zzbls
            android.content.Context r2 = r2.zzsp
            boolean r1 = r1.mo13075a(r2)
            if (r1 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.zzwb r1 = r6.f6698a
            boolean r1 = zza((com.google.android.gms.internal.ads.zzwb) r1)
            if (r1 == 0) goto L_0x0103
            com.google.android.gms.ads.internal.zzbw r1 = r4.zzbls
            java.lang.String r1 = r1.zzbsn
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0103
            com.google.android.gms.internal.ads.vu r1 = new com.google.android.gms.internal.ads.vu
            com.google.android.gms.ads.internal.zzbw r2 = r4.zzbls
            android.content.Context r2 = r2.zzsp
            com.google.android.gms.ads.internal.zzbw r3 = r4.zzbls
            java.lang.String r3 = r3.zzbsn
            r1.<init>(r2, r3)
            r5.mo12181a((com.google.android.gms.internal.ads.bmr) r1)
        L_0x0103:
            boolean r1 = r6.mo13096a()
            if (r1 == 0) goto L_0x010f
            com.google.android.gms.internal.ads.afl r1 = r6.f6699b
            r5.mo12181a((com.google.android.gms.internal.ads.bmr) r1)
            goto L_0x0139
        L_0x010f:
            com.google.android.gms.internal.ads.afl r1 = r6.f6699b
            com.google.android.gms.internal.ads.ags r1 = r1.mo10388u()
            com.google.android.gms.ads.internal.zzaa r2 = new com.google.android.gms.ads.internal.zzaa
            r2.<init>(r5, r6)
            r1.mo10402a((com.google.android.gms.internal.ads.agv) r2)
            goto L_0x0139
        L_0x011e:
            com.google.android.gms.ads.internal.zzbw r5 = r4.zzbls
            android.view.View r5 = r5.zzbtv
            if (r5 == 0) goto L_0x0139
            org.json.JSONObject r5 = r6.f6708k
            if (r5 == 0) goto L_0x0139
            com.google.android.gms.internal.ads.blp r5 = r4.zzblu
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            com.google.android.gms.internal.ads.zzwf r0 = r0.zzbst
            com.google.android.gms.ads.internal.zzbw r1 = r4.zzbls
            android.view.View r1 = r1.zzbtv
            r5.mo12146a(r0, r6, r1)
            com.google.android.gms.ads.internal.zzbw r5 = r4.zzbls
            android.view.View r0 = r5.zzbtv
        L_0x0139:
            boolean r5 = r6.f6711n
            if (r5 != 0) goto L_0x0142
            com.google.android.gms.ads.internal.zzbw r5 = r4.zzbls
            r5.zzj(r0)
        L_0x0142:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzx.zza(com.google.android.gms.internal.ads.wf, com.google.android.gms.internal.ads.wf):boolean");
    }

    private final boolean zzd(@Nullable C1752wf wfVar, C1752wf wfVar2) {
        if (wfVar2.f6711n) {
            View zze = zzas.zze(wfVar2);
            if (zze == null) {
                C1772wz.m1630e("Could not get mediation view");
                return false;
            }
            View nextView = this.zzbls.zzbsq.getNextView();
            if (nextView != null) {
                if (nextView instanceof afl) {
                    ((afl) nextView).destroy();
                }
                this.zzbls.zzbsq.removeView(nextView);
            }
            if (!zzas.zzf(wfVar2)) {
                try {
                    if (zzbv.zzmf().mo13075a(this.zzbls.zzsp)) {
                        new bmn(this.zzbls.zzsp, zze).mo12181a((bmr) new C1740vu(this.zzbls.zzsp, this.zzbls.zzbsn));
                    }
                    if (wfVar2.f6718u != null) {
                        this.zzbls.zzbsq.setMinimumWidth(wfVar2.f6718u.f7297f);
                        this.zzbls.zzbsq.setMinimumHeight(wfVar2.f6718u.f7294c);
                    }
                    zzg(zze);
                } catch (Exception e) {
                    zzbv.zzlj().mo13119a((Throwable) e, "BannerAdManager.swapViews");
                    C1772wz.m1627c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(wfVar2.f6718u == null || wfVar2.f6699b == null)) {
            wfVar2.f6699b.mo10345a(agy.m2170a(wfVar2.f6718u));
            this.zzbls.zzbsq.removeAllViews();
            this.zzbls.zzbsq.setMinimumWidth(wfVar2.f6718u.f7297f);
            this.zzbls.zzbsq.setMinimumHeight(wfVar2.f6718u.f7294c);
            zzg(wfVar2.f6699b.getView());
        }
        if (this.zzbls.zzbsq.getChildCount() > 1) {
            this.zzbls.zzbsq.showNext();
        }
        if (wfVar != null) {
            View nextView2 = this.zzbls.zzbsq.getNextView();
            if (nextView2 instanceof afl) {
                ((afl) nextView2).destroy();
            } else if (nextView2 != null) {
                this.zzbls.zzbsq.removeView(nextView2);
            }
            this.zzbls.zzmi();
        }
        this.zzbls.zzbsq.setVisibility(0);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void zzil() {
        afl afl = this.zzbls.zzbsu != null ? this.zzbls.zzbsu.f6699b : null;
        if (!this.zzbmz && afl != null) {
            zzc(afl);
        }
        super.zzil();
    }

    private final void zzc(afl afl) {
        WebView webView;
        View view;
        if (zzjj() && (webView = afl.getWebView()) != null && (view = afl.getView()) != null && zzbv.zzlw().mo12836a(this.zzbls.zzsp)) {
            int i = this.zzbls.zzbsp.f7136b;
            int i2 = this.zzbls.zzbsp.f7137c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.zzblx = zzbv.zzlw().mo12832a(sb.toString(), webView, "", "javascript", zzit());
            if (this.zzblx != null) {
                zzbv.zzlw().mo12835a(this.zzblx, view);
                afl.mo10343a(this.zzblx);
                zzbv.zzlw().mo12834a(this.zzblx);
                this.zzbmz = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zziu() {
        boolean z;
        zzbv.zzlf();
        if (!C1782xi.m8381a(this.zzbls.zzsp, "android.permission.INTERNET")) {
            bre.m6317a().mo13303a(this.zzbls.zzbsq, this.zzbls.zzbst, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else {
            z = true;
        }
        zzbv.zzlf();
        if (!C1782xi.m8380a(this.zzbls.zzsp)) {
            bre.m6317a().mo13303a(this.zzbls.zzbsq, this.zzbls.zzbst, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.zzbls.zzbsq != null) {
            this.zzbls.zzbsq.setVisibility(0);
        }
        return z;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        C0926p.m1315b("setManualImpressionsEnabled must be called from the main thread.");
        this.zzbli = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public final void onGlobalLayout() {
        zzd(this.zzbls.zzbsu);
    }

    public final void onScrollChanged() {
        zzd(this.zzbls.zzbsu);
    }

    /* access modifiers changed from: protected */
    public final void zza(@Nullable C1752wf wfVar, boolean z) {
        if (zzjj()) {
            afl afl = wfVar != null ? wfVar.f6699b : null;
            if (afl != null) {
                if (!this.zzbmz) {
                    zzc(afl);
                }
                if (this.zzblx != null) {
                    afl.mo10443a("onSdkImpression", (Map<String, ?>) new ArrayMap());
                }
            }
        }
        super.zza(wfVar, z);
        if (zzas.zzf(wfVar)) {
            zzab zzab = new zzab(this);
            if (wfVar != null && zzas.zzf(wfVar)) {
                afl afl2 = wfVar.f6699b;
                View view = afl2 != null ? afl2.getView() : null;
                if (view == null) {
                    C1772wz.m1630e("AdWebView is null");
                    return;
                }
                try {
                    List<String> list = wfVar.f6712o != null ? wfVar.f6712o.f5562r : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            C1450la h = wfVar.f6713p != null ? wfVar.f6713p.mo12699h() : null;
                            C1453ld i = wfVar.f6713p != null ? wfVar.f6713p.mo12700i() : null;
                            if (list.contains("2") && h != null) {
                                h.mo12712b(C0722b.m769a(view));
                                if (!h.mo12721j()) {
                                    h.mo12720i();
                                }
                                afl2.mo10347a("/nativeExpressViewClicked", (zzu<? super afl>) zzas.zza(h, (C1453ld) null, zzab));
                                return;
                            } else if (!list.contains("1") || i == null) {
                                C1772wz.m1630e("No matching template id and mapper");
                                return;
                            } else {
                                i.mo12733b(C0722b.m769a(view));
                                if (!i.mo12740h()) {
                                    i.mo12739g();
                                }
                                afl2.mo10347a("/nativeExpressViewClicked", (zzu<? super afl>) zzas.zza((C1450la) null, i, zzab));
                                return;
                            }
                        }
                    }
                    C1772wz.m1630e("No template ids present in mediation response");
                } catch (RemoteException e) {
                    C1772wz.m1627c("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzd(@Nullable C1752wf wfVar) {
        if (wfVar != null && !wfVar.f6710m && this.zzbls.zzbsq != null && zzbv.zzlf().mo13205a((View) this.zzbls.zzbsq, this.zzbls.zzsp) && this.zzbls.zzbsq.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (!(wfVar == null || wfVar.f6699b == null || wfVar.f6699b.mo10388u() == null)) {
                wfVar.f6699b.mo10388u().mo10403a((agw) null);
            }
            zza(wfVar, false);
            wfVar.f6710m = true;
        }
    }

    @Nullable
    public final btb getVideoController() {
        C0926p.m1315b("getVideoController must be called from the main thread.");
        if (this.zzbls.zzbsu == null || this.zzbls.zzbsu.f6699b == null) {
            return null;
        }
        return this.zzbls.zzbsu.f6699b.mo10172b();
    }

    public final void zzjv() {
        this.zzblr.zzku();
    }
}
