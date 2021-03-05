package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.wg */
public final class C1753wg {

    /* renamed from: a */
    public final zzasi f6724a;

    /* renamed from: b */
    public final zzasm f6725b;

    /* renamed from: c */
    public final C1420jy f6726c;
    @Nullable

    /* renamed from: d */
    public final zzwf f6727d;

    /* renamed from: e */
    public final int f6728e;

    /* renamed from: f */
    public final long f6729f;

    /* renamed from: g */
    public final long f6730g;
    @Nullable

    /* renamed from: h */
    public final JSONObject f6731h;

    /* renamed from: i */
    public final box f6732i;

    /* renamed from: j */
    public final boolean f6733j;

    public C1753wg(zzasi zzasi, zzasm zzasm, C1420jy jyVar, zzwf zzwf, int i, long j, long j2, JSONObject jSONObject, bpc bpc) {
        this.f6724a = zzasi;
        this.f6725b = zzasm;
        this.f6726c = null;
        this.f6727d = null;
        this.f6728e = i;
        this.f6729f = j;
        this.f6730g = j2;
        this.f6731h = null;
        this.f6732i = new box(bpc);
        this.f6733j = false;
    }

    public C1753wg(zzasi zzasi, zzasm zzasm, C1420jy jyVar, zzwf zzwf, int i, long j, long j2, JSONObject jSONObject, box box, @Nullable Boolean bool) {
        this.f6724a = zzasi;
        this.f6725b = zzasm;
        this.f6726c = jyVar;
        this.f6727d = zzwf;
        this.f6728e = i;
        this.f6729f = j;
        this.f6730g = j2;
        this.f6731h = jSONObject;
        this.f6732i = box;
        if (bool != null) {
            this.f6733j = bool.booleanValue();
        } else {
            this.f6733j = C1843zp.m8565a(zzasi.f7032c.f7283m);
        }
    }
}
