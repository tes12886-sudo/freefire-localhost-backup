package l.v.e.a;

import java.lang.reflect.Field;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final void a(int i2, int i3) {
        if (i3 <= i2) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i2 + ", got " + i3 + ". Please update the Kotlin standard library.").toString());
    }

    private static final d b(a aVar) {
        return (d) aVar.getClass().getAnnotation(d.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) {
        String strC;
        i.e(aVar, "<this>");
        d dVarB = b(aVar);
        if (dVarB == null) {
            return null;
        }
        a(1, dVarB.v());
        int iC = c(aVar);
        int i2 = iC < 0 ? -1 : dVarB.l()[iC];
        String strB = g.a.b(aVar);
        if (strB == null) {
            strC = dVarB.c();
        } else {
            strC = strB + '/' + dVarB.c();
        }
        return new StackTraceElement(strC, dVarB.m(), dVarB.f(), i2);
    }
}
