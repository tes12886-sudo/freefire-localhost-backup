package com.beetalk.sdk.networking.model;

import j.d.d.y.c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class RecallToken {

    @c("access_token")
    private String accessToken;

    @c("create_time")
    private long createTime;

    @c("expiry_time")
    private long expiryTime;

    @c("open_id")
    private String openId;

    @c("platform")
    private int platform;

    @c("scope")
    private long scopes = -1;

    @c("uid")
    private long uid;

    public static RecallToken parse(JSONObject jSONObject) {
        RecallToken recallToken = new RecallToken();
        recallToken.setPlatform(jSONObject.optInt("platform", -1));
        recallToken.setAccessToken(jSONObject.optString("access_token", ""));
        recallToken.setCreateTime(jSONObject.optLong("create_time", 0L));
        recallToken.setExpiryTime(jSONObject.optLong("expiry_time", 0L));
        recallToken.setUid(jSONObject.optLong("uid", 0L));
        recallToken.setOpenId(jSONObject.optString("open_id", ""));
        recallToken.setScopes(jSONObject.optLong("scope", 0L));
        return recallToken;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getExpiryTime() {
        return this.expiryTime;
    }

    public String getOpenId() {
        return this.openId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public long getScopes() {
        return this.scopes;
    }

    public long getUid() {
        return this.uid;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setExpiryTime(long j2) {
        this.expiryTime = j2;
    }

    public void setOpenId(String str) {
        this.openId = str;
    }

    public void setPlatform(int i2) {
        this.platform = i2;
    }

    public void setScopes(long j2) {
        this.scopes = j2;
    }

    public void setUid(long j2) {
        this.uid = j2;
    }
}
