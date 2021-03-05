package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.p034v4.app.FragmentActivity;
import android.support.p034v4.app.NotificationCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.base.R;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C0821e;
import com.google.android.gms.common.api.internal.C0836s;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.C0908e;
import com.google.android.gms.common.internal.C0909f;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0973i;
import com.google.android.gms.common.util.C0979o;
import com.google.android.gms.internal.base.C1864e;

/* renamed from: com.google.android.gms.common.c */
public class C0849c extends C0851d {

    /* renamed from: a */
    public static final int f941a = C0851d.f948b;

    /* renamed from: c */
    private static final Object f942c = new Object();

    /* renamed from: d */
    private static final C0849c f943d = new C0849c();
    @GuardedBy("mLock")

    /* renamed from: e */
    private String f944e;

    /* renamed from: a */
    public static C0849c m1108a() {
        return f943d;
    }

    C0849c() {
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.c$a */
    private class C0850a extends C1864e {

        /* renamed from: a */
        private final Context f945a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0850a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f945a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int a = C0849c.this.mo9712a(this.f945a);
            if (C0849c.this.mo9719a(a)) {
                C0849c.this.mo9718a(this.f945a, a);
            }
        }
    }

    /* renamed from: a */
    public Dialog mo9713a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m1107a((Context) activity, i, C0909f.m1272a(activity, mo9716a((Context) activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: a */
    public final boolean mo9720a(Activity activity, @NonNull C0821e eVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = m1107a((Context) activity, i, C0909f.m1274a(eVar, mo9716a((Context) activity, i, "d"), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        m1109a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: b */
    public boolean mo9725b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = mo9713a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m1109a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: a */
    public void mo9718a(Context context, int i) {
        m1110a(context, i, (String) null, mo9727a(context, i, 0, "n"));
    }

    /* renamed from: a */
    public final boolean mo9721a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = mo9715a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m1110a(context, connectionResult.mo9510c(), (String) null, GoogleApiActivity.m906a(context, a, i));
        return true;
    }

    /* renamed from: a */
    public static Dialog m1106a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C0908e.m1269c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m1109a(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @Nullable
    /* renamed from: a */
    public final zabq mo9717a(Context context, C0836s sVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabq zabq = new zabq(sVar);
        context.registerReceiver(zabq, intentFilter);
        zabq.mo9701a(context);
        if (mo9728a(context, "com.google.android.gms")) {
            return zabq;
        }
        sVar.mo9644a();
        zabq.mo9700a();
        return null;
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: c */
    private final String m1111c() {
        String str;
        synchronized (f942c) {
            str = this.f944e;
        }
        return str;
    }

    /* renamed from: a */
    public int mo9712a(Context context) {
        return super.mo9712a(context);
    }

    /* renamed from: b */
    public int mo9722b(Context context, int i) {
        return super.mo9722b(context, i);
    }

    /* renamed from: a */
    public final boolean mo9719a(int i) {
        return super.mo9719a(i);
    }

    @Nullable
    /* renamed from: a */
    public Intent mo9716a(Context context, int i, @Nullable String str) {
        return super.mo9716a(context, i, str);
    }

    @Nullable
    /* renamed from: a */
    public PendingIntent mo9714a(Context context, int i, int i2) {
        return super.mo9714a(context, i, i2);
    }

    @Nullable
    /* renamed from: a */
    public PendingIntent mo9715a(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo9508a()) {
            return connectionResult.mo9511d();
        }
        return mo9714a(context, connectionResult.mo9510c(), 0);
    }

    /* renamed from: b */
    public final String mo9723b(int i) {
        return super.mo9723b(i);
    }

    /* renamed from: a */
    static Dialog m1107a(Context context, int i, C0909f fVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C0908e.m1269c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = C0908e.m1271e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, fVar);
        }
        String a = C0908e.m1264a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    /* renamed from: a */
    static void m1109a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            SupportErrorDialogFragment.m892a(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        C0848b.m1105a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m1110a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo9724b(context);
        } else if (pendingIntent != null) {
            String b = C0908e.m1268b(context, i);
            String d = C0908e.m1270d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(b).setStyle(new NotificationCompat.BigTextStyle().bigText(d));
            if (C0973i.m1487a(context)) {
                C0926p.m1312a(C0979o.m1506g());
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (C0973i.m1488b(context)) {
                    style.addAction(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(d);
            }
            if (C0979o.m1510k()) {
                C0926p.m1312a(C0979o.m1510k());
                String c = m1111c();
                if (c == null) {
                    c = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(c);
                    String b2 = C0908e.m1267b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(c, b2, 4));
                    } else if (!b2.equals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                style.setChannelId(c);
            }
            Notification build = style.build();
            switch (i) {
                case 1:
                case 2:
                case 3:
                    i2 = 10436;
                    C0858g.sCanceledAvailabilityNotification.set(false);
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            notificationManager.notify(i2, build);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9724b(Context context) {
        new C0850a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
