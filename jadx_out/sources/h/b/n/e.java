package h.b.n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.g.a {
    private Context c;
    private ActionBarContextView d;
    private b.a e;
    private WeakReference<View> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f1757h;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = aVar;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(actionBarContextView.getContext());
        gVar.S(1);
        this.f1757h = gVar;
        gVar.R(this);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.d.l();
    }

    @Override // h.b.n.b
    public void c() {
        if (this.f1756g) {
            return;
        }
        this.f1756g = true;
        this.e.b(this);
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
        return this.f1757h;
    }

    @Override // h.b.n.b
    public MenuInflater f() {
        return new g(this.d.getContext());
    }

    @Override // h.b.n.b
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // h.b.n.b
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override // h.b.n.b
    public void k() {
        this.e.a(this, this.f1757h);
    }

    @Override // h.b.n.b
    public boolean l() {
        return this.d.j();
    }

    @Override // h.b.n.b
    public void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // h.b.n.b
    public void n(int i2) {
        o(this.c.getString(i2));
    }

    @Override // h.b.n.b
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // h.b.n.b
    public void q(int i2) {
        r(this.c.getString(i2));
    }

    @Override // h.b.n.b
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // h.b.n.b
    public void s(boolean z) {
        super.s(z);
        this.d.setTitleOptional(z);
    }
}
