package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C0924o;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.util.b */
public final class C0966b {
    /* renamed from: a */
    public static <T> boolean m1460a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C0924o.m1303a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> void m1457a(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(tArr[i].toString());
        }
    }

    /* renamed from: a */
    public static void m1455a(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    /* renamed from: a */
    public static void m1456a(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    /* renamed from: a */
    public static void m1454a(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    /* renamed from: a */
    public static void m1453a(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    /* renamed from: a */
    public static void m1459a(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    /* renamed from: a */
    public static void m1458a(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }

    /* renamed from: a */
    public static <T> T[] m1461a(T[] tArr, T... tArr2) {
        int i;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || tArr2.length == 0) {
            return Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length);
        if (tArr2.length == 1) {
            i = 0;
            for (T t : tArr) {
                if (!C0924o.m1303a(tArr2[0], t)) {
                    tArr3[i] = t;
                    i++;
                }
            }
        } else {
            i = 0;
            for (T t2 : tArr) {
                if (!m1460a(tArr2, t2)) {
                    tArr3[i] = t2;
                    i++;
                }
            }
        }
        if (tArr3 == null) {
            return null;
        }
        if (i != tArr3.length) {
            return Arrays.copyOf(tArr3, i);
        }
        return tArr3;
    }
}
