package l.w;

import java.lang.reflect.Method;
import l.t.d;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: l.w.a$a, reason: collision with other inner class name */
    private static final class C0258a {
        public static final Method a;

        /* JADX WARN: Code duplicated, block: B:9:0x0033  */
        static {
            Method method;
            boolean z;
            Method[] methods = Throwable.class.getMethods();
            i.d(methods, "throwableMethods");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (i.a(method.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    i.d(parameterTypes, "it.parameterTypes");
                    if (i.a(d.q(parameterTypes), Throwable.class)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    break;
                } else {
                    i2++;
                }
            }
            a = method;
            int length2 = methods.length;
            for (int i3 = 0; i3 < length2 && !i.a(methods[i3].getName(), "getSuppressed"); i3++) {
            }
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, "exception");
        Method method = C0258a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public l.z.c b() {
        return new l.z.b();
    }
}
