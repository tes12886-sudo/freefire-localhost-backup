package h.l.a;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.n;

/* JADX INFO: loaded from: classes.dex */
final class b extends Editable.Factory {
    private static final Object a = new Object();
    private static volatile Editable.Factory b;
    private static Class<?> c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
