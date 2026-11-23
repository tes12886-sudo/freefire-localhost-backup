package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
class a0<T> implements Provider<T>, Deferred<T> {
    private static final Deferred.a<Object> c = new Deferred.a() { // from class: com.google.firebase.components.k
        @Override // com.google.firebase.inject.Deferred.a
        public final void a(Provider provider) {
            a0.c(provider);
        }
    };
    private static final Provider<Object> d = new Provider() { // from class: com.google.firebase.components.j
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return a0.d();
        }
    };
    private Deferred.a<T> a;
    private volatile Provider<T> b;

    private a0(Deferred.a<T> aVar, Provider<T> provider) {
        this.a = aVar;
        this.b = provider;
    }

    static <T> a0<T> b() {
        return new a0<>(c, d);
    }

    static /* synthetic */ void c(Provider provider) {
    }

    static /* synthetic */ Object d() {
        return null;
    }

    static /* synthetic */ void e(Deferred.a aVar, Deferred.a aVar2, Provider provider) {
        aVar.a(provider);
        aVar2.a(provider);
    }

    static <T> a0<T> f(Provider<T> provider) {
        return new a0<>(null, provider);
    }

    @Override // com.google.firebase.inject.Deferred
    public void a(final Deferred.a<T> aVar) {
        Provider<T> provider;
        Provider<T> provider2 = this.b;
        Provider<Object> provider3 = d;
        if (provider2 != provider3) {
            aVar.a(provider2);
            return;
        }
        Provider<T> provider4 = null;
        synchronized (this) {
            provider = this.b;
            if (provider != provider3) {
                provider4 = provider;
            } else {
                final Deferred.a<T> aVar2 = this.a;
                this.a = new Deferred.a() { // from class: com.google.firebase.components.l
                    @Override // com.google.firebase.inject.Deferred.a
                    public final void a(Provider provider5) {
                        a0.e(aVar2, aVar, provider5);
                    }
                };
            }
        }
        if (provider4 != null) {
            aVar.a(provider);
        }
    }

    void g(Provider<T> provider) {
        Deferred.a<T> aVar;
        if (this.b != d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.a;
            this.a = null;
            this.b = provider;
        }
        aVar.a(provider);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.b.get();
    }
}
