package com.crashlytics.android.answers;

import java.io.File;
import java.util.List;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;
import p000a.p001a.p002a.p003a.p004a.p006b.C0045u;
import p000a.p001a.p002a.p003a.p004a.p009d.C0086f;
import p000a.p001a.p002a.p003a.p004a.p010e.C0093c;
import p000a.p001a.p002a.p003a.p004a.p010e.C0094d;
import p000a.p001a.p002a.p003a.p004a.p010e.C0102e;

class SessionAnalyticsFilesSender extends C0008a implements C0086f {
    static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
    static final String FILE_PARAM_NAME = "session_analytics_file_";
    private final String apiKey;

    public SessionAnalyticsFilesSender(C0150i iVar, String str, String str2, C0102e eVar, String str3) {
        super(iVar, str, str2, eVar, C0093c.POST);
        this.apiKey = str3;
    }

    public boolean send(List<File> list) {
        C0094d a = getHttpRequest().mo201a(C0008a.HEADER_CLIENT_TYPE, C0008a.ANDROID_CLIENT_TYPE).mo201a(C0008a.HEADER_CLIENT_VERSION, this.kit.getVersion()).mo201a(C0008a.HEADER_API_KEY, this.apiKey);
        int i = 0;
        for (File next : list) {
            a.mo204a(FILE_PARAM_NAME + i, next.getName(), FILE_CONTENT_TYPE, next);
            i++;
        }
        C0153l g = C0139c.m394g();
        g.mo281a(Answers.TAG, "Sending " + list.size() + " analytics files to " + getUrl());
        int b = a.mo211b();
        C0153l g2 = C0139c.m394g();
        g2.mo281a(Answers.TAG, "Response code for analytics file send is " + b);
        if (C0045u.m155a(b) == 0) {
            return true;
        }
        return false;
    }
}
