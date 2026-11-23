package j.g.a.a.a.y.k;

import android.annotation.SuppressLint;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<T>] */
/* JADX INFO: loaded from: classes.dex */
public class c<T> {
    private final a a;
    private final d<T> b;
    private final String c;

    public c(a aVar, d<T> dVar, String str) {
        this.a = aVar;
        this.b = dVar;
        this.c = str;
    }

    public T a() {
        return this.b.a(this.a.get().getString(this.c, null));
    }

    @SuppressLint({"CommitPrefEdits"})
    public void b(T t) {
        a aVar = this.a;
        aVar.b(aVar.a().putString(this.c, this.b.b(t)));
    }
}
