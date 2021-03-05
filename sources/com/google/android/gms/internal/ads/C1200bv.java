package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.bv */
public final class C1200bv extends C1220co implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, C1203by {

    /* renamed from: a */
    static final String[] f5289a = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};

    /* renamed from: b */
    private final Object f5290b = new Object();

    /* renamed from: c */
    private final WeakReference<View> f5291c;

    /* renamed from: d */
    private final Map<String, WeakReference<View>> f5292d = new HashMap();

    /* renamed from: e */
    private final Map<String, WeakReference<View>> f5293e = new HashMap();

    /* renamed from: f */
    private final Map<String, WeakReference<View>> f5294f = new HashMap();
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: g */
    private C1133bg f5295g;
    @Nullable

    /* renamed from: h */
    private View f5296h;

    /* renamed from: i */
    private Point f5297i = new Point();

    /* renamed from: j */
    private Point f5298j = new Point();
    @Nullable

    /* renamed from: k */
    private WeakReference<bmn> f5299k = new WeakReference<>((Object) null);

    public C1200bv(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        zzbv.zzme();
        aby.m1688a(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzbv.zzme();
        aby.m1689a(view, (ViewTreeObserver.OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f5291c = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f5292d.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f5294f.putAll(this.f5292d);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f5293e.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
            }
        }
        this.f5294f.putAll(this.f5293e);
        C1557p.m7741a(view.getContext());
    }

    /* renamed from: a */
    public final void mo12458a() {
        synchronized (this.f5290b) {
            this.f5296h = null;
            this.f5295g = null;
            this.f5297i = null;
            this.f5298j = null;
        }
    }

    /* renamed from: a */
    public final void mo12459a(C0719a aVar) {
        int i;
        KeyEvent.Callback callback;
        synchronized (this.f5290b) {
            ViewGroup viewGroup = null;
            m6577a((View) null);
            Object a = C0722b.m770a(aVar);
            if (!(a instanceof C1137bk)) {
                C1772wz.m1630e("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            C1137bk bkVar = (C1137bk) a;
            if (!bkVar.mo11791c()) {
                C1772wz.m1626c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view = (View) this.f5291c.get();
            if (!(this.f5295g == null || view == null)) {
                this.f5295g.mo11789b(view, this.f5294f);
            }
            synchronized (this.f5290b) {
                i = 0;
                if (this.f5295g instanceof C1137bk) {
                    C1137bk bkVar2 = (C1137bk) this.f5295g;
                    View view2 = (View) this.f5291c.get();
                    if (!(bkVar2 == null || bkVar2.mo11887p() == null || view2 == null || !zzbv.zzmf().mo13075a(view2.getContext()))) {
                        C1740vu r = bkVar2.mo12039r();
                        if (r != null) {
                            r.mo13071a(false);
                        }
                        bmn bmn = (bmn) this.f5299k.get();
                        if (!(bmn == null || r == null)) {
                            bmn.mo12182b((bmr) r);
                        }
                    }
                }
            }
            if (!(this.f5295g instanceof C1132bf) || !((C1132bf) this.f5295g).mo11796h()) {
                this.f5295g = bkVar;
                if (bkVar instanceof C1132bf) {
                    ((C1132bf) bkVar).mo11786a((C1133bg) null);
                }
            } else {
                ((C1132bf) this.f5295g).mo11786a((C1133bg) bkVar);
            }
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            while (true) {
                if (i >= 2) {
                    callback = null;
                    break;
                }
                WeakReference weakReference = this.f5294f.get(strArr[i]);
                if (weakReference != null) {
                    callback = (View) weakReference.get();
                    break;
                }
                i++;
            }
            if (callback == null) {
                C1772wz.m1630e("Ad choices asset view is not provided.");
            } else {
                if (callback instanceof ViewGroup) {
                    viewGroup = (ViewGroup) callback;
                }
                if (viewGroup != null) {
                    this.f5296h = bkVar.mo11780a((View.OnClickListener) this, true);
                    if (this.f5296h != null) {
                        this.f5294f.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference(this.f5296h));
                        this.f5292d.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference(this.f5296h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.f5296h);
                    }
                }
            }
            bkVar.mo11785a(view, this.f5292d, this.f5293e, (View.OnTouchListener) this, (View.OnClickListener) this);
            C1782xi.f6838a.post(new C1201bw(this, bkVar));
            m6577a(view);
            this.f5295g.mo11882b(view);
            synchronized (this.f5290b) {
                if (this.f5295g instanceof C1137bk) {
                    C1137bk bkVar3 = (C1137bk) this.f5295g;
                    View view3 = (View) this.f5291c.get();
                    if (!(bkVar3 == null || bkVar3.mo11887p() == null || view3 == null || !zzbv.zzmf().mo13075a(view3.getContext()))) {
                        bmn bmn2 = (bmn) this.f5299k.get();
                        if (bmn2 == null) {
                            bmn2 = new bmn(view3.getContext(), view3);
                            this.f5299k = new WeakReference<>(bmn2);
                        }
                        bmn2.mo12181a((bmr) bkVar3.mo12039r());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo12460b(C0719a aVar) {
        synchronized (this.f5290b) {
            this.f5295g.mo11782a((View) C0722b.m770a(aVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m6581a(String[] strArr) {
        for (String str : strArr) {
            if (this.f5292d.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.f5293e.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6578a(com.google.android.gms.internal.ads.C1137bk r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f5290b
            monitor-enter(r0)
            java.lang.String[] r1 = f5289a     // Catch:{ all -> 0x003b }
            int r2 = r1.length     // Catch:{ all -> 0x003b }
            r3 = 0
        L_0x0007:
            if (r3 >= r2) goto L_0x001f
            r4 = r1[r3]     // Catch:{ all -> 0x003b }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r6.f5294f     // Catch:{ all -> 0x003b }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x003b }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x001c
            java.lang.Object r1 = r4.get()     // Catch:{ all -> 0x003b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x003b }
            goto L_0x0020
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r2 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0029
            r7.mo11800l()     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x0029:
            com.google.android.gms.internal.ads.bx r2 = new com.google.android.gms.internal.ads.bx     // Catch:{ all -> 0x003b }
            r2.<init>(r6, r1)     // Catch:{ all -> 0x003b }
            boolean r3 = r7 instanceof com.google.android.gms.internal.ads.C1132bf     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0036
            r7.mo12036b((android.view.View) r1, (com.google.android.gms.internal.ads.C1130be) r2)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0036:
            r7.mo11878a((android.view.View) r1, (com.google.android.gms.internal.ads.C1130be) r2)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1200bv.m6578a(com.google.android.gms.internal.ads.bk):void");
    }

    /* renamed from: a */
    private final void m6577a(@Nullable View view) {
        C1133bg bgVar;
        synchronized (this.f5290b) {
            if (this.f5295g != null) {
                if (this.f5295g instanceof C1132bf) {
                    bgVar = ((C1132bf) this.f5295g).mo11797i();
                } else {
                    bgVar = this.f5295g;
                }
                if (bgVar != null) {
                    bgVar.mo11884c(view);
                }
            }
        }
    }

    public final void onGlobalLayout() {
        View view;
        synchronized (this.f5290b) {
            if (!(this.f5295g == null || (view = (View) this.f5291c.get()) == null)) {
                this.f5295g.mo11885c(view, this.f5294f);
            }
        }
    }

    public final void onScrollChanged() {
        View view;
        synchronized (this.f5290b) {
            if (!(this.f5295g == null || (view = (View) this.f5291c.get()) == null)) {
                this.f5295g.mo11885c(view, this.f5294f);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f5290b) {
            if (this.f5295g == null) {
                return false;
            }
            View view2 = (View) this.f5291c.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f5297i = point;
            if (motionEvent.getAction() == 0) {
                this.f5298j = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f5295g.mo11781a(obtain);
            obtain.recycle();
            return false;
        }
    }

    /* renamed from: b */
    public final synchronized Map<String, WeakReference<View>> mo12342b() {
        return this.f5294f;
    }

    @Nullable
    /* renamed from: c */
    public final View mo12344c() {
        return (View) this.f5291c.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f5290b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bg r1 = r9.f5295g     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0009:
            java.lang.ref.WeakReference<android.view.View> r1 = r9.f5291c     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0096 }
            r7 = r1
            android.view.View r7 = (android.view.View) r7     // Catch:{ all -> 0x0096 }
            if (r7 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0016:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0096 }
            r5.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r9.f5297i     // Catch:{ all -> 0x0096 }
            int r2 = r2.x     // Catch:{ all -> 0x0096 }
            int r2 = r9.m6576a((int) r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r9.f5297i     // Catch:{ all -> 0x0096 }
            int r2 = r2.y     // Catch:{ all -> 0x0096 }
            int r2 = r9.m6576a((int) r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r9.f5298j     // Catch:{ all -> 0x0096 }
            int r2 = r2.x     // Catch:{ all -> 0x0096 }
            int r2 = r9.m6576a((int) r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r9.f5298j     // Catch:{ all -> 0x0096 }
            int r2 = r2.y     // Catch:{ all -> 0x0096 }
            int r2 = r9.m6576a((int) r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            android.view.View r1 = r9.f5296h     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x008d
            android.view.View r1 = r9.f5296h     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.bg r1 = r9.f5295g     // Catch:{ all -> 0x0096 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C1132bf     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0081
            com.google.android.gms.internal.ads.bg r1 = r9.f5295g     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.bf r1 = (com.google.android.gms.internal.ads.C1132bf) r1     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.bg r1 = r1.mo11797i()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.bg r1 = r9.f5295g     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.bf r1 = (com.google.android.gms.internal.ads.C1132bf) r1     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.bg r2 = r1.mo11797i()     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f5294f     // Catch:{ all -> 0x0096 }
            r8 = 0
            r3 = r10
            r2.mo11879a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x0081:
            com.google.android.gms.internal.ads.bg r2 = r9.f5295g     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f5294f     // Catch:{ all -> 0x0096 }
            r8 = 0
            r3 = r10
            r2.mo11879a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x008d:
            com.google.android.gms.internal.ads.bg r1 = r9.f5295g     // Catch:{ all -> 0x0096 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r9.f5294f     // Catch:{ all -> 0x0096 }
            r1.mo11784a(r10, r2, r5, r7)     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0096:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1200bv.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final int m6576a(int i) {
        int b;
        synchronized (this.f5290b) {
            bre.m6317a();
            b = C1851zx.m8592b(this.f5295g.mo11887p(), i);
        }
        return b;
    }
}
