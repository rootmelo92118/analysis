package com.google.firebase.iid;

import android.support.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.C2340a;
import com.google.firebase.components.C2345d;
import com.google.firebase.components.C2346e;
import com.google.firebase.iid.p050a.C2365a;
import com.google.firebase.p047a.C2331d;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements C2345d {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C2363a implements C2365a {

        /* renamed from: a */
        private final FirebaseInstanceId f8822a;

        public C2363a(FirebaseInstanceId firebaseInstanceId) {
            this.f8822a = firebaseInstanceId;
        }
    }

    @Keep
    public final List<C2340a<?>> getComponents() {
        return Arrays.asList(new C2340a[]{C2340a.m11547a(FirebaseInstanceId.class).mo14930a(C2346e.m11571a(FirebaseApp.class)).mo14930a(C2346e.m11571a(C2331d.class)).mo14929a(C2407q.f8910a).mo14928a().mo14932c(), C2340a.m11547a(C2365a.class).mo14930a(C2346e.m11571a(FirebaseInstanceId.class)).mo14929a(C2408r.f8911a).mo14932c()});
    }
}
