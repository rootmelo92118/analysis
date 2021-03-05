package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.zzawd;
import java.util.Map;

@C1598qn
public final class zzag implements zzu<Object> {
    private final zzah zzdgh;

    public zzag(zzah zzah) {
        this.zzdgh = zzah;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzawd zzawd = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzawd = new zzawd(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                C1772wz.m1627c("Unable to parse reward amount.", e);
            }
            this.zzdgh.zzb(zzawd);
        } else if ("video_start".equals(str)) {
            this.zzdgh.zzkf();
        } else if ("video_complete".equals(str)) {
            this.zzdgh.zzkg();
        }
    }
}
