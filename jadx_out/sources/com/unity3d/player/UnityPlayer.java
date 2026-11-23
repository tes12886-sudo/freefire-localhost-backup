package com.unity3d.player;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class UnityPlayer extends FrameLayout implements com.unity3d.player.f {
    public static Activity currentActivity;
    e a;
    k b;
    private int c;
    private boolean d;
    private boolean e;
    private n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConcurrentLinkedQueue f1491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BroadcastReceiver f1492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f1494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TelephonyManager f1495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ClipboardManager f1496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f1497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private GoogleARCoreApi f1498o;
    private a p;
    private Camera2Wrapper q;
    private Context r;
    private SurfaceView s;
    private boolean t;
    private q u;
    private IGenericMotionEventListener v;

    public interface IGenericMotionEventListener {
        void onGenericMotionEvent(MotionEvent motionEvent);
    }

    class a implements SensorEventListener {
        a() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class b {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};
    }

    private class c extends PhoneStateListener {
        private c() {
        }

        /* synthetic */ c(UnityPlayer unityPlayer, byte b) {
            this();
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int i2, String str) {
            UnityPlayer.this.nativeMuteMasterAudio(i2 == 1);
        }
    }

    enum d {
        PAUSE,
        RESUME,
        QUIT,
        SURFACE_LOST,
        SURFACE_ACQUIRED,
        FOCUS_LOST,
        FOCUS_GAINED,
        NEXT_FRAME
    }

    private class e extends Thread {
        Handler a;
        boolean b;
        boolean c;
        int d;
        int e;

        private e() {
            this.b = false;
            this.c = false;
            this.d = b.b;
            this.e = 5;
        }

        /* synthetic */ e(UnityPlayer unityPlayer, byte b) {
            this();
        }

        private void a(d dVar) {
            Handler handler = this.a;
            if (handler != null) {
                Message.obtain(handler, 2269, dVar).sendToTarget();
            }
        }

        public final void a() {
            a(d.QUIT);
        }

        public final void a(Runnable runnable) {
            if (this.a == null) {
                return;
            }
            a(d.PAUSE);
            Message.obtain(this.a, runnable).sendToTarget();
        }

        public final void b() {
            a(d.RESUME);
        }

        public final void b(Runnable runnable) {
            if (this.a == null) {
                return;
            }
            a(d.SURFACE_LOST);
            Message.obtain(this.a, runnable).sendToTarget();
        }

        public final void c() {
            a(d.FOCUS_GAINED);
        }

        public final void c(Runnable runnable) {
            Handler handler = this.a;
            if (handler == null) {
                return;
            }
            Message.obtain(handler, runnable).sendToTarget();
            a(d.SURFACE_ACQUIRED);
        }

        public final void d() {
            a(d.FOCUS_LOST);
        }

        public final void d(Runnable runnable) {
            Handler handler = this.a;
            if (handler != null) {
                Message.obtain(handler, runnable).sendToTarget();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("UnityMain");
            Looper.prepare();
            this.a = new Handler(new Handler.Callback() { // from class: com.unity3d.player.UnityPlayer.e.1
                private void a() {
                    e eVar = e.this;
                    if (eVar.d == b.c && eVar.c) {
                        UnityPlayer.this.nativeFocusChanged(true);
                        e.this.d = b.a;
                    }
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    if (message.what != 2269) {
                        return false;
                    }
                    d dVar = (d) message.obj;
                    if (dVar == d.NEXT_FRAME) {
                        return true;
                    }
                    if (dVar == d.QUIT) {
                        Looper.myLooper().quit();
                    } else if (dVar == d.RESUME) {
                        e.this.b = true;
                    } else if (dVar == d.PAUSE) {
                        e.this.b = false;
                    } else if (dVar == d.SURFACE_LOST) {
                        e.this.c = false;
                    } else {
                        if (dVar == d.SURFACE_ACQUIRED) {
                            e.this.c = true;
                        } else if (dVar == d.FOCUS_LOST) {
                            e eVar = e.this;
                            if (eVar.d == b.a) {
                                UnityPlayer.this.nativeFocusChanged(false);
                            }
                            e.this.d = b.b;
                        } else if (dVar == d.FOCUS_GAINED) {
                            e.this.d = b.c;
                        }
                        a();
                    }
                    return true;
                }
            });
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.unity3d.player.UnityPlayer.e.2
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    UnityPlayer.this.executeGLThreadJobs();
                    e eVar = e.this;
                    if (!eVar.b || !eVar.c) {
                        return true;
                    }
                    int i2 = eVar.e;
                    if (i2 >= 0) {
                        if (i2 == 0 && UnityPlayer.this.m()) {
                            UnityPlayer.this.a();
                        }
                        e.this.e--;
                    }
                    if (!UnityPlayer.this.isFinishing() && !UnityPlayer.this.nativeRender()) {
                        UnityPlayer.this.e();
                    }
                    Message.obtain(e.this.a, 2269, d.NEXT_FRAME).sendToTarget();
                    return true;
                }
            });
            Looper.loop();
        }
    }

    private abstract class f implements Runnable {
        private f() {
        }

        /* synthetic */ f(UnityPlayer unityPlayer, byte b) {
            this();
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (UnityPlayer.this.isFinishing()) {
                return;
            }
            a();
        }
    }

    static {
        new m().a();
        try {
            System.loadLibrary("main");
        } catch (UnsatisfiedLinkError e2) {
            g.Log(6, "Failed to load 'libmain.so', the application will terminate.");
            throw e2;
        }
    }

    public UnityPlayer(Context context) {
        super(context);
        this.c = -1;
        byte b2 = 0;
        this.d = false;
        this.e = true;
        this.f = new n();
        this.f1490g = false;
        this.f1491h = new ConcurrentLinkedQueue();
        this.f1492i = null;
        this.a = new e(this, b2);
        this.f1493j = false;
        this.f1498o = null;
        this.p = new a();
        this.q = null;
        this.b = null;
        if (Build.VERSION.SDK_INT < 31) {
            this.f1494k = new c(this, b2);
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            currentActivity = activity;
            this.c = activity.getRequestedOrientation();
        }
        a(currentActivity);
        this.r = context;
        if (currentActivity != null && m()) {
            l lVar = new l(this.r, l.a.a()[getSplashMode()]);
            this.f1497n = lVar;
            addView(lVar);
        }
        a(this.r.getApplicationInfo());
        if (!n.c()) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this.r).setTitle("Failure to initialize!").setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.unity3d.player.UnityPlayer.1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    UnityPlayer.this.e();
                }
            }).setMessage("Your hardware does not support this application, sorry!").create();
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.show();
            return;
        }
        initJni(context);
        this.f.c(true);
        SurfaceView surfaceViewC = c();
        this.s = surfaceViewC;
        surfaceViewC.setContentDescription(a(context));
        addView(this.s);
        bringChildToFront(this.f1497n);
        this.t = false;
        nativeInitWebRequest(UnityWebRequest.class);
        o();
        this.f1495l = (TelephonyManager) this.r.getSystemService("phone");
        this.f1496m = (ClipboardManager) this.r.getSystemService("clipboard");
        this.q = new Camera2Wrapper(this.r);
        this.a.start();
    }

    public static void UnitySendMessage(String str, String str2, String str3) {
        if (n.c()) {
            try {
                nativeUnitySendMessage(str, str2, str3.getBytes("UTF-8"));
                return;
            } catch (UnsupportedEncodingException unused) {
                return;
            }
        }
        g.Log(5, "Native libraries not loaded - dropping message for " + str + "." + str2);
    }

    private static String a(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.17
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer unityPlayer = UnityPlayer.this;
                unityPlayer.removeView(unityPlayer.f1497n);
                UnityPlayer.f(UnityPlayer.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, Surface surface) {
        if (this.d) {
            return;
        }
        b(0, surface);
    }

    private static void a(Activity activity) {
        View decorView;
        if (activity == null || !activity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false) || activity.getWindow() == null || (decorView = activity.getWindow().getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(7);
    }

    private static void a(ApplicationInfo applicationInfo) {
        if (NativeLoader.load(applicationInfo.nativeLibraryDir)) {
            n.a();
        } else {
            g.Log(6, "NativeLoader.load failure, Unity libraries were not loaded.");
        }
    }

    private void a(View view, View view2) {
        boolean z;
        if (this.f.d()) {
            z = false;
        } else {
            pause();
            z = true;
        }
        if (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof UnityPlayer) || ((UnityPlayer) parent) != this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
                bringChildToFront(view);
                view.setVisibility(0);
            }
        }
        if (view2 != null && view2.getParent() == this) {
            view2.setVisibility(8);
            removeView(view2);
        }
        if (z) {
            resume();
        }
    }

    private void a(f fVar) {
        if (isFinishing()) {
            return;
        }
        b(fVar);
    }

    private void b(Runnable runnable) {
        if (n.c()) {
            if (Thread.currentThread() == this.a) {
                runnable.run();
            } else {
                this.f1491h.add(runnable);
            }
        }
    }

    private static boolean b() {
        if (currentActivity == null) {
            return false;
        }
        TypedValue typedValue = new TypedValue();
        return currentActivity.getTheme().resolveAttribute(R.attr.windowIsTranslucent, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }

    private boolean b(final int i2, final Surface surface) {
        if (!n.c() || !this.f.e()) {
            return false;
        }
        final Semaphore semaphore = new Semaphore(0);
        Runnable runnable = new Runnable() { // from class: com.unity3d.player.UnityPlayer.20
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.nativeRecreateGfxState(i2, surface);
                semaphore.release();
            }
        };
        if (i2 == 0) {
            e eVar = this.a;
            if (surface == null) {
                eVar.b(runnable);
            } else {
                eVar.c(runnable);
            }
        } else {
            runnable.run();
        }
        if (surface != null || i2 != 0) {
            return true;
        }
        try {
            if (semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                return true;
            }
            g.Log(5, "Timeout while trying detaching primary window.");
            return true;
        } catch (InterruptedException unused) {
            g.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SurfaceView c() {
        SurfaceView surfaceView = new SurfaceView(this.r);
        if (b()) {
            surfaceView.getHolder().setFormat(-3);
            surfaceView.setZOrderOnTop(true);
        } else {
            surfaceView.getHolder().setFormat(-1);
        }
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.unity3d.player.UnityPlayer.18
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                UnityPlayer.this.a(0, surfaceHolder.getSurface());
                UnityPlayer.this.d();
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                UnityPlayer.this.a(0, surfaceHolder.getSurface());
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                UnityPlayer.this.a(0, (Surface) null);
            }
        });
        surfaceView.setFocusable(true);
        surfaceView.setFocusableInTouchMode(true);
        return surfaceView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (n.c() && this.f.e()) {
            this.a.d(new Runnable() { // from class: com.unity3d.player.UnityPlayer.19
                @Override // java.lang.Runnable
                public final void run() {
                    UnityPlayer.this.nativeSendSurfaceChangedEvent();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Context context = this.r;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return;
        }
        ((Activity) this.r).finish();
    }

    static /* synthetic */ l f(UnityPlayer unityPlayer) {
        unityPlayer.f1497n = null;
        return null;
    }

    private void f() {
        GoogleARCoreApi googleARCoreApi = this.f1498o;
        if (googleARCoreApi != null) {
            googleARCoreApi.pauseARCore();
        }
        q qVar = this.u;
        if (qVar != null) {
            qVar.a();
        }
        GoogleVrProxy googleVrProxyB = GoogleVrApi.b();
        if (googleVrProxyB != null) {
            googleVrProxyB.pauseGvrLayout();
        }
        g();
    }

    private void g() {
        reportSoftInputStr(null, 1, true);
        if (this.f.g()) {
            if (n.c()) {
                final Semaphore semaphore = new Semaphore(0);
                this.a.a(isFinishing() ? new Runnable() { // from class: com.unity3d.player.UnityPlayer.22
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnityPlayer.this.i();
                        semaphore.release();
                    }
                } : new Runnable() { // from class: com.unity3d.player.UnityPlayer.23
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!UnityPlayer.this.nativePause()) {
                            semaphore.release();
                            return;
                        }
                        UnityPlayer.m(UnityPlayer.this);
                        UnityPlayer.this.i();
                        semaphore.release(2);
                    }
                });
                try {
                    if (!semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                        g.Log(5, "Timeout while trying to pause the Unity Engine.");
                    }
                } catch (InterruptedException unused) {
                    g.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
                }
                if (semaphore.drainPermits() > 0) {
                    destroy();
                }
            }
            this.f.d(false);
            this.f.b(true);
            if (!this.f1493j || Build.VERSION.SDK_INT >= 31) {
                return;
            }
            this.f1495l.listen(this.f1494k, 0);
        }
    }

    private void h() {
        GoogleARCoreApi googleARCoreApi = this.f1498o;
        if (googleARCoreApi != null) {
            googleARCoreApi.resumeARCore();
        }
        this.f.b(false);
        q qVar = this.u;
        if (qVar != null) {
            qVar.b();
        }
        j();
        nativeRestartActivityIndicator();
        GoogleVrProxy googleVrProxyB = GoogleVrApi.b();
        if (googleVrProxyB != null) {
            googleVrProxyB.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        nativeDone();
        this.f.c(false);
    }

    private final native void initJni(Context context);

    private void j() {
        if (this.f.f()) {
            this.f.d(true);
            b(new Runnable() { // from class: com.unity3d.player.UnityPlayer.3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityPlayer.this.nativeResume();
                }
            });
            this.a.b();
        }
    }

    private static void k() {
        if (n.c()) {
            if (!NativeLoader.unload()) {
                throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
            }
            n.b();
        }
    }

    private ApplicationInfo l() {
        return this.r.getPackageManager().getApplicationInfo(this.r.getPackageName(), 128);
    }

    protected static boolean loadLibraryStatic(String str) {
        StringBuilder sb;
        try {
            System.loadLibrary(str);
            return true;
        } catch (Exception e2) {
            sb = new StringBuilder("Unknown error ");
            sb.append(e2);
            g.Log(6, sb.toString());
            return false;
        } catch (UnsatisfiedLinkError unused) {
            sb = new StringBuilder("Unable to find ");
            sb.append(str);
            g.Log(6, sb.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        try {
            return l().metaData.getBoolean("unity.splash-enable");
        } catch (Exception unused) {
            return false;
        }
    }

    static /* synthetic */ boolean m(UnityPlayer unityPlayer) {
        unityPlayer.t = true;
        return true;
    }

    private boolean n() {
        try {
            return l().metaData.getBoolean("unity.tango-enable");
        } catch (Exception unused) {
            return false;
        }
    }

    private final native void nativeDone();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeFocusChanged(boolean z);

    private final native void nativeInitWebRequest(Class cls);

    private final native boolean nativeInjectEvent(InputEvent inputEvent);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeIsAutorotationOn();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeLowMemory();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeMuteMasterAudio(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i2, Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeRender();

    private final native void nativeRestartActivityIndicator();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSendSurfaceChangedEvent();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputSelection(int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    private final native void nativeSoftInputLostFocus();

    private static native void nativeUnitySendMessage(String str, String str2, byte[] bArr);

    private void o() {
        Context context = this.r;
        if (context instanceof Activity) {
            ((Activity) context).getWindow().setFlags(1024, 1024);
        }
    }

    static /* synthetic */ q t(UnityPlayer unityPlayer) {
        unityPlayer.u = null;
        return null;
    }

    public SurfaceView GLView() {
        return this.s;
    }

    public void SetGenericMotionEventListener(IGenericMotionEventListener iGenericMotionEventListener) {
        this.v = iGenericMotionEventListener;
    }

    final void a(Runnable runnable) {
        Context context = this.r;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            g.Log(5, "Not running Unity from an Activity; ignored...");
        }
    }

    protected void addPhoneCallListener() {
        this.f1493j = true;
        if (Build.VERSION.SDK_INT < 31) {
            this.f1495l.listen(this.f1494k, 32);
        }
    }

    @Override // com.unity3d.player.f
    public boolean addViewToPlayer(View view, boolean z) {
        a(view, z ? this.s : null);
        boolean z2 = true;
        boolean z3 = view.getParent() == this;
        boolean z4 = z && this.s.getParent() == null;
        boolean z5 = this.s.getParent() == this;
        if (!z3 || (!z4 && !z5)) {
            z2 = false;
        }
        if (!z2) {
            if (!z3) {
                g.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!z4 && !z5) {
                g.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return z2;
    }

    public void configurationChanged(Configuration configuration) {
        SurfaceView surfaceView = this.s;
        if (surfaceView instanceof SurfaceView) {
            surfaceView.getHolder().setSizeFromLayout();
        }
        q qVar = this.u;
        if (qVar != null) {
            qVar.c();
        }
        GoogleVrProxy googleVrProxyB = GoogleVrApi.b();
        if (googleVrProxyB != null) {
            googleVrProxyB.c();
        }
    }

    public void destroy() {
        if (GoogleVrApi.b() != null) {
            GoogleVrApi.a();
        }
        Camera2Wrapper camera2Wrapper = this.q;
        if (camera2Wrapper != null) {
            camera2Wrapper.a();
            this.q = null;
        }
        this.t = true;
        if (!this.f.d()) {
            pause();
        }
        this.a.a();
        try {
            this.a.join(4000L);
        } catch (InterruptedException unused) {
            this.a.interrupt();
        }
        BroadcastReceiver broadcastReceiver = this.f1492i;
        if (broadcastReceiver != null) {
            this.r.unregisterReceiver(broadcastReceiver);
        }
        this.f1492i = null;
        if (n.c()) {
            removeAllViews();
        }
        kill();
        k();
    }

    protected void disableLogger() {
        g.a = true;
    }

    public boolean displayChanged(int i2, Surface surface) {
        if (i2 == 0) {
            this.d = surface != null;
            a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.21
                @Override // java.lang.Runnable
                public final void run() {
                    if (UnityPlayer.this.d) {
                        UnityPlayer unityPlayer = UnityPlayer.this;
                        unityPlayer.removeView(unityPlayer.s);
                    } else {
                        UnityPlayer unityPlayer2 = UnityPlayer.this;
                        unityPlayer2.addView(unityPlayer2.s);
                    }
                }
            });
        }
        return b(i2, surface);
    }

    protected void executeGLThreadJobs() {
        while (true) {
            Runnable runnable = (Runnable) this.f1491h.poll();
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    protected String getClipboardText() {
        ClipData primaryClip = this.f1496m.getPrimaryClip();
        return primaryClip != null ? primaryClip.getItemAt(0).coerceToText(this.r).toString() : "";
    }

    public Bundle getSettings() {
        return Bundle.EMPTY;
    }

    protected int getSplashMode() {
        try {
            return l().metaData.getInt("unity.splash-mode");
        } catch (Exception unused) {
            return 0;
        }
    }

    public View getView() {
        return this;
    }

    protected void hideSoftInput() {
        final Runnable runnable = new Runnable() { // from class: com.unity3d.player.UnityPlayer.5
            @Override // java.lang.Runnable
            public final void run() {
                k kVar = UnityPlayer.this.b;
                if (kVar != null) {
                    kVar.dismiss();
                    UnityPlayer.this.b = null;
                }
            }
        };
        if (j.b) {
            a(new f() { // from class: com.unity3d.player.UnityPlayer.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(UnityPlayer.this, (byte) 0);
                }

                @Override // com.unity3d.player.UnityPlayer.f
                public final void a() {
                    UnityPlayer.this.a(runnable);
                }
            });
        } else {
            a(runnable);
        }
    }

    public void init(int i2, boolean z) {
    }

    protected boolean initializeGoogleAr() {
        if (this.f1498o != null || currentActivity == null || !n()) {
            return false;
        }
        GoogleARCoreApi googleARCoreApi = new GoogleARCoreApi();
        this.f1498o = googleARCoreApi;
        googleARCoreApi.initializeARCore(currentActivity);
        if (this.f.d()) {
            return false;
        }
        this.f1498o.resumeARCore();
        return false;
    }

    protected boolean initializeGoogleVr() {
        final GoogleVrProxy googleVrProxyB = GoogleVrApi.b();
        if (googleVrProxyB == null) {
            GoogleVrApi.a(this);
            googleVrProxyB = GoogleVrApi.b();
            if (googleVrProxyB == null) {
                g.Log(6, "Unable to create Google VR subsystem.");
                return false;
            }
        }
        final Semaphore semaphore = new Semaphore(0);
        final Runnable runnable = new Runnable() { // from class: com.unity3d.player.UnityPlayer.13
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.injectEvent(new KeyEvent(0, 4));
                UnityPlayer.this.injectEvent(new KeyEvent(1, 4));
            }
        };
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.14
            @Override // java.lang.Runnable
            public final void run() {
                if (!googleVrProxyB.a(UnityPlayer.currentActivity, UnityPlayer.this.r, UnityPlayer.this.c(), runnable)) {
                    g.Log(6, "Unable to initialize Google VR subsystem.");
                }
                Activity activity = UnityPlayer.currentActivity;
                if (activity != null) {
                    googleVrProxyB.a(activity.getIntent());
                }
                semaphore.release();
            }
        });
        try {
            if (semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                return googleVrProxyB.a();
            }
            g.Log(5, "Timeout while trying to initialize Google VR.");
            return false;
        } catch (InterruptedException e2) {
            g.Log(5, "UI thread was interrupted while initializing Google VR. " + e2.getLocalizedMessage());
            return false;
        }
    }

    public boolean injectEvent(InputEvent inputEvent) {
        if (n.c()) {
            return nativeInjectEvent(inputEvent);
        }
        return false;
    }

    protected boolean isFinishing() {
        if (!this.t) {
            Context context = this.r;
            boolean z = (context instanceof Activity) && ((Activity) context).isFinishing();
            this.t = z;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    protected void kill() {
        Process.killProcess(Process.myPid());
    }

    protected boolean loadLibrary(String str) {
        return loadLibraryStatic(str);
    }

    public void lowMemory() {
        if (n.c()) {
            b(new Runnable() { // from class: com.unity3d.player.UnityPlayer.2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityPlayer.this.nativeLowMemory();
                }
            });
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        IGenericMotionEventListener iGenericMotionEventListener = this.v;
        if (iGenericMotionEventListener != null) {
            iGenericMotionEventListener.onGenericMotionEvent(motionEvent);
        }
        return injectEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i2, int i3, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return injectEvent(motionEvent);
    }

    public void pause() {
        if (this.f1490g) {
            return;
        }
        f();
    }

    public void quit() {
        destroy();
    }

    @Override // com.unity3d.player.f
    public void removeViewFromPlayer(View view) {
        a(this.s, view);
        boolean z = view.getParent() == null;
        boolean z2 = this.s.getParent() == this;
        if (z && z2) {
            return;
        }
        if (!z) {
            g.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
        }
        if (z2) {
            return;
        }
        g.Log(6, "removeVireFromPlayer: Failure agging old view to hierarchy");
    }

    @Override // com.unity3d.player.f
    public void reportError(String str, String str2) {
        g.Log(6, str + ": " + str2);
    }

    protected void reportSoftInputSelection(final int i2, final int i3) {
        a(new f() { // from class: com.unity3d.player.UnityPlayer.12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(UnityPlayer.this, (byte) 0);
            }

            @Override // com.unity3d.player.UnityPlayer.f
            public final void a() {
                UnityPlayer.this.nativeSetInputSelection(i2, i3);
            }
        });
    }

    protected void reportSoftInputStr(final String str, final int i2, final boolean z) {
        if (i2 == 1) {
            hideSoftInput();
        }
        a(new f() { // from class: com.unity3d.player.UnityPlayer.11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(UnityPlayer.this, (byte) 0);
            }

            @Override // com.unity3d.player.UnityPlayer.f
            public final void a() {
                if (z) {
                    UnityPlayer.this.nativeSoftInputCanceled();
                } else {
                    String str2 = str;
                    if (str2 != null) {
                        UnityPlayer.this.nativeSetInputString(str2);
                    }
                }
                if (i2 == 1) {
                    UnityPlayer.this.nativeSoftInputClosed();
                }
            }
        });
    }

    protected void requestUserAuthorization(String str) {
        if (!j.c || str == null || str.isEmpty() || currentActivity == null) {
            return;
        }
        j.d.a(currentActivity, str);
    }

    public void resume() {
        if (this.f1490g) {
            return;
        }
        h();
    }

    protected void setCharacterLimit(final int i2) {
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.8
            @Override // java.lang.Runnable
            public final void run() {
                k kVar = UnityPlayer.this.b;
                if (kVar != null) {
                    kVar.a(i2);
                }
            }
        });
    }

    protected void setClipboardText(String str) {
        this.f1496m.setPrimaryClip(ClipData.newPlainText("Text", str));
    }

    protected void setHideInputField(final boolean z) {
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.9
            @Override // java.lang.Runnable
            public final void run() {
                k kVar = UnityPlayer.this.b;
                if (kVar != null) {
                    kVar.a(z);
                }
            }
        });
    }

    protected void setSelection(final int i2, final int i3) {
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.10
            @Override // java.lang.Runnable
            public final void run() {
                k kVar = UnityPlayer.this.b;
                if (kVar != null) {
                    kVar.a(i2, i3);
                }
            }
        });
    }

    protected void setSoftInputStr(final String str) {
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.7
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                k kVar = UnityPlayer.this.b;
                if (kVar == null || (str2 = str) == null) {
                    return;
                }
                kVar.a(str2);
            }
        });
    }

    public void setUseStartStopInsteadOfPauseResume(boolean z) {
        this.f1490g = z;
    }

    protected void showSoftInput(final String str, final int i2, final boolean z, final boolean z2, final boolean z3, final boolean z4, final String str2, final int i3, final boolean z5) {
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.4
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.b = new k(UnityPlayer.this.r, this, str, i2, z, z2, z3, str2, i3, z5);
                UnityPlayer.this.b.show();
            }
        });
    }

    protected boolean showVideoPlayer(String str, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (this.u == null) {
            this.u = new q(this);
        }
        boolean zA = this.u.a(this.r, str, i2, i3, i4, z, i5, i6, new q.a() { // from class: com.unity3d.player.UnityPlayer.15
            @Override // com.unity3d.player.q.a
            public final void a() {
                UnityPlayer.t(UnityPlayer.this);
            }
        });
        if (zA) {
            a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.16
                @Override // java.lang.Runnable
                public final void run() {
                    if (UnityPlayer.this.nativeIsAutorotationOn() && (UnityPlayer.this.r instanceof Activity)) {
                        ((Activity) UnityPlayer.this.r).setRequestedOrientation(UnityPlayer.this.c);
                    }
                }
            });
        }
        return zA;
    }

    protected boolean skipPermissionsDialog() {
        if (!j.c || currentActivity == null) {
            return false;
        }
        return j.d.a(currentActivity);
    }

    public void start() {
        if (this.f1490g) {
            h();
        }
    }

    public void stop() {
        if (this.f1490g) {
            f();
        }
    }

    protected void toggleGyroscopeSensor(boolean z) {
        SensorManager sensorManager = (SensorManager) this.r.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (z) {
            sensorManager.registerListener(this.p, defaultSensor, 1);
        } else {
            sensorManager.unregisterListener(this.p);
        }
    }

    public void windowFocusChanged(boolean z) {
        this.f.a(z);
        if (this.f.e()) {
            if (z && this.b != null) {
                nativeSoftInputLostFocus();
                reportSoftInputStr(null, 1, false);
            }
            if (z) {
                this.a.c();
            } else {
                this.a.d();
            }
            j();
        }
    }
}
