package j.d.a.d.a.b;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends k0 implements e {
    public d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // j.d.a.d.a.b.k0
    protected final boolean j(int i2, Parcel parcel) {
        if (i2 != 2) {
            return false;
        }
        Z0((Bundle) l0.a(parcel, Bundle.CREATOR));
        return true;
    }
}
