package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

@C1598qn
public class bqt {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final bqk f5127a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bqj f5128b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final btr f5129c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1266ef f5130d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1699ug f5131e;

    /* renamed from: f */
    private final C1725vf f5132f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1518no f5133g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1267eg f5134h;

    public bqt(bqk bqk, bqj bqj, btr btr, C1266ef efVar, C1699ug ugVar, C1725vf vfVar, C1518no noVar, C1267eg egVar) {
        this.f5127a = bqk;
        this.f5128b = bqj;
        this.f5129c = btr;
        this.f5130d = efVar;
        this.f5131e = ugVar;
        this.f5132f = vfVar;
        this.f5133g = noVar;
        this.f5134h = egVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m6273b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        bre.m6317a().mo13301a(context, bre.m6323g().f7135a, "gmob-apps", bundle, true);
    }

    /* renamed from: a */
    public final brr mo12318a(Context context, String str, C1437ko koVar) {
        return (brr) new bqy(this, context, str, koVar).mo12325a(context, false);
    }

    /* renamed from: a */
    public final C1214ci mo12319a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (C1214ci) new bra(this, frameLayout, frameLayout2, context).mo12325a(context, false);
    }

    /* renamed from: a */
    public final C1219cn mo12320a(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (C1219cn) new brb(this, view, hashMap, hashMap2).mo12325a(view.getContext(), false);
    }

    @Nullable
    /* renamed from: a */
    public final C1519np mo12321a(Activity activity) {
        bqv bqv = new bqv(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            aai.m1626c("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (C1519np) bqv.mo12325a(activity, z);
    }
}
