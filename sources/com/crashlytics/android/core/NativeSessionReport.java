package com.crashlytics.android.core;

import com.crashlytics.android.core.Report;
import java.io.File;
import java.util.Map;
import p000a.p001a.p002a.p003a.C0139c;

class NativeSessionReport implements Report {
    private final File reportDirectory;

    public Map<String, String> getCustomHeaders() {
        return null;
    }

    public File getFile() {
        return null;
    }

    public String getFileName() {
        return null;
    }

    public NativeSessionReport(File file) {
        this.reportDirectory = file;
    }

    public void remove() {
        for (File file : getFiles()) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Removing native report file at " + file.getPath());
            file.delete();
        }
        C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Removing native report directory at " + this.reportDirectory);
        this.reportDirectory.delete();
    }

    public String getIdentifier() {
        return this.reportDirectory.getName();
    }

    public File[] getFiles() {
        return this.reportDirectory.listFiles();
    }

    public Report.Type getType() {
        return Report.Type.NATIVE;
    }
}
