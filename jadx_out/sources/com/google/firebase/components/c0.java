package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends m {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final Set<Class<?>> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f1365g;

    private static class a implements com.google.firebase.events.c {
        private final Set<Class<?>> a;
        private final com.google.firebase.events.c b;

        public a(Set<Class<?>> set, com.google.firebase.events.c cVar) {
            this.a = set;
            this.b = cVar;
        }

        @Override // com.google.firebase.events.c
        public void c(com.google.firebase.events.a<?> aVar) {
            if (!this.a.contains(aVar.b())) {
                throw new v(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.b.c(aVar);
        }
    }

    c0(n<?> nVar, o oVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (t tVar : nVar.c()) {
            if (tVar.e()) {
                boolean zG = tVar.g();
                Class<?> clsC = tVar.c();
                if (zG) {
                    hashSet4.add(clsC);
                } else {
                    hashSet.add(clsC);
                }
            } else if (tVar.d()) {
                hashSet3.add(tVar.c());
            } else {
                boolean zG2 = tVar.g();
                Class<?> clsC2 = tVar.c();
                if (zG2) {
                    hashSet5.add(clsC2);
                } else {
                    hashSet2.add(clsC2);
                }
            }
        }
        if (!nVar.f().isEmpty()) {
            hashSet.add(com.google.firebase.events.c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = nVar.f();
        this.f1365g = oVar;
    }

    @Override // com.google.firebase.components.m, com.google.firebase.components.o
    public <T> T a(Class<T> cls) {
        if (!this.a.contains(cls)) {
            throw new v(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f1365g.a(cls);
        return !cls.equals(com.google.firebase.events.c.class) ? t : (T) new a(this.f, (com.google.firebase.events.c) t);
    }

    @Override // com.google.firebase.components.m, com.google.firebase.components.o
    public <T> Set<T> b(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.f1365g.b(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.o
    public <T> Provider<T> c(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f1365g.c(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.o
    public <T> Provider<Set<T>> d(Class<T> cls) {
        if (this.e.contains(cls)) {
            return this.f1365g.d(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // com.google.firebase.components.o
    public <T> Deferred<T> e(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f1365g.e(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
