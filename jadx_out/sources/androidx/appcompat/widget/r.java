package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class r {
    private final ImageView a;
    private y0 b;
    private y0 c;
    private y0 d;
    private int e = 0;

    public r(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new y0();
        }
        y0 y0Var = this.d;
        y0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.f.a(this.a);
        if (colorStateListA != null) {
            y0Var.d = true;
            y0Var.a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.f.b(this.a);
        if (modeB != null) {
            y0Var.c = true;
            y0Var.b = modeB;
        }
        if (!y0Var.d && !y0Var.c) {
            return false;
        }
        l.i(drawable, y0Var, this.a.getDrawableState());
        return true;
    }

    private boolean l() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 21) {
            return this.b != null;
        }
        return i2 == 21;
    }

    void b() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            i0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            y0 y0Var = this.c;
            if (y0Var != null) {
                l.i(drawable, y0Var, this.a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.b;
            if (y0Var2 != null) {
                l.i(drawable, y0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        y0 y0Var = this.c;
        if (y0Var != null) {
            return y0Var.a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        y0 y0Var = this.c;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    boolean f() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i2) {
        int iM;
        Context context = this.a.getContext();
        int[] iArr = h.b.j.M;
        a1 a1VarU = a1.u(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.a;
        h.h.l.y.L(imageView, imageView.getContext(), iArr, attributeSet, a1VarU.q(), i2, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (iM = a1VarU.m(h.b.j.N, -1)) != -1 && (drawable = h.b.k.a.a.b(this.a.getContext(), iM)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                i0.b(drawable);
            }
            int i3 = h.b.j.O;
            if (a1VarU.r(i3)) {
                androidx.core.widget.f.c(this.a, a1VarU.c(i3));
            }
            int i4 = h.b.j.P;
            if (a1VarU.r(i4)) {
                androidx.core.widget.f.d(this.a, i0.d(a1VarU.j(i4, -1), null));
            }
        } finally {
            a1VarU.v();
        }
    }

    void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i2) {
        if (i2 != 0) {
            Drawable drawableB = h.b.k.a.a.b(this.a.getContext(), i2);
            if (drawableB != null) {
                i0.b(drawableB);
            }
            this.a.setImageDrawable(drawableB);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new y0();
        }
        y0 y0Var = this.c;
        y0Var.a = colorStateList;
        y0Var.d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new y0();
        }
        y0 y0Var = this.c;
        y0Var.b = mode;
        y0Var.c = true;
        c();
    }
}
