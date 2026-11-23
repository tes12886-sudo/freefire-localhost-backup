package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookActivity;
import com.facebook.b0;
import com.facebook.internal.i0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set<String> f709j = f();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f710k = p.class.toString();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile p f711l;
    private final SharedPreferences c;
    private String e;
    private boolean f;
    private k a = k.NATIVE_WITH_FALLBACK;
    private com.facebook.login.c b = com.facebook.login.c.FRIENDS;
    private String d = "rerequest";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f712g = s.FACEBOOK;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f713h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f714i = false;

    class a implements com.facebook.internal.e.a {
        final /* synthetic */ com.facebook.l a;

        a(com.facebook.l lVar) {
            this.a = lVar;
        }

        @Override // com.facebook.internal.e.a
        public boolean a(int i2, Intent intent) {
            return p.this.n(i2, intent, this.a);
        }
    }

    static class b extends HashSet<String> {
        b() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    class c implements com.facebook.internal.e.a {
        c() {
        }

        @Override // com.facebook.internal.e.a
        public boolean a(int i2, Intent intent) {
            return p.this.m(i2, intent);
        }
    }

    private static class d implements w {
        private final Activity a;

        d(Activity activity) {
            i0.m(activity, "activity");
            this.a = activity;
        }

        @Override // com.facebook.login.w
        public Activity a() {
            return this.a;
        }

        @Override // com.facebook.login.w
        public void startActivityForResult(Intent intent, int i2) {
            this.a.startActivityForResult(intent, i2);
        }
    }

    private static class e {
        private static o a;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:11:0x000f A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0006, B:11:0x000f, B:13:0x0013, B:14:0x001e), top: B:20:0x0006 }] */
        /* JADX WARN: Code duplicated, block: B:13:0x0013 A[Catch: all -> 0x0022, TryCatch #0 {, blocks: (B:6:0x0006, B:11:0x000f, B:13:0x0013, B:14:0x001e), top: B:20:0x0006 }] */
        /* JADX WARN: Code duplicated, block: B:8:0x000c  */
        public static synchronized o b(Context context) {
            if (context != null) {
                if (context == null) {
                    return null;
                }
                if (a == null) {
                    a = new o(context, com.facebook.r.g());
                }
                return a;
            }
            context = com.facebook.r.f();
            if (context == null) {
                return null;
            }
            if (a == null) {
                a = new o(context, com.facebook.r.g());
            }
            return a;
            throw th;
        }
    }

    p() {
        i0.o();
        this.c = com.facebook.r.f().getSharedPreferences("com.facebook.loginManager", 0);
        if (!com.facebook.r.f736o || com.facebook.internal.g.a() == null) {
            return;
        }
        h.d.b.c.a(com.facebook.r.f(), "com.android.chrome", new com.facebook.login.b());
        h.d.b.c.b(com.facebook.r.f(), com.facebook.r.f().getPackageName());
    }

    static r a(l.d dVar, com.facebook.a aVar, com.facebook.f fVar) {
        Set<String> setK = dVar.k();
        HashSet hashSet = new HashSet(aVar.k());
        if (dVar.p()) {
            hashSet.retainAll(setK);
        }
        HashSet hashSet2 = new HashSet(setK);
        hashSet2.removeAll(hashSet);
        return new r(aVar, fVar, hashSet, hashSet2);
    }

    private void c(com.facebook.a aVar, com.facebook.f fVar, l.d dVar, com.facebook.n nVar, boolean z, com.facebook.l<r> lVar) {
        if (aVar != null) {
            com.facebook.a.r(aVar);
            b0.b();
        }
        if (fVar != null) {
            com.facebook.f.b(fVar);
        }
        if (lVar != null) {
            r rVarA = aVar != null ? a(dVar, aVar, fVar) : null;
            if (z || (rVarA != null && rVarA.b().size() == 0)) {
                lVar.a();
                return;
            }
            if (nVar != null) {
                lVar.b(nVar);
            } else if (aVar != null) {
                q(true);
                lVar.onSuccess(rVarA);
            }
        }
    }

    public static p e() {
        if (f711l == null) {
            synchronized (p.class) {
                if (f711l == null) {
                    f711l = new p();
                }
            }
        }
        return f711l;
    }

    private static Set<String> f() {
        return Collections.unmodifiableSet(new b());
    }

    static boolean g(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f709j.contains(str));
    }

    private void h(Context context, l.e.b bVar, Map<String, String> map, Exception exc, boolean z, l.d dVar) {
        o oVarB = e.b(context);
        if (oVarB == null) {
            return;
        }
        if (dVar == null) {
            oVarB.i("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z ? "1" : "0");
        oVarB.f(dVar.b(), map2, bVar, map, exc, dVar.n() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    private void l(Context context, l.d dVar) {
        o oVarB = e.b(context);
        if (oVarB == null || dVar == null) {
            return;
        }
        oVarB.h(dVar, dVar.n() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    private boolean p(Intent intent) {
        return com.facebook.r.f().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private void q(boolean z) {
        SharedPreferences.Editor editorEdit = this.c.edit();
        editorEdit.putBoolean("express_login_allowed", z);
        editorEdit.apply();
    }

    private void r(w wVar, l.d dVar) {
        l(wVar.a(), dVar);
        com.facebook.internal.e.d(com.facebook.internal.e.c.Login.a(), new c());
        if (s(wVar, dVar)) {
            return;
        }
        com.facebook.n nVar = new com.facebook.n("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        h(wVar.a(), l.e.b.ERROR, null, nVar, false, dVar);
        throw nVar;
    }

    private boolean s(w wVar, l.d dVar) {
        Intent intentD = d(dVar);
        if (!p(intentD)) {
            return false;
        }
        try {
            wVar.startActivityForResult(intentD, l.p());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private void t(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (g(str)) {
                throw new com.facebook.n(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", str));
            }
        }
    }

    protected l.d b(m mVar) {
        l.d dVar = new l.d(this.a, Collections.unmodifiableSet(mVar.b() != null ? new HashSet(mVar.b()) : new HashSet()), this.b, this.d, com.facebook.r.g(), UUID.randomUUID().toString(), this.f712g, mVar.a());
        dVar.t(com.facebook.a.o());
        dVar.r(this.e);
        dVar.u(this.f);
        dVar.q(this.f713h);
        dVar.v(this.f714i);
        return dVar;
    }

    protected Intent d(l.d dVar) {
        Intent intent = new Intent();
        intent.setClass(com.facebook.r.f(), FacebookActivity.class);
        intent.setAction(dVar.g().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", dVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public void i(Activity activity, m mVar) {
        if (activity instanceof androidx.activity.result.e) {
            Log.w(f710k, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        r(new d(activity), b(mVar));
    }

    public void j(Activity activity, Collection<String> collection) {
        t(collection);
        i(activity, new m(collection));
    }

    public void k() {
        com.facebook.a.r(null);
        com.facebook.f.b(null);
        b0.c(null);
        q(false);
    }

    boolean m(int i2, Intent intent) {
        return n(i2, intent, null);
    }

    boolean n(int i2, Intent intent, com.facebook.l<r> lVar) {
        l.e.b bVar;
        com.facebook.a aVar;
        com.facebook.f fVar;
        l.d dVar;
        Map<String, String> map;
        boolean z;
        Map<String, String> map2;
        l.d dVar2;
        com.facebook.f fVar2;
        boolean z2;
        l.e.b bVar2 = l.e.b.ERROR;
        com.facebook.n nVar = null;
        boolean z3 = false;
        if (intent != null) {
            l.e eVar = (l.e) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (eVar != null) {
                l.d dVar3 = eVar.f;
                l.e.b bVar3 = eVar.a;
                if (i2 == -1) {
                    if (bVar3 == l.e.b.SUCCESS) {
                        aVar = eVar.b;
                        fVar2 = eVar.c;
                    } else {
                        fVar2 = null;
                        nVar = new com.facebook.k(eVar.d);
                        aVar = null;
                    }
                } else if (i2 == 0) {
                    aVar = null;
                    fVar2 = null;
                    z3 = true;
                } else {
                    aVar = null;
                    fVar2 = null;
                }
                map2 = eVar.f707g;
                boolean z4 = z3;
                dVar2 = dVar3;
                bVar2 = bVar3;
                z2 = z4;
            } else {
                aVar = null;
                map2 = null;
                dVar2 = null;
                fVar2 = null;
                z2 = false;
            }
            map = map2;
            z = z2;
            fVar = fVar2;
            bVar = bVar2;
            dVar = dVar2;
        } else if (i2 == 0) {
            bVar = l.e.b.CANCEL;
            aVar = null;
            fVar = null;
            dVar = null;
            map = null;
            z = true;
        } else {
            bVar = bVar2;
            aVar = null;
            fVar = null;
            dVar = null;
            map = null;
            z = false;
        }
        if (nVar == null && aVar == null && !z) {
            nVar = new com.facebook.n("Unexpected call to LoginManager.onActivityResult");
        }
        com.facebook.n nVar2 = nVar;
        l.d dVar4 = dVar;
        h(null, bVar, map, nVar2, true, dVar4);
        c(aVar, fVar, dVar4, nVar2, z, lVar);
        return true;
    }

    public void o(com.facebook.j jVar, com.facebook.l<r> lVar) {
        if (!(jVar instanceof com.facebook.internal.e)) {
            throw new com.facebook.n("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.e) jVar).c(com.facebook.internal.e.c.Login.a(), new a(lVar));
    }
}
