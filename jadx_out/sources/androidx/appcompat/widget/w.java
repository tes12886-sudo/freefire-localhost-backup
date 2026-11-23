package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class w extends RatingBar {
    private final u a;

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.G);
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        v0.a(this, getContext());
        u uVar = new u(this);
        this.a = uVar;
        uVar.c(attributeSet, i2);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmapB = this.a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
