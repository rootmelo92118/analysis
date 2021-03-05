package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@C1598qn
public final class bqp {

    /* renamed from: a */
    public static final bqp f5123a = new bqp();

    protected bqp() {
    }

    /* renamed from: a */
    public static zzwb m6264a(Context context, bti bti) {
        List list;
        Context context2;
        String str;
        bti bti2 = bti;
        Date a = bti.mo12358a();
        long time = a != null ? a.getTime() : -1;
        String b = bti.mo12361b();
        int c = bti.mo12362c();
        Set<String> d = bti.mo12364d();
        if (!d.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(d));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a2 = bti2.mo12359a(context2);
        int l = bti.mo12372l();
        Location e = bti.mo12365e();
        Bundle b2 = bti2.mo12360b(AdMobAdapter.class);
        boolean f = bti.mo12366f();
        String g = bti.mo12367g();
        SearchAdRequest i = bti.mo12369i();
        zzzs zzzs = i != null ? new zzzs(i) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            bre.m6317a();
            str = C1851zx.m8586a(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        return new zzwb(8, time, b2, c, list, a2, l, f, g, zzzs, e, b, bti.mo12371k(), bti.mo12373m(), Collections.unmodifiableList(new ArrayList(bti.mo12374n())), bti.mo12368h(), str, bti.mo12375o(), (zzvv) null, bti.mo12376p(), bti.mo12377q());
    }
}
