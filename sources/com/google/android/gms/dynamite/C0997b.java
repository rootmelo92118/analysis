package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
final class C0997b implements DynamiteModule.C0991b {
    C0997b() {
    }

    /* renamed from: a */
    public final DynamiteModule.C0991b.C0993b mo10005a(Context context, String str, DynamiteModule.C0991b.C0992a aVar) {
        DynamiteModule.C0991b.C0993b bVar = new DynamiteModule.C0991b.C0993b();
        bVar.f1254b = aVar.mo10007a(context, str, true);
        if (bVar.f1254b != 0) {
            bVar.f1255c = 1;
        } else {
            bVar.f1253a = aVar.mo10006a(context, str);
            if (bVar.f1253a != 0) {
                bVar.f1255c = -1;
            }
        }
        return bVar;
    }
}
