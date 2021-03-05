package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.C0959a;
import com.google.android.gms.common.util.C0969e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ct */
public final class C2217ct extends C2238dn {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2230df f8301a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2286i f8302b;

    /* renamed from: c */
    private volatile Boolean f8303c;

    /* renamed from: d */
    private final C2281fb f8304d;

    /* renamed from: e */
    private final C2248dx f8305e;

    /* renamed from: f */
    private final List<Runnable> f8306f = new ArrayList();

    /* renamed from: g */
    private final C2281fb f8307g;

    protected C2217ct(C2166aw awVar) {
        super(awVar);
        this.f8305e = new C2248dx(awVar.mo14230m());
        this.f8301a = new C2230df(this);
        this.f8304d = new C2218cu(this, awVar);
        this.f8307g = new C2222cy(this, awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo14406v() {
        return false;
    }

    @WorkerThread
    /* renamed from: x */
    public final boolean mo14449x() {
        mo14221d();
        mo14486E();
        return this.f8302b != null;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: y */
    public final void mo14450y() {
        mo14221d();
        mo14486E();
        m10761a((Runnable) new C2223cz(this, m10758a(true)));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14442a(C2286i iVar, AbstractSafeParcelable abstractSafeParcelable, zzk zzk) {
        int i;
        List<AbstractSafeParcelable> a;
        mo14221d();
        mo14218b();
        mo14486E();
        boolean H = m10752H();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!H || (a = mo14227j().mo14811a(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(a);
                i = a.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzag) {
                    try {
                        iVar.mo14344a((zzag) abstractSafeParcelable2, zzk);
                    } catch (RemoteException e) {
                        mo14235r().mo14830d_().mo14842a("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzfv) {
                    try {
                        iVar.mo14346a((zzfv) abstractSafeParcelable2, zzk);
                    } catch (RemoteException e2) {
                        mo14235r().mo14830d_().mo14842a("Failed to send attribute to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzo) {
                    try {
                        iVar.mo14349a((zzo) abstractSafeParcelable2, zzk);
                    } catch (RemoteException e3) {
                        mo14235r().mo14830d_().mo14842a("Failed to send conditional property to the service", e3);
                    }
                } else {
                    mo14235r().mo14830d_().mo14841a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14443a(zzag zzag, String str) {
        C0926p.m1306a(zzag);
        mo14221d();
        mo14486E();
        boolean H = m10752H();
        m10761a((Runnable) new C2225da(this, H, H && mo14227j().mo14812a(zzag), zzag, m10758a(true), str));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14445a(zzo zzo) {
        C0926p.m1306a(zzo);
        mo14221d();
        mo14486E();
        mo14238u();
        m10761a((Runnable) new C2226db(this, true, mo14227j().mo14814a(zzo), new zzo(zzo), m10758a(true), zzo));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14447a(AtomicReference<List<zzo>> atomicReference, String str, String str2, String str3) {
        mo14221d();
        mo14486E();
        m10761a((Runnable) new C2227dc(this, atomicReference, str, str2, str3, m10758a(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14448a(AtomicReference<List<zzfv>> atomicReference, String str, String str2, String str3, boolean z) {
        mo14221d();
        mo14486E();
        m10761a((Runnable) new C2228dd(this, atomicReference, str, str2, str3, z, m10758a(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14444a(zzfv zzfv) {
        mo14221d();
        mo14486E();
        m10761a((Runnable) new C2229de(this, m10752H() && mo14227j().mo14813a(zzfv), zzfv, m10758a(true)));
    }

    /* renamed from: H */
    private final boolean m10752H() {
        mo14238u();
        return true;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14446a(AtomicReference<String> atomicReference) {
        mo14221d();
        mo14486E();
        m10761a((Runnable) new C2219cv(this, atomicReference, m10758a(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: z */
    public final void mo14451z() {
        mo14221d();
        mo14486E();
        m10761a((Runnable) new C2220cw(this, m10758a(true)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14440a(C2212co coVar) {
        mo14221d();
        mo14486E();
        m10761a((Runnable) new C2221cx(this, coVar));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: I */
    public final void m10753I() {
        mo14221d();
        this.f8305e.mo14499a();
        this.f8304d.mo14796a(C2284h.f8522O.mo14804b().longValue());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    @android.support.annotation.WorkerThread
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14437A() {
        /*
            r6 = this;
            r6.mo14221d()
            r6.mo14486E()
            boolean r0 = r6.mo14449x()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r6.f8303c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0114
            r6.mo14221d()
            r6.mo14486E()
            com.google.android.gms.measurement.internal.ad r0 = r6.mo14236s()
            java.lang.Boolean r0 = r0.mo14257i()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x010e
        L_0x002c:
            r6.mo14238u()
            com.google.android.gms.measurement.internal.l r0 = r6.mo14224g()
            int r0 = r0.mo14806B()
            if (r0 != r2) goto L_0x003d
        L_0x0039:
            r0 = 1
        L_0x003a:
            r3 = 1
            goto L_0x00eb
        L_0x003d:
            com.google.android.gms.measurement.internal.r r0 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()
            java.lang.String r3 = "Checking service availability"
            r0.mo14841a(r3)
            com.google.android.gms.measurement.internal.el r0 = r6.mo14233p()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.mo14560a((int) r3)
            r3 = 9
            if (r0 == r3) goto L_0x00dd
            r3 = 18
            if (r0 == r3) goto L_0x00ce
            switch(r0) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00af;
                case 2: goto L_0x0083;
                case 3: goto L_0x0075;
                default: goto L_0x0060;
            }
        L_0x0060:
            com.google.android.gms.measurement.internal.r r3 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo14833i()
            java.lang.String r4 = "Unexpected service status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.mo14842a(r4, r0)
        L_0x0071:
            r0 = 0
        L_0x0072:
            r3 = 0
            goto L_0x00eb
        L_0x0075:
            com.google.android.gms.measurement.internal.r r0 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()
            java.lang.String r3 = "Service disabled"
            r0.mo14841a(r3)
            goto L_0x0071
        L_0x0083:
            com.google.android.gms.measurement.internal.r r0 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14837w()
            java.lang.String r3 = "Service container out of date"
            r0.mo14841a(r3)
            com.google.android.gms.measurement.internal.el r0 = r6.mo14233p()
            int r0 = r0.mo14583j()
            r3 = 14500(0x38a4, float:2.0319E-41)
            if (r0 >= r3) goto L_0x009d
            goto L_0x00bc
        L_0x009d:
            com.google.android.gms.measurement.internal.ad r0 = r6.mo14236s()
            java.lang.Boolean r0 = r0.mo14257i()
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0071
        L_0x00ad:
            r0 = 1
            goto L_0x0072
        L_0x00af:
            com.google.android.gms.measurement.internal.r r0 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()
            java.lang.String r3 = "Service missing"
            r0.mo14841a(r3)
        L_0x00bc:
            r0 = 0
            goto L_0x003a
        L_0x00bf:
            com.google.android.gms.measurement.internal.r r0 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()
            java.lang.String r3 = "Service available"
            r0.mo14841a(r3)
            goto L_0x0039
        L_0x00ce:
            com.google.android.gms.measurement.internal.r r0 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()
            java.lang.String r3 = "Service updating"
            r0.mo14841a(r3)
            goto L_0x0039
        L_0x00dd:
            com.google.android.gms.measurement.internal.r r0 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()
            java.lang.String r3 = "Service invalid"
            r0.mo14841a(r3)
            goto L_0x0071
        L_0x00eb:
            if (r0 != 0) goto L_0x0105
            com.google.android.gms.measurement.internal.et r4 = r6.mo14237t()
            boolean r4 = r4.mo14745x()
            if (r4 == 0) goto L_0x0105
            com.google.android.gms.measurement.internal.r r3 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo14830d_()
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.mo14841a(r4)
            r3 = 0
        L_0x0105:
            if (r3 == 0) goto L_0x010e
            com.google.android.gms.measurement.internal.ad r3 = r6.mo14236s()
            r3.mo14245a((boolean) r0)
        L_0x010e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f8303c = r0
        L_0x0114:
            java.lang.Boolean r0 = r6.f8303c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0122
            com.google.android.gms.measurement.internal.df r0 = r6.f8301a
            r0.mo14467b()
            return
        L_0x0122:
            com.google.android.gms.measurement.internal.et r0 = r6.mo14237t()
            boolean r0 = r0.mo14745x()
            if (r0 != 0) goto L_0x0182
            r6.mo14238u()
            android.content.Context r0 = r6.mo14231n()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r6.mo14231n()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x0155
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0155
            r1 = 1
        L_0x0155:
            if (r1 == 0) goto L_0x0175
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r6.mo14231n()
            r6.mo14238u()
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            com.google.android.gms.measurement.internal.df r1 = r6.f8301a
            r1.mo14466a((android.content.Intent) r0)
            return
        L_0x0175:
            com.google.android.gms.measurement.internal.r r0 = r6.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.mo14841a(r1)
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2217ct.mo14437A():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final Boolean mo14438B() {
        return this.f8303c;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public final void mo14441a(C2286i iVar) {
        mo14221d();
        C0926p.m1306a(iVar);
        this.f8302b = iVar;
        m10753I();
        m10755K();
    }

    @WorkerThread
    /* renamed from: C */
    public final void mo14439C() {
        mo14221d();
        mo14486E();
        this.f8301a.mo14465a();
        try {
            C0959a.m1447a().mo9987a(mo14231n(), this.f8301a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f8302b = null;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public final void m10759a(ComponentName componentName) {
        mo14221d();
        if (this.f8302b != null) {
            this.f8302b = null;
            mo14235r().mo14838x().mo14842a("Disconnected from device MeasurementService", componentName);
            mo14221d();
            mo14437A();
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: J */
    public final void m10754J() {
        mo14221d();
        if (mo14449x()) {
            mo14235r().mo14838x().mo14841a("Inactivity, disconnecting from the service");
            mo14439C();
        }
    }

    @WorkerThread
    /* renamed from: a */
    private final void m10761a(Runnable runnable) {
        mo14221d();
        if (mo14449x()) {
            runnable.run();
        } else if (((long) this.f8306f.size()) >= 1000) {
            mo14235r().mo14830d_().mo14841a("Discarding data. Max runnable queue size reached");
        } else {
            this.f8306f.add(runnable);
            this.f8307g.mo14796a(60000);
            mo14437A();
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: K */
    public final void m10755K() {
        mo14221d();
        mo14235r().mo14838x().mo14842a("Processing queued up service tasks", Integer.valueOf(this.f8306f.size()));
        for (Runnable run : this.f8306f) {
            try {
                run.run();
            } catch (Exception e) {
                mo14235r().mo14830d_().mo14842a("Task exception while flushing queue", e);
            }
        }
        this.f8306f.clear();
        this.f8307g.mo14798c();
    }

    @Nullable
    @WorkerThread
    /* renamed from: a */
    private final zzk m10758a(boolean z) {
        mo14238u();
        return mo14224g().mo14807a(z ? mo14235r().mo14839y() : null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2143a mo14222e() {
        return super.mo14222e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2200cc mo14223f() {
        return super.mo14223f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2289l mo14224g() {
        return super.mo14224g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2217ct mo14225h() {
        return super.mo14225h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C2213cp mo14226i() {
        return super.mo14226i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C2291n mo14227j() {
        return super.mo14227j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C2242dr mo14228k() {
        return super.mo14228k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
