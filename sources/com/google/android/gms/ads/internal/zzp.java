package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1019ad;
import com.google.android.gms.internal.ads.C1026aj;
import com.google.android.gms.internal.ads.C1068ap;
import com.google.android.gms.internal.ads.C1090au;
import com.google.android.gms.internal.ads.C1120aw;
import com.google.android.gms.internal.ads.C1127bb;
import com.google.android.gms.internal.ads.C1130be;
import com.google.android.gms.internal.ads.C1132bf;
import com.google.android.gms.internal.ads.C1133bg;
import com.google.android.gms.internal.ads.C1134bh;
import com.google.android.gms.internal.ads.C1135bi;
import com.google.android.gms.internal.ads.C1210ce;
import com.google.android.gms.internal.ads.C1233da;
import com.google.android.gms.internal.ads.C1244dl;
import com.google.android.gms.internal.ads.C1419jx;
import com.google.android.gms.internal.ads.C1420jy;
import com.google.android.gms.internal.ads.C1423ka;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1440kr;
import com.google.android.gms.internal.ads.C1450la;
import com.google.android.gms.internal.ads.C1453ld;
import com.google.android.gms.internal.ads.C1456lg;
import com.google.android.gms.internal.ads.C1543om;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.btb;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzvv;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzp extends zzc implements C1134bh {
    private boolean zzbli;
    private C1752wf zzbmk;
    private boolean zzbml = false;

    public zzp(Context context, zzv zzv, zzwf zzwf, String str, C1437ko koVar, zzbbi zzbbi) {
        super(context, zzwf, str, koVar, zzbbi, zzv);
    }

    @Nullable
    public final btb getVideoController() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzwb zzwb, C1752wf wfVar, boolean z) {
        return false;
    }

    public final boolean zzb(zzwb zzwb) {
        zzwb zzwb2 = zzwb;
        if (this.zzbls.zzbtn != null && this.zzbls.zzbtn.size() == 1 && this.zzbls.zzbtn.get(0).intValue() == 2) {
            C1772wz.m1626c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            zzbr(0);
            return false;
        } else if (this.zzbls.zzbtm == null) {
            return super.zzb(zzwb);
        } else {
            if (zzwb2.f7278h != this.zzbli) {
                zzwb2 = new zzwb(zzwb2.f7271a, zzwb2.f7272b, zzwb2.f7273c, zzwb2.f7274d, zzwb2.f7275e, zzwb2.f7276f, zzwb2.f7277g, zzwb2.f7278h || this.zzbli, zzwb2.f7279i, zzwb2.f7280j, zzwb2.f7281k, zzwb2.f7282l, zzwb2.f7283m, zzwb2.f7284n, zzwb2.f7285o, zzwb2.f7286p, zzwb2.f7287q, zzwb2.f7288r, (zzvv) null, zzwb2.f7290t, zzwb2.f7291u);
            }
            return super.zzb(zzwb2);
        }
    }

    public final void zza(C1753wg wgVar, C1019ad adVar) {
        this.zzbmk = null;
        if (wgVar.f6728e != -2) {
            this.zzbmk = zza(wgVar, wgVar.f6728e);
        } else if (!wgVar.f6725b.f7088g) {
            C1772wz.m1630e("partialAdState is not mediation");
            this.zzbmk = zza(wgVar, 0);
        }
        if (this.zzbmk != null) {
            C1782xi.f6838a.post(new zzq(this));
            return;
        }
        if (wgVar.f6727d != null) {
            this.zzbls.zzbst = wgVar.f6727d;
        }
        this.zzbls.zzbtw = 0;
        zzbw zzbw = this.zzbls;
        zzbv.zzle();
        zzbw.zzbss = C1543om.m7705a(this.zzbls.zzsp, this, wgVar, this.zzbls.zzbso, (afl) null, this.zzbma, this, adVar);
    }

    private static C1752wf zza(C1753wg wgVar, int i) {
        C1753wg wgVar2 = wgVar;
        return new C1752wf(wgVar2.f6724a.f7032c, (afl) null, wgVar2.f6725b.f7084c, i, wgVar2.f6725b.f7086e, wgVar2.f6725b.f7090i, wgVar2.f6725b.f7092k, wgVar2.f6725b.f7091j, wgVar2.f6724a.f7038i, wgVar2.f6725b.f7088g, (C1419jx) null, (C1440kr) null, (String) null, wgVar2.f6726c, (C1423ka) null, wgVar2.f6725b.f7089h, wgVar2.f6727d, wgVar2.f6725b.f7087f, wgVar2.f6729f, wgVar2.f6730g, wgVar2.f6725b.f7095n, wgVar2.f6731h, (C1135bi) null, wgVar2.f6725b.f7056A, wgVar2.f6725b.f7057B, wgVar2.f6725b.f7057B, wgVar2.f6725b.f7059D, wgVar2.f6725b.f7060E, (String) null, wgVar2.f6725b.f7063H, wgVar2.f6725b.f7067L, wgVar2.f6732i, wgVar2.f6725b.f7070O, wgVar2.f6733j, wgVar2.f6725b.f7072Q, wgVar2.f6725b.f7073R, wgVar2.f6725b.f7074S, wgVar2.f6725b.f7075T, wgVar2.f6725b.f7077V);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(@android.support.annotation.Nullable com.google.android.gms.internal.ads.C1752wf r5, com.google.android.gms.internal.ads.C1752wf r6) {
        /*
            r4 = this;
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            boolean r0 = r0.zzmj()
            if (r0 == 0) goto L_0x009c
            boolean r0 = r6.f6711n
            r1 = 0
            if (r0 != 0) goto L_0x0016
            r4.zzbr(r1)
            java.lang.String r5 = "newState is not mediation."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r5)
            return r1
        L_0x0016:
            com.google.android.gms.internal.ads.jx r0 = r6.f6712o
            r2 = 1
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.jx r0 = r6.f6712o
            boolean r0 = r0.mo12642a()
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            boolean r0 = r0.zzmj()
            if (r0 == 0) goto L_0x003e
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            com.google.android.gms.ads.internal.zzbx r0 = r0.zzbsq
            if (r0 == 0) goto L_0x003e
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            com.google.android.gms.ads.internal.zzbx r0 = r0.zzbsq
            com.google.android.gms.internal.ads.ye r0 = r0.zzmm()
            java.lang.String r3 = r6.f6678A
            r0.mo13256c(r3)
        L_0x003e:
            boolean r0 = super.zza((com.google.android.gms.internal.ads.C1752wf) r5, (com.google.android.gms.internal.ads.C1752wf) r6)
            if (r0 != 0) goto L_0x0046
        L_0x0044:
            r5 = 0
            goto L_0x0064
        L_0x0046:
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            boolean r0 = r0.zzmj()
            if (r0 == 0) goto L_0x0058
            boolean r5 = r4.zzc(r5, r6)
            if (r5 != 0) goto L_0x0058
            r4.zzbr(r1)
            goto L_0x0044
        L_0x0058:
            com.google.android.gms.ads.internal.zzbw r5 = r4.zzbls
            boolean r5 = r5.zzmk()
            if (r5 != 0) goto L_0x0063
            super.zza((com.google.android.gms.internal.ads.C1752wf) r6, (boolean) r1)
        L_0x0063:
            r5 = 1
        L_0x0064:
            if (r5 != 0) goto L_0x0067
            return r1
        L_0x0067:
            r4.zzbml = r2
            goto L_0x007d
        L_0x006a:
            com.google.android.gms.internal.ads.jx r0 = r6.f6712o
            if (r0 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.jx r0 = r6.f6712o
            boolean r0 = r0.mo12643b()
            if (r0 == 0) goto L_0x0093
            boolean r5 = r4.zzb(r5, r6)
            if (r5 != 0) goto L_0x007d
            return r1
        L_0x007d:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Integer[] r6 = new java.lang.Integer[r2]
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            r5.<init>(r6)
            r4.zze(r5)
            return r2
        L_0x0093:
            r4.zzbr(r1)
            java.lang.String r5 = "Response is neither banner nor native."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r5)
            return r1
        L_0x009c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "AdLoader API does not support custom rendering."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzp.zza(com.google.android.gms.internal.ads.wf, com.google.android.gms.internal.ads.wf):boolean");
    }

    private final boolean zzb(C1752wf wfVar, C1752wf wfVar2) {
        C1752wf wfVar3 = wfVar2;
        View view = null;
        zzd((List<String>) null);
        if (!this.zzbls.zzmj()) {
            C1772wz.m1630e("Native ad does not have custom rendering mode.");
            zzbr(0);
            return false;
        }
        try {
            C1456lg p = wfVar3.f6713p != null ? wfVar3.f6713p.mo12707p() : null;
            C1450la h = wfVar3.f6713p != null ? wfVar3.f6713p.mo12699h() : null;
            C1453ld i = wfVar3.f6713p != null ? wfVar3.f6713p.mo12700i() : null;
            C1233da n = wfVar3.f6713p != null ? wfVar3.f6713p.mo12705n() : null;
            String zzc = zzc(wfVar2);
            if (p != null && this.zzbls.zzbte != null) {
                String a = p.mo12748a();
                List b = p.mo12751b();
                String c = p.mo12753c();
                C1210ce d = p.mo12754d() != null ? p.mo12754d() : null;
                String e = p.mo12755e();
                String f = p.mo12756f();
                double g = p.mo12757g();
                String h2 = p.mo12758h();
                String i2 = p.mo12759i();
                btb j = p.mo12760j();
                if (p.mo12763m() != null) {
                    view = (View) C0722b.m770a(p.mo12763m());
                }
                C1127bb bbVar = new C1127bb(a, b, c, d, e, f, g, h2, i2, (C1068ap) null, j, view, p.mo12764n(), zzc, p.mo12765o());
                bbVar.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, p, (C1135bi) bbVar));
                zza(bbVar);
            } else if (h != null && this.zzbls.zzbte != null) {
                String a2 = h.mo12708a();
                List b2 = h.mo12711b();
                String c2 = h.mo12713c();
                C1210ce d2 = h.mo12715d() != null ? h.mo12715d() : null;
                String e2 = h.mo12716e();
                double f2 = h.mo12717f();
                String g2 = h.mo12718g();
                String h3 = h.mo12719h();
                btb m = h.mo12724m();
                if (h.mo12727p() != null) {
                    view = (View) C0722b.m770a(h.mo12727p());
                }
                C1127bb bbVar2 = new C1127bb(a2, b2, c2, d2, e2, (String) null, f2, g2, h3, (C1068ap) null, m, view, h.mo12728q(), zzc, h.mo12723l());
                bbVar2.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, h, (C1135bi) bbVar2));
                zza(bbVar2);
            } else if (h != null && this.zzbls.zzbtc != null) {
                String a3 = h.mo12708a();
                List b3 = h.mo12711b();
                String c3 = h.mo12713c();
                C1210ce d3 = h.mo12715d() != null ? h.mo12715d() : null;
                String e3 = h.mo12716e();
                double f3 = h.mo12717f();
                String g3 = h.mo12718g();
                String h4 = h.mo12719h();
                Bundle l = h.mo12723l();
                btb m2 = h.mo12724m();
                if (h.mo12727p() != null) {
                    view = (View) C0722b.m770a(h.mo12727p());
                }
                C1090au auVar = new C1090au(a3, b3, c3, d3, e3, f3, g3, h4, (C1068ap) null, l, m2, view, h.mo12728q(), zzc);
                auVar.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, h, (C1135bi) auVar));
                C1782xi.f6838a.post(new zzs(this, auVar));
            } else if (i != null && this.zzbls.zzbte != null) {
                String a4 = i.mo12729a();
                List b4 = i.mo12732b();
                String c4 = i.mo12734c();
                C1210ce d4 = i.mo12736d() != null ? i.mo12736d() : null;
                String e4 = i.mo12737e();
                String f4 = i.mo12738f();
                btb l2 = i.mo12744l();
                if (i.mo12746n() != null) {
                    view = (View) C0722b.m770a(i.mo12746n());
                }
                C1127bb bbVar3 = new C1127bb(a4, b4, c4, d4, e4, f4, -1.0d, (String) null, (String) null, (C1068ap) null, l2, view, i.mo12747o(), zzc, i.mo12742j());
                C1453ld ldVar = i;
                C1127bb bbVar4 = bbVar3;
                bbVar4.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, ldVar, (C1135bi) bbVar3));
                zza(bbVar4);
            } else if (i != null && this.zzbls.zzbtd != null) {
                String a5 = i.mo12729a();
                List b5 = i.mo12732b();
                String c5 = i.mo12734c();
                C1210ce d5 = i.mo12736d() != null ? i.mo12736d() : null;
                String e5 = i.mo12737e();
                String f5 = i.mo12738f();
                Bundle j2 = i.mo12742j();
                btb l3 = i.mo12744l();
                if (i.mo12746n() != null) {
                    view = (View) C0722b.m770a(i.mo12746n());
                }
                C1120aw awVar = new C1120aw(a5, b5, c5, d5, e5, f5, (C1068ap) null, j2, l3, view, i.mo12747o(), zzc);
                C1453ld ldVar2 = i;
                C1120aw awVar2 = awVar;
                awVar2.mo11092a((C1133bg) new C1132bf(this.zzbls.zzsp, (C1134bh) this, this.zzbls.zzbso, ldVar2, (C1135bi) awVar));
                C1782xi.f6838a.post(new zzt(this, awVar2));
            } else if (n == null || this.zzbls.zzbth == null || this.zzbls.zzbth.get(n.mo11093b()) == null) {
                C1772wz.m1630e("No matching mapper/listener for retrieved native ad template.");
                zzbr(0);
                return false;
            } else {
                C1782xi.f6838a.post(new zzu(this, n));
            }
            return super.zza(wfVar, wfVar2);
        } catch (RemoteException e6) {
            C1772wz.m1629d("#007 Could not call remote method.", e6);
            zzbr(0);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb(@Nullable C0719a aVar) {
        Object a = aVar != null ? C0722b.m770a(aVar) : null;
        if (a instanceof C1133bg) {
            ((C1133bg) a).mo11793e();
        }
        super.zzb(this.zzbls.zzbsu, false);
    }

    private final void zza(C1127bb bbVar) {
        C1782xi.f6838a.post(new zzr(this, bbVar));
    }

    public final void zzi(View view) {
        aai.m1629d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zzjl() {
        aai.m1629d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zzjm() {
        aai.m1629d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zza(C1133bg bgVar) {
        aai.m1629d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zzjn() {
        aai.m1629d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zza(C1130be beVar) {
        aai.m1629d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final boolean zzjo() {
        if (zzjr() != null) {
            return zzjr().f5581p;
        }
        return false;
    }

    public final boolean zzjp() {
        if (zzjr() != null) {
            return zzjr().f5582q;
        }
        return false;
    }

    public final boolean zzjq() {
        if (zzjr() != null) {
            return zzjr().f5583r;
        }
        return false;
    }

    @Nullable
    private final C1420jy zzjr() {
        if (this.zzbls.zzbsu == null || !this.zzbls.zzbsu.f6711n) {
            return null;
        }
        return this.zzbls.zzbsu.f6715r;
    }

    private final boolean zzc(C1752wf wfVar, C1752wf wfVar2) {
        View zze = zzas.zze(wfVar2);
        if (zze == null) {
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
                zzg(zze);
            } catch (Throwable th) {
                zzbv.zzlj().mo13119a(th, "AdLoaderManager.swapBannerViews");
                C1772wz.m1627c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.zzbls.zzbsq.getChildCount() > 1) {
            this.zzbls.zzbsq.showNext();
        }
        if (wfVar != null) {
            View nextView2 = this.zzbls.zzbsq.getNextView();
            if (nextView2 != null) {
                this.zzbls.zzbsq.removeView(nextView2);
            }
            this.zzbls.zzmi();
        }
        this.zzbls.zzbsq.setMinimumWidth(zzif().f7297f);
        this.zzbls.zzbsq.setMinimumHeight(zzif().f7294c);
        this.zzbls.zzbsq.requestLayout();
        this.zzbls.zzbsq.setVisibility(0);
        return true;
    }

    public final void pause() {
        if (this.zzbml) {
            super.pause();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void resume() {
        if (this.zzbml) {
            super.resume();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    public final void zzd(@Nullable List<String> list) {
        C0926p.m1315b("setNativeTemplates must be called on the main UI thread.");
        this.zzbls.zzbtt = list;
    }

    @Nullable
    public final C1244dl zzar(String str) {
        C0926p.m1315b("getOnCustomClickListener must be called on the main UI thread.");
        return this.zzbls.zzbtg.get(str);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        C0926p.m1315b("setManualImpressionsEnabled must be called from the main thread.");
        this.zzbli = z;
    }

    public final void zza(C1026aj ajVar) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void zze(List<Integer> list) {
        C0926p.m1315b("setAllowedAdTypes must be called on the main UI thread.");
        this.zzbls.zzbtn = list;
    }

    /* access modifiers changed from: protected */
    public final void zzil() {
        super.zzil();
        C1752wf wfVar = this.zzbls.zzbsu;
        if (wfVar != null && wfVar.f6712o != null && wfVar.f6712o.mo12642a() && this.zzbls.zzbtm != null) {
            try {
                this.zzbls.zzbtm.mo12504a(this, C0722b.m769a(this.zzbls.zzsp));
                super.zzb(this.zzbls.zzbsu, false);
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zziy() {
        if (this.zzbls.zzbsu == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzbls.zzbsu.f6714q) || this.zzbls.zzbsu.f6712o == null || !this.zzbls.zzbsu.f6712o.mo12643b()) {
            super.zziy();
        } else {
            zzin();
        }
    }

    public final void zzjd() {
        if (this.zzbls.zzbsu == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzbls.zzbsu.f6714q) || this.zzbls.zzbsu.f6712o == null || !this.zzbls.zzbsu.f6712o.mo12643b()) {
            super.zzjd();
        } else {
            zzim();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzjs() {
        zzb(this.zzbmk);
    }
}
