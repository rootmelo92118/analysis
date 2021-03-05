package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.s */
public class C0929s {

    /* renamed from: a */
    private final Resources f1117a;

    /* renamed from: b */
    private final String f1118b = this.f1117a.getResourcePackageName(R.string.common_google_play_services_unknown_issue);

    public C0929s(Context context) {
        C0926p.m1306a(context);
        this.f1117a = context.getResources();
    }

    @Nullable
    /* renamed from: a */
    public String mo9915a(String str) {
        int identifier = this.f1117a.getIdentifier(str, "string", this.f1118b);
        if (identifier == 0) {
            return null;
        }
        return this.f1117a.getString(identifier);
    }
}
