package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class auj implements Cloneable {

    /* renamed from: a */
    private auh<?, ?> f2576a;

    /* renamed from: b */
    private Object f2577b;

    /* renamed from: c */
    private List<aup> f2578c = new ArrayList();

    auj() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11295a(aup aup) {
        if (this.f2578c != null) {
            this.f2578c.add(aup);
        } else if (this.f2577b instanceof aum) {
            byte[] bArr = aup.f2589b;
            aud a = aud.m4112a(bArr, 0, bArr.length);
            int g = a.mo11265g();
            if (g == bArr.length - aue.m4135a(g)) {
                aum a2 = ((aum) this.f2577b).mo10483a(a);
                this.f2576a = this.f2576a;
                this.f2577b = a2;
                this.f2578c = null;
                return;
            }
            throw aul.m4181a();
        } else if (this.f2577b instanceof aum[]) {
            Collections.singletonList(aup);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(aup);
            throw new NoSuchMethodError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo11293a() {
        if (this.f2577b == null) {
            int i = 0;
            for (aup next : this.f2578c) {
                i += aue.m4150d(next.f2588a) + 0 + next.f2589b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11294a(aue aue) {
        if (this.f2577b == null) {
            for (aup next : this.f2578c) {
                aue.mo11278c(next.f2588a);
                aue.mo11280c(next.f2589b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof auj)) {
            return false;
        }
        auj auj = (auj) obj;
        if (this.f2577b == null || auj.f2577b == null) {
            if (this.f2578c != null && auj.f2578c != null) {
                return this.f2578c.equals(auj.f2578c);
            }
            try {
                return Arrays.equals(m4175b(), auj.m4175b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f2576a != auj.f2576a) {
            return false;
        } else {
            if (!this.f2576a.f2570a.isArray()) {
                return this.f2577b.equals(auj.f2577b);
            }
            if (this.f2577b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f2577b, (byte[]) auj.f2577b);
            }
            if (this.f2577b instanceof int[]) {
                return Arrays.equals((int[]) this.f2577b, (int[]) auj.f2577b);
            }
            if (this.f2577b instanceof long[]) {
                return Arrays.equals((long[]) this.f2577b, (long[]) auj.f2577b);
            }
            if (this.f2577b instanceof float[]) {
                return Arrays.equals((float[]) this.f2577b, (float[]) auj.f2577b);
            }
            if (this.f2577b instanceof double[]) {
                return Arrays.equals((double[]) this.f2577b, (double[]) auj.f2577b);
            }
            if (this.f2577b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f2577b, (boolean[]) auj.f2577b);
            }
            return Arrays.deepEquals((Object[]) this.f2577b, (Object[]) auj.f2577b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m4175b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private final byte[] m4175b() {
        byte[] bArr = new byte[mo11293a()];
        mo11294a(aue.m4139a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final auj clone() {
        auj auj = new auj();
        try {
            auj.f2576a = this.f2576a;
            if (this.f2578c == null) {
                auj.f2578c = null;
            } else {
                auj.f2578c.addAll(this.f2578c);
            }
            if (this.f2577b != null) {
                if (this.f2577b instanceof aum) {
                    auj.f2577b = (aum) ((aum) this.f2577b).clone();
                } else if (this.f2577b instanceof byte[]) {
                    auj.f2577b = ((byte[]) this.f2577b).clone();
                } else {
                    int i = 0;
                    if (this.f2577b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f2577b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        auj.f2577b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f2577b instanceof boolean[]) {
                        auj.f2577b = ((boolean[]) this.f2577b).clone();
                    } else if (this.f2577b instanceof int[]) {
                        auj.f2577b = ((int[]) this.f2577b).clone();
                    } else if (this.f2577b instanceof long[]) {
                        auj.f2577b = ((long[]) this.f2577b).clone();
                    } else if (this.f2577b instanceof float[]) {
                        auj.f2577b = ((float[]) this.f2577b).clone();
                    } else if (this.f2577b instanceof double[]) {
                        auj.f2577b = ((double[]) this.f2577b).clone();
                    } else if (this.f2577b instanceof aum[]) {
                        aum[] aumArr = (aum[]) this.f2577b;
                        aum[] aumArr2 = new aum[aumArr.length];
                        auj.f2577b = aumArr2;
                        while (i < aumArr.length) {
                            aumArr2[i] = (aum) aumArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return auj;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
