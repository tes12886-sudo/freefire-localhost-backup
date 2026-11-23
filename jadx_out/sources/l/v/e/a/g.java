package l.v.e.a;

import java.lang.reflect.Method;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
final class g {
    public static final g a = new g();
    private static final a b = new a(null, null, null);
    private static a c;

    private static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    private g() {
    }

    private final a a(l.v.e.a.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = b;
            c = aVar3;
            return aVar3;
        }
    }

    public final String b(l.v.e.a.a aVar) {
        i.e(aVar, "continuation");
        a aVarA = c;
        if (aVarA == null) {
            aVarA = a(aVar);
        }
        if (aVarA == b) {
            return null;
        }
        Method method = aVarA.a;
        Object objInvoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
