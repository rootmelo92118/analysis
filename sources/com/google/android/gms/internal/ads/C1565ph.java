package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzac;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ph */
public final class C1565ph {

    /* renamed from: a */
    private final Object f6176a = new Object();

    /* renamed from: b */
    private final Context f6177b;

    /* renamed from: c */
    private final awy f6178c;

    /* renamed from: d */
    private final C1753wg f6179d;

    /* renamed from: e */
    private final C1019ad f6180e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzbb f6181f;

    /* renamed from: g */
    private ViewTreeObserver.OnGlobalLayoutListener f6182g;

    /* renamed from: h */
    private ViewTreeObserver.OnScrollChangedListener f6183h;

    /* renamed from: i */
    private final DisplayMetrics f6184i;

    /* renamed from: j */
    private C1840zm f6185j;
    @GuardedBy("mLock")

    /* renamed from: k */
    private int f6186k = -1;
    @GuardedBy("mLock")

    /* renamed from: l */
    private int f6187l = -1;

    public C1565ph(Context context, awy awy, C1753wg wgVar, C1019ad adVar, zzbb zzbb) {
        this.f6177b = context;
        this.f6178c = awy;
        this.f6179d = wgVar;
        this.f6180e = adVar;
        this.f6181f = zzbb;
        this.f6185j = new C1840zm(200);
        zzbv.zzlf();
        this.f6184i = C1782xi.m8358a((WindowManager) context.getSystemService("window"));
    }

    /* renamed from: a */
    private final void m7756a(afl afl, boolean z) {
        afl.mo10347a("/video", (zzu<? super afl>) zzf.zzdfe);
        afl.mo10347a("/videoMeta", (zzu<? super afl>) zzf.zzdff);
        afl.mo10347a("/precache", (zzu<? super afl>) new aeu());
        afl.mo10347a("/delayPageLoaded", (zzu<? super afl>) zzf.zzdfi);
        afl.mo10347a("/instrument", (zzu<? super afl>) zzf.zzdfg);
        afl.mo10347a("/log", (zzu<? super afl>) zzf.zzdez);
        afl.mo10347a("/videoClicked", (zzu<? super afl>) zzf.zzdfa);
        afl.mo10347a("/trackActiveViewUnit", (zzu<? super afl>) new C1571pn(this));
        afl.mo10347a("/untrackActiveViewUnit", (zzu<? super afl>) new C1572po(this));
        if (z) {
            afl.mo10347a("/open", (zzu<? super afl>) new zzac((zzw) null, (C1504na) null));
        }
    }

    /* renamed from: a */
    private final ViewTreeObserver.OnGlobalLayoutListener m7753a(WeakReference<afl> weakReference) {
        if (this.f6182g == null) {
            this.f6182g = new C1573pp(this, weakReference);
        }
        return this.f6182g;
    }

    /* renamed from: b */
    private final ViewTreeObserver.OnScrollChangedListener m7759b(WeakReference<afl> weakReference) {
        if (this.f6183h == null) {
            this.f6183h = new C1574pq(this, weakReference);
        }
        return this.f6183h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7758a(WeakReference<afl> weakReference, boolean z) {
        afl afl;
        if (weakReference != null && (afl = (afl) weakReference.get()) != null && afl.getView() != null) {
            if (!z || this.f6185j.mo13287a()) {
                int[] iArr = new int[2];
                afl.getView().getLocationOnScreen(iArr);
                bre.m6317a();
                int b = C1851zx.m8593b(this.f6184i, iArr[0]);
                bre.m6317a();
                int b2 = C1851zx.m8593b(this.f6184i, iArr[1]);
                synchronized (this.f6176a) {
                    if (!(this.f6186k == b && this.f6187l == b2)) {
                        this.f6186k = b;
                        this.f6187l = b2;
                        afl.mo10388u().mo10397a(this.f6186k, this.f6187l, !z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final afl m7755a() {
        zzbv.zzlg();
        return afr.m2018a(this.f6177b, agy.m2168a(), "native-video", false, false, this.f6178c, this.f6179d.f6724a.f7040k, this.f6180e, (zzbo) null, this.f6181f.zzid(), this.f6179d.f6732i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12876a(boolean z, abq abq, String str, String str2) {
        try {
            afl a = m7755a();
            if (z) {
                a.mo10345a(agy.m2172c());
            } else {
                a.mo10345a(agy.m2171b());
            }
            this.f6181f.zzf(a);
            WeakReference weakReference = new WeakReference(a);
            a.mo10388u().mo10398a(m7753a((WeakReference<afl>) weakReference), m7759b(weakReference));
            m7756a(a, z);
            a.mo10388u().mo10400a((agt) new C1568pk(this, abq, a));
            a.mo10349a(str, str2, (String) null);
        } catch (Exception e) {
            C1772wz.m1627c("Exception occurred while getting video view", e);
            abq.mo10087b(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12875a(abq abq, afl afl, boolean z) {
        this.f6181f.zzks();
        abq.mo10087b(afl);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12877a(boolean z, JSONObject jSONObject, abq abq) {
        try {
            afl a = m7755a();
            if (z) {
                a.mo10345a(agy.m2172c());
            } else {
                a.mo10345a(agy.m2171b());
            }
            this.f6181f.zzf(a);
            WeakReference weakReference = new WeakReference(a);
            a.mo10388u().mo10398a(m7753a((WeakReference<afl>) weakReference), m7759b(weakReference));
            m7756a(a, z);
            a.mo10388u().mo10401a((agu) new C1569pl(a, jSONObject));
            a.mo10388u().mo10400a((agt) new C1570pm(this, abq, a));
            a.loadUrl((String) bre.m6321e().mo12778a(C1557p.f5996by));
        } catch (Exception e) {
            C1772wz.m1627c("Exception occurred while getting video view", e);
            abq.mo10087b(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo12878b(abq abq, afl afl, boolean z) {
        this.f6181f.zzks();
        abq.mo10087b(afl);
    }
}
