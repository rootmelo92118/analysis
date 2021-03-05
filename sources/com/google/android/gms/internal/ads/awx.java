package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class awx extends aww {
    /* renamed from: a */
    public static awx m4364a(String str, Context context, boolean z) {
        m4356a(context, z);
        return new awx(context, str, z);
    }

    private awx(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<Callable<Void>> mo11349a(axq axq, Context context, akd akd, ahf ahf) {
        if (axq.mo11376c() == null || !this.f3003r) {
            return super.mo11349a(axq, context, akd, ahf);
        }
        int n = axq.mo11387n();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo11349a(axq, context, akd, ahf));
        arrayList.add(new ayk(axq, "DPtJycwRqj/e0TdTHULzeUhZhWJ1IU3iwhH90sUbn4eYKEdB5HI7UC0PtJgg2RSN", "Ye7G7hL63+8nOBoyCAHdjfK62rvCOKz3+aC1KA/K9CI=", akd, n, 24));
        return arrayList;
    }
}
