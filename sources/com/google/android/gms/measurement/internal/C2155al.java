package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C0959a;
import com.google.android.gms.internal.measurement.C1986dt;

/* renamed from: com.google.android.gms.measurement.internal.al */
final class C2155al implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1986dt f8085a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f8086b;

    /* renamed from: c */
    private final /* synthetic */ C2154ak f8087c;

    C2155al(C2154ak akVar, C1986dt dtVar, ServiceConnection serviceConnection) {
        this.f8087c = akVar;
        this.f8085a = dtVar;
        this.f8086b = serviceConnection;
    }

    public final void run() {
        C2153aj ajVar = this.f8087c.f8083a;
        String a = this.f8087c.f8084b;
        C1986dt dtVar = this.f8085a;
        ServiceConnection serviceConnection = this.f8086b;
        Bundle a2 = ajVar.mo14271a(a, dtVar);
        ajVar.f8082a.mo14234q().mo14221d();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                ajVar.f8082a.mo14235r().mo14830d_().mo14841a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    ajVar.f8082a.mo14235r().mo14830d_().mo14841a("No referrer defined in install referrer response");
                } else {
                    ajVar.f8082a.mo14235r().mo14838x().mo14842a("InstallReferrer API result", string);
                    C2264el j2 = ajVar.f8082a.mo14325j();
                    String valueOf = String.valueOf(string);
                    Bundle a3 = j2.mo14562a(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (a3 == null) {
                        ajVar.f8082a.mo14235r().mo14830d_().mo14841a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a3.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j3 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j3 == 0) {
                                ajVar.f8082a.mo14235r().mo14830d_().mo14841a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a3.putLong("click_timestamp", j3);
                            }
                        }
                        if (j == ajVar.f8082a.mo14318c().f8050i.mo14265a()) {
                            ajVar.f8082a.mo14238u();
                            ajVar.f8082a.mo14235r().mo14838x().mo14841a("Campaign has already been logged");
                        } else {
                            ajVar.f8082a.mo14318c().f8050i.mo14266a(j);
                            ajVar.f8082a.mo14238u();
                            ajVar.f8082a.mo14235r().mo14838x().mo14842a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            a3.putString("_cis", "referrer API");
                            ajVar.f8082a.mo14323h().mo14395a("auto", "_cmp", a3);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C0959a.m1447a().mo9987a(ajVar.f8082a.mo14231n(), serviceConnection);
        }
    }
}
