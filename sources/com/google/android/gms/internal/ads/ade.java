package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.TimeUnit;

@C1598qn
public final class ade {

    /* renamed from: a */
    private final Context f1416a;

    /* renamed from: b */
    private final String f1417b;

    /* renamed from: c */
    private final zzbbi f1418c;
    @Nullable

    /* renamed from: d */
    private final C1016aa f1419d;
    @Nullable

    /* renamed from: e */
    private final C1019ad f1420e;

    /* renamed from: f */
    private final C1817yq f1421f = new C1820yt().mo13278a("min_1", Double.MIN_VALUE, 1.0d).mo13278a("1_5", 1.0d, 5.0d).mo13278a("5_10", 5.0d, 10.0d).mo13278a("10_20", 10.0d, 20.0d).mo13278a("20_30", 20.0d, 30.0d).mo13278a("30_max", 30.0d, Double.MAX_VALUE).mo13277a();

    /* renamed from: g */
    private final long[] f1422g;

    /* renamed from: h */
    private final String[] f1423h;

    /* renamed from: i */
    private boolean f1424i = false;

    /* renamed from: j */
    private boolean f1425j = false;

    /* renamed from: k */
    private boolean f1426k = false;

    /* renamed from: l */
    private boolean f1427l = false;

    /* renamed from: m */
    private boolean f1428m;

    /* renamed from: n */
    private zzbdi f1429n;

    /* renamed from: o */
    private boolean f1430o;

    /* renamed from: p */
    private boolean f1431p;

    /* renamed from: q */
    private long f1432q = -1;

    public ade(Context context, zzbbi zzbbi, String str, @Nullable C1019ad adVar, @Nullable C1016aa aaVar) {
        this.f1416a = context;
        this.f1418c = zzbbi;
        this.f1417b = str;
        this.f1420e = adVar;
        this.f1419d = aaVar;
        String str2 = (String) bre.m6321e().mo12778a(C1557p.f6144u);
        if (str2 == null) {
            this.f1423h = new String[0];
            this.f1422g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f1423h = new String[split.length];
        this.f1422g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f1422g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                C1772wz.m1627c("Unable to parse frame hash target time number.", e);
                this.f1422g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo10186a(zzbdi zzbdi) {
        C1719v.m8118a(this.f1420e, this.f1419d, "vpc2");
        this.f1424i = true;
        if (this.f1420e != null) {
            this.f1420e.mo10153a("vpn", zzbdi.mo13325a());
        }
        this.f1429n = zzbdi;
    }

    /* renamed from: a */
    public final void mo10185a() {
        if (this.f1424i && !this.f1425j) {
            C1719v.m8118a(this.f1420e, this.f1419d, "vfr2");
            this.f1425j = true;
        }
    }

    /* renamed from: b */
    public final void mo10187b() {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6143t)).booleanValue() && !this.f1430o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f1417b);
            bundle.putString("player", this.f1429n.mo13325a());
            for (C1819ys next : this.f1421f.mo13272a()) {
                String valueOf = String.valueOf("fps_c_");
                String valueOf2 = String.valueOf(next.f6905a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(next.f6907c));
                String valueOf3 = String.valueOf("fps_p_");
                String valueOf4 = String.valueOf(next.f6905a);
                bundle.putString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), Double.toString(next.f6906b));
            }
            for (int i = 0; i < this.f1422g.length; i++) {
                String str = this.f1423h[i];
                if (str != null) {
                    String valueOf5 = String.valueOf(Long.valueOf(this.f1422g[i]));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 3);
                    sb.append("fh_");
                    sb.append(valueOf5);
                    bundle.putString(sb.toString(), str);
                }
            }
            zzbv.zzlf().mo13202a(this.f1416a, this.f1418c.f7135a, "gmob-apps", bundle, true);
            this.f1430o = true;
        }
    }

    /* renamed from: b */
    public final void mo10188b(zzbdi zzbdi) {
        if (this.f1426k && !this.f1427l) {
            if (C1772wz.m8288a() && !this.f1427l) {
                C1772wz.m8287a("VideoMetricsMixin first frame");
            }
            C1719v.m8118a(this.f1420e, this.f1419d, "vff2");
            this.f1427l = true;
        }
        long c = zzbv.zzlm().mo9998c();
        if (this.f1428m && this.f1431p && this.f1432q != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d = (double) (c - this.f1432q);
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.f1421f.mo13273a(nanos / d);
        }
        this.f1431p = this.f1428m;
        this.f1432q = c;
        long longValue = ((Long) bre.m6321e().mo12778a(C1557p.f6145v)).longValue();
        long currentPosition = (long) zzbdi.getCurrentPosition();
        int i = 0;
        while (i < this.f1423h.length) {
            if (this.f1423h[i] != null || longValue <= Math.abs(currentPosition - this.f1422g[i])) {
                zzbdi zzbdi2 = zzbdi;
                i++;
            } else {
                String[] strArr = this.f1423h;
                int i2 = 8;
                Bitmap bitmap = zzbdi.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3);
                        i4++;
                        j3--;
                        i2 = 8;
                    }
                    i3++;
                    j = j3;
                    i2 = 8;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo10189c() {
        this.f1428m = true;
        if (this.f1425j && !this.f1426k) {
            C1719v.m8118a(this.f1420e, this.f1419d, "vfp2");
            this.f1426k = true;
        }
    }

    /* renamed from: d */
    public final void mo10190d() {
        this.f1428m = false;
    }
}
