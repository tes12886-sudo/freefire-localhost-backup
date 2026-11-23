package com.voxelbusters.androidlib.internal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.voxelbusters.androidlib.c.i;
import com.voxelbusters.androidlib.c.k;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ScreenRecordingService extends Service {
    private VirtualDisplay a;
    private MediaRecorder b;
    private MediaProjection c;
    private String d;
    private com.voxelbusters.androidlib.c.e e;
    private k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f1646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f1647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f1648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f1649j = new f();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f1650k = false;

    class a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ float b;
        final /* synthetic */ int c;
        final /* synthetic */ Intent d;
        final /* synthetic */ String e;
        final /* synthetic */ boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1651g;

        a(int i2, float f, int i3, Intent intent, String str, boolean z, boolean z2) {
            this.a = i2;
            this.b = f;
            this.c = i3;
            this.d = intent;
            this.e = str;
            this.f = z;
            this.f1651g = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.voxelbusters.androidlib.b.b bVarB = com.voxelbusters.androidlib.b.b.b(ScreenRecordingService.this, com.voxelbusters.androidlib.internal.e.values()[this.a], this.b);
                if (bVarB == null) {
                    if (ScreenRecordingService.this.e != null) {
                        ScreenRecordingService.this.e.onRecordingFailed("Get RecorderProfile Error");
                        return;
                    }
                    return;
                }
                if (ScreenRecordingService.this.f != null) {
                    ScreenRecordingService.this.f.setVideoBitRate(bVarB.e);
                    ScreenRecordingService.this.f.setVideoFrameRate(bVarB.d);
                }
                ScreenRecordingService.this.q(this.c, this.d);
                ScreenRecordingService.this.r(bVarB, this.e, false, this.f);
                ScreenRecordingService screenRecordingService = ScreenRecordingService.this;
                screenRecordingService.s(bVarB.b, bVarB.c, com.voxelbusters.androidlib.d.b.f(screenRecordingService));
                ScreenRecordingService.this.u(this.f1651g);
                if (ScreenRecordingService.this.f1646g != null) {
                    ScreenRecordingService.this.f1646g.a();
                }
            } catch (Exception e) {
                Log.e("ScreenRecordingService", "Exception : " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    class b implements MediaRecorder.OnInfoListener {
        b() {
        }

        @Override // android.media.MediaRecorder.OnInfoListener
        public void onInfo(MediaRecorder mediaRecorder, int i2, int i3) {
            Log.e("ScreenRecorderFragment", "onInfo - what : " + i2 + " extra : " + i3);
            if (i2 == 800) {
                ScreenRecordingService.this.v();
            }
        }
    }

    class c implements MediaRecorder.OnErrorListener {
        c() {
        }

        @Override // android.media.MediaRecorder.OnErrorListener
        public void onError(MediaRecorder mediaRecorder, int i2, int i3) {
            Log.e("ScreenRecorderFragment", "onError - what : " + i2 + " extra : " + i3);
            ScreenRecordingService.this.o("UNKNOWN");
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ScreenRecordingService.this.w();
            if (ScreenRecordingService.this.e != null) {
                ScreenRecordingService.this.e.onRecordingStopped();
                ScreenRecordingService.this.e.onRecordingAvailable(ScreenRecordingService.this.d);
            }
            ScreenRecordingService.this.l();
        }
    }

    private class e extends MediaProjection.Callback {
        private e() {
        }

        /* synthetic */ e(ScreenRecordingService screenRecordingService, a aVar) {
            this();
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            Log.d("ScreenRecordingService", "Media recorder stopped");
            ScreenRecordingService.this.l();
        }
    }

    public class f extends Binder {
        public f() {
        }

        public ScreenRecordingService a() {
            return ScreenRecordingService.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Log.d("ScreenRecordingService", "Screen recording cleanup");
        MediaRecorder mediaRecorder = this.b;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.b.release();
            this.b = null;
            VirtualDisplay virtualDisplay = this.a;
            if (virtualDisplay != null) {
                virtualDisplay.release();
                this.a = null;
            }
            MediaProjection mediaProjection = this.c;
            if (mediaProjection != null) {
                mediaProjection.unregisterCallback(this.f1648i);
                this.c.stop();
                this.c = null;
            }
        }
        i iVar = this.f1646g;
        if (iVar != null) {
            iVar.b();
        }
        stopForeground(true);
        stopSelf();
    }

    private Notification m() {
        NotificationChannel notificationChannel = new NotificationChannel("Screen Recording Service Channel Id", "Screen Recording Service Channel", 1);
        notificationChannel.setLockscreenVisibility(0);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager == null) {
            return null;
        }
        notificationManager.createNotificationChannel(notificationChannel);
        int identifier = getResources().getIdentifier("replaykit_service_icon", "raw", getPackageName());
        Log.d("Icon id : ", "" + identifier);
        return new Notification.Builder(this, "Screen Recording Service Channel Id").setCategory("service").setSmallIcon(identifier).setContentTitle(this.f1647h).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        if (this.f1650k) {
            w();
        }
        com.voxelbusters.androidlib.c.e eVar = this.e;
        if (eVar != null) {
            eVar.onRecordingFailed(str);
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i2, Intent intent) {
        Log.d("ScreenRecordingService", "Setup media projection");
        this.f1648i = new e(this, null);
        MediaProjection mediaProjection = ((MediaProjectionManager) getSystemService("media_projection")).getMediaProjection(i2, intent);
        this.c = mediaProjection;
        mediaProjection.registerCallback(this.f1648i, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(com.voxelbusters.androidlib.b.b bVar, String str, boolean z, boolean z2) throws IOException {
        Log.d("ScreenRecordingService", "Setup media recorder");
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.b = mediaRecorder;
        mediaRecorder.setOnInfoListener(new b());
        this.b.setOnErrorListener(new c());
        com.voxelbusters.androidlib.d.b.o(str);
        this.d = str;
        this.b.setOutputFile(str);
        if (z) {
            this.b.setAudioSource(z2 ? 5 : 6);
        }
        this.b.setVideoSource(2);
        this.b.setOutputFormat(2);
        this.b.setVideoEncodingBitRate(bVar.e);
        this.b.setVideoEncoder(2);
        this.b.setVideoFrameRate(bVar.d);
        this.b.setVideoSize(bVar.b, bVar.c);
        if (z) {
            this.b.setAudioChannels(2);
            this.b.setAudioEncodingBitRate(128000);
            this.b.setAudioSamplingRate(96000);
            this.b.setAudioEncoder(3);
        }
        this.b.prepare();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i2, int i3, int i4) {
        Log.d("ScreenRecordingService", "Setup virtual display  width= " + i2 + "  height = " + i3);
        this.a = this.c.createVirtualDisplay("Screen Recording", i2, i3, i4, 18, this.b.getSurface(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(boolean z) {
        Log.d("ScreenRecordingService", "Start recording");
        this.b.start();
        this.f1650k = true;
        com.voxelbusters.androidlib.c.e eVar = this.e;
        if (eVar != null) {
            eVar.onRecordingStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        MediaRecorder mediaRecorder = this.b;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public String n() {
        return this.d;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1649j;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(1, m(), 32);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.d("ScreenRecordingService", "Destroying service");
    }

    public void p(com.voxelbusters.androidlib.c.e eVar, k kVar, i iVar) {
        this.e = eVar;
        this.f = kVar;
        this.f1646g = iVar;
    }

    public void t(int i2, Intent intent, String str, boolean z, int i3, float f2, boolean z2, String str2) {
        this.f1647h = str2;
        this.f1650k = false;
        new Thread(new a(i3, f2, i2, intent, str, z2, z)).start();
    }

    public void v() {
        Log.d("ScreenRecordingService", "Stop recording");
        new Thread(new d()).start();
    }
}
