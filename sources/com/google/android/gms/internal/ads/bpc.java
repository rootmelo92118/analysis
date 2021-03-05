package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.p039a.C0722b;

@C1598qn
public final class bpc {

    /* renamed from: a */
    azh f4965a;

    /* renamed from: b */
    boolean f4966b;

    /* renamed from: a */
    public final bpg mo12286a(byte[] bArr) {
        return new bpg(this, bArr);
    }

    public bpc(Context context, String str, String str2) {
        C1557p.m7741a(context);
        try {
            this.f4965a = (azh) aaj.m1633a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", bpd.f4967a);
            C0722b.m769a(context);
            this.f4965a.mo11440a(C0722b.m769a(context), str, (String) null);
            this.f4966b = true;
        } catch (RemoteException | aal | NullPointerException unused) {
            aai.m1624b("Cannot dynamite load clearcut");
        }
    }

    public bpc(Context context) {
        C1557p.m7741a(context);
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6045cu)).booleanValue()) {
            try {
                this.f4965a = (azh) aaj.m1633a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", bpe.f4968a);
                C0722b.m769a(context);
                this.f4965a.mo11439a(C0722b.m769a(context), "GMA_SDK");
                this.f4966b = true;
            } catch (RemoteException | aal | NullPointerException unused) {
                aai.m1624b("Cannot dynamite load clearcut");
            }
        }
    }

    public bpc() {
    }
}
