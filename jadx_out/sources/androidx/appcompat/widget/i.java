package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class i extends CheckedTextView implements androidx.core.widget.l, h.h.l.x {
    private final j a;
    private final f b;
    private final c0 c;
    private o d;

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.s);
    }

    public i(Context context, AttributeSet attributeSet, int i2) {
        super(x0.b(context), attributeSet, i2);
        v0.a(this, getContext());
        c0 c0Var = new c0(this);
        this.c = c0Var;
        c0Var.m(attributeSet, i2);
        c0Var.b();
        f fVar = new f(this);
        this.b = fVar;
        fVar.e(attributeSet, i2);
        j jVar = new j(this);
        this.a = jVar;
        jVar.d(attributeSet, i2);
        getEmojiTextViewHelper().b(attributeSet, i2);
    }

    private o getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new o(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        c0 c0Var = this.c;
        if (c0Var != null) {
            c0Var.b();
        }
        f fVar = this.b;
        if (fVar != null) {
            fVar.b();
        }
        j jVar = this.a;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.m(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(h.b.k.a.a.b(getContext(), i2));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        j jVar = this.a;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    @Override // androidx.core.widget.l
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        j jVar = this.a;
        if (jVar != null) {
            jVar.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        j jVar = this.a;
        if (jVar != null) {
            jVar.g(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        c0 c0Var = this.c;
        if (c0Var != null) {
            c0Var.q(context, i2);
        }
    }
}
