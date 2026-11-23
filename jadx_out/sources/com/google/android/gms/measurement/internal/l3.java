package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends f4 {
    private final k3 c;
    private boolean d;

    l3(a5 a5Var) {
        super(a5Var);
        Context contextC = this.a.c();
        this.a.z();
        this.c = new k3(this, contextC, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0116 A[PHI: r8
  0x0116: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:55:0x00e6, B:70:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v9 */
    private final boolean x(int i2, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseV;
        ?? RawQuery;
        ?? r10;
        h();
        ?? r2 = 0;
        if (this.d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i2));
        contentValues.put("entry", bArr);
        this.a.z();
        int i3 = 0;
        int i4 = 5;
        for (int i5 = 5; i3 < i5; i5 = 5) {
            ?? r8 = 0;
            r8 = 0;
            r8 = 0;
            sQLiteDatabase = null;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseV = v();
                try {
                    if (sQLiteDatabaseV == null) {
                        this.d = true;
                        return r2;
                    }
                    sQLiteDatabaseV.beginTransaction();
                    RawQuery = sQLiteDatabaseV.rawQuery("select count(1) from messages", null);
                    long j2 = 0;
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j2 = RawQuery.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r8 = RawQuery;
                            try {
                                SystemClock.sleep(i4);
                                i4 += 20;
                                if (r8 != 0) {
                                    r8.close();
                                }
                                if (sQLiteDatabaseV != null) {
                                    sQLiteDatabaseV.close();
                                }
                                i3++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r8 != 0) {
                                    r8.close();
                                }
                                if (sQLiteDatabaseV != null) {
                                    sQLiteDatabaseV.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            sQLiteDatabase = sQLiteDatabaseV;
                            r10 = RawQuery;
                            this.a.d().o().b("Error writing entry; local database full", e);
                            this.d = true;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i3++;
                            r2 = 0;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase = sQLiteDatabaseV;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseV = sQLiteDatabase;
                                    r8 = RawQuery;
                                    if (r8 != 0) {
                                        r8.close();
                                    }
                                    if (sQLiteDatabaseV != null) {
                                        sQLiteDatabaseV.close();
                                    }
                                    throw th;
                                }
                            }
                            this.a.d().o().b("Error writing entry to local database", e);
                            this.d = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i3++;
                            r2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            r8 = RawQuery;
                            if (r8 != 0) {
                                r8.close();
                            }
                            if (sQLiteDatabaseV != null) {
                                sQLiteDatabaseV.close();
                            }
                            throw th;
                        }
                    }
                    if (j2 >= 100000) {
                        this.a.d().o().a("Data loss, local db full");
                        long j3 = (100000 - j2) + 1;
                        String[] strArr = new String[1];
                        strArr[r2] = Long.toString(j3);
                        long jDelete = sQLiteDatabaseV.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j3) {
                            this.a.d().o().d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j3), Long.valueOf(jDelete), Long.valueOf(j3 - jDelete));
                        }
                    }
                    sQLiteDatabaseV.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseV.setTransactionSuccessful();
                    sQLiteDatabaseV.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseV.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                    RawQuery = 0;
                } catch (SQLiteException e4) {
                    e = e4;
                    RawQuery = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseV = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                r10 = 0;
            } catch (SQLiteException e6) {
                e = e6;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseV = null;
                if (r8 != 0) {
                    r8.close();
                }
                if (sQLiteDatabaseV != null) {
                    sQLiteDatabaseV.close();
                }
                throw th;
            }
        }
        this.a.d().w().a("Failed to write entry to local database");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.f4
    protected final boolean m() {
        return false;
    }

    public final void o() {
        int iDelete;
        h();
        try {
            SQLiteDatabase sQLiteDatabaseV = v();
            if (sQLiteDatabaseV == null || (iDelete = sQLiteDatabaseV.delete("messages", null, null)) <= 0) {
                return;
            }
            this.a.d().w().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.a.d().o().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean p(t tVar) {
        Parcel parcelObtain = Parcel.obtain();
        u.a(tVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return x(0, bArrMarshall);
        }
        this.a.d().p().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean q(y9 y9Var) {
        Parcel parcelObtain = Parcel.obtain();
        z9.a(y9Var, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return x(1, bArrMarshall);
        }
        this.a.d().p().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean r(b bVar) {
        byte[] bArrL = this.a.G().L(bVar);
        if (bArrL.length <= 131072) {
            return x(2, bArrL);
        }
        this.a.d().p().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0211 A[Catch: all -> 0x025d, TryCatch #30 {all -> 0x025d, blocks: (B:143:0x020b, B:145:0x0211, B:146:0x0214, B:161:0x0241, B:153:0x022e), top: B:189:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0225  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:158:0x023a A[PHI: r9 r15
  0x023a: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:149:0x0228, B:164:0x0255, B:157:0x0238] A[DONT_GENERATE, DONT_INLINE]
  0x023a: PHI (r15v7 android.database.sqlite.SQLiteDatabase) = 
  (r15v5 android.database.sqlite.SQLiteDatabase)
  (r15v6 android.database.sqlite.SQLiteDatabase)
  (r15v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:149:0x0228, B:164:0x0255, B:157:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x0252  */
    /* JADX WARN: Code duplicated, block: B:170:0x0261  */
    /* JADX WARN: Code duplicated, block: B:172:0x0266  */
    /* JADX WARN: Code duplicated, block: B:189:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0258 A[SYNTHETIC] */
    public final List<com.google.android.gms.common.internal.y.a> s(int i2) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery2;
        long j2;
        String str;
        String[] strArr;
        Parcelable parcelable;
        p3 p3VarO;
        String str2;
        h();
        Cursor cursor = null;
        if (this.d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!w()) {
            return arrayList;
        }
        int i3 = 0;
        int i4 = 5;
        for (int i5 = 5; i3 < i5; i5 = 5) {
            try {
                SQLiteDatabase sQLiteDatabaseV = v();
                if (sQLiteDatabaseV == null) {
                    this.d = true;
                    return null;
                }
                try {
                    sQLiteDatabaseV.beginTransaction();
                    try {
                        try {
                            cursorQuery2 = sQLiteDatabaseV.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                            try {
                                long j3 = -1;
                                try {
                                    if (cursorQuery2.moveToFirst()) {
                                        j2 = cursorQuery2.getLong(0);
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                    } else {
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                        j2 = -1;
                                    }
                                    if (j2 != -1) {
                                        str = "rowid<?";
                                        strArr = new String[]{String.valueOf(j2)};
                                    } else {
                                        str = null;
                                        strArr = null;
                                    }
                                    cursorQuery = sQLiteDatabaseV.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                    while (cursorQuery.moveToNext()) {
                                        try {
                                            j3 = cursorQuery.getLong(0);
                                            int i6 = cursorQuery.getInt(1);
                                            byte[] blob = cursorQuery.getBlob(2);
                                            if (i6 == 0) {
                                                Parcel parcelObtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        parcelObtain.unmarshall(blob, 0, blob.length);
                                                        parcelObtain.setDataPosition(0);
                                                        parcelable = (t) t.CREATOR.createFromParcel(parcelObtain);
                                                        parcelObtain.recycle();
                                                        if (parcelable != null) {
                                                            arrayList.add(parcelable);
                                                        }
                                                    } catch (com.google.android.gms.common.internal.y.b.a unused) {
                                                        this.a.d().o().a("Failed to load event from local database");
                                                        parcelObtain.recycle();
                                                    }
                                                } catch (Throwable th) {
                                                    parcelObtain.recycle();
                                                    throw th;
                                                }
                                            } else if (i6 == 1) {
                                                Parcel parcelObtain2 = Parcel.obtain();
                                                try {
                                                    try {
                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                        parcelObtain2.setDataPosition(0);
                                                        parcelable = (y9) y9.CREATOR.createFromParcel(parcelObtain2);
                                                        parcelObtain2.recycle();
                                                    } catch (com.google.android.gms.common.internal.y.b.a unused2) {
                                                        this.a.d().o().a("Failed to load user property from local database");
                                                        parcelObtain2.recycle();
                                                        parcelable = null;
                                                    }
                                                    if (parcelable != null) {
                                                        arrayList.add(parcelable);
                                                    }
                                                } catch (Throwable th2) {
                                                    parcelObtain2.recycle();
                                                    throw th2;
                                                }
                                            } else if (i6 == 2) {
                                                Parcel parcelObtain3 = Parcel.obtain();
                                                try {
                                                    try {
                                                        parcelObtain3.unmarshall(blob, 0, blob.length);
                                                        parcelObtain3.setDataPosition(0);
                                                        parcelable = (b) b.CREATOR.createFromParcel(parcelObtain3);
                                                        parcelObtain3.recycle();
                                                    } catch (com.google.android.gms.common.internal.y.b.a unused3) {
                                                        this.a.d().o().a("Failed to load conditional user property from local database");
                                                        parcelObtain3.recycle();
                                                        parcelable = null;
                                                    }
                                                    if (parcelable != null) {
                                                        arrayList.add(parcelable);
                                                    }
                                                } catch (Throwable th3) {
                                                    parcelObtain3.recycle();
                                                    throw th3;
                                                }
                                            } else {
                                                if (i6 == 3) {
                                                    p3VarO = this.a.d().r();
                                                    str2 = "Skipping app launch break";
                                                } else {
                                                    p3VarO = this.a.d().o();
                                                    str2 = "Unknown record type in local database";
                                                }
                                                p3VarO.a(str2);
                                            }
                                        } catch (SQLiteDatabaseLockedException unused4) {
                                            sQLiteDatabase2 = sQLiteDatabaseV;
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            sQLiteDatabase2 = sQLiteDatabaseV;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            sQLiteDatabase2 = sQLiteDatabaseV;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            sQLiteDatabase2 = sQLiteDatabaseV;
                                        }
                                    }
                                    sQLiteDatabase2 = sQLiteDatabaseV;
                                    try {
                                        if (sQLiteDatabase2.delete("messages", "rowid <= ?", new String[]{Long.toString(j3)}) < arrayList.size()) {
                                            this.a.d().o().a("Fewer entries removed from local database than expected");
                                        }
                                        sQLiteDatabase2.setTransactionSuccessful();
                                        sQLiteDatabase2.endTransaction();
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        sQLiteDatabase2.close();
                                        return arrayList;
                                    } catch (SQLiteDatabaseLockedException unused5) {
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i4);
                                        i4 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i3++;
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.a.d().o().b("Error reading entries from local database", e);
                                        this.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i3++;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            try {
                                                if (sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        this.a.d().o().b("Error reading entries from local database", e);
                                        this.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i3++;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        cursor = cursorQuery;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    sQLiteDatabase2 = sQLiteDatabaseV;
                                    cursorQuery = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i4);
                                    i4 += 20;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i3++;
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    sQLiteDatabase2 = sQLiteDatabaseV;
                                    cursorQuery = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.a.d().o().b("Error reading entries from local database", e);
                                    this.d = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i3++;
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    sQLiteDatabase2 = sQLiteDatabaseV;
                                    cursorQuery = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                        if (sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                    }
                                    this.a.d().o().b("Error reading entries from local database", e);
                                    this.d = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i3++;
                                } catch (Throwable th7) {
                                    th = th7;
                                    sQLiteDatabase2 = sQLiteDatabaseV;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteDatabase2 = sQLiteDatabaseV;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused7) {
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i4);
                                        i4 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i3++;
                                    } catch (SQLiteFullException e7) {
                                        e = e7;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.a.d().o().b("Error reading entries from local database", e);
                                        this.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i3++;
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        }
                                        this.a.d().o().b("Error reading entries from local database", e);
                                        this.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i3++;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            sQLiteDatabase2 = sQLiteDatabaseV;
                            cursorQuery2 = null;
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        sQLiteDatabase2 = sQLiteDatabaseV;
                    }
                } catch (SQLiteDatabaseLockedException unused8) {
                    sQLiteDatabase2 = sQLiteDatabaseV;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    sQLiteDatabase2 = sQLiteDatabaseV;
                } catch (SQLiteException e10) {
                    e = e10;
                    sQLiteDatabase2 = sQLiteDatabaseV;
                } catch (Throwable th12) {
                    th = th12;
                    sQLiteDatabase2 = sQLiteDatabaseV;
                }
            } catch (SQLiteDatabaseLockedException unused9) {
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e11) {
                e = e11;
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (SQLiteException e12) {
                e = e12;
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (Throwable th13) {
                th = th13;
                sQLiteDatabase = null;
            }
        }
        this.a.d().r().a("Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean t() {
        return x(3, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[PHI: r4
  0x0069: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:29:0x0060, B:35:0x007c, B:32:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean u() {
        h();
        if (!this.d && w()) {
            int i2 = 5;
            for (int i3 = 0; i3 < 5; i3++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase sQLiteDatabaseV = v();
                    if (sQLiteDatabaseV == null) {
                        this.d = true;
                        return false;
                    }
                    sQLiteDatabaseV.beginTransaction();
                    sQLiteDatabaseV.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseV.setTransactionSuccessful();
                    sQLiteDatabaseV.endTransaction();
                    sQLiteDatabaseV.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e) {
                    this.a.d().o().b("Error deleting app launch break from local database", e);
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.a.d().o().b("Error deleting app launch break from local database", e2);
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.a.d().r().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    final SQLiteDatabase v() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    final boolean w() {
        Context contextC = this.a.c();
        this.a.z();
        return contextC.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
