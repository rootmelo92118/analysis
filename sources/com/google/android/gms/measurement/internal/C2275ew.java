package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.measurement.C1904ax;
import com.google.android.gms.internal.measurement.C1905ay;
import com.google.android.gms.internal.measurement.C1909bb;
import com.google.android.gms.internal.measurement.C1916bi;
import com.google.android.gms.internal.measurement.C1917bj;
import com.google.android.gms.internal.measurement.C1919bl;
import com.google.android.gms.internal.measurement.C2107hw;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ew */
final class C2275ew extends C2253eb {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f8488b = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String[] f8489c = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String[] f8490d = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String[] f8491e = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f8492f = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f8493g = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: h */
    private final C2278ez f8494h = new C2278ez(this, mo14231n(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2248dx f8495i = new C2248dx(mo14230m());

    C2275ew(C2254ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14289e() {
        return false;
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo14782f() {
        mo14508k();
        mo14787y().beginTransaction();
    }

    @WorkerThread
    /* renamed from: w */
    public final void mo14785w() {
        mo14508k();
        mo14787y().setTransactionSuccessful();
    }

    @WorkerThread
    /* renamed from: x */
    public final void mo14786x() {
        mo14508k();
        mo14787y().endTransaction();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    @android.support.annotation.WorkerThread
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m11219b(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.mo14787y()
            r1 = 0
            android.database.Cursor r5 = r0.rawQuery(r4, r5)     // Catch:{ SQLiteException -> 0x002a }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            if (r0 == 0) goto L_0x001a
            r0 = 0
            long r0 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            if (r5 == 0) goto L_0x0019
            r5.close()
        L_0x0019:
            return r0
        L_0x001a:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            java.lang.String r1 = "Database returned empty set"
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            throw r0     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
        L_0x0022:
            r4 = move-exception
            goto L_0x0039
        L_0x0024:
            r0 = move-exception
            r1 = r5
            goto L_0x002b
        L_0x0027:
            r4 = move-exception
            r5 = r1
            goto L_0x0039
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            com.google.android.gms.measurement.internal.r r5 = r3.mo14235r()     // Catch:{ all -> 0x0027 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo14830d_()     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "Database error"
            r5.mo14843a(r2, r4, r0)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0039:
            if (r5 == 0) goto L_0x003e
            r5.close()
        L_0x003e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.m11219b(java.lang.String, java.lang.String[]):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m11212a(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.mo14787y()
            r1 = 0
            android.database.Cursor r4 = r0.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0028 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0023, all -> 0x0020 }
            if (r0 == 0) goto L_0x001a
            r5 = 0
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0023, all -> 0x0020 }
            if (r4 == 0) goto L_0x0019
            r4.close()
        L_0x0019:
            return r5
        L_0x001a:
            if (r4 == 0) goto L_0x001f
            r4.close()
        L_0x001f:
            return r5
        L_0x0020:
            r3 = move-exception
            r1 = r4
            goto L_0x0037
        L_0x0023:
            r5 = move-exception
            r1 = r4
            goto L_0x0029
        L_0x0026:
            r3 = move-exception
            goto L_0x0037
        L_0x0028:
            r5 = move-exception
        L_0x0029:
            com.google.android.gms.measurement.internal.r r4 = r2.mo14235r()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "Database error"
            r4.mo14843a(r6, r3, r5)     // Catch:{ all -> 0x0026 }
            throw r5     // Catch:{ all -> 0x0026 }
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.m11212a(java.lang.String, java.lang.String[], long):long");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final SQLiteDatabase mo14787y() {
        mo14221d();
        try {
            return this.f8494h.getWritableDatabase();
        } catch (SQLiteException e) {
            mo14235r().mo14833i().mo14842a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0135  */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2224d mo14755a(java.lang.String r23, java.lang.String r24) {
        /*
            r22 = this;
            r15 = r24
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r23)
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r24)
            r22.mo14221d()
            r22.mo14508k()
            r16 = 0
            android.database.sqlite.SQLiteDatabase r1 = r22.mo14787y()     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r2 = "events"
            r0 = 8
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r0 = "lifetime_count"
            r9 = 0
            r3[r9] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r0 = "current_bundle_count"
            r10 = 1
            r3[r10] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r0 = "last_fire_timestamp"
            r11 = 2
            r3[r11] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r0 = "last_bundled_timestamp"
            r12 = 3
            r3[r12] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r0 = "last_bundled_day"
            r13 = 4
            r3[r13] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r0 = "last_sampled_complex_event_id"
            r14 = 5
            r3[r14] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r0 = "last_sampling_rate"
            r8 = 6
            r3[r8] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r0 = "last_exempt_from_sampling"
            r7 = 7
            r3[r7] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            r5[r9] = r23     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            r6 = 0
            r0 = 0
            r17 = 0
            r7 = r0
            r0 = 6
            r8 = r17
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x010e, all -> 0x010a }
            boolean r1 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            if (r1 != 0) goto L_0x0062
            if (r8 == 0) goto L_0x0061
            r8.close()
        L_0x0061:
            return r16
        L_0x0062:
            long r4 = r8.getLong(r9)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            long r6 = r8.getLong(r10)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            long r19 = r8.getLong(r11)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            boolean r1 = r8.isNull(r12)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            if (r1 == 0) goto L_0x0078
            r1 = 0
        L_0x0076:
            r11 = r1
            goto L_0x007d
        L_0x0078:
            long r1 = r8.getLong(r12)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            goto L_0x0076
        L_0x007d:
            boolean r1 = r8.isNull(r13)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            if (r1 == 0) goto L_0x0086
            r13 = r16
            goto L_0x008f
        L_0x0086:
            long r1 = r8.getLong(r13)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            r13 = r1
        L_0x008f:
            boolean r1 = r8.isNull(r14)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            if (r1 == 0) goto L_0x0098
            r14 = r16
            goto L_0x00a1
        L_0x0098:
            long r1 = r8.getLong(r14)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            r14 = r1
        L_0x00a1:
            boolean r1 = r8.isNull(r0)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            if (r1 == 0) goto L_0x00ab
            r0 = r16
        L_0x00a9:
            r1 = 7
            goto L_0x00b4
        L_0x00ab:
            long r0 = r8.getLong(r0)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            goto L_0x00a9
        L_0x00b4:
            boolean r2 = r8.isNull(r1)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            if (r2 != 0) goto L_0x00cc
            long r1 = r8.getLong(r1)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            r17 = 1
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x00c5
            r9 = 1
        L_0x00c5:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            r17 = r1
            goto L_0x00ce
        L_0x00cc:
            r17 = r16
        L_0x00ce:
            com.google.android.gms.measurement.internal.d r18 = new com.google.android.gms.measurement.internal.d     // Catch:{ SQLiteException -> 0x0106, all -> 0x0102 }
            r1 = r18
            r2 = r23
            r3 = r24
            r21 = r8
            r8 = r19
            r10 = r11
            r12 = r13
            r13 = r14
            r14 = r0
            r15 = r17
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r13, r14, r15)     // Catch:{ SQLiteException -> 0x0100 }
            boolean r0 = r21.moveToNext()     // Catch:{ SQLiteException -> 0x0100 }
            if (r0 == 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.r r0 = r22.mo14235r()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r23)     // Catch:{ SQLiteException -> 0x0100 }
            r0.mo14842a(r1, r2)     // Catch:{ SQLiteException -> 0x0100 }
        L_0x00fa:
            if (r21 == 0) goto L_0x00ff
            r21.close()
        L_0x00ff:
            return r18
        L_0x0100:
            r0 = move-exception
            goto L_0x0111
        L_0x0102:
            r0 = move-exception
            r21 = r8
            goto L_0x0133
        L_0x0106:
            r0 = move-exception
            r21 = r8
            goto L_0x0111
        L_0x010a:
            r0 = move-exception
            r21 = r16
            goto L_0x0133
        L_0x010e:
            r0 = move-exception
            r21 = r16
        L_0x0111:
            com.google.android.gms.measurement.internal.r r1 = r22.mo14235r()     // Catch:{ all -> 0x0132 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r23)     // Catch:{ all -> 0x0132 }
            com.google.android.gms.measurement.internal.p r4 = r22.mo14232o()     // Catch:{ all -> 0x0132 }
            r5 = r24
            java.lang.String r4 = r4.mo14824a((java.lang.String) r5)     // Catch:{ all -> 0x0132 }
            r1.mo14844a(r2, r3, r4, r0)     // Catch:{ all -> 0x0132 }
            if (r21 == 0) goto L_0x0131
            r21.close()
        L_0x0131:
            return r16
        L_0x0132:
            r0 = move-exception
        L_0x0133:
            if (r21 == 0) goto L_0x0138
            r21.close()
        L_0x0138:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14755a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14762a(C2224d dVar) {
        C0926p.m1306a(dVar);
        mo14221d();
        mo14508k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", dVar.f8319a);
        contentValues.put("name", dVar.f8320b);
        contentValues.put("lifetime_count", Long.valueOf(dVar.f8321c));
        contentValues.put("current_bundle_count", Long.valueOf(dVar.f8322d));
        contentValues.put("last_fire_timestamp", Long.valueOf(dVar.f8323e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(dVar.f8324f));
        contentValues.put("last_bundled_day", dVar.f8325g);
        contentValues.put("last_sampled_complex_event_id", dVar.f8326h);
        contentValues.put("last_sampling_rate", dVar.f8327i);
        contentValues.put("last_exempt_from_sampling", (dVar.f8328j == null || !dVar.f8328j.booleanValue()) ? null : 1L);
        try {
            if (mo14787y().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                mo14235r().mo14830d_().mo14842a("Failed to insert/update event aggregates (got -1). appId", C2295r.m11413a(dVar.f8319a));
            }
        } catch (SQLiteException e) {
            mo14235r().mo14830d_().mo14843a("Error storing event aggregates. appId", C2295r.m11413a(dVar.f8319a), e);
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14773b(String str, String str2) {
        C0926p.m1308a(str);
        C0926p.m1308a(str2);
        mo14221d();
        mo14508k();
        try {
            mo14235r().mo14838x().mo14842a("Deleted user attribute rows", Integer.valueOf(mo14787y().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            mo14235r().mo14830d_().mo14844a("Error deleting user attribute. appId", C2295r.m11413a(str), mo14232o().mo14826c(str2), e);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo14768a(C2263ek ekVar) {
        C0926p.m1306a(ekVar);
        mo14221d();
        mo14508k();
        if (mo14775c(ekVar.f8442a, ekVar.f8444c) == null) {
            if (C2264el.m11025a(ekVar.f8444c)) {
                if (m11219b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{ekVar.f8442a}) >= 25) {
                    return false;
                }
            } else {
                if (m11219b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{ekVar.f8442a, ekVar.f8443b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ekVar.f8442a);
        contentValues.put("origin", ekVar.f8443b);
        contentValues.put("name", ekVar.f8444c);
        contentValues.put("set_timestamp", Long.valueOf(ekVar.f8445d));
        m11215a(contentValues, "value", ekVar.f8446e);
        try {
            if (mo14787y().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                mo14235r().mo14830d_().mo14842a("Failed to insert/update user property (got -1). appId", C2295r.m11413a(ekVar.f8442a));
            }
        } catch (SQLiteException e) {
            mo14235r().mo14830d_().mo14843a("Error storing user property. appId", C2295r.m11413a(ekVar.f8442a), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    @android.support.annotation.WorkerThread
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2263ek mo14775c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r19)
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r20)
            r18.mo14221d()
            r18.mo14508k()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.mo14787y()     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007f, all -> 0x007b }
            if (r0 != 0) goto L_0x0044
            if (r10 == 0) goto L_0x0043
            r10.close()
        L_0x0043:
            return r9
        L_0x0044:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007f, all -> 0x007b }
            r11 = r18
            java.lang.Object r7 = r11.m11214a((android.database.Cursor) r10, (int) r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.ek r0 = new com.google.android.gms.measurement.internal.ek     // Catch:{ SQLiteException -> 0x0079 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.r r1 = r18.mo14235r()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x0079 }
            r1.mo14842a(r2, r3)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0073:
            if (r10 == 0) goto L_0x0078
            r10.close()
        L_0x0078:
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x008c
        L_0x007b:
            r0 = move-exception
            r11 = r18
            goto L_0x00ac
        L_0x007f:
            r0 = move-exception
            r11 = r18
            goto L_0x008c
        L_0x0083:
            r0 = move-exception
            r11 = r18
            r10 = r9
            goto L_0x00ac
        L_0x0088:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x008c:
            com.google.android.gms.measurement.internal.r r1 = r18.mo14235r()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r19)     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.p r4 = r18.mo14232o()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r4.mo14826c(r8)     // Catch:{ all -> 0x00ab }
            r1.mo14844a(r2, r3, r4, r0)     // Catch:{ all -> 0x00ab }
            if (r10 == 0) goto L_0x00aa
            r10.close()
        L_0x00aa:
            return r9
        L_0x00ab:
            r0 = move-exception
        L_0x00ac:
            if (r10 == 0) goto L_0x00b1
            r10.close()
        L_0x00b1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14775c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ek");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b8  */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C2263ek> mo14758a(java.lang.String r23) {
        /*
            r22 = this;
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r23)
            r22.mo14221d()
            r22.mo14508k()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.mo14787y()     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            r6[r11] = r23     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r3 != 0) goto L_0x0048
            if (r2 == 0) goto L_0x0047
            r2.close()
        L_0x0047:
            return r0
        L_0x0048:
            java.lang.String r18 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            java.lang.String r3 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = ""
        L_0x0054:
            r17 = r3
            long r19 = r2.getLong(r13)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            r3 = r22
            java.lang.Object r21 = r3.m11214a((android.database.Cursor) r2, (int) r14)     // Catch:{ SQLiteException -> 0x008b }
            if (r21 != 0) goto L_0x0074
            com.google.android.gms.measurement.internal.r r4 = r22.mo14235r()     // Catch:{ SQLiteException -> 0x008b }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ SQLiteException -> 0x008b }
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r23)     // Catch:{ SQLiteException -> 0x008b }
            r4.mo14842a(r5, r6)     // Catch:{ SQLiteException -> 0x008b }
            goto L_0x007f
        L_0x0074:
            com.google.android.gms.measurement.internal.ek r4 = new com.google.android.gms.measurement.internal.ek     // Catch:{ SQLiteException -> 0x008b }
            r15 = r4
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch:{ SQLiteException -> 0x008b }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x008b }
        L_0x007f:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x008b }
            if (r4 != 0) goto L_0x0048
            if (r2 == 0) goto L_0x008a
            r2.close()
        L_0x008a:
            return r0
        L_0x008b:
            r0 = move-exception
            goto L_0x009e
        L_0x008d:
            r0 = move-exception
            r3 = r22
            goto L_0x00b6
        L_0x0091:
            r0 = move-exception
            r3 = r22
            goto L_0x009e
        L_0x0095:
            r0 = move-exception
            r3 = r22
            r2 = r1
            goto L_0x00b6
        L_0x009a:
            r0 = move-exception
            r3 = r22
            r2 = r1
        L_0x009e:
            com.google.android.gms.measurement.internal.r r4 = r22.mo14235r()     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ all -> 0x00b5 }
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r23)     // Catch:{ all -> 0x00b5 }
            r4.mo14843a(r5, r6, r0)     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x00b4
            r2.close()
        L_0x00b4:
            return r1
        L_0x00b5:
            r0 = move-exception
        L_0x00b6:
            if (r2 == 0) goto L_0x00bb
            r2.close()
        L_0x00bb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14758a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0124, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0127, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0128, code lost:
        r14 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0142, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014a, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0123 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014a  */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C2263ek> mo14760a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r22)
            r21.mo14221d()
            r21.mo14508k()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0127, all -> 0x0123 }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0123 }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0123 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x011f, all -> 0x0123 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0123 }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x011f, all -> 0x0123 }
            if (r5 != 0) goto L_0x0037
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            goto L_0x0039
        L_0x0032:
            r0 = move-exception
            r14 = r21
            goto L_0x012e
        L_0x0037:
            r5 = r23
        L_0x0039:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
        L_0x0051:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            android.database.sqlite.SQLiteDatabase r12 = r21.mo14787y()     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String r13 = "user_attributes"
            r2 = 4
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String r2 = "name"
            r10 = 0
            r14[r10] = r2     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String r2 = "set_timestamp"
            r8 = 1
            r14[r8] = r2     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String r2 = "value"
            r9 = 2
            r14[r9] = r2     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String r2 = "origin"
            r14[r3] = r2     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0123 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0117 }
            if (r4 != 0) goto L_0x0097
            if (r2 == 0) goto L_0x0096
            r2.close()
        L_0x0096:
            return r0
        L_0x0097:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0117 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00b3
            com.google.android.gms.measurement.internal.r r3 = r21.mo14235r()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0117 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo14830d_()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0117 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0117 }
            r3.mo14842a(r4, r6)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0117 }
            r14 = r21
            goto L_0x0100
        L_0x00b3:
            java.lang.String r7 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0117 }
            long r12 = r2.getLong(r8)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0117 }
            r14 = r21
            java.lang.Object r15 = r14.m11214a((android.database.Cursor) r2, (int) r9)     // Catch:{ SQLiteException -> 0x0115 }
            java.lang.String r6 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x0115 }
            if (r15 != 0) goto L_0x00e5
            com.google.android.gms.measurement.internal.r r4 = r21.mo14235r()     // Catch:{ SQLiteException -> 0x00e2 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ SQLiteException -> 0x00e2 }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r22)     // Catch:{ SQLiteException -> 0x00e2 }
            r12 = r24
            r4.mo14844a(r5, r7, r6, r12)     // Catch:{ SQLiteException -> 0x00e2 }
            r16 = r6
            r12 = 0
            r17 = 1
            r18 = 2
            goto L_0x00fa
        L_0x00e2:
            r0 = move-exception
            r5 = r6
            goto L_0x012f
        L_0x00e5:
            com.google.android.gms.measurement.internal.ek r5 = new com.google.android.gms.measurement.internal.ek     // Catch:{ SQLiteException -> 0x010f }
            r4 = r5
            r3 = r5
            r5 = r22
            r16 = r6
            r17 = 1
            r18 = 2
            r8 = r12
            r12 = 0
            r10 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x010d }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x010d }
        L_0x00fa:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x010d }
            if (r3 != 0) goto L_0x0106
        L_0x0100:
            if (r2 == 0) goto L_0x0105
            r2.close()
        L_0x0105:
            return r0
        L_0x0106:
            r5 = r16
            r3 = 3
            r8 = 1
            r9 = 2
            r10 = 0
            goto L_0x0097
        L_0x010d:
            r0 = move-exception
            goto L_0x0112
        L_0x010f:
            r0 = move-exception
            r16 = r6
        L_0x0112:
            r5 = r16
            goto L_0x012f
        L_0x0115:
            r0 = move-exception
            goto L_0x012f
        L_0x0117:
            r0 = move-exception
            r14 = r21
            goto L_0x0147
        L_0x011b:
            r0 = move-exception
            r14 = r21
            goto L_0x012f
        L_0x011f:
            r0 = move-exception
            r14 = r21
            goto L_0x012c
        L_0x0123:
            r0 = move-exception
            r14 = r21
            goto L_0x0148
        L_0x0127:
            r0 = move-exception
            r14 = r21
            r11 = r22
        L_0x012c:
            r5 = r23
        L_0x012e:
            r2 = r1
        L_0x012f:
            com.google.android.gms.measurement.internal.r r3 = r21.mo14235r()     // Catch:{ all -> 0x0146 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo14830d_()     // Catch:{ all -> 0x0146 }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r22)     // Catch:{ all -> 0x0146 }
            r3.mo14844a(r4, r6, r5, r0)     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0145
            r2.close()
        L_0x0145:
            return r1
        L_0x0146:
            r0 = move-exception
        L_0x0147:
            r1 = r2
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r1.close()
        L_0x014d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14760a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo14769a(zzo zzo) {
        C0926p.m1306a(zzo);
        mo14221d();
        mo14508k();
        if (mo14775c(zzo.f8679a, zzo.f8681c.f8653a) == null) {
            if (m11219b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzo.f8679a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzo.f8679a);
        contentValues.put("origin", zzo.f8680b);
        contentValues.put("name", zzo.f8681c.f8653a);
        m11215a(contentValues, "value", zzo.f8681c.mo14860a());
        contentValues.put("active", Boolean.valueOf(zzo.f8683e));
        contentValues.put("trigger_event_name", zzo.f8684f);
        contentValues.put("trigger_timeout", Long.valueOf(zzo.f8686h));
        mo14233p();
        contentValues.put("timed_out_event", C2264el.m11028a((Parcelable) zzo.f8685g));
        contentValues.put("creation_timestamp", Long.valueOf(zzo.f8682d));
        mo14233p();
        contentValues.put("triggered_event", C2264el.m11028a((Parcelable) zzo.f8687i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzo.f8681c.f8654b));
        contentValues.put("time_to_live", Long.valueOf(zzo.f8688j));
        mo14233p();
        contentValues.put("expired_event", C2264el.m11028a((Parcelable) zzo.f8689k));
        try {
            if (mo14787y().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                mo14235r().mo14830d_().mo14842a("Failed to insert/update conditional user property (got -1)", C2295r.m11413a(zzo.f8679a));
            }
        } catch (SQLiteException e) {
            mo14235r().mo14830d_().mo14843a("Error storing conditional user property", C2295r.m11413a(zzo.f8679a), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0153  */
    @android.support.annotation.WorkerThread
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzo mo14776d(java.lang.String r33, java.lang.String r34) {
        /*
            r32 = this;
            r7 = r34
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r33)
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r34)
            r32.mo14221d()
            r32.mo14508k()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r32.mo14787y()     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r10 = "conditional_properties"
            r0 = 11
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "origin"
            r1 = 0
            r11[r1] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "value"
            r2 = 1
            r11[r2] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "active"
            r3 = 2
            r11[r3] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "trigger_event_name"
            r4 = 3
            r11[r4] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "trigger_timeout"
            r5 = 4
            r11[r5] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "timed_out_event"
            r6 = 5
            r11[r6] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "creation_timestamp"
            r15 = 6
            r11[r15] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "triggered_event"
            r14 = 7
            r11[r14] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "triggered_timestamp"
            r13 = 8
            r11[r13] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "time_to_live"
            r12 = 9
            r11[r12] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "expired_event"
            r6 = 10
            r11[r6] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "app_id=? and name=?"
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            r13[r1] = r33     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            r16 = 0
            r17 = 0
            r18 = 0
            r6 = 9
            r12 = r0
            r0 = 8
            r6 = 7
            r14 = r16
            r0 = 6
            r15 = r17
            r16 = r18
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            boolean r10 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0124, all -> 0x0120 }
            if (r10 != 0) goto L_0x007e
            if (r9 == 0) goto L_0x007d
            r9.close()
        L_0x007d:
            return r8
        L_0x007e:
            java.lang.String r19 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x0124, all -> 0x0120 }
            r10 = r32
            java.lang.Object r11 = r10.m11214a((android.database.Cursor) r9, (int) r2)     // Catch:{ SQLiteException -> 0x011e }
            int r3 = r9.getInt(r3)     // Catch:{ SQLiteException -> 0x011e }
            if (r3 == 0) goto L_0x0091
            r23 = 1
            goto L_0x0093
        L_0x0091:
            r23 = 0
        L_0x0093:
            java.lang.String r24 = r9.getString(r4)     // Catch:{ SQLiteException -> 0x011e }
            long r26 = r9.getLong(r5)     // Catch:{ SQLiteException -> 0x011e }
            com.google.android.gms.measurement.internal.ei r1 = r32.mo14291g()     // Catch:{ SQLiteException -> 0x011e }
            r2 = 5
            byte[] r2 = r9.getBlob(r2)     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r3 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable r1 = r1.mo14546a((byte[]) r2, r3)     // Catch:{ SQLiteException -> 0x011e }
            r25 = r1
            com.google.android.gms.measurement.internal.zzag r25 = (com.google.android.gms.measurement.internal.zzag) r25     // Catch:{ SQLiteException -> 0x011e }
            long r21 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011e }
            com.google.android.gms.measurement.internal.ei r0 = r32.mo14291g()     // Catch:{ SQLiteException -> 0x011e }
            byte[] r1 = r9.getBlob(r6)     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r2 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable r0 = r0.mo14546a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x011e }
            r28 = r0
            com.google.android.gms.measurement.internal.zzag r28 = (com.google.android.gms.measurement.internal.zzag) r28     // Catch:{ SQLiteException -> 0x011e }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011e }
            r0 = 9
            long r29 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011e }
            com.google.android.gms.measurement.internal.ei r0 = r32.mo14291g()     // Catch:{ SQLiteException -> 0x011e }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r2 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable r0 = r0.mo14546a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x011e }
            r31 = r0
            com.google.android.gms.measurement.internal.zzag r31 = (com.google.android.gms.measurement.internal.zzag) r31     // Catch:{ SQLiteException -> 0x011e }
            com.google.android.gms.measurement.internal.zzfv r20 = new com.google.android.gms.measurement.internal.zzfv     // Catch:{ SQLiteException -> 0x011e }
            r1 = r20
            r2 = r34
            r5 = r11
            r6 = r19
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x011e }
            com.google.android.gms.measurement.internal.zzo r0 = new com.google.android.gms.measurement.internal.zzo     // Catch:{ SQLiteException -> 0x011e }
            r17 = r0
            r18 = r33
            r17.<init>(r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r31)     // Catch:{ SQLiteException -> 0x011e }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x011e }
            if (r1 == 0) goto L_0x0118
            com.google.android.gms.measurement.internal.r r1 = r32.mo14235r()     // Catch:{ SQLiteException -> 0x011e }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r33)     // Catch:{ SQLiteException -> 0x011e }
            com.google.android.gms.measurement.internal.p r4 = r32.mo14232o()     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r4 = r4.mo14826c(r7)     // Catch:{ SQLiteException -> 0x011e }
            r1.mo14843a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x011e }
        L_0x0118:
            if (r9 == 0) goto L_0x011d
            r9.close()
        L_0x011d:
            return r0
        L_0x011e:
            r0 = move-exception
            goto L_0x0131
        L_0x0120:
            r0 = move-exception
            r10 = r32
            goto L_0x0151
        L_0x0124:
            r0 = move-exception
            r10 = r32
            goto L_0x0131
        L_0x0128:
            r0 = move-exception
            r10 = r32
            r9 = r8
            goto L_0x0151
        L_0x012d:
            r0 = move-exception
            r10 = r32
            r9 = r8
        L_0x0131:
            com.google.android.gms.measurement.internal.r r1 = r32.mo14235r()     // Catch:{ all -> 0x0150 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r33)     // Catch:{ all -> 0x0150 }
            com.google.android.gms.measurement.internal.p r4 = r32.mo14232o()     // Catch:{ all -> 0x0150 }
            java.lang.String r4 = r4.mo14826c(r7)     // Catch:{ all -> 0x0150 }
            r1.mo14844a(r2, r3, r4, r0)     // Catch:{ all -> 0x0150 }
            if (r9 == 0) goto L_0x014f
            r9.close()
        L_0x014f:
            return r8
        L_0x0150:
            r0 = move-exception
        L_0x0151:
            if (r9 == 0) goto L_0x0156
            r9.close()
        L_0x0156:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14776d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzo");
    }

    @WorkerThread
    /* renamed from: e */
    public final int mo14778e(String str, String str2) {
        C0926p.m1308a(str);
        C0926p.m1308a(str2);
        mo14221d();
        mo14508k();
        try {
            return mo14787y().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo14235r().mo14830d_().mo14844a("Error deleting conditional property", C2295r.m11413a(str), mo14232o().mo14826c(str2), e);
            return 0;
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final List<zzo> mo14772b(String str, String str2, String str3) {
        C0926p.m1308a(str);
        mo14221d();
        mo14508k();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo14761a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0173  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.zzo> mo14761a(java.lang.String r40, java.lang.String[] r41) {
        /*
            r39 = this;
            r39.mo14221d()
            r39.mo14508k()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r39.mo14787y()     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r3 = "conditional_properties"
            r4 = 13
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "app_id"
            r11 = 0
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "name"
            r13 = 2
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "active"
            r15 = 4
            r4[r15] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "trigger_event_name"
            r10 = 5
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "trigger_timeout"
            r9 = 6
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "timed_out_event"
            r8 = 7
            r4[r8] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "creation_timestamp"
            r7 = 8
            r4[r7] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "triggered_event"
            r6 = 9
            r4[r6] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "triggered_timestamp"
            r1 = 10
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "time_to_live"
            r1 = 11
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "expired_event"
            r1 = 12
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "1001"
            r5 = r40
            r1 = 9
            r6 = r41
            r1 = 8
            r7 = r19
            r1 = 7
            r8 = r20
            r1 = 6
            r9 = r21
            r1 = 5
            r10 = r22
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            if (r3 != 0) goto L_0x0086
            if (r2 == 0) goto L_0x0085
            r2.close()
        L_0x0085:
            return r0
        L_0x0086:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00a1
            com.google.android.gms.measurement.internal.r r1 = r39.mo14235r()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            java.lang.String r3 = "Read more than the max allowed conditional properties, ignoring extra"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r1.mo14842a(r3, r4)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            goto L_0x0144
        L_0x00a1:
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            java.lang.String r10 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            java.lang.String r5 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r9 = r39
            java.lang.Object r8 = r9.m11214a((android.database.Cursor) r2, (int) r14)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            int r4 = r2.getInt(r15)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            if (r4 == 0) goto L_0x00bc
            r22 = 1
            goto L_0x00be
        L_0x00bc:
            r22 = 0
        L_0x00be:
            java.lang.String r28 = r2.getString(r1)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r6 = 6
            long r29 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            com.google.android.gms.measurement.internal.ei r4 = r39.mo14291g()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r7 = 7
            byte[] r1 = r2.getBlob(r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r6 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable r1 = r4.mo14546a((byte[]) r1, r6)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            com.google.android.gms.measurement.internal.zzag r1 = (com.google.android.gms.measurement.internal.zzag) r1     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r6 = 8
            long r20 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            com.google.android.gms.measurement.internal.ei r4 = r39.mo14291g()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r11 = 9
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r7 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable r4 = r4.mo14546a((byte[]) r6, r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r27 = r4
            com.google.android.gms.measurement.internal.zzag r27 = (com.google.android.gms.measurement.internal.zzag) r27     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r6 = 10
            long r16 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r7 = 11
            long r34 = r2.getLong(r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            com.google.android.gms.measurement.internal.ei r4 = r39.mo14291g()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r11 = 12
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r7 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable r4 = r4.mo14546a((byte[]) r6, r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r38 = r4
            com.google.android.gms.measurement.internal.zzag r38 = (com.google.android.gms.measurement.internal.zzag) r38     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            com.google.android.gms.measurement.internal.zzfv r19 = new com.google.android.gms.measurement.internal.zzfv     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r4 = r19
            r31 = 6
            r32 = 7
            r33 = 8
            r36 = 10
            r37 = 11
            r6 = r16
            r9 = r10
            r4.<init>(r5, r6, r8, r9)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            com.google.android.gms.measurement.internal.zzo r4 = new com.google.android.gms.measurement.internal.zzo     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r16 = r4
            r17 = r3
            r18 = r10
            r23 = r28
            r24 = r1
            r25 = r29
            r28 = r34
            r30 = r38
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            boolean r1 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            if (r1 != 0) goto L_0x014a
        L_0x0144:
            if (r2 == 0) goto L_0x0149
            r2.close()
        L_0x0149:
            return r0
        L_0x014a:
            r1 = 5
            r11 = 0
            goto L_0x0086
        L_0x014e:
            r0 = move-exception
            goto L_0x0171
        L_0x0150:
            r0 = move-exception
            r1 = r2
            goto L_0x0158
        L_0x0153:
            r0 = move-exception
            r2 = 0
            goto L_0x0171
        L_0x0156:
            r0 = move-exception
            r1 = 0
        L_0x0158:
            com.google.android.gms.measurement.internal.r r2 = r39.mo14235r()     // Catch:{ all -> 0x016f }
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()     // Catch:{ all -> 0x016f }
            java.lang.String r3 = "Error querying conditional user property value"
            r2.mo14842a(r3, r0)     // Catch:{ all -> 0x016f }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x016f }
            if (r1 == 0) goto L_0x016e
            r1.close()
        L_0x016e:
            return r0
        L_0x016f:
            r0 = move-exception
            r2 = r1
        L_0x0171:
            if (r2 == 0) goto L_0x0176
            r2.close()
        L_0x0176:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14761a(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0180 A[Catch:{ SQLiteException -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0184 A[Catch:{ SQLiteException -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01b8 A[Catch:{ SQLiteException -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01bb A[Catch:{ SQLiteException -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01ca A[Catch:{ SQLiteException -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01fb A[Catch:{ SQLiteException -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x023f  */
    @android.support.annotation.WorkerThread
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2266en mo14771b(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r20
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r20)
            r19.mo14221d()
            r19.mo14508k()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r19.mo14787y()     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r4 = "apps"
            r0 = 26
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "app_instance_id"
            r11 = 0
            r5[r11] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "gmp_app_id"
            r12 = 1
            r5[r12] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "resettable_device_id_hash"
            r13 = 2
            r5[r13] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "last_bundle_index"
            r14 = 3
            r5[r14] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "last_bundle_start_timestamp"
            r15 = 4
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "last_bundle_end_timestamp"
            r10 = 5
            r5[r10] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "app_version"
            r9 = 6
            r5[r9] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "app_store"
            r8 = 7
            r5[r8] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "gmp_version"
            r7 = 8
            r5[r7] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 9
            java.lang.String r6 = "dev_cert_hash"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "measurement_enabled"
            r6 = 10
            r5[r6] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 11
            java.lang.String r16 = "day"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 12
            java.lang.String r16 = "daily_public_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 13
            java.lang.String r16 = "daily_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 14
            java.lang.String r16 = "daily_conversions_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 15
            java.lang.String r16 = "config_fetched_time"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 16
            java.lang.String r16 = "failed_config_fetch_time"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "app_version_int"
            r15 = 17
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 18
            java.lang.String r16 = "firebase_instance_id"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 19
            java.lang.String r16 = "daily_error_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 20
            java.lang.String r16 = "daily_realtime_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 21
            java.lang.String r16 = "health_monitor_sample"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "android_id"
            r15 = 22
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "adid_reporting_enabled"
            r15 = 23
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "ssaid_reporting_enabled"
            r15 = 24
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r0 = 25
            java.lang.String r16 = "admob_app_id"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            java.lang.String r0 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            r16 = 0
            r17 = 0
            r18 = 0
            r15 = 10
            r6 = r0
            r0 = 8
            r15 = 7
            r8 = r16
            r0 = 6
            r9 = r17
            r15 = 5
            r10 = r18
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0221, all -> 0x021c }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0218, all -> 0x0214 }
            if (r4 != 0) goto L_0x00d4
            if (r3 == 0) goto L_0x00d3
            r3.close()
        L_0x00d3:
            return r2
        L_0x00d4:
            com.google.android.gms.measurement.internal.en r4 = new com.google.android.gms.measurement.internal.en     // Catch:{ SQLiteException -> 0x0218, all -> 0x0214 }
            r5 = r19
            com.google.android.gms.measurement.internal.ec r6 = r5.f8402a     // Catch:{ SQLiteException -> 0x0212 }
            com.google.android.gms.measurement.internal.aw r6 = r6.mo14540p()     // Catch:{ SQLiteException -> 0x0212 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0212 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14599a((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0212 }
            java.lang.String r6 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14603b((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0212 }
            java.lang.String r6 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14611d((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0212 }
            long r6 = r3.getLong(r14)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14616f((long) r6)     // Catch:{ SQLiteException -> 0x0212 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14598a((long) r6)     // Catch:{ SQLiteException -> 0x0212 }
            long r6 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14602b((long) r6)     // Catch:{ SQLiteException -> 0x0212 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14617f((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 7
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14620g((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 8
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14610d((long) r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 9
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14613e((long) r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 10
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0212 }
            if (r6 != 0) goto L_0x013e
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x0212 }
            if (r0 == 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r0 = 0
            goto L_0x013f
        L_0x013e:
            r0 = 1
        L_0x013f:
            r4.mo14600a((boolean) r0)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 11
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14625i(r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 12
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14627j(r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 13
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14629k(r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 14
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14631l(r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 15
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14619g((long) r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 16
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14622h((long) r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 17
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0212 }
            if (r6 == 0) goto L_0x0184
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0189
        L_0x0184:
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x0212 }
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x0212 }
        L_0x0189:
            r4.mo14606c((long) r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 18
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14614e((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 19
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14635n(r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 20
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14633m(r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 21
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14623h((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 22
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0212 }
            if (r6 == 0) goto L_0x01bb
            r6 = 0
            goto L_0x01bf
        L_0x01bb:
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0212 }
        L_0x01bf:
            r4.mo14636o(r6)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 23
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0212 }
            if (r6 != 0) goto L_0x01d3
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x0212 }
            if (r0 == 0) goto L_0x01d1
            goto L_0x01d3
        L_0x01d1:
            r0 = 0
            goto L_0x01d4
        L_0x01d3:
            r0 = 1
        L_0x01d4:
            r4.mo14604b((boolean) r0)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 24
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0212 }
            if (r6 != 0) goto L_0x01e5
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x0212 }
            if (r0 == 0) goto L_0x01e6
        L_0x01e5:
            r11 = 1
        L_0x01e6:
            r4.mo14608c((boolean) r11)     // Catch:{ SQLiteException -> 0x0212 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14607c((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0212 }
            r4.mo14597a()     // Catch:{ SQLiteException -> 0x0212 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0212 }
            if (r0 == 0) goto L_0x020c
            com.google.android.gms.measurement.internal.r r0 = r19.mo14235r()     // Catch:{ SQLiteException -> 0x0212 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ SQLiteException -> 0x0212 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r20)     // Catch:{ SQLiteException -> 0x0212 }
            r0.mo14842a(r6, r7)     // Catch:{ SQLiteException -> 0x0212 }
        L_0x020c:
            if (r3 == 0) goto L_0x0211
            r3.close()
        L_0x0211:
            return r4
        L_0x0212:
            r0 = move-exception
            goto L_0x0225
        L_0x0214:
            r0 = move-exception
            r5 = r19
            goto L_0x023d
        L_0x0218:
            r0 = move-exception
            r5 = r19
            goto L_0x0225
        L_0x021c:
            r0 = move-exception
            r5 = r19
            r3 = r2
            goto L_0x023d
        L_0x0221:
            r0 = move-exception
            r5 = r19
            r3 = r2
        L_0x0225:
            com.google.android.gms.measurement.internal.r r4 = r19.mo14235r()     // Catch:{ all -> 0x023c }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ all -> 0x023c }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r20)     // Catch:{ all -> 0x023c }
            r4.mo14843a(r6, r1, r0)     // Catch:{ all -> 0x023c }
            if (r3 == 0) goto L_0x023b
            r3.close()
        L_0x023b:
            return r2
        L_0x023c:
            r0 = move-exception
        L_0x023d:
            if (r3 == 0) goto L_0x0242
            r3.close()
        L_0x0242:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14771b(java.lang.String):com.google.android.gms.measurement.internal.en");
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14763a(C2266en enVar) {
        C0926p.m1306a(enVar);
        mo14221d();
        mo14508k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", enVar.mo14601b());
        contentValues.put("app_instance_id", enVar.mo14605c());
        contentValues.put("gmp_app_id", enVar.mo14609d());
        contentValues.put("resettable_device_id_hash", enVar.mo14615f());
        contentValues.put("last_bundle_index", Long.valueOf(enVar.mo14638p()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(enVar.mo14621h()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(enVar.mo14624i()));
        contentValues.put("app_version", enVar.mo14626j());
        contentValues.put("app_store", enVar.mo14630l());
        contentValues.put("gmp_version", Long.valueOf(enVar.mo14632m()));
        contentValues.put("dev_cert_hash", Long.valueOf(enVar.mo14634n()));
        contentValues.put("measurement_enabled", Boolean.valueOf(enVar.mo14637o()));
        contentValues.put("day", Long.valueOf(enVar.mo14642t()));
        contentValues.put("daily_public_events_count", Long.valueOf(enVar.mo14643u()));
        contentValues.put("daily_events_count", Long.valueOf(enVar.mo14644v()));
        contentValues.put("daily_conversions_count", Long.valueOf(enVar.mo14645w()));
        contentValues.put("config_fetched_time", Long.valueOf(enVar.mo14639q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(enVar.mo14640r()));
        contentValues.put("app_version_int", Long.valueOf(enVar.mo14628k()));
        contentValues.put("firebase_instance_id", enVar.mo14618g());
        contentValues.put("daily_error_events_count", Long.valueOf(enVar.mo14647y()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(enVar.mo14646x()));
        contentValues.put("health_monitor_sample", enVar.mo14648z());
        contentValues.put("android_id", Long.valueOf(enVar.mo14594B()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(enVar.mo14595C()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(enVar.mo14596D()));
        contentValues.put("admob_app_id", enVar.mo14612e());
        try {
            SQLiteDatabase y = mo14787y();
            if (((long) y.update("apps", contentValues, "app_id = ?", new String[]{enVar.mo14601b()})) == 0 && y.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                mo14235r().mo14830d_().mo14842a("Failed to insert/update app (got -1). appId", C2295r.m11413a(enVar.mo14601b()));
            }
        } catch (SQLiteException e) {
            mo14235r().mo14830d_().mo14843a("Error storing app. appId", C2295r.m11413a(enVar.mo14601b()), e);
        }
    }

    /* renamed from: c */
    public final long mo14774c(String str) {
        C0926p.m1308a(str);
        mo14221d();
        mo14508k();
        try {
            return (long) mo14787y().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo14237t().mo14718b(str, C2284h.f8584x))))});
        } catch (SQLiteException e) {
            mo14235r().mo14830d_().mo14843a("Error deleting over the limit events. appId", C2295r.m11413a(str), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139  */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2276ex mo14756a(long r20, java.lang.String r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r19 = this;
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r22)
            r19.mo14221d()
            r19.mo14508k()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r3 = 0
            r2[r3] = r22
            com.google.android.gms.measurement.internal.ex r4 = new com.google.android.gms.measurement.internal.ex
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r14 = r19.mo14787y()     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            java.lang.String r7 = "apps"
            r6 = 6
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            java.lang.String r6 = "day"
            r8[r3] = r6     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            java.lang.String r6 = "daily_events_count"
            r8[r0] = r6     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            java.lang.String r6 = "daily_public_events_count"
            r15 = 2
            r8[r15] = r6     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            java.lang.String r6 = "daily_conversions_count"
            r13 = 3
            r8[r13] = r6     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            java.lang.String r6 = "daily_error_events_count"
            r12 = 4
            r8[r12] = r6     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            java.lang.String r6 = "daily_realtime_events_count"
            r11 = 5
            r8[r11] = r6     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            java.lang.String r9 = "app_id=?"
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            r10[r3] = r22     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            r16 = 0
            r17 = 0
            r18 = 0
            r6 = r14
            r5 = 5
            r11 = r16
            r5 = 4
            r12 = r17
            r5 = 3
            r13 = r18
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0119 }
            boolean r7 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            if (r7 != 0) goto L_0x0070
            com.google.android.gms.measurement.internal.r r0 = r19.mo14235r()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.String r2 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r22)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0.mo14842a(r2, r3)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            if (r6 == 0) goto L_0x006f
            r6.close()
        L_0x006f:
            return r4
        L_0x0070:
            long r7 = r6.getLong(r3)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            int r3 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x0098
            long r7 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r4.f8497b = r7     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            long r7 = r6.getLong(r15)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r4.f8496a = r7     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            long r7 = r6.getLong(r5)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r4.f8498c = r7     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0 = 4
            long r7 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r4.f8499d = r7     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0 = 5
            long r7 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r4.f8500e = r7     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
        L_0x0098:
            r7 = 1
            if (r23 == 0) goto L_0x00a2
            long r11 = r4.f8497b     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0 = 0
            long r11 = r11 + r7
            r4.f8497b = r11     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
        L_0x00a2:
            if (r24 == 0) goto L_0x00aa
            long r11 = r4.f8496a     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0 = 0
            long r11 = r11 + r7
            r4.f8496a = r11     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
        L_0x00aa:
            if (r25 == 0) goto L_0x00b2
            long r11 = r4.f8498c     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0 = 0
            long r11 = r11 + r7
            r4.f8498c = r11     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
        L_0x00b2:
            if (r26 == 0) goto L_0x00ba
            long r11 = r4.f8499d     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0 = 0
            long r11 = r11 + r7
            r4.f8499d = r11     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
        L_0x00ba:
            if (r27 == 0) goto L_0x00c2
            long r11 = r4.f8500e     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0 = 0
            long r11 = r11 + r7
            r4.f8500e = r11     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
        L_0x00c2:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.String r3 = "day"
            java.lang.Long r5 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.String r3 = "daily_public_events_count"
            long r7 = r4.f8496a     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.String r3 = "daily_events_count"
            long r7 = r4.f8497b     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.String r3 = "daily_conversions_count"
            long r7 = r4.f8498c     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.String r3 = "daily_error_events_count"
            long r7 = r4.f8499d     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.String r3 = "daily_realtime_events_count"
            long r7 = r4.f8500e     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r14.update(r3, r0, r5, r2)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            if (r6 == 0) goto L_0x0113
            r6.close()
        L_0x0113:
            return r4
        L_0x0114:
            r0 = move-exception
            goto L_0x0137
        L_0x0116:
            r0 = move-exception
            r5 = r6
            goto L_0x011e
        L_0x0119:
            r0 = move-exception
            r6 = 0
            goto L_0x0137
        L_0x011c:
            r0 = move-exception
            r5 = 0
        L_0x011e:
            com.google.android.gms.measurement.internal.r r2 = r19.mo14235r()     // Catch:{ all -> 0x0135 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()     // Catch:{ all -> 0x0135 }
            java.lang.String r3 = "Error updating daily counts. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r22)     // Catch:{ all -> 0x0135 }
            r2.mo14843a(r3, r1, r0)     // Catch:{ all -> 0x0135 }
            if (r5 == 0) goto L_0x0134
            r5.close()
        L_0x0134:
            return r4
        L_0x0135:
            r0 = move-exception
            r6 = r5
        L_0x0137:
            if (r6 == 0) goto L_0x013c
            r6.close()
        L_0x013c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14756a(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.ex");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    @android.support.annotation.WorkerThread
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo14777d(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r12)
            r11.mo14221d()
            r11.mo14508k()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.mo14787y()     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            r6[r9] = r12     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0058 }
            if (r2 != 0) goto L_0x0037
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0058 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0058 }
            if (r3 == 0) goto L_0x0052
            com.google.android.gms.measurement.internal.r r3 = r11.mo14235r()     // Catch:{ SQLiteException -> 0x0058 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo14830d_()     // Catch:{ SQLiteException -> 0x0058 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0058 }
            r3.mo14842a(r4, r5)     // Catch:{ SQLiteException -> 0x0058 }
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            return r2
        L_0x0058:
            r2 = move-exception
            goto L_0x005f
        L_0x005a:
            r12 = move-exception
            r1 = r0
            goto L_0x0077
        L_0x005d:
            r2 = move-exception
            r1 = r0
        L_0x005f:
            com.google.android.gms.measurement.internal.r r3 = r11.mo14235r()     // Catch:{ all -> 0x0076 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo14830d_()     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r12)     // Catch:{ all -> 0x0076 }
            r3.mo14843a(r4, r12, r2)     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0075
            r1.close()
        L_0x0075:
            return r0
        L_0x0076:
            r12 = move-exception
        L_0x0077:
            if (r1 == 0) goto L_0x007c
            r1.close()
        L_0x007c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14777d(java.lang.String):byte[]");
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo14766a(C1919bl blVar, boolean z) {
        mo14221d();
        mo14508k();
        C0926p.m1306a(blVar);
        C0926p.m1308a(blVar.f7495o);
        C0926p.m1306a(blVar.f7486f);
        mo14747B();
        long a = mo14230m().mo9996a();
        if (blVar.f7486f.longValue() < a - C2272et.m11153j() || blVar.f7486f.longValue() > C2272et.m11153j() + a) {
            mo14235r().mo14833i().mo14844a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C2295r.m11413a(blVar.f7495o), Long.valueOf(a), blVar.f7486f);
        }
        try {
            byte[] bArr = new byte[blVar.mo14106e()];
            C2107hw a2 = C2107hw.m10220a(bArr, 0, bArr.length);
            blVar.mo13499a(a2);
            a2.mo14068a();
            byte[] b = mo14291g().mo14556b(bArr);
            mo14235r().mo14838x().mo14842a("Saving bundle, size", Integer.valueOf(b.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", blVar.f7495o);
            contentValues.put("bundle_end_timestamp", blVar.f7486f);
            contentValues.put("data", b);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (blVar.f7473H != null) {
                contentValues.put("retry_count", blVar.f7473H);
            }
            try {
                if (mo14787y().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                mo14235r().mo14830d_().mo14842a("Failed to insert bundle (got -1). appId", C2295r.m11413a(blVar.f7495o));
                return false;
            } catch (SQLiteException e) {
                mo14235r().mo14830d_().mo14843a("Error storing bundle. appId", C2295r.m11413a(blVar.f7495o), e);
                return false;
            }
        } catch (IOException e2) {
            mo14235r().mo14830d_().mo14843a("Data loss. Failed to serialize bundle. appId", C2295r.m11413a(blVar.f7495o), e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    @android.support.annotation.WorkerThread
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14788z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo14787y()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r2 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r2
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.r r3 = r6.mo14235r()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.t r3 = r3.mo14830d_()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo14842a(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14788z():java.lang.String");
    }

    /* renamed from: A */
    public final boolean mo14746A() {
        return m11219b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fb  */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.C1919bl, java.lang.Long>> mo14759a(java.lang.String r16, int r17, int r18) {
        /*
            r15 = this;
            r1 = r18
            r15.mo14221d()
            r15.mo14508k()
            r2 = 1
            r3 = 0
            if (r17 <= 0) goto L_0x000e
            r4 = 1
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            com.google.android.gms.common.internal.C0926p.m1316b((boolean) r4)
            if (r1 <= 0) goto L_0x0016
            r4 = 1
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.common.internal.C0926p.m1316b((boolean) r4)
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r16)
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r15.mo14787y()     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r6 = "queue"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r8 = "rowid"
            r7[r3] = r8     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r8 = "data"
            r7[r2] = r8     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r8 = "retry_count"
            r14 = 2
            r7[r14] = r8     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r8 = "app_id=?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00dd }
            r9[r3] = r16     // Catch:{ SQLiteException -> 0x00dd }
            r10 = 0
            r11 = 0
            java.lang.String r12 = "rowid"
            java.lang.String r13 = java.lang.String.valueOf(r17)     // Catch:{ SQLiteException -> 0x00dd }
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x00dd }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            if (r0 != 0) goto L_0x0056
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            if (r5 == 0) goto L_0x0055
            r5.close()
        L_0x0055:
            return r0
        L_0x0056:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            r6 = 0
        L_0x005c:
            long r7 = r5.getLong(r3)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            byte[] r0 = r5.getBlob(r2)     // Catch:{ IOException -> 0x00b5 }
            com.google.android.gms.measurement.internal.ei r9 = r15.mo14291g()     // Catch:{ IOException -> 0x00b5 }
            byte[] r0 = r9.mo14554a((byte[]) r0)     // Catch:{ IOException -> 0x00b5 }
            boolean r9 = r4.isEmpty()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            if (r9 != 0) goto L_0x0076
            int r9 = r0.length     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            int r9 = r9 + r6
            if (r9 > r1) goto L_0x00cf
        L_0x0076:
            int r9 = r0.length     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            com.google.android.gms.internal.measurement.hv r9 = com.google.android.gms.internal.measurement.C2106hv.m10191a(r0, r3, r9)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            com.google.android.gms.internal.measurement.bl r10 = new com.google.android.gms.internal.measurement.bl     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            r10.<init>()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            r10.mo13498a((com.google.android.gms.internal.measurement.C2106hv) r9)     // Catch:{ IOException -> 0x00a1 }
            boolean r9 = r5.isNull(r14)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            if (r9 != 0) goto L_0x0093
            int r9 = r5.getInt(r14)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            r10.f7473H = r9     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
        L_0x0093:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            int r6 = r6 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            android.util.Pair r0 = android.util.Pair.create(r10, r0)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            r4.add(r0)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            goto L_0x00c7
        L_0x00a1:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.r r0 = r15.mo14235r()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.String r8 = "Failed to merge queued bundle. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r16)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            r0.mo14843a(r8, r9, r7)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            goto L_0x00c7
        L_0x00b5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r7 = r15.mo14235r()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo14830d_()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.String r8 = "Failed to unzip queued bundle. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r16)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            r7.mo14843a(r8, r9, r0)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
        L_0x00c7:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            if (r0 == 0) goto L_0x00cf
            if (r6 <= r1) goto L_0x005c
        L_0x00cf:
            if (r5 == 0) goto L_0x00d4
            r5.close()
        L_0x00d4:
            return r4
        L_0x00d5:
            r0 = move-exception
            goto L_0x00f9
        L_0x00d7:
            r0 = move-exception
            r4 = r5
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            r5 = r4
            goto L_0x00f9
        L_0x00dd:
            r0 = move-exception
        L_0x00de:
            com.google.android.gms.measurement.internal.r r1 = r15.mo14235r()     // Catch:{ all -> 0x00da }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "Error querying bundles. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r16)     // Catch:{ all -> 0x00da }
            r1.mo14843a(r2, r3, r0)     // Catch:{ all -> 0x00da }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00da }
            if (r4 == 0) goto L_0x00f8
            r4.close()
        L_0x00f8:
            return r0
        L_0x00f9:
            if (r5 == 0) goto L_0x00fe
            r5.close()
        L_0x00fe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14759a(java.lang.String, int, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: B */
    public final void mo14747B() {
        int delete;
        mo14221d();
        mo14508k();
        if (m11211N()) {
            long a = mo14236s().f8047f.mo14265a();
            long b = mo14230m().mo9997b();
            if (Math.abs(b - a) > C2284h.f8514G.mo14804b().longValue()) {
                mo14236s().f8047f.mo14266a(b);
                mo14221d();
                mo14508k();
                if (m11211N() && (delete = mo14787y().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo14230m().mo9996a()), String.valueOf(C2272et.m11153j())})) > 0) {
                    mo14235r().mo14838x().mo14842a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14765a(List<Long> list) {
        mo14221d();
        mo14508k();
        C0926p.m1306a(list);
        C0926p.m1305a(list.size());
        if (m11211N()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m11219b(sb3.toString(), (String[]) null) > 0) {
                mo14235r().mo14833i().mo14841a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase y = mo14787y();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                y.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo14235r().mo14830d_().mo14842a("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14764a(String str, C1904ax[] axVarArr) {
        boolean z;
        mo14508k();
        mo14221d();
        C0926p.m1308a(str);
        C0926p.m1306a(axVarArr);
        SQLiteDatabase y = mo14787y();
        y.beginTransaction();
        try {
            mo14508k();
            mo14221d();
            C0926p.m1308a(str);
            SQLiteDatabase y2 = mo14787y();
            y2.delete("property_filters", "app_id=?", new String[]{str});
            y2.delete("event_filters", "app_id=?", new String[]{str});
            for (C1904ax axVar : axVarArr) {
                mo14508k();
                mo14221d();
                C0926p.m1308a(str);
                C0926p.m1306a(axVar);
                C0926p.m1306a(axVar.f7396c);
                C0926p.m1306a(axVar.f7395b);
                if (axVar.f7394a == null) {
                    mo14235r().mo14833i().mo14842a("Audience with no ID. appId", C2295r.m11413a(str));
                } else {
                    int intValue = axVar.f7394a.intValue();
                    C1905ay[] ayVarArr = axVar.f7396c;
                    int length = ayVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            C1909bb[] bbVarArr = axVar.f7395b;
                            int length2 = bbVarArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    C1905ay[] ayVarArr2 = axVar.f7396c;
                                    int length3 = ayVarArr2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length3) {
                                            z = true;
                                            break;
                                        } else if (!m11216a(str, intValue, ayVarArr2[i3])) {
                                            z = false;
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    if (z) {
                                        C1909bb[] bbVarArr2 = axVar.f7395b;
                                        int length4 = bbVarArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length4) {
                                                break;
                                            } else if (!m11217a(str, intValue, bbVarArr2[i4])) {
                                                z = false;
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        mo14508k();
                                        mo14221d();
                                        C0926p.m1308a(str);
                                        SQLiteDatabase y3 = mo14787y();
                                        y3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                        y3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                    }
                                } else if (bbVarArr[i2].f7419a == null) {
                                    mo14235r().mo14833i().mo14843a("Property filter with no ID. Audience definition ignored. appId, audienceId", C2295r.m11413a(str), axVar.f7394a);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        } else if (ayVarArr[i].f7400a == null) {
                            mo14235r().mo14833i().mo14843a("Event filter with no ID. Audience definition ignored. appId, audienceId", C2295r.m11413a(str), axVar.f7394a);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C1904ax axVar2 : axVarArr) {
                arrayList.add(axVar2.f7394a);
            }
            m11218a(str, (List<Integer>) arrayList);
            y.setTransactionSuccessful();
        } finally {
            y.endTransaction();
        }
    }

    @WorkerThread
    /* renamed from: a */
    private final boolean m11216a(String str, int i, C1905ay ayVar) {
        mo14508k();
        mo14221d();
        C0926p.m1308a(str);
        C0926p.m1306a(ayVar);
        if (TextUtils.isEmpty(ayVar.f7401b)) {
            mo14235r().mo14833i().mo14844a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C2295r.m11413a(str), Integer.valueOf(i), String.valueOf(ayVar.f7400a));
            return false;
        }
        try {
            byte[] bArr = new byte[ayVar.mo14106e()];
            C2107hw a = C2107hw.m10220a(bArr, 0, bArr.length);
            ayVar.mo13499a(a);
            a.mo14068a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", ayVar.f7400a);
            contentValues.put("event_name", ayVar.f7401b);
            contentValues.put("data", bArr);
            try {
                if (mo14787y().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                mo14235r().mo14830d_().mo14842a("Failed to insert event filter (got -1). appId", C2295r.m11413a(str));
                return true;
            } catch (SQLiteException e) {
                mo14235r().mo14830d_().mo14843a("Error storing event filter. appId", C2295r.m11413a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo14235r().mo14830d_().mo14843a("Configuration loss. Failed to serialize event filter. appId", C2295r.m11413a(str), e2);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: a */
    private final boolean m11217a(String str, int i, C1909bb bbVar) {
        mo14508k();
        mo14221d();
        C0926p.m1308a(str);
        C0926p.m1306a(bbVar);
        if (TextUtils.isEmpty(bbVar.f7420b)) {
            mo14235r().mo14833i().mo14844a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C2295r.m11413a(str), Integer.valueOf(i), String.valueOf(bbVar.f7419a));
            return false;
        }
        try {
            byte[] bArr = new byte[bbVar.mo14106e()];
            C2107hw a = C2107hw.m10220a(bArr, 0, bArr.length);
            bbVar.mo13499a(a);
            a.mo14068a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", bbVar.f7419a);
            contentValues.put("property_name", bbVar.f7420b);
            contentValues.put("data", bArr);
            try {
                if (mo14787y().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                mo14235r().mo14830d_().mo14842a("Failed to insert property filter (got -1). appId", C2295r.m11413a(str));
                return false;
            } catch (SQLiteException e) {
                mo14235r().mo14830d_().mo14843a("Error storing property filter. appId", C2295r.m11413a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo14235r().mo14830d_().mo14843a("Configuration loss. Failed to serialize property filter. appId", C2295r.m11413a(str), e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C1905ay>> mo14781f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo14508k()
            r12.mo14221d()
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r13)
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r14)
            android.support.v4.util.ArrayMap r0 = new android.support.v4.util.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo14787y()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x0048
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0097 }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r0
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0097 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.internal.measurement.hv r1 = com.google.android.gms.internal.measurement.C2106hv.m10191a(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.internal.measurement.ay r2 = new com.google.android.gms.internal.measurement.ay     // Catch:{ SQLiteException -> 0x0097 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0097 }
            r2.mo13498a((com.google.android.gms.internal.measurement.C2106hv) r1)     // Catch:{ IOException -> 0x0079 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0097 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0097 }
            if (r3 != 0) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0097 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0097 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x0075:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0097 }
            goto L_0x008b
        L_0x0079:
            r1 = move-exception
            com.google.android.gms.measurement.internal.r r2 = r12.mo14235r()     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x0097 }
            r2.mo14843a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x008b:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0096
            r14.close()
        L_0x0096:
            return r0
        L_0x0097:
            r0 = move-exception
            goto L_0x009e
        L_0x0099:
            r13 = move-exception
            r14 = r9
            goto L_0x00b6
        L_0x009c:
            r0 = move-exception
            r14 = r9
        L_0x009e:
            com.google.android.gms.measurement.internal.r r1 = r12.mo14235r()     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r13)     // Catch:{ all -> 0x00b5 }
            r1.mo14843a(r2, r13, r0)     // Catch:{ all -> 0x00b5 }
            if (r14 == 0) goto L_0x00b4
            r14.close()
        L_0x00b4:
            return r9
        L_0x00b5:
            r13 = move-exception
        L_0x00b6:
            if (r14 == 0) goto L_0x00bb
            r14.close()
        L_0x00bb:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14781f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C1909bb>> mo14783g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo14508k()
            r12.mo14221d()
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r13)
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r14)
            android.support.v4.util.ArrayMap r0 = new android.support.v4.util.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo14787y()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x0048
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0097 }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r0
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0097 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.internal.measurement.hv r1 = com.google.android.gms.internal.measurement.C2106hv.m10191a(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.internal.measurement.bb r2 = new com.google.android.gms.internal.measurement.bb     // Catch:{ SQLiteException -> 0x0097 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0097 }
            r2.mo13498a((com.google.android.gms.internal.measurement.C2106hv) r1)     // Catch:{ IOException -> 0x0079 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0097 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0097 }
            if (r3 != 0) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0097 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0097 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x0075:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0097 }
            goto L_0x008b
        L_0x0079:
            r1 = move-exception
            com.google.android.gms.measurement.internal.r r2 = r12.mo14235r()     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x0097 }
            r2.mo14843a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x008b:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0096
            r14.close()
        L_0x0096:
            return r0
        L_0x0097:
            r0 = move-exception
            goto L_0x009e
        L_0x0099:
            r13 = move-exception
            r14 = r9
            goto L_0x00b6
        L_0x009c:
            r0 = move-exception
            r14 = r9
        L_0x009e:
            com.google.android.gms.measurement.internal.r r1 = r12.mo14235r()     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r13)     // Catch:{ all -> 0x00b5 }
            r1.mo14843a(r2, r13, r0)     // Catch:{ all -> 0x00b5 }
            if (r14 == 0) goto L_0x00b4
            r14.close()
        L_0x00b4:
            return r9
        L_0x00b5:
            r13 = move-exception
        L_0x00b6:
            if (r14 == 0) goto L_0x00bb
            r14.close()
        L_0x00bb:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14783g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: a */
    private final boolean m11218a(String str, List<Integer> list) {
        C0926p.m1308a(str);
        mo14508k();
        mo14221d();
        SQLiteDatabase y = mo14787y();
        try {
            long b = m11219b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, mo14237t().mo14718b(str, C2284h.f8521N)));
            if (b <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return y.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo14235r().mo14830d_().mo14843a("Database error querying filters. appId", C2295r.m11413a(str), e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.C1920bm> mo14779e(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo14508k()
            r11.mo14221d()
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.mo14787y()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            r4[r9] = r12     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x007a }
            if (r1 != 0) goto L_0x0036
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            return r8
        L_0x0036:
            android.support.v4.util.ArrayMap r1 = new android.support.v4.util.ArrayMap     // Catch:{ SQLiteException -> 0x007a }
            r1.<init>()     // Catch:{ SQLiteException -> 0x007a }
        L_0x003b:
            int r2 = r0.getInt(r9)     // Catch:{ SQLiteException -> 0x007a }
            byte[] r3 = r0.getBlob(r10)     // Catch:{ SQLiteException -> 0x007a }
            int r4 = r3.length     // Catch:{ SQLiteException -> 0x007a }
            com.google.android.gms.internal.measurement.hv r3 = com.google.android.gms.internal.measurement.C2106hv.m10191a(r3, r9, r4)     // Catch:{ SQLiteException -> 0x007a }
            com.google.android.gms.internal.measurement.bm r4 = new com.google.android.gms.internal.measurement.bm     // Catch:{ SQLiteException -> 0x007a }
            r4.<init>()     // Catch:{ SQLiteException -> 0x007a }
            r4.mo13498a((com.google.android.gms.internal.measurement.C2106hv) r3)     // Catch:{ IOException -> 0x0058 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007a }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x007a }
            goto L_0x006e
        L_0x0058:
            r3 = move-exception
            com.google.android.gms.measurement.internal.r r4 = r11.mo14235r()     // Catch:{ SQLiteException -> 0x007a }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ SQLiteException -> 0x007a }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x007a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007a }
            r4.mo14844a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x007a }
        L_0x006e:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x007a }
            if (r2 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x0079
            r0.close()
        L_0x0079:
            return r1
        L_0x007a:
            r1 = move-exception
            goto L_0x0081
        L_0x007c:
            r12 = move-exception
            r0 = r8
            goto L_0x0099
        L_0x007f:
            r1 = move-exception
            r0 = r8
        L_0x0081:
            com.google.android.gms.measurement.internal.r r2 = r11.mo14235r()     // Catch:{ all -> 0x0098 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r12)     // Catch:{ all -> 0x0098 }
            r2.mo14843a(r3, r12, r1)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0097
            r0.close()
        L_0x0097:
            return r8
        L_0x0098:
            r12 = move-exception
        L_0x0099:
            if (r0 == 0) goto L_0x009e
            r0.close()
        L_0x009e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14779e(java.lang.String):java.util.Map");
    }

    @WorkerThread
    /* renamed from: a */
    private static void m11215a(ContentValues contentValues, String str, Object obj) {
        C0926p.m1308a(str);
        C0926p.m1306a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    /* renamed from: a */
    private final Object m11214a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        switch (type) {
            case 0:
                mo14235r().mo14830d_().mo14841a("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                mo14235r().mo14830d_().mo14841a("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                mo14235r().mo14830d_().mo14842a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
        }
    }

    @WorkerThread
    /* renamed from: C */
    public final long mo14748C() {
        return m11212a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: h */
    public final long mo14784h(String str, String str2) {
        long j;
        C0926p.m1308a(str);
        C0926p.m1308a(str2);
        mo14221d();
        mo14508k();
        SQLiteDatabase y = mo14787y();
        y.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            j = m11212a(sb.toString(), new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (y.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    mo14235r().mo14830d_().mo14843a("Failed to insert column (got -1). appId", C2295r.m11413a(str), str2);
                    y.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + j));
                if (((long) y.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    mo14235r().mo14830d_().mo14843a("Failed to update column (got 0). appId", C2295r.m11413a(str), str2);
                    y.endTransaction();
                    return -1;
                }
                y.setTransactionSuccessful();
                y.endTransaction();
                return j;
            } catch (SQLiteException e) {
                e = e;
                try {
                    mo14235r().mo14830d_().mo14844a("Error inserting column. appId", C2295r.m11413a(str), str2, e);
                    return j;
                } finally {
                    y.endTransaction();
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            j = 0;
            mo14235r().mo14830d_().mo14844a("Error inserting column. appId", C2295r.m11413a(str), str2, e);
            return j;
        }
    }

    @WorkerThread
    /* renamed from: D */
    public final long mo14749D() {
        return m11212a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: a */
    public final long mo14753a(C1919bl blVar) {
        long j;
        mo14221d();
        mo14508k();
        C0926p.m1306a(blVar);
        C0926p.m1308a(blVar.f7495o);
        try {
            byte[] bArr = new byte[blVar.mo14106e()];
            C2107hw a = C2107hw.m10220a(bArr, 0, bArr.length);
            blVar.mo13499a(a);
            a.mo14068a();
            C2261ei g = mo14291g();
            C0926p.m1306a(bArr);
            g.mo14233p().mo14221d();
            MessageDigest i = C2264el.m11038i();
            if (i == null) {
                g.mo14235r().mo14830d_().mo14841a("Failed to get MD5");
                j = 0;
            } else {
                j = C2264el.m11018a(i.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", blVar.f7495o);
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("metadata", bArr);
            try {
                mo14787y().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
                return j;
            } catch (SQLiteException e) {
                mo14235r().mo14830d_().mo14843a("Error storing raw event metadata. appId", C2295r.m11413a(blVar.f7495o), e);
                throw e;
            }
        } catch (IOException e2) {
            mo14235r().mo14830d_().mo14843a("Data loss. Failed to serialize event metadata. appId", C2295r.m11413a(blVar.f7495o), e2);
            throw e2;
        }
    }

    /* renamed from: E */
    public final boolean mo14750E() {
        return m11219b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: F */
    public final boolean mo14751F() {
        return m11219b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: f */
    public final long mo14780f(String str) {
        C0926p.m1308a(str);
        return m11212a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14757a(long r5) {
        /*
            r4 = this;
            r4.mo14221d()
            r4.mo14508k()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo14787y()     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.r r6 = r4.mo14235r()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.t r6 = r6.mo14838x()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo14841a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0045
        L_0x0040:
            r6 = move-exception
            r5 = r0
            goto L_0x0059
        L_0x0043:
            r6 = move-exception
            r5 = r0
        L_0x0045:
            com.google.android.gms.measurement.internal.r r1 = r4.mo14235r()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo14842a(r2, r6)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0057
            r5.close()
        L_0x0057:
            return r0
        L_0x0058:
            r6 = move-exception
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            r5.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14757a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0044  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo14752G() {
        /*
            r7 = this;
            r0 = -1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r7.mo14787y()     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r3 = r3.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x002e }
            boolean r2 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0027, all -> 0x0024 }
            if (r2 != 0) goto L_0x0019
            if (r3 == 0) goto L_0x0018
            r3.close()
        L_0x0018:
            return r0
        L_0x0019:
            r2 = 0
            long r4 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x0027, all -> 0x0024 }
            if (r3 == 0) goto L_0x0023
            r3.close()
        L_0x0023:
            return r4
        L_0x0024:
            r0 = move-exception
            r2 = r3
            goto L_0x0042
        L_0x0027:
            r2 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x002f
        L_0x002c:
            r0 = move-exception
            goto L_0x0042
        L_0x002e:
            r3 = move-exception
        L_0x002f:
            com.google.android.gms.measurement.internal.r r4 = r7.mo14235r()     // Catch:{ all -> 0x002c }
            com.google.android.gms.measurement.internal.t r4 = r4.mo14830d_()     // Catch:{ all -> 0x002c }
            java.lang.String r5 = "Error querying raw events"
            r4.mo14842a(r5, r3)     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x0041
            r2.close()
        L_0x0041:
            return r0
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            r2.close()
        L_0x0047:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14752G():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.C1916bi, java.lang.Long> mo14754a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo14221d()
            r7.mo14508k()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo14787y()     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.r r8 = r7.mo14235r()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo14838x()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r9 = "Main event not found"
            r8.mo14841a(r9)     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0072 }
            long r5 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0072 }
            int r5 = r2.length     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.hv r2 = com.google.android.gms.internal.measurement.C2106hv.m10191a(r2, r4, r5)     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.bi r4 = new com.google.android.gms.internal.measurement.bi     // Catch:{ SQLiteException -> 0x0072 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0072 }
            r4.mo13498a((com.google.android.gms.internal.measurement.C2106hv) r2)     // Catch:{ IOException -> 0x005a }
            android.util.Pair r8 = android.util.Pair.create(r4, r3)     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0059
            r1.close()
        L_0x0059:
            return r8
        L_0x005a:
            r2 = move-exception
            com.google.android.gms.measurement.internal.r r3 = r7.mo14235r()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo14830d_()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x0072 }
            r3.mo14844a(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            return r0
        L_0x0072:
            r8 = move-exception
            goto L_0x0079
        L_0x0074:
            r8 = move-exception
            r1 = r0
            goto L_0x008d
        L_0x0077:
            r8 = move-exception
            r1 = r0
        L_0x0079:
            com.google.android.gms.measurement.internal.r r9 = r7.mo14235r()     // Catch:{ all -> 0x008c }
            com.google.android.gms.measurement.internal.t r9 = r9.mo14830d_()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "Error selecting main event"
            r9.mo14842a(r2, r8)     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x008b
            r1.close()
        L_0x008b:
            return r0
        L_0x008c:
            r8 = move-exception
        L_0x008d:
            if (r1 == 0) goto L_0x0092
            r1.close()
        L_0x0092:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275ew.mo14754a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: a */
    public final boolean mo14770a(String str, Long l, long j, C1916bi biVar) {
        mo14221d();
        mo14508k();
        C0926p.m1306a(biVar);
        C0926p.m1308a(str);
        C0926p.m1306a(l);
        try {
            byte[] bArr = new byte[biVar.mo14106e()];
            C2107hw a = C2107hw.m10220a(bArr, 0, bArr.length);
            biVar.mo13499a(a);
            a.mo14068a();
            mo14235r().mo14838x().mo14843a("Saving complex main event, appId, data size", mo14232o().mo14824a(str), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l);
            contentValues.put("children_to_process", Long.valueOf(j));
            contentValues.put("main_event", bArr);
            try {
                if (mo14787y().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                mo14235r().mo14830d_().mo14842a("Failed to insert complex main event (got -1). appId", C2295r.m11413a(str));
                return false;
            } catch (SQLiteException e) {
                mo14235r().mo14830d_().mo14843a("Error storing complex main event. appId", C2295r.m11413a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo14235r().mo14830d_().mo14844a("Data loss. Failed to serialize event params/data. appId, eventId", C2295r.m11413a(str), l, e2);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo14767a(C2197c cVar, long j, boolean z) {
        mo14221d();
        mo14508k();
        C0926p.m1306a(cVar);
        C0926p.m1308a(cVar.f8230a);
        C1916bi biVar = new C1916bi();
        biVar.f7456d = Long.valueOf(cVar.f8233d);
        biVar.f7453a = new C1917bj[cVar.f8234e.mo14849a()];
        Iterator<String> it = cVar.f8234e.iterator();
        int i = 0;
        while (it.hasNext()) {
            String next = it.next();
            C1917bj bjVar = new C1917bj();
            int i2 = i + 1;
            biVar.f7453a[i] = bjVar;
            bjVar.f7459a = next;
            mo14291g().mo14549a(bjVar, cVar.f8234e.mo14850a(next));
            i = i2;
        }
        try {
            byte[] bArr = new byte[biVar.mo14106e()];
            C2107hw a = C2107hw.m10220a(bArr, 0, bArr.length);
            biVar.mo13499a(a);
            a.mo14068a();
            mo14235r().mo14838x().mo14843a("Saving event, name, data size", mo14232o().mo14824a(cVar.f8231b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", cVar.f8230a);
            contentValues.put("name", cVar.f8231b);
            contentValues.put("timestamp", Long.valueOf(cVar.f8232c));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (mo14787y().insert("raw_events", (String) null, contentValues) != -1) {
                    return true;
                }
                mo14235r().mo14830d_().mo14842a("Failed to insert raw event (got -1). appId", C2295r.m11413a(cVar.f8230a));
                return false;
            } catch (SQLiteException e) {
                mo14235r().mo14830d_().mo14843a("Error storing raw event. appId", C2295r.m11413a(cVar.f8230a), e);
                return false;
            }
        } catch (IOException e2) {
            mo14235r().mo14830d_().mo14843a("Data loss. Failed to serialize event params/data. appId", C2295r.m11413a(cVar.f8230a), e2);
            return false;
        }
    }

    /* renamed from: N */
    private final boolean m11211N() {
        return mo14231n().getDatabasePath("google_app_measurement.db").exists();
    }
}
