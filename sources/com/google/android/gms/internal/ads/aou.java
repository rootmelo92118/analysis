package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aot;
import com.google.android.gms.internal.ads.aou;

public abstract class aou<MessageType extends aot<MessageType, BuilderType>, BuilderType extends aou<MessageType, BuilderType>> implements arx {
    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo10758a(MessageType messagetype);

    /* renamed from: a */
    public final /* synthetic */ arx mo10759a(arw arw) {
        if (mo11023q().getClass().isInstance(arw)) {
            return mo10758a((aot) arw);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
