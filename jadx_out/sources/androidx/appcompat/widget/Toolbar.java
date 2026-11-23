package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int F;
    private CharSequence G;
    private CharSequence H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList<View> M;
    private final ArrayList<View> N;
    private final int[] O;
    final h.h.l.k P;
    private ArrayList<MenuItem> Q;
    f R;
    private final ActionMenuView.e S;
    private b1 T;
    private androidx.appcompat.widget.d U;
    private d V;
    private androidx.appcompat.view.menu.m.a W;
    private ActionMenuView a;
    private androidx.appcompat.view.menu.g.a a0;
    private TextView b;
    private boolean b0;
    private TextView c;
    private final Runnable c0;
    private ImageButton d;
    private ImageView e;
    private Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ImageButton f169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f176o;
    private int p;
    private int q;
    private int r;
    private int s;
    private s0 t;
    private int u;
    private int v;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.P.b(menuItem)) {
                return true;
            }
            f fVar = Toolbar.this.R;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.P();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements androidx.appcompat.view.menu.m {
        androidx.appcompat.view.menu.g a;
        androidx.appcompat.view.menu.i b;

        d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void c(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.a;
            if (gVar2 != null && (iVar = this.b) != null) {
                gVar2.f(iVar);
            }
            this.a = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void f(boolean z) {
            if (this.b != null) {
                androidx.appcompat.view.menu.g gVar = this.a;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.a.getItem(i2) == this.b) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                i(this.a, this.b);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean h() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean i(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.f170i;
            if (callback instanceof h.b.n.c) {
                ((h.b.n.c) callback).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f170i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f169h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f170i = null;
            toolbar3.a();
            this.b = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean j(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f169h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f169h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f169h);
            }
            Toolbar.this.f170i = iVar.getActionView();
            this.b = iVar;
            ViewParent parent2 = Toolbar.this.f170i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f170i);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.a = 8388611 | (toolbar4.f175n & 112);
                eVarGenerateDefaultLayoutParams.b = 2;
                toolbar4.f170i.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f170i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f170i;
            if (callback instanceof h.b.n.c) {
                ((h.b.n.c) callback).c();
            }
            return true;
        }
    }

    public static class e extends androidx.appcompat.app.a.C0008a {
        int b;

        public e(int i2, int i3) {
            super(i2, i3);
            this.b = 0;
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public e(androidx.appcompat.app.a.C0008a c0008a) {
            super(c0008a);
            this.b = 0;
        }

        public e(e eVar) {
            super((androidx.appcompat.app.a.C0008a) eVar);
            this.b = 0;
            this.b = eVar.b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends h.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        int c;
        boolean d;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // h.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.M);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.F = 8388627;
        this.M = new ArrayList<>();
        this.N = new ArrayList<>();
        this.O = new int[2];
        this.P = new h.h.l.k(new Runnable() { // from class: androidx.appcompat.widget.a
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y();
            }
        });
        this.Q = new ArrayList<>();
        this.S = new a();
        this.c0 = new b();
        Context context2 = getContext();
        int[] iArr = h.b.j.K2;
        a1 a1VarU = a1.u(context2, attributeSet, iArr, i2, 0);
        h.h.l.y.L(this, context, iArr, attributeSet, a1VarU.q(), i2, 0);
        this.f173l = a1VarU.m(h.b.j.m3, 0);
        this.f174m = a1VarU.m(h.b.j.d3, 0);
        this.F = a1VarU.k(h.b.j.L2, this.F);
        this.f175n = a1VarU.k(h.b.j.M2, 48);
        int iD = a1VarU.d(h.b.j.g3, 0);
        int i3 = h.b.j.l3;
        iD = a1VarU.r(i3) ? a1VarU.d(i3, iD) : iD;
        this.s = iD;
        this.r = iD;
        this.q = iD;
        this.p = iD;
        int iD2 = a1VarU.d(h.b.j.j3, -1);
        if (iD2 >= 0) {
            this.p = iD2;
        }
        int iD3 = a1VarU.d(h.b.j.i3, -1);
        if (iD3 >= 0) {
            this.q = iD3;
        }
        int iD4 = a1VarU.d(h.b.j.k3, -1);
        if (iD4 >= 0) {
            this.r = iD4;
        }
        int iD5 = a1VarU.d(h.b.j.h3, -1);
        if (iD5 >= 0) {
            this.s = iD5;
        }
        this.f176o = a1VarU.e(h.b.j.X2, -1);
        int iD6 = a1VarU.d(h.b.j.T2, Integer.MIN_VALUE);
        int iD7 = a1VarU.d(h.b.j.P2, Integer.MIN_VALUE);
        int iE = a1VarU.e(h.b.j.R2, 0);
        int iE2 = a1VarU.e(h.b.j.S2, 0);
        h();
        this.t.e(iE, iE2);
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.t.g(iD6, iD7);
        }
        this.u = a1VarU.d(h.b.j.U2, Integer.MIN_VALUE);
        this.v = a1VarU.d(h.b.j.Q2, Integer.MIN_VALUE);
        this.f = a1VarU.f(h.b.j.O2);
        this.f168g = a1VarU.o(h.b.j.N2);
        CharSequence charSequenceO = a1VarU.o(h.b.j.f3);
        if (!TextUtils.isEmpty(charSequenceO)) {
            setTitle(charSequenceO);
        }
        CharSequence charSequenceO2 = a1VarU.o(h.b.j.c3);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            setSubtitle(charSequenceO2);
        }
        this.f171j = getContext();
        setPopupTheme(a1VarU.m(h.b.j.b3, 0));
        Drawable drawableF = a1VarU.f(h.b.j.a3);
        if (drawableF != null) {
            setNavigationIcon(drawableF);
        }
        CharSequence charSequenceO3 = a1VarU.o(h.b.j.Z2);
        if (!TextUtils.isEmpty(charSequenceO3)) {
            setNavigationContentDescription(charSequenceO3);
        }
        Drawable drawableF2 = a1VarU.f(h.b.j.V2);
        if (drawableF2 != null) {
            setLogo(drawableF2);
        }
        CharSequence charSequenceO4 = a1VarU.o(h.b.j.W2);
        if (!TextUtils.isEmpty(charSequenceO4)) {
            setLogoDescription(charSequenceO4);
        }
        int i4 = h.b.j.n3;
        if (a1VarU.r(i4)) {
            setTitleTextColor(a1VarU.c(i4));
        }
        int i5 = h.b.j.e3;
        if (a1VarU.r(i5)) {
            setSubtitleTextColor(a1VarU.c(i5));
        }
        int i6 = h.b.j.Y2;
        if (a1VarU.r(i6)) {
            x(a1VarU.m(i6, 0));
        }
        a1VarU.v();
    }

    private int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int D(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int E(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void F(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.P.a(getMenu(), getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.Q = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.c0);
        post(this.c0);
    }

    private boolean N() {
        if (!this.b0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (O(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean O(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z = h.h.l.y.q(this) == 1;
        int childCount = getChildCount();
        int iA = h.h.l.g.a(i2, h.h.l.y.q(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && O(childAt) && p(eVar.a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && O(childAt2) && p(eVar2.a) == iA) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z) {
        e eVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            eVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        }
        eVarGenerateLayoutParams.b = 1;
        if (!z || this.f170i == null) {
            addView(view, eVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateLayoutParams);
            this.N.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h.b.n.g(getContext());
    }

    private void h() {
        if (this.t == null) {
            this.t = new s0();
        }
    }

    private void i() {
        if (this.e == null) {
            this.e = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.a.L() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.a.getMenu();
            if (this.V == null) {
                this.V = new d();
            }
            this.a.setExpandedActionViewsExclusive(true);
            gVar.c(this.V, this.f171j);
        }
    }

    private void k() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.f172k);
            this.a.setOnMenuItemClickListener(this.S);
            this.a.M(this.W, this.a0);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.a = 8388613 | (this.f175n & 112);
            this.a.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.a, false);
        }
    }

    private void l() {
        if (this.d == null) {
            this.d = new q(getContext(), null, h.b.a.L);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.a = 8388611 | (this.f175n & 112);
            this.d.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i2) {
        int iQ = h.h.l.y.q(this);
        int iA = h.h.l.g.a(i2, iQ) & 7;
        if (iA == 1 || iA == 3 || iA == 5) {
            return iA;
        }
        return iQ == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int iR = r(eVar.a);
        if (iR == 48) {
            return getPaddingTop() - i3;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.F & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return h.h.l.j.b(marginLayoutParams) + h.h.l.j.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int measuredWidth = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, i6);
            int iMax3 = Math.max(0, -i5);
            int iMax4 = Math.max(0, -i6);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i4++;
            i3 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.N.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.H();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).b != 2 && childAt != this.a) {
                removeViewAt(childCount);
                this.N.add(childAt);
            }
        }
    }

    public void J(int i2, int i3) {
        h();
        this.t.g(i2, i3);
    }

    public void K(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.d dVar) {
        if (gVar == null && this.a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g gVarL = this.a.L();
        if (gVarL == gVar) {
            return;
        }
        if (gVarL != null) {
            gVarL.O(this.U);
            gVarL.O(this.V);
        }
        if (this.V == null) {
            this.V = new d();
        }
        dVar.G(true);
        if (gVar != null) {
            gVar.c(dVar, this.f171j);
            gVar.c(this.V, this.f171j);
        } else {
            dVar.c(this.f171j, null);
            this.V.c(this.f171j, null);
            dVar.f(true);
            this.V.f(true);
        }
        this.a.setPopupTheme(this.f172k);
        this.a.setPresenter(dVar);
        this.U = dVar;
    }

    public void L(Context context, int i2) {
        this.f174m = i2;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void M(Context context, int i2) {
        this.f173l = i2;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean P() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.N();
    }

    void a() {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            addView(this.N.get(size));
        }
        this.N.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.a) != null && actionMenuView.I();
    }

    public void e() {
        d dVar = this.V;
        androidx.appcompat.view.menu.i iVar = dVar == null ? null : dVar.b;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f169h == null) {
            q qVar = new q(getContext(), null, h.b.a.L);
            this.f169h = qVar;
            qVar.setImageDrawable(this.f);
            this.f169h.setContentDescription(this.f168g);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.a = 8388611 | (this.f175n & 112);
            eVarGenerateDefaultLayoutParams.b = 2;
            this.f169h.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f169h.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f169h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f169h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        s0 s0Var = this.t;
        if (s0Var != null) {
            return s0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        s0 s0Var = this.t;
        if (s0Var != null) {
            return s0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        s0 s0Var = this.t;
        if (s0Var != null) {
            return s0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        s0 s0Var = this.t;
        if (s0Var != null) {
            return s0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarL;
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && (gVarL = actionMenuView.L()) != null && gVarL.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.v, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return h.h.l.y.q(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return h.h.l.y.q(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.a.getMenu();
    }

    View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.d getOuterActionMenuPresenter() {
        return this.U;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f171j;
    }

    public int getPopupTheme() {
        return this.f172k;
    }

    public CharSequence getSubtitle() {
        return this.H;
    }

    final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.G;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    final TextView getTitleTextView() {
        return this.b;
    }

    public h0 getWrapper() {
        if (this.T == null) {
            this.T = new b1(this, true);
        }
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.a.C0008a) {
            return new e((androidx.appcompat.app.a.C0008a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.c0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.L = false;
        }
        if (!this.L) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.L = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.L = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0239  */
    /* JADX WARN: Code duplicated, block: B:102:0x025c  */
    /* JADX WARN: Code duplicated, block: B:104:0x025f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0283  */
    /* JADX WARN: Code duplicated, block: B:107:0x0286  */
    /* JADX WARN: Code duplicated, block: B:110:0x0299 A[LOOP:0: B:109:0x0297->B:110:0x0299, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02bb A[LOOP:1: B:112:0x02b9->B:113:0x02bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f4 A[LOOP:2: B:121:0x02f2->B:122:0x02f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:81:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x0213  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216  */
    /* JADX WARN: Code duplicated, block: B:96:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0221  */
    /* JADX WARN: Code duplicated, block: B:98:0x0225  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int iC;
        int iD;
        int iMax;
        int iMin;
        boolean zO;
        boolean zO2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        e eVar;
        e eVar2;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int size;
        int i20;
        int i21;
        int size2;
        int i22;
        int i23;
        int i24;
        int size3;
        ImageView imageView;
        View view;
        ActionMenuView actionMenuView;
        ImageButton imageButton;
        boolean z3 = h.h.l.y.q(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.O;
        iArr[1] = 0;
        iArr[0] = 0;
        int iR = h.h.l.y.r(this);
        int iMin2 = iR >= 0 ? Math.min(iR, i5 - i3) : 0;
        if (O(this.d)) {
            ImageButton imageButton2 = this.d;
            if (z3) {
                iD = D(imageButton2, i25, iArr, iMin2);
                iC = paddingLeft;
            } else {
                iC = C(imageButton2, paddingLeft, iArr, iMin2);
            }
            if (O(this.f169h)) {
                imageButton = this.f169h;
                if (z3) {
                    iD = D(imageButton, iD, iArr, iMin2);
                } else {
                    iC = C(imageButton, iC, iArr, iMin2);
                }
            }
            if (O(this.a)) {
                actionMenuView = this.a;
                if (z3) {
                    iC = C(actionMenuView, iC, iArr, iMin2);
                } else {
                    iD = D(actionMenuView, iD, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iC);
            iArr[1] = Math.max(0, currentContentInsetRight - (i25 - iD));
            iMax = Math.max(iC, currentContentInsetLeft);
            iMin = Math.min(iD, i25 - currentContentInsetRight);
            if (O(this.f170i)) {
                view = this.f170i;
                if (z3) {
                    iMin = D(view, iMin, iArr, iMin2);
                } else {
                    iMax = C(view, iMax, iArr, iMin2);
                }
            }
            if (O(this.e)) {
                imageView = this.e;
                if (z3) {
                    iMin = D(imageView, iMin, iArr, iMin2);
                } else {
                    iMax = C(imageView, iMax, iArr, iMin2);
                }
            }
            zO = O(this.b);
            zO2 = O(this.c);
            if (zO) {
                e eVar3 = (e) this.b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zO2) {
                e eVar4 = (e) this.c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) eVar4).topMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin;
            }
            if (!zO || zO2) {
                if (zO) {
                    textView = this.b;
                } else {
                    textView = this.c;
                }
                if (zO2) {
                    textView2 = this.c;
                } else {
                    textView2 = this.b;
                }
                eVar = (e) textView.getLayoutParams();
                eVar2 = (e) textView2.getLayoutParams();
                z2 = (!zO && this.b.getMeasuredWidth() > 0) || (zO2 && this.c.getMeasuredWidth() > 0);
                i6 = this.F & 112;
                i7 = paddingLeft;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.r;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    i16 = this.r;
                    if (iMax2 < i15 + i16) {
                        iMax2 = i15 + i16;
                    } else {
                        i17 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        i19 = this.s;
                        if (i17 < i18 + i19) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.s) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i12 = this.p;
                    } else {
                        i12 = 0;
                    }
                    int i26 = i12 - iArr[1];
                    iMin -= Math.max(0, i26);
                    iArr[1] = Math.max(0, -i26);
                    if (zO) {
                        e eVar5 = (e) this.b.getLayoutParams();
                        int measuredWidth = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i13 = measuredWidth - this.q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (zO2) {
                        e eVar6 = (e) this.c.getLayoutParams();
                        int i27 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar6).topMargin;
                        this.c.layout(iMin - this.c.getMeasuredWidth(), i27, iMin, this.c.getMeasuredHeight() + i27);
                        i14 = iMin - this.q;
                        int i28 = ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin;
                    } else {
                        i14 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i13, i14);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i9 = this.p;
                        i8 = 0;
                    } else {
                        i8 = 0;
                        i9 = 0;
                    }
                    int i29 = i9 - iArr[i8];
                    iMax += Math.max(i8, i29);
                    iArr[i8] = Math.max(i8, -i29);
                    if (zO) {
                        e eVar7 = (e) this.b.getLayoutParams();
                        int measuredWidth2 = this.b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i10 = measuredWidth2 + this.q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) eVar7).bottomMargin;
                    } else {
                        i10 = iMax;
                    }
                    if (zO2) {
                        e eVar8 = (e) this.c.getLayoutParams();
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar8).topMargin;
                        int measuredWidth3 = this.c.getMeasuredWidth() + iMax;
                        this.c.layout(iMax, i30, measuredWidth3, this.c.getMeasuredHeight() + i30);
                        i11 = measuredWidth3 + this.q;
                        int i31 = ((ViewGroup.MarginLayoutParams) eVar8).bottomMargin;
                    } else {
                        i11 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i10, i11);
                    }
                }
                b(this.M, 3);
                size = this.M.size();
                for (i20 = 0; i20 < size; i20++) {
                    iMax = C(this.M.get(i20), iMax, iArr, iMin2);
                }
                i21 = iMin2;
                b(this.M, 5);
                size2 = this.M.size();
                for (i22 = 0; i22 < size2; i22++) {
                    iMin = D(this.M.get(i22), iMin, iArr, i21);
                }
                b(this.M, 1);
                int iU = u(this.M, iArr);
                i23 = (i7 + (((width - i7) - paddingRight) / 2)) - (iU / 2);
                i24 = iU + i23;
                if (i23 >= iMax) {
                    if (i24 > iMin) {
                        iMax = i23 - (i24 - iMin);
                    } else {
                        iMax = i23;
                    }
                }
                size3 = this.M.size();
                while (i8 < size3) {
                    iMax = C(this.M.get(i8), iMax, iArr, i21);
                    i8++;
                }
                this.M.clear();
            }
            i7 = paddingLeft;
            iMin2 = iMin2;
            i8 = 0;
            b(this.M, 3);
            size = this.M.size();
            while (i20 < size) {
                iMax = C(this.M.get(i20), iMax, iArr, iMin2);
            }
            i21 = iMin2;
            b(this.M, 5);
            size2 = this.M.size();
            while (i22 < size2) {
                iMin = D(this.M.get(i22), iMin, iArr, i21);
            }
            b(this.M, 1);
            int iU2 = u(this.M, iArr);
            i23 = (i7 + (((width - i7) - paddingRight) / 2)) - (iU2 / 2);
            i24 = iU2 + i23;
            if (i23 >= iMax) {
                if (i24 > iMin) {
                    iMax = i23 - (i24 - iMin);
                } else {
                    iMax = i23;
                }
            }
            size3 = this.M.size();
            while (i8 < size3) {
                iMax = C(this.M.get(i8), iMax, iArr, i21);
                i8++;
            }
            this.M.clear();
        }
        iC = paddingLeft;
        iD = i25;
        if (O(this.f169h)) {
            imageButton = this.f169h;
            if (z3) {
                iD = D(imageButton, iD, iArr, iMin2);
            } else {
                iC = C(imageButton, iC, iArr, iMin2);
            }
        }
        if (O(this.a)) {
            actionMenuView = this.a;
            if (z3) {
                iC = C(actionMenuView, iC, iArr, iMin2);
            } else {
                iD = D(actionMenuView, iD, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iC);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - iD));
        iMax = Math.max(iC, currentContentInsetLeft2);
        iMin = Math.min(iD, i25 - currentContentInsetRight2);
        if (O(this.f170i)) {
            view = this.f170i;
            if (z3) {
                iMin = D(view, iMin, iArr, iMin2);
            } else {
                iMax = C(view, iMax, iArr, iMin2);
            }
        }
        if (O(this.e)) {
            imageView = this.e;
            if (z3) {
                iMin = D(imageView, iMin, iArr, iMin2);
            } else {
                iMax = C(imageView, iMax, iArr, iMin2);
            }
        }
        zO = O(this.b);
        zO2 = O(this.c);
        if (zO) {
            e eVar9 = (e) this.b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar9).topMargin + this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar9).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zO2) {
            e eVar10 = (e) this.c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) eVar10).topMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar10).bottomMargin;
        }
        if (zO) {
            if (zO) {
                textView = this.b;
            } else {
                textView = this.c;
            }
            if (zO2) {
                textView2 = this.c;
            } else {
                textView2 = this.b;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zO) {
            }
            i6 = this.F & 112;
            i7 = paddingLeft;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.r;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i16 = this.r;
                if (iMax2 < i15 + i16) {
                    iMax2 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i19 = this.s;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.s) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i12 = this.p;
                } else {
                    i12 = 0;
                }
                int i210 = i12 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zO) {
                    e eVar11 = (e) this.b.getLayoutParams();
                    int measuredWidth4 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i13 = measuredWidth4 - this.q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) eVar11).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zO2) {
                    e eVar12 = (e) this.c.getLayoutParams();
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar12).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i211, iMin, this.c.getMeasuredHeight() + i211);
                    i14 = iMin - this.q;
                    int i212 = ((ViewGroup.MarginLayoutParams) eVar12).bottomMargin;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                iMax = iMax;
                i8 = 0;
            } else {
                if (z2) {
                    i9 = this.p;
                    i8 = 0;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                int i213 = i9 - iArr[i8];
                iMax += Math.max(i8, i213);
                iArr[i8] = Math.max(i8, -i213);
                if (zO) {
                    e eVar13 = (e) this.b.getLayoutParams();
                    int measuredWidth5 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i10 = measuredWidth5 + this.q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) eVar13).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (zO2) {
                    e eVar14 = (e) this.c.getLayoutParams();
                    int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar14).topMargin;
                    int measuredWidth6 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i32, measuredWidth6, this.c.getMeasuredHeight() + i32);
                    i11 = measuredWidth6 + this.q;
                    int i33 = ((ViewGroup.MarginLayoutParams) eVar14).bottomMargin;
                } else {
                    i11 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i10, i11);
                }
            }
        } else {
            if (zO) {
                textView = this.b;
            } else {
                textView = this.c;
            }
            if (zO2) {
                textView2 = this.c;
            } else {
                textView2 = this.b;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zO) {
            }
            i6 = this.F & 112;
            i7 = paddingLeft;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.r;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i16 = this.r;
                if (iMax2 < i15 + i16) {
                    iMax2 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i19 = this.s;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.s) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i12 = this.p;
                } else {
                    i12 = 0;
                }
                int i214 = i12 - iArr[1];
                iMin -= Math.max(0, i214);
                iArr[1] = Math.max(0, -i214);
                if (zO) {
                    e eVar15 = (e) this.b.getLayoutParams();
                    int measuredWidth7 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i13 = measuredWidth7 - this.q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) eVar15).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zO2) {
                    e eVar16 = (e) this.c.getLayoutParams();
                    int i215 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar16).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i215, iMin, this.c.getMeasuredHeight() + i215);
                    i14 = iMin - this.q;
                    int i216 = ((ViewGroup.MarginLayoutParams) eVar16).bottomMargin;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                iMax = iMax;
                i8 = 0;
            } else {
                if (z2) {
                    i9 = this.p;
                    i8 = 0;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                int i217 = i9 - iArr[i8];
                iMax += Math.max(i8, i217);
                iArr[i8] = Math.max(i8, -i217);
                if (zO) {
                    e eVar17 = (e) this.b.getLayoutParams();
                    int measuredWidth8 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i10 = measuredWidth8 + this.q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) eVar17).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (zO2) {
                    e eVar18 = (e) this.c.getLayoutParams();
                    int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) eVar18).topMargin;
                    int measuredWidth9 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i34, measuredWidth9, this.c.getMeasuredHeight() + i34);
                    i11 = measuredWidth9 + this.q;
                    int i35 = ((ViewGroup.MarginLayoutParams) eVar18).bottomMargin;
                } else {
                    i11 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i10, i11);
                }
            }
        }
        b(this.M, 3);
        size = this.M.size();
        while (i20 < size) {
            iMax = C(this.M.get(i20), iMax, iArr, iMin2);
        }
        i21 = iMin2;
        b(this.M, 5);
        size2 = this.M.size();
        while (i22 < size2) {
            iMin = D(this.M.get(i22), iMin, iArr, i21);
        }
        b(this.M, 1);
        int iU3 = u(this.M, iArr);
        i23 = (i7 + (((width - i7) - paddingRight) / 2)) - (iU3 / 2);
        i24 = iU3 + i23;
        if (i23 >= iMax) {
            if (i24 > iMin) {
                iMax = i23 - (i24 - iMin);
            } else {
                iMax = i23;
            }
        }
        size3 = this.M.size();
        while (i8 < size3) {
            iMax = C(this.M.get(i8), iMax, iArr, i21);
            i8++;
        }
        this.M.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.O;
        if (g1.b(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (O(this.d)) {
            F(this.d, i2, 0, i3, 0, this.f176o);
            measuredWidth = this.d.getMeasuredWidth() + s(this.d);
            iMax = Math.max(0, this.d.getMeasuredHeight() + t(this.d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (O(this.f169h)) {
            F(this.f169h, i2, 0, i3, 0, this.f176o);
            measuredWidth = this.f169h.getMeasuredWidth() + s(this.f169h);
            iMax = Math.max(iMax, this.f169h.getMeasuredHeight() + t(this.f169h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f169h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[c2] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (O(this.a)) {
            F(this.a, i2, iMax3, i3, 0, this.f176o);
            measuredWidth2 = this.a.getMeasuredWidth() + s(this.a);
            iMax = Math.max(iMax, this.a.getMeasuredHeight() + t(this.a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (O(this.f170i)) {
            iMax4 += E(this.f170i, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f170i.getMeasuredHeight() + t(this.f170i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f170i.getMeasuredState());
        }
        if (O(this.e)) {
            iMax4 += E(this.e, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.e.getMeasuredHeight() + t(this.e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((e) childAt.getLayoutParams()).b == 0 && O(childAt)) {
                iMax4 += E(childAt, i2, iMax4, i3, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.r + this.s;
        int i6 = this.p + this.q;
        if (O(this.b)) {
            E(this.b, i2, iMax4 + i6, i3, i5, iArr);
            int measuredWidth3 = this.b.getMeasuredWidth() + s(this.b);
            measuredHeight = this.b.getMeasuredHeight() + t(this.b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (O(this.c)) {
            iMax2 = Math.max(iMax2, E(this.c, i2, iMax4 + i6, i3, measuredHeight + i5, iArr));
            measuredHeight += this.c.getMeasuredHeight() + t(this.c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), N() ? 0 : View.resolveSizeAndState(Math.max(iMax5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.a;
        androidx.appcompat.view.menu.g gVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i2 = gVar.c;
        if (i2 != 0 && this.V != null && gVarL != null && (menuItemFindItem = gVarL.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        this.t.f(i2 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.V;
        if (dVar != null && (iVar = dVar.b) != null) {
            gVar.c = iVar.getItemId();
        }
        gVar.d = B();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
        }
        if (!this.K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.K = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f169h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(h.b.k.a.a.b(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f169h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f169h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.b0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.u) {
            this.u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(h.b.k.a.a.b(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.e)) {
                c(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && z(imageView)) {
                removeView(this.e);
                this.N.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            c1.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(h.b.k.a.a.b(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.d)) {
                c(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.d);
                this.N.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.R = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f172k != i2) {
            this.f172k = i2;
            if (i2 == 0) {
                this.f171j = getContext();
            } else {
                this.f171j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && z(textView)) {
                removeView(this.c);
                this.N.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                d0 d0Var = new d0(context);
                this.c = d0Var;
                d0Var.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f174m;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!z(this.c)) {
                c(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.H = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.J = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && z(textView)) {
                removeView(this.b);
                this.N.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                d0 d0Var = new d0(context);
                this.b = d0Var;
                d0Var.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f173l;
                if (i2 != 0) {
                    this.b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!z(this.b)) {
                c(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.G = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.V;
        return (dVar == null || dVar.b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.Q.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }
}
