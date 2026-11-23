package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f271h = {R.attr.colorBackground};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final e f272i;
    private boolean a;
    private boolean b;
    int c;
    int d;
    final Rect e;
    final Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f273g;

    class a implements d {
        private Drawable a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public View a() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.d
        public void b(int i2, int i3, int i4, int i5) {
            CardView.this.f.set(i2, i3, i4, i5);
            CardView cardView = CardView.this;
            Rect rect = cardView.e;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public void c(int i2, int i3) {
            CardView cardView = CardView.this;
            if (i2 > cardView.c) {
                CardView.super.setMinimumWidth(i2);
            }
            CardView cardView2 = CardView.this;
            if (i3 > cardView2.d) {
                CardView.super.setMinimumHeight(i3);
            }
        }

        @Override // androidx.cardview.widget.d
        public void d(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public boolean f() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public Drawable g() {
            return this.a;
        }
    }

    static {
        e aVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            aVar = new b();
        } else {
            aVar = i2 >= 17 ? new androidx.cardview.widget.a() : new c();
        }
        f272i = aVar;
        f272i.f();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.e.a.a);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        Resources resources;
        int i3;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i2);
        Rect rect = new Rect();
        this.e = rect;
        this.f = new Rect();
        a aVar = new a();
        this.f273g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.e.e.a, i2, h.e.d.a);
        int i4 = h.e.e.d;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i4);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f271h);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i3 = h.e.b.b;
            } else {
                resources = getResources();
                i3 = h.e.b.a;
            }
            colorStateListValueOf = ColorStateList.valueOf(resources.getColor(i3));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(h.e.e.e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(h.e.e.f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(h.e.e.f1770g, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(h.e.e.f1772i, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(h.e.e.f1771h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.e.e.f1773j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.e.e.f1775l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.e.e.f1777n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.e.e.f1776m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.e.e.f1774k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.e.e.b, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.e.e.c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f272i.c(aVar, context, colorStateList, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return f272i.b(this.f273g);
    }

    public float getCardElevation() {
        return f272i.e(this.f273g);
    }

    public int getContentPaddingBottom() {
        return this.e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.e.left;
    }

    public int getContentPaddingRight() {
        return this.e.right;
    }

    public int getContentPaddingTop() {
        return this.e.top;
    }

    public float getMaxCardElevation() {
        return f272i.a(this.f273g);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return f272i.g(this.f273g);
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        e eVar = f272i;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.i(this.f273g)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.h(this.f273g)), View.MeasureSpec.getSize(i3)), mode2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f272i.m(this.f273g, ColorStateList.valueOf(i2));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f272i.m(this.f273g, colorStateList);
    }

    public void setCardElevation(float f) {
        f272i.k(this.f273g, f);
    }

    public void setMaxCardElevation(float f) {
        f272i.n(this.f273g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.d = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.c = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            f272i.l(this.f273g);
        }
    }

    public void setRadius(float f) {
        f272i.d(this.f273g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            f272i.j(this.f273g);
        }
    }
}
