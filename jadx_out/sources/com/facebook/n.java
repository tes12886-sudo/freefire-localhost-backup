package com.facebook;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class n extends RuntimeException {

    static final class a implements com.facebook.internal.p.a {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                try {
                    com.facebook.internal.m0.j.b.c(this.a);
                } catch (Exception unused) {
                }
            }
        }
    }

    public n() {
    }

    public n(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !r.x() || random.nextInt(100) <= 50) {
            return;
        }
        com.facebook.internal.p.a(com.facebook.internal.p.b.ErrorReport, new a(str));
    }

    public n(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(String str, Object... objArr) {
        String str2;
        l.y.c.i.e(objArr, "args");
        if (str != null) {
            l.y.c.o oVar = l.y.c.o.a;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
        } else {
            str2 = null;
        }
        this(str2);
    }

    public n(Throwable th) {
        super(th);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message != null ? message : "";
    }
}
