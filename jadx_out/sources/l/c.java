package l;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements g<T>, Serializable {
    private final T a;

    public c(T t) {
        this.a = t;
    }

    @Override // l.g
    public T getValue() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
