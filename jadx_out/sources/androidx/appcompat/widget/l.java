package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static l c;
    private q0 a;

    class a implements q0.f {
        private final int[] a = {h.b.e.R, h.b.e.P, h.b.e.a};
        private final int[] b = {h.b.e.f1695o, h.b.e.B, h.b.e.t, h.b.e.p, h.b.e.q, h.b.e.s, h.b.e.r};
        private final int[] c = {h.b.e.O, h.b.e.Q, h.b.e.f1691k, h.b.e.K, h.b.e.L, h.b.e.M, h.b.e.N};
        private final int[] d = {h.b.e.w, h.b.e.f1689i, h.b.e.v};
        private final int[] e = {h.b.e.J, h.b.e.S};
        private final int[] f = {h.b.e.c, h.b.e.f1687g, h.b.e.d, h.b.e.f1688h};

        a() {
        }

        private boolean f(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i2) {
            int iC = v0.c(context, h.b.a.w);
            return new ColorStateList(new int[][]{v0.b, v0.d, v0.c, v0.f}, new int[]{v0.b(context, h.b.a.u), h.h.e.a.c(iC, i2), h.h.e.a.c(iC, i2), i2});
        }

        private ColorStateList i(Context context) {
            return h(context, v0.c(context, h.b.a.t));
        }

        private ColorStateList j(Context context) {
            return h(context, v0.c(context, h.b.a.u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = h.b.a.y;
            ColorStateList colorStateListE = v0.e(context, i2);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = v0.b;
                iArr2[0] = v0.b(context, i2);
                iArr[1] = v0.e;
                iArr2[1] = v0.c(context, h.b.a.v);
                iArr[2] = v0.f;
                iArr2[2] = v0.c(context, i2);
            } else {
                iArr[0] = v0.b;
                iArr2[0] = colorStateListE.getColorForState(iArr[0], 0);
                iArr[1] = v0.e;
                iArr2[1] = v0.c(context, h.b.a.v);
                iArr[2] = v0.f;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(q0 q0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable drawableJ = q0Var.j(context, h.b.e.F);
            Drawable drawableJ2 = q0Var.j(context, h.b.e.G);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (i0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = l.b;
            }
            drawable.setColorFilter(l.e(i2, mode));
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0046  */
        /* JADX WARN: Code duplicated, block: B:23:0x004c  */
        /* JADX WARN: Code duplicated, block: B:26:0x005d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.q0.f
        public boolean a(Context context, int i2, Drawable drawable) {
            int iRound;
            boolean z;
            PorterDuff.Mode mode = l.b;
            boolean zF = f(this.a, i2);
            int i3 = R.attr.colorBackground;
            if (zF) {
                i3 = h.b.a.x;
            } else if (f(this.c, i2)) {
                i3 = h.b.a.v;
            } else {
                if (!f(this.d, i2)) {
                    if (i2 == h.b.e.u) {
                        i3 = R.attr.colorForeground;
                        iRound = Math.round(40.8f);
                        z = true;
                    } else if (i2 != h.b.e.f1692l) {
                        iRound = -1;
                        z = false;
                        i3 = 0;
                    }
                    if (z) {
                        return false;
                    }
                    if (i0.a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(l.e(v0.c(context, i3), mode));
                    if (iRound != -1) {
                        drawable.setAlpha(iRound);
                    }
                    return true;
                }
                mode = PorterDuff.Mode.MULTIPLY;
            }
            iRound = -1;
            z = true;
            if (z) {
                return false;
            }
            if (i0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(l.e(v0.c(context, i3), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.q0.f
        public PorterDuff.Mode b(int i2) {
            if (i2 == h.b.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.q0.f
        public Drawable c(q0 q0Var, Context context, int i2) {
            int i3;
            if (i2 == h.b.e.f1690j) {
                return new LayerDrawable(new Drawable[]{q0Var.j(context, h.b.e.f1689i), q0Var.j(context, h.b.e.f1691k)});
            }
            if (i2 == h.b.e.y) {
                i3 = h.b.d.f1680i;
            } else if (i2 == h.b.e.x) {
                i3 = h.b.d.f1681j;
            } else {
                if (i2 != h.b.e.z) {
                    return null;
                }
                i3 = h.b.d.f1682k;
            }
            return l(q0Var, context, i3);
        }

        @Override // androidx.appcompat.widget.q0.f
        public ColorStateList d(Context context, int i2) {
            if (i2 == h.b.e.f1693m) {
                return h.b.k.a.a.a(context, h.b.c.e);
            }
            if (i2 == h.b.e.I) {
                return h.b.k.a.a.a(context, h.b.c.f1677h);
            }
            if (i2 == h.b.e.H) {
                return k(context);
            }
            if (i2 == h.b.e.f) {
                return j(context);
            }
            if (i2 == h.b.e.b) {
                return g(context);
            }
            if (i2 == h.b.e.e) {
                return i(context);
            }
            if (i2 == h.b.e.D || i2 == h.b.e.E) {
                return h.b.k.a.a.a(context, h.b.c.f1676g);
            }
            if (f(this.b, i2)) {
                return v0.e(context, h.b.a.x);
            }
            if (f(this.e, i2)) {
                return h.b.k.a.a.a(context, h.b.c.d);
            }
            if (f(this.f, i2)) {
                return h.b.k.a.a.a(context, h.b.c.c);
            }
            if (i2 == h.b.e.A) {
                return h.b.k.a.a.a(context, h.b.c.f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.q0.f
        public boolean e(Context context, int i2, Drawable drawable) {
            Drawable drawableFindDrawableByLayerId;
            int iC;
            if (i2 == h.b.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i3 = h.b.a.x;
                m(drawableFindDrawableByLayerId2, v0.c(context, i3), l.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), v0.c(context, i3), l.b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                iC = v0.c(context, h.b.a.v);
            } else {
                if (i2 != h.b.e.y && i2 != h.b.e.x && i2 != h.b.e.z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(R.id.background), v0.b(context, h.b.a.x), l.b);
                Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i4 = h.b.a.v;
                m(drawableFindDrawableByLayerId3, v0.c(context, i4), l.b);
                drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                iC = v0.c(context, i4);
            }
            m(drawableFindDrawableByLayerId, iC, l.b);
            return true;
        }
    }

    public static synchronized l b() {
        if (c == null) {
            h();
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        return q0.l(i2, mode);
    }

    public static synchronized void h() {
        if (c == null) {
            l lVar = new l();
            c = lVar;
            lVar.a = q0.h();
            c.a.u(new a());
        }
    }

    static void i(Drawable drawable, y0 y0Var, int[] iArr) {
        q0.w(drawable, y0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i2) {
        return this.a.j(context, i2);
    }

    synchronized Drawable d(Context context, int i2, boolean z) {
        return this.a.k(context, i2, z);
    }

    synchronized ColorStateList f(Context context, int i2) {
        return this.a.m(context, i2);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }
}
