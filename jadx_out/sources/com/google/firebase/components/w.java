package com.google.firebase.components;

import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class w implements Subscriber, com.google.firebase.events.c {
    private final Map<Class<?>, ConcurrentHashMap<com.google.firebase.events.b<Object>, Executor>> a = new HashMap();
    private Queue<com.google.firebase.events.a<?>> b = new ArrayDeque();
    private final Executor c;

    w(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Map.Entry<com.google.firebase.events.b<Object>, Executor>> f(com.google.firebase.events.a<?> aVar) {
        ConcurrentHashMap<com.google.firebase.events.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void a(Class<T> cls, com.google.firebase.events.b<? super T> bVar) {
        b(cls, this.c, bVar);
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void b(Class<T> cls, Executor executor, com.google.firebase.events.b<? super T> bVar) {
        b0.b(cls);
        b0.b(bVar);
        b0.b(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(bVar, executor);
    }

    @Override // com.google.firebase.events.c
    public void c(final com.google.firebase.events.a<?> aVar) {
        b0.b(aVar);
        synchronized (this) {
            Queue<com.google.firebase.events.a<?>> queue = this.b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<com.google.firebase.events.b<Object>, Executor> entry : f(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.firebase.events.b) entry.getKey()).a(aVar);
                    }
                });
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void d(Class<T> cls, com.google.firebase.events.b<? super T> bVar) {
        b0.b(cls);
        b0.b(bVar);
        if (this.a.containsKey(cls)) {
            ConcurrentHashMap<com.google.firebase.events.b<Object>, Executor> concurrentHashMap = this.a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.a.remove(cls);
            }
        }
    }

    void e() {
        Queue<com.google.firebase.events.a<?>> queue;
        synchronized (this) {
            queue = this.b;
            if (queue != null) {
                this.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<com.google.firebase.events.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }
    }
}
