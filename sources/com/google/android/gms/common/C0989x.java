package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.x */
final class C0989x extends C0987v {

    /* renamed from: b */
    private final Callable<String> f1235b;

    private C0989x(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.f1235b = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo10000b() {
        try {
            return this.f1235b.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
