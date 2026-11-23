package h.p.b;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class b<D> {
    int a;
    InterfaceC0209b<D> b;
    a<D> c;
    boolean d = false;
    boolean e = false;
    boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f1845g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f1846h = false;

    public interface a<D> {
        void a(b<D> bVar);
    }

    /* JADX INFO: renamed from: h.p.b.b$b, reason: collision with other inner class name */
    public interface InterfaceC0209b<D> {
        void a(b<D> bVar, D d);
    }

    public b(Context context) {
        context.getApplicationContext();
    }

    public void a() {
        this.e = true;
        j();
    }

    public boolean b() {
        return k();
    }

    public void c() {
        this.f1846h = false;
    }

    public String d(D d) {
        StringBuilder sb = new StringBuilder(64);
        h.h.k.b.a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public void e() {
        a<D> aVar = this.c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void f(D d) {
        InterfaceC0209b<D> interfaceC0209b = this.b;
        if (interfaceC0209b != null) {
            interfaceC0209b.a(this, d);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.d || this.f1845g || this.f1846h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f1845g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f1846h);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
    }

    public void h() {
        m();
    }

    public boolean i() {
        return this.e;
    }

    protected void j() {
    }

    protected boolean k() {
        throw null;
    }

    public void l() {
        if (this.d) {
            h();
        } else {
            this.f1845g = true;
        }
    }

    protected void m() {
    }

    protected void n() {
    }

    protected void o() {
        throw null;
    }

    protected void p() {
    }

    public void q(int i2, InterfaceC0209b<D> interfaceC0209b) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = interfaceC0209b;
        this.a = i2;
    }

    public void r() {
        n();
        this.f = true;
        this.d = false;
        this.e = false;
        this.f1845g = false;
        this.f1846h = false;
    }

    public void s() {
        if (this.f1846h) {
            l();
        }
    }

    public final void t() {
        this.d = true;
        this.f = false;
        this.e = false;
        o();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        h.h.k.b.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        this.d = false;
        p();
    }

    public void v(InterfaceC0209b<D> interfaceC0209b) {
        InterfaceC0209b<D> interfaceC0209b2 = this.b;
        if (interfaceC0209b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0209b2 != interfaceC0209b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }
}
