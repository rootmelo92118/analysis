package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p034v4.internal.view.SupportMenu;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public class C0932b {
    /* renamed from: b */
    private static void m1385b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: b */
    private static int m1384b(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: c */
    private static void m1387c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static int m1364a(Parcel parcel) {
        return m1384b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m1365a(Parcel parcel, int i) {
        m1387c(parcel, i);
    }

    /* renamed from: a */
    public static void m1379a(Parcel parcel, int i, boolean z) {
        m1385b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m1367a(Parcel parcel, int i, int i2) {
        m1385b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m1375a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m1385b(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1368a(Parcel parcel, int i, long j) {
        m1385b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m1376a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m1385b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1366a(Parcel parcel, int i, float f) {
        m1385b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m1374a(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m1385b(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1373a(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m1385b(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1377a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int b = m1384b(parcel, i);
            parcel.writeString(str);
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1370a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int b = m1384b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1372a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int b = m1384b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1369a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int b = m1384b(parcel, i);
            parcel.writeBundle(bundle);
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1380a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int b = m1384b(parcel, i);
            parcel.writeByteArray(bArr);
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1382a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int b = m1384b(parcel, i);
            parcel.writeStringArray(strArr);
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m1378a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int b = m1384b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: b */
    public static void m1386b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int b = m1384b(parcel, i);
            parcel.writeStringList(list);
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m1381a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int b = m1384b(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m1383a(parcel, t, i2);
                }
            }
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m1388c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int b = m1384b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m1383a(parcel, parcelable, 0);
                }
            }
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m1383a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static void m1371a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int b = m1384b(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m1387c(parcel, b);
        } else if (z) {
            m1385b(parcel, i, 0);
        }
    }
}
