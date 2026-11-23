package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.ed;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class pa extends qa {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.h3 f1254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ sa f1255h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    pa(sa saVar, String str, int i2, com.google.android.gms.internal.measurement.h3 h3Var) {
        super(str, i2);
        this.f1255h = saVar;
        this.f1254g = h3Var;
    }

    @Override // com.google.android.gms.measurement.internal.qa
    final int a() {
        return this.f1254g.y();
    }

    @Override // com.google.android.gms.measurement.internal.qa
    final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.qa
    final boolean c() {
        return this.f1254g.D();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:111:0x0302  */
    /* JADX WARN: Code duplicated, block: B:113:0x030a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0316  */
    /* JADX WARN: Code duplicated, block: B:122:0x0370  */
    /* JADX WARN: Code duplicated, block: B:123:0x039a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    /* JADX WARN: Code duplicated, block: B:43:0x012c  */
    /* JADX WARN: Code duplicated, block: B:47:0x015a A[LOOP:0: B:41:0x0126->B:47:0x015a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x018b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0195  */
    /* JADX WARN: Code duplicated, block: B:58:0x019e A[PHI: r14
  0x019e: PHI (r14v13 java.lang.String) = (r14v12 java.lang.String), (r14v15 java.lang.String) binds: [B:62:0x01ae, B:56:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x0208  */
    /* JADX WARN: Code duplicated, block: B:78:0x021c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0243  */
    /* JADX WARN: Code duplicated, block: B:87:0x0279  */
    /* JADX WARN: Code duplicated, block: B:90:0x028b  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c5  */
    final boolean k(Long l2, Long l3, com.google.android.gms.internal.measurement.k4 k4Var, long j2, p pVar, boolean z) {
        HashSet hashSet;
        Iterator<com.google.android.gms.internal.measurement.j3> it;
        h.f.a aVar;
        Iterator<com.google.android.gms.internal.measurement.o4> it2;
        Iterator<com.google.android.gms.internal.measurement.j3> it3;
        com.google.android.gms.internal.measurement.j3 next;
        boolean z2;
        String strE;
        p3 p3VarR;
        String strP;
        String str;
        Object obj;
        p3 p3VarR2;
        String strP2;
        String strQ;
        String str2;
        Boolean boolG;
        Boolean boolH;
        String str3;
        Boolean boolI;
        com.google.android.gms.internal.measurement.o4 next2;
        String strY;
        Object objA;
        com.google.android.gms.internal.measurement.j3 next3;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        ed.a();
        boolean zW = this.f1255h.a.z().w(this.a, f3.a0);
        long j3 = this.f1254g.J() ? pVar.e : j2;
        if (Log.isLoggable(this.f1255h.a.d().z(), 2)) {
            this.f1255h.a.d().w().d("Evaluating filter. audience, filter, event", Integer.valueOf(this.b), this.f1254g.x() ? Integer.valueOf(this.f1254g.y()) : null, this.f1255h.a.H().p(this.f1254g.z()));
            this.f1255h.a.d().w().b("Filter definition", this.f1255h.b.Y().z(this.f1254g));
        }
        if (!this.f1254g.x() || this.f1254g.y() > 256) {
            this.f1255h.a.d().r().c("Invalid event filter ID. appId, id", r3.x(this.a), String.valueOf(this.f1254g.x() ? Integer.valueOf(this.f1254g.y()) : null));
            return false;
        }
        boolean z3 = this.f1254g.G() || this.f1254g.H() || this.f1254g.J();
        if (z && !z3) {
            this.f1255h.a.d().w().c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.f1254g.x() ? Integer.valueOf(this.f1254g.y()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.h3 h3Var = this.f1254g;
        String strA = k4Var.A();
        if (h3Var.D()) {
            Boolean boolG2 = qa.g(j3, h3Var.E());
            if (boolG2 == null) {
                bool2 = null;
            } else if (boolG2.booleanValue()) {
                hashSet = new HashSet();
                it = h3Var.A().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next3 = it.next();
                        if (next3.E().isEmpty()) {
                            p3VarR = this.f1255h.a.d().r();
                            strP = this.f1255h.a.H().p(strA);
                            str = "null or empty param name in filter. event";
                        } else {
                            hashSet.add(next3.E());
                        }
                    } else {
                        aVar = new h.f.a();
                        it2 = k4Var.x().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (!hashSet.contains(next2.y())) {
                                    if (next2.B()) {
                                        strY = next2.y();
                                        if (next2.B()) {
                                            objA = Long.valueOf(next2.C());
                                        } else {
                                            objA = null;
                                        }
                                    } else if (next2.G()) {
                                        strY = next2.y();
                                        if (next2.G()) {
                                            objA = Double.valueOf(next2.H());
                                        } else {
                                            objA = null;
                                        }
                                    } else if (next2.z()) {
                                        strY = next2.y();
                                        objA = next2.A();
                                    } else {
                                        p3VarR2 = this.f1255h.a.d().r();
                                        strP2 = this.f1255h.a.H().p(strA);
                                        strQ = this.f1255h.a.H().q(next2.y());
                                        str2 = "Unknown value for param. event, param";
                                    }
                                    aVar.put(strY, objA);
                                }
                            } else {
                                it3 = h3Var.A().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        if (next.B()) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        strE = next.E();
                                        if (strE.isEmpty()) {
                                            p3VarR = this.f1255h.a.d().r();
                                            strP = this.f1255h.a.H().p(strA);
                                            str = "Event has empty param name. event";
                                        } else {
                                            obj = aVar.get(strE);
                                            if (obj instanceof Long) {
                                                if (next.z()) {
                                                    boolG = qa.g(((Long) obj).longValue(), next.A());
                                                    if (boolG == null) {
                                                        bool2 = null;
                                                    } else if (boolG.booleanValue() == z2) {
                                                    }
                                                } else {
                                                    p3VarR2 = this.f1255h.a.d().r();
                                                    strP2 = this.f1255h.a.H().p(strA);
                                                    strQ = this.f1255h.a.H().q(strE);
                                                    str2 = "No number filter for long param. event, param";
                                                }
                                            } else if (obj instanceof Double) {
                                                if (next.z()) {
                                                    boolH = qa.h(((Double) obj).doubleValue(), next.A());
                                                    if (boolH == null) {
                                                        bool2 = null;
                                                    } else if (boolH.booleanValue() == z2) {
                                                    }
                                                } else {
                                                    p3VarR2 = this.f1255h.a.d().r();
                                                    strP2 = this.f1255h.a.H().p(strA);
                                                    strQ = this.f1255h.a.H().q(strE);
                                                    str2 = "No number filter for double param. event, param";
                                                }
                                            } else if (obj instanceof String) {
                                                if (next.x()) {
                                                    boolI = qa.f((String) obj, next.y(), this.f1255h.a.d());
                                                } else if (next.z()) {
                                                    str3 = (String) obj;
                                                    if (x9.C(str3)) {
                                                        boolI = qa.i(str3, next.A());
                                                    } else {
                                                        p3VarR2 = this.f1255h.a.d().r();
                                                        strP2 = this.f1255h.a.H().p(strA);
                                                        strQ = this.f1255h.a.H().q(strE);
                                                        str2 = "Invalid param value for number filter. event, param";
                                                    }
                                                } else {
                                                    p3VarR2 = this.f1255h.a.d().r();
                                                    strP2 = this.f1255h.a.H().p(strA);
                                                    strQ = this.f1255h.a.H().q(strE);
                                                    str2 = "No filter for String param. event, param";
                                                }
                                                if (boolI == null) {
                                                    bool2 = null;
                                                } else if (boolI.booleanValue() == z2) {
                                                }
                                            } else if (obj == null) {
                                                this.f1255h.a.d().w().c("Missing param for filter. event, param", this.f1255h.a.H().p(strA), this.f1255h.a.H().q(strE));
                                            } else {
                                                p3VarR2 = this.f1255h.a.d().r();
                                                strP2 = this.f1255h.a.H().p(strA);
                                                strQ = this.f1255h.a.H().q(strE);
                                                str2 = "Unknown param type. event, param";
                                            }
                                        }
                                    } else {
                                        bool2 = bool;
                                    }
                                }
                            }
                            p3VarR2.c(str2, strP2, strQ);
                            bool2 = null;
                        }
                    }
                    p3VarR.b(str, strP);
                    bool2 = null;
                }
            }
        } else {
            hashSet = new HashSet();
            it = h3Var.A().iterator();
            while (true) {
                if (it.hasNext()) {
                    next3 = it.next();
                    if (next3.E().isEmpty()) {
                        p3VarR = this.f1255h.a.d().r();
                        strP = this.f1255h.a.H().p(strA);
                        str = "null or empty param name in filter. event";
                    } else {
                        hashSet.add(next3.E());
                    }
                } else {
                    aVar = new h.f.a();
                    it2 = k4Var.x().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (!hashSet.contains(next2.y())) {
                                if (next2.B()) {
                                    strY = next2.y();
                                    if (next2.B()) {
                                        objA = Long.valueOf(next2.C());
                                    } else {
                                        objA = null;
                                    }
                                } else if (next2.G()) {
                                    strY = next2.y();
                                    if (next2.G()) {
                                        objA = Double.valueOf(next2.H());
                                    } else {
                                        objA = null;
                                    }
                                } else if (next2.z()) {
                                    strY = next2.y();
                                    objA = next2.A();
                                } else {
                                    p3VarR2 = this.f1255h.a.d().r();
                                    strP2 = this.f1255h.a.H().p(strA);
                                    strQ = this.f1255h.a.H().q(next2.y());
                                    str2 = "Unknown value for param. event, param";
                                }
                                aVar.put(strY, objA);
                            }
                        } else {
                            it3 = h3Var.A().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (next.B() || !next.C()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strE = next.E();
                                    if (strE.isEmpty()) {
                                        p3VarR = this.f1255h.a.d().r();
                                        strP = this.f1255h.a.H().p(strA);
                                        str = "Event has empty param name. event";
                                    } else {
                                        obj = aVar.get(strE);
                                        if (obj instanceof Long) {
                                            if (next.z()) {
                                                p3VarR2 = this.f1255h.a.d().r();
                                                strP2 = this.f1255h.a.H().p(strA);
                                                strQ = this.f1255h.a.H().q(strE);
                                                str2 = "No number filter for long param. event, param";
                                            } else {
                                                boolG = qa.g(((Long) obj).longValue(), next.A());
                                                if (boolG == null) {
                                                    bool2 = null;
                                                } else if (boolG.booleanValue() == z2) {
                                                }
                                            }
                                        } else if (obj instanceof Double) {
                                            if (next.z()) {
                                                p3VarR2 = this.f1255h.a.d().r();
                                                strP2 = this.f1255h.a.H().p(strA);
                                                strQ = this.f1255h.a.H().q(strE);
                                                str2 = "No number filter for double param. event, param";
                                            } else {
                                                boolH = qa.h(((Double) obj).doubleValue(), next.A());
                                                if (boolH == null) {
                                                    bool2 = null;
                                                } else if (boolH.booleanValue() == z2) {
                                                }
                                            }
                                        } else if (obj instanceof String) {
                                            if (next.x()) {
                                                boolI = qa.f((String) obj, next.y(), this.f1255h.a.d());
                                            } else if (next.z()) {
                                                str3 = (String) obj;
                                                if (x9.C(str3)) {
                                                    boolI = qa.i(str3, next.A());
                                                } else {
                                                    p3VarR2 = this.f1255h.a.d().r();
                                                    strP2 = this.f1255h.a.H().p(strA);
                                                    strQ = this.f1255h.a.H().q(strE);
                                                    str2 = "Invalid param value for number filter. event, param";
                                                }
                                            } else {
                                                p3VarR2 = this.f1255h.a.d().r();
                                                strP2 = this.f1255h.a.H().p(strA);
                                                strQ = this.f1255h.a.H().q(strE);
                                                str2 = "No filter for String param. event, param";
                                            }
                                            if (boolI == null) {
                                                bool2 = null;
                                            } else if (boolI.booleanValue() == z2) {
                                            }
                                        } else if (obj == null) {
                                            this.f1255h.a.d().w().c("Missing param for filter. event, param", this.f1255h.a.H().p(strA), this.f1255h.a.H().q(strE));
                                        } else {
                                            p3VarR2 = this.f1255h.a.d().r();
                                            strP2 = this.f1255h.a.H().p(strA);
                                            strQ = this.f1255h.a.H().q(strE);
                                            str2 = "Unknown param type. event, param";
                                        }
                                    }
                                } else {
                                    bool2 = bool;
                                }
                            }
                        }
                        p3VarR2.c(str2, strP2, strQ);
                        bool2 = null;
                    }
                }
                p3VarR.b(str, strP);
                bool2 = null;
            }
        }
        this.f1255h.a.d().w().b("Event filter result", bool2 == null ? "null" : bool2);
        if (bool2 == null) {
            return false;
        }
        this.c = bool;
        if (!bool2.booleanValue()) {
            return true;
        }
        this.d = bool;
        if (z3 && k4Var.B()) {
            Long lValueOf = Long.valueOf(k4Var.C());
            if (this.f1254g.H()) {
                if (zW && this.f1254g.D()) {
                    lValueOf = l2;
                }
                this.f = lValueOf;
            } else {
                if (zW && this.f1254g.D()) {
                    lValueOf = l3;
                }
                this.e = lValueOf;
            }
        }
        return true;
    }
}
