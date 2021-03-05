package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzaf;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.jn */
public final class C1409jn<I, O> implements C1397jb<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1399jd<O> f5526a;

    /* renamed from: b */
    private final C1400je<I> f5527b;

    /* renamed from: c */
    private final C1366hy f5528c;

    /* renamed from: d */
    private final String f5529d;

    C1409jn(C1366hy hyVar, String str, C1400je<I> jeVar, C1399jd<O> jdVar) {
        this.f5528c = hyVar;
        this.f5529d = str;
        this.f5527b = jeVar;
        this.f5526a = jdVar;
    }

    /* renamed from: a */
    public final abg<O> mo12630a(I i) {
        abq abq = new abq();
        C1383io b = this.f5528c.mo12617b((awy) null);
        b.mo10093a(new C1410jo(this, b, i, abq), new C1411jp(this, abq, b));
        return abq;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7101a(C1383io ioVar, C1392ix ixVar, I i, abq<O> abq) {
        try {
            zzbv.zzlf();
            String a = C1782xi.m8362a();
            zzf.zzdfh.zza(a, (zzaf) new C1412jq(this, ioVar, abq));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a);
            jSONObject.put("args", this.f5527b.mo12633a(i));
            ixVar.mo10448b(this.f5529d, jSONObject);
        } catch (Exception e) {
            abq.mo10086a(e);
            C1772wz.m1625b("Unable to invokeJavaScript", e);
            ioVar.mo12624a();
        } catch (Throwable th) {
            ioVar.mo12624a();
            throw th;
        }
    }

    public final abg<O> zzf(@Nullable I i) {
        return mo12630a(i);
    }
}
