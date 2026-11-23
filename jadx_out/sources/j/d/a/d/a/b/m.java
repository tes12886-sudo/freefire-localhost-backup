package j.d.a.d.a.b;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class m extends g {
    final /* synthetic */ IBinder b;
    final /* synthetic */ o c;

    m(o oVar, IBinder iBinder) {
        this.c = oVar;
        this.b = iBinder;
    }

    @Override // j.d.a.d.a.b.g
    public final void a() {
        p pVar = this.c.a;
        pVar.f1997k = (IInterface) pVar.f1993g.a(this.b);
        p.j(this.c.a);
        this.c.a.e = false;
        Iterator it = this.c.a.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.c.a.d.clear();
    }
}
