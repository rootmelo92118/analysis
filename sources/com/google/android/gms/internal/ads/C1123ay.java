package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p034v4.util.SimpleArrayMap;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ay */
public final class C1123ay extends C1234db implements C1135bi {

    /* renamed from: a */
    private final C1068ap f3100a;

    /* renamed from: b */
    private final String f3101b;

    /* renamed from: c */
    private final SimpleArrayMap<String, C1085at> f3102c;

    /* renamed from: d */
    private final SimpleArrayMap<String, String> f3103d;
    @Nullable

    /* renamed from: e */
    private btb f3104e;
    @Nullable

    /* renamed from: f */
    private View f3105f;

    /* renamed from: g */
    private final Object f3106g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1133bg f3107h;

    public C1123ay(String str, SimpleArrayMap<String, C1085at> simpleArrayMap, SimpleArrayMap<String, String> simpleArrayMap2, C1068ap apVar, btb btb, View view) {
        this.f3101b = str;
        this.f3102c = simpleArrayMap;
        this.f3103d = simpleArrayMap2;
        this.f3100a = apVar;
        this.f3104e = btb;
        this.f3105f = view;
    }

    /* renamed from: a */
    public final String mo11090a() {
        return "3";
    }

    /* renamed from: a */
    public final String mo11406a(String str) {
        return this.f3103d.get(str);
    }

    /* renamed from: b */
    public final C1210ce mo11408b(String str) {
        return this.f3102c.get(str);
    }

    /* renamed from: e */
    public final List<String> mo11410e() {
        String[] strArr = new String[(this.f3102c.size() + this.f3103d.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f3102c.size()) {
            strArr[i3] = this.f3102c.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < this.f3103d.size()) {
            strArr[i3] = this.f3103d.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: b */
    public final String mo11093b() {
        return this.f3101b;
    }

    /* renamed from: a */
    public final void mo11092a(C1133bg bgVar) {
        synchronized (this.f3106g) {
            this.f3107h = bgVar;
        }
    }

    /* renamed from: f */
    public final C0719a mo11411f() {
        return C0722b.m769a(this.f3107h);
    }

    /* renamed from: c */
    public final C1068ap mo11094c() {
        return this.f3100a;
    }

    /* renamed from: g */
    public final btb mo11412g() {
        return this.f3104e;
    }

    /* renamed from: a */
    public final boolean mo11407a(C0719a aVar) {
        if (this.f3107h == null) {
            aai.m1626c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f3105f == null) {
            return false;
        } else {
            C1124az azVar = new C1124az(this);
            this.f3107h.mo11878a((View) (FrameLayout) C0722b.m770a(aVar), (C1130be) azVar);
            return true;
        }
    }

    /* renamed from: d */
    public final View mo11095d() {
        return this.f3105f;
    }

    /* renamed from: c */
    public final void mo11409c(String str) {
        synchronized (this.f3106g) {
            if (this.f3107h == null) {
                aai.m1626c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f3107h.mo11879a((View) null, str, (Bundle) null, (Map<String, WeakReference<View>>) null, (View) null, false);
            }
        }
    }

    /* renamed from: h */
    public final void mo11413h() {
        synchronized (this.f3106g) {
            if (this.f3107h == null) {
                aai.m1626c("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.f3107h.mo11783a((View) null, (Map<String, WeakReference<View>>) null);
            }
        }
    }

    /* renamed from: i */
    public final C0719a mo11414i() {
        return C0722b.m769a(this.f3107h.mo11887p().getApplicationContext());
    }

    /* renamed from: j */
    public final void mo11415j() {
        C1782xi.f6838a.post(new C1126ba(this));
        this.f3104e = null;
        this.f3105f = null;
    }
}
