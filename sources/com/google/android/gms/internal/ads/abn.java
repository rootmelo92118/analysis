package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class abn implements Executor {
    abn() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
