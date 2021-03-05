package com.google.android.gms.internal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.p041a.C0771c;
import javax.annotation.Nonnull;

@C1598qn
public final class zzze extends ContentProvider {
    public final int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Nullable
    public final String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    public final Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    @Nullable
    public final Cursor query(@Nonnull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        String str;
        Bundle a = m8834a(context);
        Boolean bool = null;
        if (a != null) {
            try {
                str = (String) a.get("com.google.android.gms.ads.APPLICATION_ID");
            } catch (ClassCastException unused) {
                aai.m1626c("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value");
                str = null;
            }
            try {
                bool = (Boolean) a.get("com.google.android.gms.ads.AD_MANAGER_APP");
            } catch (ClassCastException unused2) {
                aai.m1626c("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value");
            }
        } else {
            str = null;
        }
        if ((bool == null || !bool.booleanValue()) && str == null) {
            throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here: https://goo.gl/fQ2neu to add a valid  *\n* App ID inside the AndroidManifest. Google Ad Manager publishers should     *\n* follow instructions here: https://goo.gl/h17b6x.                           *\n******************************************************************************\n\n");
        }
        if (str != null) {
            if (str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                String valueOf = String.valueOf(str);
                aai.m1624b(valueOf.length() != 0 ? "Publisher provided Google AdMob App ID in manifest: ".concat(valueOf) : new String("Publisher provided Google AdMob App ID in manifest: "));
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", false);
                C1415jt.m7109a(context, str, bundle);
            } else {
                throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here: https://goo.gl/fQ2neu to *\n* find your app ID.                                                          *\n******************************************************************************\n\n");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Nullable
    /* renamed from: a */
    private static Bundle m8834a(Context context) {
        try {
            return C0771c.m904a(context).mo9535a(context.getPackageName(), 128).metaData;
        } catch (NullPointerException e) {
            aai.m1625b("Failed to load metadata: Null pointer exception", e);
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            aai.m1625b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }
}
