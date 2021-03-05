package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class aod implements aiz {

    /* renamed from: a */
    private Mac f2124a;

    /* renamed from: b */
    private final int f2125b;

    /* renamed from: c */
    private final String f2126c;

    /* renamed from: d */
    private final Key f2127d;

    public aod(String str, Key key, int i) {
        String str2;
        if (i >= 10) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (i > 20) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 1:
                    if (i > 32) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 2:
                    if (i > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                default:
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        str2 = "unknown Hmac algorithm: ".concat(valueOf);
                    } else {
                        str2 = new String("unknown Hmac algorithm: ");
                    }
                    throw new NoSuchAlgorithmException(str2);
            }
            this.f2126c = str;
            this.f2125b = i;
            this.f2127d = key;
            this.f2124a = ans.f2112b.mo10740a(str);
            this.f2124a.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo10602a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.f2124a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = ans.f2112b.mo10740a(this.f2126c);
            mac.init(this.f2127d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f2125b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f2125b);
        return bArr2;
    }
}
