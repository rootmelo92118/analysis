package com.google.android.gms.internal.ads;

import java.util.Stack;

final class bcs implements bcv {

    /* renamed from: a */
    private final byte[] f3532a = new byte[8];

    /* renamed from: b */
    private final Stack<bcu> f3533b = new Stack<>();

    /* renamed from: c */
    private final bdc f3534c = new bdc();

    /* renamed from: d */
    private bcw f3535d;

    /* renamed from: e */
    private int f3536e;

    /* renamed from: f */
    private int f3537f;

    /* renamed from: g */
    private long f3538g;

    bcs() {
    }

    /* renamed from: a */
    public final void mo11696a(bcw bcw) {
        this.f3535d = bcw;
    }

    /* renamed from: a */
    public final void mo11695a() {
        this.f3536e = 0;
        this.f3533b.clear();
        this.f3534c.mo11716a();
    }

    /* renamed from: a */
    public final boolean mo11697a(bci bci) {
        String str;
        double d;
        bjy.m5691b(this.f3535d != null);
        while (true) {
            if (this.f3533b.isEmpty() || bci.mo11673b() < this.f3533b.peek().f3540b) {
                if (this.f3536e == 0) {
                    long a = this.f3534c.mo11715a(bci, true, false, 4);
                    if (a == -2) {
                        bci.mo11671a();
                        while (true) {
                            bci.mo11678c(this.f3532a, 0, 4);
                            int a2 = bdc.m5020a(this.f3532a[0]);
                            if (a2 != -1 && a2 <= 4) {
                                int a3 = (int) bdc.m5021a(this.f3532a, a2, false);
                                if (this.f3535d.mo11704b(a3)) {
                                    bci.mo11674b(a2);
                                    a = (long) a3;
                                }
                            }
                            bci.mo11674b(1);
                        }
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f3537f = (int) a;
                    this.f3536e = 1;
                }
                if (this.f3536e == 1) {
                    this.f3538g = this.f3534c.mo11715a(bci, false, true, 8);
                    this.f3536e = 2;
                }
                int a4 = this.f3535d.mo11698a(this.f3537f);
                switch (a4) {
                    case 0:
                        bci.mo11674b((int) this.f3538g);
                        this.f3536e = 0;
                    case 1:
                        long b = bci.mo11673b();
                        this.f3533b.add(new bcu(this.f3537f, this.f3538g + b));
                        this.f3535d.mo11702a(this.f3537f, b, this.f3538g);
                        this.f3536e = 0;
                        return true;
                    case 2:
                        if (this.f3538g <= 8) {
                            this.f3535d.mo11701a(this.f3537f, m4966a(bci, (int) this.f3538g));
                            this.f3536e = 0;
                            return true;
                        }
                        long j = this.f3538g;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j);
                        throw new bad(sb.toString());
                    case 3:
                        if (this.f3538g <= 2147483647L) {
                            bcw bcw = this.f3535d;
                            int i = this.f3537f;
                            int i2 = (int) this.f3538g;
                            if (i2 == 0) {
                                str = "";
                            } else {
                                byte[] bArr = new byte[i2];
                                bci.mo11675b(bArr, 0, i2);
                                str = new String(bArr);
                            }
                            bcw.mo11703a(i, str);
                            this.f3536e = 0;
                            return true;
                        }
                        long j2 = this.f3538g;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j2);
                        throw new bad(sb2.toString());
                    case 4:
                        this.f3535d.mo11700a(this.f3537f, (int) this.f3538g, bci);
                        this.f3536e = 0;
                        return true;
                    case 5:
                        if (this.f3538g == 4 || this.f3538g == 8) {
                            bcw bcw2 = this.f3535d;
                            int i3 = this.f3537f;
                            int i4 = (int) this.f3538g;
                            long a5 = m4966a(bci, i4);
                            if (i4 == 4) {
                                d = (double) Float.intBitsToFloat((int) a5);
                            } else {
                                d = Double.longBitsToDouble(a5);
                            }
                            bcw2.mo11699a(i3, d);
                            this.f3536e = 0;
                            return true;
                        }
                        long j3 = this.f3538g;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw new bad(sb3.toString());
                    default:
                        StringBuilder sb4 = new StringBuilder(32);
                        sb4.append("Invalid element type ");
                        sb4.append(a4);
                        throw new bad(sb4.toString());
                }
            } else {
                this.f3535d.mo11705c(this.f3533b.pop().f3539a);
                return true;
            }
        }
    }

    /* renamed from: a */
    private final long m4966a(bci bci, int i) {
        bci.mo11675b(this.f3532a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f3532a[i2] & 255));
        }
        return j;
    }
}
