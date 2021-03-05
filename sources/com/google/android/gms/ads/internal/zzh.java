package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1019ad;
import com.google.android.gms.internal.ads.C1026aj;
import com.google.android.gms.internal.ads.C1135bi;
import com.google.android.gms.internal.ads.C1419jx;
import com.google.android.gms.internal.ads.C1423ka;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1440kr;
import com.google.android.gms.internal.ads.C1515nl;
import com.google.android.gms.internal.ads.C1543om;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1736vq;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.afr;
import com.google.android.gms.internal.ads.agy;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwf;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public abstract class zzh extends zzc implements zzaf, C1515nl {
    private boolean zzbme;

    public zzh(Context context, zzwf zzwf, String str, C1437ko koVar, zzbbi zzbbi, zzv zzv) {
        super(context, zzwf, str, koVar, zzbbi, zzv);
    }

    /* access modifiers changed from: protected */
    public afl zza(C1753wg wgVar, @Nullable zzw zzw, @Nullable C1736vq vqVar) {
        C1753wg wgVar2 = wgVar;
        View nextView = this.zzbls.zzbsq.getNextView();
        if (nextView instanceof afl) {
            ((afl) nextView).destroy();
        }
        if (nextView != null) {
            this.zzbls.zzbsq.removeView(nextView);
        }
        zzbv.zzlg();
        afl a = afr.m2018a(this.zzbls.zzsp, agy.m2170a(this.zzbls.zzbst), this.zzbls.zzbst.f7292a, false, false, this.zzbls.zzbso, this.zzbls.zzbsp, this.zzbln, this, this.zzbly, wgVar2.f6732i);
        if (this.zzbls.zzbst.f7298g == null) {
            zzg(a.getView());
        }
        a.mo10388u().mo10404a(this, this, this, this, this, false, (zzy) null, zzw, this, vqVar);
        zza(a);
        a.mo10351b(wgVar2.f6724a.f7051v);
        return a;
    }

    /* access modifiers changed from: protected */
    public final void zza(afl afl) {
        afl.mo10347a("/trackActiveViewUnit", (zzu<? super afl>) new zzi(this));
    }

    /* access modifiers changed from: protected */
    public void zzil() {
        super.zzil();
        if (this.zzbme) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5948bC)).booleanValue()) {
                zzb(this.zzbls.zzbsu.f6699b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(afl afl) {
        if (this.zzbls.zzbsu != null) {
            this.zzblu.mo12147a(this.zzbls.zzbst, this.zzbls.zzbsu, afl.getView(), afl);
            this.zzbme = false;
            return;
        }
        this.zzbme = true;
        C1772wz.m1630e("Request to enable ActiveView before adState is available.");
    }

    /* access modifiers changed from: protected */
    public void zza(C1753wg wgVar, C1019ad adVar) {
        if (wgVar.f6728e != -2) {
            C1782xi.f6838a.post(new zzj(this, wgVar));
            return;
        }
        if (wgVar.f6727d != null) {
            this.zzbls.zzbst = wgVar.f6727d;
        }
        if (!wgVar.f6725b.f7088g || wgVar.f6725b.f7107z) {
            C1782xi.f6838a.post(new zzk(this, wgVar, this.zzbly.zzbmu.mo13065a(this.zzbls.zzsp, this.zzbls.zzbsp, wgVar.f6725b), adVar));
            return;
        }
        this.zzbls.zzbtw = 0;
        zzbw zzbw = this.zzbls;
        zzbv.zzle();
        zzbw.zzbss = C1543om.m7705a(this.zzbls.zzsp, this, wgVar, this.zzbls.zzbso, (afl) null, this.zzbma, this, adVar);
    }

    /* access modifiers changed from: protected */
    public boolean zza(@Nullable C1752wf wfVar, C1752wf wfVar2) {
        if (this.zzbls.zzmj() && this.zzbls.zzbsq != null) {
            this.zzbls.zzbsq.zzmm().mo13256c(wfVar2.f6678A);
        }
        try {
            if (wfVar2.f6699b != null && !wfVar2.f6711n && wfVar2.f6690M && !wfVar2.f6698a.f7273c.containsKey("sdk_less_server_data")) {
                try {
                    wfVar2.f6699b.mo10340J();
                } catch (Throwable unused) {
                    C1772wz.m8287a("Could not render test Ad label.");
                }
            }
        } catch (RuntimeException unused2) {
            C1772wz.m8287a("Could not render test AdLabel.");
        }
        if (!(wfVar2 == null || wfVar2.f6699b == null)) {
            wfVar2.f6699b.mo10358f(wfVar2.f6693P);
        }
        return super.zza(wfVar, wfVar2);
    }

    public final void zza(C1026aj ajVar) {
        C0926p.m1315b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzbls.zzbto = ajVar;
    }

    public final void zzh(View view) {
        this.zzbls.zzbtv = view;
        zzb(new C1752wf(this.zzbls.zzbsv, (afl) null, (C1419jx) null, (C1440kr) null, (String) null, (C1423ka) null, (C1135bi) null, (String) null));
    }

    public final void zzjh() {
        onAdClicked();
    }

    public final void zzji() {
        recordImpression();
        zzih();
    }

    /* access modifiers changed from: protected */
    public final boolean zzjj() {
        return (this.zzbls.zzbsv == null || this.zzbls.zzbsv.f6725b == null || !this.zzbls.zzbsv.f6725b.f7072Q) ? false : true;
    }

    public final void zza(int i, int i2, int i3, int i4) {
        zzik();
    }

    public final void zzjk() {
        zzii();
    }
}
