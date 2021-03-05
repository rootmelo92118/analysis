package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class apt extends apb {

    /* renamed from: b */
    private static final Logger f2207b = Logger.getLogger(apt.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f2208c = atn.m3926a();

    /* renamed from: a */
    apv f2209a;

    /* renamed from: a */
    public static apt m3149a(byte[] bArr) {
        return new C1071a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m3150b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m3151b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m3162b(boolean z) {
        return 1;
    }

    /* renamed from: e */
    public static int m3175e(long j) {
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
    public static int m3180g(int i) {
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
    public static int m3183g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m3187h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m3188i(int i) {
        return 4;
    }

    /* renamed from: i */
    private static long m3190i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m3191j(int i) {
        return 4;
    }

    /* renamed from: m */
    private static int m3196m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo10887a();

    /* renamed from: a */
    public abstract void mo10888a(byte b);

    /* renamed from: a */
    public abstract void mo10891a(int i);

    /* renamed from: a */
    public abstract void mo10894a(int i, int i2);

    /* renamed from: a */
    public abstract void mo10895a(int i, long j);

    /* renamed from: a */
    public abstract void mo10896a(int i, apc apc);

    /* renamed from: a */
    public abstract void mo10897a(int i, arw arw);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo10898a(int i, arw arw, aso aso);

    /* renamed from: a */
    public abstract void mo10899a(int i, String str);

    /* renamed from: a */
    public abstract void mo10900a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo10901a(long j);

    /* renamed from: a */
    public abstract void mo10902a(apc apc);

    /* renamed from: a */
    public abstract void mo10903a(arw arw);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo10904a(arw arw, aso aso);

    /* renamed from: a */
    public abstract void mo10905a(String str);

    /* renamed from: b */
    public abstract int mo10908b();

    /* renamed from: b */
    public abstract void mo10909b(int i);

    /* renamed from: b */
    public abstract void mo10910b(int i, int i2);

    /* renamed from: b */
    public abstract void mo10912b(int i, apc apc);

    /* renamed from: b */
    public abstract void mo10913b(int i, arw arw);

    /* renamed from: b */
    public abstract void mo10915b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public abstract void mo10918c(int i, int i2);

    /* renamed from: c */
    public abstract void mo10919c(int i, long j);

    /* renamed from: c */
    public abstract void mo10920c(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo10921c(byte[] bArr, int i, int i2);

    /* renamed from: d */
    public abstract void mo10922d(int i);

    /* renamed from: e */
    public abstract void mo10924e(int i, int i2);

    /* renamed from: com.google.android.gms.internal.ads.apt$c */
    public static class C1073c extends IOException {
        C1073c() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C1073c(java.lang.String r3) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.apt.C1073c.<init>(java.lang.String):void");
        }

        C1073c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C1073c(java.lang.String r3, java.lang.Throwable r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.apt.C1073c.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* renamed from: a */
    public static apt m3148a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C1072b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (atn.m3931b()) {
            return new C1075e(byteBuffer);
        } else {
            return new C1074d(byteBuffer);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.apt$b */
    static final class C1072b extends C1071a {

        /* renamed from: b */
        private final ByteBuffer f2214b;

        /* renamed from: c */
        private int f2215c;

        C1072b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f2214b = byteBuffer;
            this.f2215c = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo10887a() {
            this.f2214b.position(this.f2215c + mo10925e());
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.apt$d */
    static final class C1074d extends apt {

        /* renamed from: b */
        private final ByteBuffer f2216b;

        /* renamed from: c */
        private final ByteBuffer f2217c;

        /* renamed from: d */
        private final int f2218d;

        C1074d(ByteBuffer byteBuffer) {
            super();
            this.f2216b = byteBuffer;
            this.f2217c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f2218d = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo10894a(int i, int i2) {
            mo10909b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo10910b(int i, int i2) {
            mo10894a(i, 0);
            mo10891a(i2);
        }

        /* renamed from: c */
        public final void mo10918c(int i, int i2) {
            mo10894a(i, 0);
            mo10909b(i2);
        }

        /* renamed from: e */
        public final void mo10924e(int i, int i2) {
            mo10894a(i, 5);
            mo10922d(i2);
        }

        /* renamed from: a */
        public final void mo10895a(int i, long j) {
            mo10894a(i, 0);
            mo10901a(j);
        }

        /* renamed from: c */
        public final void mo10919c(int i, long j) {
            mo10894a(i, 1);
            mo10920c(j);
        }

        /* renamed from: a */
        public final void mo10900a(int i, boolean z) {
            mo10894a(i, 0);
            mo10888a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo10899a(int i, String str) {
            mo10894a(i, 2);
            mo10905a(str);
        }

        /* renamed from: a */
        public final void mo10896a(int i, apc apc) {
            mo10894a(i, 2);
            mo10902a(apc);
        }

        /* renamed from: a */
        public final void mo10897a(int i, arw arw) {
            mo10894a(i, 2);
            mo10903a(arw);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo10898a(int i, arw arw, aso aso) {
            mo10894a(i, 2);
            mo10904a(arw, aso);
        }

        /* renamed from: b */
        public final void mo10913b(int i, arw arw) {
            mo10894a(1, 3);
            mo10918c(2, i);
            mo10897a(3, arw);
            mo10894a(1, 4);
        }

        /* renamed from: b */
        public final void mo10912b(int i, apc apc) {
            mo10894a(1, 3);
            mo10918c(2, i);
            mo10896a(3, apc);
            mo10894a(1, 4);
        }

        /* renamed from: a */
        public final void mo10903a(arw arw) {
            mo10909b(arw.mo11020l());
            arw.mo11016a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo10904a(arw arw, aso aso) {
            aot aot = (aot) arw;
            int j = aot.mo10756j();
            if (j == -1) {
                j = aso.mo11106b(aot);
                aot.mo10753a(j);
            }
            mo10909b(j);
            aso.mo11103a(arw, (auc) this.f2209a);
        }

        /* renamed from: a */
        public final void mo10888a(byte b) {
            try {
                this.f2217c.put(b);
            } catch (BufferOverflowException e) {
                throw new C1073c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo10902a(apc apc) {
            mo10909b(apc.mo10792a());
            apc.mo10796a((apb) this);
        }

        /* renamed from: c */
        public final void mo10921c(byte[] bArr, int i, int i2) {
            mo10909b(i2);
            mo10915b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo10891a(int i) {
            if (i >= 0) {
                mo10909b(i);
            } else {
                mo10901a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo10909b(int i) {
            while ((i & -128) != 0) {
                this.f2217c.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f2217c.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new C1073c((Throwable) e);
            }
        }

        /* renamed from: d */
        public final void mo10922d(int i) {
            try {
                this.f2217c.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C1073c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo10901a(long j) {
            while ((-128 & j) != 0) {
                this.f2217c.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f2217c.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new C1073c((Throwable) e);
            }
        }

        /* renamed from: c */
        public final void mo10920c(long j) {
            try {
                this.f2217c.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C1073c((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo10915b(byte[] bArr, int i, int i2) {
            try {
                this.f2217c.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C1073c((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C1073c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo10790a(byte[] bArr, int i, int i2) {
            mo10915b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo10905a(String str) {
            int position = this.f2217c.position();
            try {
                int g = m3180g(str.length() * 3);
                int g2 = m3180g(str.length());
                if (g2 == g) {
                    int position2 = this.f2217c.position() + g2;
                    this.f2217c.position(position2);
                    m3265c(str);
                    int position3 = this.f2217c.position();
                    this.f2217c.position(position);
                    mo10909b(position3 - position2);
                    this.f2217c.position(position3);
                    return;
                }
                mo10909b(atp.m4003a((CharSequence) str));
                m3265c(str);
            } catch (att e) {
                this.f2217c.position(position);
                mo10906a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C1073c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo10887a() {
            this.f2216b.position(this.f2217c.position());
        }

        /* renamed from: b */
        public final int mo10908b() {
            return this.f2217c.remaining();
        }

        /* renamed from: c */
        private final void m3265c(String str) {
            try {
                atp.m4005a((CharSequence) str, this.f2217c);
            } catch (IndexOutOfBoundsException e) {
                throw new C1073c((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.apt$e */
    static final class C1075e extends apt {

        /* renamed from: b */
        private final ByteBuffer f2219b;

        /* renamed from: c */
        private final ByteBuffer f2220c;

        /* renamed from: d */
        private final long f2221d;

        /* renamed from: e */
        private final long f2222e;

        /* renamed from: f */
        private final long f2223f;

        /* renamed from: g */
        private final long f2224g = (this.f2223f - 10);

        /* renamed from: h */
        private long f2225h = this.f2222e;

        C1075e(ByteBuffer byteBuffer) {
            super();
            this.f2219b = byteBuffer;
            this.f2220c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f2221d = atn.m3914a(byteBuffer);
            this.f2222e = this.f2221d + ((long) byteBuffer.position());
            this.f2223f = this.f2221d + ((long) byteBuffer.limit());
        }

        /* renamed from: a */
        public final void mo10894a(int i, int i2) {
            mo10909b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo10910b(int i, int i2) {
            mo10894a(i, 0);
            mo10891a(i2);
        }

        /* renamed from: c */
        public final void mo10918c(int i, int i2) {
            mo10894a(i, 0);
            mo10909b(i2);
        }

        /* renamed from: e */
        public final void mo10924e(int i, int i2) {
            mo10894a(i, 5);
            mo10922d(i2);
        }

        /* renamed from: a */
        public final void mo10895a(int i, long j) {
            mo10894a(i, 0);
            mo10901a(j);
        }

        /* renamed from: c */
        public final void mo10919c(int i, long j) {
            mo10894a(i, 1);
            mo10920c(j);
        }

        /* renamed from: a */
        public final void mo10900a(int i, boolean z) {
            mo10894a(i, 0);
            mo10888a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo10899a(int i, String str) {
            mo10894a(i, 2);
            mo10905a(str);
        }

        /* renamed from: a */
        public final void mo10896a(int i, apc apc) {
            mo10894a(i, 2);
            mo10902a(apc);
        }

        /* renamed from: a */
        public final void mo10897a(int i, arw arw) {
            mo10894a(i, 2);
            mo10903a(arw);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo10898a(int i, arw arw, aso aso) {
            mo10894a(i, 2);
            mo10904a(arw, aso);
        }

        /* renamed from: b */
        public final void mo10913b(int i, arw arw) {
            mo10894a(1, 3);
            mo10918c(2, i);
            mo10897a(3, arw);
            mo10894a(1, 4);
        }

        /* renamed from: b */
        public final void mo10912b(int i, apc apc) {
            mo10894a(1, 3);
            mo10918c(2, i);
            mo10896a(3, apc);
            mo10894a(1, 4);
        }

        /* renamed from: a */
        public final void mo10903a(arw arw) {
            mo10909b(arw.mo11020l());
            arw.mo11016a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo10904a(arw arw, aso aso) {
            aot aot = (aot) arw;
            int j = aot.mo10756j();
            if (j == -1) {
                j = aso.mo11106b(aot);
                aot.mo10753a(j);
            }
            mo10909b(j);
            aso.mo11103a(arw, (auc) this.f2209a);
        }

        /* renamed from: a */
        public final void mo10888a(byte b) {
            if (this.f2225h < this.f2223f) {
                long j = this.f2225h;
                this.f2225h = 1 + j;
                atn.m3916a(j, b);
                return;
            }
            throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f2225h), Long.valueOf(this.f2223f), 1}));
        }

        /* renamed from: a */
        public final void mo10902a(apc apc) {
            mo10909b(apc.mo10792a());
            apc.mo10796a((apb) this);
        }

        /* renamed from: c */
        public final void mo10921c(byte[] bArr, int i, int i2) {
            mo10909b(i2);
            mo10915b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo10891a(int i) {
            if (i >= 0) {
                mo10909b(i);
            } else {
                mo10901a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo10909b(int i) {
            if (this.f2225h <= this.f2224g) {
                while ((i & -128) != 0) {
                    long j = this.f2225h;
                    this.f2225h = j + 1;
                    atn.m3916a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f2225h;
                this.f2225h = 1 + j2;
                atn.m3916a(j2, (byte) i);
                return;
            }
            while (this.f2225h < this.f2223f) {
                if ((i & -128) == 0) {
                    long j3 = this.f2225h;
                    this.f2225h = 1 + j3;
                    atn.m3916a(j3, (byte) i);
                    return;
                }
                long j4 = this.f2225h;
                this.f2225h = j4 + 1;
                atn.m3916a(j4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f2225h), Long.valueOf(this.f2223f), 1}));
        }

        /* renamed from: d */
        public final void mo10922d(int i) {
            this.f2220c.putInt((int) (this.f2225h - this.f2221d), i);
            this.f2225h += 4;
        }

        /* renamed from: a */
        public final void mo10901a(long j) {
            if (this.f2225h <= this.f2224g) {
                while ((j & -128) != 0) {
                    long j2 = this.f2225h;
                    this.f2225h = j2 + 1;
                    atn.m3916a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f2225h;
                this.f2225h = 1 + j3;
                atn.m3916a(j3, (byte) ((int) j));
                return;
            }
            while (this.f2225h < this.f2223f) {
                if ((j & -128) == 0) {
                    long j4 = this.f2225h;
                    this.f2225h = 1 + j4;
                    atn.m3916a(j4, (byte) ((int) j));
                    return;
                }
                long j5 = this.f2225h;
                this.f2225h = j5 + 1;
                atn.m3916a(j5, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f2225h), Long.valueOf(this.f2223f), 1}));
        }

        /* renamed from: c */
        public final void mo10920c(long j) {
            this.f2220c.putLong((int) (this.f2225h - this.f2221d), j);
            this.f2225h += 8;
        }

        /* renamed from: b */
        public final void mo10915b(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f2223f - j >= this.f2225h) {
                    atn.m3925a(bArr, (long) i, this.f2225h, j);
                    this.f2225h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f2225h), Long.valueOf(this.f2223f), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo10790a(byte[] bArr, int i, int i2) {
            mo10915b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo10905a(String str) {
            long j = this.f2225h;
            try {
                int g = m3180g(str.length() * 3);
                int g2 = m3180g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f2225h - this.f2221d)) + g2;
                    this.f2220c.position(i);
                    atp.m4005a((CharSequence) str, this.f2220c);
                    int position = this.f2220c.position() - i;
                    mo10909b(position);
                    this.f2225h += (long) position;
                    return;
                }
                int a = atp.m4003a((CharSequence) str);
                mo10909b(a);
                m3294i(this.f2225h);
                atp.m4005a((CharSequence) str, this.f2220c);
                this.f2225h += (long) a;
            } catch (att e) {
                this.f2225h = j;
                m3294i(this.f2225h);
                mo10906a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C1073c((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C1073c((Throwable) e3);
            }
        }

        /* renamed from: a */
        public final void mo10887a() {
            this.f2219b.position((int) (this.f2225h - this.f2221d));
        }

        /* renamed from: b */
        public final int mo10908b() {
            return (int) (this.f2223f - this.f2225h);
        }

        /* renamed from: i */
        private final void m3294i(long j) {
            this.f2220c.position((int) (j - this.f2221d));
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.apt$a */
    static class C1071a extends apt {

        /* renamed from: b */
        private final byte[] f2210b;

        /* renamed from: c */
        private final int f2211c;

        /* renamed from: d */
        private final int f2212d;

        /* renamed from: e */
        private int f2213e;

        C1071a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f2210b = bArr;
                    this.f2211c = i;
                    this.f2213e = i;
                    this.f2212d = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo10887a() {
        }

        /* renamed from: a */
        public final void mo10894a(int i, int i2) {
            mo10909b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo10910b(int i, int i2) {
            mo10894a(i, 0);
            mo10891a(i2);
        }

        /* renamed from: c */
        public final void mo10918c(int i, int i2) {
            mo10894a(i, 0);
            mo10909b(i2);
        }

        /* renamed from: e */
        public final void mo10924e(int i, int i2) {
            mo10894a(i, 5);
            mo10922d(i2);
        }

        /* renamed from: a */
        public final void mo10895a(int i, long j) {
            mo10894a(i, 0);
            mo10901a(j);
        }

        /* renamed from: c */
        public final void mo10919c(int i, long j) {
            mo10894a(i, 1);
            mo10920c(j);
        }

        /* renamed from: a */
        public final void mo10900a(int i, boolean z) {
            mo10894a(i, 0);
            mo10888a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo10899a(int i, String str) {
            mo10894a(i, 2);
            mo10905a(str);
        }

        /* renamed from: a */
        public final void mo10896a(int i, apc apc) {
            mo10894a(i, 2);
            mo10902a(apc);
        }

        /* renamed from: a */
        public final void mo10902a(apc apc) {
            mo10909b(apc.mo10792a());
            apc.mo10796a((apb) this);
        }

        /* renamed from: c */
        public final void mo10921c(byte[] bArr, int i, int i2) {
            mo10909b(i2);
            mo10915b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo10897a(int i, arw arw) {
            mo10894a(i, 2);
            mo10903a(arw);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo10898a(int i, arw arw, aso aso) {
            mo10894a(i, 2);
            aot aot = (aot) arw;
            int j = aot.mo10756j();
            if (j == -1) {
                j = aso.mo11106b(aot);
                aot.mo10753a(j);
            }
            mo10909b(j);
            aso.mo11103a(arw, (auc) this.f2209a);
        }

        /* renamed from: b */
        public final void mo10913b(int i, arw arw) {
            mo10894a(1, 3);
            mo10918c(2, i);
            mo10897a(3, arw);
            mo10894a(1, 4);
        }

        /* renamed from: b */
        public final void mo10912b(int i, apc apc) {
            mo10894a(1, 3);
            mo10918c(2, i);
            mo10896a(3, apc);
            mo10894a(1, 4);
        }

        /* renamed from: a */
        public final void mo10903a(arw arw) {
            mo10909b(arw.mo11020l());
            arw.mo11016a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo10904a(arw arw, aso aso) {
            aot aot = (aot) arw;
            int j = aot.mo10756j();
            if (j == -1) {
                j = aso.mo11106b(aot);
                aot.mo10753a(j);
            }
            mo10909b(j);
            aso.mo11103a(arw, (auc) this.f2209a);
        }

        /* renamed from: a */
        public final void mo10888a(byte b) {
            try {
                byte[] bArr = this.f2210b;
                int i = this.f2213e;
                this.f2213e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2213e), Integer.valueOf(this.f2212d), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo10891a(int i) {
            if (i >= 0) {
                mo10909b(i);
            } else {
                mo10901a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo10909b(int i) {
            if (!apt.f2208c || mo10908b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f2210b;
                    int i2 = this.f2213e;
                    this.f2213e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f2210b;
                    int i3 = this.f2213e;
                    this.f2213e = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2213e), Integer.valueOf(this.f2212d), 1}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f2210b;
                    int i4 = this.f2213e;
                    this.f2213e = i4 + 1;
                    atn.m3924a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f2210b;
                int i5 = this.f2213e;
                this.f2213e = i5 + 1;
                atn.m3924a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: d */
        public final void mo10922d(int i) {
            try {
                byte[] bArr = this.f2210b;
                int i2 = this.f2213e;
                this.f2213e = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f2210b;
                int i3 = this.f2213e;
                this.f2213e = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f2210b;
                int i4 = this.f2213e;
                this.f2213e = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f2210b;
                int i5 = this.f2213e;
                this.f2213e = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2213e), Integer.valueOf(this.f2212d), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo10901a(long j) {
            if (!apt.f2208c || mo10908b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f2210b;
                    int i = this.f2213e;
                    this.f2213e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f2210b;
                    int i2 = this.f2213e;
                    this.f2213e = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2213e), Integer.valueOf(this.f2212d), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f2210b;
                    int i3 = this.f2213e;
                    this.f2213e = i3 + 1;
                    atn.m3924a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f2210b;
                int i4 = this.f2213e;
                this.f2213e = i4 + 1;
                atn.m3924a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: c */
        public final void mo10920c(long j) {
            try {
                byte[] bArr = this.f2210b;
                int i = this.f2213e;
                this.f2213e = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f2210b;
                int i2 = this.f2213e;
                this.f2213e = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f2210b;
                int i3 = this.f2213e;
                this.f2213e = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f2210b;
                int i4 = this.f2213e;
                this.f2213e = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f2210b;
                int i5 = this.f2213e;
                this.f2213e = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f2210b;
                int i6 = this.f2213e;
                this.f2213e = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f2210b;
                int i7 = this.f2213e;
                this.f2213e = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f2210b;
                int i8 = this.f2213e;
                this.f2213e = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2213e), Integer.valueOf(this.f2212d), 1}), e);
            }
        }

        /* renamed from: b */
        public final void mo10915b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f2210b, this.f2213e, i2);
                this.f2213e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C1073c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2213e), Integer.valueOf(this.f2212d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo10790a(byte[] bArr, int i, int i2) {
            mo10915b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo10905a(String str) {
            int i = this.f2213e;
            try {
                int g = m3180g(str.length() * 3);
                int g2 = m3180g(str.length());
                if (g2 == g) {
                    this.f2213e = i + g2;
                    int a = atp.m4004a(str, this.f2210b, this.f2213e, mo10908b());
                    this.f2213e = i;
                    mo10909b((a - i) - g2);
                    this.f2213e = a;
                    return;
                }
                mo10909b(atp.m4003a((CharSequence) str));
                this.f2213e = atp.m4004a(str, this.f2210b, this.f2213e, mo10908b());
            } catch (att e) {
                this.f2213e = i;
                mo10906a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C1073c((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final int mo10908b() {
            return this.f2212d - this.f2213e;
        }

        /* renamed from: e */
        public final int mo10925e() {
            return this.f2213e - this.f2211c;
        }
    }

    private apt() {
    }

    /* renamed from: d */
    public final void mo10923d(int i, int i2) {
        mo10918c(i, m3196m(i2));
    }

    /* renamed from: b */
    public final void mo10911b(int i, long j) {
        mo10895a(i, m3190i(j));
    }

    /* renamed from: a */
    public final void mo10893a(int i, float f) {
        mo10924e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo10892a(int i, double d) {
        mo10919c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void mo10917c(int i) {
        mo10909b(m3196m(i));
    }

    /* renamed from: b */
    public final void mo10914b(long j) {
        mo10901a(m3190i(j));
    }

    /* renamed from: a */
    public final void mo10890a(float f) {
        mo10922d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo10889a(double d) {
        mo10920c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo10907a(boolean z) {
        mo10888a(z ? (byte) 1 : 0);
    }

    /* renamed from: f */
    public static int m3177f(int i, int i2) {
        return m3173e(i) + m3176f(i2);
    }

    /* renamed from: g */
    public static int m3181g(int i, int i2) {
        return m3173e(i) + m3180g(i2);
    }

    /* renamed from: h */
    public static int m3185h(int i, int i2) {
        return m3173e(i) + m3180g(m3196m(i2));
    }

    /* renamed from: i */
    public static int m3189i(int i, int i2) {
        return m3173e(i) + 4;
    }

    /* renamed from: j */
    public static int m3192j(int i, int i2) {
        return m3173e(i) + 4;
    }

    /* renamed from: d */
    public static int m3168d(int i, long j) {
        return m3173e(i) + m3175e(j);
    }

    /* renamed from: e */
    public static int m3174e(int i, long j) {
        return m3173e(i) + m3175e(j);
    }

    /* renamed from: f */
    public static int m3178f(int i, long j) {
        return m3173e(i) + m3175e(m3190i(j));
    }

    /* renamed from: g */
    public static int m3182g(int i, long j) {
        return m3173e(i) + 8;
    }

    /* renamed from: h */
    public static int m3186h(int i, long j) {
        return m3173e(i) + 8;
    }

    /* renamed from: b */
    public static int m3153b(int i, float f) {
        return m3173e(i) + 4;
    }

    /* renamed from: b */
    public static int m3152b(int i, double d) {
        return m3173e(i) + 8;
    }

    /* renamed from: b */
    public static int m3157b(int i, boolean z) {
        return m3173e(i) + 1;
    }

    /* renamed from: k */
    public static int m3194k(int i, int i2) {
        return m3173e(i) + m3176f(i2);
    }

    /* renamed from: b */
    public static int m3156b(int i, String str) {
        return m3173e(i) + m3161b(str);
    }

    /* renamed from: c */
    public static int m3164c(int i, apc apc) {
        int e = m3173e(i);
        int a = apc.mo10792a();
        return e + m3180g(a) + a;
    }

    /* renamed from: a */
    public static int m3146a(int i, arc arc) {
        int e = m3173e(i);
        int b = arc.mo11051b();
        return e + m3180g(b) + b;
    }

    /* renamed from: c */
    public static int m3165c(int i, arw arw) {
        return m3173e(i) + m3159b(arw);
    }

    /* renamed from: b */
    static int m3155b(int i, arw arw, aso aso) {
        return m3173e(i) + m3160b(arw, aso);
    }

    /* renamed from: d */
    public static int m3170d(int i, arw arw) {
        return (m3173e(1) << 1) + m3181g(2, i) + m3165c(3, arw);
    }

    /* renamed from: d */
    public static int m3169d(int i, apc apc) {
        return (m3173e(1) << 1) + m3181g(2, i) + m3164c(3, apc);
    }

    /* renamed from: b */
    public static int m3154b(int i, arc arc) {
        return (m3173e(1) << 1) + m3181g(2, i) + m3146a(3, arc);
    }

    /* renamed from: e */
    public static int m3173e(int i) {
        return m3180g(i << 3);
    }

    /* renamed from: f */
    public static int m3176f(int i) {
        if (i >= 0) {
            return m3180g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m3184h(int i) {
        return m3180g(m3196m(i));
    }

    /* renamed from: d */
    public static int m3171d(long j) {
        return m3175e(j);
    }

    /* renamed from: f */
    public static int m3179f(long j) {
        return m3175e(m3190i(j));
    }

    /* renamed from: k */
    public static int m3193k(int i) {
        return m3176f(i);
    }

    /* renamed from: b */
    public static int m3161b(String str) {
        int i;
        try {
            i = atp.m4003a((CharSequence) str);
        } catch (att unused) {
            i = str.getBytes(aqp.f2347a).length;
        }
        return m3180g(i) + i;
    }

    /* renamed from: a */
    public static int m3147a(arc arc) {
        int b = arc.mo11051b();
        return m3180g(b) + b;
    }

    /* renamed from: b */
    public static int m3158b(apc apc) {
        int a = apc.mo10792a();
        return m3180g(a) + a;
    }

    /* renamed from: b */
    public static int m3163b(byte[] bArr) {
        int length = bArr.length;
        return m3180g(length) + length;
    }

    /* renamed from: b */
    public static int m3159b(arw arw) {
        int l = arw.mo11020l();
        return m3180g(l) + l;
    }

    /* renamed from: b */
    static int m3160b(arw arw, aso aso) {
        aot aot = (aot) arw;
        int j = aot.mo10756j();
        if (j == -1) {
            j = aso.mo11106b(aot);
            aot.mo10753a(j);
        }
        return m3180g(j) + j;
    }

    /* renamed from: c */
    public final void mo10916c() {
        if (mo10908b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10906a(String str, att att) {
        f2207b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", att);
        byte[] bytes = str.getBytes(aqp.f2347a);
        try {
            mo10909b(bytes.length);
            mo10790a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C1073c((Throwable) e);
        } catch (C1073c e2) {
            throw e2;
        }
    }

    @Deprecated
    /* renamed from: c */
    static int m3166c(int i, arw arw, aso aso) {
        int e = m3173e(i) << 1;
        aot aot = (aot) arw;
        int j = aot.mo10756j();
        if (j == -1) {
            j = aso.mo11106b(aot);
            aot.mo10753a(j);
        }
        return e + j;
    }

    @Deprecated
    /* renamed from: c */
    public static int m3167c(arw arw) {
        return arw.mo11020l();
    }

    @Deprecated
    /* renamed from: l */
    public static int m3195l(int i) {
        return m3180g(i);
    }
}
