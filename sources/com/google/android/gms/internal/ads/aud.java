package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.io.IOException;

public final class aud {

    /* renamed from: a */
    private final byte[] f2554a;

    /* renamed from: b */
    private final int f2555b;

    /* renamed from: c */
    private final int f2556c;

    /* renamed from: d */
    private int f2557d;

    /* renamed from: e */
    private int f2558e;

    /* renamed from: f */
    private int f2559f;

    /* renamed from: g */
    private int f2560g;

    /* renamed from: h */
    private int f2561h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* renamed from: i */
    private int f2562i;

    /* renamed from: j */
    private int f2563j = 64;

    /* renamed from: k */
    private int f2564k = 67108864;

    /* renamed from: l */
    private apo f2565l;

    /* renamed from: a */
    public static aud m4112a(byte[] bArr, int i, int i2) {
        return new aud(bArr, 0, i2);
    }

    /* renamed from: a */
    public final int mo11250a() {
        if (this.f2559f == this.f2557d) {
            this.f2560g = 0;
            return 0;
        }
        this.f2560g = mo11265g();
        if (this.f2560g != 0) {
            return this.f2560g;
        }
        throw new aul("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo11252a(int i) {
        if (this.f2560g != i) {
            throw new aul("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public final boolean mo11257b(int i) {
        int a;
        switch (i & 7) {
            case 0:
                mo11265g();
                return true;
            case 1:
                m4115l();
                m4115l();
                m4115l();
                m4115l();
                m4115l();
                m4115l();
                m4115l();
                m4115l();
                return true;
            case 2:
                m4113f(mo11265g());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m4115l();
                m4115l();
                m4115l();
                m4115l();
                return true;
            default:
                throw new aul("Protocol message tag had invalid wire type.");
        }
        do {
            a = mo11250a();
            if (a == 0 || !mo11257b(a)) {
                mo11252a(((i >>> 3) << 3) | 4);
                return true;
            }
            a = mo11250a();
            mo11252a(((i >>> 3) << 3) | 4);
            return true;
        } while (!mo11257b(a));
        mo11252a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final long mo11255b() {
        return mo11266h();
    }

    /* renamed from: c */
    public final int mo11258c() {
        return mo11265g();
    }

    /* renamed from: d */
    public final boolean mo11261d() {
        return mo11265g() != 0;
    }

    /* renamed from: e */
    public final String mo11262e() {
        int g = mo11265g();
        if (g < 0) {
            throw aul.m4182b();
        } else if (g <= this.f2557d - this.f2559f) {
            String str = new String(this.f2554a, this.f2559f, g, auk.f2579a);
            this.f2559f += g;
            return str;
        } else {
            throw aul.m4181a();
        }
    }

    /* renamed from: a */
    public final void mo11253a(aum aum) {
        int g = mo11265g();
        if (this.f2562i < this.f2563j) {
            int c = mo11259c(g);
            this.f2562i++;
            aum.mo10483a(this);
            mo11252a(0);
            this.f2562i--;
            mo11260d(c);
            return;
        }
        throw new aul("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: f */
    public final byte[] mo11264f() {
        int g = mo11265g();
        if (g < 0) {
            throw aul.m4182b();
        } else if (g == 0) {
            return auq.f2594e;
        } else {
            if (g <= this.f2557d - this.f2559f) {
                byte[] bArr = new byte[g];
                System.arraycopy(this.f2554a, this.f2559f, bArr, 0, g);
                this.f2559f += g;
                return bArr;
            }
            throw aul.m4181a();
        }
    }

    /* renamed from: g */
    public final int mo11265g() {
        byte l = m4115l();
        if (l >= 0) {
            return l;
        }
        byte b = l & Byte.MAX_VALUE;
        byte l2 = m4115l();
        if (l2 >= 0) {
            return b | (l2 << 7);
        }
        byte b2 = b | ((l2 & Byte.MAX_VALUE) << 7);
        byte l3 = m4115l();
        if (l3 >= 0) {
            return b2 | (l3 << 14);
        }
        byte b3 = b2 | ((l3 & Byte.MAX_VALUE) << 14);
        byte l4 = m4115l();
        if (l4 >= 0) {
            return b3 | (l4 << 21);
        }
        byte b4 = b3 | ((l4 & Byte.MAX_VALUE) << 21);
        byte l5 = m4115l();
        byte b5 = b4 | (l5 << 28);
        if (l5 >= 0) {
            return b5;
        }
        for (int i = 0; i < 5; i++) {
            if (m4115l() >= 0) {
                return b5;
            }
        }
        throw aul.m4183c();
    }

    /* renamed from: h */
    public final long mo11266h() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = m4115l();
            j |= ((long) (l & Byte.MAX_VALUE)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw aul.m4183c();
    }

    private aud(byte[] bArr, int i, int i2) {
        this.f2554a = bArr;
        this.f2555b = i;
        int i3 = i2 + i;
        this.f2557d = i3;
        this.f2556c = i3;
        this.f2559f = i;
    }

    /* renamed from: a */
    public final <T extends aqn<T, ?>> T mo11251a(ash<T> ash) {
        try {
            if (this.f2565l == null) {
                this.f2565l = apo.m3031a(this.f2554a, this.f2555b, this.f2556c);
            }
            int u = this.f2565l.mo10844u();
            int i = this.f2559f - this.f2555b;
            if (u <= i) {
                this.f2565l.mo10829f(i - u);
                this.f2565l.mo10823c(this.f2563j - this.f2562i);
                T t = (aqn) this.f2565l.mo10818a(ash, apz.m3375b());
                mo11257b(this.f2560g);
                return t;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i)}));
        } catch (aqv e) {
            throw new aul("", e);
        }
    }

    /* renamed from: c */
    public final int mo11259c(int i) {
        if (i >= 0) {
            int i2 = i + this.f2559f;
            int i3 = this.f2561h;
            if (i2 <= i3) {
                this.f2561h = i2;
                m4114k();
                return i3;
            }
            throw aul.m4181a();
        }
        throw aul.m4182b();
    }

    /* renamed from: k */
    private final void m4114k() {
        this.f2557d += this.f2558e;
        int i = this.f2557d;
        if (i > this.f2561h) {
            this.f2558e = i - this.f2561h;
            this.f2557d -= this.f2558e;
            return;
        }
        this.f2558e = 0;
    }

    /* renamed from: d */
    public final void mo11260d(int i) {
        this.f2561h = i;
        m4114k();
    }

    /* renamed from: i */
    public final int mo11267i() {
        if (this.f2561h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f2561h - this.f2559f;
    }

    /* renamed from: j */
    public final int mo11268j() {
        return this.f2559f - this.f2555b;
    }

    /* renamed from: a */
    public final byte[] mo11254a(int i, int i2) {
        if (i2 == 0) {
            return auq.f2594e;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f2554a, this.f2555b + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: e */
    public final void mo11263e(int i) {
        mo11256b(i, this.f2560g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11256b(int i, int i2) {
        if (i > this.f2559f - this.f2555b) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(this.f2559f - this.f2555b);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f2559f = this.f2555b + i;
            this.f2560g = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: l */
    private final byte m4115l() {
        if (this.f2559f != this.f2557d) {
            byte[] bArr = this.f2554a;
            int i = this.f2559f;
            this.f2559f = i + 1;
            return bArr[i];
        }
        throw aul.m4181a();
    }

    /* renamed from: f */
    private final void m4113f(int i) {
        if (i < 0) {
            throw aul.m4182b();
        } else if (this.f2559f + i > this.f2561h) {
            m4113f(this.f2561h - this.f2559f);
            throw aul.m4181a();
        } else if (i <= this.f2557d - this.f2559f) {
            this.f2559f += i;
        } else {
            throw aul.m4181a();
        }
    }
}
