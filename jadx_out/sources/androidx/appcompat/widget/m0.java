package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f243o;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public m0(Context context) {
        this(context, null);
    }

    public m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = h.b.j.W0;
        a1 a1VarU = a1.u(context, attributeSet, iArr, i2, 0);
        h.h.l.y.L(this, context, iArr, attributeSet, a1VarU.q(), i2, 0);
        int iJ = a1VarU.j(h.b.j.Y0, -1);
        if (iJ >= 0) {
            setOrientation(iJ);
        }
        int iJ2 = a1VarU.j(h.b.j.X0, -1);
        if (iJ2 >= 0) {
            setGravity(iJ2);
        }
        boolean zA = a1VarU.a(h.b.j.Z0, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f235g = a1VarU.h(h.b.j.b1, -1.0f);
        this.b = a1VarU.j(h.b.j.a1, -1);
        this.f236h = a1VarU.a(h.b.j.e1, false);
        setDividerDrawable(a1VarU.f(h.b.j.c1));
        this.f242n = a1VarU.j(h.b.j.f1, 0);
        this.f243o = a1VarU.e(h.b.j.d1, 0);
        a1VarU.v();
    }

    private void i(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewQ = q(i4);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewQ.getMeasuredWidth();
                    measureChildWithMargins(viewQ, i3, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void j(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewQ = q(i4);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewQ.getMeasuredHeight();
                    measureChildWithMargins(viewQ, iMakeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i5;
                }
            }
        }
    }

    private void y(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void e(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = g1.b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewQ = q(i2);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i2)) {
                a aVar = (a) viewQ.getLayoutParams();
                h(canvas, zB ? viewQ.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewQ.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f240l);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            if (viewQ2 != null) {
                a aVar2 = (a) viewQ2.getLayoutParams();
                if (zB) {
                    left = viewQ2.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f240l;
                } else {
                    right = viewQ2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f240l;
            }
            h(canvas, right);
        }
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewQ = q(i2);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i2)) {
                g(canvas, (viewQ.getTop() - ((LinearLayout.LayoutParams) ((a) viewQ.getLayoutParams())).topMargin) - this.f241m);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            g(canvas, viewQ2 == null ? (getHeight() - getPaddingBottom()) - this.f241m : viewQ2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewQ2.getLayoutParams())).bottomMargin);
        }
    }

    void g(Canvas canvas, int i2) {
        this.f239k.setBounds(getPaddingLeft() + this.f243o, i2, (getWidth() - getPaddingRight()) - this.f243o, this.f241m + i2);
        this.f239k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.c;
        if (this.d == 1 && (i2 = this.e & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.f239k;
    }

    public int getDividerPadding() {
        return this.f243o;
    }

    public int getDividerWidth() {
        return this.f240l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.f242n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f235g;
    }

    void h(Canvas canvas, int i2) {
        this.f239k.setBounds(i2, getPaddingTop() + this.f243o, this.f240l + i2, (getHeight() - getPaddingBottom()) - this.f243o);
        this.f239k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i2 = this.d;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int n(View view, int i2) {
        return 0;
    }

    int o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f239k == null) {
            return;
        }
        if (this.d == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.d == 1) {
            t(i2, i3, i4, i5);
        } else {
            s(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.d == 1) {
            x(i2, i3);
        } else {
            v(i2, i3);
        }
    }

    int p(View view) {
        return 0;
    }

    View q(int i2) {
        return getChildAt(i2);
    }

    protected boolean r(int i2) {
        if (i2 == 0) {
            return (this.f242n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f242n & 4) != 0;
        }
        if ((this.f242n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    void s(int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int measuredHeight;
        boolean zB = g1.b(this);
        int paddingTop = getPaddingTop();
        int i11 = i5 - i3;
        int paddingBottom = i11 - getPaddingBottom();
        int paddingBottom2 = (i11 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i12 = this.e;
        int i13 = i12 & 112;
        boolean z = this.a;
        int[] iArr = this.f237i;
        int[] iArr2 = this.f238j;
        int iA = h.h.l.g.a(8388615 & i12, h.h.l.y.q(this));
        if (iA != 1) {
            paddingLeft = iA != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f;
        } else {
            paddingLeft = getPaddingLeft() + (((i4 - i2) - this.f) / 2);
        }
        if (zB) {
            i6 = virtualChildCount - 1;
            i7 = -1;
        } else {
            i6 = 0;
            i7 = 1;
        }
        int iN = 0;
        while (iN < virtualChildCount) {
            int i14 = i6 + (i7 * iN);
            View viewQ = q(i14);
            if (viewQ == null) {
                paddingLeft += w(i14);
            } else {
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight2 = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i15 = iN;
                    if (z) {
                        i8 = virtualChildCount;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewQ.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i9 < 0) {
                            i9 = i13;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        } else if (i10 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewQ.getMeasuredHeight() - baseline);
                            }
                        }
                        if (r(i14)) {
                            paddingLeft += this.f240l;
                        }
                        int i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        y(viewQ, i16 + o(viewQ), measuredHeight, measuredWidth, measuredHeight2);
                        int iP = i16 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(viewQ);
                        iN = i15 + n(viewQ, i14);
                        paddingLeft = iP;
                    } else {
                        i8 = virtualChildCount;
                    }
                    i9 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i9 < 0) {
                        i9 = i13;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    } else if (i10 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                        if (baseline != -1) {
                            measuredHeight += iArr[1] - baseline;
                        }
                    } else if (i10 != 80) {
                        measuredHeight = paddingTop;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (viewQ.getMeasuredHeight() - baseline);
                        }
                    }
                    if (r(i14)) {
                        paddingLeft += this.f240l;
                    }
                    int i17 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    y(viewQ, i17 + o(viewQ), measuredHeight, measuredWidth, measuredHeight2);
                    int iP2 = i17 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(viewQ);
                    iN = i15 + n(viewQ, i14);
                    paddingLeft = iP2;
                }
                iN++;
                virtualChildCount = i8;
                i13 = i13;
                paddingTop = paddingTop;
            }
            i8 = virtualChildCount;
            iN++;
            virtualChildCount = i8;
            i13 = i13;
            paddingTop = paddingTop;
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f239k) {
            return;
        }
        this.f239k = drawable;
        if (drawable != null) {
            this.f240l = drawable.getIntrinsicWidth();
            this.f241m = drawable.getIntrinsicHeight();
        } else {
            this.f240l = 0;
            this.f241m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f243o = i2;
    }

    public void setGravity(int i2) {
        if (this.e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.e;
        if ((8388615 & i4) != i3) {
            this.e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f236h = z;
    }

    public void setOrientation(int i2) {
        if (this.d != i2) {
            this.d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f242n) {
            requestLayout();
        }
        this.f242n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.e;
        if ((i4 & 112) != i3) {
            this.e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f235g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    void t(int i2, int i3, int i4, int i5) {
        int paddingTop;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i4 - i2;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.e;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        if (i10 != 16) {
            paddingTop = i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f;
        } else {
            paddingTop = getPaddingTop() + (((i5 - i3) - this.f) / 2);
        }
        int iN = 0;
        while (iN < virtualChildCount) {
            View viewQ = q(iN);
            if (viewQ == null) {
                paddingTop += w(iN);
            } else if (viewQ.getVisibility() != 8) {
                int measuredWidth = viewQ.getMeasuredWidth();
                int measuredHeight = viewQ.getMeasuredHeight();
                a aVar = (a) viewQ.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i12 < 0) {
                    i12 = i11;
                }
                int iA = h.h.l.g.a(i12, h.h.l.y.q(this)) & 7;
                if (iA != 1) {
                    if (iA != 5) {
                        i7 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    } else {
                        i6 = paddingRight - measuredWidth;
                    }
                    int i13 = i7;
                    if (r(iN)) {
                        paddingTop += this.f241m;
                    }
                    int i14 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(viewQ, i13, i14 + o(viewQ), measuredWidth, measuredHeight);
                    int iP = i14 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                    iN += n(viewQ, iN);
                    paddingTop = iP;
                } else {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                }
                i7 = i6 - ((LinearLayout.LayoutParams) aVar).rightMargin;
                int i15 = i7;
                if (r(iN)) {
                    paddingTop += this.f241m;
                }
                int i16 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                y(viewQ, i15, i16 + o(viewQ), measuredWidth, measuredHeight);
                int iP2 = i16 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                iN += n(viewQ, iN);
                paddingTop = iP2;
            }
            iN++;
        }
    }

    void u(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03ae A[PHI: r3
  0x03ae: PHI (r3v36 int) = (r3v32 int), (r3v37 int) binds: [B:168:0x03ac, B:164:0x03a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x043a  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    /* JADX WARN: Code duplicated, block: B:70:0x018f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d3  */
    void v(int i2, int i3) {
        int[] iArr;
        int i4;
        int iMax;
        int iMax2;
        int i5;
        int i6;
        int baseline;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        View view;
        int iMax3;
        int i11;
        boolean z3;
        int i12;
        int measuredHeight;
        int iN;
        int baseline2;
        int i13;
        this.f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (this.f237i == null || this.f238j == null) {
            this.f237i = new int[4];
            this.f238j = new int[4];
        }
        int[] iArr2 = this.f237i;
        int[] iArr3 = this.f238j;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z4 = this.a;
        boolean z5 = this.f236h;
        int i14 = 1073741824;
        boolean z6 = mode == 1073741824;
        float f = 0.0f;
        int iN2 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        int iMax7 = 0;
        boolean z7 = false;
        int iCombineMeasuredStates = 0;
        boolean z8 = true;
        boolean z9 = false;
        while (true) {
            iArr = iArr3;
            if (iN2 >= virtualChildCount) {
                break;
            }
            View viewQ = q(iN2);
            if (viewQ == null) {
                this.f += w(iN2);
            } else {
                if (viewQ.getVisibility() == 8) {
                    iN2 += n(viewQ, iN2);
                } else {
                    if (r(iN2)) {
                        this.f += this.f240l;
                    }
                    a aVar = (a) viewQ.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f3 = f + f2;
                    if (mode == i14 && ((LinearLayout.LayoutParams) aVar).width == 0 && f2 > 0.0f) {
                        int i15 = this.f;
                        this.f = z6 ? i15 + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin : Math.max(i15, ((LinearLayout.LayoutParams) aVar).leftMargin + i15 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        if (z4) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewQ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i10 = iN2;
                            z = z5;
                            z2 = z4;
                            view = viewQ;
                        } else {
                            i10 = iN2;
                            z = z5;
                            z2 = z4;
                            view = viewQ;
                            i11 = 1073741824;
                            z7 = true;
                        }
                        if (mode2 == i11 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z3 = true;
                            z9 = true;
                        } else {
                            z3 = false;
                        }
                        i12 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i12;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z2 && (baseline2 = view.getBaseline()) != -1) {
                            i13 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i13 < 0) {
                                i13 = this.e;
                            }
                            int i16 = (((i13 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i16] = Math.max(iArr2[i16], baseline2);
                            iArr[i16] = Math.max(iArr[i16], measuredHeight - baseline2);
                        }
                        iMax5 = Math.max(iMax5, measuredHeight);
                        if (z8 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                            if (!z3) {
                                i12 = measuredHeight;
                            }
                            iMax7 = Math.max(iMax7, i12);
                        } else {
                            int i17 = iMax7;
                            if (!z3) {
                                i12 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i12);
                            iMax7 = i17;
                        }
                        int i18 = i10;
                        iN = n(view, i18) + i18;
                        f = f3;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f2 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i9 = 0;
                        }
                        i10 = iN2;
                        int i19 = i9;
                        z = z5;
                        z2 = z4;
                        u(viewQ, i10, i2, f3 == 0.0f ? this.f : 0, i3, 0);
                        if (i19 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i19;
                        }
                        int measuredWidth = viewQ.getMeasuredWidth();
                        if (z6) {
                            view = viewQ;
                            iMax3 = this.f + ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view);
                        } else {
                            view = viewQ;
                            int i20 = this.f;
                            iMax3 = Math.max(i20, i20 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view));
                        }
                        this.f = iMax3;
                        if (z) {
                            iMax4 = Math.max(measuredWidth, iMax4);
                        }
                    }
                    i11 = 1073741824;
                    if (mode2 == i11) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i12 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i12;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z2) {
                        i13 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i13 < 0) {
                            i13 = this.e;
                        }
                        int i110 = (((i13 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i110] = Math.max(iArr2[i110], baseline2);
                        iArr[i110] = Math.max(iArr[i110], measuredHeight - baseline2);
                    }
                    iMax5 = Math.max(iMax5, measuredHeight);
                    if (z8) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (!z3) {
                            i12 = measuredHeight;
                        }
                        iMax7 = Math.max(iMax7, i12);
                    } else {
                        int i111 = iMax7;
                        if (!z3) {
                            i12 = measuredHeight;
                        }
                        iMax6 = Math.max(iMax6, i12);
                        iMax7 = i111;
                    }
                    int i112 = i10;
                    iN = n(view, i112) + i112;
                    f = f3;
                }
                iN2 = iN + 1;
                iArr3 = iArr;
                z5 = z;
                z4 = z2;
                i14 = 1073741824;
            }
            iN = iN2;
            z = z5;
            z2 = z4;
            iN2 = iN + 1;
            iArr3 = iArr;
            z5 = z;
            z4 = z2;
            i14 = 1073741824;
        }
        boolean z10 = z5;
        boolean z11 = z4;
        int i21 = iMax5;
        int i22 = iMax6;
        int i23 = iMax7;
        int i24 = iCombineMeasuredStates;
        if (this.f > 0 && r(virtualChildCount)) {
            this.f += this.f240l;
        }
        int iMax8 = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i21 : Math.max(i21, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z10 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f = 0;
            int iN3 = 0;
            while (iN3 < virtualChildCount) {
                View viewQ2 = q(iN3);
                if (viewQ2 == null) {
                    this.f += w(iN3);
                } else if (viewQ2.getVisibility() == 8) {
                    iN3 += n(viewQ2, iN3);
                } else {
                    a aVar2 = (a) viewQ2.getLayoutParams();
                    int i25 = this.f;
                    if (z6) {
                        this.f = i25 + ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax4 + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2);
                    } else {
                        this.f = Math.max(i25, i25 + iMax4 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2));
                    }
                    iN3++;
                    iMax8 = iMax8;
                }
                iN3++;
                iMax8 = iMax8;
            }
        }
        int i26 = iMax8;
        int paddingLeft = this.f + getPaddingLeft() + getPaddingRight();
        this.f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, 0);
        int i27 = (16777215 & iResolveSizeAndState) - this.f;
        if (z7 || (i27 != 0 && f > 0.0f)) {
            float f4 = this.f235g;
            if (f4 > 0.0f) {
                f = f4;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f = 0;
            int i28 = i22;
            int iCombineMeasuredStates2 = i24;
            int iMax9 = -1;
            int i29 = 0;
            while (i29 < virtualChildCount) {
                View viewQ3 = q(i29);
                if (viewQ3 == null || viewQ3.getVisibility() == 8) {
                    i5 = i27;
                    virtualChildCount = virtualChildCount;
                } else {
                    a aVar3 = (a) viewQ3.getLayoutParams();
                    float f5 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f5 > 0.0f) {
                        int measuredWidth2 = (int) ((i27 * f5) / f);
                        float f6 = f - f5;
                        int i30 = i27 - measuredWidth2;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i8 = 1073741824;
                            if (mode == 1073741824) {
                                if (measuredWidth2 <= 0) {
                                    measuredWidth2 = 0;
                                }
                            }
                            viewQ3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i8), childMeasureSpec);
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                            f = f6;
                            i5 = i30;
                        } else {
                            i8 = 1073741824;
                        }
                        measuredWidth2 = viewQ3.getMeasuredWidth() + measuredWidth2;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewQ3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i8), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                        f = f6;
                        i5 = i30;
                    } else {
                        i5 = i27;
                    }
                    int i31 = this.f;
                    if (z6) {
                        this.f = i31 + viewQ3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3);
                    } else {
                        this.f = Math.max(i31, viewQ3.getMeasuredWidth() + i31 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3));
                    }
                    boolean z12 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i32 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewQ3.getMeasuredHeight() + i32;
                    iMax9 = Math.max(iMax9, measuredHeight2);
                    if (!z12) {
                        i32 = measuredHeight2;
                    }
                    int iMax10 = Math.max(i28, i32);
                    if (z8) {
                        i6 = -1;
                        boolean z13 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z11 && (baseline = viewQ3.getBaseline()) != i6) {
                            i7 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i7 < 0) {
                                i7 = this.e;
                            }
                            int i33 = (((i7 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i33] = Math.max(iArr2[i33], baseline);
                            iArr[i33] = Math.max(iArr[i33], measuredHeight2 - baseline);
                        }
                        z8 = z13;
                        i28 = iMax10;
                        f = f;
                    } else {
                        i6 = -1;
                    }
                    if (z11) {
                        i7 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i7 < 0) {
                            i7 = this.e;
                        }
                        int i34 = (((i7 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i34] = Math.max(iArr2[i34], baseline);
                        iArr[i34] = Math.max(iArr[i34], measuredHeight2 - baseline);
                    }
                    z8 = z13;
                    i28 = iMax10;
                    f = f;
                }
                i29++;
                i27 = i5;
                virtualChildCount = virtualChildCount;
            }
            i4 = virtualChildCount;
            this.f += getPaddingLeft() + getPaddingRight();
            iMax = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax9 : Math.max(iMax9, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax2 = i28;
            i24 = iCombineMeasuredStates2;
        } else {
            iMax2 = Math.max(i22, i23);
            if (z10 && mode != 1073741824) {
                for (int i35 = 0; i35 < virtualChildCount; i35++) {
                    View viewQ4 = q(i35);
                    if (viewQ4 != null && viewQ4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ4.getLayoutParams())).weight > 0.0f) {
                        viewQ4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(viewQ4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = virtualChildCount;
            iMax = i26;
        }
        if (z8 || mode2 == 1073741824) {
            iMax2 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState | (i24 & (-16777216)), View.resolveSizeAndState(Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i24 << 16));
        if (z9) {
            i(i4, i2);
        }
    }

    int w(int i2) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02db A[PHI: r10
  0x02db: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:135:0x02d9, B:131:0x02ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0319  */
    /* JADX WARN: Code duplicated, block: B:154:0x0326  */
    void x(int i2, int i3) {
        int i4;
        int iCombineMeasuredStates;
        int iMax;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        int i8;
        int iMax2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        View view;
        int iMax3;
        boolean z3;
        int iMax4;
        this.f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i17 = this.b;
        boolean z4 = this.f236h;
        float f = 0.0f;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int iMax5 = 0;
        int i21 = 0;
        int iN = 0;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        while (true) {
            int i22 = 8;
            int i23 = iMax5;
            if (iN >= virtualChildCount) {
                int i24 = i18;
                int i25 = i20;
                int i26 = i21;
                int i27 = virtualChildCount;
                int i28 = mode2;
                int iMax6 = i19;
                if (this.f > 0) {
                    i4 = i27;
                    if (r(i4)) {
                        this.f += this.f241m;
                    }
                } else {
                    i4 = i27;
                }
                if (z4 && (i28 == Integer.MIN_VALUE || i28 == 0)) {
                    this.f = 0;
                    int iN2 = 0;
                    while (iN2 < i4) {
                        View viewQ = q(iN2);
                        if (viewQ == null) {
                            iMax2 = this.f + w(iN2);
                        } else {
                            if (viewQ.getVisibility() == i22) {
                                iN2 += n(viewQ, iN2);
                            } else {
                                a aVar = (a) viewQ.getLayoutParams();
                                int i29 = this.f;
                                iMax2 = Math.max(i29, i29 + i25 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ));
                            }
                            iN2++;
                            i22 = 8;
                        }
                        this.f = iMax2;
                        iN2++;
                        i22 = 8;
                    }
                }
                int paddingTop = this.f + getPaddingTop() + getPaddingBottom();
                this.f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, 0);
                int i30 = (16777215 & iResolveSizeAndState) - this.f;
                if (z5 || (i30 != 0 && f > 0.0f)) {
                    float f2 = this.f235g;
                    if (f2 > 0.0f) {
                        f = f2;
                    }
                    this.f = 0;
                    int i31 = i30;
                    int i32 = i26;
                    iCombineMeasuredStates = i24;
                    int i33 = 0;
                    while (i33 < i4) {
                        View viewQ2 = q(i33);
                        if (viewQ2.getVisibility() == 8) {
                            i5 = i31;
                        } else {
                            a aVar2 = (a) viewQ2.getLayoutParams();
                            float f3 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f3 > 0.0f) {
                                int measuredHeight = (int) ((i31 * f3) / f);
                                float f4 = f - f3;
                                i5 = i31 - measuredHeight;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i8 = 1073741824;
                                    if (i28 == 1073741824) {
                                        if (measuredHeight <= 0) {
                                            measuredHeight = 0;
                                        }
                                    }
                                    viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                                    f = f4;
                                } else {
                                    i8 = 1073741824;
                                }
                                measuredHeight = viewQ2.getMeasuredHeight() + measuredHeight;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                                f = f4;
                            } else {
                                i5 = i31;
                            }
                            int i34 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewQ2.getMeasuredWidth() + i34;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            float f5 = f;
                            if (mode != 1073741824) {
                                i6 = iCombineMeasuredStates;
                                i7 = -1;
                                z = ((LinearLayout.LayoutParams) aVar2).width == -1;
                                if (!z) {
                                    i34 = measuredWidth;
                                }
                                int iMax7 = Math.max(i32, i34);
                                if (z6 || ((LinearLayout.LayoutParams) aVar2).width != i7) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                int i35 = this.f;
                                this.f = Math.max(i35, viewQ2.getMeasuredHeight() + i35 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(viewQ2));
                                z6 = z2;
                                iCombineMeasuredStates = i6;
                                i32 = iMax7;
                                f = f5;
                            } else {
                                i6 = iCombineMeasuredStates;
                                i7 = -1;
                            }
                            if (!z) {
                                i34 = measuredWidth;
                            }
                            int iMax8 = Math.max(i32, i34);
                            if (z6) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            int i36 = this.f;
                            this.f = Math.max(i36, viewQ2.getMeasuredHeight() + i36 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(viewQ2));
                            z6 = z2;
                            iCombineMeasuredStates = i6;
                            i32 = iMax8;
                            f = f5;
                        }
                        i33++;
                        i31 = i5;
                    }
                    this.f += getPaddingTop() + getPaddingBottom();
                    iMax = i32;
                } else {
                    iMax = Math.max(i26, i23);
                    if (z4 && i28 != 1073741824) {
                        for (int i37 = 0; i37 < i4; i37++) {
                            View viewQ3 = q(i37);
                            if (viewQ3 != null && viewQ3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ3.getLayoutParams())).weight > 0.0f) {
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(viewQ3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i24;
                }
                if (z6 || mode == 1073741824) {
                    iMax = iMax6;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates), iResolveSizeAndState);
                if (z7) {
                    j(i4, i3);
                    return;
                }
                return;
            }
            View viewQ4 = q(iN);
            if (viewQ4 == null) {
                this.f += w(iN);
                i12 = virtualChildCount;
                i13 = mode2;
                iMax5 = i23;
            } else {
                int i38 = i18;
                if (viewQ4.getVisibility() == 8) {
                    iN += n(viewQ4, iN);
                    i12 = virtualChildCount;
                    iMax5 = i23;
                    i18 = i38;
                    i13 = mode2;
                } else {
                    if (r(iN)) {
                        this.f += this.f241m;
                    }
                    a aVar3 = (a) viewQ4.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f7 = f + f6;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f6 > 0.0f) {
                        int i39 = this.f;
                        this.f = Math.max(i39, ((LinearLayout.LayoutParams) aVar3).topMargin + i39 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax3 = i20;
                        view = viewQ4;
                        i15 = i21;
                        i10 = i38;
                        i11 = i19;
                        z5 = true;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        i14 = i23;
                        i16 = iN;
                    } else {
                        int i40 = i19;
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i9 = 0;
                        }
                        i10 = i38;
                        int i41 = i9;
                        i11 = i40;
                        int i42 = i20;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        i14 = i23;
                        i15 = i21;
                        i16 = iN;
                        u(viewQ4, iN, i2, 0, i3, f7 == 0.0f ? this.f : 0);
                        if (i41 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i41;
                        }
                        int measuredHeight2 = viewQ4.getMeasuredHeight();
                        int i43 = this.f;
                        view = viewQ4;
                        this.f = Math.max(i43, i43 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + p(view));
                        iMax3 = z4 ? Math.max(measuredHeight2, i42) : i42;
                    }
                    if (i17 >= 0 && i17 == i16 + 1) {
                        this.c = this.f;
                    }
                    if (i16 < i17 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z3 = false;
                    } else {
                        z3 = true;
                        z7 = true;
                    }
                    int i44 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i44;
                    int iMax9 = Math.max(i11, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i10, view.getMeasuredState());
                    z6 = z6 && ((LinearLayout.LayoutParams) aVar3).width == -1;
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z3) {
                            i44 = measuredWidth2;
                        }
                        iMax5 = Math.max(i14, i44);
                        iMax4 = i15;
                    } else {
                        if (!z3) {
                            i44 = measuredWidth2;
                        }
                        iMax4 = Math.max(i15, i44);
                        iMax5 = i14;
                    }
                    int iN3 = n(view, i16) + i16;
                    i20 = iMax3;
                    f = f7;
                    i21 = iMax4;
                    i18 = iCombineMeasuredStates2;
                    iN = iN3;
                    i19 = iMax9;
                }
            }
            iN++;
            mode2 = i13;
            virtualChildCount = i12;
        }
    }
}
