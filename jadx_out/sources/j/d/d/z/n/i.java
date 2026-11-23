package j.d.d.z.n;

import j.d.d.s;
import j.d.d.u;
import j.d.d.v;
import j.d.d.w;
import j.d.d.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends w<Number> {
    private static final x b = f(u.b);
    private final v a;

    class a implements x {
        a() {
        }

        @Override // j.d.d.x
        public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            if (aVar.getRawType() == Number.class) {
                return i.this;
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
                iArr[j.d.d.b0.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.d.d.b0.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j.d.d.b0.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private i(v vVar) {
        this.a = vVar;
    }

    public static x e(v vVar) {
        return vVar == u.b ? b : f(vVar);
    }

    private static x f(v vVar) {
        return new i(vVar).new a();
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(j.d.d.b0.a aVar) throws IOException {
        j.d.d.b0.b bVarN0 = aVar.n0();
        int i2 = b.a[bVarN0.ordinal()];
        if (i2 == 1) {
            aVar.j0();
            return null;
        }
        if (i2 == 2 || i2 == 3) {
            return this.a.a(aVar);
        }
        throw new s("Expecting number, got: " + bVarN0 + "; at path " + aVar.Q());
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(j.d.d.b0.c cVar, Number number) throws IOException {
        cVar.n0(number);
    }
}
