package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.gj */
final class C2063gj {

    /* renamed from: a */
    private static final Class<?> f7827a = m9865d();

    /* renamed from: b */
    private static final C2079gz<?, ?> f7828b = m9840a(false);

    /* renamed from: c */
    private static final C2079gz<?, ?> f7829c = m9840a(true);

    /* renamed from: d */
    private static final C2079gz<?, ?> f7830d = new C2082hb();

    /* renamed from: a */
    public static void m9849a(Class<?> cls) {
        if (!C2003ei.class.isAssignableFrom(cls) && f7827a != null && !f7827a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    public static void m9845a(int i, List<Double> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13760g(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m9858b(int i, List<Float> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13759f(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m9862c(int i, List<Long> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13751c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m9866d(int i, List<Long> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13754d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m9870e(int i, List<Long> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13767n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m9873f(int i, List<Long> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13757e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m9876g(int i, List<Long> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13765l(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m9879h(int i, List<Integer> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13740a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m9882i(int i, List<Integer> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13763j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m9885j(int i, List<Integer> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13766m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m9886k(int i, List<Integer> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13748b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m9887l(int i, List<Integer> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13764k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m9888m(int i, List<Integer> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13761h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m9889n(int i, List<Boolean> list, C2105hu huVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13762i(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m9843a(int i, List<String> list, C2105hu huVar) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13738a(i, list);
        }
    }

    /* renamed from: b */
    public static void m9856b(int i, List<C1958cx> list, C2105hu huVar) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13746b(i, list);
        }
    }

    /* renamed from: a */
    public static void m9844a(int i, List<?> list, C2105hu huVar, C2061gh ghVar) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13739a(i, list, ghVar);
        }
    }

    /* renamed from: b */
    public static void m9857b(int i, List<?> list, C2105hu huVar, C2061gh ghVar) {
        if (list != null && !list.isEmpty()) {
            huVar.mo13747b(i, list, ghVar);
        }
    }

    /* renamed from: a */
    static int m9838a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2031fe) {
            C2031fe feVar = (C2031fe) list;
            i = 0;
            while (i2 < size) {
                i += C1976do.m9252d(feVar.mo13898b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1976do.m9252d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m9837a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m9838a(list) + (list.size() * C1976do.m9253e(i));
    }

    /* renamed from: b */
    static int m9854b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2031fe) {
            C2031fe feVar = (C2031fe) list;
            i = 0;
            while (i2 < size) {
                i += C1976do.m9255e(feVar.mo13898b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1976do.m9255e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m9853b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9854b(list) + (size * C1976do.m9253e(i));
    }

    /* renamed from: c */
    static int m9860c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2031fe) {
            C2031fe feVar = (C2031fe) list;
            i = 0;
            while (i2 < size) {
                i += C1976do.m9259f(feVar.mo13898b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1976do.m9259f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    static int m9859c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9860c(list) + (size * C1976do.m9253e(i));
    }

    /* renamed from: d */
    static int m9864d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            i = 0;
            while (i2 < size) {
                i += C1976do.m9273k(ejVar.mo13830b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1976do.m9273k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m9863d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9864d(list) + (size * C1976do.m9253e(i));
    }

    /* renamed from: e */
    static int m9868e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            i = 0;
            while (i2 < size) {
                i += C1976do.m9256f(ejVar.mo13830b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1976do.m9256f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m9867e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9868e(list) + (size * C1976do.m9253e(i));
    }

    /* renamed from: f */
    static int m9872f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            i = 0;
            while (i2 < size) {
                i += C1976do.m9260g(ejVar.mo13830b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1976do.m9260g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m9871f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9872f(list) + (size * C1976do.m9253e(i));
    }

    /* renamed from: g */
    static int m9875g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            i = 0;
            while (i2 < size) {
                i += C1976do.m9264h(ejVar.mo13830b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1976do.m9264h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m9874g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9875g(list) + (size * C1976do.m9253e(i));
    }

    /* renamed from: h */
    static int m9878h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    static int m9877h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C1976do.m9269i(i, 0);
    }

    /* renamed from: i */
    static int m9881i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    static int m9880i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C1976do.m9262g(i, 0);
    }

    /* renamed from: j */
    static int m9884j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    static int m9883j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C1976do.m9237b(i, true);
    }

    /* renamed from: a */
    static int m9835a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C1976do.m9253e(i) * size;
        if (list instanceof C2025ez) {
            C2025ez ezVar = (C2025ez) list;
            while (i4 < size) {
                Object b = ezVar.mo13851b(i4);
                if (b instanceof C1958cx) {
                    i3 = C1976do.m9238b((C1958cx) b);
                } else {
                    i3 = C1976do.m9241b((String) b);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C1958cx) {
                    i2 = C1976do.m9238b((C1958cx) obj);
                } else {
                    i2 = C1976do.m9241b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m9834a(int i, Object obj, C2061gh ghVar) {
        if (obj instanceof C2023ex) {
            return C1976do.m9226a(i, (C2023ex) obj);
        }
        return C1976do.m9235b(i, (C2043fq) obj, ghVar);
    }

    /* renamed from: a */
    static int m9836a(int i, List<?> list, C2061gh ghVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C1976do.m9253e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C2023ex) {
                i2 = C1976do.m9227a((C2023ex) obj);
            } else {
                i2 = C1976do.m9240b((C2043fq) obj, ghVar);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: b */
    static int m9851b(int i, List<C1958cx> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C1976do.m9253e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C1976do.m9238b(list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m9852b(int i, List<C2043fq> list, C2061gh ghVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C1976do.m9246c(i, list.get(i3), ghVar);
        }
        return i2;
    }

    /* renamed from: a */
    public static C2079gz<?, ?> m9839a() {
        return f7828b;
    }

    /* renamed from: b */
    public static C2079gz<?, ?> m9855b() {
        return f7829c;
    }

    /* renamed from: c */
    public static C2079gz<?, ?> m9861c() {
        return f7830d;
    }

    /* renamed from: a */
    private static C2079gz<?, ?> m9840a(boolean z) {
        try {
            Class<?> e = m9869e();
            if (e == null) {
                return null;
            }
            return (C2079gz) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m9865d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Class<?> m9869e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m9850a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    static <T> void m9847a(C2038fl flVar, T t, T t2, long j) {
        C2086hf.m10024a((Object) t, j, flVar.mo13915a(C2086hf.m10047f(t, j), C2086hf.m10047f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends C1996eb<FT>> void m9846a(C1990dw<FT> dwVar, T t, T t2) {
        C1993dz<FT> a = dwVar.mo13777a((Object) t2);
        if (!a.mo13787b()) {
            dwVar.mo13784b(t).mo13786a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m9848a(C2079gz<UT, UB> gzVar, T t, T t2) {
        gzVar.mo13990a((Object) t, gzVar.mo13998c(gzVar.mo13993b(t), gzVar.mo13993b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m9842a(int i, List<Integer> list, C2013en enVar, UB ub, C2079gz<UT, UB> gzVar) {
        UB ub2;
        if (enVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!enVar.mo13497a(intValue)) {
                        ub = m9841a(i, intValue, ub2, gzVar);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = list.get(i3).intValue();
                if (enVar.mo13497a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m9841a(i, intValue2, ub2, gzVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m9841a(int i, int i2, UB ub, C2079gz<UT, UB> gzVar) {
        if (ub == null) {
            ub = gzVar.mo13983a();
        }
        gzVar.mo13986a(ub, i, (long) i2);
        return ub;
    }
}
