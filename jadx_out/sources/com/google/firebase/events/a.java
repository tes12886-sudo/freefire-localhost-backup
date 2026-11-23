package com.google.firebase.events;

import com.google.firebase.components.b0;

/* JADX INFO: loaded from: classes.dex */
public class a<T> {
    private final Class<T> a;
    private final T b;

    public a(Class<T> cls, T t) {
        b0.b(cls);
        this.a = cls;
        b0.b(t);
        this.b = t;
    }

    public T a() {
        return this.b;
    }

    public Class<T> b() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}
