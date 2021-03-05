package com.crashlytics.android.core;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import com.crashlytics.android.core.CrashPromptDialog;
import com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler;
import com.crashlytics.android.core.LogFileManager;
import com.crashlytics.android.core.ReportUploader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0023j;
import p000a.p001a.p002a.p003a.p004a.p006b.C0027l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0035q;
import p000a.p001a.p002a.p003a.p004a.p006b.C0036r;
import p000a.p001a.p002a.p003a.p004a.p010e.C0102e;
import p000a.p001a.p002a.p003a.p004a.p011f.C0107a;
import p000a.p001a.p002a.p003a.p004a.p012g.C0123m;
import p000a.p001a.p002a.p003a.p004a.p012g.C0125o;
import p000a.p001a.p002a.p003a.p004a.p012g.C0126p;
import p000a.p001a.p002a.p003a.p004a.p012g.C0127q;
import p000a.p001a.p002a.p003a.p004a.p012g.C0132t;

class CrashlyticsController {
    private static final int ANALYZER_VERSION = 1;
    private static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    static final String FATAL_SESSION_DIR = "fatal-sessions";
    static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_REALTIME = "_r";
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    private static final String[] INITIAL_SESSION_PART_TAGS = {SESSION_USER_TAG, SESSION_APP_TAG, SESSION_OS_TAG, SESSION_DEVICE_TAG};
    static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
    static final Comparator<File> LARGEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    static final int MAX_INVALID_SESSIONS = 4;
    private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
    static final int MAX_OPEN_SESSIONS = 8;
    static final int MAX_STACK_SIZE = 1024;
    static final String NONFATAL_SESSION_DIR = "nonfatal-sessions";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private static final Map<String, String> SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    static final String SESSION_APP_TAG = "SessionApp";
    static final FilenameFilter SESSION_BEGIN_FILE_FILTER = new FileNameContainsFilter(SESSION_BEGIN_TAG) {
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    static final String SESSION_BEGIN_TAG = "BeginSession";
    static final String SESSION_DEVICE_TAG = "SessionDevice";
    static final FileFilter SESSION_DIRECTORY_FILTER = new FileFilter() {
        public boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    };
    static final String SESSION_EVENT_MISSING_BINARY_IMGS_TAG = "SessionMissingBinaryImages";
    static final String SESSION_FATAL_TAG = "SessionCrash";
    static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return str.length() == ClsFileOutputStream.SESSION_FILE_EXTENSION.length() + 35 && str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    /* access modifiers changed from: private */
    public static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final int SESSION_ID_LENGTH = 35;
    static final String SESSION_JSON_SUFFIX = ".json";
    static final String SESSION_NON_FATAL_TAG = "SessionEvent";
    static final String SESSION_OS_TAG = "SessionOS";
    static final String SESSION_USER_TAG = "SessionUser";
    private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    static final Comparator<File> SMALLEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    /* access modifiers changed from: private */
    public final AppData appData;
    private final AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    /* access modifiers changed from: private */
    public final CrashlyticsCore crashlyticsCore;
    private final DevicePowerStateListener devicePowerStateListener;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final C0107a fileStore;
    private final EventLogger firebaseAnalyticsLogger;
    private final ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
    private final C0102e httpRequestFactory;
    private final C0036r idManager;
    private final LogFileDirectoryProvider logFileDirectoryProvider;
    /* access modifiers changed from: private */
    public final LogFileManager logFileManager;
    private final PreferenceManager preferenceManager;
    private final ReportUploader.ReportFilesProvider reportFilesProvider;
    private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
    /* access modifiers changed from: private */
    public final String unityVersion;

    private interface CodedOutputStreamWriteAction {
        void writeTo(CodedOutputStream codedOutputStream);
    }

    private interface FileOutputStreamWriteAction {
        void writeTo(FileOutputStream fileOutputStream);
    }

    static class FileNameContainsFilter implements FilenameFilter {
        private final String string;

        public FileNameContainsFilter(String str) {
            this.string = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.string) && !str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    }

    static class SessionPartFileFilter implements FilenameFilter {
        private final String sessionId;

        public SessionPartFileFilter(String str) {
            this.sessionId = str;
        }

        public boolean accept(File file, String str) {
            if (!str.equals(this.sessionId + ClsFileOutputStream.SESSION_FILE_EXTENSION) && str.contains(this.sessionId) && !str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION)) {
                return true;
            }
            return false;
        }
    }

    private static class AnySessionPartFileFilter implements FilenameFilter {
        private AnySessionPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            return !CrashlyticsController.SESSION_FILE_FILTER.accept(file, str) && CrashlyticsController.SESSION_FILE_PATTERN.matcher(str).matches();
        }
    }

    static class InvalidPartFileFilter implements FilenameFilter {
        InvalidPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            return ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, str) || str.contains(CrashlyticsController.SESSION_EVENT_MISSING_BINARY_IMGS_TAG);
        }
    }

    CrashlyticsController(CrashlyticsCore crashlyticsCore2, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, C0102e eVar, C0036r rVar, PreferenceManager preferenceManager2, C0107a aVar, AppData appData2, UnityVersionProvider unityVersionProvider, AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar2, EventLogger eventLogger) {
        this.crashlyticsCore = crashlyticsCore2;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.httpRequestFactory = eVar;
        this.idManager = rVar;
        this.preferenceManager = preferenceManager2;
        this.fileStore = aVar;
        this.appData = appData2;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.appMeasurementEventListenerRegistrar = appMeasurementEventListenerRegistrar2;
        this.firebaseAnalyticsLogger = eventLogger;
        Context context = crashlyticsCore2.getContext();
        this.logFileDirectoryProvider = new LogFileDirectoryProvider(aVar);
        this.logFileManager = new LogFileManager(context, this.logFileDirectoryProvider);
        this.reportFilesProvider = new ReportUploaderFilesProvider();
        this.handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
        this.devicePowerStateListener = new DevicePowerStateListener(context);
        this.stackTraceTrimmingStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
    }

    /* access modifiers changed from: package-private */
    public void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        openSession();
        this.crashHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() {
            public void onUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
                CrashlyticsController.this.handleUncaughtException(settingsDataProvider, thread, th, z);
            }
        }, new DefaultSettingsDataProvider(), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.crashHandler);
    }

    /* access modifiers changed from: package-private */
    public synchronized void handleUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
        C0153l g = C0139c.m394g();
        g.mo281a(CrashlyticsCore.TAG, "Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        this.devicePowerStateListener.dispose();
        final Date date = new Date();
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider2 = settingsDataProvider;
        final boolean z2 = z;
        this.backgroundWorker.submitAndWait(new Callable<Void>() {
            public Void call() {
                C0123m mVar;
                C0126p pVar;
                CrashlyticsController.this.crashlyticsCore.createCrashMarker();
                CrashlyticsController.this.writeFatal(date, thread2, th2);
                C0132t settingsData = settingsDataProvider2.getSettingsData();
                if (settingsData != null) {
                    pVar = settingsData.f280b;
                    mVar = settingsData.f282d;
                } else {
                    pVar = null;
                    mVar = null;
                }
                boolean z = false;
                if ((mVar == null || mVar.f251e) || z2) {
                    CrashlyticsController.this.recordFatalFirebaseEvent(date.getTime());
                }
                CrashlyticsController.this.doCloseSessions(pVar);
                CrashlyticsController.this.doOpenSession();
                if (pVar != null) {
                    CrashlyticsController.this.trimSessionFiles(pVar.f269g);
                }
                if (new C0035q().mo62f(CrashlyticsController.this.crashlyticsCore.getContext()) && !CrashlyticsController.this.shouldPromptUserBeforeSendingCrashReports(settingsData)) {
                    z = true;
                }
                if (z) {
                    CrashlyticsController.this.sendSessionReports(settingsData);
                }
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void submitAllReports(float f, C0132t tVar) {
        if (tVar == null) {
            C0139c.m394g().mo288d(CrashlyticsCore.TAG, "Could not send reports. Settings are not available.");
            return;
        }
        new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(tVar.f279a.f233d, tVar.f279a.f234e), this.reportFilesProvider, this.handlingExceptionCheck).uploadReports(f, shouldPromptUserBeforeSendingCrashReports(tVar) ? new PrivacyDialogCheck(this.crashlyticsCore, this.preferenceManager, tVar.f281c) : new ReportUploader.AlwaysSendCheck());
    }

    /* access modifiers changed from: package-private */
    public void writeToLog(final long j, final String str) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() {
                if (CrashlyticsController.this.isHandlingException()) {
                    return null;
                }
                CrashlyticsController.this.logFileManager.writeToLog(j, str);
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void writeNonFatalException(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.doWriteNonFatal(date, thread, th);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void cacheUserData(final String str, final String str2, final String str3) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeUserData(CrashlyticsController.this.getCurrentSessionId(), new UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void cacheKeyData(final Map<String, String> map) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeKeyData(CrashlyticsController.this.getCurrentSessionId(), map);
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void openSession() {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() {
                CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    /* access modifiers changed from: private */
    public String getCurrentSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 0) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[0]);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public String getPreviousSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 1) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[1]);
        }
        return null;
    }

    static String getSessionIdFromSessionFile(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: package-private */
    public boolean hasOpenSession() {
        return listSessionBeginFiles().length > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean finalizeSessions(final C0126p pVar) {
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() {
                if (CrashlyticsController.this.isHandlingException()) {
                    C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Skipping session finalization because a crash has already occurred.");
                    return Boolean.FALSE;
                }
                C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Finalizing previously open sessions.");
                CrashlyticsController.this.doCloseSessions(pVar, true);
                C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Closed all previously open sessions");
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* access modifiers changed from: private */
    public void doOpenSession() {
        Date date = new Date();
        String clsuuid = new CLSUUID(this.idManager).toString();
        C0153l g = C0139c.m394g();
        g.mo281a(CrashlyticsCore.TAG, "Opening a new session with ID " + clsuuid);
        writeBeginSession(clsuuid, date);
        writeSessionApp(clsuuid);
        writeSessionOS(clsuuid);
        writeSessionDevice(clsuuid);
        this.logFileManager.setCurrentSession(clsuuid);
    }

    /* access modifiers changed from: package-private */
    public void doCloseSessions(C0126p pVar) {
        doCloseSessions(pVar, false);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doCloseSessions(p000a.p001a.p002a.p003a.p004a.p012g.C0126p r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r4 + 8
            r2.trimOpenSessions(r0)
            java.io.File[] r0 = r2.listSortedSessionBeginFiles()
            int r1 = r0.length
            if (r1 > r4) goto L_0x0018
            a.a.a.a.l r3 = p000a.p001a.p002a.p003a.C0139c.m394g()
            java.lang.String r4 = "CrashlyticsCore"
            java.lang.String r0 = "No open sessions to be closed."
            r3.mo281a((java.lang.String) r4, (java.lang.String) r0)
            return
        L_0x0018:
            r1 = r0[r4]
            java.lang.String r1 = getSessionIdFromSessionFile(r1)
            r2.writeSessionUser(r1)
            if (r3 != 0) goto L_0x002f
            a.a.a.a.l r3 = p000a.p001a.p002a.p003a.C0139c.m394g()
            java.lang.String r4 = "CrashlyticsCore"
            java.lang.String r0 = "Unable to close session. Settings are not loaded."
            r3.mo281a((java.lang.String) r4, (java.lang.String) r0)
            return
        L_0x002f:
            int r3 = r3.f265c
            r2.closeOpenSessions(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.doCloseSessions(a.a.a.a.a.g.p, boolean):void");
    }

    private void closeOpenSessions(File[] fileArr, int i, int i2) {
        C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            C0153l g = C0139c.m394g();
            g.mo281a(CrashlyticsCore.TAG, "Closing session: " + sessionIdFromSessionFile);
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i2);
            i++;
        }
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream != null) {
            try {
                clsFileOutputStream.closeInProgressStream();
            } catch (IOException e) {
                C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    /* access modifiers changed from: private */
    public void recursiveDelete(Set<File> set) {
        for (File recursiveDelete : set) {
            recursiveDelete(recursiveDelete);
        }
    }

    private void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File recursiveDelete : file.listFiles()) {
                recursiveDelete(recursiveDelete);
            }
        }
        file.delete();
    }

    private void deleteSessionPartFilesFor(String str) {
        for (File delete : listSessionPartFilesFor(str)) {
            delete.delete();
        }
    }

    private File[] listSessionPartFilesFor(String str) {
        return listFilesMatching((FilenameFilter) new SessionPartFileFilter(str));
    }

    /* access modifiers changed from: package-private */
    public File[] listCompleteSessionFiles() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getFilesDir(), SESSION_FILE_FILTER));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: package-private */
    public File[] listNativeSessionFileDirectories() {
        return listFilesMatching(SESSION_DIRECTORY_FILTER);
    }

    /* access modifiers changed from: package-private */
    public File[] listSessionBeginFiles() {
        return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
    }

    private File[] listSortedSessionBeginFiles() {
        File[] listSessionBeginFiles = listSessionBeginFiles();
        Arrays.sort(listSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return listSessionBeginFiles;
    }

    private File[] listFilesMatching(FileFilter fileFilter) {
        return ensureFileArrayNotNull(getFilesDir().listFiles(fileFilter));
    }

    /* access modifiers changed from: private */
    public File[] listFilesMatching(FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    private File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    private File[] listFiles(File file) {
        return ensureFileArrayNotNull(file.listFiles());
    }

    private File[] ensureFileArrayNotNull(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private void trimSessionEventFiles(String str, int i) {
        File filesDir = getFilesDir();
        Utils.capFileCount(filesDir, new FileNameContainsFilter(str + SESSION_NON_FATAL_TAG), i, SMALLEST_FILE_NAME_FIRST);
    }

    /* access modifiers changed from: package-private */
    public void trimSessionFiles(int i) {
        int capFileCount = i - Utils.capFileCount(getFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
        Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, capFileCount - Utils.capFileCount(getNonFatalSessionFilesDir(), capFileCount, SMALLEST_FILE_NAME_FIRST), SMALLEST_FILE_NAME_FIRST);
    }

    private void trimOpenSessions(int i) {
        HashSet hashSet = new HashSet();
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int min = Math.min(i, listSortedSessionBeginFiles.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i2]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        retainSessions(listFilesMatching((FilenameFilter) new AnySessionPartFileFilter()), hashSet);
    }

    private void retainSessions(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            if (!matcher.matches()) {
                C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Deleting unknown file: " + name);
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Trimming session file: " + name);
                file.delete();
            }
        }
    }

    private File[] getTrimmedNonFatalFiles(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        C0139c.m394g().mo281a(CrashlyticsCore.TAG, String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        trimSessionEventFiles(str, i);
        return listFilesMatching((FilenameFilter) new FileNameContainsFilter(str + SESSION_NON_FATAL_TAG));
    }

    /* access modifiers changed from: package-private */
    public void cleanInvalidTempFiles() {
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                CrashlyticsController.this.doCleanInvalidTempFiles(CrashlyticsController.this.listFilesMatching((FilenameFilter) new InvalidPartFileFilter()));
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void doCleanInvalidTempFiles(File[] fileArr) {
        final HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Found invalid session part file: " + file);
            hashSet.add(getSessionIdFromSessionFile(file));
        }
        if (!hashSet.isEmpty()) {
            File invalidFilesDir = getInvalidFilesDir();
            if (!invalidFilesDir.exists()) {
                invalidFilesDir.mkdir();
            }
            for (File file2 : listFilesMatching((FilenameFilter) new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            })) {
                C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Moving session file: " + file2);
                if (!file2.renameTo(new File(invalidFilesDir, file2.getName()))) {
                    C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Could not move session file. Deleting " + file2);
                    file2.delete();
                }
            }
            trimInvalidSessionFiles();
        }
    }

    private void trimInvalidSessionFiles() {
        File invalidFilesDir = getInvalidFilesDir();
        if (invalidFilesDir.exists()) {
            File[] listFilesMatching = listFilesMatching(invalidFilesDir, new InvalidPartFileFilter());
            Arrays.sort(listFilesMatching, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i = 0; i < listFilesMatching.length && hashSet.size() < 4; i++) {
                hashSet.add(getSessionIdFromSessionFile(listFilesMatching[i]));
            }
            retainSessions(listFiles(invalidFilesDir), hashSet);
        }
    }

    /* access modifiers changed from: private */
    public void finalizeMostRecentNativeCrash(Context context, File file, String str) {
        byte[] minidumpFromDirectory = NativeFileUtils.minidumpFromDirectory(file);
        byte[] metadataJsonFromDirectory = NativeFileUtils.metadataJsonFromDirectory(file);
        byte[] binaryImagesJsonFromDirectory = NativeFileUtils.binaryImagesJsonFromDirectory(file, context);
        if (minidumpFromDirectory == null || minidumpFromDirectory.length == 0) {
            C0153l g = C0139c.m394g();
            g.mo288d(CrashlyticsCore.TAG, "No minidump data found in directory " + file);
            return;
        }
        recordFatalExceptionAnswersEvent(str, "<native-crash: minidump>");
        byte[] readFile = readFile(str, "BeginSession.json");
        byte[] readFile2 = readFile(str, "SessionApp.json");
        byte[] readFile3 = readFile(str, "SessionDevice.json");
        byte[] readFile4 = readFile(str, "SessionOS.json");
        byte[] readFile5 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getUserDataFileForSession(str));
        LogFileManager logFileManager2 = new LogFileManager(this.crashlyticsCore.getContext(), this.logFileDirectoryProvider, str);
        byte[] bytesForLog = logFileManager2.getBytesForLog();
        logFileManager2.clearLog();
        byte[] readFile6 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getKeysFileForSession(str));
        File file2 = new File(this.fileStore.mo254a(), str);
        if (!file2.mkdir()) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Couldn't create native sessions directory");
            return;
        }
        gzipIfNotEmpty(minidumpFromDirectory, new File(file2, "minidump"));
        gzipIfNotEmpty(metadataJsonFromDirectory, new File(file2, "metadata"));
        gzipIfNotEmpty(binaryImagesJsonFromDirectory, new File(file2, "binaryImages"));
        gzipIfNotEmpty(readFile, new File(file2, "session"));
        gzipIfNotEmpty(readFile2, new File(file2, "app"));
        gzipIfNotEmpty(readFile3, new File(file2, "device"));
        gzipIfNotEmpty(readFile4, new File(file2, "os"));
        gzipIfNotEmpty(readFile5, new File(file2, "user"));
        gzipIfNotEmpty(bytesForLog, new File(file2, "logs"));
        gzipIfNotEmpty(readFile6, new File(file2, "keys"));
    }

    /* access modifiers changed from: package-private */
    public boolean finalizeNativeReport(final CrashlyticsNdkData crashlyticsNdkData) {
        if (crashlyticsNdkData == null) {
            return true;
        }
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() {
                File first;
                TreeSet<File> treeSet = crashlyticsNdkData.timestampedDirectories;
                String access$1600 = CrashlyticsController.this.getPreviousSessionId();
                if (!(access$1600 == null || treeSet.isEmpty() || (first = treeSet.first()) == null)) {
                    CrashlyticsController.this.finalizeMostRecentNativeCrash(CrashlyticsController.this.crashlyticsCore.getContext(), first, access$1600);
                }
                CrashlyticsController.this.recursiveDelete((Set<File>) treeSet);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    private void gzipIfNotEmpty(byte[] bArr, File file) {
        if (bArr != null && bArr.length > 0) {
            gzip(bArr, file);
        }
    }

    private void gzip(byte[] bArr, File file) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                C0020i.m57a((Closeable) gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                C0020i.m57a((Closeable) gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C0020i.m57a((Closeable) gZIPOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void writeFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream codedOutputStream = null;
        try {
            String currentSessionId = getCurrentSessionId();
            if (currentSessionId == null) {
                C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Tried to write a fatal exception while no session was open.", (Throwable) null);
                C0020i.m59a((Flushable) null, "Failed to flush to session begin file.");
                C0020i.m58a((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            recordFatalExceptionAnswersEvent(currentSessionId, th.getClass().getName());
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + SESSION_FATAL_TAG);
            try {
                CodedOutputStream newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                try {
                    writeSessionEvent(newInstance, date, thread, th, EVENT_TYPE_CRASH, true);
                    C0020i.m59a((Flushable) newInstance, "Failed to flush to session begin file.");
                } catch (Exception e) {
                    e = e;
                    codedOutputStream = newInstance;
                    try {
                        C0139c.m394g().mo291e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", e);
                        C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                        C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
                    } catch (Throwable th2) {
                        th = th2;
                        C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                        C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    codedOutputStream = newInstance;
                    C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                    C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C0139c.m394g().mo291e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", e);
                C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
            }
            C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            C0139c.m394g().mo291e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", e);
            C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
            C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
            C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
            C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void doWriteNonFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        String currentSessionId = getCurrentSessionId();
        CodedOutputStream codedOutputStream = null;
        if (currentSessionId == null) {
            C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Tried to write a non-fatal exception while no session was open.", (Throwable) null);
            return;
        }
        recordLoggedExceptionAnswersEvent(currentSessionId, th.getClass().getName());
        try {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Crashlytics is logging non-fatal exception \"" + th + "\" from thread " + thread.getName());
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + SESSION_NON_FATAL_TAG + C0020i.m45a(this.eventCounter.getAndIncrement()));
            try {
                CodedOutputStream newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                try {
                    writeSessionEvent(newInstance, date, thread, th, EVENT_TYPE_LOGGED, false);
                    C0020i.m59a((Flushable) newInstance, "Failed to flush to non-fatal file.");
                } catch (Exception e) {
                    e = e;
                    codedOutputStream = newInstance;
                    try {
                        C0139c.m394g().mo291e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", e);
                        C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                        C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                        trimSessionEventFiles(currentSessionId, 64);
                    } catch (Throwable th2) {
                        th = th2;
                        C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                        C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    codedOutputStream = newInstance;
                    C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                    C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C0139c.m394g().mo291e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", e);
                C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                trimSessionEventFiles(currentSessionId, 64);
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            C0139c.m394g().mo291e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", e);
            C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
            C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
            C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
            C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
            throw th;
        }
        C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
        try {
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Exception e4) {
            C0139c.m394g().mo291e(CrashlyticsCore.TAG, "An error occurred when trimming non-fatal files.", e4);
        }
    }

    private void writeSessionPartFile(String str, String str2, CodedOutputStreamWriteAction codedOutputStreamWriteAction) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream newInstance;
        CodedOutputStream codedOutputStream = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + str2);
            try {
                newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
            } catch (Throwable th) {
                th = th;
                C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to session " + str2 + " file.");
                C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
                throw th;
            }
            try {
                codedOutputStreamWriteAction.writeTo(newInstance);
                C0020i.m59a((Flushable) newInstance, "Failed to flush to session " + str2 + " file.");
                C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
            } catch (Throwable th2) {
                th = th2;
                codedOutputStream = newInstance;
                C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to session " + str2 + " file.");
                C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            clsFileOutputStream = null;
            C0020i.m59a((Flushable) codedOutputStream, "Failed to flush to session " + str2 + " file.");
            C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
            throw th;
        }
    }

    private void writeFile(String str, String str2, FileOutputStreamWriteAction fileOutputStreamWriteAction) {
        FileOutputStream fileOutputStream = null;
        try {
            File filesDir = getFilesDir();
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(filesDir, str + str2));
            try {
                fileOutputStreamWriteAction.writeTo(fileOutputStream2);
                C0020i.m58a((Closeable) fileOutputStream2, "Failed to close " + str2 + " file.");
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                C0020i.m58a((Closeable) fileOutputStream, "Failed to close " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C0020i.m58a((Closeable) fileOutputStream, "Failed to close " + str2 + " file.");
            throw th;
        }
    }

    private byte[] readFile(String str, String str2) {
        File filesDir = getFilesDir();
        return NativeFileUtils.readFile(new File(filesDir, str + str2));
    }

    private void writeBeginSession(String str, Date date) {
        final String str2 = str;
        final String format = String.format(Locale.US, GENERATOR_FORMAT, new Object[]{this.crashlyticsCore.getVersion()});
        final long time = date.getTime() / 1000;
        writeSessionPartFile(str, SESSION_BEGIN_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeBeginSession(codedOutputStream, str2, format, time);
            }
        });
        writeFile(str, "BeginSession.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("session_id", str2);
                        put("generator", format);
                        put("started_at_seconds", Long.valueOf(time));
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionApp(String str) {
        String c = this.idManager.mo65c();
        String str2 = this.appData.versionCode;
        String str3 = this.appData.versionName;
        final String str4 = c;
        final String str5 = str2;
        final String str6 = str3;
        final String b = this.idManager.mo64b();
        final int a = C0027l.m90a(this.appData.installerPackageName).mo51a();
        writeSessionPartFile(str, SESSION_APP_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionApp(codedOutputStream, str4, CrashlyticsController.this.appData.apiKey, str5, str6, b, a, CrashlyticsController.this.unityVersion);
            }
        });
        writeFile(str, "SessionApp.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("app_identifier", str4);
                        put("api_key", CrashlyticsController.this.appData.apiKey);
                        put("version_code", str5);
                        put("version_name", str6);
                        put("install_uuid", b);
                        put("delivery_mechanism", Integer.valueOf(a));
                        put("unity_version", TextUtils.isEmpty(CrashlyticsController.this.unityVersion) ? "" : CrashlyticsController.this.unityVersion);
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionOS(String str) {
        final boolean g = C0020i.m76g(this.crashlyticsCore.getContext());
        writeSessionPartFile(str, SESSION_OS_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionOS(codedOutputStream, Build.VERSION.RELEASE, Build.VERSION.CODENAME, g);
            }
        });
        writeFile(str, "SessionOS.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("version", Build.VERSION.RELEASE);
                        put("build_version", Build.VERSION.CODENAME);
                        put("is_rooted", Boolean.valueOf(g));
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionDevice(String str) {
        String str2 = str;
        Context context = this.crashlyticsCore.getContext();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a = C0020i.m39a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b = C0020i.m62b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean f = C0020i.m75f(context);
        Map<C0036r.C0037a, String> h = this.idManager.mo70h();
        int h2 = C0020i.m77h(context);
        final int i = a;
        final int i2 = availableProcessors;
        final long j = b;
        final long j2 = blockCount;
        final boolean z = f;
        long j3 = b;
        C064823 r15 = r0;
        final Map<C0036r.C0037a, String> map = h;
        int i3 = availableProcessors;
        String str3 = SESSION_DEVICE_TAG;
        final int i4 = h2;
        C064823 r0 = new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionDevice(codedOutputStream, i, Build.MODEL, i2, j, j2, z, map, i4, Build.MANUFACTURER, Build.PRODUCT);
            }
        };
        writeSessionPartFile(str2, str3, r15);
        final int i5 = i3;
        final long j4 = j3;
        writeFile(str2, "SessionDevice.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("arch", Integer.valueOf(i));
                        put("build_model", Build.MODEL);
                        put("available_processors", Integer.valueOf(i5));
                        put("total_ram", Long.valueOf(j4));
                        put("disk_space", Long.valueOf(j2));
                        put("is_emulator", Boolean.valueOf(z));
                        put("ids", map);
                        put("state", Integer.valueOf(i4));
                        put("build_manufacturer", Build.MANUFACTURER);
                        put("build_product", Build.PRODUCT);
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionUser(String str) {
        final UserMetaData userMetaData = getUserMetaData(str);
        writeSessionPartFile(str, SESSION_USER_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionUser(codedOutputStream, userMetaData.f571id, userMetaData.name, userMetaData.email);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.util.TreeMap} */
    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeSessionEvent(com.crashlytics.android.core.CodedOutputStream r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) {
        /*
            r24 = this;
            r0 = r24
            com.crashlytics.android.core.TrimmedThrowableData r5 = new com.crashlytics.android.core.TrimmedThrowableData
            com.crashlytics.android.core.StackTraceTrimmingStrategy r1 = r0.stackTraceTrimmingStrategy
            r2 = r28
            r5.<init>(r2, r1)
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.crashlyticsCore
            android.content.Context r1 = r1.getContext()
            long r2 = r26.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Float r16 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m69c((android.content.Context) r1)
            com.crashlytics.android.core.DevicePowerStateListener r4 = r0.devicePowerStateListener
            boolean r4 = r4.isPowerConnected()
            int r17 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m41a((android.content.Context) r1, (boolean) r4)
            boolean r18 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m72d((android.content.Context) r1)
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r13 = r4.orientation
            long r6 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m62b()
            long r8 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m63b((android.content.Context) r1)
            long r19 = r6 - r8
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            long r21 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m68c((java.lang.String) r4)
            java.lang.String r4 = r1.getPackageName()
            android.app.ActivityManager$RunningAppProcessInfo r12 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m43a((java.lang.String) r4, (android.content.Context) r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r7 = r5.stacktrace
            com.crashlytics.android.core.AppData r4 = r0.appData
            java.lang.String r15 = r4.buildId
            a.a.a.a.a.b.r r4 = r0.idManager
            java.lang.String r14 = r4.mo65c()
            r4 = 0
            if (r30 == 0) goto L_0x00a1
            java.util.Map r8 = java.lang.Thread.getAllStackTraces()
            int r10 = r8.size()
            java.lang.Thread[] r10 = new java.lang.Thread[r10]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0078:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x009e
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r23 = r11.getKey()
            java.lang.Thread r23 = (java.lang.Thread) r23
            r10[r4] = r23
            com.crashlytics.android.core.StackTraceTrimmingStrategy r6 = r0.stackTraceTrimmingStrategy
            java.lang.Object r11 = r11.getValue()
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            java.lang.StackTraceElement[] r6 = r6.getTrimmedStackTrace(r11)
            r9.add(r6)
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0078
        L_0x009e:
            r6 = 1
            r8 = r10
            goto L_0x00a5
        L_0x00a1:
            r6 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r4]
            r8 = r4
        L_0x00a5:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m61a((android.content.Context) r1, (java.lang.String) r4, (boolean) r6)
            if (r1 != 0) goto L_0x00b4
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
        L_0x00b2:
            r10 = r1
            goto L_0x00c8
        L_0x00b4:
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.crashlyticsCore
            java.util.Map r1 = r1.getAttributes()
            if (r1 == 0) goto L_0x00b2
            int r4 = r1.size()
            if (r4 <= r6) goto L_0x00b2
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r10 = r4
        L_0x00c8:
            com.crashlytics.android.core.LogFileManager r11 = r0.logFileManager
            r1 = r25
            r4 = r29
            r6 = r27
            com.crashlytics.android.core.SessionProtobufHelper.writeSessionEvent(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.writeSessionEvent(com.crashlytics.android.core.CodedOutputStream, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    private void writeSessionPartsToSessionFile(File file, String str, int i) {
        C0153l g = C0139c.m394g();
        g.mo281a(CrashlyticsCore.TAG, "Collecting session parts for ID " + str);
        File[] listFilesMatching = listFilesMatching((FilenameFilter) new FileNameContainsFilter(str + SESSION_FATAL_TAG));
        boolean z = listFilesMatching != null && listFilesMatching.length > 0;
        C0139c.m394g().mo281a(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        File[] listFilesMatching2 = listFilesMatching((FilenameFilter) new FileNameContainsFilter(str + SESSION_NON_FATAL_TAG));
        boolean z2 = listFilesMatching2 != null && listFilesMatching2.length > 0;
        C0139c.m394g().mo281a(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (z || z2) {
            synthesizeSessionFile(file, str, getTrimmedNonFatalFiles(str, listFilesMatching2, i), z ? listFilesMatching[0] : null);
        } else {
            C0153l g2 = C0139c.m394g();
            g2.mo281a(CrashlyticsCore.TAG, "No events present for session ID " + str);
        }
        C0153l g3 = C0139c.m394g();
        g3.mo281a(CrashlyticsCore.TAG, "Removing session part files for ID " + str);
        deleteSessionPartFilesFor(str);
    }

    private void synthesizeSessionFile(File file, String str, File[] fileArr, File file2) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream codedOutputStream;
        boolean z = file2 != null;
        File fatalSessionFilesDir = z ? getFatalSessionFilesDir() : getNonFatalSessionFilesDir();
        if (!fatalSessionFilesDir.exists()) {
            fatalSessionFilesDir.mkdirs();
        }
        CodedOutputStream codedOutputStream2 = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(fatalSessionFilesDir, str);
            try {
                codedOutputStream = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                try {
                    C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Collecting SessionStart data for session ID " + str);
                    writeToCosFromFile(codedOutputStream, file);
                    codedOutputStream.writeUInt64(4, new Date().getTime() / 1000);
                    codedOutputStream.writeBool(5, z);
                    codedOutputStream.writeUInt32(11, 1);
                    codedOutputStream.writeEnum(12, 3);
                    writeInitialPartsTo(codedOutputStream, str);
                    writeNonFatalEventsTo(codedOutputStream, fileArr, str);
                    if (z) {
                        writeToCosFromFile(codedOutputStream, file2);
                    }
                    C0020i.m59a((Flushable) codedOutputStream, "Error flushing session file stream");
                    C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close CLS file");
                } catch (Exception e) {
                    e = e;
                    codedOutputStream2 = codedOutputStream;
                    try {
                        C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Failed to write session file for session ID: " + str, e);
                        C0020i.m59a((Flushable) codedOutputStream2, "Error flushing session file stream");
                        closeWithoutRenamingOrLog(clsFileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        codedOutputStream = codedOutputStream2;
                        C0020i.m59a((Flushable) codedOutputStream, "Error flushing session file stream");
                        C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close CLS file");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C0020i.m59a((Flushable) codedOutputStream, "Error flushing session file stream");
                    C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close CLS file");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Failed to write session file for session ID: " + str, e);
                C0020i.m59a((Flushable) codedOutputStream2, "Error flushing session file stream");
                closeWithoutRenamingOrLog(clsFileOutputStream);
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Failed to write session file for session ID: " + str, e);
            C0020i.m59a((Flushable) codedOutputStream2, "Error flushing session file stream");
            closeWithoutRenamingOrLog(clsFileOutputStream);
        } catch (Throwable th3) {
            th = th3;
            codedOutputStream = null;
            clsFileOutputStream = null;
            C0020i.m59a((Flushable) codedOutputStream, "Error flushing session file stream");
            C0020i.m58a((Closeable) clsFileOutputStream, "Failed to close CLS file");
            throw th;
        }
    }

    private static void writeNonFatalEventsTo(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        Arrays.sort(fileArr, C0020i.f19a);
        for (File file : fileArr) {
            try {
                C0139c.m394g().mo281a(CrashlyticsCore.TAG, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                writeToCosFromFile(codedOutputStream, file);
            } catch (Exception e) {
                C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Error writting non-fatal to session.", e);
            }
        }
    }

    private void writeInitialPartsTo(CodedOutputStream codedOutputStream, String str) {
        for (String str2 : INITIAL_SESSION_PART_TAGS) {
            File[] listFilesMatching = listFilesMatching((FilenameFilter) new FileNameContainsFilter(str + str2 + ClsFileOutputStream.SESSION_FILE_EXTENSION));
            if (listFilesMatching.length == 0) {
                C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Can't find " + str2 + " data for session ID " + str, (Throwable) null);
            } else {
                C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Collecting " + str2 + " data for session ID " + str);
                writeToCosFromFile(codedOutputStream, listFilesMatching[0]);
            }
        }
    }

    private static void writeToCosFromFile(CodedOutputStream codedOutputStream, File file) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Tried to include a file that doesn't exist: " + file.getName(), (Throwable) null);
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                copyToCodedOutputStream(fileInputStream, codedOutputStream, (int) file.length());
                C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    private static void copyToCodedOutputStream(InputStream inputStream, CodedOutputStream codedOutputStream, int i) {
        int read;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length && (read = inputStream.read(bArr, i2, bArr.length - i2)) >= 0) {
            i2 += read;
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private UserMetaData getUserMetaData(String str) {
        if (isHandlingException()) {
            return new UserMetaData(this.crashlyticsCore.getUserIdentifier(), this.crashlyticsCore.getUserName(), this.crashlyticsCore.getUserEmail());
        }
        return new MetaDataStore(getFilesDir()).readUserData(str);
    }

    /* access modifiers changed from: package-private */
    public boolean isHandlingException() {
        return this.crashHandler != null && this.crashHandler.isHandlingException();
    }

    /* access modifiers changed from: package-private */
    public File getFilesDir() {
        return this.fileStore.mo254a();
    }

    /* access modifiers changed from: package-private */
    public File getFatalSessionFilesDir() {
        return new File(getFilesDir(), FATAL_SESSION_DIR);
    }

    /* access modifiers changed from: package-private */
    public File getNonFatalSessionFilesDir() {
        return new File(getFilesDir(), NONFATAL_SESSION_DIR);
    }

    /* access modifiers changed from: package-private */
    public File getInvalidFilesDir() {
        return new File(getFilesDir(), INVALID_CLS_CACHE_DIR);
    }

    /* access modifiers changed from: package-private */
    public void registerAnalyticsEventListener(C0132t tVar) {
        if (tVar.f282d.f251e && this.appMeasurementEventListenerRegistrar.register()) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Registered Firebase Analytics event listener");
        }
    }

    /* access modifiers changed from: package-private */
    public void registerDevicePowerStateListener() {
        this.devicePowerStateListener.initialize();
    }

    /* access modifiers changed from: private */
    public boolean shouldPromptUserBeforeSendingCrashReports(C0132t tVar) {
        if (tVar != null && tVar.f282d.f247a && !this.preferenceManager.shouldAlwaysSendReports()) {
            return true;
        }
        return false;
    }

    private CreateReportSpiCall getCreateReportSpiCall(String str, String str2) {
        String b = C0020i.m65b(this.crashlyticsCore.getContext(), CRASHLYTICS_API_ENDPOINT);
        return new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(this.crashlyticsCore, b, str, this.httpRequestFactory), new NativeCreateReportSpiCall(this.crashlyticsCore, b, str2, this.httpRequestFactory));
    }

    /* access modifiers changed from: private */
    public void sendSessionReports(C0132t tVar) {
        if (tVar == null) {
            C0139c.m394g().mo288d(CrashlyticsCore.TAG, "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context context = this.crashlyticsCore.getContext();
        ReportUploader reportUploader = new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(tVar.f279a.f233d, tVar.f279a.f234e), this.reportFilesProvider, this.handlingExceptionCheck);
        for (File sessionReport : listCompleteSessionFiles()) {
            this.backgroundWorker.submit((Runnable) new SendReportRunnable(context, new SessionReport(sessionReport, SEND_AT_CRASHTIME_HEADER), reportUploader));
        }
    }

    private static void recordLoggedExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) C0139c.m385a(Answers.class);
        if (answers == null) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new C0023j.C0025b(str, str2));
        }
    }

    private static void recordFatalExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) C0139c.m385a(Answers.class);
        if (answers == null) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new C0023j.C0024a(str, str2));
        }
    }

    /* access modifiers changed from: private */
    public void recordFatalFirebaseEvent(long j) {
        if (firebaseCrashExists()) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
        } else if (this.firebaseAnalyticsLogger != null) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt(FIREBASE_REALTIME, 1);
            bundle.putInt(FIREBASE_CRASH_TYPE, 1);
            bundle.putLong(FIREBASE_TIMESTAMP, j);
            this.firebaseAnalyticsLogger.logEvent(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, FIREBASE_APPLICATION_EXCEPTION, bundle);
        } else {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }

    private boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final class ReportUploaderHandlingExceptionCheck implements ReportUploader.HandlingExceptionCheck {
        private ReportUploaderHandlingExceptionCheck() {
        }

        public boolean isHandlingException() {
            return CrashlyticsController.this.isHandlingException();
        }
    }

    private final class ReportUploaderFilesProvider implements ReportUploader.ReportFilesProvider {
        private ReportUploaderFilesProvider() {
        }

        public File[] getCompleteSessionFiles() {
            return CrashlyticsController.this.listCompleteSessionFiles();
        }

        public File[] getInvalidSessionFiles() {
            return CrashlyticsController.this.getInvalidFilesDir().listFiles();
        }

        public File[] getNativeReportFiles() {
            return CrashlyticsController.this.listNativeSessionFileDirectories();
        }
    }

    private static final class PrivacyDialogCheck implements ReportUploader.SendCheck {
        private final C0150i kit;
        /* access modifiers changed from: private */
        public final PreferenceManager preferenceManager;
        private final C0125o promptData;

        public PrivacyDialogCheck(C0150i iVar, PreferenceManager preferenceManager2, C0125o oVar) {
            this.kit = iVar;
            this.preferenceManager = preferenceManager2;
            this.promptData = oVar;
        }

        public boolean canSendReports() {
            Activity b = this.kit.getFabric().mo296b();
            if (b == null || b.isFinishing()) {
                return true;
            }
            final CrashPromptDialog create = CrashPromptDialog.create(b, this.promptData, new CrashPromptDialog.AlwaysSendCallback() {
                public void sendUserReportsWithoutPrompting(boolean z) {
                    PrivacyDialogCheck.this.preferenceManager.setShouldAlwaysSendReports(z);
                }
            });
            b.runOnUiThread(new Runnable() {
                public void run() {
                    create.show();
                }
            });
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Waiting for user opt-in.");
            create.await();
            return create.getOptIn();
        }
    }

    private static final class SendReportRunnable implements Runnable {
        private final Context context;
        private final Report report;
        private final ReportUploader reportUploader;

        public SendReportRunnable(Context context2, Report report2, ReportUploader reportUploader2) {
            this.context = context2;
            this.report = report2;
            this.reportUploader = reportUploader2;
        }

        public void run() {
            if (C0020i.m84o(this.context)) {
                C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Attempting to send crash report at time of crash...");
                this.reportUploader.forceUpload(this.report);
            }
        }
    }

    private static final class LogFileDirectoryProvider implements LogFileManager.DirectoryProvider {
        private static final String LOG_FILES_DIR = "log-files";
        private final C0107a rootFileStore;

        public LogFileDirectoryProvider(C0107a aVar) {
            this.rootFileStore = aVar;
        }

        public File getLogFileDir() {
            File file = new File(this.rootFileStore.mo254a(), LOG_FILES_DIR);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    private static final class DefaultSettingsDataProvider implements CrashlyticsUncaughtExceptionHandler.SettingsDataProvider {
        private DefaultSettingsDataProvider() {
        }

        public C0132t getSettingsData() {
            return C0127q.m357a().mo275b();
        }
    }
}
