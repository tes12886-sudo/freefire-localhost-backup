package com.voxelbusters.androidlib.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.voxelbusters.androidlib.c.i;
import com.voxelbusters.androidlib.c.k;

/* JADX INFO: loaded from: classes.dex */
public class c implements i {
    private com.voxelbusters.androidlib.c.e a;
    private k b;
    private ScreenRecordingService c;
    private Context d;
    private boolean e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f1661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Intent f1662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f1665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ServiceConnection f1666l = new a();

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("RecorderController", "On recording service connected!");
            c.this.c = ((ScreenRecordingService.f) iBinder).a();
            String str = c.this.f1664j;
            if (str == null || str.equals("")) {
                str = com.voxelbusters.androidlib.d.b.k(c.this.d, false) + "/" + System.currentTimeMillis() + ".mp4";
            }
            c.this.c.p(c.this.a, c.this.b, c.this);
            c.this.c.t(-1, c.this.f1662h, str, c.this.e, c.this.f, c.this.f1661g, c.this.f1663i, c.this.f1665k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("RecorderController", "On recording service disconnected!");
            c.this.c = null;
        }
    }

    public c(Context context, com.voxelbusters.androidlib.c.e eVar, k kVar) {
        this.d = context;
        this.a = eVar;
        this.b = kVar;
    }

    private void o() {
        Log.d("RecorderController", "Binding recording service...");
        this.d.bindService(new Intent(this.d, (Class<?>) ScreenRecordingService.class), this.f1666l, 1);
    }

    private void s() {
        Log.d("RecorderController", "Unbinding recording service...");
        this.d.unbindService(this.f1666l);
        this.c = null;
    }

    @Override // com.voxelbusters.androidlib.c.i
    public void a() {
        Log.d("RecorderController", "Service Task Started!");
    }

    @Override // com.voxelbusters.androidlib.c.i
    public void b() {
        Log.d("RecorderController", "Service Task ended!");
        ScreenRecordingService screenRecordingService = this.c;
        if (screenRecordingService != null) {
            this.f1664j = screenRecordingService.n();
            Log.d("RecorderController", "Recording is available at path : " + this.f1664j);
            s();
        }
    }

    public boolean p() {
        return this.c != null;
    }

    public void q(String str, boolean z, int i2, float f, Intent intent, boolean z2, String str2) {
        this.f1664j = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.d.startForegroundService(new Intent(this.d, (Class<?>) ScreenRecordingService.class));
        }
        this.e = z;
        this.f = i2;
        this.f1661g = f;
        this.f1662h = intent;
        this.f1663i = z2;
        this.f1665k = str2;
        o();
    }

    public void r() {
        ScreenRecordingService screenRecordingService = this.c;
        if (screenRecordingService != null) {
            screenRecordingService.v();
            return;
        }
        Log.d("RecorderController", "Screen recording service is null. This means you don't have any active recording yet!");
        com.voxelbusters.androidlib.c.e eVar = this.a;
        if (eVar != null) {
            eVar.onRecordingFailed("Screen recording service is null. This means you don't have any active recording yet!");
        }
    }
}
