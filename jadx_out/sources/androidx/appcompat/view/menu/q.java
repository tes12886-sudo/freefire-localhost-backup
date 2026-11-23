package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.p0;
import h.h.l.y;

/* JADX INFO: loaded from: classes.dex */
final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int v = h.b.g.f1711m;
    private final Context b;
    private final g c;
    private final f d;
    private final boolean e;
    private final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final p0 f137i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m.a f143o;
    ViewTreeObserver p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f138j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f139k = new b();
    private int t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.b() || q.this.f137i.x()) {
                return;
            }
            View view = q.this.f142n;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f137i.d();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.p = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.p.removeGlobalOnLayoutListener(qVar.f138j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.b = context;
        this.c = gVar;
        this.e = z;
        this.d = new f(gVar, LayoutInflater.from(context), z, v);
        this.f135g = i2;
        this.f136h = i3;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.b.d.d));
        this.f141m = view;
        this.f137i = new p0(context, null, i2, i3);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (b()) {
            return true;
        }
        if (this.q || (view = this.f141m) == null) {
            return false;
        }
        this.f142n = view;
        this.f137i.G(this);
        this.f137i.H(this);
        this.f137i.F(true);
        View view2 = this.f142n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f138j);
        }
        view2.addOnAttachStateChangeListener(this.f139k);
        this.f137i.z(view2);
        this.f137i.C(this.t);
        if (!this.r) {
            this.s = k.o(this.d, null, this.b, this.f);
            this.r = true;
        }
        this.f137i.B(this.s);
        this.f137i.E(2);
        this.f137i.D(n());
        this.f137i.d();
        ListView listViewG = this.f137i.g();
        listViewG.setOnKeyListener(this);
        if (this.u && this.c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(h.b.g.f1710l, (ViewGroup) listViewG, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.c.x());
            }
            frameLayout.setEnabled(false);
            listViewG.addHeaderView(frameLayout, null, false);
        }
        this.f137i.p(this.d);
        this.f137i.d();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        if (gVar != this.c) {
            return;
        }
        dismiss();
        m.a aVar = this.f143o;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return !this.q && this.f137i.b();
    }

    @Override // androidx.appcompat.view.menu.p
    public void d() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.f137i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.b, rVar, this.f142n, this.e, this.f135g, this.f136h);
            lVar.j(this.f143o);
            lVar.g(k.x(rVar));
            lVar.i(this.f140l);
            this.f140l = null;
            this.c.e(false);
            int iA = this.f137i.a();
            int iN = this.f137i.n();
            if ((Gravity.getAbsoluteGravity(this.t, y.q(this.f141m)) & 7) == 5) {
                iA += this.f141m.getWidth();
            }
            if (lVar.n(iA, iN)) {
                m.a aVar = this.f143o;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z) {
        this.r = false;
        f fVar = this.d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView g() {
        return this.f137i.g();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(m.a aVar) {
        this.f143o = aVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.f142n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.f138j);
            this.p = null;
        }
        this.f142n.removeOnAttachStateChangeListener(this.f139k);
        PopupWindow.OnDismissListener onDismissListener = this.f140l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        this.f141m = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z) {
        this.d.d(z);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i2) {
        this.t = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i2) {
        this.f137i.l(i2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f140l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z) {
        this.u = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i2) {
        this.f137i.j(i2);
    }
}
