package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1950cp;
import com.google.android.gms.internal.measurement.C1951cq;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.cp */
public abstract class C1950cp<MessageType extends C1950cp<MessageType, BuilderType>, BuilderType extends C1951cq<MessageType, BuilderType>> implements C2043fq {
    private static boolean zzbtj = false;
    protected int zzbti = 0;

    /* renamed from: d */
    public final C1958cx mo13567d() {
        try {
            C1967df c = C1958cx.m9079c(mo13817h());
            mo13813a(c.mo13617b());
            return c.mo13616a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("ByteString").length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo13568e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13566a(int i) {
        throw new UnsupportedOperationException();
    }
}
