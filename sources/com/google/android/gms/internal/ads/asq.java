package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class asq {

    /* renamed from: a */
    private static final Class<?> f2438a = m3795d();

    /* renamed from: b */
    private static final atg<?, ?> f2439b = m3770a(false);

    /* renamed from: c */
    private static final atg<?, ?> f2440c = m3770a(true);

    /* renamed from: d */
    private static final atg<?, ?> f2441d = new ati();

    /* renamed from: a */
    public static void m3779a(Class<?> cls) {
        if (!aqn.class.isAssignableFrom(cls) && f2438a != null && !f2438a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    public static void m3775a(int i, List<Double> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10959g(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m3788b(int i, List<Float> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10958f(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m3792c(int i, List<Long> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10950c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m3796d(int i, List<Long> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10953d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m3800e(int i, List<Long> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10966n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m3803f(int i, List<Long> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10956e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m3806g(int i, List<Long> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10964l(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m3809h(int i, List<Integer> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10939a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m3812i(int i, List<Integer> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10962j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m3815j(int i, List<Integer> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10965m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m3816k(int i, List<Integer> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10947b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m3817l(int i, List<Integer> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10963k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m3818m(int i, List<Integer> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10960h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m3819n(int i, List<Boolean> list, auc auc, boolean z) {
        if (list != null && !list.isEmpty()) {
            auc.mo10961i(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m3773a(int i, List<String> list, auc auc) {
        if (list != null && !list.isEmpty()) {
            auc.mo10937a(i, list);
        }
    }

    /* renamed from: b */
    public static void m3786b(int i, List<apc> list, auc auc) {
        if (list != null && !list.isEmpty()) {
            auc.mo10945b(i, list);
        }
    }

    /* renamed from: a */
    public static void m3774a(int i, List<?> list, auc auc, aso aso) {
        if (list != null && !list.isEmpty()) {
            auc.mo10938a(i, list, aso);
        }
    }

    /* renamed from: b */
    public static void m3787b(int i, List<?> list, auc auc, aso aso) {
        if (list != null && !list.isEmpty()) {
            auc.mo10946b(i, list, aso);
        }
    }

    /* renamed from: a */
    static int m3768a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof arj) {
            arj arj = (arj) list;
            i = 0;
            while (i2 < size) {
                i += apt.m3171d(arj.mo11063b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + apt.m3171d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m3767a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m3768a(list) + (list.size() * apt.m3173e(i));
    }

    /* renamed from: b */
    static int m3784b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof arj) {
            arj arj = (arj) list;
            i = 0;
            while (i2 < size) {
                i += apt.m3175e(arj.mo11063b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + apt.m3175e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m3783b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3784b(list) + (size * apt.m3173e(i));
    }

    /* renamed from: c */
    static int m3790c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof arj) {
            arj arj = (arj) list;
            i = 0;
            while (i2 < size) {
                i += apt.m3179f(arj.mo11063b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + apt.m3179f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    static int m3789c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3790c(list) + (size * apt.m3173e(i));
    }

    /* renamed from: d */
    static int m3794d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            i = 0;
            while (i2 < size) {
                i += apt.m3193k(aqo.mo11032b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + apt.m3193k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m3793d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3794d(list) + (size * apt.m3173e(i));
    }

    /* renamed from: e */
    static int m3798e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            i = 0;
            while (i2 < size) {
                i += apt.m3176f(aqo.mo11032b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + apt.m3176f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m3797e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3798e(list) + (size * apt.m3173e(i));
    }

    /* renamed from: f */
    static int m3802f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            i = 0;
            while (i2 < size) {
                i += apt.m3180g(aqo.mo11032b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + apt.m3180g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m3801f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3802f(list) + (size * apt.m3173e(i));
    }

    /* renamed from: g */
    static int m3805g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            i = 0;
            while (i2 < size) {
                i += apt.m3184h(aqo.mo11032b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + apt.m3184h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m3804g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3805g(list) + (size * apt.m3173e(i));
    }

    /* renamed from: h */
    static int m3808h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    static int m3807h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * apt.m3189i(i, 0);
    }

    /* renamed from: i */
    static int m3811i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    static int m3810i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * apt.m3182g(i, 0);
    }

    /* renamed from: j */
    static int m3814j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    static int m3813j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * apt.m3157b(i, true);
    }

    /* renamed from: a */
    static int m3765a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = apt.m3173e(i) * size;
        if (list instanceof are) {
            are are = (are) list;
            while (i4 < size) {
                Object b = are.mo11054b(i4);
                if (b instanceof apc) {
                    i3 = apt.m3158b((apc) b);
                } else {
                    i3 = apt.m3161b((String) b);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof apc) {
                    i2 = apt.m3158b((apc) obj);
                } else {
                    i2 = apt.m3161b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m3764a(int i, Object obj, aso aso) {
        if (obj instanceof arc) {
            return apt.m3146a(i, (arc) obj);
        }
        return apt.m3155b(i, (arw) obj, aso);
    }

    /* renamed from: a */
    static int m3766a(int i, List<?> list, aso aso) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = apt.m3173e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof arc) {
                i2 = apt.m3147a((arc) obj);
            } else {
                i2 = apt.m3160b((arw) obj, aso);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: b */
    static int m3781b(int i, List<apc> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * apt.m3173e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += apt.m3158b(list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m3782b(int i, List<arw> list, aso aso) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += apt.m3166c(i, list.get(i3), aso);
        }
        return i2;
    }

    /* renamed from: a */
    public static atg<?, ?> m3769a() {
        return f2439b;
    }

    /* renamed from: b */
    public static atg<?, ?> m3785b() {
        return f2440c;
    }

    /* renamed from: c */
    public static atg<?, ?> m3791c() {
        return f2441d;
    }

    /* renamed from: a */
    private static atg<?, ?> m3770a(boolean z) {
        try {
            Class<?> e = m3799e();
            if (e == null) {
                return null;
            }
            return (atg) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m3795d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Class<?> m3799e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m3780a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    static <T> void m3777a(arr arr, T t, T t2, long j) {
        atn.m3922a((Object) t, j, arr.mo11080a(atn.m3944f(t, j), atn.m3944f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends aqf<FT>> void m3776a(aqa<FT> aqa, T t, T t2) {
        aqd<FT> a = aqa.mo10979a((Object) t2);
        if (!a.mo10990b()) {
            aqa.mo10987b(t).mo10989a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m3778a(atg<UT, UB> atg, T t, T t2) {
        atg.mo11173a((Object) t, atg.mo11181c(atg.mo11176b(t), atg.mo11176b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m3772a(int i, List<Integer> list, aqs aqs, UB ub, atg<UT, UB> atg) {
        UB ub2;
        if (aqs == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!aqs.mo11037a(intValue)) {
                        ub = m3771a(i, intValue, ub2, atg);
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
                if (aqs.mo11037a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m3771a(i, intValue2, ub2, atg);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m3771a(int i, int i2, UB ub, atg<UT, UB> atg) {
        if (ub == null) {
            ub = atg.mo11166a();
        }
        atg.mo11169a(ub, i, (long) i2);
        return ub;
    }
}
