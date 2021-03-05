package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class bfy implements bcq {

    /* renamed from: a */
    private final bjc f4150a;

    /* renamed from: b */
    private final int f4151b;

    /* renamed from: c */
    private final bfw f4152c = new bfw();

    /* renamed from: d */
    private final bfx f4153d = new bfx();

    /* renamed from: e */
    private final bkh f4154e = new bkh(32);

    /* renamed from: f */
    private final AtomicInteger f4155f = new AtomicInteger();

    /* renamed from: g */
    private bfz f4156g = new bfz(0, this.f4151b);

    /* renamed from: h */
    private bfz f4157h = this.f4156g;

    /* renamed from: i */
    private zzfs f4158i;

    /* renamed from: j */
    private boolean f4159j;

    /* renamed from: k */
    private zzfs f4160k;

    /* renamed from: l */
    private long f4161l;

    /* renamed from: m */
    private long f4162m;

    /* renamed from: n */
    private int f4163n = this.f4151b;

    /* renamed from: o */
    private bga f4164o;

    public bfy(bjc bjc) {
        this.f4150a = bjc;
        this.f4151b = bjc.mo12007c();
    }

    /* renamed from: a */
    public final void mo11869a(boolean z) {
        int andSet = this.f4155f.getAndSet(z ? 0 : 2);
        m5302j();
        this.f4152c.mo11857b();
        if (andSet == 2) {
            this.f4158i = null;
        }
    }

    /* renamed from: a */
    public final int mo11864a() {
        return this.f4152c.mo11858c();
    }

    /* renamed from: a */
    public final void mo11866a(int i) {
        this.f4162m = this.f4152c.mo11851a(i);
        long j = this.f4162m;
        if (j == this.f4156g.f4165a) {
            m5297a(this.f4156g);
            this.f4156g = new bfz(j, this.f4151b);
            this.f4157h = this.f4156g;
            return;
        }
        bfz bfz = this.f4156g;
        bfz bfz2 = this.f4156g.f4169e;
        while (true) {
            bfz bfz3 = bfz2;
            bfz bfz4 = bfz;
            bfz = bfz3;
            if (j > bfz.f4165a) {
                bfz2 = bfz.f4169e;
            } else {
                m5297a(bfz);
                this.f4157h = bfz4;
                this.f4157h.f4169e = new bfz(this.f4157h.f4166b, this.f4151b);
                this.f4163n = (int) (j - this.f4157h.f4165a);
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo11871b() {
        if (this.f4155f.getAndSet(2) == 0) {
            m5302j();
        }
    }

    /* renamed from: c */
    public final boolean mo11872c() {
        return this.f4152c.mo11860e();
    }

    /* renamed from: d */
    public final int mo11873d() {
        return this.f4152c.mo11859d();
    }

    /* renamed from: e */
    public final zzfs mo11874e() {
        return this.f4152c.mo11861f();
    }

    /* renamed from: f */
    public final long mo11875f() {
        return this.f4152c.mo11862g();
    }

    /* renamed from: g */
    public final void mo11876g() {
        long h = this.f4152c.mo11863h();
        if (h != -1) {
            m5299b(h);
        }
    }

    /* renamed from: a */
    public final boolean mo11870a(long j, boolean z) {
        long a = this.f4152c.mo11852a(j, z);
        if (a == -1) {
            return false;
        }
        m5299b(a);
        return true;
    }

    /* renamed from: a */
    public final int mo11865a(baa baa, bbw bbw, boolean z, boolean z2, long j) {
        int i;
        switch (this.f4152c.mo11850a(baa, bbw, z, z2, this.f4158i, this.f4153d)) {
            case -5:
                this.f4158i = baa.f3268a;
                return -5;
            case -4:
                if (bbw.mo11648c()) {
                    return -4;
                }
                if (bbw.f3508c < j) {
                    bbw.mo11646b(Integer.MIN_VALUE);
                }
                if (bbw.mo11655e()) {
                    bfx bfx = this.f4153d;
                    long j2 = bfx.f4147b;
                    this.f4154e.mo12048a(1);
                    m5296a(j2, this.f4154e.f4559a, 1);
                    long j3 = j2 + 1;
                    byte b = this.f4154e.f4559a[0];
                    boolean z3 = (b & 128) != 0;
                    byte b2 = b & Byte.MAX_VALUE;
                    if (bbw.f3506a.f3487a == null) {
                        bbw.f3506a.f3487a = new byte[16];
                    }
                    m5296a(j3, bbw.f3506a.f3487a, (int) b2);
                    long j4 = j3 + ((long) b2);
                    if (z3) {
                        this.f4154e.mo12048a(2);
                        m5296a(j4, this.f4154e.f4559a, 2);
                        j4 += 2;
                        i = this.f4154e.mo12060g();
                    } else {
                        i = 1;
                    }
                    int[] iArr = bbw.f3506a.f3488b;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = bbw.f3506a.f3489c;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i2 = i * 6;
                        this.f4154e.mo12048a(i2);
                        m5296a(j4, this.f4154e.f4559a, i2);
                        j4 += (long) i2;
                        this.f4154e.mo12054c(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.f4154e.mo12060g();
                            iArr4[i3] = this.f4154e.mo12068o();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = bfx.f4146a - ((int) (j4 - bfx.f4147b));
                    }
                    bcr bcr = bfx.f4149d;
                    bbw.f3506a.mo11652a(i, iArr2, iArr4, bcr.f3531b, bbw.f3506a.f3487a, bcr.f3530a);
                    int i4 = (int) (j4 - bfx.f4147b);
                    bfx.f4147b += (long) i4;
                    bfx.f4146a -= i4;
                }
                bbw.mo11654d(this.f4153d.f4146a);
                long j5 = this.f4153d.f4147b;
                ByteBuffer byteBuffer = bbw.f3507b;
                int i5 = this.f4153d.f4146a;
                m5299b(j5);
                while (i5 > 0) {
                    int i6 = (int) (j5 - this.f4156g.f4165a);
                    int min = Math.min(i5, this.f4151b - i6);
                    bjb bjb = this.f4156g.f4168d;
                    byteBuffer.put(bjb.f4440a, bjb.mo12002a(i6), min);
                    j5 += (long) min;
                    i5 -= min;
                    if (j5 == this.f4156g.f4166b) {
                        this.f4150a.mo12004a(bjb);
                        this.f4156g = this.f4156g.mo11877a();
                    }
                }
                m5299b(this.f4153d.f4148c);
                return -4;
            case -3:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private final void m5296a(long j, byte[] bArr, int i) {
        m5299b(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f4156g.f4165a);
            int min = Math.min(i - i2, this.f4151b - i3);
            bjb bjb = this.f4156g.f4168d;
            System.arraycopy(bjb.f4440a, bjb.mo12002a(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.f4156g.f4166b) {
                this.f4150a.mo12004a(bjb);
                this.f4156g = this.f4156g.mo11877a();
            }
        }
    }

    /* renamed from: b */
    private final void m5299b(long j) {
        while (j >= this.f4156g.f4166b) {
            this.f4150a.mo12004a(this.f4156g.f4168d);
            this.f4156g = this.f4156g.mo11877a();
        }
    }

    /* renamed from: a */
    public final void mo11868a(bga bga) {
        this.f4164o = bga;
    }

    /* renamed from: a */
    public final void mo11867a(long j) {
        if (this.f4161l != j) {
            this.f4161l = j;
            this.f4159j = true;
        }
    }

    /* renamed from: a */
    public final void mo11682a(zzfs zzfs) {
        zzfs zzfs2;
        long j = this.f4161l;
        if (zzfs == null) {
            zzfs2 = null;
        } else {
            zzfs2 = (j == 0 || zzfs.f7221q == Long.MAX_VALUE) ? zzfs : zzfs.mo13407a(zzfs.f7221q + j);
        }
        boolean a = this.f4152c.mo11856a(zzfs2);
        this.f4160k = zzfs;
        this.f4159j = false;
        if (this.f4164o != null && a) {
            this.f4164o.mo11825a(zzfs2);
        }
    }

    /* renamed from: a */
    public final int mo11679a(bci bci, int i, boolean z) {
        if (!m5300h()) {
            int a = bci.mo11669a(i);
            if (a != -1) {
                return a;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int b = m5298b(i);
            bjb bjb = this.f4157h.f4168d;
            int a2 = bci.mo11670a(bjb.f4440a, bjb.mo12002a(this.f4163n), b);
            if (a2 != -1) {
                this.f4163n += a2;
                this.f4162m += (long) a2;
                m5301i();
                return a2;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        } finally {
            m5301i();
        }
    }

    /* renamed from: a */
    public final void mo11681a(bkh bkh, int i) {
        if (!m5300h()) {
            bkh.mo12056d(i);
            return;
        }
        while (i > 0) {
            int b = m5298b(i);
            bjb bjb = this.f4157h.f4168d;
            bkh.mo12050a(bjb.f4440a, bjb.mo12002a(this.f4163n), b);
            this.f4163n += b;
            this.f4162m += (long) b;
            i -= b;
        }
        m5301i();
    }

    /* renamed from: a */
    public final void mo11680a(long j, int i, int i2, int i3, bcr bcr) {
        long j2 = j;
        if (this.f4159j) {
            mo11682a(this.f4160k);
        }
        if (!m5300h()) {
            this.f4152c.mo11854a(j2);
            return;
        }
        try {
            this.f4152c.mo11855a(j2 + this.f4161l, i, (this.f4162m - ((long) i2)) - ((long) i3), i2, bcr);
        } finally {
            m5301i();
        }
    }

    /* renamed from: h */
    private final boolean m5300h() {
        return this.f4155f.compareAndSet(0, 1);
    }

    /* renamed from: i */
    private final void m5301i() {
        if (!this.f4155f.compareAndSet(1, 0)) {
            m5302j();
        }
    }

    /* renamed from: j */
    private final void m5302j() {
        this.f4152c.mo11853a();
        m5297a(this.f4156g);
        this.f4156g = new bfz(0, this.f4151b);
        this.f4157h = this.f4156g;
        this.f4162m = 0;
        this.f4163n = this.f4151b;
        this.f4150a.mo12006b();
    }

    /* renamed from: a */
    private final void m5297a(bfz bfz) {
        if (bfz.f4167c) {
            bjb[] bjbArr = new bjb[((this.f4157h.f4167c ? 1 : 0) + (((int) (this.f4157h.f4165a - bfz.f4165a)) / this.f4151b))];
            for (int i = 0; i < bjbArr.length; i++) {
                bjbArr[i] = bfz.f4168d;
                bfz = bfz.mo11877a();
            }
            this.f4150a.mo12005a(bjbArr);
        }
    }

    /* renamed from: b */
    private final int m5298b(int i) {
        if (this.f4163n == this.f4151b) {
            this.f4163n = 0;
            if (this.f4157h.f4167c) {
                this.f4157h = this.f4157h.f4169e;
            }
            bfz bfz = this.f4157h;
            bjb a = this.f4150a.mo12003a();
            bfz bfz2 = new bfz(this.f4157h.f4166b, this.f4151b);
            bfz.f4168d = a;
            bfz.f4169e = bfz2;
            bfz.f4167c = true;
        }
        return Math.min(i, this.f4151b - this.f4163n);
    }
}
