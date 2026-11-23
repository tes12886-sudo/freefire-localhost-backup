package m.i0;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import l.d0.p;
import l.t.h0;
import l.y.c.f;
import l.y.c.i;
import m.b0;
import m.c0;
import m.d0;
import m.e0;
import m.h0.i.e;
import m.h0.l.h;
import m.j;
import m.u;
import m.w;
import m.x;
import n.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w {
    private final b a;
    private volatile Set<String> b;
    private volatile EnumC0272a c;

    /* JADX INFO: renamed from: m.i0.a$a, reason: collision with other inner class name */
    public enum EnumC0272a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface b {
        public static final b a;

        /* JADX INFO: renamed from: m.i0.a$b$a, reason: collision with other inner class name */
        public static final class C0273a {
            static final /* synthetic */ C0273a a = new C0273a();

            /* JADX INFO: renamed from: m.i0.a$b$a$a, reason: collision with other inner class name */
            private static final class C0274a implements b {
                @Override // m.i0.a.b
                public void a(String str) {
                    i.e(str, "message");
                    h.k(h.a.g(), str, 0, null, 6, null);
                }
            }

            private C0273a() {
            }
        }

        static {
            C0273a c0273a = C0273a.a;
            a = new C0273a.C0274a();
        }

        void a(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public a(b bVar) {
        i.e(bVar, "logger");
        this.a = bVar;
        this.b = h0.b();
        this.c = EnumC0272a.NONE;
    }

    public /* synthetic */ a(b bVar, int i2, f fVar) {
        this((i2 & 1) != 0 ? b.a : bVar);
    }

    private final boolean b(u uVar) {
        String strB = uVar.b("Content-Encoding");
        return (strB == null || p.l(strB, "identity", true) || p.l(strB, "gzip", true)) ? false : true;
    }

    private final void d(u uVar, int i2) {
        String strH = this.b.contains(uVar.c(i2)) ? "██" : uVar.h(i2);
        this.a.a(uVar.c(i2) + ": " + strH);
    }

    @Override // m.w
    public d0 a(w.a aVar) throws Exception {
        char c;
        String string;
        b bVar;
        String str;
        Charset charset;
        Long lValueOf;
        b bVar2;
        String strK;
        StringBuilder sb;
        StringBuilder sb2;
        String str2;
        i.e(aVar, "chain");
        EnumC0272a enumC0272a = this.c;
        b0 b0VarC = aVar.c();
        if (enumC0272a == EnumC0272a.NONE) {
            return aVar.a(b0VarC);
        }
        boolean z = enumC0272a == EnumC0272a.BODY;
        boolean z2 = z || enumC0272a == EnumC0272a.HEADERS;
        c0 c0VarA = b0VarC.a();
        j jVarB = aVar.b();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--> ");
        sb3.append(b0VarC.g());
        sb3.append(' ');
        sb3.append(b0VarC.j());
        sb3.append(jVarB != null ? i.k(" ", jVarB.a()) : "");
        String string2 = sb3.toString();
        if (!z2 && c0VarA != null) {
            string2 = string2 + " (" + c0VarA.a() + "-byte body)";
        }
        this.a.a(string2);
        if (z2) {
            u uVarE = b0VarC.e();
            if (c0VarA != null) {
                x xVarB = c0VarA.b();
                if (xVarB != null && uVarE.b("Content-Type") == null) {
                    this.a.a(i.k("Content-Type: ", xVarB));
                }
                if (c0VarA.a() != -1 && uVarE.b("Content-Length") == null) {
                    this.a.a(i.k("Content-Length: ", Long.valueOf(c0VarA.a())));
                }
            }
            int size = uVarE.size();
            for (int i2 = 0; i2 < size; i2++) {
                d(uVarE, i2);
            }
            if (!z || c0VarA == null) {
                bVar2 = this.a;
                strK = i.k("--> END ", b0VarC.g());
            } else {
                if (b(b0VarC.e())) {
                    bVar2 = this.a;
                    sb2 = new StringBuilder();
                    sb2.append("--> END ");
                    sb2.append(b0VarC.g());
                    str2 = " (encoded body omitted)";
                } else if (c0VarA.f()) {
                    bVar2 = this.a;
                    sb2 = new StringBuilder();
                    sb2.append("--> END ");
                    sb2.append(b0VarC.g());
                    str2 = " (duplex request body omitted)";
                } else if (c0VarA.g()) {
                    bVar2 = this.a;
                    sb2 = new StringBuilder();
                    sb2.append("--> END ");
                    sb2.append(b0VarC.g());
                    str2 = " (one-shot body omitted)";
                } else {
                    n.b bVar3 = new n.b();
                    c0VarA.h(bVar3);
                    x xVarB2 = c0VarA.b();
                    Charset charsetC = xVarB2 == null ? null : xVarB2.c(StandardCharsets.UTF_8);
                    if (charsetC == null) {
                        charsetC = StandardCharsets.UTF_8;
                        i.d(charsetC, "UTF_8");
                    }
                    this.a.a("");
                    if (m.i0.b.a(bVar3)) {
                        this.a.a(bVar3.V(charsetC));
                        bVar2 = this.a;
                        sb = new StringBuilder();
                        sb.append("--> END ");
                        sb.append(b0VarC.g());
                        sb.append(" (");
                        sb.append(c0VarA.a());
                        sb.append("-byte body)");
                    } else {
                        bVar2 = this.a;
                        sb = new StringBuilder();
                        sb.append("--> END ");
                        sb.append(b0VarC.g());
                        sb.append(" (binary ");
                        sb.append(c0VarA.a());
                        sb.append("-byte body omitted)");
                    }
                    strK = sb.toString();
                }
                sb2.append(str2);
                strK = sb2.toString();
            }
            bVar2.a(strK);
        }
        long jNanoTime = System.nanoTime();
        try {
            d0 d0VarA = aVar.a(b0VarC);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            e0 e0VarB = d0VarA.b();
            i.c(e0VarB);
            long j2 = e0VarB.j();
            String str3 = j2 != -1 ? j2 + "-byte" : "unknown-length";
            b bVar4 = this.a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- ");
            sb4.append(d0VarA.l());
            if (d0VarA.Z().length() == 0) {
                string = "";
                c = ' ';
            } else {
                String strZ = d0VarA.Z();
                StringBuilder sb5 = new StringBuilder();
                c = ' ';
                sb5.append(' ');
                sb5.append(strZ);
                string = sb5.toString();
            }
            sb4.append(string);
            sb4.append(c);
            sb4.append(d0VarA.f0().j());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb4.append(z2 ? "" : ", " + str3 + " body");
            sb4.append(')');
            bVar4.a(sb4.toString());
            if (z2) {
                u uVarT = d0VarA.T();
                int size2 = uVarT.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d(uVarT, i3);
                }
                if (!z || !e.b(d0VarA)) {
                    bVar = this.a;
                    str = "<-- END HTTP";
                } else if (b(d0VarA.T())) {
                    bVar = this.a;
                    str = "<-- END HTTP (encoded body omitted)";
                } else {
                    d dVarF = e0VarB.F();
                    dVarF.q(Long.MAX_VALUE);
                    n.b bVarA = dVarF.a();
                    if (p.l("gzip", uVarT.b("Content-Encoding"), true)) {
                        lValueOf = Long.valueOf(bVarA.r0());
                        n.i iVar = new n.i(bVarA.clone());
                        try {
                            bVarA = new n.b();
                            bVarA.y0(iVar);
                            charset = null;
                            l.x.a.a(iVar, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                l.x.a.a(iVar, th);
                                throw th2;
                            }
                        }
                    } else {
                        charset = null;
                        lValueOf = null;
                    }
                    x xVarL = e0VarB.l();
                    Charset charsetC2 = xVarL == null ? charset : xVarL.c(StandardCharsets.UTF_8);
                    if (charsetC2 == null) {
                        charsetC2 = StandardCharsets.UTF_8;
                        i.d(charsetC2, "UTF_8");
                    }
                    if (!m.i0.b.a(bVarA)) {
                        this.a.a("");
                        this.a.a("<-- END HTTP (binary " + bVarA.r0() + "-byte body omitted)");
                        return d0VarA;
                    }
                    if (j2 != 0) {
                        this.a.a("");
                        this.a.a(bVarA.clone().V(charsetC2));
                    }
                    if (lValueOf != null) {
                        this.a.a("<-- END HTTP (" + bVarA.r0() + "-byte, " + lValueOf + "-gzipped-byte body)");
                    } else {
                        bVar = this.a;
                        str = "<-- END HTTP (" + bVarA.r0() + "-byte body)";
                    }
                }
                bVar.a(str);
            }
            return d0VarA;
        } catch (Exception e) {
            this.a.a(i.k("<-- HTTP FAILED: ", e));
            throw e;
        }
    }

    public final void c(EnumC0272a enumC0272a) {
        i.e(enumC0272a, "<set-?>");
        this.c = enumC0272a;
    }

    public final a e(EnumC0272a enumC0272a) {
        i.e(enumC0272a, "level");
        c(enumC0272a);
        return this;
    }
}
