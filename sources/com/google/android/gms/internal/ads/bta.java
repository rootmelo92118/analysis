package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

@C1598qn
public final class bta implements MuteThisAdReason {

    /* renamed from: a */
    private final String f5202a;

    /* renamed from: b */
    private bsx f5203b;

    public bta(bsx bsx) {
        String str;
        this.f5203b = bsx;
        try {
            str = bsx.mo12336a();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            str = null;
        }
        this.f5202a = str;
    }

    public final String getDescription() {
        return this.f5202a;
    }

    /* renamed from: a */
    public final bsx mo12349a() {
        return this.f5203b;
    }
}
