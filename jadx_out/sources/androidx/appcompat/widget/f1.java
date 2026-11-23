package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class f1 extends r0 {
    private static boolean c;
    private final WeakReference<Context> b;

    public f1(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    public static boolean b() {
        return c;
    }

    public static boolean c() {
        return b() && Build.VERSION.SDK_INT <= 20;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Context context = this.b.get();
        return context != null ? q0.h().t(context, this, i2) : a(i2);
    }
}
