package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class c0 {
    private final TextView a;
    private y0 b;
    private y0 c;
    private y0 d;
    private y0 e;
    private y0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y0 f193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private y0 f194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e0 f195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f196j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f197k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f199m;

    class a extends androidx.core.content.d.h.d {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ WeakReference c;

        a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.b = i3;
            this.c = weakReference;
        }

        @Override // androidx.core.content.d.h.d
        public void d(int i2) {
        }

        @Override // androidx.core.content.d.h.d
        public void e(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.b & 2) != 0);
            }
            c0.this.n(this.c, typeface);
        }
    }

    class b implements Runnable {
        final /* synthetic */ TextView a;
        final /* synthetic */ Typeface b;
        final /* synthetic */ int c;

        b(c0 c0Var, TextView textView, Typeface typeface, int i2) {
            this.a = textView;
            this.b = typeface;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setTypeface(this.b, this.c);
        }
    }

    c0(TextView textView) {
        this.a = textView;
        this.f195i = new e0(textView);
    }

    private void B(int i2, float f) {
        this.f195i.y(i2, f);
    }

    private void C(Context context, a1 a1Var) {
        String strN;
        Typeface typefaceCreate;
        Typeface typeface;
        int i2 = Build.VERSION.SDK_INT;
        this.f196j = a1Var.j(h.b.j.A2, this.f196j);
        if (i2 >= 28) {
            int iJ = a1Var.j(h.b.j.F2, -1);
            this.f197k = iJ;
            if (iJ != -1) {
                this.f196j = (this.f196j & 2) | 0;
            }
        }
        int i3 = h.b.j.E2;
        if (!a1Var.r(i3) && !a1Var.r(h.b.j.G2)) {
            int i4 = h.b.j.z2;
            if (a1Var.r(i4)) {
                this.f199m = false;
                int iJ2 = a1Var.j(i4, 1);
                if (iJ2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iJ2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iJ2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f198l = typeface;
                return;
            }
            return;
        }
        this.f198l = null;
        int i5 = h.b.j.G2;
        if (a1Var.r(i5)) {
            i3 = i5;
        }
        int i6 = this.f197k;
        int i7 = this.f196j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = a1Var.i(i3, this.f196j, new a(i6, i7, new WeakReference(this.a)));
                if (typefaceI != null) {
                    if (i2 >= 28 && this.f197k != -1) {
                        typefaceI = Typeface.create(Typeface.create(typefaceI, 0), this.f197k, (this.f196j & 2) != 0);
                    }
                    this.f198l = typefaceI;
                }
                this.f199m = this.f198l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f198l != null || (strN = a1Var.n(i3)) == null) {
            return;
        }
        if (i2 < 28 || this.f197k == -1) {
            typefaceCreate = Typeface.create(strN, this.f196j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strN, 0), this.f197k, (this.f196j & 2) != 0);
        }
        this.f198l = typefaceCreate;
    }

    private void a(Drawable drawable, y0 y0Var) {
        if (drawable == null || y0Var == null) {
            return;
        }
        l.i(drawable, y0Var, this.a.getDrawableState());
    }

    private static y0 d(Context context, l lVar, int i2) {
        ColorStateList colorStateListF = lVar.f(context, i2);
        if (colorStateListF == null) {
            return null;
        }
        y0 y0Var = new y0();
        y0Var.d = true;
        y0Var.a = colorStateListF;
        return y0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (i2 >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        TextView textView3 = this.a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        y0 y0Var = this.f194h;
        this.b = y0Var;
        this.c = y0Var;
        this.d = y0Var;
        this.e = y0Var;
        this.f = y0Var;
        this.f193g = y0Var;
    }

    void A(int i2, float f) {
        if (androidx.core.widget.b.w || l()) {
            return;
        }
        B(i2, f);
    }

    void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f == null && this.f193g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.f193g);
        }
    }

    void c() {
        this.f195i.b();
    }

    int e() {
        return this.f195i.j();
    }

    int f() {
        return this.f195i.k();
    }

    int g() {
        return this.f195i.l();
    }

    int[] h() {
        return this.f195i.m();
    }

    int i() {
        return this.f195i.n();
    }

    ColorStateList j() {
        y0 y0Var = this.f194h;
        if (y0Var != null) {
            return y0Var.a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        y0 y0Var = this.f194h;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    boolean l() {
        return this.f195i.s();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:80:0x0187  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    @SuppressLint({"NewApi"})
    void m(AttributeSet attributeSet, int i2) {
        String strN;
        ColorStateList colorStateListC;
        String strN2;
        boolean zA;
        ColorStateList colorStateListC2;
        ColorStateList colorStateListC3;
        boolean z;
        int i3;
        String strN3;
        l lVar;
        int i4;
        int i5;
        int i6;
        Context context = this.a.getContext();
        l lVarB = l.b();
        int[] iArr = h.b.j.V;
        a1 a1VarU = a1.u(context, attributeSet, iArr, i2, 0);
        TextView textView = this.a;
        h.h.l.y.L(textView, textView.getContext(), iArr, attributeSet, a1VarU.q(), i2, 0);
        int iM = a1VarU.m(h.b.j.W, -1);
        int i7 = h.b.j.Z;
        if (a1VarU.r(i7)) {
            this.b = d(context, lVarB, a1VarU.m(i7, 0));
        }
        int i8 = h.b.j.X;
        if (a1VarU.r(i8)) {
            this.c = d(context, lVarB, a1VarU.m(i8, 0));
        }
        int i9 = h.b.j.a0;
        if (a1VarU.r(i9)) {
            this.d = d(context, lVarB, a1VarU.m(i9, 0));
        }
        int i10 = h.b.j.Y;
        if (a1VarU.r(i10)) {
            this.e = d(context, lVarB, a1VarU.m(i10, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 17) {
            int i12 = h.b.j.b0;
            if (a1VarU.r(i12)) {
                this.f = d(context, lVarB, a1VarU.m(i12, 0));
            }
            int i13 = h.b.j.c0;
            if (a1VarU.r(i13)) {
                this.f193g = d(context, lVarB, a1VarU.m(i13, 0));
            }
        }
        a1VarU.v();
        boolean z2 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM != -1) {
            a1 a1VarS = a1.s(context, iM, h.b.j.x2);
            if (z2) {
                zA = false;
                z = false;
            } else {
                int i14 = h.b.j.I2;
                if (a1VarS.r(i14)) {
                    zA = a1VarS.a(i14, false);
                    z = true;
                } else {
                    zA = false;
                    z = false;
                }
            }
            C(context, a1VarS);
            if (i11 < 23) {
                int i15 = h.b.j.B2;
                colorStateListC = a1VarS.r(i15) ? a1VarS.c(i15) : null;
                int i16 = h.b.j.C2;
                colorStateListC2 = a1VarS.r(i16) ? a1VarS.c(i16) : null;
                int i17 = h.b.j.D2;
                colorStateListC3 = a1VarS.r(i17) ? a1VarS.c(i17) : null;
                i5 = h.b.j.J2;
                if (a1VarS.r(i5)) {
                    strN2 = a1VarS.n(i5);
                } else {
                    strN2 = null;
                }
                if (i11 >= 26) {
                    i6 = h.b.j.H2;
                    if (a1VarS.r(i6)) {
                        strN = a1VarS.n(i6);
                    } else {
                        strN = null;
                    }
                } else {
                    strN = null;
                }
                a1VarS.v();
            } else {
                colorStateListC = null;
                colorStateListC2 = null;
            }
            i5 = h.b.j.J2;
            if (a1VarS.r(i5)) {
                strN2 = a1VarS.n(i5);
            } else {
                strN2 = null;
            }
            if (i11 >= 26) {
                i6 = h.b.j.H2;
                if (a1VarS.r(i6)) {
                    strN = a1VarS.n(i6);
                } else {
                    strN = null;
                }
            } else {
                strN = null;
            }
            a1VarS.v();
        } else {
            strN = null;
            colorStateListC = null;
            strN2 = null;
            zA = false;
            colorStateListC2 = null;
            colorStateListC3 = null;
            z = false;
        }
        a1 a1VarU2 = a1.u(context, attributeSet, h.b.j.x2, i2, 0);
        if (z2) {
            i3 = 23;
        } else {
            int i18 = h.b.j.I2;
            if (a1VarU2.r(i18)) {
                zA = a1VarU2.a(i18, false);
                i3 = 23;
                z = true;
            } else {
                i3 = 23;
            }
        }
        if (i11 < i3) {
            int i19 = h.b.j.B2;
            if (a1VarU2.r(i19)) {
                colorStateListC = a1VarU2.c(i19);
            }
            int i20 = h.b.j.C2;
            if (a1VarU2.r(i20)) {
                colorStateListC2 = a1VarU2.c(i20);
            }
            int i21 = h.b.j.D2;
            if (a1VarU2.r(i21)) {
                colorStateListC3 = a1VarU2.c(i21);
            }
        }
        int i22 = h.b.j.J2;
        if (a1VarU2.r(i22)) {
            strN2 = a1VarU2.n(i22);
        }
        if (i11 >= 26) {
            int i23 = h.b.j.H2;
            if (a1VarU2.r(i23)) {
                strN3 = a1VarU2.n(i23);
            } else {
                strN3 = strN;
            }
        } else {
            strN3 = strN;
        }
        if (i11 >= 28) {
            int i24 = h.b.j.y2;
            if (a1VarU2.r(i24)) {
                lVar = lVarB;
                if (a1VarU2.e(i24, -1) == 0) {
                    this.a.setTextSize(0, 0.0f);
                }
            } else {
                lVar = lVarB;
            }
        } else {
            lVar = lVarB;
        }
        C(context, a1VarU2);
        a1VarU2.v();
        if (colorStateListC != null) {
            this.a.setTextColor(colorStateListC);
        }
        if (colorStateListC2 != null) {
            this.a.setHintTextColor(colorStateListC2);
        }
        if (colorStateListC3 != null) {
            this.a.setLinkTextColor(colorStateListC3);
        }
        if (!z2 && z) {
            s(zA);
        }
        Typeface typeface = this.f198l;
        if (typeface != null) {
            if (this.f197k == -1) {
                this.a.setTypeface(typeface, this.f196j);
            } else {
                this.a.setTypeface(typeface);
            }
        }
        if (strN3 != null) {
            this.a.setFontVariationSettings(strN3);
        }
        if (strN2 != null) {
            if (i11 >= 24) {
                this.a.setTextLocales(LocaleList.forLanguageTags(strN2));
            } else if (i11 >= 21) {
                this.a.setTextLocale(Locale.forLanguageTag(strN2.substring(0, strN2.indexOf(44))));
            }
        }
        this.f195i.t(attributeSet, i2);
        if (androidx.core.widget.b.w && this.f195i.n() != 0) {
            int[] iArrM = this.f195i.m();
            if (iArrM.length > 0) {
                if (this.a.getAutoSizeStepGranularity() != -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithConfiguration(this.f195i.k(), this.f195i.j(), this.f195i.l(), 0);
                } else {
                    this.a.setAutoSizeTextTypeUniformWithPresetSizes(iArrM, 0);
                }
            }
        }
        a1 a1VarT = a1.t(context, attributeSet, h.b.j.d0);
        int iM2 = a1VarT.m(h.b.j.l0, -1);
        l lVar2 = lVar;
        Drawable drawableC = iM2 != -1 ? lVar2.c(context, iM2) : null;
        int iM3 = a1VarT.m(h.b.j.q0, -1);
        Drawable drawableC2 = iM3 != -1 ? lVar2.c(context, iM3) : null;
        int iM4 = a1VarT.m(h.b.j.m0, -1);
        Drawable drawableC3 = iM4 != -1 ? lVar2.c(context, iM4) : null;
        int iM5 = a1VarT.m(h.b.j.j0, -1);
        Drawable drawableC4 = iM5 != -1 ? lVar2.c(context, iM5) : null;
        int iM6 = a1VarT.m(h.b.j.n0, -1);
        Drawable drawableC5 = iM6 != -1 ? lVar2.c(context, iM6) : null;
        int iM7 = a1VarT.m(h.b.j.k0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iM7 != -1 ? lVar2.c(context, iM7) : null);
        int i25 = h.b.j.o0;
        if (a1VarT.r(i25)) {
            androidx.core.widget.j.f(this.a, a1VarT.c(i25));
        }
        int i26 = h.b.j.p0;
        if (a1VarT.r(i26)) {
            i4 = -1;
            androidx.core.widget.j.g(this.a, i0.d(a1VarT.j(i26, -1), null));
        } else {
            i4 = -1;
        }
        int iE = a1VarT.e(h.b.j.s0, i4);
        int iE2 = a1VarT.e(h.b.j.t0, i4);
        int iE3 = a1VarT.e(h.b.j.u0, i4);
        a1VarT.v();
        if (iE != i4) {
            androidx.core.widget.j.h(this.a, iE);
        }
        if (iE2 != i4) {
            androidx.core.widget.j.i(this.a, iE2);
        }
        if (iE3 != i4) {
            androidx.core.widget.j.j(this.a, iE3);
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f199m) {
            this.f198l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (h.h.l.y.z(textView)) {
                    textView.post(new b(this, textView, typeface, this.f196j));
                } else {
                    textView.setTypeface(typeface, this.f196j);
                }
            }
        }
    }

    void o(boolean z, int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.w) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i2) {
        String strN;
        ColorStateList colorStateListC;
        ColorStateList colorStateListC2;
        ColorStateList colorStateListC3;
        a1 a1VarS = a1.s(context, i2, h.b.j.x2);
        int i3 = h.b.j.I2;
        if (a1VarS.r(i3)) {
            s(a1VarS.a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            int i5 = h.b.j.B2;
            if (a1VarS.r(i5) && (colorStateListC3 = a1VarS.c(i5)) != null) {
                this.a.setTextColor(colorStateListC3);
            }
            int i6 = h.b.j.D2;
            if (a1VarS.r(i6) && (colorStateListC2 = a1VarS.c(i6)) != null) {
                this.a.setLinkTextColor(colorStateListC2);
            }
            int i7 = h.b.j.C2;
            if (a1VarS.r(i7) && (colorStateListC = a1VarS.c(i7)) != null) {
                this.a.setHintTextColor(colorStateListC);
            }
        }
        int i8 = h.b.j.y2;
        if (a1VarS.r(i8) && a1VarS.e(i8, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, a1VarS);
        if (i4 >= 26) {
            int i9 = h.b.j.H2;
            if (a1VarS.r(i9) && (strN = a1VarS.n(i9)) != null) {
                this.a.setFontVariationSettings(strN);
            }
        }
        a1VarS.v();
        Typeface typeface = this.f198l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f196j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        h.h.l.i0.a.f(editorInfo, textView.getText());
    }

    void s(boolean z) {
        this.a.setAllCaps(z);
    }

    void t(int i2, int i3, int i4, int i5) {
        this.f195i.u(i2, i3, i4, i5);
    }

    void u(int[] iArr, int i2) {
        this.f195i.v(iArr, i2);
    }

    void v(int i2) {
        this.f195i.w(i2);
    }

    void w(ColorStateList colorStateList) {
        if (this.f194h == null) {
            this.f194h = new y0();
        }
        y0 y0Var = this.f194h;
        y0Var.a = colorStateList;
        y0Var.d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f194h == null) {
            this.f194h = new y0();
        }
        y0 y0Var = this.f194h;
        y0Var.b = mode;
        y0Var.c = mode != null;
        z();
    }
}
