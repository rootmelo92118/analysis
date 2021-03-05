package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1950cp;
import com.google.android.gms.internal.measurement.C1951cq;

/* renamed from: com.google.android.gms.internal.measurement.cq */
public abstract class C1951cq<MessageType extends C1950cp<MessageType, BuilderType>, BuilderType extends C1951cq<MessageType, BuilderType>> implements C2044fr {
    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo13570a(MessageType messagetype);

    /* renamed from: a */
    public final /* synthetic */ C2044fr mo13571a(C2043fq fqVar) {
        if (mo13821l().getClass().isInstance(fqVar)) {
            return mo13570a((C1950cp) fqVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
