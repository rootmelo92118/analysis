package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bn */
final class C1140bn implements zzu<Object> {

    /* renamed from: a */
    final /* synthetic */ C1139bm f4803a;

    /* renamed from: b */
    private final /* synthetic */ C1575pr f4804b;

    C1140bn(C1139bm bmVar, C1575pr prVar) {
        this.f4803a = bmVar;
        this.f4804b = prVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        afl afl = (afl) this.f4803a.f4736a.get();
        if (afl == null) {
            this.f4804b.mo12888b("/loadHtml", this);
            return;
        }
        afl.mo10388u().mo10400a((agt) new C1141bo(this, map, this.f4804b));
        String str = map.get("overlayHtml");
        String str2 = map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            afl.loadData(str, "text/html", "UTF-8");
        } else {
            afl.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
