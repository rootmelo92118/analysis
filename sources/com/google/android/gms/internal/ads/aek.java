package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@C1598qn
public final class aek implements zzu<adc> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        adc adc = (adc) obj;
        aga b = adc.mo10172b();
        if (b == null) {
            try {
                aga aga = new aga(adc, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                adc.mo10168a(aga);
                b = aga;
            } catch (NullPointerException | NumberFormatException e) {
                C1772wz.m1625b("Unable to parse videoMeta message.", e);
                zzbv.zzlj().mo13119a(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || 3 < parseInt) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (C1772wz.m1623a(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(parseInt);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            C1772wz.m1624b(sb.toString());
        }
        b.mo10463a(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
