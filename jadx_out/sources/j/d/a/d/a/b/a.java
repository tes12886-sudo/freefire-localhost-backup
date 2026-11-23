package j.d.a.d.a.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j0 implements c {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // j.d.a.d.a.b.c
    public final void a0(String str, Bundle bundle, e eVar) {
        Parcel parcelJ = j();
        parcelJ.writeString(str);
        l0.b(parcelJ, bundle);
        l0.c(parcelJ, eVar);
        m(2, parcelJ);
    }
}
