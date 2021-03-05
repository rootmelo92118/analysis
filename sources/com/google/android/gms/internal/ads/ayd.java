package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

public final class ayd extends aza {
    public ayd(axq axq, String str, String str2, akd akd, int i, int i2) {
        super(axq, str, str2, akd, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        this.f3148b.f1886F = 2;
        try {
            boolean booleanValue = ((Boolean) this.f3149c.invoke((Object) null, new Object[]{this.f3147a.mo11370a()})).booleanValue();
            this.f3148b.f1886F = Integer.valueOf(booleanValue ? 1 : 0);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
