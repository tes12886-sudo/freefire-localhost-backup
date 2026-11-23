package com.garena.pay.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.p;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.m;
import com.android.billingclient.api.n;
import com.android.billingclient.api.o;
import com.beetalk.sdk.networking.model.CommitResp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class GGBillingDataSource implements androidx.lifecycle.j, m, com.android.billingclient.api.f, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f811g = "Garena MSDK:" + GGBillingDataSource.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Handler f812h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile GGBillingDataSource f813i;
    private final p<com.android.billingclient.api.h> a;
    private final p<String> b;
    private final Application c;
    Map<String, NewGoogleIabPayRequestHandler> d;
    private final com.android.billingclient.api.d e;
    private long f;

    class a implements com.android.billingclient.api.l {
        final /* synthetic */ i.j a;

        a(GGBillingDataSource gGBillingDataSource, i.j jVar) {
            this.a = jVar;
        }

        @Override // com.android.billingclient.api.l
        public void a(com.android.billingclient.api.h hVar, List<Purchase> list) {
            this.a.d(list);
        }
    }

    class b implements i.g<Set<Purchase>, i.i<List<Pair<Purchase, CommitResp>>>> {
        b() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i.i<List<Pair<Purchase, CommitResp>>> a(i.i<Set<Purchase>> iVar) {
            return GGBillingDataSource.this.D(iVar.t());
        }
    }

    class c implements i.g<Void, Set<Purchase>> {
        final /* synthetic */ ArrayList a;

        c(GGBillingDataSource gGBillingDataSource, ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set<Purchase> a(i.i<Void> iVar) {
            HashSet hashSet = new HashSet();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                List list = (List) ((i.i) it.next()).t();
                if (list != null) {
                    hashSet.addAll(list);
                }
            }
            return hashSet;
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GGBillingDataSource.this.e.h(GGBillingDataSource.this);
        }
    }

    class e implements i.g<CommitResp, CommitResp> {
        e(GGBillingDataSource gGBillingDataSource) {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommitResp a(i.i<CommitResp> iVar) {
            if (iVar.x() || iVar.v()) {
                return null;
            }
            return iVar.t();
        }
    }

    class f implements i.g<CommitResp, i.i<Pair<Purchase, CommitResp>>> {
        final /* synthetic */ Purchase a;
        final /* synthetic */ Context b;

        class a implements i.g<Boolean, i.i<Pair<Purchase, CommitResp>>> {
            final /* synthetic */ CommitResp a;

            a(CommitResp commitResp) {
                this.a = commitResp;
            }

            @Override // i.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i.i<Pair<Purchase, CommitResp>> a(i.i<Boolean> iVar) {
                if (!iVar.x() && !iVar.v() && iVar.w() && iVar.t().booleanValue() && !this.a.isError()) {
                    Log.d(GGBillingDataSource.f811g, "no commitResp.isError(), before cache, result code = " + this.a.getResultCode());
                    f fVar = f.this;
                    com.beetalk.sdk.t.d.a(fVar.b, fVar.a);
                }
                return i.i.r(new Pair(f.this.a, this.a));
            }
        }

        class b implements i.g<Boolean, i.i<Boolean>> {
            b() {
            }

            @Override // i.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i.i<Boolean> a(i.i<Boolean> iVar) {
                if (iVar.x() || iVar.v() || !iVar.t().booleanValue()) {
                    f fVar = f.this;
                    return GGBillingDataSource.this.s(fVar.a);
                }
                f fVar2 = f.this;
                return GGBillingDataSource.this.q(fVar2.a);
            }
        }

        f(Purchase purchase, Context context) {
            this.a = purchase;
            this.b = context;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i.i<Pair<Purchase, CommitResp>> a(i.i<CommitResp> iVar) {
            CommitResp commitRespT = iVar.t();
            i.i<Pair<Purchase, CommitResp>> iVarR = i.i.r(new Pair(this.a, commitRespT));
            boolean z = false;
            boolean z2 = this.a.d() == 1;
            boolean z3 = (commitRespT == null || commitRespT.isError()) ? false : true;
            if (commitRespT != null && com.beetalk.sdk.z.f.PENDING_TRANSACTION.c() == commitRespT.getResultCode()) {
                z = true;
            }
            String str = GGBillingDataSource.f811g;
            StringBuilder sb = new StringBuilder();
            sb.append("after doCommit, isPurchased = ");
            sb.append(z2);
            sb.append(", isNormal = ");
            sb.append(z3);
            sb.append(", isPending = ");
            sb.append(z);
            sb.append(", rstCode = ");
            sb.append(commitRespT != null ? Integer.valueOf(commitRespT.getResultCode()) : "null");
            Log.d(str, sb.toString());
            if (z2 && z3) {
                return GGBillingDataSource.this.x(this.a).l(new b()).l(new a(commitRespT));
            }
            if (!z) {
                return iVarR;
            }
            com.beetalk.sdk.t.f.a(this.b).e(this.b, this.a.e());
            return iVarR;
        }
    }

    class g implements com.android.billingclient.api.j {
        final /* synthetic */ i.j a;

        g(GGBillingDataSource gGBillingDataSource, i.j jVar) {
            this.a = jVar;
        }

        @Override // com.android.billingclient.api.j
        public void a(com.android.billingclient.api.h hVar, String str) {
            i.j jVar;
            Boolean bool;
            if (hVar.b() == 0) {
                jVar = this.a;
                bool = Boolean.TRUE;
            } else {
                Log.w(GGBillingDataSource.f811g, "Consume response is: " + hVar.a());
                jVar = this.a;
                bool = Boolean.FALSE;
            }
            jVar.d(bool);
        }
    }

    class h implements com.android.billingclient.api.c {
        final /* synthetic */ i.j a;

        h(GGBillingDataSource gGBillingDataSource, i.j jVar) {
            this.a = jVar;
        }

        @Override // com.android.billingclient.api.c
        public void a(com.android.billingclient.api.h hVar) {
            i.j jVar;
            Boolean bool;
            if (hVar.b() == 0) {
                jVar = this.a;
                bool = Boolean.TRUE;
            } else {
                Log.w(GGBillingDataSource.f811g, "Acknowledge response is: " + hVar.a());
                jVar = this.a;
                bool = Boolean.FALSE;
            }
            jVar.d(bool);
        }
    }

    class i implements i.g<List<SkuDetails>, Boolean> {
        final /* synthetic */ String a;

        i(GGBillingDataSource gGBillingDataSource, String str) {
            this.a = str;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(i.i<List<SkuDetails>> iVar) {
            Boolean bool = Boolean.FALSE;
            if (!iVar.x() && !iVar.v() && iVar.t() != null) {
                Iterator<SkuDetails> it = iVar.t().iterator();
                while (it.hasNext()) {
                    if (this.a.equals(it.next().c())) {
                        return Boolean.TRUE;
                    }
                }
            }
            return bool;
        }
    }

    class j implements o {
        final /* synthetic */ i.j a;

        j(GGBillingDataSource gGBillingDataSource, i.j jVar) {
            this.a = jVar;
        }

        @Override // com.android.billingclient.api.o
        public void onSkuDetailsResponse(com.android.billingclient.api.h hVar, List<SkuDetails> list) {
            i.j jVar;
            if (hVar.b() == 0) {
                jVar = this.a;
            } else {
                Log.e(GGBillingDataSource.f811g, hVar.a());
                jVar = this.a;
                list = null;
            }
            jVar.d(list);
        }
    }

    class k implements i.g<Void, List<Pair<Purchase, CommitResp>>> {
        final /* synthetic */ ArrayList a;

        k(GGBillingDataSource gGBillingDataSource, ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<Pair<Purchase, CommitResp>> a(i.i<Void> iVar) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                arrayList.add((Pair) ((i.i) it.next()).t());
            }
            return arrayList;
        }
    }

    class l implements i.g<List<Pair<Purchase, CommitResp>>, List<Pair<Purchase, CommitResp>>> {
        l() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<Pair<Purchase, CommitResp>> a(i.i<List<Pair<Purchase, CommitResp>>> iVar) {
            if (!iVar.x() && !iVar.v() && iVar.t() != null) {
                List<Pair<Purchase, CommitResp>> listT = iVar.t();
                for (Map.Entry<String, NewGoogleIabPayRequestHandler> entry : GGBillingDataSource.this.d.entrySet()) {
                    if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                        entry.getValue().I(listT);
                    }
                }
            }
            return null;
        }
    }

    private GGBillingDataSource(Application application) {
        p<com.android.billingclient.api.h> pVar = new p<>();
        this.a = pVar;
        p<String> pVar2 = new p<>();
        this.b = pVar2;
        this.d = new HashMap();
        this.f = 1000L;
        this.c = application;
        com.android.billingclient.api.d.a aVarE = com.android.billingclient.api.d.e(application);
        aVarE.c(this);
        aVarE.b();
        com.android.billingclient.api.d dVarA = aVarE.a();
        this.e = dVarA;
        pVar.n(null);
        dVarA.h(this);
        pVar2.n(null);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    private i.i<Pair<Purchase, CommitResp>> B(Purchase purchase) {
        int i2;
        String str;
        com.beetalk.sdk.g gVarY = com.beetalk.sdk.g.y();
        if (gVarY == null || TextUtils.isEmpty(gVarY.C())) {
            return null;
        }
        int i3 = 0;
        String str2 = purchase.h().get(0);
        Context applicationContext = this.c.getApplicationContext();
        if (!"android.test.purchased".equals(str2) && !"9999".equals(str2)) {
            String strF = com.beetalk.sdk.x.i.f(gVarY.C() + applicationContext.getPackageName());
            com.android.billingclient.api.a aVarA = purchase.a();
            if (strF != null && aVarA != null) {
                String strA = aVarA.a();
                String strB = aVarA.b();
                if (strA != null && strB != null) {
                    Log.i(f811g, strA + " " + strB);
                    if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strB)) {
                        String strF2 = this.b.f();
                        if (strF2 == null) {
                            return null;
                        }
                        String[] strArrSplit = strF2.split("#", 4);
                        if (strArrSplit.length == 4 && gVarY.C().equals(strArrSplit[0]) && applicationContext.getPackageName().equals(strArrSplit[1])) {
                            i3 = Integer.parseInt(strArrSplit[2]);
                            str = strArrSplit[3];
                        }
                    } else {
                        if (!strF.equals(strA)) {
                            return null;
                        }
                        String[] strArrSplit2 = strB.split("#", 2);
                        if (strArrSplit2.length == 2) {
                            i3 = Integer.parseInt(strArrSplit2[0]);
                            str = strArrSplit2[1];
                        } else {
                            i2 = 0;
                        }
                    }
                    i2 = Integer.parseInt(str);
                }
            }
            return null;
        }
        i2 = 0;
        return r(purchase, i3, i2).l(new f(purchase, applicationContext));
    }

    private i.g<List<Pair<Purchase, CommitResp>>, List<Pair<Purchase, CommitResp>>> C() {
        return new l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i.i<List<Pair<Purchase, CommitResp>>> D(Collection<Purchase> collection) {
        ArrayList arrayList = new ArrayList();
        Context applicationContext = this.c.getApplicationContext();
        for (Purchase purchase : collection) {
            if (!com.beetalk.sdk.t.d.e(applicationContext, purchase)) {
                if (!(purchase.d() == 2) || com.beetalk.sdk.t.f.a(applicationContext).d(applicationContext, purchase.e())) {
                    i.i<Pair<Purchase, CommitResp>> iVarB = B(purchase);
                    if (iVarB != null) {
                        arrayList.add(iVarB);
                    }
                }
            }
        }
        return i.i.H(arrayList).i(new k(this, arrayList));
    }

    private i.i<List<SkuDetails>> G(String str, List<String> list) {
        i.j jVar = new i.j();
        n.a aVarC = n.c();
        aVarC.b(list);
        aVarC.c(str);
        if (!H(aVarC.a(), new j(this, jVar)) && !jVar.a().w()) {
            jVar.d(null);
        }
        return jVar.a();
    }

    private void J() {
        f812h.postDelayed(new d(), this.f);
        this.f = Math.min(this.f * 2, 900000L);
    }

    private void o(String str, com.garena.pay.android.b bVar) {
        for (Map.Entry<String, NewGoogleIabPayRequestHandler> entry : this.d.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                entry.getValue().z(str, bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i.i<Boolean> q(Purchase purchase) {
        i.j jVar = new i.j();
        if (purchase.i()) {
            jVar.d(Boolean.TRUE);
            return jVar.a();
        }
        com.android.billingclient.api.b.a aVarB = com.android.billingclient.api.b.b();
        aVarB.b(purchase.e());
        if (!n(aVarB.a(), new h(this, jVar)) && !jVar.a().w()) {
            jVar.d(Boolean.FALSE);
        }
        return jVar.a();
    }

    private i.i<CommitResp> r(Purchase purchase, int i2, int i3) {
        return com.beetalk.sdk.z.i.c.a(this.c.getApplicationContext(), purchase, i2, i3).i(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i.i<Boolean> s(Purchase purchase) {
        i.j jVar = new i.j();
        com.android.billingclient.api.i.a aVarB = com.android.billingclient.api.i.b();
        aVarB.b(purchase.e());
        if (!p(aVarB.a(), new g(this, jVar)) && !jVar.a().w()) {
            jVar.d(Boolean.FALSE);
        }
        return jVar.a();
    }

    public static GGBillingDataSource u(Application application) {
        if (f813i == null) {
            synchronized (GGBillingDataSource.class) {
                if (f813i == null) {
                    f813i = new GGBillingDataSource(application);
                }
            }
        }
        return f813i;
    }

    private i.i<List<Purchase>> v(String str) {
        i.j jVar = new i.j();
        if (!F(str, new a(this, jVar)) && !jVar.a().w()) {
            jVar.d(null);
        }
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i.i<Boolean> x(Purchase purchase) {
        return purchase == null ? i.i.r(Boolean.FALSE) : y(purchase.h().get(0));
    }

    private i.i<Boolean> y(String str) {
        return ("9999".equals(str) || "android.test.purchased".equals(str)) ? i.i.r(Boolean.FALSE) : G("subs", Collections.singletonList(str)).i(new i(this, str));
    }

    private boolean z() {
        com.android.billingclient.api.h hVarW = w("subscriptions");
        if (hVarW != null) {
            if (hVarW.b() == 0) {
                return true;
            }
            Log.w(f811g, "isSubscriptionSupported() error: " + hVarW.a());
        }
        return false;
    }

    public com.android.billingclient.api.h A(Activity activity, com.android.billingclient.api.g gVar) {
        com.android.billingclient.api.h hVarF = this.a.f();
        if (hVarF != null && hVarF.b() == 0) {
            return this.e.d(activity, gVar);
        }
        Log.e(f811g, "launchBillingFlow: billingSetupIncomplete");
        return null;
    }

    public i.i<List<Pair<Purchase, CommitResp>>> E() {
        Log.d(f811g, "queryPurchasesAsync called");
        ArrayList arrayList = new ArrayList();
        arrayList.add(v("inapp"));
        if (z()) {
            arrayList.add(v("subs"));
        }
        return i.i.H(arrayList).i(new c(this, arrayList)).A(new b());
    }

    public boolean F(String str, com.android.billingclient.api.l lVar) {
        com.android.billingclient.api.h hVarF = this.a.f();
        if (hVarF == null || hVarF.b() != 0) {
            Log.e(f811g, "queryPurchasesAsync: billingSetupIncomplete");
            return false;
        }
        this.e.f(str, lVar);
        return true;
    }

    public boolean H(n nVar, o oVar) {
        com.android.billingclient.api.h hVarF = this.a.f();
        if (hVarF == null || hVarF.b() != 0) {
            Log.e(f811g, "querySkuDetailsAsync: billingSetupIncomplete");
            return false;
        }
        this.e.g(nVar, oVar);
        return true;
    }

    public void I(String str, String str2, Integer num, Integer num2, NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler) {
        String str3 = str + "#" + str2 + "#" + num + "#" + num2;
        this.d.remove(str3);
        this.d.put(str3, newGoogleIabPayRequestHandler);
        Log.i(f811g, "Google Handler added: " + str3);
        this.b.l(str3);
    }

    public void K(String str, String str2, Integer num, Integer num2) {
        String str3 = str + "#" + str2 + "#" + num + "#" + num2;
        this.d.remove(str3);
        Log.i(f811g, "Google Handler removed: " + str3);
    }

    public boolean n(com.android.billingclient.api.b bVar, com.android.billingclient.api.c cVar) {
        com.android.billingclient.api.h hVarF = this.a.f();
        if (hVarF == null || hVarF.b() != 0) {
            Log.e(f811g, "acknowledgePurchase: billingSetupIncomplete");
            return false;
        }
        this.e.a(bVar, cVar);
        return true;
    }

    @Override // com.android.billingclient.api.f
    public void onBillingServiceDisconnected() {
        Log.d(f811g, "onBillingServiceDisconnected, retrying");
        p<com.android.billingclient.api.h> pVar = this.a;
        com.android.billingclient.api.h.a aVarC = com.android.billingclient.api.h.c();
        aVarC.c(-1);
        pVar.l(aVarC.a());
        J();
    }

    @Override // com.android.billingclient.api.f
    public void onBillingSetupFinished(com.android.billingclient.api.h hVar) {
        int iB = hVar.b();
        String strA = hVar.a();
        Log.d(f811g, "onBillingSetupFinished: " + iB + " " + strA);
        this.a.l(hVar);
        if (iB == 0) {
            this.f = 1000L;
        } else {
            J();
        }
    }

    @Override // com.android.billingclient.api.m
    public void onPurchasesUpdated(com.android.billingclient.api.h hVar, List<Purchase> list) {
        com.garena.pay.android.b bVar;
        String str;
        i.i<List<Pair<Purchase, CommitResp>>> iVarE;
        int iB = hVar.b();
        String str2 = f811g;
        Log.i(str2, "Billing Result: " + iB);
        if (iB == 0) {
            if (list == null) {
                return;
            } else {
                iVarE = D(new HashSet(list));
            }
        } else {
            if (iB != 7) {
                Log.i(str2, hVar.a());
                if (iB == 1) {
                    bVar = com.garena.pay.android.b.PAYMENT_USER_CANCELLED;
                    str = "User cancelled payment";
                } else {
                    bVar = com.garena.pay.android.b.ERROR;
                    str = "Error Recd.";
                }
                o(str, bVar);
                return;
            }
            Log.d(str2, hVar.a());
            iVarE = E();
        }
        iVarE.j(C(), i.i.f1903k);
    }

    public boolean p(com.android.billingclient.api.i iVar, com.android.billingclient.api.j jVar) {
        com.android.billingclient.api.h hVarF = this.a.f();
        if (hVarF == null || hVarF.b() != 0) {
            Log.e(f811g, "consumeAsync: billingSetupIncomplete");
            return false;
        }
        this.e.b(iVar, jVar);
        return true;
    }

    public LiveData<com.android.billingclient.api.h> t() {
        return this.a;
    }

    public com.android.billingclient.api.h w(String str) {
        com.android.billingclient.api.h hVarF = this.a.f();
        if (hVarF != null && hVarF.b() == 0) {
            return this.e.c(str);
        }
        Log.e(f811g, "isFeatureSupported: billingSetupIncomplete");
        return null;
    }
}
