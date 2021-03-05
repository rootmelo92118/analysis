package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class ass extends asr<FieldDescriptorType, Object> {
    ass(int i) {
        super(i, (ass) null);
    }

    /* renamed from: a */
    public final void mo11122a() {
        if (!mo11124b()) {
            for (int i = 0; i < mo11125c(); i++) {
                Map.Entry b = mo11123b(i);
                if (((aqf) b.getKey()).mo11006d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Map.Entry entry : mo11128d()) {
                if (((aqf) entry.getKey()).mo11006d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo11122a();
    }
}
