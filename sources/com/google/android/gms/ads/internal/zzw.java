package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1736vq;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.zzaso;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzw {
    private final Context mContext;
    private boolean zzbmw;
    private C1736vq zzbmx;
    private zzaso zzbmy;

    public zzw(Context context, C1736vq vqVar, zzaso zzaso) {
        this.mContext = context;
        this.zzbmx = vqVar;
        this.zzbmy = zzaso;
        if (this.zzbmy == null) {
            this.zzbmy = new zzaso();
        }
    }

    private final boolean zzjt() {
        return (this.zzbmx != null && this.zzbmx.mo13053a().f7132f) || this.zzbmy.f7108a;
    }

    public final void recordClick() {
        this.zzbmw = true;
    }

    public final boolean zzju() {
        return !zzjt() || this.zzbmw;
    }

    public final void zzas(@Nullable String str) {
        if (zzjt()) {
            if (str == null) {
                str = "";
            }
            if (this.zzbmx != null) {
                this.zzbmx.mo13056a(str, (Map<String, String>) null, 3);
            } else if (this.zzbmy.f7108a && this.zzbmy.f7109b != null) {
                for (String next : this.zzbmy.f7109b) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzbv.zzlf();
                        C1782xi.m8372a(this.mContext, "", replace);
                    }
                }
            }
        }
    }
}
