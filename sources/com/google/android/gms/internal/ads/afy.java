package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

final class afy implements zzu<afl> {

    /* renamed from: a */
    private final /* synthetic */ afx f1689a;

    afy(afx afx) {
        this.f1689a = afx;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f1689a) {
                        if (this.f1689a.f1647C != parseInt) {
                            int unused = this.f1689a.f1647C = parseInt;
                            this.f1689a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C1772wz.m1627c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
