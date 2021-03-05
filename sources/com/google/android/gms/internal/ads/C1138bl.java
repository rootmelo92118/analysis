package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bl */
public final class C1138bl implements zzu<Object> {

    /* renamed from: a */
    private final WeakReference<C1134bh> f4629a;

    /* renamed from: b */
    private final String f4630b;

    public C1138bl(C1134bh bhVar, String str) {
        this.f4629a = new WeakReference<>(bhVar);
        this.f4630b = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C1134bh bhVar;
        String str = map.get("ads_id");
        String str2 = map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.f4630b.equals(str)) {
            if ("_ai".equals(str2)) {
                C1134bh bhVar2 = (C1134bh) this.f4629a.get();
                if (bhVar2 != null) {
                    bhVar2.zzim();
                }
            } else if ("_ac".equals(str2) && (bhVar = (C1134bh) this.f4629a.get()) != null) {
                bhVar.zzin();
            }
        }
    }
}
