package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C0979o;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.bt */
public final class C1198bt extends C1215cj implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, C1203by {

    /* renamed from: a */
    private static final String[] f5190a = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};

    /* renamed from: b */
    private final Object f5191b = new Object();

    /* renamed from: c */
    private final FrameLayout f5192c;
    @Nullable

    /* renamed from: d */
    private FrameLayout f5193d;

    /* renamed from: e */
    private View f5194e;

    /* renamed from: f */
    private Map<String, WeakReference<View>> f5195f = Collections.synchronizedMap(new HashMap());
    @Nullable

    /* renamed from: g */
    private View f5196g;
    @Nullable

    /* renamed from: h */
    private C1133bg f5197h;

    /* renamed from: i */
    private boolean f5198i = false;

    /* renamed from: j */
    private Point f5199j = new Point();

    /* renamed from: k */
    private Point f5200k = new Point();

    /* renamed from: l */
    private WeakReference<bmn> f5201l = new WeakReference<>((Object) null);

    @TargetApi(21)
    public C1198bt(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f5192c = frameLayout;
        this.f5193d = frameLayout2;
        zzbv.zzme();
        aby.m1688a((View) this.f5192c, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzbv.zzme();
        aby.m1689a((View) this.f5192c, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f5192c.setOnTouchListener(this);
        this.f5192c.setOnClickListener(this);
        if (frameLayout2 != null && C0979o.m1507h()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        C1557p.m7741a(this.f5192c.getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12341a(java.lang.String r4, com.google.android.gms.p039a.C0719a r5) {
        /*
            r3 = this;
            java.lang.Object r5 = com.google.android.gms.p039a.C0722b.m770a((com.google.android.gms.p039a.C0719a) r5)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r3.f5191b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f5195f     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000f:
            if (r5 != 0) goto L_0x0017
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r3.f5195f     // Catch:{ all -> 0x0040 }
            r5.remove(r4)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f5195f     // Catch:{ all -> 0x0040 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0040 }
            r2.<init>(r5)     // Catch:{ all -> 0x0040 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "1098"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = "3011"
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            r5.setOnTouchListener(r3)     // Catch:{ all -> 0x0040 }
            r4 = 1
            r5.setClickable(r4)     // Catch:{ all -> 0x0040 }
            r5.setOnClickListener(r3)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1198bt.mo12341a(java.lang.String, com.google.android.gms.a.a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.p039a.C0719a mo12337a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5191b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f5195f     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r2
        L_0x000a:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f5195f     // Catch:{ all -> 0x0022 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0022 }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x0022 }
            if (r4 != 0) goto L_0x0015
            goto L_0x001c
        L_0x0015:
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0022 }
            r2 = r4
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0022 }
        L_0x001c:
            com.google.android.gms.a.a r4 = com.google.android.gms.p039a.C0722b.m769a(r2)     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r4
        L_0x0022:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1198bt.mo12337a(java.lang.String):com.google.android.gms.a.a");
    }

    /* renamed from: a */
    private final void m6369a(@Nullable View view) {
        C1133bg bgVar;
        if (this.f5197h != null) {
            if (this.f5197h instanceof C1132bf) {
                bgVar = ((C1132bf) this.f5197h).mo11797i();
            } else {
                bgVar = this.f5197h;
            }
            if (bgVar != null) {
                bgVar.mo11884c(view);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df A[Catch:{ Exception -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012a A[Catch:{ Exception -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014b A[Catch:{ Exception -> 0x0157 }] */
    /* renamed from: a */
    public final void mo12339a(com.google.android.gms.p039a.C0719a r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f5191b
            monitor-enter(r0)
            r1 = 0
            r11.m6369a((android.view.View) r1)     // Catch:{ all -> 0x021a }
            java.lang.Object r12 = com.google.android.gms.p039a.C0722b.m770a((com.google.android.gms.p039a.C0719a) r12)     // Catch:{ all -> 0x021a }
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.C1137bk     // Catch:{ all -> 0x021a }
            if (r2 != 0) goto L_0x0016
            java.lang.String r12 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.C1772wz.m1630e(r12)     // Catch:{ all -> 0x021a }
            monitor-exit(r0)     // Catch:{ all -> 0x021a }
            return
        L_0x0016:
            r2 = 1
            r11.f5198i = r2     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bk r12 = (com.google.android.gms.internal.ads.C1137bk) r12     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bg r3 = r11.f5197h     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.bg r3 = r11.f5197h     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r4 = r11.f5192c     // Catch:{ all -> 0x021a }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f5195f     // Catch:{ all -> 0x021a }
            r3.mo11789b(r4, r5)     // Catch:{ all -> 0x021a }
        L_0x0028:
            com.google.android.gms.internal.ads.bg r3 = r11.f5197h     // Catch:{ all -> 0x021a }
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.C1137bk     // Catch:{ all -> 0x021a }
            r9 = 0
            if (r3 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.bg r3 = r11.f5197h     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bk r3 = (com.google.android.gms.internal.ads.C1137bk) r3     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0063
            android.content.Context r4 = r3.mo11887p()     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.vv r4 = com.google.android.gms.ads.internal.zzbv.zzmf()     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r5 = r11.f5192c     // Catch:{ all -> 0x021a }
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x021a }
            boolean r4 = r4.mo13075a(r5)     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.vu r3 = r3.mo12039r()     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0054
            r3.mo13071a((boolean) r9)     // Catch:{ all -> 0x021a }
        L_0x0054:
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.bmn> r4 = r11.f5201l     // Catch:{ all -> 0x021a }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bmn r4 = (com.google.android.gms.internal.ads.bmn) r4     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x0063
            if (r3 == 0) goto L_0x0063
            r4.mo12182b((com.google.android.gms.internal.ads.bmr) r3)     // Catch:{ all -> 0x021a }
        L_0x0063:
            com.google.android.gms.internal.ads.bg r3 = r11.f5197h     // Catch:{ all -> 0x021a }
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.C1132bf     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.bg r3 = r11.f5197h     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bf r3 = (com.google.android.gms.internal.ads.C1132bf) r3     // Catch:{ all -> 0x021a }
            boolean r3 = r3.mo11796h()     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.bg r3 = r11.f5197h     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bf r3 = (com.google.android.gms.internal.ads.C1132bf) r3     // Catch:{ all -> 0x021a }
            r3.mo11786a((com.google.android.gms.internal.ads.C1133bg) r12)     // Catch:{ all -> 0x021a }
            goto L_0x0087
        L_0x007b:
            r11.f5197h = r12     // Catch:{ all -> 0x021a }
            boolean r3 = r12 instanceof com.google.android.gms.internal.ads.C1132bf     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0087
            r3 = r12
            com.google.android.gms.internal.ads.bf r3 = (com.google.android.gms.internal.ads.C1132bf) r3     // Catch:{ all -> 0x021a }
            r3.mo11786a((com.google.android.gms.internal.ads.C1133bg) r1)     // Catch:{ all -> 0x021a }
        L_0x0087:
            android.widget.FrameLayout r3 = r11.f5193d     // Catch:{ all -> 0x021a }
            if (r3 != 0) goto L_0x008d
            monitor-exit(r0)     // Catch:{ all -> 0x021a }
            return
        L_0x008d:
            android.widget.FrameLayout r3 = r11.f5193d     // Catch:{ all -> 0x021a }
            r3.setClickable(r9)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r3 = r11.f5193d     // Catch:{ all -> 0x021a }
            r3.removeAllViews()     // Catch:{ all -> 0x021a }
            boolean r3 = r12.mo11788a()     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x00cd
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f5195f     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x00c5
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x021a }
            java.lang.String r6 = "1098"
            r5[r9] = r6     // Catch:{ all -> 0x021a }
            java.lang.String r6 = "3011"
            r5[r2] = r6     // Catch:{ all -> 0x021a }
            r6 = 0
        L_0x00ad:
            if (r6 >= r4) goto L_0x00c5
            r7 = r5[r6]     // Catch:{ all -> 0x021a }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r8 = r11.f5195f     // Catch:{ all -> 0x021a }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x021a }
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7     // Catch:{ all -> 0x021a }
            if (r7 == 0) goto L_0x00c2
            java.lang.Object r4 = r7.get()     // Catch:{ all -> 0x021a }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x021a }
            goto L_0x00c6
        L_0x00c2:
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00c5:
            r4 = r1
        L_0x00c6:
            boolean r5 = r4 instanceof android.view.ViewGroup     // Catch:{ all -> 0x021a }
            if (r5 == 0) goto L_0x00cd
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x021a }
            goto L_0x00ce
        L_0x00cd:
            r4 = r1
        L_0x00ce:
            if (r3 == 0) goto L_0x00d3
            if (r4 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r2 = 0
        L_0x00d4:
            android.view.View r3 = r12.mo11780a((android.view.View.OnClickListener) r11, (boolean) r2)     // Catch:{ all -> 0x021a }
            r11.f5196g = r3     // Catch:{ all -> 0x021a }
            android.view.View r3 = r11.f5196g     // Catch:{ all -> 0x021a }
            r10 = -1
            if (r3 == 0) goto L_0x011b
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.f5195f     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x00f1
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.f5195f     // Catch:{ all -> 0x021a }
            java.lang.String r5 = "1007"
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x021a }
            android.view.View r7 = r11.f5196g     // Catch:{ all -> 0x021a }
            r6.<init>(r7)     // Catch:{ all -> 0x021a }
            r3.put(r5, r6)     // Catch:{ all -> 0x021a }
        L_0x00f1:
            if (r2 == 0) goto L_0x00fc
            r4.removeAllViews()     // Catch:{ all -> 0x021a }
            android.view.View r2 = r11.f5196g     // Catch:{ all -> 0x021a }
            r4.addView(r2)     // Catch:{ all -> 0x021a }
            goto L_0x011b
        L_0x00fc:
            android.content.Context r2 = r12.mo11887p()     // Catch:{ all -> 0x021a }
            com.google.android.gms.ads.formats.AdChoicesView r3 = new com.google.android.gms.ads.formats.AdChoicesView     // Catch:{ all -> 0x021a }
            r3.<init>(r2)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x021a }
            r2.<init>(r10, r10)     // Catch:{ all -> 0x021a }
            r3.setLayoutParams(r2)     // Catch:{ all -> 0x021a }
            android.view.View r2 = r11.f5196g     // Catch:{ all -> 0x021a }
            r3.addView(r2)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r2 = r11.f5193d     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x011b
            android.widget.FrameLayout r2 = r11.f5193d     // Catch:{ all -> 0x021a }
            r2.addView(r3)     // Catch:{ all -> 0x021a }
        L_0x011b:
            android.widget.FrameLayout r4 = r11.f5192c     // Catch:{ all -> 0x021a }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f5195f     // Catch:{ all -> 0x021a }
            r6 = 0
            r3 = r12
            r7 = r11
            r8 = r11
            r3.mo11785a((android.view.View) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r6, (android.view.View.OnTouchListener) r7, (android.view.View.OnClickListener) r8)     // Catch:{ all -> 0x021a }
            android.view.View r2 = r11.f5194e     // Catch:{ all -> 0x021a }
            if (r2 != 0) goto L_0x0141
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r3 = r11.f5192c     // Catch:{ all -> 0x021a }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x021a }
            r2.<init>(r3)     // Catch:{ all -> 0x021a }
            r11.f5194e = r2     // Catch:{ all -> 0x021a }
            android.view.View r2 = r11.f5194e     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x021a }
            r3.<init>(r10, r9)     // Catch:{ all -> 0x021a }
            r2.setLayoutParams(r3)     // Catch:{ all -> 0x021a }
        L_0x0141:
            android.widget.FrameLayout r2 = r11.f5192c     // Catch:{ all -> 0x021a }
            android.view.View r3 = r11.f5194e     // Catch:{ all -> 0x021a }
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x021a }
            if (r2 == r3) goto L_0x0152
            android.widget.FrameLayout r2 = r11.f5192c     // Catch:{ all -> 0x021a }
            android.view.View r3 = r11.f5194e     // Catch:{ all -> 0x021a }
            r2.addView(r3)     // Catch:{ all -> 0x021a }
        L_0x0152:
            com.google.android.gms.internal.ads.afl r2 = r12.mo11798j()     // Catch:{ Exception -> 0x0157 }
            goto L_0x016d
        L_0x0157:
            r2 = move-exception
            com.google.android.gms.ads.internal.zzbv.zzlh()     // Catch:{ all -> 0x021a }
            boolean r3 = com.google.android.gms.internal.ads.C1790xq.m8436e()     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0167
            java.lang.String r2 = "Privileged processes cannot create HTML overlays."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r2)     // Catch:{ all -> 0x021a }
            goto L_0x016c
        L_0x0167:
            java.lang.String r3 = "Error obtaining overlay."
            com.google.android.gms.internal.ads.C1772wz.m1625b(r3, r2)     // Catch:{ all -> 0x021a }
        L_0x016c:
            r2 = r1
        L_0x016d:
            if (r2 == 0) goto L_0x017c
            android.widget.FrameLayout r3 = r11.f5193d     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x017c
            android.widget.FrameLayout r3 = r11.f5193d     // Catch:{ all -> 0x021a }
            android.view.View r2 = r2.getView()     // Catch:{ all -> 0x021a }
            r3.addView(r2)     // Catch:{ all -> 0x021a }
        L_0x017c:
            java.lang.Object r2 = r11.f5191b     // Catch:{ all -> 0x021a }
            monitor-enter(r2)     // Catch:{ all -> 0x021a }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.f5195f     // Catch:{ all -> 0x0217 }
            r12.mo12035a((java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r3)     // Catch:{ all -> 0x0217 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.f5195f     // Catch:{ all -> 0x0217 }
            if (r3 == 0) goto L_0x01a3
            java.lang.String[] r3 = f5190a     // Catch:{ all -> 0x0217 }
            int r4 = r3.length     // Catch:{ all -> 0x0217 }
        L_0x018b:
            if (r9 >= r4) goto L_0x01a3
            r5 = r3[r9]     // Catch:{ all -> 0x0217 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.f5195f     // Catch:{ all -> 0x0217 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x0217 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ all -> 0x0217 }
            if (r5 == 0) goto L_0x01a0
            java.lang.Object r1 = r5.get()     // Catch:{ all -> 0x0217 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0217 }
            goto L_0x01a3
        L_0x01a0:
            int r9 = r9 + 1
            goto L_0x018b
        L_0x01a3:
            boolean r3 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x0217 }
            if (r3 != 0) goto L_0x01a9
            monitor-exit(r2)     // Catch:{ all -> 0x0217 }
            goto L_0x01ba
        L_0x01a9:
            com.google.android.gms.internal.ads.bu r3 = new com.google.android.gms.internal.ads.bu     // Catch:{ all -> 0x0217 }
            r3.<init>(r11, r1)     // Catch:{ all -> 0x0217 }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.C1132bf     // Catch:{ all -> 0x0217 }
            if (r4 == 0) goto L_0x01b6
            r12.mo12036b((android.view.View) r1, (com.google.android.gms.internal.ads.C1130be) r3)     // Catch:{ all -> 0x0217 }
            goto L_0x01b9
        L_0x01b6:
            r12.mo11878a((android.view.View) r1, (com.google.android.gms.internal.ads.C1130be) r3)     // Catch:{ all -> 0x0217 }
        L_0x01b9:
            monitor-exit(r2)     // Catch:{ all -> 0x0217 }
        L_0x01ba:
            r12.mo12034a((com.google.android.gms.internal.ads.C1203by) r11)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r1 = r11.f5192c     // Catch:{ all -> 0x021a }
            r12.mo12037d(r1)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r12 = r11.f5192c     // Catch:{ all -> 0x021a }
            r11.m6369a((android.view.View) r12)     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bg r12 = r11.f5197h     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r1 = r11.f5192c     // Catch:{ all -> 0x021a }
            r12.mo11882b((android.view.View) r1)     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bg r12 = r11.f5197h     // Catch:{ all -> 0x021a }
            boolean r12 = r12 instanceof com.google.android.gms.internal.ads.C1137bk     // Catch:{ all -> 0x021a }
            if (r12 == 0) goto L_0x0215
            com.google.android.gms.internal.ads.bg r12 = r11.f5197h     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bk r12 = (com.google.android.gms.internal.ads.C1137bk) r12     // Catch:{ all -> 0x021a }
            if (r12 == 0) goto L_0x0215
            android.content.Context r1 = r12.mo11887p()     // Catch:{ all -> 0x021a }
            if (r1 == 0) goto L_0x0215
            com.google.android.gms.internal.ads.vv r1 = com.google.android.gms.ads.internal.zzbv.zzmf()     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r2 = r11.f5192c     // Catch:{ all -> 0x021a }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x021a }
            boolean r1 = r1.mo13075a(r2)     // Catch:{ all -> 0x021a }
            if (r1 == 0) goto L_0x0215
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.bmn> r1 = r11.f5201l     // Catch:{ all -> 0x021a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.bmn r1 = (com.google.android.gms.internal.ads.bmn) r1     // Catch:{ all -> 0x021a }
            if (r1 != 0) goto L_0x020e
            com.google.android.gms.internal.ads.bmn r1 = new com.google.android.gms.internal.ads.bmn     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r2 = r11.f5192c     // Catch:{ all -> 0x021a }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r3 = r11.f5192c     // Catch:{ all -> 0x021a }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x021a }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x021a }
            r2.<init>(r1)     // Catch:{ all -> 0x021a }
            r11.f5201l = r2     // Catch:{ all -> 0x021a }
        L_0x020e:
            com.google.android.gms.internal.ads.vu r12 = r12.mo12039r()     // Catch:{ all -> 0x021a }
            r1.mo12181a((com.google.android.gms.internal.ads.bmr) r12)     // Catch:{ all -> 0x021a }
        L_0x0215:
            monitor-exit(r0)     // Catch:{ all -> 0x021a }
            return
        L_0x0217:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0217 }
            throw r12     // Catch:{ all -> 0x021a }
        L_0x021a:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x021a }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1198bt.mo12339a(com.google.android.gms.a.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f5191b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bg r1 = r9.f5197h     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return
        L_0x0009:
            com.google.android.gms.internal.ads.bg r1 = r9.f5197h     // Catch:{ all -> 0x0094 }
            r1.mo11792d()     // Catch:{ all -> 0x0094 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0094 }
            r5.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r9.f5199j     // Catch:{ all -> 0x0094 }
            int r2 = r2.x     // Catch:{ all -> 0x0094 }
            int r2 = r9.m6368a((int) r2)     // Catch:{ all -> 0x0094 }
            float r2 = (float) r2     // Catch:{ all -> 0x0094 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r9.f5199j     // Catch:{ all -> 0x0094 }
            int r2 = r2.y     // Catch:{ all -> 0x0094 }
            int r2 = r9.m6368a((int) r2)     // Catch:{ all -> 0x0094 }
            float r2 = (float) r2     // Catch:{ all -> 0x0094 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r9.f5200k     // Catch:{ all -> 0x0094 }
            int r2 = r2.x     // Catch:{ all -> 0x0094 }
            int r2 = r9.m6368a((int) r2)     // Catch:{ all -> 0x0094 }
            float r2 = (float) r2     // Catch:{ all -> 0x0094 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r9.f5200k     // Catch:{ all -> 0x0094 }
            int r2 = r2.y     // Catch:{ all -> 0x0094 }
            int r2 = r9.m6368a((int) r2)     // Catch:{ all -> 0x0094 }
            float r2 = (float) r2     // Catch:{ all -> 0x0094 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0094 }
            android.view.View r1 = r9.f5196g     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0089
            android.view.View r1 = r9.f5196g     // Catch:{ all -> 0x0094 }
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.bg r1 = r9.f5197h     // Catch:{ all -> 0x0094 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C1132bf     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.bg r1 = r9.f5197h     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.ads.bf r1 = (com.google.android.gms.internal.ads.C1132bf) r1     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.ads.bg r1 = r1.mo11797i()     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0092
            com.google.android.gms.internal.ads.bg r1 = r9.f5197h     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.ads.bf r1 = (com.google.android.gms.internal.ads.C1132bf) r1     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.ads.bg r2 = r1.mo11797i()     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f5195f     // Catch:{ all -> 0x0094 }
            android.widget.FrameLayout r7 = r9.f5192c     // Catch:{ all -> 0x0094 }
            r8 = 0
            r3 = r10
            r2.mo11879a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x007b:
            com.google.android.gms.internal.ads.bg r2 = r9.f5197h     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f5195f     // Catch:{ all -> 0x0094 }
            android.widget.FrameLayout r7 = r9.f5192c     // Catch:{ all -> 0x0094 }
            r8 = 0
            r3 = r10
            r2.mo11879a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x0089:
            com.google.android.gms.internal.ads.bg r1 = r9.f5197h     // Catch:{ all -> 0x0094 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r9.f5195f     // Catch:{ all -> 0x0094 }
            android.widget.FrameLayout r3 = r9.f5192c     // Catch:{ all -> 0x0094 }
            r1.mo11784a(r10, r2, r5, r3)     // Catch:{ all -> 0x0094 }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return
        L_0x0094:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1198bt.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f5191b) {
            if (this.f5197h != null) {
                this.f5197h.mo11885c(this.f5192c, this.f5195f);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f5191b) {
            if (this.f5197h != null) {
                this.f5197h.mo11885c(this.f5192c, this.f5195f);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f5191b) {
            if (this.f5197h == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.f5192c.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f5199j = point;
            if (motionEvent.getAction() == 0) {
                this.f5200k = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f5197h.mo11781a(obtain);
            obtain.recycle();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo12338a() {
        synchronized (this.f5191b) {
            if (this.f5193d != null) {
                this.f5193d.removeAllViews();
            }
            this.f5193d = null;
            this.f5195f = null;
            this.f5196g = null;
            this.f5197h = null;
            this.f5199j = null;
            this.f5200k = null;
            this.f5201l = null;
            this.f5194e = null;
        }
    }

    /* renamed from: a */
    public final void mo12340a(C0719a aVar, int i) {
        bmn bmn;
        if (zzbv.zzmf().mo13075a(this.f5192c.getContext()) && this.f5201l != null && (bmn = (bmn) this.f5201l.get()) != null) {
            bmn.mo12180a();
        }
    }

    /* renamed from: b */
    public final void mo12343b(C0719a aVar) {
        this.f5197h.mo11782a((View) C0722b.m770a(aVar));
    }

    /* renamed from: b */
    public final synchronized Map<String, WeakReference<View>> mo12342b() {
        return this.f5195f;
    }

    /* renamed from: c */
    public final View mo12344c() {
        return this.f5192c;
    }

    /* renamed from: a */
    private final int m6368a(int i) {
        bre.m6317a();
        return C1851zx.m8592b(this.f5197h.mo11887p(), i);
    }
}
