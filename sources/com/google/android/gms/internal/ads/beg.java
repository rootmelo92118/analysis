package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

@TargetApi(16)
public final class beg {

    /* renamed from: a */
    public final String f3930a;

    /* renamed from: b */
    public final boolean f3931b;

    /* renamed from: c */
    public final boolean f3932c;

    /* renamed from: d */
    public final boolean f3933d;

    /* renamed from: e */
    private final String f3934e;

    /* renamed from: f */
    private final MediaCodecInfo.CodecCapabilities f3935f;

    /* renamed from: a */
    public static beg m5095a(String str) {
        return new beg(str, (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    /* renamed from: a */
    public static beg m5096a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new beg(str, str2, codecCapabilities, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        if ((com.google.android.gms.internal.ads.bkp.f4570a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private beg(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.android.gms.internal.ads.bjy.m5688a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f3930a = r2
            r1.f3934e = r3
            r1.f3935f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            int r5 = com.google.android.gms.internal.ads.bkp.f4570a
            r0 = 19
            if (r5 < r0) goto L_0x0025
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r5 == 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r1.f3931b = r5
            r5 = 21
            if (r4 == 0) goto L_0x0044
            int r0 = com.google.android.gms.internal.ads.bkp.f4570a
            if (r0 < r5) goto L_0x003f
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r1.f3932c = r0
            if (r6 != 0) goto L_0x005e
            if (r4 == 0) goto L_0x005d
            int r6 = com.google.android.gms.internal.ads.bkp.f4570a
            if (r6 < r5) goto L_0x0059
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x0059
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r4 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            r1.f3933d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.beg.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    /* renamed from: a */
    public final MediaCodecInfo.CodecProfileLevel[] mo11737a() {
        if (this.f3935f == null || this.f3935f.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.f3935f.profileLevels;
    }

    /* renamed from: b */
    public final boolean mo11739b(String str) {
        String d;
        if (str == null || this.f3934e == null || (d = bkd.m5756d(str)) == null) {
            return true;
        }
        if (!this.f3934e.equals(d)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(d).length());
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(", ");
            sb.append(d);
            m5098c(sb.toString());
            return false;
        }
        Pair<Integer, Integer> a = bem.m5138a(str);
        if (a == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo11737a()) {
            if (codecProfileLevel.profile == ((Integer) a.first).intValue() && codecProfileLevel.level >= ((Integer) a.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(d).length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(d);
        m5098c(sb2.toString());
        return false;
    }

    @TargetApi(21)
    /* renamed from: a */
    public final boolean mo11736a(int i, int i2, double d) {
        if (this.f3935f == null) {
            m5098c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f3935f.getVideoCapabilities();
        if (videoCapabilities == null) {
            m5098c("sizeAndRate.vCaps");
            return false;
        } else if (m5097a(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m5097a(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                m5098c(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(d);
            String sb3 = sb2.toString();
            String str = this.f3930a;
            String str2 = this.f3934e;
            String str3 = bkp.f4574e;
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb4.append("AssumedSupport [");
            sb4.append(sb3);
            sb4.append("] [");
            sb4.append(str);
            sb4.append(", ");
            sb4.append(str2);
            sb4.append("] [");
            sb4.append(str3);
            sb4.append("]");
            Log.d("MediaCodecInfo", sb4.toString());
            return true;
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public final Point mo11734a(int i, int i2) {
        if (this.f3935f == null) {
            m5098c("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f3935f.getVideoCapabilities();
        if (videoCapabilities == null) {
            m5098c("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(bkp.m5809a(i, widthAlignment) * widthAlignment, bkp.m5809a(i2, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    /* renamed from: a */
    public final boolean mo11735a(int i) {
        if (this.f3935f == null) {
            m5098c("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f3935f.getAudioCapabilities();
        if (audioCapabilities == null) {
            m5098c("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("sampleRate.support, ");
            sb.append(i);
            m5098c(sb.toString());
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    public final boolean mo11738b(int i) {
        if (this.f3935f == null) {
            m5098c("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f3935f.getAudioCapabilities();
        if (audioCapabilities == null) {
            m5098c("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("channelCount.support, ");
            sb.append(i);
            m5098c(sb.toString());
            return false;
        }
    }

    /* renamed from: c */
    private final void m5098c(String str) {
        String str2 = this.f3930a;
        String str3 = this.f3934e;
        String str4 = bkp.f4574e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    /* renamed from: a */
    private static boolean m5097a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
