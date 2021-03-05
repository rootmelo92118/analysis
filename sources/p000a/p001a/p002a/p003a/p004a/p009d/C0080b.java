package p000a.p001a.p002a.p003a.p004a.p009d;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0026k;

/* renamed from: a.a.a.a.a.d.b */
/* compiled from: EventsFilesManager */
public abstract class C0080b<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    protected final Context context;
    protected final C0026k currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    protected final C0083c eventStorage;
    protected volatile long lastRollOverTime;
    protected final List<C0084d> rollOverListeners = new CopyOnWriteArrayList();
    protected final C0079a<T> transform;

    /* access modifiers changed from: protected */
    public abstract String generateUniqueRollOverFileName();

    /* access modifiers changed from: protected */
    public int getMaxByteSizePerFile() {
        return MAX_BYTE_SIZE_PER_FILE;
    }

    public C0080b(Context context2, C0079a<T> aVar, C0026k kVar, C0083c cVar, int i) {
        this.context = context2.getApplicationContext();
        this.transform = aVar;
        this.eventStorage = cVar;
        this.currentTimeProvider = kVar;
        this.lastRollOverTime = this.currentTimeProvider.mo50a();
        this.defaultMaxFilesToKeep = i;
    }

    public void writeEvent(T t) {
        byte[] bytes = this.transform.toBytes(t);
        rollFileOverIfNeeded(bytes.length);
        this.eventStorage.mo183a(bytes);
    }

    public void registerRollOverListener(C0084d dVar) {
        if (dVar != null) {
            this.rollOverListeners.add(dVar);
        }
    }

    public boolean rollFileOver() {
        String str;
        boolean z = true;
        if (!this.eventStorage.mo185b()) {
            str = generateUniqueRollOverFileName();
            this.eventStorage.mo181a(str);
            C0020i.m54a(this.context, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.lastRollOverTime = this.currentTimeProvider.mo50a();
        } else {
            str = null;
            z = false;
        }
        triggerRollOverOnListeners(str);
        return z;
    }

    private void rollFileOverIfNeeded(int i) {
        if (!this.eventStorage.mo184a(i, getMaxByteSizePerFile())) {
            C0020i.m54a(this.context, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.eventStorage.mo179a()), Integer.valueOf(i), Integer.valueOf(getMaxByteSizePerFile())}));
            rollFileOver();
        }
    }

    /* access modifiers changed from: protected */
    public int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    private void triggerRollOverOnListeners(String str) {
        for (C0084d onRollOver : this.rollOverListeners) {
            try {
                onRollOver.onRollOver(str);
            } catch (Exception e) {
                C0020i.m56a(this.context, "One of the roll over listeners threw an exception", (Throwable) e);
            }
        }
    }

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.mo180a(1);
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.mo182a(list);
    }

    public void deleteAllEventsFiles() {
        this.eventStorage.mo182a(this.eventStorage.mo186c());
        this.eventStorage.mo187d();
    }

    public void deleteOldestInRollOverIfOverMax() {
        List<File> c = this.eventStorage.mo186c();
        int maxFilesToKeep = getMaxFilesToKeep();
        if (c.size() > maxFilesToKeep) {
            int size = c.size() - maxFilesToKeep;
            C0020i.m55a(this.context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(c.size()), Integer.valueOf(maxFilesToKeep), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new Comparator<C0082a>() {
                /* renamed from: a */
                public int compare(C0082a aVar, C0082a aVar2) {
                    return (int) (aVar.f153b - aVar2.f153b);
                }
            });
            for (File next : c) {
                treeSet.add(new C0082a(next, parseCreationTimestampFromFileName(next.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0082a) it.next()).f152a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.eventStorage.mo182a((List<File>) arrayList);
        }
    }

    public long parseCreationTimestampFromFileName(String str) {
        String[] split = str.split(ROLL_OVER_FILE_NAME_SEPARATOR);
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a.a.a.a.a.d.b$a */
    /* compiled from: EventsFilesManager */
    static class C0082a {

        /* renamed from: a */
        final File f152a;

        /* renamed from: b */
        final long f153b;

        public C0082a(File file, long j) {
            this.f152a = file;
            this.f153b = j;
        }
    }
}
