package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.aq */
public final class C1077aq implements View.OnClickListener {
    @Nullable
    @VisibleForTesting

    /* renamed from: a */
    String f2238a;
    @Nullable
    @VisibleForTesting

    /* renamed from: b */
    Long f2239b;
    @Nullable
    @VisibleForTesting

    /* renamed from: c */
    WeakReference<View> f2240c;

    /* renamed from: d */
    private final C1575pr f2241d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public C1256dx f2242e;
    @Nullable

    /* renamed from: f */
    private zzu f2243f;

    public C1077aq(C1575pr prVar) {
        this.f2241d = prVar;
    }

    /* renamed from: a */
    public final void mo10975a(C1256dx dxVar) {
        this.f2242e = dxVar;
        if (this.f2243f != null) {
            this.f2241d.mo12888b("/unconfirmedClick", this.f2243f);
        }
        this.f2243f = new C1083ar(this);
        this.f2241d.mo12885a("/unconfirmedClick", this.f2243f);
    }

    @Nullable
    /* renamed from: a */
    public final C1256dx mo10974a() {
        return this.f2242e;
    }

    /* renamed from: b */
    public final void mo10976b() {
        if (this.f2242e != null && this.f2239b != null) {
            m3380c();
            try {
                this.f2242e.mo12506a();
            } catch (RemoteException e) {
                aai.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onClick(View view) {
        if (this.f2240c != null && this.f2240c.get() == view) {
            if (!(this.f2238a == null || this.f2239b == null)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f2238a);
                    jSONObject.put("time_interval", zzbv.zzlm().mo9996a() - this.f2239b.longValue());
                    jSONObject.put("messageType", "onePointFiveClick");
                    this.f2241d.mo12886a("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e) {
                    C1772wz.m1625b("Unable to dispatch sendMessageToNativeJs event", e);
                }
            }
            m3380c();
        }
    }

    /* renamed from: c */
    private final void m3380c() {
        this.f2238a = null;
        this.f2239b = null;
        if (this.f2240c != null) {
            View view = (View) this.f2240c.get();
            this.f2240c = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener((View.OnClickListener) null);
            }
        }
    }
}
