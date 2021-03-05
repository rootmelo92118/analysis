package com.p051vm.shadowsocks.core;

import com.p051vm.shadowsocks.tcpip.CommonMethods;
import java.util.Locale;

/* renamed from: com.vm.shadowsocks.core.HttpHostHeaderParser */
public class HttpHostHeaderParser {
    public static String parseHost(byte[] bArr, int i, int i2) {
        try {
            switch (bArr[i]) {
                case 22:
                    return getSNI(bArr, i, i2);
                case 67:
                case 68:
                case 71:
                case 72:
                case 79:
                case 80:
                case 84:
                    return getHttpHost(bArr, i, i2);
                default:
                    return null;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    static String getHttpHost(byte[] bArr, int i, int i2) {
        String[] split = new String(bArr, i, i2).split("\\r\\n");
        String str = split[0];
        if (!str.startsWith("GET") && !str.startsWith("POST") && !str.startsWith("HEAD") && !str.startsWith("OPTIONS")) {
            return null;
        }
        for (int i3 = 1; i3 < split.length; i3++) {
            String[] split2 = split[i3].split(":");
            if (split2.length == 2) {
                String trim = split2[0].toLowerCase(Locale.ENGLISH).trim();
                String trim2 = split2[1].trim();
                if ("host".equals(trim)) {
                    return trim2;
                }
            }
        }
        return null;
    }

    static String getSNI(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int readShort;
        int readShort2;
        int i7;
        int i8;
        int i9 = i + i2;
        if (i2 <= 43 || bArr[i] != 22 || (i4 = i3 + 1) > i9 || (i6 = i5 + 2) > i9 || (readShort2 = (readShort = i6 + (CommonMethods.readShort(bArr, (i5 = i4 + (bArr[(i3 = i + 43)] & 255))) & 65535)) + 1) > i9 || (i7 = readShort2 + (bArr[readShort] & 255)) == i9 || (i8 = i7 + 2) > i9 || (CommonMethods.readShort(bArr, i7) & 65535) + i8 > i9) {
            return null;
        }
        while (i8 + 4 <= i9) {
            int i10 = i8 + 1;
            byte b = bArr[i8] & 255;
            int i11 = i10 + 1;
            byte b2 = bArr[i10] & 255;
            short readShort3 = CommonMethods.readShort(bArr, i11) & 65535;
            int i12 = i11 + 2;
            if (b == 0 && b2 == 0 && readShort3 > 5) {
                int i13 = i12 + 5;
                int i14 = readShort3 - 5;
                if (i13 + i14 > i9) {
                    return null;
                }
                return new String(bArr, i13, i14);
            }
            i8 = i12 + readShort3;
        }
        return null;
    }
}
