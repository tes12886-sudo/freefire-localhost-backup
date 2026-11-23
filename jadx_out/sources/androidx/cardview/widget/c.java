package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
class c implements e {
    final RectF a = new RectF();

    class a implements g.a {
        a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float fWidth = (rectF.width() - f2) - 1.0f;
            float fHeight = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                c.this.a.set(f4, f4, f3, f3);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f5 = (rectF.left + f3) - 1.0f;
                float f6 = rectF.top;
                canvas.drawRect(f5, f6, (rectF.right - f3) + 1.0f, f6 + f3, paint);
                float f7 = (rectF.left + f3) - 1.0f;
                float f8 = rectF.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF.right - f3) + 1.0f, f8, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    c() {
    }

    private g o(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new g(context.getResources(), colorStateList, f, f2, f3);
    }

    private g p(d dVar) {
        return (g) dVar.g();
    }

    @Override // androidx.cardview.widget.e
    public float a(d dVar) {
        return p(dVar).i();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList b(d dVar) {
        return p(dVar).f();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        g gVarO = o(context, colorStateList, f, f2, f3);
        gVarO.m(dVar.e());
        dVar.d(gVarO);
        q(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void d(d dVar, float f) {
        p(dVar).p(f);
        q(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float e(d dVar) {
        return p(dVar).l();
    }

    @Override // androidx.cardview.widget.e
    public void f() {
        g.r = new a();
    }

    @Override // androidx.cardview.widget.e
    public float g(d dVar) {
        return p(dVar).g();
    }

    @Override // androidx.cardview.widget.e
    public float h(d dVar) {
        return p(dVar).j();
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return p(dVar).k();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar, float f) {
        p(dVar).r(f);
    }

    @Override // androidx.cardview.widget.e
    public void l(d dVar) {
        p(dVar).m(dVar.e());
        q(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar, ColorStateList colorStateList) {
        p(dVar).o(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, float f) {
        p(dVar).q(f);
        q(dVar);
    }

    public void q(d dVar) {
        Rect rect = new Rect();
        p(dVar).h(rect);
        dVar.c((int) Math.ceil(i(dVar)), (int) Math.ceil(h(dVar)));
        dVar.b(rect.left, rect.top, rect.right, rect.bottom);
    }
}
