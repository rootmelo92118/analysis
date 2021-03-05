package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

final class bhf implements bjw<Long> {
    private bhf() {
    }

    /* renamed from: b */
    private static Long m5469b(Uri uri, InputStream inputStream) {
        String readLine = new BufferedReader(new InputStreamReader(inputStream)).readLine();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return Long.valueOf(simpleDateFormat.parse(readLine).getTime());
        } catch (ParseException e) {
            throw new bad((Throwable) e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo11938a(Uri uri, InputStream inputStream) {
        return m5469b(uri, inputStream);
    }

    /* synthetic */ bhf(bhc bhc) {
        this();
    }
}
