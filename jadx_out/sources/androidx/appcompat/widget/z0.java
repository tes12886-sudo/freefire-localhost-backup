package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class z0 extends r0 {
    private final WeakReference<Context> b;

    public z0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Drawable drawableA = a(i2);
        Context context = this.b.get();
        if (drawableA != null && context != null) {
            q0.h().x(context, i2, drawableA);
        }
        return drawableA;
    }
}
