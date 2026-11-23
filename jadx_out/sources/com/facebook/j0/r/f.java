package com.facebook.j0.r;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements SensorEventListener {
    private a a;

    public interface a {
        void a();
    }

    public final void a(a aVar) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            this.a = aVar;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            i.e(sensor, "sensor");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            i.e(sensorEvent, "event");
            a aVar = this.a;
            if (aVar != null) {
                float[] fArr = sensorEvent.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                Double.isNaN(d);
                Double.isNaN(d);
                Double.isNaN(d2);
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d3);
                if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.3d) {
                    aVar.a();
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
