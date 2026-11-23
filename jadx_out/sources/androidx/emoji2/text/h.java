package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static final ThreadLocal<androidx.emoji2.text.p.a> d = new ThreadLocal<>();
    private final int a;
    private final m b;
    private volatile int c = 0;

    h(m mVar, int i2) {
        this.b = mVar;
        this.a = i2;
    }

    private androidx.emoji2.text.p.a g() {
        ThreadLocal<androidx.emoji2.text.p.a> threadLocal = d;
        androidx.emoji2.text.p.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new androidx.emoji2.text.p.a();
            threadLocal.set(aVar);
        }
        this.b.d().j(aVar, this.a);
        return aVar;
    }

    public void a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface typefaceG = this.b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.b.c(), this.a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i2) {
        return g().h(i2);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void k(boolean z) {
        this.c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i2 = 0; i2 < iC; i2++) {
            sb.append(Integer.toHexString(b(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
