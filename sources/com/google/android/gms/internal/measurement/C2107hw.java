package com.google.android.gms.internal.measurement;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.measurement.hw */
public final class C2107hw {

    /* renamed from: a */
    private final ByteBuffer f7936a;

    /* renamed from: b */
    private C1976do f7937b;

    /* renamed from: c */
    private int f7938c;

    private C2107hw(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m10216a(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: d */
    public static int m10229d(int i) {
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

    private C2107hw(ByteBuffer byteBuffer) {
        this.f7936a = byteBuffer;
        this.f7936a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static C2107hw m10219a(byte[] bArr) {
        return m10220a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C2107hw m10220a(byte[] bArr, int i, int i2) {
        return new C2107hw(bArr, 0, i2);
    }

    /* renamed from: b */
    private final C1976do m10226b() {
        if (this.f7937b == null) {
            this.f7937b = C1976do.m9228a(this.f7936a);
            this.f7938c = this.f7936a.position();
        } else if (this.f7938c != this.f7936a.position()) {
            this.f7937b.mo13717b(this.f7936a.array(), this.f7938c, this.f7936a.position() - this.f7938c);
            this.f7938c = this.f7936a.position();
        }
        return this.f7937b;
    }

    /* renamed from: a */
    public final void mo14069a(int i, double d) {
        mo14081c(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (this.f7936a.remaining() >= 8) {
            this.f7936a.putLong(doubleToLongBits);
            return;
        }
        throw new C2108hx(this.f7936a.position(), this.f7936a.limit());
    }

    /* renamed from: a */
    public final void mo14070a(int i, float f) {
        mo14081c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f7936a.remaining() >= 4) {
            this.f7936a.putInt(floatToIntBits);
            return;
        }
        throw new C2108hx(this.f7936a.position(), this.f7936a.limit());
    }

    /* renamed from: a */
    public final void mo14072a(int i, long j) {
        mo14081c(i, 0);
        m10227b(j);
    }

    /* renamed from: b */
    public final void mo14078b(int i, long j) {
        mo14081c(i, 0);
        m10227b(j);
    }

    /* renamed from: a */
    public final void mo14071a(int i, int i2) {
        mo14081c(i, 0);
        if (i2 >= 0) {
            mo14080c(i2);
        } else {
            m10227b((long) i2);
        }
    }

    /* renamed from: a */
    public final void mo14076a(int i, boolean z) {
        mo14081c(i, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f7936a.hasRemaining()) {
            this.f7936a.put(b);
            return;
        }
        throw new C2108hx(this.f7936a.position(), this.f7936a.limit());
    }

    /* renamed from: a */
    public final void mo14075a(int i, String str) {
        mo14081c(i, 2);
        try {
            int d = m10229d(str.length());
            if (d == m10229d(str.length() * 3)) {
                int position = this.f7936a.position();
                if (this.f7936a.remaining() >= d) {
                    this.f7936a.position(position + d);
                    m10221a((CharSequence) str, this.f7936a);
                    int position2 = this.f7936a.position();
                    this.f7936a.position(position);
                    mo14080c((position2 - position) - d);
                    this.f7936a.position(position2);
                    return;
                }
                throw new C2108hx(position + d, this.f7936a.limit());
            }
            mo14080c(m10217a((CharSequence) str));
            m10221a((CharSequence) str, this.f7936a);
        } catch (BufferOverflowException e) {
            C2108hx hxVar = new C2108hx(this.f7936a.position(), this.f7936a.limit());
            hxVar.initCause(e);
            throw hxVar;
        }
    }

    /* renamed from: a */
    public final void mo14074a(int i, C2116ie ieVar) {
        mo14081c(i, 2);
        mo14077a(ieVar);
    }

    /* renamed from: a */
    public final void mo14073a(int i, C2043fq fqVar) {
        C1976do b = m10226b();
        b.mo13699a(i, fqVar);
        b.mo13689a();
        this.f7938c = this.f7936a.position();
    }

    /* renamed from: a */
    private static int m10217a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    private static void m10221a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i3 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i4 = remaining + arrayOffset;
                    while (i3 < length) {
                        int i5 = i3 + arrayOffset;
                        if (i5 >= i4 || (charAt = charSequence.charAt(i3)) >= 128) {
                            break;
                        }
                        array[i5] = (byte) charAt;
                        i3++;
                    }
                    if (i3 == length) {
                        i = arrayOffset + length;
                    } else {
                        i = arrayOffset + i3;
                        while (i3 < length) {
                            char charAt2 = charSequence.charAt(i3);
                            if (charAt2 < 128 && i < i4) {
                                i2 = i + 1;
                                array[i] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i <= i4 - 2) {
                                int i6 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i = i6 + 1;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                                i3++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i <= i4 - 3) {
                                int i7 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 12) | 480);
                                int i8 = i7 + 1;
                                array[i7] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i2 = i8 + 1;
                                array[i8] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i4 - 4) {
                                int i9 = i3 + 1;
                                if (i9 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i9);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i10 = i + 1;
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        int i11 = i10 + 1;
                                        array[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i = i12 + 1;
                                        array[i12] = (byte) ((codePoint & 63) | 128);
                                        i3 = i9;
                                        i3++;
                                    } else {
                                        i3 = i9;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i3 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i = i2;
                            i3++;
                        }
                    }
                    byteBuffer.position(i - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt4 = charSequence.charAt(i3);
                    if (charAt4 < 128) {
                        byteBuffer.put((byte) charAt4);
                    } else if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else if (charAt4 < 55296 || 57343 < charAt4) {
                        byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else {
                        int i13 = i3 + 1;
                        if (i13 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                i3 = i13;
                            } else {
                                i3 = i13;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder(39);
                        sb3.append("Unpaired surrogate at index ");
                        sb3.append(i3 - 1);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i3++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: a */
    public final void mo14077a(C2116ie ieVar) {
        mo14080c(ieVar.mo14105d());
        ieVar.mo13499a(this);
    }

    /* renamed from: c */
    public static int m10228c(int i, long j) {
        return m10222b(i) + m10216a(j);
    }

    /* renamed from: b */
    public static int m10223b(int i, int i2) {
        return m10222b(i) + m10215a(i2);
    }

    /* renamed from: b */
    public static int m10225b(int i, String str) {
        return m10222b(i) + m10218a(str);
    }

    /* renamed from: b */
    public static int m10224b(int i, C2116ie ieVar) {
        int b = m10222b(i);
        int e = ieVar.mo14106e();
        return b + m10229d(e) + e;
    }

    /* renamed from: a */
    public static int m10215a(int i) {
        if (i >= 0) {
            return m10229d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m10218a(String str) {
        int a = m10217a((CharSequence) str);
        return m10229d(a) + a;
    }

    /* renamed from: a */
    public final void mo14068a() {
        if (this.f7936a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f7936a.remaining())}));
        }
    }

    /* renamed from: e */
    private final void m10230e(int i) {
        byte b = (byte) i;
        if (this.f7936a.hasRemaining()) {
            this.f7936a.put(b);
            return;
        }
        throw new C2108hx(this.f7936a.position(), this.f7936a.limit());
    }

    /* renamed from: b */
    public final void mo14079b(byte[] bArr) {
        int length = bArr.length;
        if (this.f7936a.remaining() >= length) {
            this.f7936a.put(bArr, 0, length);
            return;
        }
        throw new C2108hx(this.f7936a.position(), this.f7936a.limit());
    }

    /* renamed from: c */
    public final void mo14081c(int i, int i2) {
        mo14080c((i << 3) | i2);
    }

    /* renamed from: b */
    public static int m10222b(int i) {
        return m10229d(i << 3);
    }

    /* renamed from: c */
    public final void mo14080c(int i) {
        while ((i & -128) != 0) {
            m10230e((i & 127) | 128);
            i >>>= 7;
        }
        m10230e(i);
    }

    /* renamed from: b */
    private final void m10227b(long j) {
        while ((-128 & j) != 0) {
            m10230e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m10230e((int) j);
    }
}
