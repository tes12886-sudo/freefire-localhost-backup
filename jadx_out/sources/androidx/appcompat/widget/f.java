package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class f {
    private final View a;
    private y0 d;
    private y0 e;
    private y0 f;
    private int c = -1;
    private final l b = l.b();

    f(View view) {
        this.a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new y0();
        }
        y0 y0Var = this.f;
        y0Var.a();
        ColorStateList colorStateListM = h.h.l.y.m(this.a);
        if (colorStateListM != null) {
            y0Var.d = true;
            y0Var.a = colorStateListM;
        }
        PorterDuff.Mode modeN = h.h.l.y.n(this.a);
        if (modeN != null) {
            y0Var.c = true;
            y0Var.b = modeN;
        }
        if (!y0Var.d && !y0Var.c) {
            return false;
        }
        l.i(drawable, y0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 21) {
            return this.d != null;
        }
        return i2 == 21;
    }

    void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            y0 y0Var = this.e;
            if (y0Var != null) {
                l.i(background, y0Var, this.a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.d;
            if (y0Var2 != null) {
                l.i(background, y0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        y0 y0Var = this.e;
        if (y0Var != null) {
            return y0Var.a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        y0 y0Var = this.e;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i2) {
        Context context = this.a.getContext();
        int[] iArr = h.b.j.r3;
        a1 a1VarU = a1.u(context, attributeSet, iArr, i2, 0);
        View view = this.a;
        h.h.l.y.L(view, view.getContext(), iArr, attributeSet, a1VarU.q(), i2, 0);
        try {
            int i3 = h.b.j.s3;
            if (a1VarU.r(i3)) {
                this.c = a1VarU.m(i3, -1);
                ColorStateList colorStateListF = this.b.f(this.a.getContext(), this.c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i4 = h.b.j.t3;
            if (a1VarU.r(i4)) {
                h.h.l.y.R(this.a, a1VarU.c(i4));
            }
            int i5 = h.b.j.u3;
            if (a1VarU.r(i5)) {
                h.h.l.y.S(this.a, i0.d(a1VarU.j(i5, -1), null));
            }
        } finally {
            a1VarU.v();
        }
    }

    void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    void g(int i2) {
        this.c = i2;
        l lVar = this.b;
        h(lVar != null ? lVar.f(this.a.getContext(), i2) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new y0();
            }
            y0 y0Var = this.d;
            y0Var.a = colorStateList;
            y0Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new y0();
        }
        y0 y0Var = this.e;
        y0Var.a = colorStateList;
        y0Var.d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new y0();
        }
        y0 y0Var = this.e;
        y0Var.b = mode;
        y0Var.c = true;
        b();
    }
}
