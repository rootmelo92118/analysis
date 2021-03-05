package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzaf;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jq */
final class C1412jq implements zzaf {

    /* renamed from: a */
    private final C1383io f5536a;

    /* renamed from: b */
    private final abq f5537b;

    /* renamed from: c */
    private final /* synthetic */ C1409jn f5538c;

    public C1412jq(C1409jn jnVar, C1383io ioVar, abq abq) {
        this.f5538c = jnVar;
        this.f5536a = ioVar;
        this.f5537b = abq;
    }

    public final void zzd(JSONObject jSONObject) {
        try {
            this.f5537b.mo10087b(this.f5538c.f5526a.mo12632a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f5537b.mo10087b(e);
        } finally {
            this.f5536a.mo12624a();
        }
    }

    public final void zzbw(@Nullable String str) {
        if (str == null) {
            try {
                this.f5537b.mo10086a(new C1396ja());
            } catch (IllegalStateException unused) {
                this.f5536a.mo12624a();
                return;
            } catch (Throwable th) {
                this.f5536a.mo12624a();
                throw th;
            }
        } else {
            this.f5537b.mo10086a(new C1396ja(str));
        }
        this.f5536a.mo12624a();
    }
}
