package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends ViewGroup {
    protected final a a;
    protected final Context b;
    protected ActionMenuView c;
    protected d d;
    protected int e;
    protected h.h.l.c0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f183h;

    protected class a implements h.h.l.d0 {
        private boolean a = false;
        int b;

        protected a() {
        }

        @Override // h.h.l.d0
        public void a(View view) {
            this.a = true;
        }

        @Override // h.h.l.d0
        public void b(View view) {
            if (this.a) {
                return;
            }
            b bVar = b.this;
            bVar.f = null;
            b.super.setVisibility(this.b);
        }

        @Override // h.h.l.d0
        public void c(View view) {
            b.super.setVisibility(0);
            this.a = false;
        }

        public a d(h.h.l.c0 c0Var, int i2) {
            b.this.f = c0Var;
            this.b = i2;
            return this;
        }
    }

    b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(h.b.a.a, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    protected int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    protected int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public h.h.l.c0 f(int i2, long j2) {
        h.h.l.c0 c0Var = this.f;
        if (c0Var != null) {
            c0Var.b();
        }
        if (i2 != 0) {
            h.h.l.c0 c0VarB = h.h.l.y.b(this);
            c0VarB.a(0.0f);
            c0VarB.d(j2);
            a aVar = this.a;
            aVar.d(c0VarB, i2);
            c0VarB.f(aVar);
            return c0VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        h.h.l.c0 c0VarB2 = h.h.l.y.b(this);
        c0VarB2.a(1.0f);
        c0VarB2.d(j2);
        a aVar2 = this.a;
        aVar2.d(c0VarB2, i2);
        c0VarB2.f(aVar2);
        return c0VarB2;
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h.b.j.a, h.b.a.c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(h.b.j.f1723j, 0));
        typedArrayObtainStyledAttributes.recycle();
        d dVar = this.d;
        if (dVar != null) {
            dVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f183h = false;
        }
        if (!this.f183h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f183h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f183h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f182g = false;
        }
        if (!this.f182g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f182g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f182g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            h.h.l.c0 c0Var = this.f;
            if (c0Var != null) {
                c0Var.b();
            }
            super.setVisibility(i2);
        }
    }
}
