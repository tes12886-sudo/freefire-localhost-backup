package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
class z extends u {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f270i;

    z(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.f268g = null;
        this.f269h = false;
        this.f270i = false;
        this.d = seekBar;
    }

    private void f() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.f269h || this.f270i) {
                Drawable drawableP = androidx.core.graphics.drawable.a.p(drawable.mutate());
                this.e = drawableP;
                if (this.f269h) {
                    androidx.core.graphics.drawable.a.n(drawableP, this.f);
                }
                if (this.f270i) {
                    androidx.core.graphics.drawable.a.o(this.e, this.f268g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.u
    void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        Context context = this.d.getContext();
        int[] iArr = h.b.j.Q;
        a1 a1VarU = a1.u(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.d;
        h.h.l.y.L(seekBar, seekBar.getContext(), iArr, attributeSet, a1VarU.q(), i2, 0);
        Drawable drawableG = a1VarU.g(h.b.j.R);
        if (drawableG != null) {
            this.d.setThumb(drawableG);
        }
        j(a1VarU.f(h.b.j.S));
        int i3 = h.b.j.U;
        if (a1VarU.r(i3)) {
            this.f268g = i0.d(a1VarU.j(i3, -1), this.f268g);
            this.f270i = true;
        }
        int i4 = h.b.j.T;
        if (a1VarU.r(i4)) {
            this.f = a1VarU.c(i4);
            this.f269h = true;
        }
        a1VarU.v();
        f();
    }

    void g(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            androidx.core.graphics.drawable.a.l(drawable, h.h.l.y.q(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }
}
