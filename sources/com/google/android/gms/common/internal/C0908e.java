package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p034v4.util.SimpleArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0973i;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C0908e {
    @GuardedBy("sCache")

    /* renamed from: a */
    private static final SimpleArrayMap<String, String> f1100a = new SimpleArrayMap<>();

    @Nullable
    /* renamed from: a */
    public static String m1264a(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 20) {
            switch (i) {
                case 1:
                    return resources.getString(R.string.common_google_play_services_install_title);
                case 2:
                    return resources.getString(R.string.common_google_play_services_update_title);
                case 3:
                    return resources.getString(R.string.common_google_play_services_enable_title);
                case 4:
                case 6:
                    break;
                case 5:
                    Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                    return m1265a(context, "common_google_play_services_invalid_account_title");
                case 7:
                    Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                    return m1265a(context, "common_google_play_services_network_error_title");
                case 8:
                    Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                    return null;
                case 9:
                    Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                    return null;
                case 10:
                    Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                    return null;
                case 11:
                    Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                    return null;
                default:
                    switch (i) {
                        case 16:
                            Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                            return null;
                        case 17:
                            Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                            return m1265a(context, "common_google_play_services_sign_in_failed_title");
                        case 18:
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(33);
                            sb.append("Unexpected error code ");
                            sb.append(i);
                            Log.e("GoogleApiAvailability", sb.toString());
                            return null;
                    }
            }
            return null;
        }
        Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
        return m1265a(context, "common_google_play_services_restricted_profile_title");
    }

    @NonNull
    /* renamed from: b */
    public static String m1268b(Context context, int i) {
        String str;
        if (i == 6) {
            str = m1265a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m1264a(context, i);
        }
        return str == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : str;
    }

    @NonNull
    /* renamed from: c */
    public static String m1269c(Context context, int i) {
        Resources resources = context.getResources();
        String a = m1263a(context);
        if (i == 5) {
            return m1266a(context, "common_google_play_services_invalid_account_text", a);
        }
        if (i == 7) {
            return m1266a(context, "common_google_play_services_network_error_text", a);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{a});
        } else if (i == 20) {
            return m1266a(context, "common_google_play_services_restricted_profile_text", a);
        } else {
            switch (i) {
                case 1:
                    return resources.getString(R.string.common_google_play_services_install_text, new Object[]{a});
                case 2:
                    if (C0973i.m1488b(context)) {
                        return resources.getString(R.string.common_google_play_services_wear_update_text);
                    }
                    return resources.getString(R.string.common_google_play_services_update_text, new Object[]{a});
                case 3:
                    return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{a});
                default:
                    switch (i) {
                        case 16:
                            return m1266a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m1266a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, new Object[]{a});
                    }
            }
        }
    }

    @NonNull
    /* renamed from: d */
    public static String m1270d(Context context, int i) {
        if (i == 6) {
            return m1266a(context, "common_google_play_services_resolution_required_text", m1263a(context));
        }
        return m1269c(context, i);
    }

    @NonNull
    /* renamed from: e */
    public static String m1271e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_button);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_button);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_button);
            default:
                return resources.getString(17039370);
        }
    }

    /* renamed from: a */
    public static String m1263a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C0771c.m904a(context).mo9541b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    private static String m1266a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m1265a(context, str);
        if (a == null) {
            a = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    @Nullable
    /* renamed from: a */
    private static String m1265a(Context context, String str) {
        synchronized (f1100a) {
            String str2 = f1100a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            f1100a.put(str, string);
            return string;
        }
    }

    /* renamed from: b */
    public static String m1267b(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }
}
