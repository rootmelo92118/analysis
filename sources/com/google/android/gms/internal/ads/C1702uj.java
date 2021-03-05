package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.p039a.C0722b;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.uj */
public final class C1702uj implements RewardedVideoAd {
    @NonNull

    /* renamed from: a */
    private final C1688tw f6571a;

    /* renamed from: b */
    private final Context f6572b;

    /* renamed from: c */
    private final Object f6573c = new Object();

    /* renamed from: d */
    private final C1700uh f6574d = new C1700uh((RewardedVideoAdListener) null);

    /* renamed from: e */
    private String f6575e;

    /* renamed from: f */
    private String f6576f;

    public C1702uj(Context context, @Nullable C1688tw twVar) {
        this.f6571a = twVar == null ? new bub() : twVar;
        this.f6572b = context.getApplicationContext();
    }

    /* renamed from: a */
    private final void m8054a(String str, bti bti) {
        synchronized (this.f6573c) {
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12466a(new zzavh(bqp.m6264a(this.f6572b, bti), str));
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void loadAd(String str, AdRequest adRequest) {
        m8054a(str, adRequest.zzaz());
    }

    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        m8054a(str, publisherAdRequest.zzaz());
    }

    public final void show() {
        synchronized (this.f6573c) {
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12461a();
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f6573c) {
            this.f6574d.mo13008a(rewardedVideoAdListener);
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12465a((C1695uc) this.f6574d);
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.f6573c) {
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12463a((bsb) new bqm(adMetadataListener));
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final Bundle getAdMetadata() {
        synchronized (this.f6573c) {
            if (this.f6571a != null) {
                try {
                    Bundle b = this.f6571a.mo12469b();
                    return b;
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
            Bundle bundle = new Bundle();
            return bundle;
        }
    }

    public final void setUserId(String str) {
        synchronized (this.f6573c) {
            this.f6575e = str;
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12471b(str);
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean isLoaded() {
        synchronized (this.f6573c) {
            if (this.f6571a == null) {
                return false;
            }
            try {
                boolean c = this.f6571a.mo12474c();
                return c;
            } catch (RemoteException e) {
                aai.m1629d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    public final void pause() {
        pause((Context) null);
    }

    public final void pause(Context context) {
        synchronized (this.f6573c) {
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12470b(C0722b.m769a(context));
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void resume() {
        resume((Context) null);
    }

    public final void resume(Context context) {
        synchronized (this.f6573c) {
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12472c(C0722b.m769a(context));
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void destroy() {
        destroy((Context) null);
    }

    public final void destroy(Context context) {
        synchronized (this.f6573c) {
            this.f6574d.mo13008a((RewardedVideoAdListener) null);
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12476d(C0722b.m769a(context));
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener g;
        synchronized (this.f6573c) {
            g = this.f6574d.mo13009g();
        }
        return g;
    }

    public final String getUserId() {
        String str;
        synchronized (this.f6573c) {
            str = this.f6575e;
        }
        return str;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.f6571a != null) {
                return this.f6571a.mo12479g();
            }
            return null;
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.f6573c) {
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12468a(z);
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setCustomData(String str) {
        synchronized (this.f6573c) {
            if (this.f6571a != null) {
                try {
                    this.f6571a.mo12473c(str);
                    this.f6576f = str;
                } catch (RemoteException e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final String getCustomData() {
        String str;
        synchronized (this.f6573c) {
            str = this.f6576f;
        }
        return str;
    }
}
