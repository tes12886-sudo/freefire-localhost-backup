package com.appsflyer.internal;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.m;
import com.android.billingclient.api.n;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class at implements m {
    private /* synthetic */ av values;

    at(av avVar) {
        this.values = avVar;
    }

    @Override // com.android.billingclient.api.m
    public final void onPurchasesUpdated(com.android.billingclient.api.h hVar, final List<Purchase> list) {
        final av avVar = this.values;
        try {
            if (hVar.b() == 0 && list != null) {
                if (avVar.AFInAppEventType == null) {
                    AFLogger.values("Got Ars billing callback but billing client is missing!");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Purchase> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getSku());
                }
                n.a aVarC = n.c();
                aVarC.c("subs");
                aVarC.b(arrayList);
                avVar.AFInAppEventType.g(aVarC.a(), new com.android.billingclient.api.o() { // from class: com.appsflyer.internal.av.4
                    private /* synthetic */ List AFInAppEventType;

                    AnonymousClass4() {
                        list = list;
                    }

                    @Override // com.android.billingclient.api.o
                    public final void onSkuDetailsResponse(com.android.billingclient.api.h hVar2, List<SkuDetails> list2) {
                        try {
                            if (hVar2.b() == 0 && list2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<SkuDetails> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(it2.next().c());
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (Purchase purchase : list) {
                                    if (arrayList2.contains(purchase.getSku())) {
                                        arrayList3.add(purchase);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                av.AFKeystoreWrapper(av.this, false, arrayList3);
                            }
                        } catch (Throwable th) {
                            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                                AFLogger.values("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                            }
                            AFLogger.values("Failed to log new purchase", th);
                        }
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder("Failed to setup Ars Play billing service: ");
            sb.append(hVar.b());
            sb.append(" ");
            sb.append(hVar.a());
            AFLogger.values(sb.toString());
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.values("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.values("Failed to query new purchase details", th);
        }
    }
}
