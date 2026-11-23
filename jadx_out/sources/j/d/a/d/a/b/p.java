package j.d.a.d.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p<T extends IInterface> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map<String, Handler> f1992l = new HashMap();
    private final Context a;
    private final f b;
    private final String c;
    private boolean e;
    private final Intent f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l<T> f1993g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ServiceConnection f1996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private T f1997k;
    private final List<g> d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IBinder.DeathRecipient f1995i = new IBinder.DeathRecipient(this) { // from class: j.d.a.d.a.b.h
        private final p a;

        {
            this.a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.a.n();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WeakReference<k> f1994h = new WeakReference<>(null);

    public p(Context context, f fVar, String str, Intent intent, l<T> lVar) {
        this.a = context;
        this.b = fVar;
        this.c = str;
        this.f = intent;
        this.f1993g = lVar;
    }

    static /* synthetic */ void d(p pVar, g gVar) {
        if (pVar.f1997k != null || pVar.e) {
            if (!pVar.e) {
                gVar.run();
                return;
            } else {
                pVar.b.d("Waiting to bind to the service.", new Object[0]);
                pVar.d.add(gVar);
                return;
            }
        }
        pVar.b.d("Initiate binding to the service.", new Object[0]);
        pVar.d.add(gVar);
        o oVar = new o(pVar);
        pVar.f1996j = oVar;
        pVar.e = true;
        if (pVar.a.bindService(pVar.f, oVar, 1)) {
            return;
        }
        pVar.b.d("Failed to bind to the service.", new Object[0]);
        pVar.e = false;
        Iterator<g> it = pVar.d.iterator();
        while (it.hasNext()) {
            j.d.a.d.a.f.p<?> pVarB = it.next().b();
            if (pVarB != null) {
                pVarB.d(new q());
            }
        }
        pVar.d.clear();
    }

    static /* synthetic */ void j(p pVar) {
        pVar.b.d("linkToDeath", new Object[0]);
        try {
            pVar.f1997k.asBinder().linkToDeath(pVar.f1995i, 0);
        } catch (RemoteException e) {
            pVar.b.c(e, "linkToDeath failed", new Object[0]);
        }
    }

    static /* synthetic */ void m(p pVar) {
        pVar.b.d("unlinkToDeath", new Object[0]);
        pVar.f1997k.asBinder().unlinkToDeath(pVar.f1995i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(g gVar) {
        Handler handler;
        Map<String, Handler> map = f1992l;
        synchronized (map) {
            if (!map.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                map.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.c);
        }
        handler.post(gVar);
    }

    public final void a(g gVar) {
        r(new i(this, gVar.b(), gVar));
    }

    public final void b() {
        r(new j(this));
    }

    public final T c() {
        return this.f1997k;
    }

    final /* bridge */ /* synthetic */ void n() {
        this.b.d("reportBinderDeath", new Object[0]);
        k kVar = this.f1994h.get();
        if (kVar != null) {
            this.b.d("calling onBinderDied", new Object[0]);
            kVar.a();
            return;
        }
        this.b.d("%s : Binder has died.", this.c);
        Iterator<g> it = this.d.iterator();
        while (it.hasNext()) {
            j.d.a.d.a.f.p<?> pVarB = it.next().b();
            if (pVarB != null) {
                pVarB.d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
            }
        }
        this.d.clear();
    }
}
