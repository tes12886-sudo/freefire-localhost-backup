package com.beetalk.sdk.networking.model;

import android.text.TextUtils;
import com.beetalk.sdk.x.a;
import com.garena.pay.android.data.GGPayment;
import com.garena.pay.android.data.GGPaymentAppItem;
import com.garena.pay.android.ndk.RebateOptionItem;
import h.f.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Pricing implements Serializable {
    private App app;
    private List<GGPaymentAppItem> appItems;
    private List<Channel> channels;
    private List<Promo> promoList;
    private List<RebateOptionItem> rebates;
    private Subscription subscription;

    private static class App implements Serializable {
        private String pointIcon;
        private String pointName;

        private App() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static App parse(JSONObject jSONObject) {
            App app = new App();
            if (jSONObject == null) {
                return app;
            }
            app.pointIcon = jSONObject.optString("point_icon", "");
            app.pointName = jSONObject.optString("point_name", "");
            return app;
        }
    }

    private static class Channel implements Serializable {
        private String id;
        private Info info;
        private List<Sku> items;

        private static class Info implements Serializable {
            private long channelId;
            private String description;
            private int flag;
            private String icon;
            private String name;
            private int priority;

            private Info() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Info parse(JSONObject jSONObject) {
                Info info = new Info();
                if (jSONObject == null) {
                    return info;
                }
                info.channelId = jSONObject.optLong("channel_id", 0L);
                info.name = jSONObject.optString("name");
                info.description = jSONObject.optString("description");
                info.priority = jSONObject.optInt("priority");
                info.icon = jSONObject.optString("icon");
                info.flag = jSONObject.optInt("flag");
                return info;
            }
        }

        private static class Sku implements Serializable {
            private long appItemId;
            private int appPointAmount;
            private String currency;
            private float currencyAmount;
            private String id;
            private String name;
            private String price;
            private long rebateCardId;
            private Sub subscription;

            private static class Sub implements Serializable {
                private double introCurrencyAmount;
                private int introCycle;
                private String introPrice;
                private int period;

                private Sub() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Sub parse(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        return null;
                    }
                    Sub sub = new Sub();
                    sub.period = jSONObject.optInt("period", 0);
                    sub.introPrice = jSONObject.optString("intro_price", "");
                    sub.introCurrencyAmount = jSONObject.optDouble("intro_currency_amount", 0.0d);
                    sub.introCycle = jSONObject.optInt("intro_cycle", 0);
                    return sub;
                }
            }

            private Sku() {
            }

            private static Sku parse(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                Sku sku = new Sku();
                sku.id = jSONObject.optString("id");
                sku.name = jSONObject.optString("name");
                sku.appPointAmount = jSONObject.optInt("app_point_amount");
                sku.price = jSONObject.optString("price");
                sku.currencyAmount = (float) jSONObject.optDouble("currency_amount");
                sku.currency = jSONObject.optString("currency");
                sku.rebateCardId = jSONObject.optLong("rebate_card_id", 0L);
                sku.appItemId = jSONObject.optLong("app_item_id", 0L);
                sku.subscription = Sub.parse(jSONObject.optJSONObject("subscription"));
                return sku;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static List<Sku> parseList(JSONArray jSONArray) {
                ArrayList arrayList = new ArrayList();
                if (jSONArray == null) {
                    return arrayList;
                }
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    Sku sku = parse(jSONArray.optJSONObject(i2));
                    if (sku != null) {
                        arrayList.add(sku);
                    }
                }
                return arrayList;
            }
        }

        private Channel() {
        }

        private static Channel parse(JSONObject jSONObject) {
            Channel channel = new Channel();
            if (jSONObject == null) {
                return channel;
            }
            channel.id = jSONObject.optString("id");
            channel.info = Info.parse(jSONObject.optJSONObject("info"));
            channel.items = Sku.parseList(jSONObject.optJSONArray("items"));
            return channel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static List<Channel> parseList(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray == null) {
                return arrayList;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(parse(jSONArray.optJSONObject(i2)));
            }
            return arrayList;
        }
    }

    private static class Promo implements Serializable {
        private float appPointBonus;
        private long id;
        private boolean isOnAllItems;
        private boolean isOneTimePromo;
        private Map<String, Set<String>> targetItems = new HashMap();

        private Promo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasItem(String str, String str2) {
            Set<String> set;
            if (this.targetItems.containsKey(str) && (set = this.targetItems.get(str)) != null) {
                return set.contains(str2);
            }
            return false;
        }

        private static Promo parse(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            Promo promo = new Promo();
            promo.id = jSONObject.optLong("id");
            promo.appPointBonus = (float) jSONObject.optDouble("app_point_bonus");
            promo.isOnAllItems = jSONObject.optBoolean("is_on_all_items");
            promo.isOneTimePromo = jSONObject.optBoolean("is_one_time_promo");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("target_items");
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObjectOptJSONObject.opt(next);
                if (objOpt instanceof JSONArray) {
                    HashSet hashSet = new HashSet();
                    promo.targetItems.put(next, hashSet);
                    JSONArray jSONArray = (JSONArray) objOpt;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        hashSet.add(jSONArray.optString(i2));
                    }
                }
            }
            return promo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static List<Promo> parseList(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray == null) {
                return arrayList;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Promo promo = parse(jSONArray.optJSONObject(i2));
                if (promo != null) {
                    arrayList.add(promo);
                }
            }
            return arrayList;
        }
    }

    private static class Subscription implements Serializable {
        private Map<String, Item> channels;

        private static class Item implements Serializable {
            private Map<String, Info> info;

            private static class Info implements Serializable {
                private long gracePeriodExpire;
                private long lastPaymentTime;
                private long onHoldSince;
                private int status;

                private Info() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Info parse(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        return null;
                    }
                    Info info = new Info();
                    info.status = jSONObject.optInt("status", -1);
                    info.lastPaymentTime = jSONObject.optLong("last_payment_time", 0L);
                    info.gracePeriodExpire = jSONObject.optLong("grace_period_expire", 0L);
                    info.onHoldSince = jSONObject.optLong("on_hold_since", 0L);
                    return info;
                }
            }

            private Item() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Item parse(JSONObject jSONObject) {
                Info info;
                if (jSONObject == null) {
                    return null;
                }
                Item item = new Item();
                item.info = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if ((objOpt instanceof JSONObject) && (info = Info.parse((JSONObject) objOpt)) != null) {
                        item.info.put(next, info);
                    }
                }
                return item;
            }
        }

        private Subscription() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Item.Info get(String str, String str2) {
            Item item;
            Map<String, Item> map = this.channels;
            if (map == null || !map.containsKey(str) || (item = this.channels.get(str)) == null || item.info == null || !item.info.containsKey(str2)) {
                return null;
            }
            return (Item.Info) item.info.get(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Subscription parse(JSONObject jSONObject) {
            Item item;
            if (jSONObject == null) {
                return null;
            }
            Subscription subscription = new Subscription();
            subscription.channels = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if ((objOpt instanceof JSONObject) && (item = Item.parse((JSONObject) objOpt)) != null) {
                    subscription.channels.put(next, item);
                }
            }
            return subscription;
        }
    }

    public static Pricing parse(JSONObject jSONObject) {
        Pricing pricing = new Pricing();
        if (jSONObject == null) {
            return pricing;
        }
        App app = App.parse(jSONObject.optJSONObject("app"));
        List<Promo> list = Promo.parseList(jSONObject.optJSONArray("promos"));
        Subscription subscription = Subscription.parse(jSONObject.optJSONObject("subscriptions"));
        List<Channel> list2 = Channel.parseList(jSONObject.optJSONArray("channels"));
        List<RebateOptionItem> list3 = RebateOptionItem.parseList(jSONObject.optJSONArray("rebates"));
        List<GGPaymentAppItem> list4 = GGPaymentAppItem.parseList(jSONObject.optJSONArray("app_items"));
        pricing.app = app;
        pricing.promoList = list;
        pricing.subscription = subscription;
        pricing.channels = list2;
        pricing.rebates = list3;
        pricing.appItems = list4;
        return pricing;
    }

    static List<GGPayment.PaymentChannel> toPaymentChannelList(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return toPaymentChannelList(new JSONObject(str));
        } catch (JSONException e) {
            a.b(e);
            return null;
        }
    }

    private static List<GGPayment.PaymentChannel> toPaymentChannelList(JSONObject jSONObject) {
        long j2;
        long j3;
        long j4;
        int i2;
        Subscription.Item.Info info;
        if (jSONObject == null) {
            return null;
        }
        Pricing pricing = parse(jSONObject);
        App app = pricing.app;
        List<Promo> list = pricing.promoList;
        Subscription subscription = pricing.subscription;
        List<Channel> list2 = pricing.channels;
        d dVar = new d();
        List<RebateOptionItem> list3 = pricing.rebates;
        if (list3 != null) {
            for (RebateOptionItem rebateOptionItem : list3) {
                dVar.a(rebateOptionItem.rebateId, rebateOptionItem);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Channel> it = list2.iterator();
        while (it.hasNext()) {
            Channel next = it.next();
            GGPayment.PaymentChannel paymentChannel = new GGPayment.PaymentChannel();
            paymentChannel.setChannelId(next.id);
            paymentChannel.setName(next.info.name);
            paymentChannel.setIconUrl(next.info.icon);
            paymentChannel.setDescription(next.info.description);
            paymentChannel.setFlag(next.info.flag);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = next.items.iterator();
            while (it2.hasNext()) {
                Channel.Sku sku = (Channel.Sku) it2.next();
                String str = sku.name;
                String str2 = app.pointIcon;
                String str3 = sku.id;
                Integer numValueOf = Integer.valueOf(sku.appPointAmount);
                String str4 = sku.price;
                paymentChannel = paymentChannel;
                ArrayList arrayList3 = arrayList2;
                long j5 = sku.rebateCardId;
                it = it;
                d dVar2 = dVar;
                long j6 = sku.appItemId;
                Iterator<Promo> it3 = list.iterator();
                int i3 = 0;
                int i4 = 0;
                while (it3.hasNext()) {
                    list = list;
                    Promo next2 = it3.next();
                    it2 = it2;
                    it3 = it3;
                    if (next2.hasItem(next.id, sku.id) || next2.isOnAllItems) {
                        Channel.Sku sku2 = sku;
                        int iCeil = (int) Math.ceil((sku.appPointAmount * next2.appPointBonus) / 100.0f);
                        i3 += iCeil;
                        if (next2.isOneTimePromo) {
                            i4 += iCeil;
                        }
                        sku = sku2;
                    }
                }
                list = list;
                it2 = it2;
                Channel.Sku sku3 = sku;
                GGPayment.Denomination denomination = new GGPayment.Denomination(str, str3, numValueOf.intValue(), str2, str4, i3 > 0, i3, i4);
                denomination.setRebateId(j5);
                denomination.setAppItemId(j6);
                denomination.setPointName(app.pointName);
                if (sku3.subscription != null) {
                    if (subscription == null || (info = subscription.get(next.id, sku3.id)) == null) {
                        j2 = 0;
                        j3 = 0;
                        j4 = 0;
                        i2 = -1;
                    } else {
                        i2 = info.status;
                        j2 = info.lastPaymentTime;
                        j3 = info.gracePeriodExpire;
                        j4 = info.onHoldSince;
                    }
                    denomination.setSubscription(new GGPayment.Denomination.Subscription(sku3.subscription.period, i2, j2, j3, sku3.subscription.introPrice, sku3.subscription.introCycle, sku3.subscription.introCurrencyAmount, j4));
                }
                dVar = dVar2;
                RebateOptionItem rebateOptionItem2 = (RebateOptionItem) dVar.h(j5);
                if (rebateOptionItem2 != null) {
                    if (rebateOptionItem2.validToPurchase) {
                        denomination.setName(rebateOptionItem2.name);
                    } else {
                        arrayList2 = arrayList3;
                    }
                }
                arrayList3.add(denomination);
                arrayList2 = arrayList3;
            }
            List<Promo> list4 = list;
            GGPayment.PaymentChannel paymentChannel2 = paymentChannel;
            paymentChannel2.setItems(arrayList2);
            arrayList.add(paymentChannel2);
            dVar = dVar;
            it = it;
            list = list4;
        }
        return arrayList;
    }
}
