package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class w {
    private final a a;
    private final x b;

    public interface a {
        <T extends v> T a(Class<T> cls);
    }

    static abstract class b extends c implements a {
        b() {
        }

        @Override // androidx.lifecycle.w.a
        public <T extends v> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends v> T c(String str, Class<T> cls);
    }

    static class c {
        c() {
        }

        void b(v vVar) {
        }
    }

    public w(x xVar, a aVar) {
        this.a = aVar;
        this.b = xVar;
    }

    public <T extends v> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T extends v> T b(String str, Class<T> cls) {
        T t = (T) this.b.b(str);
        if (cls.isInstance(t)) {
            Object obj = this.a;
            if (obj instanceof c) {
                ((c) obj).b(t);
            }
            return t;
        }
        a aVar = this.a;
        T t2 = aVar instanceof b ? (T) ((b) aVar).c(str, cls) : (T) aVar.a(cls);
        this.b.d(str, t2);
        return t2;
    }
}
