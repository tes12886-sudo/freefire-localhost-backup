package l.y.c;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public l.b0.a a(Class cls) {
        return new d(cls);
    }

    public String b(g gVar) {
        String string = gVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String c(j jVar) {
        return b(jVar);
    }
}
