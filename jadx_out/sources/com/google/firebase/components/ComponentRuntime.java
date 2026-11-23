package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class ComponentRuntime extends m implements com.google.firebase.h.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Provider<Set<Object>> f1364g = new Provider() { // from class: com.google.firebase.components.i
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Collections.emptySet();
        }
    };
    private final Map<n<?>, Provider<?>> a;
    private final Map<Class<?>, Provider<?>> b;
    private final Map<Class<?>, y<?>> c;
    private final List<Provider<r>> d;
    private final w e;
    private final AtomicReference<Boolean> f;

    public static final class b {
        private final Executor a;
        private final List<Provider<r>> b = new ArrayList();
        private final List<n<?>> c = new ArrayList();

        b(Executor executor) {
            this.a = executor;
        }

        static /* synthetic */ r e(r rVar) {
            return rVar;
        }

        public b a(n<?> nVar) {
            this.c.add(nVar);
            return this;
        }

        public b b(final r rVar) {
            this.b.add(new Provider() { // from class: com.google.firebase.components.e
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    r rVar2 = rVar;
                    ComponentRuntime.b.e(rVar2);
                    return rVar2;
                }
            });
            return this;
        }

        public b c(Collection<Provider<r>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public ComponentRuntime d() {
            return new ComponentRuntime(this.a, this.b, this.c);
        }
    }

    private ComponentRuntime(Executor executor, Iterable<Provider<r>> iterable, Collection<n<?>> collection) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.f = new AtomicReference<>();
        w wVar = new w(executor);
        this.e = wVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.n(wVar, w.class, Subscriber.class, com.google.firebase.events.c.class));
        arrayList.add(n.n(this, com.google.firebase.h.a.class, new Class[0]));
        for (n<?> nVar : collection) {
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        this.d = k(iterable);
        g(arrayList);
    }

    public static b f(Executor executor) {
        return new b(executor);
    }

    private void g(List<n<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<Provider<r>> it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    r rVar = it.next().get();
                    if (rVar != null) {
                        list.addAll(rVar.getComponents());
                        it.remove();
                    }
                } catch (x e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.a.isEmpty()) {
                s.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                s.a(arrayList2);
            }
            for (final n<?> nVar : list) {
                this.a.put(nVar, new Lazy(new Provider() { // from class: com.google.firebase.components.d
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        return this.a.m(nVar);
                    }
                }));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        p();
    }

    private void h(Map<n<?>, Provider<?>> map, boolean z) {
        for (Map.Entry<n<?>, Provider<?>> entry : map.entrySet()) {
            n<?> key = entry.getKey();
            Provider<?> value = entry.getValue();
            if (key.i() || (key.j() && z)) {
                value.get();
            }
        }
        this.e.e();
    }

    private static <T> List<T> k(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object m(n nVar) {
        return nVar.d().a(new c0(nVar, this));
    }

    private void p() {
        Boolean bool = this.f.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    private void q() {
        Map map;
        Class<?> clsC;
        Provider providerB;
        for (n<?> nVar : this.a.keySet()) {
            for (t tVar : nVar.c()) {
                if (tVar.g() && !this.c.containsKey(tVar.c())) {
                    map = this.c;
                    clsC = tVar.c();
                    providerB = y.b(Collections.emptySet());
                } else if (this.b.containsKey(tVar.c())) {
                    continue;
                } else {
                    if (tVar.f()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", nVar, tVar.c()));
                    }
                    if (!tVar.g()) {
                        map = this.b;
                        clsC = tVar.c();
                        providerB = a0.b();
                    }
                }
                map.put(clsC, providerB);
            }
        }
    }

    private List<Runnable> r(List<n<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (n<?> nVar : list) {
            if (nVar.k()) {
                final Provider<?> provider = this.a.get(nVar);
                for (Class<? super Object> cls : nVar.e()) {
                    if (this.b.containsKey(cls)) {
                        final a0 a0Var = (a0) this.b.get(cls);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                a0Var.g(provider);
                            }
                        });
                    } else {
                        this.b.put(cls, provider);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> s() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<n<?>, Provider<?>> entry : this.a.entrySet()) {
            n<?> key = entry.getKey();
            if (!key.k()) {
                Provider<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.c.containsKey(entry2.getKey())) {
                final y<?> yVar = this.c.get(entry2.getKey());
                for (final Provider provider : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            yVar.a(provider);
                        }
                    });
                }
            } else {
                this.c.put((Class) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.o
    public synchronized <T> Provider<T> c(Class<T> cls) {
        b0.c(cls, "Null interface requested.");
        return (Provider) this.b.get(cls);
    }

    @Override // com.google.firebase.components.o
    public synchronized <T> Provider<Set<T>> d(Class<T> cls) {
        y<?> yVar = this.c.get(cls);
        if (yVar != null) {
            return yVar;
        }
        return (Provider<Set<T>>) f1364g;
    }

    @Override // com.google.firebase.components.o
    public <T> Deferred<T> e(Class<T> cls) {
        Provider<T> providerC = c(cls);
        if (providerC == null) {
            return a0.b();
        }
        return providerC instanceof a0 ? (a0) providerC : a0.f(providerC);
    }

    public void i() {
        Iterator<Provider<?>> it = this.a.values().iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    public void j(boolean z) {
        HashMap map;
        if (this.f.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.a);
            }
            h(map, z);
        }
    }
}
