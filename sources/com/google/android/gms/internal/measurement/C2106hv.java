package com.google.android.gms.internal.measurement;

import android.support.p037v7.widget.ActivityChooserView;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.hv */
public final class C2106hv {

    /* renamed from: a */
    private final byte[] f7924a;

    /* renamed from: b */
    private final int f7925b;

    /* renamed from: c */
    private final int f7926c;

    /* renamed from: d */
    private int f7927d;

    /* renamed from: e */
    private int f7928e;

    /* renamed from: f */
    private int f7929f;

    /* renamed from: g */
    private int f7930g;

    /* renamed from: h */
    private int f7931h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* renamed from: i */
    private int f7932i;

    /* renamed from: j */
    private int f7933j = 64;

    /* renamed from: k */
    private int f7934k = 67108864;

    /* renamed from: l */
    private C1971dj f7935l;

    /* renamed from: a */
    public static C2106hv m10190a(byte[] bArr) {
        return m10191a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C2106hv m10191a(byte[] bArr, int i, int i2) {
        return new C2106hv(bArr, 0, i2);
    }

    /* renamed from: a */
    public final int mo14049a() {
        if (this.f7929f == this.f7927d) {
            this.f7930g = 0;
            return 0;
        }
        this.f7930g = mo14060d();
        if (this.f7930g != 0) {
            return this.f7930g;
        }
        throw new C2115id("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo14051a(int i) {
        if (this.f7930g != i) {
            throw new C2115id("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public final boolean mo14057b(int i) {
        int a;
        switch (i & 7) {
            case 0:
                mo14060d();
                return true;
            case 1:
                mo14065g();
                return true;
            case 2:
                m10192f(mo14060d());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo14064f();
                return true;
            default:
                throw new C2115id("Protocol message tag had invalid wire type.");
        }
        do {
            a = mo14049a();
            if (a == 0 || !mo14057b(a)) {
                mo14051a(((i >>> 3) << 3) | 4);
                return true;
            }
            a = mo14049a();
            mo14051a(((i >>> 3) << 3) | 4);
            return true;
        } while (!mo14057b(a));
        mo14051a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final boolean mo14056b() {
        return mo14060d() != 0;
    }

    /* renamed from: c */
    public final String mo14059c() {
        int d = mo14060d();
        if (d < 0) {
            throw C2115id.m10274b();
        } else if (d <= this.f7927d - this.f7929f) {
            String str = new String(this.f7924a, this.f7929f, d, C2114ic.f7952a);
            this.f7929f += d;
            return str;
        } else {
            throw C2115id.m10273a();
        }
    }

    /* renamed from: a */
    public final void mo14053a(C2116ie ieVar, int i) {
        if (this.f7932i < this.f7933j) {
            this.f7932i++;
            ieVar.mo13498a(this);
            mo14051a((i << 3) | 4);
            this.f7932i--;
            return;
        }
        throw C2115id.m10276d();
    }

    /* renamed from: a */
    public final void mo14052a(C2116ie ieVar) {
        int d = mo14060d();
        if (this.f7932i < this.f7933j) {
            int c = mo14058c(d);
            this.f7932i++;
            ieVar.mo13498a(this);
            mo14051a(0);
            this.f7932i--;
            mo14061d(c);
            return;
        }
        throw C2115id.m10276d();
    }

    /* renamed from: d */
    public final int mo14060d() {
        byte l = m10195l();
        if (l >= 0) {
            return l;
        }
        byte b = l & Byte.MAX_VALUE;
        byte l2 = m10195l();
        if (l2 >= 0) {
            return b | (l2 << 7);
        }
        byte b2 = b | ((l2 & Byte.MAX_VALUE) << 7);
        byte l3 = m10195l();
        if (l3 >= 0) {
            return b2 | (l3 << 14);
        }
        byte b3 = b2 | ((l3 & Byte.MAX_VALUE) << 14);
        byte l4 = m10195l();
        if (l4 >= 0) {
            return b3 | (l4 << 21);
        }
        byte b4 = b3 | ((l4 & Byte.MAX_VALUE) << 21);
        byte l5 = m10195l();
        byte b5 = b4 | (l5 << 28);
        if (l5 >= 0) {
            return b5;
        }
        for (int i = 0; i < 5; i++) {
            if (m10195l() >= 0) {
                return b5;
            }
        }
        throw C2115id.m10275c();
    }

    /* renamed from: e */
    public final long mo14062e() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = m10195l();
            j |= ((long) (l & Byte.MAX_VALUE)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw C2115id.m10275c();
    }

    /* renamed from: f */
    public final int mo14064f() {
        return (m10195l() & 255) | ((m10195l() & 255) << 8) | ((m10195l() & 255) << 16) | ((m10195l() & 255) << 24);
    }

    /* renamed from: g */
    public final long mo14065g() {
        byte l = m10195l();
        byte l2 = m10195l();
        return ((((long) l2) & 255) << 8) | (((long) l) & 255) | ((((long) m10195l()) & 255) << 16) | ((((long) m10195l()) & 255) << 24) | ((((long) m10195l()) & 255) << 32) | ((((long) m10195l()) & 255) << 40) | ((((long) m10195l()) & 255) << 48) | ((((long) m10195l()) & 255) << 56);
    }

    private C2106hv(byte[] bArr, int i, int i2) {
        this.f7924a = bArr;
        this.f7925b = i;
        int i3 = i2 + i;
        this.f7927d = i3;
        this.f7926c = i3;
        this.f7929f = i;
    }

    /* renamed from: j */
    private final C1971dj m10193j() {
        if (this.f7935l == null) {
            this.f7935l = C1971dj.m9112a(this.f7924a, this.f7925b, this.f7926c);
        }
        int u = this.f7935l.mo13646u();
        int i = this.f7929f - this.f7925b;
        if (u <= i) {
            this.f7935l.mo13631f(i - u);
            this.f7935l.mo13625c(this.f7933j - this.f7932i);
            return this.f7935l;
        }
        throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i)}));
    }

    /* renamed from: a */
    public final <T extends C2003ei<T, ?>> T mo14050a(C2055gb<T> gbVar) {
        try {
            T t = (C2003ei) m10193j().mo13620a(gbVar, C1988dv.m9455b());
            mo14057b(this.f7930g);
            return t;
        } catch (C2015ep e) {
            throw new C2115id("", e);
        }
    }

    /* renamed from: c */
    public final int mo14058c(int i) {
        if (i >= 0) {
            int i2 = i + this.f7929f;
            int i3 = this.f7931h;
            if (i2 <= i3) {
                this.f7931h = i2;
                m10194k();
                return i3;
            }
            throw C2115id.m10273a();
        }
        throw C2115id.m10274b();
    }

    /* renamed from: k */
    private final void m10194k() {
        this.f7927d += this.f7928e;
        int i = this.f7927d;
        if (i > this.f7931h) {
            this.f7928e = i - this.f7931h;
            this.f7927d -= this.f7928e;
            return;
        }
        this.f7928e = 0;
    }

    /* renamed from: d */
    public final void mo14061d(int i) {
        this.f7931h = i;
        m10194k();
    }

    /* renamed from: h */
    public final int mo14066h() {
        if (this.f7931h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f7931h - this.f7929f;
    }

    /* renamed from: i */
    public final int mo14067i() {
        return this.f7929f - this.f7925b;
    }

    /* renamed from: a */
    public final byte[] mo14054a(int i, int i2) {
        if (i2 == 0) {
            return C2119ih.f7961d;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f7924a, this.f7925b + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: e */
    public final void mo14063e(int i) {
        mo14055b(i, this.f7930g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14055b(int i, int i2) {
        if (i > this.f7929f - this.f7925b) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(this.f7929f - this.f7925b);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f7929f = this.f7925b + i;
            this.f7930g = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: l */
    private final byte m10195l() {
        if (this.f7929f != this.f7927d) {
            byte[] bArr = this.f7924a;
            int i = this.f7929f;
            this.f7929f = i + 1;
            return bArr[i];
        }
        throw C2115id.m10273a();
    }

    /* renamed from: f */
    private final void m10192f(int i) {
        if (i < 0) {
            throw C2115id.m10274b();
        } else if (this.f7929f + i > this.f7931h) {
            m10192f(this.f7931h - this.f7929f);
            throw C2115id.m10273a();
        } else if (i <= this.f7927d - this.f7929f) {
            this.f7929f += i;
        } else {
            throw C2115id.m10273a();
        }
    }
}
