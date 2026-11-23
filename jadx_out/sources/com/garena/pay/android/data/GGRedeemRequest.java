package com.garena.pay.android.data;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GGRedeemRequest {
    private String accessToken;
    private long rebateCardId;
    private int roleId;
    private int serverId;

    public static class GGRedeemRequestBuilder {
        private String accessToken;
        private long rebateCardId = 0;
        private int roleId;
        private int serverId;

        public GGRedeemRequest Build() {
            return new GGRedeemRequest(this.accessToken, this.serverId, this.roleId, this.rebateCardId);
        }

        public GGRedeemRequestBuilder setAccessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public GGRedeemRequestBuilder setRebateCardId(long j2) {
            this.rebateCardId = j2;
            return this;
        }

        public GGRedeemRequestBuilder setRoleId(int i2) {
            this.roleId = i2;
            return this;
        }

        public GGRedeemRequestBuilder setServerId(int i2) {
            this.serverId = i2;
            return this;
        }
    }

    public GGRedeemRequest(String str, int i2, int i3, long j2) {
        this.accessToken = str;
        this.serverId = i2;
        this.roleId = i3;
        this.rebateCardId = j2;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public Map<String, String> getParams() {
        HashMap map = new HashMap();
        map.put("access_token", this.accessToken);
        map.put("client_type", String.valueOf(2));
        map.put("app_server_id", String.valueOf(this.serverId));
        map.put("app_role_id", String.valueOf(this.roleId));
        long j2 = this.rebateCardId;
        if (j2 > 0) {
            map.put("rebate_card_id", String.valueOf(j2));
        }
        return map;
    }

    public long getRebateCardId() {
        return this.rebateCardId;
    }

    public int getRoleId() {
        return this.roleId;
    }

    public int getServerId() {
        return this.serverId;
    }
}
