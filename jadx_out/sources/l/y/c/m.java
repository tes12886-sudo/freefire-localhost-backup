package l.y.c;

/* JADX INFO: loaded from: classes.dex */
public class m {
    private static final n a;
    private static final l.b0.a[] b;

    static {
        n nVar = null;
        try {
            nVar = (n) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (nVar == null) {
            nVar = new n();
        }
        a = nVar;
        b = new l.b0.a[0];
    }

    public static l.b0.a a(Class cls) {
        return a.a(cls);
    }

    public static String b(j jVar) {
        return a.c(jVar);
    }
}
