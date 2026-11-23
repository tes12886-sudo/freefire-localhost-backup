package h.p.a;

import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: h.p.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0206a<D> {
        void a(h.p.b.b<D> bVar, D d);

        h.p.b.b<D> b(int i2, Bundle bundle);

        void c(h.p.b.b<D> bVar);
    }

    public static <T extends k & y> a b(T t) {
        return new b(t, t.j());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> h.p.b.b<D> c(int i2, Bundle bundle, InterfaceC0206a<D> interfaceC0206a);

    public abstract void d();
}
