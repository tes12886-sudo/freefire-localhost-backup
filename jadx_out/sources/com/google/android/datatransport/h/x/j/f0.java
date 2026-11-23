package com.google.android.datatransport.h.x.j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f0 implements y, com.google.android.datatransport.h.y.b {
    private static final com.google.android.datatransport.b e = com.google.android.datatransport.b.b("proto");
    private final h0 a;
    private final com.google.android.datatransport.h.z.a b;
    private final com.google.android.datatransport.h.z.a c;
    private final z d;

    interface b<T, U> {
        U apply(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {
        final String a;
        final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    f0(com.google.android.datatransport.h.z.a aVar, com.google.android.datatransport.h.z.a aVar2, z zVar, h0 h0Var) {
        this.a = h0Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = zVar;
    }

    private Long F(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.h.n nVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(nVar.b(), String.valueOf(com.google.android.datatransport.h.a0.a.a(nVar.d()))));
        if (nVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(nVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) z0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: com.google.android.datatransport.h.x.j.m
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return f0.d0((Cursor) obj);
            }
        });
    }

    private boolean Q() {
        return l() * u() >= this.d.f();
    }

    private List<e0> T(List<e0> list, Map<Long, Set<c>> map) {
        ListIterator<e0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            e0 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                com.google.android.datatransport.h.i.a aVarL = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarL.c(cVar.a, cVar.b);
                }
                listIterator.set(e0.a(next.c(), next.d(), aVarL.d()));
            }
        }
        return list;
    }

    static /* synthetic */ Object Z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    static /* synthetic */ Object a0(Throwable th) {
        throw new com.google.android.datatransport.h.y.a("Timed out while trying to acquire the lock.", th);
    }

    static /* synthetic */ SQLiteDatabase b0(Throwable th) {
        throw new com.google.android.datatransport.h.y.a("Timed out while trying to open db.", th);
    }

    private void c(final SQLiteDatabase sQLiteDatabase) {
        w0(new d() { // from class: com.google.android.datatransport.h.x.j.g
            @Override // com.google.android.datatransport.h.x.j.f0.d
            public final Object a() {
                return f0.Z(sQLiteDatabase);
            }
        }, new b() { // from class: com.google.android.datatransport.h.x.j.d
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                f0.a0((Throwable) obj);
                throw null;
            }
        });
    }

    static /* synthetic */ Long d0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean f0(com.google.android.datatransport.h.n nVar, SQLiteDatabase sQLiteDatabase) {
        Long lF = F(sQLiteDatabase, nVar);
        return lF == null ? Boolean.FALSE : (Boolean) z0(j().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF.toString()}), new b() { // from class: com.google.android.datatransport.h.x.j.u
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private long f(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.h.n nVar) {
        Long lF = F(sQLiteDatabase, nVar);
        if (lF != null) {
            return lF.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", nVar.b());
        contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.h.a0.a.a(nVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (nVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(nVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    static /* synthetic */ List g0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            com.google.android.datatransport.h.n.a aVarA = com.google.android.datatransport.h.n.a();
            aVarA.b(cursor.getString(1));
            aVarA.d(com.google.android.datatransport.h.a0.a.b(cursor.getInt(2)));
            aVarA.c(u0(cursor.getString(3)));
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    static /* synthetic */ List h0(SQLiteDatabase sQLiteDatabase) {
        return (List) z0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: com.google.android.datatransport.h.x.j.j
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return f0.g0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List j0(com.google.android.datatransport.h.n nVar, SQLiteDatabase sQLiteDatabase) {
        List<e0> listS0 = s0(sQLiteDatabase, nVar);
        T(listS0, t0(sQLiteDatabase, listS0));
        return listS0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object l0(List list, com.google.android.datatransport.h.n nVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            com.google.android.datatransport.h.i.a aVarA = com.google.android.datatransport.h.i.a();
            aVarA.j(cursor.getString(1));
            aVarA.i(cursor.getLong(2));
            aVarA.k(cursor.getLong(3));
            aVarA.h(z ? new com.google.android.datatransport.h.h(x0(cursor.getString(4)), cursor.getBlob(5)) : new com.google.android.datatransport.h.h(x0(cursor.getString(4)), v0(j2)));
            if (!cursor.isNull(6)) {
                aVarA.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(e0.a(j2, nVar, aVarA.d()));
        }
        return null;
    }

    private long l() {
        return j().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    static /* synthetic */ Object m0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j2 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j2));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j2), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Long o0(com.google.android.datatransport.h.n nVar, com.google.android.datatransport.h.i iVar, SQLiteDatabase sQLiteDatabase) {
        if (Q()) {
            return -1L;
        }
        long jF = f(sQLiteDatabase, nVar);
        int iE = this.d.e();
        byte[] bArrA = iVar.e().a();
        boolean z = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jF));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            double length = bArrA.length;
            double d2 = iE;
            Double.isNaN(length);
            Double.isNaN(d2);
            int iCeil = (int) Math.ceil(length / d2);
            for (int i2 = 1; i2 <= iCeil; i2++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i2 - 1) * iE, Math.min(i2 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    static /* synthetic */ byte[] p0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr2 = (byte[]) arrayList.get(i2);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    static /* synthetic */ Object q0(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    static /* synthetic */ Object r0(long j2, com.google.android.datatransport.h.n nVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{nVar.b(), String.valueOf(com.google.android.datatransport.h.a0.a.a(nVar.d()))}) < 1) {
            contentValues.put("backend_name", nVar.b());
            contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.h.a0.a.a(nVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private List<e0> s0(SQLiteDatabase sQLiteDatabase, final com.google.android.datatransport.h.n nVar) {
        final ArrayList arrayList = new ArrayList();
        Long lF = F(sQLiteDatabase, nVar);
        if (lF == null) {
            return arrayList;
        }
        z0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lF.toString()}, null, null, null, String.valueOf(this.d.d())), new b() { // from class: com.google.android.datatransport.h.x.j.p
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return this.a.l0(arrayList, nVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> t0(SQLiteDatabase sQLiteDatabase, List<e0> list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).c());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        z0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: com.google.android.datatransport.h.x.j.l
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return f0.m0(map, (Cursor) obj);
            }
        });
        return map;
    }

    private long u() {
        return j().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private static byte[] u0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private byte[] v0(long j2) {
        return (byte[]) z0(j().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), new b() { // from class: com.google.android.datatransport.h.x.j.b
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return f0.p0((Cursor) obj);
            }
        });
    }

    private <T> T w0(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.c.a() >= ((long) this.d.b()) + jA) {
                    return bVar.apply(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static com.google.android.datatransport.b x0(String str) {
        return str == null ? e : com.google.android.datatransport.b.b(str);
    }

    private static String y0(Iterable<e0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<e0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static <T> T z0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // com.google.android.datatransport.h.x.j.y
    public e0 C(final com.google.android.datatransport.h.n nVar, final com.google.android.datatransport.h.i iVar) {
        com.google.android.datatransport.h.v.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", nVar.d(), iVar.j(), nVar.b());
        long jLongValue = ((Long) O(new b() { // from class: com.google.android.datatransport.h.x.j.e
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return this.a.o0(nVar, iVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return e0.a(jLongValue, nVar, iVar);
    }

    @Override // com.google.android.datatransport.h.x.j.y
    public Iterable<com.google.android.datatransport.h.n> D() {
        return (Iterable) O(new b() { // from class: com.google.android.datatransport.h.x.j.o
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return f0.h0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.h.x.j.y
    public long H(com.google.android.datatransport.h.n nVar) {
        return ((Long) z0(j().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{nVar.b(), String.valueOf(com.google.android.datatransport.h.a0.a.a(nVar.d()))}), new b() { // from class: com.google.android.datatransport.h.x.j.n
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
            }
        })).longValue();
    }

    @Override // com.google.android.datatransport.h.x.j.y
    public boolean M(final com.google.android.datatransport.h.n nVar) {
        return ((Boolean) O(new b() { // from class: com.google.android.datatransport.h.x.j.i
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return this.a.f0(nVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // com.google.android.datatransport.h.x.j.y
    public void N(Iterable<e0> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + y0(iterable);
            O(new b() { // from class: com.google.android.datatransport.h.x.j.f
                @Override // com.google.android.datatransport.h.x.j.f0.b
                public final Object apply(Object obj) {
                    return f0.q0(str, (SQLiteDatabase) obj);
                }
            });
        }
    }

    <T> T O(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseJ = j();
        sQLiteDatabaseJ.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseJ);
            sQLiteDatabaseJ.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseJ.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.h.y.b
    public <T> T b(com.google.android.datatransport.h.y.b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseJ = j();
        c(sQLiteDatabaseJ);
        try {
            T tB = aVar.b();
            sQLiteDatabaseJ.setTransactionSuccessful();
            return tB;
        } finally {
            sQLiteDatabaseJ.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // com.google.android.datatransport.h.x.j.y
    public int g() {
        final long jA = this.b.a() - this.d.c();
        return ((Integer) O(new b() { // from class: com.google.android.datatransport.h.x.j.c
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(jA)}));
            }
        })).intValue();
    }

    SQLiteDatabase j() {
        final h0 h0Var = this.a;
        h0Var.getClass();
        return (SQLiteDatabase) w0(new d() { // from class: com.google.android.datatransport.h.x.j.v
            @Override // com.google.android.datatransport.h.x.j.f0.d
            public final Object a() {
                return h0Var.getWritableDatabase();
            }
        }, new b() { // from class: com.google.android.datatransport.h.x.j.a
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                f0.b0((Throwable) obj);
                throw null;
            }
        });
    }

    @Override // com.google.android.datatransport.h.x.j.y
    public void k(Iterable<e0> iterable) {
        if (iterable.iterator().hasNext()) {
            j().compileStatement("DELETE FROM events WHERE _id in " + y0(iterable)).execute();
        }
    }

    @Override // com.google.android.datatransport.h.x.j.y
    public Iterable<e0> s(final com.google.android.datatransport.h.n nVar) {
        return (Iterable) O(new b() { // from class: com.google.android.datatransport.h.x.j.k
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return this.a.j0(nVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.h.x.j.y
    public void x(final com.google.android.datatransport.h.n nVar, final long j2) {
        O(new b() { // from class: com.google.android.datatransport.h.x.j.h
            @Override // com.google.android.datatransport.h.x.j.f0.b
            public final Object apply(Object obj) {
                return f0.r0(j2, nVar, (SQLiteDatabase) obj);
            }
        });
    }
}
