package h.t.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.appff.haptic.base.Utils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class h extends h.t.a.a.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final PorterDuff.Mode f1857j = PorterDuff.Mode.SRC_IN;
    private C0216h b;
    private PorterDuffColorFilter c;
    private ColorFilter d;
    private boolean e;
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f1858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f1859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f1860i;

    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = h.h.e.d.d(string2);
            }
            this.c = androidx.core.content.d.i.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // h.t.a.a.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (androidx.core.content.d.i.j(xmlPullParser, "pathData")) {
                TypedArray typedArrayK = androidx.core.content.d.i.k(resources, theme, attributeSet, h.t.a.a.a.d);
                f(typedArrayK, xmlPullParser);
                typedArrayK.recycle();
            }
        }
    }

    private static class c extends f {
        private int[] e;
        androidx.core.content.d.d f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f1861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.core.content.d.d f1862h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f1863i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f1864j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f1865k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f1866l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f1867m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f1868n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f1869o;
        float p;

        c() {
            this.f1861g = 0.0f;
            this.f1863i = 1.0f;
            this.f1864j = 1.0f;
            this.f1865k = 0.0f;
            this.f1866l = 1.0f;
            this.f1867m = 0.0f;
            this.f1868n = Paint.Cap.BUTT;
            this.f1869o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f1861g = 0.0f;
            this.f1863i = 1.0f;
            this.f1864j = 1.0f;
            this.f1865k = 0.0f;
            this.f1866l = 1.0f;
            this.f1867m = 0.0f;
            this.f1868n = Paint.Cap.BUTT;
            this.f1869o = Paint.Join.MITER;
            this.p = 4.0f;
            this.e = cVar.e;
            this.f = cVar.f;
            this.f1861g = cVar.f1861g;
            this.f1863i = cVar.f1863i;
            this.f1862h = cVar.f1862h;
            this.c = cVar.c;
            this.f1864j = cVar.f1864j;
            this.f1865k = cVar.f1865k;
            this.f1866l = cVar.f1866l;
            this.f1867m = cVar.f1867m;
            this.f1868n = cVar.f1868n;
            this.f1869o = cVar.f1869o;
            this.p = cVar.p;
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            if (i2 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i2 != 1) {
                return i2 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            if (i2 == 0) {
                return Paint.Join.MITER;
            }
            if (i2 != 1) {
                return i2 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (androidx.core.content.d.i.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = h.h.e.d.d(string2);
                }
                this.f1862h = androidx.core.content.d.i.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f1864j = androidx.core.content.d.i.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f1864j);
                this.f1868n = e(androidx.core.content.d.i.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f1868n);
                this.f1869o = f(androidx.core.content.d.i.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f1869o);
                this.p = androidx.core.content.d.i.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f = androidx.core.content.d.i.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f1863i = androidx.core.content.d.i.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f1863i);
                this.f1861g = androidx.core.content.d.i.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f1861g);
                this.f1866l = androidx.core.content.d.i.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f1866l);
                this.f1867m = androidx.core.content.d.i.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f1867m);
                this.f1865k = androidx.core.content.d.i.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f1865k);
                this.c = androidx.core.content.d.i.g(typedArray, xmlPullParser, "fillType", 13, this.c);
            }
        }

        @Override // h.t.a.a.h.e
        public boolean a() {
            return this.f1862h.i() || this.f.i();
        }

        @Override // h.t.a.a.h.e
        public boolean b(int[] iArr) {
            return this.f.j(iArr) | this.f1862h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = androidx.core.content.d.i.k(resources, theme, attributeSet, h.t.a.a.a.c);
            h(typedArrayK, xmlPullParser, theme);
            typedArrayK.recycle();
        }

        float getFillAlpha() {
            return this.f1864j;
        }

        int getFillColor() {
            return this.f1862h.e();
        }

        float getStrokeAlpha() {
            return this.f1863i;
        }

        int getStrokeColor() {
            return this.f.e();
        }

        float getStrokeWidth() {
            return this.f1861g;
        }

        float getTrimPathEnd() {
            return this.f1866l;
        }

        float getTrimPathOffset() {
            return this.f1867m;
        }

        float getTrimPathStart() {
            return this.f1865k;
        }

        void setFillAlpha(float f) {
            this.f1864j = f;
        }

        void setFillColor(int i2) {
            this.f1862h.k(i2);
        }

        void setStrokeAlpha(float f) {
            this.f1863i = f;
        }

        void setStrokeColor(int i2) {
            this.f.k(i2);
        }

        void setStrokeWidth(float f) {
            this.f1861g = f;
        }

        void setTrimPathEnd(float f) {
            this.f1866l = f;
        }

        void setTrimPathOffset(float f) {
            this.f1867m = f;
        }

        void setTrimPathStart(float f) {
            this.f1865k = f;
        }
    }

    private static class d extends e {
        final Matrix a;
        final ArrayList<e> b;
        float c;
        private float d;
        private float e;
        private float f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f1870g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f1871h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f1872i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f1873j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f1874k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f1875l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f1876m;

        public d() {
            super();
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.f1870g = 1.0f;
            this.f1871h = 0.0f;
            this.f1872i = 0.0f;
            this.f1873j = new Matrix();
            this.f1876m = null;
        }

        public d(d dVar, h.f.a<String, Object> aVar) {
            f bVar;
            super();
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.f1870g = 1.0f;
            this.f1871h = 0.0f;
            this.f1872i = 0.0f;
            Matrix matrix = new Matrix();
            this.f1873j = matrix;
            this.f1876m = null;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.f1870g = dVar.f1870g;
            this.f1871h = dVar.f1871h;
            this.f1872i = dVar.f1872i;
            this.f1875l = dVar.f1875l;
            String str = dVar.f1876m;
            this.f1876m = str;
            this.f1874k = dVar.f1874k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f1873j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.b.add(bVar);
                    String str2 = bVar.b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f1873j.reset();
            this.f1873j.postTranslate(-this.d, -this.e);
            this.f1873j.postScale(this.f, this.f1870g);
            this.f1873j.postRotate(this.c, 0.0f, 0.0f);
            this.f1873j.postTranslate(this.f1871h + this.d, this.f1872i + this.e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f1875l = null;
            this.c = androidx.core.content.d.i.f(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = androidx.core.content.d.i.f(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.f1870g = androidx.core.content.d.i.f(typedArray, xmlPullParser, "scaleY", 4, this.f1870g);
            this.f1871h = androidx.core.content.d.i.f(typedArray, xmlPullParser, "translateX", 6, this.f1871h);
            this.f1872i = androidx.core.content.d.i.f(typedArray, xmlPullParser, "translateY", 7, this.f1872i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1876m = string;
            }
            d();
        }

        @Override // h.t.a.a.h.e
        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // h.t.a.a.h.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                zB |= this.b.get(i2).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = androidx.core.content.d.i.k(resources, theme, attributeSet, h.t.a.a.a.b);
            e(typedArrayK, xmlPullParser);
            typedArrayK.recycle();
        }

        public String getGroupName() {
            return this.f1876m;
        }

        public Matrix getLocalMatrix() {
            return this.f1873j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.f1870g;
        }

        public float getTranslateX() {
            return this.f1871h;
        }

        public float getTranslateY() {
            return this.f1872i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                d();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f1870g) {
                this.f1870g = f;
                d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f1871h) {
                this.f1871h = f;
                d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f1872i) {
                this.f1872i = f;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends e {
        protected h.h.e.d.b[] a;
        String b;
        int c;
        int d;

        public f() {
            super();
            this.a = null;
            this.c = 0;
        }

        public f(f fVar) {
            super();
            this.a = null;
            this.c = 0;
            this.b = fVar.b;
            this.d = fVar.d;
            this.a = h.h.e.d.f(fVar.a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            h.h.e.d.b[] bVarArr = this.a;
            if (bVarArr != null) {
                h.h.e.d.b.e(bVarArr, path);
            }
        }

        public h.h.e.d.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(h.h.e.d.b[] bVarArr) {
            if (h.h.e.d.b(this.a, bVarArr)) {
                h.h.e.d.j(this.a, bVarArr);
            } else {
                this.a = h.h.e.d.f(bVarArr);
            }
        }
    }

    private static class g {
        private static final Matrix q = new Matrix();
        private final Path a;
        private final Path b;
        private final Matrix c;
        Paint d;
        Paint e;
        private PathMeasure f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f1877g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f1878h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f1879i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f1880j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f1881k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f1882l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f1883m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f1884n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f1885o;
        final h.f.a<String, Object> p;

        public g() {
            this.c = new Matrix();
            this.f1879i = 0.0f;
            this.f1880j = 0.0f;
            this.f1881k = 0.0f;
            this.f1882l = 0.0f;
            this.f1883m = Utils.MAX_STRENGTH_VALUE;
            this.f1884n = null;
            this.f1885o = null;
            this.p = new h.f.a<>();
            this.f1878h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.f1879i = 0.0f;
            this.f1880j = 0.0f;
            this.f1881k = 0.0f;
            this.f1882l = 0.0f;
            this.f1883m = Utils.MAX_STRENGTH_VALUE;
            this.f1884n = null;
            this.f1885o = null;
            h.f.a<String, Object> aVar = new h.f.a<>();
            this.p = aVar;
            this.f1878h = new d(gVar.f1878h, aVar);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.f1879i = gVar.f1879i;
            this.f1880j = gVar.f1880j;
            this.f1881k = gVar.f1881k;
            this.f1882l = gVar.f1882l;
            this.f1877g = gVar.f1877g;
            this.f1883m = gVar.f1883m;
            this.f1884n = gVar.f1884n;
            String str = gVar.f1884n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f1885o = gVar.f1885o;
        }

        private static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.f1873j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.b.size(); i4++) {
                e eVar = dVar.b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f = i2 / this.f1881k;
            float f2 = i3 / this.f1882l;
            float fMin = Math.min(f, f2);
            Matrix matrix = dVar.a;
            this.c.set(matrix);
            this.c.postScale(f, f2);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.a);
            Path path = this.a;
            this.b.reset();
            if (fVar.c()) {
                this.b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.b.addPath(path, this.c);
                canvas.clipPath(this.b);
                return;
            }
            c cVar = (c) fVar;
            float f3 = cVar.f1865k;
            if (f3 != 0.0f || cVar.f1866l != 1.0f) {
                float f4 = cVar.f1867m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (cVar.f1866l + f4) % 1.0f;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.a, false);
                float length = this.f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f.getSegment(f7, length, path, true);
                    this.f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(path, this.c);
            if (cVar.f1862h.l()) {
                androidx.core.content.d.d dVar2 = cVar.f1862h;
                if (this.e == null) {
                    Paint paint = new Paint(1);
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f1864j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(Utils.MAX_STRENGTH_VALUE);
                    paint2.setColor(h.a(dVar2.e(), cVar.f1864j));
                }
                paint2.setColorFilter(colorFilter);
                this.b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.b, paint2);
            }
            if (cVar.f.l()) {
                androidx.core.content.d.d dVar3 = cVar.f;
                if (this.d == null) {
                    Paint paint3 = new Paint(1);
                    this.d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.d;
                Paint.Join join = cVar.f1869o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f1868n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f1863i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(Utils.MAX_STRENGTH_VALUE);
                    paint4.setColor(h.a(dVar3.e(), cVar.f1863i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f1861g * fMin * fE);
                canvas.drawPath(this.b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f1878h, q, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.f1885o == null) {
                this.f1885o = Boolean.valueOf(this.f1878h.a());
            }
            return this.f1885o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f1878h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f1883m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f1883m = i2;
        }
    }

    /* JADX INFO: renamed from: h.t.a.a.h$h, reason: collision with other inner class name */
    private static class C0216h extends Drawable.ConstantState {
        int a;
        g b;
        ColorStateList c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f1886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f1887h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f1888i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f1889j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f1890k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f1891l;

        public C0216h() {
            this.c = null;
            this.d = h.f1857j;
            this.b = new g();
        }

        public C0216h(C0216h c0216h) {
            this.c = null;
            this.d = h.f1857j;
            if (c0216h != null) {
                this.a = c0216h.a;
                g gVar = new g(c0216h.b);
                this.b = gVar;
                if (c0216h.b.e != null) {
                    gVar.e = new Paint(c0216h.b.e);
                }
                if (c0216h.b.d != null) {
                    this.b.d = new Paint(c0216h.b.d);
                }
                this.c = c0216h.c;
                this.d = c0216h.d;
                this.e = c0216h.e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f.getWidth() && i3 == this.f.getHeight();
        }

        public boolean b() {
            return !this.f1890k && this.f1886g == this.c && this.f1887h == this.d && this.f1889j == this.e && this.f1888i == this.b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f == null || !a(i2, i3)) {
                this.f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f1890k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f1891l == null) {
                Paint paint = new Paint();
                this.f1891l = paint;
                paint.setFilterBitmap(true);
            }
            this.f1891l.setAlpha(this.b.getRootAlpha());
            this.f1891l.setColorFilter(colorFilter);
            return this.f1891l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.b.g(iArr);
            this.f1890k |= zG;
            return zG;
        }

        public void i() {
            this.f1886g = this.c;
            this.f1887h = this.d;
            this.f1888i = this.b.getRootAlpha();
            this.f1889j = this.e;
            this.f1890k = false;
        }

        public void j(int i2, int i3) {
            this.f.eraseColor(0);
            this.b.b(new Canvas(this.f), i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    private static class i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.a = (VectorDrawable) this.a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.a = (VectorDrawable) this.a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.f = true;
        this.f1858g = new float[9];
        this.f1859h = new Matrix();
        this.f1860i = new Rect();
        this.b = new C0216h();
    }

    h(C0216h c0216h) {
        this.f = true;
        this.f1858g = new float[9];
        this.f1859h = new Matrix();
        this.f1860i = new Rect();
        this.b = c0216h;
        this.c = j(this.c, c0216h.c, c0216h.d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static h b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.a = androidx.core.content.d.h.d(resources, i2, theme);
            new i(hVar.a.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i2;
        int i3;
        f fVar;
        C0216h c0216h = this.b;
        g gVar = c0216h.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f1878h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    fVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    String pathName = bVar.getPathName();
                    fVar = bVar;
                    if (pathName != null) {
                        gVar.p.put(bVar.getPathName(), bVar);
                        fVar = bVar;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = c0216h.a;
                    i3 = dVar2.f1874k;
                    c0216h.a = i3 | i2;
                }
                i2 = c0216h.a;
                i3 = fVar.d;
                c0216h.a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0216h c0216h = this.b;
        g gVar = c0216h.b;
        c0216h.d = g(androidx.core.content.d.i.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = androidx.core.content.d.i.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            c0216h.c = colorStateListC;
        }
        c0216h.e = androidx.core.content.d.i.a(typedArray, xmlPullParser, "autoMirrored", 5, c0216h.e);
        gVar.f1881k = androidx.core.content.d.i.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f1881k);
        float f2 = androidx.core.content.d.i.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f1882l);
        gVar.f1882l = f2;
        if (gVar.f1881k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f1879i = typedArray.getDimension(3, gVar.f1879i);
        float dimension = typedArray.getDimension(2, gVar.f1880j);
        gVar.f1880j = dimension;
        if (gVar.f1879i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(androidx.core.content.d.i.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f1884n = string;
            gVar.p.put(string, gVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    Object d(String str) {
        return this.b.b.p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f1860i);
        if (this.f1860i.width() <= 0 || this.f1860i.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        canvas.getMatrix(this.f1859h);
        this.f1859h.getValues(this.f1858g);
        float fAbs = Math.abs(this.f1858g[0]);
        float fAbs2 = Math.abs(this.f1858g[4]);
        float fAbs3 = Math.abs(this.f1858g[1]);
        float fAbs4 = Math.abs(this.f1858g[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f1860i.width() * fAbs);
        int iHeight = (int) (this.f1860i.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f1860i;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f1860i.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f1860i.offsetTo(0, 0);
        this.b.c(iMin, iMin2);
        if (!this.f) {
            this.b.j(iMin, iMin2);
        } else if (!this.b.b()) {
            this.b.j(iMin, iMin2);
            this.b.i();
        }
        this.b.d(canvas, colorFilter, this.f1860i);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f1880j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.f1879i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    void h(boolean z) {
        this.f = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0216h c0216h = this.b;
        c0216h.b = new g();
        TypedArray typedArrayK = androidx.core.content.d.i.k(resources, theme, attributeSet, h.t.a.a.a.a);
        i(typedArrayK, xmlPullParser, theme);
        typedArrayK.recycle();
        c0216h.a = getChangingConfigurations();
        c0216h.f1890k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.c = j(this.c, c0216h.c, c0216h.d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0216h c0216h;
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((c0216h = this.b) != null && (c0216h.g() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            this.b = new C0216h(this.b);
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0216h c0216h = this.b;
        ColorStateList colorStateList = c0216h.c;
        if (colorStateList != null && (mode = c0216h.d) != null) {
            this.c = j(this.c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c0216h.g() || !c0216h.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.b.b.getRootAlpha() != i2) {
            this.b.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        C0216h c0216h = this.b;
        if (c0216h.c != colorStateList) {
            c0216h.c = colorStateList;
            this.c = j(this.c, colorStateList, c0216h.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        C0216h c0216h = this.b;
        if (c0216h.d != mode) {
            c0216h.d = mode;
            this.c = j(this.c, c0216h.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
