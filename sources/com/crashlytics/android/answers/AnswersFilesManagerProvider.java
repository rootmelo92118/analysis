package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import p000a.p001a.p002a.p003a.p004a.p006b.C0046v;
import p000a.p001a.p002a.p003a.p004a.p009d.C0087g;
import p000a.p001a.p002a.p003a.p004a.p011f.C0107a;

class AnswersFilesManagerProvider {
    static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
    static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
    final Context context;
    final C0107a fileStore;

    public AnswersFilesManagerProvider(Context context2, C0107a aVar) {
        this.context = context2;
        this.fileStore = aVar;
    }

    public SessionAnalyticsFilesManager getAnalyticsFilesManager() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new SessionAnalyticsFilesManager(this.context, new SessionEventTransform(), new C0046v(), new C0087g(this.context, this.fileStore.mo254a(), SESSION_ANALYTICS_FILE_NAME, SESSION_ANALYTICS_TO_SEND_DIR));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
