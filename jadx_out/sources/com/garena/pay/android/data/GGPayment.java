package com.garena.pay.android.data;

import com.appsflyer.AppsFlyerProperties;
import com.beetalk.sdk.x.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GGPayment implements Serializable {
    public static final long ALL_ITEMS = -1;
    public static final long NON_REBATE_ITEMS = 0;
    public static final long SPECIFIED_ITEMS = -2;
    private static final long serialVersionUID = 240433208245069548L;
    private int apiVersion;
    private final String appId;
    private List<String> appItemIds;
    private int appServerId;
    private final String buyerId;
    private final float conversionRatio;
    private List<Denomination> denominations;
    private final String description;
    private final boolean isOfferPersonalized;
    private List<String> itemIds;
    private Locale locale;
    private final int platform;
    private List<String> rebateIds;
    private int roleId;
    private final String token;
    private String transactionId;
    private final String virtualCurrencyName;
    private long rebateId = 0;
    private boolean convertGooglePlayPrices = false;

    public static class Denomination implements Serializable {
        private static final long serialVersionUID = 1;
        private final int appPoints;
        private String eventId;
        private final String iconUrl;
        private final boolean isPromo;
        private String itemId;
        private String name;
        private final int oneTimePromoPoints;
        private String pointName;
        private String price;
        public String priceCode;
        private final int promoPoints;
        private long rebateId = 0;
        private long appItemId = 0;
        private Subscription subscription = null;

        public static class Subscription implements Serializable {
            private long gracePeriodExpiryTime;
            private double introCurrencyAmount;
            private int introCycle;
            private String introPrice;
            private final long lastPaymentTime;
            private long onHoldSince;
            private final int period;
            private final int status;

            public Subscription(int i2, int i3, long j2, long j3, String str, int i4, double d, long j4) {
                this.period = i2;
                this.status = i3;
                this.lastPaymentTime = j2;
                this.gracePeriodExpiryTime = j3;
                this.introPrice = str;
                this.introCycle = i4;
                this.introCurrencyAmount = d;
                this.onHoldSince = j4;
            }

            public static Subscription parse(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                return new Subscription(jSONObject.optInt("period", 0), jSONObject.optInt("status", -1), jSONObject.optInt("last_payment_time", 0), jSONObject.optLong("grace_period_expire", 0L), jSONObject.optString("intro_price", ""), jSONObject.optInt("intro_cycle", 0), jSONObject.optDouble("intro_currency_amount", 0.0d), jSONObject.optLong("on_hold_since", 0L));
            }

            public long getGracePeriodExpiryTime() {
                return this.gracePeriodExpiryTime;
            }

            public double getIntroCurrencyAmount() {
                return this.introCurrencyAmount;
            }

            public int getIntroCycle() {
                return this.introCycle;
            }

            public String getIntroPrice() {
                return this.introPrice;
            }

            public long getLastPaymentTime() {
                return this.lastPaymentTime;
            }

            public long getOnHoldSince() {
                return this.onHoldSince;
            }

            public int getPeriod() {
                return this.period;
            }

            public int getStatus() {
                return this.status;
            }
        }

        public Denomination(String str, String str2, int i2, String str3, String str4, boolean z, int i3, int i4) {
            this.name = str;
            this.itemId = str2;
            this.appPoints = i2;
            this.iconUrl = str3;
            this.price = str4;
            this.isPromo = z;
            this.promoPoints = i3;
            this.oneTimePromoPoints = i4;
        }

        public static Denomination parse(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("name");
            String strOptString2 = jSONObject.optString("icon");
            String strOptString3 = jSONObject.optString("id");
            int iOptInt = jSONObject.optInt("app_point_amount");
            String strOptString4 = jSONObject.optString("price");
            boolean zOptBoolean = jSONObject.optBoolean("promo", false);
            long jOptLong = jSONObject.optLong("rebate_card_id", 0L);
            long jOptLong2 = jSONObject.optLong("app_item_id", 0L);
            Denomination denomination = new Denomination(strOptString, strOptString3, iOptInt, strOptString2, strOptString4, zOptBoolean, jSONObject.optInt("promo_amount"), 0);
            denomination.setRebateId(jOptLong);
            denomination.setAppItemId(jOptLong2);
            denomination.setSubscription(Subscription.parse(jSONObject.optJSONObject("subscription")));
            return denomination;
        }

        public static List<Denomination> parseList(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Denomination denomination = parse(jSONArray.optJSONObject(i2));
                if (denomination != null) {
                    arrayList.add(denomination);
                }
            }
            return arrayList;
        }

        public long getAppItemId() {
            return this.appItemId;
        }

        public int getAppPoints() {
            return this.appPoints;
        }

        public String getEventId() {
            return this.eventId;
        }

        public String getIconUrl() {
            return this.iconUrl;
        }

        public String getItemId() {
            return this.itemId;
        }

        public String getName() {
            return this.name;
        }

        public int getOneTimePromoPoints() {
            return this.oneTimePromoPoints;
        }

        public String getPointName() {
            return this.pointName;
        }

        public String getPrice() {
            return this.price;
        }

        public int getPromoPoints() {
            return this.promoPoints;
        }

        public long getRebateId() {
            return this.rebateId;
        }

        public Subscription getSubscription() {
            return this.subscription;
        }

        public boolean isInPromotion() {
            return this.isPromo;
        }

        public boolean isSubscription() {
            return this.subscription != null;
        }

        public void setAppItemId(long j2) {
            this.appItemId = j2;
        }

        public void setEventId(String str) {
            this.eventId = str;
        }

        public void setItemId(String str) {
            this.itemId = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPointName(String str) {
            this.pointName = str;
        }

        public void setPrice(String str) {
            this.price = str;
        }

        public void setPriceCode(String str) {
            this.priceCode = str;
        }

        public void setRebateId(long j2) {
            this.rebateId = j2;
        }

        public void setSubscription(Subscription subscription) {
            this.subscription = subscription;
        }
    }

    public static class GGPaymentBuilder {
        private String appId;
        private String buyerId;
        private float conversionRatio;
        private String description;
        private String token;
        private String transactionId;
        private String virtualCurrencyName;
        private List<Denomination> denominations = new ArrayList();
        private Locale locale = g.d();
        private int serverId = 0;
        private int roleId = 0;
        private int platform = 2;
        private Long rebateId = 0L;
        private boolean convertGooglePlayPrices = false;
        private List<String> itemIds = new ArrayList();
        private List<String> rebateIds = new ArrayList();
        private List<String> appItemIds = new ArrayList();
        private int apiVersion = 2;
        private boolean isOfferPersonalized = false;

        public GGPaymentBuilder addAppItemId(String str) {
            this.appItemIds.add(str);
            return this;
        }

        public GGPaymentBuilder addDenomination(Denomination denomination) {
            this.denominations.add(denomination);
            return this;
        }

        public GGPaymentBuilder addItemId(String str) {
            this.itemIds.add(str);
            return this;
        }

        public GGPaymentBuilder addRebateId(String str) {
            this.rebateIds.add(str);
            return this;
        }

        public GGPayment build() {
            GGPayment gGPayment = new GGPayment(this.denominations, this.locale, this.conversionRatio, this.token, this.virtualCurrencyName, this.appId, this.buyerId, this.description, this.transactionId, this.serverId, this.roleId, this.platform, this.isOfferPersonalized);
            gGPayment.setItemIds(this.itemIds);
            gGPayment.setRebateIds(this.rebateIds);
            gGPayment.setRebateId(this.rebateId.longValue());
            gGPayment.setAppItemIds(this.appItemIds);
            gGPayment.setApiVersion(this.apiVersion);
            gGPayment.setConvertGooglePlayPrices(this.convertGooglePlayPrices);
            return gGPayment;
        }

        public GGPaymentBuilder setApiVersion(int i2) {
            this.apiVersion = i2;
            return this;
        }

        public GGPaymentBuilder setAppId(String str) {
            this.appId = str;
            return this;
        }

        public GGPaymentBuilder setAppItemIds(List<String> list) {
            this.appItemIds = new ArrayList(list);
            return this;
        }

        public GGPaymentBuilder setBuyerId(String str) {
            this.buyerId = str;
            return this;
        }

        public GGPaymentBuilder setConversionRatio(float f) {
            this.conversionRatio = f;
            return this;
        }

        public GGPaymentBuilder setConvertGooglePlayPrices(boolean z) {
            this.convertGooglePlayPrices = z;
            return this;
        }

        public GGPaymentBuilder setDenominations(List<Denomination> list) {
            this.denominations = list;
            return this;
        }

        public GGPaymentBuilder setDescription(String str) {
            this.description = str;
            return this;
        }

        public GGPaymentBuilder setIsOfferPersonalized(boolean z) {
            this.isOfferPersonalized = z;
            return this;
        }

        public GGPaymentBuilder setItemIds(List<String> list) {
            this.itemIds = new ArrayList(list);
            return this;
        }

        public GGPaymentBuilder setLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public GGPaymentBuilder setPlatform(int i2) {
            this.platform = i2;
            return this;
        }

        public GGPaymentBuilder setRebateId(long j2) {
            this.rebateId = Long.valueOf(j2);
            return this;
        }

        public GGPaymentBuilder setRebateIds(List<String> list) {
            this.rebateIds = new ArrayList(list);
            return this;
        }

        public GGPaymentBuilder setRoleId(int i2) {
            this.roleId = i2;
            return this;
        }

        public GGPaymentBuilder setServerId(int i2) {
            this.serverId = i2;
            return this;
        }

        public GGPaymentBuilder setToken(String str) {
            this.token = str;
            return this;
        }

        public GGPaymentBuilder setTransactionId(String str) {
            this.transactionId = str;
            return this;
        }

        public GGPaymentBuilder setVirtualCurrencyName(String str) {
            this.virtualCurrencyName = str;
            return this;
        }
    }

    public static class PaymentChannel implements Serializable {
        private String channelId;
        private String description;
        private int flag;
        private String iconUrl;
        private List<Denomination> items;
        private String name;

        public static PaymentChannel parse(JSONObject jSONObject) {
            JSONArray jSONArray = null;
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt(AppsFlyerProperties.CHANNEL);
            String strOptString = jSONObject.optString("name");
            String strOptString2 = jSONObject.optString("icon");
            String strOptString3 = jSONObject.optString("description");
            int iOptInt2 = jSONObject.optInt("flag");
            try {
                jSONArray = jSONObject.getJSONArray("items");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            List<Denomination> list = Denomination.parseList(jSONArray);
            PaymentChannel paymentChannel = new PaymentChannel();
            paymentChannel.setChannelId(String.valueOf(iOptInt));
            paymentChannel.setName(strOptString);
            paymentChannel.setIconUrl(strOptString2);
            paymentChannel.setDescription(strOptString3);
            paymentChannel.setItems(list);
            paymentChannel.setFlag(iOptInt2);
            return paymentChannel;
        }

        public static List<PaymentChannel> parseList(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                PaymentChannel paymentChannel = parse(jSONArray.optJSONObject(i2));
                if (paymentChannel != null) {
                    arrayList.add(paymentChannel);
                }
            }
            return arrayList;
        }

        public String getChannelId() {
            return this.channelId;
        }

        public Denomination getDenomination(String str) {
            List<Denomination> list = this.items;
            if (list == null) {
                return null;
            }
            for (Denomination denomination : list) {
                if (denomination.getItemId().equalsIgnoreCase(str)) {
                    return denomination;
                }
            }
            return null;
        }

        public String getDescription() {
            return this.description;
        }

        public int getFlag() {
            return this.flag;
        }

        public String getIconUrl() {
            return this.iconUrl;
        }

        public List<Denomination> getItems() {
            return this.items;
        }

        public String getName() {
            return this.name;
        }

        public boolean isDirectPay() {
            List<Denomination> list = this.items;
            return list == null || list.size() == 0;
        }

        public boolean isGooglePlay() {
            return String.valueOf(201069).equalsIgnoreCase(this.channelId);
        }

        public void setChannelId(String str) {
            this.channelId = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setFlag(int i2) {
            this.flag = i2;
        }

        public void setIconUrl(String str) {
            this.iconUrl = str;
        }

        public void setItems(List<Denomination> list) {
            this.items = list;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public GGPayment(List<Denomination> list, Locale locale, float f, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i4, boolean z) {
        this.locale = g.d();
        this.denominations = list;
        this.conversionRatio = f;
        this.token = str;
        this.virtualCurrencyName = str2;
        this.appId = str3;
        this.buyerId = str4;
        this.description = str5;
        this.transactionId = str6;
        this.appServerId = i2;
        this.roleId = i3;
        this.platform = i4;
        if (locale != null) {
            this.locale = locale;
        }
        this.isOfferPersonalized = z;
    }

    public int getApiVersion() {
        return this.apiVersion;
    }

    public String getAppId() {
        return this.appId;
    }

    public List<String> getAppItemIds() {
        return this.appItemIds;
    }

    public int getAppServerId() {
        return this.appServerId;
    }

    public String getBuyerId() {
        return this.buyerId;
    }

    public float getConversionRatio() {
        return this.conversionRatio;
    }

    public List<Denomination> getDenominations() {
        return this.denominations;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getItemIds() {
        return this.itemIds;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public int getPlatform() {
        return this.platform;
    }

    public long getRebateId() {
        List<String> list = this.rebateIds;
        if (list == null || list.isEmpty()) {
            return this.rebateId;
        }
        return -2L;
    }

    public List<String> getRebateIds() {
        if (this.rebateIds.isEmpty()) {
            long j2 = this.rebateId;
            if (j2 != 0 && j2 != -1) {
                return Collections.singletonList(String.valueOf(j2));
            }
        }
        return this.rebateIds;
    }

    public int getRoleId() {
        return this.roleId;
    }

    public String getToken() {
        return this.token;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getVirtualCurrencyName() {
        return this.virtualCurrencyName;
    }

    public boolean isConvertGooglePlayPrices() {
        return this.convertGooglePlayPrices;
    }

    public boolean isOfferPersonalized() {
        return this.isOfferPersonalized;
    }

    public void setApiVersion(int i2) {
        this.apiVersion = i2;
    }

    public void setAppItemIds(List<String> list) {
        this.appItemIds = list;
    }

    public void setAppServerId(int i2) {
        this.appServerId = i2;
    }

    public void setConvertGooglePlayPrices(boolean z) {
        this.convertGooglePlayPrices = z;
    }

    public void setDenominations(List<Denomination> list) {
        this.denominations = list;
    }

    public void setItemIds(List<String> list) {
        this.itemIds = list;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setRebateId(long j2) {
        this.rebateId = j2;
    }

    public void setRebateIds(List<String> list) {
        this.rebateIds = list;
    }

    public void setRoleId(int i2) {
        this.roleId = i2;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }
}
