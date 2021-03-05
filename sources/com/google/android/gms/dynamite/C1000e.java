package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
final class C1000e implements DynamiteModule.C0991b {
    C1000e() {
    }

    /* renamed from: a */
    public final DynamiteModule.C0991b.C0993b mo10005a(Context context, String str, DynamiteModule.C0991b.C0992a aVar) {
        DynamiteModule.C0991b.C0993b bVar = new DynamiteModule.C0991b.C0993b();
        bVar.f1253a = aVar.mo10006a(context, str);
        if (bVar.f1253a != 0) {
            bVar.f1254b = aVar.mo10007a(context, str, false);
        } else {
            bVar.f1254b = aVar.mo10007a(context, str, true);
        }
        if (bVar.f1253a == 0 && bVar.f1254b == 0) {
            bVar.f1255c = 0;
        } else if (bVar.f1253a >= bVar.f1254b) {
            bVar.f1255c = -1;
        } else {
            bVar.f1255c = 1;
        }
        return bVar;
    }
}
