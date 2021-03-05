package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

public final class bkr {
    /* renamed from: a */
    public static boolean m5831a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* renamed from: b */
    public static boolean m5832b(XmlPullParser xmlPullParser, String str) {
        return m5830a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: a */
    public static boolean m5830a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }
}
