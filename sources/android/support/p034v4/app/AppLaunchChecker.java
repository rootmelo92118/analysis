package android.support.p034v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.p034v4.content.IntentCompat;
import android.support.p034v4.content.SharedPreferencesCompat;

/* renamed from: android.support.v4.app.AppLaunchChecker */
public class AppLaunchChecker {
    private static final String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
    private static final String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";

    public static boolean hasStartedFromLauncher(Context context) {
        return context.getSharedPreferences(SHARED_PREFS_NAME, 0).getBoolean(KEY_STARTED_FROM_LAUNCHER, false);
    }

    public static void onActivityCreate(Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(SHARED_PREFS_NAME, 0);
        if (sharedPreferences.getBoolean(KEY_STARTED_FROM_LAUNCHER, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(IntentCompat.CATEGORY_LEANBACK_LAUNCHER)) {
            SharedPreferencesCompat.EditorCompat.getInstance().apply(sharedPreferences.edit().putBoolean(KEY_STARTED_FROM_LAUNCHER, true));
        }
    }
}
