package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
class j {
    private final CheckedTextView a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    j(CheckedTextView checkedTextView) {
        this.a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.a);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.p(drawableA).mutate();
                if (this.d) {
                    androidx.core.graphics.drawable.a.n(drawableMutate, this.b);
                }
                if (this.e) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.a.getDrawableState());
                }
                this.a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.b;
    }

    PorterDuff.Mode c() {
        return this.c;
    }

    void d(AttributeSet attributeSet, int i2) {
        boolean z;
        int iM;
        int iM2;
        Context context = this.a.getContext();
        int[] iArr = h.b.j.M0;
        a1 a1VarU = a1.u(context, attributeSet, iArr, i2, 0);
        CheckedTextView checkedTextView = this.a;
        h.h.l.y.L(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, a1VarU.q(), i2, 0);
        try {
            int i3 = h.b.j.O0;
            if (!a1VarU.r(i3) || (iM2 = a1VarU.m(i3, 0)) == 0) {
                z = false;
            } else {
                try {
                    CheckedTextView checkedTextView2 = this.a;
                    checkedTextView2.setCheckMarkDrawable(h.b.k.a.a.b(checkedTextView2.getContext(), iM2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z) {
                int i4 = h.b.j.N0;
                if (a1VarU.r(i4) && (iM = a1VarU.m(i4, 0)) != 0) {
                    CheckedTextView checkedTextView3 = this.a;
                    checkedTextView3.setCheckMarkDrawable(h.b.k.a.a.b(checkedTextView3.getContext(), iM));
                }
            }
            int i5 = h.b.j.P0;
            if (a1VarU.r(i5)) {
                androidx.core.widget.c.b(this.a, a1VarU.c(i5));
            }
            int i6 = h.b.j.Q0;
            if (a1VarU.r(i6)) {
                androidx.core.widget.c.c(this.a, i0.d(a1VarU.j(i6, -1), null));
            }
        } finally {
            a1VarU.v();
        }
    }

    void e() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
