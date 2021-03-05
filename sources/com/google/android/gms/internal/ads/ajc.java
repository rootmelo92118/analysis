package com.google.android.gms.internal.ads;

public final class ajc {
    /* renamed from: a */
    public static int m2396a(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        if (i >= 1000 && i <= 1000) {
            return i;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append(i);
        sb.append(" is not a valid enum EnumBoolean");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static int m2397b(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append(i);
        sb.append(" is not a valid enum ProtoName");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public static int m2398c(int i) {
        if (i >= 0 && i <= 3) {
            return i;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append(i);
        sb.append(" is not a valid enum EncryptionMethod");
        throw new IllegalArgumentException(sb.toString());
    }
}
