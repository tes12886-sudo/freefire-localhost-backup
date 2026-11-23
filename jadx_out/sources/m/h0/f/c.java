package m.h0.f;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import l.d0.p;
import l.y.c.f;
import l.y.c.i;
import m.b0;
import m.d0;
import m.h0.d;
import m.u;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final a c = new a(null);
    private final b0 a;
    private final d0 b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean a(d0 d0Var, b0 b0Var) {
            i.e(d0Var, "response");
            i.e(b0Var, "request");
            int iL = d0Var.l();
            if (iL != 200 && iL != 410 && iL != 414 && iL != 501 && iL != 203 && iL != 204) {
                if (iL == 307) {
                    if (d0.Q(d0Var, "Expires", null, 2, null) == null && d0Var.c().d() == -1 && !d0Var.c().c() && !d0Var.c().b()) {
                        return false;
                    }
                } else if (iL != 308 && iL != 404 && iL != 405) {
                    switch (iL) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (d0.Q(d0Var, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (d0Var.c().i() || b0Var.b().i()) ? false : true;
        }
    }

    public static final class b {
        private final long a;
        private final b0 b;
        private final d0 c;
        private Date d;
        private String e;
        private Date f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f2190g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f2191h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f2192i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f2193j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f2194k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f2195l;

        public b(long j2, b0 b0Var, d0 d0Var) {
            i.e(b0Var, "request");
            this.a = j2;
            this.b = b0Var;
            this.c = d0Var;
            this.f2195l = -1;
            if (d0Var != null) {
                this.f2192i = d0Var.g0();
                this.f2193j = d0Var.e0();
                u uVarT = d0Var.T();
                int i2 = 0;
                int size = uVarT.size();
                while (i2 < size) {
                    int i3 = i2 + 1;
                    String strC = uVarT.c(i2);
                    String strH = uVarT.h(i2);
                    if (p.l(strC, "Date", true)) {
                        this.d = m.h0.i.c.a(strH);
                        this.e = strH;
                    } else if (p.l(strC, "Expires", true)) {
                        this.f2191h = m.h0.i.c.a(strH);
                    } else if (p.l(strC, "Last-Modified", true)) {
                        this.f = m.h0.i.c.a(strH);
                        this.f2190g = strH;
                    } else if (p.l(strC, "ETag", true)) {
                        this.f2194k = strH;
                    } else if (p.l(strC, "Age", true)) {
                        this.f2195l = d.U(strH, -1);
                    }
                    i2 = i3;
                }
            }
        }

        private final long a() {
            Date date = this.d;
            long jMax = date != null ? Math.max(0L, this.f2193j - date.getTime()) : 0L;
            int i2 = this.f2195l;
            if (i2 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
            }
            long j2 = this.f2193j;
            return jMax + (j2 - this.f2192i) + (this.a - j2);
        }

        private final c c() {
            if (this.c == null) {
                return new c(this.b, null);
            }
            if ((!this.b.f() || this.c.F() != null) && c.c.a(this.c, this.b)) {
                m.d dVarB = this.b.b();
                if (dVarB.h() || e(this.b)) {
                    return new c(this.b, null);
                }
                m.d dVarC = this.c.c();
                long jA = a();
                long jD = d();
                if (dVarB.d() != -1) {
                    jD = Math.min(jD, TimeUnit.SECONDS.toMillis(dVarB.d()));
                }
                long millis = 0;
                long millis2 = dVarB.f() != -1 ? TimeUnit.SECONDS.toMillis(dVarB.f()) : 0L;
                if (!dVarC.g() && dVarB.e() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(dVarB.e());
                }
                if (!dVarC.h()) {
                    long j2 = millis2 + jA;
                    if (j2 < millis + jD) {
                        d0.a aVarB0 = this.c.b0();
                        if (j2 >= jD) {
                            aVarB0.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && f()) {
                            aVarB0.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, aVarB0.c());
                    }
                }
                String str = this.f2194k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f != null) {
                    str = this.f2190g;
                } else {
                    if (this.d == null) {
                        return new c(this.b, null);
                    }
                    str = this.e;
                }
                u.a aVarD = this.b.e().d();
                i.c(str);
                aVarD.d(str2, str);
                b0.a aVarH = this.b.h();
                aVarH.e(aVarD.e());
                return new c(aVarH.a(), this.c);
            }
            return new c(this.b, null);
        }

        private final long d() {
            Long lValueOf;
            d0 d0Var = this.c;
            i.c(d0Var);
            m.d dVarC = d0Var.c();
            if (dVarC.d() != -1) {
                return TimeUnit.SECONDS.toMillis(dVarC.d());
            }
            Date date = this.f2191h;
            if (date != null) {
                Date date2 = this.d;
                lValueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (lValueOf == null ? this.f2193j : lValueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f == null || this.c.f0().j().o() != null) {
                return 0L;
            }
            Date date3 = this.d;
            lValueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
            long jLongValue = lValueOf == null ? this.f2192i : lValueOf.longValue();
            Date date4 = this.f;
            i.c(date4);
            long time2 = jLongValue - date4.getTime();
            if (time2 > 0) {
                return time2 / ((long) 10);
            }
            return 0L;
        }

        private final boolean e(b0 b0Var) {
            return (b0Var.d("If-Modified-Since") == null && b0Var.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            d0 d0Var = this.c;
            i.c(d0Var);
            return d0Var.c().d() == -1 && this.f2191h == null;
        }

        public final c b() {
            c cVarC = c();
            return (cVarC.b() == null || !this.b.b().k()) ? cVarC : new c(null, null);
        }
    }

    public c(b0 b0Var, d0 d0Var) {
        this.a = b0Var;
        this.b = d0Var;
    }

    public final d0 a() {
        return this.b;
    }

    public final b0 b() {
        return this.a;
    }
}
