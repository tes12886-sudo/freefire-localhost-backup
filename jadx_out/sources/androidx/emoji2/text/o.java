package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class o extends j {
    private static Paint e;

    public o(h hVar) {
        super(hVar);
    }

    private static Paint c() {
        if (e == null) {
            TextPaint textPaint = new TextPaint();
            e = textPaint;
            textPaint.setColor(g.b().c());
            e.setStyle(Paint.Style.FILL);
        }
        return e;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
        if (g.b().i()) {
            canvas.drawRect(f, i4, f + b(), i6, c());
        }
        a().a(canvas, f, i5, paint);
    }
}
