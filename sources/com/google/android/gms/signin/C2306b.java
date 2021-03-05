package com.google.android.gms.signin;

import android.support.p034v4.app.NotificationCompat;
import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C2310a;

/* renamed from: com.google.android.gms.signin.b */
public final class C2306b {

    /* renamed from: a */
    public static final C0772a.C0773a<C2310a, C2304a> f8699a = new C2307c();

    /* renamed from: b */
    public static final C0772a<C2304a> f8700b = new C0772a<>("SignIn.API", f8699a, f8701c);

    /* renamed from: c */
    private static final C0772a.C0784g<C2310a> f8701c = new C0772a.C0784g<>();

    /* renamed from: d */
    private static final C0772a.C0784g<C2310a> f8702d = new C0772a.C0784g<>();

    /* renamed from: e */
    private static final C0772a.C0773a<C2310a, Object> f8703e = new C2308d();

    /* renamed from: f */
    private static final Scope f8704f = new Scope("profile");

    /* renamed from: g */
    private static final Scope f8705g = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* renamed from: h */
    private static final C0772a<Object> f8706h = new C0772a<>("SignIn.INTERNAL_API", f8703e, f8702d);
}
