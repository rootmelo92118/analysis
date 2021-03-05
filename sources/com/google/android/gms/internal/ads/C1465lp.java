package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.lp */
public final class C1465lp extends C1454le {

    /* renamed from: a */
    private final NativeContentAdMapper f5680a;

    public C1465lp(NativeContentAdMapper nativeContentAdMapper) {
        this.f5680a = nativeContentAdMapper;
    }

    /* renamed from: m */
    public final C1204bz mo12745m() {
        return null;
    }

    /* renamed from: o */
    public final C0719a mo12747o() {
        return null;
    }

    /* renamed from: a */
    public final String mo12729a() {
        return this.f5680a.getHeadline();
    }

    /* renamed from: b */
    public final List mo12732b() {
        List<NativeAd.Image> images = this.f5680a.getImages();
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
    public final String mo12734c() {
        return this.f5680a.getBody();
    }

    /* renamed from: d */
    public final C1210ce mo12736d() {
        NativeAd.Image logo = this.f5680a.getLogo();
        if (logo != null) {
            return new C1085at(logo.getDrawable(), logo.getUri(), logo.getScale());
        }
        return null;
    }

    /* renamed from: e */
    public final String mo12737e() {
        return this.f5680a.getCallToAction();
    }

    /* renamed from: f */
    public final String mo12738f() {
        return this.f5680a.getAdvertiser();
    }

    /* renamed from: g */
    public final void mo12739g() {
        this.f5680a.recordImpression();
    }

    /* renamed from: a */
    public final void mo12730a(C0719a aVar) {
        this.f5680a.handleClick((View) C0722b.m770a(aVar));
    }

    /* renamed from: b */
    public final void mo12733b(C0719a aVar) {
        this.f5680a.trackView((View) C0722b.m770a(aVar));
    }

    /* renamed from: a */
    public final void mo12731a(C0719a aVar, C0719a aVar2, C0719a aVar3) {
        this.f5680a.trackViews((View) C0722b.m770a(aVar), (HashMap) C0722b.m770a(aVar2), (HashMap) C0722b.m770a(aVar3));
    }

    /* renamed from: c */
    public final void mo12735c(C0719a aVar) {
        this.f5680a.untrackView((View) C0722b.m770a(aVar));
    }

    /* renamed from: h */
    public final boolean mo12740h() {
        return this.f5680a.getOverrideImpressionRecording();
    }

    /* renamed from: i */
    public final boolean mo12741i() {
        return this.f5680a.getOverrideClickHandling();
    }

    /* renamed from: j */
    public final Bundle mo12742j() {
        return this.f5680a.getExtras();
    }

    /* renamed from: k */
    public final C0719a mo12743k() {
        View adChoicesContent = this.f5680a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return C0722b.m769a(adChoicesContent);
    }

    /* renamed from: l */
    public final btb mo12744l() {
        if (this.f5680a.getVideoController() != null) {
            return this.f5680a.getVideoController().zzbc();
        }
        return null;
    }

    /* renamed from: n */
    public final C0719a mo12746n() {
        View zzafh = this.f5680a.zzafh();
        if (zzafh == null) {
            return null;
        }
        return C0722b.m769a(zzafh);
    }
}
