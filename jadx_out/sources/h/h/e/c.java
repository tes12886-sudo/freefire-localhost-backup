package h.h.e;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final ThreadLocal<h.h.k.d<Rect, Rect>> a = new ThreadLocal<>();

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float fMeasureText = paint.measureText("\udfffd");
        float fMeasureText2 = paint.measureText("m");
        float fMeasureText3 = paint.measureText(str);
        float fMeasureText4 = 0.0f;
        if (fMeasureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (fMeasureText3 > fMeasureText2 * 2.0f) {
                return false;
            }
            int i2 = 0;
            while (i2 < length) {
                int iCharCount = Character.charCount(str.codePointAt(i2)) + i2;
                fMeasureText4 += paint.measureText(str, i2, iCharCount);
                i2 = iCharCount;
            }
            if (fMeasureText3 >= fMeasureText4) {
                return false;
            }
        }
        if (fMeasureText3 != fMeasureText) {
            return true;
        }
        h.h.k.d<Rect, Rect> dVarB = b();
        paint.getTextBounds("\udfffd", 0, 2, dVarB.a);
        paint.getTextBounds(str, 0, length, dVarB.b);
        return !dVarB.a.equals(dVarB.b);
    }

    private static h.h.k.d<Rect, Rect> b() {
        ThreadLocal<h.h.k.d<Rect, Rect>> threadLocal = a;
        h.h.k.d<Rect, Rect> dVar = threadLocal.get();
        if (dVar == null) {
            h.h.k.d<Rect, Rect> dVar2 = new h.h.k.d<>(new Rect(), new Rect());
            threadLocal.set(dVar2);
            return dVar2;
        }
        dVar.a.setEmpty();
        dVar.b.setEmpty();
        return dVar;
    }
}
