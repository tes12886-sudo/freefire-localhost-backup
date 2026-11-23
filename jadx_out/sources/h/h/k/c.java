package h.h.k;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static boolean a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return defpackage.d.a(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        int i2 = Build.VERSION.SDK_INT;
        return Arrays.hashCode(objArr);
    }

    public static <T> T c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
