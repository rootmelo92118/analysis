package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.C0704b;
import com.google.ads.mediation.C0713e;
import com.google.ads.mediation.C0716f;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.kn */
public final class C1436kn extends C1438kp {

    /* renamed from: b */
    private static final C1489mm f5658b = new C1489mm();

    /* renamed from: a */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f5659a;

    /* renamed from: a */
    public final C1440kr mo12677a(String str) {
        return m7204d(str);
    }

    /* renamed from: b */
    public final boolean mo12679b(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, C1436kn.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            aai.m1630e(sb.toString());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo12678a(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f5659a = map;
    }

    /* renamed from: d */
    private final <NetworkExtrasT extends C0716f, ServerParametersT extends C0713e> C1440kr m7204d(String str) {
        try {
            Class<?> cls = Class.forName(str, false, C1436kn.class.getClassLoader());
            if (C0704b.class.isAssignableFrom(cls)) {
                C0704b bVar = (C0704b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new C1467lr(bVar, (C0716f) this.f5659a.get(bVar.getAdditionalParametersType()));
            } else if (MediationAdapter.class.isAssignableFrom(cls)) {
                return new C1462lm((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                aai.m1630e(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return m7205e(str);
        }
    }

    /* renamed from: e */
    private final C1440kr m7205e(String str) {
        try {
            aai.m1624b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new C1462lm(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new C1462lm(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new C1462lm(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new C1467lr(customEventAdapter, (CustomEventExtras) this.f5659a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            aai.m1627c(sb.toString(), th);
        }
    }

    /* renamed from: c */
    public final C1484mh mo12680c(String str) {
        return C1489mm.m7624a(str);
    }
}
