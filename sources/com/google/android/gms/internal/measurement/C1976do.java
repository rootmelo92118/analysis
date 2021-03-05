package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.do */
public abstract class C1976do extends C1957cw {

    /* renamed from: b */
    private static final Logger f7614b = Logger.getLogger(C1976do.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f7615c = C2086hf.m10028a();

    /* renamed from: a */
    C1983dq f7616a;

    /* renamed from: com.google.android.gms.internal.measurement.do$b */
    static final class C1978b extends C1977a {

        /* renamed from: b */
        private final ByteBuffer f7621b;

        /* renamed from: c */
        private int f7622c;

        C1978b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f7621b = byteBuffer;
            this.f7622c = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo13689a() {
            this.f7621b.position(this.f7622c + mo13726d());
        }
    }

    /* renamed from: a */
    public static C1976do m9229a(byte[] bArr) {
        return new C1977a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m9230b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m9231b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m9242b(boolean z) {
        return 1;
    }

    /* renamed from: e */
    public static int m9255e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: g */
    public static int m9260g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m9263g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m9267h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m9268i(int i) {
        return 4;
    }

    /* renamed from: i */
    private static long m9270i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m9271j(int i) {
        return 4;
    }

    /* renamed from: m */
    private static int m9276m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo13689a();

    /* renamed from: a */
    public abstract void mo13690a(byte b);

    /* renamed from: a */
    public abstract void mo13693a(int i);

    /* renamed from: a */
    public abstract void mo13696a(int i, int i2);

    /* renamed from: a */
    public abstract void mo13697a(int i, long j);

    /* renamed from: a */
    public abstract void mo13698a(int i, C1958cx cxVar);

    /* renamed from: a */
    public abstract void mo13699a(int i, C2043fq fqVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo13700a(int i, C2043fq fqVar, C2061gh ghVar);

    /* renamed from: a */
    public abstract void mo13701a(int i, String str);

    /* renamed from: a */
    public abstract void mo13702a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo13703a(long j);

    /* renamed from: a */
    public abstract void mo13704a(C1958cx cxVar);

    /* renamed from: a */
    public abstract void mo13705a(C2043fq fqVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo13706a(C2043fq fqVar, C2061gh ghVar);

    /* renamed from: a */
    public abstract void mo13707a(String str);

    /* renamed from: b */
    public abstract int mo13710b();

    /* renamed from: b */
    public abstract void mo13711b(int i);

    /* renamed from: b */
    public abstract void mo13712b(int i, int i2);

    /* renamed from: b */
    public abstract void mo13714b(int i, C1958cx cxVar);

    /* renamed from: b */
    public abstract void mo13715b(int i, C2043fq fqVar);

    /* renamed from: b */
    public abstract void mo13717b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public abstract void mo13719c(int i, int i2);

    /* renamed from: c */
    public abstract void mo13720c(int i, long j);

    /* renamed from: c */
    public abstract void mo13721c(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo13722c(byte[] bArr, int i, int i2);

    /* renamed from: d */
    public abstract void mo13723d(int i);

    /* renamed from: e */
    public abstract void mo13725e(int i, int i2);

    /* renamed from: com.google.android.gms.internal.measurement.do$c */
    public static class C1979c extends IOException {
        C1979c() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C1979c(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0015
                java.lang.String r3 = r0.concat(r3)
                goto L_0x001a
            L_0x0015:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x001a:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1976do.C1979c.<init>(java.lang.String):void");
        }

        C1979c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C1979c(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0015
                java.lang.String r3 = r0.concat(r3)
                goto L_0x001a
            L_0x0015:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x001a:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1976do.C1979c.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* renamed from: a */
    public static C1976do m9228a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C1978b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (C2086hf.m10033b()) {
            return new C1981e(byteBuffer);
        } else {
            return new C1980d(byteBuffer);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.do$d */
    static final class C1980d extends C1976do {

        /* renamed from: b */
        private final ByteBuffer f7623b;

        /* renamed from: c */
        private final ByteBuffer f7624c;

        /* renamed from: d */
        private final int f7625d;

        C1980d(ByteBuffer byteBuffer) {
            super();
            this.f7623b = byteBuffer;
            this.f7624c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f7625d = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo13696a(int i, int i2) {
            mo13711b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo13712b(int i, int i2) {
            mo13696a(i, 0);
            mo13693a(i2);
        }

        /* renamed from: c */
        public final void mo13719c(int i, int i2) {
            mo13696a(i, 0);
            mo13711b(i2);
        }

        /* renamed from: e */
        public final void mo13725e(int i, int i2) {
            mo13696a(i, 5);
            mo13723d(i2);
        }

        /* renamed from: a */
        public final void mo13697a(int i, long j) {
            mo13696a(i, 0);
            mo13703a(j);
        }

        /* renamed from: c */
        public final void mo13720c(int i, long j) {
            mo13696a(i, 1);
            mo13721c(j);
        }

        /* renamed from: a */
        public final void mo13702a(int i, boolean z) {
            mo13696a(i, 0);
            mo13690a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo13701a(int i, String str) {
            mo13696a(i, 2);
            mo13707a(str);
        }

        /* renamed from: a */
        public final void mo13698a(int i, C1958cx cxVar) {
            mo13696a(i, 2);
            mo13704a(cxVar);
        }

        /* renamed from: a */
        public final void mo13699a(int i, C2043fq fqVar) {
            mo13696a(i, 2);
            mo13705a(fqVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo13700a(int i, C2043fq fqVar, C2061gh ghVar) {
            mo13696a(i, 2);
            mo13706a(fqVar, ghVar);
        }

        /* renamed from: b */
        public final void mo13715b(int i, C2043fq fqVar) {
            mo13696a(1, 3);
            mo13719c(2, i);
            mo13699a(3, fqVar);
            mo13696a(1, 4);
        }

        /* renamed from: b */
        public final void mo13714b(int i, C1958cx cxVar) {
            mo13696a(1, 3);
            mo13719c(2, i);
            mo13698a(3, cxVar);
            mo13696a(1, 4);
        }

        /* renamed from: a */
        public final void mo13705a(C2043fq fqVar) {
            mo13711b(fqVar.mo13817h());
            fqVar.mo13813a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo13706a(C2043fq fqVar, C2061gh ghVar) {
            C1950cp cpVar = (C1950cp) fqVar;
            int e = cpVar.mo13568e();
            if (e == -1) {
                e = ghVar.mo13930b(cpVar);
                cpVar.mo13566a(e);
            }
            mo13711b(e);
            ghVar.mo13928a(fqVar, (C2105hu) this.f7616a);
        }

        /* renamed from: a */
        public final void mo13690a(byte b) {
            try {
                this.f7624c.put(b);
            } catch (BufferOverflowException e) {
                throw new C1979c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo13704a(C1958cx cxVar) {
            mo13711b(cxVar.mo13595a());
            cxVar.mo13599a((C1957cw) this);
        }

        /* renamed from: c */
        public final void mo13722c(byte[] bArr, int i, int i2) {
            mo13711b(i2);
            mo13717b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo13693a(int i) {
            if (i >= 0) {
                mo13711b(i);
            } else {
                mo13703a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo13711b(int i) {
            while ((i & -128) != 0) {
                this.f7624c.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f7624c.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new C1979c((Throwable) e);
            }
        }

        /* renamed from: d */
        public final void mo13723d(int i) {
            try {
                this.f7624c.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C1979c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo13703a(long j) {
            while ((-128 & j) != 0) {
                this.f7624c.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f7624c.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new C1979c((Throwable) e);
            }
        }

        /* renamed from: c */
        public final void mo13721c(long j) {
            try {
                this.f7624c.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C1979c((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo13717b(byte[] bArr, int i, int i2) {
            try {
                this.f7624c.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C1979c((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C1979c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo13593a(byte[] bArr, int i, int i2) {
            mo13717b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo13707a(String str) {
            int position = this.f7624c.position();
            try {
                int g = m9260g(str.length() * 3);
                int g2 = m9260g(str.length());
                if (g2 == g) {
                    int position2 = this.f7624c.position() + g2;
                    this.f7624c.position(position2);
                    m9344c(str);
                    int position3 = this.f7624c.position();
                    this.f7624c.position(position);
                    mo13711b(position3 - position2);
                    this.f7624c.position(position3);
                    return;
                }
                mo13711b(C2092hh.m10106a((CharSequence) str));
                m9344c(str);
            } catch (C2096hl e) {
                this.f7624c.position(position);
                mo13708a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C1979c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo13689a() {
            this.f7623b.position(this.f7624c.position());
        }

        /* renamed from: b */
        public final int mo13710b() {
            return this.f7624c.remaining();
        }

        /* renamed from: c */
        private final void m9344c(String str) {
            try {
                C2092hh.m10108a((CharSequence) str, this.f7624c);
            } catch (IndexOutOfBoundsException e) {
                throw new C1979c((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.do$e */
    static final class C1981e extends C1976do {

        /* renamed from: b */
        private final ByteBuffer f7626b;

        /* renamed from: c */
        private final ByteBuffer f7627c;

        /* renamed from: d */
        private final long f7628d;

        /* renamed from: e */
        private final long f7629e;

        /* renamed from: f */
        private final long f7630f;

        /* renamed from: g */
        private final long f7631g = (this.f7630f - 10);

        /* renamed from: h */
        private long f7632h = this.f7629e;

        C1981e(ByteBuffer byteBuffer) {
            super();
            this.f7626b = byteBuffer;
            this.f7627c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f7628d = C2086hf.m10015a(byteBuffer);
            this.f7629e = this.f7628d + ((long) byteBuffer.position());
            this.f7630f = this.f7628d + ((long) byteBuffer.limit());
        }

        /* renamed from: a */
        public final void mo13696a(int i, int i2) {
            mo13711b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo13712b(int i, int i2) {
            mo13696a(i, 0);
            mo13693a(i2);
        }

        /* renamed from: c */
        public final void mo13719c(int i, int i2) {
            mo13696a(i, 0);
            mo13711b(i2);
        }

        /* renamed from: e */
        public final void mo13725e(int i, int i2) {
            mo13696a(i, 5);
            mo13723d(i2);
        }

        /* renamed from: a */
        public final void mo13697a(int i, long j) {
            mo13696a(i, 0);
            mo13703a(j);
        }

        /* renamed from: c */
        public final void mo13720c(int i, long j) {
            mo13696a(i, 1);
            mo13721c(j);
        }

        /* renamed from: a */
        public final void mo13702a(int i, boolean z) {
            mo13696a(i, 0);
            mo13690a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo13701a(int i, String str) {
            mo13696a(i, 2);
            mo13707a(str);
        }

        /* renamed from: a */
        public final void mo13698a(int i, C1958cx cxVar) {
            mo13696a(i, 2);
            mo13704a(cxVar);
        }

        /* renamed from: a */
        public final void mo13699a(int i, C2043fq fqVar) {
            mo13696a(i, 2);
            mo13705a(fqVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo13700a(int i, C2043fq fqVar, C2061gh ghVar) {
            mo13696a(i, 2);
            mo13706a(fqVar, ghVar);
        }

        /* renamed from: b */
        public final void mo13715b(int i, C2043fq fqVar) {
            mo13696a(1, 3);
            mo13719c(2, i);
            mo13699a(3, fqVar);
            mo13696a(1, 4);
        }

        /* renamed from: b */
        public final void mo13714b(int i, C1958cx cxVar) {
            mo13696a(1, 3);
            mo13719c(2, i);
            mo13698a(3, cxVar);
            mo13696a(1, 4);
        }

        /* renamed from: a */
        public final void mo13705a(C2043fq fqVar) {
            mo13711b(fqVar.mo13817h());
            fqVar.mo13813a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo13706a(C2043fq fqVar, C2061gh ghVar) {
            C1950cp cpVar = (C1950cp) fqVar;
            int e = cpVar.mo13568e();
            if (e == -1) {
                e = ghVar.mo13930b(cpVar);
                cpVar.mo13566a(e);
            }
            mo13711b(e);
            ghVar.mo13928a(fqVar, (C2105hu) this.f7616a);
        }

        /* renamed from: a */
        public final void mo13690a(byte b) {
            if (this.f7632h < this.f7630f) {
                long j = this.f7632h;
                this.f7632h = 1 + j;
                C2086hf.m10018a(j, b);
                return;
            }
            throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f7632h), Long.valueOf(this.f7630f), 1}));
        }

        /* renamed from: a */
        public final void mo13704a(C1958cx cxVar) {
            mo13711b(cxVar.mo13595a());
            cxVar.mo13599a((C1957cw) this);
        }

        /* renamed from: c */
        public final void mo13722c(byte[] bArr, int i, int i2) {
            mo13711b(i2);
            mo13717b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo13693a(int i) {
            if (i >= 0) {
                mo13711b(i);
            } else {
                mo13703a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo13711b(int i) {
            if (this.f7632h <= this.f7631g) {
                while ((i & -128) != 0) {
                    long j = this.f7632h;
                    this.f7632h = j + 1;
                    C2086hf.m10018a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f7632h;
                this.f7632h = 1 + j2;
                C2086hf.m10018a(j2, (byte) i);
                return;
            }
            while (this.f7632h < this.f7630f) {
                if ((i & -128) == 0) {
                    long j3 = this.f7632h;
                    this.f7632h = 1 + j3;
                    C2086hf.m10018a(j3, (byte) i);
                    return;
                }
                long j4 = this.f7632h;
                this.f7632h = j4 + 1;
                C2086hf.m10018a(j4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f7632h), Long.valueOf(this.f7630f), 1}));
        }

        /* renamed from: d */
        public final void mo13723d(int i) {
            this.f7627c.putInt((int) (this.f7632h - this.f7628d), i);
            this.f7632h += 4;
        }

        /* renamed from: a */
        public final void mo13703a(long j) {
            if (this.f7632h <= this.f7631g) {
                while ((j & -128) != 0) {
                    long j2 = this.f7632h;
                    this.f7632h = j2 + 1;
                    C2086hf.m10018a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f7632h;
                this.f7632h = 1 + j3;
                C2086hf.m10018a(j3, (byte) ((int) j));
                return;
            }
            while (this.f7632h < this.f7630f) {
                if ((j & -128) == 0) {
                    long j4 = this.f7632h;
                    this.f7632h = 1 + j4;
                    C2086hf.m10018a(j4, (byte) ((int) j));
                    return;
                }
                long j5 = this.f7632h;
                this.f7632h = j5 + 1;
                C2086hf.m10018a(j5, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f7632h), Long.valueOf(this.f7630f), 1}));
        }

        /* renamed from: c */
        public final void mo13721c(long j) {
            this.f7627c.putLong((int) (this.f7632h - this.f7628d), j);
            this.f7632h += 8;
        }

        /* renamed from: b */
        public final void mo13717b(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f7630f - j >= this.f7632h) {
                    C2086hf.m10027a(bArr, (long) i, this.f7632h, j);
                    this.f7632h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f7632h), Long.valueOf(this.f7630f), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo13593a(byte[] bArr, int i, int i2) {
            mo13717b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo13707a(String str) {
            long j = this.f7632h;
            try {
                int g = m9260g(str.length() * 3);
                int g2 = m9260g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f7632h - this.f7628d)) + g2;
                    this.f7627c.position(i);
                    C2092hh.m10108a((CharSequence) str, this.f7627c);
                    int position = this.f7627c.position() - i;
                    mo13711b(position);
                    this.f7632h += (long) position;
                    return;
                }
                int a = C2092hh.m10106a((CharSequence) str);
                mo13711b(a);
                m9373i(this.f7632h);
                C2092hh.m10108a((CharSequence) str, this.f7627c);
                this.f7632h += (long) a;
            } catch (C2096hl e) {
                this.f7632h = j;
                m9373i(this.f7632h);
                mo13708a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C1979c((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C1979c((Throwable) e3);
            }
        }

        /* renamed from: a */
        public final void mo13689a() {
            this.f7626b.position((int) (this.f7632h - this.f7628d));
        }

        /* renamed from: b */
        public final int mo13710b() {
            return (int) (this.f7630f - this.f7632h);
        }

        /* renamed from: i */
        private final void m9373i(long j) {
            this.f7627c.position((int) (j - this.f7628d));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.do$a */
    static class C1977a extends C1976do {

        /* renamed from: b */
        private final byte[] f7617b;

        /* renamed from: c */
        private final int f7618c;

        /* renamed from: d */
        private final int f7619d;

        /* renamed from: e */
        private int f7620e;

        C1977a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f7617b = bArr;
                    this.f7618c = i;
                    this.f7620e = i;
                    this.f7619d = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo13689a() {
        }

        /* renamed from: a */
        public final void mo13696a(int i, int i2) {
            mo13711b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo13712b(int i, int i2) {
            mo13696a(i, 0);
            mo13693a(i2);
        }

        /* renamed from: c */
        public final void mo13719c(int i, int i2) {
            mo13696a(i, 0);
            mo13711b(i2);
        }

        /* renamed from: e */
        public final void mo13725e(int i, int i2) {
            mo13696a(i, 5);
            mo13723d(i2);
        }

        /* renamed from: a */
        public final void mo13697a(int i, long j) {
            mo13696a(i, 0);
            mo13703a(j);
        }

        /* renamed from: c */
        public final void mo13720c(int i, long j) {
            mo13696a(i, 1);
            mo13721c(j);
        }

        /* renamed from: a */
        public final void mo13702a(int i, boolean z) {
            mo13696a(i, 0);
            mo13690a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo13701a(int i, String str) {
            mo13696a(i, 2);
            mo13707a(str);
        }

        /* renamed from: a */
        public final void mo13698a(int i, C1958cx cxVar) {
            mo13696a(i, 2);
            mo13704a(cxVar);
        }

        /* renamed from: a */
        public final void mo13704a(C1958cx cxVar) {
            mo13711b(cxVar.mo13595a());
            cxVar.mo13599a((C1957cw) this);
        }

        /* renamed from: c */
        public final void mo13722c(byte[] bArr, int i, int i2) {
            mo13711b(i2);
            mo13717b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo13699a(int i, C2043fq fqVar) {
            mo13696a(i, 2);
            mo13705a(fqVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo13700a(int i, C2043fq fqVar, C2061gh ghVar) {
            mo13696a(i, 2);
            C1950cp cpVar = (C1950cp) fqVar;
            int e = cpVar.mo13568e();
            if (e == -1) {
                e = ghVar.mo13930b(cpVar);
                cpVar.mo13566a(e);
            }
            mo13711b(e);
            ghVar.mo13928a(fqVar, (C2105hu) this.f7616a);
        }

        /* renamed from: b */
        public final void mo13715b(int i, C2043fq fqVar) {
            mo13696a(1, 3);
            mo13719c(2, i);
            mo13699a(3, fqVar);
            mo13696a(1, 4);
        }

        /* renamed from: b */
        public final void mo13714b(int i, C1958cx cxVar) {
            mo13696a(1, 3);
            mo13719c(2, i);
            mo13698a(3, cxVar);
            mo13696a(1, 4);
        }

        /* renamed from: a */
        public final void mo13705a(C2043fq fqVar) {
            mo13711b(fqVar.mo13817h());
            fqVar.mo13813a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo13706a(C2043fq fqVar, C2061gh ghVar) {
            C1950cp cpVar = (C1950cp) fqVar;
            int e = cpVar.mo13568e();
            if (e == -1) {
                e = ghVar.mo13930b(cpVar);
                cpVar.mo13566a(e);
            }
            mo13711b(e);
            ghVar.mo13928a(fqVar, (C2105hu) this.f7616a);
        }

        /* renamed from: a */
        public final void mo13690a(byte b) {
            try {
                byte[] bArr = this.f7617b;
                int i = this.f7620e;
                this.f7620e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7620e), Integer.valueOf(this.f7619d), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo13693a(int i) {
            if (i >= 0) {
                mo13711b(i);
            } else {
                mo13703a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo13711b(int i) {
            if (!C1976do.f7615c || mo13710b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f7617b;
                    int i2 = this.f7620e;
                    this.f7620e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f7617b;
                    int i3 = this.f7620e;
                    this.f7620e = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7620e), Integer.valueOf(this.f7619d), 1}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f7617b;
                    int i4 = this.f7620e;
                    this.f7620e = i4 + 1;
                    C2086hf.m10026a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f7617b;
                int i5 = this.f7620e;
                this.f7620e = i5 + 1;
                C2086hf.m10026a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: d */
        public final void mo13723d(int i) {
            try {
                byte[] bArr = this.f7617b;
                int i2 = this.f7620e;
                this.f7620e = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f7617b;
                int i3 = this.f7620e;
                this.f7620e = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f7617b;
                int i4 = this.f7620e;
                this.f7620e = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f7617b;
                int i5 = this.f7620e;
                this.f7620e = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7620e), Integer.valueOf(this.f7619d), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo13703a(long j) {
            if (!C1976do.f7615c || mo13710b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f7617b;
                    int i = this.f7620e;
                    this.f7620e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f7617b;
                    int i2 = this.f7620e;
                    this.f7620e = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7620e), Integer.valueOf(this.f7619d), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f7617b;
                    int i3 = this.f7620e;
                    this.f7620e = i3 + 1;
                    C2086hf.m10026a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f7617b;
                int i4 = this.f7620e;
                this.f7620e = i4 + 1;
                C2086hf.m10026a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: c */
        public final void mo13721c(long j) {
            try {
                byte[] bArr = this.f7617b;
                int i = this.f7620e;
                this.f7620e = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f7617b;
                int i2 = this.f7620e;
                this.f7620e = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f7617b;
                int i3 = this.f7620e;
                this.f7620e = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f7617b;
                int i4 = this.f7620e;
                this.f7620e = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f7617b;
                int i5 = this.f7620e;
                this.f7620e = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f7617b;
                int i6 = this.f7620e;
                this.f7620e = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f7617b;
                int i7 = this.f7620e;
                this.f7620e = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f7617b;
                int i8 = this.f7620e;
                this.f7620e = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7620e), Integer.valueOf(this.f7619d), 1}), e);
            }
        }

        /* renamed from: b */
        public final void mo13717b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f7617b, this.f7620e, i2);
                this.f7620e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C1979c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7620e), Integer.valueOf(this.f7619d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo13593a(byte[] bArr, int i, int i2) {
            mo13717b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo13707a(String str) {
            int i = this.f7620e;
            try {
                int g = m9260g(str.length() * 3);
                int g2 = m9260g(str.length());
                if (g2 == g) {
                    this.f7620e = i + g2;
                    int a = C2092hh.m10107a(str, this.f7617b, this.f7620e, mo13710b());
                    this.f7620e = i;
                    mo13711b((a - i) - g2);
                    this.f7620e = a;
                    return;
                }
                mo13711b(C2092hh.m10106a((CharSequence) str));
                this.f7620e = C2092hh.m10107a(str, this.f7617b, this.f7620e, mo13710b());
            } catch (C2096hl e) {
                this.f7620e = i;
                mo13708a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C1979c((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final int mo13710b() {
            return this.f7619d - this.f7620e;
        }

        /* renamed from: d */
        public final int mo13726d() {
            return this.f7620e - this.f7618c;
        }
    }

    private C1976do() {
    }

    /* renamed from: d */
    public final void mo13724d(int i, int i2) {
        mo13719c(i, m9276m(i2));
    }

    /* renamed from: b */
    public final void mo13713b(int i, long j) {
        mo13697a(i, m9270i(j));
    }

    /* renamed from: a */
    public final void mo13695a(int i, float f) {
        mo13725e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo13694a(int i, double d) {
        mo13720c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void mo13718c(int i) {
        mo13711b(m9276m(i));
    }

    /* renamed from: b */
    public final void mo13716b(long j) {
        mo13703a(m9270i(j));
    }

    /* renamed from: a */
    public final void mo13692a(float f) {
        mo13723d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo13691a(double d) {
        mo13721c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo13709a(boolean z) {
        mo13690a(z ? (byte) 1 : 0);
    }

    /* renamed from: f */
    public static int m9257f(int i, int i2) {
        return m9253e(i) + m9256f(i2);
    }

    /* renamed from: g */
    public static int m9261g(int i, int i2) {
        return m9253e(i) + m9260g(i2);
    }

    /* renamed from: h */
    public static int m9265h(int i, int i2) {
        return m9253e(i) + m9260g(m9276m(i2));
    }

    /* renamed from: i */
    public static int m9269i(int i, int i2) {
        return m9253e(i) + 4;
    }

    /* renamed from: j */
    public static int m9272j(int i, int i2) {
        return m9253e(i) + 4;
    }

    /* renamed from: d */
    public static int m9249d(int i, long j) {
        return m9253e(i) + m9255e(j);
    }

    /* renamed from: e */
    public static int m9254e(int i, long j) {
        return m9253e(i) + m9255e(j);
    }

    /* renamed from: f */
    public static int m9258f(int i, long j) {
        return m9253e(i) + m9255e(m9270i(j));
    }

    /* renamed from: g */
    public static int m9262g(int i, long j) {
        return m9253e(i) + 8;
    }

    /* renamed from: h */
    public static int m9266h(int i, long j) {
        return m9253e(i) + 8;
    }

    /* renamed from: b */
    public static int m9233b(int i, float f) {
        return m9253e(i) + 4;
    }

    /* renamed from: b */
    public static int m9232b(int i, double d) {
        return m9253e(i) + 8;
    }

    /* renamed from: b */
    public static int m9237b(int i, boolean z) {
        return m9253e(i) + 1;
    }

    /* renamed from: k */
    public static int m9274k(int i, int i2) {
        return m9253e(i) + m9256f(i2);
    }

    /* renamed from: b */
    public static int m9236b(int i, String str) {
        return m9253e(i) + m9241b(str);
    }

    /* renamed from: c */
    public static int m9244c(int i, C1958cx cxVar) {
        int e = m9253e(i);
        int a = cxVar.mo13595a();
        return e + m9260g(a) + a;
    }

    /* renamed from: a */
    public static int m9226a(int i, C2023ex exVar) {
        int e = m9253e(i);
        int b = exVar.mo13848b();
        return e + m9260g(b) + b;
    }

    /* renamed from: c */
    public static int m9245c(int i, C2043fq fqVar) {
        return m9253e(i) + m9239b(fqVar);
    }

    /* renamed from: b */
    static int m9235b(int i, C2043fq fqVar, C2061gh ghVar) {
        return m9253e(i) + m9240b(fqVar, ghVar);
    }

    /* renamed from: d */
    public static int m9251d(int i, C2043fq fqVar) {
        return (m9253e(1) << 1) + m9261g(2, i) + m9245c(3, fqVar);
    }

    /* renamed from: d */
    public static int m9250d(int i, C1958cx cxVar) {
        return (m9253e(1) << 1) + m9261g(2, i) + m9244c(3, cxVar);
    }

    /* renamed from: b */
    public static int m9234b(int i, C2023ex exVar) {
        return (m9253e(1) << 1) + m9261g(2, i) + m9226a(3, exVar);
    }

    /* renamed from: e */
    public static int m9253e(int i) {
        return m9260g(i << 3);
    }

    /* renamed from: f */
    public static int m9256f(int i) {
        if (i >= 0) {
            return m9260g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m9264h(int i) {
        return m9260g(m9276m(i));
    }

    /* renamed from: d */
    public static int m9252d(long j) {
        return m9255e(j);
    }

    /* renamed from: f */
    public static int m9259f(long j) {
        return m9255e(m9270i(j));
    }

    /* renamed from: k */
    public static int m9273k(int i) {
        return m9256f(i);
    }

    /* renamed from: b */
    public static int m9241b(String str) {
        int i;
        try {
            i = C2092hh.m10106a((CharSequence) str);
        } catch (C2096hl unused) {
            i = str.getBytes(C2010ek.f7747a).length;
        }
        return m9260g(i) + i;
    }

    /* renamed from: a */
    public static int m9227a(C2023ex exVar) {
        int b = exVar.mo13848b();
        return m9260g(b) + b;
    }

    /* renamed from: b */
    public static int m9238b(C1958cx cxVar) {
        int a = cxVar.mo13595a();
        return m9260g(a) + a;
    }

    /* renamed from: b */
    public static int m9243b(byte[] bArr) {
        int length = bArr.length;
        return m9260g(length) + length;
    }

    /* renamed from: b */
    public static int m9239b(C2043fq fqVar) {
        int h = fqVar.mo13817h();
        return m9260g(h) + h;
    }

    /* renamed from: b */
    static int m9240b(C2043fq fqVar, C2061gh ghVar) {
        C1950cp cpVar = (C1950cp) fqVar;
        int e = cpVar.mo13568e();
        if (e == -1) {
            e = ghVar.mo13930b(cpVar);
            cpVar.mo13566a(e);
        }
        return m9260g(e) + e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13708a(String str, C2096hl hlVar) {
        f7614b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", hlVar);
        byte[] bytes = str.getBytes(C2010ek.f7747a);
        try {
            mo13711b(bytes.length);
            mo13593a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C1979c((Throwable) e);
        } catch (C1979c e2) {
            throw e2;
        }
    }

    @Deprecated
    /* renamed from: c */
    static int m9246c(int i, C2043fq fqVar, C2061gh ghVar) {
        int e = m9253e(i) << 1;
        C1950cp cpVar = (C1950cp) fqVar;
        int e2 = cpVar.mo13568e();
        if (e2 == -1) {
            e2 = ghVar.mo13930b(cpVar);
            cpVar.mo13566a(e2);
        }
        return e + e2;
    }

    @Deprecated
    /* renamed from: c */
    public static int m9247c(C2043fq fqVar) {
        return fqVar.mo13817h();
    }

    @Deprecated
    /* renamed from: l */
    public static int m9275l(int i) {
        return m9260g(i);
    }
}
