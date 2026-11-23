package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import m.b0;

/* JADX INFO: loaded from: classes.dex */
final class i extends e.a {

    @Nullable
    private final Executor a;

    class a implements e<Object, d<?>> {
        final /* synthetic */ Type a;
        final /* synthetic */ Executor b;

        a(i iVar, Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // o.e
        public Type a() {
            return this.a;
        }

        @Override // o.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d<Object> b(d<Object> dVar) {
            Executor executor = this.b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    static final class b<T> implements d<T> {
        final Executor a;
        final d<T> b;

        class a implements f<T> {
            final /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void d(f fVar, Throwable th) {
                fVar.b(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void f(f fVar, t tVar) {
                if (b.this.b.f()) {
                    fVar.b(b.this, new IOException("Canceled"));
                } else {
                    fVar.a(b.this, tVar);
                }
            }

            @Override // o.f
            public void a(d<T> dVar, final t<T> tVar) {
                Executor executor = b.this.a;
                final f fVar = this.a;
                executor.execute(new Runnable() { // from class: o.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.f(fVar, tVar);
                    }
                });
            }

            @Override // o.f
            public void b(d<T> dVar, final Throwable th) {
                Executor executor = b.this.a;
                final f fVar = this.a;
                executor.execute(new Runnable() { // from class: o.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d(fVar, th);
                    }
                });
            }
        }

        b(Executor executor, d<T> dVar) {
            this.a = executor;
            this.b = dVar;
        }

        @Override // o.d
        public void Q(f<T> fVar) {
            defpackage.e.a(fVar, "callback == null");
            this.b.Q(new a(fVar));
        }

        @Override // o.d
        public t<T> b() {
            return this.b.b();
        }

        @Override // o.d
        public b0 c() {
            return this.b.c();
        }

        @Override // o.d
        public void cancel() {
            this.b.cancel();
        }

        @Override // o.d
        public boolean f() {
            return this.b.f();
        }

        @Override // o.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d<T> clone() {
            return new b(this.a, this.b.clone());
        }
    }

    i(@Nullable Executor executor) {
        this.a = executor;
    }

    @Override // o.e.a
    @Nullable
    public e<?, ?> a(Type type, Annotation[] annotationArr, u uVar) {
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(this, y.g(0, (ParameterizedType) type), y.l(annotationArr, w.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
