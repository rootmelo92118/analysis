package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.p034v4.util.SimpleArrayMap;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1238df;
import com.google.android.gms.internal.ads.C1241di;
import com.google.android.gms.internal.ads.C1244dl;
import com.google.android.gms.internal.ads.C1247do;
import com.google.android.gms.internal.ads.C1250dr;
import com.google.android.gms.internal.ads.C1253du;
import com.google.android.gms.internal.ads.C1296fi;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.brl;
import com.google.android.gms.internal.ads.brp;
import com.google.android.gms.internal.ads.bsk;
import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzah extends brp {
    private final Context mContext;
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    private final zzv zzbly;
    private final C1437ko zzbma;
    private final brl zzbnn;
    @Nullable
    private final C1238df zzbno;
    @Nullable
    private final C1253du zzbnp;
    @Nullable
    private final C1296fi zzbnq;
    @Nullable
    private final C1241di zzbnr;
    @Nullable
    private final C1250dr zzbns;
    @Nullable
    private final zzwf zzbnt;
    @Nullable
    private final PublisherAdViewOptions zzbnu;
    private final SimpleArrayMap<String, C1247do> zzbnv;
    private final SimpleArrayMap<String, C1244dl> zzbnw;
    private final zzacp zzbnx;
    private final zzafz zzbny;
    private final bsk zzbnz;
    private final String zzboa;
    private final zzbbi zzbob;
    @Nullable
    private WeakReference<zzc> zzboc;

    zzah(Context context, String str, C1437ko koVar, zzbbi zzbbi, brl brl, C1238df dfVar, C1253du duVar, C1296fi fiVar, C1241di diVar, SimpleArrayMap<String, C1247do> simpleArrayMap, SimpleArrayMap<String, C1244dl> simpleArrayMap2, zzacp zzacp, zzafz zzafz, bsk bsk, zzv zzv, C1250dr drVar, zzwf zzwf, PublisherAdViewOptions publisherAdViewOptions) {
        this.mContext = context;
        this.zzboa = str;
        this.zzbma = koVar;
        this.zzbob = zzbbi;
        this.zzbnn = brl;
        this.zzbnr = diVar;
        this.zzbno = dfVar;
        this.zzbnp = duVar;
        this.zzbnq = fiVar;
        this.zzbnv = simpleArrayMap;
        this.zzbnw = simpleArrayMap2;
        this.zzbnx = zzacp;
        this.zzbny = zzafz;
        this.zzbnz = bsk;
        this.zzbly = zzv;
        this.zzbns = drVar;
        this.zzbnt = zzwf;
        this.zzbnu = publisherAdViewOptions;
        C1557p.m7741a(this.mContext);
    }

    public final void zzd(zzwb zzwb) {
        runOnUiThread(new zzai(this, zzwb));
    }

    public final void zza(zzwb zzwb, int i) {
        if (i > 0) {
            runOnUiThread(new zzaj(this, zzwb, i));
            return;
        }
        throw new IllegalArgumentException("Number of ads has to be more than 0");
    }

    private final void zzbr(int i) {
        if (this.zzbnn != null) {
            try {
                this.zzbnn.mo12297a(0);
            } catch (RemoteException e) {
                C1772wz.m1627c("Failed calling onAdFailedToLoad.", e);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zze(zzwb zzwb) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5953bH)).booleanValue() || this.zzbnp == null) {
            zzp zzp = new zzp(this.mContext, this.zzbly, this.zzbnt, this.zzboa, this.zzbma, this.zzbob);
            this.zzboc = new WeakReference<>(zzp);
            C1250dr drVar = this.zzbns;
            C0926p.m1315b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
            zzp.zzbls.zzbtm = drVar;
            if (this.zzbnu != null) {
                if (this.zzbnu.zzib() != null) {
                    zzp.zza(this.zzbnu.zzib());
                }
                zzp.setManualImpressionsEnabled(this.zzbnu.getManualImpressionsEnabled());
            }
            C1238df dfVar = this.zzbno;
            C0926p.m1315b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            zzp.zzbls.zzbtc = dfVar;
            C1253du duVar = this.zzbnp;
            C0926p.m1315b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            zzp.zzbls.zzbte = duVar;
            C1241di diVar = this.zzbnr;
            C0926p.m1315b("setOnContentAdLoadedListener must be called on the main UI thread.");
            zzp.zzbls.zzbtd = diVar;
            SimpleArrayMap<String, C1247do> simpleArrayMap = this.zzbnv;
            C0926p.m1315b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            zzp.zzbls.zzbth = simpleArrayMap;
            SimpleArrayMap<String, C1244dl> simpleArrayMap2 = this.zzbnw;
            C0926p.m1315b("setOnCustomClickListener must be called on the main UI thread.");
            zzp.zzbls.zzbtg = simpleArrayMap2;
            zzacp zzacp = this.zzbnx;
            C0926p.m1315b("setNativeAdOptions must be called on the main UI thread.");
            zzp.zzbls.zzbti = zzacp;
            zzp.zzd(zzkc());
            zzp.zza(this.zzbnn);
            zzp.zza(this.zzbnz);
            ArrayList arrayList = new ArrayList();
            if (zzkb()) {
                arrayList.add(1);
            }
            if (this.zzbns != null) {
                arrayList.add(2);
            }
            zzp.zze(arrayList);
            if (zzkb()) {
                zzwb.f7273c.putBoolean("ina", true);
            }
            if (this.zzbns != null) {
                zzwb.f7273c.putBoolean("iba", true);
            }
            zzp.zzb(zzwb);
            return;
        }
        zzbr(0);
    }

    /* access modifiers changed from: private */
    public final void zzb(zzwb zzwb, int i) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5953bH)).booleanValue() || this.zzbnp == null) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5954bI)).booleanValue() || this.zzbnq == null) {
                zzbb zzbb = new zzbb(this.mContext, this.zzbly, zzwf.m8830a(this.mContext), this.zzboa, this.zzbma, this.zzbob);
                this.zzboc = new WeakReference<>(zzbb);
                C1238df dfVar = this.zzbno;
                C0926p.m1315b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
                zzbb.zzbls.zzbtc = dfVar;
                C1253du duVar = this.zzbnp;
                C0926p.m1315b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
                zzbb.zzbls.zzbte = duVar;
                C1296fi fiVar = this.zzbnq;
                C0926p.m1315b("#008 Must be called on the main UI thread.: setInstreamAdLoadCallback");
                zzbb.zzbls.zzbtf = fiVar;
                C1241di diVar = this.zzbnr;
                C0926p.m1315b("setOnContentAdLoadedListener must be called on the main UI thread.");
                zzbb.zzbls.zzbtd = diVar;
                SimpleArrayMap<String, C1247do> simpleArrayMap = this.zzbnv;
                C0926p.m1315b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
                zzbb.zzbls.zzbth = simpleArrayMap;
                zzbb.zza(this.zzbnn);
                SimpleArrayMap<String, C1244dl> simpleArrayMap2 = this.zzbnw;
                C0926p.m1315b("setOnCustomClickListener must be called on the main UI thread.");
                zzbb.zzbls.zzbtg = simpleArrayMap2;
                zzbb.zzd(zzkc());
                zzacp zzacp = this.zzbnx;
                C0926p.m1315b("setNativeAdOptions must be called on the main UI thread.");
                zzbb.zzbls.zzbti = zzacp;
                zzafz zzafz = this.zzbny;
                C0926p.m1315b("#008 Must be called on the main UI thread.: setInstreamAdConfiguration");
                zzbb.zzbls.zzbtk = zzafz;
                zzbb.zza(this.zzbnz);
                zzbb.zzbs(i);
                zzbb.zzb(zzwb);
                return;
            }
            zzbr(0);
            return;
        }
        zzbr(0);
    }

    /* access modifiers changed from: private */
    public final boolean zzka() {
        return this.zzbnq == null && this.zzbns != null;
    }

    private final boolean zzkb() {
        if (this.zzbno == null && this.zzbnr == null && this.zzbnp == null) {
            return this.zzbnv != null && this.zzbnv.size() > 0;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMediationAdapterClassName() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzc> r1 = r3.zzboc     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzc> r1 = r3.zzboc     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.zzc r1 = (com.google.android.gms.ads.internal.zzc) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.getMediationAdapterClassName()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzah.getMediationAdapterClassName():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzje() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzc> r1 = r3.zzboc     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzc> r1 = r3.zzboc     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.zzc r1 = (com.google.android.gms.ads.internal.zzc) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.zzje()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzah.zzje():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isLoading() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzc> r1 = r3.zzboc     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.zzc> r1 = r3.zzboc     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.zzc r1 = (com.google.android.gms.ads.internal.zzc) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r2 = r1.isLoading()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzah.isLoading():boolean");
    }

    private final List<String> zzkc() {
        ArrayList arrayList = new ArrayList();
        if (this.zzbnr != null) {
            arrayList.add("1");
        }
        if (this.zzbno != null) {
            arrayList.add("2");
        }
        if (this.zzbnp != null) {
            arrayList.add("6");
        }
        if (this.zzbnv.size() > 0) {
            arrayList.add("3");
        }
        if (this.zzbnq != null) {
            arrayList.add("2");
            arrayList.add("1");
        }
        return arrayList;
    }

    private static void runOnUiThread(Runnable runnable) {
        C1782xi.f6838a.post(runnable);
    }
}
