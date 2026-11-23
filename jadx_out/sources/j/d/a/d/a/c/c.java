package j.d.a.d.a.c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import j.d.a.d.a.b.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<StateT> {
    protected final f a;
    private final IntentFilter b;
    private final Context c;
    protected final Set<a<StateT>> d = new HashSet();
    private b e = null;
    private volatile boolean f = false;

    protected c(f fVar, IntentFilter intentFilter, Context context) {
        this.a = fVar;
        this.b = intentFilter;
        this.c = j.d.a.d.a.d.a.b(context);
    }

    private final void b() {
        b bVar;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            b bVar2 = new b(this);
            this.e = bVar2;
            this.c.registerReceiver(bVar2, this.b);
        }
        if (this.f || !this.d.isEmpty() || (bVar = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(bVar);
        this.e = null;
    }

    protected abstract void a(Context context, Intent intent);

    public final synchronized void c(boolean z) {
        this.f = z;
        b();
    }

    public final synchronized void d(StateT statet) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(statet);
        }
    }

    public final synchronized boolean e() {
        return this.e != null;
    }
}
