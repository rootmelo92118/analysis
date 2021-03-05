package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzbv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ew */
public final class C1283ew implements bgg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile C1276ep f5352a;

    /* renamed from: b */
    private final Context f5353b;

    public C1283ew(Context context) {
        this.f5353b = context;
    }

    /* renamed from: a */
    public final bjj mo11892a(blj<?> blj) {
        zzafl a = zzafl.m8607a(blj);
        long b = zzbv.zzlm().mo9997b();
        try {
            abq abq = new abq();
            this.f5352a = new C1276ep(this.f5353b, zzbv.zzlv().mo13282a(), new C1288fa(this, abq), new C1289fb(this, abq));
            this.f5352a.checkAvailabilityAndConnect();
            abg a2 = aau.m1647a(aau.m1648a(abq, new C1284ex(this, a), (Executor) C1780xg.f6833a), (long) ((Integer) bre.m6321e().mo12778a(C1557p.f6030cf)).intValue(), TimeUnit.MILLISECONDS, C1780xg.f6835c);
            a2.mo10059a(new C1286ez(this), C1780xg.f6833a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a2.get();
            long b2 = zzbv.zzlm().mo9997b() - b;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b2);
            sb.append("ms");
            C1772wz.m8287a(sb.toString());
            zzafn zzafn = (zzafn) new zzasy(parcelFileDescriptor).mo13315a(zzafn.CREATOR);
            if (zzafn == null) {
                return null;
            }
            if (zzafn.f6982a) {
                throw new C1236dd(zzafn.f6983b);
            } else if (zzafn.f6986e.length != zzafn.f6987f.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < zzafn.f6986e.length; i++) {
                    hashMap.put(zzafn.f6986e[i], zzafn.f6987f[i]);
                }
                return new bjj(zzafn.f6984c, zzafn.f6985d, (Map<String, String>) hashMap, zzafn.f6988g, zzafn.f6989h);
            }
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(zzbv.zzlm().mo9997b() - b);
            sb2.append("ms");
            C1772wz.m8287a(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b3 = zzbv.zzlm().mo9997b() - b;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b3);
            sb3.append("ms");
            C1772wz.m8287a(sb3.toString());
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6839a() {
        if (this.f5352a != null) {
            this.f5352a.disconnect();
            Binder.flushPendingCommands();
        }
    }
}
