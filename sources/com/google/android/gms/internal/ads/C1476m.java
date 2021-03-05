package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.C0858g;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.m */
public final class C1476m implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final Object f5701a = new Object();

    /* renamed from: b */
    private final ConditionVariable f5702b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f5703c = false;

    /* renamed from: d */
    private volatile boolean f5704d = false;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public SharedPreferences f5705e = null;

    /* renamed from: f */
    private Context f5706f;

    /* renamed from: g */
    private JSONObject f5707g = new JSONObject();

    /* renamed from: a */
    public final void mo12780a(Context context) {
        if (!this.f5703c) {
            synchronized (this.f5701a) {
                if (!this.f5703c) {
                    if (!this.f5704d) {
                        this.f5704d = true;
                    }
                    this.f5706f = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        Context remoteContext = C0858g.getRemoteContext(context);
                        if (remoteContext == null && context != null && (remoteContext = context.getApplicationContext()) == null) {
                            remoteContext = context;
                        }
                        if (remoteContext != null) {
                            bre.m6319c();
                            this.f5705e = remoteContext.getSharedPreferences("google_ads_flags", 0);
                            if (this.f5705e != null) {
                                this.f5705e.registerOnSharedPreferenceChangeListener(this);
                            }
                            m7587b();
                            this.f5703c = true;
                            this.f5704d = false;
                            this.f5702b.open();
                        }
                    } finally {
                        this.f5704d = false;
                        this.f5702b.open();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo12778a(C1259e<T> eVar) {
        if (!this.f5702b.block(5000)) {
            synchronized (this.f5701a) {
                if (!this.f5704d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f5703c || this.f5705e == null) {
            synchronized (this.f5701a) {
                if (this.f5703c) {
                    if (this.f5705e == null) {
                    }
                }
                T b = eVar.mo12512b();
                return b;
            }
        }
        if (eVar.mo12513c() != 1 || !this.f5707g.has(eVar.mo12510a())) {
            return C1842zo.m8563a(this.f5706f, new C1530o(this, eVar));
        }
        return eVar.mo12509a(this.f5707g);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m7587b();
        }
    }

    /* renamed from: b */
    private final void m7587b() {
        if (this.f5705e != null) {
            try {
                this.f5707g = new JSONObject((String) C1842zo.m8563a(this.f5706f, new C1503n(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ String mo12779a() {
        return this.f5705e.getString("flag_configuration", "{}");
    }
}
