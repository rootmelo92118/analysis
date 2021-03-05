package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class aws {

    /* renamed from: a */
    protected static volatile bpc f2973a = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final ConditionVariable f2974d = new ConditionVariable();

    /* renamed from: e */
    private static volatile Random f2975e = null;

    /* renamed from: b */
    protected volatile Boolean f2976b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public axq f2977c;

    public aws(axq axq) {
        this.f2977c = axq;
        axq.mo11376c().execute(new awt(this));
    }

    /* renamed from: a */
    public final void mo11343a(int i, int i2, long j) {
        try {
            f2974d.block();
            if (this.f2976b.booleanValue() && f2973a != null) {
                age age = new age();
                age.f1713a = this.f2977c.f3046a.getPackageName();
                age.f1714b = Long.valueOf(j);
                bpg a = f2973a.mo12286a(aum.m4186a((aum) age));
                a.mo12287a(i2);
                a.mo12289b(i);
                a.mo12288a();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m4345a() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return m4348c().nextInt();
        } catch (RuntimeException unused) {
            return m4348c().nextInt();
        }
    }

    /* renamed from: c */
    private static Random m4348c() {
        if (f2975e == null) {
            synchronized (aws.class) {
                if (f2975e == null) {
                    f2975e = new Random();
                }
            }
        }
        return f2975e;
    }
}
