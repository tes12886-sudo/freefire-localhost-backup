package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class h extends CheckBox implements androidx.core.widget.m, h.h.l.x {
    private final k a;
    private final f b;
    private final c0 c;
    private o d;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.r);
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(x0.b(context), attributeSet, i2);
        v0.a(this, getContext());
        k kVar = new k(this);
        this.a = kVar;
        kVar.e(attributeSet, i2);
        f fVar = new f(this);
        this.b = fVar;
        fVar.e(attributeSet, i2);
        c0 c0Var = new c0(this);
        this.c = c0Var;
        c0Var.m(attributeSet, i2);
        getEmojiTextViewHelper().b(attributeSet, i2);
    }

    private o getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new o(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.b;
        if (fVar != null) {
            fVar.b();
        }
        c0 c0Var = this.c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        k kVar = this.a;
        return kVar != null ? kVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // h.h.l.x
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // h.h.l.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        k kVar = this.a;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        k kVar = this.a;
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        f fVar = this.b;
        if (fVar != null) {
            fVar.g(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(h.b.k.a.a.b(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        k kVar = this.a;
        if (kVar != null) {
            kVar.f();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // h.h.l.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // h.h.l.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        k kVar = this.a;
        if (kVar != null) {
            kVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        k kVar = this.a;
        if (kVar != null) {
            kVar.h(mode);
        }
    }
}
