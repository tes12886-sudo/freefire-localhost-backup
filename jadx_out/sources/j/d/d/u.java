package j.d.d;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements v {
    public static final u a;
    public static final u b;
    public static final u c;
    public static final u d;
    private static final /* synthetic */ u[] e;

    final enum a extends u {
        a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // j.d.d.v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double a(j.d.d.b0.a aVar) {
            return Double.valueOf(aVar.e0());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        a = aVar;
        u uVar = new u("LAZILY_PARSED_NUMBER", 1) { // from class: j.d.d.u.b
            {
                a aVar2 = null;
            }

            @Override // j.d.d.v
            public Number a(j.d.d.b0.a aVar2) {
                return new j.d.d.z.g(aVar2.l0());
            }
        };
        b = uVar;
        u uVar2 = new u("LONG_OR_DOUBLE", 2) { // from class: j.d.d.u.c
            {
                a aVar2 = null;
            }

            @Override // j.d.d.v
            public Number a(j.d.d.b0.a aVar2) throws IOException {
                String strL0 = aVar2.l0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strL0));
                    } catch (NumberFormatException e2) {
                        throw new o("Cannot parse " + strL0 + "; at path " + aVar2.Y(), e2);
                    }
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strL0);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || aVar2.a0()) {
                        return dValueOf;
                    }
                    throw new j.d.d.b0.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar2.Y());
                }
            }
        };
        c = uVar2;
        u uVar3 = new u("BIG_DECIMAL", 3) { // from class: j.d.d.u.d
            {
                a aVar2 = null;
            }

            @Override // j.d.d.v
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public BigDecimal a(j.d.d.b0.a aVar2) throws IOException {
                String strL0 = aVar2.l0();
                try {
                    return new BigDecimal(strL0);
                } catch (NumberFormatException e2) {
                    throw new o("Cannot parse " + strL0 + "; at path " + aVar2.Y(), e2);
                }
            }
        };
        d = uVar3;
        e = new u[]{aVar, uVar, uVar2, uVar3};
    }

    private u(String str, int i2) {
        super(str, i2);
    }

    /* synthetic */ u(String str, int i2, a aVar) {
        this(str, i2);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) e.clone();
    }
}
