package j.c.a.e.f;

import android.util.Pair;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static j.c.a.e.f.l.a a(int i2) {
        String str;
        int iIntValue;
        if (i2 == 0) {
            Pair<String, Integer> pairD = d(j.c.a.e.i.a.b());
            str = (String) pairD.first;
            iIntValue = ((Integer) pairD.second).intValue();
        } else {
            if (i2 == 1) {
                Pair<String, Integer> pairD2 = d(j.c.a.e.i.a.c());
                j.c.a.e.f.l.a aVarB = b((String) pairD2.first, ((Integer) pairD2.second).intValue(), i2);
                aVarB.m(true);
                return aVarB;
            }
            if (i2 != 2) {
                return null;
            }
            iIntValue = 10086;
            str = "gpushsg1.beetalkmobile.com";
        }
        j.c.a.e.f.l.a aVarB2 = b(str, iIntValue, i2);
        aVarB2.m(false);
        return aVarB2;
    }

    public static j.c.a.e.f.l.a b(String str, int i2, int i3) {
        return new j.c.a.e.f.l.a(str, i2, i3);
    }

    public static j c(InputStream inputStream) {
        return new j(inputStream);
    }

    private static Pair<String, Integer> d(String str) {
        String[] strArrSplit = str.split(":");
        return new Pair<>(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
    }
}
