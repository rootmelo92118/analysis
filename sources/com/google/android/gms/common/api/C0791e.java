package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.C0772a.C0776d;
import com.google.android.gms.common.api.internal.C0807ae;
import com.google.android.gms.common.api.internal.C0815b;
import com.google.android.gms.common.api.internal.C0840w;
import com.google.android.gms.common.internal.C0905d;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.e */
public class C0791e<O extends C0772a.C0776d> {

    /* renamed from: a */
    private final Context f801a;

    /* renamed from: b */
    private final C0772a<O> f802b;

    /* renamed from: c */
    private final O f803c;

    /* renamed from: d */
    private final C0807ae<O> f804d;

    /* renamed from: e */
    private final int f805e;

    @WorkerThread
    /* renamed from: a */
    public C0772a.C0783f mo9581a(Looper looper, C0815b.C0816a<O> aVar) {
        return this.f802b.mo9560a().mo9562a(this.f801a, looper, mo9585c().mo9893a(), this.f803c, aVar, aVar);
    }

    /* renamed from: a */
    public final C0807ae<O> mo9582a() {
        return this.f804d;
    }

    /* renamed from: b */
    public final int mo9584b() {
        return this.f805e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0905d.C0906a mo9585c() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount a;
        GoogleSignInAccount a2;
        C0905d.C0906a aVar = new C0905d.C0906a();
        if (!(this.f803c instanceof C0772a.C0776d.C0778b) || (a2 = ((C0772a.C0776d.C0778b) this.f803c).mo9564a()) == null) {
            account = this.f803c instanceof C0772a.C0776d.C0777a ? ((C0772a.C0776d.C0777a) this.f803c).mo9563a() : null;
        } else {
            account = a2.mo9430d();
        }
        C0905d.C0906a a3 = aVar.mo9890a(account);
        if (!(this.f803c instanceof C0772a.C0776d.C0778b) || (a = ((C0772a.C0776d.C0778b) this.f803c).mo9564a()) == null) {
            set = Collections.emptySet();
        } else {
            set = a.mo9438j();
        }
        return a3.mo9892a((Collection<Scope>) set).mo9894b(this.f801a.getClass().getName()).mo9891a(this.f801a.getPackageName());
    }

    /* renamed from: a */
    public C0840w mo9583a(Context context, Handler handler) {
        return new C0840w(context, handler, mo9585c().mo9893a());
    }
}
