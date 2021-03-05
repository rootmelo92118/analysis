package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.concurrent.atomic.AtomicBoolean;

@C1598qn
public final class btk {

    /* renamed from: a */
    private final C1436kn f5240a;

    /* renamed from: b */
    private final bqp f5241b;

    /* renamed from: c */
    private final AtomicBoolean f5242c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final VideoController f5243d;

    /* renamed from: e */
    private final brg f5244e;

    /* renamed from: f */
    private bqf f5245f;

    /* renamed from: g */
    private AdListener f5246g;

    /* renamed from: h */
    private AdSize[] f5247h;

    /* renamed from: i */
    private AppEventListener f5248i;

    /* renamed from: j */
    private Correlator f5249j;

    /* renamed from: k */
    private brw f5250k;

    /* renamed from: l */
    private OnCustomRenderedAdLoadedListener f5251l;

    /* renamed from: m */
    private VideoOptions f5252m;

    /* renamed from: n */
    private String f5253n;

    /* renamed from: o */
    private ViewGroup f5254o;

    /* renamed from: p */
    private int f5255p;

    /* renamed from: q */
    private boolean f5256q;

    /* renamed from: a */
    private static boolean m6473a(int i) {
        return i == 1;
    }

    public btk(ViewGroup viewGroup) {
        this(viewGroup, (AttributeSet) null, false, bqp.f5123a, 0);
    }

    public btk(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, bqp.f5123a, i);
    }

    public btk(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, bqp.f5123a, 0);
    }

    public btk(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, bqp.f5123a, i);
    }

    private btk(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, bqp bqp, brw brw, int i) {
        this.f5240a = new C1436kn();
        this.f5243d = new VideoController();
        this.f5244e = new btm(this);
        this.f5254o = viewGroup;
        this.f5241b = bqp;
        this.f5250k = null;
        this.f5242c = new AtomicBoolean(false);
        this.f5255p = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                bqs bqs = new bqs(context, attributeSet);
                this.f5247h = bqs.mo12317a(z);
                this.f5253n = bqs.mo12316a();
                if (viewGroup.isInEditMode()) {
                    C1851zx a = bre.m6317a();
                    AdSize adSize = this.f5247h[0];
                    int i2 = this.f5255p;
                    zzwf zzwf = new zzwf(context, adSize);
                    zzwf.f7301j = m6473a(i2);
                    a.mo13302a(viewGroup, zzwf, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                bre.m6317a().mo13303a(viewGroup, new zzwf(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private btk(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, bqp bqp, int i) {
        this(viewGroup, attributeSet, z, bqp, (brw) null, i);
    }

    /* renamed from: a */
    public final void mo12397a() {
        try {
            if (this.f5250k != null) {
                this.f5250k.destroy();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final AdListener mo12408b() {
        return this.f5246g;
    }

    /* renamed from: c */
    public final AdSize mo12410c() {
        zzwf zzif;
        try {
            if (!(this.f5250k == null || (zzif = this.f5250k.zzif()) == null)) {
                return zzif.mo13458b();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
        if (this.f5247h != null) {
            return this.f5247h[0];
        }
        return null;
    }

    /* renamed from: d */
    public final AdSize[] mo12411d() {
        return this.f5247h;
    }

    /* renamed from: e */
    public final String mo12412e() {
        if (this.f5253n == null && this.f5250k != null) {
            try {
                this.f5253n = this.f5250k.getAdUnitId();
            } catch (RemoteException e) {
                aai.m1629d("#007 Could not call remote method.", e);
            }
        }
        return this.f5253n;
    }

    /* renamed from: f */
    public final AppEventListener mo12413f() {
        return this.f5248i;
    }

    /* renamed from: g */
    public final OnCustomRenderedAdLoadedListener mo12414g() {
        return this.f5251l;
    }

    /* renamed from: a */
    public final void mo12403a(bti bti) {
        brw brw;
        try {
            if (this.f5250k == null) {
                if ((this.f5247h == null || this.f5253n == null) && this.f5250k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f5254o.getContext();
                zzwf a = m6472a(context, this.f5247h, this.f5255p);
                if ("search_v2".equals(a.f7292a)) {
                    brw = (brw) new bqw(bre.m6318b(), context, a, this.f5253n).mo12325a(context, false);
                } else {
                    brw = (brw) new bqu(bre.m6318b(), context, a, this.f5253n, this.f5240a).mo12325a(context, false);
                }
                this.f5250k = brw;
                this.f5250k.zza((brl) new bqi(this.f5244e));
                if (this.f5245f != null) {
                    this.f5250k.zza((brh) new bqg(this.f5245f));
                }
                if (this.f5248i != null) {
                    this.f5250k.zza((bse) new bqr(this.f5248i));
                }
                if (this.f5251l != null) {
                    this.f5250k.zza((C1026aj) new C1049am(this.f5251l));
                }
                if (this.f5249j != null) {
                    this.f5250k.zza((bsk) this.f5249j.zzba());
                }
                if (this.f5252m != null) {
                    this.f5250k.zza(new zzzw(this.f5252m));
                }
                this.f5250k.setManualImpressionsEnabled(this.f5256q);
                try {
                    C0719a zzie = this.f5250k.zzie();
                    if (zzie != null) {
                        this.f5254o.addView((View) C0722b.m770a(zzie));
                    }
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
            if (this.f5250k.zzb(bqp.m6264a(this.f5254o.getContext(), bti))) {
                this.f5240a.mo12678a(bti.mo12370j());
            }
        } catch (RemoteException e2) {
            aai.m1629d("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: h */
    public final void mo12415h() {
        try {
            if (this.f5250k != null) {
                this.f5250k.pause();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo12416i() {
        if (!this.f5242c.getAndSet(true)) {
            try {
                if (this.f5250k != null) {
                    this.f5250k.zzih();
                }
            } catch (RemoteException e) {
                aai.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: j */
    public final void mo12417j() {
        try {
            if (this.f5250k != null) {
                this.f5250k.resume();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12398a(AdListener adListener) {
        this.f5246g = adListener;
        this.f5244e.mo12328a(adListener);
    }

    /* renamed from: a */
    public final void mo12402a(bqf bqf) {
        try {
            this.f5245f = bqf;
            if (this.f5250k != null) {
                this.f5250k.zza((brh) bqf != null ? new bqg(bqf) : null);
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12406a(AdSize... adSizeArr) {
        if (this.f5247h == null) {
            mo12409b(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: b */
    public final void mo12409b(AdSize... adSizeArr) {
        this.f5247h = adSizeArr;
        try {
            if (this.f5250k != null) {
                this.f5250k.zza(m6472a(this.f5254o.getContext(), this.f5247h, this.f5255p));
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
        this.f5254o.requestLayout();
    }

    /* renamed from: a */
    public final void mo12404a(String str) {
        if (this.f5253n == null) {
            this.f5253n = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: a */
    public final void mo12401a(AppEventListener appEventListener) {
        try {
            this.f5248i = appEventListener;
            if (this.f5250k != null) {
                this.f5250k.zza((bse) appEventListener != null ? new bqr(appEventListener) : null);
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f5251l = onCustomRenderedAdLoadedListener;
        try {
            if (this.f5250k != null) {
                this.f5250k.zza((C1026aj) onCustomRenderedAdLoadedListener != null ? new C1049am(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12405a(boolean z) {
        this.f5256q = z;
        try {
            if (this.f5250k != null) {
                this.f5250k.setManualImpressionsEnabled(this.f5256q);
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12399a(Correlator correlator) {
        this.f5249j = correlator;
        try {
            if (this.f5250k != null) {
                this.f5250k.zza((bsk) this.f5249j == null ? null : this.f5249j.zzba());
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: k */
    public final String mo12418k() {
        try {
            if (this.f5250k != null) {
                return this.f5250k.zzje();
            }
            return null;
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: l */
    public final boolean mo12419l() {
        try {
            if (this.f5250k != null) {
                return this.f5250k.isLoading();
            }
            return false;
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            return false;
        }
    }

    /* renamed from: m */
    public final VideoController mo12420m() {
        return this.f5243d;
    }

    /* renamed from: n */
    public final btb mo12421n() {
        if (this.f5250k == null) {
            return null;
        }
        try {
            return this.f5250k.getVideoController();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo12400a(VideoOptions videoOptions) {
        zzzw zzzw;
        this.f5252m = videoOptions;
        try {
            if (this.f5250k != null) {
                brw brw = this.f5250k;
                if (videoOptions == null) {
                    zzzw = null;
                } else {
                    zzzw = new zzzw(videoOptions);
                }
                brw.zza(zzzw);
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: o */
    public final VideoOptions mo12422o() {
        return this.f5252m;
    }

    /* renamed from: a */
    public final boolean mo12407a(brw brw) {
        if (brw == null) {
            return false;
        }
        try {
            C0719a zzie = brw.zzie();
            if (zzie == null || ((View) C0722b.m770a(zzie)).getParent() != null) {
                return false;
            }
            this.f5254o.addView((View) C0722b.m770a(zzie));
            this.f5250k = brw;
            return true;
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            return false;
        }
    }

    /* renamed from: a */
    private static zzwf m6472a(Context context, AdSize[] adSizeArr, int i) {
        zzwf zzwf = new zzwf(context, adSizeArr);
        zzwf.f7301j = m6473a(i);
        return zzwf;
    }
}
