package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import m.c0;
import m.e0;

/* JADX INFO: loaded from: classes.dex */
final class c extends h.a {
    private boolean a = true;

    static final class a implements h<e0, e0> {
        static final a a = new a();

        a() {
        }

        @Override // o.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 a(e0 e0Var) {
            try {
                return y.a(e0Var);
            } finally {
                e0Var.close();
            }
        }
    }

    static final class b implements h<c0, c0> {
        static final b a = new b();

        b() {
        }

        @Override // o.h
        public /* bridge */ /* synthetic */ c0 a(c0 c0Var) {
            c0 c0Var2 = c0Var;
            b(c0Var2);
            return c0Var2;
        }

        public c0 b(c0 c0Var) {
            return c0Var;
        }
    }

    /* JADX INFO: renamed from: o.c$c, reason: collision with other inner class name */
    static final class C0281c implements h<e0, e0> {
        static final C0281c a = new C0281c();

        C0281c() {
        }

        @Override // o.h
        public /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
            e0 e0Var2 = e0Var;
            b(e0Var2);
            return e0Var2;
        }

        public e0 b(e0 e0Var) {
            return e0Var;
        }
    }

    static final class d implements h<Object, String> {
        static final d a = new d();

        d() {
        }

        @Override // o.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    static final class e implements h<e0, l.s> {
        static final e a = new e();

        e() {
        }

        @Override // o.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l.s a(e0 e0Var) {
            e0Var.close();
            return l.s.a;
        }
    }

    static final class f implements h<e0, Void> {
        static final f a = new f();

        f() {
        }

        @Override // o.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(e0 e0Var) {
            e0Var.close();
            return null;
        }
    }

    c() {
    }

    @Override // o.h.a
    @Nullable
    public h<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, u uVar) {
        if (c0.class.isAssignableFrom(y.h(type))) {
            return b.a;
        }
        return null;
    }

    @Override // o.h.a
    @Nullable
    public h<e0, ?> d(Type type, Annotation[] annotationArr, u uVar) {
        if (type == e0.class) {
            return y.l(annotationArr, o.a0.w.class) ? C0281c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (!this.a || type != l.s.class) {
            return null;
        }
        try {
            return e.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }
}
