package com.google.android.gms.internal.ads;

import java.util.Random;

@C1598qn
public final class brf extends bsm {

    /* renamed from: a */
    private final Random f5180a = new Random();

    /* renamed from: b */
    private long f5181b;

    /* renamed from: c */
    private Object f5182c = new Object();

    public brf() {
        mo12326a();
    }

    /* renamed from: a */
    public final void mo12326a() {
        synchronized (this.f5182c) {
            int i = 3;
            long j = 0;
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                try {
                    j = ((long) this.f5180a.nextInt()) + 2147483648L;
                    if (j != this.f5181b && j != 0) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5181b = j;
        }
    }

    /* renamed from: b */
    public final long mo12327b() {
        return this.f5181b;
    }
}
