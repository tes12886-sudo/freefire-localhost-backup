package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class n0 implements androidx.appcompat.view.menu.p {
    private static Method O;
    private static Method P;
    private static Method Q;
    final f F;
    private final e G;
    private final d H;
    private final b I;
    final Handler J;
    private final Rect K;
    private Rect L;
    private boolean M;
    PopupWindow N;
    private Context a;
    private ListAdapter b;
    j0 c;
    private int d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f252o;
    private View p;
    private int q;
    private DataSetObserver r;
    private View s;
    private Drawable t;
    private AdapterView.OnItemClickListener u;
    private AdapterView.OnItemSelectedListener v;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            j0 j0Var;
            if (i2 == -1 || (j0Var = n0.this.c) == null) {
                return;
            }
            j0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.this.r();
        }
    }

    private class c extends DataSetObserver {
        c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (n0.this.b()) {
                n0.this.d();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            n0.this.dismiss();
        }
    }

    private class d implements AbsListView.OnScrollListener {
        d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || n0.this.w() || n0.this.N.getContentView() == null) {
                return;
            }
            n0 n0Var = n0.this;
            n0Var.J.removeCallbacks(n0Var.F);
            n0.this.F.run();
        }
    }

    private class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = n0.this.N) != null && popupWindow.isShowing() && x >= 0 && x < n0.this.N.getWidth() && y >= 0 && y < n0.this.N.getHeight()) {
                n0 n0Var = n0.this;
                n0Var.J.postDelayed(n0Var.F, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            n0 n0Var2 = n0.this;
            n0Var2.J.removeCallbacks(n0Var2.F);
            return false;
        }
    }

    private class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0 j0Var = n0.this.c;
            if (j0Var == null || !h.h.l.y.z(j0Var) || n0.this.c.getCount() <= n0.this.c.getChildCount()) {
                return;
            }
            int childCount = n0.this.c.getChildCount();
            n0 n0Var = n0.this;
            if (childCount <= n0Var.f252o) {
                n0Var.N.setInputMethodMode(2);
                n0.this.d();
            }
        }
    }

    static {
        Class cls = Boolean.TYPE;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            try {
                O = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (i2 <= 23) {
            try {
                P = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public n0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public n0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.d = -2;
        this.e = -2;
        this.f245h = 1002;
        this.f249l = 0;
        this.f250m = false;
        this.f251n = false;
        this.f252o = Integer.MAX_VALUE;
        this.q = 0;
        this.F = new f();
        this.G = new e();
        this.H = new d();
        this.I = new b();
        this.K = new Rect();
        this.a = context;
        this.J = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.b.j.g1, i2, i3);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.b.j.h1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.b.j.i1, 0);
        this.f244g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f246i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i2, i3);
        this.N = tVar;
        tVar.setInputMethodMode(1);
    }

    private void J(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.N.setIsClippedToScreen(z);
            return;
        }
        Method method = O;
        if (method != null) {
            try {
                method.invoke(this.N, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0124 A[PHI: r1
  0x0124: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x0119, B:47:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    private int q() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        View view;
        int i3;
        int i4 = Integer.MIN_VALUE;
        if (this.c == null) {
            Context context = this.a;
            j0 j0VarS = s(context, !this.M);
            this.c = j0VarS;
            Drawable drawable = this.t;
            if (drawable != null) {
                j0VarS.setSelector(drawable);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new a());
            this.c.setOnScrollListener(this.H);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            j0 j0Var = this.c;
            View view2 = this.p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.q;
                if (i5 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(j0Var, layoutParams);
                } else if (i5 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.q);
                } else {
                    linearLayout.addView(j0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i6 = this.e;
                if (i6 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = j0Var;
            }
            this.N.setContentView(view);
        } else {
            View view3 = this.p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.N.getBackground();
        if (background != null) {
            background.getPadding(this.K);
            Rect rect = this.K;
            int i7 = rect.top;
            i2 = rect.bottom + i7;
            if (!this.f246i) {
                this.f244g = -i7;
            }
        } else {
            this.K.setEmpty();
            i2 = 0;
        }
        int iU = u(t(), this.f244g, this.N.getInputMethodMode() == 2);
        if (this.f250m || this.d == -1) {
            return iU + i2;
        }
        int i8 = this.e;
        if (i8 != -2) {
            i4 = 1073741824;
            if (i8 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                int i9 = this.a.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.K;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), i4);
            }
        } else {
            int i10 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.K;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), i4);
        }
        int iD = this.c.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i2 + this.c.getPaddingTop() + this.c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.N.getMaxAvailableHeight(view, i2, z);
        }
        Method method = P;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.N, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.N.getMaxAvailableHeight(view, i2);
    }

    private void y() {
        View view = this.p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.p);
            }
        }
    }

    public void A(int i2) {
        this.N.setAnimationStyle(i2);
    }

    public void B(int i2) {
        Drawable background = this.N.getBackground();
        if (background == null) {
            M(i2);
            return;
        }
        background.getPadding(this.K);
        Rect rect = this.K;
        this.e = rect.left + rect.right + i2;
    }

    public void C(int i2) {
        this.f249l = i2;
    }

    public void D(Rect rect) {
        this.L = rect != null ? new Rect(rect) : null;
    }

    public void E(int i2) {
        this.N.setInputMethodMode(i2);
    }

    public void F(boolean z) {
        this.M = z;
        this.N.setFocusable(z);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.N.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.u = onItemClickListener;
    }

    public void I(boolean z) {
        this.f248k = true;
        this.f247j = z;
    }

    public void K(int i2) {
        this.q = i2;
    }

    public void L(int i2) {
        j0 j0Var = this.c;
        if (!b() || j0Var == null) {
            return;
        }
        j0Var.setListSelectionHidden(false);
        j0Var.setSelection(i2);
        if (j0Var.getChoiceMode() != 0) {
            j0Var.setItemChecked(i2, true);
        }
    }

    public void M(int i2) {
        this.e = i2;
    }

    public int a() {
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.N.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public void d() {
        int iQ = q();
        boolean zW = w();
        androidx.core.widget.i.b(this.N, this.f245h);
        if (this.N.isShowing()) {
            if (h.h.l.y.z(t())) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i2 = this.d;
                if (i2 == -1) {
                    if (!zW) {
                        iQ = -1;
                    }
                    if (zW) {
                        this.N.setWidth(this.e == -1 ? -1 : 0);
                        this.N.setHeight(0);
                    } else {
                        this.N.setWidth(this.e == -1 ? -1 : 0);
                        this.N.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iQ = i2;
                }
                this.N.setOutsideTouchable((this.f251n || this.f250m) ? false : true);
                this.N.update(t(), this.f, this.f244g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i3 = this.d;
        if (i3 == -1) {
            iQ = -1;
        } else if (i3 != -2) {
            iQ = i3;
        }
        this.N.setWidth(width2);
        this.N.setHeight(iQ);
        J(true);
        this.N.setOutsideTouchable((this.f251n || this.f250m) ? false : true);
        this.N.setTouchInterceptor(this.G);
        if (this.f248k) {
            androidx.core.widget.i.a(this.N, this.f247j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = Q;
            if (method != null) {
                try {
                    method.invoke(this.N, this.L);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.N.setEpicenterBounds(this.L);
        }
        androidx.core.widget.i.c(this.N, t(), this.f, this.f244g, this.f249l);
        this.c.setSelection(-1);
        if (!this.M || this.c.isInTouchMode()) {
            r();
        }
        if (this.M) {
            return;
        }
        this.J.post(this.I);
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.N.dismiss();
        y();
        this.N.setContentView(null);
        this.c = null;
        this.J.removeCallbacks(this.F);
    }

    public Drawable f() {
        return this.N.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView g() {
        return this.c;
    }

    public void i(Drawable drawable) {
        this.N.setBackgroundDrawable(drawable);
    }

    public void j(int i2) {
        this.f244g = i2;
        this.f246i = true;
    }

    public void l(int i2) {
        this.f = i2;
    }

    public int n() {
        if (this.f246i) {
            return this.f244g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new c();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        j0 j0Var = this.c;
        if (j0Var != null) {
            j0Var.setAdapter(this.b);
        }
    }

    public void r() {
        j0 j0Var = this.c;
        if (j0Var != null) {
            j0Var.setListSelectionHidden(true);
            j0Var.requestLayout();
        }
    }

    j0 s(Context context, boolean z) {
        return new j0(context, z);
    }

    public View t() {
        return this.s;
    }

    public int v() {
        return this.e;
    }

    public boolean w() {
        return this.N.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.M;
    }

    public void z(View view) {
        this.s = view;
    }
}
