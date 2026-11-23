package com.garena.pay.android.data;

import android.content.Context;
import android.text.TextUtils;
import com.beetalk.sdk.x.a;
import com.beetalk.sdk.x.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GGRebateOptionsRequest {
    private String appId;
    private Locale locale;
    private String openId;
    private Integer platform;
    private List<Long> rebateIds;
    private int roleId;
    private int serverId;
    private String token;

    public static class GGRebateOptionsRequestBuilder {
        private String appId;
        private Locale locale;
        private String openId;
        private Integer platform;
        private String token;
        private int serverId = 0;
        private int roleId = 0;
        private List<Long> rebateIds = new ArrayList();

        public GGRebateOptionsRequest Build() {
            Locale locale = this.locale;
            return locale == null ? new GGRebateOptionsRequest(this.appId, this.platform, this.openId, this.token, this.serverId, this.roleId, this.rebateIds) : new GGRebateOptionsRequest(this.appId, this.platform, this.openId, this.token, this.serverId, this.roleId, locale, this.rebateIds);
        }

        public GGRebateOptionsRequestBuilder addRebateId(long j2) {
            this.rebateIds.add(Long.valueOf(j2));
            return this;
        }

        public GGRebateOptionsRequestBuilder setAppId(String str) {
            this.appId = str;
            return this;
        }

        public GGRebateOptionsRequestBuilder setLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public GGRebateOptionsRequestBuilder setOpenId(String str) {
            this.openId = str;
            return this;
        }

        public GGRebateOptionsRequestBuilder setPlatform(Integer num) {
            this.platform = num;
            return this;
        }

        public GGRebateOptionsRequestBuilder setRebateIds(List<Long> list) {
            if (list != null) {
                this.rebateIds = new ArrayList(list);
            } else {
                this.rebateIds = new ArrayList();
            }
            return this;
        }

        public GGRebateOptionsRequestBuilder setRoleId(int i2) {
            this.roleId = i2;
            return this;
        }

        public GGRebateOptionsRequestBuilder setServerId(int i2) {
            this.serverId = i2;
            return this;
        }

        public GGRebateOptionsRequestBuilder setToken(String str) {
            this.token = str;
            return this;
        }
    }

    public GGRebateOptionsRequest(String str, Integer num, String str2, String str3, int i2, int i3, List<Long> list) {
        this.locale = g.d();
        this.appId = str;
        this.platform = num;
        this.openId = str2;
        this.token = str3;
        this.serverId = i2;
        this.roleId = i3;
        this.rebateIds = list;
    }

    public GGRebateOptionsRequest(String str, Integer num, String str2, String str3, int i2, int i3, Locale locale, List<Long> list) {
        this.locale = g.d();
        this.appId = str;
        this.platform = num;
        this.openId = str2;
        this.token = str3;
        this.serverId = i2;
        this.roleId = i3;
        this.locale = locale;
        this.rebateIds = list;
    }

    public String getAppId() {
        return this.appId;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getOpenId() {
        return this.openId;
    }

    public Map<String, String> getParams(Context context) {
        HashMap map = new HashMap();
        map.put("access_token", this.token);
        map.put("app_id", this.appId);
        map.put("open_id", this.openId);
        map.put("platform", String.valueOf(this.platform));
        map.put("client_type", String.valueOf(2));
        map.put("app_server_id", String.valueOf(this.serverId));
        map.put("app_role_id", String.valueOf(this.roleId));
        Locale locale = this.locale;
        map.put("locale", locale != null ? g.f(locale) : g.f(g.e(context)));
        List<Long> list = this.rebateIds;
        if (list != null && !list.isEmpty()) {
            map.put("for_rebate_ids", TextUtils.join(",", this.rebateIds));
        }
        a.a("Rebate Options Get Request Data %s", map.toString());
        return map;
    }

    public Integer getPlatform() {
        return this.platform;
    }

    public int getRoleId() {
        return this.roleId;
    }

    public int getServerId() {
        return this.serverId;
    }

    public String getToken() {
        return this.token;
    }
}
