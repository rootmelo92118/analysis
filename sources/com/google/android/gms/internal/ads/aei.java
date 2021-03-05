package com.google.android.gms.internal.ads;

@C1598qn
final class aei extends C1745vz {

    /* renamed from: a */
    static final aei f1517a = new aei();

    aei() {
    }

    /* renamed from: a */
    public final abe mo10282a(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new add();
        }
        if ("mvhd".equals(str)) {
            return new aed();
        }
        return new afe(str);
    }
}
