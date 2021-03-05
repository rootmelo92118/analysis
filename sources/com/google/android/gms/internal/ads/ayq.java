package com.google.android.gms.internal.ads;

import java.util.List;

public final class ayq extends aza {

    /* renamed from: d */
    private List<Long> f3129d = null;

    public ayq(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        this.f3148b.f1941p = -1L;
        this.f3148b.f1942q = -1L;
        if (this.f3129d == null) {
            this.f3129d = (List) this.f3149c.invoke((Object) null, new Object[]{this.f3147a.mo11370a()});
        }
        if (this.f3129d != null && this.f3129d.size() == 2) {
            synchronized (this.f3148b) {
                this.f3148b.f1941p = Long.valueOf(this.f3129d.get(0).longValue());
                this.f3148b.f1942q = Long.valueOf(this.f3129d.get(1).longValue());
            }
        }
    }
}
