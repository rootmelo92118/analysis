package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class awy {

    /* renamed from: e */
    private static final String[] f3008e = {"/aclk", "/pcs/click"};

    /* renamed from: a */
    private String f3009a = "googleads.g.doubleclick.net";

    /* renamed from: b */
    private String f3010b = "/pagead/ads";

    /* renamed from: c */
    private String f3011c = "ad.doubleclick.net";

    /* renamed from: d */
    private String[] f3012d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: f */
    private awu f3013f;

    public awy(awu awu) {
        this.f3013f = awu;
    }

    /* renamed from: c */
    private final boolean m4367c(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.f3011c);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    public final boolean mo11354a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.f3012d) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
                return false;
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    public final awu mo11352a() {
        return this.f3013f;
    }

    /* renamed from: a */
    public final Uri mo11350a(Uri uri, Context context) {
        return m4366a(uri, context, (String) null, false, (View) null, (Activity) null);
    }

    /* renamed from: a */
    public final void mo11353a(MotionEvent motionEvent) {
        this.f3013f.zza(motionEvent);
    }

    /* renamed from: a */
    public final Uri mo11351a(Uri uri, Context context, View view, Activity activity) {
        try {
            return m4366a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new awz("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: b */
    public final boolean mo11355b(Uri uri) {
        if (mo11354a(uri)) {
            for (String endsWith : f3008e) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final Uri m4366a(Uri uri, Context context, String str, boolean z, View view, Activity activity) {
        String str2;
        try {
            boolean c = m4367c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new awz("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new awz("Query parameter already exists: ms");
            }
            if (z) {
                str2 = this.f3013f.zza(context, str, view, activity);
            } else {
                str2 = this.f3013f.zza(context);
            }
            if (c) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str2 + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str2 + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str2).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str2 + "&" + uri3.substring(i2));
        } catch (UnsupportedOperationException unused) {
            throw new awz("Provided Uri is not in a valid state");
        }
    }
}
