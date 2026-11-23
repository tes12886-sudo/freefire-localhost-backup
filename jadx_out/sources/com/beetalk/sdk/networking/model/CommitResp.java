package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.x.a;
import com.beetalk.sdk.z.f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CommitResp extends BaseResp {
    private String itemName = "";
    private String itemIconUrl = "";
    private long rebateCardId = 0;
    private String currentCommitTxnId = "";
    private int remainingDays = 0;
    private int appPointAmount = 0;
    private boolean isFreeItem = false;

    public static CommitResp parse(String str) {
        CommitResp commitResp = new CommitResp();
        try {
            JSONObject jSONObject = new JSONObject(str);
            commitResp.resultCode = commitResp.parseResultCode(jSONObject);
            commitResp.itemName = jSONObject.optString("item_name", "");
            commitResp.itemIconUrl = jSONObject.optString("item_icon", "");
            commitResp.currentCommitTxnId = jSONObject.optString("txn_id", "");
            commitResp.appPointAmount = jSONObject.optInt("app_point_amount", 0);
            commitResp.isFreeItem = jSONObject.optBoolean("is_free_item", false);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rebate_card");
            if (jSONObjectOptJSONObject != null) {
                commitResp.rebateCardId = jSONObjectOptJSONObject.optLong("rebate_card_id", 0L);
                commitResp.remainingDays = jSONObjectOptJSONObject.optInt("remaining_days", 0);
            }
            return commitResp;
        } catch (JSONException e) {
            a.b(e);
            commitResp.resultCode = f.ERR_PARSE.c();
            return commitResp;
        }
    }

    public int getAppPointAmount() {
        return this.appPointAmount;
    }

    public String getCurrentCommitTxnId() {
        return this.currentCommitTxnId;
    }

    public String getItemIconUrl() {
        return this.itemIconUrl;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getMessage() {
        return f.e(this.resultCode);
    }

    public long getRebateCardId() {
        return this.rebateCardId;
    }

    public int getRemainingDays() {
        return this.remainingDays;
    }

    public boolean isError() {
        return this.resultCode != f.SUCCESS.c();
    }

    public boolean isFreeItem() {
        return this.isFreeItem;
    }
}
