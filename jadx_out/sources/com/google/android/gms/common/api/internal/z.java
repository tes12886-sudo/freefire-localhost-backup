package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class z extends com.google.android.gms.common.api.e {
    private final String b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public z(String str) {
    }

    @Override // com.google.android.gms.common.api.e
    public final ConnectionResult d() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.e
    public final com.google.android.gms.common.api.f<Status> e() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.e
    public final void f() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.e
    public final void g() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.e
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.e
    public final void o(com.google.android.gms.common.api.e.c cVar) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.e
    public final void p(com.google.android.gms.common.api.e.c cVar) {
        throw new UnsupportedOperationException(this.b);
    }
}
