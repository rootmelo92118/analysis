package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.gz */
public final class C1340gz extends C1353hl<C1392ix> implements C1349hh, C1355hn {

    /* renamed from: a */
    private final zzbig f5425a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1356ho f5426b;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.gz, com.google.android.gms.internal.ads.hk, com.google.android.gms.internal.ads.hl, java.lang.Object] */
    public C1340gz(Context context, zzbbi zzbbi) {
        try {
            this.f5425a = new zzbig(context, new C1348hg(this));
            this.f5425a.setWillNotDraw(true);
            this.f5425a.addJavascriptInterface(new C1347hf(this), "GoogleJsInterface");
            zzbv.zzlf().mo13201a(context, zzbbi.f7135a, this.f5425a.getSettings());
            super.mo12598a(this);
        } catch (Throwable th) {
            throw new afv("Init failed.", th);
        }
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
    public final void mo12584a(String str) {
        mo12585b(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    /* renamed from: b */
    public final void mo12585b(String str) {
        abl.f1313a.execute(new C1342ha(this, str));
    }

    /* renamed from: c */
    public final void mo12588c(String str) {
        abl.f1313a.execute(new C1343hb(this, str));
    }

    /* renamed from: a */
    public final void mo12583a(C1356ho hoVar) {
        this.f5426b = hoVar;
    }

    /* renamed from: a */
    public final void mo12582a() {
        this.f5425a.destroy();
    }

    /* renamed from: b */
    public final boolean mo12586b() {
        return this.f5425a.mo13392A();
    }

    /* renamed from: c */
    public final C1393iy mo12587c() {
        return new C1394iz(this);
    }

    /* renamed from: d */
    public final void mo10449d(String str) {
        abl.f1313a.execute(new C1344hc(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo12589e(String str) {
        this.f5425a.mo10449d(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo12590f(String str) {
        this.f5425a.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo12591g(String str) {
        this.f5425a.loadData(str, "text/html", "UTF-8");
    }
}
