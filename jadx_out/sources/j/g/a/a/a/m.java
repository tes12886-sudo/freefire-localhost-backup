package j.g.a.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class m {
    static final h f = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    static volatile m f2149g;
    private final Context a;
    private final ExecutorService b;
    private final p c;
    private final j.g.a.a.a.y.a d;
    private final h e;

    private m(s sVar) {
        Context context = sVar.a;
        this.a = context;
        this.d = new j.g.a.a.a.y.a(context);
        p pVar = sVar.c;
        if (pVar == null) {
            this.c = new p(j.g.a.a.a.y.b.c(context, "com.twitter.sdk.android.CONSUMER_KEY", ""), j.g.a.a.a.y.b.c(context, "com.twitter.sdk.android.CONSUMER_SECRET", ""));
        } else {
            this.c = pVar;
        }
        ExecutorService executorService = sVar.d;
        this.b = executorService == null ? j.g.a.a.a.y.c.c("twitter-worker") : executorService;
        h hVar = sVar.b;
        this.e = hVar == null ? f : hVar;
        Boolean bool = sVar.e;
        if (bool == null) {
            return;
        }
        bool.booleanValue();
    }

    static void a() {
        if (f2149g == null) {
            throw new IllegalStateException("Must initialize Twitter before using getInstance()");
        }
    }

    static synchronized m b(s sVar) {
        if (f2149g != null) {
            return f2149g;
        }
        f2149g = new m(sVar);
        return f2149g;
    }

    public static m f() {
        a();
        return f2149g;
    }

    public static h g() {
        return f2149g == null ? f : f2149g.e;
    }

    public static void i(s sVar) {
        b(sVar);
    }

    public j.g.a.a.a.y.a c() {
        return this.d;
    }

    public Context d(String str) {
        return new t(this.a, str, ".TwitterKit" + File.separator + str);
    }

    public ExecutorService e() {
        return this.b;
    }

    public p h() {
        return this.c;
    }
}
