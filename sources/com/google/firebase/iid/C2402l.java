package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.l */
final class C2402l {

    /* renamed from: a */
    private final Messenger f8898a;

    /* renamed from: b */
    private final zzl f8899b;

    C2402l(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f8898a = new Messenger(iBinder);
            this.f8899b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f8899b = new zzl(iBinder);
            this.f8898a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15025a(Message message) {
        if (this.f8898a != null) {
            this.f8898a.send(message);
        } else if (this.f8899b != null) {
            this.f8899b.mo15052a(message);
        } else {
            throw new IllegalStateException("Both messengers are null");
        }
    }
}
