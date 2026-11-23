package j.f.a;

import j.f.a.b;
import j.f.a.b.a;
import java.io.IOException;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes.dex */
final class c<M extends b<M, B>, B extends b.a<M, B>> implements Serializable {
    private final byte[] a;
    private final Class<M> b;

    public c(byte[] bArr, Class<M> cls) {
        this.a = bArr;
        this.b = cls;
    }

    Object readResolve() throws StreamCorruptedException {
        try {
            return e.l(this.b).e(this.a);
        } catch (IOException e) {
            throw new StreamCorruptedException(e.getMessage());
        }
    }
}
