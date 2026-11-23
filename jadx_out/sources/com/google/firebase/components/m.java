package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements o {
    m() {
    }

    @Override // com.google.firebase.components.o
    public <T> T a(Class<T> cls) {
        Provider<T> providerC = c(cls);
        if (providerC == null) {
            return null;
        }
        return providerC.get();
    }

    @Override // com.google.firebase.components.o
    public <T> Set<T> b(Class<T> cls) {
        return d(cls).get();
    }
}
