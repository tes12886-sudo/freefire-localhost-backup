package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class w implements SensorEventListener {
    long AFInAppEventParameterName;
    double AFKeystoreWrapper;
    private final Executor AFVersionDeclaration;
    private final int AppsFlyer2dXConversionCallback;
    private final String getLevel;
    private final String init;
    private final int valueOf;
    final float[][] AFInAppEventType = new float[2][];
    final long[] values = new long[2];

    w(Sensor sensor, Executor executor) {
        this.AFVersionDeclaration = executor;
        int type = sensor.getType();
        this.valueOf = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.init = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getLevel = str;
        this.AppsFlyer2dXConversionCallback = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    private Map<String, Object> AFInAppEventParameterName() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.valueOf));
        concurrentHashMap.put("sN", this.init);
        concurrentHashMap.put("sV", this.getLevel);
        float[] fArr = this.AFInAppEventType[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", valueOf(fArr));
        }
        float[] fArr2 = this.AFInAppEventType[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", valueOf(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean AFKeystoreWrapper() {
        return this.AFInAppEventType[0] != null;
    }

    private boolean AFKeystoreWrapper(int i2, String str, String str2) {
        return this.valueOf == i2 && this.init.equals(str) && this.getLevel.equals(str2);
    }

    private static List<Float> valueOf(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    static /* synthetic */ double values(float[] fArr, float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i2 = 0; i2 < iMin; i2++) {
            dPow += StrictMath.pow(fArr[i2] - fArr2[i2], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AFKeystoreWrapper(wVar.valueOf, wVar.init, wVar.getLevel);
    }

    public final int hashCode() {
        return this.AppsFlyer2dXConversionCallback;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        final long j2 = sensorEvent.timestamp;
        final float[] fArr = sensorEvent.values;
        this.AFVersionDeclaration.execute(new Runnable() { // from class: com.appsflyer.internal.w.4
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                w wVar = w.this;
                float[][] fArr2 = wVar.AFInAppEventType;
                float[] fArr3 = fArr2[0];
                if (fArr3 == null) {
                    float[] fArr4 = fArr;
                    fArr2[0] = Arrays.copyOf(fArr4, fArr4.length);
                    w.this.values[0] = jCurrentTimeMillis;
                    return;
                }
                float[] fArr5 = fArr2[1];
                if (fArr5 == null) {
                    float[] fArr6 = fArr;
                    float[] fArrCopyOf = Arrays.copyOf(fArr6, fArr6.length);
                    w wVar2 = w.this;
                    wVar2.AFInAppEventType[1] = fArrCopyOf;
                    wVar2.values[1] = jCurrentTimeMillis;
                    wVar2.AFKeystoreWrapper = w.values(fArr3, fArrCopyOf);
                    return;
                }
                long j3 = j2;
                if (50000000 <= j3 - wVar.AFInAppEventParameterName) {
                    wVar.AFInAppEventParameterName = j3;
                    if (Arrays.equals(fArr5, fArr)) {
                        w.this.values[1] = jCurrentTimeMillis;
                        return;
                    }
                    double dValues = w.values(fArr3, fArr);
                    w wVar3 = w.this;
                    if (dValues > wVar3.AFKeystoreWrapper) {
                        float[][] fArr7 = wVar3.AFInAppEventType;
                        float[] fArr8 = fArr;
                        fArr7[1] = Arrays.copyOf(fArr8, fArr8.length);
                        w wVar4 = w.this;
                        wVar4.values[1] = jCurrentTimeMillis;
                        wVar4.AFKeystoreWrapper = dValues;
                    }
                }
            }
        });
    }

    final void values(Map<w, Map<String, Object>> map, boolean z) {
        if (!AFKeystoreWrapper()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, AFInAppEventParameterName());
            return;
        }
        map.put(this, AFInAppEventParameterName());
        if (z) {
            int length = this.AFInAppEventType.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.AFInAppEventType[i2] = null;
            }
            int length2 = this.values.length;
            for (int i3 = 0; i3 < length2; i3++) {
                this.values[i3] = 0;
            }
            this.AFKeystoreWrapper = 0.0d;
            this.AFInAppEventParameterName = 0L;
        }
    }
}
