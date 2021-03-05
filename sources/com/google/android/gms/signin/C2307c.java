package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.C0792f;
import com.google.android.gms.common.internal.C0905d;
import com.google.android.gms.signin.internal.C2310a;

/* renamed from: com.google.android.gms.signin.c */
final class C2307c extends C0772a.C0773a<C2310a, C2304a> {
    C2307c() {
    }

    /* renamed from: a */
    public final /* synthetic */ C0772a.C0783f mo9562a(Context context, Looper looper, C0905d dVar, Object obj, C0792f.C0793a aVar, C0792f.C0794b bVar) {
        C2304a aVar2 = (C2304a) obj;
        if (aVar2 == null) {
            aVar2 = C2304a.f8690a;
        }
        return new C2310a(context, looper, true, dVar, aVar2, aVar, bVar);
    }
}
