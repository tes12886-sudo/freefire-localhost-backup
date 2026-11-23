package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.compat.function.Consumer;
import com.appsflyer.compat.function.Function;
import j.c.a.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class av implements Runnable {
    private bh AFInAppEventParameterName;
    com.android.billingclient.api.d AFInAppEventType;
    public final bd AFKeystoreWrapper;
    private final bg AFVersionDeclaration;
    final ba valueOf;
    public final ExecutorService values;

    public av(bd bdVar, bh bhVar, ba baVar, ExecutorService executorService, bg bgVar) {
        this.AFKeystoreWrapper = bdVar;
        this.AFInAppEventParameterName = bhVar;
        this.valueOf = baVar;
        this.values = executorService;
        this.AFVersionDeclaration = bgVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d6 A[LOOP:0: B:22:0x00d0->B:24:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0134  */
    /* JADX WARN: Code duplicated, block: B:29:0x013f  */
    static /* synthetic */ void AFKeystoreWrapper(av avVar, final boolean z, List list) {
        boolean z2;
        ac acVar;
        HashMap map;
        String string;
        HashMap map2;
        String str;
        String str2;
        ArrayList arrayList;
        bi biVar;
        bk<String> bkVar;
        final ad adVarValueOf = avVar.AFKeystoreWrapper.valueOf();
        if (adVarValueOf != null) {
            z2 = adVarValueOf.init;
            Function<List<Purchase>, Map<String, String>> function = adVarValueOf.values;
            Map<String, String> mapApply = function != null ? function.apply(list) : null;
            acVar = new ac(z2, z, list, mapApply);
            bg bgVar = avVar.AFVersionDeclaration;
            map = new HashMap();
            map.put("app_id", bgVar.valueOf.valueOf.getPackageName());
            string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
            if (string != null) {
                map.put("cuid", string);
            }
            Context context = bgVar.valueOf.valueOf;
            map.put("app_version_name", ac.values(context, context.getPackageName()));
            map2 = new HashMap();
            c.d.b bVarAFInAppEventType = ad.AFInAppEventType(bgVar.valueOf.valueOf, new HashMap());
            str = bVarAFInAppEventType != null ? bVarAFInAppEventType.values : null;
            if (str != null) {
                map2.put("advertising_id", str);
            }
            map2.put("appsflyer_id", ak.AFInAppEventParameterName((WeakReference<Context>) new WeakReference(bgVar.valueOf.valueOf)));
            StringBuilder sb = new StringBuilder();
            sb.append(Build.VERSION.SDK_INT);
            map2.put("os_version", sb.toString());
            map2.put("sdk_version", ai.valueOf);
            map.put("device_data", map2);
            map.put("is_cached", Boolean.valueOf(acVar.AFInAppEventType()));
            if (acVar.AFKeystoreWrapper()) {
                str2 = "SANDBOX";
            } else {
                str2 = "PRODUCTION";
            }
            map.put("environment", str2);
            map.put("additional_parameters", acVar.AFInAppEventParameterName);
            arrayList = new ArrayList();
            for (Purchase purchase : acVar.AFInAppEventType) {
                HashMap map3 = new HashMap();
                map3.put(a.EXTRA_TOKEN, purchase.e());
                map3.put("subscription_id", purchase.getSku());
                arrayList.add(map3);
            }
            map.put("subscriptions", arrayList);
            v vVar = new v("https://ars.appsflyer.com/api/v1/android/validate_subscription", new JSONObject(map).toString().getBytes(), "POST", Collections.emptyMap());
            y yVar = bgVar.AFInAppEventParameterName;
            biVar = new bi(vVar, yVar.AFKeystoreWrapper, yVar.AFInAppEventType, new bl());
            bkVar = new bk<String>() { // from class: com.appsflyer.internal.av.1
                @Override // com.appsflyer.internal.bk
                public final void valueOf(bm<String> bmVar) {
                    Consumer<String> consumer;
                    Consumer<String> consumer2;
                    if (!bmVar.valueOf()) {
                        ad adVar = adVarValueOf;
                        if (adVar == null || (consumer = adVar.valueOf) == null) {
                            return;
                        }
                        consumer.accept(bmVar.AFKeystoreWrapper);
                        return;
                    }
                    if (z) {
                        av.this.valueOf.AFKeystoreWrapper("ars_history_sent");
                    }
                    ad adVar2 = adVarValueOf;
                    if (adVar2 == null || (consumer2 = adVar2.AFInAppEventType) == null) {
                        return;
                    }
                    consumer2.accept(bmVar.AFKeystoreWrapper);
                }

                @Override // com.appsflyer.internal.bk
                public final void valueOf(Throwable th) {
                    Consumer<String> consumer;
                    ad adVar = adVarValueOf;
                    if (adVar != null && (consumer = adVar.valueOf) != null) {
                        consumer.accept(th.getMessage());
                    }
                    AFLogger.valueOf(th);
                }
            };
            if (!biVar.AFInAppEventParameterName.getAndSet(true)) {
                throw new IllegalStateException("Http call is already executed");
            }
            biVar.values.submit(new Runnable() { // from class: com.appsflyer.internal.bi.1
                private /* synthetic */ bk AFInAppEventType;

                public AnonymousClass1() {
                    bkVar = bkVar;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    try {
                        bi biVar2 = bi.this;
                        bm<String> bmVarValueOf = biVar2.AFInAppEventType.valueOf(biVar2.valueOf);
                        bkVar.valueOf(new bm(bi.this.AFKeystoreWrapper.AFInAppEventType(bmVarValueOf.AFKeystoreWrapper), bmVarValueOf.AFInAppEventParameterName, bmVarValueOf.valueOf()));
                    } catch (IOException e) {
                        bkVar.valueOf(e);
                    }
                }
            });
        }
        z2 = false;
        acVar = new ac(z2, z, list, mapApply);
        bg bgVar2 = avVar.AFVersionDeclaration;
        map = new HashMap();
        map.put("app_id", bgVar2.valueOf.valueOf.getPackageName());
        string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            map.put("cuid", string);
        }
        Context context2 = bgVar2.valueOf.valueOf;
        map.put("app_version_name", ac.values(context2, context2.getPackageName()));
        map2 = new HashMap();
        c.d.b bVarAFInAppEventType2 = ad.AFInAppEventType(bgVar2.valueOf.valueOf, new HashMap());
        if (bVarAFInAppEventType2 != null) {
        }
        if (str != null) {
            map2.put("advertising_id", str);
        }
        map2.put("appsflyer_id", ak.AFInAppEventParameterName((WeakReference<Context>) new WeakReference(bgVar2.valueOf.valueOf)));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        map2.put("os_version", sb2.toString());
        map2.put("sdk_version", ai.valueOf);
        map.put("device_data", map2);
        map.put("is_cached", Boolean.valueOf(acVar.AFInAppEventType()));
        if (acVar.AFKeystoreWrapper()) {
            str2 = "SANDBOX";
        } else {
            str2 = "PRODUCTION";
        }
        map.put("environment", str2);
        map.put("additional_parameters", acVar.AFInAppEventParameterName);
        arrayList = new ArrayList();
        while (r3.hasNext()) {
            HashMap map4 = new HashMap();
            map4.put(a.EXTRA_TOKEN, purchase.e());
            map4.put("subscription_id", purchase.getSku());
            arrayList.add(map4);
        }
        map.put("subscriptions", arrayList);
        v vVar2 = new v("https://ars.appsflyer.com/api/v1/android/validate_subscription", new JSONObject(map).toString().getBytes(), "POST", Collections.emptyMap());
        y yVar2 = bgVar2.AFInAppEventParameterName;
        biVar = new bi(vVar2, yVar2.AFKeystoreWrapper, yVar2.AFInAppEventType, new bl());
        bkVar = new bk<String>() { // from class: com.appsflyer.internal.av.1
            @Override // com.appsflyer.internal.bk
            public final void valueOf(bm<String> bmVar) {
                Consumer<String> consumer;
                Consumer<String> consumer2;
                if (!bmVar.valueOf()) {
                    ad adVar = adVarValueOf;
                    if (adVar == null || (consumer = adVar.valueOf) == null) {
                        return;
                    }
                    consumer.accept(bmVar.AFKeystoreWrapper);
                    return;
                }
                if (z) {
                    av.this.valueOf.AFKeystoreWrapper("ars_history_sent");
                }
                ad adVar2 = adVarValueOf;
                if (adVar2 == null || (consumer2 = adVar2.AFInAppEventType) == null) {
                    return;
                }
                consumer2.accept(bmVar.AFKeystoreWrapper);
            }

            @Override // com.appsflyer.internal.bk
            public final void valueOf(Throwable th) {
                Consumer<String> consumer;
                ad adVar = adVarValueOf;
                if (adVar != null && (consumer = adVar.valueOf) != null) {
                    consumer.accept(th.getMessage());
                }
                AFLogger.valueOf(th);
            }
        };
        if (!biVar.AFInAppEventParameterName.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        biVar.values.submit(new Runnable() { // from class: com.appsflyer.internal.bi.1
            private /* synthetic */ bk AFInAppEventType;

            public AnonymousClass1() {
                bkVar = bkVar;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                try {
                    bi biVar2 = bi.this;
                    bm<String> bmVarValueOf = biVar2.AFInAppEventType.valueOf(biVar2.valueOf);
                    bkVar.valueOf(new bm(bi.this.AFKeystoreWrapper.AFInAppEventType(bmVarValueOf.AFKeystoreWrapper), bmVarValueOf.AFInAppEventParameterName, bmVarValueOf.valueOf()));
                } catch (IOException e) {
                    bkVar.valueOf(e);
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.AFInAppEventType == null) {
                bh bhVar = this.AFInAppEventParameterName;
                at atVar = new at(this);
                com.android.billingclient.api.d.a aVarE = com.android.billingclient.api.d.e(bhVar.values);
                aVarE.c(atVar);
                aVarE.b();
                com.android.billingclient.api.d dVarA = aVarE.a();
                this.AFInAppEventType = dVarA;
                dVarA.h(new aw(this));
            }
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.values("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.values("Failed to setup Play billing", th);
        }
    }
}
