package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

final class aog extends ThreadLocal<SecureRandom> {
    aog() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return aof.m2914b();
    }
}
