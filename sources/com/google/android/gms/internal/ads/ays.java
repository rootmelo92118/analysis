package com.google.android.gms.internal.ads;

public final class ays extends aza {

    /* renamed from: d */
    private final StackTraceElement[] f3131d;

    public ays(axq axq, String str, String str2, akd akd, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(axq, str, str2, akd, i, 45);
        this.f3131d = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        if (this.f3131d != null) {
            axo axo = new axo((String) this.f3149c.invoke((Object) null, new Object[]{this.f3131d}));
            synchronized (this.f3148b) {
                this.f3148b.f1882B = axo.f3040a;
                if (axo.f3041b.booleanValue()) {
                    this.f3148b.f1890J = Integer.valueOf(axo.f3042c.booleanValue() ^ true ? 1 : 0);
                } else {
                    this.f3148b.f1890J = 2;
                }
            }
        }
    }
}
