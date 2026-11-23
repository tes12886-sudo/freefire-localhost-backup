package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    public interface a {
        Bundle a();

        Bundle b();
    }

    public static final class b extends androidx.activity.result.g.a<Intent, Pair<Integer, Intent>> {
        b() {
        }

        @Override // androidx.activity.result.g.a
        public /* bridge */ /* synthetic */ Intent a(Context context, Intent intent) {
            Intent intent2 = intent;
            d(context, intent2);
            return intent2;
        }

        public Intent d(Context context, Intent intent) {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(intent, "input");
            return intent;
        }

        @Override // androidx.activity.result.g.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, Intent> c(int i2, Intent intent) {
            Pair<Integer, Intent> pairCreate = Pair.create(Integer.valueOf(i2), intent);
            l.y.c.i.d(pairCreate, "Pair.create(resultCode, intent)");
            return pairCreate;
        }
    }

    static final class c<O> implements androidx.activity.result.b {
        final /* synthetic */ com.facebook.j a;
        final /* synthetic */ int b;
        final /* synthetic */ l.y.c.l c;

        c(com.facebook.j jVar, int i2, l.y.c.l lVar) {
            this.a = jVar;
            this.b = i2;
            this.c = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Pair<Integer, Intent> pair) {
            com.facebook.j eVar = this.a;
            if (eVar == null) {
                eVar = new e();
            }
            int i2 = this.b;
            Object obj = pair.first;
            l.y.c.i.d(obj, "result.first");
            eVar.a(i2, ((Number) obj).intValue(), (Intent) pair.second);
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.c.a;
            if (cVar != null) {
                synchronized (cVar) {
                    cVar.c();
                    this.c.a = null;
                    l.s sVar = l.s.a;
                }
            }
        }
    }

    private i() {
    }

    public static final boolean a(h hVar) {
        l.y.c.i.e(hVar, "feature");
        return b(hVar).d() != -1;
    }

    public static final c0.g b(h hVar) {
        l.y.c.i.e(hVar, "feature");
        String strG = com.facebook.r.g();
        String strA = hVar.a();
        return c0.w(strA, a.c(strG, strA, hVar));
    }

    private final int[] c(String str, String str2, h hVar) {
        int[] iArrC;
        t.b bVarA = t.f630n.a(str, str2, hVar.name());
        return (bVarA == null || (iArrC = bVarA.c()) == null) ? new int[]{hVar.c()} : iArrC;
    }

    public static final void d(com.facebook.internal.a aVar, Activity activity) {
        l.y.c.i.e(aVar, "appCall");
        l.y.c.i.e(activity, "activity");
        activity.startActivityForResult(aVar.f(), aVar.e());
        aVar.g();
    }

    public static final void e(com.facebook.internal.a aVar, androidx.activity.result.d dVar, com.facebook.j jVar) {
        l.y.c.i.e(aVar, "appCall");
        l.y.c.i.e(dVar, "registry");
        Intent intentF = aVar.f();
        if (intentF != null) {
            m(dVar, jVar, intentF, aVar.e());
            aVar.g();
        }
    }

    public static final void f(com.facebook.internal.a aVar, v vVar) {
        l.y.c.i.e(aVar, "appCall");
        l.y.c.i.e(vVar, "fragmentWrapper");
        vVar.b(aVar.f(), aVar.e());
        aVar.g();
    }

    public static final void g(com.facebook.internal.a aVar) {
        l.y.c.i.e(aVar, "appCall");
        k(aVar, new com.facebook.n("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void h(com.facebook.internal.a aVar, String str, Bundle bundle) {
        l.y.c.i.e(aVar, "appCall");
        i0.e(com.facebook.r.f(), g.b());
        i0.h(com.facebook.r.f());
        Intent intent = new Intent(com.facebook.r.f(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.c, str);
        intent.putExtra(CustomTabMainActivity.d, bundle);
        intent.putExtra(CustomTabMainActivity.e, g.a());
        c0.F(intent, aVar.d().toString(), str, c0.z(), null);
        aVar.h(intent);
    }

    public static final void i(com.facebook.internal.a aVar, com.facebook.n nVar) {
        l.y.c.i.e(aVar, "appCall");
        if (nVar == null) {
            return;
        }
        i0.f(com.facebook.r.f());
        Intent intent = new Intent();
        intent.setClass(com.facebook.r.f(), FacebookActivity.class);
        intent.setAction("PassThrough");
        c0.F(intent, aVar.d().toString(), null, c0.z(), c0.j(nVar));
        aVar.h(intent);
    }

    public static final void j(com.facebook.internal.a aVar, a aVar2, h hVar) {
        l.y.c.i.e(aVar, "appCall");
        l.y.c.i.e(aVar2, "parameterProvider");
        l.y.c.i.e(hVar, "feature");
        Context contextF = com.facebook.r.f();
        String strA = hVar.a();
        c0.g gVarB = b(hVar);
        int iD = gVarB.d();
        if (iD == -1) {
            throw new com.facebook.n("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle bundleB = c0.E(iD) ? aVar2.b() : aVar2.a();
        if (bundleB == null) {
            bundleB = new Bundle();
        }
        Intent intentN = c0.n(contextF, aVar.d().toString(), strA, gVarB, bundleB);
        if (intentN == null) {
            throw new com.facebook.n("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        aVar.h(intentN);
    }

    public static final void k(com.facebook.internal.a aVar, com.facebook.n nVar) {
        l.y.c.i.e(aVar, "appCall");
        i(aVar, nVar);
    }

    public static final void l(com.facebook.internal.a aVar, String str, Bundle bundle) {
        l.y.c.i.e(aVar, "appCall");
        i0.f(com.facebook.r.f());
        i0.h(com.facebook.r.f());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        c0.F(intent, aVar.d().toString(), str, c0.z(), bundle2);
        intent.setClass(com.facebook.r.f(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.h(intent);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.activity.result.c] */
    public static final void m(androidx.activity.result.d dVar, com.facebook.j jVar, Intent intent, int i2) {
        l.y.c.i.e(dVar, "registry");
        l.y.c.i.e(intent, "intent");
        l.y.c.l lVar = new l.y.c.l();
        lVar.a = null;
        ?? I = dVar.i("facebook-dialog-request-" + i2, new b(), new c(jVar, i2, lVar));
        lVar.a = I;
        androidx.activity.result.c cVar = (androidx.activity.result.c) I;
        if (cVar != null) {
            cVar.a(intent);
        }
    }
}
