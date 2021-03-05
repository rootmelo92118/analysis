package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.p034v4.app.Fragment;
import com.google.android.gms.common.internal.C0909f;

public final class GooglePlayServicesUtil extends C0858g {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (C0858g.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return C0849c.m1108a().mo9713a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, (Fragment) null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (C0858g.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        C0849c a = C0849c.m1108a();
        if (fragment == null) {
            return a.mo9725b(activity, i, i2, onCancelListener);
        }
        Dialog a2 = C0849c.m1107a((Context) activity, i, C0909f.m1273a(fragment, C0849c.m1108a().mo9716a((Context) activity, i, "d"), i2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        C0849c.m1109a(activity, a2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        C0849c a = C0849c.m1108a();
        if (C0858g.isPlayServicesPossiblyUpdating(context, i) || C0858g.isPlayStorePossiblyUpdating(context, i)) {
            a.mo9724b(context);
        } else {
            a.mo9718a(context, i);
        }
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return C0858g.getErrorString(i);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return C0858g.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return C0858g.isGooglePlayServicesAvailable(context, i);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C0858g.getErrorPendingIntent(i, context, i2);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return C0858g.isUserRecoverableError(i);
    }

    public static Resources getRemoteResource(Context context) {
        return C0858g.getRemoteResource(context);
    }

    public static Context getRemoteContext(Context context) {
        return C0858g.getRemoteContext(context);
    }
}
