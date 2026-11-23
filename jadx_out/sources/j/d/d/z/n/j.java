package j.d.d.z.n;

import j.d.d.u;
import j.d.d.v;
import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends w<Object> {
    private static final x c = f(u.a);
    private final j.d.d.e a;
    private final v b;

    class a implements x {
        final /* synthetic */ v a;

        a(v vVar) {
            this.a = vVar;
        }

        @Override // j.d.d.x
        public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Object.class) {
                return new j(eVar, this.a, aVar2);
            }
            return null;
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.d.d.b0.b.values().length];
            a = iArr;
            try {
                iArr[j.d.d.b0.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.d.d.b0.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j.d.d.b0.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j.d.d.b0.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[j.d.d.b0.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[j.d.d.b0.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private j(j.d.d.e eVar, v vVar) {
        this.a = eVar;
        this.b = vVar;
    }

    /* synthetic */ j(j.d.d.e eVar, v vVar, a aVar) {
        this(eVar, vVar);
    }

    public static x e(v vVar) {
        return vVar == u.a ? c : f(vVar);
    }

    private static x f(v vVar) {
        return new a(vVar);
    }

    @Override // j.d.d.w
    public Object b(j.d.d.b0.a aVar) throws IOException {
        switch (b.a[aVar.n0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.Z()) {
                    arrayList.add(b(aVar));
                }
                aVar.u();
                return arrayList;
            case 2:
                j.d.d.z.h hVar = new j.d.d.z.h();
                aVar.c();
                while (aVar.Z()) {
                    hVar.put(aVar.h0(), b(aVar));
                }
                aVar.F();
                return hVar;
            case 3:
                return aVar.l0();
            case 4:
                return this.b.a(aVar);
            case 5:
                return Boolean.valueOf(aVar.d0());
            case 6:
                aVar.j0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j.d.d.w
    public void d(j.d.d.b0.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.b0();
            return;
        }
        w wVarN = this.a.n(obj.getClass());
        if (!(wVarN instanceof j)) {
            wVarN.d(cVar, obj);
        } else {
            cVar.j();
            cVar.F();
        }
    }
}
