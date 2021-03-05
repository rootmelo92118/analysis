package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.C0980p;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.hp */
public final class C1357hp implements C1349hh, C1355hn {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final afl f5441a;

    /* renamed from: b */
    private final Context f5442b;

    public C1357hp(Context context, zzbbi zzbbi, @Nullable awy awy, zzv zzv) {
        this.f5442b = context;
        zzbv.zzlg();
        this.f5441a = afr.m2018a(context, agy.m2168a(), "", false, false, awy, zzbbi, (C1019ad) null, (zzbo) null, (zzv) null, box.m6117a());
        this.f5441a.getView().setWillNotDraw(true);
    }

    /* renamed from: a */
    public final void mo10524a(String str, String str2) {
        C1350hi.m6990a((C1349hh) this, str, str2);
    }

    /* renamed from: a */
    public final void mo10443a(String str, Map map) {
        C1350hi.m6991a((C1349hh) this, str, map);
    }

    /* renamed from: a */
    public final void mo10444a(String str, JSONObject jSONObject) {
        C1350hi.m6993b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo10448b(String str, JSONObject jSONObject) {
        C1350hi.m6992a((C1349hh) this, str, jSONObject);
    }

    /* renamed from: a */
    private static void m7012a(Runnable runnable) {
        bre.m6317a();
        if (C1851zx.m8595b()) {
            runnable.run();
        } else {
            C1782xi.f6838a.post(runnable);
        }
    }

    /* renamed from: d */
    public final void mo10449d(String str) {
        m7012a((Runnable) new C1358hq(this, str));
    }

    /* renamed from: a */
    public final void mo12584a(String str) {
        m7012a((Runnable) new C1361ht(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: b */
    public final void mo12585b(String str) {
        m7012a((Runnable) new C1362hu(this, str));
    }

    /* renamed from: c */
    public final void mo12588c(String str) {
        m7012a((Runnable) new C1363hv(this, str));
    }

    /* renamed from: a */
    public final void mo12606a(String str, zzu<? super C1392ix> zzu) {
        this.f5441a.mo10347a(str, (zzu<? super afl>) new C1364hw(this, zzu));
    }

    /* renamed from: b */
    public final void mo12607b(String str, zzu<? super C1392ix> zzu) {
        this.f5441a.mo10348a(str, (C0980p<zzu<? super afl>>) new C1359hr(zzu));
    }

    /* renamed from: a */
    public final void mo12583a(C1356ho hoVar) {
        ags u = this.f5441a.mo10388u();
        hoVar.getClass();
        u.mo10401a(C1360hs.m7029a(hoVar));
    }

    /* renamed from: c */
    public final C1393iy mo12587c() {
        return new C1394iz(this);
    }

    /* renamed from: a */
    public final void mo12582a() {
        this.f5441a.destroy();
    }

    /* renamed from: b */
    public final boolean mo12586b() {
        return this.f5441a.mo10331A();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo12608e(String str) {
        this.f5441a.mo10449d(str);
    }
}
