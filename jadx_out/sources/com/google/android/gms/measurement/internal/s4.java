package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.me;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.internal.measurement.uf;
import com.google.android.gms.internal.measurement.wb;
import com.google.android.gms.internal.measurement.wf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends m9 implements e {
    private final Map<String, Map<String, String>> d;
    private final Map<String, Map<String, Boolean>> e;
    private final Map<String, Map<String, Boolean>> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, com.google.android.gms.internal.measurement.z3> f1276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f1277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final h.f.e<String, com.google.android.gms.internal.measurement.c1> f1278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final uf f1279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, String> f1280k;

    s4(v9 v9Var) {
        super(v9Var);
        this.d = new h.f.a();
        this.e = new h.f.a();
        this.f = new h.f.a();
        this.f1276g = new h.f.a();
        this.f1280k = new h.f.a();
        this.f1277h = new h.f.a();
        this.f1278i = new p4(this, 20);
        this.f1279j = new q4(this);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x011e: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:41:0x011e */
    private final void A(String str) throws Throwable {
        SQLiteException e;
        Cursor cursorQuery;
        Cursor cursor;
        Pair pair;
        com.google.android.gms.internal.measurement.y3 y3VarS;
        Map map;
        j();
        h();
        com.google.android.gms.common.internal.q.g(str);
        if (this.f1276g.get(str) == null) {
            j jVarV = this.b.V();
            com.google.android.gms.common.internal.q.g(str);
            jVarV.h();
            jVarV.j();
            Cursor cursor2 = null;
            str = null;
            String str2 = null;
            try {
                try {
                    cursorQuery = jVarV.P().query("apps", new String[]{"remote_config", "config_last_modified_time"}, "app_id=?", new String[]{str}, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            if (cursorQuery.moveToNext()) {
                                jVarV.a.d().o().b("Got multiple records for app config, expected one. appId", r3.x(str));
                            }
                            if (blob == null) {
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                pair = null;
                            } else {
                                pair = new Pair(blob, string);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } else {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            pair = null;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        jVarV.a.d().o().c("Error querying remote config. appId", r3.x(str), e);
                        if (cursorQuery != null) {
                        }
                        pair = null;
                        if (pair == null) {
                            this.d.put(str, null);
                            this.e.put(str, null);
                            this.f.put(str, null);
                            this.f1276g.put(str, null);
                            this.f1280k.put(str, null);
                            map = this.f1277h;
                        } else {
                            y3VarS = D(str, (byte[]) pair.first).s();
                            B(str, y3VarS);
                            this.d.put(str, E(y3VarS.p()));
                            this.f1276g.put(str, y3VarS.p());
                            se.a();
                            if (this.a.z().w(null, f3.B0)) {
                                C(str, y3VarS.p());
                            }
                            me.a();
                            if (this.a.z().w(null, f3.z0)) {
                                map = this.f1280k;
                                str2 = (String) pair.second;
                            } else {
                                map = this.f1280k;
                            }
                        }
                        map.put(str, str2);
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
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            if (pair == null) {
                this.d.put(str, null);
                this.e.put(str, null);
                this.f.put(str, null);
                this.f1276g.put(str, null);
                this.f1280k.put(str, null);
                map = this.f1277h;
            } else {
                y3VarS = D(str, (byte[]) pair.first).s();
                B(str, y3VarS);
                this.d.put(str, E(y3VarS.p()));
                this.f1276g.put(str, y3VarS.p());
                se.a();
                if (this.a.z().w(null, f3.B0)) {
                    C(str, y3VarS.p());
                }
                me.a();
                if (this.a.z().w(null, f3.z0)) {
                    map = this.f1280k;
                    str2 = (String) pair.second;
                } else {
                    map = this.f1280k;
                }
            }
            map.put(str, str2);
        }
    }

    private final void B(String str, com.google.android.gms.internal.measurement.y3 y3Var) {
        h.f.a aVar = new h.f.a();
        h.f.a aVar2 = new h.f.a();
        h.f.a aVar3 = new h.f.a();
        if (y3Var != null) {
            for (int i2 = 0; i2 < y3Var.w(); i2++) {
                com.google.android.gms.internal.measurement.v3 v3VarS = y3Var.x(i2).s();
                if (TextUtils.isEmpty(v3VarS.w())) {
                    this.a.d().r().a("EventConfig contained null event name");
                } else {
                    String strW = v3VarS.w();
                    String strB = y5.b(v3VarS.w());
                    if (!TextUtils.isEmpty(strB)) {
                        v3VarS.x(strB);
                        y3Var.y(i2, v3VarS);
                    }
                    aVar.put(strW, Boolean.valueOf(v3VarS.y()));
                    aVar2.put(v3VarS.w(), Boolean.valueOf(v3VarS.z()));
                    if (v3VarS.A()) {
                        if (v3VarS.B() < 2 || v3VarS.B() > 65535) {
                            this.a.d().r().c("Invalid sampling rate. Event name, sample rate", v3VarS.w(), Integer.valueOf(v3VarS.B()));
                        } else {
                            aVar3.put(v3VarS.w(), Integer.valueOf(v3VarS.B()));
                        }
                    }
                }
            }
        }
        this.e.put(str, aVar);
        this.f.put(str, aVar2);
        this.f1277h.put(str, aVar3);
    }

    private final void C(final String str, com.google.android.gms.internal.measurement.z3 z3Var) {
        if (z3Var.I() == 0) {
            this.f1278i.e(str);
            return;
        }
        this.a.d().w().b("EES programs found", Integer.valueOf(z3Var.I()));
        com.google.android.gms.internal.measurement.k5 k5Var = z3Var.H().get(0);
        try {
            com.google.android.gms.internal.measurement.c1 c1Var = new com.google.android.gms.internal.measurement.c1();
            c1Var.a("internal.remoteConfig", new Callable(this, str) { // from class: com.google.android.gms.measurement.internal.n4
                private final s4 a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new wb("internal.remoteConfig", new r4(this.a, this.b));
                }
            });
            c1Var.a("internal.logger", new Callable(this) { // from class: com.google.android.gms.measurement.internal.o4
                private final s4 a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new wf(this.a.f1279j);
                }
            });
            c1Var.f(k5Var);
            this.f1278i.d(str, c1Var);
            this.a.d().w().c("EES program loaded for appId, activities", str, Integer.valueOf(k5Var.y().y()));
            Iterator<com.google.android.gms.internal.measurement.i5> it = k5Var.y().x().iterator();
            while (it.hasNext()) {
                this.a.d().w().b("EES program activity", it.next().x());
            }
        } catch (com.google.android.gms.internal.measurement.c2 unused) {
            this.a.d().o().b("Failed to load EES program. appId", str);
        }
    }

    private final com.google.android.gms.internal.measurement.z3 D(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.z3.K();
        }
        try {
            com.google.android.gms.internal.measurement.y3 y3VarJ = com.google.android.gms.internal.measurement.z3.J();
            x9.J(y3VarJ, bArr);
            com.google.android.gms.internal.measurement.z3 z3VarP = y3VarJ.p();
            this.a.d().w().c("Parsed config. version, gmp_app_id", z3VarP.x() ? Long.valueOf(z3VarP.y()) : null, z3VarP.z() ? z3VarP.A() : null);
            return z3VarP;
        } catch (com.google.android.gms.internal.measurement.i9 | RuntimeException e) {
            this.a.d().r().c("Unable to merge remote config. appId", r3.x(str), e);
            return com.google.android.gms.internal.measurement.z3.K();
        }
    }

    private static final Map<String, String> E(com.google.android.gms.internal.measurement.z3 z3Var) {
        h.f.a aVar = new h.f.a();
        if (z3Var != null) {
            for (com.google.android.gms.internal.measurement.b4 b4Var : z3Var.B()) {
                aVar.put(b4Var.x(), b4Var.y());
            }
        }
        return aVar;
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.c1 y(s4 s4Var, String str) throws Throwable {
        s4Var.j();
        com.google.android.gms.common.internal.q.g(str);
        se.a();
        if (!s4Var.a.z().w(null, f3.B0) || !s4Var.r(str)) {
            return null;
        }
        if (!s4Var.f1276g.containsKey(str) || s4Var.f1276g.get(str) == null) {
            s4Var.A(str);
        } else {
            s4Var.C(str, s4Var.f1276g.get(str));
        }
        return s4Var.f1278i.h().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.e
    public final String b(String str, String str2) throws Throwable {
        h();
        A(str);
        Map<String, String> map = this.d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.m9
    protected final boolean k() {
        return false;
    }

    protected final com.google.android.gms.internal.measurement.z3 m(String str) {
        j();
        h();
        com.google.android.gms.common.internal.q.g(str);
        A(str);
        return this.f1276g.get(str);
    }

    protected final String n(String str) {
        h();
        return this.f1280k.get(str);
    }

    protected final void o(String str) {
        h();
        this.f1280k.put(str, null);
    }

    final void p(String str) {
        h();
        this.f1276g.remove(str);
    }

    final boolean q(String str) {
        h();
        com.google.android.gms.internal.measurement.z3 z3VarM = m(str);
        if (z3VarM == null) {
            return false;
        }
        return z3VarM.G();
    }

    public final boolean r(String str) {
        com.google.android.gms.internal.measurement.z3 z3Var;
        se.a();
        return (!this.a.z().w(null, f3.B0) || TextUtils.isEmpty(str) || (z3Var = this.f1276g.get(str)) == null || z3Var.I() == 0) ? false : true;
    }

    protected final boolean s(String str, byte[] bArr, String str2) throws Throwable {
        j();
        h();
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.internal.measurement.y3 y3VarS = D(str, bArr).s();
        if (y3VarS == null) {
            return false;
        }
        B(str, y3VarS);
        se.a();
        if (this.a.z().w(null, f3.B0)) {
            C(str, y3VarS.p());
        }
        this.f1276g.put(str, y3VarS.p());
        this.f1280k.put(str, str2);
        this.d.put(str, E(y3VarS.p()));
        this.b.V().x(str, new ArrayList(y3VarS.z()));
        try {
            y3VarS.A();
            bArr = y3VarS.p().b();
        } catch (RuntimeException e) {
            this.a.d().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", r3.x(str), e);
        }
        me.a();
        if (this.a.z().w(null, f3.z0)) {
            this.b.V().g0(str, bArr, str2);
        } else {
            this.b.V().g0(str, bArr, null);
        }
        this.f1276g.put(str, y3VarS.p());
        return true;
    }

    final boolean t(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        A(str);
        if (w(str) && ca.F(str2)) {
            return true;
        }
        if (x(str) && ca.j0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean u(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        A(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final int v(String str, String str2) throws Throwable {
        Integer num;
        h();
        A(str);
        Map<String, Integer> map = this.f1277h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final boolean w(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_internal"));
    }

    final boolean x(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_public"));
    }
}
