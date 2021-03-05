package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.ads.zzhp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class bhs extends DefaultHandler implements bjw<bhr> {

    /* renamed from: a */
    private static final Pattern f4346a = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: b */
    private static final Pattern f4347b = Pattern.compile("CC([1-4])=.*");

    /* renamed from: c */
    private static final Pattern f4348c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: d */
    private final String f4349d;

    /* renamed from: e */
    private final XmlPullParserFactory f4350e;

    public bhs() {
        this((String) null);
    }

    private bhs(String str) {
        this.f4349d = null;
        try {
            this.f4350e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r75v2, resolved type: com.google.android.gms.internal.ads.big} */
    /* JADX WARNING: type inference failed for: r56v2, types: [com.google.android.gms.internal.ads.bhz] */
    /* JADX WARNING: type inference failed for: r67v4, types: [com.google.android.gms.internal.ads.bia] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0464 A[Catch:{ XmlPullParserException -> 0x0809 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0587 A[Catch:{ XmlPullParserException -> 0x0809 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x058a A[Catch:{ XmlPullParserException -> 0x0809 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x05a8 A[Catch:{ XmlPullParserException -> 0x0809 }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x06cc A[Catch:{ XmlPullParserException -> 0x0809 }, LOOP:2: B:56:0x01e4->B:277:0x06cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0796 A[Catch:{ XmlPullParserException -> 0x0809 }, LOOP:1: B:47:0x0122->B:303:0x0796, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x07d7 A[Catch:{ XmlPullParserException -> 0x0809 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x07e7 A[Catch:{ XmlPullParserException -> 0x0809 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x07ef A[Catch:{ XmlPullParserException -> 0x0809 }, LOOP:0: B:30:0x0092->B:324:0x07ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x07b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x072a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x063c A[EDGE_INSN: B:334:0x063c->B:261:0x063c ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.bhr mo11938a(android.net.Uri r86, java.io.InputStream r87) {
        /*
            r85 = this;
            r1 = r85
            org.xmlpull.v1.XmlPullParserFactory r0 = r1.f4350e     // Catch:{ XmlPullParserException -> 0x0809 }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x0809 }
            r2 = 0
            r3 = r87
            r0.setInput(r3, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            int r3 = r0.next()     // Catch:{ XmlPullParserException -> 0x0809 }
            r4 = 2
            if (r3 != r4) goto L_0x0801
            java.lang.String r3 = "MPD"
            java.lang.String r5 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0809 }
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r3 == 0) goto L_0x0801
            java.lang.String r3 = r86.toString()     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r5 = "availabilityStartTime"
            java.lang.String r5 = r0.getAttributeValue(r2, r5)     // Catch:{ XmlPullParserException -> 0x0809 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 != 0) goto L_0x0034
            r11 = r6
            goto L_0x0039
        L_0x0034:
            long r8 = com.google.android.gms.internal.ads.bkp.m5827e(r5)     // Catch:{ XmlPullParserException -> 0x0809 }
            r11 = r8
        L_0x0039:
            java.lang.String r5 = "mediaPresentationDuration"
            long r8 = m5516a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r5, (long) r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r5 = "minBufferTime"
            long r15 = m5516a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r5, (long) r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r5 = "type"
            java.lang.String r5 = r0.getAttributeValue(r2, r5)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r5 == 0) goto L_0x0058
            java.lang.String r14 = "dynamic"
            boolean r5 = r5.equals(r14)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r5 == 0) goto L_0x0058
            r17 = 1
            goto L_0x005a
        L_0x0058:
            r17 = 0
        L_0x005a:
            if (r17 == 0) goto L_0x0063
            java.lang.String r5 = "minimumUpdatePeriod"
            long r18 = m5516a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r5, (long) r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0065
        L_0x0063:
            r18 = r6
        L_0x0065:
            if (r17 == 0) goto L_0x006e
            java.lang.String r5 = "timeShiftBufferDepth"
            long r20 = m5516a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r5, (long) r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0070
        L_0x006e:
            r20 = r6
        L_0x0070:
            if (r17 == 0) goto L_0x0079
            java.lang.String r5 = "suggestedPresentationDelay"
            long r22 = m5516a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r5, (long) r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x007b
        L_0x0079:
            r22 = r6
        L_0x007b:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r17 == 0) goto L_0x0085
            r24 = r6
            goto L_0x0087
        L_0x0085:
            r24 = 0
        L_0x0087:
            r14 = r3
            r27 = r11
            r10 = r24
            r3 = 0
            r24 = 0
            r12 = r2
            r25 = r12
        L_0x0092:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r4 = "BaseURL"
            boolean r4 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 == 0) goto L_0x00c0
            if (r3 != 0) goto L_0x00b0
            java.lang.String r3 = m5527b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r14)     // Catch:{ XmlPullParserException -> 0x0809 }
            r14 = r3
            r49 = r8
            r45 = r12
            r47 = r15
            r30 = 1
        L_0x00ac:
            r3 = r2
            r15 = r5
            goto L_0x07ad
        L_0x00b0:
            r30 = r3
            r49 = r8
            r43 = r10
            r45 = r12
            r46 = r14
            r47 = r15
            r3 = r2
            r15 = r5
            goto L_0x07a9
        L_0x00c0:
            java.lang.String r4 = "UTCTiming"
            boolean r4 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 == 0) goto L_0x00e0
            java.lang.String r4 = "schemeIdUri"
            java.lang.String r4 = r0.getAttributeValue(r2, r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r12 = "value"
            java.lang.String r12 = r0.getAttributeValue(r2, r12)     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bik r13 = new com.google.android.gms.internal.ads.bik     // Catch:{ XmlPullParserException -> 0x0809 }
            r13.<init>(r4, r12)     // Catch:{ XmlPullParserException -> 0x0809 }
            r30 = r3
            r49 = r8
            r45 = r13
            goto L_0x00f8
        L_0x00e0:
            java.lang.String r4 = "Location"
            boolean r4 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 == 0) goto L_0x00fb
            java.lang.String r4 = r0.nextText()     // Catch:{ XmlPullParserException -> 0x0809 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            r30 = r3
            r25 = r4
            r49 = r8
            r45 = r12
        L_0x00f8:
            r47 = r15
            goto L_0x00ac
        L_0x00fb:
            java.lang.String r4 = "Period"
            boolean r4 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 == 0) goto L_0x00b0
            if (r24 != 0) goto L_0x00b0
            java.lang.String r4 = "id"
            java.lang.String r4 = r0.getAttributeValue(r2, r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r13 = "start"
            r30 = r3
            long r2 = m5516a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r13, (long) r10)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r13 = "duration"
            long r31 = m5516a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r13, (long) r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            r13.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            r6 = r14
            r7 = 0
            r26 = 0
        L_0x0122:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0809 }
            r33 = r7
            java.lang.String r7 = "BaseURL"
            boolean r7 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r7)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r7 == 0) goto L_0x0163
            if (r26 != 0) goto L_0x014d
            java.lang.String r6 = m5527b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            r53 = r2
            r55 = r4
            r52 = r5
            r49 = r8
            r43 = r10
            r45 = r12
            r2 = r13
            r46 = r14
            r47 = r15
            r7 = r33
            r3 = 0
            r26 = 1
            goto L_0x0722
        L_0x014d:
            r53 = r2
            r55 = r4
            r52 = r5
            r34 = r6
            r49 = r8
            r43 = r10
            r45 = r12
            r2 = r13
            r46 = r14
            r47 = r15
        L_0x0160:
            r3 = 0
            goto L_0x071e
        L_0x0163:
            java.lang.String r7 = "AdaptationSet"
            boolean r7 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r7)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r7 == 0) goto L_0x06e1
            java.lang.String r7 = "id"
            r34 = r6
            r6 = -1
            int r36 = m5515a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r7, (int) r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            int r7 = m5514a((org.xmlpull.v1.XmlPullParser) r0)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r6 = "mimeType"
            r42 = r7
            r7 = 0
            java.lang.String r6 = r0.getAttributeValue(r7, r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            r43 = r10
            java.lang.String r10 = "codecs"
            java.lang.String r10 = r0.getAttributeValue(r7, r10)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r7 = "width"
            r11 = -1
            int r7 = m5515a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r7, (int) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            r45 = r12
            java.lang.String r12 = "height"
            int r12 = m5515a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r12, (int) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r11 = m5512a((org.xmlpull.v1.XmlPullParser) r0, (float) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            r46 = r14
            java.lang.String r14 = "audioSamplingRate"
            r47 = r15
            r15 = -1
            int r14 = m5515a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r14, (int) r15)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r15 = "lang"
            r49 = r8
            r8 = 0
            java.lang.String r9 = r0.getAttributeValue(r8, r15)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            r51 = r9
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            r52 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            r53 = r2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            r55 = r4
            r66 = r13
            r67 = r15
            r37 = r33
            r4 = r34
            r15 = r42
            r13 = r51
            r3 = 0
            r16 = 0
            r35 = -1
        L_0x01e4:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0809 }
            r68 = r2
            java.lang.String r2 = "BaseURL"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x0214
            if (r3 != 0) goto L_0x020e
            java.lang.String r2 = m5527b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            r4 = r2
            r84 = r5
            r78 = r6
            r79 = r7
            r80 = r10
            r81 = r11
            r82 = r12
            r83 = r14
            r3 = r67
            r5 = r68
            r69 = 1
            goto L_0x0634
        L_0x020e:
            r69 = r3
            r70 = r4
            goto L_0x02ae
        L_0x0214:
            java.lang.String r2 = "ContentProtection"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x0226
            com.google.android.gms.internal.ads.zzhp$zza r2 = m5526b(r0)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x020e
            r8.add(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x020e
        L_0x0226:
            java.lang.String r2 = "ContentComponent"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x0262
            java.lang.String r2 = "lang"
            r69 = r3
            r3 = 0
            java.lang.String r2 = r0.getAttributeValue(r3, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r13 != 0) goto L_0x023b
            r13 = r2
            goto L_0x0245
        L_0x023b:
            if (r2 != 0) goto L_0x023e
            goto L_0x0245
        L_0x023e:
            boolean r2 = r13.equals(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bjy.m5691b(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x0245:
            int r2 = m5514a((org.xmlpull.v1.XmlPullParser) r0)     // Catch:{ XmlPullParserException -> 0x0809 }
            int r2 = m5513a((int) r15, (int) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            r15 = r2
            r84 = r5
            r78 = r6
            r79 = r7
            r80 = r10
            r81 = r11
            r82 = r12
            r83 = r14
            r3 = r67
            r5 = r68
            goto L_0x0634
        L_0x0262:
            r69 = r3
            java.lang.String r2 = "Role"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x029e
            java.lang.String r2 = "schemeIdUri"
            r3 = 0
            java.lang.String r2 = m5528b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            r70 = r4
            java.lang.String r4 = "value"
            java.lang.String r4 = m5528b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r4, (java.lang.String) r3)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x027b:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r3 = "Role"
            boolean r3 = com.google.android.gms.internal.ads.bkr.m5831a(r0, r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r3 == 0) goto L_0x027b
            java.lang.String r3 = "urn:mpeg:dash:role:2011"
            boolean r2 = r3.equals(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x0298
            java.lang.String r2 = "main"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x0298
            r2 = 1
            goto L_0x0299
        L_0x0298:
            r2 = 0
        L_0x0299:
            r2 = r16 | r2
            r16 = r2
            goto L_0x02ae
        L_0x029e:
            r70 = r4
            java.lang.String r2 = "AudioChannelConfiguration"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x02c2
            int r2 = m5531e(r0)     // Catch:{ XmlPullParserException -> 0x0809 }
            r35 = r2
        L_0x02ae:
            r84 = r5
            r78 = r6
            r79 = r7
            r80 = r10
            r81 = r11
            r82 = r12
            r83 = r14
            r3 = r67
            r5 = r68
            goto L_0x0632
        L_0x02c2:
            java.lang.String r2 = "Accessibility"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "Accessibility"
            com.google.android.gms.internal.ads.bhu r2 = m5517a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            r9.add(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x02ae
        L_0x02d4:
            java.lang.String r2 = "SupplementalProperty"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x02e6
            java.lang.String r2 = "SupplementalProperty"
            com.google.android.gms.internal.ads.bhu r2 = m5517a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            r5.add(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x02ae
        L_0x02e6:
            java.lang.String r2 = "Representation"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x05d2
            java.lang.String r2 = "id"
            r3 = 0
            java.lang.String r56 = r0.getAttributeValue(r3, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r2 = "bandwidth"
            r3 = -1
            int r60 = m5515a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r2, (int) r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r2 = "mimeType"
            java.lang.String r2 = m5528b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r2, (java.lang.String) r6)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r4 = "codecs"
            java.lang.String r4 = m5528b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r4, (java.lang.String) r10)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r3 = "width"
            int r61 = m5515a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r3, (int) r7)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r3 = "height"
            int r62 = m5515a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r3, (int) r12)     // Catch:{ XmlPullParserException -> 0x0809 }
            float r63 = m5512a((org.xmlpull.v1.XmlPullParser) r0, (float) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r3 = "audioSamplingRate"
            int r3 = m5515a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r3, (int) r14)     // Catch:{ XmlPullParserException -> 0x0809 }
            r78 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            r79 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            r80 = r10
            r40 = r35
            r39 = r37
            r10 = r70
            r38 = 0
        L_0x0336:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0809 }
            r81 = r11
            java.lang.String r11 = "BaseURL"
            boolean r11 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x034c
            if (r38 != 0) goto L_0x03b3
            java.lang.String r10 = m5527b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r10)     // Catch:{ XmlPullParserException -> 0x0809 }
            r38 = 1
            goto L_0x03b3
        L_0x034c:
            java.lang.String r11 = "AudioChannelConfiguration"
            boolean r11 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x035b
            int r11 = m5531e(r0)     // Catch:{ XmlPullParserException -> 0x0809 }
            r40 = r11
            goto L_0x03b3
        L_0x035b:
            java.lang.String r11 = "SegmentBase"
            boolean r11 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x036e
            r11 = r39
            com.google.android.gms.internal.ads.big r11 = (com.google.android.gms.internal.ads.big) r11     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.big r11 = r1.m5521a((org.xmlpull.v1.XmlPullParser) r0, (com.google.android.gms.internal.ads.big) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x036b:
            r39 = r11
            goto L_0x03b3
        L_0x036e:
            java.lang.String r11 = "SegmentList"
            boolean r11 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x037f
            r11 = r39
            com.google.android.gms.internal.ads.bid r11 = (com.google.android.gms.internal.ads.bid) r11     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bid r11 = r1.m5519a((org.xmlpull.v1.XmlPullParser) r0, (com.google.android.gms.internal.ads.bid) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x036b
        L_0x037f:
            java.lang.String r11 = "SegmentTemplate"
            boolean r11 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x0390
            r11 = r39
            com.google.android.gms.internal.ads.bie r11 = (com.google.android.gms.internal.ads.bie) r11     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bie r11 = r1.m5520a((org.xmlpull.v1.XmlPullParser) r0, (com.google.android.gms.internal.ads.bie) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x036b
        L_0x0390:
            java.lang.String r11 = "ContentProtection"
            boolean r11 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x03a2
            com.google.android.gms.internal.ads.zzhp$zza r11 = m5526b(r0)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x03b3
            r6.add(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x03b3
        L_0x03a2:
            java.lang.String r11 = "InbandEventStream"
            boolean r11 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x03b3
            java.lang.String r11 = "InbandEventStream"
            com.google.android.gms.internal.ads.bhu r11 = m5517a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            r7.add(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x03b3:
            java.lang.String r11 = "Representation"
            boolean r11 = com.google.android.gms.internal.ads.bkr.m5831a(r0, r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x05cc
            boolean r11 = com.google.android.gms.internal.ads.bkd.m5753a(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x03ed
            if (r4 == 0) goto L_0x03e6
            java.lang.String r11 = ","
            java.lang.String[] r11 = r4.split(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            r82 = r12
            int r12 = r11.length     // Catch:{ XmlPullParserException -> 0x0809 }
            r83 = r14
            r14 = 0
        L_0x03cf:
            if (r14 >= r12) goto L_0x03ea
            r38 = r11[r14]     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r38 = com.google.android.gms.internal.ads.bkd.m5756d(r38)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r38 == 0) goto L_0x03e3
            boolean r41 = com.google.android.gms.internal.ads.bkd.m5753a(r38)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r41 == 0) goto L_0x03e3
        L_0x03df:
            r11 = r38
            goto L_0x0462
        L_0x03e3:
            int r14 = r14 + 1
            goto L_0x03cf
        L_0x03e6:
            r82 = r12
            r83 = r14
        L_0x03ea:
            r11 = 0
            goto L_0x0462
        L_0x03ed:
            r82 = r12
            r83 = r14
            boolean r11 = com.google.android.gms.internal.ads.bkd.m5754b(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x0415
            if (r4 == 0) goto L_0x03ea
            java.lang.String r11 = ","
            java.lang.String[] r11 = r4.split(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            int r12 = r11.length     // Catch:{ XmlPullParserException -> 0x0809 }
            r14 = 0
        L_0x0401:
            if (r14 >= r12) goto L_0x03ea
            r38 = r11[r14]     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r38 = com.google.android.gms.internal.ads.bkd.m5756d(r38)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r38 == 0) goto L_0x0412
            boolean r41 = com.google.android.gms.internal.ads.bkd.m5754b(r38)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r41 == 0) goto L_0x0412
            goto L_0x03df
        L_0x0412:
            int r14 = r14 + 1
            goto L_0x0401
        L_0x0415:
            boolean r11 = m5523a((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x041d
            r11 = r2
            goto L_0x0462
        L_0x041d:
            java.lang.String r11 = "application/mp4"
            boolean r11 = r11.equals(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x043b
            java.lang.String r11 = "stpp"
            boolean r11 = r11.equals(r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x0430
            java.lang.String r11 = "application/ttml+xml"
            goto L_0x0462
        L_0x0430:
            java.lang.String r11 = "wvtt"
            boolean r11 = r11.equals(r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x03ea
            java.lang.String r11 = "application/x-mp4-vtt"
            goto L_0x0462
        L_0x043b:
            java.lang.String r11 = "application/x-rawcc"
            boolean r11 = r11.equals(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x03ea
            if (r4 == 0) goto L_0x03ea
            java.lang.String r11 = "cea708"
            boolean r11 = r4.contains(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x0450
            java.lang.String r11 = "application/cea-708"
            goto L_0x0462
        L_0x0450:
            java.lang.String r11 = "eia608"
            boolean r11 = r4.contains(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 != 0) goto L_0x0460
            java.lang.String r11 = "cea608"
            boolean r11 = r4.contains(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x03ea
        L_0x0460:
            java.lang.String r11 = "application/cea-608"
        L_0x0462:
            if (r11 == 0) goto L_0x0573
            boolean r12 = com.google.android.gms.internal.ads.bkd.m5754b(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r12 == 0) goto L_0x047e
            r64 = 0
            r57 = r2
            r58 = r11
            r59 = r4
            r65 = r16
            com.google.android.gms.internal.ads.zzfs r2 = com.google.android.gms.internal.ads.zzfs.m8803a((java.lang.String) r56, (java.lang.String) r57, (java.lang.String) r58, (java.lang.String) r59, (int) r60, (int) r61, (int) r62, (float) r63, (java.util.List<byte[]>) r64, (int) r65)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x0478:
            r73 = r2
            r84 = r5
            goto L_0x0585
        L_0x047e:
            boolean r12 = com.google.android.gms.internal.ads.bkd.m5753a(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r12 == 0) goto L_0x0499
            r63 = 0
            r57 = r2
            r58 = r11
            r59 = r4
            r61 = r40
            r62 = r3
            r64 = r16
            r65 = r13
            com.google.android.gms.internal.ads.zzfs r2 = com.google.android.gms.internal.ads.zzfs.m8804a((java.lang.String) r56, (java.lang.String) r57, (java.lang.String) r58, (java.lang.String) r59, (int) r60, (int) r61, (int) r62, (java.util.List<byte[]>) r63, (int) r64, (java.lang.String) r65)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0478
        L_0x0499:
            boolean r3 = m5523a((java.lang.String) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r3 == 0) goto L_0x0573
            java.lang.String r3 = "application/cea-608"
            boolean r3 = r3.equals(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r3 == 0) goto L_0x0504
            r3 = 0
        L_0x04a8:
            int r12 = r9.size()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r3 >= r12) goto L_0x04fe
            java.lang.Object r12 = r9.get(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bhu r12 = (com.google.android.gms.internal.ads.bhu) r12     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r14 = "urn:scte:dash:cc:cea-608:2015"
            r84 = r5
            java.lang.String r5 = r12.f4356a     // Catch:{ XmlPullParserException -> 0x0809 }
            boolean r5 = r14.equals(r5)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r5 == 0) goto L_0x04f9
            java.lang.String r5 = r12.f4357b     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r5 == 0) goto L_0x04f9
            java.util.regex.Pattern r5 = f4347b     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r14 = r12.f4357b     // Catch:{ XmlPullParserException -> 0x0809 }
            java.util.regex.Matcher r5 = r5.matcher(r14)     // Catch:{ XmlPullParserException -> 0x0809 }
            boolean r14 = r5.matches()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r14 == 0) goto L_0x04dc
            r14 = 1
            java.lang.String r3 = r5.group(r14)     // Catch:{ XmlPullParserException -> 0x0809 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0501
        L_0x04dc:
            java.lang.String r5 = "MpdParser"
            java.lang.String r14 = "Unable to parse CEA-608 channel number from: "
            java.lang.String r12 = r12.f4357b     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ XmlPullParserException -> 0x0809 }
            int r38 = r12.length()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r38 == 0) goto L_0x04f1
            java.lang.String r12 = r14.concat(r12)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x04f6
        L_0x04f1:
            java.lang.String r12 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0809 }
            r12.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x04f6:
            android.util.Log.w(r5, r12)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x04f9:
            int r3 = r3 + 1
            r5 = r84
            goto L_0x04a8
        L_0x04fe:
            r84 = r5
        L_0x0500:
            r3 = -1
        L_0x0501:
            r63 = r3
            goto L_0x0564
        L_0x0504:
            r84 = r5
            java.lang.String r3 = "application/cea-708"
            boolean r3 = r3.equals(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r3 == 0) goto L_0x0562
            r3 = 0
        L_0x050f:
            int r5 = r9.size()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r3 >= r5) goto L_0x0500
            java.lang.Object r5 = r9.get(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bhu r5 = (com.google.android.gms.internal.ads.bhu) r5     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r12 = "urn:scte:dash:cc:cea-708:2015"
            java.lang.String r14 = r5.f4356a     // Catch:{ XmlPullParserException -> 0x0809 }
            boolean r12 = r12.equals(r14)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r12 == 0) goto L_0x055f
            java.lang.String r12 = r5.f4357b     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r12 == 0) goto L_0x055f
            java.util.regex.Pattern r12 = f4348c     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r14 = r5.f4357b     // Catch:{ XmlPullParserException -> 0x0809 }
            java.util.regex.Matcher r12 = r12.matcher(r14)     // Catch:{ XmlPullParserException -> 0x0809 }
            boolean r14 = r12.matches()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r14 == 0) goto L_0x0541
            r14 = 1
            java.lang.String r3 = r12.group(r14)     // Catch:{ XmlPullParserException -> 0x0809 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0501
        L_0x0541:
            r14 = 1
            java.lang.String r12 = "MpdParser"
            java.lang.String r14 = "Unable to parse CEA-708 service block number from: "
            java.lang.String r5 = r5.f4357b     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ XmlPullParserException -> 0x0809 }
            int r29 = r5.length()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r29 == 0) goto L_0x0557
            java.lang.String r5 = r14.concat(r5)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x055c
        L_0x0557:
            java.lang.String r5 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0809 }
            r5.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x055c:
            android.util.Log.w(r12, r5)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x055f:
            int r3 = r3 + 1
            goto L_0x050f
        L_0x0562:
            r63 = -1
        L_0x0564:
            r57 = r2
            r58 = r11
            r59 = r4
            r61 = r16
            r62 = r13
            com.google.android.gms.internal.ads.zzfs r2 = com.google.android.gms.internal.ads.zzfs.m8806a(r56, r57, r58, r59, r60, r61, r62, r63)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0583
        L_0x0573:
            r84 = r5
            r57 = r2
            r58 = r11
            r59 = r4
            r61 = r16
            r62 = r13
            com.google.android.gms.internal.ads.zzfs r2 = com.google.android.gms.internal.ads.zzfs.m8805a((java.lang.String) r56, (java.lang.String) r57, (java.lang.String) r58, (java.lang.String) r59, (int) r60, (int) r61, (java.lang.String) r62)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x0583:
            r73 = r2
        L_0x0585:
            if (r39 == 0) goto L_0x058a
            r75 = r39
            goto L_0x0591
        L_0x058a:
            com.google.android.gms.internal.ads.big r2 = new com.google.android.gms.internal.ads.big     // Catch:{ XmlPullParserException -> 0x0809 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0809 }
            r75 = r2
        L_0x0591:
            com.google.android.gms.internal.ads.bht r2 = new com.google.android.gms.internal.ads.bht     // Catch:{ XmlPullParserException -> 0x0809 }
            r72 = r2
            r74 = r10
            r76 = r6
            r77 = r7
            r72.<init>(r73, r74, r75, r76, r77)     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.zzfs r3 = r2.f4351a     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r3 = r3.f7209e     // Catch:{ XmlPullParserException -> 0x0809 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 != 0) goto L_0x05c0
            boolean r4 = com.google.android.gms.internal.ads.bkd.m5754b(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 == 0) goto L_0x05b0
            r4 = 2
            goto L_0x05c1
        L_0x05b0:
            boolean r4 = com.google.android.gms.internal.ads.bkd.m5753a(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 == 0) goto L_0x05b8
            r4 = 1
            goto L_0x05c1
        L_0x05b8:
            boolean r3 = m5523a((java.lang.String) r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r3 == 0) goto L_0x05c0
            r4 = 3
            goto L_0x05c1
        L_0x05c0:
            r4 = -1
        L_0x05c1:
            int r3 = m5513a((int) r15, (int) r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            r5 = r68
            r5.add(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            r15 = r3
            goto L_0x05f4
        L_0x05cc:
            r84 = r5
            r11 = r81
            goto L_0x0336
        L_0x05d2:
            r84 = r5
            r78 = r6
            r79 = r7
            r80 = r10
            r81 = r11
            r82 = r12
            r83 = r14
            r5 = r68
            java.lang.String r2 = "SegmentBase"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x05f7
            r2 = r37
            com.google.android.gms.internal.ads.big r2 = (com.google.android.gms.internal.ads.big) r2     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.big r2 = r1.m5521a((org.xmlpull.v1.XmlPullParser) r0, (com.google.android.gms.internal.ads.big) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x05f2:
            r37 = r2
        L_0x05f4:
            r3 = r67
            goto L_0x0632
        L_0x05f7:
            java.lang.String r2 = "SegmentList"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x0608
            r2 = r37
            com.google.android.gms.internal.ads.bid r2 = (com.google.android.gms.internal.ads.bid) r2     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bid r2 = r1.m5519a((org.xmlpull.v1.XmlPullParser) r0, (com.google.android.gms.internal.ads.bid) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x05f2
        L_0x0608:
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x0619
            r2 = r37
            com.google.android.gms.internal.ads.bie r2 = (com.google.android.gms.internal.ads.bie) r2     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bie r2 = r1.m5520a((org.xmlpull.v1.XmlPullParser) r0, (com.google.android.gms.internal.ads.bie) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x05f2
        L_0x0619:
            java.lang.String r2 = "InbandEventStream"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x062d
            java.lang.String r2 = "InbandEventStream"
            com.google.android.gms.internal.ads.bhu r2 = m5517a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            r3 = r67
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0632
        L_0x062d:
            r3 = r67
            com.google.android.gms.internal.ads.bkr.m5830a(r0)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x0632:
            r4 = r70
        L_0x0634:
            java.lang.String r2 = "AdaptationSet"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5831a(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x06cc
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0809 }
            int r4 = r5.size()     // Catch:{ XmlPullParserException -> 0x0809 }
            r2.<init>(r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            r4 = 0
        L_0x0646:
            int r6 = r5.size()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 >= r6) goto L_0x06b6
            java.lang.Object r6 = r5.get(r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bht r6 = (com.google.android.gms.internal.ads.bht) r6     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.zzfs r7 = r6.f4351a     // Catch:{ XmlPullParserException -> 0x0809 }
            java.util.ArrayList<com.google.android.gms.internal.ads.zzhp$zza> r10 = r6.f4354d     // Catch:{ XmlPullParserException -> 0x0809 }
            r10.addAll(r8)     // Catch:{ XmlPullParserException -> 0x0809 }
            boolean r11 = r10.isEmpty()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 != 0) goto L_0x0668
            com.google.android.gms.internal.ads.zzhp r11 = new com.google.android.gms.internal.ads.zzhp     // Catch:{ XmlPullParserException -> 0x0809 }
            r11.<init>((java.util.List<com.google.android.gms.internal.ads.zzhp.zza>) r10)     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.zzfs r7 = r7.mo13409a((com.google.android.gms.internal.ads.zzhp) r11)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x0668:
            r60 = r7
            java.util.ArrayList<com.google.android.gms.internal.ads.bhu> r7 = r6.f4355e     // Catch:{ XmlPullParserException -> 0x0809 }
            r7.addAll(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r10 = r6.f4352b     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bib r6 = r6.f4353c     // Catch:{ XmlPullParserException -> 0x0809 }
            boolean r11 = r6 instanceof com.google.android.gms.internal.ads.big     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x0691
            com.google.android.gms.internal.ads.bia r11 = new com.google.android.gms.internal.ads.bia     // Catch:{ XmlPullParserException -> 0x0809 }
            r68 = 0
            r69 = -1
            r73 = r6
            com.google.android.gms.internal.ads.big r73 = (com.google.android.gms.internal.ads.big) r73     // Catch:{ XmlPullParserException -> 0x0809 }
            r75 = 0
            r76 = -1
            r67 = r11
            r71 = r60
            r72 = r10
            r74 = r7
            r67.<init>(r68, r69, r71, r72, r73, r74, r75, r76)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x06a8
        L_0x0691:
            boolean r11 = r6 instanceof com.google.android.gms.internal.ads.bic     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r11 == 0) goto L_0x06ae
            com.google.android.gms.internal.ads.bhz r11 = new com.google.android.gms.internal.ads.bhz     // Catch:{ XmlPullParserException -> 0x0809 }
            r57 = 0
            r58 = -1
            r62 = r6
            com.google.android.gms.internal.ads.bic r62 = (com.google.android.gms.internal.ads.bic) r62     // Catch:{ XmlPullParserException -> 0x0809 }
            r56 = r11
            r61 = r10
            r63 = r7
            r56.<init>(r57, r58, r60, r61, r62, r63)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x06a8:
            r2.add(r11)     // Catch:{ XmlPullParserException -> 0x0809 }
            int r4 = r4 + 1
            goto L_0x0646
        L_0x06ae:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r2 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x06b6:
            com.google.android.gms.internal.ads.bhq r3 = new com.google.android.gms.internal.ads.bhq     // Catch:{ XmlPullParserException -> 0x0809 }
            r35 = r3
            r37 = r15
            r38 = r2
            r39 = r9
            r40 = r84
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ XmlPullParserException -> 0x0809 }
            r2 = r66
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0160
        L_0x06cc:
            r67 = r3
            r2 = r5
            r3 = r69
            r6 = r78
            r7 = r79
            r10 = r80
            r11 = r81
            r12 = r82
            r14 = r83
            r5 = r84
            goto L_0x01e4
        L_0x06e1:
            r53 = r2
            r55 = r4
            r52 = r5
            r34 = r6
            r49 = r8
            r43 = r10
            r45 = r12
            r2 = r13
            r46 = r14
            r47 = r15
            java.lang.String r3 = "SegmentBase"
            boolean r3 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r3 == 0) goto L_0x0703
            r3 = 0
            com.google.android.gms.internal.ads.big r4 = r1.m5521a((org.xmlpull.v1.XmlPullParser) r0, (com.google.android.gms.internal.ads.big) r3)     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x0701:
            r7 = r4
            goto L_0x0720
        L_0x0703:
            r3 = 0
            java.lang.String r4 = "SegmentList"
            boolean r4 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 == 0) goto L_0x0711
            com.google.android.gms.internal.ads.bid r4 = r1.m5519a((org.xmlpull.v1.XmlPullParser) r0, (com.google.android.gms.internal.ads.bid) r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0701
        L_0x0711:
            java.lang.String r4 = "SegmentTemplate"
            boolean r4 = com.google.android.gms.internal.ads.bkr.m5832b(r0, r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 == 0) goto L_0x071e
            com.google.android.gms.internal.ads.bie r4 = r1.m5520a((org.xmlpull.v1.XmlPullParser) r0, (com.google.android.gms.internal.ads.bie) r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            goto L_0x0701
        L_0x071e:
            r7 = r33
        L_0x0720:
            r6 = r34
        L_0x0722:
            java.lang.String r4 = "Period"
            boolean r4 = com.google.android.gms.internal.ads.bkr.m5831a(r0, r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r4 == 0) goto L_0x0796
            com.google.android.gms.internal.ads.bhv r4 = new com.google.android.gms.internal.ads.bhv     // Catch:{ XmlPullParserException -> 0x0809 }
            r8 = r53
            r5 = r55
            r4.<init>(r5, r8, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.Long r2 = java.lang.Long.valueOf(r31)     // Catch:{ XmlPullParserException -> 0x0809 }
            android.util.Pair r2 = android.util.Pair.create(r4, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.Object r4 = r2.first     // Catch:{ XmlPullParserException -> 0x0809 }
            com.google.android.gms.internal.ads.bhv r4 = (com.google.android.gms.internal.ads.bhv) r4     // Catch:{ XmlPullParserException -> 0x0809 }
            long r5 = r4.f4360b     // Catch:{ XmlPullParserException -> 0x0809 }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0772
            if (r17 == 0) goto L_0x0755
            r10 = r43
            r14 = r46
            r15 = r52
            r24 = 1
            goto L_0x07ad
        L_0x0755:
            com.google.android.gms.internal.ads.bad r0 = new com.google.android.gms.internal.ads.bad     // Catch:{ XmlPullParserException -> 0x0809 }
            int r2 = r52.size()     // Catch:{ XmlPullParserException -> 0x0809 }
            r3 = 47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0809 }
            r4.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r3 = "Unable to determine start of period "
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x0809 }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r2 = r4.toString()     // Catch:{ XmlPullParserException -> 0x0809 }
            r0.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x0772:
            java.lang.Object r2 = r2.second     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ XmlPullParserException -> 0x0809 }
            long r5 = r2.longValue()     // Catch:{ XmlPullParserException -> 0x0809 }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x078b
            r15 = r52
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0791
        L_0x078b:
            long r7 = r4.f4360b     // Catch:{ XmlPullParserException -> 0x0809 }
            r2 = 0
            long r5 = r5 + r7
            r15 = r52
        L_0x0791:
            r15.add(r4)     // Catch:{ XmlPullParserException -> 0x0809 }
            r10 = r5
            goto L_0x07ab
        L_0x0796:
            r13 = r2
            r10 = r43
            r12 = r45
            r14 = r46
            r15 = r47
            r8 = r49
            r5 = r52
            r2 = r53
            r4 = r55
            goto L_0x0122
        L_0x07a9:
            r10 = r43
        L_0x07ab:
            r14 = r46
        L_0x07ad:
            java.lang.String r2 = "MPD"
            boolean r2 = com.google.android.gms.internal.ads.bkr.m5831a(r0, r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r2 == 0) goto L_0x07ef
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r49 > r4 ? 1 : (r49 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x07cf
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x07c4
            r13 = r10
            goto L_0x07d1
        L_0x07c4:
            if (r17 == 0) goto L_0x07c7
            goto L_0x07cf
        L_0x07c7:
            com.google.android.gms.internal.ads.bad r0 = new com.google.android.gms.internal.ads.bad     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r2 = "Unable to determine duration of static manifest."
            r0.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x07cf:
            r13 = r49
        L_0x07d1:
            boolean r0 = r15.isEmpty()     // Catch:{ XmlPullParserException -> 0x0809 }
            if (r0 != 0) goto L_0x07e7
            com.google.android.gms.internal.ads.bhr r0 = new com.google.android.gms.internal.ads.bhr     // Catch:{ XmlPullParserException -> 0x0809 }
            r10 = r0
            r11 = r27
            r2 = r15
            r15 = r47
            r24 = r45
            r26 = r2
            r10.<init>(r11, r13, r15, r17, r18, r20, r22, r24, r25, r26)     // Catch:{ XmlPullParserException -> 0x0809 }
            return r0
        L_0x07e7:
            com.google.android.gms.internal.ads.bad r0 = new com.google.android.gms.internal.ads.bad     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r2 = "No periods found."
            r0.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x07ef:
            r2 = r3
            r5 = r15
            r3 = r30
            r12 = r45
            r15 = r47
            r8 = r49
            r4 = 2
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0092
        L_0x0801:
            com.google.android.gms.internal.ads.bad r0 = new com.google.android.gms.internal.ads.bad     // Catch:{ XmlPullParserException -> 0x0809 }
            java.lang.String r2 = "inputStream does not contain a valid media presentation description"
            r0.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0809 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0809 }
        L_0x0809:
            r0 = move-exception
            com.google.android.gms.internal.ads.bad r2 = new com.google.android.gms.internal.ads.bad
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhs.mo11938a(android.net.Uri, java.io.InputStream):com.google.android.gms.internal.ads.bhr");
    }

    /* renamed from: a */
    private static int m5514a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    /* renamed from: b */
    private static zzhp.zza m5526b(XmlPullParser xmlPullParser) {
        boolean equals = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95".equals(xmlPullParser.getAttributeValue((String) null, "schemeIdUri"));
        byte[] bArr = null;
        UUID uuid = null;
        boolean z = false;
        do {
            xmlPullParser.next();
            if (bArr == null && bkr.m5832b(xmlPullParser, "cenc:pssh") && xmlPullParser.next() == 4) {
                bArr = Base64.decode(xmlPullParser.getText(), 0);
                uuid = bdz.m5079a(bArr);
                if (uuid == null) {
                    Log.w("MpdParser", "Skipping malformed cenc:pssh data");
                    bArr = null;
                }
            } else if (bArr == null && equals && bkr.m5832b(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                bArr = bdz.m5080a(azl.f3171c, Base64.decode(xmlPullParser.getText(), 0));
                uuid = azl.f3171c;
            } else if (bkr.m5832b(xmlPullParser, "widevine:license")) {
                String attributeValue = xmlPullParser.getAttributeValue((String) null, "robustness_level");
                z = attributeValue != null && attributeValue.startsWith("HW");
            }
        } while (!bkr.m5831a(xmlPullParser, "ContentProtection"));
        if (bArr != null) {
            return new zzhp.zza(uuid, "video/mp4", bArr, z);
        }
        return null;
    }

    /* renamed from: a */
    private final big m5521a(XmlPullParser xmlPullParser, big big) {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        big big2 = big;
        long b = m5524b(xmlPullParser2, "timescale", big2 != null ? big2.f4380b : 1);
        long j3 = 0;
        long b2 = m5524b(xmlPullParser2, "presentationTimeOffset", big2 != null ? big2.f4381c : 0);
        long j4 = big2 != null ? big2.f4390d : 0;
        if (big2 != null) {
            j3 = big2.f4391e;
        }
        bhw bhw = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j2 = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - j2) + 1;
        } else {
            j = j3;
            j2 = j4;
        }
        if (big2 != null) {
            bhw = big2.f4379a;
        }
        do {
            xmlPullParser.next();
            if (bkr.m5832b(xmlPullParser2, "Initialization")) {
                bhw = m5530d(xmlPullParser);
            }
        } while (!bkr.m5831a(xmlPullParser2, "SegmentBase"));
        return new big(bhw, b, b2, j2, j);
    }

    /* renamed from: a */
    private final bid m5519a(XmlPullParser xmlPullParser, bid bid) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        bid bid2 = bid;
        long b = m5524b(xmlPullParser2, "timescale", bid2 != null ? bid2.f4380b : 1);
        long b2 = m5524b(xmlPullParser2, "presentationTimeOffset", bid2 != null ? bid2.f4381c : 0);
        long b3 = m5524b(xmlPullParser2, "duration", bid2 != null ? bid2.f4383e : -9223372036854775807L);
        int a = m5515a(xmlPullParser2, "startNumber", bid2 != null ? bid2.f4382d : 1);
        List list = null;
        bhw bhw = null;
        List<bif> list2 = null;
        do {
            xmlPullParser.next();
            if (bkr.m5832b(xmlPullParser2, "Initialization")) {
                bhw = m5530d(xmlPullParser);
            } else if (bkr.m5832b(xmlPullParser2, "SegmentTimeline")) {
                list2 = m5529c(xmlPullParser);
            } else if (bkr.m5832b(xmlPullParser2, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(m5518a(xmlPullParser2, "media", "mediaRange"));
            }
        } while (!bkr.m5831a(xmlPullParser2, "SegmentList"));
        if (bid2 != null) {
            if (bhw == null) {
                bhw = bid2.f4379a;
            }
            if (list2 == null) {
                list2 = bid2.f4384f;
            }
            if (list == null) {
                list = bid2.f4385g;
            }
        }
        return new bid(bhw, b, b2, a, b3, list2, list);
    }

    /* renamed from: a */
    private final bie m5520a(XmlPullParser xmlPullParser, bie bie) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        bie bie2 = bie;
        long b = m5524b(xmlPullParser2, "timescale", bie2 != null ? bie2.f4380b : 1);
        long b2 = m5524b(xmlPullParser2, "presentationTimeOffset", bie2 != null ? bie2.f4381c : 0);
        long b3 = m5524b(xmlPullParser2, "duration", bie2 != null ? bie2.f4383e : -9223372036854775807L);
        int a = m5515a(xmlPullParser2, "startNumber", bie2 != null ? bie2.f4382d : 1);
        bhw bhw = null;
        bij a2 = m5522a(xmlPullParser2, "media", bie2 != null ? bie2.f4387h : null);
        bij a3 = m5522a(xmlPullParser2, "initialization", bie2 != null ? bie2.f4386g : null);
        List<bif> list = null;
        do {
            xmlPullParser.next();
            if (bkr.m5832b(xmlPullParser2, "Initialization")) {
                bhw = m5530d(xmlPullParser);
            } else if (bkr.m5832b(xmlPullParser2, "SegmentTimeline")) {
                list = m5529c(xmlPullParser);
            }
        } while (!bkr.m5831a(xmlPullParser2, "SegmentTemplate"));
        if (bie2 != null) {
            if (bhw == null) {
                bhw = bie2.f4379a;
            }
            if (list == null) {
                list = bie2.f4384f;
            }
        }
        return new bie(bhw, b, b2, a, b3, list, a3, a2);
    }

    /* renamed from: c */
    private static List<bif> m5529c(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (bkr.m5832b(xmlPullParser, "S")) {
                j = m5524b(xmlPullParser, "t", j);
                long b = m5524b(xmlPullParser, "d", -9223372036854775807L);
                int a = m5515a(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < a; i++) {
                    arrayList.add(new bif(j, b));
                    j += b;
                }
            }
        } while (!bkr.m5831a(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    /* renamed from: a */
    private static bij m5522a(XmlPullParser xmlPullParser, String str, bij bij) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue != null ? bij.m5576a(attributeValue) : bij;
    }

    /* renamed from: d */
    private final bhw m5530d(XmlPullParser xmlPullParser) {
        return m5518a(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: a */
    private static bhw m5518a(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return new bhw(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return new bhw(attributeValue, j2, j);
    }

    /* renamed from: e */
    private static int m5531e(XmlPullParser xmlPullParser) {
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(m5528b(xmlPullParser, "schemeIdUri", (String) null))) {
            i = m5515a(xmlPullParser, "value", -1);
        }
        do {
            xmlPullParser.next();
        } while (!bkr.m5831a(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    /* renamed from: a */
    private static boolean m5523a(String str) {
        return bkd.m5755c(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    /* renamed from: a */
    private static int m5513a(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        bjy.m5691b(i == i2);
        return i;
    }

    /* renamed from: a */
    private static bhu m5517a(XmlPullParser xmlPullParser, String str) {
        String b = m5528b(xmlPullParser, "schemeIdUri", "");
        String b2 = m5528b(xmlPullParser, "value", (String) null);
        String b3 = m5528b(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!bkr.m5831a(xmlPullParser, str));
        return new bhu(b, b2, b3);
    }

    /* renamed from: a */
    private static float m5512a(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f4346a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    /* renamed from: a */
    private static long m5516a(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return bkp.m5826d(attributeValue);
    }

    /* renamed from: b */
    private static String m5527b(XmlPullParser xmlPullParser, String str) {
        xmlPullParser.next();
        return bko.m5804a(str, xmlPullParser.getText());
    }

    /* renamed from: a */
    private static int m5515a(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return i;
        }
        return Integer.parseInt(attributeValue);
    }

    /* renamed from: b */
    private static long m5524b(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return Long.parseLong(attributeValue);
    }

    /* renamed from: b */
    private static String m5528b(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }
}
