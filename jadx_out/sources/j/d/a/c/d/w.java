package j.d.a.c.d;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class w extends u<Bundle> {
    w(int i2, int i3, Bundle bundle) {
        super(i2, 1, bundle);
    }

    @Override // j.d.a.c.d.u
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }

    @Override // j.d.a.c.d.u
    final boolean d() {
        return false;
    }
}
