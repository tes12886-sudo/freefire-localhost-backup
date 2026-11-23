package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements g0, h.h.l.r, h.h.l.p, h.h.l.q {
    static final int[] O = {h.b.a.b, R.attr.windowContentOverlay};
    private h.h.l.g0 F;
    private h.h.l.g0 G;
    private d H;
    private OverScroller I;
    ViewPropertyAnimator J;
    final AnimatorListenerAdapter K;
    private final Runnable L;
    private final Runnable M;
    private final h.h.l.s N;
    private int a;
    private int b;
    private ContentFrameLayout c;
    ActionBarContainer d;
    private h0 e;
    private Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f162n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f163o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private h.h.l.g0 u;
    private h.h.l.g0 v;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.J = null;
            actionBarOverlayLayout.f159k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.J = null;
            actionBarOverlayLayout.f159k = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.J = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.K);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.J = actionBarOverlayLayout.d.animate().translationY(-ActionBarOverlayLayout.this.d.getHeight()).setListener(ActionBarOverlayLayout.this.K);
        }
    }

    public interface d {
        void a();

        void b();

        void c(int i2);

        void d();

        void e(boolean z);

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.f162n = new Rect();
        this.f163o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        h.h.l.g0 g0Var = h.h.l.g0.b;
        this.u = g0Var;
        this.v = g0Var;
        this.F = g0Var;
        this.G = g0Var;
        this.K = new a();
        this.L = new b();
        this.M = new c();
        v(context);
        this.N = new h.h.l.s(this);
    }

    private void A() {
        u();
        this.L.run();
    }

    private boolean B(float f) {
        this.I.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.I.getFinalY() > this.d.getHeight();
    }

    private void p() {
        u();
        this.M.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        e eVar = (e) view.getLayoutParams();
        if (z) {
            int i2 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i3 = rect.left;
            if (i2 != i3) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i3;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (z2) {
            int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i5 = rect.top;
            if (i4 != i5) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i5;
                z5 = true;
            }
        }
        if (z4) {
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i7 = rect.right;
            if (i6 != i7) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i7;
                z5 = true;
            }
        }
        if (z3) {
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i9;
                return true;
            }
        }
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h0 t(View view) {
        if (view instanceof h0) {
            return (h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(O);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f155g = context.getApplicationInfo().targetSdkVersion < 19;
        this.I = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.M, 600L);
    }

    private void y() {
        u();
        postDelayed(this.L, 600L);
    }

    @Override // h.h.l.p
    public void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // androidx.appcompat.widget.g0
    public void b(Menu menu, androidx.appcompat.view.menu.m.a aVar) {
        z();
        this.e.b(menu, aVar);
    }

    @Override // androidx.appcompat.widget.g0
    public boolean c() {
        z();
        return this.e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.g0
    public void d() {
        z();
        this.e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f == null || this.f155g) {
            return;
        }
        int bottom = this.d.getVisibility() == 0 ? (int) (this.d.getBottom() + this.d.getTranslationY() + 0.5f) : 0;
        this.f.setBounds(0, bottom, getWidth(), this.f.getIntrinsicHeight() + bottom);
        this.f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.g0
    public boolean e() {
        z();
        return this.e.e();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean f() {
        z();
        return this.e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean zQ = q(this.d, rect, true, true, false, true);
        this.q.set(rect);
        g1.a(this, this.q, this.f162n);
        if (!this.r.equals(this.q)) {
            this.r.set(this.q);
            zQ = true;
        }
        if (!this.f163o.equals(this.f162n)) {
            this.f163o.set(this.f162n);
            zQ = true;
        }
        if (zQ) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.g0
    public boolean g() {
        z();
        return this.e.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.N.a();
    }

    public CharSequence getTitle() {
        z();
        return this.e.getTitle();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean h() {
        z();
        return this.e.h();
    }

    @Override // h.h.l.p
    public void i(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // h.h.l.p
    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // androidx.appcompat.widget.g0
    public void k(int i2) {
        z();
        if (i2 == 2) {
            this.e.s();
        } else if (i2 == 5) {
            this.e.t();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.g0
    public void l() {
        z();
        this.e.i();
    }

    @Override // h.h.l.q
    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        n(view, i2, i3, i4, i5, i6);
    }

    @Override // h.h.l.p
    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // h.h.l.p
    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        h.h.l.g0 g0VarV = h.h.l.g0.v(windowInsets, this);
        boolean zQ = q(this.d, new Rect(g0VarV.i(), g0VarV.k(), g0VarV.j(), g0VarV.h()), true, true, false, true);
        h.h.l.y.c(this, g0VarV, this.f162n);
        Rect rect = this.f162n;
        h.h.l.g0 g0VarL = g0VarV.l(rect.left, rect.top, rect.right, rect.bottom);
        this.u = g0VarL;
        boolean z = true;
        if (!this.v.equals(g0VarL)) {
            this.v = this.u;
            zQ = true;
        }
        if (this.f163o.equals(this.f162n)) {
            z = zQ;
        } else {
            this.f163o.set(this.f162n);
        }
        if (z) {
            requestLayout();
        }
        return g0VarV.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        h.h.l.y.K(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredHeight;
        h.h.l.g0 g0VarA;
        z();
        measureChildWithMargins(this.d, i2, 0, i3, 0);
        e eVar = (e) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        boolean z = (h.h.l.y.w(this) & 256) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.f157i && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        this.p.set(this.f162n);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.F = this.u;
        } else {
            this.s.set(this.q);
        }
        if (!this.f156h && !z) {
            Rect rect = this.p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i4 >= 21) {
                g0VarA = this.F.l(0, measuredHeight, 0, 0);
                this.F = g0VarA;
            }
        } else if (i4 >= 21) {
            h.h.e.b bVarB = h.h.e.b.b(this.F.i(), this.F.k() + measuredHeight, this.F.j(), this.F.h() + 0);
            h.h.l.g0.b bVar = new h.h.l.g0.b(this.F);
            bVar.c(bVarB);
            g0VarA = bVar.a();
            this.F = g0VarA;
        } else {
            Rect rect2 = this.s;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        q(this.c, this.p, true, true, true, true);
        if (i4 >= 21 && !this.G.equals(this.F)) {
            h.h.l.g0 g0Var = this.F;
            this.G = g0Var;
            h.h.l.y.d(this.c, g0Var);
        } else if (i4 < 21 && !this.t.equals(this.s)) {
            this.t.set(this.s);
            this.c.a(this.s);
        }
        measureChildWithMargins(this.c, i2, 0, i3, 0);
        e eVar2 = (e) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, h.h.l.r
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f158j || !z) {
            return false;
        }
        if (B(f2)) {
            p();
        } else {
            A();
        }
        this.f159k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, h.h.l.r
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, h.h.l.r
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, h.h.l.r
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f160l + i3;
        this.f160l = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, h.h.l.r
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.N.b(view, view2, i2);
        this.f160l = getActionBarHideOffset();
        u();
        d dVar = this.H;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, h.h.l.r
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.f158j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, h.h.l.r
    public void onStopNestedScroll(View view) {
        if (this.f158j && !this.f159k) {
            if (this.f160l <= this.d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.H;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        z();
        int i3 = this.f161m ^ i2;
        this.f161m = i2;
        boolean z = (i2 & 4) == 0;
        boolean z2 = (i2 & 256) != 0;
        d dVar = this.H;
        if (dVar != null) {
            dVar.e(!z2);
            if (z || !z2) {
                this.H.a();
            } else {
                this.H.f();
            }
        }
        if ((i3 & 256) == 0 || this.H == null) {
            return;
        }
        h.h.l.y.K(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.b = i2;
        d dVar = this.H;
        if (dVar != null) {
            dVar.c(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.d.setTranslationY(-Math.max(0, Math.min(i2, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.H = dVar;
        if (getWindowToken() != null) {
            this.H.c(this.b);
            int i2 = this.f161m;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                h.h.l.y.K(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f157i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f158j) {
            this.f158j = z;
            if (z) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        z();
        this.e.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.e.setIcon(drawable);
    }

    public void setLogo(int i2) {
        z();
        this.e.p(i2);
    }

    public void setOverlayMode(boolean z) {
        this.f156h = z;
        this.f155g = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.L);
        removeCallbacks(this.M);
        ViewPropertyAnimator viewPropertyAnimator = this.J;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f156h;
    }

    void z() {
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(h.b.f.b);
            this.d = (ActionBarContainer) findViewById(h.b.f.c);
            this.e = t(findViewById(h.b.f.a));
        }
    }
}
