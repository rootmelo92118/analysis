package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2003ei;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.dq */
final class C1983dq implements C2105hu {

    /* renamed from: a */
    private final C1976do f7633a;

    /* renamed from: a */
    public static C1983dq m9402a(C1976do doVar) {
        if (doVar.f7616a != null) {
            return doVar.f7616a;
        }
        return new C1983dq(doVar);
    }

    private C1983dq(C1976do doVar) {
        this.f7633a = (C1976do) C2010ek.m9562a(doVar, "output");
        this.f7633a.f7616a = this;
    }

    /* renamed from: a */
    public final int mo13727a() {
        return C2003ei.C2008e.f7739j;
    }

    /* renamed from: a */
    public final void mo13731a(int i, int i2) {
        this.f7633a.mo13725e(i, i2);
    }

    /* renamed from: a */
    public final void mo13732a(int i, long j) {
        this.f7633a.mo13697a(i, j);
    }

    /* renamed from: b */
    public final void mo13744b(int i, long j) {
        this.f7633a.mo13720c(i, j);
    }

    /* renamed from: a */
    public final void mo13730a(int i, float f) {
        this.f7633a.mo13695a(i, f);
    }

    /* renamed from: a */
    public final void mo13729a(int i, double d) {
        this.f7633a.mo13694a(i, d);
    }

    /* renamed from: b */
    public final void mo13743b(int i, int i2) {
        this.f7633a.mo13712b(i, i2);
    }

    /* renamed from: c */
    public final void mo13750c(int i, long j) {
        this.f7633a.mo13697a(i, j);
    }

    /* renamed from: c */
    public final void mo13749c(int i, int i2) {
        this.f7633a.mo13712b(i, i2);
    }

    /* renamed from: d */
    public final void mo13753d(int i, long j) {
        this.f7633a.mo13720c(i, j);
    }

    /* renamed from: d */
    public final void mo13752d(int i, int i2) {
        this.f7633a.mo13725e(i, i2);
    }

    /* renamed from: a */
    public final void mo13741a(int i, boolean z) {
        this.f7633a.mo13702a(i, z);
    }

    /* renamed from: a */
    public final void mo13737a(int i, String str) {
        this.f7633a.mo13701a(i, str);
    }

    /* renamed from: a */
    public final void mo13733a(int i, C1958cx cxVar) {
        this.f7633a.mo13698a(i, cxVar);
    }

    /* renamed from: e */
    public final void mo13755e(int i, int i2) {
        this.f7633a.mo13719c(i, i2);
    }

    /* renamed from: f */
    public final void mo13758f(int i, int i2) {
        this.f7633a.mo13724d(i, i2);
    }

    /* renamed from: e */
    public final void mo13756e(int i, long j) {
        this.f7633a.mo13713b(i, j);
    }

    /* renamed from: a */
    public final void mo13736a(int i, Object obj, C2061gh ghVar) {
        this.f7633a.mo13700a(i, (C2043fq) obj, ghVar);
    }

    /* renamed from: b */
    public final void mo13745b(int i, Object obj, C2061gh ghVar) {
        C1976do doVar = this.f7633a;
        doVar.mo13696a(i, 3);
        ghVar.mo13928a((C2043fq) obj, (C2105hu) doVar.f7616a);
        doVar.mo13696a(i, 4);
    }

    /* renamed from: a */
    public final void mo13728a(int i) {
        this.f7633a.mo13696a(i, 3);
    }

    /* renamed from: b */
    public final void mo13742b(int i) {
        this.f7633a.mo13696a(i, 4);
    }

    /* renamed from: a */
    public final void mo13735a(int i, Object obj) {
        if (obj instanceof C1958cx) {
            this.f7633a.mo13714b(i, (C1958cx) obj);
        } else {
            this.f7633a.mo13715b(i, (C2043fq) obj);
        }
    }

    /* renamed from: a */
    public final void mo13740a(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9256f(list.get(i4).intValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13693a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13712b(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo13748b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9268i(list.get(i4).intValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13723d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13725e(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo13751c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9252d(list.get(i4).longValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13703a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13697a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo13754d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9255e(list.get(i4).longValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13703a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13697a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo13757e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9263g(list.get(i4).longValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13721c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13720c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo13759f(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9231b(list.get(i4).floatValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13692a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13695a(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo13760g(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9230b(list.get(i4).doubleValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13691a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13694a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo13761h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9273k(list.get(i4).intValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13693a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13712b(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo13762i(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9242b(list.get(i4).booleanValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13709a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13702a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo13738a(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C2025ez) {
            C2025ez ezVar = (C2025ez) list;
            while (i2 < list.size()) {
                Object b = ezVar.mo13851b(i2);
                if (b instanceof String) {
                    this.f7633a.mo13701a(i, (String) b);
                } else {
                    this.f7633a.mo13698a(i, (C1958cx) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13701a(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo13746b(int i, List<C1958cx> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f7633a.mo13698a(i, list.get(i2));
        }
    }

    /* renamed from: j */
    public final void mo13763j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9260g(list.get(i4).intValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13711b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13719c(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo13764k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9271j(list.get(i4).intValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13723d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13725e(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo13765l(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9267h(list.get(i4).longValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13721c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13720c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo13766m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9264h(list.get(i4).intValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13718c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13724d(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo13767n(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f7633a.mo13696a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1976do.m9259f(list.get(i4).longValue());
            }
            this.f7633a.mo13711b(i3);
            while (i2 < list.size()) {
                this.f7633a.mo13716b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7633a.mo13713b(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo13739a(int i, List<?> list, C2061gh ghVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo13736a(i, (Object) list.get(i2), ghVar);
        }
    }

    /* renamed from: b */
    public final void mo13747b(int i, List<?> list, C2061gh ghVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo13745b(i, (Object) list.get(i2), ghVar);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo13734a(int i, C2036fj<K, V> fjVar, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.f7633a.mo13696a(i, 2);
            this.f7633a.mo13711b(C2035fi.m9665a(fjVar, next.getKey(), next.getValue()));
            C2035fi.m9666a(this.f7633a, fjVar, next.getKey(), next.getValue());
        }
    }
}
