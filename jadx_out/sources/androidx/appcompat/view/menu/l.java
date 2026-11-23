package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import h.h.l.y;

/* JADX INFO: loaded from: classes.dex */
public class l {
    private final Context a;
    private final g b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m.a f131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k f132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f134l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2) {
        this(context, gVar, view, z, i2, 0);
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.f129g = 8388611;
        this.f134l = new a();
        this.a = context;
        this.b = gVar;
        this.f = view;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        k dVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(h.b.d.c) ? new d(this.a, this.f, this.d, this.e, this.c) : new q(this.a, this.b, this.f, this.d, this.e, this.c);
        dVar.l(this.b);
        dVar.u(this.f134l);
        dVar.p(this.f);
        dVar.k(this.f131i);
        dVar.r(this.f130h);
        dVar.s(this.f129g);
        return dVar;
    }

    private void l(int i2, int i3, boolean z, boolean z2) {
        k kVarC = c();
        kVarC.v(z2);
        if (z) {
            if ((h.h.l.g.a(this.f129g, y.q(this.f)) & 7) == 5) {
                i2 -= this.f.getWidth();
            }
            kVarC.t(i2);
            kVarC.w(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarC.q(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        kVarC.d();
    }

    public void b() {
        if (d()) {
            this.f132j.dismiss();
        }
    }

    public k c() {
        if (this.f132j == null) {
            this.f132j = a();
        }
        return this.f132j;
    }

    public boolean d() {
        k kVar = this.f132j;
        return kVar != null && kVar.b();
    }

    protected void e() {
        this.f132j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f133k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean z) {
        this.f130h = z;
        k kVar = this.f132j;
        if (kVar != null) {
            kVar.r(z);
        }
    }

    public void h(int i2) {
        this.f129g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f133k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f131i = aVar;
        k kVar = this.f132j;
        if (kVar != null) {
            kVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }
}
