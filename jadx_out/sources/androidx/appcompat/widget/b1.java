package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class b1 implements h0 {
    Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f192o;
    private int p;
    private Drawable q;

    class a implements View.OnClickListener {
        final androidx.appcompat.view.menu.a a;

        a() {
            this.a = new androidx.appcompat.view.menu.a(b1.this.a.getContext(), 0, R.id.home, 0, 0, b1.this.f186i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b1 b1Var = b1.this;
            Window.Callback callback = b1Var.f189l;
            if (callback == null || !b1Var.f190m) {
                return;
            }
            callback.onMenuItemSelected(0, this.a);
        }
    }

    class b extends h.h.l.e0 {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i2) {
            this.b = i2;
        }

        @Override // h.h.l.e0, h.h.l.d0
        public void a(View view) {
            this.a = true;
        }

        @Override // h.h.l.d0
        public void b(View view) {
            if (this.a) {
                return;
            }
            b1.this.a.setVisibility(this.b);
        }

        @Override // h.h.l.e0, h.h.l.d0
        public void c(View view) {
            b1.this.a.setVisibility(0);
        }
    }

    public b1(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.b.h.a, h.b.e.f1694n);
    }

    public b1(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.f192o = 0;
        this.p = 0;
        this.a = toolbar;
        this.f186i = toolbar.getTitle();
        this.f187j = toolbar.getSubtitle();
        this.f185h = this.f186i != null;
        this.f184g = toolbar.getNavigationIcon();
        a1 a1VarU = a1.u(toolbar.getContext(), null, h.b.j.a, h.b.a.c, 0);
        this.q = a1VarU.f(h.b.j.f1725l);
        if (z) {
            CharSequence charSequenceO = a1VarU.o(h.b.j.r);
            if (!TextUtils.isEmpty(charSequenceO)) {
                D(charSequenceO);
            }
            CharSequence charSequenceO2 = a1VarU.o(h.b.j.p);
            if (!TextUtils.isEmpty(charSequenceO2)) {
                C(charSequenceO2);
            }
            Drawable drawableF = a1VarU.f(h.b.j.f1727n);
            if (drawableF != null) {
                y(drawableF);
            }
            Drawable drawableF2 = a1VarU.f(h.b.j.f1726m);
            if (drawableF2 != null) {
                setIcon(drawableF2);
            }
            if (this.f184g == null && (drawable = this.q) != null) {
                B(drawable);
            }
            n(a1VarU.j(h.b.j.f1721h, 0));
            int iM = a1VarU.m(h.b.j.f1720g, 0);
            if (iM != 0) {
                w(LayoutInflater.from(this.a.getContext()).inflate(iM, (ViewGroup) this.a, false));
                n(this.b | 16);
            }
            int iL = a1VarU.l(h.b.j.f1723j, 0);
            if (iL > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = iL;
                this.a.setLayoutParams(layoutParams);
            }
            int iD = a1VarU.d(h.b.j.f, -1);
            int iD2 = a1VarU.d(h.b.j.e, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.a.J(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iM2 = a1VarU.m(h.b.j.s, 0);
            if (iM2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.M(toolbar2.getContext(), iM2);
            }
            int iM3 = a1VarU.m(h.b.j.q, 0);
            if (iM3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.L(toolbar3.getContext(), iM3);
            }
            int iM4 = a1VarU.m(h.b.j.f1728o, 0);
            if (iM4 != 0) {
                this.a.setPopupTheme(iM4);
            }
        } else {
            this.b = v();
        }
        a1VarU.v();
        x(i2);
        this.f188k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    private void E(CharSequence charSequence) {
        this.f186i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.f185h) {
                h.h.l.y.P(this.a.getRootView(), charSequence);
            }
        }
    }

    private void F() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.f188k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.f188k);
            }
        }
    }

    private void G() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable = this.f184g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void H() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    private int v() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void A(CharSequence charSequence) {
        this.f188k = charSequence;
        F();
    }

    public void B(Drawable drawable) {
        this.f184g = drawable;
        G();
    }

    public void C(CharSequence charSequence) {
        this.f187j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void D(CharSequence charSequence) {
        this.f185h = true;
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.h0
    public Context a() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.widget.h0
    public void b(Menu menu, androidx.appcompat.view.menu.m.a aVar) {
        if (this.f191n == null) {
            d dVar = new d(this.a.getContext());
            this.f191n = dVar;
            dVar.p(h.b.f.f1696g);
        }
        this.f191n.k(aVar);
        this.a.K((androidx.appcompat.view.menu.g) menu, this.f191n);
    }

    @Override // androidx.appcompat.widget.h0
    public boolean c() {
        return this.a.B();
    }

    @Override // androidx.appcompat.widget.h0
    public void collapseActionView() {
        this.a.e();
    }

    @Override // androidx.appcompat.widget.h0
    public void d() {
        this.f190m = true;
    }

    @Override // androidx.appcompat.widget.h0
    public boolean e() {
        return this.a.A();
    }

    @Override // androidx.appcompat.widget.h0
    public boolean f() {
        return this.a.w();
    }

    @Override // androidx.appcompat.widget.h0
    public boolean g() {
        return this.a.P();
    }

    @Override // androidx.appcompat.widget.h0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // androidx.appcompat.widget.h0
    public boolean h() {
        return this.a.d();
    }

    @Override // androidx.appcompat.widget.h0
    public void i() {
        this.a.f();
    }

    @Override // androidx.appcompat.widget.h0
    public void j(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.h0
    public void k(t0 t0Var) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = t0Var;
        if (t0Var == null || this.f192o != 2) {
            return;
        }
        this.a.addView(t0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.a = 8388691;
        t0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.h0
    public void l(boolean z) {
    }

    @Override // androidx.appcompat.widget.h0
    public boolean m() {
        return this.a.v();
    }

    @Override // androidx.appcompat.widget.h0
    public void n(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i3 & 3) != 0) {
                H();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f186i);
                    toolbar = this.a;
                    charSequence = this.f187j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.h0
    public int o() {
        return this.b;
    }

    @Override // androidx.appcompat.widget.h0
    public void p(int i2) {
        y(i2 != 0 ? h.b.k.a.a.b(a(), i2) : null);
    }

    @Override // androidx.appcompat.widget.h0
    public int q() {
        return this.f192o;
    }

    @Override // androidx.appcompat.widget.h0
    public h.h.l.c0 r(int i2, long j2) {
        h.h.l.c0 c0VarB = h.h.l.y.b(this.a);
        c0VarB.a(i2 == 0 ? 1.0f : 0.0f);
        c0VarB.d(j2);
        c0VarB.f(new b(i2));
        return c0VarB;
    }

    @Override // androidx.appcompat.widget.h0
    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.h0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? h.b.k.a.a.b(a(), i2) : null);
    }

    @Override // androidx.appcompat.widget.h0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        H();
    }

    @Override // androidx.appcompat.widget.h0
    public void setWindowCallback(Window.Callback callback) {
        this.f189l = callback;
    }

    @Override // androidx.appcompat.widget.h0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f185h) {
            return;
        }
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.h0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.h0
    public void u(boolean z) {
        this.a.setCollapsible(z);
    }

    public void w(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void x(int i2) {
        if (i2 == this.p) {
            return;
        }
        this.p = i2;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            z(this.p);
        }
    }

    public void y(Drawable drawable) {
        this.f = drawable;
        H();
    }

    public void z(int i2) {
        A(i2 == 0 ? null : a().getString(i2));
    }
}
