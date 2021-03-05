package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gl */
final class C2065gl extends C2064gk<FieldDescriptorType, Object> {
    C2065gl(int i) {
        super(i, (C2065gl) null);
    }

    /* renamed from: a */
    public final void mo13943a() {
        if (!mo13945b()) {
            for (int i = 0; i < mo13946c(); i++) {
                Map.Entry b = mo13944b(i);
                if (((C1996eb) b.getKey()).mo13803d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Map.Entry entry : mo13949d()) {
                if (((C1996eb) entry.getKey()).mo13803d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo13943a();
    }
}
