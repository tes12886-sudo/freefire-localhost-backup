package j.d.a.d.a.f;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
final class u implements c, b {
    private final CountDownLatch a = new CountDownLatch(1);

    /* synthetic */ u(byte[] bArr) {
    }

    public final void a() throws InterruptedException {
        this.a.await();
    }

    @Override // j.d.a.d.a.f.b
    public final void onFailure(Exception exc) {
        this.a.countDown();
    }

    @Override // j.d.a.d.a.f.c
    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}
