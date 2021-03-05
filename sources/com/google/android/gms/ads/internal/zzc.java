package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1019ad;
import com.google.android.gms.internal.ads.C1233da;
import com.google.android.gms.internal.ads.C1244dl;
import com.google.android.gms.internal.ads.C1421jz;
import com.google.android.gms.internal.ads.C1429kg;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1601qq;
import com.google.android.gms.internal.ads.C1624rm;
import com.google.android.gms.internal.ads.C1642sd;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1756wj;
import com.google.android.gms.internal.ads.C1768wv;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.C1790xq;
import com.google.android.gms.internal.ads.abl;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.bni;
import com.google.android.gms.internal.ads.boz;
import com.google.android.gms.internal.ads.bpc;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
public abstract class zzc extends zza implements zzn, zzbo, C1421jz {
    protected final C1437ko zzbma;
    private transient boolean zzbmb;

    public zzc(Context context, zzwf zzwf, String str, C1437ko koVar, zzbbi zzbbi, zzv zzv) {
        this(new zzbw(context, zzwf, str, zzbbi), koVar, (zzbl) null, zzv);
    }

    private zzc(zzbw zzbw, C1437ko koVar, @Nullable zzbl zzbl, zzv zzv) {
        super(zzbw, (zzbl) null, zzv);
        this.zzbma = koVar;
        this.zzbmb = false;
    }

    public final boolean zza(zzwb zzwb, C1019ad adVar, int i) {
        Bundle bundle;
        C1756wj wjVar;
        if (!zziu()) {
            return false;
        }
        zzbv.zzlf();
        bni n = zzbv.zzlj().mo13131k().mo13193n();
        String str = null;
        if (n == null) {
            bundle = null;
        } else {
            bundle = C1782xi.m8357a(n);
        }
        this.zzblr.cancel();
        this.zzbls.zzbtw = 0;
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5957bL)).booleanValue()) {
            wjVar = zzbv.zzlj().mo13131k().mo13187h();
            zzad zzln = zzbv.zzln();
            Context context = this.zzbls.zzsp;
            zzbbi zzbbi = this.zzbls.zzbsp;
            String str2 = this.zzbls.zzbsn;
            if (wjVar != null) {
                str = wjVar.mo13114d();
            }
            zzln.zza(context, zzbbi, false, wjVar, str, str2, (Runnable) null);
        } else {
            wjVar = null;
        }
        return zza(zza(zzwb, bundle, wjVar, i), adVar);
    }

    public final boolean zza(C1624rm rmVar, C1019ad adVar) {
        C1768wv wvVar;
        this.zzbln = adVar;
        adVar.mo10153a("seq_num", rmVar.f6336g);
        adVar.mo10153a("request_id", rmVar.f6351v);
        adVar.mo10153a("session_id", rmVar.f6337h);
        if (rmVar.f6335f != null) {
            adVar.mo10153a("app_version", String.valueOf(rmVar.f6335f.versionCode));
        }
        zzbw zzbw = this.zzbls;
        zzbv.zzlb();
        Context context = this.zzbls.zzsp;
        bpc bpc = this.zzbly.zzbmv;
        if (rmVar.f6331b.f7273c.getBundle("sdk_less_server_data") != null) {
            wvVar = new C1642sd(context, rmVar, this, bpc);
        } else {
            wvVar = new C1601qq(context, rmVar, this, bpc);
        }
        wvVar.zzyz();
        zzbw.zzbsr = wvVar;
        return true;
    }

    public boolean zza(zzwb zzwb, C1019ad adVar) {
        return zza(zzwb, adVar, 1);
    }

    public final void zzb(C1752wf wfVar) {
        super.zzb(wfVar);
        if (wfVar.f6712o != null) {
            C1772wz.m1624b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.zzbls.zzbsq != null) {
                this.zzbls.zzbsq.zzmp();
            }
            C1772wz.m1624b("Pinging network fill URLs.");
            zzbv.zzlz();
            C1429kg.m7186a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, wfVar, this.zzbls.zzbsn, false, wfVar.f6712o.f5554j);
            if (!(wfVar.f6715r == null || wfVar.f6715r.f5572g == null || wfVar.f6715r.f5572g.size() <= 0)) {
                C1772wz.m1624b("Pinging urls remotely");
                zzbv.zzlf().mo13204a(this.zzbls.zzsp, wfVar.f6715r.f5572g);
            }
        } else {
            C1772wz.m1624b("Enable the debug gesture detector on the admob ad frame.");
            if (this.zzbls.zzbsq != null) {
                this.zzbls.zzbsq.zzmo();
            }
        }
        if (wfVar.f6701d == 3 && wfVar.f6715r != null && wfVar.f6715r.f5571f != null) {
            C1772wz.m1624b("Pinging no fill URLs.");
            zzbv.zzlz();
            C1429kg.m7186a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, wfVar, this.zzbls.zzbsn, false, wfVar.f6715r.f5571f);
        }
    }

    /* access modifiers changed from: protected */
    public boolean zza(@Nullable C1752wf wfVar, C1752wf wfVar2) {
        int i;
        if (!(wfVar == null || wfVar.f6716s == null)) {
            wfVar.f6716s.mo12653a((C1421jz) null);
        }
        if (wfVar2.f6716s != null) {
            wfVar2.f6716s.mo12653a((C1421jz) this);
        }
        int i2 = 0;
        if (wfVar2.f6715r != null) {
            i2 = wfVar2.f6715r.f5584s;
            i = wfVar2.f6715r.f5585t;
        } else {
            i = 0;
        }
        this.zzbls.zzbtu.mo13148a(i2, i);
        return true;
    }

    public void onAdClicked() {
        if (this.zzbls.zzbsu == null) {
            C1772wz.m1630e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.zzbls.zzbsu.f6715r == null || this.zzbls.zzbsu.f6715r.f5568c == null)) {
            zzbv.zzlz();
            C1429kg.m7186a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, this.zzbls.zzbsu, this.zzbls.zzbsn, false, zza(this.zzbls.zzbsu.f6715r.f5568c, this.zzbls.zzbsu.f6693P));
        }
        if (!(this.zzbls.zzbsu.f6712o == null || this.zzbls.zzbsu.f6712o.f5550f == null)) {
            zzbv.zzlz();
            C1429kg.m7186a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, this.zzbls.zzbsu, this.zzbls.zzbsn, false, this.zzbls.zzbsu.f6712o.f5550f);
        }
        super.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(C1752wf wfVar) {
        zzwb zzwb;
        boolean z = false;
        if (this.zzblt != null) {
            zzwb = this.zzblt;
            this.zzblt = null;
        } else {
            zzwb = wfVar.f6698a;
            if (zzwb.f7273c != null) {
                z = zzwb.f7273c.getBoolean("_noRefresh", false);
            }
        }
        return zza(zzwb, wfVar, z);
    }

    /* access modifiers changed from: protected */
    public boolean zza(zzwb zzwb, C1752wf wfVar, boolean z) {
        if (!z && this.zzbls.zzmj()) {
            if (wfVar.f6706i > 0) {
                this.zzblr.zza(zzwb, wfVar.f6706i);
            } else if (wfVar.f6715r != null && wfVar.f6715r.f5575j > 0) {
                this.zzblr.zza(zzwb, wfVar.f6715r.f5575j);
            } else if (!wfVar.f6711n && wfVar.f6701d == 2) {
                this.zzblr.zzg(zzwb);
            }
        }
        return this.zzblr.zzkv();
    }

    public void pause() {
        C0926p.m1315b("pause must be called on the main UI thread.");
        if (!(this.zzbls.zzbsu == null || this.zzbls.zzbsu.f6699b == null || !this.zzbls.zzmj())) {
            zzbv.zzlh();
            C1790xq.m8434a(this.zzbls.zzbsu.f6699b);
        }
        if (!(this.zzbls.zzbsu == null || this.zzbls.zzbsu.f6713p == null)) {
            try {
                this.zzbls.zzbsu.f6713p.mo12695d();
            } catch (RemoteException unused) {
                C1772wz.m1630e("Could not pause mediation adapter.");
            }
        }
        this.zzblu.mo12150c(this.zzbls.zzbsu);
        this.zzblr.pause();
    }

    public void resume() {
        C0926p.m1315b("resume must be called on the main UI thread.");
        afl afl = (this.zzbls.zzbsu == null || this.zzbls.zzbsu.f6699b == null) ? null : this.zzbls.zzbsu.f6699b;
        if (afl != null && this.zzbls.zzmj()) {
            zzbv.zzlh();
            C1790xq.m8435b(this.zzbls.zzbsu.f6699b);
        }
        if (!(this.zzbls.zzbsu == null || this.zzbls.zzbsu.f6713p == null)) {
            try {
                this.zzbls.zzbsu.f6713p.mo12696e();
            } catch (RemoteException unused) {
                C1772wz.m1630e("Could not resume mediation adapter.");
            }
        }
        if (afl == null || !afl.mo10334D()) {
            this.zzblr.resume();
        }
        this.zzblu.mo12151d(this.zzbls.zzbsu);
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(zzwb zzwb) {
        return super.zzc(zzwb) && !this.zzbmb;
    }

    /* access modifiers changed from: protected */
    public boolean zziu() {
        zzbv.zzlf();
        if (C1782xi.m8381a(this.zzbls.zzsp, "android.permission.INTERNET")) {
            zzbv.zzlf();
            return C1782xi.m8380a(this.zzbls.zzsp);
        }
    }

    public void zziv() {
        this.zzbmb = false;
        zzii();
        this.zzbls.zzbsw.mo13104c();
    }

    public void zziw() {
        this.zzbmb = true;
        zzik();
    }

    public final void onPause() {
        this.zzblu.mo12150c(this.zzbls.zzbsu);
    }

    public final void onResume() {
        this.zzblu.mo12151d(this.zzbls.zzbsu);
    }

    public void zzix() {
        C1772wz.m1630e("Mediated ad does not support onVideoEnd callback");
    }

    public void zziy() {
        onAdClicked();
    }

    public final void zziz() {
        zziv();
    }

    public final void zzja() {
        zzij();
    }

    public final void zzjb() {
        zziw();
    }

    public final void zzjc() {
        if (this.zzbls.zzbsu != null) {
            String str = this.zzbls.zzbsu.f6714q;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            C1772wz.m1630e(sb.toString());
        }
        zza(this.zzbls.zzbsu, true);
        zzb(this.zzbls.zzbsu, true);
        zzil();
    }

    public void zzjd() {
        recordImpression();
    }

    public final void zzd(String str, String str2) {
        onAppEvent(str, str2);
    }

    public final void zza(C1233da daVar, String str) {
        String str2;
        C1244dl dlVar = null;
        if (daVar != null) {
            try {
                str2 = daVar.mo11093b();
            } catch (RemoteException e) {
                C1772wz.m1627c("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            str2 = null;
        }
        if (!(this.zzbls.zzbtg == null || str2 == null)) {
            dlVar = this.zzbls.zzbtg.get(str2);
        }
        if (dlVar == null) {
            C1772wz.m1630e("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            dlVar.mo12502a(daVar, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C1624rm zza(com.google.android.gms.internal.ads.zzwb r59, android.os.Bundle r60, com.google.android.gms.internal.ads.C1756wj r61, int r62) {
        /*
            r58 = this;
            r0 = r58
            com.google.android.gms.ads.internal.zzbw r1 = r0.zzbls
            android.content.Context r1 = r1.zzsp
            android.content.pm.ApplicationInfo r7 = r1.getApplicationInfo()
            r1 = 0
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.Context r2 = r2.zzsp     // Catch:{ NameNotFoundException -> 0x001b }
            com.google.android.gms.common.a.b r2 = com.google.android.gms.common.p041a.C0771c.m904a(r2)     // Catch:{ NameNotFoundException -> 0x001b }
            java.lang.String r4 = r7.packageName     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.pm.PackageInfo r2 = r2.mo9540b(r4, r1)     // Catch:{ NameNotFoundException -> 0x001b }
            r8 = r2
            goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            android.content.Context r2 = r2.zzsp
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r4 = r2.getDisplayMetrics()
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            com.google.android.gms.ads.internal.zzbx r2 = r2.zzbsq
            if (r2 == 0) goto L_0x0094
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            com.google.android.gms.ads.internal.zzbx r2 = r2.zzbsq
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L_0x0094
            r2 = 2
            int[] r2 = new int[r2]
            com.google.android.gms.ads.internal.zzbw r5 = r0.zzbls
            com.google.android.gms.ads.internal.zzbx r5 = r5.zzbsq
            r5.getLocationOnScreen(r2)
            r5 = r2[r1]
            r6 = 1
            r2 = r2[r6]
            com.google.android.gms.ads.internal.zzbw r9 = r0.zzbls
            com.google.android.gms.ads.internal.zzbx r9 = r9.zzbsq
            int r9 = r9.getWidth()
            com.google.android.gms.ads.internal.zzbw r10 = r0.zzbls
            com.google.android.gms.ads.internal.zzbx r10 = r10.zzbsq
            int r10 = r10.getHeight()
            com.google.android.gms.ads.internal.zzbw r11 = r0.zzbls
            com.google.android.gms.ads.internal.zzbx r11 = r11.zzbsq
            boolean r11 = r11.isShown()
            if (r11 == 0) goto L_0x0072
            int r11 = r5 + r9
            if (r11 <= 0) goto L_0x0072
            int r11 = r2 + r10
            if (r11 <= 0) goto L_0x0072
            int r11 = r4.widthPixels
            if (r5 > r11) goto L_0x0072
            int r11 = r4.heightPixels
            if (r2 > r11) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            android.os.Bundle r11 = new android.os.Bundle
            r12 = 5
            r11.<init>(r12)
            java.lang.String r12 = "x"
            r11.putInt(r12, r5)
            java.lang.String r5 = "y"
            r11.putInt(r5, r2)
            java.lang.String r2 = "width"
            r11.putInt(r2, r9)
            java.lang.String r2 = "height"
            r11.putInt(r2, r10)
            java.lang.String r2 = "visible"
            r11.putInt(r2, r6)
            r12 = r11
            goto L_0x0095
        L_0x0094:
            r12 = 0
        L_0x0095:
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            com.google.android.gms.internal.ads.wk r5 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.wt r5 = r5.mo13134n()
            com.google.android.gms.common.util.e r6 = com.google.android.gms.ads.internal.zzbv.zzlm()
            com.google.android.gms.ads.internal.zzbw r9 = r0.zzbls
            java.lang.String r9 = r9.zzbsn
            com.google.android.gms.internal.ads.wh r5 = r5.mo13153a((com.google.android.gms.common.util.C0969e) r6, (java.lang.String) r9)
            r2.zzbsw = r5
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            com.google.android.gms.internal.ads.wh r2 = r2.zzbsw
            r14 = r59
            r2.mo13099a((com.google.android.gms.internal.ads.zzwb) r14)
            com.google.android.gms.ads.internal.zzbv.zzlf()
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            android.content.Context r2 = r2.zzsp
            com.google.android.gms.ads.internal.zzbw r5 = r0.zzbls
            com.google.android.gms.ads.internal.zzbx r5 = r5.zzbsq
            com.google.android.gms.ads.internal.zzbw r6 = r0.zzbls
            com.google.android.gms.internal.ads.zzwf r6 = r6.zzbst
            java.lang.String r20 = com.google.android.gms.internal.ads.C1782xi.m8363a((android.content.Context) r2, (android.view.View) r5, (com.google.android.gms.internal.ads.zzwf) r6)
            r5 = 0
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            com.google.android.gms.internal.ads.bsk r2 = r2.zzbtb
            if (r2 == 0) goto L_0x00e1
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls     // Catch:{ RemoteException -> 0x00dc }
            com.google.android.gms.internal.ads.bsk r2 = r2.zzbtb     // Catch:{ RemoteException -> 0x00dc }
            long r9 = r2.mo12327b()     // Catch:{ RemoteException -> 0x00dc }
            r21 = r9
            goto L_0x00e3
        L_0x00dc:
            java.lang.String r2 = "Cannot get correlation id, default to 0."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r2)
        L_0x00e1:
            r21 = r5
        L_0x00e3:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r23 = r2.toString()
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.wt r2 = r2.mo13134n()
            com.google.android.gms.ads.internal.zzbw r5 = r0.zzbls
            android.content.Context r5 = r5.zzsp
            android.os.Bundle r15 = r2.mo13152a((android.content.Context) r5, (com.google.android.gms.internal.ads.C1763wq) r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r2 = 0
        L_0x0106:
            com.google.android.gms.ads.internal.zzbw r5 = r0.zzbls
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.internal.ads.do> r5 = r5.zzbth
            int r5 = r5.size()
            if (r2 >= r5) goto L_0x0137
            com.google.android.gms.ads.internal.zzbw r5 = r0.zzbls
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.internal.ads.do> r5 = r5.zzbth
            java.lang.Object r5 = r5.keyAt(r2)
            java.lang.String r5 = (java.lang.String) r5
            r13.add(r5)
            com.google.android.gms.ads.internal.zzbw r6 = r0.zzbls
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.internal.ads.dl> r6 = r6.zzbtg
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0134
            com.google.android.gms.ads.internal.zzbw r6 = r0.zzbls
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.internal.ads.dl> r6 = r6.zzbtg
            java.lang.Object r6 = r6.get(r5)
            if (r6 == 0) goto L_0x0134
            r11.add(r5)
        L_0x0134:
            int r2 = r2 + 1
            goto L_0x0106
        L_0x0137:
            com.google.android.gms.ads.internal.zzf r2 = new com.google.android.gms.ads.internal.zzf
            r2.<init>(r0)
            com.google.android.gms.internal.ads.abg r34 = com.google.android.gms.internal.ads.C1780xg.m8354a(r2)
            com.google.android.gms.ads.internal.zzg r2 = new com.google.android.gms.ads.internal.zzg
            r2.<init>(r0)
            com.google.android.gms.internal.ads.abg r44 = com.google.android.gms.internal.ads.C1780xg.m8354a(r2)
            if (r61 == 0) goto L_0x0152
            java.lang.String r2 = r61.mo13113c()
            r35 = r2
            goto L_0x0154
        L_0x0152:
            r35 = 0
        L_0x0154:
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            java.util.List<java.lang.String> r2 = r2.zzbtt
            if (r2 == 0) goto L_0x01ac
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            java.util.List<java.lang.String> r2 = r2.zzbtt
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x01ac
            if (r8 == 0) goto L_0x0168
            int r1 = r8.versionCode
        L_0x0168:
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r2 = r2.mo13131k()
            int r2 = r2.mo13186g()
            if (r1 <= r2) goto L_0x018d
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r2 = r2.mo13131k()
            r2.mo13192m()
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r2 = r2.mo13131k()
            r2.mo13165a((int) r1)
            goto L_0x01ac
        L_0x018d:
            com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r1 = r1.mo13131k()
            org.json.JSONObject r1 = r1.mo13191l()
            if (r1 == 0) goto L_0x01ac
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            java.lang.String r2 = r2.zzbsn
            org.json.JSONArray r1 = r1.optJSONArray(r2)
            if (r1 == 0) goto L_0x01ac
            java.lang.String r1 = r1.toString()
            r46 = r1
            goto L_0x01ae
        L_0x01ac:
            r46 = 0
        L_0x01ae:
            com.google.android.gms.internal.ads.rm r1 = new com.google.android.gms.internal.ads.rm
            r2 = r1
            com.google.android.gms.ads.internal.zzbw r5 = r0.zzbls
            com.google.android.gms.internal.ads.zzwf r5 = r5.zzbst
            com.google.android.gms.ads.internal.zzbw r6 = r0.zzbls
            java.lang.String r6 = r6.zzbsn
            com.google.android.gms.ads.internal.zzbw r9 = r0.zzbls
            com.google.android.gms.internal.ads.wh r9 = r9.zzbsw
            java.lang.String r9 = r9.mo13106e()
            java.lang.String r10 = com.google.android.gms.internal.ads.bre.m6322f()
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            com.google.android.gms.internal.ads.zzbbi r3 = r3.zzbsp
            r47 = r11
            r11 = r3
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            java.util.List<java.lang.String> r3 = r3.zzbtt
            r48 = r13
            r13 = r3
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r3 = r3.mo13131k()
            boolean r16 = r3.mo13170a()
            int r3 = r4.widthPixels
            r17 = r3
            int r3 = r4.heightPixels
            r18 = r3
            float r3 = r4.density
            r19 = r3
            java.util.List r24 = com.google.android.gms.internal.ads.C1557p.m7740a()
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            java.lang.String r3 = r3.zzbsm
            r25 = r3
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            com.google.android.gms.internal.ads.zzacp r3 = r3.zzbti
            r26 = r3
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            java.lang.String r27 = r3.zzml()
            com.google.android.gms.internal.ads.yc r3 = com.google.android.gms.ads.internal.zzbv.zzlk()
            float r28 = r3.mo13244a()
            com.google.android.gms.internal.ads.yc r3 = com.google.android.gms.ads.internal.zzbv.zzlk()
            boolean r29 = r3.mo13247b()
            com.google.android.gms.ads.internal.zzbv.zzlf()
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            android.content.Context r3 = r3.zzsp
            int r30 = com.google.android.gms.internal.ads.C1782xi.m8406j(r3)
            com.google.android.gms.ads.internal.zzbv.zzlf()
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            com.google.android.gms.ads.internal.zzbx r3 = r3.zzbsq
            int r31 = com.google.android.gms.internal.ads.C1782xi.m8394d((android.view.View) r3)
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            android.content.Context r3 = r3.zzsp
            boolean r3 = r3 instanceof android.app.Activity
            r32 = r3
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r3 = r3.mo13131k()
            boolean r33 = r3.mo13185f()
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.ads.internal.zzbv.zzlj()
            boolean r36 = r3.mo13123c()
            com.google.android.gms.internal.ads.aen r3 = com.google.android.gms.ads.internal.zzbv.zzmd()
            int r37 = r3.mo10284a()
            com.google.android.gms.ads.internal.zzbv.zzlf()
            android.os.Bundle r38 = com.google.android.gms.internal.ads.C1782xi.m8389c()
            com.google.android.gms.internal.ads.yl r3 = com.google.android.gms.ads.internal.zzbv.zzlp()
            java.lang.String r39 = r3.mo13265a()
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            com.google.android.gms.internal.ads.zzyv r3 = r3.zzbtl
            r40 = r3
            com.google.android.gms.internal.ads.yl r3 = com.google.android.gms.ads.internal.zzbv.zzlp()
            boolean r41 = r3.mo13269b()
            com.google.android.gms.internal.ads.gu r3 = com.google.android.gms.internal.ads.C1335gu.m6945a()
            android.os.Bundle r42 = r3.mo12580j()
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r3 = r3.mo13131k()
            com.google.android.gms.ads.internal.zzbw r4 = r0.zzbls
            java.lang.String r4 = r4.zzbsn
            boolean r43 = r3.mo13183e(r4)
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            java.util.List<java.lang.Integer> r3 = r3.zzbtn
            r45 = r3
            com.google.android.gms.ads.internal.zzbw r3 = r0.zzbls
            android.content.Context r3 = r3.zzsp
            com.google.android.gms.common.a.b r3 = com.google.android.gms.common.p041a.C0771c.m904a(r3)
            boolean r49 = r3.mo9537a()
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.ads.internal.zzbv.zzlj()
            boolean r50 = r3.mo13124d()
            com.google.android.gms.ads.internal.zzbv.zzlh()
            boolean r51 = com.google.android.gms.internal.ads.C1790xq.m8436e()
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.abg r3 = r3.mo13133m()
            r56 = r1
            r57 = r2
            r1 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r14 = 0
            java.lang.Object r1 = com.google.android.gms.internal.ads.aau.m1652a(r3, r14, (long) r1, (java.util.concurrent.TimeUnit) r4)
            r52 = r1
            java.util.ArrayList r52 = (java.util.ArrayList) r52
            com.google.android.gms.internal.ads.xi r1 = com.google.android.gms.ads.internal.zzbv.zzlf()
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            android.content.Context r2 = r2.zzsp
            java.lang.String r53 = r1.mo13215m(r2)
            com.google.android.gms.ads.internal.zzbw r1 = r0.zzbls
            com.google.android.gms.internal.ads.zzafz r1 = r1.zzbtk
            r54 = r1
            com.google.android.gms.internal.ads.xi r1 = com.google.android.gms.ads.internal.zzbv.zzlf()
            com.google.android.gms.ads.internal.zzbw r2 = r0.zzbls
            android.content.Context r2 = r2.zzsp
            android.os.Bundle r55 = r1.mo13216n(r2)
            r3 = r12
            r4 = r59
            r12 = r15
            r14 = r48
            r15 = r60
            r48 = r62
            r2 = r57
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            return r56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzc.zza(com.google.android.gms.internal.ads.zzwb, android.os.Bundle, com.google.android.gms.internal.ads.wj, int):com.google.android.gms.internal.ads.rm");
    }

    public final void recordImpression() {
        zza(this.zzbls.zzbsu, false);
    }

    /* access modifiers changed from: protected */
    public void zza(@Nullable C1752wf wfVar, boolean z) {
        if (wfVar == null) {
            C1772wz.m1630e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (wfVar == null) {
            C1772wz.m1630e("Ad state was null when trying to ping impression URLs.");
        } else {
            C1772wz.m1624b("Pinging Impression URLs.");
            if (this.zzbls.zzbsw != null) {
                this.zzbls.zzbsw.mo13097a();
            }
            wfVar.f6688K.mo12285a(boz.C1142a.C1144b.AD_IMPRESSION);
            if (wfVar.f6702e != null && !wfVar.f6681D) {
                zzbv.zzlf();
                C1782xi.m8373a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, zza(wfVar.f6702e, wfVar.f6693P));
                wfVar.f6681D = true;
            }
        }
        if (!wfVar.f6683F || z) {
            if (!(wfVar.f6715r == null || wfVar.f6715r.f5569d == null)) {
                zzbv.zzlz();
                C1429kg.m7186a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, wfVar, this.zzbls.zzbsn, z, zza(wfVar.f6715r.f5569d, wfVar.f6693P));
            }
            if (!(wfVar.f6712o == null || wfVar.f6712o.f5551g == null)) {
                zzbv.zzlz();
                C1429kg.m7186a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, wfVar, this.zzbls.zzbsn, z, wfVar.f6712o.f5551g);
            }
            wfVar.f6683F = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb(@Nullable C1752wf wfVar, boolean z) {
        if (wfVar != null) {
            if (!(wfVar == null || wfVar.f6703f == null || wfVar.f6682E)) {
                zzbv.zzlf();
                C1782xi.m8373a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, zzc(wfVar.f6703f));
                wfVar.f6682E = true;
            }
            if (!wfVar.f6684G || z) {
                if (!(wfVar.f6715r == null || wfVar.f6715r.f5570e == null)) {
                    zzbv.zzlz();
                    C1429kg.m7186a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, wfVar, this.zzbls.zzbsn, z, zzc(wfVar.f6715r.f5570e));
                }
                if (!(wfVar.f6712o == null || wfVar.f6712o.f5552h == null)) {
                    zzbv.zzlz();
                    C1429kg.m7186a(this.zzbls.zzsp, this.zzbls.zzbsp.f7135a, wfVar, this.zzbls.zzbsn, z, wfVar.f6712o.f5552h);
                }
                wfVar.f6684G = true;
            }
        }
    }

    @Nullable
    public final String getMediationAdapterClassName() {
        if (this.zzbls.zzbsu == null) {
            return null;
        }
        return this.zzbls.zzbsu.f6714q;
    }

    @Nullable
    public final String zzje() {
        if (this.zzbls.zzbsu == null) {
            return null;
        }
        return zzc(this.zzbls.zzbsu);
    }

    @Nullable
    static String zzc(C1752wf wfVar) {
        if (wfVar == null) {
            return null;
        }
        String str = wfVar.f6714q;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && wfVar.f6712o != null) {
            try {
                return new JSONObject(wfVar.f6712o.f5555k).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    public void showInterstitial() {
        C1772wz.m1630e("showInterstitial is not supported for current ad type");
    }

    public final void zzjf() {
        Executor executor = abl.f1313a;
        zzbl zzbl = this.zzblr;
        zzbl.getClass();
        executor.execute(zzd.zza(zzbl));
    }

    public final void zzjg() {
        Executor executor = abl.f1313a;
        zzbl zzbl = this.zzblr;
        zzbl.getClass();
        executor.execute(zze.zza(zzbl));
    }
}
