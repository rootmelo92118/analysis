package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.p039a.C0722b;
import com.google.android.gms.p039a.C0723c;

/* renamed from: com.google.android.gms.common.internal.q */
public final class C0927q extends C0723c<C0923n> {

    /* renamed from: a */
    private static final C0927q f1115a = new C0927q();

    private C0927q() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m1320a(Context context, int i, int i2) {
        return f1115a.m1321b(context, i, i2);
    }

    /* renamed from: b */
    private final View m1321b(Context context, int i, int i2) {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, (Scope[]) null);
            return (View) C0722b.m770a(((C0923n) mo8406a(context)).mo9789a(C0722b.m769a(context), signInButtonConfig));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new C0723c.C0724a(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final C0923n mo8407b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof C0923n) {
            return (C0923n) queryLocalInterface;
        }
        return new C0870aa(iBinder);
    }
}
