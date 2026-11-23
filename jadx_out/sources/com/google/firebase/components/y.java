package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class y<T> implements Provider<Set<T>> {
    private volatile Set<T> b = null;
    private volatile Set<Provider<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection<Provider<T>> collection) {
        this.a.addAll(collection);
    }

    static y<?> b(Collection<Provider<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        Iterator<Provider<T>> it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(it.next().get());
        }
        this.a = null;
    }

    synchronized void a(Provider<T> provider) {
        Set set;
        if (this.b == null) {
            set = this.a;
        } else {
            set = this.b;
            provider = (Provider<T>) provider.get();
        }
        set.add(provider);
    }

    @Override // com.google.firebase.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
