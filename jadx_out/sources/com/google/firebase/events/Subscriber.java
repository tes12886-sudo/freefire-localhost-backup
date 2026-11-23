package com.google.firebase.events;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface Subscriber {
    <T> void a(Class<T> cls, b<? super T> bVar);

    <T> void b(Class<T> cls, Executor executor, b<? super T> bVar);

    <T> void d(Class<T> cls, b<? super T> bVar);
}
