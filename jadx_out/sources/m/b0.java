package m;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    private final v a;
    private final String b;
    private final u c;
    private final c0 d;
    private final Map<Class<?>, Object> e;
    private d f;

    public static class a {
        private v a;
        private String b;
        private u.a c;
        private c0 d;
        private Map<Class<?>, Object> e;

        public a() {
            this.e = new LinkedHashMap();
            this.b = "GET";
            this.c = new u.a();
        }

        public a(b0 b0Var) {
            l.y.c.i.e(b0Var, "request");
            this.e = new LinkedHashMap();
            this.a = b0Var.j();
            this.b = b0Var.g();
            this.d = b0Var.a();
            this.e = b0Var.c().isEmpty() ? new LinkedHashMap<>() : l.t.d0.n(b0Var.c());
            this.c = b0Var.e().d();
        }

        public b0 a() {
            v vVar = this.a;
            if (vVar != null) {
                return new b0(vVar, this.b, this.c.e(), this.d, m.h0.d.S(this.e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final u.a b() {
            return this.c;
        }

        public final Map<Class<?>, Object> c() {
            return this.e;
        }

        public a d(String str, String str2) {
            l.y.c.i.e(str, "name");
            l.y.c.i.e(str2, "value");
            b().h(str, str2);
            return this;
        }

        public a e(u uVar) {
            l.y.c.i.e(uVar, "headers");
            j(uVar.d());
            return this;
        }

        public a f(String str, c0 c0Var) {
            l.y.c.i.e(str, "method");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (c0Var == null) {
                if (!(true ^ m.h0.i.f.e(str))) {
                    throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                }
            } else if (!m.h0.i.f.b(str)) {
                throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
            }
            k(str);
            i(c0Var);
            return this;
        }

        public a g(c0 c0Var) {
            l.y.c.i.e(c0Var, "body");
            f("POST", c0Var);
            return this;
        }

        public a h(String str) {
            l.y.c.i.e(str, "name");
            b().g(str);
            return this;
        }

        public final void i(c0 c0Var) {
            this.d = c0Var;
        }

        public final void j(u.a aVar) {
            l.y.c.i.e(aVar, "<set-?>");
            this.c = aVar;
        }

        public final void k(String str) {
            l.y.c.i.e(str, "<set-?>");
            this.b = str;
        }

        public final void l(Map<Class<?>, Object> map) {
            l.y.c.i.e(map, "<set-?>");
            this.e = map;
        }

        public final void m(v vVar) {
            this.a = vVar;
        }

        public <T> a n(Class<? super T> cls, T t) {
            l.y.c.i.e(cls, "type");
            if (t == null) {
                c().remove(cls);
            } else {
                if (c().isEmpty()) {
                    l(new LinkedHashMap());
                }
                Map<Class<?>, Object> mapC = c();
                T tCast = cls.cast(t);
                l.y.c.i.c(tCast);
                mapC.put(cls, tCast);
            }
            return this;
        }

        public a o(String str) {
            String strSubstring;
            String str2;
            l.y.c.i.e(str, "url");
            if (!l.d0.p.v(str, "ws:", true)) {
                if (l.d0.p.v(str, "wss:", true)) {
                    strSubstring = str.substring(4);
                    l.y.c.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    str2 = "https:";
                }
                p(v.f2312k.d(str));
                return this;
            }
            strSubstring = str.substring(3);
            l.y.c.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            str2 = "http:";
            str = l.y.c.i.k(str2, strSubstring);
            p(v.f2312k.d(str));
            return this;
        }

        public a p(v vVar) {
            l.y.c.i.e(vVar, "url");
            m(vVar);
            return this;
        }
    }

    public b0(v vVar, String str, u uVar, c0 c0Var, Map<Class<?>, ? extends Object> map) {
        l.y.c.i.e(vVar, "url");
        l.y.c.i.e(str, "method");
        l.y.c.i.e(uVar, "headers");
        l.y.c.i.e(map, "tags");
        this.a = vVar;
        this.b = str;
        this.c = uVar;
        this.d = c0Var;
        this.e = map;
    }

    public final c0 a() {
        return this.d;
    }

    public final d b() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        d dVarB = d.f2161n.b(this.c);
        this.f = dVarB;
        return dVarB;
    }

    public final Map<Class<?>, Object> c() {
        return this.e;
    }

    public final String d(String str) {
        l.y.c.i.e(str, "name");
        return this.c.b(str);
    }

    public final u e() {
        return this.c;
    }

    public final boolean f() {
        return this.a.j();
    }

    public final String g() {
        return this.b;
    }

    public final a h() {
        return new a(this);
    }

    public final <T> T i(Class<? extends T> cls) {
        l.y.c.i.e(cls, "type");
        return cls.cast(this.e.get(cls));
    }

    public final v j() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(g());
        sb.append(", url=");
        sb.append(j());
        if (e().size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (l.l<? extends String, ? extends String> lVar : e()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    l.t.k.n();
                    throw null;
                }
                l.l<? extends String, ? extends String> lVar2 = lVar;
                String strA = lVar2.a();
                String strB = lVar2.b();
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(strA);
                sb.append(':');
                sb.append(strB);
                i2 = i3;
            }
            sb.append(']');
        }
        if (!c().isEmpty()) {
            sb.append(", tags=");
            sb.append(c());
        }
        sb.append('}');
        String string = sb.toString();
        l.y.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
