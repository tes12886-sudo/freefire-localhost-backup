package o;

import java.lang.reflect.Method;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    static final class a extends l.y.c.j implements l.y.b.l<Throwable, l.s> {
        final /* synthetic */ o.d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o.d dVar) {
            super(1);
            this.a = dVar;
        }

        @Override // l.y.b.l
        public /* bridge */ /* synthetic */ l.s c(Throwable th) {
            d(th);
            return l.s.a;
        }

        public final void d(Throwable th) {
            this.a.cancel();
        }
    }

    static final class b extends l.y.c.j implements l.y.b.l<Throwable, l.s> {
        final /* synthetic */ o.d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o.d dVar) {
            super(1);
            this.a = dVar;
        }

        @Override // l.y.b.l
        public /* bridge */ /* synthetic */ l.s c(Throwable th) {
            d(th);
            return l.s.a;
        }

        public final void d(Throwable th) {
            this.a.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class c<T> implements o.f<T> {
        final /* synthetic */ CancellableContinuation a;

        c(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // o.f
        public void a(o.d<T> dVar, t<T> tVar) {
            l.v.a aVar;
            Object objA;
            l.y.c.i.f(dVar, "call");
            l.y.c.i.f(tVar, "response");
            if (tVar.f()) {
                objA = tVar.a();
                if (objA == null) {
                    Object objI = dVar.c().i(l.class);
                    if (objI == null) {
                        l.y.c.i.m();
                        throw null;
                    }
                    l.y.c.i.b(objI, "call.request().tag(Invocation::class.java)!!");
                    Method methodA = ((l) objI).a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    l.y.c.i.b(methodA, "method");
                    Class<?> declaringClass = methodA.getDeclaringClass();
                    l.y.c.i.b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(methodA.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    l.d dVar2 = new l.d(sb.toString());
                    aVar = (l.v.a) this.a;
                    l.m.a aVar2 = l.m.a;
                    objA = l.n.a(dVar2);
                } else {
                    aVar = (l.v.a) this.a;
                    l.m.a aVar3 = l.m.a;
                }
            } else {
                aVar = this.a;
                j jVar = new j(tVar);
                l.m.a aVar4 = l.m.a;
                objA = l.n.a(jVar);
            }
            l.m.a(objA);
            aVar.b(objA);
        }

        @Override // o.f
        public void b(o.d<T> dVar, Throwable th) {
            l.y.c.i.f(dVar, "call");
            l.y.c.i.f(th, "t");
            l.v.a aVar = this.a;
            l.m.a aVar2 = l.m.a;
            Object objA = l.n.a(th);
            l.m.a(objA);
            aVar.b(objA);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class d<T> implements o.f<T> {
        final /* synthetic */ CancellableContinuation a;

        d(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // o.f
        public void a(o.d<T> dVar, t<T> tVar) {
            l.v.a aVar;
            Object objA;
            l.y.c.i.f(dVar, "call");
            l.y.c.i.f(tVar, "response");
            if (tVar.f()) {
                aVar = (l.v.a) this.a;
                objA = tVar.a();
                l.m.a aVar2 = l.m.a;
            } else {
                aVar = this.a;
                j jVar = new j(tVar);
                l.m.a aVar3 = l.m.a;
                objA = l.n.a(jVar);
            }
            l.m.a(objA);
            aVar.b(objA);
        }

        @Override // o.f
        public void b(o.d<T> dVar, Throwable th) {
            l.y.c.i.f(dVar, "call");
            l.y.c.i.f(th, "t");
            l.v.a aVar = this.a;
            l.m.a aVar2 = l.m.a;
            Object objA = l.n.a(th);
            l.m.a(objA);
            aVar.b(objA);
        }
    }

    static final class e extends l.y.c.j implements l.y.b.l<Throwable, l.s> {
        final /* synthetic */ o.d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o.d dVar) {
            super(1);
            this.a = dVar;
        }

        @Override // l.y.b.l
        public /* bridge */ /* synthetic */ l.s c(Throwable th) {
            d(th);
            return l.s.a;
        }

        public final void d(Throwable th) {
            this.a.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class f<T> implements o.f<T> {
        final /* synthetic */ CancellableContinuation a;

        f(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // o.f
        public void a(o.d<T> dVar, t<T> tVar) {
            l.y.c.i.f(dVar, "call");
            l.y.c.i.f(tVar, "response");
            l.v.a aVar = this.a;
            l.m.a aVar2 = l.m.a;
            l.m.a(tVar);
            aVar.b(tVar);
        }

        @Override // o.f
        public void b(o.d<T> dVar, Throwable th) {
            l.y.c.i.f(dVar, "call");
            l.y.c.i.f(th, "t");
            l.v.a aVar = this.a;
            l.m.a aVar2 = l.m.a;
            Object objA = l.n.a(th);
            l.m.a(objA);
            aVar.b(objA);
        }
    }

    static final class g implements Runnable {
        final /* synthetic */ l.v.a a;
        final /* synthetic */ Exception b;

        g(l.v.a aVar, Exception exc) {
            this.a = aVar;
            this.b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            l.v.a aVarA = l.v.d.c.a(this.a);
            Exception exc = this.b;
            l.m.a aVar = l.m.a;
            Object objA = l.n.a(exc);
            l.m.a(objA);
            aVarA.b(objA);
        }
    }

    @l.v.e.a.d(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    static final class h extends l.v.e.a.c {
        /* synthetic */ Object d;
        int e;
        Object f;

        h(l.v.a aVar) {
            super(aVar);
        }

        @Override // l.v.e.a.a
        public final Object d(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return m.d(null, this);
        }
    }

    public static final <T> Object a(o.d<T> dVar, l.v.a<? super T> aVar) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(l.v.d.c.a(aVar), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new a(dVar));
        dVar.Q(new c(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == l.v.d.d.b()) {
            l.v.e.a.f.b(aVar);
        }
        return result;
    }

    public static final <T> Object b(o.d<T> dVar, l.v.a<? super T> aVar) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(l.v.d.c.a(aVar), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new b(dVar));
        dVar.Q(new d(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == l.v.d.d.b()) {
            l.v.e.a.f.b(aVar);
        }
        return result;
    }

    public static final <T> Object c(o.d<T> dVar, l.v.a<? super t<T>> aVar) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(l.v.d.c.a(aVar), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new e(dVar));
        dVar.Q(new f(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == l.v.d.d.b()) {
            l.v.e.a.f.b(aVar);
        }
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(Exception exc, l.v.a<?> aVar) throws Throwable {
        h hVar;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i2 = hVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.e = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(aVar);
            }
        } else {
            hVar = new h(aVar);
        }
        Object obj = hVar.d;
        Object objB = l.v.d.d.b();
        int i3 = hVar.e;
        if (i3 == 0) {
            l.n.b(obj);
            hVar.f = exc;
            hVar.e = 1;
            Dispatchers.getDefault().dispatch(hVar.a(), new g(hVar, exc));
            Object objB2 = l.v.d.d.b();
            if (objB2 == l.v.d.d.b()) {
                l.v.e.a.f.b(hVar);
            }
            if (objB2 == objB) {
                return objB;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.n.b(obj);
        }
        return l.s.a;
    }
}
