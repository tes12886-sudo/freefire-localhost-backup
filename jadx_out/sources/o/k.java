package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import m.d0;
import m.e0;

/* JADX INFO: loaded from: classes.dex */
abstract class k<ResponseT, ReturnT> extends v<ReturnT> {
    private final s a;
    private final m.e.a b;
    private final h<e0, ResponseT> c;

    static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {
        private final e<ResponseT, ReturnT> d;

        a(s sVar, m.e.a aVar, h<e0, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(sVar, aVar, hVar);
            this.d = eVar;
        }

        @Override // o.k
        protected ReturnT c(d<ResponseT> dVar, Object[] objArr) {
            return this.d.b(dVar);
        }
    }

    static final class b<ResponseT> extends k<ResponseT, Object> {
        private final e<ResponseT, d<ResponseT>> d;
        private final boolean e;

        b(s sVar, m.e.a aVar, h<e0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z) {
            super(sVar, aVar, hVar);
            this.d = eVar;
            this.e = z;
        }

        @Override // o.k
        protected Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarB = this.d.b(dVar);
            l.v.a aVar = (l.v.a) objArr[objArr.length - 1];
            try {
                return this.e ? m.b(dVarB, aVar) : m.a(dVarB, aVar);
            } catch (Exception e) {
                return m.d(e, aVar);
            }
        }
    }

    static final class c<ResponseT> extends k<ResponseT, Object> {
        private final e<ResponseT, d<ResponseT>> d;

        c(s sVar, m.e.a aVar, h<e0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(sVar, aVar, hVar);
            this.d = eVar;
        }

        @Override // o.k
        protected Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarB = this.d.b(dVar);
            l.v.a aVar = (l.v.a) objArr[objArr.length - 1];
            try {
                return m.c(dVarB, aVar);
            } catch (Exception e) {
                return m.d(e, aVar);
            }
        }
    }

    k(s sVar, m.e.a aVar, h<e0, ResponseT> hVar) {
        this.a = sVar;
        this.b = aVar;
        this.c = hVar;
    }

    private static <ResponseT, ReturnT> e<ResponseT, ReturnT> d(u uVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (e<ResponseT, ReturnT>) uVar.a(type, annotationArr);
        } catch (RuntimeException e) {
            throw y.n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> h<e0, ResponseT> e(u uVar, Method method, Type type) {
        try {
            return uVar.h(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw y.n(method, e, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> k<ResponseT, ReturnT> f(u uVar, Method method, s sVar) {
        Type genericReturnType;
        boolean z;
        boolean z2 = sVar.f2365k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = y.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (y.h(typeF) == t.class && (typeF instanceof ParameterizedType)) {
                typeF = y.g(0, (ParameterizedType) typeF);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new y.b(null, d.class, typeF);
            annotations = x.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        e eVarD = d(uVar, method, genericReturnType, annotations);
        Type typeA = eVarD.a();
        if (typeA == d0.class) {
            throw y.m(method, "'" + y.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == t.class) {
            throw y.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (sVar.c.equals("HEAD") && !Void.class.equals(typeA)) {
            throw y.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        h hVarE = e(uVar, method, typeA);
        m.e.a aVar = uVar.b;
        if (z2) {
            return z ? new c(sVar, aVar, hVarE, eVarD) : new b(sVar, aVar, hVarE, eVarD, false);
        }
        return new a(sVar, aVar, hVarE, eVarD);
    }

    @Override // o.v
    @Nullable
    final ReturnT a(Object[] objArr) {
        return c(new n(this.a, objArr, this.b, this.c), objArr);
    }

    @Nullable
    protected abstract ReturnT c(d<ResponseT> dVar, Object[] objArr);
}
