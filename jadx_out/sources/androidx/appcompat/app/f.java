package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.k0;
import com.appff.haptic.base.Utils;
import h.h.l.c0;
import h.h.l.e0;
import h.h.l.y;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class f extends androidx.appcompat.app.e implements androidx.appcompat.view.menu.g.a, LayoutInflater.Factory2 {
    private static final h.f.g<String, Integer> k0 = new h.f.g<>();
    private static final boolean l0;
    private static final int[] m0;
    private static final boolean n0;
    private static final boolean o0;
    private static boolean p0;
    private TextView F;
    private View G;
    private boolean H;
    private boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    private boolean O;
    private u[] P;
    private u Q;
    private boolean R;
    private boolean S;
    private boolean T;
    boolean U;
    private Configuration V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private q a0;
    private q b0;
    boolean c0;
    final Object d;
    int d0;
    final Context e;
    private final Runnable e0;
    Window f;
    private boolean f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o f36g;
    private Rect g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final androidx.appcompat.app.d f37h;
    private Rect h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    androidx.appcompat.app.a f38i;
    private androidx.appcompat.app.h i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    MenuInflater f39j;
    private androidx.appcompat.app.i j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f40k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g0 f41l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i f42m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private v f43n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    h.b.n.b f44o;
    ActionBarContextView p;
    PopupWindow q;
    Runnable r;
    c0 s;
    private boolean t;
    private boolean u;
    ViewGroup v;

    class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.a.uncaughtException(thread, notFoundException);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.d0 & 1) != 0) {
                fVar.U(0);
            }
            f fVar2 = f.this;
            if ((fVar2.d0 & Utils.CONTINUOUS_EVENT) != 0) {
                fVar2.U(108);
            }
            f fVar3 = f.this;
            fVar3.c0 = false;
            fVar3.d0 = 0;
        }
    }

    class c implements h.h.l.t {
        c() {
        }

        @Override // h.h.l.t
        public h.h.l.g0 a(View view, h.h.l.g0 g0Var) {
            int iK = g0Var.k();
            int iL0 = f.this.L0(g0Var, null);
            if (iK != iL0) {
                g0Var = g0Var.o(g0Var.i(), iL0, g0Var.j(), g0Var.h());
            }
            return y.E(view, g0Var);
        }
    }

    class d implements k0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.k0.a
        public void a(Rect rect) {
            rect.top = f.this.L0(null, rect);
        }
    }

    class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.S();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.f$f, reason: collision with other inner class name */
    class RunnableC0009f implements Runnable {

        /* JADX INFO: renamed from: androidx.appcompat.app.f$f$a */
        class a extends e0 {
            a() {
            }

            @Override // h.h.l.d0
            public void b(View view) {
                f.this.p.setAlpha(1.0f);
                f.this.s.f(null);
                f.this.s = null;
            }

            @Override // h.h.l.e0, h.h.l.d0
            public void c(View view) {
                f.this.p.setVisibility(0);
            }
        }

        RunnableC0009f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.q.showAtLocation(fVar.p, 55, 0, 0);
            f.this.V();
            if (!f.this.D0()) {
                f.this.p.setAlpha(1.0f);
                f.this.p.setVisibility(0);
                return;
            }
            f.this.p.setAlpha(0.0f);
            f fVar2 = f.this;
            c0 c0VarB = y.b(fVar2.p);
            c0VarB.a(1.0f);
            fVar2.s = c0VarB;
            f.this.s.f(new a());
        }
    }

    class g extends e0 {
        g() {
        }

        @Override // h.h.l.d0
        public void b(View view) {
            f.this.p.setAlpha(1.0f);
            f.this.s.f(null);
            f.this.s = null;
        }

        @Override // h.h.l.e0, h.h.l.d0
        public void c(View view) {
            f.this.p.setVisibility(0);
            if (f.this.p.getParent() instanceof View) {
                y.K((View) f.this.p.getParent());
            }
        }
    }

    interface h {
        boolean a(int i2);

        View onCreatePanelView(int i2);
    }

    private final class i implements androidx.appcompat.view.menu.m.a {
        i() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.L(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackF0 = f.this.f0();
            if (callbackF0 == null) {
                return true;
            }
            callbackF0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class j implements h.b.n.b.a {
        private h.b.n.b.a a;

        class a extends e0 {
            a() {
            }

            @Override // h.h.l.d0
            public void b(View view) {
                f.this.p.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.p.getParent() instanceof View) {
                    y.K((View) f.this.p.getParent());
                }
                f.this.p.k();
                f.this.s.f(null);
                f fVar2 = f.this;
                fVar2.s = null;
                y.K(fVar2.v);
            }
        }

        public j(h.b.n.b.a aVar) {
            this.a = aVar;
        }

        @Override // h.b.n.b.a
        public boolean a(h.b.n.b bVar, Menu menu) {
            y.K(f.this.v);
            return this.a.a(bVar, menu);
        }

        @Override // h.b.n.b.a
        public void b(h.b.n.b bVar) {
            this.a.b(bVar);
            f fVar = f.this;
            if (fVar.q != null) {
                fVar.f.getDecorView().removeCallbacks(f.this.r);
            }
            f fVar2 = f.this;
            if (fVar2.p != null) {
                fVar2.V();
                f fVar3 = f.this;
                c0 c0VarB = y.b(fVar3.p);
                c0VarB.a(0.0f);
                fVar3.s = c0VarB;
                f.this.s.f(new a());
            }
            f fVar4 = f.this;
            androidx.appcompat.app.d dVar = fVar4.f37h;
            if (dVar != null) {
                dVar.g(fVar4.f44o);
            }
            f fVar5 = f.this;
            fVar5.f44o = null;
            y.K(fVar5.v);
        }

        @Override // h.b.n.b.a
        public boolean c(h.b.n.b bVar, MenuItem menuItem) {
            return this.a.c(bVar, menuItem);
        }

        @Override // h.b.n.b.a
        public boolean d(h.b.n.b bVar, Menu menu) {
            return this.a.d(bVar, menu);
        }
    }

    static class k {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }
    }

    static class l {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    class o extends h.b.n.i {
        private h b;

        o(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            h.b.n.f.a aVar = new h.b.n.f.a(f.this.e, callback);
            h.b.n.b bVarF0 = f.this.F0(aVar);
            if (bVarF0 != null) {
                return aVar.e(bVarF0);
            }
            return null;
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            View viewOnCreatePanelView;
            h hVar = this.b;
            return (hVar == null || (viewOnCreatePanelView = hVar.onCreatePanelView(i2)) == null) ? super.onCreatePanelView(i2) : viewOnCreatePanelView;
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            f.this.u0(i2);
            return true;
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            f.this.v0(i2);
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            h hVar = this.b;
            boolean zOnPreparePanel = hVar != null && hVar.a(i2);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            }
            if (gVar != null) {
                gVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.g gVar;
            u uVarD0 = f.this.d0(0, true);
            if (uVarD0 == null || (gVar = uVarD0.f49j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i2);
            }
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.m0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // h.b.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (f.this.m0() && i2 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i2);
        }
    }

    private class p extends q {
        private final PowerManager c;

        p(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.f.q
        IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.q
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !l.a(this.c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.f.q
        public void d() {
            f.this.F();
        }
    }

    abstract class q {
        private BroadcastReceiver a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    f.this.e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            f.this.e.registerReceiver(this.a, intentFilterB);
        }
    }

    private class r extends q {
        private final androidx.appcompat.app.l c;

        r(androidx.appcompat.app.l lVar) {
            super();
            this.c = lVar;
        }

        @Override // androidx.appcompat.app.f.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.q
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.q
        public void d() {
            f.this.F();
        }
    }

    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.N(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(h.b.k.a.a.b(getContext(), i2));
        }
    }

    protected static final class u {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f46g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f47h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f48i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f49j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f50k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f51l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f52m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f53n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f54o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        u(int i2) {
            this.a = i2;
        }

        androidx.appcompat.view.menu.n a(androidx.appcompat.view.menu.m.a aVar) {
            if (this.f49j == null) {
                return null;
            }
            if (this.f50k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f51l, h.b.g.f1708j);
                this.f50k = eVar;
                eVar.k(aVar);
                this.f49j.b(this.f50k);
            }
            return this.f50k.d(this.f46g);
        }

        public boolean b() {
            if (this.f47h == null) {
                return false;
            }
            return this.f48i != null || this.f50k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f49j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f50k);
            }
            this.f49j = gVar;
            if (gVar == null || (eVar = this.f50k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(h.b.a.a, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            }
            themeNewTheme.resolveAttribute(h.b.a.E, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = h.b.i.b;
            }
            themeNewTheme.applyStyle(i3, true);
            h.b.n.d dVar = new h.b.n.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f51l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(h.b.j.v0);
            this.b = typedArrayObtainStyledAttributes.getResourceId(h.b.j.y0, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(h.b.j.x0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class v implements androidx.appcompat.view.menu.m.a {
        v() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g gVarD = gVar.D();
            boolean z2 = gVarD != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = gVarD;
            }
            u uVarY = fVar.Y(gVar);
            if (uVarY != null) {
                if (!z2) {
                    f.this.O(uVarY, z);
                } else {
                    f.this.K(uVarY.a, uVarY, gVarD);
                    f.this.O(uVarY, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackF0;
            if (gVar != gVar.D()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.J || (callbackF0 = fVar.f0()) == null || f.this.U) {
                return true;
            }
            callbackF0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 < 21;
        l0 = z;
        m0 = new int[]{R.attr.windowBackground};
        n0 = !"robolectric".equals(Build.FINGERPRINT);
        o0 = i2 >= 17;
        if (!z || p0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        p0 = true;
    }

    f(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    f(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private f(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        h.f.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.c cVarI0;
        this.s = null;
        this.t = true;
        this.W = -100;
        this.e0 = new b();
        this.e = context;
        this.f37h = dVar;
        this.d = obj;
        if ((obj instanceof Dialog) && (cVarI0 = I0()) != null) {
            this.W = cVarI0.B().k();
        }
        if (this.W == -100 && (num = (gVar = k0).get(obj.getClass().getName())) != null) {
            this.W = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            I(window);
        }
        androidx.appcompat.widget.l.h();
    }

    private boolean A0(u uVar, KeyEvent keyEvent) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        if (this.U) {
            return false;
        }
        if (uVar.f52m) {
            return true;
        }
        u uVar2 = this.Q;
        if (uVar2 != null && uVar2 != uVar) {
            O(uVar2, false);
        }
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null) {
            uVar.f48i = callbackF0.onCreatePanelView(uVar.a);
        }
        int i2 = uVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (g0Var4 = this.f41l) != null) {
            g0Var4.d();
        }
        if (uVar.f48i == null) {
            if (z) {
                y0();
            }
            androidx.appcompat.view.menu.g gVar = uVar.f49j;
            if (gVar == null || uVar.r) {
                if (gVar == null && (!j0(uVar) || uVar.f49j == null)) {
                    return false;
                }
                if (z && (g0Var2 = this.f41l) != null) {
                    if (this.f42m == null) {
                        this.f42m = new i();
                    }
                    g0Var2.b(uVar.f49j, this.f42m);
                }
                uVar.f49j.d0();
                if (!callbackF0.onCreatePanelMenu(uVar.a, uVar.f49j)) {
                    uVar.c(null);
                    if (z && (g0Var = this.f41l) != null) {
                        g0Var.b(null, this.f42m);
                    }
                    return false;
                }
                uVar.r = false;
            }
            uVar.f49j.d0();
            Bundle bundle = uVar.s;
            if (bundle != null) {
                uVar.f49j.P(bundle);
                uVar.s = null;
            }
            if (!callbackF0.onPreparePanel(0, uVar.f48i, uVar.f49j)) {
                if (z && (g0Var3 = this.f41l) != null) {
                    g0Var3.b(null, this.f42m);
                }
                uVar.f49j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.p = z2;
            uVar.f49j.setQwertyMode(z2);
            uVar.f49j.c0();
        }
        uVar.f52m = true;
        uVar.f53n = false;
        this.Q = uVar;
        return true;
    }

    private void B0(boolean z) {
        g0 g0Var = this.f41l;
        if (g0Var == null || !g0Var.h() || (ViewConfiguration.get(this.e).hasPermanentMenuKey() && !this.f41l.e())) {
            u uVarD0 = d0(0, true);
            uVarD0.q = true;
            O(uVarD0, false);
            x0(uVarD0, null);
            return;
        }
        Window.Callback callbackF0 = f0();
        if (this.f41l.c() && z) {
            this.f41l.f();
            if (this.U) {
                return;
            }
            callbackF0.onPanelClosed(108, d0(0, true).f49j);
            return;
        }
        if (callbackF0 == null || this.U) {
            return;
        }
        if (this.c0 && (this.d0 & 1) != 0) {
            this.f.getDecorView().removeCallbacks(this.e0);
            this.e0.run();
        }
        u uVarD1 = d0(0, true);
        androidx.appcompat.view.menu.g gVar = uVarD1.f49j;
        if (gVar == null || uVarD1.r || !callbackF0.onPreparePanel(0, uVarD1.f48i, gVar)) {
            return;
        }
        callbackF0.onMenuOpened(108, uVarD1.f49j);
        this.f41l.g();
    }

    private int C0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || y.z((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean G(boolean z) {
        if (this.U) {
            return false;
        }
        int iJ = J();
        boolean zJ0 = J0(n0(this.e, iJ), z);
        if (iJ == 0) {
            c0(this.e).e();
        } else {
            q qVar = this.a0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (iJ == 3) {
            b0(this.e).e();
        } else {
            q qVar2 = this.b0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return zJ0;
    }

    private void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.v.findViewById(R.id.content);
        View decorView = this.f.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.e.obtainStyledAttributes(h.b.j.v0);
        typedArrayObtainStyledAttributes.getValue(h.b.j.H0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(h.b.j.I0, contentFrameLayout.getMinWidthMinor());
        int i2 = h.b.j.F0;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = h.b.j.G0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = h.b.j.D0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = h.b.j.E0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void H0() {
        if (this.u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void I(Window window) {
        if (this.f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.f36g = oVar;
        window.setCallback(oVar);
        a1 a1VarT = a1.t(this.e, null, m0);
        Drawable drawableG = a1VarT.g(0);
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        a1VarT.v();
        this.f = window;
    }

    private androidx.appcompat.app.c I0() {
        for (Context baseContext = this.e; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int J() {
        int i2 = this.W;
        return i2 != -100 ? i2 : androidx.appcompat.app.e.j();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    private boolean J0(int i2, boolean z) {
        boolean z2;
        Configuration configurationP = P(this.e, i2, null);
        boolean zL0 = l0();
        Configuration configuration = this.V;
        if (configuration == null) {
            configuration = this.e.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = configurationP.uiMode & 48;
        boolean z3 = true;
        if (i3 != i4 && z && !zL0 && this.S && (n0 || this.T)) {
            Object obj = this.d;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z2 = false;
            } else {
                androidx.core.app.a.n((Activity) this.d);
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2 || i3 == i4) {
            z3 = z2;
        } else {
            K0(i4, zL0, null);
        }
        if (z3) {
            Object obj2 = this.d;
            if (obj2 instanceof androidx.appcompat.app.c) {
                ((androidx.appcompat.app.c) obj2).F(i2);
            }
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(int i2, boolean z, Configuration configuration) {
        Resources resources = this.e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            androidx.appcompat.app.j.a(resources);
        }
        int i4 = this.X;
        if (i4 != 0) {
            this.e.setTheme(i4);
            if (i3 >= 23) {
                this.e.getTheme().applyStyle(this.X, true);
            }
        }
        if (z) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.k) {
                    if (!((androidx.lifecycle.k) activity).a().b().a(androidx.lifecycle.g.c.CREATED)) {
                        return;
                    }
                } else if (!this.T || this.U) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void M() {
        q qVar = this.a0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.b0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    private void M0(View view) {
        Context context;
        int i2;
        if ((y.w(view) & 8192) != 0) {
            context = this.e;
            i2 = h.b.c.b;
        } else {
            context = this.e;
            i2 = h.b.c.a;
        }
        view.setBackgroundColor(androidx.core.content.a.d(context, i2));
    }

    private Configuration P(Context context, int i2, Configuration configuration) {
        int i3;
        if (i2 != 1) {
            i3 = i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.e.obtainStyledAttributes(h.b.j.v0);
        int i2 = h.b.j.A0;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.b.j.J0, false)) {
            z(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            z(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.b.j.B0, false)) {
            z(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.b.j.C0, false)) {
            z(10);
        }
        this.M = typedArrayObtainStyledAttributes.getBoolean(h.b.j.w0, false);
        typedArrayObtainStyledAttributes.recycle();
        X();
        this.f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.e);
        if (this.N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.L ? h.b.g.f1713o : h.b.g.f1712n, (ViewGroup) null);
        } else if (this.M) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(h.b.g.f, (ViewGroup) null);
            this.K = false;
            this.J = false;
        } else if (this.J) {
            TypedValue typedValue = new TypedValue();
            this.e.getTheme().resolveAttribute(h.b.a.f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new h.b.n.d(this.e, typedValue.resourceId) : this.e).inflate(h.b.g.p, (ViewGroup) null);
            g0 g0Var = (g0) viewGroup.findViewById(h.b.f.p);
            this.f41l = g0Var;
            g0Var.setWindowCallback(f0());
            if (this.K) {
                this.f41l.k(109);
            }
            if (this.H) {
                this.f41l.k(2);
            }
            if (this.I) {
                this.f41l.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.J + ", windowActionBarOverlay: " + this.K + ", android:windowIsFloating: " + this.M + ", windowActionModeOverlay: " + this.L + ", windowNoTitle: " + this.N + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            y.V(viewGroup, new c());
        } else if (viewGroup instanceof k0) {
            ((k0) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.f41l == null) {
            this.F = (TextView) viewGroup.findViewById(h.b.f.M);
        }
        g1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(h.b.f.b);
        ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void W() {
        if (this.u) {
            return;
        }
        this.v = Q();
        CharSequence charSequenceE0 = e0();
        if (!TextUtils.isEmpty(charSequenceE0)) {
            g0 g0Var = this.f41l;
            if (g0Var != null) {
                g0Var.setWindowTitle(charSequenceE0);
            } else if (y0() != null) {
                y0().t(charSequenceE0);
            } else {
                TextView textView = this.F;
                if (textView != null) {
                    textView.setText(charSequenceE0);
                }
            }
        }
        H();
        w0(this.v);
        this.u = true;
        u uVarD0 = d0(0, false);
        if (this.U) {
            return;
        }
        if (uVarD0 == null || uVarD0.f49j == null) {
            k0(108);
        }
    }

    private void X() {
        if (this.f == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                m.a(configuration, configuration2, configuration3);
            } else if (!h.h.k.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & j.d.a.e.a.a.i.g.STATUS_RUNNING;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & j.d.a.e.a.a.i.g.STATUS_RUNNING)) {
                configuration3.screenLayout |= i22 & j.d.a.e.a.a.i.g.STATUS_RUNNING;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            if (i6 >= 17) {
                k.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private q b0(Context context) {
        if (this.b0 == null) {
            this.b0 = new p(context);
        }
        return this.b0;
    }

    private q c0(Context context) {
        if (this.a0 == null) {
            this.a0 = new r(androidx.appcompat.app.l.a(context));
        }
        return this.a0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    private void g0() {
        androidx.appcompat.app.m mVar;
        androidx.appcompat.app.a aVar;
        W();
        if (this.J && this.f38i == null) {
            Object obj = this.d;
            if (!(obj instanceof Activity)) {
                if (obj instanceof Dialog) {
                    mVar = new androidx.appcompat.app.m((Dialog) this.d);
                }
                aVar = this.f38i;
                if (aVar != null) {
                    aVar.r(this.f0);
                }
            }
            mVar = new androidx.appcompat.app.m((Activity) this.d, this.K);
            this.f38i = mVar;
            aVar = this.f38i;
            if (aVar != null) {
                aVar.r(this.f0);
            }
        }
    }

    private boolean h0(u uVar) {
        View view = uVar.f48i;
        if (view != null) {
            uVar.f47h = view;
            return true;
        }
        if (uVar.f49j == null) {
            return false;
        }
        if (this.f43n == null) {
            this.f43n = new v();
        }
        View view2 = (View) uVar.a(this.f43n);
        uVar.f47h = view2;
        return view2 != null;
    }

    private boolean i0(u uVar) {
        uVar.d(a0());
        uVar.f46g = new t(uVar.f51l);
        uVar.c = 81;
        return true;
    }

    private boolean j0(u uVar) {
        Context context = this.e;
        int i2 = uVar.a;
        if ((i2 == 0 || i2 == 108) && this.f41l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(h.b.a.f, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(h.b.a.f1667g, typedValue, true);
            } else {
                theme.resolveAttribute(h.b.a.f1667g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                h.b.n.d dVar = new h.b.n.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        uVar.c(gVar);
        return true;
    }

    private void k0(int i2) {
        this.d0 = (1 << i2) | this.d0;
        if (this.c0) {
            return;
        }
        y.I(this.f.getDecorView(), this.e0);
        this.c0 = true;
    }

    private boolean l0() {
        int i2;
        if (!this.Z && (this.d instanceof Activity)) {
            PackageManager packageManager = this.e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    i2 = 269221888;
                } else {
                    i2 = i3 >= 24 ? 786432 : 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.e, this.d.getClass()), i2);
                this.Y = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Y = false;
            }
        }
        this.Z = true;
        return this.Y;
    }

    private boolean q0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u uVarD0 = d0(i2, true);
        if (uVarD0.f54o) {
            return false;
        }
        return A0(uVarD0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean t0(int i2, KeyEvent keyEvent) {
        boolean zA0;
        g0 g0Var;
        if (this.f44o != null) {
            return false;
        }
        boolean zF = true;
        u uVarD0 = d0(i2, true);
        if (i2 != 0 || (g0Var = this.f41l) == null || !g0Var.h() || ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
            boolean z = uVarD0.f54o;
            if (z || uVarD0.f53n) {
                O(uVarD0, true);
                zF = z;
            } else if (uVarD0.f52m) {
                if (uVarD0.r) {
                    uVarD0.f52m = false;
                    zA0 = A0(uVarD0, keyEvent);
                } else {
                    zA0 = true;
                }
                if (zA0) {
                    x0(uVarD0, keyEvent);
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
        } else if (this.f41l.c()) {
            zF = this.f41l.f();
        } else if (this.U || !A0(uVarD0, keyEvent)) {
            zF = false;
        } else {
            zF = this.f41l.g();
        }
        if (zF) {
            AudioManager audioManager = (AudioManager) this.e.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zF;
    }

    private void x0(u uVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (uVar.f54o || this.U) {
            return;
        }
        if (uVar.a == 0) {
            if ((this.e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null && !callbackF0.onMenuOpened(uVar.a, uVar.f49j)) {
            O(uVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && A0(uVar, keyEvent)) {
            ViewGroup viewGroup = uVar.f46g;
            if (viewGroup != null && !uVar.q) {
                View view = uVar.f48i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                uVar.f53n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, uVar.d, uVar.e, 1002, 8519680, -3);
                layoutParams2.gravity = uVar.c;
                layoutParams2.windowAnimations = uVar.f;
                windowManager.addView(uVar.f46g, layoutParams2);
                uVar.f54o = true;
            }
            if (viewGroup == null) {
                if (!i0(uVar) || uVar.f46g == null) {
                    return;
                }
            } else if (uVar.q && viewGroup.getChildCount() > 0) {
                uVar.f46g.removeAllViews();
            }
            if (!h0(uVar) || !uVar.b()) {
                uVar.q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = uVar.f47h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            uVar.f46g.setBackgroundResource(uVar.b);
            ViewParent parent = uVar.f47h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(uVar.f47h);
            }
            uVar.f46g.addView(uVar.f47h, layoutParams3);
            if (!uVar.f47h.hasFocus()) {
                uVar.f47h.requestFocus();
            }
            i2 = -2;
            uVar.f53n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i2, -2, uVar.d, uVar.e, 1002, 8519680, -3);
            layoutParams4.gravity = uVar.c;
            layoutParams4.windowAnimations = uVar.f;
            windowManager.addView(uVar.f46g, layoutParams4);
            uVar.f54o = true;
        }
    }

    private boolean z0(u uVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f52m || A0(uVar, keyEvent)) && (gVar = uVar.f49j) != null) {
            zPerformShortcut = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.f41l == null) {
            O(uVar, true);
        }
        return zPerformShortcut;
    }

    @Override // androidx.appcompat.app.e
    public void A(int i2) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i2, viewGroup);
        this.f36g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f36g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f36g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void D(int i2) {
        this.X = i2;
    }

    final boolean D0() {
        ViewGroup viewGroup;
        return this.u && (viewGroup = this.v) != null && y.A(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public final void E(CharSequence charSequence) {
        this.f40k = charSequence;
        g0 g0Var = this.f41l;
        if (g0Var != null) {
            g0Var.setWindowTitle(charSequence);
            return;
        }
        if (y0() != null) {
            y0().t(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean F() {
        return G(true);
    }

    public h.b.n.b F0(h.b.n.b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        h.b.n.b bVar = this.f44o;
        if (bVar != null) {
            bVar.c();
        }
        j jVar = new j(aVar);
        androidx.appcompat.app.a aVarM = m();
        if (aVarM != null) {
            h.b.n.b bVarU = aVarM.u(jVar);
            this.f44o = bVarU;
            if (bVarU != null && (dVar = this.f37h) != null) {
                dVar.f(bVarU);
            }
        }
        if (this.f44o == null) {
            this.f44o = G0(jVar);
        }
        return this.f44o;
    }

    h.b.n.b G0(h.b.n.b.a aVar) {
        h.b.n.b bVarK;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        V();
        h.b.n.b bVar = this.f44o;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof j)) {
            aVar = new j(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f37h;
        if (dVar3 == null || this.U) {
            bVarK = null;
        } else {
            try {
                bVarK = dVar3.k(aVar);
            } catch (AbstractMethodError unused) {
                bVarK = null;
            }
        }
        if (bVarK != null) {
            this.f44o = bVarK;
        } else {
            if (this.p == null) {
                if (this.M) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.e.getTheme();
                    theme.resolveAttribute(h.b.a.f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.e.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new h.b.n.d(this.e, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.e;
                    }
                    this.p = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, h.b.a.f1669i);
                    this.q = popupWindow;
                    androidx.core.widget.i.b(popupWindow, 2);
                    this.q.setContentView(this.p);
                    this.q.setWidth(-1);
                    dVar.getTheme().resolveAttribute(h.b.a.b, typedValue, true);
                    this.p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.q.setHeight(-2);
                    this.r = new RunnableC0009f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.v.findViewById(h.b.f.f1697h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(a0()));
                        this.p = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.p != null) {
                V();
                this.p.k();
                h.b.n.e eVar = new h.b.n.e(this.p.getContext(), this.p, aVar, this.q == null);
                if (aVar.d(eVar, eVar.e())) {
                    eVar.k();
                    this.p.h(eVar);
                    this.f44o = eVar;
                    if (D0()) {
                        this.p.setAlpha(0.0f);
                        c0 c0VarB = y.b(this.p);
                        c0VarB.a(1.0f);
                        this.s = c0VarB;
                        c0VarB.f(new g());
                    } else {
                        this.p.setAlpha(1.0f);
                        this.p.setVisibility(0);
                        if (this.p.getParent() instanceof View) {
                            y.K((View) this.p.getParent());
                        }
                    }
                    if (this.q != null) {
                        this.f.getDecorView().post(this.r);
                    }
                } else {
                    this.f44o = null;
                }
            }
        }
        h.b.n.b bVar2 = this.f44o;
        if (bVar2 != null && (dVar2 = this.f37h) != null) {
            dVar2.f(bVar2);
        }
        return this.f44o;
    }

    void K(int i2, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i2 >= 0) {
                u[] uVarArr = this.P;
                if (i2 < uVarArr.length) {
                    uVar = uVarArr[i2];
                }
            }
            if (uVar != null) {
                menu = uVar.f49j;
            }
        }
        if ((uVar == null || uVar.f54o) && !this.U) {
            this.f36g.a().onPanelClosed(i2, menu);
        }
    }

    void L(androidx.appcompat.view.menu.g gVar) {
        if (this.O) {
            return;
        }
        this.O = true;
        this.f41l.l();
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null && !this.U) {
            callbackF0.onPanelClosed(108, gVar);
        }
        this.O = false;
    }

    final int L0(h.h.l.g0 g0Var, Rect rect) {
        int iK;
        boolean z;
        boolean z2;
        if (g0Var != null) {
            iK = g0Var.k();
        } else {
            iK = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            boolean z3 = true;
            if (this.p.isShown()) {
                if (this.g0 == null) {
                    this.g0 = new Rect();
                    this.h0 = new Rect();
                }
                Rect rect2 = this.g0;
                Rect rect3 = this.h0;
                if (g0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(g0Var.i(), g0Var.k(), g0Var.j(), g0Var.h());
                }
                g1.a(this.v, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                h.h.l.g0 g0VarT = y.t(this.v);
                int i5 = g0VarT == null ? 0 : g0VarT.i();
                int iJ = g0VarT == null ? 0 : g0VarT.j();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.G != null) {
                    View view = this.G;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != i5 || marginLayoutParams2.rightMargin != iJ) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = i5;
                            marginLayoutParams2.rightMargin = iJ;
                            this.G.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.e);
                    this.G = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i5;
                    layoutParams.rightMargin = iJ;
                    this.v.addView(this.G, -1, layoutParams);
                }
                View view3 = this.G;
                z3 = view3 != null;
                if (z3 && view3.getVisibility() != 0) {
                    M0(this.G);
                }
                if (!this.L && z3) {
                    iK = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.G;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iK;
    }

    void N(int i2) {
        O(d0(i2, true), true);
    }

    void O(u uVar, boolean z) {
        ViewGroup viewGroup;
        g0 g0Var;
        if (z && uVar.a == 0 && (g0Var = this.f41l) != null && g0Var.c()) {
            L(uVar.f49j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && uVar.f54o && (viewGroup = uVar.f46g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                K(uVar.a, uVar, null);
            }
        }
        uVar.f52m = false;
        uVar.f53n = false;
        uVar.f54o = false;
        uVar.f47h = null;
        uVar.q = true;
        if (this.Q == uVar) {
            this.Q = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        androidx.appcompat.app.h hVar;
        boolean zE0 = false;
        if (this.i0 == null) {
            String string = this.e.obtainStyledAttributes(h.b.j.v0).getString(h.b.j.z0);
            if (string == null) {
                hVar = new androidx.appcompat.app.h();
            } else {
                try {
                    this.i0 = (androidx.appcompat.app.h) this.e.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    hVar = new androidx.appcompat.app.h();
                    this.i0 = hVar;
                }
            }
            this.i0 = hVar;
        }
        boolean z2 = l0;
        if (z2) {
            if (this.j0 == null) {
                this.j0 = new androidx.appcompat.app.i();
            }
            if (this.j0.a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zE0 = E0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zE0 = true;
                }
                z = zE0;
            }
        } else {
            z = false;
        }
        return this.i0.r(view, str, context, attributeSet, z, z2, true, f1.c());
    }

    void S() {
        androidx.appcompat.view.menu.g gVar;
        g0 g0Var = this.f41l;
        if (g0Var != null) {
            g0Var.l();
        }
        if (this.q != null) {
            this.f.getDecorView().removeCallbacks(this.r);
            if (this.q.isShowing()) {
                try {
                    this.q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.q = null;
        }
        V();
        u uVarD0 = d0(0, false);
        if (uVarD0 == null || (gVar = uVarD0.f49j) == null) {
            return;
        }
        gVar.close();
    }

    boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.d;
        if (((obj instanceof h.h.l.h.a) || (obj instanceof androidx.appcompat.app.g)) && (decorView = this.f.getDecorView()) != null && h.h.l.h.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f36g.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    void U(int i2) {
        u uVarD0;
        u uVarD1 = d0(i2, true);
        if (uVarD1.f49j != null) {
            Bundle bundle = new Bundle();
            uVarD1.f49j.Q(bundle);
            if (bundle.size() > 0) {
                uVarD1.s = bundle;
            }
            uVarD1.f49j.d0();
            uVarD1.f49j.clear();
        }
        uVarD1.r = true;
        uVarD1.q = true;
        if ((i2 != 108 && i2 != 0) || this.f41l == null || (uVarD0 = d0(0, false)) == null) {
            return;
        }
        uVarD0.f52m = false;
        A0(uVarD0, null);
    }

    void V() {
        c0 c0Var = this.s;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    u Y(Menu menu) {
        u[] uVarArr = this.P;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            u uVar = uVarArr[i2];
            if (uVar != null && uVar.f49j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u uVarY;
        Window.Callback callbackF0 = f0();
        if (callbackF0 == null || this.U || (uVarY = Y(gVar.D())) == null) {
            return false;
        }
        return callbackF0.onMenuItemSelected(uVarY.a, menuItem);
    }

    final Context a0() {
        androidx.appcompat.app.a aVarM = m();
        Context contextK = aVarM != null ? aVarM.k() : null;
        return contextK == null ? this.e : contextK;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        B0(true);
    }

    @Override // androidx.appcompat.app.e
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.v.findViewById(R.id.content)).addView(view, layoutParams);
        this.f36g.a().onContentChanged();
    }

    protected u d0(int i2, boolean z) {
        u[] uVarArr = this.P;
        if (uVarArr == null || uVarArr.length <= i2) {
            u[] uVarArr2 = new u[i2 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.P = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i2];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i2);
        uVarArr[i2] = uVar2;
        return uVar2;
    }

    final CharSequence e0() {
        Object obj = this.d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f40k;
    }

    @Override // androidx.appcompat.app.e
    public Context f(Context context) {
        this.S = true;
        int iN0 = n0(context, J());
        Configuration configurationZ = null;
        if (o0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, P(context, iN0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof h.b.n.d) {
            try {
                ((h.b.n.d) context).a(P(context, iN0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!n0) {
            super.f(context);
            return context;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration = new Configuration();
            configuration.uiMode = -1;
            configuration.fontScale = 0.0f;
            Configuration configuration2 = k.a(context, configuration).getResources().getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            configuration2.uiMode = configuration3.uiMode;
            if (!configuration2.equals(configuration3)) {
                configurationZ = Z(configuration2, configuration3);
            }
        }
        Configuration configurationP = P(context, iN0, configurationZ);
        h.b.n.d dVar = new h.b.n.d(context, h.b.i.c);
        dVar.a(configurationP);
        boolean z = false;
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            androidx.core.content.d.h.e.a(dVar.getTheme());
        }
        super.f(dVar);
        return dVar;
    }

    final Window.Callback f0() {
        return this.f.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public <T extends View> T i(int i2) {
        W();
        return (T) this.f.findViewById(i2);
    }

    @Override // androidx.appcompat.app.e
    public int k() {
        return this.W;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater l() {
        if (this.f39j == null) {
            g0();
            androidx.appcompat.app.a aVar = this.f38i;
            this.f39j = new h.b.n.g(aVar != null ? aVar.k() : this.e);
        }
        return this.f39j;
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.app.a m() {
        g0();
        return this.f38i;
    }

    public boolean m0() {
        return this.t;
    }

    @Override // androidx.appcompat.app.e
    public void n() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.e);
        if (layoutInflaterFrom.getFactory() == null) {
            h.h.l.i.b(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    int n0(Context context, int i2) {
        q qVarC0;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    qVarC0 = b0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                qVarC0 = c0(context);
            }
            return qVarC0.c();
        }
        return i2;
    }

    @Override // androidx.appcompat.app.e
    public void o() {
        androidx.appcompat.app.a aVarM = m();
        if (aVarM == null || !aVarM.l()) {
            k0(0);
        }
    }

    boolean o0() {
        h.b.n.b bVar = this.f44o;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarM = m();
        return aVarM != null && aVarM.h();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.e
    public void p(Configuration configuration) {
        androidx.appcompat.app.a aVarM;
        if (this.J && this.u && (aVarM = m()) != null) {
            aVarM.m(configuration);
        }
        androidx.appcompat.widget.l.b().g(this.e);
        this.V = new Configuration(this.e.getResources().getConfiguration());
        G(false);
    }

    boolean p0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.R = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void q(Bundle bundle) {
        this.S = true;
        G(false);
        X();
        Object obj = this.d;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                strC = androidx.core.app.g.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarY0 = y0();
                if (aVarY0 == null) {
                    this.f0 = true;
                } else {
                    aVarY0.r(true);
                }
            }
            androidx.appcompat.app.e.c(this);
        }
        this.V = new Configuration(this.e.getResources().getConfiguration());
        this.T = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.e
    public void r() {
        if (this.d instanceof Activity) {
            androidx.appcompat.app.e.x(this);
        }
        if (this.c0) {
            this.f.getDecorView().removeCallbacks(this.e0);
        }
        this.U = true;
        if (this.W != -100) {
            Object obj = this.d;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                k0.put(this.d.getClass().getName(), Integer.valueOf(this.W));
            } else {
                k0.remove(this.d.getClass().getName());
            }
        } else {
            k0.remove(this.d.getClass().getName());
        }
        androidx.appcompat.app.a aVar = this.f38i;
        if (aVar != null) {
            aVar.n();
        }
        M();
    }

    boolean r0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarM = m();
        if (aVarM != null && aVarM.o(i2, keyEvent)) {
            return true;
        }
        u uVar = this.Q;
        if (uVar != null && z0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.Q;
            if (uVar2 != null) {
                uVar2.f53n = true;
            }
            return true;
        }
        if (this.Q == null) {
            u uVarD0 = d0(0, true);
            A0(uVarD0, keyEvent);
            boolean zZ0 = z0(uVarD0, keyEvent.getKeyCode(), keyEvent, 1);
            uVarD0.f52m = false;
            if (zZ0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void s(Bundle bundle) {
        W();
    }

    boolean s0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.R;
            this.R = false;
            u uVarD0 = d0(0, false);
            if (uVarD0 != null && uVarD0.f54o) {
                if (!z) {
                    O(uVarD0, true);
                }
                return true;
            }
            if (o0()) {
                return true;
            }
        } else if (i2 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void t() {
        androidx.appcompat.app.a aVarM = m();
        if (aVarM != null) {
            aVarM.s(true);
        }
    }

    @Override // androidx.appcompat.app.e
    public void u(Bundle bundle) {
    }

    void u0(int i2) {
        androidx.appcompat.app.a aVarM;
        if (i2 != 108 || (aVarM = m()) == null) {
            return;
        }
        aVarM.i(true);
    }

    @Override // androidx.appcompat.app.e
    public void v() {
        F();
    }

    void v0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a aVarM = m();
            if (aVarM != null) {
                aVarM.i(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            u uVarD0 = d0(i2, true);
            if (uVarD0.f54o) {
                O(uVarD0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void w() {
        androidx.appcompat.app.a aVarM = m();
        if (aVarM != null) {
            aVarM.s(false);
        }
    }

    void w0(ViewGroup viewGroup) {
    }

    final androidx.appcompat.app.a y0() {
        return this.f38i;
    }

    @Override // androidx.appcompat.app.e
    public boolean z(int i2) {
        int iC0 = C0(i2);
        if (this.N && iC0 == 108) {
            return false;
        }
        if (this.J && iC0 == 1) {
            this.J = false;
        }
        if (iC0 == 1) {
            H0();
            this.N = true;
            return true;
        }
        if (iC0 == 2) {
            H0();
            this.H = true;
            return true;
        }
        if (iC0 == 5) {
            H0();
            this.I = true;
            return true;
        }
        if (iC0 == 10) {
            H0();
            this.L = true;
            return true;
        }
        if (iC0 == 108) {
            H0();
            this.J = true;
            return true;
        }
        if (iC0 != 109) {
            return this.f.requestFeature(iC0);
        }
        H0();
        this.K = true;
        return true;
    }
}
