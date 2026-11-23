package j.d.d.z.n;

import j.d.d.w;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
final class m<T> extends w<T> {
    private final j.d.d.e a;
    private final w<T> b;
    private final Type c;

    m(j.d.d.e eVar, w<T> wVar, Type type) {
        this.a = eVar;
        this.b = wVar;
        this.c = type;
    }

    private Type e(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    @Override // j.d.d.w
    public T b(j.d.d.b0.a aVar) {
        return this.b.b(aVar);
    }

    @Override // j.d.d.w
    public void d(j.d.d.b0.c cVar, T t) {
        w<T> wVarM = this.b;
        Type typeE = e(this.c, t);
        if (typeE != this.c) {
            wVarM = this.a.m(j.d.d.a0.a.get(typeE));
            if (wVarM instanceof k.b) {
                w<T> wVar = this.b;
                if (!(wVar instanceof k.b)) {
                    wVarM = wVar;
                }
            }
        }
        wVarM.d(cVar, t);
    }
}
