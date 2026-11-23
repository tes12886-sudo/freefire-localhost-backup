package com.facebook.j0.r.g;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    private d() {
    }

    private final boolean a(TextView textView) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            String strB = new l.d0.f("\\s").b(f.k(textView), "");
            int length = strB.length();
            if (length >= 12 && length <= 19) {
                int i2 = 0;
                boolean z = false;
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    char cCharAt = strB.charAt(i3);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iD = l.d0.c.d(cCharAt);
                    if (z && (iD = iD * 2) > 9) {
                        iD = (iD % 10) + 1;
                    }
                    i2 += iD;
                    z = !z;
                }
                return i2 % 10 == 0;
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            boolean z = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            String strK = f.k(textView);
            if (strK == null) {
                return false;
            }
            if (strK.length() != 0) {
                z = false;
            }
            if (z) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(strK).matches();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    public static final boolean g(View view) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            d dVar = a;
            return dVar.c((TextView) view) || dVar.a((TextView) view) || dVar.d((TextView) view) || dVar.f((TextView) view) || dVar.e((TextView) view) || dVar.b((TextView) view);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return false;
        }
    }
}
