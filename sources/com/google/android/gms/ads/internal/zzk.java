package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1019ad;
import com.google.android.gms.internal.ads.C1021ae;
import com.google.android.gms.internal.ads.C1543om;
import com.google.android.gms.internal.ads.C1736vq;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.afv;

final class zzk implements Runnable {
    final /* synthetic */ C1753wg zzblz;
    final /* synthetic */ zzh zzbmf;
    final /* synthetic */ C1736vq zzbmg;
    private final /* synthetic */ C1019ad zzbmh;

    zzk(zzh zzh, C1753wg wgVar, C1736vq vqVar, C1019ad adVar) {
        this.zzbmf = zzh;
        this.zzblz = wgVar;
        this.zzbmg = vqVar;
        this.zzbmh = adVar;
    }

    public final void run() {
        if (this.zzblz.f6725b.f7099r && this.zzbmf.zzbls.zzbto != null) {
            String str = null;
            if (this.zzblz.f6725b.f7082a != null) {
                zzbv.zzlf();
                str = C1782xi.m8366a(this.zzblz.f6725b.f7082a);
            }
            C1021ae aeVar = new C1021ae(this.zzbmf, str, this.zzblz.f6725b.f7083b);
            this.zzbmf.zzbls.zzbtw = 1;
            try {
                this.zzbmf.zzblq = false;
                this.zzbmf.zzbls.zzbto.mo10603a(aeVar);
                return;
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
                this.zzbmf.zzblq = true;
            }
        }
        zzw zzw = new zzw(this.zzbmf.zzbls.zzsp, this.zzbmg, this.zzblz.f6725b.f7060E);
        try {
            afl zza = this.zzbmf.zza(this.zzblz, zzw, this.zzbmg);
            zza.mo10358f(this.zzbmf.zzbls.zzbsv.f6725b.f7077V);
            zza.setOnTouchListener(new zzm(this, zzw));
            zza.setOnClickListener(new zzn(this, zzw));
            this.zzbmf.zzbls.zzbtw = 0;
            zzbw zzbw = this.zzbmf.zzbls;
            zzbv.zzle();
            zzbw.zzbss = C1543om.m7705a(this.zzbmf.zzbls.zzsp, this.zzbmf, this.zzblz, this.zzbmf.zzbls.zzbso, zza, this.zzbmf.zzbma, this.zzbmf, this.zzbmh);
        } catch (afv e2) {
            C1772wz.m1625b("Could not obtain webview.", e2);
            C1782xi.f6838a.post(new zzl(this));
        }
    }
}
