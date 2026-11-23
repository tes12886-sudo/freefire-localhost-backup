package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinearLayout f153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f154o;
    private TextView p;
    private int q;
    private int r;
    private boolean s;
    private int t;

    class a implements View.OnClickListener {
        final /* synthetic */ h.b.n.b a;

        a(ActionBarContextView actionBarContextView, h.b.n.b bVar) {
            this.a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.f1670j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a1 a1VarU = a1.u(context, attributeSet, h.b.j.x, i2, 0);
        h.h.l.y.Q(this, a1VarU.f(h.b.j.y));
        this.q = a1VarU.m(h.b.j.C, 0);
        this.r = a1VarU.m(h.b.j.B, 0);
        this.e = a1VarU.l(h.b.j.A, 0);
        this.t = a1VarU.m(h.b.j.z, h.b.g.d);
        a1VarU.v();
    }

    private void i() {
        if (this.f153n == null) {
            LayoutInflater.from(getContext()).inflate(h.b.g.a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f153n = linearLayout;
            this.f154o = (TextView) linearLayout.findViewById(h.b.f.e);
            this.p = (TextView) this.f153n.findViewById(h.b.f.d);
            if (this.q != 0) {
                this.f154o.setTextAppearance(getContext(), this.q);
            }
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
        }
        this.f154o.setText(this.f148i);
        this.p.setText(this.f149j);
        boolean z = !TextUtils.isEmpty(this.f148i);
        boolean z2 = !TextUtils.isEmpty(this.f149j);
        int i2 = 0;
        this.p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f153n;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f153n.getParent() == null) {
            addView(this.f153n);
        }
    }

    public void g() {
        if (this.f150k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f149j;
    }

    public CharSequence getTitle() {
        return this.f148i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    public void h(h.b.n.b bVar) {
        View viewInflate;
        d dVar;
        View view = this.f150k;
        if (view != null) {
            if (view.getParent() == null) {
                viewInflate = this.f150k;
            }
            View viewFindViewById = this.f150k.findViewById(h.b.f.f1698i);
            this.f151l = viewFindViewById;
            viewFindViewById.setOnClickListener(new a(this, bVar));
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
            dVar = this.d;
            if (dVar != null) {
                dVar.y();
            }
            d dVar2 = new d(getContext());
            this.d = dVar2;
            dVar2.J(true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            gVar.c(this.d, this.b);
            ActionMenuView actionMenuView = (ActionMenuView) this.d.o(this);
            this.c = actionMenuView;
            h.h.l.y.Q(actionMenuView, null);
            addView(this.c, layoutParams);
        }
        viewInflate = LayoutInflater.from(getContext()).inflate(this.t, (ViewGroup) this, false);
        this.f150k = viewInflate;
        addView(viewInflate);
        View viewFindViewById2 = this.f150k.findViewById(h.b.f.f1698i);
        this.f151l = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new a(this, bVar));
        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) bVar.e();
        dVar = this.d;
        if (dVar != null) {
            dVar.y();
        }
        d dVar3 = new d(getContext());
        this.d = dVar3;
        dVar3.J(true);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        gVar2.c(this.d, this.b);
        ActionMenuView actionMenuView2 = (ActionMenuView) this.d.o(this);
        this.c = actionMenuView2;
        h.h.l.y.Q(actionMenuView2, null);
        addView(this.c, layoutParams2);
    }

    public boolean j() {
        return this.s;
    }

    public void k() {
        removeAllViews();
        this.f152m = null;
        this.c = null;
        this.d = null;
        View view = this.f151l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        d dVar = this.d;
        if (dVar != null) {
            return dVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVar = this.d;
        if (dVar != null) {
            dVar.B();
            this.d.C();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean zB = g1.b(this);
        int paddingRight = zB ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f150k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f150k.getLayoutParams();
            int i6 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = b.d(paddingRight, i6, zB);
            paddingRight = b.d(iD + e(this.f150k, iD, paddingTop, paddingTop2, zB), i7, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f153n;
        if (linearLayout != null && this.f152m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f153n, iE, paddingTop, paddingTop2, zB);
        }
        int i8 = iE;
        View view2 = this.f152m;
        if (view2 != null) {
            e(view2, i8, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f150k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f150k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f153n;
        if (linearLayout != null && this.f152m == null) {
            if (this.s) {
                this.f153n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f153n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f153n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f152m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f152m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // androidx.appcompat.widget.b
    public void setContentHeight(int i2) {
        this.e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f152m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f152m = view;
        if (view != null && (linearLayout = this.f153n) != null) {
            removeView(linearLayout);
            this.f153n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f149j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f148i = charSequence;
        i();
        h.h.l.y.P(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.s) {
            requestLayout();
        }
        this.s = z;
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
