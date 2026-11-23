package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static Intent AFInAppEventParameterName;
    static final int AFInAppEventType = (int) TimeUnit.SECONDS.toMillis(2);
    static String[] AFKeystoreWrapper;
    private static i AFVersionDeclaration;
    static String[] AppsFlyer2dXConversionCallback;
    static volatile boolean values;
    public String AFLogger$LogLevel;
    public Map<String, String> getLevel;
    public List<List<String>> init = new ArrayList();
    public DeepLinkListener valueOf;

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    private boolean AFInAppEventParameterName(Intent intent, Context context, Map<String, Object> map) {
        String string;
        Uri uriValueOf;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = AFInAppEventParameterName;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        Bundle extras = intent.getExtras();
        List<List<String>> list = this.init;
        if (list != null && !list.isEmpty() && extras != null) {
            for (List<String> list2 : this.init) {
                if (list2 == null) {
                    uriValueOf = null;
                } else {
                    Iterator<String> it = list2.iterator();
                    if (it.hasNext() && (string = extras.getString(it.next())) != null) {
                        uriValueOf = valueOf(string, it);
                    } else {
                        uriValueOf = null;
                    }
                }
                if (uriValueOf != null) {
                    StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                    sb.append(list2.toString());
                    AFLogger.AFInAppEventType(sb.toString());
                    ai.valueOf(map).put("payloadKey", this.init);
                    uri = uriValueOf;
                    break;
                }
            }
        }
        if (data != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                AFKeystoreWrapper(context, map, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.valueOf(sb2.toString());
            return false;
        }
        if (data2 != null) {
            if (!AFInAppEventParameterName.hasExtra("af_consumed")) {
                AFInAppEventParameterName.putExtra("af_consumed", System.currentTimeMillis());
                AFKeystoreWrapper(context, map, data2);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb3.append(data2.toString());
            sb3.append(" w/af_consumed");
            AFLogger.valueOf(sb3.toString());
            return false;
        }
        if (uri == null) {
            AFLogger.AFInAppEventType("No deep link detected");
            return false;
        }
        if (!intent.hasExtra("af_consumed")) {
            intent.putExtra("af_consumed", System.currentTimeMillis());
            AFKeystoreWrapper(context, map, uri);
            return true;
        }
        StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb4.append(uri.toString());
        sb4.append(" w/af_consumed");
        AFLogger.valueOf(sb4.toString());
        return false;
    }

    static Uri AFKeystoreWrapper(Intent intent) {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        return intent.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(Arrays.asList(AFKeystoreWrapper));
        AFLogger.AFInAppEventParameterName(sb.toString());
        try {
            return Arrays.asList(AFKeystoreWrapper).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    private Uri valueOf(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public static i values() {
        if (AFVersionDeclaration == null) {
            AFVersionDeclaration = new i();
        }
        return AFVersionDeclaration;
    }

    final void AFKeystoreWrapper(final Context context, final Map<String, Object> map, final Uri uri) {
        if (AFKeystoreWrapper(uri.toString())) {
            values = true;
            if (k.values == null) {
                k.values = new k();
            }
            k kVar = k.values;
            if (kVar.AFInAppEventParameterName == null) {
                kVar.AFInAppEventParameterName = Executors.newSingleThreadScheduledExecutor(kVar.AFInAppEventType);
            }
            kVar.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.i.2
                private static Map<String, Object> values(Uri uri2) {
                    HashMap map2 = new HashMap();
                    try {
                        StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                        sb.append(uri2.toString());
                        AFLogger.AFInAppEventType(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri2.toString()).openConnection();
                        httpURLConnection.setInstanceFollowRedirects(false);
                        int i2 = i.AFInAppEventType;
                        httpURLConnection.setReadTimeout(i2);
                        httpURLConnection.setConnectTimeout(i2);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.4.0");
                        int responseCode = httpURLConnection.getResponseCode();
                        map2.put("status", Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            map2.put("res", httpURLConnection.getHeaderField("Location"));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.AFInAppEventType("ESP deeplink resolving is finished");
                    } catch (Throwable th) {
                        map2.put("error", th.getLocalizedMessage());
                        AFLogger.valueOf(th.getMessage(), th);
                    }
                    return map2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String string = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    Integer num = null;
                    String str = null;
                    int i2 = 0;
                    while (i2 < 5) {
                        Map<String, Object> mapValues = values(Uri.parse(string));
                        String str2 = (String) mapValues.get("res");
                        Integer num2 = (Integer) mapValues.get("status");
                        String str3 = (String) mapValues.get("error");
                        if (str2 == null || !i.AFKeystoreWrapper(str2)) {
                            str = str3;
                            string = str2;
                            num = num2;
                            break;
                        } else {
                            if (i2 < 4) {
                                arrayList.add(str2);
                            }
                            i2++;
                            str = str3;
                            string = str2;
                            num = num2;
                        }
                    }
                    HashMap map2 = new HashMap();
                    map2.put("res", string != null ? string : "");
                    map2.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
                    if (str != null) {
                        map2.put("error", str);
                    }
                    if (!arrayList.isEmpty()) {
                        map2.put("redirects", arrayList);
                    }
                    map2.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    synchronized (map) {
                        map.put("af_deeplink_r", map2);
                        map.put("af_deeplink", uri.toString());
                    }
                    ai.valueOf().valueOf(context, map, string != null ? Uri.parse(string) : uri);
                    i.values = false;
                }
            });
        } else {
            ai.valueOf().valueOf(context, map, uri);
        }
        AFInAppEventParameterName = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    final void AFKeystoreWrapper(Map<String, Object> map, au auVar, Intent intent, Context context) {
        DeepLinkResult.Error error;
        SharedPreferences sharedPreferencesValues = ai.values(context);
        if (!AFInAppEventParameterName(intent, context, map) && this.valueOf != null) {
            ai.valueOf();
            if (ai.AFInAppEventParameterName(sharedPreferencesValues, "appsFlyerCount", false) == 0 && !sharedPreferencesValues.getBoolean("ddl_sent", false)) {
                final ar arVar = new ar(context, auVar);
                AFLogger.AFInAppEventType("[DDL] start");
                FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() { // from class: com.appsflyer.internal.ar.5
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ DeepLinkResult call() {
                        Application application = ar.this.valueOf;
                        ar.AFInAppEventType(ar.this);
                        ar.this.AFInAppEventType(application);
                        return ar.AFInAppEventType(ar.this, application);
                    }
                });
                new Thread(futureTask).start();
                try {
                    arVar.valueOf((DeepLinkResult) futureTask.get(ar.onInstallConversionDataLoadedNative, TimeUnit.MILLISECONDS));
                } catch (InterruptedException e) {
                    e = e;
                    AFLogger.values("[DDL] Error occurred", e);
                    if (e.getCause() instanceof IOException) {
                        error = DeepLinkResult.Error.NETWORK;
                    } else {
                        error = DeepLinkResult.Error.UNEXPECTED;
                    }
                    arVar.valueOf(new DeepLinkResult(null, error));
                } catch (ExecutionException e2) {
                    e = e2;
                    AFLogger.values("[DDL] Error occurred", e);
                    if (e.getCause() instanceof IOException) {
                        error = DeepLinkResult.Error.NETWORK;
                    } else {
                        error = DeepLinkResult.Error.UNEXPECTED;
                    }
                    arVar.valueOf(new DeepLinkResult(null, error));
                } catch (TimeoutException unused) {
                    StringBuilder sb = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
                    sb.append(arVar.onInstallConversionFailureNative);
                    sb.append(" attempt(s) within ");
                    sb.append(ar.onInstallConversionDataLoadedNative);
                    sb.append(" milliseconds");
                    AFLogger.AFInAppEventType(sb.toString());
                    arVar.valueOf(new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT));
                }
            }
        }
        sharedPreferencesValues.edit().putBoolean("ddl_sent", true).apply();
    }
}
