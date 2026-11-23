package h.h.e;

import android.graphics.Color;
import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    static {
        new ThreadLocal();
    }

    public static int a(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(e((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, Utils.MAX_STRENGTH_VALUE), e((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, Utils.MAX_STRENGTH_VALUE), e((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, Utils.MAX_STRENGTH_VALUE));
    }

    private static int b(int i2, int i3) {
        return 255 - (((255 - i3) * (255 - i2)) / Utils.MAX_STRENGTH_VALUE);
    }

    public static int c(int i2, int i3) {
        int iAlpha = Color.alpha(i3);
        int iAlpha2 = Color.alpha(i2);
        int iB = b(iAlpha2, iAlpha);
        return Color.argb(iB, d(Color.red(i2), iAlpha2, Color.red(i3), iAlpha, iB), d(Color.green(i2), iAlpha2, Color.green(i3), iAlpha, iB), d(Color.blue(i2), iAlpha2, Color.blue(i3), iAlpha, iB));
    }

    private static int d(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((i2 * Utils.MAX_STRENGTH_VALUE) * i3) + ((i4 * i5) * (255 - i3))) / (i6 * Utils.MAX_STRENGTH_VALUE);
    }

    private static int e(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    public static int f(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
