package m.h0.k;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class n extends IOException {
    public final b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super(l.y.c.i.k("stream was reset: ", bVar));
        l.y.c.i.e(bVar, "errorCode");
        this.a = bVar;
    }
}
