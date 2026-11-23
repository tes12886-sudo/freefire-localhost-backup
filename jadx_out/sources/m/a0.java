package m;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public enum a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final a b = new a(null);
    private final String a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final a0 a(String str) throws IOException {
            l.y.c.i.e(str, "protocol");
            a0 a0Var = a0.HTTP_1_0;
            if (!l.y.c.i.a(str, a0Var.a)) {
                a0Var = a0.HTTP_1_1;
                if (!l.y.c.i.a(str, a0Var.a)) {
                    a0Var = a0.H2_PRIOR_KNOWLEDGE;
                    if (!l.y.c.i.a(str, a0Var.a)) {
                        a0Var = a0.HTTP_2;
                        if (!l.y.c.i.a(str, a0Var.a)) {
                            a0Var = a0.SPDY_3;
                            if (!l.y.c.i.a(str, a0Var.a)) {
                                a0Var = a0.QUIC;
                                if (!l.y.c.i.a(str, a0Var.a)) {
                                    throw new IOException(l.y.c.i.k("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return a0Var;
        }
    }

    a0(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
