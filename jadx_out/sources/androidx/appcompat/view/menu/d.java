package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.p0;
import h.h.l.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int K = h.b.g.e;
    private boolean F;
    private m.a G;
    ViewTreeObserver H;
    private PopupWindow.OnDismissListener I;
    boolean J;
    private final Context b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f99g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f107o;
    View p;
    private boolean r;
    private boolean s;
    private int t;
    private int u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<g> f100h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List<C0010d> f101i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f102j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f103k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o0 f104l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f105m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f106n = 0;
    private boolean v = false;
    private int q = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.b() || d.this.f101i.size() <= 0 || d.this.f101i.get(0).a.x()) {
                return;
            }
            View view = d.this.p;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0010d> it = d.this.f101i.iterator();
            while (it.hasNext()) {
                it.next().a.d();
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
            ViewTreeObserver viewTreeObserver = d.this.H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.H = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.H.removeGlobalOnLayoutListener(dVar.f102j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements o0 {

        class a implements Runnable {
            final /* synthetic */ C0010d a;
            final /* synthetic */ MenuItem b;
            final /* synthetic */ g c;

            a(C0010d c0010d, MenuItem menuItem, g gVar) {
                this.a = c0010d;
                this.b = menuItem;
                this.c = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0010d c0010d = this.a;
                if (c0010d != null) {
                    d.this.J = true;
                    c0010d.b.e(false);
                    d.this.J = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.c.L(this.b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.o0
        public void c(g gVar, MenuItem menuItem) {
            d.this.f99g.removeCallbacksAndMessages(null);
            int size = d.this.f101i.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.f101i.get(i2).b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            d.this.f99g.postAtTime(new a(i3 < d.this.f101i.size() ? d.this.f101i.get(i3) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.o0
        public void e(g gVar, MenuItem menuItem) {
            d.this.f99g.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0010d {
        public final p0 a;
        public final g b;
        public final int c;

        public C0010d(p0 p0Var, g gVar, int i2) {
            this.a = p0Var;
            this.b = gVar;
            this.c = i2;
        }

        public ListView a() {
            return this.a.g();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z) {
        this.b = context;
        this.f107o = view;
        this.d = i2;
        this.e = i3;
        this.f = z;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.b.d.d));
        this.f99g = new Handler();
    }

    private int A(g gVar) {
        int size = this.f101i.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.f101i.get(i2).b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0010d c0010d, g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(c0010d.b, gVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = c0010d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (menuItemB == fVar.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return y.q(this.f107o) == 1 ? 0 : 1;
    }

    private int E(int i2) {
        List<C0010d> list = this.f101i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        if (this.q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i2 > rect.right ? 0 : 1;
        }
        return iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void F(g gVar) {
        C0010d c0010d;
        View viewC;
        int i2;
        int i3;
        int i4;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        f fVar = new f(gVar, layoutInflaterFrom, this.f, K);
        if (!b() && this.v) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.x(gVar));
        }
        int iO = k.o(fVar, null, this.b, this.c);
        p0 p0VarZ = z();
        p0VarZ.p(fVar);
        p0VarZ.B(iO);
        p0VarZ.C(this.f106n);
        if (this.f101i.size() > 0) {
            List<C0010d> list = this.f101i;
            c0010d = list.get(list.size() - 1);
            viewC = C(c0010d, gVar);
        } else {
            c0010d = null;
            viewC = null;
        }
        if (viewC != null) {
            p0VarZ.Q(false);
            p0VarZ.N(null);
            int iE = E(iO);
            boolean z = iE == 1;
            this.q = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                p0VarZ.z(viewC);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.f107o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.f106n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f107o.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.f106n & 5) == 5) {
                if (z) {
                    i4 = i2 + iO;
                } else {
                    iO = viewC.getWidth();
                    i4 = i2 - iO;
                }
            } else if (z) {
                iO = viewC.getWidth();
                i4 = i2 + iO;
            } else {
                i4 = i2 - iO;
            }
            p0VarZ.l(i4);
            p0VarZ.I(true);
            p0VarZ.j(i3);
        } else {
            if (this.r) {
                p0VarZ.l(this.t);
            }
            if (this.s) {
                p0VarZ.j(this.u);
            }
            p0VarZ.D(n());
        }
        this.f101i.add(new C0010d(p0VarZ, gVar, this.q));
        p0VarZ.d();
        ListView listViewG = p0VarZ.g();
        listViewG.setOnKeyListener(this);
        if (c0010d == null && this.F && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(h.b.g.f1710l, (ViewGroup) listViewG, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            listViewG.addHeaderView(frameLayout, null, false);
            p0VarZ.d();
        }
    }

    private p0 z() {
        p0 p0Var = new p0(this.b, null, this.d, this.e);
        p0Var.P(this.f104l);
        p0Var.H(this);
        p0Var.G(this);
        p0Var.z(this.f107o);
        p0Var.C(this.f106n);
        p0Var.F(true);
        p0Var.E(2);
        return p0Var;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        int iA = A(gVar);
        if (iA < 0) {
            return;
        }
        int i2 = iA + 1;
        if (i2 < this.f101i.size()) {
            this.f101i.get(i2).b.e(false);
        }
        C0010d c0010dRemove = this.f101i.remove(iA);
        c0010dRemove.b.O(this);
        if (this.J) {
            c0010dRemove.a.O(null);
            c0010dRemove.a.A(0);
        }
        c0010dRemove.a.dismiss();
        int size = this.f101i.size();
        this.q = size > 0 ? this.f101i.get(size - 1).c : D();
        if (size != 0) {
            if (z) {
                this.f101i.get(0).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.G;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.H.removeGlobalOnLayoutListener(this.f102j);
            }
            this.H = null;
        }
        this.p.removeOnAttachStateChangeListener(this.f103k);
        this.I.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.f101i.size() > 0 && this.f101i.get(0).a.b();
    }

    @Override // androidx.appcompat.view.menu.p
    public void d() {
        if (b()) {
            return;
        }
        Iterator<g> it = this.f100h.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.f100h.clear();
        View view = this.f107o;
        this.p = view;
        if (view != null) {
            boolean z = this.H == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.H = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f102j);
            }
            this.p.addOnAttachStateChangeListener(this.f103k);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f101i.size();
        if (size > 0) {
            C0010d[] c0010dArr = (C0010d[]) this.f101i.toArray(new C0010d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0010d c0010d = c0010dArr[i2];
                if (c0010d.a.b()) {
                    c0010d.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        for (C0010d c0010d : this.f101i) {
            if (rVar == c0010d.b) {
                c0010d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m.a aVar = this.G;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z) {
        Iterator<C0010d> it = this.f101i.iterator();
        while (it.hasNext()) {
            k.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView g() {
        if (this.f101i.isEmpty()) {
            return null;
        }
        List<C0010d> list = this.f101i;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(m.a aVar) {
        this.G = aVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
        gVar.c(this, this.b);
        if (b()) {
            F(gVar);
        } else {
            this.f100h.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0010d c0010d;
        int size = this.f101i.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0010d = null;
                break;
            }
            c0010d = this.f101i.get(i2);
            if (!c0010d.a.b()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0010d != null) {
            c0010d.b.e(false);
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
        if (this.f107o != view) {
            this.f107o = view;
            this.f106n = h.h.l.g.a(this.f105m, y.q(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i2) {
        if (this.f105m != i2) {
            this.f105m = i2;
            this.f106n = h.h.l.g.a(i2, y.q(this.f107o));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i2) {
        this.r = true;
        this.t = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.I = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z) {
        this.F = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i2) {
        this.s = true;
        this.u = i2;
    }
}
