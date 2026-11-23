package com.appsflyer.internal;

import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class aw implements com.android.billingclient.api.f {
    private /* synthetic */ av values;

    aw(av avVar) {
        this.values = avVar;
    }

    @Override // com.android.billingclient.api.f
    public final void onBillingServiceDisconnected() {
    }

    @Override // com.android.billingclient.api.f
    public final void onBillingSetupFinished(final com.android.billingclient.api.h hVar) {
        final av avVar = this.values;
        avVar.values.submit(new Runnable() { // from class: com.appsflyer.internal.av.5
            private /* synthetic */ com.android.billingclient.api.h AFKeystoreWrapper;

            AnonymousClass5() {
                hVar = hVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (hVar.b() == 0 && !av.this.valueOf.AFInAppEventType("ars_history_sent")) {
                        Purchase.PurchasesResult purchasesResultQueryPurchases = av.this.AFInAppEventType.queryPurchases("subs");
                        List purchasesList = purchasesResultQueryPurchases.getPurchasesList();
                        if (purchasesResultQueryPurchases.getResponseCode() == 0 && purchasesList != null && !purchasesList.isEmpty()) {
                            av.AFKeystoreWrapper(av.this, true, purchasesList);
                            return;
                        }
                        AFLogger.values("Failed to query purchases history");
                    }
                } catch (Throwable th) {
                    if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                        AFLogger.values("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                    }
                    AFLogger.values("Failed to log purchases history", th);
                }
            }
        });
    }
}
