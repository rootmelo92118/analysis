package android.support.customtabs;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.p034v4.app.BundleCompat;
import android.util.Log;

public class CustomTabsSessionToken {
    private static final String TAG = "CustomTabsSessionToken";
    private final CustomTabsCallback mCallback = new CustomTabsCallback() {
        public void onNavigationEvent(int i, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.mCallbackBinder.onNavigationEvent(i, bundle);
            } catch (RemoteException unused) {
                Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public void extraCallback(String str, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.mCallbackBinder.extraCallback(str, bundle);
            } catch (RemoteException unused) {
                Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public void onMessageChannelReady(Bundle bundle) {
            try {
                CustomTabsSessionToken.this.mCallbackBinder.onMessageChannelReady(bundle);
            } catch (RemoteException unused) {
                Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public void onPostMessage(String str, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.mCallbackBinder.onPostMessage(str, bundle);
            } catch (RemoteException unused) {
                Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
            }
        }
    };
    /* access modifiers changed from: private */
    public final ICustomTabsCallback mCallbackBinder;

    public static CustomTabsSessionToken getSessionTokenFromIntent(Intent intent) {
        IBinder binder = BundleCompat.getBinder(intent.getExtras(), CustomTabsIntent.EXTRA_SESSION);
        if (binder == null) {
            return null;
        }
        return new CustomTabsSessionToken(ICustomTabsCallback.Stub.asInterface(binder));
    }

    CustomTabsSessionToken(ICustomTabsCallback iCustomTabsCallback) {
        this.mCallbackBinder = iCustomTabsCallback;
    }

    /* access modifiers changed from: package-private */
    public IBinder getCallbackBinder() {
        return this.mCallbackBinder.asBinder();
    }

    public int hashCode() {
        return getCallbackBinder().hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        return ((CustomTabsSessionToken) obj).getCallbackBinder().equals(this.mCallbackBinder.asBinder());
    }

    public CustomTabsCallback getCallback() {
        return this.mCallback;
    }

    public boolean isAssociatedWith(CustomTabsSession customTabsSession) {
        return customTabsSession.getBinder().equals(this.mCallbackBinder);
    }
}
