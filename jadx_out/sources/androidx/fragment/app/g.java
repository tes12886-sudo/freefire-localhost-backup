package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    @Deprecated
    public Fragment e(Context context, String str, Bundle bundle) {
        return Fragment.Z(context, str, bundle);
    }

    public abstract View f(int i2);

    public abstract boolean g();
}
