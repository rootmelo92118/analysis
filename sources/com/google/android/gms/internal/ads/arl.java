package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

final class arl implements asp {

    /* renamed from: b */
    private static final arv f2387b = new arm();

    /* renamed from: a */
    private final arv f2388a;

    public arl() {
        this(new arn(aqm.m3448a(), m3559a()));
    }

    private arl(arv arv) {
        this.f2388a = (arv) aqp.m3497a(arv, "messageInfoFactory");
    }

    /* renamed from: a */
    public final <T> aso<T> mo11067a(Class<T> cls) {
        asq.m3779a((Class<?>) cls);
        aru b = this.f2388a.mo11015b(cls);
        if (b.mo11088b()) {
            if (aqn.class.isAssignableFrom(cls)) {
                return asc.m3679a(asq.m3791c(), aqc.m3406a(), b.mo11089c());
            }
            return asc.m3679a(asq.m3769a(), aqc.m3407b(), b.mo11089c());
        } else if (aqn.class.isAssignableFrom(cls)) {
            if (m3560a(b)) {
                return asa.m3636a(cls, b, asg.m3694b(), arf.m3536b(), asq.m3791c(), aqc.m3406a(), art.m3592b());
            }
            return asa.m3636a(cls, b, asg.m3694b(), arf.m3536b(), asq.m3791c(), (aqa<?>) null, art.m3592b());
        } else if (m3560a(b)) {
            return asa.m3636a(cls, b, asg.m3693a(), arf.m3535a(), asq.m3769a(), aqc.m3407b(), art.m3591a());
        } else {
            return asa.m3636a(cls, b, asg.m3693a(), arf.m3535a(), asq.m3785b(), (aqa<?>) null, art.m3591a());
        }
    }

    /* renamed from: a */
    private static boolean m3560a(aru aru) {
        return aru.mo11087a() == aqn.C1082e.f2337h;
    }

    /* renamed from: a */
    private static arv m3559a() {
        try {
            return (arv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f2387b;
        }
    }
}
