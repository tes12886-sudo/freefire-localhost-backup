package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
@IgnoreJRERequirement
final class g extends e.a {
    static final e.a a = new g();

    @IgnoreJRERequirement
    private static final class a<R> implements e<R, CompletableFuture<R>> {
        private final Type a;

        /* JADX INFO: renamed from: o.g$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        private class C0282a implements f<R> {
            private final CompletableFuture<R> a;

            public C0282a(a aVar, CompletableFuture<R> completableFuture) {
                this.a = completableFuture;
            }

            @Override // o.f
            public void a(d<R> dVar, t<R> tVar) {
                if (tVar.f()) {
                    this.a.complete(tVar.a());
                } else {
                    this.a.completeExceptionally(new j(tVar));
                }
            }

            @Override // o.f
            public void b(d<R> dVar, Throwable th) {
                this.a.completeExceptionally(th);
            }
        }

        a(Type type) {
            this.a = type;
        }

        @Override // o.e
        public Type a() {
            return this.a;
        }

        @Override // o.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.Q(new C0282a(this, bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    private static final class b<T> extends CompletableFuture<T> {
        private final d<?> a;

        b(d<?> dVar) {
            this.a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.a.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    private static final class c<R> implements e<R, CompletableFuture<t<R>>> {
        private final Type a;

        @IgnoreJRERequirement
        private class a implements f<R> {
            private final CompletableFuture<t<R>> a;

            public a(c cVar, CompletableFuture<t<R>> completableFuture) {
                this.a = completableFuture;
            }

            @Override // o.f
            public void a(d<R> dVar, t<R> tVar) {
                this.a.complete(tVar);
            }

            @Override // o.f
            public void b(d<R> dVar, Throwable th) {
                this.a.completeExceptionally(th);
            }
        }

        c(Type type) {
            this.a = type;
        }

        @Override // o.e
        public Type a() {
            return this.a;
        }

        @Override // o.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<t<R>> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.Q(new a(this, bVar));
            return bVar;
        }
    }

    g() {
    }

    @Override // o.e.a
    @Nullable
    public e<?, ?> a(Type type, Annotation[] annotationArr, u uVar) {
        if (e.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeB = e.a.b(0, (ParameterizedType) type);
        if (e.a.c(typeB) != t.class) {
            return new a(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new c(e.a.b(0, (ParameterizedType) typeB));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
