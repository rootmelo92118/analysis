package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.C0849c;
import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.C0792f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0892c;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C0910g<T extends IInterface> extends C0892c<T> implements C0772a.C0783f {

    /* renamed from: a */
    private final C0905d f1101a;

    /* renamed from: b */
    private final Set<Scope> f1102b;

    /* renamed from: c */
    private final Account f1103c;

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: a */
    public Set<Scope> mo9897a(@NonNull Set<Scope> set) {
        return set;
    }

    protected C0910g(Context context, Looper looper, int i, C0905d dVar, C0792f.C0793a aVar, C0792f.C0794b bVar) {
        this(context, looper, C0911h.m1280a(context), C0849c.m1108a(), i, dVar, (C0792f.C0793a) C0926p.m1306a(aVar), (C0792f.C0794b) C0926p.m1306a(bVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C0910g(Context context, Looper looper, C0911h hVar, C0849c cVar, int i, C0905d dVar, C0792f.C0793a aVar, C0792f.C0794b bVar) {
        super(context, looper, hVar, cVar, i, m1276a(aVar), m1277a(bVar), dVar.mo9887f());
        this.f1101a = dVar;
        this.f1103c = dVar.mo9881a();
        this.f1102b = m1278b(dVar.mo9885d());
    }

    /* renamed from: b */
    private final Set<Scope> m1278b(@NonNull Set<Scope> set) {
        Set<Scope> a = mo9897a(set);
        for (Scope contains : a) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a;
    }

    public final Account getAccount() {
        return this.f1103c;
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> getScopes() {
        return this.f1102b;
    }

    @Nullable
    /* renamed from: a */
    private static C0892c.C0893a m1276a(C0792f.C0793a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C0938y(aVar);
    }

    @Nullable
    /* renamed from: a */
    private static C0892c.C0894b m1277a(C0792f.C0794b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C0939z(bVar);
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }
}
