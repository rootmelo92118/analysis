package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;
import p000a.p001a.p002a.p003a.p004a.p006b.C0045u;
import p000a.p001a.p002a.p003a.p004a.p010e.C0093c;
import p000a.p001a.p002a.p003a.p004a.p010e.C0094d;
import p000a.p001a.p002a.p003a.p004a.p010e.C0102e;

class DefaultCreateReportSpiCall extends C0008a implements CreateReportSpiCall {
    static final String FILE_CONTENT_TYPE = "application/octet-stream";
    static final String FILE_PARAM = "report[file]";
    static final String IDENTIFIER_PARAM = "report[identifier]";
    static final String MULTI_FILE_PARAM = "report[file";

    public DefaultCreateReportSpiCall(C0150i iVar, String str, String str2, C0102e eVar) {
        super(iVar, str, str2, eVar, C0093c.POST);
    }

    DefaultCreateReportSpiCall(C0150i iVar, String str, String str2, C0102e eVar, C0093c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    public boolean invoke(CreateReportRequest createReportRequest) {
        C0094d applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
        C0153l g = C0139c.m394g();
        g.mo281a(CrashlyticsCore.TAG, "Sending report to: " + getUrl());
        int b = applyMultipartDataTo.mo211b();
        C0153l g2 = C0139c.m394g();
        g2.mo281a(CrashlyticsCore.TAG, "Create report request ID: " + applyMultipartDataTo.mo213b(C0008a.HEADER_REQUEST_ID));
        C0153l g3 = C0139c.m394g();
        g3.mo281a(CrashlyticsCore.TAG, "Result was: " + b);
        return C0045u.m155a(b) == 0;
    }

    private C0094d applyHeadersTo(C0094d dVar, CreateReportRequest createReportRequest) {
        C0094d a = dVar.mo201a(C0008a.HEADER_API_KEY, createReportRequest.apiKey).mo201a(C0008a.HEADER_CLIENT_TYPE, C0008a.ANDROID_CLIENT_TYPE).mo201a(C0008a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        for (Map.Entry<String, String> a2 : createReportRequest.report.getCustomHeaders().entrySet()) {
            a = a.mo207a(a2);
        }
        return a;
    }

    private C0094d applyMultipartDataTo(C0094d dVar, Report report) {
        dVar.mo221e(IDENTIFIER_PARAM, report.getIdentifier());
        if (report.getFiles().length == 1) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Adding single file " + report.getFileName() + " to report " + report.getIdentifier());
            return dVar.mo204a(FILE_PARAM, report.getFileName(), FILE_CONTENT_TYPE, report.getFile());
        }
        int i = 0;
        for (File file : report.getFiles()) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Adding file " + file.getName() + " to report " + report.getIdentifier());
            StringBuilder sb = new StringBuilder();
            sb.append(MULTI_FILE_PARAM);
            sb.append(i);
            sb.append("]");
            dVar.mo204a(sb.toString(), file.getName(), FILE_CONTENT_TYPE, file);
            i++;
        }
        return dVar;
    }
}
