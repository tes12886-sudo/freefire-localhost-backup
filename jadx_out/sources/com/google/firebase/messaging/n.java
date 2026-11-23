package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class n implements Continuation {
    static final Continuation a = new n();

    private n() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object a(Task task) {
        return Integer.valueOf(j.d.a.e.a.a.i.g.STATUS_FORBIDDEN);
    }
}
