package com.google.android.gms.p039a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p044b.C1854a;
import com.google.android.gms.internal.p044b.C1855b;

/* renamed from: com.google.android.gms.a.a */
public interface C0719a extends IInterface {

    /* renamed from: com.google.android.gms.a.a$a */
    public static abstract class C0720a extends C1855b implements C0719a {

        /* renamed from: com.google.android.gms.a.a$a$a */
        public static class C0721a extends C1854a implements C0719a {
            C0721a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C0720a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C0719a m768a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C0719a) {
                return (C0719a) queryLocalInterface;
            }
            return new C0721a(iBinder);
        }
    }
}
