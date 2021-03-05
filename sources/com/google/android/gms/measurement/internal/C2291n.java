package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.C0969e;

/* renamed from: com.google.android.gms.measurement.internal.n */
public final class C2291n extends C2238dn {

    /* renamed from: a */
    private final C2292o f8609a = new C2292o(this, mo14231n(), "google_app_measurement_local.db");

    /* renamed from: b */
    private boolean f8610b;

    C2291n(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo14406v() {
        return false;
    }

    @WorkerThread
    /* renamed from: x */
    public final void mo14815x() {
        mo14218b();
        mo14221d();
        try {
            int delete = m11357y().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                mo14235r().mo14838x().mo14842a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            mo14235r().mo14830d_().mo14842a("Error resetting local analytics data. error", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb A[SYNTHETIC, Splitter:B:49:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011f A[SYNTHETIC] */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m11356a(int r18, byte[] r19) {
        /*
            r17 = this;
            r1 = r17
            r17.mo14218b()
            r17.mo14221d()
            boolean r0 = r1.f8610b
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r0 = "type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r3.put(r0, r4)
            java.lang.String r0 = "entry"
            r4 = r19
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0026:
            if (r5 >= r4) goto L_0x0132
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r17.m11357y()     // Catch:{ SQLiteFullException -> 0x0104, SQLiteDatabaseLockedException -> 0x00f2, SQLiteException -> 0x00c7, all -> 0x00c3 }
            if (r9 != 0) goto L_0x0040
            r1.f8610b = r8     // Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r2
        L_0x0038:
            r0 = move-exception
            r12 = r7
        L_0x003a:
            r7 = r9
            goto L_0x00c9
        L_0x003d:
            r0 = move-exception
            goto L_0x0106
        L_0x0040:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
            if (r12 == 0) goto L_0x0061
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            if (r0 == 0) goto L_0x0061
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            goto L_0x0061
        L_0x0058:
            r0 = move-exception
            goto L_0x0127
        L_0x005b:
            r0 = move-exception
            goto L_0x003a
        L_0x005d:
            r0 = move-exception
            r7 = r12
            goto L_0x0106
        L_0x0061:
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x00ab
            com.google.android.gms.measurement.internal.r r0 = r17.mo14235r()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r15 = "Data loss, local db full"
            r0.mo14841a(r15)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r0 = 0
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r0 = "messages"
            java.lang.String r10 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r15 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r11[r2] = r15     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            int r0 = r9.delete(r0, r10, r11)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            long r10 = (long) r0     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.measurement.internal.r r0 = r17.mo14235r()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r4 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r16 = 0
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r0.mo14844a(r15, r4, r2, r10)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        L_0x00ab:
            java.lang.String r0 = "messages"
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            if (r12 == 0) goto L_0x00bb
            r12.close()
        L_0x00bb:
            if (r9 == 0) goto L_0x00c0
            r9.close()
        L_0x00c0:
            return r8
        L_0x00c1:
            r7 = r12
            goto L_0x00f3
        L_0x00c3:
            r0 = move-exception
            r9 = r7
            r12 = r9
            goto L_0x0127
        L_0x00c7:
            r0 = move-exception
            r12 = r7
        L_0x00c9:
            if (r7 == 0) goto L_0x00d8
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x00d8
            r7.endTransaction()     // Catch:{ all -> 0x00d5 }
            goto L_0x00d8
        L_0x00d5:
            r0 = move-exception
            r9 = r7
            goto L_0x0127
        L_0x00d8:
            com.google.android.gms.measurement.internal.r r2 = r17.mo14235r()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo14842a(r4, r0)     // Catch:{ all -> 0x00d5 }
            r1.f8610b = r8     // Catch:{ all -> 0x00d5 }
            if (r12 == 0) goto L_0x00ec
            r12.close()
        L_0x00ec:
            if (r7 == 0) goto L_0x011f
            r7.close()
            goto L_0x011f
        L_0x00f2:
            r9 = r7
        L_0x00f3:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x0125 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00fe
            r7.close()
        L_0x00fe:
            if (r9 == 0) goto L_0x011f
            r9.close()
            goto L_0x011f
        L_0x0104:
            r0 = move-exception
            r9 = r7
        L_0x0106:
            com.google.android.gms.measurement.internal.r r2 = r17.mo14235r()     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()     // Catch:{ all -> 0x0125 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo14842a(r4, r0)     // Catch:{ all -> 0x0125 }
            r1.f8610b = r8     // Catch:{ all -> 0x0125 }
            if (r7 == 0) goto L_0x011a
            r7.close()
        L_0x011a:
            if (r9 == 0) goto L_0x011f
            r9.close()
        L_0x011f:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0026
        L_0x0125:
            r0 = move-exception
            r12 = r7
        L_0x0127:
            if (r12 == 0) goto L_0x012c
            r12.close()
        L_0x012c:
            if (r9 == 0) goto L_0x0131
            r9.close()
        L_0x0131:
            throw r0
        L_0x0132:
            com.google.android.gms.measurement.internal.r r0 = r17.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo14841a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2291n.m11356a(int, byte[]):boolean");
    }

    /* renamed from: a */
    public final boolean mo14812a(zzag zzag) {
        Parcel obtain = Parcel.obtain();
        zzag.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m11356a(0, marshall);
        }
        mo14235r().mo14833i().mo14841a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo14813a(zzfv zzfv) {
        Parcel obtain = Parcel.obtain();
        zzfv.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m11356a(1, marshall);
        }
        mo14235r().mo14833i().mo14841a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo14814a(zzo zzo) {
        mo14233p();
        byte[] a = C2264el.m11028a((Parcelable) zzo);
        if (a.length <= 131072) {
            return m11356a(2, a);
        }
        mo14235r().mo14833i().mo14841a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: android.database.Cursor} */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:54|55|56|57) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:69|70|71|72) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:41|42|43|44|165) */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0199, code lost:
        if (r2.inTransaction() != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x019b, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x019f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b2, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01b7, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01c5, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ca, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r9 = r2;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r0 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        mo14235r().mo14830d_().mo14841a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r13.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        mo14235r().mo14830d_().mo14841a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        mo14235r().mo14830d_().mo14841a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x010e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0195 A[SYNTHETIC, Splitter:B:112:0x0195] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0031] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> mo14811a(int r20) {
        /*
            r19 = this;
            r1 = r19
            r19.mo14221d()
            r19.mo14218b()
            boolean r0 = r1.f8610b
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.Context r0 = r19.mo14231n()
            java.lang.String r4 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r4)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0024
            return r3
        L_0x0024:
            r4 = 5
            r5 = 0
            r6 = 0
            r7 = 5
        L_0x0028:
            if (r6 >= r4) goto L_0x0202
            r8 = 1
            android.database.sqlite.SQLiteDatabase r15 = r19.m11357y()     // Catch:{ SQLiteFullException -> 0x01d2, SQLiteDatabaseLockedException -> 0x01bb, SQLiteException -> 0x0190, all -> 0x018b }
            if (r15 != 0) goto L_0x0044
            r1.f8610b = r8     // Catch:{ SQLiteFullException -> 0x0041, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x0039 }
            if (r15 == 0) goto L_0x0038
            r15.close()
        L_0x0038:
            return r2
        L_0x0039:
            r0 = move-exception
            r9 = r2
            r2 = r15
            goto L_0x0193
        L_0x003e:
            r2 = r15
            goto L_0x0184
        L_0x0041:
            r0 = move-exception
            goto L_0x01d5
        L_0x0044:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x0181, all -> 0x017e }
            java.lang.String r10 = "messages"
            r0 = 3
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x0181, all -> 0x017e }
            java.lang.String r0 = "rowid"
            r11[r5] = r0     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x0181, all -> 0x017e }
            java.lang.String r0 = "type"
            r11[r8] = r0     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x0181, all -> 0x017e }
            java.lang.String r0 = "entry"
            r14 = 2
            r11[r14] = r0     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x0181, all -> 0x017e }
            r12 = 0
            r13 = 0
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r9 = 100
            java.lang.String r18 = java.lang.Integer.toString(r9)     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x0181, all -> 0x017e }
            r9 = r15
            r4 = 2
            r14 = r0
            r2 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteFullException -> 0x017b, SQLiteDatabaseLockedException -> 0x0184, SQLiteException -> 0x0179, all -> 0x0177 }
            r10 = -1
        L_0x0076:
            boolean r0 = r9.moveToNext()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            if (r0 == 0) goto L_0x0139
            long r10 = r9.getLong(r5)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            int r0 = r9.getInt(r8)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            byte[] r12 = r9.getBlob(r4)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            if (r0 != 0) goto L_0x00bd
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            int r0 = r12.length     // Catch:{ a -> 0x00a8 }
            r13.unmarshall(r12, r5, r0)     // Catch:{ a -> 0x00a8 }
            r13.setDataPosition(r5)     // Catch:{ a -> 0x00a8 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r0 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ a -> 0x00a8 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ a -> 0x00a8 }
            com.google.android.gms.measurement.internal.zzag r0 = (com.google.android.gms.measurement.internal.zzag) r0     // Catch:{ a -> 0x00a8 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            if (r0 == 0) goto L_0x0076
            r3.add(r0)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            goto L_0x0076
        L_0x00a6:
            r0 = move-exception
            goto L_0x00b9
        L_0x00a8:
            com.google.android.gms.measurement.internal.r r0 = r19.mo14235r()     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x00a6 }
            java.lang.String r12 = "Failed to load event from local database"
            r0.mo14841a(r12)     // Catch:{ all -> 0x00a6 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            goto L_0x0076
        L_0x00b9:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            throw r0     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
        L_0x00bd:
            if (r0 != r8) goto L_0x00f3
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            int r0 = r12.length     // Catch:{ a -> 0x00d8 }
            r13.unmarshall(r12, r5, r0)     // Catch:{ a -> 0x00d8 }
            r13.setDataPosition(r5)     // Catch:{ a -> 0x00d8 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzfv> r0 = com.google.android.gms.measurement.internal.zzfv.CREATOR     // Catch:{ a -> 0x00d8 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ a -> 0x00d8 }
            com.google.android.gms.measurement.internal.zzfv r0 = (com.google.android.gms.measurement.internal.zzfv) r0     // Catch:{ a -> 0x00d8 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            goto L_0x00e9
        L_0x00d6:
            r0 = move-exception
            goto L_0x00ef
        L_0x00d8:
            com.google.android.gms.measurement.internal.r r0 = r19.mo14235r()     // Catch:{ all -> 0x00d6 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x00d6 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.mo14841a(r12)     // Catch:{ all -> 0x00d6 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            r0 = 0
        L_0x00e9:
            if (r0 == 0) goto L_0x0076
            r3.add(r0)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            goto L_0x0076
        L_0x00ef:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            throw r0     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
        L_0x00f3:
            if (r0 != r4) goto L_0x012a
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            int r0 = r12.length     // Catch:{ a -> 0x010e }
            r13.unmarshall(r12, r5, r0)     // Catch:{ a -> 0x010e }
            r13.setDataPosition(r5)     // Catch:{ a -> 0x010e }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzo> r0 = com.google.android.gms.measurement.internal.zzo.CREATOR     // Catch:{ a -> 0x010e }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ a -> 0x010e }
            com.google.android.gms.measurement.internal.zzo r0 = (com.google.android.gms.measurement.internal.zzo) r0     // Catch:{ a -> 0x010e }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            goto L_0x011f
        L_0x010c:
            r0 = move-exception
            goto L_0x0126
        L_0x010e:
            com.google.android.gms.measurement.internal.r r0 = r19.mo14235r()     // Catch:{ all -> 0x010c }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ all -> 0x010c }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.mo14841a(r12)     // Catch:{ all -> 0x010c }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            r0 = 0
        L_0x011f:
            if (r0 == 0) goto L_0x0076
            r3.add(r0)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            goto L_0x0076
        L_0x0126:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            throw r0     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
        L_0x012a:
            com.google.android.gms.measurement.internal.r r0 = r19.mo14235r()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            java.lang.String r12 = "Unknown record type in local database"
            r0.mo14841a(r12)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            goto L_0x0076
        L_0x0139:
            java.lang.String r0 = "messages"
            java.lang.String r4 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            java.lang.String r10 = java.lang.Long.toString(r10)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            r12[r5] = r10     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            int r0 = r2.delete(r0, r4, r12)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            int r4 = r3.size()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            if (r0 >= r4) goto L_0x015c
            com.google.android.gms.measurement.internal.r r0 = r19.mo14235r()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            java.lang.String r4 = "Fewer entries removed from local database than expected"
            r0.mo14841a(r4)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
        L_0x015c:
            r2.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            r2.endTransaction()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016d }
            if (r9 == 0) goto L_0x0167
            r9.close()
        L_0x0167:
            if (r2 == 0) goto L_0x016c
            r2.close()
        L_0x016c:
            return r3
        L_0x016d:
            r0 = move-exception
            goto L_0x0193
        L_0x016f:
            r4 = r2
            r2 = r9
            goto L_0x01bd
        L_0x0172:
            r0 = move-exception
            r15 = r2
            r2 = r9
            goto L_0x01d5
        L_0x0177:
            r0 = move-exception
            goto L_0x018d
        L_0x0179:
            r0 = move-exception
            goto L_0x0192
        L_0x017b:
            r0 = move-exception
            r15 = r2
            goto L_0x0189
        L_0x017e:
            r0 = move-exception
            r2 = r15
            goto L_0x018d
        L_0x0181:
            r0 = move-exception
            r2 = r15
            goto L_0x0192
        L_0x0184:
            r4 = r2
            r2 = 0
            goto L_0x01bd
        L_0x0187:
            r0 = move-exception
            r2 = r15
        L_0x0189:
            r2 = 0
            goto L_0x01d5
        L_0x018b:
            r0 = move-exception
            r2 = 0
        L_0x018d:
            r9 = 0
            goto L_0x01f7
        L_0x0190:
            r0 = move-exception
            r2 = 0
        L_0x0192:
            r9 = 0
        L_0x0193:
            if (r2 == 0) goto L_0x01a1
            boolean r4 = r2.inTransaction()     // Catch:{ all -> 0x019f }
            if (r4 == 0) goto L_0x01a1
            r2.endTransaction()     // Catch:{ all -> 0x019f }
            goto L_0x01a1
        L_0x019f:
            r0 = move-exception
            goto L_0x01f7
        L_0x01a1:
            com.google.android.gms.measurement.internal.r r4 = r19.mo14235r()     // Catch:{ all -> 0x019f }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ all -> 0x019f }
            java.lang.String r10 = "Error reading entries from local database"
            r4.mo14842a(r10, r0)     // Catch:{ all -> 0x019f }
            r1.f8610b = r8     // Catch:{ all -> 0x019f }
            if (r9 == 0) goto L_0x01b5
            r9.close()
        L_0x01b5:
            if (r2 == 0) goto L_0x01ee
            r2.close()
            goto L_0x01ee
        L_0x01bb:
            r2 = 0
            r4 = 0
        L_0x01bd:
            long r8 = (long) r7
            android.os.SystemClock.sleep(r8)     // Catch:{ all -> 0x01ce }
            int r7 = r7 + 20
            if (r2 == 0) goto L_0x01c8
            r2.close()
        L_0x01c8:
            if (r4 == 0) goto L_0x01ee
            r4.close()
            goto L_0x01ee
        L_0x01ce:
            r0 = move-exception
            r9 = r2
            r2 = r4
            goto L_0x01f7
        L_0x01d2:
            r0 = move-exception
            r2 = 0
            r15 = 0
        L_0x01d5:
            com.google.android.gms.measurement.internal.r r4 = r19.mo14235r()     // Catch:{ all -> 0x01f4 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ all -> 0x01f4 }
            java.lang.String r9 = "Error reading entries from local database"
            r4.mo14842a(r9, r0)     // Catch:{ all -> 0x01f4 }
            r1.f8610b = r8     // Catch:{ all -> 0x01f4 }
            if (r2 == 0) goto L_0x01e9
            r2.close()
        L_0x01e9:
            if (r15 == 0) goto L_0x01ee
            r15.close()
        L_0x01ee:
            int r6 = r6 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x01f4:
            r0 = move-exception
            r9 = r2
            r2 = r15
        L_0x01f7:
            if (r9 == 0) goto L_0x01fc
            r9.close()
        L_0x01fc:
            if (r2 == 0) goto L_0x0201
            r2.close()
        L_0x0201:
            throw r0
        L_0x0202:
            com.google.android.gms.measurement.internal.r r0 = r19.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo14841a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2291n.mo14811a(int):java.util.List");
    }

    @WorkerThread
    /* renamed from: y */
    private final SQLiteDatabase m11357y() {
        if (this.f8610b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f8609a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f8610b = true;
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2143a mo14222e() {
        return super.mo14222e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2200cc mo14223f() {
        return super.mo14223f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2289l mo14224g() {
        return super.mo14224g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2217ct mo14225h() {
        return super.mo14225h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C2213cp mo14226i() {
        return super.mo14226i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C2291n mo14227j() {
        return super.mo14227j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C2242dr mo14228k() {
        return super.mo14228k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
