package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import m.e0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
@IgnoreJRERequirement
final class o extends h.a {
    static final h.a a = new o();

    @IgnoreJRERequirement
    static final class a<T> implements h<e0, Optional<T>> {
        final h<e0, T> a;

        a(h<e0, T> hVar) {
            this.a = hVar;
        }

        @Override // o.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(e0 e0Var) {
            return Optional.ofNullable(this.a.a(e0Var));
        }
    }

    o() {
    }

    @Override // o.h.a
    @Nullable
    public h<e0, ?> d(Type type, Annotation[] annotationArr, u uVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(uVar.h(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
