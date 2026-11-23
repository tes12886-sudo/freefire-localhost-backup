package j.g.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class w {
    w(m.u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("headers must not be null");
        }
        for (int i2 = 0; i2 < uVar.size(); i2++) {
            if ("x-rate-limit-limit".equals(uVar.c(i2)) || "x-rate-limit-remaining".equals(uVar.c(i2))) {
                Integer.valueOf(uVar.h(i2)).intValue();
            } else if ("x-rate-limit-reset".equals(uVar.c(i2))) {
                Long.valueOf(uVar.h(i2)).longValue();
            }
        }
    }
}
