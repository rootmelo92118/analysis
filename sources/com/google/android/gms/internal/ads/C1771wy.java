package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.C0856e;
import com.google.android.gms.common.C0857f;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.wy */
final class C1771wy extends C1768wv {

    /* renamed from: a */
    private Context f6806a;

    C1771wy(Context context) {
        this.f6806a = context;
    }

    public final void onStop() {
    }

    public final void zzki() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f6806a);
        } catch (C0856e | C0857f | IOException | IllegalStateException e) {
            C1772wz.m1625b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        aab.m1594a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        C1772wz.m1630e(sb.toString());
    }
}
