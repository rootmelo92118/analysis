package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.p040b.C0734a;
import com.google.android.gms.p040b.C0741g;
import com.google.android.gms.p040b.C0742h;
import com.google.android.gms.p040b.C0745j;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.ar */
final class C2383ar implements C2392b {

    /* renamed from: a */
    private final FirebaseApp f8869a;

    /* renamed from: b */
    private final C2406p f8870b;

    /* renamed from: c */
    private final C2412v f8871c;

    /* renamed from: d */
    private final Executor f8872d;

    C2383ar(FirebaseApp firebaseApp, C2406p pVar, Executor executor) {
        this(firebaseApp, pVar, executor, new C2412v(firebaseApp.mo14890a(), pVar));
    }

    /* renamed from: a */
    public final boolean mo15001a() {
        return true;
    }

    @VisibleForTesting
    private C2383ar(FirebaseApp firebaseApp, C2406p pVar, Executor executor, C2412v vVar) {
        this.f8869a = firebaseApp;
        this.f8870b = pVar;
        this.f8871c = vVar;
        this.f8872d = executor;
    }

    /* renamed from: b */
    public final boolean mo15003b() {
        return this.f8870b.mo15032a() != 0;
    }

    /* renamed from: a */
    public final C0741g<Void> mo14997a(String str, String str2) {
        return C0745j.m828a(null);
    }

    /* renamed from: a */
    public final C0741g<String> mo14999a(String str, String str2, String str3, String str4) {
        return m11673b(m11670a(str, str3, str4, new Bundle()));
    }

    /* renamed from: a */
    public final C0741g<Void> mo14998a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m11669a(m11673b(m11670a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: b */
    public final C0741g<Void> mo15002b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        bundle.putString("delete", "1");
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m11669a(m11673b(m11670a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: a */
    private final C0741g<Bundle> m11670a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f8869a.mo14893c().mo14913a());
        bundle.putString("gmsv", Integer.toString(this.f8870b.mo15035d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f8870b.mo15033b());
        bundle.putString("app_ver_name", this.f8870b.mo15034c());
        bundle.putString("cliv", "fiid-12451000");
        C0742h hVar = new C0742h();
        this.f8872d.execute(new C2384as(this, bundle, hVar));
        return hVar.mo9485a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m11671a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    private final <T> C0741g<Void> m11669a(C0741g<T> gVar) {
        return gVar.mo9473a(C2375aj.m11663a(), (C0734a<T, TContinuationResult>) new C2385at(this));
    }

    /* renamed from: b */
    private final C0741g<String> m11673b(C0741g<Bundle> gVar) {
        return gVar.mo9473a(this.f8872d, (C0734a<Bundle, TContinuationResult>) new C2386au(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo15000a(Bundle bundle, C0742h hVar) {
        try {
            hVar.mo9487a(this.f8871c.mo15038a(bundle));
        } catch (IOException e) {
            hVar.mo9486a((Exception) e);
        }
    }
}
