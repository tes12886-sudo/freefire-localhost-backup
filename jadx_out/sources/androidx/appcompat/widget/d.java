package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class d extends androidx.appcompat.view.menu.b implements h.h.l.d.a {
    e F;
    a G;
    c H;
    private b I;
    final f J;
    int K;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    C0011d f200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f206o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private final SparseBooleanArray v;

    private class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, h.b.a.f1672l);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                View view2 = d.this.f200i;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.b) d.this).f98h : view2);
            }
            j(d.this.J);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            d dVar = d.this;
            dVar.G = null;
            dVar.K = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            a aVar = d.this.G;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    private class c implements Runnable {
        private e a;

        public c(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) d.this).c != null) {
                ((androidx.appcompat.view.menu.b) d.this).c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) d.this).f98h;
            if (view != null && view.getWindowToken() != null && this.a.m()) {
                d.this.F = this.a;
            }
            d.this.H = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$d, reason: collision with other inner class name */
    private class C0011d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.d$d$a */
        class a extends l0 {
            a(View view, d dVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.l0
            public androidx.appcompat.view.menu.p b() {
                e eVar = d.this.F;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.l0
            public boolean c() {
                d.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.l0
            public boolean d() {
                d dVar = d.this;
                if (dVar.H != null) {
                    return false;
                }
                dVar.B();
                return true;
            }
        }

        public C0011d(Context context) {
            super(context, null, h.b.a.f1671k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            c1.a(this, getContentDescription());
            setOnTouchListener(new a(this, d.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            d.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.k(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z) {
            super(context, gVar, view, z, h.b.a.f1672l);
            h(8388613);
            j(d.this.J);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            if (((androidx.appcompat.view.menu.b) d.this).c != null) {
                ((androidx.appcompat.view.menu.b) d.this).c.close();
            }
            d.this.F = null;
            super.e();
        }
    }

    private class f implements androidx.appcompat.view.menu.m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            androidx.appcompat.view.menu.m.a aVarM = d.this.m();
            if (aVarM != null) {
                aVarM.a(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) d.this).c) {
                return false;
            }
            d.this.K = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            androidx.appcompat.view.menu.m.a aVarM = d.this.m();
            if (aVarM != null) {
                return aVarM.b(gVar);
            }
            return false;
        }
    }

    public d(Context context) {
        super(context, h.b.g.c, h.b.g.b);
        this.v = new SparseBooleanArray();
        this.J = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f98h;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof androidx.appcompat.view.menu.n.a) && ((androidx.appcompat.view.menu.n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        C0011d c0011d = this.f200i;
        if (c0011d != null) {
            return c0011d.getDrawable();
        }
        if (this.f202k) {
            return this.f201j;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        c cVar = this.H;
        if (cVar != null && (obj = this.f98h) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.H = null;
            return true;
        }
        e eVar = this.F;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.G;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.H != null || E();
    }

    public boolean E() {
        e eVar = this.F;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.q) {
            this.p = h.b.n.a.b(this.b).d();
        }
        androidx.appcompat.view.menu.g gVar = this.c;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z) {
        this.t = z;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f98h = actionMenuView;
        actionMenuView.b(this.c);
    }

    public void I(Drawable drawable) {
        C0011d c0011d = this.f200i;
        if (c0011d != null) {
            c0011d.setImageDrawable(drawable);
        } else {
            this.f202k = true;
            this.f201j = drawable;
        }
    }

    public void J(boolean z) {
        this.f203l = z;
        this.f204m = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f203l || E() || (gVar = this.c) == null || this.f98h == null || this.H != null || gVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.b, this.c, this.f200i, true));
        this.H = cVar;
        ((View) this.f98h).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        y();
        super.a(gVar, z);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void c(Context context, androidx.appcompat.view.menu.g gVar) {
        super.c(context, gVar);
        Resources resources = context.getResources();
        h.b.n.a aVarB = h.b.n.a.b(context);
        if (!this.f204m) {
            this.f203l = aVarB.h();
        }
        if (!this.s) {
            this.f205n = aVarB.c();
        }
        if (!this.q) {
            this.p = aVarB.d();
        }
        int measuredWidth = this.f205n;
        if (this.f203l) {
            if (this.f200i == null) {
                C0011d c0011d = new C0011d(this.a);
                this.f200i = c0011d;
                if (this.f202k) {
                    c0011d.setImageDrawable(this.f201j);
                    this.f201j = null;
                    this.f202k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f200i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f200i.getMeasuredWidth();
        } else {
            this.f200i = null;
        }
        this.f206o = measuredWidth;
        this.u = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b
    public void d(androidx.appcompat.view.menu.i iVar, androidx.appcompat.view.menu.n.a aVar) {
        aVar.d(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f98h);
        if (this.I == null) {
            this.I = new b();
        }
        actionMenuItemView.setPopupCallback(this.I);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean e(androidx.appcompat.view.menu.r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.e0() != this.c) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.e0();
        }
        View viewZ = z(rVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        rVar.getItem().getItemId();
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        a aVar = new a(this.b, rVar, viewZ);
        this.G = aVar;
        aVar.g(z);
        this.G.k();
        super.e(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void f(boolean z) {
        super.f(z);
        ((View) this.f98h).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.c;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.i> arrayListS = gVar.s();
            int size = arrayListS.size();
            for (int i2 = 0; i2 < size; i2++) {
                h.h.l.d dVarB = arrayListS.get(i2).b();
                if (dVarB != null) {
                    dVarB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.c;
        ArrayList<androidx.appcompat.view.menu.i> arrayListZ = gVar2 != null ? gVar2.z() : null;
        if (this.f203l && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z2 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0011d c0011d = this.f200i;
        if (z2) {
            if (c0011d == null) {
                this.f200i = new C0011d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f200i.getParent();
            if (viewGroup != this.f98h) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f200i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f98h;
                actionMenuView.addView(this.f200i, actionMenuView.D());
            }
        } else if (c0011d != null) {
            Object parent = c0011d.getParent();
            Object obj = this.f98h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f200i);
            }
        }
        ((ActionMenuView) this.f98h).setOverflowReserved(this.f203l);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h() {
        ArrayList<androidx.appcompat.view.menu.i> arrayListE;
        int size;
        int i2;
        int iJ;
        d dVar = this;
        androidx.appcompat.view.menu.g gVar = dVar.c;
        View view = null;
        int i3 = 0;
        if (gVar != null) {
            arrayListE = gVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i4 = dVar.p;
        int i5 = dVar.f206o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) dVar.f98h;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            androidx.appcompat.view.menu.i iVar = arrayListE.get(i8);
            if (iVar.o()) {
                i6++;
            } else if (iVar.n()) {
                i7++;
            } else {
                z = true;
            }
            if (dVar.t && iVar.isActionViewExpanded()) {
                i4 = 0;
            }
        }
        if (dVar.f203l && (z || i7 + i6 > i4)) {
            i4--;
        }
        int i9 = i4 - i6;
        SparseBooleanArray sparseBooleanArray = dVar.v;
        sparseBooleanArray.clear();
        if (dVar.r) {
            int i10 = dVar.u;
            iJ = i5 / i10;
            i2 = i10 + ((i5 % i10) / iJ);
        } else {
            i2 = 0;
            iJ = 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            androidx.appcompat.view.menu.i iVar2 = arrayListE.get(i11);
            if (iVar2.o()) {
                View viewN = dVar.n(iVar2, view, viewGroup);
                if (dVar.r) {
                    iJ -= ActionMenuView.J(viewN, i2, iJ, iMakeMeasureSpec, i3);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
            } else {
                if (iVar2.n()) {
                    int groupId2 = iVar2.getGroupId();
                    boolean z2 = sparseBooleanArray.get(groupId2);
                    boolean z3 = (i9 > 0 || z2) && i5 > 0 && (!dVar.r || iJ > 0);
                    boolean z4 = z3;
                    if (z3) {
                        View viewN2 = dVar.n(iVar2, null, viewGroup);
                        if (dVar.r) {
                            int iJ2 = ActionMenuView.J(viewN2, i2, iJ, iMakeMeasureSpec, 0);
                            iJ -= iJ2;
                            if (iJ2 == 0) {
                                z4 = false;
                            }
                        } else {
                            viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        }
                        boolean z5 = z4;
                        int measuredWidth2 = viewN2.getMeasuredWidth();
                        i5 -= measuredWidth2;
                        if (i12 == 0) {
                            i12 = measuredWidth2;
                        }
                        z3 = z5 & (!dVar.r ? i5 + i12 <= 0 : i5 < 0);
                    }
                    if (z3 && groupId2 != 0) {
                        sparseBooleanArray.put(groupId2, true);
                    } else if (z2) {
                        sparseBooleanArray.put(groupId2, false);
                        for (int i13 = 0; i13 < i11; i13++) {
                            androidx.appcompat.view.menu.i iVar3 = arrayListE.get(i13);
                            if (iVar3.getGroupId() == groupId2) {
                                if (iVar3.l()) {
                                    i9++;
                                }
                                iVar3.u(false);
                            }
                        }
                    }
                    if (z3) {
                        i9--;
                    }
                    iVar2.u(z3);
                } else {
                    size = size;
                    iVar2.u(false);
                }
                i11++;
                view = null;
                dVar = this;
                size = size;
                i3 = 0;
            }
            i11++;
            view = null;
            dVar = this;
            size = size;
            i3 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f200i) {
            return false;
        }
        return super.l(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.n o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f98h;
        androidx.appcompat.view.menu.n nVarO = super.o(viewGroup);
        if (nVar != nVarO) {
            ((ActionMenuView) nVarO).setPresenter(this);
        }
        return nVarO;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i2, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
