package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.nc */
public final class C1506nc {

    /* renamed from: a */
    private final afl f5763a;

    /* renamed from: b */
    private final boolean f5764b;

    /* renamed from: c */
    private final String f5765c;

    public C1506nc(afl afl, Map<String, String> map) {
        this.f5763a = afl;
        this.f5765c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f5764b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.f5764b = true;
        }
    }

    /* renamed from: a */
    public final void mo12815a() {
        int i;
        if (this.f5763a == null) {
            C1772wz.m1630e("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f5765c)) {
            i = zzbv.zzlh().mo13235b();
        } else if ("landscape".equalsIgnoreCase(this.f5765c)) {
            i = zzbv.zzlh().mo13222a();
        } else if (this.f5764b) {
            i = -1;
        } else {
            i = zzbv.zzlh().mo13238c();
        }
        this.f5763a.setRequestedOrientation(i);
    }
}
