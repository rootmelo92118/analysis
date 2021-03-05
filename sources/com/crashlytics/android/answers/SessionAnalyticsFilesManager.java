package com.crashlytics.android.answers;

import android.content.Context;
import java.util.UUID;
import p000a.p001a.p002a.p003a.p004a.p006b.C0026k;
import p000a.p001a.p002a.p003a.p004a.p009d.C0080b;
import p000a.p001a.p002a.p003a.p004a.p009d.C0083c;
import p000a.p001a.p002a.p003a.p004a.p012g.C0112b;

class SessionAnalyticsFilesManager extends C0080b<SessionEvent> {
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
    private C0112b analyticsSettingsData;

    SessionAnalyticsFilesManager(Context context, SessionEventTransform sessionEventTransform, C0026k kVar, C0083c cVar) {
        super(context, sessionEventTransform, kVar, cVar, 100);
    }

    /* access modifiers changed from: protected */
    public String generateUniqueRollOverFileName() {
        UUID randomUUID = UUID.randomUUID();
        return SESSION_ANALYTICS_TO_SEND_FILE_PREFIX + C0080b.ROLL_OVER_FILE_NAME_SEPARATOR + randomUUID.toString() + C0080b.ROLL_OVER_FILE_NAME_SEPARATOR + this.currentTimeProvider.mo50a() + SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION;
    }

    /* access modifiers changed from: protected */
    public int getMaxFilesToKeep() {
        return this.analyticsSettingsData == null ? super.getMaxFilesToKeep() : this.analyticsSettingsData.f209e;
    }

    /* access modifiers changed from: protected */
    public int getMaxByteSizePerFile() {
        return this.analyticsSettingsData == null ? super.getMaxByteSizePerFile() : this.analyticsSettingsData.f207c;
    }

    /* access modifiers changed from: package-private */
    public void setAnalyticsSettingsData(C0112b bVar) {
        this.analyticsSettingsData = bVar;
    }
}
