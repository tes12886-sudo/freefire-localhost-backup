package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class e extends d {
    private volatile int a;
    private final String b;
    private final Handler c;
    private volatile y0 d;
    private Context e;
    private volatile j.d.a.c.f.h.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile b0 f456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f464o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private ExecutorService v;

    private e(Context context, boolean z, m mVar, String str, String str2, t0 t0Var) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.f459j = 0;
        this.b = str;
        i(context, mVar, z, null);
    }

    e(String str, boolean z, Context context, l0 l0Var) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.f459j = 0;
        this.b = s();
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.d = new y0(applicationContext, null);
        this.t = z;
    }

    e(String str, boolean z, Context context, m mVar, t0 t0Var) {
        this(context, z, mVar, s(), null, null);
    }

    static /* bridge */ /* synthetic */ m0 B(e eVar, String str) {
        j.d.a.c.f.h.k.l("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleG = j.d.a.c.f.h.k.g(eVar.f462m, eVar.t, eVar.b);
        String string = null;
        do {
            try {
                Bundle bundleG0 = eVar.f462m ? eVar.f.G0(9, eVar.e.getPackageName(), str, string, bundleG) : eVar.f.z0(3, eVar.e.getPackageName(), str, string);
                h hVarA = n0.a(bundleG0, "BillingClient", "getPurchase()");
                if (hVarA != i0.f470k) {
                    return new m0(hVarA, null);
                }
                ArrayList<String> stringArrayList = bundleG0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleG0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleG0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str2 = stringArrayList2.get(i2);
                    String str3 = stringArrayList3.get(i2);
                    j.d.a.c.f.h.k.l("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.e())) {
                            j.d.a.c.f.h.k.m("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        j.d.a.c.f.h.k.n("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new m0(i0.f469j, null);
                    }
                }
                string = bundleG0.getString("INAPP_CONTINUATION_TOKEN");
                j.d.a.c.f.h.k.l("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (Exception e2) {
                j.d.a.c.f.h.k.n("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new m0(i0.f471l, null);
            }
        } while (!TextUtils.isEmpty(string));
        return new m0(i0.f470k, arrayList);
    }

    private void i(Context context, m mVar, boolean z, t0 t0Var) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.d = new y0(applicationContext, mVar, t0Var);
        this.t = z;
        this.u = t0Var != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler p() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    private final h q(final h hVar) {
        if (Thread.interrupted()) {
            return hVar;
        }
        this.c.post(new Runnable() { // from class: com.android.billingclient.api.v
            @Override // java.lang.Runnable
            public final void run() {
                this.a.o(hVar);
            }
        });
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h r() {
        return (this.a == 0 || this.a == 3) ? i0.f471l : i0.f469j;
    }

    @SuppressLint({"PrivateApi"})
    private static String s() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "5.0.0";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future t(Callable callable, long j2, final Runnable runnable, Handler handler) {
        double d = j2;
        Double.isNaN(d);
        long j3 = (long) (d * 0.95d);
        if (this.v == null) {
            this.v = Executors.newFixedThreadPool(j.d.a.c.f.h.k.a, new x(this));
        }
        try {
            final Future futureSubmit = this.v.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.u
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    j.d.a.c.f.h.k.m("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j3);
            return futureSubmit;
        } catch (Exception e) {
            j.d.a.c.f.h.k.n("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    private final void u(String str, final l lVar) {
        h hVarR;
        if (!j()) {
            hVarR = i0.f471l;
        } else if (TextUtils.isEmpty(str)) {
            j.d.a.c.f.h.k.m("BillingClient", "Please provide a valid product type.");
            hVarR = i0.f466g;
        } else if (t(new w(this, str, lVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.t
            @Override // java.lang.Runnable
            public final void run() {
                lVar.a(i0.f472m, j.d.a.c.f.h.b0.t());
            }
        }, p()) != null) {
            return;
        } else {
            hVarR = r();
        }
        lVar.a(hVarR, j.d.a.c.f.h.b0.t());
    }

    final /* synthetic */ Object D(b bVar, c cVar) {
        h hVarA;
        try {
            Bundle bundleB1 = this.f.b1(9, this.e.getPackageName(), bVar.a(), j.d.a.c.f.h.k.c(bVar, this.b));
            int iB = j.d.a.c.f.h.k.b(bundleB1, "BillingClient");
            String strI = j.d.a.c.f.h.k.i(bundleB1, "BillingClient");
            h.a aVarC = h.c();
            aVarC.c(iB);
            aVarC.b(strI);
            hVarA = aVarC.a();
        } catch (Exception e) {
            j.d.a.c.f.h.k.n("BillingClient", "Error acknowledge purchase!", e);
            hVarA = i0.f471l;
        }
        cVar.a(hVarA);
        return null;
    }

    final /* synthetic */ Object E(i iVar, j jVar) {
        int iH;
        String strI;
        String strA = iVar.a();
        try {
            j.d.a.c.f.h.k.l("BillingClient", "Consuming purchase with token: " + strA);
            if (this.f462m) {
                Bundle bundleL = this.f.L(9, this.e.getPackageName(), strA, j.d.a.c.f.h.k.d(iVar, this.f462m, this.b));
                iH = bundleL.getInt("RESPONSE_CODE");
                strI = j.d.a.c.f.h.k.i(bundleL, "BillingClient");
            } else {
                iH = this.f.H(3, this.e.getPackageName(), strA);
                strI = "";
            }
            h.a aVarC = h.c();
            aVarC.c(iH);
            aVarC.b(strI);
            h hVarA = aVarC.a();
            if (iH == 0) {
                j.d.a.c.f.h.k.l("BillingClient", "Successfully consumed purchase.");
            } else {
                j.d.a.c.f.h.k.m("BillingClient", "Error consuming purchase with token. Response code: " + iH);
            }
            jVar.a(hVarA, strA);
            return null;
        } catch (Exception e) {
            j.d.a.c.f.h.k.n("BillingClient", "Error consuming purchase!", e);
            jVar.a(i0.f471l, strA);
            return null;
        }
    }

    final /* synthetic */ Object F(String str, List list, String str2, o oVar) {
        String strI;
        int i2;
        String str3;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i3 = 0;
        while (true) {
            strI = "Item is unavailable for purchase.";
            if (i3 >= size) {
                strI = "";
                i2 = 0;
                break;
            }
            int i4 = i3 + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i3, i4 > size ? size : i4));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList3.add(((s0) arrayList2.get(i5)).a());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.b);
            try {
                Bundle bundleE = this.f463n ? this.f.E(10, this.e.getPackageName(), str, bundle, j.d.a.c.f.h.k.e(this.f459j, this.t, this.b, null, arrayList2)) : this.f.X(3, this.e.getPackageName(), str, bundle);
                if (bundleE != null) {
                    if (bundleE.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = bundleE.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            str3 = "querySkuDetailsAsync got null response list";
                        } else {
                            for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                                try {
                                    SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i6));
                                    j.d.a.c.f.h.k.l("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                    arrayList.add(skuDetails);
                                } catch (JSONException e) {
                                    j.d.a.c.f.h.k.n("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                                    strI = "Error trying to decode SkuDetails.";
                                    arrayList = null;
                                }
                            }
                            i3 = i4;
                        }
                    } else {
                        int iB = j.d.a.c.f.h.k.b(bundleE, "BillingClient");
                        strI = j.d.a.c.f.h.k.i(bundleE, "BillingClient");
                        if (iB != 0) {
                            j.d.a.c.f.h.k.m("BillingClient", "getSkuDetails() failed. Response code: " + iB);
                            i2 = iB;
                            break;
                        }
                        j.d.a.c.f.h.k.m("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    }
                    i2 = 6;
                    break;
                }
                str3 = "querySkuDetailsAsync got null sku details list";
                j.d.a.c.f.h.k.m("BillingClient", str3);
                arrayList = null;
                i2 = 4;
                break;
            } catch (Exception e2) {
                j.d.a.c.f.h.k.n("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                i2 = -1;
                strI = "Service connection is disconnected.";
                arrayList = null;
            }
        }
        h.a aVarC = h.c();
        aVarC.c(i2);
        aVarC.b(strI);
        oVar.onSkuDetailsResponse(aVarC.a(), arrayList);
        return null;
    }

    @Override // com.android.billingclient.api.d
    public final void a(final b bVar, final c cVar) {
        h hVarR;
        if (!j()) {
            hVarR = i0.f471l;
        } else if (TextUtils.isEmpty(bVar.a())) {
            j.d.a.c.f.h.k.m("BillingClient", "Please provide a valid purchase token.");
            hVarR = i0.f468i;
        } else if (!this.f462m) {
            hVarR = i0.b;
        } else if (t(new Callable() { // from class: com.android.billingclient.api.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.D(bVar, cVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.e1
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(i0.f472m);
            }
        }, p()) != null) {
            return;
        } else {
            hVarR = r();
        }
        cVar.a(hVarR);
    }

    @Override // com.android.billingclient.api.d
    public final void b(final i iVar, final j jVar) {
        h hVarR;
        if (!j()) {
            hVarR = i0.f471l;
        } else if (t(new Callable() { // from class: com.android.billingclient.api.b1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.E(iVar, jVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.c1
            @Override // java.lang.Runnable
            public final void run() {
                jVar.a(i0.f472m, iVar.a());
            }
        }, p()) != null) {
            return;
        } else {
            hVarR = r();
        }
        jVar.a(hVarR, iVar.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    @Override // com.android.billingclient.api.d
    public final h c(String str) {
        if (!j()) {
            return i0.f471l;
        }
        switch (str) {
            case "subscriptions":
                return this.f457h ? i0.f470k : i0.f473n;
            case "subscriptionsUpdate":
                return this.f458i ? i0.f470k : i0.f474o;
            case "priceChangeConfirmation":
                return this.f461l ? i0.f470k : i0.p;
            case "bbb":
                return this.f464o ? i0.f470k : i0.u;
            case "aaa":
                return this.q ? i0.f470k : i0.q;
            case "ddd":
                return this.p ? i0.f470k : i0.s;
            case "ccc":
            case "eee":
                return this.r ? i0.f470k : i0.r;
            case "fff":
                return this.s ? i0.f470k : i0.t;
            default:
                j.d.a.c.f.h.k.m("BillingClient", "Unsupported feature: ".concat(String.valueOf(str)));
                return i0.v;
        }
    }

    @Override // com.android.billingclient.api.d
    public final h d(Activity activity, final g gVar) {
        String str;
        Callable callable;
        long j2;
        Runnable runnable;
        Handler handler;
        h hVar;
        String str2;
        SkuDetails skuDetails;
        g.b bVar;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        final int i2;
        if (j()) {
            ArrayList<SkuDetails> arrayListF = gVar.f();
            List listG = gVar.g();
            SkuDetails skuDetails2 = (SkuDetails) j.d.a.c.f.h.g0.a(arrayListF, null);
            g.b bVar2 = (g.b) j.d.a.c.f.h.g0.a(listG, null);
            if (skuDetails2 == null) {
                bVar2.a().a();
                throw null;
            }
            final String strC = skuDetails2.c();
            final String strD = skuDetails2.d();
            String str8 = "BillingClient";
            if (strD.equals("subs") && !this.f457h) {
                j.d.a.c.f.h.k.m("BillingClient", "Current client doesn't support subscriptions.");
                hVar = i0.f473n;
            } else if (gVar.p() && !this.f460k) {
                j.d.a.c.f.h.k.m("BillingClient", "Current client doesn't support extra params for buy intent.");
                hVar = i0.f467h;
            } else if (arrayListF.size() > 1 && !this.r) {
                j.d.a.c.f.h.k.m("BillingClient", "Current client doesn't support multi-item purchases.");
                hVar = i0.r;
            } else if (listG.isEmpty() || this.s) {
                if (this.f460k) {
                    final Bundle bundleF = j.d.a.c.f.h.k.f(gVar, this.f462m, this.t, this.u, this.b);
                    if (arrayListF.isEmpty()) {
                        str2 = "proxyPackageVersion";
                        skuDetails = skuDetails2;
                        bVar = bVar2;
                        str3 = strC;
                        str4 = strD;
                        str5 = "BillingClient";
                        ArrayList<String> arrayList = new ArrayList<>(listG.size() - 1);
                        ArrayList<String> arrayList2 = new ArrayList<>(listG.size() - 1);
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        ArrayList<String> arrayList4 = new ArrayList<>();
                        if (listG.size() > 0) {
                            ((g.b) listG.get(0)).a().d();
                            throw null;
                        }
                        bundleF.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                        if (!arrayList3.isEmpty()) {
                            bundleF.putStringArrayList("skuDetailsTokens", arrayList3);
                        }
                        if (!arrayList.isEmpty()) {
                            bundleF.putStringArrayList("additionalSkus", arrayList);
                            bundleF.putStringArrayList("additionalSkuTypes", arrayList2);
                        }
                    } else {
                        ArrayList<String> arrayList5 = new ArrayList<>();
                        ArrayList<String> arrayList6 = new ArrayList<>();
                        str4 = strD;
                        ArrayList<String> arrayList7 = new ArrayList<>();
                        str3 = strC;
                        ArrayList<Integer> arrayList8 = new ArrayList<>();
                        str2 = "proxyPackageVersion";
                        ArrayList<String> arrayList9 = new ArrayList<>();
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = false;
                        for (SkuDetails skuDetails3 : arrayListF) {
                            if (!skuDetails3.j().isEmpty()) {
                                arrayList5.add(skuDetails3.j());
                            }
                            String strG = skuDetails3.g();
                            g.b bVar3 = bVar2;
                            String strF = skuDetails3.f();
                            int iE = skuDetails3.e();
                            SkuDetails skuDetails4 = skuDetails2;
                            String strI = skuDetails3.i();
                            arrayList6.add(strG);
                            z2 |= !TextUtils.isEmpty(strG);
                            arrayList7.add(strF);
                            z3 |= !TextUtils.isEmpty(strF);
                            arrayList8.add(Integer.valueOf(iE));
                            z4 |= iE != 0;
                            z5 |= !TextUtils.isEmpty(strI);
                            arrayList9.add(strI);
                            str8 = str8;
                            bVar2 = bVar3;
                            skuDetails2 = skuDetails4;
                        }
                        skuDetails = skuDetails2;
                        bVar = bVar2;
                        str5 = str8;
                        if (!arrayList5.isEmpty()) {
                            bundleF.putStringArrayList("skuDetailsTokens", arrayList5);
                        }
                        if (z2) {
                            bundleF.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList6);
                        }
                        if (z3) {
                            bundleF.putStringArrayList("SKU_OFFER_ID_LIST", arrayList7);
                        }
                        if (z4) {
                            bundleF.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList8);
                        }
                        if (z5) {
                            bundleF.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList9);
                        }
                        if (arrayListF.size() > 1) {
                            ArrayList<String> arrayList10 = new ArrayList<>(arrayListF.size() - 1);
                            ArrayList<String> arrayList11 = new ArrayList<>(arrayListF.size() - 1);
                            for (int i3 = 1; i3 < arrayListF.size(); i3++) {
                                arrayList10.add(((SkuDetails) arrayListF.get(i3)).c());
                                arrayList11.add(((SkuDetails) arrayListF.get(i3)).d());
                            }
                            bundleF.putStringArrayList("additionalSkus", arrayList10);
                            bundleF.putStringArrayList("additionalSkuTypes", arrayList11);
                        }
                    }
                    if (!bundleF.containsKey("SKU_OFFER_ID_TOKEN_LIST") || this.p) {
                        if (skuDetails == null || TextUtils.isEmpty(skuDetails.h())) {
                            if (bVar != null) {
                                bVar.a().c();
                                throw null;
                            }
                            str6 = null;
                            z = false;
                        } else {
                            bundleF.putString("skuPackageName", skuDetails.h());
                            str6 = null;
                            z = true;
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            bundleF.putString("accountName", str6);
                        }
                        Intent intent = activity.getIntent();
                        if (intent == null) {
                            str = str5;
                            j.d.a.c.f.h.k.m(str, "Activity's intent is null.");
                        } else {
                            str = str5;
                            if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                bundleF.putString("proxyPackage", stringExtra);
                                try {
                                    str7 = str2;
                                    try {
                                        bundleF.putString(str7, this.e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        bundleF.putString(str7, "package not found");
                                    }
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str7 = str2;
                                }
                            }
                        }
                        if (this.s && !listG.isEmpty()) {
                            i2 = 17;
                        } else if (this.q && z) {
                            i2 = 15;
                        } else {
                            i2 = this.f462m ? 9 : 6;
                        }
                        final String str9 = str3;
                        final String str10 = str4;
                        Callable callable2 = new Callable() { // from class: com.android.billingclient.api.r
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.a.x(i2, str9, str10, gVar, bundleF);
                            }
                        };
                        j2 = 5000;
                        runnable = null;
                        handler = this.c;
                        callable = callable2;
                    } else {
                        hVar = i0.s;
                    }
                } else {
                    str = "BillingClient";
                    callable = new Callable() { // from class: com.android.billingclient.api.s
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.a.y(strC, strD);
                        }
                    };
                    j2 = 5000;
                    runnable = null;
                    handler = this.c;
                }
                try {
                    Bundle bundle = (Bundle) t(callable, j2, runnable, handler).get(5000L, TimeUnit.MILLISECONDS);
                    int iB = j.d.a.c.f.h.k.b(bundle, str);
                    String strI2 = j.d.a.c.f.h.k.i(bundle, str);
                    if (iB == 0) {
                        Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                        intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                        activity.startActivity(intent2);
                        return i0.f470k;
                    }
                    j.d.a.c.f.h.k.m(str, "Unable to buy item, Error response code: " + iB);
                    h.a aVarC = h.c();
                    aVarC.c(iB);
                    aVarC.b(strI2);
                    h hVarA = aVarC.a();
                    q(hVarA);
                    return hVarA;
                } catch (CancellationException e) {
                    e = e;
                    j.d.a.c.f.h.k.n(str, "Time out while launching billing flow. Try to reconnect", e);
                    hVar = i0.f472m;
                    q(hVar);
                    return hVar;
                } catch (TimeoutException e2) {
                    e = e2;
                    j.d.a.c.f.h.k.n(str, "Time out while launching billing flow. Try to reconnect", e);
                    hVar = i0.f472m;
                    q(hVar);
                    return hVar;
                } catch (Exception e3) {
                    j.d.a.c.f.h.k.n(str, "Exception while launching billing flow. Try to reconnect", e3);
                }
            } else {
                j.d.a.c.f.h.k.m("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                hVar = i0.t;
            }
        } else {
            hVar = i0.f471l;
        }
        q(hVar);
        return hVar;
    }

    @Override // com.android.billingclient.api.d
    public void f(String str, l lVar) {
        u(str, lVar);
    }

    @Override // com.android.billingclient.api.d
    public final void g(n nVar, final o oVar) {
        h hVarR;
        if (j()) {
            final String strA = nVar.a();
            List<String> listB = nVar.b();
            if (TextUtils.isEmpty(strA)) {
                j.d.a.c.f.h.k.m("BillingClient", "Please fix the input params. SKU type can't be empty.");
                hVarR = i0.f;
            } else if (listB != null) {
                final ArrayList arrayList = new ArrayList();
                for (String str : listB) {
                    q0 q0Var = new q0(null);
                    q0Var.a(str);
                    arrayList.add(q0Var.b());
                }
                final String str2 = null;
                if (t(new Callable(strA, arrayList, str2, oVar) { // from class: com.android.billingclient.api.a1
                    public final /* synthetic */ String b;
                    public final /* synthetic */ List c;
                    public final /* synthetic */ o d;

                    {
                        this.d = oVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.a.F(this.b, this.c, null, this.d);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.onSkuDetailsResponse(i0.f472m, null);
                    }
                }, p()) != null) {
                    return;
                } else {
                    hVarR = r();
                }
            } else {
                j.d.a.c.f.h.k.m("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
                hVarR = i0.e;
            }
        } else {
            hVarR = i0.f471l;
        }
        oVar.onSkuDetailsResponse(hVarR, null);
    }

    @Override // com.android.billingclient.api.d
    public final void h(f fVar) {
        ServiceInfo serviceInfo;
        String str;
        if (j()) {
            j.d.a.c.f.h.k.l("BillingClient", "Service connection is valid. No need to re-initialize.");
            fVar.onBillingSetupFinished(i0.f470k);
            return;
        }
        if (this.a == 1) {
            j.d.a.c.f.h.k.m("BillingClient", "Client is already in the process of connecting to billing service.");
            fVar.onBillingSetupFinished(i0.d);
            return;
        }
        if (this.a == 3) {
            j.d.a.c.f.h.k.m("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            fVar.onBillingSetupFinished(i0.f471l);
            return;
        }
        this.a = 1;
        this.d.d();
        j.d.a.c.f.h.k.l("BillingClient", "Starting in-app billing setup.");
        this.f456g = new b0(this, fVar, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage(GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE);
        List<ResolveInfo> listQueryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            if (!GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE.equals(str2) || str3 == null) {
                str = "The device doesn't have valid Play Store.";
            } else {
                ComponentName componentName = new ComponentName(str2, str3);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", this.b);
                if (this.e.bindService(intent2, this.f456g, 1)) {
                    j.d.a.c.f.h.k.l("BillingClient", "Service was bonded successfully.");
                    return;
                }
                str = "Connection to Billing service is blocked.";
            }
            j.d.a.c.f.h.k.m("BillingClient", str);
        }
        this.a = 0;
        j.d.a.c.f.h.k.l("BillingClient", "Billing service unavailable on device.");
        fVar.onBillingSetupFinished(i0.c);
    }

    public final boolean j() {
        return (this.a != 2 || this.f == null || this.f456g == null) ? false : true;
    }

    final /* synthetic */ void o(h hVar) {
        if (this.d.c() != null) {
            this.d.c().onPurchasesUpdated(hVar, null);
        } else {
            this.d.b();
            j.d.a.c.f.h.k.m("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ Bundle x(int i2, String str, String str2, g gVar, Bundle bundle) {
        return this.f.S(i2, this.e.getPackageName(), str, str2, null, bundle);
    }

    final /* synthetic */ Bundle y(String str, String str2) {
        return this.f.K0(3, this.e.getPackageName(), str, str2, null);
    }
}
