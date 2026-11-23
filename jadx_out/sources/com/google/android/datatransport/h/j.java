package com.google.android.datatransport.h;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
abstract class j {
    static Executor a() {
        return new l(Executors.newSingleThreadExecutor());
    }
}
