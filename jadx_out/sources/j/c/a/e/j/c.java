package j.c.a.e.j;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static Context c;
    private j.c.a.e.j.a.InterfaceC0226a a = new a();
    private b b;

    class a implements j.c.a.e.j.a.InterfaceC0226a {
        a() {
        }

        @Override // j.c.a.e.j.a.InterfaceC0226a
        public void a() {
            j.c.a.e.l.b.a("Strategy is successful. Service can be safely started");
            c.this.b.b();
        }

        @Override // j.c.a.e.j.a.InterfaceC0226a
        public void b(ComponentName componentName) {
            j.c.a.e.l.b.a("Strategy Unsuccessful, Should not start service. Its already running.");
            c.this.b.a(componentName);
        }
    }

    public interface b {
        void a(ComponentName componentName);

        void b();
    }

    public c(Context context, b bVar) {
        c = context;
        this.b = bVar;
    }

    public void b() {
        j.c.a.e.j.b bVar = new j.c.a.e.j.b(this.a);
        j.c.a.e.l.b.a("fire strategy by " + c.getPackageName());
        bVar.a(c);
    }
}
