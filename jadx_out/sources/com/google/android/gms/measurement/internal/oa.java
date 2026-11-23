package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class oa {
    private com.google.android.gms.internal.measurement.k4 a;
    private Long b;
    private long c;
    final /* synthetic */ sa d;

    /* synthetic */ oa(sa saVar, ma maVar) {
        this.d = saVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0101 A[PHI: r14
  0x0101: PHI (r14v3 android.database.Cursor) = (r14v2 android.database.Cursor), (r14v6 android.database.Cursor) binds: [B:40:0x00ff, B:31:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x01e7  */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01e4: MOVE (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:70:0x01e4 */
    final com.google.android.gms.internal.measurement.k4 a(String str, com.google.android.gms.internal.measurement.k4 k4Var) {
        Cursor cursor;
        Cursor cursorRawQuery;
        Cursor cursor2;
        Pair pairCreate;
        Object obj;
        String strA = k4Var.A();
        List<com.google.android.gms.internal.measurement.o4> listX = k4Var.x();
        this.d.b.Y();
        Long l2 = (Long) x9.n(k4Var, "_eid");
        if (l2 != null) {
            if (strA.equals("_ep")) {
                com.google.android.gms.common.internal.q.k(l2);
                this.d.b.Y();
                String str2 = (String) x9.n(k4Var, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.d.a.d().p().b("Extra parameter without an event name. eventId", l2);
                    return null;
                }
                if (this.a == null || this.b == null || l2.longValue() != this.b.longValue()) {
                    j jVarV = this.d.b.V();
                    jVarV.h();
                    jVarV.j();
                    try {
                        try {
                            cursorRawQuery = jVarV.P().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l2)});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    byte[] blob = cursorRawQuery.getBlob(0);
                                    Long lValueOf = Long.valueOf(cursorRawQuery.getLong(1));
                                    try {
                                        com.google.android.gms.internal.measurement.j4 j4VarI = com.google.android.gms.internal.measurement.k4.I();
                                        x9.J(j4VarI, blob);
                                        pairCreate = Pair.create(j4VarI.p(), lValueOf);
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                    } catch (IOException e) {
                                        jVarV.a.d().o().d("Failed to merge main event. appId, eventId", r3.x(str), l2, e);
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        pairCreate = null;
                                    }
                                } else {
                                    jVarV.a.d().w().a("Main event not found");
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    pairCreate = null;
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                jVarV.a.d().o().b("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.d.a.d().p().c("Extra parameter without existing main event. eventName, eventId", str2, l2);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                        this.d.a.d().p().c("Extra parameter without existing main event. eventName, eventId", str2, l2);
                        return null;
                    }
                    this.a = (com.google.android.gms.internal.measurement.k4) obj;
                    this.c = ((Long) pairCreate.second).longValue();
                    this.d.b.Y();
                    this.b = (Long) x9.n(this.a, "_eid");
                }
                long j2 = this.c - 1;
                this.c = j2;
                if (j2 <= 0) {
                    j jVarV2 = this.d.b.V();
                    jVarV2.h();
                    jVarV2.a.d().w().b("Clearing complex main event info. appId", str);
                    try {
                        jVarV2.P().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        jVarV2.a.d().o().b("Error clearing complex main event", e4);
                    }
                } else {
                    this.d.b.V().v(str, l2, this.c, this.a);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.o4 o4Var : this.a.x()) {
                    this.d.b.Y();
                    if (x9.m(k4Var, o4Var.y()) == null) {
                        arrayList.add(o4Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.d.a.d().p().b("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listX);
                    listX = arrayList;
                }
                strA = str2;
            } else {
                this.b = l2;
                this.a = k4Var;
                this.d.b.Y();
                Object objN = x9.n(k4Var, "_epc");
                long jLongValue = ((Long) (objN != null ? objN : 0L)).longValue();
                this.c = jLongValue;
                if (jLongValue <= 0) {
                    this.d.a.d().p().b("Complex event with zero extra param count. eventName", strA);
                } else {
                    j jVarV3 = this.d.b.V();
                    com.google.android.gms.common.internal.q.k(l2);
                    jVarV3.v(str, l2, this.c, k4Var);
                }
            }
        }
        com.google.android.gms.internal.measurement.j4 j4VarS = k4Var.s();
        j4VarS.I(strA);
        j4VarS.E();
        j4VarS.D(listX);
        return j4VarS.p();
    }
}
