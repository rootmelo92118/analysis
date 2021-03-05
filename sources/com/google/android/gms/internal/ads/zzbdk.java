package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.p034v4.app.NotificationCompat;
import android.support.p034v4.internal.view.SupportMenu;
import android.support.p034v4.view.InputDeviceCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C0926p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzbdk extends FrameLayout implements acm {

    /* renamed from: a */
    private final adc f7158a;

    /* renamed from: b */
    private final FrameLayout f7159b;

    /* renamed from: c */
    private final C1019ad f7160c;

    /* renamed from: d */
    private final adf f7161d;

    /* renamed from: e */
    private final long f7162e;
    @Nullable

    /* renamed from: f */
    private zzbdi f7163f;

    /* renamed from: g */
    private boolean f7164g;

    /* renamed from: h */
    private boolean f7165h;

    /* renamed from: i */
    private boolean f7166i;

    /* renamed from: j */
    private boolean f7167j;

    /* renamed from: k */
    private long f7168k;

    /* renamed from: l */
    private long f7169l;

    /* renamed from: m */
    private String f7170m;

    /* renamed from: n */
    private Bitmap f7171n;

    /* renamed from: o */
    private ImageView f7172o;

    /* renamed from: p */
    private boolean f7173p;

    /* renamed from: a */
    public static void m8647a(adc adc) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
        adc.mo10443a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public static void m8649a(adc adc, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("mimeTypes", map);
        adc.mo10443a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public static void m8648a(adc adc, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("error", str);
        adc.mo10443a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbdk(Context context, adc adc, int i, boolean z, C1019ad adVar, adb adb) {
        super(context);
        Context context2 = context;
        adc adc2 = adc;
        this.f7158a = adc2;
        C1019ad adVar2 = adVar;
        this.f7160c = adVar2;
        this.f7159b = new FrameLayout(context);
        addView(this.f7159b, new FrameLayout.LayoutParams(-1, -1));
        C0926p.m1306a(adc.mo10175e());
        this.f7163f = adc.mo10175e().zzbmt.mo10127a(context, adc2, i, z, adVar2, adb);
        if (this.f7163f != null) {
            this.f7159b.addView(this.f7163f, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f6146w)).booleanValue()) {
                mo13371m();
            }
        }
        this.f7172o = new ImageView(context);
        this.f7162e = ((Long) bre.m6321e().mo12778a(C1557p.f5866A)).longValue();
        this.f7167j = ((Boolean) bre.m6321e().mo12778a(C1557p.f6148y)).booleanValue();
        if (this.f7160c != null) {
            this.f7160c.mo10153a("spinner_used", this.f7167j ? "1" : "0");
        }
        this.f7161d = new adf(this);
        if (this.f7163f != null) {
            this.f7163f.mo13328a((acm) this);
        }
        if (this.f7163f == null) {
            mo10119a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public final void mo13357a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f7159b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo13359a(String str) {
        this.f7170m = str;
    }

    /* renamed from: a */
    public final void mo13355a(float f, float f2) {
        if (this.f7163f != null) {
            this.f7163f.mo13326a(f, f2);
        }
    }

    /* renamed from: h */
    public final void mo13366h() {
        if (this.f7163f != null) {
            if (!TextUtils.isEmpty(this.f7170m)) {
                this.f7163f.setVideoPath(this.f7170m);
            } else {
                m8651a("no_src", new String[0]);
            }
        }
    }

    /* renamed from: i */
    public final void mo13367i() {
        if (this.f7163f != null) {
            this.f7163f.mo13332d();
        }
    }

    /* renamed from: j */
    public final void mo13368j() {
        if (this.f7163f != null) {
            this.f7163f.mo13331c();
        }
    }

    /* renamed from: a */
    public final void mo13356a(int i) {
        if (this.f7163f != null) {
            this.f7163f.mo13327a(i);
        }
    }

    /* renamed from: k */
    public final void mo13369k() {
        if (this.f7163f != null) {
            zzbdi zzbdi = this.f7163f;
            zzbdi.f7157b.mo10196a(true);
            zzbdi.mo10200e();
        }
    }

    /* renamed from: l */
    public final void mo13370l() {
        if (this.f7163f != null) {
            zzbdi zzbdi = this.f7163f;
            zzbdi.f7157b.mo10196a(false);
            zzbdi.mo10200e();
        }
    }

    public final void setVolume(float f) {
        if (this.f7163f != null) {
            zzbdi zzbdi = this.f7163f;
            zzbdi.f7157b.mo10195a(f);
            zzbdi.mo10200e();
        }
    }

    /* renamed from: b */
    public final void mo13361b(int i) {
        this.f7163f.mo13351c(i);
    }

    /* renamed from: c */
    public final void mo13362c(int i) {
        this.f7163f.mo13352d(i);
    }

    /* renamed from: d */
    public final void mo13363d(int i) {
        this.f7163f.mo13353e(i);
    }

    /* renamed from: e */
    public final void mo13364e(int i) {
        this.f7163f.mo13354f(i);
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void mo13358a(MotionEvent motionEvent) {
        if (this.f7163f != null) {
            this.f7163f.dispatchTouchEvent(motionEvent);
        }
    }

    @TargetApi(14)
    /* renamed from: m */
    public final void mo13371m() {
        if (this.f7163f != null) {
            TextView textView = new TextView(this.f7163f.getContext());
            String valueOf = String.valueOf(this.f7163f.mo13325a());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(SupportMenu.CATEGORY_MASK);
            textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
            this.f7159b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f7159b.bringChildToFront(textView);
        }
    }

    /* renamed from: a */
    public final void mo10117a() {
        this.f7161d.mo10192b();
        C1782xi.f6838a.post(new acq(this));
    }

    /* renamed from: b */
    public final void mo10120b() {
        if (this.f7163f != null && this.f7169l == 0) {
            m8651a("canplaythrough", "duration", String.valueOf(((float) this.f7163f.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f7163f.getVideoWidth()), "videoHeight", String.valueOf(this.f7163f.getVideoHeight()));
        }
    }

    /* renamed from: c */
    public final void mo10121c() {
        if (this.f7158a.mo10174d() != null && !this.f7165h) {
            this.f7166i = (this.f7158a.mo10174d().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f7166i) {
                this.f7158a.mo10174d().getWindow().addFlags(128);
                this.f7165h = true;
            }
        }
        this.f7164g = true;
    }

    /* renamed from: d */
    public final void mo10122d() {
        m8651a("pause", new String[0]);
        m8653q();
        this.f7164g = false;
    }

    /* renamed from: e */
    public final void mo10123e() {
        m8651a("ended", new String[0]);
        m8653q();
    }

    /* renamed from: a */
    public final void mo10119a(String str, @Nullable String str2) {
        m8651a("error", "what", str, "extra", str2);
    }

    /* renamed from: f */
    public final void mo10124f() {
        if (this.f7173p && this.f7171n != null && !m8652p()) {
            this.f7172o.setImageBitmap(this.f7171n);
            this.f7172o.invalidate();
            this.f7159b.addView(this.f7172o, new FrameLayout.LayoutParams(-1, -1));
            this.f7159b.bringChildToFront(this.f7172o);
        }
        this.f7161d.mo10191a();
        this.f7169l = this.f7168k;
        C1782xi.f6838a.post(new acr(this));
    }

    /* renamed from: n */
    public final void mo13372n() {
        this.f7161d.mo10191a();
        if (this.f7163f != null) {
            this.f7163f.mo13329b();
        }
        m8653q();
    }

    public final void finalize() {
        try {
            this.f7161d.mo10191a();
            if (this.f7163f != null) {
                zzbdi zzbdi = this.f7163f;
                Executor executor = abl.f1313a;
                zzbdi.getClass();
                executor.execute(aco.m1713a(zzbdi));
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo13373o() {
        if (this.f7163f != null) {
            long currentPosition = (long) this.f7163f.getCurrentPosition();
            if (this.f7168k != currentPosition && currentPosition > 0) {
                m8651a("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.f7168k = currentPosition;
            }
        }
    }

    /* renamed from: g */
    public final void mo10125g() {
        if (this.f7164g && m8652p()) {
            this.f7159b.removeView(this.f7172o);
        }
        if (this.f7171n != null) {
            long b = zzbv.zzlm().mo9997b();
            if (this.f7163f.getBitmap(this.f7171n) != null) {
                this.f7173p = true;
            }
            long b2 = zzbv.zzlm().mo9997b() - b;
            if (C1772wz.m8288a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b2);
                sb.append("ms");
                C1772wz.m8287a(sb.toString());
            }
            if (b2 > this.f7162e) {
                C1772wz.m1630e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f7167j = false;
                this.f7171n = null;
                if (this.f7160c != null) {
                    this.f7160c.mo10153a("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10118a(int i, int i2) {
        if (this.f7167j) {
            int max = Math.max(i / ((Integer) bre.m6321e().mo12778a(C1557p.f6149z)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) bre.m6321e().mo12778a(C1557p.f6149z)).intValue(), 1);
            if (this.f7171n == null || this.f7171n.getWidth() != max || this.f7171n.getHeight() != max2) {
                this.f7171n = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.f7173p = false;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f7161d.mo10192b();
        } else {
            this.f7161d.mo10191a();
            this.f7169l = this.f7168k;
        }
        C1782xi.f6838a.post(new acp(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f7161d.mo10192b();
            z = true;
        } else {
            this.f7161d.mo10191a();
            this.f7169l = this.f7168k;
            z = false;
        }
        C1782xi.f6838a.post(new acs(this, z));
    }

    /* renamed from: p */
    private final boolean m8652p() {
        return this.f7172o.getParent() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8651a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f7158a.mo10443a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: q */
    private final void m8653q() {
        if (this.f7158a.mo10174d() != null && this.f7165h && !this.f7166i) {
            this.f7158a.mo10174d().getWindow().clearFlags(128);
            this.f7165h = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo13360a(boolean z) {
        m8651a("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
