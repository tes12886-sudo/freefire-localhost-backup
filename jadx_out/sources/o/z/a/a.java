package o.z.a;

import j.d.d.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import m.c0;
import m.e0;
import o.h;
import o.u;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h.a {
    private final e a;

    private a(e eVar) {
        this.a = eVar;
    }

    public static a f() {
        return g(new e());
    }

    public static a g(e eVar) {
        if (eVar != null) {
            return new a(eVar);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // o.h.a
    public h<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, u uVar) {
        return new b(this.a, this.a.m(j.d.d.a0.a.get(type)));
    }

    @Override // o.h.a
    public h<e0, ?> d(Type type, Annotation[] annotationArr, u uVar) {
        return new c(this.a, this.a.m(j.d.d.a0.a.get(type)));
    }
}
