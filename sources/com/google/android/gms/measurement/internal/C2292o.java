package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.o */
final class C2292o extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C2291n f8611a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2292o(C2291n nVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f8611a = nVar;
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f8611a.mo14235r().mo14830d_().mo14841a("Opening the local database failed, dropping and recreating it");
            if (!this.f8611a.mo14231n().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f8611a.mo14235r().mo14830d_().mo14842a("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f8611a.mo14235r().mo14830d_().mo14842a("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    @android.support.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r8) {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 >= r1) goto L_0x0020
            r0 = 0
            java.lang.String r1 = "PRAGMA journal_mode=memory"
            android.database.Cursor r1 = r8.rawQuery(r1, r0)     // Catch:{ all -> 0x0019 }
            r1.moveToFirst()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0020
            r1.close()
            goto L_0x0020
        L_0x0016:
            r8 = move-exception
            r0 = r1
            goto L_0x001a
        L_0x0019:
            r8 = move-exception
        L_0x001a:
            if (r0 == 0) goto L_0x001f
            r0.close()
        L_0x001f:
            throw r8
        L_0x0020:
            com.google.android.gms.measurement.internal.n r0 = r7.f8611a
            com.google.android.gms.measurement.internal.r r1 = r0.mo14235r()
            java.lang.String r3 = "messages"
            java.lang.String r4 = "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)"
            java.lang.String r5 = "type,entry"
            r6 = 0
            r2 = r8
            com.google.android.gms.measurement.internal.C2280fa.m11268a(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2292o.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C2280fa.m11267a(this.f8611a.mo14235r(), sQLiteDatabase);
    }
}
