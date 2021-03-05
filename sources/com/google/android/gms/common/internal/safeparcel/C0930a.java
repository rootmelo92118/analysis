package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p034v4.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C0930a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    public static class C0931a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0931a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.C0930a.C0931a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: a */
    public static int m1330a(int i) {
        return i & SupportMenu.USER_MASK;
    }

    /* renamed from: a */
    public static int m1331a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    public static int m1332a(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & SupportMenu.USER_MASK : parcel.readInt();
    }

    /* renamed from: b */
    public static void m1337b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m1332a(parcel, i));
    }

    /* renamed from: a */
    private static void m1334a(Parcel parcel, int i, int i2) {
        int a = m1332a(parcel, i);
        if (a != i2) {
            String hexString = Integer.toHexString(a);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(a);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C0931a(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m1335a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C0931a(sb.toString(), parcel);
        }
    }

    /* renamed from: b */
    public static int m1336b(Parcel parcel) {
        int a = m1331a(parcel);
        int a2 = m1332a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m1330a(a) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new C0931a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = a2 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C0931a(sb.toString(), parcel);
    }

    /* renamed from: c */
    public static boolean m1340c(Parcel parcel, int i) {
        m1334a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static int m1341d(Parcel parcel, int i) {
        m1334a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: e */
    public static Integer m1342e(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        if (a == 0) {
            return null;
        }
        m1335a(parcel, i, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: f */
    public static long m1343f(Parcel parcel, int i) {
        m1334a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: g */
    public static Long m1344g(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        if (a == 0) {
            return null;
        }
        m1335a(parcel, i, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: h */
    public static BigInteger m1345h(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return new BigInteger(createByteArray);
    }

    /* renamed from: i */
    public static float m1346i(Parcel parcel, int i) {
        m1334a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: j */
    public static Float m1347j(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        if (a == 0) {
            return null;
        }
        m1335a(parcel, i, a, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: k */
    public static double m1348k(Parcel parcel, int i) {
        m1334a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: l */
    public static Double m1349l(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        if (a == 0) {
            return null;
        }
        m1335a(parcel, i, a, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: m */
    public static BigDecimal m1350m(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + a);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: n */
    public static String m1351n(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a);
        return readString;
    }

    /* renamed from: o */
    public static IBinder m1352o(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m1333a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a);
        return t;
    }

    /* renamed from: p */
    public static Bundle m1353p(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a);
        return readBundle;
    }

    /* renamed from: q */
    public static byte[] m1354q(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return createByteArray;
    }

    /* renamed from: r */
    public static boolean[] m1355r(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + a);
        return createBooleanArray;
    }

    /* renamed from: s */
    public static int[] m1356s(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + a);
        return createIntArray;
    }

    /* renamed from: t */
    public static long[] m1357t(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + a);
        return createLongArray;
    }

    /* renamed from: u */
    public static BigInteger[] m1358u(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigIntegerArr;
    }

    /* renamed from: v */
    public static float[] m1359v(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + a);
        return createFloatArray;
    }

    /* renamed from: w */
    public static double[] m1360w(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + a);
        return createDoubleArray;
    }

    /* renamed from: x */
    public static BigDecimal[] m1361x(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }

    /* renamed from: y */
    public static String[] m1362y(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    /* renamed from: z */
    public static ArrayList<Integer> m1363z(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    /* renamed from: A */
    public static ArrayList<String> m1326A(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    /* renamed from: b */
    public static <T> T[] m1338b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArray;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m1339c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    /* renamed from: B */
    public static Parcel m1327B(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(dataPosition + a);
        return obtain;
    }

    /* renamed from: C */
    public static Parcel[] m1328C(Parcel parcel, int i) {
        int a = m1332a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }

    /* renamed from: D */
    public static void m1329D(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C0931a(sb.toString(), parcel);
        }
    }
}
