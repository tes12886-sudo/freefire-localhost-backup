package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface o {
    <T> T a(Class<T> cls);

    <T> Set<T> b(Class<T> cls);

    <T> Provider<T> c(Class<T> cls);

    <T> Provider<Set<T>> d(Class<T> cls);

    <T> Deferred<T> e(Class<T> cls);
}
