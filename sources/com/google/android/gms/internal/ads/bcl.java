package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzki;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bcl {

    /* renamed from: c */
    private static final bev f3524c = new bcm();

    /* renamed from: d */
    private static final Pattern f3525d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f3526a = -1;

    /* renamed from: b */
    public int f3527b = -1;

    /* renamed from: a */
    public final boolean mo11692a(zzki zzki) {
        for (int i = 0; i < zzki.mo13427a(); i++) {
            zzki.zza a = zzki.mo13428a(i);
            if (a instanceof zzkm) {
                zzkm zzkm = (zzkm) a;
                if (m4953a(zzkm.f7244a, zzkm.f7245b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m4953a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f3525d.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f3526a = parseInt;
                    this.f3527b = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo11691a() {
        return (this.f3526a == -1 || this.f3527b == -1) ? false : true;
    }
}
