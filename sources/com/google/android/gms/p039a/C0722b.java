package com.google.android.gms.p039a;

import android.os.IBinder;
import com.google.android.gms.p039a.C0719a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.a.b */
public final class C0722b<T> extends C0719a.C0720a {

    /* renamed from: a */
    private final T f655a;

    private C0722b(T t) {
        this.f655a = t;
    }

    /* renamed from: a */
    public static <T> C0719a m769a(T t) {
        return new C0722b(t);
    }

    /* renamed from: a */
    public static <T> T m770a(C0719a aVar) {
        if (aVar instanceof C0722b) {
            return ((C0722b) aVar).f655a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
