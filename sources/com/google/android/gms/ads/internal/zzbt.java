package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.awy;
import com.google.android.gms.internal.ads.bre;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class zzbt extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ zzbp zzbra;

    private zzbt(zzbp zzbp) {
        this.zzbra = zzbp;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            awy unused = this.zzbra.zzbqy = (awy) this.zzbra.zzbqv.get(((Long) bre.m6321e().mo12778a(C1557p.f5964bS)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            aai.m1627c("", e);
        }
        return this.zzbra.zzkw();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.zzbra.zzbqx != null && str != null) {
            this.zzbra.zzbqx.loadUrl(str);
        }
    }

    /* synthetic */ zzbt(zzbp zzbp, zzbq zzbq) {
        this(zzbp);
    }
}
