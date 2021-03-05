package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C0732b;
import com.google.android.gms.common.C0858g;
import com.google.android.gms.common.api.C0792f;
import com.google.android.gms.common.internal.C0892c;
import com.google.android.gms.common.internal.C0905d;
import com.google.android.gms.common.internal.C0910g;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.C2304a;
import com.google.android.gms.signin.C2309e;

/* renamed from: com.google.android.gms.signin.internal.a */
public class C2310a extends C0910g<C2315f> implements C2309e {

    /* renamed from: a */
    private final boolean f8707a;

    /* renamed from: b */
    private final C0905d f8708b;

    /* renamed from: c */
    private final Bundle f8709c;

    /* renamed from: d */
    private Integer f8710d;

    private C2310a(Context context, Looper looper, boolean z, C0905d dVar, Bundle bundle, C0792f.C0793a aVar, C0792f.C0794b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f8707a = true;
        this.f8708b = dVar;
        this.f8709c = bundle;
        this.f8710d = dVar.mo9889h();
    }

    public int getMinApkVersion() {
        return C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public C2310a(Context context, Looper looper, boolean z, C0905d dVar, C2304a aVar, C0792f.C0793a aVar2, C0792f.C0794b bVar) {
        this(context, looper, true, dVar, m11494a(dVar), aVar2, bVar);
    }

    public boolean requiresSignIn() {
        return this.f8707a;
    }

    /* renamed from: a */
    public final void mo14873a(C2313d dVar) {
        C0926p.m1307a(dVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f8708b.mo9883b();
            GoogleSignInAccount googleSignInAccount = null;
            if (C0892c.DEFAULT_ACCOUNT.equals(b.name)) {
                googleSignInAccount = C0732b.m802a(getContext()).mo9464a();
            }
            ((C2315f) getService()).mo14880a(new zah(new ResolveAccountRequest(b, this.f8710d.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.mo9697a(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f8708b.mo9886e())) {
            this.f8709c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f8708b.mo9886e());
        }
        return this.f8709c;
    }

    /* renamed from: a */
    public final void mo14872a() {
        connect(new C0892c.C0896d());
    }

    /* renamed from: a */
    public static Bundle m11494a(C0905d dVar) {
        C2304a g = dVar.mo9888g();
        Integer h = dVar.mo9889h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo9881a());
        if (h != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", h.intValue());
        }
        if (g != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", g.mo14864a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", g.mo14865b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", g.mo14866c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", g.mo14867d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", g.mo14868e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", g.mo14869f());
            if (g.mo14870g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", g.mo14870g().longValue());
            }
            if (g.mo14871h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", g.mo14871h().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C2315f) {
            return (C2315f) queryLocalInterface;
        }
        return new C2316g(iBinder);
    }
}
