package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class asu extends ata {

    /* renamed from: a */
    private final /* synthetic */ asr f2452a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private asu(asr asr) {
        super(asr, (ass) null);
        this.f2452a = asr;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new ast(this.f2452a, (ass) null);
    }

    /* synthetic */ asu(asr asr, ass ass) {
        this(asr);
    }
}
