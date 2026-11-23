package h.b.n;

import android.view.View;
import android.view.animation.Interpolator;
import h.h.l.c0;
import h.h.l.d0;
import h.h.l.e0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private Interpolator c;
    d0 d;
    private boolean e;
    private long b = -1;
    private final e0 f = new a();
    final ArrayList<c0> a = new ArrayList<>();

    class a extends e0 {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        @Override // h.h.l.d0
        public void b(View view) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == h.this.a.size()) {
                d0 d0Var = h.this.d;
                if (d0Var != null) {
                    d0Var.b(null);
                }
                d();
            }
        }

        @Override // h.h.l.e0, h.h.l.d0
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            d0 d0Var = h.this.d;
            if (d0Var != null) {
                d0Var.c(null);
            }
        }

        void d() {
            this.b = 0;
            this.a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator<c0> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    void b() {
        this.e = false;
    }

    public h c(c0 c0Var) {
        if (!this.e) {
            this.a.add(c0Var);
        }
        return this;
    }

    public h d(c0 c0Var, c0 c0Var2) {
        this.a.add(c0Var);
        c0Var2.h(c0Var.c());
        this.a.add(c0Var2);
        return this;
    }

    public h e(long j2) {
        if (!this.e) {
            this.b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public h g(d0 d0Var) {
        if (!this.e) {
            this.d = d0Var;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        for (c0 c0Var : this.a) {
            long j2 = this.b;
            if (j2 >= 0) {
                c0Var.d(j2);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                c0Var.e(interpolator);
            }
            if (this.d != null) {
                c0Var.f(this.f);
            }
            c0Var.j();
        }
        this.e = true;
    }
}
