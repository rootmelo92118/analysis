package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.p034v4.util.SimpleArrayMap;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.ads.C1026aj;
import com.google.android.gms.internal.ads.C1238df;
import com.google.android.gms.internal.ads.C1241di;
import com.google.android.gms.internal.ads.C1244dl;
import com.google.android.gms.internal.ads.C1247do;
import com.google.android.gms.internal.ads.C1250dr;
import com.google.android.gms.internal.ads.C1253du;
import com.google.android.gms.internal.ads.C1296fi;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1686tu;
import com.google.android.gms.internal.ads.C1695uc;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.C1754wh;
import com.google.android.gms.internal.ads.C1765ws;
import com.google.android.gms.internal.ads.C1768wv;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1804yd;
import com.google.android.gms.internal.ads.C1840zm;
import com.google.android.gms.internal.ads.C1851zx;
import com.google.android.gms.internal.ads.awu;
import com.google.android.gms.internal.ads.awy;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.brh;
import com.google.android.gms.internal.ads.brl;
import com.google.android.gms.internal.ads.bsb;
import com.google.android.gms.internal.ads.bse;
import com.google.android.gms.internal.ads.bsk;
import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzw;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzbw implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    boolean zzbpa;
    final String zzbsm;
    public String zzbsn;
    final awy zzbso;
    public final zzbbi zzbsp;
    @Nullable
    zzbx zzbsq;
    @Nullable
    public C1768wv zzbsr;
    @Nullable
    public C1804yd zzbss;
    public zzwf zzbst;
    @Nullable
    public C1752wf zzbsu;
    public C1753wg zzbsv;
    @Nullable
    public C1754wh zzbsw;
    @Nullable
    brh zzbsx;
    @Nullable
    brl zzbsy;
    @Nullable
    bse zzbsz;
    @Nullable
    bsb zzbta;
    @Nullable
    bsk zzbtb;
    @Nullable
    C1238df zzbtc;
    @Nullable
    C1241di zzbtd;
    @Nullable
    C1253du zzbte;
    @Nullable
    C1296fi zzbtf;
    SimpleArrayMap<String, C1244dl> zzbtg;
    SimpleArrayMap<String, C1247do> zzbth;
    zzacp zzbti;
    @Nullable
    zzzw zzbtj;
    @Nullable
    zzafz zzbtk;
    @Nullable
    zzyv zzbtl;
    @Nullable
    C1250dr zzbtm;
    @Nullable
    List<Integer> zzbtn;
    @Nullable
    C1026aj zzbto;
    @Nullable
    C1695uc zzbtp;
    @Nullable
    C1686tu zzbtq;
    @Nullable
    public String zzbtr;
    @Nullable
    public String zzbts;
    @Nullable
    List<String> zzbtt;
    @Nullable
    public C1765ws zzbtu;
    @Nullable
    View zzbtv;
    public int zzbtw;
    private HashSet<C1754wh> zzbtx;
    private int zzbty;
    private int zzbtz;
    private C1840zm zzbua;
    private boolean zzbub;
    private boolean zzbuc;
    private boolean zzbud;
    public final Context zzsp;

    public zzbw(Context context, zzwf zzwf, String str, zzbbi zzbbi) {
        this(context, zzwf, str, zzbbi, (awy) null);
    }

    private zzbw(Context context, zzwf zzwf, String str, zzbbi zzbbi, awy awy) {
        this.zzbtu = null;
        this.zzbtv = null;
        this.zzbtw = 0;
        this.zzbpa = false;
        this.zzbtx = null;
        this.zzbty = -1;
        this.zzbtz = -1;
        this.zzbub = true;
        this.zzbuc = true;
        this.zzbud = false;
        C1557p.m7741a(context);
        if (zzbv.zzlj().mo13116a() != null) {
            List<String> b = C1557p.m7743b();
            if (zzbbi.f7136b != 0) {
                b.add(Integer.toString(zzbbi.f7136b));
            }
            zzbv.zzlj().mo13116a().mo12935a(b);
        }
        this.zzbsm = UUID.randomUUID().toString();
        if (zzwf.f7295d || zzwf.f7299h) {
            this.zzbsq = null;
        } else {
            this.zzbsq = new zzbx(context, str, zzbbi.f7135a, this, this);
            this.zzbsq.setMinimumWidth(zzwf.f7297f);
            this.zzbsq.setMinimumHeight(zzwf.f7294c);
            this.zzbsq.setVisibility(4);
        }
        this.zzbst = zzwf;
        this.zzbsn = str;
        this.zzsp = context;
        this.zzbsp = zzbbi;
        this.zzbso = new awy(new zzag(this));
        this.zzbua = new C1840zm(200);
        this.zzbth = new SimpleArrayMap<>();
    }

    /* access modifiers changed from: package-private */
    public final void zzj(View view) {
        awu a;
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5979bh)).booleanValue() && (a = this.zzbso.mo11352a()) != null) {
            a.zzb(view);
        }
    }

    public final void zza(HashSet<C1754wh> hashSet) {
        this.zzbtx = hashSet;
    }

    public final HashSet<C1754wh> zzmg() {
        return this.zzbtx;
    }

    public final void zzmh() {
        if (this.zzbsu != null && this.zzbsu.f6699b != null) {
            this.zzbsu.f6699b.destroy();
        }
    }

    public final void zzmi() {
        if (this.zzbsu != null && this.zzbsu.f6713p != null) {
            try {
                this.zzbsu.f6713p.mo12694c();
            } catch (RemoteException unused) {
                C1772wz.m1630e("Could not destroy mediation adapter.");
            }
        }
    }

    public final boolean zzmj() {
        return this.zzbtw == 0;
    }

    public final boolean zzmk() {
        return this.zzbtw == 1;
    }

    public final void onGlobalLayout() {
        zzq(false);
    }

    public final void onScrollChanged() {
        zzq(true);
        this.zzbud = true;
    }

    private final void zzq(boolean z) {
        View findViewById;
        if (this.zzbsq != null && this.zzbsu != null && this.zzbsu.f6699b != null && this.zzbsu.f6699b.mo10388u() != null) {
            if (!z || this.zzbua.mo13287a()) {
                if (this.zzbsu.f6699b.mo10388u().mo10413b()) {
                    int[] iArr = new int[2];
                    this.zzbsq.getLocationOnScreen(iArr);
                    bre.m6317a();
                    int b = C1851zx.m8592b(this.zzsp, iArr[0]);
                    bre.m6317a();
                    int b2 = C1851zx.m8592b(this.zzsp, iArr[1]);
                    if (!(b == this.zzbty && b2 == this.zzbtz)) {
                        this.zzbty = b;
                        this.zzbtz = b2;
                        this.zzbsu.f6699b.mo10388u().mo10397a(this.zzbty, this.zzbtz, !z);
                    }
                }
                if (this.zzbsq != null && (findViewById = this.zzbsq.getRootView().findViewById(16908290)) != null) {
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    this.zzbsq.getGlobalVisibleRect(rect);
                    findViewById.getGlobalVisibleRect(rect2);
                    if (rect.top != rect2.top) {
                        this.zzbub = false;
                    }
                    if (rect.bottom != rect2.bottom) {
                        this.zzbuc = false;
                    }
                }
            }
        }
    }

    public final String zzml() {
        if (this.zzbub && this.zzbuc) {
            return "";
        }
        if (this.zzbub) {
            return this.zzbud ? "top-scrollable" : "top-locked";
        }
        if (this.zzbuc) {
            return this.zzbud ? "bottom-scrollable" : "bottom-locked";
        }
        return "";
    }

    public final void zzr(boolean z) {
        if (!(this.zzbtw != 0 || this.zzbsu == null || this.zzbsu.f6699b == null)) {
            this.zzbsu.f6699b.stopLoading();
        }
        if (this.zzbsr != null) {
            this.zzbsr.cancel();
        }
        if (this.zzbss != null) {
            this.zzbss.cancel();
        }
        if (z) {
            this.zzbsu = null;
        }
    }
}
