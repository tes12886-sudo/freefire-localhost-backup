package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import m.c0;
import m.e0;
import m.z;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private final Map<Method, v<?>> a = new ConcurrentHashMap();
    final m.e.a b;
    final m.v c;
    final List<h.a> d;
    final List<e.a> e;
    final boolean f;

    class a implements InvocationHandler {
        private final q a = q.f();
        private final Object[] b = new Object[0];
        final /* synthetic */ Class c;

        a(Class cls) {
            this.c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.b;
            }
            return this.a.h(method) ? this.a.g(method, this.c, obj, objArr) : u.this.c(method).a(objArr);
        }
    }

    public static final class b {
        private final q a;

        @Nullable
        private m.e.a b;

        @Nullable
        private m.v c;
        private final List<h.a> d;
        private final List<e.a> e;

        @Nullable
        private Executor f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f2375g;

        public b() {
            this(q.f());
        }

        b(q qVar) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = qVar;
        }

        public b a(h.a aVar) {
            List<h.a> list = this.d;
            defpackage.e.a(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(String str) {
            defpackage.e.a(str, "baseUrl == null");
            c(m.v.h(str));
            return this;
        }

        public b c(m.v vVar) {
            defpackage.e.a(vVar, "baseUrl == null");
            List<String> listM = vVar.m();
            if ("".equals(listM.get(listM.size() - 1))) {
                this.c = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        public u d() {
            if (this.c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            m.e.a zVar = this.b;
            if (zVar == null) {
                zVar = new z();
            }
            m.e.a aVar = zVar;
            Executor executorB = this.f;
            if (executorB == null) {
                executorB = this.a.b();
            }
            Executor executor = executorB;
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.addAll(this.a.a(executor));
            ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.a.d());
            arrayList2.add(new c());
            arrayList2.addAll(this.d);
            arrayList2.addAll(this.a.c());
            return new u(aVar, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f2375g);
        }

        public b e(m.e.a aVar) {
            defpackage.e.a(aVar, "factory == null");
            this.b = aVar;
            return this;
        }

        public b f(z zVar) {
            defpackage.e.a(zVar, "client == null");
            e(zVar);
            return this;
        }
    }

    u(m.e.a aVar, m.v vVar, List<h.a> list, List<e.a> list2, @Nullable Executor executor, boolean z) {
        this.b = aVar;
        this.c = vVar;
        this.d = list;
        this.e = list2;
        this.f = z;
    }

    private void j(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f) {
            q qVarF = q.f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!qVarF.h(method) && !Modifier.isStatic(method.getModifiers())) {
                    c(method);
                }
            }
        }
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    v<?> c(Method method) {
        v<?> vVarB;
        v<?> vVar = this.a.get(method);
        if (vVar != null) {
            return vVar;
        }
        synchronized (this.a) {
            vVarB = this.a.get(method);
            if (vVarB == null) {
                vVarB = v.b(this, method);
                this.a.put(method, vVarB);
            }
        }
        return vVarB;
    }

    public e<?, ?> d(@Nullable e.a aVar, Type type, Annotation[] annotationArr) {
        defpackage.e.a(type, "returnType == null");
        defpackage.e.a(annotationArr, "annotations == null");
        int iIndexOf = this.e.indexOf(aVar) + 1;
        int size = this.e.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            e<?, ?> eVarA = this.e.get(i2).a(type, annotationArr, this);
            if (eVarA != null) {
                return eVarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < iIndexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.e.get(i3).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<T, c0> e(@Nullable h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        defpackage.e.a(type, "type == null");
        defpackage.e.a(annotationArr, "parameterAnnotations == null");
        defpackage.e.a(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            h<T, c0> hVar = (h<T, c0>) this.d.get(i2).c(type, annotationArr, annotationArr2, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < iIndexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i3).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<e0, T> f(@Nullable h.a aVar, Type type, Annotation[] annotationArr) {
        defpackage.e.a(type, "type == null");
        defpackage.e.a(annotationArr, "annotations == null");
        int iIndexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            h<e0, T> hVar = (h<e0, T>) this.d.get(i2).d(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < iIndexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i3).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<T, c0> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public <T> h<e0, T> h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public <T> h<T, String> i(Type type, Annotation[] annotationArr) {
        defpackage.e.a(type, "type == null");
        defpackage.e.a(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            h<T, String> hVar = (h<T, String>) this.d.get(i2).e(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        return c.d.a;
    }
}
