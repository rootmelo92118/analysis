package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.uf */
public final class C1698uf implements RewardItem {

    /* renamed from: a */
    private final C1683tr f6569a;

    public C1698uf(C1683tr trVar) {
        this.f6569a = trVar;
    }

    public final String getType() {
        if (this.f6569a == null) {
            return null;
        }
        try {
            return this.f6569a.mo12984a();
        } catch (RemoteException e) {
            aai.m1627c("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    public final int getAmount() {
        if (this.f6569a == null) {
            return 0;
        }
        try {
            return this.f6569a.mo12985b();
        } catch (RemoteException e) {
            aai.m1627c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
