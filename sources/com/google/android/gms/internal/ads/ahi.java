package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

final class ahi implements zzu<afl> {

    /* renamed from: a */
    private final /* synthetic */ ahh f1815a;

    ahi(ahh ahh) {
        this.f1815a = ahh;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f1815a) {
                        if (this.f1815a.f1810v != parseInt) {
                            int unused = this.f1815a.f1810v = parseInt;
                            this.f1815a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C1772wz.m1627c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
