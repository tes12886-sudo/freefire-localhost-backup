package h.p.a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.k;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import h.f.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
class b extends h.p.a.a {
    static boolean c;
    private final k a;
    private final c b;

    public static class a<D> extends p<D> implements h.p.b.b.InterfaceC0209b<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f1832l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f1833m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final h.p.b.b<D> f1834n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private k f1835o;
        private C0207b<D> p;
        private h.p.b.b<D> q;

        a(int i2, Bundle bundle, h.p.b.b<D> bVar, h.p.b.b<D> bVar2) {
            this.f1832l = i2;
            this.f1833m = bundle;
            this.f1834n = bVar;
            this.q = bVar2;
            bVar.q(i2, this);
        }

        @Override // h.p.b.b.InterfaceC0209b
        public void a(h.p.b.b<D> bVar, D d) {
            if (b.c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(d);
                return;
            }
            if (b.c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(d);
        }

        @Override // androidx.lifecycle.LiveData
        protected void j() {
            if (b.c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f1834n.t();
        }

        @Override // androidx.lifecycle.LiveData
        protected void k() {
            if (b.c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f1834n.u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void m(q<? super D> qVar) {
            super.m(qVar);
            this.f1835o = null;
            this.p = null;
        }

        @Override // androidx.lifecycle.p, androidx.lifecycle.LiveData
        public void n(D d) {
            super.n(d);
            h.p.b.b<D> bVar = this.q;
            if (bVar != null) {
                bVar.r();
                this.q = null;
            }
        }

        h.p.b.b<D> o(boolean z) {
            if (b.c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f1834n.b();
            this.f1834n.a();
            C0207b<D> c0207b = this.p;
            if (c0207b != null) {
                m(c0207b);
                if (z) {
                    c0207b.d();
                }
            }
            this.f1834n.v(this);
            if ((c0207b == null || c0207b.c()) && !z) {
                return this.f1834n;
            }
            this.f1834n.r();
            return this.q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f1832l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f1833m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f1834n);
            this.f1834n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.p);
                this.p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        h.p.b.b<D> q() {
            return this.f1834n;
        }

        void r() {
            k kVar = this.f1835o;
            C0207b<D> c0207b = this.p;
            if (kVar == null || c0207b == null) {
                return;
            }
            super.m(c0207b);
            h(kVar, c0207b);
        }

        h.p.b.b<D> s(k kVar, h.p.a.a.InterfaceC0206a<D> interfaceC0206a) {
            C0207b<D> c0207b = new C0207b<>(this.f1834n, interfaceC0206a);
            h(kVar, c0207b);
            C0207b<D> c0207b2 = this.p;
            if (c0207b2 != null) {
                m(c0207b2);
            }
            this.f1835o = kVar;
            this.p = c0207b;
            return this.f1834n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f1832l);
            sb.append(" : ");
            h.h.k.b.a(this.f1834n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: h.p.a.b$b, reason: collision with other inner class name */
    static class C0207b<D> implements q<D> {
        private final h.p.b.b<D> a;
        private final h.p.a.a.InterfaceC0206a<D> b;
        private boolean c = false;

        C0207b(h.p.b.b<D> bVar, h.p.a.a.InterfaceC0206a<D> interfaceC0206a) {
            this.a = bVar;
            this.b = interfaceC0206a;
        }

        @Override // androidx.lifecycle.q
        public void a(D d) {
            if (b.c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + this.a.d(d));
            }
            this.b.a(this.a, d);
            this.c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        boolean c() {
            return this.c;
        }

        void d() {
            if (this.c) {
                if (b.c) {
                    Log.v("LoaderManager", "  Resetting: " + this.a);
                }
                this.b.c(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    static class c extends v {
        private static final w.a d = new a();
        private h<a> b = new h<>();
        private boolean c = false;

        static class a implements w.a {
            a() {
            }

            @Override // androidx.lifecycle.w.a
            public <T extends v> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(x xVar) {
            return (c) new w(xVar, d).a(c.class);
        }

        @Override // androidx.lifecycle.v
        protected void d() {
            super.d();
            int iN = this.b.n();
            for (int i2 = 0; i2 < iN; i2++) {
                this.b.o(i2).o(true);
            }
            this.b.d();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.b.n(); i2++) {
                    a aVarO = this.b.o(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.b.k(i2));
                    printWriter.print(": ");
                    printWriter.println(aVarO.toString());
                    aVarO.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            this.c = false;
        }

        <D> a<D> h(int i2) {
            return this.b.h(i2);
        }

        boolean i() {
            return this.c;
        }

        void j() {
            int iN = this.b.n();
            for (int i2 = 0; i2 < iN; i2++) {
                this.b.o(i2).r();
            }
        }

        void k(int i2, a aVar) {
            this.b.m(i2, aVar);
        }

        void l() {
            this.c = true;
        }
    }

    b(k kVar, x xVar) {
        this.a = kVar;
        this.b = c.g(xVar);
    }

    private <D> h.p.b.b<D> e(int i2, Bundle bundle, h.p.a.a.InterfaceC0206a<D> interfaceC0206a, h.p.b.b<D> bVar) {
        try {
            this.b.l();
            h.p.b.b<D> bVarB = interfaceC0206a.b(i2, bundle);
            if (bVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarB.getClass().isMemberClass() && !Modifier.isStatic(bVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarB);
            }
            a aVar = new a(i2, bundle, bVarB, bVar);
            if (c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.b.k(i2, aVar);
            this.b.f();
            return aVar.s(this.a, interfaceC0206a);
        } catch (Throwable th) {
            this.b.f();
            throw th;
        }
    }

    @Override // h.p.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // h.p.a.a
    public <D> h.p.b.b<D> c(int i2, Bundle bundle, h.p.a.a.InterfaceC0206a<D> interfaceC0206a) {
        if (this.b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarH = this.b.h(i2);
        if (c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarH == null) {
            return e(i2, bundle, interfaceC0206a, null);
        }
        if (c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarH);
        }
        return aVarH.s(this.a, interfaceC0206a);
    }

    @Override // h.p.a.a
    public void d() {
        this.b.j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        h.h.k.b.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
