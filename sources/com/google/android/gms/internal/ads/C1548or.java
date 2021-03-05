package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(19)
@C1598qn
/* renamed from: com.google.android.gms.internal.ads.or */
public final class C1548or extends C1545oo {

    /* renamed from: d */
    private Object f5828d = new Object();
    @GuardedBy("mPopupWindowLock")

    /* renamed from: e */
    private PopupWindow f5829e;
    @GuardedBy("mPopupWindowLock")

    /* renamed from: f */
    private boolean f5830f = false;

    C1548or(Context context, C1753wg wgVar, afl afl, C1544on onVar) {
        super(context, wgVar, afl, onVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0069 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12853b() {
        /*
            r8 = this;
            android.content.Context r0 = r8.f5804a
            boolean r0 = r0 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.content.Context r0 = r8.f5804a
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 == 0) goto L_0x0070
            android.view.View r2 = r0.getDecorView()
            if (r2 != 0) goto L_0x001a
            goto L_0x0070
        L_0x001a:
            android.content.Context r2 = r8.f5804a
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L_0x0025
            return
        L_0x0025:
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r3 = r8.f5804a
            r2.<init>(r3)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.setLayoutParams(r3)
            com.google.android.gms.internal.ads.afl r3 = r8.f5805b
            android.view.View r3 = r3.getView()
            r2.addView(r3, r4, r4)
            java.lang.Object r3 = r8.f5828d
            monitor-enter(r3)
            boolean r5 = r8.f5830f     // Catch:{ all -> 0x006d }
            if (r5 == 0) goto L_0x0047
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            return
        L_0x0047:
            android.widget.PopupWindow r5 = new android.widget.PopupWindow     // Catch:{ all -> 0x006d }
            r6 = 0
            r7 = 1
            r5.<init>(r2, r7, r7, r6)     // Catch:{ all -> 0x006d }
            r8.f5829e = r5     // Catch:{ all -> 0x006d }
            android.widget.PopupWindow r2 = r8.f5829e     // Catch:{ all -> 0x006d }
            r2.setOutsideTouchable(r7)     // Catch:{ all -> 0x006d }
            android.widget.PopupWindow r2 = r8.f5829e     // Catch:{ all -> 0x006d }
            r2.setClippingEnabled(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "Displaying the 1x1 popup off the screen."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r2)     // Catch:{ all -> 0x006d }
            android.widget.PopupWindow r2 = r8.f5829e     // Catch:{ Exception -> 0x0069 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0069 }
            r2.showAtLocation(r0, r6, r4, r4)     // Catch:{ Exception -> 0x0069 }
            goto L_0x006b
        L_0x0069:
            r8.f5829e = r1     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            throw r0
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1548or.mo12853b():void");
    }

    public final void cancel() {
        m7709c();
        super.cancel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12844a(int i) {
        m7709c();
        super.mo12844a(i);
    }

    /* renamed from: c */
    private final void m7709c() {
        synchronized (this.f5828d) {
            this.f5830f = true;
            if ((this.f5804a instanceof Activity) && ((Activity) this.f5804a).isDestroyed()) {
                this.f5829e = null;
            }
            if (this.f5829e != null) {
                if (this.f5829e.isShowing()) {
                    this.f5829e.dismiss();
                }
                this.f5829e = null;
            }
        }
    }
}
