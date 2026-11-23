package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.app.f;
import androidx.lifecycle.a0;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends f implements k, y, androidx.savedstate.c, androidx.activity.c, androidx.activity.result.e {
    private x e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.activity.result.d f12h;
    final androidx.activity.d.a b = new androidx.activity.d.a();
    private final l c = new l(this);
    final androidx.savedstate.b d = androidx.savedstate.b.a(this);
    private final OnBackPressedDispatcher f = new OnBackPressedDispatcher(new a());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    class b extends androidx.activity.result.d {

        class a implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ androidx.activity.result.g.a.C0007a b;

            a(int i2, androidx.activity.result.g.a.C0007a c0007a) {
                this.a = i2;
                this.b = c0007a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.a, this.b.a());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        class RunnableC0005b implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ IntentSender.SendIntentException b;

            RunnableC0005b(int i2, IntentSender.SendIntentException sendIntentException) {
                this.a = i2;
                this.b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.b));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.d
        public <I, O> void f(int i2, androidx.activity.result.g.a<I, O> aVar, I i3, androidx.core.app.b bVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            androidx.activity.result.g.a.C0007a<O> c0007aB = aVar.b(componentActivity, i3);
            if (c0007aB != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, c0007aB));
                return;
            }
            Intent intentA = aVar.a(componentActivity, i3);
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                if (bVar != null) {
                    bVar.a();
                    throw null;
                }
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.a.o(componentActivity, stringArrayExtra, i2);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                androidx.core.app.a.q(componentActivity, intentA, i2, bundle);
                return;
            }
            androidx.activity.result.f fVar = (androidx.activity.result.f) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                androidx.core.app.a.r(componentActivity, fVar.d(), i2, fVar.a(), fVar.b(), fVar.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0005b(i2, e));
            }
        }
    }

    class c implements SavedStateRegistry.b {
        c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @SuppressLint({"SyntheticAccessor"})
        public Bundle a() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.f12h.h(bundle);
            return bundle;
        }
    }

    class d implements androidx.activity.d.b {
        d() {
        }

        @Override // androidx.activity.d.b
        @SuppressLint({"SyntheticAccessor"})
        public void a(Context context) {
            Bundle bundleA = ComponentActivity.this.d().a("android:support:activity-result");
            if (bundleA != null) {
                ComponentActivity.this.f12h.g(bundleA);
            }
        }
    }

    static final class e {
        Object a;
        x b;

        e() {
        }
    }

    public ComponentActivity() {
        new AtomicInteger();
        this.f12h = new b();
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            a().a(new i() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.i
                public void d(k kVar, g.b bVar) {
                    if (bVar == g.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        a().a(new i() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.i
            public void d(k kVar, g.b bVar) {
                if (bVar == g.b.ON_DESTROY) {
                    ComponentActivity.this.b.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.j().a();
                }
            }
        });
        a().a(new i() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.i
            public void d(k kVar, g.b bVar) {
                ComponentActivity.this.o();
                ComponentActivity.this.a().c(this);
            }
        });
        if (19 <= i2 && i2 <= 23) {
            a().a(new ImmLeaksCleaner(this));
        }
        d().d("android:support:activity-result", new c());
        n(new d());
    }

    private void p() {
        z.a(getWindow().getDecorView(), this);
        a0.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.lifecycle.k
    public g a() {
        return this.c;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        p();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher c() {
        return this.f;
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry d() {
        return this.d.b();
    }

    @Override // androidx.activity.result.e
    public final androidx.activity.result.d h() {
        return this.f12h;
    }

    @Override // androidx.lifecycle.y
    public x j() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        o();
        return this.e;
    }

    public final void n(androidx.activity.d.b bVar) {
        this.b.a(bVar);
    }

    void o() {
        if (this.e == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.e = eVar.b;
            }
            if (this.e == null) {
                this.e = new x();
            }
        }
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f12h.b(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f.c();
    }

    @Override // androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.d.c(bundle);
        this.b.c(this);
        super.onCreate(bundle);
        t.g(this);
        int i2 = this.f11g;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.f12h.b(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object objQ = q();
        x xVar = this.e;
        if (xVar == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            xVar = eVar.b;
        }
        if (xVar == null && objQ == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.a = objQ;
        eVar2.b = xVar;
        return eVar2;
    }

    @Override // androidx.core.app.f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        g gVarA = a();
        if (gVarA instanceof l) {
            ((l) gVarA).o(g.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.d.d(bundle);
    }

    @Deprecated
    public Object q() {
        return null;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (h.s.a.d()) {
                h.s.a.a("reportFullyDrawn() for " + getComponentName());
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 19 || (i2 == 19 && androidx.core.content.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            h.s.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        p();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        p();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        p();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
