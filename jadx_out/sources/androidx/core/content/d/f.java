package androidx.core.content.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
final class f {

    static final class a {
        final int[] a;
        final float[] b;

        a(int i2, int i3) {
            this.a = new int[]{i2, i3};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.a = new int[]{i2, i3, i4};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.a[i2] = list.get(i2).intValue();
                this.b[i2] = list2.get(i2).floatValue();
            }
        }
    }

    private static a a(a aVar, int i2, int i3, boolean z, int i4) {
        if (aVar != null) {
            return aVar;
        }
        return z ? new a(i2, i4, i3) : new a(i2, i3);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayK = i.k(resources, theme, attributeSet, h.h.d.z);
        float f = i.f(typedArrayK, xmlPullParser, "startX", h.h.d.I, 0.0f);
        float f2 = i.f(typedArrayK, xmlPullParser, "startY", h.h.d.J, 0.0f);
        float f3 = i.f(typedArrayK, xmlPullParser, "endX", h.h.d.K, 0.0f);
        float f4 = i.f(typedArrayK, xmlPullParser, "endY", h.h.d.L, 0.0f);
        float f5 = i.f(typedArrayK, xmlPullParser, "centerX", h.h.d.D, 0.0f);
        float f6 = i.f(typedArrayK, xmlPullParser, "centerY", h.h.d.E, 0.0f);
        int iG = i.g(typedArrayK, xmlPullParser, "type", h.h.d.C, 0);
        int iB = i.b(typedArrayK, xmlPullParser, "startColor", h.h.d.A, 0);
        boolean zJ = i.j(xmlPullParser, "centerColor");
        int iB2 = i.b(typedArrayK, xmlPullParser, "centerColor", h.h.d.H, 0);
        int iB3 = i.b(typedArrayK, xmlPullParser, "endColor", h.h.d.B, 0);
        int iG2 = i.g(typedArrayK, xmlPullParser, "tileMode", h.h.d.G, 0);
        float f7 = i.f(typedArrayK, xmlPullParser, "gradientRadius", h.h.d.F, 0.0f);
        typedArrayK.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zJ, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f, f2, f3, f4, aVarA.a, aVarA.b, d(iG2)) : new SweepGradient(f5, f6, aVarA.a, aVarA.b);
        }
        if (f7 > 0.0f) {
            return new RadialGradient(f5, f6, f7, aVarA.a, aVarA.b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayK = i.k(resources, theme, attributeSet, h.h.d.M);
                int i2 = h.h.d.N;
                boolean zHasValue = typedArrayK.hasValue(i2);
                int i3 = h.h.d.O;
                boolean zHasValue2 = typedArrayK.hasValue(i3);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayK.getColor(i2, 0);
                float f = typedArrayK.getFloat(i3, 0.0f);
                typedArrayK.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }
}
