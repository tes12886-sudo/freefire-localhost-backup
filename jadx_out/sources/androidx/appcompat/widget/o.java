package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class o {
    private final TextView a;
    private final h.l.a.f b;

    o(TextView textView) {
        this.a = textView;
        this.b = new h.l.a.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a(inputFilterArr);
    }

    void b(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, h.b.j.d0, i2, 0);
        try {
            int i3 = h.b.j.r0;
            boolean z = typedArrayObtainStyledAttributes.hasValue(i3) ? typedArrayObtainStyledAttributes.getBoolean(i3, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void c(boolean z) {
        this.b.b(z);
    }

    void d(boolean z) {
        this.b.c(z);
    }
}
