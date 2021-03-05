package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.p034v4.util.SimpleArrayMap;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.C1238df;
import com.google.android.gms.internal.ads.C1241di;
import com.google.android.gms.internal.ads.C1244dl;
import com.google.android.gms.internal.ads.C1247do;
import com.google.android.gms.internal.ads.C1250dr;
import com.google.android.gms.internal.ads.C1253du;
import com.google.android.gms.internal.ads.C1296fi;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.brl;
import com.google.android.gms.internal.ads.bro;
import com.google.android.gms.internal.ads.brs;
import com.google.android.gms.internal.ads.bsk;
import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwf;

@C1598qn
public final class zzak extends brs {
    private final Context mContext;
    private final zzv zzbly;
    private final C1437ko zzbma;
    private brl zzbnn;
    private C1296fi zzbnq;
    private zzwf zzbnt;
    private PublisherAdViewOptions zzbnu;
    private zzacp zzbnx;
    private zzafz zzbny;
    private bsk zzbnz;
    private final String zzboa;
    private final zzbbi zzbob;
    private C1238df zzbog;
    private C1253du zzboh;
    private C1241di zzboi;
    private SimpleArrayMap<String, C1244dl> zzboj = new SimpleArrayMap<>();
    private SimpleArrayMap<String, C1247do> zzbok = new SimpleArrayMap<>();
    private C1250dr zzbol;

    public zzak(Context context, String str, C1437ko koVar, zzbbi zzbbi, zzv zzv) {
        this.mContext = context;
        this.zzboa = str;
        this.zzbma = koVar;
        this.zzbob = zzbbi;
        this.zzbly = zzv;
    }

    public final bro zzkd() {
        return new zzah(this.mContext, this.zzboa, this.zzbma, this.zzbob, this.zzbnn, this.zzbog, this.zzboh, this.zzbnq, this.zzboi, this.zzbok, this.zzboj, this.zzbnx, this.zzbny, this.zzbnz, this.zzbly, this.zzbol, this.zzbnt, this.zzbnu);
    }

    public final void zzb(brl brl) {
        this.zzbnn = brl;
    }

    public final void zza(zzacp zzacp) {
        this.zzbnx = zzacp;
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzbnu = publisherAdViewOptions;
    }

    public final void zzb(bsk bsk) {
        this.zzbnz = bsk;
    }

    public final void zza(zzafz zzafz) {
        this.zzbny = zzafz;
    }

    public final void zza(C1241di diVar) {
        this.zzboi = diVar;
    }

    public final void zza(C1238df dfVar) {
        this.zzbog = dfVar;
    }

    public final void zza(C1253du duVar) {
        this.zzboh = duVar;
    }

    public final void zza(C1296fi fiVar) {
        this.zzbnq = fiVar;
    }

    public final void zza(String str, C1247do doVar, C1244dl dlVar) {
        if (!TextUtils.isEmpty(str)) {
            this.zzbok.put(str, doVar);
            this.zzboj.put(str, dlVar);
            return;
        }
        throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }

    public final void zza(C1250dr drVar, zzwf zzwf) {
        this.zzbol = drVar;
        this.zzbnt = zzwf;
    }
}
