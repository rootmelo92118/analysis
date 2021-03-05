package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C2166aw;
import com.google.android.gms.measurement.internal.C2290m;
import com.google.firebase.C2327a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p047a.C2328a;
import com.google.firebase.p047a.C2331d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.connector.b */
public class C2333b implements C2332a {

    /* renamed from: b */
    private static volatile C2332a f8751b;

    /* renamed from: a */
    final Map<String, Object> f8752a = new ConcurrentHashMap();

    /* renamed from: c */
    private final AppMeasurement f8753c;

    private C2333b(AppMeasurement appMeasurement) {
        C0926p.m1306a(appMeasurement);
        this.f8753c = appMeasurement;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    /* renamed from: a */
    public static C2332a m11539a(FirebaseApp firebaseApp, Context context, C2331d dVar) {
        C0926p.m1306a(firebaseApp);
        C0926p.m1306a(context);
        C0926p.m1306a(dVar);
        C0926p.m1306a(context.getApplicationContext());
        if (f8751b == null) {
            synchronized (C2333b.class) {
                if (f8751b == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.mo14894d()) {
                        dVar.mo14907a(C2327a.class, C2334c.f8754a, C2335d.f8755a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    f8751b = new C2333b(C2166aw.m10527a(context, C2290m.m11355a(bundle)).mo14324i());
                }
            }
        }
        return f8751b;
    }

    /* renamed from: a */
    static final /* synthetic */ void m11540a(C2328a aVar) {
        boolean z = ((C2327a) aVar.mo14903b()).f8745a;
        synchronized (C2333b.class) {
            ((C2333b) f8751b).f8753c.mo14148a(z);
        }
    }
}
