package com.google.android.datatransport.h;

import android.content.Context;
import com.google.android.datatransport.h.x.j.y;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
abstract class s implements Closeable {

    interface a {
        s a();

        a b(Context context);
    }

    s() {
    }

    abstract y b();

    abstract r c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b().close();
    }
}
