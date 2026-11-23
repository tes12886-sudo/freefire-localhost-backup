package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.f1;
import androidx.core.app.p;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.fragment.app.e implements d, p.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f34n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Resources f35o;

    class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.B().u(bundle);
            return bundle;
        }
    }

    class b implements androidx.activity.d.b {
        b() {
        }

        @Override // androidx.activity.d.b
        public void a(Context context) {
            e eVarB = c.this.B();
            eVarB.n();
            eVarB.q(c.this.d().a("androidx:appcompat"));
        }
    }

    public c() {
        D();
    }

    private void D() {
        d().d("androidx:appcompat", new a());
        n(new b());
    }

    private boolean J(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    private void p() {
        z.a(getWindow().getDecorView(), this);
        a0.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.fragment.app.e
    public void A() {
        B().o();
    }

    public e B() {
        if (this.f34n == null) {
            this.f34n = e.g(this, this);
        }
        return this.f34n;
    }

    public androidx.appcompat.app.a C() {
        return B().m();
    }

    public void E(p pVar) {
        pVar.c(this);
    }

    protected void F(int i2) {
    }

    public void G(p pVar) {
    }

    @Deprecated
    public void H() {
    }

    public boolean I() {
        Intent intentI = i();
        if (intentI == null) {
            return false;
        }
        if (!L(intentI)) {
            K(intentI);
            return true;
        }
        p pVarF = p.f(this);
        E(pVarF);
        G(pVarF);
        pVarF.h();
        try {
            androidx.core.app.a.m(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void K(Intent intent) {
        androidx.core.app.g.e(this, intent);
    }

    public boolean L(Intent intent) {
        return androidx.core.app.g.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        B().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(B().f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a aVarC = C();
        if (getWindow().hasFeature(0)) {
            if (aVarC == null || !aVarC.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a aVarC = C();
        if (keyCode == 82 && aVarC != null && aVarC.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.d
    public void f(h.b.n.b bVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) B().i(i2);
    }

    @Override // androidx.appcompat.app.d
    public void g(h.b.n.b bVar) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return B().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f35o == null && f1.c()) {
            this.f35o = new f1(this, super.getResources());
        }
        Resources resources = this.f35o;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.core.app.p.a
    public Intent i() {
        return androidx.core.app.g.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        B().o();
    }

    @Override // androidx.appcompat.app.d
    public h.b.n.b k(h.b.n.b.a aVar) {
        return null;
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f35o != null) {
            this.f35o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        B().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        H();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        B().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (J(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a aVarC = C();
        if (menuItem.getItemId() != 16908332 || aVarC == null || (aVarC.j() & 4) == 0) {
            return false;
        }
        return I();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        B().s(bundle);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        B().t();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        B().v();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStop() {
        super.onStop();
        B().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        B().E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a aVarC = C();
        if (getWindow().hasFeature(0)) {
            if (aVarC == null || !aVarC.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
        p();
        B().A(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        p();
        B().B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        B().C(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        B().D(i2);
    }
}
