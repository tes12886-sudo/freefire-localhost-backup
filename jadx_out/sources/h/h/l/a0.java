package h.h.l;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(h.h.c.f1792k);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && y.v(viewGroup) == null) ? false : true;
    }
}
