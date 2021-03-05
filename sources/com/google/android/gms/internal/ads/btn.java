package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@C1598qn
public final class btn {

    /* renamed from: a */
    private final C1436kn f5258a;

    /* renamed from: b */
    private final Context f5259b;

    /* renamed from: c */
    private final bqp f5260c;

    /* renamed from: d */
    private AdListener f5261d;

    /* renamed from: e */
    private bqf f5262e;

    /* renamed from: f */
    private brw f5263f;

    /* renamed from: g */
    private String f5264g;

    /* renamed from: h */
    private AdMetadataListener f5265h;

    /* renamed from: i */
    private AppEventListener f5266i;

    /* renamed from: j */
    private OnCustomRenderedAdLoadedListener f5267j;

    /* renamed from: k */
    private Correlator f5268k;

    /* renamed from: l */
    private RewardedVideoAdListener f5269l;

    /* renamed from: m */
    private boolean f5270m;

    /* renamed from: n */
    private boolean f5271n;

    public btn(Context context) {
        this(context, bqp.f5123a, (PublisherInterstitialAd) null);
    }

    public btn(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, bqp.f5123a, publisherInterstitialAd);
    }

    private btn(Context context, bqp bqp, PublisherInterstitialAd publisherInterstitialAd) {
        this.f5258a = new C1436kn();
        this.f5259b = context;
        this.f5260c = bqp;
    }

    /* renamed from: a */
    public final AdListener mo12425a() {
        return this.f5261d;
    }

    /* renamed from: b */
    public final String mo12435b() {
        return this.f5264g;
    }

    /* renamed from: c */
    public final AppEventListener mo12437c() {
        return this.f5266i;
    }

    /* renamed from: d */
    public final OnCustomRenderedAdLoadedListener mo12438d() {
        return this.f5267j;
    }

    /* renamed from: e */
    public final boolean mo12439e() {
        try {
            if (this.f5263f == null) {
                return false;
            }
            return this.f5263f.isReady();
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo12440f() {
        try {
            if (this.f5263f == null) {
                return false;
            }
            return this.f5263f.isLoading();
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo12432a(bti bti) {
        try {
            if (this.f5263f == null) {
                if (this.f5264g == null) {
                    m6501b("loadAd");
                }
                zzwf a = this.f5270m ? zzwf.m8829a() : new zzwf();
                bqt b = bre.m6318b();
                Context context = this.f5259b;
                this.f5263f = (brw) new bqx(b, context, a, this.f5264g, this.f5258a).mo12325a(context, false);
                if (this.f5261d != null) {
                    this.f5263f.zza((brl) new bqi(this.f5261d));
                }
                if (this.f5262e != null) {
                    this.f5263f.zza((brh) new bqg(this.f5262e));
                }
                if (this.f5265h != null) {
                    this.f5263f.zza((bsb) new bqm(this.f5265h));
                }
                if (this.f5266i != null) {
                    this.f5263f.zza((bse) new bqr(this.f5266i));
                }
                if (this.f5267j != null) {
                    this.f5263f.zza((C1026aj) new C1049am(this.f5267j));
                }
                if (this.f5268k != null) {
                    this.f5263f.zza((bsk) this.f5268k.zzba());
                }
                if (this.f5269l != null) {
                    this.f5263f.zza((C1695uc) new C1700uh(this.f5269l));
                }
                this.f5263f.setImmersiveMode(this.f5271n);
            }
            if (this.f5263f.zzb(bqp.m6264a(this.f5259b, bti))) {
                this.f5258a.mo12678a(bti.mo12370j());
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12426a(AdListener adListener) {
        try {
            this.f5261d = adListener;
            if (this.f5263f != null) {
                this.f5263f.zza((brl) adListener != null ? new bqi(adListener) : null);
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12431a(bqf bqf) {
        try {
            this.f5262e = bqf;
            if (this.f5263f != null) {
                this.f5263f.zza((brh) bqf != null ? new bqg(bqf) : null);
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12433a(String str) {
        if (this.f5264g == null) {
            this.f5264g = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    /* renamed from: a */
    public final void mo12429a(AdMetadataListener adMetadataListener) {
        try {
            this.f5265h = adMetadataListener;
            if (this.f5263f != null) {
                this.f5263f.zza((bsb) adMetadataListener != null ? new bqm(adMetadataListener) : null);
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: g */
    public final Bundle mo12441g() {
        try {
            if (this.f5263f != null) {
                return this.f5263f.getAdMetadata();
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo12428a(AppEventListener appEventListener) {
        try {
            this.f5266i = appEventListener;
            if (this.f5263f != null) {
                this.f5263f.zza((bse) appEventListener != null ? new bqr(appEventListener) : null);
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.f5267j = onCustomRenderedAdLoadedListener;
            if (this.f5263f != null) {
                this.f5263f.zza((C1026aj) onCustomRenderedAdLoadedListener != null ? new C1049am(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12427a(Correlator correlator) {
        this.f5268k = correlator;
        try {
            if (this.f5263f != null) {
                this.f5263f.zza((bsk) this.f5268k == null ? null : this.f5268k.zzba());
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12430a(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.f5269l = rewardedVideoAdListener;
            if (this.f5263f != null) {
                this.f5263f.zza((C1695uc) rewardedVideoAdListener != null ? new C1700uh(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12434a(boolean z) {
        this.f5270m = true;
    }

    /* renamed from: h */
    public final String mo12442h() {
        try {
            if (this.f5263f != null) {
                return this.f5263f.zzje();
            }
            return null;
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
            return null;
        }
    }

    /* renamed from: i */
    public final void mo12443i() {
        try {
            m6501b("show");
            this.f5263f.showInterstitial();
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: b */
    public final void mo12436b(boolean z) {
        try {
            this.f5271n = z;
            if (this.f5263f != null) {
                this.f5263f.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            aai.m1629d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: b */
    private final void m6501b(String str) {
        if (this.f5263f == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }
}
