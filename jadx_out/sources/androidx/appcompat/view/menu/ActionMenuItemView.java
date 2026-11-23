package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.l0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends d0 implements n.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    i f69g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f70h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f71i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g.b f72j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l0 f73k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    b f74l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f75m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f76n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f77o;
    private int p;
    private int q;

    private class a extends l0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.l0
        public p b() {
            b bVar = ActionMenuItemView.this.f74l;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.l0
        protected boolean c() {
            p pVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f72j;
            return bVar != null && bVar.a(actionMenuItemView.f69g) && (pVarB = b()) != null && pVarB.b();
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f75m = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.b.j.v, i2, 0);
        this.f77o = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.b.j.w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.p = -1;
        setSaveEnabled(false);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f70h);
        if (this.f71i != null && (!this.f69g.B() || (!this.f75m && !this.f76n))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f70h : null);
        CharSequence contentDescription = this.f69g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f69g.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f69g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            c1.a(this, z3 ? null : this.f69g.getTitle());
        } else {
            c1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean a() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return f() && this.f69g.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void d(i iVar, int i2) {
        this.f69g = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f73k == null) {
            this.f73k = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f69g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f72j;
        if (bVar != null) {
            bVar.a(this.f69g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f75m = g();
        h();
    }

    @Override // androidx.appcompat.widget.d0, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        boolean zF = f();
        if (zF && (i4 = this.p) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f77o) : this.f77o;
        if (mode != 1073741824 && this.f77o > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (zF || this.f71i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f71i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l0 l0Var;
        if (this.f69g.hasSubMenu() && (l0Var = this.f73k) != null && l0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f76n != z) {
            this.f76n = z;
            i iVar = this.f69g;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f71i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.q;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(g.b bVar) {
        this.f72j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.p = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f74l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f70h = charSequence;
        h();
    }
}
