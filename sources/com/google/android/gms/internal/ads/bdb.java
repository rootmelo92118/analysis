package com.google.android.gms.internal.ads;

import android.support.p034v4.media.session.PlaybackStateCompat;

final class bdb {

    /* renamed from: a */
    private final bkh f3640a = new bkh(8);

    /* renamed from: b */
    private int f3641b;

    /* renamed from: a */
    public final boolean mo11714a(bci bci) {
        bci bci2 = bci;
        long c = bci.mo11676c();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (c != -1 && c <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = c;
        }
        int i = (int) j;
        bci2.mo11678c(this.f3640a.f4559a, 0, 4);
        this.f3641b = 4;
        for (long j2 = this.f3640a.mo12063j(); j2 != 440786851; j2 = ((j2 << 8) & -256) | ((long) (this.f3640a.f4559a[0] & 255))) {
            int i2 = this.f3641b + 1;
            this.f3641b = i2;
            if (i2 == i) {
                return false;
            }
            bci2.mo11678c(this.f3640a.f4559a, 0, 1);
        }
        long b = m5018b(bci);
        long j3 = (long) this.f3641b;
        if (b == Long.MIN_VALUE || (c != -1 && j3 + b >= c)) {
            return false;
        }
        while (true) {
            long j4 = j3 + b;
            if (((long) this.f3641b) < j4) {
                if (m5018b(bci) == Long.MIN_VALUE) {
                    return false;
                }
                long b2 = m5018b(bci);
                if (b2 < 0 || b2 > 2147483647L) {
                    return false;
                }
                if (b2 != 0) {
                    bci2.mo11677c((int) b2);
                    this.f3641b = (int) (((long) this.f3641b) + b2);
                }
            } else if (((long) this.f3641b) == j4) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final long m5018b(bci bci) {
        int i = 0;
        bci.mo11678c(this.f3640a.f4559a, 0, 1);
        byte b = this.f3640a.f4559a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        bci.mo11678c(this.f3640a.f4559a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f3640a.f4559a[i] & 255) + (i4 << 8);
        }
        this.f3641b += i3 + 1;
        return (long) i4;
    }
}
