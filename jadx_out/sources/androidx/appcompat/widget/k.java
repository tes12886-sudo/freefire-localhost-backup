package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
class k {
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    k(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.d.a(this.a);
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
                this.a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i2) {
        Drawable drawableA;
        return (Build.VERSION.SDK_INT >= 17 || (drawableA = androidx.core.widget.d.a(this.a)) == null) ? i2 : i2 + drawableA.getIntrinsicWidth();
    }

    ColorStateList c() {
        return this.b;
    }

    PorterDuff.Mode d() {
        return this.c;
    }

    void e(AttributeSet attributeSet, int i2) {
        boolean z;
        int iM;
        int iM2;
        Context context = this.a.getContext();
        int[] iArr = h.b.j.R0;
        a1 a1VarU = a1.u(context, attributeSet, iArr, i2, 0);
        CompoundButton compoundButton = this.a;
        h.h.l.y.L(compoundButton, compoundButton.getContext(), iArr, attributeSet, a1VarU.q(), i2, 0);
        try {
            int i3 = h.b.j.T0;
            if (!a1VarU.r(i3) || (iM2 = a1VarU.m(i3, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.a;
                    compoundButton2.setButtonDrawable(h.b.k.a.a.b(compoundButton2.getContext(), iM2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z) {
                int i4 = h.b.j.S0;
                if (a1VarU.r(i4) && (iM = a1VarU.m(i4, 0)) != 0) {
                    CompoundButton compoundButton3 = this.a;
                    compoundButton3.setButtonDrawable(h.b.k.a.a.b(compoundButton3.getContext(), iM));
                }
            }
            int i5 = h.b.j.U0;
            if (a1VarU.r(i5)) {
                androidx.core.widget.d.b(this.a, a1VarU.c(i5));
            }
            int i6 = h.b.j.V0;
            if (a1VarU.r(i6)) {
                androidx.core.widget.d.c(this.a, i0.d(a1VarU.j(i6, -1), null));
            }
        } finally {
            a1VarU.v();
        }
    }

    void f() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
