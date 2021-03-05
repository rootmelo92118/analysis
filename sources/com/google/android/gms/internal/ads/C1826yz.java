package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yz */
final class C1826yz extends C1720va {

    /* renamed from: a */
    private final /* synthetic */ byte[] f6920a;

    /* renamed from: b */
    private final /* synthetic */ Map f6921b;

    /* renamed from: c */
    private final /* synthetic */ aab f6922c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1826yz(C1821yu yuVar, int i, String str, btl btl, bsl bsl, byte[] bArr, Map map, aab aab) {
        super(i, str, btl, bsl);
        this.f6920a = bArr;
        this.f6921b = map;
        this.f6922c = aab;
    }

    /* renamed from: a */
    public final byte[] mo12115a() {
        return this.f6920a == null ? super.mo12115a() : this.f6920a;
    }

    /* renamed from: b */
    public final Map<String, String> mo12116b() {
        return this.f6921b == null ? super.mo12116b() : this.f6921b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13049a(String str) {
        this.f6922c.mo10028a(str);
        super.mo12114a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo12114a(Object obj) {
        mo12114a((String) obj);
    }
}
