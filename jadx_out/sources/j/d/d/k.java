package j.d.d;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public h b() {
        if (h()) {
            return (h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n c() {
        if (l()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public p d() {
        if (n()) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean h() {
        return this instanceof h;
    }

    public boolean j() {
        return this instanceof m;
    }

    public boolean l() {
        return this instanceof n;
    }

    public boolean n() {
        return this instanceof p;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            j.d.d.b0.c cVar = new j.d.d.b0.c(stringWriter);
            cVar.i0(true);
            j.d.d.z.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
