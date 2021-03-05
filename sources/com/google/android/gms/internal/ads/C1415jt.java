package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.p046a.C2141a;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.jt */
public final class C1415jt extends ahq {

    /* renamed from: a */
    private static final Object f5539a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private static C1415jt f5540b;

    /* renamed from: c */
    private final C2141a f5541c;

    private C1415jt(C2141a aVar) {
        this.f5541c = aVar;
    }

    /* renamed from: a */
    public static void m7109a(Context context, String str, Bundle bundle) {
        synchronized (f5539a) {
            if (f5540b == null) {
                C1415jt jtVar = new C1415jt(C2141a.m10368a(context, "Ads", "am", str, bundle));
                f5540b = jtVar;
                new Thread(new C1416ju(context, jtVar)).start();
            }
        }
    }

    /* renamed from: a */
    public final void mo10553a(Bundle bundle) {
        this.f5541c.mo14209c(bundle);
    }

    /* renamed from: b */
    public final Bundle mo10557b(Bundle bundle) {
        return this.f5541c.mo14203b(bundle);
    }

    /* renamed from: a */
    public final void mo10555a(String str, String str2, Bundle bundle) {
        this.f5541c.mo14201a(str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo10556a(String str, String str2, C0719a aVar) {
        this.f5541c.mo14202a(str, str2, aVar != null ? C0722b.m770a(aVar) : null);
    }

    /* renamed from: a */
    public final Map mo10552a(String str, String str2, boolean z) {
        return this.f5541c.mo14197a(str, str2, z);
    }

    /* renamed from: a */
    public final int mo10549a(String str) {
        return this.f5541c.mo14207c(str);
    }

    /* renamed from: c */
    public final void mo10562c(Bundle bundle) {
        this.f5541c.mo14199a(bundle);
    }

    /* renamed from: b */
    public final void mo10560b(String str, String str2, Bundle bundle) {
        this.f5541c.mo14206b(str, str2, bundle);
    }

    /* renamed from: a */
    public final List mo10551a(String str, String str2) {
        return this.f5541c.mo14196a(str, str2);
    }

    /* renamed from: a */
    public final String mo10550a() {
        return this.f5541c.mo14208c();
    }

    /* renamed from: b */
    public final String mo10558b() {
        return this.f5541c.mo14210d();
    }

    /* renamed from: c */
    public final long mo10561c() {
        return this.f5541c.mo14211e();
    }

    /* renamed from: b */
    public final void mo10559b(String str) {
        this.f5541c.mo14200a(str);
    }

    /* renamed from: c */
    public final void mo10563c(String str) {
        this.f5541c.mo14205b(str);
    }

    /* renamed from: a */
    public final void mo10554a(C0719a aVar, String str, String str2) {
        this.f5541c.mo14198a(aVar != null ? (Activity) C0722b.m770a(aVar) : null, str, str2);
    }

    /* renamed from: d */
    public final String mo10564d() {
        return this.f5541c.mo14195a();
    }

    /* renamed from: e */
    public final String mo10565e() {
        return this.f5541c.mo14204b();
    }

    /* renamed from: f */
    public final String mo10566f() {
        return this.f5541c.mo14212f();
    }

    /* renamed from: a */
    static final /* synthetic */ void m7108a(Context context, C1415jt jtVar) {
        try {
            ((ahr) aaj.m1633a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", C1417jv.f5544a)).mo10567a(jtVar);
        } catch (RemoteException | aal | NullPointerException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }
}
