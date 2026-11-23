package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class m0 extends o0 {
    private final Callable e;

    /* synthetic */ m0(Callable callable, l0 l0Var) {
        super();
        this.e = callable;
    }

    @Override // com.google.android.gms.common.o0
    final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
