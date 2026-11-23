package m.h0.h;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends RuntimeException {
    private final IOException a;
    private IOException b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IOException iOException) {
        super(iOException);
        l.y.c.i.e(iOException, "firstConnectException");
        this.a = iOException;
        this.b = iOException;
    }

    public final void a(IOException iOException) {
        l.y.c.i.e(iOException, "e");
        l.b.a(this.a, iOException);
        this.b = iOException;
    }

    public final IOException b() {
        return this.a;
    }

    public final IOException c() {
        return this.b;
    }
}
