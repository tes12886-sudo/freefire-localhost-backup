package j.d.a.c.d;

import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class a0 implements SuccessContinuation {
    static final SuccessContinuation a = new a0();

    private a0() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task a(Object obj) {
        return d.c((Bundle) obj);
    }
}
