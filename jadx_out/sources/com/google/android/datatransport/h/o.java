package com.google.android.datatransport.h;

import com.google.android.datatransport.TransportFactory;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class o implements TransportFactory {
    private final Set<com.google.android.datatransport.b> a;
    private final n b;
    private final q c;

    o(Set<com.google.android.datatransport.b> set, n nVar, q qVar) {
        this.a = set;
        this.b = nVar;
        this.c = qVar;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public <T> com.google.android.datatransport.f<T> a(String str, Class<T> cls, com.google.android.datatransport.b bVar, com.google.android.datatransport.e<T, byte[]> eVar) {
        if (this.a.contains(bVar)) {
            return new p(this.b, str, bVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.a));
    }
}
