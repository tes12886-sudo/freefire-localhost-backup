package com.android.billingclient.api;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class n0 {
    static h a(Bundle bundle, String str, String str2) {
        String str3;
        h hVar = i0.f469j;
        if (bundle == null) {
            str3 = String.format("%s got null owned items list", str2);
        } else {
            int iB = j.d.a.c.f.h.k.b(bundle, "BillingClient");
            String strI = j.d.a.c.f.h.k.i(bundle, "BillingClient");
            h.a aVarC = h.c();
            aVarC.c(iB);
            aVarC.b(strI);
            h hVarA = aVarC.a();
            if (iB != 0) {
                j.d.a.c.f.h.k.m("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
                return hVarA;
            }
            if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    str3 = String.format("Bundle returned from %s contains null SKUs list.", str2);
                } else if (stringArrayList2 == null) {
                    str3 = String.format("Bundle returned from %s contains null purchases list.", str2);
                } else {
                    if (stringArrayList3 != null) {
                        return i0.f470k;
                    }
                    str3 = String.format("Bundle returned from %s contains null signatures list.", str2);
                }
            } else {
                str3 = String.format("Bundle returned from %s doesn't contain required fields.", str2);
            }
        }
        j.d.a.c.f.h.k.m("BillingClient", str3);
        return hVar;
    }
}
