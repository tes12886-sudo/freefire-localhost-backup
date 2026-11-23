package h.h.l;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class y {
    private static Field a;
    private static boolean b;
    private static WeakHashMap<View, String> c;
    private static WeakHashMap<View, c0> d;
    private static Field e;
    private static boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v f1824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final e f1825h;

    class a extends f<Boolean> {
        a(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(n.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            n.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f<CharSequence> {
        b(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            n.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return p.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            p.b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f<Boolean> {
        d(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(n.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            n.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h.h.l.y.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        e() {
        }

        private void b(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                y.D(view, z2 ? 16 : 32);
                this.a.put(view, Boolean.valueOf(z2));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            this.a.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (j.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.a.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        f(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        f(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.b = cls;
            this.d = i3;
            this.c = i4;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                y.g(view);
                view.setTag(this.a, t);
                y.D(view, this.d);
            }
        }

        abstract boolean h(T t, T t2);
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i2, Bundle bundle) {
            return view.performAccessibilityAction(i2, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        static void s(View view, int i2) {
            view.setImportantForAccessibility(i2);
        }
    }

    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i2) {
            view.setLabelFor(i2);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i2) {
            view.setLayoutDirection(i2);
        }

        static void k(View view, int i2, int i3, int i4, int i5) {
            view.setPaddingRelative(i2, i3, i4, i5);
        }
    }

    static class j {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }

        static void f(View view, int i2) {
            view.setAccessibilityLiveRegion(i2);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    }

    static class k {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class l {

        class a implements View.OnApplyWindowInsetsListener {
            g0 a = null;
            final /* synthetic */ View b;
            final /* synthetic */ h.h.l.t c;

            a(View view, h.h.l.t tVar) {
                this.b = view;
                this.c = tVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                g0 g0VarV = g0.v(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    l.a(windowInsets, this.b);
                    if (g0VarV.equals(this.a)) {
                        return this.c.a(view, g0VarV).t();
                    }
                }
                this.a = g0VarV;
                g0 g0VarA = this.c.a(view, g0VarV);
                if (i2 >= 30) {
                    return g0VarA.t();
                }
                y.K(view);
                return g0VarA.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(h.h.c.f1795n);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static g0 b(View view, g0 g0Var, Rect rect) {
            WindowInsets windowInsetsT = g0Var.t();
            if (windowInsetsT != null) {
                return g0.v(view.computeSystemWindowInsets(windowInsetsT, rect), view);
            }
            rect.setEmpty();
            return g0Var;
        }

        static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static g0 j(View view) {
            return g0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f) {
            view.setElevation(f);
        }

        static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        static void u(View view, h.h.l.t tVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(h.h.c.f, tVar);
            }
            if (tVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(h.h.c.f1795n));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, tVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        static void x(View view, float f) {
            view.setZ(f);
        }

        static boolean y(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class m {
        public static g0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            g0 g0VarU = g0.u(rootWindowInsets);
            g0VarU.r(g0VarU);
            g0VarU.d(view.getRootView());
            return g0VarU;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i2) {
            view.setScrollIndicators(i2);
        }

        static void d(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    static class n {
        static void a(View view, final s sVar) {
            int i2 = h.h.c.f1794m;
            h.f.g gVar = (h.f.g) view.getTag(i2);
            if (gVar == null) {
                gVar = new h.f.g();
                view.setTag(i2, gVar);
            }
            sVar.getClass();
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: h.h.l.b
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return sVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(sVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, s sVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            h.f.g gVar = (h.f.g) view.getTag(h.h.c.f1794m);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(sVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i2) {
            return (T) view.requireViewById(i2);
        }

        static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    private static class o {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class p {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class q {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static h.h.l.e b(View view, h.h.l.e eVar) {
            ContentInfo contentInfoF = eVar.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? eVar : h.h.l.e.g(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, u uVar) {
            if (uVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new r(uVar));
            }
        }
    }

    private static final class r implements OnReceiveContentListener {
        private final u a;

        r(u uVar) {
            this.a = uVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            h.h.l.e eVarG = h.h.l.e.g(contentInfo);
            h.h.l.e eVarA = this.a.a(view, eVarG);
            if (eVarA == null) {
                return null;
            }
            return eVarA == eVarG ? contentInfo : eVarA.f();
        }
    }

    public interface s {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class t {
        private static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        t() {
        }

        static t a(View view) {
            int i2 = h.h.c.f1793l;
            t tVar = (t) view.getTag(i2);
            if (tVar != null) {
                return tVar;
            }
            t tVar2 = new t();
            view.setTag(i2, tVar2);
            return tVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(h.h.c.f1794m);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((s) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            Boolean bool = Boolean.TRUE;
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.a.put(view, bool);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.a.put((View) parent, bool);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && y.z(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        d = null;
        f = false;
        f1824g = new v() { // from class: h.h.l.a
            @Override // h.h.l.v
            public final e a(e eVar) {
                y.C(eVar);
                return eVar;
            }
        };
        f1825h = new e();
    }

    public static boolean A(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return j.c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean B(View view) {
        Boolean boolF = M().f(view);
        return boolF != null && boolF.booleanValue();
    }

    static /* synthetic */ h.h.l.e C(h.h.l.e eVar) {
        return eVar;
    }

    static void D(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = l(view) != null && view.getVisibility() == 0;
            if (k(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                j.g(accessibilityEventObtain, i2);
                if (z) {
                    accessibilityEventObtain.getText().add(l(view));
                    Z(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                j.g(accessibilityEventObtain2, i2);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    j.e(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static g0 E(View view, g0 g0Var) {
        WindowInsets windowInsetsT;
        if (Build.VERSION.SDK_INT >= 21 && (windowInsetsT = g0Var.t()) != null) {
            WindowInsets windowInsetsB = k.b(view, windowInsetsT);
            if (!windowInsetsB.equals(windowInsetsT)) {
                return g0.v(windowInsetsB, view);
            }
        }
        return g0Var;
    }

    private static f<CharSequence> F() {
        return new b(h.h.c.e, CharSequence.class, 8, 28);
    }

    public static h.h.l.e G(View view, h.h.l.e eVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + eVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return q.b(view, eVar);
        }
        u uVar = (u) view.getTag(h.h.c.f1788g);
        if (uVar == null) {
            return o(view).a(eVar);
        }
        h.h.l.e eVarA = uVar.a(view, eVar);
        if (eVarA == null) {
            return null;
        }
        return o(view).a(eVarA);
    }

    public static void H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.k(view);
        } else {
            view.postInvalidate();
        }
    }

    public static void I(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void J(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.n(view, runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void K(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            k.c(view);
        } else if (i2 >= 16) {
            h.p(view);
        }
    }

    public static void L(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            o.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    private static f<Boolean> M() {
        return new a(h.h.c.f1790i, Boolean.class, 28);
    }

    public static void N(View view, h.h.l.c cVar) {
        if (cVar == null && (i(view) instanceof h.h.l.c.a)) {
            cVar = new h.h.l.c();
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.d());
    }

    public static void O(View view, boolean z) {
        a().g(view, Boolean.valueOf(z));
    }

    public static void P(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            F().g(view, charSequence);
            if (charSequence != null) {
                f1825h.a(view);
            } else {
                f1825h.d(view);
            }
        }
    }

    public static void Q(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void R(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof x) {
                ((x) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        l.q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void S(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof x) {
                ((x) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        l.r(view, mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static void T(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            l.s(view, f2);
        }
    }

    public static void U(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 19) {
            if (i3 < 16) {
                return;
            }
            if (i2 == 4) {
                i2 = 2;
            }
        }
        h.s(view, i2);
    }

    public static void V(View view, h.h.l.t tVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            l.u(view, tVar);
        }
    }

    public static void W(View view, boolean z) {
        M().g(view, Boolean.valueOf(z));
    }

    public static void X(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.d(view, i2, i3);
        }
    }

    public static void Y(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            l.v(view, str);
            return;
        }
        if (c == null) {
            c = new WeakHashMap<>();
        }
        c.put(view, str);
    }

    private static void Z(View view) {
        if (p(view) == 0) {
            U(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (p((View) parent) == 4) {
                U(view, 2);
                return;
            }
        }
    }

    private static f<Boolean> a() {
        return new d(h.h.c.d, Boolean.class, 28);
    }

    private static f<CharSequence> a0() {
        return new c(h.h.c.f1791j, CharSequence.class, 64, 30);
    }

    public static c0 b(View view) {
        if (d == null) {
            d = new WeakHashMap<>();
        }
        c0 c0Var = d.get(view);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(view);
        d.put(view, c0Var2);
        return c0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            l.z(view);
        } else if (view instanceof h.h.l.n) {
            ((h.h.l.n) view).stopNestedScroll();
        }
    }

    public static g0 c(View view, g0 g0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? l.b(view, g0Var, rect) : g0Var;
    }

    public static g0 d(View view, g0 g0Var) {
        WindowInsets windowInsetsT;
        if (Build.VERSION.SDK_INT >= 21 && (windowInsetsT = g0Var.t()) != null) {
            WindowInsets windowInsetsA = k.a(view, windowInsetsT);
            if (!windowInsetsA.equals(windowInsetsT)) {
                return g0.v(windowInsetsA, view);
            }
        }
        return g0Var;
    }

    static boolean e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).b(view, keyEvent);
    }

    static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).f(keyEvent);
    }

    static void g(View view) {
        h.h.l.c cVarH = h(view);
        if (cVarH == null) {
            cVarH = new h.h.l.c();
        }
        N(view, cVarH);
    }

    public static h.h.l.c h(View view) {
        View.AccessibilityDelegate accessibilityDelegateI = i(view);
        if (accessibilityDelegateI == null) {
            return null;
        }
        return accessibilityDelegateI instanceof h.h.l.c.a ? ((h.h.l.c.a) accessibilityDelegateI).a : new h.h.l.c(accessibilityDelegateI);
    }

    private static View.AccessibilityDelegate i(View view) {
        return Build.VERSION.SDK_INT >= 29 ? o.a(view) : j(view);
    }

    private static View.AccessibilityDelegate j(View view) {
        if (f) {
            return null;
        }
        if (e == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f = true;
                return null;
            }
        }
        try {
            Object obj = e.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f = true;
            return null;
        }
    }

    public static int k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return j.a(view);
        }
        return 0;
    }

    public static CharSequence l(View view) {
        return F().f(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorStateList m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return l.g(view);
        }
        if (view instanceof x) {
            return ((x) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PorterDuff.Mode n(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return l.h(view);
        }
        if (view instanceof x) {
            return ((x) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static v o(View view) {
        return view instanceof v ? (v) view : f1824g;
    }

    public static int p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.c(view);
        }
        return 0;
    }

    public static int q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.d(view);
        }
        return 0;
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.d(view);
        }
        if (!b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static String[] s(View view) {
        return Build.VERSION.SDK_INT >= 31 ? q.a(view) : (String[]) view.getTag(h.h.c.f1789h);
    }

    public static g0 t(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return m.a(view);
        }
        if (i2 >= 21) {
            return l.j(view);
        }
        return null;
    }

    public static CharSequence u(View view) {
        return a0().f(view);
    }

    public static String v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return l.k(view);
        }
        WeakHashMap<View, String> weakHashMap = c;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    public static int w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.g(view);
        }
        return 0;
    }

    public static boolean x(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.a(view);
        }
        return false;
    }

    public static boolean y(View view) {
        Boolean boolF = a().f(view);
        return boolF != null && boolF.booleanValue();
    }

    public static boolean z(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return j.b(view);
        }
        return view.getWindowToken() != null;
    }
}
