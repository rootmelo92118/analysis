package com.google.android.gms.common.api;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.f */
public abstract class C0792f {
    @GuardedBy("sAllClients")

    /* renamed from: a */
    private static final Set<C0792f> f806a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.f$a */
    public interface C0793a {
        /* renamed from: a */
        void mo9588a(int i);

        /* renamed from: a */
        void mo9589a(@Nullable Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.api.f$b */
    public interface C0794b {
        /* renamed from: a */
        void mo9590a(@NonNull ConnectionResult connectionResult);
    }

    public abstract void registerConnectionFailedListener(@NonNull C0794b bVar);

    public abstract void unregisterConnectionFailedListener(@NonNull C0794b bVar);
}
