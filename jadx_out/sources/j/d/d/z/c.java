package j.d.d.z;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final Map<Type, j.d.d.g<?>> a;
    private final boolean b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements j.d.d.z.i<T> {
        final /* synthetic */ Type a;

        a(c cVar, Type type) {
            this.a = type;
        }

        @Override // j.d.d.z.i
        public T a() {
            Type type = this.a;
            if (!(type instanceof ParameterizedType)) {
                throw new j.d.d.l("Invalid EnumMap type: " + this.a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) new EnumMap((Class) type2);
            }
            throw new j.d.d.l("Invalid EnumMap type: " + this.a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements j.d.d.z.i<T> {
        b(c cVar) {
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: j.d.d.z.c$c, reason: collision with other inner class name */
    class C0241c<T> implements j.d.d.z.i<T> {
        C0241c(c cVar) {
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class d<T> implements j.d.d.z.i<T> {
        d(c cVar) {
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class e<T> implements j.d.d.z.i<T> {
        e(c cVar) {
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class f<T> implements j.d.d.z.i<T> {
        f(c cVar) {
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) new j.d.d.z.h();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class g<T> implements j.d.d.z.i<T> {
        private final j.d.d.z.m a = j.d.d.z.m.b();
        final /* synthetic */ Class b;

        g(c cVar, Class cls) {
            this.b = cls;
        }

        @Override // j.d.d.z.i
        public T a() {
            try {
                return (T) this.a.c(this.b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.b + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class h<T> implements j.d.d.z.i<T> {
        final /* synthetic */ String a;

        h(c cVar, String str) {
            this.a = str;
        }

        @Override // j.d.d.z.i
        public T a() {
            throw new j.d.d.l(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class i<T> implements j.d.d.z.i<T> {
        final /* synthetic */ j.d.d.g a;
        final /* synthetic */ Type b;

        i(c cVar, j.d.d.g gVar, Type type) {
            this.a = gVar;
            this.b = type;
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class j<T> implements j.d.d.z.i<T> {
        final /* synthetic */ j.d.d.g a;
        final /* synthetic */ Type b;

        j(c cVar, j.d.d.g gVar, Type type) {
            this.a = gVar;
            this.b = type;
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class k<T> implements j.d.d.z.i<T> {
        final /* synthetic */ String a;

        k(c cVar, String str) {
            this.a = str;
        }

        @Override // j.d.d.z.i
        public T a() {
            throw new j.d.d.l(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class l<T> implements j.d.d.z.i<T> {
        final /* synthetic */ Constructor a;

        l(c cVar, Constructor constructor) {
            this.a = constructor;
        }

        @Override // j.d.d.z.i
        public T a() {
            try {
                return (T) this.a.newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class m<T> implements j.d.d.z.i<T> {
        m(c cVar) {
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class n<T> implements j.d.d.z.i<T> {
        final /* synthetic */ Type a;

        n(c cVar, Type type) {
            this.a = type;
        }

        @Override // j.d.d.z.i
        public T a() {
            Type type = this.a;
            if (!(type instanceof ParameterizedType)) {
                throw new j.d.d.l("Invalid EnumSet type: " + this.a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new j.d.d.l("Invalid EnumSet type: " + this.a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class o<T> implements j.d.d.z.i<T> {
        o(c cVar) {
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class p<T> implements j.d.d.z.i<T> {
        p(c cVar) {
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class q<T> implements j.d.d.z.i<T> {
        q(c cVar) {
        }

        @Override // j.d.d.z.i
        public T a() {
            return (T) new ArrayList();
        }
    }

    public c(Map<Type, j.d.d.g<?>> map, boolean z) {
        this.a = map;
        this.b = z;
    }

    private <T> j.d.d.z.i<T> b(Class<? super T> cls) {
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            String strC = j.d.d.z.o.a.c(declaredConstructor);
            return strC != null ? new k(this, strC) : new l(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> j.d.d.z.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new m(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new n(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new o(this);
            }
            return Queue.class.isAssignableFrom(cls) ? new p(this) : new q(this);
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (cls == EnumMap.class) {
            return new a(this, type);
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new b(this);
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new C0241c(this);
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new d(this);
        }
        return (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(j.d.d.a0.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new f(this) : new e(this);
    }

    private <T> j.d.d.z.i<T> d(Class<? super T> cls) {
        if (this.b) {
            return new g(this, cls);
        }
        return new h(this, "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public <T> j.d.d.z.i<T> a(j.d.d.a0.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        j.d.d.g<?> gVar = this.a.get(type);
        if (gVar != null) {
            return new i(this, gVar, type);
        }
        j.d.d.g<?> gVar2 = this.a.get(rawType);
        if (gVar2 != null) {
            return new j(this, gVar2, type);
        }
        j.d.d.z.i<T> iVarB = b(rawType);
        if (iVarB != null) {
            return iVarB;
        }
        j.d.d.z.i<T> iVarC = c(type, rawType);
        return iVarC != null ? iVarC : d(rawType);
    }

    public String toString() {
        return this.a.toString();
    }
}
