package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.FF.voiceengine.FFVoiceConst;
import com.google.android.gms.internal.measurement.td;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class j extends m9 {
    private static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f1219g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f1220h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f1221i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f1222j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f1223k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f1224l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f1225m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final i d;
    private final i9 e;

    j(v9 v9Var) {
        super(v9Var);
        this.e = new i9(this.a.e());
        this.a.z();
        this.d = new i(this, this.a.c(), "google_app_measurement.db");
    }

    static final void J(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.q.g("value");
        com.google.android.gms.common.internal.q.k(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long K(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = P().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e) {
                this.a.d().o().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long L(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = P().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return j2;
                }
                long j3 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j3;
            } catch (SQLiteException e) {
                this.a.d().o().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0249: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:108:0x0249 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    public final void I(String str, long j2, long j3, u9 u9Var) throws Throwable {
        ?? IsEmpty;
        Cursor cursor;
        String str2;
        Cursor cursorRawQuery;
        String string;
        char c;
        String str3;
        String[] strArr;
        com.google.android.gms.common.internal.q.k(u9Var);
        h();
        j();
        Cursor cursor2 = null;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseP = P();
                IsEmpty = TextUtils.isEmpty(null);
                try {
                    if (IsEmpty != 0) {
                        String[] strArr2 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                        str2 = j3 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb = new StringBuilder(str2.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str2);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseP.rawQuery(sb.toString(), strArr2);
                        if (!cursorRawQuery.moveToFirst()) {
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                                return;
                            }
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        String[] strArr3 = j3 != -1 ? new String[]{null, String.valueOf(j3)} : new String[]{null};
                        str2 = j3 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb2 = new StringBuilder(str2.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str2);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseP.rawQuery(sb2.toString(), strArr3);
                        if (!cursorRawQuery.moveToFirst()) {
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                                return;
                            }
                            return;
                        }
                        string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                    }
                    Cursor cursor3 = cursorRawQuery;
                    String str4 = string;
                    try {
                        Cursor cursorQuery = sQLiteDatabaseP.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, str4}, null, null, "rowid", "2");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                this.a.d().o().b("Raw event metadata record is missing. appId", r3.x(string2));
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                    return;
                                }
                                return;
                            }
                            try {
                                byte[] blob = cursorQuery.getBlob(0);
                                try {
                                    com.google.android.gms.internal.measurement.r4 r4VarK0 = com.google.android.gms.internal.measurement.s4.K0();
                                    x9.J(r4VarK0, blob);
                                    com.google.android.gms.internal.measurement.s4 s4VarP = r4VarK0.p();
                                    if (cursorQuery.moveToNext()) {
                                        this.a.d().r().b("Get multiple raw event metadata records, expected one. appId", r3.x(string2));
                                    }
                                    cursorQuery.close();
                                    com.google.android.gms.common.internal.q.k(s4VarP);
                                    u9Var.a = s4VarP;
                                    if (j3 != -1) {
                                        c = 1;
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{string2, str4, String.valueOf(j3)};
                                    } else {
                                        c = 1;
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{string2, str4};
                                    }
                                    String[] strArr4 = new String[4];
                                    strArr4[0] = "rowid";
                                    strArr4[c] = "name";
                                    strArr4[2] = "timestamp";
                                    strArr4[3] = "data";
                                    Cursor cursorQuery2 = sQLiteDatabaseP.query("raw_events", strArr4, str3, strArr, null, null, "rowid", null);
                                    if (!cursorQuery2.moveToFirst()) {
                                        this.a.d().r().b("Raw event data disappeared while in transaction. appId", r3.x(string2));
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                            return;
                                        }
                                        return;
                                    }
                                    do {
                                        long j4 = cursorQuery2.getLong(0);
                                        byte[] blob2 = cursorQuery2.getBlob(3);
                                        try {
                                            com.google.android.gms.internal.measurement.j4 j4VarI = com.google.android.gms.internal.measurement.k4.I();
                                            x9.J(j4VarI, blob2);
                                            com.google.android.gms.internal.measurement.j4 j4Var = j4VarI;
                                            j4Var.I(cursorQuery2.getString(1));
                                            j4Var.K(cursorQuery2.getLong(2));
                                            if (!u9Var.a(j4, j4Var.p())) {
                                                if (cursorQuery2 != null) {
                                                    cursorQuery2.close();
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (IOException e) {
                                            this.a.d().o().c("Data loss. Failed to merge raw event. appId", r3.x(string2), e);
                                        }
                                    } while (cursorQuery2.moveToNext());
                                    if (cursorQuery2 != null) {
                                        cursorQuery2.close();
                                    }
                                } catch (IOException e2) {
                                    this.a.d().o().c("Data loss. Failed to merge raw event metadata. appId", r3.x(string2), e2);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                IsEmpty = cursorQuery;
                                this.a.d().o().c("Data loss. Error selecting raw event. appId", r3.x(string2), e);
                                if (IsEmpty != 0) {
                                    IsEmpty.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursorQuery;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        IsEmpty = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e7) {
            e = e7;
            IsEmpty = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void M() {
        j();
        P().beginTransaction();
    }

    public final void N() {
        j();
        P().setTransactionSuccessful();
    }

    public final void O() {
        j();
        P().endTransaction();
    }

    final SQLiteDatabase P() {
        h();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.a.d().r().b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0172  */
    public final p Q(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Boolean boolValueOf;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        h();
        j();
        Cursor cursor3 = null;
        try {
            Cursor cursorQuery = P().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                long j2 = cursorQuery.getLong(0);
                long j3 = cursorQuery.getLong(1);
                long j4 = cursorQuery.getLong(2);
                long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                if (cursorQuery.isNull(7)) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                }
                cursor2 = cursorQuery;
                try {
                    p pVar = new p(str, str2, j2, j3, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j4, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursor2.moveToNext()) {
                        this.a.d().o().b("Got multiple records for event aggregates, expected one. appId", r3.x(str));
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return pVar;
                } catch (SQLiteException e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor2 = cursorQuery;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursorQuery;
            }
            cursor = cursor2;
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            this.a.d().o().d("Error querying events. appId", r3.x(str), this.a.H().p(str2), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            cursor3 = cursor;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    public final void R(p pVar) {
        com.google.android.gms.common.internal.q.k(pVar);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", pVar.a);
        contentValues.put("name", pVar.b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f1248g));
        contentValues.put("last_bundled_day", pVar.f1249h);
        contentValues.put("last_sampled_complex_event_id", pVar.f1250i);
        contentValues.put("last_sampling_rate", pVar.f1251j);
        contentValues.put("current_session_count", Long.valueOf(pVar.e));
        Boolean bool = pVar.f1252k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.a.d().o().b("Failed to insert/update event aggregates (got -1). appId", r3.x(pVar.a));
            }
        } catch (SQLiteException e) {
            this.a.d().o().c("Error storing event aggregates. appId", r3.x(pVar.a), e);
        }
    }

    public final void S(String str, String str2) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        h();
        j();
        try {
            P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.a.d().o().d("Error deleting user property. appId", r3.x(str), this.a.H().r(str2), e);
        }
    }

    public final boolean T(aa aaVar) {
        com.google.android.gms.common.internal.q.k(aaVar);
        h();
        j();
        if (U(aaVar.a, aaVar.c) == null) {
            if (ca.j0(aaVar.c)) {
                if (K("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{aaVar.a}) >= this.a.z().u(aaVar.a, f3.G, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(aaVar.c)) {
                long jK = K("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{aaVar.a, aaVar.b});
                this.a.z();
                if (jK >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", aaVar.a);
        contentValues.put("origin", aaVar.b);
        contentValues.put("name", aaVar.c);
        contentValues.put("set_timestamp", Long.valueOf(aaVar.d));
        J(contentValues, "value", aaVar.e);
        try {
            if (P().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.a.d().o().b("Failed to insert/update user property (got -1). appId", r3.x(aaVar.a));
            }
        } catch (SQLiteException e) {
            this.a.d().o().c("Error storing user property. appId", r3.x(aaVar.a), e);
        }
        return true;
    }

    public final aa U(String str, String str2) {
        Cursor cursorQuery;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = P().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    long j2 = cursorQuery.getLong(0);
                    Object objO = o(cursorQuery, 1);
                    if (objO == null) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    aa aaVar = new aa(str, cursorQuery.getString(2), str2, j2, objO);
                    if (cursorQuery.moveToNext()) {
                        this.a.d().o().b("Got multiple records for user property, expected one. appId", r3.x(str));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return aaVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.a.d().o().d("Error querying user property. appId", r3.x(str), this.a.H().r(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final List<aa> V(String str) {
        com.google.android.gms.common.internal.q.g(str);
        h();
        j();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            this.a.z();
            cursorQuery = P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
            if (!cursorQuery.moveToFirst()) {
                return arrayList;
            }
            do {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                String str2 = string2;
                long j2 = cursorQuery.getLong(2);
                Object objO = o(cursorQuery, 3);
                if (objO == null) {
                    this.a.d().o().b("Read invalid user property value, ignoring it. appId", r3.x(str));
                } else {
                    arrayList.add(new aa(str, str2, string, j2, objO));
                }
            } while (cursorQuery.moveToNext());
            return arrayList;
        } catch (SQLiteException e) {
            this.a.d().o().c("Error querying user properties. appId", r3.x(str), e);
            return Collections.emptyList();
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:52:0x013e  */
    public final List<aa> W(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String string;
        com.google.android.gms.common.internal.q.g(str);
        h();
        j();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        string = str2;
                    } else {
                        string = str2;
                        try {
                            arrayList2.add(string);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            cursor = null;
                            try {
                                this.a.d().o().d("(2)Error querying user properties", r3.x(str), string, e);
                                List<aa> listEmptyList = Collections.emptyList();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return listEmptyList;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(String.valueOf(str3).concat("*"));
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String string2 = sb.toString();
                    this.a.z();
                    Cursor cursorQuery = P().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string2, strArr, null, null, "rowid", "1001");
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return arrayList;
                        }
                        do {
                            int size = arrayList.size();
                            this.a.z();
                            if (size >= 1000) {
                                p3 p3VarO = this.a.d().o();
                                this.a.z();
                                p3VarO.b("Read more than the max allowed user properties, ignoring excess", Integer.valueOf(FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF));
                                break;
                            }
                            String string3 = cursorQuery.getString(0);
                            long j2 = cursorQuery.getLong(1);
                            Object objO = o(cursorQuery, 2);
                            string = cursorQuery.getString(3);
                            if (objO == null) {
                                this.a.d().o().d("(2)Read invalid user property value, ignoring it", r3.x(str), string, str3);
                            } else {
                                arrayList.add(new aa(str, string, string3, j2, objO));
                            }
                        } while (cursorQuery.moveToNext());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return arrayList;
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = cursorQuery;
                        this.a.d().o().d("(2)Error querying user properties", r3.x(str), string, e);
                        List<aa> listEmptyList2 = Collections.emptyList();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return listEmptyList2;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    string = str2;
                    cursor = null;
                    this.a.d().o().d("(2)Error querying user properties", r3.x(str), string, e);
                    List<aa> listEmptyList3 = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList3;
                }
            } catch (SQLiteException e4) {
                e = e4;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final boolean X(b bVar) {
        com.google.android.gms.common.internal.q.k(bVar);
        h();
        j();
        String str = bVar.a;
        com.google.android.gms.common.internal.q.k(str);
        if (U(str, bVar.c.b) == null) {
            long jK = K("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.a.z();
            if (jK >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", bVar.b);
        contentValues.put("name", bVar.c.b);
        Object objF = bVar.c.f();
        com.google.android.gms.common.internal.q.k(objF);
        J(contentValues, "value", objF);
        contentValues.put("active", Boolean.valueOf(bVar.e));
        contentValues.put("trigger_event_name", bVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(bVar.f1170h));
        contentValues.put("timed_out_event", this.a.G().L(bVar.f1169g));
        contentValues.put("creation_timestamp", Long.valueOf(bVar.d));
        contentValues.put("triggered_event", this.a.G().L(bVar.f1171i));
        contentValues.put("triggered_timestamp", Long.valueOf(bVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(bVar.f1172j));
        contentValues.put("expired_event", this.a.G().L(bVar.f1173k));
        try {
            if (P().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.a.d().o().b("Failed to insert/update conditional user property (got -1)", r3.x(str));
            }
        } catch (SQLiteException e) {
            this.a.d().o().c("Error storing conditional user property", r3.x(str), e);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0158  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0155: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:30:0x0155 */
    public final b Y(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        h();
        j();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = P().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    Object objO = o(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j2 = cursorQuery.getLong(4);
                    x9 x9VarY = this.b.Y();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<t> creator = t.CREATOR;
                    b bVar = new b(str, string, new y9(str2, cursorQuery.getLong(8), objO, string), cursorQuery.getLong(6), z, string2, (t) x9VarY.B(blob, creator), j2, (t) this.b.Y().B(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (t) this.b.Y().B(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        this.a.d().o().c("Got multiple records for conditional property, expected one", r3.x(str), this.a.H().r(str2));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return bVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.a.d().o().d("Error querying conditional property", r3.x(str), this.a.H().r(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final int Z(String str, String str2) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        h();
        j();
        try {
            return P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.a.d().o().d("Error deleting conditional property", r3.x(str), this.a.H().r(str2), e);
            return 0;
        }
    }

    public final List<b> a0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.q.g(str);
        h();
        j();
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
        return b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x018f  */
    public final List<b> b0(String str, String[] strArr) throws Throwable {
        Cursor cursor;
        h();
        j();
        ArrayList arrayList = new ArrayList();
        try {
            this.a.z();
            int i2 = 4;
            Cursor cursorQuery = P().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            try {
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    this.a.z();
                    if (size >= 1000) {
                        p3 p3VarO = this.a.d().o();
                        this.a.z();
                        p3VarO.b("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF));
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objO = o(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(i2) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j2 = cursorQuery.getLong(6);
                    x9 x9VarY = this.b.Y();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<t> creator = t.CREATOR;
                    arrayList.add(new b(string, string2, new y9(string3, cursorQuery.getLong(10), objO, string2), cursorQuery.getLong(8), z, string4, (t) x9VarY.B(blob, creator), j2, (t) this.b.Y().B(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (t) this.b.Y().B(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    i2 = 4;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    this.a.d().o().b("Error querying conditional user property value", e);
                    List<b> listEmptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0288  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0285: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:59:0x0285 */
    public final g5 c0(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        com.google.android.gms.common.internal.q.g(str);
        h();
        j();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = P().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    g5 g5Var = new g5(this.b.s(), str);
                    g5Var.P(cursorQuery.getString(0));
                    g5Var.R(cursorQuery.getString(1));
                    g5Var.X(cursorQuery.getString(2));
                    g5Var.h(cursorQuery.getLong(3));
                    g5Var.b0(cursorQuery.getLong(4));
                    g5Var.d0(cursorQuery.getLong(5));
                    g5Var.f0(cursorQuery.getString(6));
                    g5Var.j0(cursorQuery.getString(7));
                    g5Var.a(cursorQuery.getLong(8));
                    g5Var.c(cursorQuery.getLong(9));
                    g5Var.g(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    g5Var.p(cursorQuery.getLong(11));
                    g5Var.r(cursorQuery.getLong(12));
                    g5Var.t(cursorQuery.getLong(13));
                    g5Var.v(cursorQuery.getLong(14));
                    g5Var.k(cursorQuery.getLong(15));
                    g5Var.m(cursorQuery.getLong(16));
                    g5Var.h0(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    g5Var.Z(cursorQuery.getString(18));
                    g5Var.z(cursorQuery.getLong(19));
                    g5Var.x(cursorQuery.getLong(20));
                    g5Var.D(cursorQuery.getString(21));
                    if (!this.a.z().w(null, f3.t0)) {
                        g5Var.F(cursorQuery.isNull(22) ? 0L : cursorQuery.getLong(22));
                    }
                    g5Var.H(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    g5Var.T(cursorQuery.getString(24));
                    g5Var.e(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        g5Var.L(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    td.a();
                    if (this.a.z().w(str, f3.h0)) {
                        g5Var.V(cursorQuery.getString(27));
                    }
                    g5Var.M();
                    if (cursorQuery.moveToNext()) {
                        this.a.d().o().b("Got multiple records for app, expected one. appId", r3.x(str));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return g5Var;
                } catch (SQLiteException e) {
                    e = e;
                    this.a.d().o().c("Error querying app. appId", r3.x(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final void d0(g5 g5Var) {
        com.google.android.gms.common.internal.q.k(g5Var);
        h();
        j();
        String strN = g5Var.N();
        com.google.android.gms.common.internal.q.k(strN);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strN);
        contentValues.put("app_instance_id", g5Var.O());
        contentValues.put("gmp_app_id", g5Var.Q());
        contentValues.put("resettable_device_id_hash", g5Var.W());
        contentValues.put("last_bundle_index", Long.valueOf(g5Var.i()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(g5Var.a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(g5Var.c0()));
        contentValues.put("app_version", g5Var.e0());
        contentValues.put("app_store", g5Var.i0());
        contentValues.put("gmp_version", Long.valueOf(g5Var.k0()));
        contentValues.put("dev_cert_hash", Long.valueOf(g5Var.b()));
        contentValues.put("measurement_enabled", Boolean.valueOf(g5Var.f()));
        contentValues.put("day", Long.valueOf(g5Var.o()));
        contentValues.put("daily_public_events_count", Long.valueOf(g5Var.q()));
        contentValues.put("daily_events_count", Long.valueOf(g5Var.s()));
        contentValues.put("daily_conversions_count", Long.valueOf(g5Var.u()));
        contentValues.put("config_fetched_time", Long.valueOf(g5Var.j()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(g5Var.l()));
        contentValues.put("app_version_int", Long.valueOf(g5Var.g0()));
        contentValues.put("firebase_instance_id", g5Var.Y());
        contentValues.put("daily_error_events_count", Long.valueOf(g5Var.y()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(g5Var.w()));
        contentValues.put("health_monitor_sample", g5Var.B());
        contentValues.put("android_id", Long.valueOf(g5Var.E()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(g5Var.G()));
        contentValues.put("admob_app_id", g5Var.S());
        contentValues.put("dynamite_version", Long.valueOf(g5Var.d()));
        List<String> listK = g5Var.K();
        if (listK != null) {
            if (listK.size() == 0) {
                this.a.d().r().b("Safelisted events should not be an empty list. appId", strN);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listK));
            }
        }
        td.a();
        if (this.a.z().w(strN, f3.h0)) {
            contentValues.put("ga_app_id", g5Var.U());
        }
        try {
            SQLiteDatabase sQLiteDatabaseP = P();
            if (sQLiteDatabaseP.update("apps", contentValues, "app_id = ?", new String[]{strN}) == 0 && sQLiteDatabaseP.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.a.d().o().b("Failed to insert/update app (got -1). appId", r3.x(strN));
            }
        } catch (SQLiteException e) {
            this.a.d().o().c("Error storing app. appId", r3.x(strN), e);
        }
    }

    public final h e0(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return f0(j2, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0137  */
    public final h f0(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        com.google.android.gms.common.internal.q.g(str);
        h();
        j();
        String[] strArr = {str};
        h hVar = new h();
        try {
            try {
                SQLiteDatabase sQLiteDatabaseP = P();
                cursorQuery = sQLiteDatabaseP.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        this.a.d().r().b("Not updating daily counts, app is not known. appId", r3.x(str));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return hVar;
                    }
                    if (cursorQuery.getLong(0) == j2) {
                        hVar.b = cursorQuery.getLong(1);
                        hVar.a = cursorQuery.getLong(2);
                        hVar.c = cursorQuery.getLong(3);
                        hVar.d = cursorQuery.getLong(4);
                        hVar.e = cursorQuery.getLong(5);
                    }
                    if (z) {
                        hVar.b += j3;
                    }
                    if (z2) {
                        hVar.a += j3;
                    }
                    if (z3) {
                        hVar.c += j3;
                    }
                    if (z4) {
                        hVar.d += j3;
                    }
                    if (z5) {
                        hVar.e += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j2));
                    contentValues.put("daily_public_events_count", Long.valueOf(hVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(hVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(hVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(hVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(hVar.e));
                    sQLiteDatabaseP.update("apps", contentValues, "app_id=?", strArr);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return hVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.a.d().o().c("Error updating daily counts. appId", r3.x(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return hVar;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void g0(String str, byte[] bArr, String str2) {
        com.google.android.gms.common.internal.q.g(str);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.a.d().o().b("Failed to update remote config (got 0). appId", r3.x(str));
            }
        } catch (SQLiteException e) {
            this.a.d().o().c("Error storing remote config. appId", r3.x(str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0049  */
    public final boolean h0(com.google.android.gms.internal.measurement.s4 s4Var, boolean z) {
        p3 p3VarO;
        Object objX;
        String str;
        h();
        j();
        com.google.android.gms.common.internal.q.k(s4Var);
        com.google.android.gms.common.internal.q.g(s4Var.x());
        com.google.android.gms.common.internal.q.n(s4Var.A1());
        m();
        long jA = this.a.e().a();
        long jB1 = s4Var.B1();
        this.a.z();
        if (jB1 >= jA - f.i()) {
            long jB2 = s4Var.B1();
            this.a.z();
            if (jB2 > f.i() + jA) {
                this.a.d().r().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", r3.x(s4Var.x()), Long.valueOf(jA), Long.valueOf(s4Var.B1()));
            }
        } else {
            this.a.d().r().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", r3.x(s4Var.x()), Long.valueOf(jA), Long.valueOf(s4Var.B1()));
        }
        try {
            byte[] bArrI = this.b.Y().I(s4Var.b());
            this.a.d().w().b("Saving bundle, size", Integer.valueOf(bArrI.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", s4Var.x());
            contentValues.put("bundle_end_timestamp", Long.valueOf(s4Var.B1()));
            contentValues.put("data", bArrI);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (s4Var.C0()) {
                contentValues.put("retry_count", Integer.valueOf(s4Var.D0()));
            }
            try {
                if (P().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                this.a.d().o().b("Failed to insert bundle (got -1). appId", r3.x(s4Var.x()));
                return false;
            } catch (SQLiteException e) {
                e = e;
                p3VarO = this.a.d().o();
                objX = r3.x(s4Var.x());
                str = "Error storing bundle. appId";
                p3VarO.c(str, objX, e);
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            p3VarO = this.a.d().o();
            objX = r3.x(s4Var.x());
            str = "Data loss. Failed to serialize bundle. appId";
        }
    }

    public final String i0() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        Cursor cursor = null;
        try {
            cursorRawQuery = P().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return string;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.a.d().o().b("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                cursor = cursorRawQuery;
                th = th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        cursor = cursorRawQuery;
        th = th;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final boolean j0() {
        return K("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @Override // com.google.android.gms.measurement.internal.m9
    protected final boolean k() {
        return false;
    }

    final void m() {
        h();
        j();
        if (y()) {
            long jA = this.b.Z().f1281g.a();
            long jC = this.a.e().c();
            long jAbs = Math.abs(jC - jA);
            this.a.z();
            if (jAbs > f3.y.b(null).longValue()) {
                this.b.Z().f1281g.b(jC);
                h();
                j();
                if (y()) {
                    SQLiteDatabase sQLiteDatabaseP = P();
                    this.a.z();
                    int iDelete = sQLiteDatabaseP.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.a.e().a()), String.valueOf(f.i())});
                    if (iDelete > 0) {
                        this.a.d().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    final void n(List<Long> list) {
        h();
        j();
        com.google.android.gms.common.internal.q.k(list);
        com.google.android.gms.common.internal.q.m(list.size());
        if (y()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (K(sb2.toString(), null) > 0) {
                this.a.d().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseP = P();
                StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < ");
                sb3.append(Integer.MAX_VALUE);
                sb3.append(")");
                sQLiteDatabaseP.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                this.a.d().o().b("Error incrementing retry count. error", e);
            }
        }
    }

    final Object o(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            this.a.d().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            this.a.d().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.a.d().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final long p() {
        return L("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    protected final long q(String str, String str2) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g("first_open_count");
        h();
        j();
        SQLiteDatabase sQLiteDatabaseP = P();
        sQLiteDatabaseP.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select ");
                sb.append("first_open_count");
                sb.append(" from app2 where app_id=?");
                long jL = L(sb.toString(), new String[]{str}, -1L);
                if (jL == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseP.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.a.d().o().c("Failed to insert column (got -1). appId", r3.x(str), "first_open_count");
                        return -1L;
                    }
                    jL = 0;
                    this.a.d().o().d("Error inserting column. appId", r3.x(str), "first_open_count", e);
                    return j2;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jL));
                    if (sQLiteDatabaseP.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.a.d().o().c("Failed to update column (got 0). appId", r3.x(str), "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseP.setTransactionSuccessful();
                    return jL;
                } catch (SQLiteException e) {
                    e = e;
                    j2 = jL;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } finally {
            sQLiteDatabaseP.endTransaction();
        }
    }

    public final long r() {
        return L("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean s() {
        return K("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean t() {
        return K("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final long u(String str) {
        com.google.android.gms.common.internal.q.g(str);
        return L("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean v(String str, Long l2, long j2, com.google.android.gms.internal.measurement.k4 k4Var) {
        h();
        j();
        com.google.android.gms.common.internal.q.k(k4Var);
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(l2);
        byte[] bArrB = k4Var.b();
        this.a.d().w().c("Saving complex main event, appId, data size", this.a.H().p(str), Integer.valueOf(bArrB.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrB);
        try {
            if (P().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.a.d().o().b("Failed to insert complex main event (got -1). appId", r3.x(str));
            return false;
        } catch (SQLiteException e) {
            this.a.d().o().c("Error storing complex main event. appId", r3.x(str), e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00db: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:47:0x00db */
    public final Bundle w(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        h();
        j();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = P().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        this.a.d().w().a("Default event parameters not found");
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return null;
                    }
                    byte[] blob = cursorRawQuery.getBlob(0);
                    try {
                        com.google.android.gms.internal.measurement.j4 j4VarI = com.google.android.gms.internal.measurement.k4.I();
                        x9.J(j4VarI, blob);
                        com.google.android.gms.internal.measurement.k4 k4VarP = j4VarI.p();
                        this.b.Y();
                        List<com.google.android.gms.internal.measurement.o4> listX = k4VarP.x();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.o4 o4Var : listX) {
                            String strY = o4Var.y();
                            if (o4Var.G()) {
                                bundle.putDouble(strY, o4Var.H());
                            } else if (o4Var.D()) {
                                bundle.putFloat(strY, o4Var.E());
                            } else if (o4Var.z()) {
                                bundle.putString(strY, o4Var.A());
                            } else if (o4Var.B()) {
                                bundle.putLong(strY, o4Var.C());
                            }
                        }
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return bundle;
                    } catch (IOException e) {
                        this.a.d().o().c("Failed to retrieve default event parameters. appId", r3.x(str), e);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.a.d().o().b("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    final void x(String str, List<com.google.android.gms.internal.measurement.f3> list) throws Throwable {
        Iterator<com.google.android.gms.internal.measurement.f3> it;
        p3 p3VarO;
        String str2;
        Object objX;
        p3 p3VarR;
        String str3;
        Object objX2;
        Integer numValueOf;
        String str4;
        com.google.android.gms.internal.measurement.e3 e3Var;
        boolean z;
        String str5 = "app_id=? and audience_id=?";
        com.google.android.gms.common.internal.q.k(list);
        int i2 = 0;
        while (i2 < list.size()) {
            com.google.android.gms.internal.measurement.e3 e3VarS = list.get(i2).s();
            if (e3VarS.z() != 0) {
                e3Var = e3VarS;
                int i3 = 0;
                while (i3 < e3Var.z()) {
                    com.google.android.gms.internal.measurement.g3 g3VarS = e3Var.A(i3).s();
                    com.google.android.gms.internal.measurement.g3 g3VarClone = g3VarS.clone();
                    String strB = y5.b(g3VarS.w());
                    if (strB != null) {
                        g3VarClone.x(strB);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < g3VarS.y()) {
                        com.google.android.gms.internal.measurement.j3 j3VarZ = g3VarS.z(i4);
                        com.google.android.gms.internal.measurement.g3 g3Var = g3VarS;
                        String str6 = str5;
                        String strB2 = j7.b(j3VarZ.E(), z5.a, z5.b);
                        if (strB2 != null) {
                            com.google.android.gms.internal.measurement.i3 i3VarS = j3VarZ.s();
                            i3VarS.w(strB2);
                            g3VarClone.A(i4, i3VarS.p());
                            z = true;
                        }
                        i4++;
                        g3VarS = g3Var;
                        str5 = str6;
                    }
                    String str7 = str5;
                    if (z) {
                        e3Var.B(i3, g3VarClone);
                        list.set(i2, e3VarS.p());
                        e3Var = e3VarS;
                    }
                    i3++;
                    str5 = str7;
                }
                str4 = str5;
            } else {
                str4 = str5;
                e3Var = e3VarS;
            }
            if (e3Var.w() != 0) {
                for (int i5 = 0; i5 < e3Var.w(); i5++) {
                    com.google.android.gms.internal.measurement.p3 p3VarX = e3Var.x(i5);
                    String strB3 = j7.b(p3VarX.z(), a6.a, a6.b);
                    if (strB3 != null) {
                        com.google.android.gms.internal.measurement.o3 o3VarS = p3VarX.s();
                        o3VarS.w(strB3);
                        e3Var.y(i5, o3VarS);
                        list.set(i2, e3VarS.p());
                        e3Var = e3VarS;
                    }
                }
            }
            i2++;
            str5 = str4;
        }
        String str8 = str5;
        j();
        h();
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(list);
        SQLiteDatabase sQLiteDatabaseP = P();
        sQLiteDatabaseP.beginTransaction();
        try {
            j();
            h();
            com.google.android.gms.common.internal.q.g(str);
            SQLiteDatabase sQLiteDatabaseP2 = P();
            sQLiteDatabaseP2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseP2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator<com.google.android.gms.internal.measurement.f3> it2 = list.iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.f3 next = it2.next();
                j();
                h();
                com.google.android.gms.common.internal.q.g(str);
                com.google.android.gms.common.internal.q.k(next);
                if (next.x()) {
                    int iY = next.y();
                    Iterator<com.google.android.gms.internal.measurement.h3> it3 = next.C().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            Iterator<com.google.android.gms.internal.measurement.p3> it4 = next.z().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator<com.google.android.gms.internal.measurement.h3> it5 = next.C().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            Iterator<com.google.android.gms.internal.measurement.p3> it6 = next.z().iterator();
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    it2 = it;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.p3 next2 = it6.next();
                                                j();
                                                h();
                                                com.google.android.gms.common.internal.q.g(str);
                                                com.google.android.gms.common.internal.q.k(next2);
                                                if (TextUtils.isEmpty(next2.z())) {
                                                    this.a.d().r().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3.x(str), Integer.valueOf(iY), String.valueOf(next2.x() ? Integer.valueOf(next2.y()) : null));
                                                } else {
                                                    byte[] bArrB = next2.b();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("app_id", str);
                                                    contentValues.put("audience_id", Integer.valueOf(iY));
                                                    contentValues.put("filter_id", next2.x() ? Integer.valueOf(next2.y()) : null);
                                                    Iterator<com.google.android.gms.internal.measurement.p3> it7 = it6;
                                                    contentValues.put("property_name", next2.z());
                                                    contentValues.put("session_scoped", next2.D() ? Boolean.valueOf(next2.E()) : null);
                                                    contentValues.put("data", bArrB);
                                                    try {
                                                        if (P().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            this.a.d().o().b("Failed to insert property filter (got -1). appId", r3.x(str));
                                                        } else {
                                                            it6 = it7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        e = e;
                                                        p3VarO = this.a.d().o();
                                                        str2 = "Error storing property filter. appId";
                                                        objX = r3.x(str);
                                                        p3VarO.c(str2, objX, e);
                                                    }
                                                }
                                                j();
                                                h();
                                                com.google.android.gms.common.internal.q.g(str);
                                                SQLiteDatabase sQLiteDatabaseP3 = P();
                                                String str9 = str8;
                                                sQLiteDatabaseP3.delete("property_filters", str9, new String[]{str, String.valueOf(iY)});
                                                sQLiteDatabaseP3.delete("event_filters", str9, new String[]{str, String.valueOf(iY)});
                                                str8 = str9;
                                                it2 = it;
                                                break;
                                                break;
                                            }
                                        }
                                        com.google.android.gms.internal.measurement.h3 next3 = it5.next();
                                        j();
                                        h();
                                        com.google.android.gms.common.internal.q.g(str);
                                        com.google.android.gms.common.internal.q.k(next3);
                                        if (TextUtils.isEmpty(next3.z())) {
                                            this.a.d().r().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3.x(str), Integer.valueOf(iY), String.valueOf(next3.x() ? Integer.valueOf(next3.y()) : null));
                                            it = it2;
                                            j();
                                            h();
                                            com.google.android.gms.common.internal.q.g(str);
                                            SQLiteDatabase sQLiteDatabaseP4 = P();
                                            String str10 = str8;
                                            sQLiteDatabaseP4.delete("property_filters", str10, new String[]{str, String.valueOf(iY)});
                                            sQLiteDatabaseP4.delete("event_filters", str10, new String[]{str, String.valueOf(iY)});
                                            str8 = str10;
                                            it2 = it;
                                            break;
                                        }
                                        byte[] bArrB2 = next3.b();
                                        it = it2;
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("app_id", str);
                                        contentValues2.put("audience_id", Integer.valueOf(iY));
                                        contentValues2.put("filter_id", next3.x() ? Integer.valueOf(next3.y()) : null);
                                        contentValues2.put("event_name", next3.z());
                                        contentValues2.put("session_scoped", next3.I() ? Boolean.valueOf(next3.J()) : null);
                                        contentValues2.put("data", bArrB2);
                                        try {
                                            if (P().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                this.a.d().o().b("Failed to insert event filter (got -1). appId", r3.x(str));
                                            }
                                            it2 = it;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            p3VarO = this.a.d().o();
                                            str2 = "Error storing event filter. appId";
                                            objX = r3.x(str);
                                            p3VarO.c(str2, objX, e);
                                            j();
                                            h();
                                            com.google.android.gms.common.internal.q.g(str);
                                            SQLiteDatabase sQLiteDatabaseP5 = P();
                                            String str11 = str8;
                                            sQLiteDatabaseP5.delete("property_filters", str11, new String[]{str, String.valueOf(iY)});
                                            sQLiteDatabaseP5.delete("event_filters", str11, new String[]{str, String.valueOf(iY)});
                                            str8 = str11;
                                            it2 = it;
                                            break;
                                        }
                                    }
                                } else if (!it4.next().x()) {
                                    p3VarR = this.a.d().r();
                                    str3 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    objX2 = r3.x(str);
                                    numValueOf = Integer.valueOf(iY);
                                }
                            }
                        } else if (!it3.next().x()) {
                            p3VarR = this.a.d().r();
                            str3 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                            objX2 = r3.x(str);
                            numValueOf = Integer.valueOf(iY);
                        }
                        p3VarR.c(str3, objX2, numValueOf);
                        break;
                    }
                }
                try {
                    this.a.d().r().b("Audience with no ID. appId", r3.x(str));
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabaseP.endTransaction();
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.f3 f3Var : list) {
                arrayList.add(f3Var.x() ? Integer.valueOf(f3Var.y()) : null);
            }
            com.google.android.gms.common.internal.q.g(str);
            j();
            h();
            SQLiteDatabase sQLiteDatabaseP6 = P();
            try {
                long jK = K("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, this.a.z().t(str, f3.F)));
                if (jK > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseP6.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i6);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e3) {
                this.a.d().o().c("Database error querying filters. appId", r3.x(str), e3);
            }
            sQLiteDatabaseP.setTransactionSuccessful();
            sQLiteDatabaseP.endTransaction();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    protected final boolean y() {
        Context contextC = this.a.c();
        this.a.z();
        return contextC.getDatabasePath("google_app_measurement.db").exists();
    }
}
