package j.d.a.c.f.g;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements com.google.firebase.i.h.b<e> {
    private static final com.google.firebase.i.d<Object> d = d.a;
    public static final /* synthetic */ int e = 0;
    private final Map<Class<?>, com.google.firebase.i.d<?>> a = new HashMap();
    private final Map<Class<?>, com.google.firebase.i.f<?>> b = new HashMap();
    private final com.google.firebase.i.d<Object> c = d;

    @Override // com.google.firebase.i.h.b
    public final /* bridge */ /* synthetic */ com.google.firebase.i.h.b a(Class cls, com.google.firebase.i.d dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }

    public final f b() {
        return new f(new HashMap(this.a), new HashMap(this.b), this.c);
    }
}
