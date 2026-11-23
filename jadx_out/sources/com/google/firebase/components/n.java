package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n<T> {
    private final Set<Class<? super T>> a;
    private final Set<t> b;
    private final int c;
    private final int d;
    private final q<T> e;
    private final Set<Class<?>> f;

    public static class b<T> {
        private final Set<Class<? super T>> a;
        private final Set<t> b;
        private int c;
        private int d;
        private q<T> e;
        private Set<Class<?>> f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = new HashSet();
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            b0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                b0.c(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        static /* synthetic */ b a(b bVar) {
            bVar.g();
            return bVar;
        }

        private b<T> g() {
            this.d = 1;
            return this;
        }

        private b<T> h(int i2) {
            b0.d(this.c == 0, "Instantiation type has already been set.");
            this.c = i2;
            return this;
        }

        private void i(Class<?> cls) {
            b0.a(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(t tVar) {
            b0.c(tVar, "Null dependency");
            i(tVar.c());
            this.b.add(tVar);
            return this;
        }

        public b<T> c() {
            h(1);
            return this;
        }

        public n<T> d() {
            b0.d(this.e != null, "Missing required property: factory.");
            return new n<>(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f);
        }

        public b<T> e() {
            h(2);
            return this;
        }

        public b<T> f(q<T> qVar) {
            b0.c(qVar, "Null factory");
            this.e = qVar;
            return this;
        }
    }

    private n(Set<Class<? super T>> set, Set<t> set2, int i2, int i3, q<T> qVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i2;
        this.d = i3;
        this.e = qVar;
        this.f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> n<T> g(final T t, Class<T> cls) {
        b bVarH = h(cls);
        bVarH.f(new q() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                Object obj = t;
                n.l(obj, oVar);
                return obj;
            }
        });
        return bVarH.d();
    }

    public static <T> b<T> h(Class<T> cls) {
        b<T> bVarA = a(cls);
        b.a(bVarA);
        return bVarA;
    }

    static /* synthetic */ Object l(Object obj, o oVar) {
        return obj;
    }

    static /* synthetic */ Object m(Object obj, o oVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> n<T> n(final T t, Class<T> cls, Class<? super T>... clsArr) {
        b bVarB = b(cls, clsArr);
        bVarB.f(new q() { // from class: com.google.firebase.components.b
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                Object obj = t;
                n.m(obj, oVar);
                return obj;
            }
        });
        return bVarB.d();
    }

    public Set<t> c() {
        return this.b;
    }

    public q<T> d() {
        return this.e;
    }

    public Set<Class<? super T>> e() {
        return this.a;
    }

    public Set<Class<?>> f() {
        return this.f;
    }

    public boolean i() {
        return this.c == 1;
    }

    public boolean j() {
        return this.c == 2;
    }

    public boolean k() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
