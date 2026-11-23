package j.c.a.e.f.k;

/* JADX INFO: loaded from: classes.dex */
public class a extends Exception {
    private final String a;

    public a(Exception exc, String str) {
        super(exc);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.a;
    }
}
