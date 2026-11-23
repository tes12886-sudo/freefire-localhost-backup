package j.d.a.c.d;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends j.d.a.c.f.e.e {
    private final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(d dVar, Looper looper) {
        super(looper);
        this.a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.g(message);
    }
}
