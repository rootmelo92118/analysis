package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.o */
final class C2405o extends C2403m<Bundle> {
    C2405o(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo15029a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15026a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo15028a(bundle2);
    }
}
