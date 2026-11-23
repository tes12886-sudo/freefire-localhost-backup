package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class e extends ComponentActivity implements androidx.core.app.a.c, androidx.core.app.a.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f397l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final i f394i = i.b(new c());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final androidx.lifecycle.l f395j = new androidx.lifecycle.l(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f398m = true;

    class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.v();
            e.this.f395j.h(androidx.lifecycle.g.b.ON_STOP);
            Parcelable parcelableX = e.this.f394i.x();
            if (parcelableX != null) {
                bundle.putParcelable("android:support:fragments", parcelableX);
            }
            return bundle;
        }
    }

    class b implements androidx.activity.d.b {
        b() {
        }

        @Override // androidx.activity.d.b
        public void a(Context context) {
            e.this.f394i.a(null);
            Bundle bundleA = e.this.d().a("android:support:fragments");
            if (bundleA != null) {
                e.this.f394i.w(bundleA.getParcelable("android:support:fragments"));
            }
        }
    }

    class c extends k<e> implements androidx.lifecycle.y, androidx.activity.c, androidx.activity.result.e, r {
        public c() {
            super(e.this);
        }

        @Override // androidx.lifecycle.k
        public androidx.lifecycle.g a() {
            return e.this.f395j;
        }

        @Override // androidx.fragment.app.r
        public void b(n nVar, Fragment fragment) {
            e.this.x(fragment);
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher c() {
            return e.this.c();
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public View f(int i2) {
            return e.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public boolean g() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.e
        public androidx.activity.result.d h() {
            return e.this.h();
        }

        @Override // androidx.lifecycle.y
        public androidx.lifecycle.x j() {
            return e.this.j();
        }

        @Override // androidx.fragment.app.k
        public LayoutInflater n() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.fragment.app.k
        public boolean o(Fragment fragment) {
            return !e.this.isFinishing();
        }

        @Override // androidx.fragment.app.k
        public void q() {
            e.this.A();
        }

        @Override // androidx.fragment.app.k
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public e m() {
            return e.this;
        }
    }

    public e() {
        u();
    }

    private void u() {
        d().d("android:support:fragments", new a());
        n(new b());
    }

    private static boolean w(n nVar, androidx.lifecycle.g.c cVar) {
        boolean zW = false;
        for (Fragment fragment : nVar.s0()) {
            if (fragment != null) {
                if (fragment.B() != null) {
                    zW |= w(fragment.r(), cVar);
                }
                a0 a0Var = fragment.b0;
                if (a0Var != null && a0Var.a().b().a(androidx.lifecycle.g.c.STARTED)) {
                    fragment.b0.i(cVar);
                    zW = true;
                }
                if (fragment.a0.b().a(androidx.lifecycle.g.c.STARTED)) {
                    fragment.a0.o(cVar);
                    zW = true;
                }
            }
        }
        return zW;
    }

    @Deprecated
    public void A() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.a.e
    @Deprecated
    public final void b(int i2) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f396k);
        printWriter.print(" mResumed=");
        printWriter.print(this.f397l);
        printWriter.print(" mStopped=");
        printWriter.print(this.f398m);
        if (getApplication() != null) {
            h.p.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f394i.t().X(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.f394i.u();
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f394i.u();
        super.onConfigurationChanged(configuration);
        this.f394i.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f395j.h(androidx.lifecycle.g.b.ON_CREATE);
        this.f394i.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.f394i.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewR = r(view, str, context, attributeSet);
        return viewR == null ? super.onCreateView(view, str, context, attributeSet) : viewR;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewR = r(null, str, context, attributeSet);
        return viewR == null ? super.onCreateView(str, context, attributeSet) : viewR;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f394i.h();
        this.f395j.h(androidx.lifecycle.g.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f394i.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f394i.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f394i.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f394i.j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f394i.u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f394i.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f397l = false;
        this.f394i.m();
        this.f395j.h(androidx.lifecycle.g.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f394i.n(z);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        z();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? y(view, menu) | this.f394i.o(menu) : super.onPreparePanel(i2, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f394i.u();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f394i.u();
        super.onResume();
        this.f397l = true;
        this.f394i.s();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f394i.u();
        super.onStart();
        this.f398m = false;
        if (!this.f396k) {
            this.f396k = true;
            this.f394i.c();
        }
        this.f394i.s();
        this.f395j.h(androidx.lifecycle.g.b.ON_START);
        this.f394i.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f394i.u();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f398m = true;
        v();
        this.f394i.r();
        this.f395j.h(androidx.lifecycle.g.b.ON_STOP);
    }

    final View r(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f394i.v(view, str, context, attributeSet);
    }

    public n s() {
        return this.f394i.t();
    }

    @Deprecated
    public h.p.a.a t() {
        return h.p.a.a.b(this);
    }

    void v() {
        while (w(s(), androidx.lifecycle.g.c.CREATED)) {
        }
    }

    @Deprecated
    public void x(Fragment fragment) {
    }

    @Deprecated
    protected boolean y(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void z() {
        this.f395j.h(androidx.lifecycle.g.b.ON_RESUME);
        this.f394i.p();
    }
}
