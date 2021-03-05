package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.oa */
public final class C1531oa {
    /* renamed from: a */
    public static awd m7694a(bjj bjj) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        bjj bjj2 = bjj;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = bjj2.f4462c;
        String str = map.get("Date");
        long a = str != null ? m7693a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            j2 = 0;
            int i2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j2 = 0;
            j = 0;
            z = false;
        }
        String str3 = map.get("Expires");
        long a2 = str3 != null ? m7693a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a3 = str4 != null ? m7693a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                j3 = (j * 1000) + j4;
                awd awd = new awd();
                awd.f2953a = bjj2.f4461b;
                awd.f2954b = str5;
                awd.f2958f = j4;
                awd.f2957e = j3;
                awd.f2955c = a;
                awd.f2956d = a3;
                awd.f2959g = map;
                awd.f2960h = bjj2.f4463d;
                return awd;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
            awd awd2 = new awd();
            awd2.f2953a = bjj2.f4461b;
            awd2.f2954b = str5;
            awd2.f2958f = j4;
            awd2.f2957e = j3;
            awd2.f2955c = a;
            awd2.f2956d = a3;
            awd2.f2959g = map;
            awd2.f2960h = bjj2.f4463d;
            return awd2;
        }
        j3 = j4;
        awd awd22 = new awd();
        awd22.f2953a = bjj2.f4461b;
        awd22.f2954b = str5;
        awd22.f2958f = j4;
        awd22.f2957e = j3;
        awd22.f2955c = a;
        awd22.f2956d = a3;
        awd22.f2959g = map;
        awd22.f2960h = bjj2.f4463d;
        return awd22;
    }

    /* renamed from: a */
    private static long m7693a(String str) {
        try {
            return m7696a().parse(str).getTime();
        } catch (ParseException e) {
            C1264ee.m6816a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    static String m7695a(long j) {
        return m7696a().format(new Date(j));
    }

    /* renamed from: a */
    private static SimpleDateFormat m7696a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
