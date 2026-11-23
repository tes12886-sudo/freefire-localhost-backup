package j.d.a.c.d;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class r extends u<Void> {
    r(int i2, int i3, Bundle bundle) {
        super(i2, 2, bundle);
    }

    @Override // j.d.a.c.d.u
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            c(null);
        } else {
            b(new t(4, "Invalid response to one way request"));
        }
    }

    @Override // j.d.a.c.d.u
    final boolean d() {
        return true;
    }
}
