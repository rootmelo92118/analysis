package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1780xg;
import com.google.android.gms.internal.ads.C1851zx;
import com.google.android.gms.internal.ads.awu;
import com.google.android.gms.internal.ads.awx;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.zzbbi;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@C1598qn
public final class zzag implements awu, Runnable {
    private final List<Object[]> zzbnj;
    private final AtomicReference<awu> zzbnk;
    private zzbbi zzbnl;
    private CountDownLatch zzbnm;
    private Context zzsp;

    public zzag(zzbw zzbw) {
        this(zzbw.zzsp, zzbw.zzbsp);
    }

    private zzag(Context context, zzbbi zzbbi) {
        this.zzbnj = new Vector();
        this.zzbnk = new AtomicReference<>();
        this.zzbnm = new CountDownLatch(1);
        this.zzsp = context;
        this.zzbnl = zzbbi;
        bre.m6317a();
        if (C1851zx.m8595b()) {
            C1780xg.m8353a((Runnable) this);
        } else {
            run();
        }
    }

    private final boolean zzjy() {
        try {
            this.zzbnm.await();
            return true;
        } catch (InterruptedException e) {
            C1772wz.m1627c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void zzjz() {
        if (!this.zzbnj.isEmpty()) {
            for (Object[] next : this.zzbnj) {
                if (next.length == 1) {
                    this.zzbnk.get().zza((MotionEvent) next[0]);
                } else if (next.length == 3) {
                    this.zzbnk.get().zza(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.zzbnj.clear();
        }
    }

    private static Context zze(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final String zza(Context context) {
        awu awu;
        if (!zzjy() || (awu = this.zzbnk.get()) == null) {
            return "";
        }
        zzjz();
        return awu.zza(zze(context));
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        awu awu;
        if (!zzjy() || (awu = this.zzbnk.get()) == null) {
            return "";
        }
        zzjz();
        return awu.zza(zze(context), str, view, activity);
    }

    public final void zzb(View view) {
        awu awu = this.zzbnk.get();
        if (awu != null) {
            awu.zzb(view);
        }
    }

    public final void zza(MotionEvent motionEvent) {
        awu awu = this.zzbnk.get();
        if (awu != null) {
            zzjz();
            awu.zza(motionEvent);
            return;
        }
        this.zzbnj.add(new Object[]{motionEvent});
    }

    public final void zza(int i, int i2, int i3) {
        awu awu = this.zzbnk.get();
        if (awu != null) {
            zzjz();
            awu.zza(i, i2, i3);
            return;
        }
        this.zzbnj.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.zzbnl.f7138d;
            if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5943ay)).booleanValue() && z2) {
                z = true;
            }
            this.zzbnk.set(awx.m4364a(this.zzbnl.f7135a, zze(this.zzsp), z));
        } finally {
            this.zzbnm.countDown();
            this.zzsp = null;
            this.zzbnl = null;
        }
    }
}
