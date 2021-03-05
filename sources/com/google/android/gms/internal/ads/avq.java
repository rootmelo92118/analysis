package com.google.android.gms.internal.ads;

import android.util.Log;

public final class avq extends avv {

    /* renamed from: a */
    private String f2721a;

    public avq(String str) {
        this.f2721a = str;
    }

    /* renamed from: a */
    public final void mo11314a(String str) {
        String str2 = this.f2721a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
