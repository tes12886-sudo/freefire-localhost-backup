package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import m.c0;
import m.e0;

/* JADX INFO: loaded from: classes.dex */
public interface h<F, T> {

    public static abstract class a {
        protected static Type a(int i2, ParameterizedType parameterizedType) {
            return y.g(i2, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return y.h(type);
        }

        @Nullable
        public h<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, u uVar) {
            return null;
        }

        @Nullable
        public h<e0, ?> d(Type type, Annotation[] annotationArr, u uVar) {
            return null;
        }

        @Nullable
        public h<?, String> e(Type type, Annotation[] annotationArr, u uVar) {
            return null;
        }
    }

    @Nullable
    T a(F f);
}
