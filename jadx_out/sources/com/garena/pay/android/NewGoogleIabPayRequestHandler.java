package com.garena.pay.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.q;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.n;
import com.android.billingclient.api.o;
import com.beetalk.sdk.networking.model.CommitResp;
import com.beetalk.sdk.p;
import com.garena.pay.android.data.GGPayment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class NewGoogleIabPayRequestHandler extends com.garena.pay.android.e implements j {
    private final transient Context b;
    private transient j c;
    private transient i.j<Boolean> d;
    private transient i.j<com.beetalk.sdk.u.j> e;
    private final GGBillingDataSource f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q<com.android.billingclient.api.h> f814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f818k;

    class a implements i.g<i.i<Boolean>, Boolean> {
        final /* synthetic */ i.f a;

        a(NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler, i.f fVar) {
            this.a = fVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(i.i<i.i<Boolean>> iVar) throws Exception {
            this.a.b();
            i.i<Boolean> iVarT = iVar.t();
            if (iVarT.x()) {
                Log.d("google-iab", "Failed to build connection: " + iVarT.s());
                throw iVarT.s();
            }
            if (iVarT.v()) {
                Log.d("google-iab", "Cancelled");
                throw new CancellationException();
            }
            if (iVarT.t().booleanValue()) {
                return Boolean.TRUE;
            }
            throw new Exception("Disconnected");
        }
    }

    class b implements q<com.android.billingclient.api.h> {
        b() {
        }

        @Override // androidx.lifecycle.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.android.billingclient.api.h hVar) {
            if (hVar == null) {
                return;
            }
            if (hVar.b() == -1) {
                NewGoogleIabPayRequestHandler.this.F();
            } else {
                NewGoogleIabPayRequestHandler.this.G(hVar);
            }
        }
    }

    class c implements i.g<Boolean, i.i<com.beetalk.sdk.u.j>> {
        c() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i.i<com.beetalk.sdk.u.j> a(i.i<Boolean> iVar) {
            if (iVar.x() || iVar.v() || !iVar.t().booleanValue()) {
                NewGoogleIabPayRequestHandler.this.e.f(iVar.s());
                NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler = NewGoogleIabPayRequestHandler.this;
                if (newGoogleIabPayRequestHandler.f815h != null && newGoogleIabPayRequestHandler.f816i != null) {
                    GGBillingDataSource gGBillingDataSource = newGoogleIabPayRequestHandler.f;
                    NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler2 = NewGoogleIabPayRequestHandler.this;
                    String str = newGoogleIabPayRequestHandler2.f817j;
                    String packageName = newGoogleIabPayRequestHandler2.b.getPackageName();
                    NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler3 = NewGoogleIabPayRequestHandler.this;
                    gGBillingDataSource.K(str, packageName, newGoogleIabPayRequestHandler3.f815h, newGoogleIabPayRequestHandler3.f816i);
                }
            }
            return NewGoogleIabPayRequestHandler.this.e.a();
        }
    }

    class d implements i.g<Boolean, i.i<Boolean>> {
        final /* synthetic */ Activity a;
        final /* synthetic */ String b;
        final /* synthetic */ com.garena.pay.android.d c;

        d(Activity activity, String str, com.garena.pay.android.d dVar) {
            this.a = activity;
            this.b = str;
            this.c = dVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i.i<Boolean> a(i.i<Boolean> iVar) {
            return NewGoogleIabPayRequestHandler.this.E(this.a, this.b, this.c);
        }
    }

    class e implements i.g<Boolean, Void> {
        final /* synthetic */ String a;
        final /* synthetic */ i.j b;
        final /* synthetic */ com.garena.pay.android.d c;
        final /* synthetic */ Activity d;

        class a implements o {
            a() {
            }

            @Override // com.android.billingclient.api.o
            public void onSkuDetailsResponse(com.android.billingclient.api.h hVar, List<SkuDetails> list) {
                String strA;
                Boolean bool = Boolean.FALSE;
                int iB = hVar.b();
                Log.w("google-iab", "querySkuDetailsAsync, responseCode = " + iB + ", skuDetailsList = " + list);
                if (iB == 0) {
                    if (list == null || list.size() != 1) {
                        Log.e("google-iab", hVar.a());
                        e.this.b.d(bool);
                        return;
                    }
                    SkuDetails skuDetails = list.get(0);
                    com.android.billingclient.api.g.a aVarA = com.android.billingclient.api.g.a();
                    aVarA.e(skuDetails);
                    com.beetalk.sdk.g gVarY = com.beetalk.sdk.g.y();
                    if (gVarY == null || TextUtils.isEmpty(gVarY.C())) {
                        strA = "No session found";
                    } else {
                        String str = gVarY.C() + NewGoogleIabPayRequestHandler.this.b.getPackageName();
                        String strF = com.beetalk.sdk.x.i.f(str);
                        String str2 = NewGoogleIabPayRequestHandler.this.f815h + "#" + NewGoogleIabPayRequestHandler.this.f816i;
                        if (p.p() == p.c.TEST) {
                            Log.d("google-iab", "Original key: " + str + ", Account ID: " + strF);
                        }
                        aVarA.c(strF);
                        aVarA.d(str2);
                        aVarA.b(e.this.c.c().isOfferPersonalized());
                        com.android.billingclient.api.h hVarA = NewGoogleIabPayRequestHandler.this.f.A(e.this.d, aVarA.a());
                        if (hVarA != null && hVarA.b() == 0) {
                            e.this.b.d(Boolean.TRUE);
                            return;
                        } else if (hVarA != null) {
                            Log.w("google-iab", "onSkuDetailsResponse, res.getResponseCode() = " + hVarA.b());
                        }
                    }
                    e.this.b.d(bool);
                }
                strA = hVar.a();
                Log.e("google-iab", strA);
                e.this.b.d(bool);
            }
        }

        e(String str, i.j jVar, com.garena.pay.android.d dVar, Activity activity) {
            this.a = str;
            this.b = jVar;
            this.c = dVar;
            this.d = activity;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<Boolean> iVar) {
            String str = (iVar.x() || iVar.v() || !iVar.t().booleanValue()) ? "inapp" : "subs";
            n.a aVarC = n.c();
            aVarC.b(Collections.singletonList(this.a));
            aVarC.c(str);
            if (NewGoogleIabPayRequestHandler.this.f.H(aVarC.a(), new a()) || this.b.a().w()) {
                return null;
            }
            this.b.d(Boolean.FALSE);
            return null;
        }
    }

    class f implements i.g<List<SkuDetails>, Boolean> {
        final /* synthetic */ String a;

        f(NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler, String str) {
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

    class g implements i.g<Boolean, i.i<List<Pair<Purchase, CommitResp>>>> {
        g() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i.i<List<Pair<Purchase, CommitResp>>> a(i.i<Boolean> iVar) {
            return NewGoogleIabPayRequestHandler.this.f.E();
        }
    }

    class h implements i.g<Boolean, i.i<List<SkuDetails>>> {
        final /* synthetic */ List a;
        final /* synthetic */ List b;

        class a implements i.g<List<List<SkuDetails>>, List<SkuDetails>> {
            a(h hVar) {
            }

            @Override // i.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public List<SkuDetails> a(i.i<List<List<SkuDetails>>> iVar) {
                if (iVar.x() || iVar.v() || iVar.t() == null) {
                    return null;
                }
                List<List<SkuDetails>> listT = iVar.t();
                ArrayList arrayList = new ArrayList();
                Iterator<List<SkuDetails>> it = listT.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(it.next());
                }
                return arrayList;
            }
        }

        h(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i.i<List<SkuDetails>> a(i.i<Boolean> iVar) {
            return i.i.I(Arrays.asList(NewGoogleIabPayRequestHandler.this.J("inapp", this.a), NewGoogleIabPayRequestHandler.this.J("subs", this.b))).i(new a(this));
        }
    }

    class i implements o {
        final /* synthetic */ i.j a;

        i(NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler, i.j jVar) {
            this.a = jVar;
        }

        @Override // com.android.billingclient.api.o
        public void onSkuDetailsResponse(com.android.billingclient.api.h hVar, List<SkuDetails> list) {
            i.j jVar;
            if (hVar.b() == 0) {
                jVar = this.a;
            } else {
                Log.e("google-iab", hVar.a());
                jVar = this.a;
                list = null;
            }
            jVar.d(list);
        }
    }

    NewGoogleIabPayRequestHandler(Context context) {
        this(context, null, null);
    }

    NewGoogleIabPayRequestHandler(Context context, Integer num, Integer num2) {
        this.b = context;
        this.f815h = num;
        this.f816i = num2;
        GGBillingDataSource gGBillingDataSourceU = GGBillingDataSource.u((Application) context.getApplicationContext());
        this.f = gGBillingDataSourceU;
        b bVar = new b();
        this.f814g = bVar;
        gGBillingDataSourceU.t().i(bVar);
        y(context);
    }

    private i.i<Boolean> A() {
        Log.d("google-iab", "connectToPlayBillingService");
        i.j<Boolean> jVar = this.d;
        if (jVar == null || jVar.a().w()) {
            this.d = new i.j<>();
            com.android.billingclient.api.h hVarF = this.f.t().f();
            if (hVarF != null && hVarF.b() == 0) {
                this.d.d(Boolean.TRUE);
            }
        }
        return this.d.a();
    }

    private i.i<Boolean> B() {
        i.f fVar = new i.f();
        return i.i.J(Arrays.asList(com.garena.pay.android.j.d.e(10L, TimeUnit.SECONDS, fVar), A())).j(new a(this, fVar), i.i.f1903k);
    }

    private i.i<Boolean> D(String str) {
        GGPayment.Denomination denomination;
        GGPayment.PaymentChannel paymentChannelL = l();
        if ("9999".equals(str) || "android.test.purchased".equals(str)) {
            return i.i.r(Boolean.FALSE);
        }
        return (paymentChannelL == null || (denomination = paymentChannelL.getDenomination(str)) == null) ? J("subs", Collections.singletonList(str)).i(new f(this, str)) : i.i.r(Boolean.valueOf(denomination.isSubscription()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i.i<Boolean> E(Activity activity, String str, com.garena.pay.android.d dVar) {
        Log.d("google-iab", "launchBillingFlow, productId = " + str);
        i.j jVar = new i.j();
        if (TextUtils.isEmpty(str)) {
            jVar.d(Boolean.FALSE);
        } else {
            if (str.equals("9999")) {
                str = "android.test.purchased";
            }
            String str2 = str;
            D(str2).j(new e(str2, jVar, dVar, activity), i.i.f1903k);
        }
        return jVar.a();
    }

    private void H(Purchase purchase, CommitResp commitResp) {
        Intent intent = new Intent();
        intent.putExtra("app_point_amount", commitResp.getAppPointAmount());
        String currentCommitTxnId = commitResp.getCurrentCommitTxnId();
        if (TextUtils.isEmpty(currentCommitTxnId)) {
            currentCommitTxnId = purchase.b();
        }
        intent.putExtra("txn_id", currentCommitTxnId);
        intent.putExtra("item_name", commitResp.getItemName());
        intent.putExtra("rebate_card_id", commitResp.getRebateCardId());
        intent.putExtra("remaining_days", commitResp.getRemainingDays());
        intent.putExtra("quantity", purchase.f());
        i.j<com.beetalk.sdk.u.j> jVar = this.e;
        if (jVar != null) {
            jVar.g(com.beetalk.sdk.u.j.b(null, com.garena.pay.android.j.d.a(intent.getExtras())));
            if (this.f815h == null || this.f816i == null) {
                return;
            }
            this.f.K(this.f817j, this.b.getPackageName(), this.f815h, this.f816i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i.i<List<SkuDetails>> J(String str, List<String> list) {
        i.j jVar = new i.j();
        n.a aVarC = n.c();
        aVarC.b(list);
        aVarC.c(str);
        if (!this.f.H(aVarC.a(), new i(this, jVar)) && !jVar.a().w()) {
            jVar.d(null);
        }
        return jVar.a();
    }

    private void L(boolean z, Exception exc) {
        i.j<Boolean> jVar = this.d;
        if (jVar == null || jVar.a().w()) {
            this.d = new i.j<>();
        }
        if (exc != null) {
            this.d.c(exc);
        } else {
            this.d.d(Boolean.valueOf(z));
        }
    }

    private void y(Context context) {
        if (context instanceof androidx.fragment.app.e) {
            final androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            this.c = new androidx.lifecycle.c() { // from class: com.garena.pay.android.NewGoogleIabPayRequestHandler.2
                @Override // androidx.lifecycle.e
                public /* synthetic */ void a(k kVar) {
                    androidx.lifecycle.b.d(this, kVar);
                }

                @Override // androidx.lifecycle.e
                public void b(k kVar) {
                    Log.d("google-iab", "Activity is destroyed, start to release resource.");
                    eVar.a().c(NewGoogleIabPayRequestHandler.this.c);
                    NewGoogleIabPayRequestHandler.this.c = null;
                    NewGoogleIabPayRequestHandler.this.n();
                }

                @Override // androidx.lifecycle.e
                public /* synthetic */ void c(k kVar) {
                    androidx.lifecycle.b.a(this, kVar);
                }

                @Override // androidx.lifecycle.e
                public /* synthetic */ void e(k kVar) {
                    androidx.lifecycle.b.c(this, kVar);
                }

                @Override // androidx.lifecycle.e
                public /* synthetic */ void f(k kVar) {
                    androidx.lifecycle.b.e(this, kVar);
                }

                @Override // androidx.lifecycle.e
                public /* synthetic */ void g(k kVar) {
                    androidx.lifecycle.b.f(this, kVar);
                }
            };
            eVar.a().a(this.c);
        }
    }

    i.i<List<Pair<Purchase, CommitResp>>> C() {
        return B().A(new g());
    }

    public void F() {
        Log.d("google-iab", "onBillingServiceDisconnected, reconnecting");
    }

    public void G(com.android.billingclient.api.h hVar) {
        int iB = hVar.b();
        if (iB == 0) {
            Log.d("google-iab", "onBillingSetupFinished successfully");
            L(true, null);
        } else if (iB == 3) {
            Log.d("google-iab", hVar.a());
            L(false, null);
        } else {
            Log.d("google-iab", hVar.a());
            L(false, new Exception(hVar.a()));
        }
    }

    public void I(List<Pair<Purchase, CommitResp>> list) {
        String message;
        com.garena.pay.android.b bVar;
        com.garena.pay.android.b bVar2;
        String str;
        for (Pair<Purchase, CommitResp> pair : list) {
            Purchase purchase = (Purchase) pair.first;
            CommitResp commitResp = (CommitResp) pair.second;
            ArrayList<String> arrayListH = purchase.h();
            boolean z = false;
            boolean zEquals = arrayListH.get(0).equals(this.f818k);
            boolean z2 = "android.test.purchased".equals(arrayListH.get(0)) && "9999".equals(this.f818k);
            if (zEquals || z2) {
                z = true;
            }
            if (z) {
                this.f818k = null;
                if (commitResp != null && com.beetalk.sdk.z.f.ERR_SUBS_BINDING.c() == commitResp.getResultCode()) {
                    message = commitResp.getMessage();
                    bVar = com.garena.pay.android.b.PAYMENT_ERROR_SUBSCRIPTION_BINDING;
                } else if (commitResp != null && com.beetalk.sdk.z.f.PENDING_TRANSACTION.c() == commitResp.getResultCode()) {
                    message = commitResp.getMessage();
                    bVar = com.garena.pay.android.b.PAYMENT_ERROR_PENDING_TRANSACTION;
                } else {
                    if (commitResp != null && !commitResp.isError()) {
                        if (purchase.d() == 2) {
                            bVar2 = com.garena.pay.android.b.PAYMENT_ERROR_PENDING_TRANSACTION;
                            str = "Pending transaction";
                        } else if (purchase.d() == 1) {
                            H(purchase, commitResp);
                            return;
                        } else {
                            bVar2 = com.garena.pay.android.b.PAYMENT_GENERAL_ERROR;
                            str = "Purchase state is incorrect.";
                        }
                        z(str, bVar2);
                        return;
                    }
                    message = commitResp != null ? commitResp.getMessage() : "Failed to commit";
                    bVar = com.garena.pay.android.b.PAYMENT_GENERAL_ERROR;
                }
                z(message, bVar);
                return;
            }
        }
        z("", com.garena.pay.android.b.PAYMENT_GENERAL_ERROR);
    }

    i.i<List<SkuDetails>> K(List<String> list, List<String> list2) {
        return B().A(new h(list, list2));
    }

    @Override // com.garena.pay.android.e
    public String i(Context context) {
        return context.getResources().getString(j.c.b.g.f);
    }

    @Override // com.garena.pay.android.e
    public int k() {
        return j.c.b.d.b;
    }

    @Override // com.garena.pay.android.e
    void n() {
        Log.d("google-iab", "onDestroy");
        i.j<Boolean> jVar = this.d;
        if (jVar != null) {
            jVar.e();
        }
        i.j<com.beetalk.sdk.u.j> jVar2 = this.e;
        if (jVar2 != null) {
            jVar2.e();
            if (this.f815h != null && this.f816i != null) {
                this.f.K(this.f817j, this.b.getPackageName(), this.f815h, this.f816i);
            }
        }
        this.f.t().m(this.f814g);
    }

    @Override // com.garena.pay.android.e
    i.i<com.beetalk.sdk.u.j> q(Activity activity, com.garena.pay.android.d dVar, String str, i.g<Boolean, Boolean> gVar) {
        i.j<com.beetalk.sdk.u.j> jVar = this.e;
        if (jVar != null && !jVar.a().w()) {
            return this.e.a();
        }
        this.e = new i.j<>();
        if (!TextUtils.isEmpty(this.f818k)) {
            this.e.c(new Exception("Processing another product."));
            return this.e.a();
        }
        if (this.f815h != null && this.f816i != null) {
            String strC = com.beetalk.sdk.g.y().C();
            this.f817j = strC;
            this.f.I(strC, this.b.getPackageName(), this.f815h, this.f816i, this);
        }
        this.f818k = str;
        i.i<Boolean> iVarB = B();
        d dVar2 = new d(activity, str, dVar);
        Executor executor = i.i.f1903k;
        return iVarB.B(dVar2, executor).j(gVar, executor).m(new c(), executor);
    }

    public void z(String str, com.garena.pay.android.b bVar) {
        i.j<com.beetalk.sdk.u.j> jVar = this.e;
        if (jVar != null) {
            if (jVar.a().w()) {
                Log.w("google-iab", "Wrong state.");
            }
            this.e.g(com.beetalk.sdk.u.j.a(null, bVar, str));
            if (this.f815h == null || this.f816i == null) {
                return;
            }
            this.f.K(this.f817j, this.b.getPackageName(), this.f815h, this.f816i);
        }
    }
}
