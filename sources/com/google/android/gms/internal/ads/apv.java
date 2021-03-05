package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;
import java.util.List;
import java.util.Map;

final class apv implements auc {

    /* renamed from: a */
    private final apt f2226a;

    /* renamed from: a */
    public static apv m3323a(apt apt) {
        if (apt.f2209a != null) {
            return apt.f2209a;
        }
        return new apv(apt);
    }

    private apv(apt apt) {
        this.f2226a = (apt) aqp.m3497a(apt, "output");
        this.f2226a.f2209a = this;
    }

    /* renamed from: a */
    public final int mo10926a() {
        return aqn.C1082e.f2339j;
    }

    /* renamed from: a */
    public final void mo10930a(int i, int i2) {
        this.f2226a.mo10924e(i, i2);
    }

    /* renamed from: a */
    public final void mo10931a(int i, long j) {
        this.f2226a.mo10895a(i, j);
    }

    /* renamed from: b */
    public final void mo10943b(int i, long j) {
        this.f2226a.mo10919c(i, j);
    }

    /* renamed from: a */
    public final void mo10929a(int i, float f) {
        this.f2226a.mo10893a(i, f);
    }

    /* renamed from: a */
    public final void mo10928a(int i, double d) {
        this.f2226a.mo10892a(i, d);
    }

    /* renamed from: b */
    public final void mo10942b(int i, int i2) {
        this.f2226a.mo10910b(i, i2);
    }

    /* renamed from: c */
    public final void mo10949c(int i, long j) {
        this.f2226a.mo10895a(i, j);
    }

    /* renamed from: c */
    public final void mo10948c(int i, int i2) {
        this.f2226a.mo10910b(i, i2);
    }

    /* renamed from: d */
    public final void mo10952d(int i, long j) {
        this.f2226a.mo10919c(i, j);
    }

    /* renamed from: d */
    public final void mo10951d(int i, int i2) {
        this.f2226a.mo10924e(i, i2);
    }

    /* renamed from: a */
    public final void mo10940a(int i, boolean z) {
        this.f2226a.mo10900a(i, z);
    }

    /* renamed from: a */
    public final void mo10936a(int i, String str) {
        this.f2226a.mo10899a(i, str);
    }

    /* renamed from: a */
    public final void mo10932a(int i, apc apc) {
        this.f2226a.mo10896a(i, apc);
    }

    /* renamed from: e */
    public final void mo10954e(int i, int i2) {
        this.f2226a.mo10918c(i, i2);
    }

    /* renamed from: f */
    public final void mo10957f(int i, int i2) {
        this.f2226a.mo10923d(i, i2);
    }

    /* renamed from: e */
    public final void mo10955e(int i, long j) {
        this.f2226a.mo10911b(i, j);
    }

    /* renamed from: a */
    public final void mo10935a(int i, Object obj, aso aso) {
        this.f2226a.mo10898a(i, (arw) obj, aso);
    }

    /* renamed from: b */
    public final void mo10944b(int i, Object obj, aso aso) {
        apt apt = this.f2226a;
        apt.mo10894a(i, 3);
        aso.mo11103a((arw) obj, (auc) apt.f2209a);
        apt.mo10894a(i, 4);
    }

    /* renamed from: a */
    public final void mo10927a(int i) {
        this.f2226a.mo10894a(i, 3);
    }

    /* renamed from: b */
    public final void mo10941b(int i) {
        this.f2226a.mo10894a(i, 4);
    }

    /* renamed from: a */
    public final void mo10934a(int i, Object obj) {
        if (obj instanceof apc) {
            this.f2226a.mo10912b(i, (apc) obj);
        } else {
            this.f2226a.mo10913b(i, (arw) obj);
        }
    }

    /* renamed from: a */
    public final void mo10939a(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3176f(list.get(i4).intValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10891a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10910b(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo10947b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3188i(list.get(i4).intValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10922d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10924e(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo10950c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3171d(list.get(i4).longValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10901a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10895a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo10953d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3175e(list.get(i4).longValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10901a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10895a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo10956e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3183g(list.get(i4).longValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10920c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10919c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo10958f(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3151b(list.get(i4).floatValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10890a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10893a(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo10959g(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3150b(list.get(i4).doubleValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10889a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10892a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo10960h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3193k(list.get(i4).intValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10891a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10910b(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo10961i(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3162b(list.get(i4).booleanValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10907a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10900a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo10937a(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof are) {
            are are = (are) list;
            while (i2 < list.size()) {
                Object b = are.mo11054b(i2);
                if (b instanceof String) {
                    this.f2226a.mo10899a(i, (String) b);
                } else {
                    this.f2226a.mo10896a(i, (apc) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10899a(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo10945b(int i, List<apc> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f2226a.mo10896a(i, list.get(i2));
        }
    }

    /* renamed from: j */
    public final void mo10962j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3180g(list.get(i4).intValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10909b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10918c(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo10963k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3191j(list.get(i4).intValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10922d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10924e(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo10964l(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3187h(list.get(i4).longValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10920c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10919c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo10965m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3184h(list.get(i4).intValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10917c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10923d(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo10966n(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2226a.mo10894a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += apt.m3179f(list.get(i4).longValue());
            }
            this.f2226a.mo10909b(i3);
            while (i2 < list.size()) {
                this.f2226a.mo10914b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2226a.mo10911b(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo10938a(int i, List<?> list, aso aso) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo10935a(i, (Object) list.get(i2), aso);
        }
    }

    /* renamed from: b */
    public final void mo10946b(int i, List<?> list, aso aso) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo10944b(i, (Object) list.get(i2), aso);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo10933a(int i, arp<K, V> arp, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.f2226a.mo10894a(i, 2);
            this.f2226a.mo10909b(aro.m3566a(arp, next.getKey(), next.getValue()));
            aro.m3567a(this.f2226a, arp, next.getKey(), next.getValue());
        }
    }
}
