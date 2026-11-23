package j.d.a.e.a.a.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.provider.BaseColumns;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static h f2017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f2018i = {"FN", "URI", "ETAG", "TOTALBYTES", "CURRENTBYTES", "LASTMOD", "STATUS", "CONTROL", "FAILCOUNT", "RETRYAFTER", "REDIRECTCOUNT", "FILEIDX"};
    final SQLiteOpenHelper a;
    SQLiteStatement b;
    SQLiteStatement c;
    long d;
    int e;
    int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f2019g;

    public static class a implements BaseColumns {
        public static final String[][] a = {new String[]{"_id", "INTEGER PRIMARY KEY"}, new String[]{"FILEIDX", "INTEGER UNIQUE"}, new String[]{"URI", "TEXT"}, new String[]{"FN", "TEXT UNIQUE"}, new String[]{"ETAG", "TEXT"}, new String[]{"TOTALBYTES", "INTEGER"}, new String[]{"CURRENTBYTES", "INTEGER"}, new String[]{"LASTMOD", "INTEGER"}, new String[]{"STATUS", "INTEGER"}, new String[]{"CONTROL", "INTEGER"}, new String[]{"FAILCOUNT", "INTEGER"}, new String[]{"RETRYAFTER", "INTEGER"}, new String[]{"REDIRECTCOUNT", "INTEGER"}};
    }

    protected static class b extends SQLiteOpenHelper {
        private static final String[][][] a = {a.a, c.a};
        private static final String[] b = {"DownloadColumns", "MetadataColumns"};

        b(Context context) {
            super(context, "DownloadsDB", (SQLiteDatabase.CursorFactory) null, 7);
        }

        private String b(String str, String[][] strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(str);
            sb.append(" (");
            for (String[] strArr2 : strArr) {
                sb.append(' ');
                sb.append(strArr2[0]);
                sb.append(' ');
                sb.append(strArr2[1]);
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(");");
            return sb.toString();
        }

        private void c(SQLiteDatabase sQLiteDatabase) {
            for (String str : b) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* JADX INFO: Infinite loop detected, blocks: 4, insns: 0 */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            int length = a.length;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    sQLiteDatabase.execSQL(b(b[i2], a[i2]));
                } catch (Exception e) {
                    while (true) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            Log.w(b.class.getName(), "Upgrading database from version " + i2 + " to " + i3 + ", which will destroy all old data");
            c(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }

    public static class c implements BaseColumns {
        public static final String[][] a = {new String[]{"_id", "INTEGER PRIMARY KEY"}, new String[]{"APKVERSION", "INTEGER"}, new String[]{"DOWNLOADSTATUS", "INTEGER"}, new String[]{"DOWNLOADFLAGS", "INTEGER"}};
    }

    private h(Context context) {
        this.d = -1L;
        this.e = -1;
        this.f = -1;
        b bVar = new b(context);
        this.a = bVar;
        Cursor cursorRawQuery = bVar.getReadableDatabase().rawQuery("SELECT APKVERSION,_id,DOWNLOADSTATUS,DOWNLOADFLAGS FROM MetadataColumns LIMIT 1", null);
        if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
            this.e = cursorRawQuery.getInt(0);
            this.d = cursorRawQuery.getLong(1);
            this.f = cursorRawQuery.getInt(2);
            this.f2019g = cursorRawQuery.getInt(3);
            cursorRawQuery.close();
        }
        f2017h = this;
    }

    public static synchronized h a(Context context) {
        h hVar = f2017h;
        if (hVar != null) {
            return hVar;
        }
        return new h(context);
    }

    private SQLiteStatement b() {
        if (this.b == null) {
            this.b = this.a.getReadableDatabase().compileStatement("SELECT _id FROM DownloadColumns WHERE FILEIDX = ?");
        }
        return this.b;
    }

    private SQLiteStatement h() {
        if (this.c == null) {
            this.c = this.a.getReadableDatabase().compileStatement("UPDATE DownloadColumns SET CURRENTBYTES = ? WHERE FILEIDX = ?");
        }
        return this.c;
    }

    protected d c(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        try {
            cursorQuery = this.a.getReadableDatabase().query("DownloadColumns", f2018i, "FN = ?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        d dVarD = d(cursorQuery);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return dVarD;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    public d d(Cursor cursor) {
        d dVar = new d(cursor.getInt(11), cursor.getString(0), h.class.getPackage().getName());
        i(dVar, cursor);
        return dVar;
    }

    public d[] e() throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        try {
            cursorQuery = this.a.getReadableDatabase().query("DownloadColumns", f2018i, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        d[] dVarArr = new d[cursorQuery.getCount()];
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            dVarArr[i2] = d(cursorQuery);
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            i2 = i3;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return dVarArr;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
        }
    }

    public long f(int i2) {
        SQLiteStatement sQLiteStatementB = b();
        sQLiteStatementB.clearBindings();
        sQLiteStatementB.bindLong(1, i2);
        try {
            return sQLiteStatementB.simpleQueryForLong();
        } catch (SQLiteDoneException unused) {
            return -1L;
        }
    }

    public long g(d dVar) {
        return f(dVar.b);
    }

    public void i(d dVar, Cursor cursor) {
        dVar.a = cursor.getString(1);
        dVar.d = cursor.getString(2);
        dVar.e = cursor.getLong(3);
        dVar.f = cursor.getLong(4);
        dVar.f1999g = cursor.getLong(5);
        dVar.f2000h = cursor.getInt(6);
        dVar.f2001i = cursor.getInt(7);
        dVar.f2002j = cursor.getInt(8);
        dVar.f2003k = cursor.getInt(9);
        dVar.f2004l = cursor.getInt(10);
    }

    public boolean j(d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("FILEIDX", Integer.valueOf(dVar.b));
        contentValues.put("FN", dVar.c);
        contentValues.put("URI", dVar.a);
        contentValues.put("ETAG", dVar.d);
        contentValues.put("TOTALBYTES", Long.valueOf(dVar.e));
        contentValues.put("CURRENTBYTES", Long.valueOf(dVar.f));
        contentValues.put("LASTMOD", Long.valueOf(dVar.f1999g));
        contentValues.put("STATUS", Integer.valueOf(dVar.f2000h));
        contentValues.put("CONTROL", Integer.valueOf(dVar.f2001i));
        contentValues.put("FAILCOUNT", Integer.valueOf(dVar.f2002j));
        contentValues.put("RETRYAFTER", Integer.valueOf(dVar.f2003k));
        contentValues.put("REDIRECTCOUNT", Integer.valueOf(dVar.f2004l));
        return k(dVar, contentValues);
    }

    public boolean k(d dVar, ContentValues contentValues) {
        long jG = dVar == null ? -1L : g(dVar);
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            if (jG == -1) {
                return -1 != writableDatabase.insert("DownloadColumns", "URI", contentValues);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DownloadColumns._id = ");
            sb.append(jG);
            return 1 != writableDatabase.update("DownloadColumns", contentValues, sb.toString(), null) ? false : false;
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    public void l(d dVar) {
        SQLiteStatement sQLiteStatementH = h();
        sQLiteStatementH.clearBindings();
        sQLiteStatementH.bindLong(1, dVar.f);
        sQLiteStatementH.bindLong(2, dVar.b);
        sQLiteStatementH.execute();
    }

    public boolean m(int i2) {
        if (this.f2019g == i2) {
            return true;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("DOWNLOADFLAGS", Integer.valueOf(i2));
        if (!p(contentValues)) {
            return false;
        }
        this.f2019g = i2;
        return true;
    }

    public boolean n(d dVar) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.a.getReadableDatabase().query("DownloadColumns", f2018i, "FN= ?", new String[]{dVar.c}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                return false;
            }
            i(dVar, cursorQuery);
            return true;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public boolean o(int i2, int i3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("APKVERSION", Integer.valueOf(i2));
        contentValues.put("DOWNLOADSTATUS", Integer.valueOf(i3));
        if (!p(contentValues)) {
            return false;
        }
        this.e = i2;
        this.f = i3;
        return true;
    }

    public boolean p(ContentValues contentValues) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        if (-1 != this.d) {
            StringBuilder sb = new StringBuilder();
            sb.append("_id = ");
            sb.append(this.d);
            return writableDatabase.update("MetadataColumns", contentValues, sb.toString(), null) != 0;
        }
        long jInsert = writableDatabase.insert("MetadataColumns", "APKVERSION", contentValues);
        if (-1 == jInsert) {
            return false;
        }
        this.d = jInsert;
        return true;
    }

    public boolean q(int i2) {
        if (this.f == i2) {
            return true;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("DOWNLOADSTATUS", Integer.valueOf(i2));
        if (!p(contentValues)) {
            return false;
        }
        this.f = i2;
        return true;
    }
}
