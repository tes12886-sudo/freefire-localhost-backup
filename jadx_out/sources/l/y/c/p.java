package l.y.c;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p {
    public static List a(Object obj) {
        if (!(obj instanceof l.y.c.q.a)) {
            return c(obj);
        }
        g(obj, "kotlin.collections.MutableList");
        throw null;
    }

    public static Map b(Object obj) {
        if (!(obj instanceof l.y.c.q.a)) {
            return d(obj);
        }
        g(obj, "kotlin.collections.MutableMap");
        throw null;
    }

    public static List c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            f(e);
            throw null;
        }
    }

    public static Map d(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            f(e);
            throw null;
        }
    }

    private static <T extends Throwable> T e(T t) {
        i.j(t, p.class.getName());
        return t;
    }

    public static ClassCastException f(ClassCastException classCastException) {
        e(classCastException);
        throw classCastException;
    }

    public static void g(Object obj, String str) {
        h((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        throw null;
    }

    public static void h(String str) {
        f(new ClassCastException(str));
        throw null;
    }
}
