package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.lo */
public final class C1464lo extends C1451lb {

    /* renamed from: a */
    private final NativeAppInstallAdMapper f5679a;

    public C1464lo(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f5679a = nativeAppInstallAdMapper;
    }

    /* renamed from: o */
    public final C1204bz mo12726o() {
        return null;
    }

    /* renamed from: q */
    public final C0719a mo12728q() {
        return null;
    }

    /* renamed from: a */
    public final String mo12708a() {
        return this.f5679a.getHeadline();
    }

    /* renamed from: b */
    public final List mo12711b() {
        List<NativeAd.Image> images = this.f5679a.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image next : images) {
            arrayList.add(new C1085at(next.getDrawable(), next.getUri(), next.getScale()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo12713c() {
        return this.f5679a.getBody();
    }

    /* renamed from: d */
    public final C1210ce mo12715d() {
        NativeAd.Image icon = this.f5679a.getIcon();
        if (icon != null) {
            return new C1085at(icon.getDrawable(), icon.getUri(), icon.getScale());
        }
        return null;
    }

    /* renamed from: e */
    public final String mo12716e() {
        return this.f5679a.getCallToAction();
    }

    /* renamed from: f */
    public final double mo12717f() {
        return this.f5679a.getStarRating();
    }

    /* renamed from: g */
    public final String mo12718g() {
        return this.f5679a.getStore();
    }

    /* renamed from: h */
    public final String mo12719h() {
        return this.f5679a.getPrice();
    }

    /* renamed from: i */
    public final void mo12720i() {
        this.f5679a.recordImpression();
    }

    /* renamed from: a */
    public final void mo12709a(C0719a aVar) {
        this.f5679a.handleClick((View) C0722b.m770a(aVar));
    }

    /* renamed from: b */
    public final void mo12712b(C0719a aVar) {
        this.f5679a.trackView((View) C0722b.m770a(aVar));
    }

    /* renamed from: a */
    public final void mo12710a(C0719a aVar, C0719a aVar2, C0719a aVar3) {
        this.f5679a.trackViews((View) C0722b.m770a(aVar), (HashMap) C0722b.m770a(aVar2), (HashMap) C0722b.m770a(aVar3));
    }

    /* renamed from: c */
    public final void mo12714c(C0719a aVar) {
        this.f5679a.untrackView((View) C0722b.m770a(aVar));
    }

    /* renamed from: j */
    public final boolean mo12721j() {
        return this.f5679a.getOverrideImpressionRecording();
    }

    /* renamed from: k */
    public final boolean mo12722k() {
        return this.f5679a.getOverrideClickHandling();
    }

    /* renamed from: l */
    public final Bundle mo12723l() {
        return this.f5679a.getExtras();
    }

    /* renamed from: m */
    public final btb mo12724m() {
        if (this.f5679a.getVideoController() != null) {
            return this.f5679a.getVideoController().zzbc();
        }
        return null;
    }

    /* renamed from: n */
    public final C0719a mo12725n() {
        View adChoicesContent = this.f5679a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return C0722b.m769a(adChoicesContent);
    }

    /* renamed from: p */
    public final C0719a mo12727p() {
        View zzafh = this.f5679a.zzafh();
        if (zzafh == null) {
            return null;
        }
        return C0722b.m769a(zzafh);
    }
}
