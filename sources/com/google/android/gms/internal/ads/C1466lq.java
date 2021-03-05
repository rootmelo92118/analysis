package com.google.android.gms.internal.ads;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.lq */
public final class C1466lq implements NativeMediationAdRequest {

    /* renamed from: a */
    private final Date f5681a;

    /* renamed from: b */
    private final int f5682b;

    /* renamed from: c */
    private final Set<String> f5683c;

    /* renamed from: d */
    private final boolean f5684d;

    /* renamed from: e */
    private final Location f5685e;

    /* renamed from: f */
    private final int f5686f;

    /* renamed from: g */
    private final zzacp f5687g;

    /* renamed from: h */
    private final List<String> f5688h = new ArrayList();

    /* renamed from: i */
    private final boolean f5689i;

    /* renamed from: j */
    private final Map<String, Boolean> f5690j = new HashMap();

    public C1466lq(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, zzacp zzacp, List<String> list, boolean z2) {
        this.f5681a = date;
        this.f5682b = i;
        this.f5683c = set;
        this.f5685e = location;
        this.f5684d = z;
        this.f5686f = i2;
        this.f5687g = zzacp;
        this.f5689i = z2;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f5690j.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.f5690j.put(split[1], false);
                        }
                    }
                } else {
                    this.f5688h.add(next);
                }
            }
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f5681a;
    }

    @Deprecated
    public final int getGender() {
        return this.f5682b;
    }

    public final Set<String> getKeywords() {
        return this.f5683c;
    }

    public final Location getLocation() {
        return this.f5685e;
    }

    public final boolean isTesting() {
        return this.f5684d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f5686f;
    }

    public final NativeAdOptions getNativeAdOptions() {
        if (this.f5687g == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.f5687g.f6973b).setImageOrientation(this.f5687g.f6974c).setRequestMultipleImages(this.f5687g.f6975d);
        if (this.f5687g.f6972a >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.f5687g.f6976e);
        }
        if (this.f5687g.f6972a >= 3 && this.f5687g.f6977f != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.f5687g.f6977f));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAdMuted() {
        return bto.m6521a().mo12452c();
    }

    public final float getAdVolume() {
        return bto.m6521a().mo12451b();
    }

    public final boolean isAppInstallAdRequested() {
        if (this.f5688h != null) {
            return this.f5688h.contains("2") || this.f5688h.contains("6");
        }
        return false;
    }

    public final boolean isUnifiedNativeAdRequested() {
        return this.f5688h != null && this.f5688h.contains("6");
    }

    public final boolean isContentAdRequested() {
        if (this.f5688h != null) {
            return this.f5688h.contains("1") || this.f5688h.contains("6");
        }
        return false;
    }

    public final boolean zzvg() {
        return this.f5688h != null && this.f5688h.contains("3");
    }

    public final Map<String, Boolean> zzvh() {
        return this.f5690j;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f5689i;
    }
}
