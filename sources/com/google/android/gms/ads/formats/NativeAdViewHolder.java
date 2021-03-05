package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1219cn;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zzblg = new WeakHashMap<>();
    private C1219cn zzblf;
    private WeakReference<View> zzblh;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        C0926p.m1307a(view, (Object) "ContainerView must not be null");
        if ((view instanceof NativeAdView) || (view instanceof UnifiedNativeAdView)) {
            aai.m1626c("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zzblg.get(view) != null) {
            aai.m1626c("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zzblg.put(view, this);
            this.zzblh = new WeakReference<>(view);
            this.zzblf = bre.m6318b().mo12320a(view, zzb(map), zzb(map2));
        }
    }

    private static HashMap<String, View> zzb(Map<String, View> map) {
        if (map == null) {
            return new HashMap<>();
        }
        return new HashMap<>(map);
    }

    public final void setNativeAd(NativeAd nativeAd) {
        zza((C0719a) nativeAd.zzhy());
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        zza((C0719a) unifiedNativeAd.zzhy());
    }

    private final void zza(C0719a aVar) {
        View view = this.zzblh != null ? (View) this.zzblh.get() : null;
        if (view == null) {
            aai.m1630e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zzblg.containsKey(view)) {
            zzblg.put(view, this);
        }
        if (this.zzblf != null) {
            try {
                this.zzblf.mo12459a(aVar);
            } catch (RemoteException e) {
                aai.m1625b("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void unregisterNativeAd() {
        if (this.zzblf != null) {
            try {
                this.zzblf.mo12458a();
            } catch (RemoteException e) {
                aai.m1625b("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        View view = this.zzblh != null ? (View) this.zzblh.get() : null;
        if (view != null) {
            zzblg.remove(view);
        }
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzblf.mo12460b(C0722b.m769a(view));
        } catch (RemoteException e) {
            aai.m1625b("Unable to call setClickConfirmingView on delegate", e);
        }
    }
}
