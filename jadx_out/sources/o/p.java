package o;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import m.c0;

/* JADX INFO: loaded from: classes.dex */
abstract class p<T> {

    class a extends p<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.p
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, @Nullable Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                p.this.a(rVar, it.next());
            }
        }
    }

    class b extends p<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.p
        void a(r rVar, @Nullable Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                p.this.a(rVar, Array.get(obj, i2));
            }
        }
    }

    static final class c<T> extends p<T> {
        private final Method a;
        private final int b;
        private final o.h<T, c0> c;

        c(Method method, int i2, o.h<T, c0> hVar) {
            this.a = method;
            this.b = i2;
            this.c = hVar;
        }

        @Override // o.p
        void a(r rVar, @Nullable T t) {
            if (t == null) {
                throw y.o(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                rVar.l(this.c.a(t));
            } catch (IOException e) {
                throw y.p(this.a, e, this.b, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d<T> extends p<T> {
        private final String a;
        private final o.h<T, String> b;
        private final boolean c;

        d(String str, o.h<T, String> hVar, boolean z) {
            defpackage.e.a(str, "name == null");
            this.a = str;
            this.b = hVar;
            this.c = z;
        }

        @Override // o.p
        void a(r rVar, @Nullable T t) {
            String strA;
            if (t == null || (strA = this.b.a(t)) == null) {
                return;
            }
            rVar.a(this.a, strA, this.c);
        }
    }

    static final class e<T> extends p<Map<String, T>> {
        private final Method a;
        private final int b;
        private final o.h<T, String> c;
        private final boolean d;

        e(Method method, int i2, o.h<T, String> hVar, boolean z) {
            this.a = method;
            this.b = i2;
            this.c = hVar;
            this.d = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.p
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, @Nullable Map<String, T> map) {
            if (map == null) {
                throw y.o(this.a, this.b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw y.o(this.a, this.b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw y.o(this.a, this.b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.c.a(value);
                if (strA == null) {
                    throw y.o(this.a, this.b, "Field map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                rVar.a(key, strA, this.d);
            }
        }
    }

    static final class f<T> extends p<T> {
        private final String a;
        private final o.h<T, String> b;

        f(String str, o.h<T, String> hVar) {
            defpackage.e.a(str, "name == null");
            this.a = str;
            this.b = hVar;
        }

        @Override // o.p
        void a(r rVar, @Nullable T t) {
            String strA;
            if (t == null || (strA = this.b.a(t)) == null) {
                return;
            }
            rVar.b(this.a, strA);
        }
    }

    static final class g<T> extends p<Map<String, T>> {
        private final Method a;
        private final int b;
        private final o.h<T, String> c;

        g(Method method, int i2, o.h<T, String> hVar) {
            this.a = method;
            this.b = i2;
            this.c = hVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.p
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, @Nullable Map<String, T> map) {
            if (map == null) {
                throw y.o(this.a, this.b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw y.o(this.a, this.b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw y.o(this.a, this.b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                rVar.b(key, this.c.a(value));
            }
        }
    }

    static final class h extends p<m.u> {
        private final Method a;
        private final int b;

        h(Method method, int i2) {
            this.a = method;
            this.b = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.p
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, @Nullable m.u uVar) {
            if (uVar == null) {
                throw y.o(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            rVar.c(uVar);
        }
    }

    static final class i<T> extends p<T> {
        private final Method a;
        private final int b;
        private final m.u c;
        private final o.h<T, c0> d;

        i(Method method, int i2, m.u uVar, o.h<T, c0> hVar) {
            this.a = method;
            this.b = i2;
            this.c = uVar;
            this.d = hVar;
        }

        @Override // o.p
        void a(r rVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                rVar.d(this.c, this.d.a(t));
            } catch (IOException e) {
                throw y.o(this.a, this.b, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    static final class j<T> extends p<Map<String, T>> {
        private final Method a;
        private final int b;
        private final o.h<T, c0> c;
        private final String d;

        j(Method method, int i2, o.h<T, c0> hVar, String str) {
            this.a = method;
            this.b = i2;
            this.c = hVar;
            this.d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.p
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, @Nullable Map<String, T> map) {
            if (map == null) {
                throw y.o(this.a, this.b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw y.o(this.a, this.b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw y.o(this.a, this.b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                rVar.d(m.u.f("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.d), this.c.a(value));
            }
        }
    }

    static final class k<T> extends p<T> {
        private final Method a;
        private final int b;
        private final String c;
        private final o.h<T, String> d;
        private final boolean e;

        k(Method method, int i2, String str, o.h<T, String> hVar, boolean z) {
            this.a = method;
            this.b = i2;
            defpackage.e.a(str, "name == null");
            this.c = str;
            this.d = hVar;
            this.e = z;
        }

        @Override // o.p
        void a(r rVar, @Nullable T t) {
            if (t != null) {
                rVar.f(this.c, this.d.a(t), this.e);
                return;
            }
            throw y.o(this.a, this.b, "Path parameter \"" + this.c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l<T> extends p<T> {
        private final String a;
        private final o.h<T, String> b;
        private final boolean c;

        l(String str, o.h<T, String> hVar, boolean z) {
            defpackage.e.a(str, "name == null");
            this.a = str;
            this.b = hVar;
            this.c = z;
        }

        @Override // o.p
        void a(r rVar, @Nullable T t) {
            String strA;
            if (t == null || (strA = this.b.a(t)) == null) {
                return;
            }
            rVar.g(this.a, strA, this.c);
        }
    }

    static final class m<T> extends p<Map<String, T>> {
        private final Method a;
        private final int b;
        private final o.h<T, String> c;
        private final boolean d;

        m(Method method, int i2, o.h<T, String> hVar, boolean z) {
            this.a = method;
            this.b = i2;
            this.c = hVar;
            this.d = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.p
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, @Nullable Map<String, T> map) {
            if (map == null) {
                throw y.o(this.a, this.b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw y.o(this.a, this.b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw y.o(this.a, this.b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.c.a(value);
                if (strA == null) {
                    throw y.o(this.a, this.b, "Query map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                rVar.g(key, strA, this.d);
            }
        }
    }

    static final class n<T> extends p<T> {
        private final o.h<T, String> a;
        private final boolean b;

        n(o.h<T, String> hVar, boolean z) {
            this.a = hVar;
            this.b = z;
        }

        @Override // o.p
        void a(r rVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            rVar.g(this.a.a(t), null, this.b);
        }
    }

    static final class o extends p<m.y.b> {
        static final o a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.p
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, @Nullable m.y.b bVar) {
            if (bVar != null) {
                rVar.e(bVar);
            }
        }
    }

    /* JADX INFO: renamed from: o.p$p, reason: collision with other inner class name */
    static final class C0283p extends p<Object> {
        private final Method a;
        private final int b;

        C0283p(Method method, int i2) {
            this.a = method;
            this.b = i2;
        }

        @Override // o.p
        void a(r rVar, @Nullable Object obj) {
            if (obj == null) {
                throw y.o(this.a, this.b, "@Url parameter is null.", new Object[0]);
            }
            rVar.m(obj);
        }
    }

    static final class q<T> extends p<T> {
        final Class<T> a;

        q(Class<T> cls) {
            this.a = cls;
        }

        @Override // o.p
        void a(r rVar, @Nullable T t) {
            rVar.h(this.a, t);
        }
    }

    p() {
    }

    abstract void a(r rVar, @Nullable T t);

    final p<Object> b() {
        return new b();
    }

    final p<Iterable<T>> c() {
        return new a();
    }
}
