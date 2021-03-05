package com.google.firebase.components;

import com.google.firebase.p047a.C2328a;
import com.google.firebase.p047a.C2329b;
import java.util.Map;

/* renamed from: com.google.firebase.components.p */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
final /* synthetic */ class C2357p implements Runnable {

    /* renamed from: a */
    private final Map.Entry f8790a;

    /* renamed from: b */
    private final C2328a f8791b;

    private C2357p(Map.Entry entry, C2328a aVar) {
        this.f8790a = entry;
        this.f8791b = aVar;
    }

    /* renamed from: a */
    public static Runnable m11599a(Map.Entry entry, C2328a aVar) {
        return new C2357p(entry, aVar);
    }

    public final void run() {
        ((C2329b) this.f8790a.getKey()).mo14905a(this.f8791b);
    }
}
