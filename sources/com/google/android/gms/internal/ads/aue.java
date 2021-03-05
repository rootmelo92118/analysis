package com.google.android.gms.internal.ads;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class aue {

    /* renamed from: a */
    private final ByteBuffer f2566a;

    /* renamed from: b */
    private apt f2567b;

    /* renamed from: c */
    private int f2568c;

    private aue(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m4136a(long j) {
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
    public static int m4150d(int i) {
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

    private aue(ByteBuffer byteBuffer) {
        this.f2566a = byteBuffer;
        this.f2566a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static aue m4139a(byte[] bArr) {
        return m4140a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static aue m4140a(byte[] bArr, int i, int i2) {
        return new aue(bArr, 0, i2);
    }

    /* renamed from: a */
    public final void mo11271a(int i, long j) {
        mo11279c(i, 0);
        m4148b(j);
    }

    /* renamed from: b */
    public final void mo11277b(int i, long j) {
        mo11279c(i, 0);
        m4148b(j);
    }

    /* renamed from: a */
    public final void mo11270a(int i, int i2) {
        mo11279c(i, 0);
        if (i2 >= 0) {
            mo11278c(i2);
        } else {
            m4148b((long) i2);
        }
    }

    /* renamed from: a */
    public final void mo11275a(int i, boolean z) {
        mo11279c(i, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f2566a.hasRemaining()) {
            this.f2566a.put(b);
            return;
        }
        throw new auf(this.f2566a.position(), this.f2566a.limit());
    }

    /* renamed from: a */
    public final void mo11274a(int i, String str) {
        mo11279c(i, 2);
        try {
            int d = m4150d(str.length());
            if (d == m4150d(str.length() * 3)) {
                int position = this.f2566a.position();
                if (this.f2566a.remaining() >= d) {
                    this.f2566a.position(position + d);
                    m4141a((CharSequence) str, this.f2566a);
                    int position2 = this.f2566a.position();
                    this.f2566a.position(position);
                    mo11278c((position2 - position) - d);
                    this.f2566a.position(position2);
                    return;
                }
                throw new auf(position + d, this.f2566a.limit());
            }
            mo11278c(m4137a((CharSequence) str));
            m4141a((CharSequence) str, this.f2566a);
        } catch (BufferOverflowException e) {
            auf auf = new auf(this.f2566a.position(), this.f2566a.limit());
            auf.initCause(e);
            throw auf;
        }
    }

    /* renamed from: a */
    public final void mo11273a(int i, aum aum) {
        mo11279c(i, 2);
        if (aum.f2582aa < 0) {
            aum.mo11299d();
        }
        mo11278c(aum.f2582aa);
        aum.mo10484a(this);
    }

    /* renamed from: a */
    public final void mo11272a(int i, arw arw) {
        if (this.f2567b == null) {
            this.f2567b = apt.m3148a(this.f2566a);
            this.f2568c = this.f2566a.position();
        } else if (this.f2568c != this.f2566a.position()) {
            this.f2567b.mo10915b(this.f2566a.array(), this.f2568c, this.f2566a.position() - this.f2568c);
            this.f2568c = this.f2566a.position();
        }
        apt apt = this.f2567b;
        apt.mo10897a(i, arw);
        apt.mo10887a();
        this.f2568c = this.f2566a.position();
    }

    /* renamed from: a */
    public final void mo11276a(int i, byte[] bArr) {
        mo11279c(i, 2);
        mo11278c(bArr.length);
        mo11280c(bArr);
    }

    /* renamed from: a */
    private static int m4137a(CharSequence charSequence) {
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
    private static void m4141a(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    /* renamed from: c */
    public static int m4149c(int i, long j) {
        return m4142b(i) + m4136a(j);
    }

    /* renamed from: d */
    public static int m4151d(int i, long j) {
        return m4142b(i) + m4136a(j);
    }

    /* renamed from: b */
    public static int m4143b(int i, int i2) {
        return m4142b(i) + m4135a(i2);
    }

    /* renamed from: b */
    public static int m4145b(int i, String str) {
        return m4142b(i) + m4138a(str);
    }

    /* renamed from: b */
    public static int m4144b(int i, aum aum) {
        int b = m4142b(i);
        int d = aum.mo11299d();
        return b + m4150d(d) + d;
    }

    /* renamed from: b */
    public static int m4146b(int i, byte[] bArr) {
        return m4142b(i) + m4147b(bArr);
    }

    /* renamed from: a */
    public static int m4135a(int i) {
        if (i >= 0) {
            return m4150d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m4138a(String str) {
        int a = m4137a((CharSequence) str);
        return m4150d(a) + a;
    }

    /* renamed from: b */
    public static int m4147b(byte[] bArr) {
        return m4150d(bArr.length) + bArr.length;
    }

    /* renamed from: a */
    public final void mo11269a() {
        if (this.f2566a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f2566a.remaining())}));
        }
    }

    /* renamed from: e */
    private final void m4152e(int i) {
        byte b = (byte) i;
        if (this.f2566a.hasRemaining()) {
            this.f2566a.put(b);
            return;
        }
        throw new auf(this.f2566a.position(), this.f2566a.limit());
    }

    /* renamed from: c */
    public final void mo11280c(byte[] bArr) {
        int length = bArr.length;
        if (this.f2566a.remaining() >= length) {
            this.f2566a.put(bArr, 0, length);
            return;
        }
        throw new auf(this.f2566a.position(), this.f2566a.limit());
    }

    /* renamed from: c */
    public final void mo11279c(int i, int i2) {
        mo11278c((i << 3) | i2);
    }

    /* renamed from: b */
    public static int m4142b(int i) {
        return m4150d(i << 3);
    }

    /* renamed from: c */
    public final void mo11278c(int i) {
        while ((i & -128) != 0) {
            m4152e((i & 127) | 128);
            i >>>= 7;
        }
        m4152e(i);
    }

    /* renamed from: b */
    private final void m4148b(long j) {
        while ((-128 & j) != 0) {
            m4152e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m4152e((int) j);
    }
}
