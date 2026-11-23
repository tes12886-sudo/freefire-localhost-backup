package o;

/* JADX INFO: loaded from: classes.dex */
public class j extends RuntimeException {
    public j(t<?> tVar) {
        super(a(tVar));
        tVar.b();
        tVar.g();
    }

    private static String a(t<?> tVar) {
        defpackage.e.a(tVar, "response == null");
        return "HTTP " + tVar.b() + " " + tVar.g();
    }
}
