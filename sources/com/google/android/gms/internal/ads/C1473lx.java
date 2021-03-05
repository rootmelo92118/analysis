package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.lx */
public final class C1473lx extends C1457lh {

    /* renamed from: a */
    private final UnifiedNativeAdMapper f5700a;

    public C1473lx(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f5700a = unifiedNativeAdMapper;
    }

    /* renamed from: k */
    public final C1204bz mo12761k() {
        return null;
    }

    /* renamed from: a */
    public final String mo12748a() {
        return this.f5700a.getHeadline();
    }

    /* renamed from: b */
    public final List mo12751b() {
        List<NativeAd.Image> images = this.f5700a.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image next : images) {
                arrayList.add(new C1085at(next.getDrawable(), next.getUri(), next.getScale()));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo12753c() {
        return this.f5700a.getBody();
    }

    /* renamed from: d */
    public final C1210ce mo12754d() {
        NativeAd.Image icon = this.f5700a.getIcon();
        if (icon != null) {
            return new C1085at(icon.getDrawable(), icon.getUri(), icon.getScale());
        }
        return null;
    }

    /* renamed from: e */
    public final String mo12755e() {
        return this.f5700a.getCallToAction();
    }

    /* renamed from: f */
    public final String mo12756f() {
        return this.f5700a.getAdvertiser();
    }

    /* renamed from: g */
    public final double mo12757g() {
        if (this.f5700a.getStarRating() != null) {
            return this.f5700a.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: h */
    public final String mo12758h() {
        return this.f5700a.getStore();
    }

    /* renamed from: i */
    public final String mo12759i() {
        return this.f5700a.getPrice();
    }

    /* renamed from: j */
    public final btb mo12760j() {
        if (this.f5700a.getVideoController() != null) {
            return this.f5700a.getVideoController().zzbc();
        }
        return null;
    }

    /* renamed from: l */
    public final C0719a mo12762l() {
        View adChoicesContent = this.f5700a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return C0722b.m769a(adChoicesContent);
    }

    /* renamed from: m */
    public final C0719a mo12763m() {
        View zzafh = this.f5700a.zzafh();
        if (zzafh == null) {
            return null;
        }
        return C0722b.m769a(zzafh);
    }

    /* renamed from: n */
    public final C0719a mo12764n() {
        Object zzic = this.f5700a.zzic();
        if (zzic == null) {
            return null;
        }
        return C0722b.m769a(zzic);
    }

    /* renamed from: o */
    public final Bundle mo12765o() {
        return this.f5700a.getExtras();
    }

    /* renamed from: p */
    public final boolean mo12766p() {
        return this.f5700a.getOverrideImpressionRecording();
    }

    /* renamed from: q */
    public final boolean mo12767q() {
        return this.f5700a.getOverrideClickHandling();
    }

    /* renamed from: r */
    public final void mo12768r() {
        this.f5700a.recordImpression();
    }

    /* renamed from: a */
    public final void mo12749a(C0719a aVar) {
        this.f5700a.handleClick((View) C0722b.m770a(aVar));
    }

    /* renamed from: a */
    public final void mo12750a(C0719a aVar, C0719a aVar2, C0719a aVar3) {
        this.f5700a.trackViews((View) C0722b.m770a(aVar), (HashMap) C0722b.m770a(aVar2), (HashMap) C0722b.m770a(aVar3));
    }

    /* renamed from: b */
    public final void mo12752b(C0719a aVar) {
        this.f5700a.untrackView((View) C0722b.m770a(aVar));
    }
}
