package com.google.android.gms.internal.ads;

import android.support.p034v4.media.session.PlaybackStateCompat;

final class bea {

    /* renamed from: a */
    private static final int[] f3881a = {bkp.m5828f("isom"), bkp.m5828f("iso2"), bkp.m5828f("iso3"), bkp.m5828f("iso4"), bkp.m5828f("iso5"), bkp.m5828f("iso6"), bkp.m5828f("avc1"), bkp.m5828f("hvc1"), bkp.m5828f("hev1"), bkp.m5828f("mp41"), bkp.m5828f("mp42"), bkp.m5828f("3g2a"), bkp.m5828f("3g2b"), bkp.m5828f("3gr6"), bkp.m5828f("3gs6"), bkp.m5828f("3ge6"), bkp.m5828f("3gg6"), bkp.m5828f("M4V "), bkp.m5828f("M4A "), bkp.m5828f("f4v "), bkp.m5828f("kddi"), bkp.m5828f("M4VP"), bkp.m5828f("qt  "), bkp.m5828f("MSNV")};

    /* renamed from: a */
    public static boolean m5083a(bci bci) {
        return m5084a(bci, true);
    }

    /* renamed from: b */
    public static boolean m5085b(bci bci) {
        return m5084a(bci, false);
    }

    /* renamed from: a */
    private static boolean m5084a(bci bci, boolean z) {
        boolean z2;
        boolean z3;
        bci bci2 = bci;
        long c = bci.mo11676c();
        if (c == -1 || c > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            c = 4096;
        }
        int i = (int) c;
        bkh bkh = new bkh(64);
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            bkh.mo12048a(8);
            bci2.mo11678c(bkh.f4559a, 0, 8);
            long j = bkh.mo12063j();
            int l = bkh.mo12065l();
            int i3 = 16;
            if (j == 1) {
                bci2.mo11678c(bkh.f4559a, 8, 8);
                bkh.mo12052b(16);
                j = bkh.mo12069p();
            } else {
                i3 = 8;
            }
            long j2 = (long) i3;
            if (j >= j2) {
                i2 += i3;
                if (l != bdd.f3647B) {
                    if (l != bdd.f3656K && l != bdd.f3658M) {
                        if ((((long) i2) + j) - j2 >= ((long) i)) {
                            break;
                        }
                        int i4 = (int) (j - j2);
                        i2 += i4;
                        if (l == bdd.f3672a) {
                            if (i4 < 8) {
                                return false;
                            }
                            bkh.mo12048a(i4);
                            bci2.mo11678c(bkh.f4559a, 0, i4);
                            int i5 = i4 / 4;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    break;
                                }
                                if (i6 == 1) {
                                    bkh.mo12056d(4);
                                } else {
                                    int l2 = bkh.mo12065l();
                                    if ((l2 >>> 8) != bkp.m5828f("3gp")) {
                                        int[] iArr = f3881a;
                                        int length = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length) {
                                                z3 = false;
                                                break;
                                            } else if (iArr[i7] == l2) {
                                                break;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    if (z3) {
                                        z4 = true;
                                        break;
                                    }
                                }
                                i6++;
                            }
                            if (!z4) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            bci2.mo11677c(i4);
                        }
                    } else {
                        z2 = true;
                    }
                }
            } else {
                return false;
            }
        }
        z2 = false;
        if (!z4 || z != z2) {
            return false;
        }
        return true;
    }
}
