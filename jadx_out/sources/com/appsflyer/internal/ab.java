package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ab {
    private static final BitSet AFLogger$LogLevel;
    private static final Handler AppsFlyer2dXConversionCallback;
    private static volatile ab init;
    final Object AFInAppEventParameterName = new Object();
    final Handler AFInAppEventType;
    final Runnable AFKeystoreWrapper;
    final Executor AFVersionDeclaration;
    final Runnable getLevel;
    private final SensorManager onAppOpenAttributionNative;
    private long onAttributionFailure;
    private final Map<w, Map<String, Object>> onAttributionFailureNative;
    private final Runnable onDeepLinking;
    private final Map<w, w> onDeepLinkingNative;
    private int onInstallConversionDataLoadedNative;
    private boolean onInstallConversionFailureNative;
    final Runnable valueOf;
    boolean values;

    /* JADX INFO: renamed from: com.appsflyer.internal.ab$6, reason: invalid class name */
    final class AnonymousClass6 implements Runnable {
        AnonymousClass6() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!ab.this.onDeepLinkingNative.isEmpty()) {
                    for (w wVar : ab.this.onDeepLinkingNative.values()) {
                        ab.this.onAppOpenAttributionNative.unregisterListener(wVar);
                        wVar.values(ab.this.onAttributionFailureNative, true);
                    }
                }
            } catch (Throwable unused) {
            }
            ab.this.onInstallConversionDataLoadedNative = 0;
            ab.this.onInstallConversionFailureNative = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        AFLogger$LogLevel = bitSet;
        AppsFlyer2dXConversionCallback = new Handler(Looper.getMainLooper());
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private ab(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = AFLogger$LogLevel;
        this.onDeepLinkingNative = new HashMap(bitSet.size());
        this.onAttributionFailureNative = new ConcurrentHashMap(bitSet.size());
        this.valueOf = new Runnable() { // from class: com.appsflyer.internal.ab.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ab.this.AFInAppEventParameterName) {
                    final ab abVar = ab.this;
                    abVar.AFVersionDeclaration.execute(new Runnable() { // from class: com.appsflyer.internal.ab.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : ab.this.onAppOpenAttributionNative.getSensorList(-1)) {
                                    if (ab.AFInAppEventParameterName(sensor.getType())) {
                                        w wVar = new w(sensor, ab.this.AFVersionDeclaration);
                                        if (!ab.this.onDeepLinkingNative.containsKey(wVar)) {
                                            ab.this.onDeepLinkingNative.put(wVar, wVar);
                                        }
                                        ab.this.onAppOpenAttributionNative.registerListener((SensorEventListener) ab.this.onDeepLinkingNative.get(wVar), sensor, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            ab.this.onInstallConversionFailureNative = true;
                        }
                    });
                    ab abVar2 = ab.this;
                    abVar2.AFInAppEventType.postDelayed(abVar2.onDeepLinking, 100L);
                    ab.this.values = true;
                }
            }
        };
        this.AFKeystoreWrapper = new Runnable() { // from class: com.appsflyer.internal.ab.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ab.this.AFInAppEventParameterName) {
                    ab abVar = ab.this;
                    abVar.AFVersionDeclaration.execute(abVar.new AnonymousClass6());
                }
            }
        };
        this.getLevel = new Runnable() { // from class: com.appsflyer.internal.ab.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ab.this.AFInAppEventParameterName) {
                    ab abVar = ab.this;
                    if (abVar.values) {
                        abVar.AFInAppEventType.removeCallbacks(abVar.valueOf);
                        ab abVar2 = ab.this;
                        abVar2.AFInAppEventType.removeCallbacks(abVar2.AFKeystoreWrapper);
                        ab abVar3 = ab.this;
                        abVar3.AFVersionDeclaration.execute(abVar3.new AnonymousClass6());
                        ab.this.values = false;
                    }
                }
            }
        };
        this.onInstallConversionDataLoadedNative = 1;
        this.onAttributionFailure = 0L;
        this.onDeepLinking = new Runnable() { // from class: com.appsflyer.internal.ab.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ab.this.AFInAppEventParameterName) {
                    if (ab.this.onInstallConversionDataLoadedNative == 0) {
                        ab.this.onInstallConversionDataLoadedNative = 1;
                    }
                    ab abVar = ab.this;
                    abVar.AFInAppEventType.postDelayed(abVar.AFKeystoreWrapper, ((long) abVar.onInstallConversionDataLoadedNative) * 500);
                }
            }
        };
        this.AFVersionDeclaration = Executors.newSingleThreadExecutor();
        this.onAppOpenAttributionNative = sensorManager;
        this.AFInAppEventType = handler;
    }

    private static ab AFInAppEventParameterName(SensorManager sensorManager, Handler handler) {
        if (init == null) {
            synchronized (ab.class) {
                if (init == null) {
                    init = new ab(sensorManager, handler);
                }
            }
        }
        return init;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFInAppEventParameterName(int i2) {
        return i2 >= 0 && AFLogger$LogLevel.get(i2);
    }

    static ab AFKeystoreWrapper(Context context) {
        return init != null ? init : AFInAppEventParameterName((SensorManager) context.getApplicationContext().getSystemService("sensor"), AppsFlyer2dXConversionCallback);
    }

    final List<Map<String, Object>> AFInAppEventType() {
        Iterator<w> it = this.onDeepLinkingNative.values().iterator();
        while (it.hasNext()) {
            it.next().values(this.onAttributionFailureNative, true);
        }
        Map<w, Map<String, Object>> map = this.onAttributionFailureNative;
        return (map == null || map.isEmpty()) ? new CopyOnWriteArrayList(Collections.emptyList()) : new CopyOnWriteArrayList(this.onAttributionFailureNative.values());
    }

    final void valueOf() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.onAttributionFailure;
        if (j2 != 0) {
            this.onInstallConversionDataLoadedNative++;
            if (j2 - jCurrentTimeMillis < 500) {
                this.AFInAppEventType.removeCallbacks(this.AFKeystoreWrapper);
            }
            this.onAttributionFailure = jCurrentTimeMillis;
        }
        this.AFInAppEventType.post(this.getLevel);
        this.AFInAppEventType.post(this.valueOf);
        this.onAttributionFailure = jCurrentTimeMillis;
    }

    final List<Map<String, Object>> values() {
        synchronized (this.AFInAppEventParameterName) {
            if (!this.onDeepLinkingNative.isEmpty() && this.onInstallConversionFailureNative) {
                Iterator<w> it = this.onDeepLinkingNative.values().iterator();
                while (it.hasNext()) {
                    it.next().values(this.onAttributionFailureNative, false);
                }
            }
            if (this.onAttributionFailureNative.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.onAttributionFailureNative.values());
        }
    }
}
