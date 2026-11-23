package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
class d1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static d1 f210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static d1 f211k;
    private final View a;
    private final CharSequence b;
    private final int c;
    private final Runnable d = new a();
    private final Runnable e = new b();
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e1 f213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f214i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.c();
        }
    }

    private d1(View view, CharSequence charSequence) {
        this.a = view;
        this.b = charSequence;
        this.c = h.h.l.z.a(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.a.removeCallbacks(this.d);
    }

    private void b() {
        this.f = Integer.MAX_VALUE;
        this.f212g = Integer.MAX_VALUE;
    }

    private void d() {
        this.a.postDelayed(this.d, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(d1 d1Var) {
        d1 d1Var2 = f210j;
        if (d1Var2 != null) {
            d1Var2.a();
        }
        f210j = d1Var;
        if (d1Var != null) {
            d1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        d1 d1Var = f210j;
        if (d1Var != null && d1Var.a == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new d1(view, charSequence);
            return;
        }
        d1 d1Var2 = f211k;
        if (d1Var2 != null && d1Var2.a == view) {
            d1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f) <= this.c && Math.abs(y - this.f212g) <= this.c) {
            return false;
        }
        this.f = x;
        this.f212g = y;
        return true;
    }

    void c() {
        if (f211k == this) {
            f211k = null;
            e1 e1Var = this.f213h;
            if (e1Var != null) {
                e1Var.c();
                this.f213h = null;
                b();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f210j == this) {
            e(null);
        }
        this.a.removeCallbacks(this.e);
    }

    void g(boolean z) {
        long longPressTimeout;
        if (h.h.l.y.z(this.a)) {
            e(null);
            d1 d1Var = f211k;
            if (d1Var != null) {
                d1Var.c();
            }
            f211k = this;
            this.f214i = z;
            e1 e1Var = new e1(this.a.getContext());
            this.f213h = e1Var;
            e1Var.e(this.a, this.f, this.f212g, this.f214i, this.b);
            this.a.addOnAttachStateChangeListener(this);
            if (this.f214i) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((h.h.l.y.w(this.a) & 1) == 1 ? 3000L : 15000L) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.a.removeCallbacks(this.e);
            this.a.postDelayed(this.e, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f213h != null && this.f214i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.a.isEnabled() && this.f213h == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.f212g = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
