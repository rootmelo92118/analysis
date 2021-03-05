package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class aum {

    /* renamed from: aa */
    protected volatile int f2582aa = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo10482a() {
        return 0;
    }

    /* renamed from: a */
    public abstract aum mo10483a(aud aud);

    /* renamed from: a */
    public void mo10484a(aue aue) {
    }

    /* renamed from: d */
    public final int mo11299d() {
        int a = mo10482a();
        this.f2582aa = a;
        return a;
    }

    /* renamed from: a */
    public static final byte[] m4186a(aum aum) {
        byte[] bArr = new byte[aum.mo11299d()];
        try {
            aue a = aue.m4140a(bArr, 0, bArr.length);
            aum.mo10484a(a);
            a.mo11269a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public static final <T extends aum> T m4184a(T t, byte[] bArr) {
        return m4185a(t, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private static final <T extends aum> T m4185a(T t, byte[] bArr, int i, int i2) {
        try {
            aud a = aud.m4112a(bArr, 0, i2);
            t.mo10483a(a);
            a.mo11252a(0);
            return t;
        } catch (aul e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public String toString() {
        return auo.m4194a(this);
    }

    /* renamed from: c */
    public aum clone() {
        return (aum) super.clone();
    }
}
