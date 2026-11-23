package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class d1 {
    private static final j.d.a.d.a.b.f d = new j.d.a.d.a.b.f("ExtractorTaskFinder");
    private final a1 a;
    private final v b;
    private final c0 c;

    d1(a1 a1Var, v vVar, c0 c0Var) {
        this.a = a1Var;
        this.b = vVar;
        this.c = c0Var;
    }

    private final boolean b(x0 x0Var, y0 y0Var) {
        v vVar = this.b;
        w0 w0Var = x0Var.c;
        return new y1(vVar, w0Var.a, x0Var.b, w0Var.b, y0Var.a).l();
    }

    private static boolean c(y0 y0Var) {
        int i2 = y0Var.f;
        return i2 == 1 || i2 == 2;
    }

    final c1 a() {
        c1 b2Var;
        i0 i0Var;
        v1 v1Var;
        int iK;
        try {
            this.a.a();
            ArrayList arrayList = new ArrayList();
            for (x0 x0Var : this.a.c().values()) {
                if (j1.f(x0Var.c.c)) {
                    arrayList.add(x0Var);
                }
            }
            if (arrayList.isEmpty()) {
                this.a.b();
                return null;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    b2Var = null;
                    break;
                }
                x0 x0Var2 = (x0) it.next();
                try {
                    v vVar = this.b;
                    w0 w0Var = x0Var2.c;
                    if (vVar.y(w0Var.a, x0Var2.b, w0Var.b) == x0Var2.c.e.size()) {
                        d.a("Found final move task for session %s with pack %s.", Integer.valueOf(x0Var2.a), x0Var2.c.a);
                        int i2 = x0Var2.a;
                        w0 w0Var2 = x0Var2.c;
                        b2Var = new p1(i2, w0Var2.a, x0Var2.b, w0Var2.b);
                        break;
                    }
                } catch (IOException e) {
                    throw new k0(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(x0Var2.a), x0Var2.c.a), e, x0Var2.a);
                }
            }
            if (b2Var == null) {
                Iterator it2 = arrayList.iterator();
                loop2: while (true) {
                    if (!it2.hasNext()) {
                        b2Var = null;
                        break;
                    }
                    x0 x0Var3 = (x0) it2.next();
                    if (j1.f(x0Var3.c.c)) {
                        for (y0 y0Var : x0Var3.c.e) {
                            v vVar2 = this.b;
                            w0 w0Var3 = x0Var3.c;
                            if (vVar2.w(w0Var3.a, x0Var3.b, w0Var3.b, y0Var.a).exists()) {
                                d.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(x0Var3.a), x0Var3.c.a, y0Var.a);
                                int i3 = x0Var3.a;
                                w0 w0Var4 = x0Var3.c;
                                b2Var = new m1(i3, w0Var4.a, x0Var3.b, w0Var4.b, y0Var.a);
                                break loop2;
                            }
                        }
                    }
                }
                if (b2Var == null) {
                    Iterator it3 = arrayList.iterator();
                    loop4: while (true) {
                        if (!it3.hasNext()) {
                            b2Var = null;
                            break;
                        }
                        x0 x0Var4 = (x0) it3.next();
                        if (j1.f(x0Var4.c.c)) {
                            for (y0 y0Var2 : x0Var4.c.e) {
                                if (b(x0Var4, y0Var2)) {
                                    v vVar3 = this.b;
                                    w0 w0Var5 = x0Var4.c;
                                    if (vVar3.v(w0Var5.a, x0Var4.b, w0Var5.b, y0Var2.a).exists()) {
                                        d.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(x0Var4.a), x0Var4.c.a, y0Var2.a);
                                        int i4 = x0Var4.a;
                                        w0 w0Var6 = x0Var4.c;
                                        String str = w0Var6.a;
                                        int i5 = x0Var4.b;
                                        long j2 = w0Var6.b;
                                        String str2 = y0Var2.a;
                                        String str3 = y0Var2.b;
                                        long j3 = y0Var2.c;
                                        b2Var = new b2(i4, str, i5, j2, str2, str3);
                                        break loop4;
                                    }
                                }
                            }
                        }
                    }
                    if (b2Var == null) {
                        Iterator it4 = arrayList.iterator();
                        loop6: while (true) {
                            if (!it4.hasNext()) {
                                i0Var = null;
                                break;
                            }
                            x0 x0Var5 = (x0) it4.next();
                            if (j1.f(x0Var5.c.c)) {
                                for (y0 y0Var3 : x0Var5.c.e) {
                                    if (!c(y0Var3)) {
                                        v vVar4 = this.b;
                                        w0 w0Var7 = x0Var5.c;
                                        Iterator it5 = it4;
                                        try {
                                            iK = new y1(vVar4, w0Var7.a, x0Var5.b, w0Var7.b, y0Var3.a).k();
                                        } catch (IOException e2) {
                                            d.b("Slice checkpoint corrupt, restarting extraction. %s", e2);
                                            iK = 0;
                                        }
                                        if (iK != -1 && y0Var3.d.get(iK).a) {
                                            d.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(y0Var3.e), Integer.valueOf(x0Var5.a), x0Var5.c.a, y0Var3.a, Integer.valueOf(iK));
                                            InputStream inputStreamA = this.c.a(x0Var5.a, x0Var5.c.a, y0Var3.a, iK);
                                            int i6 = x0Var5.a;
                                            w0 w0Var8 = x0Var5.c;
                                            String str4 = w0Var8.a;
                                            int i7 = x0Var5.b;
                                            long j4 = w0Var8.b;
                                            String str5 = y0Var3.a;
                                            int i8 = y0Var3.e;
                                            int size = y0Var3.d.size();
                                            w0 w0Var9 = x0Var5.c;
                                            i0Var = new i0(i6, str4, i7, j4, str5, i8, iK, size, w0Var9.d, w0Var9.c, inputStreamA);
                                            break loop6;
                                        }
                                        it4 = it5;
                                    }
                                }
                            }
                        }
                        if (i0Var != null) {
                            this.a.b();
                            return i0Var;
                        }
                        Iterator it6 = arrayList.iterator();
                        loop8: while (true) {
                            if (!it6.hasNext()) {
                                v1Var = null;
                                break;
                            }
                            x0 x0Var6 = (x0) it6.next();
                            if (j1.f(x0Var6.c.c)) {
                                for (y0 y0Var4 : x0Var6.c.e) {
                                    if (c(y0Var4) && y0Var4.d.get(0).a && !b(x0Var6, y0Var4)) {
                                        d.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(y0Var4.f), Integer.valueOf(x0Var6.a), x0Var6.c.a, y0Var4.a);
                                        InputStream inputStreamA2 = this.c.a(x0Var6.a, x0Var6.c.a, y0Var4.a, 0);
                                        int i9 = x0Var6.a;
                                        String str6 = x0Var6.c.a;
                                        v1Var = new v1(i9, str6, this.b.G(str6), this.b.H(x0Var6.c.a), x0Var6.b, x0Var6.c.b, y0Var4.f, y0Var4.a, y0Var4.c, inputStreamA2);
                                        break loop8;
                                    }
                                }
                            }
                        }
                        this.a.b();
                        if (v1Var != null) {
                            return v1Var;
                        }
                        return null;
                    }
                }
            }
            this.a.b();
            return b2Var;
        } catch (Throwable th) {
            this.a.b();
            throw th;
        }
    }
}
