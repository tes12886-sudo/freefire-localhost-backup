package i;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class d {
    private final f a;

    d(f fVar) {
        this.a = fVar;
    }

    public boolean a() {
        return this.a.j();
    }

    public e b(Runnable runnable) {
        return this.a.u(runnable);
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", d.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.a.j()));
    }
}
