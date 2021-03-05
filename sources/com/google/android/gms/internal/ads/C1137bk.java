package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.bk */
public class C1137bk implements C1133bg {

    /* renamed from: a */
    boolean f4520a;

    /* renamed from: b */
    boolean f4521b;

    /* renamed from: c */
    private final Object f4522c = new Object();

    /* renamed from: d */
    private final C1134bh f4523d;

    /* renamed from: e */
    private final Context f4524e;

    /* renamed from: f */
    private final C1077aq f4525f;
    @Nullable

    /* renamed from: g */
    private final JSONObject f4526g;
    @Nullable

    /* renamed from: h */
    private final C1575pr f4527h;
    @Nullable

    /* renamed from: i */
    private final C1135bi f4528i;

    /* renamed from: j */
    private final awy f4529j;
    @Nullable

    /* renamed from: k */
    private final zzbbi f4530k;
    @Nullable

    /* renamed from: l */
    private String f4531l;
    @Nullable

    /* renamed from: m */
    private C1740vu f4532m;
    @Nullable

    /* renamed from: n */
    private C1203by f4533n;

    /* renamed from: o */
    private boolean f4534o = false;

    /* renamed from: p */
    private long f4535p = 0;

    /* renamed from: q */
    private long f4536q = 0;

    /* renamed from: r */
    private WeakReference<View> f4537r = null;

    public C1137bk(Context context, C1134bh bhVar, @Nullable C1575pr prVar, awy awy, @Nullable JSONObject jSONObject, @Nullable C1135bi biVar, @Nullable zzbbi zzbbi, @Nullable String str) {
        this.f4524e = context;
        this.f4523d = bhVar;
        this.f4527h = prVar;
        this.f4529j = awy;
        this.f4526g = jSONObject;
        this.f4528i = biVar;
        this.f4530k = zzbbi;
        this.f4531l = str;
        this.f4525f = new C1077aq(this.f4527h);
    }

    /* renamed from: b */
    public void mo11789b(View view, Map<String, WeakReference<View>> map) {
    }

    @Nullable
    /* renamed from: a */
    public View mo11780a(View.OnClickListener onClickListener, boolean z) {
        C1068ap c = this.f4528i.mo11094c();
        if (c == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!z) {
            int h = c.mo10783h();
            if (h != 0) {
                switch (h) {
                    case 2:
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                        break;
                    case 3:
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                        break;
                    default:
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                        break;
                }
            } else {
                layoutParams.addRule(10);
                layoutParams.addRule(9);
            }
        }
        zzabp zzabp = new zzabp(this.f4524e, c, layoutParams);
        zzabp.setOnClickListener(onClickListener);
        zzabp.setContentDescription((CharSequence) bre.m6321e().mo12778a(C1557p.f5947bB));
        return zzabp;
    }

    /* renamed from: a */
    public boolean mo11788a() {
        C1068ap c = this.f4528i.mo11094c();
        return c != null && c.mo10784i();
    }

    /* renamed from: c */
    public boolean mo11791c() {
        return this.f4526g != null && this.f4526g.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* renamed from: b */
    public boolean mo11790b() {
        return this.f4526g != null && this.f4526g.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: a */
    private final boolean m5701a(String str) {
        JSONObject optJSONObject = this.f4526g == null ? null : this.f4526g.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    public final void mo11879a(View view, String str, @Nullable Bundle bundle, Map<String, WeakReference<View>> map, View view2, boolean z) {
        JSONObject jSONObject;
        View view3 = view2;
        JSONObject a = m5699a(map, view3);
        JSONObject g = m5705g(view3);
        JSONObject h = m5706h(view2);
        JSONObject i = m5707i(view3);
        JSONObject jSONObject2 = null;
        try {
            Bundle bundle2 = bundle;
            JSONObject a2 = zzbv.zzlf().mo13199a(bundle, (JSONObject) null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a2);
                String str2 = str;
            } catch (Exception e) {
                e = e;
                String str3 = str;
                jSONObject2 = jSONObject3;
                C1772wz.m1625b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m5700a(view, g, a, h, i, str, jSONObject, (JSONObject) null, z);
            }
            try {
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject3;
                C1772wz.m1625b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m5700a(view, g, a, h, i, str, jSONObject, (JSONObject) null, z);
            }
        } catch (Exception e3) {
            e = e3;
            String str4 = str;
            C1772wz.m1625b("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            m5700a(view, g, a, h, i, str, jSONObject, (JSONObject) null, z);
        }
        m5700a(view, g, a, h, i, str, jSONObject, (JSONObject) null, z);
    }

    /* renamed from: a */
    public void mo11784a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C0926p.m1315b("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Map.Entry next : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                        mo11879a(view, (String) next.getKey(), bundle, map, view2, false);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.f4528i.mo11090a())) {
            mo11879a(view, "3099", bundle, map, view2, false);
        } else if ("2".equals(this.f4528i.mo11090a())) {
            mo11879a(view, "2099", bundle, map, view2, false);
        } else if ("1".equals(this.f4528i.mo11090a())) {
            mo11879a(view, "1099", bundle, map, view2, false);
        }
    }

    /* renamed from: b */
    public final void mo11881b(Bundle bundle) {
        if (bundle == null) {
            C1772wz.m1624b("Click data is null. No click is reported.");
        } else if (!m5701a("click_reporting")) {
            C1772wz.m1626c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            m5700a((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle.getBundle("click_signal").getString("asset_id"), (JSONObject) null, zzbv.zzlf().mo13199a(bundle, (JSONObject) null), false);
        }
    }

    /* renamed from: a */
    private final void m5700a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z) {
        C0926p.m1315b("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f4526g);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            long a = zzbv.zzlm().mo9996a();
            jSONObject8.put("time_from_last_touch_down", a - this.f4536q);
            jSONObject8.put("time_from_last_touch", a - this.f4535p);
            jSONObject7.put("touch_signal", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", this.f4528i.mo11090a());
            zzbv.zzlh();
            jSONObject9.put("is_privileged_process", C1790xq.m8436e());
            boolean z2 = false;
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f5952bG)).booleanValue() && this.f4525f.mo10974a() != null && this.f4526g.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", a);
            jSONObject9.put("has_custom_click_handler", this.f4523d.zzar(this.f4528i.mo11093b()) != null);
            if (this.f4534o && mo11790b()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            if (this.f4523d.zzar(this.f4528i.mo11093b()) != null) {
                z2 = true;
            }
            jSONObject7.put("has_custom_click_handler", z2);
            try {
                JSONObject optJSONObject = this.f4526g.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject9.put("click_signals", this.f4529j.mo11352a().zza(this.f4524e, optJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                C1772wz.m1625b("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject9);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f4531l);
            aas.m1642a(this.f4527h.mo12887b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            C1772wz.m1625b("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: a */
    public void mo11781a(MotionEvent motionEvent) {
        this.f4535p = zzbv.zzlm().mo9996a();
        if (motionEvent.getAction() == 0) {
            this.f4536q = zzbv.zzlm().mo9996a();
        }
        this.f4529j.mo11353a(motionEvent);
    }

    /* renamed from: c */
    public final void mo11883c(Bundle bundle) {
        if (bundle == null) {
            C1772wz.m1624b("Touch event data is null. No touch event is reported.");
        } else if (!m5701a("touch_reporting")) {
            C1772wz.m1626c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.f4529j.mo11352a().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11885c(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4522c
            monitor-enter(r0)
            boolean r1 = r3.f4520a     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0009:
            boolean r1 = m5703e(r4)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0014
            r3.mo11783a((android.view.View) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C1557p.f5951bF     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo12778a(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x005c
            monitor-enter(r5)     // Catch:{ all -> 0x005e }
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0059 }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0059 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0059 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0059 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = m5703e(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            r3.mo11783a((android.view.View) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r4     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1137bk.mo11885c(android.view.View, java.util.Map):void");
    }

    /* renamed from: e */
    private static boolean m5703e(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
    }

    /* renamed from: m */
    public void mo11801m() {
        this.f4523d.zzjl();
    }

    /* renamed from: a */
    public void mo11783a(View view, Map<String, WeakReference<View>> map) {
        m5702a(m5705g(view), m5699a(map, view), m5706h(view), m5707i(view), (JSONObject) null);
    }

    /* renamed from: a */
    public final boolean mo11880a(Bundle bundle) {
        if (!m5701a("impression_reporting")) {
            C1772wz.m1626c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return m5702a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, zzbv.zzlf().mo13199a(bundle, (JSONObject) null));
    }

    /* renamed from: a */
    private final boolean m5702a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        C0926p.m1315b("Invalid call from a non-UI thread.");
        if (this.f4520a) {
            return true;
        }
        this.f4520a = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f4526g);
            jSONObject6.put("ads_id", this.f4531l);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            aas.m1642a(this.f4527h.mo12889c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f4523d.zza((C1133bg) this);
            this.f4523d.zziq();
            mo11801m();
            return true;
        } catch (JSONException e) {
            C1772wz.m1625b("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: e */
    public void mo11793e() {
        C0926p.m1315b("Invalid call from a non-UI thread.");
        if (!this.f4521b) {
            this.f4521b = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad", this.f4526g);
                jSONObject.put("ads_id", this.f4531l);
                aas.m1642a(this.f4527h.mo12890d(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (JSONException e) {
                aai.m1625b("", e);
            }
        }
    }

    /* renamed from: o */
    public final View mo11886o() {
        if (this.f4537r != null) {
            return (View) this.f4537r.get();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo11884c(View view) {
        this.f4537r = new WeakReference<>(view);
    }

    /* renamed from: b */
    public final void mo11882b(View view) {
        awu a;
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5979bh)).booleanValue() && this.f4529j != null && (a = this.f4529j.mo11352a()) != null) {
            a.zzb(view);
        }
    }

    /* renamed from: a */
    public void mo11785a(View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        if (map != null) {
            synchronized (map) {
                for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                        view2.setClickable(true);
                        view2.setOnClickListener(onClickListener);
                    }
                }
            }
        }
        if (map2 != null) {
            synchronized (map2) {
                for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                    View view3 = (View) ((WeakReference) value2.getValue()).get();
                    if (view3 != null) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public afl mo11798j() {
        if (this.f4526g == null || this.f4526g.optJSONObject("overlay") == null) {
            return null;
        }
        zzbv.zzlg();
        Context context = this.f4524e;
        zzwf a = zzwf.m8830a(this.f4524e);
        afl a2 = afr.m2018a(context, agy.m2170a(a), a.f7292a, false, false, this.f4529j, this.f4530k, (C1019ad) null, (zzbo) null, (zzv) null, box.m6117a());
        if (a2 != null) {
            a2.getView().setVisibility(8);
            new C1139bm(a2).mo12176a(this.f4527h);
        }
        return a2;
    }

    /* renamed from: a */
    public final void mo12035a(Map<String, WeakReference<View>> map) {
        if (this.f4528i.mo11095d() != null) {
            boolean z = true;
            if ("2".equals(this.f4528i.mo11090a())) {
                C1776xc k = zzbv.zzlj().mo13131k();
                String adUnitId = this.f4523d.getAdUnitId();
                String a = this.f4528i.mo11090a();
                if (map == null || (!map.containsKey(NativeAppInstallAd.ASSET_MEDIA_VIDEO) && !map.containsKey(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO))) {
                    z = false;
                }
                k.mo13168a(adUnitId, a, z);
            } else if ("1".equals(this.f4528i.mo11090a())) {
                C1776xc k2 = zzbv.zzlj().mo13131k();
                String adUnitId2 = this.f4523d.getAdUnitId();
                String a2 = this.f4528i.mo11090a();
                if (map == null || (!map.containsKey(NativeContentAd.ASSET_MEDIA_VIDEO) && !map.containsKey(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO))) {
                    z = false;
                }
                k2.mo13168a(adUnitId2, a2, z);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo12036b(View view, C1130be beVar) {
        FrameLayout.LayoutParams layoutParams;
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5950bE)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        View d = this.f4528i.mo11095d();
        if (d == null) {
            return false;
        }
        ViewParent parent = d.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(d);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(d, layoutParams);
        this.f4523d.zza(beVar);
        return true;
    }

    /* renamed from: d */
    public final void mo12037d(View view) {
        this.f4523d.zzi(view);
    }

    /* renamed from: a */
    public final void mo11878a(View view, C1130be beVar) {
        if (!mo12036b(view, beVar)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            if (this.f4528i instanceof C1136bj) {
                C1136bj bjVar = (C1136bj) this.f4528i;
                if (bjVar.mo11236f() != null && bjVar.mo11236f().size() > 0) {
                    Object obj = bjVar.mo11236f().get(0);
                    C1210ce a = obj instanceof IBinder ? C1211cf.m6600a((IBinder) obj) : null;
                    if (a != null) {
                        try {
                            C0719a a2 = a.mo11155a();
                            if (a2 != null) {
                                ImageView imageView = new ImageView(this.f4524e);
                                imageView.setImageDrawable((Drawable) C0722b.m770a(a2));
                                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            C1772wz.m1630e("Could not get drawable from image");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo11787a(C1256dx dxVar) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5952bG)).booleanValue()) {
            if (!this.f4526g.optBoolean("custom_one_point_five_click_enabled", false)) {
                C1772wz.m1630e("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            } else {
                this.f4525f.mo10975a(dxVar);
            }
        }
    }

    /* renamed from: d */
    public void mo11792d() {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5952bG)).booleanValue() && this.f4526g.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f4525f.mo10976b();
        }
    }

    /* renamed from: a */
    public void mo11782a(View view) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5952bG)).booleanValue()) {
            if (!this.f4526g.optBoolean("custom_one_point_five_click_enabled", false)) {
                C1772wz.m1630e("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
                return;
            }
            C1077aq aqVar = this.f4525f;
            if (view != null) {
                view.setOnClickListener(aqVar);
                view.setClickable(true);
                aqVar.f2240c = new WeakReference<>(view);
            }
        }
    }

    /* renamed from: f */
    public void mo11794f() {
        this.f4534o = true;
    }

    /* renamed from: g */
    public void mo11795g() {
        if (this.f4533n == null) {
            C1772wz.m1624b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else if (!this.f4534o) {
            C1772wz.m1624b("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!mo11790b()) {
            C1772wz.m1624b("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            mo11879a(this.f4533n.mo12344c(), "3099", (Bundle) null, this.f4533n.mo12342b(), this.f4533n.mo12344c(), true);
        }
    }

    /* renamed from: a */
    public final void mo12034a(C1203by byVar) {
        this.f4533n = byVar;
    }

    @Nullable
    /* renamed from: q */
    public final C1203by mo12038q() {
        return this.f4533n;
    }

    /* renamed from: l */
    public void mo11800l() {
        this.f4523d.zzjn();
    }

    /* renamed from: n */
    public void mo11802n() {
        this.f4523d.zzjm();
    }

    /* renamed from: k */
    public void mo11799k() {
        this.f4527h.mo12884a();
    }

    /* renamed from: p */
    public final Context mo11887p() {
        return this.f4524e;
    }

    /* renamed from: f */
    private static int[] m5704f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: a */
    private final int m5697a(int i) {
        bre.m6317a();
        return C1851zx.m8592b(this.f4524e, i);
    }

    /* renamed from: a */
    private final JSONObject m5698a(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m5697a(rect.right - rect.left));
        jSONObject.put("height", m5697a(rect.bottom - rect.top));
        jSONObject.put("x", m5697a(rect.left));
        jSONObject.put("y", m5697a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: g */
    private final JSONObject m5705g(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] f = m5704f(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", m5697a(view.getMeasuredWidth()));
            jSONObject3.put("height", m5697a(view.getMeasuredHeight()));
            jSONObject3.put("x", m5697a(f[0]));
            jSONObject3.put("y", m5697a(f[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = m5698a(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                jSONObject.put("x", m5697a(f[0]));
                jSONObject.put("y", m5697a(f[1]));
                jSONObject.put("relative_to", "window");
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            C1772wz.m1630e("Unable to get native ad view bounding box");
        }
        return jSONObject2;
    }

    /* renamed from: h */
    private static JSONObject m5706h(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzbv.zzlf();
            jSONObject.put("contained_in_scroll_view", C1782xi.m8394d(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final JSONObject m5707i(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzbv.zzlf();
            jSONObject.put("can_show_on_lock_screen", C1782xi.m8392c(view));
            zzbv.zzlf();
            jSONObject.put("is_keyguard_locked", C1782xi.m8407k(this.f4524e));
        } catch (JSONException unused) {
            C1772wz.m1630e("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONObject m5699a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] f = m5704f(view);
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view2 = (View) ((WeakReference) next.getValue()).get();
                if (view2 != null) {
                    int[] f2 = m5704f(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", m5697a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", m5697a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", m5697a(f2[0] - f[0]));
                        jSONObject4.put("y", m5697a(f2[1] - f[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = m5698a(rect);
                        } else {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", m5697a(f2[0] - f[0]));
                            jSONObject5.put("y", m5697a(f2[1] - f[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject = jSONObject5;
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", (double) textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put((String) next.getKey(), jSONObject3);
                    } catch (JSONException unused) {
                        C1772wz.m1630e("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    @Nullable
    /* renamed from: r */
    public final C1740vu mo12039r() {
        if (!zzbv.zzmf().mo13075a(this.f4524e)) {
            return null;
        }
        if (this.f4532m == null) {
            this.f4532m = new C1740vu(this.f4524e, this.f4523d.getAdUnitId());
        }
        return this.f4532m;
    }
}
