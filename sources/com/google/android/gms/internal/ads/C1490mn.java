package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mn */
public final class C1490mn extends C1485mi {

    /* renamed from: a */
    private final ahy f5716a;

    public C1490mn(ahy ahy) {
        this.f5716a = ahy;
    }

    /* renamed from: a */
    public final void mo12789a(String str, String str2, Bundle bundle, C0719a aVar, C1474ly lyVar, C1443ku kuVar, zzwf zzwf) {
        try {
            C1491mo moVar = new C1491mo(this, lyVar, kuVar);
            ahy ahy = this.f5716a;
            new ahx((Context) C0722b.m770a(aVar), str, m7626b(str2), bundle);
            zzc.zza(zzwf.f7296e, zzwf.f7293b, zzwf.f7292a);
            moVar.mo10568a(String.valueOf(ahy.getClass().getSimpleName()).concat(" does not support banner ads."));
        } catch (Throwable th) {
            aai.m1625b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12790a(String str, String str2, Bundle bundle, C0719a aVar, C1478mb mbVar, C1443ku kuVar) {
        try {
            C1492mp mpVar = new C1492mp(this, mbVar, kuVar);
            ahy ahy = this.f5716a;
            new ahx((Context) C0722b.m770a(aVar), str, m7626b(str2), bundle);
            mpVar.mo10568a(String.valueOf(ahy.getClass().getSimpleName()).concat(" does not support interstitial ads."));
        } catch (Throwable th) {
            aai.m1625b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12792a(String str, String str2, Bundle bundle, C0719a aVar, C1482mf mfVar, C1443ku kuVar) {
        try {
            C1493mq mqVar = new C1493mq(this, mfVar, kuVar);
            ahy ahy = this.f5716a;
            new ahx((Context) C0722b.m770a(aVar), str, m7626b(str2), bundle);
            mqVar.mo10568a(String.valueOf(ahy.getClass().getSimpleName()).concat(" does not support rewarded ads."));
        } catch (Throwable th) {
            aai.m1625b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12791a(String str, String str2, Bundle bundle, C0719a aVar, C1480md mdVar, C1443ku kuVar) {
        try {
            C1494mr mrVar = new C1494mr(this, mdVar, kuVar);
            ahy ahy = this.f5716a;
            new ahx((Context) C0722b.m770a(aVar), str, m7626b(str2), bundle);
            mrVar.mo10568a(String.valueOf(ahy.getClass().getSimpleName()).concat(" does not support native ads."));
        } catch (Throwable th) {
            aai.m1625b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo12796d() {
        ahv ahv = null;
        try {
            ahv.mo10569a();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: e */
    public final void mo12797e() {
        ahw ahw = null;
        try {
            ahw.mo10570a();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final btb mo12795c() {
        if (!(this.f5716a instanceof zzb)) {
            return null;
        }
        try {
            return ((zzb) this.f5716a).getVideoController();
        } catch (Throwable th) {
            aai.m1625b("", th);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.ms, com.google.android.gms.internal.ads.aia] */
    /* renamed from: a */
    public final void mo12788a(C0719a aVar, String str, Bundle bundle, Bundle bundle2, zzwf zzwf, C1487mk mkVar) {
        try {
            ? msVar = new C1495ms(this, mkVar);
            this.f5716a.mo10573a(new ahz((Context) C0722b.m770a(aVar), new zza(m7625a(str), bundle2), bundle, zzc.zza(zzwf.f7296e, zzwf.f7293b, zzwf.f7292a)), msVar);
        } catch (Throwable th) {
            aai.m1625b("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final zzans mo12786a() {
        return zzans.m8608a(this.f5716a.mo10574b());
    }

    /* renamed from: b */
    public final zzans mo12794b() {
        return zzans.m8608a(this.f5716a.mo10571a());
    }

    /* renamed from: a */
    public final void mo12787a(C0719a aVar) {
        this.f5716a.mo10572a((Context) C0722b.m770a(aVar));
    }

    /* renamed from: a */
    public final void mo12793a(String[] strArr, Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < strArr.length) {
            try {
                arrayList.add(new zza(m7625a(strArr[i]), bundleArr[i]));
                i++;
            } catch (IndexOutOfBoundsException unused) {
                throw new RemoteException();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m7625a(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = -1396342996(0xffffffffacc57f2c, float:-5.6131957E-12)
            if (r0 == r1) goto L_0x0037
            r1 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r0 == r1) goto L_0x002d
            r1 = -239580146(0xfffffffff1b84c0e, float:-1.82519E30)
            if (r0 == r1) goto L_0x0023
            r1 = 604727084(0x240b672c, float:3.022821E-17)
            if (r0 == r1) goto L_0x0019
            goto L_0x0041
        L_0x0019:
            java.lang.String r0 = "interstitial"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0041
            r2 = 1
            goto L_0x0042
        L_0x0023:
            java.lang.String r0 = "rewarded"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0041
            r2 = 2
            goto L_0x0042
        L_0x002d:
            java.lang.String r0 = "native"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0041
            r2 = 3
            goto L_0x0042
        L_0x0037:
            java.lang.String r0 = "banner"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0041
            r2 = 0
            goto L_0x0042
        L_0x0041:
            r2 = -1
        L_0x0042:
            switch(r2) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0053;
                case 2: goto L_0x0050;
                case 3: goto L_0x004d;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Internal Error"
            r2.<init>(r0)
            throw r2
        L_0x004d:
            int r2 = com.google.android.gms.ads.zza.zzvl
            return r2
        L_0x0050:
            int r2 = com.google.android.gms.ads.zza.zzvk
            return r2
        L_0x0053:
            int r2 = com.google.android.gms.ads.zza.zzvj
            return r2
        L_0x0056:
            int r2 = com.google.android.gms.ads.zza.zzvi
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1490mn.m7625a(java.lang.String):int");
    }

    /* renamed from: b */
    private static Bundle m7626b(String str) {
        String valueOf = String.valueOf(str);
        aai.m1630e(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            aai.m1625b("", e);
            throw new RemoteException();
        }
    }
}
