package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class zzl implements Parcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C2378am();

    /* renamed from: a */
    private Messenger f8943a;

    /* renamed from: b */
    private C2387av f8944b;

    /* renamed from: com.google.firebase.iid.zzl$a */
    public static final class C2417a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.m11614f()) {
                return zzl.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f8943a = new Messenger(iBinder);
        } else {
            this.f8944b = new C2388aw(iBinder);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final void mo15052a(Message message) {
        if (this.f8943a != null) {
            this.f8943a.send(message);
        } else {
            this.f8944b.mo15005a(message);
        }
    }

    /* renamed from: a */
    private final IBinder m11784a() {
        return this.f8943a != null ? this.f8943a.getBinder() : this.f8944b.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m11784a().equals(((zzl) obj).m11784a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m11784a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f8943a != null) {
            parcel.writeStrongBinder(this.f8943a.getBinder());
        } else {
            parcel.writeStrongBinder(this.f8944b.asBinder());
        }
    }
}
