package com.garena.pay.android;

import android.content.Context;
import android.util.Pair;
import com.android.billingclient.api.Purchase;
import com.beetalk.sdk.networking.model.CommitResp;
import com.garena.pay.android.data.GGPayment;
import com.garena.pay.android.data.GoogleIapItemInfo;
import i.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class g {

    class a implements i.g<List<Pair<Purchase, CommitResp>>, Void> {
        final /* synthetic */ h a;
        final /* synthetic */ NewGoogleIabPayRequestHandler b;

        a(h hVar, NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler) {
            this.a = hVar;
            this.b = newGoogleIabPayRequestHandler;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i<List<Pair<Purchase, CommitResp>>> iVar) {
            ArrayList arrayList = new ArrayList();
            if (iVar.x() || iVar.v() || iVar.t() == null) {
                this.a.onResult(arrayList);
                return null;
            }
            for (Pair<Purchase, CommitResp> pair : iVar.t()) {
                Purchase purchase = (Purchase) pair.first;
                CommitResp commitResp = (CommitResp) pair.second;
                ArrayList<String> arrayListH = purchase.h();
                arrayList.add(commitResp == null ? h.a.a(new GoogleIapItemInfo.Builder().itemSku(arrayListH.get(0)).build(), "error_unknown") : (commitResp.isError() || purchase.d() != 1) ? h.a.a(new GoogleIapItemInfo.Builder().itemSku(arrayListH.get(0)).build(), commitResp.getMessage()) : h.a.b(new GoogleIapItemInfo.Builder().itemSku(arrayListH.get(0)).itemName(commitResp.getItemName()).itemIconUrl(commitResp.getItemIconUrl()).appPointAmount(commitResp.getAppPointAmount()).isPromotion(commitResp.isFreeItem()).build()));
            }
            this.a.onResult(arrayList);
            this.b.n();
            return null;
        }
    }

    static void a(Context context, String str, String str2, int i2, int i3, h hVar) {
        d dVar = new d();
        GGPayment.GGPaymentBuilder gGPaymentBuilder = new GGPayment.GGPaymentBuilder();
        gGPaymentBuilder.setAppId(str).setBuyerId(com.beetalk.sdk.g.y().I().f()).setToken(str2).setServerId(i2).setRoleId(i3).setPlatform(com.beetalk.sdk.g.y().D().intValue());
        dVar.i(gGPaymentBuilder.build());
        NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler = new NewGoogleIabPayRequestHandler(context, Integer.valueOf(i2), Integer.valueOf(i3));
        newGoogleIabPayRequestHandler.C().j(new a(hVar, newGoogleIabPayRequestHandler), i.f1903k);
    }
}
