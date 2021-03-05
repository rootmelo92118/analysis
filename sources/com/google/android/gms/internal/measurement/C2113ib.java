package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ib */
final class C2113ib implements Cloneable {

    /* renamed from: a */
    private C2110hz<?, ?> f7949a;

    /* renamed from: b */
    private Object f7950b;

    /* renamed from: c */
    private List<C2118ig> f7951c = new ArrayList();

    C2113ib() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14101a(C2118ig igVar) {
        Object obj;
        Object obj2;
        if (this.f7951c != null) {
            this.f7951c.add(igVar);
            return;
        }
        if (this.f7950b instanceof C2116ie) {
            byte[] bArr = igVar.f7957b;
            C2106hv a = C2106hv.m10191a(bArr, 0, bArr.length);
            int d = a.mo14060d();
            if (d == bArr.length - C2107hw.m10215a(d)) {
                obj = ((C2116ie) this.f7950b).mo13498a(a);
            } else {
                throw C2115id.m10273a();
            }
        } else {
            if (this.f7950b instanceof C2116ie[]) {
                C2116ie[] ieVarArr = (C2116ie[]) this.f7949a.mo14086a((List<C2118ig>) Collections.singletonList(igVar));
                C2116ie[] ieVarArr2 = (C2116ie[]) this.f7950b;
                obj2 = (C2116ie[]) Arrays.copyOf(ieVarArr2, ieVarArr2.length + ieVarArr.length);
                System.arraycopy(ieVarArr, 0, obj2, ieVarArr2.length, ieVarArr.length);
            } else if (this.f7950b instanceof C2043fq) {
                obj = ((C2043fq) this.f7950b).mo13819j().mo13571a((C2043fq) this.f7949a.mo14086a((List<C2118ig>) Collections.singletonList(igVar))).mo13828g();
            } else if (this.f7950b instanceof C2043fq[]) {
                C2043fq[] fqVarArr = (C2043fq[]) this.f7949a.mo14086a((List<C2118ig>) Collections.singletonList(igVar));
                C2043fq[] fqVarArr2 = (C2043fq[]) this.f7950b;
                obj2 = (C2043fq[]) Arrays.copyOf(fqVarArr2, fqVarArr2.length + fqVarArr.length);
                System.arraycopy(fqVarArr, 0, obj2, fqVarArr2.length, fqVarArr.length);
            } else {
                obj = this.f7949a.mo14086a((List<C2118ig>) Collections.singletonList(igVar));
            }
            obj = obj2;
        }
        this.f7949a = this.f7949a;
        this.f7950b = obj;
        this.f7951c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo14099a() {
        if (this.f7950b != null) {
            C2110hz<?, ?> hzVar = this.f7949a;
            Object obj = this.f7950b;
            if (!hzVar.f7942c) {
                return hzVar.mo14085a(obj);
            }
            int length = Array.getLength(obj);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                if (obj2 != null) {
                    i += hzVar.mo14085a(obj2);
                }
            }
            return i;
        }
        int i3 = 0;
        for (C2118ig next : this.f7951c) {
            i3 += C2107hw.m10229d(next.f7956a) + 0 + next.f7957b.length;
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14100a(C2107hw hwVar) {
        if (this.f7950b != null) {
            C2110hz<?, ?> hzVar = this.f7949a;
            Object obj = this.f7950b;
            if (hzVar.f7942c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        hzVar.mo14087a(obj2, hwVar);
                    }
                }
                return;
            }
            hzVar.mo14087a(obj, hwVar);
            return;
        }
        for (C2118ig next : this.f7951c) {
            hwVar.mo14080c(next.f7956a);
            hwVar.mo14079b(next.f7957b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2113ib)) {
            return false;
        }
        C2113ib ibVar = (C2113ib) obj;
        if (this.f7950b == null || ibVar.f7950b == null) {
            if (this.f7951c != null && ibVar.f7951c != null) {
                return this.f7951c.equals(ibVar.f7951c);
            }
            try {
                return Arrays.equals(m10261b(), ibVar.m10261b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f7949a != ibVar.f7949a) {
            return false;
        } else {
            if (!this.f7949a.f7940a.isArray()) {
                return this.f7950b.equals(ibVar.f7950b);
            }
            if (this.f7950b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f7950b, (byte[]) ibVar.f7950b);
            }
            if (this.f7950b instanceof int[]) {
                return Arrays.equals((int[]) this.f7950b, (int[]) ibVar.f7950b);
            }
            if (this.f7950b instanceof long[]) {
                return Arrays.equals((long[]) this.f7950b, (long[]) ibVar.f7950b);
            }
            if (this.f7950b instanceof float[]) {
                return Arrays.equals((float[]) this.f7950b, (float[]) ibVar.f7950b);
            }
            if (this.f7950b instanceof double[]) {
                return Arrays.equals((double[]) this.f7950b, (double[]) ibVar.f7950b);
            }
            if (this.f7950b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f7950b, (boolean[]) ibVar.f7950b);
            }
            return Arrays.deepEquals((Object[]) this.f7950b, (Object[]) ibVar.f7950b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m10261b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private final byte[] m10261b() {
        byte[] bArr = new byte[mo14099a()];
        mo14100a(C2107hw.m10219a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C2113ib clone() {
        C2113ib ibVar = new C2113ib();
        try {
            ibVar.f7949a = this.f7949a;
            if (this.f7951c == null) {
                ibVar.f7951c = null;
            } else {
                ibVar.f7951c.addAll(this.f7951c);
            }
            if (this.f7950b != null) {
                if (this.f7950b instanceof C2116ie) {
                    ibVar.f7950b = (C2116ie) ((C2116ie) this.f7950b).clone();
                } else if (this.f7950b instanceof byte[]) {
                    ibVar.f7950b = ((byte[]) this.f7950b).clone();
                } else {
                    int i = 0;
                    if (this.f7950b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f7950b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        ibVar.f7950b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f7950b instanceof boolean[]) {
                        ibVar.f7950b = ((boolean[]) this.f7950b).clone();
                    } else if (this.f7950b instanceof int[]) {
                        ibVar.f7950b = ((int[]) this.f7950b).clone();
                    } else if (this.f7950b instanceof long[]) {
                        ibVar.f7950b = ((long[]) this.f7950b).clone();
                    } else if (this.f7950b instanceof float[]) {
                        ibVar.f7950b = ((float[]) this.f7950b).clone();
                    } else if (this.f7950b instanceof double[]) {
                        ibVar.f7950b = ((double[]) this.f7950b).clone();
                    } else if (this.f7950b instanceof C2116ie[]) {
                        C2116ie[] ieVarArr = (C2116ie[]) this.f7950b;
                        C2116ie[] ieVarArr2 = new C2116ie[ieVarArr.length];
                        ibVar.f7950b = ieVarArr2;
                        while (i < ieVarArr.length) {
                            ieVarArr2[i] = (C2116ie) ieVarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return ibVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
