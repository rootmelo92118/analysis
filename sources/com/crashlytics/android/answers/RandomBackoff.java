package com.crashlytics.android.answers;

import java.util.Random;
import p000a.p001a.p002a.p003a.p004a.p007c.p008a.C0059a;

class RandomBackoff implements C0059a {
    final C0059a backoff;
    final double jitterPercent;
    final Random random;

    public RandomBackoff(C0059a aVar, double d) {
        this(aVar, d, new Random());
    }

    public RandomBackoff(C0059a aVar, double d, Random random2) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (aVar == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random2 != null) {
            this.backoff = aVar;
            this.jitterPercent = d;
            this.random = random2;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }

    public long getDelayMillis(int i) {
        double randomJitter = randomJitter();
        double delayMillis = (double) this.backoff.getDelayMillis(i);
        Double.isNaN(delayMillis);
        return (long) (randomJitter * delayMillis);
    }

    /* access modifiers changed from: package-private */
    public double randomJitter() {
        double d = 1.0d - this.jitterPercent;
        return d + (((this.jitterPercent + 1.0d) - d) * this.random.nextDouble());
    }
}
