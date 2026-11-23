package androidx.activity.result.g;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a<Intent, androidx.activity.result.a> {
    @Override // androidx.activity.result.g.a
    public /* bridge */ /* synthetic */ Intent a(Context context, Intent intent) {
        Intent intent2 = intent;
        d(context, intent2);
        return intent2;
    }

    public Intent d(Context context, Intent intent) {
        return intent;
    }

    @Override // androidx.activity.result.g.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i2, Intent intent) {
        return new androidx.activity.result.a(i2, intent);
    }
}
