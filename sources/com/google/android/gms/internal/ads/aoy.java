package com.google.android.gms.internal.ads;

final class aoy {
    /* renamed from: a */
    static int m2960a(byte[] bArr, int i, aoz aoz) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m2958a((int) b, bArr, i2, aoz);
        }
        aoz.f2155a = b;
        return i2;
    }

    /* renamed from: a */
    static int m2958a(int i, byte[] bArr, int i2, aoz aoz) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aoz.f2155a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aoz.f2155a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aoz.f2155a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aoz.f2155a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aoz.f2155a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: b */
    static int m2962b(byte[] bArr, int i, aoz aoz) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            aoz.f2156b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        aoz.f2156b = j2;
        return i3;
    }

    /* renamed from: a */
    static int m2959a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    static long m2963b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    static double m2964c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m2963b(bArr, i));
    }

    /* renamed from: d */
    static float m2966d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m2959a(bArr, i));
    }

    /* renamed from: c */
    static int m2965c(byte[] bArr, int i, aoz aoz) {
        int a = m2960a(bArr, i, aoz);
        int i2 = aoz.f2155a;
        if (i2 < 0) {
            throw aqv.m3508b();
        } else if (i2 == 0) {
            aoz.f2157c = "";
            return a;
        } else {
            aoz.f2157c = new String(bArr, a, i2, aqp.f2347a);
            return a + i2;
        }
    }

    /* renamed from: d */
    static int m2967d(byte[] bArr, int i, aoz aoz) {
        int a = m2960a(bArr, i, aoz);
        int i2 = aoz.f2155a;
        if (i2 < 0) {
            throw aqv.m3508b();
        } else if (i2 == 0) {
            aoz.f2157c = "";
            return a;
        } else {
            aoz.f2157c = atp.m4011b(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: e */
    static int m2968e(byte[] bArr, int i, aoz aoz) {
        int a = m2960a(bArr, i, aoz);
        int i2 = aoz.f2155a;
        if (i2 < 0) {
            throw aqv.m3508b();
        } else if (i2 > bArr.length - a) {
            throw aqv.m3507a();
        } else if (i2 == 0) {
            aoz.f2157c = apc.f2174a;
            return a;
        } else {
            aoz.f2157c = apc.m2987a(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: a */
    static int m2956a(int i, byte[] bArr, int i2, int i3, aqu<?> aqu, aoz aoz) {
        aqo aqo = (aqo) aqu;
        int a = m2960a(bArr, i2, aoz);
        aqo.mo11033c(aoz.f2155a);
        while (a < i3) {
            int a2 = m2960a(bArr, a, aoz);
            if (i != aoz.f2155a) {
                break;
            }
            a = m2960a(bArr, a2, aoz);
            aqo.mo11033c(aoz.f2155a);
        }
        return a;
    }

    /* renamed from: a */
    static int m2961a(byte[] bArr, int i, aqu<?> aqu, aoz aoz) {
        aqo aqo = (aqo) aqu;
        int a = m2960a(bArr, i, aoz);
        int i2 = aoz.f2155a + a;
        while (a < i2) {
            a = m2960a(bArr, a, aoz);
            aqo.mo11033c(aoz.f2155a);
        }
        if (a == i2) {
            return a;
        }
        throw aqv.m3507a();
    }

    /* renamed from: a */
    static int m2957a(int i, byte[] bArr, int i2, int i3, ath ath, aoz aoz) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 5) {
                switch (i4) {
                    case 0:
                        int b = m2962b(bArr, i2, aoz);
                        ath.mo11185a(i, (Object) Long.valueOf(aoz.f2156b));
                        return b;
                    case 1:
                        ath.mo11185a(i, (Object) Long.valueOf(m2963b(bArr, i2)));
                        return i2 + 8;
                    case 2:
                        int a = m2960a(bArr, i2, aoz);
                        int i5 = aoz.f2155a;
                        if (i5 < 0) {
                            throw aqv.m3508b();
                        } else if (i5 <= bArr.length - a) {
                            if (i5 == 0) {
                                ath.mo11185a(i, (Object) apc.f2174a);
                            } else {
                                ath.mo11185a(i, (Object) apc.m2987a(bArr, a, i5));
                            }
                            return a + i5;
                        } else {
                            throw aqv.m3507a();
                        }
                    case 3:
                        ath b2 = ath.m3877b();
                        int i6 = (i & -8) | 4;
                        int i7 = 0;
                        while (true) {
                            if (i2 < i3) {
                                int a2 = m2960a(bArr, i2, aoz);
                                int i8 = aoz.f2155a;
                                if (i8 != i6) {
                                    i7 = i8;
                                    i2 = m2957a(i8, bArr, a2, i3, b2, aoz);
                                } else {
                                    i7 = i8;
                                    i2 = a2;
                                }
                            }
                        }
                        if (i2 > i3 || i7 != i6) {
                            throw aqv.m3514h();
                        }
                        ath.mo11185a(i, (Object) b2);
                        return i2;
                    default:
                        throw aqv.m3510d();
                }
            } else {
                ath.mo11185a(i, (Object) Integer.valueOf(m2959a(bArr, i2)));
                return i2 + 4;
            }
        } else {
            throw aqv.m3510d();
        }
    }

    /* renamed from: a */
    static int m2955a(int i, byte[] bArr, int i2, int i3, aoz aoz) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 5) {
                return i2 + 4;
            }
            switch (i4) {
                case 0:
                    return m2962b(bArr, i2, aoz);
                case 1:
                    return i2 + 8;
                case 2:
                    return m2960a(bArr, i2, aoz) + aoz.f2155a;
                case 3:
                    int i5 = (i & -8) | 4;
                    int i6 = 0;
                    while (i2 < i3) {
                        i2 = m2960a(bArr, i2, aoz);
                        i6 = aoz.f2155a;
                        if (i6 != i5) {
                            i2 = m2955a(i6, bArr, i2, i3, aoz);
                        } else if (i2 > i3 && i6 == i5) {
                            return i2;
                        } else {
                            throw aqv.m3514h();
                        }
                    }
                    if (i2 > i3) {
                    }
                    throw aqv.m3514h();
                default:
                    throw aqv.m3510d();
            }
        } else {
            throw aqv.m3510d();
        }
    }
}
