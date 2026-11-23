package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
class GoogleVrProxy extends c implements GoogleVrVideo {
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Runnable f1482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Vector f1483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceView f1484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f1485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Thread f1486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Handler f1487m;

    class a {
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public boolean d = false;
        public boolean e = true;
        public boolean f = false;

        a() {
        }

        public final boolean a() {
            return this.a && this.b;
        }

        public final void b() {
            this.a = false;
            this.b = false;
            this.d = false;
            this.e = true;
            this.f = false;
        }
    }

    public GoogleVrProxy(f fVar) {
        super("Google VR", fVar);
        this.f = false;
        this.f1481g = false;
        this.f1482h = null;
        this.f1483i = new Vector();
        this.f1484j = null;
        this.f1485k = new a();
        this.f1486l = null;
        this.f1487m = new Handler(Looper.getMainLooper()) { // from class: com.unity3d.player.GoogleVrProxy.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 135711) {
                    super.handleMessage(message);
                }
                switch (message.arg1) {
                    case 2147483645:
                        Iterator it = GoogleVrProxy.this.f1483i.iterator();
                        while (it.hasNext()) {
                            ((GoogleVrVideo.GoogleVrVideoCallbacks) it.next()).onFrameAvailable();
                        }
                        break;
                    case 2147483646:
                        Surface surface = (Surface) message.obj;
                        Iterator it2 = GoogleVrProxy.this.f1483i.iterator();
                        while (it2.hasNext()) {
                            ((GoogleVrVideo.GoogleVrVideoCallbacks) it2.next()).onSurfaceAvailable(surface);
                        }
                        break;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
        };
        initVrJni();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.f1485k.d = z;
    }

    private static boolean a(int i2) {
        return Build.VERSION.SDK_INT >= i2;
    }

    private boolean a(ClassLoader classLoader) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.unity3d.unitygvr.GoogleVR");
            o oVar = new o(clsLoadClass, clsLoadClass.getConstructor(new Class[0]).newInstance(new Object[0]));
            Class cls = Boolean.TYPE;
            oVar.a("initialize", new Class[]{Activity.class, Context.class, SurfaceView.class, cls, Handler.class});
            oVar.a("deinitialize", new Class[0]);
            oVar.a("load", new Class[]{cls, cls, cls, cls, cls, Runnable.class});
            oVar.a("enable", new Class[]{cls});
            oVar.a("unload", new Class[0]);
            oVar.a("pause", new Class[0]);
            oVar.a("resume", new Class[0]);
            oVar.a("getGvrLayout", new Class[0]);
            oVar.a("getVideoSurfaceId", new Class[0]);
            oVar.a("getVideoSurface", new Class[0]);
            this.a = oVar;
            return true;
        } catch (Exception e) {
            reportError("Exception initializing GoogleVR from Unity library. " + e.getLocalizedMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return this.f1485k.d;
    }

    private void e() {
        Activity activity = (Activity) this.c;
        if (this.f1481g) {
            a aVar = this.f1485k;
            if (aVar.f || activity == null) {
                return;
            }
            aVar.f = true;
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            activity.startActivity(intent);
        }
    }

    private final native void initVrJni();

    private final native boolean isQuiting();

    private final native void setVrVideoTransform(float[][] fArr);

    public final void a(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("android.intent.extra.VR_LAUNCH", false)) {
            return;
        }
        this.f1481g = true;
    }

    public final boolean a() {
        return this.f1485k.a;
    }

    public final boolean a(Activity activity, Context context, SurfaceView surfaceView, Runnable runnable) {
        String str;
        boolean zBooleanValue;
        if (activity == null || context == null || surfaceView == null || runnable == null) {
            str = "Invalid parameters passed to Google VR initiialization.";
        } else {
            this.f1485k.b();
            this.c = context;
            this.f1482h = runnable;
            if (!a(19)) {
                str = "Google VR requires a device that supports an api version of 19 (KitKat) or better.";
            } else if (this.f1481g && !a(24)) {
                str = "Daydream requires a device that supports an api version of 24 (Nougat) or better.";
            } else {
                if (!a(UnityPlayer.class.getClassLoader())) {
                    return false;
                }
                try {
                    zBooleanValue = ((Boolean) this.a.a("initialize", activity, context, surfaceView, Boolean.valueOf(this.f1481g), this.f1487m)).booleanValue();
                } catch (Exception e) {
                    reportError("Exception while trying to intialize Unity Google VR Library. " + e.getLocalizedMessage());
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    this.f1484j = surfaceView;
                    this.f1485k.a = true;
                    this.d = "";
                    return true;
                }
                str = "Unable to initialize GoogleVR library.";
            }
        }
        reportError(str);
        return false;
    }

    public final void b() {
        resumeGvrLayout();
    }

    public final void c() {
        SurfaceView surfaceView = this.f1484j;
        if (surfaceView != null) {
            surfaceView.getHolder().setSizeFromLayout();
        }
    }

    @Override // com.unity3d.player.GoogleVrVideo
    public void deregisterGoogleVrVideoListener(GoogleVrVideo.GoogleVrVideoCallbacks googleVrVideoCallbacks) {
        if (this.f1483i.contains(googleVrVideoCallbacks)) {
            googleVrVideoCallbacks.onSurfaceUnavailable();
            this.f1483i.remove(googleVrVideoCallbacks);
        }
    }

    protected Object getVideoSurface() {
        if (d() && !this.f1485k.e) {
            try {
                return this.a.a("getVideoSurface", new Object[0]);
            } catch (Exception e) {
                reportError("Exception caught while Getting GoogleVR Video Surface. " + e.getLocalizedMessage());
            }
        }
        return null;
    }

    protected int getVideoSurfaceId() {
        if (d() && !this.f1485k.e) {
            try {
                return ((Integer) this.a.a("getVideoSurfaceId", new Object[0])).intValue();
            } catch (Exception e) {
                reportError("Exception caught while getting Video Surface ID from GoogleVR. " + e.getLocalizedMessage());
            }
        }
        return -1;
    }

    protected long loadGoogleVr(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5) {
        if (!this.f1485k.a) {
            return 0L;
        }
        final AtomicLong atomicLong = new AtomicLong(0L);
        this.d = (z || z2) ? "Daydream" : "Cardboard";
        if (!runOnUiThreadWithSync(new Runnable() { // from class: com.unity3d.player.GoogleVrProxy.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    atomicLong.set(((Long) GoogleVrProxy.this.a.a("load", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), GoogleVrProxy.this.f1482h)).longValue());
                    GoogleVrProxy.this.f1485k.b = true;
                } catch (Exception e) {
                    GoogleVrProxy.this.reportError("Exception caught while loading GoogleVR. " + e.getLocalizedMessage());
                    atomicLong.set(0L);
                }
            }
        }) || atomicLong.longValue() == 0) {
            reportError("Google VR had a fatal issue while loading. VR will not be available.");
        }
        return atomicLong.longValue();
    }

    protected void pauseGvrLayout() {
        if (this.f1485k.a() && !this.f1485k.e) {
            if (d()) {
                Iterator it = this.f1483i.iterator();
                while (it.hasNext()) {
                    ((GoogleVrVideo.GoogleVrVideoCallbacks) it.next()).onSurfaceUnavailable();
                }
            }
            o oVar = this.a;
            if (oVar != null) {
                oVar.a("pause", new Object[0]);
            }
            this.f1485k.e = true;
        }
    }

    @Override // com.unity3d.player.GoogleVrVideo
    public void registerGoogleVrVideoListener(GoogleVrVideo.GoogleVrVideoCallbacks googleVrVideoCallbacks) {
        if (this.f1483i.contains(googleVrVideoCallbacks)) {
            return;
        }
        this.f1483i.add(googleVrVideoCallbacks);
        Surface surface = (Surface) getVideoSurface();
        if (surface != null) {
            googleVrVideoCallbacks.onSurfaceAvailable(surface);
        }
    }

    protected void resumeGvrLayout() {
        if (this.f1485k.a() && this.f1485k.e) {
            o oVar = this.a;
            if (oVar != null) {
                oVar.a("resume", new Object[0]);
            }
            this.f1485k.e = false;
        }
    }

    protected void setGoogleVrModeEnabled(final boolean z) {
        if (!this.f1485k.a() || this.b == null || this.c == null) {
            return;
        }
        if (!z && isQuiting()) {
            e();
        }
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.GoogleVrProxy.3
            @Override // java.lang.Runnable
            public final void run() {
                f fVar;
                f fVar2;
                if (z == GoogleVrProxy.this.d()) {
                    return;
                }
                try {
                    if (z && !GoogleVrProxy.this.d()) {
                        GoogleVrProxy googleVrProxy = GoogleVrProxy.this;
                        o oVar = googleVrProxy.a;
                        if (oVar != null && (fVar2 = googleVrProxy.b) != null && !fVar2.addViewToPlayer((View) oVar.a("getGvrLayout", new Object[0]), true)) {
                            GoogleVrProxy.this.reportError("Unable to add Google VR to view hierarchy.");
                            return;
                        }
                        o oVar2 = GoogleVrProxy.this.a;
                        if (oVar2 != null) {
                            oVar2.a("enable", Boolean.TRUE);
                        }
                        GoogleVrProxy.this.a(true);
                        return;
                    }
                    if (z || !GoogleVrProxy.this.d()) {
                        return;
                    }
                    GoogleVrProxy.this.a(false);
                    o oVar3 = GoogleVrProxy.this.a;
                    if (oVar3 != null) {
                        oVar3.a("enable", Boolean.FALSE);
                    }
                    GoogleVrProxy googleVrProxy2 = GoogleVrProxy.this;
                    o oVar4 = googleVrProxy2.a;
                    if (oVar4 == null || (fVar = googleVrProxy2.b) == null) {
                        return;
                    }
                    fVar.removeViewFromPlayer((View) oVar4.a("getGvrLayout", new Object[0]));
                } catch (Exception e) {
                    GoogleVrProxy.this.reportError("Exception enabling Google VR on UI Thread. " + e.getLocalizedMessage());
                }
            }
        });
    }

    @Override // com.unity3d.player.GoogleVrVideo
    public void setVideoLocationTransform(float[] fArr) {
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) float.class, 4, 4);
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                fArr2[i2][i3] = fArr[(i2 * 4) + i3];
            }
        }
        setVrVideoTransform(fArr2);
    }

    protected void unloadGoogleVr() {
        if (this.f1485k.d) {
            setGoogleVrModeEnabled(false);
        }
        a aVar = this.f1485k;
        if (aVar.c) {
            aVar.c = false;
        }
        this.f1484j = null;
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.GoogleVrProxy.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    o oVar = GoogleVrProxy.this.a;
                    if (oVar != null) {
                        oVar.a("unload", new Object[0]);
                        GoogleVrProxy.this.a.a("deinitialize", new Object[0]);
                        GoogleVrProxy.this.a = null;
                    }
                    GoogleVrProxy.this.f1485k.b = false;
                } catch (Exception e) {
                    GoogleVrProxy.this.reportError("Exception unloading Google VR on UI Thread. " + e.getLocalizedMessage());
                }
            }
        });
    }
}
