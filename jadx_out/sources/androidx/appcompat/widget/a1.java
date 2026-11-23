package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class a1 {
    private final Context a;
    private final TypedArray b;
    private TypedValue c;

    private a1(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static a1 s(Context context, int i2, int[] iArr) {
        return new a1(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static a1 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static a1 u(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0 || (colorStateListA = h.b.k.a.a.a(this.a, resourceId)) == null) ? this.b.getColorStateList(i2) : colorStateListA;
    }

    public int d(int i2, int i3) {
        return this.b.getDimensionPixelOffset(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.b.getDimensionPixelSize(i2, i3);
    }

    public Drawable f(int i2) {
        int resourceId;
        return (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0) ? this.b.getDrawable(i2) : h.b.k.a.a.b(this.a, resourceId);
    }

    public Drawable g(int i2) {
        int resourceId;
        if (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return l.b().d(this.a, resourceId, true);
    }

    public float h(int i2, float f) {
        return this.b.getFloat(i2, f);
    }

    public Typeface i(int i2, int i3, androidx.core.content.d.h.d dVar) {
        int resourceId = this.b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return androidx.core.content.d.h.f(this.a, resourceId, this.c, i3, dVar);
    }

    public int j(int i2, int i3) {
        return this.b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.b.getInteger(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.b.getLayoutDimension(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.b.getResourceId(i2, i3);
    }

    public String n(int i2) {
        return this.b.getString(i2);
    }

    public CharSequence o(int i2) {
        return this.b.getText(i2);
    }

    public CharSequence[] p(int i2) {
        return this.b.getTextArray(i2);
    }

    public TypedArray q() {
        return this.b;
    }

    public boolean r(int i2) {
        return this.b.hasValue(i2);
    }

    public void v() {
        this.b.recycle();
    }
}
