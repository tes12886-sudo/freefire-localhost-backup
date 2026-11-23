package j.f.a;

import j.f.a.b;
import j.f.a.b.a;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<M extends b<M, B>, B extends a<M, B>> implements Serializable {
    private final transient e<M> a;
    private final transient n.e b;
    protected transient int c = 0;

    public static abstract class a<T extends b<T, B>, B extends a<T, B>> {
        n.b a;
        g b;

        protected a() {
        }

        public final a<T, B> a(int i2, j.f.a.a aVar, Object obj) {
            if (this.b == null) {
                n.b bVar = new n.b();
                this.a = bVar;
                this.b = new g(bVar);
            }
            try {
                aVar.a().i(this.b, i2, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public final n.e b() {
            n.b bVar = this.a;
            return bVar != null ? bVar.clone().j0() : n.e.e;
        }
    }

    protected b(e<M> eVar, n.e eVar2) {
        if (eVar == null) {
            throw new NullPointerException("adapter == null");
        }
        if (eVar2 == null) {
            throw new NullPointerException("unknownFields == null");
        }
        this.a = eVar;
        this.b = eVar2;
    }

    public final e<M> a() {
        return this.a;
    }

    public final byte[] b() {
        return this.a.h(this);
    }

    public final n.e c() {
        n.e eVar = this.b;
        return eVar != null ? eVar : n.e.e;
    }

    public String toString() {
        return this.a.m(this);
    }

    protected final Object writeReplace() {
        return new c(b(), getClass());
    }
}
