package j.d.d.z;

import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements x, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f2070g = new d();
    private boolean d;
    private double a = -1.0d;
    private int b = 136;
    private boolean c = true;
    private List<j.d.d.a> e = Collections.emptyList();
    private List<j.d.d.a> f = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends w<T> {
        private w<T> a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ j.d.d.e d;
        final /* synthetic */ j.d.d.a0.a e;

        a(boolean z, boolean z2, j.d.d.e eVar, j.d.d.a0.a aVar) {
            this.b = z;
            this.c = z2;
            this.d = eVar;
            this.e = aVar;
        }

        private w<T> e() {
            w<T> wVar = this.a;
            if (wVar != null) {
                return wVar;
            }
            w<T> wVarO = this.d.o(d.this, this.e);
            this.a = wVarO;
            return wVarO;
        }

        @Override // j.d.d.w
        public T b(j.d.d.b0.a aVar) throws IOException {
            if (!this.b) {
                return e().b(aVar);
            }
            aVar.x0();
            return null;
        }

        @Override // j.d.d.w
        public void d(j.d.d.b0.c cVar, T t) throws IOException {
            if (this.c) {
                cVar.b0();
            } else {
                e().d(cVar, t);
            }
        }
    }

    private boolean g(Class<?> cls) {
        if (this.a == -1.0d || q((j.d.d.y.d) cls.getAnnotation(j.d.d.y.d.class), (j.d.d.y.e) cls.getAnnotation(j.d.d.y.e.class))) {
            return (!this.c && m(cls)) || k(cls);
        }
        return true;
    }

    private boolean h(Class<?> cls, boolean z) {
        Iterator<j.d.d.a> it = (z ? this.e : this.f).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean k(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || n(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean m(Class<?> cls) {
        return cls.isMemberClass() && !n(cls);
    }

    private boolean n(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean o(j.d.d.y.d dVar) {
        return dVar == null || dVar.value() <= this.a;
    }

    private boolean p(j.d.d.y.e eVar) {
        return eVar == null || eVar.value() > this.a;
    }

    private boolean q(j.d.d.y.d dVar, j.d.d.y.e eVar) {
        return o(dVar) && p(eVar);
    }

    @Override // j.d.d.x
    public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean zG = g(rawType);
        boolean z = zG || h(rawType, true);
        boolean z2 = zG || h(rawType, false);
        if (z || z2) {
            return new a(z2, z, eVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean e(Class<?> cls, boolean z) {
        return g(cls) || h(cls, z);
    }

    public boolean i(Field field, boolean z) {
        j.d.d.y.a aVar;
        if ((this.b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.a != -1.0d && !q((j.d.d.y.d) field.getAnnotation(j.d.d.y.d.class), (j.d.d.y.e) field.getAnnotation(j.d.d.y.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.d && ((aVar = (j.d.d.y.a) field.getAnnotation(j.d.d.y.a.class)) == null || (!z ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.c && m(field.getType())) || k(field.getType())) {
            return true;
        }
        List<j.d.d.a> list = z ? this.e : this.f;
        if (list.isEmpty()) {
            return false;
        }
        j.d.d.b bVar = new j.d.d.b(field);
        Iterator<j.d.d.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(bVar)) {
                return true;
            }
        }
        return false;
    }
}
