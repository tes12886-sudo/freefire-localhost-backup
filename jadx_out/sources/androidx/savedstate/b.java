package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final c a;
    private final SavedStateRegistry b = new SavedStateRegistry();

    private b(c cVar) {
        this.a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public SavedStateRegistry b() {
        return this.b;
    }

    public void c(Bundle bundle) {
        g gVarA = this.a.a();
        if (gVarA.b() != g.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        gVarA.a(new Recreator(this.a));
        this.b.b(gVarA, bundle);
    }

    public void d(Bundle bundle) {
        this.b.c(bundle);
    }
}
