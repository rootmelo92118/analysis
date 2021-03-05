package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.support.annotation.NonNull;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0892c;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.rk */
public final class C1622rk extends C1618rg implements C0892c.C0893a, C0892c.C0894b {

    /* renamed from: a */
    private Context f6296a;

    /* renamed from: b */
    private zzbbi f6297b;

    /* renamed from: c */
    private abs<zzasi> f6298c;

    /* renamed from: d */
    private C1804yd f6299d;

    /* renamed from: e */
    private final C1616re f6300e;

    /* renamed from: f */
    private final Object f6301f = new Object();

    /* renamed from: g */
    private C1623rl f6302g;

    public C1622rk(Context context, zzbbi zzbbi, abs<zzasi> abs, C1616re reVar) {
        super(abs, reVar);
        this.f6296a = context;
        this.f6297b = zzbbi;
        this.f6298c = abs;
        this.f6300e = reVar;
        this.f6302g = new C1623rl(context, zzbv.zzlv().mo13282a(), this, this);
        this.f6302g.checkAvailabilityAndConnect();
    }

    /* renamed from: b */
    public final C1629rr mo12918b() {
        C1629rr a;
        synchronized (this.f6301f) {
            try {
                a = this.f6302g.mo12919a();
            } catch (DeadObjectException | IllegalStateException unused) {
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo12916a() {
        synchronized (this.f6301f) {
            if (this.f6302g.isConnected() || this.f6302g.isConnecting()) {
                this.f6302g.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final void mo9870a(@NonNull ConnectionResult connectionResult) {
        C1772wz.m1624b("Cannot connect to remote service, fallback to local instance.");
        this.f6299d = new C1621rj(this.f6296a, this.f6298c, this.f6300e);
        this.f6299d.zzwa();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        zzbv.zzlf().mo13208b(this.f6296a, this.f6297b.f7135a, "gmob-apps", bundle, true);
    }

    /* renamed from: a */
    public final void mo9869a(Bundle bundle) {
        zzwa();
    }

    /* renamed from: a */
    public final void mo9868a(int i) {
        C1772wz.m1624b("Disconnected from remote ad request service.");
    }
}
