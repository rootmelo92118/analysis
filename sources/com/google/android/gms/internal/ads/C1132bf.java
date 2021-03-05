package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.bf */
public final class C1132bf extends C1137bk {
    @Nullable

    /* renamed from: c */
    private C1450la f4007c;
    @Nullable

    /* renamed from: d */
    private C1453ld f4008d;
    @Nullable

    /* renamed from: e */
    private C1456lg f4009e;

    /* renamed from: f */
    private final C1134bh f4010f;
    @Nullable

    /* renamed from: g */
    private C1133bg f4011g;

    /* renamed from: h */
    private boolean f4012h;

    /* renamed from: i */
    private boolean f4013i;

    /* renamed from: j */
    private final Object f4014j;

    public C1132bf(Context context, C1134bh bhVar, awy awy, C1450la laVar, C1135bi biVar) {
        this(context, bhVar, awy, biVar);
        this.f4007c = laVar;
    }

    @Nullable
    /* renamed from: j */
    public final afl mo11798j() {
        return null;
    }

    /* renamed from: k */
    public final void mo11799k() {
    }

    /* renamed from: l */
    public final void mo11800l() {
    }

    public C1132bf(Context context, C1134bh bhVar, awy awy, C1453ld ldVar, C1135bi biVar) {
        this(context, bhVar, awy, biVar);
        this.f4008d = ldVar;
    }

    public C1132bf(Context context, C1134bh bhVar, awy awy, C1456lg lgVar, C1135bi biVar) {
        this(context, bhVar, awy, biVar);
        this.f4009e = lgVar;
    }

    private C1132bf(Context context, C1134bh bhVar, awy awy, C1135bi biVar) {
        super(context, bhVar, (C1575pr) null, awy, (JSONObject) null, biVar, (zzbbi) null, (String) null);
        this.f4012h = false;
        this.f4013i = false;
        this.f4014j = new Object();
        this.f4010f = bhVar;
    }

    @Nullable
    /* renamed from: a */
    public final View mo11780a(View.OnClickListener onClickListener, boolean z) {
        C0719a aVar;
        synchronized (this.f4014j) {
            if (this.f4011g != null) {
                View a = this.f4011g.mo11780a(onClickListener, z);
                return a;
            }
            try {
                if (this.f4009e != null) {
                    aVar = this.f4009e.mo12762l();
                } else if (this.f4007c != null) {
                    aVar = this.f4007c.mo12725n();
                } else {
                    if (this.f4008d != null) {
                        aVar = this.f4008d.mo12743k();
                    }
                    aVar = null;
                }
            } catch (RemoteException e) {
                C1772wz.m1627c("Failed to call getAdChoicesContent", e);
            }
            if (aVar == null) {
                return null;
            }
            View view = (View) C0722b.m770a(aVar);
            return view;
        }
    }

    /* renamed from: a */
    public final boolean mo11788a() {
        synchronized (this.f4014j) {
            if (this.f4011g != null) {
                boolean a = this.f4011g.mo11788a();
                return a;
            }
            boolean zzjo = this.f4010f.zzjo();
            return zzjo;
        }
    }

    /* renamed from: b */
    public final boolean mo11790b() {
        synchronized (this.f4014j) {
            if (this.f4011g != null) {
                boolean b = this.f4011g.mo11790b();
                return b;
            }
            boolean zzjq = this.f4010f.zzjq();
            return zzjq;
        }
    }

    /* renamed from: c */
    public final boolean mo11791c() {
        synchronized (this.f4014j) {
            if (this.f4011g != null) {
                boolean c = this.f4011g.mo11791c();
                return c;
            }
            boolean zzjp = this.f4010f.zzjp();
            return zzjp;
        }
    }

    /* renamed from: a */
    public final void mo11787a(C1256dx dxVar) {
        synchronized (this.f4014j) {
            if (this.f4011g != null) {
                this.f4011g.mo11787a(dxVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo11792d() {
        synchronized (this.f4014j) {
            if (this.f4011g != null) {
                this.f4011g.mo11792d();
            }
        }
    }

    /* renamed from: a */
    public final void mo11782a(View view) {
        synchronized (this.f4014j) {
            if (this.f4011g != null) {
                this.f4011g.mo11782a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo11783a(View view, Map<String, WeakReference<View>> map) {
        C0926p.m1315b("recordImpression must be called on the main UI thread.");
        synchronized (this.f4014j) {
            this.f4520a = true;
            if (this.f4011g != null) {
                this.f4011g.mo11783a(view, map);
                this.f4010f.recordImpression();
            } else {
                try {
                    if (this.f4009e != null && !this.f4009e.mo12766p()) {
                        this.f4009e.mo12768r();
                        this.f4010f.recordImpression();
                    } else if (this.f4007c != null && !this.f4007c.mo12721j()) {
                        this.f4007c.mo12720i();
                        this.f4010f.recordImpression();
                    } else if (this.f4008d != null && !this.f4008d.mo12740h()) {
                        this.f4008d.mo12739g();
                        this.f4010f.recordImpression();
                    }
                } catch (RemoteException e) {
                    C1772wz.m1627c("Failed to call recordImpression", e);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11793e() {
        C0926p.m1315b("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.f4014j) {
            this.f4521b = true;
            if (this.f4011g != null) {
                this.f4011g.mo11793e();
            }
        }
    }

    /* renamed from: a */
    public final void mo11781a(MotionEvent motionEvent) {
        synchronized (this.f4014j) {
            if (this.f4011g != null) {
                this.f4011g.mo11781a(motionEvent);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11784a(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, android.os.Bundle r5, android.view.View r6) {
        /*
            r2 = this;
            java.lang.String r0 = "performClick must be called on the main UI thread."
            com.google.android.gms.common.internal.C0926p.m1315b((java.lang.String) r0)
            java.lang.Object r0 = r2.f4014j
            monitor-enter(r0)
            boolean r1 = r2.f4013i     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0014
            boolean r1 = r2.mo11790b()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.bg r1 = r2.f4011g     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.bg r1 = r2.f4011g     // Catch:{ all -> 0x0028 }
            r1.mo11784a(r3, r4, r5, r6)     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.bh r3 = r2.f4010f     // Catch:{ all -> 0x0028 }
            r3.onAdClicked()     // Catch:{ all -> 0x0028 }
            goto L_0x0026
        L_0x0023:
            r2.m5177e(r3)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1132bf.mo11784a(android.view.View, java.util.Map, android.os.Bundle, android.view.View):void");
    }

    /* renamed from: f */
    public final void mo11794f() {
        this.f4013i = true;
        if (this.f4011g != null) {
            this.f4011g.mo11794f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11795g() {
        /*
            r2 = this;
            java.lang.String r0 = "recordCustomClickGesture must be called on the main UI thread."
            com.google.android.gms.common.internal.C0926p.m1315b((java.lang.String) r0)
            java.lang.Object r0 = r2.f4014j
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bg r1 = r2.f4011g     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0020
            boolean r1 = r2.f4013i     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.bg r1 = r2.f4011g     // Catch:{ all -> 0x004b }
            r1.mo11794f()     // Catch:{ all -> 0x004b }
        L_0x0015:
            com.google.android.gms.internal.ads.bg r1 = r2.f4011g     // Catch:{ all -> 0x004b }
            r1.mo11795g()     // Catch:{ all -> 0x004b }
            com.google.android.gms.internal.ads.bh r1 = r2.f4010f     // Catch:{ all -> 0x004b }
            r1.onAdClicked()     // Catch:{ all -> 0x004b }
            goto L_0x0049
        L_0x0020:
            boolean r1 = r2.f4013i     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r1)     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return
        L_0x002b:
            boolean r1 = r2.mo11790b()     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0038
            java.lang.String r1 = "Custom click reporting for 3p ads failed. Ad unit id not whitelisted."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r1)     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return
        L_0x0038:
            com.google.android.gms.internal.ads.by r1 = r2.mo12038q()     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.by r1 = r2.mo12038q()     // Catch:{ all -> 0x004b }
            android.view.View r1 = r1.mo12344c()     // Catch:{ all -> 0x004b }
            r2.m5177e(r1)     // Catch:{ all -> 0x004b }
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1132bf.mo11795g():void");
    }

    /* renamed from: e */
    private final void m5177e(View view) {
        try {
            if (this.f4009e != null && !this.f4009e.mo12767q()) {
                this.f4009e.mo12749a(C0722b.m769a(view));
                this.f4010f.onAdClicked();
            } else if (this.f4007c != null && !this.f4007c.mo12722k()) {
                this.f4007c.mo12709a(C0722b.m769a(view));
                this.f4010f.onAdClicked();
            } else if (this.f4008d != null && !this.f4008d.mo12741i()) {
                this.f4008d.mo12730a(C0722b.m769a(view));
                this.f4010f.onAdClicked();
            }
        } catch (RemoteException e) {
            C1772wz.m1627c("Failed to call performClick", e);
        }
    }

    /* renamed from: a */
    public final void mo11785a(View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        synchronized (this.f4014j) {
            this.f4012h = true;
            HashMap<String, View> b = m5176b(map);
            HashMap<String, View> b2 = m5176b(map2);
            try {
                if (this.f4009e != null) {
                    this.f4009e.mo12750a(C0722b.m769a(view), C0722b.m769a(b), C0722b.m769a(b2));
                } else if (this.f4007c != null) {
                    this.f4007c.mo12710a(C0722b.m769a(view), C0722b.m769a(b), C0722b.m769a(b2));
                    this.f4007c.mo12712b(C0722b.m769a(view));
                } else if (this.f4008d != null) {
                    this.f4008d.mo12731a(C0722b.m769a(view), C0722b.m769a(b), C0722b.m769a(b2));
                    this.f4008d.mo12733b(C0722b.m769a(view));
                }
            } catch (RemoteException e) {
                C1772wz.m1627c("Failed to call prepareAd", e);
            }
            this.f4012h = false;
        }
    }

    /* renamed from: b */
    private static HashMap<String, View> m5176b(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void mo11789b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f4014j) {
            try {
                if (this.f4009e != null) {
                    this.f4009e.mo12752b(C0722b.m769a(view));
                } else if (this.f4007c != null) {
                    this.f4007c.mo12714c(C0722b.m769a(view));
                } else if (this.f4008d != null) {
                    this.f4008d.mo12735c(C0722b.m769a(view));
                }
            } catch (RemoteException e) {
                C1772wz.m1627c("Failed to call untrackView", e);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo11796h() {
        boolean z;
        synchronized (this.f4014j) {
            z = this.f4012h;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo11786a(@Nullable C1133bg bgVar) {
        synchronized (this.f4014j) {
            this.f4011g = bgVar;
        }
    }

    /* renamed from: i */
    public final C1133bg mo11797i() {
        C1133bg bgVar;
        synchronized (this.f4014j) {
            bgVar = this.f4011g;
        }
        return bgVar;
    }

    /* renamed from: m */
    public final void mo11801m() {
        if (this.f4011g != null) {
            this.f4011g.mo11801m();
        }
    }

    /* renamed from: n */
    public final void mo11802n() {
        if (this.f4011g != null) {
            this.f4011g.mo11802n();
        }
    }
}
