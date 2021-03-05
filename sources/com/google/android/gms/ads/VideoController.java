package com.google.android.gms.ads;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.btb;
import com.google.android.gms.internal.ads.bte;
import com.google.android.gms.internal.ads.bue;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object mLock = new Object();
    @Nullable
    @GuardedBy("mLock")
    private btb zzwb;
    @Nullable
    @GuardedBy("mLock")
    private VideoLifecycleCallbacks zzwc;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final void zza(btb btb) {
        synchronized (this.mLock) {
            this.zzwb = btb;
            if (this.zzwc != null) {
                setVideoLifecycleCallbacks(this.zzwc);
            }
        }
    }

    public final btb zzbc() {
        btb btb;
        synchronized (this.mLock) {
            btb = this.zzwb;
        }
        return btb;
    }

    public final void play() {
        synchronized (this.mLock) {
            if (this.zzwb != null) {
                try {
                    this.zzwb.mo10461a();
                } catch (RemoteException e) {
                    aai.m1625b("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public final void pause() {
        synchronized (this.mLock) {
            if (this.zzwb != null) {
                try {
                    this.zzwb.mo10470b();
                } catch (RemoteException e) {
                    aai.m1625b("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.mLock) {
            if (this.zzwb != null) {
                try {
                    this.zzwb.mo10468a(z);
                } catch (RemoteException e) {
                    aai.m1625b("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.mLock) {
            if (this.zzwb == null) {
                return true;
            }
            try {
                boolean c = this.zzwb.mo10471c();
                return c;
            } catch (RemoteException e) {
                aai.m1625b("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public final int getPlaybackState() {
        synchronized (this.mLock) {
            if (this.zzwb == null) {
                return 0;
            }
            try {
                int d = this.zzwb.mo10472d();
                return d;
            } catch (RemoteException e) {
                aai.m1625b("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.mLock) {
            if (this.zzwb == null) {
                return false;
            }
            try {
                boolean i = this.zzwb.mo10477i();
                return i;
            } catch (RemoteException e) {
                aai.m1625b("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.mLock) {
            if (this.zzwb == null) {
                return false;
            }
            try {
                boolean j = this.zzwb.mo10478j();
                return j;
            } catch (RemoteException e) {
                aai.m1625b("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        C0926p.m1307a(videoLifecycleCallbacks, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.mLock) {
            this.zzwc = videoLifecycleCallbacks;
            if (this.zzwb != null) {
                try {
                    this.zzwb.mo10465a((bte) new bue(videoLifecycleCallbacks));
                } catch (RemoteException e) {
                    aai.m1625b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    @Nullable
    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.mLock) {
            videoLifecycleCallbacks = this.zzwc;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzwb != null;
        }
        return z;
    }

    public final float getAspectRatio() {
        synchronized (this.mLock) {
            if (this.zzwb == null) {
                return 0.0f;
            }
            try {
                float h = this.zzwb.mo10476h();
                return h;
            } catch (RemoteException e) {
                aai.m1625b("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }
}
