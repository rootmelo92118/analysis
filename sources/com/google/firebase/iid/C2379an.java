package com.google.firebase.iid;

import com.google.android.gms.p040b.C0742h;

/* renamed from: com.google.firebase.iid.an */
final /* synthetic */ class C2379an implements Runnable {

    /* renamed from: a */
    private final FirebaseInstanceId f8853a;

    /* renamed from: b */
    private final String f8854b;

    /* renamed from: c */
    private final String f8855c;

    /* renamed from: d */
    private final C0742h f8856d;

    /* renamed from: e */
    private final String f8857e;

    C2379an(FirebaseInstanceId firebaseInstanceId, String str, String str2, C0742h hVar, String str3) {
        this.f8853a = firebaseInstanceId;
        this.f8854b = str;
        this.f8855c = str2;
        this.f8856d = hVar;
        this.f8857e = str3;
    }

    public final void run() {
        this.f8853a.mo14957a(this.f8854b, this.f8855c, this.f8856d, this.f8857e);
    }
}
