package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private final k<?> a;

    private i(k<?> kVar) {
        this.a = kVar;
    }

    public static i b(k<?> kVar) {
        h.h.k.e.g(kVar, "callbacks == null");
        return new i(kVar);
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.a;
        kVar.d.k(kVar, kVar, fragment);
    }

    public void c() {
        this.a.d.z();
    }

    public void d(Configuration configuration) {
        this.a.d.B(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.d.C(menuItem);
    }

    public void f() {
        this.a.d.D();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.d.E(menu, menuInflater);
    }

    public void h() {
        this.a.d.F();
    }

    public void i() {
        this.a.d.H();
    }

    public void j(boolean z) {
        this.a.d.I(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.d.K(menuItem);
    }

    public void l(Menu menu) {
        this.a.d.L(menu);
    }

    public void m() {
        this.a.d.N();
    }

    public void n(boolean z) {
        this.a.d.O(z);
    }

    public boolean o(Menu menu) {
        return this.a.d.P(menu);
    }

    public void p() {
        this.a.d.R();
    }

    public void q() {
        this.a.d.S();
    }

    public void r() {
        this.a.d.U();
    }

    public boolean s() {
        return this.a.d.b0(true);
    }

    public n t() {
        return this.a.d;
    }

    public void u() {
        this.a.d.R0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.d.u0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.a;
        if (!(kVar instanceof androidx.lifecycle.y)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        kVar.d.e1(parcelable);
    }

    public Parcelable x() {
        return this.a.d.g1();
    }
}
