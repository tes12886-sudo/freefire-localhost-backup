package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.ed;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class sa extends m9 {
    private String d;
    private Set<Integer> e;
    private Map<Integer, na> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f1286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f1287h;

    sa(v9 v9Var) {
        super(v9Var);
    }

    private final na n(Integer num) {
        if (this.f.containsKey(num)) {
            return this.f.get(num);
        }
        na naVar = new na(this, this.d, null);
        this.f.put(num, naVar);
        return naVar;
    }

    private final boolean o(int i2, int i3) {
        na naVar = this.f.get(Integer.valueOf(i2));
        if (naVar == null) {
            return false;
        }
        return naVar.d.get(i3);
    }

    @Override // com.google.android.gms.measurement.internal.m9
    protected final boolean k() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ac A[Catch: all -> 0x02e4, SQLiteException -> 0x02e7, LOOP:11: B:105:0x02ac->B:499:?, LOOP_START, TryCatch #2 {all -> 0x02e4, blocks: (B:103:0x02a6, B:105:0x02ac, B:107:0x02bd, B:108:0x02c5, B:112:0x02dd, B:123:0x02ef), top: B:425:0x0296 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02bd A[Catch: all -> 0x02e4, SQLiteException -> 0x02e7, TryCatch #2 {all -> 0x02e4, blocks: (B:103:0x02a6, B:105:0x02ac, B:107:0x02bd, B:108:0x02c5, B:112:0x02dd, B:123:0x02ef), top: B:425:0x0296 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02d9 A[PHI: r0 r5
  0x02d9: PHI (r0v64 java.util.Map) = (r0v46 java.util.Map), (r0v66 java.util.Map), (r0v40 java.util.Map) binds: [B:124:0x0306, B:113:0x02e1, B:110:0x02d7] A[DONT_GENERATE, DONT_INLINE]
  0x02d9: PHI (r5v16 android.database.Cursor) = (r5v9 android.database.Cursor), (r5v17 android.database.Cursor), (r5v17 android.database.Cursor) binds: [B:124:0x0306, B:113:0x02e1, B:110:0x02d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x02dd A[Catch: all -> 0x02e4, SQLiteException -> 0x02e7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02e4, blocks: (B:103:0x02a6, B:105:0x02ac, B:107:0x02bd, B:108:0x02c5, B:112:0x02dd, B:123:0x02ef), top: B:425:0x0296 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0317  */
    /* JADX WARN: Code duplicated, block: B:131:0x0333  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:158:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:164:0x0408  */
    /* JADX WARN: Code duplicated, block: B:170:0x041d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0437  */
    /* JADX WARN: Code duplicated, block: B:175:0x0440  */
    /* JADX WARN: Code duplicated, block: B:179:0x044c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0461  */
    /* JADX WARN: Code duplicated, block: B:192:0x0499  */
    /* JADX WARN: Code duplicated, block: B:195:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:199:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:200:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:205:0x04fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x0595  */
    /* JADX WARN: Code duplicated, block: B:232:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:234:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:236:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:237:0x060c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0658  */
    /* JADX WARN: Code duplicated, block: B:248:0x06a7 A[Catch: SQLiteException -> 0x0722, all -> 0x0757, LOOP:8: B:248:0x06a7->B:266:0x0709, LOOP_START, PHI: r2 r13 r29
  0x06a7: PHI (r2v48 java.lang.String) = (r2v46 java.lang.String), (r2v52 java.lang.String) binds: [B:247:0x06a5, B:266:0x0709] A[DONT_GENERATE, DONT_INLINE]
  0x06a7: PHI (r13v17 h.f.a) = (r13v10 h.f.a), (r13v20 h.f.a) binds: [B:247:0x06a5, B:266:0x0709] A[DONT_GENERATE, DONT_INLINE]
  0x06a7: PHI (r29v7 java.lang.String) = (r29v2 java.lang.String), (r29v8 java.lang.String) binds: [B:247:0x06a5, B:266:0x0709] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x0722, blocks: (B:246:0x06a1, B:248:0x06a7, B:249:0x06ac, B:251:0x06bc), top: B:430:0x06a1 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:255:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:264:0x0703  */
    /* JADX WARN: Code duplicated, block: B:266:0x0709 A[LOOP:8: B:248:0x06a7->B:266:0x0709, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x0712  */
    /* JADX WARN: Code duplicated, block: B:272:0x071c A[PHI: r0 r4 r13 r26 r28 r66
  0x071c: PHI (r0v98 java.util.Map) = (r0v100 java.util.Map), (r0v109 java.util.Map) binds: [B:288:0x0750, B:271:0x071a] A[DONT_GENERATE, DONT_INLINE]
  0x071c: PHI (r4v28 android.database.Cursor) = (r4v29 android.database.Cursor), (r4v31 android.database.Cursor) binds: [B:288:0x0750, B:271:0x071a] A[DONT_GENERATE, DONT_INLINE]
  0x071c: PHI (r13v12 java.lang.String) = (r13v13 java.lang.String), (r13v16 java.lang.String) binds: [B:288:0x0750, B:271:0x071a] A[DONT_GENERATE, DONT_INLINE]
  0x071c: PHI (r26v5 java.lang.String) = (r26v6 java.lang.String), (r26v8 java.lang.String) binds: [B:288:0x0750, B:271:0x071a] A[DONT_GENERATE, DONT_INLINE]
  0x071c: PHI (r28v7 java.lang.String) = (r28v8 java.lang.String), (r28v14 java.lang.String) binds: [B:288:0x0750, B:271:0x071a] A[DONT_GENERATE, DONT_INLINE]
  0x071c: PHI (r66v5 java.util.Iterator<com.google.android.gms.internal.measurement.k4>) = 
  (r66v6 java.util.Iterator<com.google.android.gms.internal.measurement.k4>)
  (r66v8 java.util.Iterator<com.google.android.gms.internal.measurement.k4>)
 binds: [B:288:0x0750, B:271:0x071a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:296:0x075f  */
    /* JADX WARN: Code duplicated, block: B:300:0x0775  */
    /* JADX WARN: Code duplicated, block: B:306:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:308:0x07d7 A[LOOP:10: B:304:0x07a4->B:308:0x07d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:312:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:319:0x0813  */
    /* JADX WARN: Code duplicated, block: B:322:0x0822  */
    /* JADX WARN: Code duplicated, block: B:324:0x0835  */
    /* JADX WARN: Code duplicated, block: B:328:0x0879 A[Catch: SQLiteException -> 0x08d9, all -> 0x08fe, LOOP:3: B:328:0x0879->B:475:?, LOOP_START, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x08d9, blocks: (B:326:0x0873, B:328:0x0879, B:329:0x087e), top: B:423:0x0873 }] */
    /* JADX WARN: Code duplicated, block: B:333:0x089e A[Catch: SQLiteException -> 0x08d7, all -> 0x08fe, TryCatch #0 {SQLiteException -> 0x08d7, blocks: (B:331:0x088e, B:333:0x089e, B:334:0x08a6, B:337:0x08bf, B:336:0x08ab, B:343:0x08cd), top: B:421:0x088e }] */
    /* JADX WARN: Code duplicated, block: B:340:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:342:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:345:0x08d3 A[PHI: r0 r9
  0x08d3: PHI (r0v148 java.util.Map) = (r0v150 java.util.Map), (r0v156 java.util.Map) binds: [B:355:0x08f7, B:344:0x08d1] A[DONT_GENERATE, DONT_INLINE]
  0x08d3: PHI (r9v41 android.database.Cursor) = (r9v42 android.database.Cursor), (r9v43 android.database.Cursor) binds: [B:355:0x08f7, B:344:0x08d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:363:0x0906  */
    /* JADX WARN: Code duplicated, block: B:367:0x0915  */
    /* JADX WARN: Code duplicated, block: B:370:0x093a  */
    /* JADX WARN: Code duplicated, block: B:373:0x094b  */
    /* JADX WARN: Code duplicated, block: B:375:0x0962  */
    /* JADX WARN: Code duplicated, block: B:377:0x0976  */
    /* JADX WARN: Code duplicated, block: B:378:0x097f  */
    /* JADX WARN: Code duplicated, block: B:382:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:391:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:392:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:395:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:400:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:405:0x0aa0 A[Catch: SQLiteException -> 0x0ab4, TRY_LEAVE, TryCatch #22 {SQLiteException -> 0x0ab4, blocks: (B:403:0x0a96, B:405:0x0aa0), top: B:447:0x0a96 }] */
    /* JADX WARN: Code duplicated, block: B:470:0x092b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0a21 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0a16 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x09ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0acb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0808 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x0701 A[EDGE_INSN: B:489:0x0701->B:263:0x0701 BREAK  A[LOOP:8: B:248:0x06a7->B:266:0x0709], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x0799 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x078b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x07ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x07e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x03c3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x0559 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x046d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x045b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0216 A[EDGE_INSN: B:540:0x0216->B:77:0x0216 BREAK  A[LOOP:20: B:68:0x01cf->B:80:0x021e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x017e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bc A[Catch: SQLiteException -> 0x0226, all -> 0x0ad2, TRY_LEAVE, TryCatch #17 {SQLiteException -> 0x0226, blocks: (B:61:0x01b6, B:63:0x01bc, B:67:0x01ca, B:68:0x01cf, B:69:0x01d9, B:70:0x01e8, B:72:0x01f5), top: B:443:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ca A[Catch: SQLiteException -> 0x0226, all -> 0x0ad2, TRY_ENTER, TryCatch #17 {SQLiteException -> 0x0226, blocks: (B:61:0x01b6, B:63:0x01bc, B:67:0x01ca, B:68:0x01cf, B:69:0x01d9, B:70:0x01e8, B:72:0x01f5), top: B:443:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:80:0x021e A[LOOP:20: B:68:0x01cf->B:80:0x021e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x025d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0268  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v41, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v39, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    final List<com.google.android.gms.internal.measurement.g4> m(String str, List<com.google.android.gms.internal.measurement.k4> list, List<com.google.android.gms.internal.measurement.d5> list2, Long l2, Long l3) throws Throwable {
        int i2;
        int i3;
        boolean z;
        ?? r5;
        Map map;
        Cursor cursor;
        Cursor cursorQuery;
        Map map2;
        Map map3;
        Iterator it;
        int iIntValue;
        com.google.android.gms.internal.measurement.z4 z4Var;
        BitSet bitSet;
        BitSet bitSet2;
        h.f.a aVar;
        List<com.google.android.gms.internal.measurement.h3> list3;
        int i4;
        String str2;
        String str3;
        Iterator<com.google.android.gms.internal.measurement.b5> it2;
        com.google.android.gms.internal.measurement.b5 next;
        Long lValueOf;
        String str4;
        h.f.a aVar2;
        Map aVar3;
        ?? P;
        Cursor cursorRawQuery;
        Iterator it3;
        com.google.android.gms.internal.measurement.z4 z4Var2;
        List<Integer> list4;
        Map map4;
        Integer numValueOf;
        List arrayList;
        String str5;
        String str6;
        ma maVar;
        oa oaVar;
        h.f.a aVar4;
        Iterator<com.google.android.gms.internal.measurement.k4> it4;
        com.google.android.gms.internal.measurement.k4 next2;
        com.google.android.gms.internal.measurement.k4 k4VarA;
        j jVarV;
        String str7;
        String strA;
        p pVarQ;
        p pVar;
        long j2;
        String strA2;
        Map mapEmptyMap;
        Iterator<com.google.android.gms.internal.measurement.k4> it5;
        String str8;
        String str9;
        Iterator it6;
        int iIntValue2;
        Set<Integer> set;
        Integer numValueOf2;
        Iterator it7;
        boolean zK;
        Map map5;
        pa paVar;
        String str10;
        h.f.a aVar5;
        Cursor cursor2;
        Cursor cursorQuery2;
        String str11;
        Integer numValueOf3;
        List list5;
        List arrayList2;
        String str12;
        ArrayList arrayList3;
        Iterator<Integer> it8;
        j jVarV2;
        String str13;
        ContentValues contentValues;
        h.f.a aVar6;
        String strZ;
        Map mapEmptyMap2;
        Iterator it9;
        int iIntValue3;
        Set<Integer> set2;
        Integer numValueOf4;
        Iterator it10;
        boolean zK2;
        com.google.android.gms.internal.measurement.p3 p3Var;
        Integer numValueOf5;
        ra raVar;
        Integer numValueOf6;
        j jVarV3;
        String str14;
        h.f.a aVar7;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf7;
        List arrayList4;
        h.f.a aVar8;
        int i5;
        Cursor cursorQuery4;
        List arrayList5;
        String str15 = "current_results";
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(list);
        com.google.android.gms.common.internal.q.k(list2);
        this.d = str;
        this.e = new HashSet();
        this.f = new h.f.a();
        this.f1286g = l2;
        this.f1287h = l3;
        Iterator<com.google.android.gms.internal.measurement.k4> it11 = list.iterator();
        while (true) {
            i2 = 0;
            i3 = 1;
            if (!it11.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(it11.next().A())) {
                z = true;
                break;
            }
        }
        ed.a();
        boolean zW = this.a.z().w(this.d, f3.a0);
        ed.a();
        boolean zW2 = this.a.z().w(this.d, f3.Z);
        if (z) {
            j jVarV4 = this.b.V();
            String str16 = this.d;
            jVarV4.j();
            jVarV4.h();
            com.google.android.gms.common.internal.q.g(str16);
            ContentValues contentValues2 = new ContentValues();
            ?? r6 = "current_session_count";
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                r6 = new String[]{str16};
                jVarV4.P().update("events", contentValues2, "app_id = ?", r6);
                r5 = r6;
            } catch (SQLiteException e) {
                jVarV4.a.d().o().c("Error resetting session-scoped event counts. appId", r3.x(str16), e);
                r5 = r6;
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str17 = "Failed to merge filter. appId";
        String str18 = "Database error querying filters. appId";
        String str19 = "audience_id";
        if (zW2 && zW) {
            j jVarV5 = this.b.V();
            String str20 = this.d;
            com.google.android.gms.common.internal.q.g(str20);
            h.f.a aVar9 = new h.f.a();
            try {
                try {
                    cursorQuery4 = jVarV5.P().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str20}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                byte[] blob = cursorQuery4.getBlob(i3);
                                try {
                                    com.google.android.gms.internal.measurement.g3 g3VarK = com.google.android.gms.internal.measurement.h3.K();
                                    x9.J(g3VarK, blob);
                                    com.google.android.gms.internal.measurement.h3 h3VarP = g3VarK.p();
                                    if (h3VarP.D()) {
                                        Integer numValueOf8 = Integer.valueOf(cursorQuery4.getInt(i2));
                                        List list6 = (List) aVar9.get(numValueOf8);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            aVar9.put(numValueOf8, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(h3VarP);
                                    }
                                } catch (IOException e2) {
                                    jVarV5.a.d().o().c("Failed to merge filter. appId", r3.x(str20), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i2 = 0;
                                i3 = 1;
                            }
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            map = aVar9;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            map = mapEmptyMap3;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        jVarV5.a.d().o().c("Database error querying filters. appId", r3.x(str20), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        j jVarV6 = this.b.V();
                        String str21 = this.d;
                        jVarV6.j();
                        jVarV6.h();
                        com.google.android.gms.common.internal.q.g(str21);
                        cursorQuery = jVarV6.P().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str21}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    aVar8 = new h.f.a();
                                    while (true) {
                                        i5 = cursorQuery.getInt(0);
                                        byte[] blob2 = cursorQuery.getBlob(1);
                                        try {
                                            com.google.android.gms.internal.measurement.y4 y4VarI = com.google.android.gms.internal.measurement.z4.I();
                                            x9.J(y4VarI, blob2);
                                            aVar8.put(Integer.valueOf(i5), y4VarI.p());
                                        } catch (IOException e4) {
                                            jVarV6.a.d().o().d("Failed to merge filter results. appId, audienceId, error", r3.x(str21), Integer.valueOf(i5), e4);
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            aVar8 = aVar8;
                                            str19 = str19;
                                        } catch (SQLiteException e5) {
                                            e = e5;
                                            jVarV6.a.d().o().c("Database error querying filter results. appId", r3.x(str21), e);
                                            Map mapEmptyMap4 = Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap4;
                                        }
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = aVar8;
                                } else {
                                    Map mapEmptyMap5 = Collections.emptyMap();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = mapEmptyMap5;
                                    str19 = "audience_id";
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                str19 = "audience_id";
                            }
                            if (!map2.isEmpty()) {
                                HashSet hashSet = new HashSet(map2.keySet());
                                if (z) {
                                    str4 = this.d;
                                    com.google.android.gms.common.internal.q.g(str4);
                                    com.google.android.gms.common.internal.q.k(map2);
                                    aVar2 = new h.f.a();
                                    if (!map2.isEmpty()) {
                                        j jVarV7 = this.b.V();
                                        jVarV7.j();
                                        jVarV7.h();
                                        com.google.android.gms.common.internal.q.g(str4);
                                        aVar3 = new h.f.a();
                                        P = jVarV7.P();
                                        try {
                                            try {
                                                cursorRawQuery = P.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str4, str4});
                                                try {
                                                    if (cursorRawQuery.moveToFirst()) {
                                                        do {
                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                            arrayList = (List) aVar3.get(numValueOf);
                                                            if (arrayList == null) {
                                                                arrayList = new ArrayList();
                                                                aVar3.put(numValueOf, arrayList);
                                                            }
                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                        } while (cursorRawQuery.moveToNext());
                                                        if (cursorRawQuery != null) {
                                                            cursorRawQuery.close();
                                                        }
                                                    } else {
                                                        aVar3 = Collections.emptyMap();
                                                        if (cursorRawQuery != null) {
                                                            cursorRawQuery.close();
                                                        }
                                                    }
                                                } catch (SQLiteException e7) {
                                                    e = e7;
                                                    jVarV7.a.d().o().c("Database error querying scoped filters. appId", r3.x(str4), e);
                                                    aVar3 = Collections.emptyMap();
                                                    if (cursorRawQuery != null) {
                                                    }
                                                    it3 = map2.keySet().iterator();
                                                    while (it3.hasNext()) {
                                                        int iIntValue4 = ((Integer) it3.next()).intValue();
                                                        Integer numValueOf9 = Integer.valueOf(iIntValue4);
                                                        z4Var2 = (com.google.android.gms.internal.measurement.z4) map2.get(numValueOf9);
                                                        list4 = (List) aVar3.get(numValueOf9);
                                                        if (list4 != null) {
                                                        }
                                                        map4 = aVar3;
                                                        aVar2.put(numValueOf9, z4Var2);
                                                        aVar3 = map4;
                                                        it3 = it3;
                                                    }
                                                    map3 = aVar2;
                                                    it = hashSet.iterator();
                                                    while (it.hasNext()) {
                                                        iIntValue = ((Integer) it.next()).intValue();
                                                        z4Var = (com.google.android.gms.internal.measurement.z4) map3.get(Integer.valueOf(iIntValue));
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        aVar = new h.f.a();
                                                        if (z4Var != null) {
                                                            for (com.google.android.gms.internal.measurement.i4 i4Var : z4Var.B()) {
                                                                if (i4Var.x()) {
                                                                    Integer numValueOf10 = Integer.valueOf(i4Var.y());
                                                                    if (i4Var.z()) {
                                                                        lValueOf = Long.valueOf(i4Var.A());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    aVar.put(numValueOf10, lValueOf);
                                                                }
                                                            }
                                                        }
                                                        h.f.a aVar10 = new h.f.a();
                                                        if (z4Var != null) {
                                                            it2 = z4Var.E().iterator();
                                                            while (it2.hasNext()) {
                                                                next = it2.next();
                                                                if (!next.x()) {
                                                                }
                                                            }
                                                        }
                                                        Map map6 = map3;
                                                        if (z4Var != null) {
                                                            i4 = 0;
                                                            while (i4 < z4Var.y() * 64) {
                                                                if (x9.D(z4Var.x(), i4)) {
                                                                    str2 = str18;
                                                                    str3 = str17;
                                                                    this.a.d().w().c("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i4));
                                                                    bitSet2.set(i4);
                                                                    if (x9.D(z4Var.z(), i4)) {
                                                                        bitSet.set(i4);
                                                                    }
                                                                    i4++;
                                                                    str18 = str2;
                                                                    str17 = str3;
                                                                } else {
                                                                    str2 = str18;
                                                                    str3 = str17;
                                                                }
                                                                aVar.remove(Integer.valueOf(i4));
                                                                i4++;
                                                                str18 = str2;
                                                                str17 = str3;
                                                            }
                                                        }
                                                        String str22 = str18;
                                                        String str23 = str17;
                                                        Integer numValueOf11 = Integer.valueOf(iIntValue);
                                                        com.google.android.gms.internal.measurement.z4 z4Var3 = (com.google.android.gms.internal.measurement.z4) map2.get(numValueOf11);
                                                        if (!zW2) {
                                                        }
                                                        this.f.put(Integer.valueOf(iIntValue), new na(this, this.d, z4Var3, bitSet, bitSet2, aVar, aVar10, null));
                                                        map2 = map2;
                                                        str18 = str22;
                                                        map = map;
                                                        map3 = map6;
                                                        str17 = str23;
                                                    }
                                                    String str24 = str18;
                                                    str5 = str17;
                                                    str6 = str19;
                                                    maVar = null;
                                                    if (!list.isEmpty()) {
                                                        oaVar = new oa(this, maVar);
                                                        aVar4 = new h.f.a();
                                                        it4 = list.iterator();
                                                        while (it4.hasNext()) {
                                                            next2 = it4.next();
                                                            k4VarA = oaVar.a(this.d, next2);
                                                            if (k4VarA != null) {
                                                                jVarV = this.b.V();
                                                                str7 = this.d;
                                                                strA = k4VarA.A();
                                                                pVarQ = jVarV.Q(str7, next2.A());
                                                                if (pVarQ == null) {
                                                                    jVarV.a.d().r().c("Event aggregate wasn't created during raw event logging. appId, event", r3.x(str7), jVarV.a.H().p(strA));
                                                                    pVar = new p(str7, next2.A(), 1L, 1L, 1L, next2.C(), 0L, null, null, null, null);
                                                                } else {
                                                                    pVar = new p(pVarQ.a, pVarQ.b, pVarQ.c + 1, pVarQ.d + 1, pVarQ.e + 1, pVarQ.f, pVarQ.f1248g, pVarQ.f1249h, pVarQ.f1250i, pVarQ.f1251j, pVarQ.f1252k);
                                                                }
                                                                this.b.V().R(pVar);
                                                                j2 = pVar.c;
                                                                strA2 = k4VarA.A();
                                                                mapEmptyMap = (Map) aVar4.get(strA2);
                                                                if (mapEmptyMap == null) {
                                                                    j jVarV8 = this.b.V();
                                                                    str10 = this.d;
                                                                    jVarV8.j();
                                                                    jVarV8.h();
                                                                    com.google.android.gms.common.internal.q.g(str10);
                                                                    com.google.android.gms.common.internal.q.g(strA2);
                                                                    aVar5 = new h.f.a();
                                                                    SQLiteDatabase sQLiteDatabaseP = jVarV8.P();
                                                                    try {
                                                                        try {
                                                                            String[] strArr = new String[2];
                                                                            str11 = str6;
                                                                            try {
                                                                                strArr[0] = str11;
                                                                                strArr[1] = "data";
                                                                                it5 = it4;
                                                                                str8 = str15;
                                                                                try {
                                                                                    cursorQuery2 = sQLiteDatabaseP.query("event_filters", strArr, "app_id=? AND event_name=?", new String[]{str10, strA2}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    byte[] blob3 = cursorQuery2.getBlob(1);
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.g3 g3VarK2 = com.google.android.gms.internal.measurement.h3.K();
                                                                                                        x9.J(g3VarK2, blob3);
                                                                                                        com.google.android.gms.internal.measurement.h3 h3VarP2 = g3VarK2.p();
                                                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) aVar5.get(numValueOf3);
                                                                                                        if (list5 == null) {
                                                                                                            str6 = str11;
                                                                                                            try {
                                                                                                                arrayList2 = new ArrayList();
                                                                                                                aVar5.put(numValueOf3, arrayList2);
                                                                                                            } catch (SQLiteException e8) {
                                                                                                                e = e8;
                                                                                                                str9 = str5;
                                                                                                                jVarV8.a.d().o().c(str24, r3.x(str10), e);
                                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                aVar4.put(strA2, mapEmptyMap);
                                                                                                                it6 = mapEmptyMap.keySet().iterator();
                                                                                                                while (it6.hasNext()) {
                                                                                                                    iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                                                    set = this.e;
                                                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                                    if (set.contains(numValueOf2)) {
                                                                                                                        this.a.d().w().b("Skipping failed audience ID", numValueOf2);
                                                                                                                    } else {
                                                                                                                        it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                                                        zK = true;
                                                                                                                        while (true) {
                                                                                                                            if (it7.hasNext()) {
                                                                                                                                map5 = mapEmptyMap;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) it7.next();
                                                                                                                            paVar = new pa(this, this.d, iIntValue2, h3Var);
                                                                                                                            map5 = mapEmptyMap;
                                                                                                                            zK = paVar.k(this.f1286g, this.f1287h, k4VarA, j2, pVar, o(iIntValue2, h3Var.y()));
                                                                                                                            if (zK) {
                                                                                                                                this.e.add(Integer.valueOf(iIntValue2));
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            n(Integer.valueOf(iIntValue2)).a(paVar);
                                                                                                                            mapEmptyMap = map5;
                                                                                                                        }
                                                                                                                        if (!zK) {
                                                                                                                            this.e.add(Integer.valueOf(iIntValue2));
                                                                                                                        }
                                                                                                                        mapEmptyMap = map5;
                                                                                                                    }
                                                                                                                }
                                                                                                                it4 = it5;
                                                                                                                str5 = str9;
                                                                                                                oaVar = oaVar;
                                                                                                                str15 = str8;
                                                                                                            }
                                                                                                        } else {
                                                                                                            str6 = str11;
                                                                                                            arrayList2 = list5;
                                                                                                        }
                                                                                                        arrayList2.add(h3VarP2);
                                                                                                        str9 = str5;
                                                                                                    } catch (IOException e9) {
                                                                                                        str6 = str11;
                                                                                                        str9 = str5;
                                                                                                        jVarV8.a.d().o().c(str9, r3.x(str10), e9);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        str5 = str9;
                                                                                                        aVar5 = aVar5;
                                                                                                        str11 = str6;
                                                                                                    } catch (SQLiteException e10) {
                                                                                                        e = e10;
                                                                                                        jVarV8.a.d().o().c(str24, r3.x(str10), e);
                                                                                                        mapEmptyMap = Collections.emptyMap();
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                                mapEmptyMap = aVar5;
                                                                                            } else {
                                                                                                str6 = str11;
                                                                                                str9 = str5;
                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                            }
                                                                                        } catch (SQLiteException e11) {
                                                                                            e = e11;
                                                                                            str6 = str11;
                                                                                        }
                                                                                        aVar4.put(strA2, mapEmptyMap);
                                                                                    } catch (Throwable th) {
                                                                                        th = th;
                                                                                        cursor2 = cursorQuery2;
                                                                                        if (cursor2 != null) {
                                                                                            cursor2.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (SQLiteException e12) {
                                                                                    e = e12;
                                                                                    str6 = str11;
                                                                                    str9 = str5;
                                                                                    cursorQuery2 = null;
                                                                                    jVarV8.a.d().o().c(str24, r3.x(str10), e);
                                                                                    mapEmptyMap = Collections.emptyMap();
                                                                                    if (cursorQuery2 != null) {
                                                                                        cursorQuery2.close();
                                                                                    }
                                                                                    aVar4.put(strA2, mapEmptyMap);
                                                                                    it6 = mapEmptyMap.keySet().iterator();
                                                                                    while (it6.hasNext()) {
                                                                                        iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                        set = this.e;
                                                                                        numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                        if (set.contains(numValueOf2)) {
                                                                                            this.a.d().w().b("Skipping failed audience ID", numValueOf2);
                                                                                        } else {
                                                                                            it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                            zK = true;
                                                                                            while (true) {
                                                                                                if (it7.hasNext()) {
                                                                                                    map5 = mapEmptyMap;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.h3 h3Var2 = (com.google.android.gms.internal.measurement.h3) it7.next();
                                                                                                paVar = new pa(this, this.d, iIntValue2, h3Var2);
                                                                                                map5 = mapEmptyMap;
                                                                                                zK = paVar.k(this.f1286g, this.f1287h, k4VarA, j2, pVar, o(iIntValue2, h3Var2.y()));
                                                                                                if (zK) {
                                                                                                    this.e.add(Integer.valueOf(iIntValue2));
                                                                                                    break;
                                                                                                }
                                                                                                n(Integer.valueOf(iIntValue2)).a(paVar);
                                                                                                mapEmptyMap = map5;
                                                                                            }
                                                                                            if (!zK) {
                                                                                                this.e.add(Integer.valueOf(iIntValue2));
                                                                                            }
                                                                                            mapEmptyMap = map5;
                                                                                        }
                                                                                    }
                                                                                    it4 = it5;
                                                                                    str5 = str9;
                                                                                    oaVar = oaVar;
                                                                                    str15 = str8;
                                                                                }
                                                                            } catch (SQLiteException e13) {
                                                                                e = e13;
                                                                                str6 = str11;
                                                                                it5 = it4;
                                                                                str8 = str15;
                                                                                str9 = str5;
                                                                                cursorQuery2 = null;
                                                                                jVarV8.a.d().o().c(str24, r3.x(str10), e);
                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                if (cursorQuery2 != null) {
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                aVar4.put(strA2, mapEmptyMap);
                                                                                it6 = mapEmptyMap.keySet().iterator();
                                                                                while (it6.hasNext()) {
                                                                                    iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                    set = this.e;
                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                    if (set.contains(numValueOf2)) {
                                                                                        this.a.d().w().b("Skipping failed audience ID", numValueOf2);
                                                                                    } else {
                                                                                        it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                        zK = true;
                                                                                        while (true) {
                                                                                            if (it7.hasNext()) {
                                                                                                map5 = mapEmptyMap;
                                                                                                break;
                                                                                            }
                                                                                            com.google.android.gms.internal.measurement.h3 h3Var3 = (com.google.android.gms.internal.measurement.h3) it7.next();
                                                                                            paVar = new pa(this, this.d, iIntValue2, h3Var3);
                                                                                            map5 = mapEmptyMap;
                                                                                            zK = paVar.k(this.f1286g, this.f1287h, k4VarA, j2, pVar, o(iIntValue2, h3Var3.y()));
                                                                                            if (zK) {
                                                                                                this.e.add(Integer.valueOf(iIntValue2));
                                                                                                break;
                                                                                            }
                                                                                            n(Integer.valueOf(iIntValue2)).a(paVar);
                                                                                            mapEmptyMap = map5;
                                                                                        }
                                                                                        if (!zK) {
                                                                                            this.e.add(Integer.valueOf(iIntValue2));
                                                                                        }
                                                                                        mapEmptyMap = map5;
                                                                                    }
                                                                                }
                                                                                it4 = it5;
                                                                                str5 = str9;
                                                                                oaVar = oaVar;
                                                                                str15 = str8;
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            cursor2 = null;
                                                                        }
                                                                    } catch (SQLiteException e14) {
                                                                        e = e14;
                                                                    }
                                                                } else {
                                                                    it5 = it4;
                                                                    str8 = str15;
                                                                    str9 = str5;
                                                                }
                                                                it6 = mapEmptyMap.keySet().iterator();
                                                                while (it6.hasNext()) {
                                                                    iIntValue2 = ((Integer) it6.next()).intValue();
                                                                    set = this.e;
                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                    if (set.contains(numValueOf2)) {
                                                                        this.a.d().w().b("Skipping failed audience ID", numValueOf2);
                                                                    } else {
                                                                        it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                        zK = true;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                map5 = mapEmptyMap;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.h3 h3Var4 = (com.google.android.gms.internal.measurement.h3) it7.next();
                                                                            paVar = new pa(this, this.d, iIntValue2, h3Var4);
                                                                            map5 = mapEmptyMap;
                                                                            zK = paVar.k(this.f1286g, this.f1287h, k4VarA, j2, pVar, o(iIntValue2, h3Var4.y()));
                                                                            if (zK) {
                                                                                this.e.add(Integer.valueOf(iIntValue2));
                                                                                break;
                                                                            }
                                                                            n(Integer.valueOf(iIntValue2)).a(paVar);
                                                                            mapEmptyMap = map5;
                                                                        }
                                                                        if (!zK) {
                                                                            this.e.add(Integer.valueOf(iIntValue2));
                                                                        }
                                                                        mapEmptyMap = map5;
                                                                    }
                                                                }
                                                                it4 = it5;
                                                                str5 = str9;
                                                                oaVar = oaVar;
                                                                str15 = str8;
                                                            }
                                                        }
                                                    }
                                                    str12 = str15;
                                                    if (!list2.isEmpty()) {
                                                        aVar6 = new h.f.a();
                                                        while (r3.hasNext()) {
                                                            strZ = d5Var.z();
                                                            mapEmptyMap2 = (Map) aVar6.get(strZ);
                                                            if (mapEmptyMap2 == null) {
                                                                jVarV3 = this.b.V();
                                                                str14 = this.d;
                                                                jVarV3.j();
                                                                jVarV3.h();
                                                                com.google.android.gms.common.internal.q.g(str14);
                                                                com.google.android.gms.common.internal.q.g(strZ);
                                                                aVar7 = new h.f.a();
                                                                try {
                                                                    cursorQuery3 = jVarV3.P().query("property_filters", new String[]{str6, "data"}, "app_id=? AND property_name=?", new String[]{str14, strZ}, null, null, null);
                                                                    try {
                                                                        try {
                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                do {
                                                                                    byte[] blob4 = cursorQuery3.getBlob(1);
                                                                                    try {
                                                                                        com.google.android.gms.internal.measurement.o3 o3VarG = com.google.android.gms.internal.measurement.p3.G();
                                                                                        x9.J(o3VarG, blob4);
                                                                                        com.google.android.gms.internal.measurement.p3 p3VarP = o3VarG.p();
                                                                                        try {
                                                                                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                            arrayList4 = (List) aVar7.get(numValueOf7);
                                                                                            if (arrayList4 == null) {
                                                                                                arrayList4 = new ArrayList();
                                                                                                aVar7.put(numValueOf7, arrayList4);
                                                                                            }
                                                                                            arrayList4.add(p3VarP);
                                                                                        } catch (SQLiteException e15) {
                                                                                            e = e15;
                                                                                            jVarV3.a.d().o().c(str24, r3.x(str14), e);
                                                                                            mapEmptyMap2 = Collections.emptyMap();
                                                                                            if (cursorQuery3 != null) {
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                        }
                                                                                    } catch (IOException e16) {
                                                                                        jVarV3.a.d().o().c("Failed to merge filter", r3.x(str14), e16);
                                                                                    }
                                                                                } while (cursorQuery3.moveToNext());
                                                                                if (cursorQuery3 != null) {
                                                                                    cursorQuery3.close();
                                                                                }
                                                                                mapEmptyMap2 = aVar7;
                                                                            } else {
                                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                                if (cursorQuery3 != null) {
                                                                                    cursorQuery3.close();
                                                                                }
                                                                            }
                                                                        } catch (SQLiteException e17) {
                                                                            e = e17;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        cursor3 = cursorQuery3;
                                                                        if (cursor3 != null) {
                                                                            cursor3.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (SQLiteException e18) {
                                                                    e = e18;
                                                                    cursorQuery3 = null;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    cursor3 = null;
                                                                }
                                                                aVar6.put(strZ, mapEmptyMap2);
                                                            }
                                                            it9 = mapEmptyMap2.keySet().iterator();
                                                            while (it9.hasNext()) {
                                                                iIntValue3 = ((Integer) it9.next()).intValue();
                                                                set2 = this.e;
                                                                numValueOf4 = Integer.valueOf(iIntValue3);
                                                                if (set2.contains(numValueOf4)) {
                                                                    this.a.d().w().b("Skipping failed audience ID", numValueOf4);
                                                                    break;
                                                                }
                                                                it10 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                                zK2 = true;
                                                                while (true) {
                                                                    if (it10.hasNext()) {
                                                                        p3Var = (com.google.android.gms.internal.measurement.p3) it10.next();
                                                                        if (Log.isLoggable(this.a.d().z(), 2)) {
                                                                            p3 p3VarW = this.a.d().w();
                                                                            Integer numValueOf12 = Integer.valueOf(iIntValue3);
                                                                            if (p3Var.x()) {
                                                                                numValueOf6 = Integer.valueOf(p3Var.y());
                                                                            } else {
                                                                                numValueOf6 = null;
                                                                            }
                                                                            p3VarW.d("Evaluating filter. audience, filter, property", numValueOf12, numValueOf6, this.a.H().r(p3Var.z()));
                                                                            this.a.d().w().b("Filter definition", this.b.Y().A(p3Var));
                                                                        }
                                                                        if (p3Var.x()) {
                                                                        }
                                                                        p3 p3VarR = this.a.d().r();
                                                                        Object objX = r3.x(this.d);
                                                                        if (p3Var.x()) {
                                                                            numValueOf5 = Integer.valueOf(p3Var.y());
                                                                        } else {
                                                                            numValueOf5 = null;
                                                                        }
                                                                        p3VarR.c("Invalid property filter ID. appId, id", objX, String.valueOf(numValueOf5));
                                                                        this.e.add(Integer.valueOf(iIntValue3));
                                                                    }
                                                                    if (!zK2) {
                                                                        this.e.add(Integer.valueOf(iIntValue3));
                                                                    }
                                                                    n(Integer.valueOf(iIntValue3)).a(raVar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    arrayList3 = new ArrayList();
                                                    Set<Integer> setKeySet = this.f.keySet();
                                                    setKeySet.removeAll(this.e);
                                                    it8 = setKeySet.iterator();
                                                    while (it8.hasNext()) {
                                                        int iIntValue5 = it8.next().intValue();
                                                        Map<Integer, na> map7 = this.f;
                                                        Integer numValueOf13 = Integer.valueOf(iIntValue5);
                                                        na naVar = map7.get(numValueOf13);
                                                        com.google.android.gms.common.internal.q.k(naVar);
                                                        com.google.android.gms.internal.measurement.g4 g4VarB = naVar.b(iIntValue5);
                                                        arrayList3.add(g4VarB);
                                                        jVarV2 = this.b.V();
                                                        str13 = this.d;
                                                        com.google.android.gms.internal.measurement.z4 z4VarZ = g4VarB.z();
                                                        jVarV2.j();
                                                        jVarV2.h();
                                                        com.google.android.gms.common.internal.q.g(str13);
                                                        com.google.android.gms.common.internal.q.k(z4VarZ);
                                                        byte[] bArrB = z4VarZ.b();
                                                        contentValues = new ContentValues();
                                                        contentValues.put("app_id", str13);
                                                        String str25 = str6;
                                                        contentValues.put(str25, numValueOf13);
                                                        String str26 = str12;
                                                        contentValues.put(str26, bArrB);
                                                        try {
                                                            try {
                                                                if (jVarV2.P().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    jVarV2.a.d().o().b("Failed to insert filter results (got -1). appId", r3.x(str13));
                                                                }
                                                            } catch (SQLiteException e19) {
                                                                e = e19;
                                                                jVarV2.a.d().o().c("Error storing filter results. appId", r3.x(str13), e);
                                                            }
                                                        } catch (SQLiteException e20) {
                                                            e = e20;
                                                        }
                                                        str12 = str26;
                                                        str6 = str25;
                                                    }
                                                    return arrayList3;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                if (P != 0) {
                                                    P.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                            cursorRawQuery = null;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            P = 0;
                                            if (P != 0) {
                                                P.close();
                                            }
                                            throw th;
                                        }
                                        it3 = map2.keySet().iterator();
                                        while (it3.hasNext()) {
                                            int iIntValue6 = ((Integer) it3.next()).intValue();
                                            Integer numValueOf14 = Integer.valueOf(iIntValue6);
                                            z4Var2 = (com.google.android.gms.internal.measurement.z4) map2.get(numValueOf14);
                                            list4 = (List) aVar3.get(numValueOf14);
                                            if (list4 != null) {
                                            }
                                            map4 = aVar3;
                                            aVar2.put(numValueOf14, z4Var2);
                                            aVar3 = map4;
                                            it3 = it3;
                                        }
                                    }
                                    map3 = aVar2;
                                } else {
                                    map3 = map2;
                                }
                                it = hashSet.iterator();
                                while (it.hasNext()) {
                                    iIntValue = ((Integer) it.next()).intValue();
                                    z4Var = (com.google.android.gms.internal.measurement.z4) map3.get(Integer.valueOf(iIntValue));
                                    bitSet = new BitSet();
                                    bitSet2 = new BitSet();
                                    aVar = new h.f.a();
                                    if (z4Var != null) {
                                        while (r2.hasNext()) {
                                            if (i4Var.x()) {
                                                Integer numValueOf15 = Integer.valueOf(i4Var.y());
                                                if (i4Var.z()) {
                                                    lValueOf = Long.valueOf(i4Var.A());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                aVar.put(numValueOf15, lValueOf);
                                            }
                                        }
                                    }
                                    h.f.a aVar11 = new h.f.a();
                                    if (z4Var != null) {
                                        it2 = z4Var.E().iterator();
                                        while (it2.hasNext()) {
                                            next = it2.next();
                                            if (!next.x()) {
                                            }
                                        }
                                    }
                                    Map map8 = map3;
                                    if (z4Var != null) {
                                        i4 = 0;
                                        while (i4 < z4Var.y() * 64) {
                                            if (x9.D(z4Var.x(), i4)) {
                                                str2 = str18;
                                                str3 = str17;
                                                this.a.d().w().c("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i4));
                                                bitSet2.set(i4);
                                                if (x9.D(z4Var.z(), i4)) {
                                                    bitSet.set(i4);
                                                }
                                                i4++;
                                                str18 = str2;
                                                str17 = str3;
                                            } else {
                                                str2 = str18;
                                                str3 = str17;
                                            }
                                            aVar.remove(Integer.valueOf(i4));
                                            i4++;
                                            str18 = str2;
                                            str17 = str3;
                                        }
                                    }
                                    String str27 = str18;
                                    String str28 = str17;
                                    Integer numValueOf16 = Integer.valueOf(iIntValue);
                                    com.google.android.gms.internal.measurement.z4 z4Var4 = (com.google.android.gms.internal.measurement.z4) map2.get(numValueOf16);
                                    if (!zW2) {
                                    }
                                    this.f.put(Integer.valueOf(iIntValue), new na(this, this.d, z4Var4, bitSet, bitSet2, aVar, aVar11, null));
                                    map2 = map2;
                                    str18 = str27;
                                    map = map;
                                    map3 = map8;
                                    str17 = str28;
                                }
                            }
                            String str29 = str18;
                            str5 = str17;
                            str6 = str19;
                            maVar = null;
                            if (!list.isEmpty()) {
                                oaVar = new oa(this, maVar);
                                aVar4 = new h.f.a();
                                it4 = list.iterator();
                                while (it4.hasNext()) {
                                    next2 = it4.next();
                                    k4VarA = oaVar.a(this.d, next2);
                                    if (k4VarA != null) {
                                        jVarV = this.b.V();
                                        str7 = this.d;
                                        strA = k4VarA.A();
                                        pVarQ = jVarV.Q(str7, next2.A());
                                        if (pVarQ == null) {
                                            jVarV.a.d().r().c("Event aggregate wasn't created during raw event logging. appId, event", r3.x(str7), jVarV.a.H().p(strA));
                                            pVar = new p(str7, next2.A(), 1L, 1L, 1L, next2.C(), 0L, null, null, null, null);
                                        } else {
                                            pVar = new p(pVarQ.a, pVarQ.b, pVarQ.c + 1, pVarQ.d + 1, pVarQ.e + 1, pVarQ.f, pVarQ.f1248g, pVarQ.f1249h, pVarQ.f1250i, pVarQ.f1251j, pVarQ.f1252k);
                                        }
                                        this.b.V().R(pVar);
                                        j2 = pVar.c;
                                        strA2 = k4VarA.A();
                                        mapEmptyMap = (Map) aVar4.get(strA2);
                                        if (mapEmptyMap == null) {
                                            j jVarV9 = this.b.V();
                                            str10 = this.d;
                                            jVarV9.j();
                                            jVarV9.h();
                                            com.google.android.gms.common.internal.q.g(str10);
                                            com.google.android.gms.common.internal.q.g(strA2);
                                            aVar5 = new h.f.a();
                                            SQLiteDatabase sQLiteDatabaseP2 = jVarV9.P();
                                            String[] strArr2 = new String[2];
                                            str11 = str6;
                                            strArr2[0] = str11;
                                            strArr2[1] = "data";
                                            it5 = it4;
                                            str8 = str15;
                                            cursorQuery2 = sQLiteDatabaseP2.query("event_filters", strArr2, "app_id=? AND event_name=?", new String[]{str10, strA2}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                while (true) {
                                                    byte[] blob5 = cursorQuery2.getBlob(1);
                                                    com.google.android.gms.internal.measurement.g3 g3VarK3 = com.google.android.gms.internal.measurement.h3.K();
                                                    x9.J(g3VarK3, blob5);
                                                    com.google.android.gms.internal.measurement.h3 h3VarP3 = g3VarK3.p();
                                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) aVar5.get(numValueOf3);
                                                    if (list5 == null) {
                                                        str6 = str11;
                                                        arrayList2 = new ArrayList();
                                                        aVar5.put(numValueOf3, arrayList2);
                                                    } else {
                                                        str6 = str11;
                                                        arrayList2 = list5;
                                                    }
                                                    arrayList2.add(h3VarP3);
                                                    str9 = str5;
                                                    if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    str5 = str9;
                                                    aVar5 = aVar5;
                                                    str11 = str6;
                                                }
                                                if (cursorQuery2 != null) {
                                                    cursorQuery2.close();
                                                }
                                                mapEmptyMap = aVar5;
                                            } else {
                                                str6 = str11;
                                                str9 = str5;
                                                mapEmptyMap = Collections.emptyMap();
                                                if (cursorQuery2 != null) {
                                                    cursorQuery2.close();
                                                }
                                            }
                                            aVar4.put(strA2, mapEmptyMap);
                                        } else {
                                            it5 = it4;
                                            str8 = str15;
                                            str9 = str5;
                                        }
                                        it6 = mapEmptyMap.keySet().iterator();
                                        while (it6.hasNext()) {
                                            iIntValue2 = ((Integer) it6.next()).intValue();
                                            set = this.e;
                                            numValueOf2 = Integer.valueOf(iIntValue2);
                                            if (set.contains(numValueOf2)) {
                                                this.a.d().w().b("Skipping failed audience ID", numValueOf2);
                                            } else {
                                                it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                zK = true;
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        map5 = mapEmptyMap;
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.h3 h3Var5 = (com.google.android.gms.internal.measurement.h3) it7.next();
                                                    paVar = new pa(this, this.d, iIntValue2, h3Var5);
                                                    map5 = mapEmptyMap;
                                                    zK = paVar.k(this.f1286g, this.f1287h, k4VarA, j2, pVar, o(iIntValue2, h3Var5.y()));
                                                    if (zK) {
                                                        this.e.add(Integer.valueOf(iIntValue2));
                                                        break;
                                                    }
                                                    n(Integer.valueOf(iIntValue2)).a(paVar);
                                                    mapEmptyMap = map5;
                                                }
                                                if (!zK) {
                                                    this.e.add(Integer.valueOf(iIntValue2));
                                                }
                                                mapEmptyMap = map5;
                                            }
                                        }
                                        it4 = it5;
                                        str5 = str9;
                                        oaVar = oaVar;
                                        str15 = str8;
                                    }
                                }
                            }
                            str12 = str15;
                            if (!list2.isEmpty()) {
                                aVar6 = new h.f.a();
                                while (r3.hasNext()) {
                                    strZ = d5Var.z();
                                    mapEmptyMap2 = (Map) aVar6.get(strZ);
                                    if (mapEmptyMap2 == null) {
                                        jVarV3 = this.b.V();
                                        str14 = this.d;
                                        jVarV3.j();
                                        jVarV3.h();
                                        com.google.android.gms.common.internal.q.g(str14);
                                        com.google.android.gms.common.internal.q.g(strZ);
                                        aVar7 = new h.f.a();
                                        cursorQuery3 = jVarV3.P().query("property_filters", new String[]{str6, "data"}, "app_id=? AND property_name=?", new String[]{str14, strZ}, null, null, null);
                                        if (cursorQuery3.moveToFirst()) {
                                            do {
                                                byte[] blob6 = cursorQuery3.getBlob(1);
                                                com.google.android.gms.internal.measurement.o3 o3VarG2 = com.google.android.gms.internal.measurement.p3.G();
                                                x9.J(o3VarG2, blob6);
                                                com.google.android.gms.internal.measurement.p3 p3VarP2 = o3VarG2.p();
                                                numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                arrayList4 = (List) aVar7.get(numValueOf7);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                    aVar7.put(numValueOf7, arrayList4);
                                                }
                                                arrayList4.add(p3VarP2);
                                            } while (cursorQuery3.moveToNext());
                                            if (cursorQuery3 != null) {
                                                cursorQuery3.close();
                                            }
                                            mapEmptyMap2 = aVar7;
                                        } else {
                                            mapEmptyMap2 = Collections.emptyMap();
                                            if (cursorQuery3 != null) {
                                                cursorQuery3.close();
                                            }
                                        }
                                        aVar6.put(strZ, mapEmptyMap2);
                                    }
                                    it9 = mapEmptyMap2.keySet().iterator();
                                    while (it9.hasNext()) {
                                        iIntValue3 = ((Integer) it9.next()).intValue();
                                        set2 = this.e;
                                        numValueOf4 = Integer.valueOf(iIntValue3);
                                        if (set2.contains(numValueOf4)) {
                                            this.a.d().w().b("Skipping failed audience ID", numValueOf4);
                                            break;
                                            break;
                                        }
                                        it10 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                        zK2 = true;
                                        while (true) {
                                            if (it10.hasNext()) {
                                                p3Var = (com.google.android.gms.internal.measurement.p3) it10.next();
                                                if (Log.isLoggable(this.a.d().z(), 2)) {
                                                    p3 p3VarW2 = this.a.d().w();
                                                    Integer numValueOf17 = Integer.valueOf(iIntValue3);
                                                    if (p3Var.x()) {
                                                        numValueOf6 = Integer.valueOf(p3Var.y());
                                                    } else {
                                                        numValueOf6 = null;
                                                    }
                                                    p3VarW2.d("Evaluating filter. audience, filter, property", numValueOf17, numValueOf6, this.a.H().r(p3Var.z()));
                                                    this.a.d().w().b("Filter definition", this.b.Y().A(p3Var));
                                                }
                                                if (p3Var.x()) {
                                                }
                                                p3 p3VarR2 = this.a.d().r();
                                                Object objX2 = r3.x(this.d);
                                                if (p3Var.x()) {
                                                    numValueOf5 = Integer.valueOf(p3Var.y());
                                                } else {
                                                    numValueOf5 = null;
                                                }
                                                p3VarR2.c("Invalid property filter ID. appId, id", objX2, String.valueOf(numValueOf5));
                                                this.e.add(Integer.valueOf(iIntValue3));
                                            }
                                            if (!zK2) {
                                                this.e.add(Integer.valueOf(iIntValue3));
                                            }
                                            n(Integer.valueOf(iIntValue3)).a(raVar);
                                        }
                                    }
                                }
                            }
                            arrayList3 = new ArrayList();
                            Set<Integer> setKeySet2 = this.f.keySet();
                            setKeySet2.removeAll(this.e);
                            it8 = setKeySet2.iterator();
                            while (it8.hasNext()) {
                                int iIntValue7 = it8.next().intValue();
                                Map<Integer, na> map9 = this.f;
                                Integer numValueOf18 = Integer.valueOf(iIntValue7);
                                na naVar2 = map9.get(numValueOf18);
                                com.google.android.gms.common.internal.q.k(naVar2);
                                com.google.android.gms.internal.measurement.g4 g4VarB2 = naVar2.b(iIntValue7);
                                arrayList3.add(g4VarB2);
                                jVarV2 = this.b.V();
                                str13 = this.d;
                                com.google.android.gms.internal.measurement.z4 z4VarZ2 = g4VarB2.z();
                                jVarV2.j();
                                jVarV2.h();
                                com.google.android.gms.common.internal.q.g(str13);
                                com.google.android.gms.common.internal.q.k(z4VarZ2);
                                byte[] bArrB2 = z4VarZ2.b();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str13);
                                String str210 = str6;
                                contentValues.put(str210, numValueOf18);
                                String str211 = str12;
                                contentValues.put(str211, bArrB2);
                                if (jVarV2.P().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    jVarV2.a.d().o().b("Failed to insert filter results (got -1). appId", r3.x(str13));
                                }
                                str12 = str211;
                                str6 = str210;
                            }
                            return arrayList3;
                        } catch (Throwable th7) {
                            th = th7;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e22) {
                e = e22;
                cursorQuery4 = null;
            } catch (Throwable th9) {
                th = th9;
                r5 = 0;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
        }
        j jVarV10 = this.b.V();
        String str212 = this.d;
        jVarV10.j();
        jVarV10.h();
        com.google.android.gms.common.internal.q.g(str212);
        try {
            cursorQuery = jVarV10.P().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str212}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap6 = Collections.emptyMap();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = mapEmptyMap6;
                str19 = "audience_id";
            } else {
                aVar8 = new h.f.a();
                while (true) {
                    i5 = cursorQuery.getInt(0);
                    byte[] blob7 = cursorQuery.getBlob(1);
                    com.google.android.gms.internal.measurement.y4 y4VarI2 = com.google.android.gms.internal.measurement.z4.I();
                    x9.J(y4VarI2, blob7);
                    aVar8.put(Integer.valueOf(i5), y4VarI2.p());
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    aVar8 = aVar8;
                    str19 = str19;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = aVar8;
            }
        } catch (SQLiteException e23) {
            e = e23;
            str19 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th10) {
            th = th10;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            HashSet hashSet2 = new HashSet(map2.keySet());
            if (z) {
                str4 = this.d;
                com.google.android.gms.common.internal.q.g(str4);
                com.google.android.gms.common.internal.q.k(map2);
                aVar2 = new h.f.a();
                if (!map2.isEmpty()) {
                    j jVarV11 = this.b.V();
                    jVarV11.j();
                    jVarV11.h();
                    com.google.android.gms.common.internal.q.g(str4);
                    aVar3 = new h.f.a();
                    P = jVarV11.P();
                    cursorRawQuery = P.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str4, str4});
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                            arrayList = (List) aVar3.get(numValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                aVar3.put(numValueOf, arrayList);
                            }
                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                        } while (cursorRawQuery.moveToNext());
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else {
                        aVar3 = Collections.emptyMap();
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    }
                    it3 = map2.keySet().iterator();
                    while (it3.hasNext()) {
                        int iIntValue8 = ((Integer) it3.next()).intValue();
                        Integer numValueOf19 = Integer.valueOf(iIntValue8);
                        z4Var2 = (com.google.android.gms.internal.measurement.z4) map2.get(numValueOf19);
                        list4 = (List) aVar3.get(numValueOf19);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = aVar3;
                            aVar2.put(numValueOf19, z4Var2);
                            aVar3 = map4;
                            it3 = it3;
                        } else {
                            map4 = aVar3;
                            List<Long> listF = this.b.Y().F(z4Var2.z(), list4);
                            if (listF.isEmpty()) {
                                aVar3 = map4;
                            } else {
                                com.google.android.gms.internal.measurement.y4 y4VarS = z4Var2.s();
                                y4VarS.z();
                                y4VarS.y(listF);
                                List<Long> listF2 = this.b.Y().F(z4Var2.x(), list4);
                                y4VarS.x();
                                y4VarS.w(listF2);
                                for (int i6 = 0; i6 < z4Var2.C(); i6++) {
                                    if (list4.contains(Integer.valueOf(z4Var2.D(i6).y()))) {
                                        y4VarS.B(i6);
                                    }
                                }
                                for (int i7 = 0; i7 < z4Var2.G(); i7++) {
                                    if (list4.contains(Integer.valueOf(z4Var2.H(i7).y()))) {
                                        y4VarS.D(i7);
                                    }
                                }
                                aVar2.put(Integer.valueOf(iIntValue8), y4VarS.p());
                                aVar3 = map4;
                                it3 = it3;
                            }
                        }
                    }
                }
                map3 = aVar2;
            } else {
                map3 = map2;
            }
            it = hashSet2.iterator();
            while (it.hasNext()) {
                iIntValue = ((Integer) it.next()).intValue();
                z4Var = (com.google.android.gms.internal.measurement.z4) map3.get(Integer.valueOf(iIntValue));
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                aVar = new h.f.a();
                if (z4Var != null && z4Var.C() != 0) {
                    while (r2.hasNext()) {
                        if (i4Var.x()) {
                            Integer numValueOf110 = Integer.valueOf(i4Var.y());
                            if (i4Var.z()) {
                                lValueOf = Long.valueOf(i4Var.A());
                            } else {
                                lValueOf = null;
                            }
                            aVar.put(numValueOf110, lValueOf);
                        }
                    }
                }
                h.f.a aVar12 = new h.f.a();
                if (z4Var != null && z4Var.G() != 0) {
                    it2 = z4Var.E().iterator();
                    while (it2.hasNext()) {
                        next = it2.next();
                        if (!next.x() && next.A() > 0) {
                            aVar12.put(Integer.valueOf(next.y()), Long.valueOf(next.B(next.A() - 1)));
                            map3 = map3;
                            it2 = it2;
                        }
                    }
                }
                Map map10 = map3;
                if (z4Var != null) {
                    i4 = 0;
                    while (i4 < z4Var.y() * 64) {
                        if (x9.D(z4Var.x(), i4)) {
                            str2 = str18;
                            str3 = str17;
                            this.a.d().w().c("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i4));
                            bitSet2.set(i4);
                            if (x9.D(z4Var.z(), i4)) {
                                bitSet.set(i4);
                            }
                            i4++;
                            str18 = str2;
                            str17 = str3;
                        } else {
                            str2 = str18;
                            str3 = str17;
                        }
                        aVar.remove(Integer.valueOf(i4));
                        i4++;
                        str18 = str2;
                        str17 = str3;
                    }
                }
                String str213 = str18;
                String str214 = str17;
                Integer numValueOf111 = Integer.valueOf(iIntValue);
                com.google.android.gms.internal.measurement.z4 z4Var5 = (com.google.android.gms.internal.measurement.z4) map2.get(numValueOf111);
                if (!zW2 && zW && (list3 = (List) map.get(numValueOf111)) != null && this.f1287h != null && this.f1286g != null) {
                    for (com.google.android.gms.internal.measurement.h3 h3Var6 : list3) {
                        int iY = h3Var6.y();
                        long jLongValue = this.f1287h.longValue() / 1000;
                        if (h3Var6.H()) {
                            jLongValue = this.f1286g.longValue() / 1000;
                        }
                        Integer numValueOf20 = Integer.valueOf(iY);
                        if (aVar.containsKey(numValueOf20)) {
                            aVar.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                        if (aVar12.containsKey(numValueOf20)) {
                            aVar12.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.f.put(Integer.valueOf(iIntValue), new na(this, this.d, z4Var5, bitSet, bitSet2, aVar, aVar12, null));
                map2 = map2;
                str18 = str213;
                map = map;
                map3 = map10;
                str17 = str214;
            }
        }
        String str215 = str18;
        str5 = str17;
        str6 = str19;
        maVar = null;
        if (!list.isEmpty()) {
            oaVar = new oa(this, maVar);
            aVar4 = new h.f.a();
            it4 = list.iterator();
            while (it4.hasNext()) {
                next2 = it4.next();
                k4VarA = oaVar.a(this.d, next2);
                if (k4VarA != null) {
                    jVarV = this.b.V();
                    str7 = this.d;
                    strA = k4VarA.A();
                    pVarQ = jVarV.Q(str7, next2.A());
                    if (pVarQ == null) {
                        jVarV.a.d().r().c("Event aggregate wasn't created during raw event logging. appId, event", r3.x(str7), jVarV.a.H().p(strA));
                        pVar = new p(str7, next2.A(), 1L, 1L, 1L, next2.C(), 0L, null, null, null, null);
                    } else {
                        pVar = new p(pVarQ.a, pVarQ.b, pVarQ.c + 1, pVarQ.d + 1, pVarQ.e + 1, pVarQ.f, pVarQ.f1248g, pVarQ.f1249h, pVarQ.f1250i, pVarQ.f1251j, pVarQ.f1252k);
                    }
                    this.b.V().R(pVar);
                    j2 = pVar.c;
                    strA2 = k4VarA.A();
                    mapEmptyMap = (Map) aVar4.get(strA2);
                    if (mapEmptyMap == null) {
                        j jVarV12 = this.b.V();
                        str10 = this.d;
                        jVarV12.j();
                        jVarV12.h();
                        com.google.android.gms.common.internal.q.g(str10);
                        com.google.android.gms.common.internal.q.g(strA2);
                        aVar5 = new h.f.a();
                        SQLiteDatabase sQLiteDatabaseP3 = jVarV12.P();
                        String[] strArr3 = new String[2];
                        str11 = str6;
                        strArr3[0] = str11;
                        strArr3[1] = "data";
                        it5 = it4;
                        str8 = str15;
                        cursorQuery2 = sQLiteDatabaseP3.query("event_filters", strArr3, "app_id=? AND event_name=?", new String[]{str10, strA2}, null, null, null);
                        if (cursorQuery2.moveToFirst()) {
                            while (true) {
                                byte[] blob8 = cursorQuery2.getBlob(1);
                                com.google.android.gms.internal.measurement.g3 g3VarK4 = com.google.android.gms.internal.measurement.h3.K();
                                x9.J(g3VarK4, blob8);
                                com.google.android.gms.internal.measurement.h3 h3VarP4 = g3VarK4.p();
                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                list5 = (List) aVar5.get(numValueOf3);
                                if (list5 == null) {
                                    str6 = str11;
                                    arrayList2 = new ArrayList();
                                    aVar5.put(numValueOf3, arrayList2);
                                } else {
                                    str6 = str11;
                                    arrayList2 = list5;
                                }
                                arrayList2.add(h3VarP4);
                                str9 = str5;
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                    break;
                                }
                                str5 = str9;
                                aVar5 = aVar5;
                                str11 = str6;
                            }
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            mapEmptyMap = aVar5;
                        } else {
                            str6 = str11;
                            str9 = str5;
                            mapEmptyMap = Collections.emptyMap();
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                        }
                        aVar4.put(strA2, mapEmptyMap);
                    } else {
                        it5 = it4;
                        str8 = str15;
                        str9 = str5;
                    }
                    it6 = mapEmptyMap.keySet().iterator();
                    while (it6.hasNext()) {
                        iIntValue2 = ((Integer) it6.next()).intValue();
                        set = this.e;
                        numValueOf2 = Integer.valueOf(iIntValue2);
                        if (set.contains(numValueOf2)) {
                            this.a.d().w().b("Skipping failed audience ID", numValueOf2);
                        } else {
                            it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                            zK = true;
                            while (true) {
                                if (it7.hasNext()) {
                                    map5 = mapEmptyMap;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.h3 h3Var7 = (com.google.android.gms.internal.measurement.h3) it7.next();
                                paVar = new pa(this, this.d, iIntValue2, h3Var7);
                                map5 = mapEmptyMap;
                                zK = paVar.k(this.f1286g, this.f1287h, k4VarA, j2, pVar, o(iIntValue2, h3Var7.y()));
                                if (zK) {
                                    this.e.add(Integer.valueOf(iIntValue2));
                                    break;
                                }
                                n(Integer.valueOf(iIntValue2)).a(paVar);
                                mapEmptyMap = map5;
                            }
                            if (!zK) {
                                this.e.add(Integer.valueOf(iIntValue2));
                            }
                            mapEmptyMap = map5;
                        }
                    }
                    it4 = it5;
                    str5 = str9;
                    oaVar = oaVar;
                    str15 = str8;
                }
            }
        }
        str12 = str15;
        if (!list2.isEmpty()) {
            aVar6 = new h.f.a();
            for (com.google.android.gms.internal.measurement.d5 d5Var : list2) {
                strZ = d5Var.z();
                mapEmptyMap2 = (Map) aVar6.get(strZ);
                if (mapEmptyMap2 == null) {
                    jVarV3 = this.b.V();
                    str14 = this.d;
                    jVarV3.j();
                    jVarV3.h();
                    com.google.android.gms.common.internal.q.g(str14);
                    com.google.android.gms.common.internal.q.g(strZ);
                    aVar7 = new h.f.a();
                    cursorQuery3 = jVarV3.P().query("property_filters", new String[]{str6, "data"}, "app_id=? AND property_name=?", new String[]{str14, strZ}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        do {
                            byte[] blob9 = cursorQuery3.getBlob(1);
                            com.google.android.gms.internal.measurement.o3 o3VarG3 = com.google.android.gms.internal.measurement.p3.G();
                            x9.J(o3VarG3, blob9);
                            com.google.android.gms.internal.measurement.p3 p3VarP3 = o3VarG3.p();
                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                            arrayList4 = (List) aVar7.get(numValueOf7);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                aVar7.put(numValueOf7, arrayList4);
                            }
                            arrayList4.add(p3VarP3);
                        } while (cursorQuery3.moveToNext());
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                        mapEmptyMap2 = aVar7;
                    } else {
                        mapEmptyMap2 = Collections.emptyMap();
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                    }
                    aVar6.put(strZ, mapEmptyMap2);
                }
                it9 = mapEmptyMap2.keySet().iterator();
                while (it9.hasNext()) {
                    iIntValue3 = ((Integer) it9.next()).intValue();
                    set2 = this.e;
                    numValueOf4 = Integer.valueOf(iIntValue3);
                    if (set2.contains(numValueOf4)) {
                        this.a.d().w().b("Skipping failed audience ID", numValueOf4);
                        break;
                        break;
                    }
                    it10 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                    zK2 = true;
                    while (true) {
                        if (it10.hasNext()) {
                            p3Var = (com.google.android.gms.internal.measurement.p3) it10.next();
                            if (Log.isLoggable(this.a.d().z(), 2)) {
                                p3 p3VarW3 = this.a.d().w();
                                Integer numValueOf112 = Integer.valueOf(iIntValue3);
                                if (p3Var.x()) {
                                    numValueOf6 = Integer.valueOf(p3Var.y());
                                } else {
                                    numValueOf6 = null;
                                }
                                p3VarW3.d("Evaluating filter. audience, filter, property", numValueOf112, numValueOf6, this.a.H().r(p3Var.z()));
                                this.a.d().w().b("Filter definition", this.b.Y().A(p3Var));
                            }
                            if (p3Var.x() || p3Var.y() > 256) {
                                p3 p3VarR3 = this.a.d().r();
                                Object objX3 = r3.x(this.d);
                                if (p3Var.x()) {
                                    numValueOf5 = Integer.valueOf(p3Var.y());
                                } else {
                                    numValueOf5 = null;
                                }
                                p3VarR3.c("Invalid property filter ID. appId, id", objX3, String.valueOf(numValueOf5));
                                this.e.add(Integer.valueOf(iIntValue3));
                            } else {
                                raVar = new ra(this, this.d, iIntValue3, p3Var);
                                zK2 = raVar.k(this.f1286g, this.f1287h, d5Var, o(iIntValue3, p3Var.y()));
                                if (zK2) {
                                    n(Integer.valueOf(iIntValue3)).a(raVar);
                                } else {
                                    this.e.add(Integer.valueOf(iIntValue3));
                                }
                            }
                        }
                        if (!zK2) {
                            this.e.add(Integer.valueOf(iIntValue3));
                        }
                    }
                }
            }
        }
        arrayList3 = new ArrayList();
        Set<Integer> setKeySet3 = this.f.keySet();
        setKeySet3.removeAll(this.e);
        it8 = setKeySet3.iterator();
        while (it8.hasNext()) {
            int iIntValue9 = it8.next().intValue();
            Map<Integer, na> map11 = this.f;
            Integer numValueOf113 = Integer.valueOf(iIntValue9);
            na naVar3 = map11.get(numValueOf113);
            com.google.android.gms.common.internal.q.k(naVar3);
            com.google.android.gms.internal.measurement.g4 g4VarB3 = naVar3.b(iIntValue9);
            arrayList3.add(g4VarB3);
            jVarV2 = this.b.V();
            str13 = this.d;
            com.google.android.gms.internal.measurement.z4 z4VarZ3 = g4VarB3.z();
            jVarV2.j();
            jVarV2.h();
            com.google.android.gms.common.internal.q.g(str13);
            com.google.android.gms.common.internal.q.k(z4VarZ3);
            byte[] bArrB3 = z4VarZ3.b();
            contentValues = new ContentValues();
            contentValues.put("app_id", str13);
            String str216 = str6;
            contentValues.put(str216, numValueOf113);
            String str217 = str12;
            contentValues.put(str217, bArrB3);
            if (jVarV2.P().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                jVarV2.a.d().o().b("Failed to insert filter results (got -1). appId", r3.x(str13));
            }
            str12 = str217;
            str6 = str216;
        }
        return arrayList3;
    }
}
