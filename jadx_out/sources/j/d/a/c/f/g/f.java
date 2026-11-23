package j.d.a.c.f.g;

import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final Map<Class<?>, com.google.firebase.i.d<?>> a;
    private final Map<Class<?>, com.google.firebase.i.f<?>> b;
    private final com.google.firebase.i.d<Object> c;

    f(Map<Class<?>, com.google.firebase.i.d<?>> map, Map<Class<?>, com.google.firebase.i.f<?>> map2, com.google.firebase.i.d<Object> dVar) {
        this.a = map;
        this.b = map2;
        this.c = dVar;
    }

    public final void a(Object obj, OutputStream outputStream) {
        new c(outputStream, this.a, this.b, this.c).j(obj);
    }
}
