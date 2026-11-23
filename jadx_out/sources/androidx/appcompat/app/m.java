package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.t0;
import h.h.l.c0;
import h.h.l.d0;
import h.h.l.e0;
import h.h.l.f0;
import h.h.l.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class m extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final f0 A;
    Context a;
    private Context b;
    ActionBarOverlayLayout c;
    ActionBarContainer d;
    h0 e;
    ActionBarContextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    View f59g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    t0 f60h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f61i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    d f62j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    h.b.n.b f63k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    h.b.n.b.a f64l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f65m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<androidx.appcompat.app.a.b> f66n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f67o;
    private int p;
    boolean q;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u;
    h.b.n.h v;
    private boolean w;
    boolean x;
    final d0 y;
    final d0 z;

    class a extends e0 {
        a() {
        }

        @Override // h.h.l.d0
        public void b(View view) {
            View view2;
            m mVar = m.this;
            if (mVar.q && (view2 = mVar.f59g) != null) {
                view2.setTranslationY(0.0f);
                m.this.d.setTranslationY(0.0f);
            }
            m.this.d.setVisibility(8);
            m.this.d.setTransitioning(false);
            m mVar2 = m.this;
            mVar2.v = null;
            mVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = m.this.c;
            if (actionBarOverlayLayout != null) {
                y.K(actionBarOverlayLayout);
            }
        }
    }

    class b extends e0 {
        b() {
        }

        @Override // h.h.l.d0
        public void b(View view) {
            m mVar = m.this;
            mVar.v = null;
            mVar.d.requestLayout();
        }
    }

    class c implements f0 {
        c() {
        }

        @Override // h.h.l.f0
        public void a(View view) {
            ((View) m.this.d.getParent()).invalidate();
        }
    }

    public class d extends h.b.n.b implements androidx.appcompat.view.menu.g.a {
        private final Context c;
        private final androidx.appcompat.view.menu.g d;
        private h.b.n.b.a e;
        private WeakReference<View> f;

        public d(Context context, h.b.n.b.a aVar) {
            this.c = context;
            this.e = aVar;
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            gVar.S(1);
            this.d = gVar;
            gVar.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            h.b.n.b.a aVar = this.e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.e == null) {
                return;
            }
            k();
            m.this.f.l();
        }

        @Override // h.b.n.b
        public void c() {
            m mVar = m.this;
            if (mVar.f62j != this) {
                return;
            }
            if (m.w(mVar.r, mVar.s, false)) {
                this.e.b(this);
            } else {
                m mVar2 = m.this;
                mVar2.f63k = this;
                mVar2.f64l = this.e;
            }
            this.e = null;
            m.this.v(false);
            m.this.f.g();
            m mVar3 = m.this;
            mVar3.c.setHideOnContentScrollEnabled(mVar3.x);
            m.this.f62j = null;
        }

        @Override // h.b.n.b
        public View d() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // h.b.n.b
        public Menu e() {
            return this.d;
        }

        @Override // h.b.n.b
        public MenuInflater f() {
            return new h.b.n.g(this.c);
        }

        @Override // h.b.n.b
        public CharSequence g() {
            return m.this.f.getSubtitle();
        }

        @Override // h.b.n.b
        public CharSequence i() {
            return m.this.f.getTitle();
        }

        @Override // h.b.n.b
        public void k() {
            if (m.this.f62j != this) {
                return;
            }
            this.d.d0();
            try {
                this.e.a(this, this.d);
            } finally {
                this.d.c0();
            }
        }

        @Override // h.b.n.b
        public boolean l() {
            return m.this.f.j();
        }

        @Override // h.b.n.b
        public void m(View view) {
            m.this.f.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        @Override // h.b.n.b
        public void n(int i2) {
            o(m.this.a.getResources().getString(i2));
        }

        @Override // h.b.n.b
        public void o(CharSequence charSequence) {
            m.this.f.setSubtitle(charSequence);
        }

        @Override // h.b.n.b
        public void q(int i2) {
            r(m.this.a.getResources().getString(i2));
        }

        @Override // h.b.n.b
        public void r(CharSequence charSequence) {
            m.this.f.setTitle(charSequence);
        }

        @Override // h.b.n.b
        public void s(boolean z) {
            super.s(z);
            m.this.f.setTitleOptional(z);
        }

        public boolean t() {
            this.d.d0();
            try {
                return this.e.d(this, this.d);
            } finally {
                this.d.c0();
            }
        }
    }

    public m(Activity activity, boolean z) {
        new ArrayList();
        this.f66n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z) {
            return;
        }
        this.f59g = decorView.findViewById(R.id.content);
    }

    public m(Dialog dialog) {
        new ArrayList();
        this.f66n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        D(dialog.getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h0 A(View view) {
        if (view instanceof h0) {
            return (h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(h.b.f.p);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.e = A(view.findViewById(h.b.f.a));
        this.f = (ActionBarContextView) view.findViewById(h.b.f.f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(h.b.f.c);
        this.d = actionBarContainer;
        h0 h0Var = this.e;
        if (h0Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(m.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = h0Var.a();
        boolean z = (this.e.o() & 4) != 0;
        if (z) {
            this.f61i = true;
        }
        h.b.n.a aVarB = h.b.n.a.b(this.a);
        J(aVarB.a() || z);
        H(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, h.b.j.a, h.b.a.c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(h.b.j.f1724k, false)) {
            I(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.b.j.f1722i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void H(boolean z) {
        this.f67o = z;
        if (z) {
            this.d.setTabContainer(null);
            this.e.k(this.f60h);
        } else {
            this.e.k(null);
            this.d.setTabContainer(this.f60h);
        }
        boolean z2 = B() == 2;
        t0 t0Var = this.f60h;
        if (t0Var != null) {
            if (z2) {
                t0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    y.K(actionBarOverlayLayout);
                }
            } else {
                t0Var.setVisibility(8);
            }
        }
        this.e.u(!this.f67o && z2);
        this.c.setHasNonEmbeddedTabs(!this.f67o && z2);
    }

    private boolean K() {
        return y.A(this.d);
    }

    private void L() {
        if (this.t) {
            return;
        }
        this.t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    private void M(boolean z) {
        if (w(this.r, this.s, this.t)) {
            if (this.u) {
                return;
            }
            this.u = true;
            z(z);
            return;
        }
        if (this.u) {
            this.u = false;
            y(z);
        }
    }

    static boolean w(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public int B() {
        return this.e.q();
    }

    public void E(boolean z) {
        F(z ? 4 : 0, 4);
    }

    public void F(int i2, int i3) {
        int iO = this.e.o();
        if ((i3 & 4) != 0) {
            this.f61i = true;
        }
        this.e.n((i2 & i3) | ((i3 ^ (-1)) & iO));
    }

    public void G(float f) {
        y.T(this.d, f);
    }

    public void I(boolean z) {
        if (z && !this.c.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.x = z;
        this.c.setHideOnContentScrollEnabled(z);
    }

    public void J(boolean z) {
        this.e.l(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.s) {
            this.s = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        h.b.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(int i2) {
        this.p = i2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z) {
        this.q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        if (this.s) {
            return;
        }
        this.s = true;
        M(true);
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        h0 h0Var = this.e;
        if (h0Var == null || !h0Var.m()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z == this.f65m) {
            return;
        }
        this.f65m = z;
        int size = this.f66n.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f66n.get(i2).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.e.o();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(h.b.a.f1667g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        H(h.b.n.a.b(this.a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i2, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f62j;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        if (this.f61i) {
            return;
        }
        E(z);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        h.b.n.h hVar;
        this.w = z;
        if (z || (hVar = this.v) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void t(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public h.b.n.b u(h.b.n.b.a aVar) {
        d dVar = this.f62j;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.k();
        d dVar2 = new d(this.f.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f62j = dVar2;
        dVar2.k();
        this.f.h(dVar2);
        v(true);
        return dVar2;
    }

    public void v(boolean z) {
        c0 c0VarR;
        c0 c0VarF;
        if (z) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z) {
                this.e.j(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.e.j(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            c0VarF = this.e.r(4, 100L);
            c0VarR = this.f.f(0, 200L);
        } else {
            c0VarR = this.e.r(0, 200L);
            c0VarF = this.f.f(8, 100L);
        }
        h.b.n.h hVar = new h.b.n.h();
        hVar.d(c0VarF, c0VarR);
        hVar.h();
    }

    void x() {
        h.b.n.b.a aVar = this.f64l;
        if (aVar != null) {
            aVar.b(this.f63k);
            this.f63k = null;
            this.f64l = null;
        }
    }

    public void y(boolean z) {
        View view;
        h.b.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z)) {
            this.y.b(null);
            return;
        }
        this.d.setAlpha(1.0f);
        this.d.setTransitioning(true);
        h.b.n.h hVar2 = new h.b.n.h();
        float f = -this.d.getHeight();
        if (z) {
            int[] iArr = {0, 0};
            this.d.getLocationInWindow(iArr);
            f -= iArr[1];
        }
        c0 c0VarB = y.b(this.d);
        c0VarB.k(f);
        c0VarB.i(this.A);
        hVar2.c(c0VarB);
        if (this.q && (view = this.f59g) != null) {
            c0 c0VarB2 = y.b(view);
            c0VarB2.k(f);
            hVar2.c(c0VarB2);
        }
        hVar2.f(B);
        hVar2.e(250L);
        hVar2.g(this.y);
        this.v = hVar2;
        hVar2.h();
    }

    public void z(boolean z) {
        View view;
        View view2;
        h.b.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.d.setVisibility(0);
        if (this.p == 0 && (this.w || z)) {
            this.d.setTranslationY(0.0f);
            float f = -this.d.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.d.getLocationInWindow(iArr);
                f -= iArr[1];
            }
            this.d.setTranslationY(f);
            h.b.n.h hVar2 = new h.b.n.h();
            c0 c0VarB = y.b(this.d);
            c0VarB.k(0.0f);
            c0VarB.i(this.A);
            hVar2.c(c0VarB);
            if (this.q && (view2 = this.f59g) != null) {
                view2.setTranslationY(f);
                c0 c0VarB2 = y.b(this.f59g);
                c0VarB2.k(0.0f);
                hVar2.c(c0VarB2);
            }
            hVar2.f(C);
            hVar2.e(250L);
            hVar2.g(this.z);
            this.v = hVar2;
            hVar2.h();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.q && (view = this.f59g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            y.K(actionBarOverlayLayout);
        }
    }
}
