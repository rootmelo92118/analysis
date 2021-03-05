package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.p004a.p006b.C0035q;

public class CrashlyticsInitProvider extends ContentProvider {
    private static final String TAG = "CrashlyticsInitProvider";

    interface EnabledCheckStrategy {
        boolean isCrashlyticsEnabled(Context context);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (shouldInitializeFabric(context, new C0035q(), new ManifestEnabledCheckStrategy())) {
            try {
                C0139c.m384a(context, new Crashlytics());
                C0139c.m394g().mo286c(TAG, "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                C0139c.m394g().mo286c(TAG, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldInitializeFabric(Context context, C0035q qVar, EnabledCheckStrategy enabledCheckStrategy) {
        if (qVar.mo58b(context)) {
            return enabledCheckStrategy.isCrashlyticsEnabled(context);
        }
        return qVar.mo60d(context);
    }
}
