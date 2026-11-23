package h.h.l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g0 {
    public static final g0 b;
    private final l a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    static class a {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        public static g0 a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            b bVar = new b();
                            bVar.b(h.h.e.b.c(rect));
                            bVar.c(h.h.e.b.c(rect2));
                            g0 g0VarA = bVar.a();
                            g0VarA.r(g0VarA);
                            g0VarA.d(view.getRootView());
                            return g0VarA;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    public static final class b {
        private final f a;

        public b() {
            int i2 = Build.VERSION.SDK_INT;
            this.a = i2 >= 30 ? new e() : i2 >= 29 ? new d() : i2 >= 20 ? new c() : new f();
        }

        public b(g0 g0Var) {
            int i2 = Build.VERSION.SDK_INT;
            this.a = i2 >= 30 ? new e(g0Var) : i2 >= 29 ? new d(g0Var) : i2 >= 20 ? new c(g0Var) : new f(g0Var);
        }

        public g0 a() {
            return this.a.b();
        }

        @Deprecated
        public b b(h.h.e.b bVar) {
            this.a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(h.h.e.b bVar) {
            this.a.f(bVar);
            return this;
        }
    }

    private static class c extends f {
        private static Field e;
        private static boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f1812g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f1813h;
        private WindowInsets c;
        private h.h.e.b d;

        c() {
            this.c = h();
        }

        c(g0 g0Var) {
            super(g0Var);
            this.c = g0Var.t();
        }

        private static WindowInsets h() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f1813h) {
                try {
                    f1812g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f1813h = true;
            }
            Constructor<WindowInsets> constructor = f1812g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // h.h.l.g0.f
        g0 b() {
            a();
            g0 g0VarU = g0.u(this.c);
            g0VarU.p(this.b);
            g0VarU.s(this.d);
            return g0VarU;
        }

        @Override // h.h.l.g0.f
        void d(h.h.e.b bVar) {
            this.d = bVar;
        }

        @Override // h.h.l.g0.f
        void f(h.h.e.b bVar) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(bVar.a, bVar.b, bVar.c, bVar.d);
            }
        }
    }

    private static class d extends f {
        final WindowInsets.Builder c;

        d() {
            this.c = new WindowInsets.Builder();
        }

        d(g0 g0Var) {
            super(g0Var);
            WindowInsets windowInsetsT = g0Var.t();
            this.c = windowInsetsT != null ? new WindowInsets.Builder(windowInsetsT) : new WindowInsets.Builder();
        }

        @Override // h.h.l.g0.f
        g0 b() {
            a();
            g0 g0VarU = g0.u(this.c.build());
            g0VarU.p(this.b);
            return g0VarU;
        }

        @Override // h.h.l.g0.f
        void c(h.h.e.b bVar) {
            this.c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // h.h.l.g0.f
        void d(h.h.e.b bVar) {
            this.c.setStableInsets(bVar.e());
        }

        @Override // h.h.l.g0.f
        void e(h.h.e.b bVar) {
            this.c.setSystemGestureInsets(bVar.e());
        }

        @Override // h.h.l.g0.f
        void f(h.h.e.b bVar) {
            this.c.setSystemWindowInsets(bVar.e());
        }

        @Override // h.h.l.g0.f
        void g(h.h.e.b bVar) {
            this.c.setTappableElementInsets(bVar.e());
        }
    }

    private static class e extends d {
        e() {
        }

        e(g0 g0Var) {
            super(g0Var);
        }
    }

    private static class f {
        private final g0 a;
        h.h.e.b[] b;

        f() {
            this(new g0((g0) null));
        }

        f(g0 g0Var) {
            this.a = g0Var;
        }

        protected final void a() {
            h.h.e.b[] bVarArr = this.b;
            if (bVarArr != null) {
                h.h.e.b bVarF = bVarArr[m.a(1)];
                h.h.e.b bVarF2 = this.b[m.a(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.a.f(1);
                }
                f(h.h.e.b.a(bVarF, bVarF2));
                h.h.e.b bVar = this.b[m.a(16)];
                if (bVar != null) {
                    e(bVar);
                }
                h.h.e.b bVar2 = this.b[m.a(32)];
                if (bVar2 != null) {
                    c(bVar2);
                }
                h.h.e.b bVar3 = this.b[m.a(64)];
                if (bVar3 != null) {
                    g(bVar3);
                }
            }
        }

        g0 b() {
            a();
            return this.a;
        }

        void c(h.h.e.b bVar) {
        }

        void d(h.h.e.b bVar) {
        }

        void e(h.h.e.b bVar) {
        }

        void f(h.h.e.b bVar) {
        }

        void g(h.h.e.b bVar) {
        }
    }

    private static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f1814h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static Method f1815i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Class<?> f1816j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Field f1817k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f1818l;
        final WindowInsets c;
        private h.h.e.b[] d;
        private h.h.e.b e;
        private g0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        h.h.e.b f1819g;

        g(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var);
            this.e = null;
            this.c = windowInsets;
        }

        g(g0 g0Var, g gVar) {
            this(g0Var, new WindowInsets(gVar.c));
        }

        @SuppressLint({"WrongConstant"})
        private h.h.e.b t(int i2, boolean z) {
            h.h.e.b bVarA = h.h.e.b.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    bVarA = h.h.e.b.a(bVarA, u(i3, z));
                }
            }
            return bVarA;
        }

        private h.h.e.b v() {
            g0 g0Var = this.f;
            return g0Var != null ? g0Var.g() : h.h.e.b.e;
        }

        private h.h.e.b w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f1814h) {
                x();
            }
            Method method = f1815i;
            if (method != null && f1816j != null && f1817k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f1817k.get(f1818l.get(objInvoke));
                    if (rect != null) {
                        return h.h.e.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f1815i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1816j = cls;
                f1817k = cls.getDeclaredField("mVisibleInsets");
                f1818l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1817k.setAccessible(true);
                f1818l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f1814h = true;
        }

        @Override // h.h.l.g0.l
        void d(View view) {
            h.h.e.b bVarW = w(view);
            if (bVarW == null) {
                bVarW = h.h.e.b.e;
            }
            q(bVarW);
        }

        @Override // h.h.l.g0.l
        void e(g0 g0Var) {
            g0Var.r(this.f);
            g0Var.q(this.f1819g);
        }

        @Override // h.h.l.g0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return defpackage.d.a(this.f1819g, ((g) obj).f1819g);
            }
            return false;
        }

        @Override // h.h.l.g0.l
        public h.h.e.b g(int i2) {
            return t(i2, false);
        }

        @Override // h.h.l.g0.l
        final h.h.e.b k() {
            if (this.e == null) {
                this.e = h.h.e.b.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // h.h.l.g0.l
        g0 m(int i2, int i3, int i4, int i5) {
            b bVar = new b(g0.u(this.c));
            bVar.c(g0.m(k(), i2, i3, i4, i5));
            bVar.b(g0.m(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // h.h.l.g0.l
        boolean o() {
            return this.c.isRound();
        }

        @Override // h.h.l.g0.l
        public void p(h.h.e.b[] bVarArr) {
            this.d = bVarArr;
        }

        @Override // h.h.l.g0.l
        void q(h.h.e.b bVar) {
            this.f1819g = bVar;
        }

        @Override // h.h.l.g0.l
        void r(g0 g0Var) {
            this.f = g0Var;
        }

        protected h.h.e.b u(int i2, boolean z) {
            h.h.e.b bVarG;
            int i3;
            if (i2 == 1) {
                return z ? h.h.e.b.b(0, Math.max(v().b, k().b), 0, 0) : h.h.e.b.b(0, k().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    h.h.e.b bVarV = v();
                    h.h.e.b bVarI = i();
                    return h.h.e.b.b(Math.max(bVarV.a, bVarI.a), 0, Math.max(bVarV.c, bVarI.c), Math.max(bVarV.d, bVarI.d));
                }
                h.h.e.b bVarK = k();
                g0 g0Var = this.f;
                bVarG = g0Var != null ? g0Var.g() : null;
                int iMin = bVarK.d;
                if (bVarG != null) {
                    iMin = Math.min(iMin, bVarG.d);
                }
                return h.h.e.b.b(bVarK.a, 0, bVarK.c, iMin);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return j();
                }
                if (i2 == 32) {
                    return h();
                }
                if (i2 == 64) {
                    return l();
                }
                if (i2 != 128) {
                    return h.h.e.b.e;
                }
                g0 g0Var2 = this.f;
                h.h.l.f fVarE = g0Var2 != null ? g0Var2.e() : f();
                return fVarE != null ? h.h.e.b.b(fVarE.b(), fVarE.d(), fVarE.c(), fVarE.a()) : h.h.e.b.e;
            }
            h.h.e.b[] bVarArr = this.d;
            bVarG = bVarArr != null ? bVarArr[m.a(8)] : null;
            if (bVarG != null) {
                return bVarG;
            }
            h.h.e.b bVarK2 = k();
            h.h.e.b bVarV2 = v();
            int i4 = bVarK2.d;
            if (i4 > bVarV2.d) {
                return h.h.e.b.b(0, 0, 0, i4);
            }
            h.h.e.b bVar = this.f1819g;
            return (bVar == null || bVar.equals(h.h.e.b.e) || (i3 = this.f1819g.d) <= bVarV2.d) ? h.h.e.b.e : h.h.e.b.b(0, 0, 0, i3);
        }
    }

    private static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private h.h.e.b f1820m;

        h(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var, windowInsets);
            this.f1820m = null;
        }

        h(g0 g0Var, h hVar) {
            super(g0Var, hVar);
            this.f1820m = null;
            this.f1820m = hVar.f1820m;
        }

        @Override // h.h.l.g0.l
        g0 b() {
            return g0.u(this.c.consumeStableInsets());
        }

        @Override // h.h.l.g0.l
        g0 c() {
            return g0.u(this.c.consumeSystemWindowInsets());
        }

        @Override // h.h.l.g0.l
        final h.h.e.b i() {
            if (this.f1820m == null) {
                this.f1820m = h.h.e.b.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.f1820m;
        }

        @Override // h.h.l.g0.l
        boolean n() {
            return this.c.isConsumed();
        }

        @Override // h.h.l.g0.l
        public void s(h.h.e.b bVar) {
            this.f1820m = bVar;
        }
    }

    private static class i extends h {
        i(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var, windowInsets);
        }

        i(g0 g0Var, i iVar) {
            super(g0Var, iVar);
        }

        @Override // h.h.l.g0.l
        g0 a() {
            return g0.u(this.c.consumeDisplayCutout());
        }

        @Override // h.h.l.g0.g, h.h.l.g0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return defpackage.d.a(this.c, iVar.c) && defpackage.d.a(this.f1819g, iVar.f1819g);
        }

        @Override // h.h.l.g0.l
        h.h.l.f f() {
            return h.h.l.f.e(this.c.getDisplayCutout());
        }

        @Override // h.h.l.g0.l
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private h.h.e.b f1821n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private h.h.e.b f1822o;
        private h.h.e.b p;

        j(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var, windowInsets);
            this.f1821n = null;
            this.f1822o = null;
            this.p = null;
        }

        j(g0 g0Var, j jVar) {
            super(g0Var, jVar);
            this.f1821n = null;
            this.f1822o = null;
            this.p = null;
        }

        @Override // h.h.l.g0.l
        h.h.e.b h() {
            if (this.f1822o == null) {
                this.f1822o = h.h.e.b.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.f1822o;
        }

        @Override // h.h.l.g0.l
        h.h.e.b j() {
            if (this.f1821n == null) {
                this.f1821n = h.h.e.b.d(this.c.getSystemGestureInsets());
            }
            return this.f1821n;
        }

        @Override // h.h.l.g0.l
        h.h.e.b l() {
            if (this.p == null) {
                this.p = h.h.e.b.d(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // h.h.l.g0.g, h.h.l.g0.l
        g0 m(int i2, int i3, int i4, int i5) {
            return g0.u(this.c.inset(i2, i3, i4, i5));
        }

        @Override // h.h.l.g0.h, h.h.l.g0.l
        public void s(h.h.e.b bVar) {
        }
    }

    private static class k extends j {
        static final g0 q = g0.u(WindowInsets.CONSUMED);

        k(g0 g0Var, WindowInsets windowInsets) {
            super(g0Var, windowInsets);
        }

        k(g0 g0Var, k kVar) {
            super(g0Var, kVar);
        }

        @Override // h.h.l.g0.g, h.h.l.g0.l
        final void d(View view) {
        }

        @Override // h.h.l.g0.g, h.h.l.g0.l
        public h.h.e.b g(int i2) {
            return h.h.e.b.d(this.c.getInsets(n.a(i2)));
        }
    }

    private static class l {
        static final g0 b = new b().a().a().b().c();
        final g0 a;

        l(g0 g0Var) {
            this.a = g0Var;
        }

        g0 a() {
            return this.a;
        }

        g0 b() {
            return this.a;
        }

        g0 c() {
            return this.a;
        }

        void d(View view) {
        }

        void e(g0 g0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && h.h.k.c.a(k(), lVar.k()) && h.h.k.c.a(i(), lVar.i()) && h.h.k.c.a(f(), lVar.f());
        }

        h.h.l.f f() {
            return null;
        }

        h.h.e.b g(int i2) {
            return h.h.e.b.e;
        }

        h.h.e.b h() {
            return k();
        }

        public int hashCode() {
            return h.h.k.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        h.h.e.b i() {
            return h.h.e.b.e;
        }

        h.h.e.b j() {
            return k();
        }

        h.h.e.b k() {
            return h.h.e.b.e;
        }

        h.h.e.b l() {
            return k();
        }

        g0 m(int i2, int i3, int i4, int i5) {
            return b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(h.h.e.b[] bVarArr) {
        }

        void q(h.h.e.b bVar) {
        }

        void r(g0 g0Var) {
        }

        public void s(h.h.e.b bVar) {
        }
    }

    public static final class m {
        static int a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }
    }

    private static final class n {
        static int a(int i2) {
            int iStatusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i3 |= iStatusBars;
                }
            }
            return i3;
        }
    }

    static {
        b = Build.VERSION.SDK_INT >= 30 ? k.q : l.b;
    }

    private g0(WindowInsets windowInsets) {
        l gVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            gVar = new k(this, windowInsets);
        } else if (i2 >= 29) {
            gVar = new j(this, windowInsets);
        } else if (i2 >= 28) {
            gVar = new i(this, windowInsets);
        } else if (i2 >= 21) {
            gVar = new h(this, windowInsets);
        } else {
            if (i2 < 20) {
                this.a = new l(this);
                return;
            }
            gVar = new g(this, windowInsets);
        }
        this.a = gVar;
    }

    public g0(g0 g0Var) {
        if (g0Var == null) {
            this.a = new l(this);
            return;
        }
        l lVar = g0Var.a;
        int i2 = Build.VERSION.SDK_INT;
        this.a = (i2 < 30 || !(lVar instanceof k)) ? (i2 < 29 || !(lVar instanceof j)) ? (i2 < 28 || !(lVar instanceof i)) ? (i2 < 21 || !(lVar instanceof h)) ? (i2 < 20 || !(lVar instanceof g)) ? new l(this) : new g(this, (g) lVar) : new h(this, (h) lVar) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    static h.h.e.b m(h.h.e.b bVar, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, bVar.a - i2);
        int iMax2 = Math.max(0, bVar.b - i3);
        int iMax3 = Math.max(0, bVar.c - i4);
        int iMax4 = Math.max(0, bVar.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? bVar : h.h.e.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static g0 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static g0 v(WindowInsets windowInsets, View view) {
        h.h.k.e.f(windowInsets);
        g0 g0Var = new g0(windowInsets);
        if (view != null && y.z(view)) {
            g0Var.r(y.t(view));
            g0Var.d(view.getRootView());
        }
        return g0Var;
    }

    @Deprecated
    public g0 a() {
        return this.a.a();
    }

    @Deprecated
    public g0 b() {
        return this.a.b();
    }

    @Deprecated
    public g0 c() {
        return this.a.c();
    }

    void d(View view) {
        this.a.d(view);
    }

    public h.h.l.f e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return h.h.k.c.a(this.a, ((g0) obj).a);
        }
        return false;
    }

    public h.h.e.b f(int i2) {
        return this.a.g(i2);
    }

    @Deprecated
    public h.h.e.b g() {
        return this.a.i();
    }

    @Deprecated
    public int h() {
        return this.a.k().d;
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.k().a;
    }

    @Deprecated
    public int j() {
        return this.a.k().c;
    }

    @Deprecated
    public int k() {
        return this.a.k().b;
    }

    public g0 l(int i2, int i3, int i4, int i5) {
        return this.a.m(i2, i3, i4, i5);
    }

    public boolean n() {
        return this.a.n();
    }

    @Deprecated
    public g0 o(int i2, int i3, int i4, int i5) {
        b bVar = new b(this);
        bVar.c(h.h.e.b.b(i2, i3, i4, i5));
        return bVar.a();
    }

    void p(h.h.e.b[] bVarArr) {
        this.a.p(bVarArr);
    }

    void q(h.h.e.b bVar) {
        this.a.q(bVar);
    }

    void r(g0 g0Var) {
        this.a.r(g0Var);
    }

    void s(h.h.e.b bVar) {
        this.a.s(bVar);
    }

    public WindowInsets t() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }
}
