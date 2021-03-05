package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ar */
final class C1083ar implements zzu<Object> {

    /* renamed from: a */
    private final /* synthetic */ C1077aq f2367a;

    C1083ar(C1077aq aqVar) {
        this.f2367a = aqVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        try {
            this.f2367a.f2239b = Long.valueOf(Long.parseLong(map.get("timestamp")));
        } catch (NumberFormatException unused) {
            C1772wz.m1626c("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.f2367a.f2238a = map.get("id");
        String str = map.get("asset_id");
        if (this.f2367a.f2242e == null) {
            C1772wz.m1624b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            this.f2367a.f2242e.mo12507a(str);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }
}
