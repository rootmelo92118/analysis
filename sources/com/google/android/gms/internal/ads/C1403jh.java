package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.jh */
public final class C1403jh {

    /* renamed from: a */
    public static final C1401jf<JSONObject> f5519a = new C1405jj();

    /* renamed from: b */
    private static final Charset f5520b = Charset.forName("UTF-8");

    /* renamed from: c */
    private static final C1399jd<InputStream> f5521c = C1404ji.f5522a;

    /* renamed from: a */
    static final /* synthetic */ InputStream m7093a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f5520b));
    }
}
