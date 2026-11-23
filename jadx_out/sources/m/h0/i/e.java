package m.h0.i;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.d0.p;
import m.d0;
import m.m;
import m.n;
import m.u;
import m.v;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final n.e a;
    private static final n.e b;

    static {
        n.e.a aVar = n.e.d;
        a = aVar.d("\"\\");
        b = aVar.d("\t ,=");
    }

    public static final List<m.h> a(u uVar, String str) {
        l.y.c.i.e(uVar, "<this>");
        l.y.c.i.e(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (p.l(str, uVar.c(i2), true)) {
                n.b bVar = new n.b();
                bVar.I0(uVar.h(i2));
                try {
                    c(bVar, arrayList);
                } catch (EOFException e) {
                    m.h0.l.h.a.g().j("Unable to parse challenge", 5, e);
                }
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static final boolean b(d0 d0Var) {
        l.y.c.i.e(d0Var, "<this>");
        if (l.y.c.i.a(d0Var.f0().g(), "HEAD")) {
            return false;
        }
        int iL = d0Var.l();
        return (((iL >= 100 && iL < 200) || iL == 204 || iL == 304) && m.h0.d.s(d0Var) == -1 && !p.l("chunked", d0.Q(d0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0079 A[EDGE_INSN: B:59:0x0079->B:28:0x0079 BREAK  A[LOOP:2: B:22:0x0066->B:49:0x00b9], SYNTHETIC] */
    private static final void c(n.b bVar, List<m.h> list) throws EOFException {
        String strE;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(bVar);
                    strE2 = e(bVar);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(bVar);
                String strE3 = e(bVar);
                if (strE3 == null) {
                    if (bVar.z()) {
                        list.add(new m.h(strE2, l.t.d0.d()));
                        return;
                    }
                    return;
                }
                int iJ = m.h0.d.J(bVar, (byte) 61);
                boolean zG2 = g(bVar);
                if (zG || !(zG2 || bVar.z())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iJ2 = iJ + m.h0.d.J(bVar, (byte) 61);
                    while (true) {
                        if (strE3 == null) {
                            strE3 = e(bVar);
                            if (g(bVar)) {
                                break;
                            }
                            iJ2 = m.h0.d.J(bVar, (byte) 61);
                            if (iJ2 == 0) {
                                break;
                            }
                            if (iJ2 <= 1 || g(bVar)) {
                                return;
                            }
                            if (h(bVar, (byte) 34)) {
                                strE = d(bVar);
                            } else {
                                strE = e(bVar);
                            }
                            if (strE != null || ((String) linkedHashMap.put(strE3, strE)) != null) {
                                return;
                            }
                            if (g(bVar) && !bVar.z()) {
                                return;
                            } else {
                                strE3 = null;
                            }
                        } else {
                            if (iJ2 == 0) {
                                break;
                                break;
                            }
                            if (iJ2 <= 1) {
                                return;
                            }
                            if (h(bVar, (byte) 34)) {
                                strE = d(bVar);
                            } else {
                                strE = e(bVar);
                            }
                            if (strE != null) {
                                return;
                            }
                            if (g(bVar)) {
                            }
                            strE3 = null;
                        }
                    }
                    list.add(new m.h(strE2, linkedHashMap));
                    strE2 = strE3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, l.y.c.i.k(strE3, p.p("=", iJ)));
                    l.y.c.i.d(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new m.h(strE2, mapSingletonMap));
                }
            }
        }
    }

    private static final String d(n.b bVar) throws EOFException {
        if (!(bVar.readByte() == 34)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        n.b bVar2 = new n.b();
        while (true) {
            long jF0 = bVar.f0(a);
            if (jF0 == -1) {
                return null;
            }
            if (bVar.d0(jF0) == 34) {
                bVar2.h(bVar, jF0);
                bVar.readByte();
                return bVar2.o0();
            }
            if (bVar.r0() == jF0 + 1) {
                return null;
            }
            bVar2.h(bVar, jF0);
            bVar.readByte();
            bVar2.h(bVar, 1L);
        }
    }

    private static final String e(n.b bVar) {
        long jF0 = bVar.f0(b);
        if (jF0 == -1) {
            jF0 = bVar.r0();
        }
        if (jF0 != 0) {
            return bVar.i(jF0);
        }
        return null;
    }

    public static final void f(n nVar, v vVar, u uVar) {
        l.y.c.i.e(nVar, "<this>");
        l.y.c.i.e(vVar, "url");
        l.y.c.i.e(uVar, "headers");
        if (nVar == n.a) {
            return;
        }
        List<m> listE = m.f2303j.e(vVar, uVar);
        if (listE.isEmpty()) {
            return;
        }
        nVar.b(vVar, listE);
    }

    private static final boolean g(n.b bVar) throws EOFException {
        boolean z = false;
        while (!bVar.z()) {
            byte bD0 = bVar.d0(0L);
            if (bD0 != 44) {
                if (!(bD0 == 32 || bD0 == 9)) {
                    break;
                }
                bVar.readByte();
            } else {
                bVar.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean h(n.b bVar, byte b2) {
        return !bVar.z() && bVar.d0(0L) == b2;
    }
}
