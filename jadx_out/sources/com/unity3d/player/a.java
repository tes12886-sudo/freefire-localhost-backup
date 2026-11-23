package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.gamesafe.ano.AnoSdk;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static CameraManager b;
    private static String[] c;
    private static Semaphore e = new Semaphore(1);
    private d a;
    private CameraDevice d;
    private HandlerThread f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f1512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Rect f1513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f1514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1516k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1519n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1520o;
    private Range q;
    private Image s;
    private CaptureRequest.Builder t;
    private int w;
    private SurfaceTexture x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f1517l = -1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f1518m = -1.0f;
    private boolean p = false;
    private ImageReader r = null;
    private CameraCaptureSession u = null;
    private Object v = new Object();
    private Surface y = null;
    private int z = EnumC0157a.c;
    private CameraCaptureSession.CaptureCallback A = new CameraCaptureSession.CaptureCallback() { // from class: com.unity3d.player.a.1
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a.this.a(captureRequest.getTag());
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            g.Log(5, "Camera2: Capture session failed " + captureRequest.getTag() + " reason " + captureFailure.getReason());
            a.this.a(captureRequest.getTag());
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i2) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i2, long j2) {
        }
    };
    private final CameraDevice.StateCallback B = new CameraDevice.StateCallback() { // from class: com.unity3d.player.a.3
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            a.e.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            g.Log(5, "Camera2: CameraDevice disconnected.");
            a.this.a(cameraDevice);
            a.e.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i2) {
            g.Log(6, "Camera2: Error opeining CameraDevice " + i2);
            a.this.a(cameraDevice);
            a.e.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            a.this.d = cameraDevice;
            a.e.release();
        }
    };
    private final ImageReader.OnImageAvailableListener C = new ImageReader.OnImageAvailableListener() { // from class: com.unity3d.player.a.4
        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            if (a.e.tryAcquire()) {
                Image imageAcquireNextImage = imageReader.acquireNextImage();
                if (imageAcquireNextImage != null) {
                    Image.Plane[] planes = imageAcquireNextImage.getPlanes();
                    if (imageAcquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                        a.this.a.a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                    } else {
                        g.Log(6, "Camera2: Wrong image format.");
                    }
                    if (a.this.s != null) {
                        a.this.s.close();
                    }
                    a.this.s = imageAcquireNextImage;
                }
                a.e.release();
            }
        }
    };
    private final SurfaceTexture.OnFrameAvailableListener D = new SurfaceTexture.OnFrameAvailableListener() { // from class: com.unity3d.player.a.5
        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            a.this.a.a(surfaceTexture);
        }
    };

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.unity3d.player.a$a, reason: collision with other inner class name */
    private static final class EnumC0157a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};
    }

    protected a(d dVar) {
        this.a = null;
        this.a = dVar;
        g();
    }

    public static int a(Context context) {
        return c(context).length;
    }

    public static int a(Context context, int i2) {
        try {
            return ((Integer) b(context).getCameraCharacteristics(c(context)[i2]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e2) {
            g.Log(6, "Camera2: CameraAccessException " + e2);
            return 0;
        }
    }

    private static int a(Range[] rangeArr, int i2) {
        int i3 = -1;
        double d = Double.MAX_VALUE;
        for (int i4 = 0; i4 < rangeArr.length; i4++) {
            int iIntValue = ((Integer) rangeArr[i4].getLower()).intValue();
            int iIntValue2 = ((Integer) rangeArr[i4].getUpper()).intValue();
            float f = i2;
            if (f + 0.1f > iIntValue && f - 0.1f < iIntValue2) {
                return i2;
            }
            double dMin = Math.min(Math.abs(i2 - iIntValue), Math.abs(i2 - iIntValue2));
            if (dMin < d) {
                i3 = i4;
                d = dMin;
            }
        }
        return ((Integer) (i2 > ((Integer) rangeArr[i3].getUpper()).intValue() ? rangeArr[i3].getUpper() : rangeArr[i3].getLower())).intValue();
    }

    private static Rect a(Size[] sizeArr, double d, double d2) {
        double d3 = Double.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sizeArr.length; i4++) {
            int width = sizeArr[i4].getWidth();
            int height = sizeArr[i4].getHeight();
            double d4 = width;
            Double.isNaN(d4);
            double dAbs = Math.abs(Math.log(d / d4));
            double d5 = height;
            Double.isNaN(d5);
            double dAbs2 = dAbs + Math.abs(Math.log(d2 / d5));
            if (dAbs2 < d3) {
                i2 = width;
                i3 = height;
                d3 = dAbs2;
            }
        }
        return new Rect(0, 0, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CameraDevice cameraDevice) {
        synchronized (this.v) {
            this.u = null;
        }
        cameraDevice.close();
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        if (obj != "Focus") {
            if (obj == "Cancel focus") {
                synchronized (this.v) {
                    if (this.u != null) {
                        j();
                    }
                }
                return;
            }
            return;
        }
        this.p = false;
        synchronized (this.v) {
            if (this.u != null) {
                try {
                    this.t.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.t.setTag("Regular");
                    this.u.setRepeatingRequest(this.t.build(), this.A, this.f1512g);
                } catch (CameraAccessException e2) {
                    g.Log(6, "Camera2: CameraAccessException " + e2);
                }
            }
        }
    }

    private static Size[] a(CameraCharacteristics cameraCharacteristics) {
        String str;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            str = "Camera2: configuration map is not available.";
        } else {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
            if (outputSizes != null && outputSizes.length != 0) {
                return outputSizes;
            }
            str = "Camera2: output sizes for YUV_420_888 format are not avialable.";
        }
        g.Log(6, str);
        return null;
    }

    private static CameraManager b(Context context) {
        if (b == null) {
            b = (CameraManager) context.getSystemService("camera");
        }
        return b;
    }

    private void b(CameraCharacteristics cameraCharacteristics) {
        int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
        this.f1516k = iIntValue;
        if (iIntValue > 0) {
            Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            this.f1514i = rect;
            float fWidth = rect.width() / this.f1514i.height();
            float fWidth2 = this.f1513h.width() / this.f1513h.height();
            if (fWidth2 > fWidth) {
                this.f1519n = 0;
                this.f1520o = (int) ((this.f1514i.height() - (this.f1514i.width() / fWidth2)) / 2.0f);
            } else {
                this.f1520o = 0;
                this.f1519n = (int) ((this.f1514i.width() - (this.f1514i.height() * fWidth2)) / 2.0f);
            }
            this.f1515j = Math.min(this.f1514i.width(), this.f1514i.height()) / 20;
        }
    }

    public static boolean b(Context context, int i2) {
        try {
            return ((Integer) b(context).getCameraCharacteristics(c(context)[i2]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e2) {
            g.Log(6, "Camera2: CameraAccessException " + e2);
            return false;
        }
    }

    public static boolean c(Context context, int i2) {
        try {
            return ((Integer) b(context).getCameraCharacteristics(c(context)[i2]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e2) {
            g.Log(6, "Camera2: CameraAccessException " + e2);
            return false;
        }
    }

    private static String[] c(Context context) {
        if (c == null) {
            try {
                c = b(context).getCameraIdList();
            } catch (CameraAccessException e2) {
                g.Log(6, "Camera2: CameraAccessException " + e2);
                c = new String[0];
            }
        }
        return c;
    }

    public static int[] d(Context context, int i2) {
        try {
            Size[] sizeArrA = a(b(context).getCameraCharacteristics(c(context)[i2]));
            if (sizeArrA == null) {
                return null;
            }
            int[] iArr = new int[sizeArrA.length * 2];
            for (int i3 = 0; i3 < sizeArrA.length; i3++) {
                int i4 = i3 * 2;
                iArr[i4] = sizeArrA[i3].getWidth();
                iArr[i4 + 1] = sizeArrA[i3].getHeight();
            }
            return iArr;
        } catch (CameraAccessException e2) {
            g.Log(6, "Camera2: CameraAccessException " + e2);
            return null;
        }
    }

    private void g() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f = handlerThread;
        handlerThread.start();
        this.f1512g = new Handler(this.f.getLooper());
    }

    private void h() {
        this.f.quit();
        try {
            this.f.join(4000L);
            this.f = null;
            this.f1512g = null;
        } catch (InterruptedException e2) {
            this.f.interrupt();
            g.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + e2);
        }
    }

    private void i() {
        try {
            Semaphore semaphore = e;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!semaphore.tryAcquire(4L, timeUnit)) {
                g.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.d.close();
            try {
                if (!e.tryAcquire(4L, timeUnit)) {
                    g.Log(5, "Camera2: Timeout waiting to close camera.");
                }
            } catch (InterruptedException e2) {
                g.Log(6, "Camera2: Interrupted while waiting to close camera " + e2);
            }
            this.d = null;
            e.release();
        } catch (InterruptedException e3) {
            g.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        try {
            if (this.f1516k != 0) {
                float f = this.f1517l;
                if (f >= 0.0f && f <= 1.0f) {
                    float f2 = this.f1518m;
                    if (f2 >= 0.0f && f2 <= 1.0f) {
                        this.p = true;
                        int iWidth = this.f1514i.width();
                        int i2 = this.f1519n;
                        int i3 = (int) (((iWidth - (i2 * 2)) * this.f1517l) + i2);
                        int iHeight = this.f1514i.height();
                        int i4 = this.f1520o;
                        double d = iHeight - (i4 * 2);
                        double d2 = this.f1518m;
                        Double.isNaN(d2);
                        Double.isNaN(d);
                        double d3 = i4;
                        Double.isNaN(d3);
                        int i5 = (int) ((d * (1.0d - d2)) + d3);
                        int iMax = Math.max(this.f1515j + 1, Math.min(i3, (this.f1514i.width() - this.f1515j) - 1));
                        int iMax2 = Math.max(this.f1515j + 1, Math.min(i5, (this.f1514i.height() - this.f1515j) - 1));
                        CaptureRequest.Builder builder = this.t;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
                        int i6 = this.f1515j;
                        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(iMax - i6, iMax2 - i6, i6 * 2, i6 * 2, AnoSdk.ACE_LOCAL_OTHERS)});
                        this.t.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.t.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.t.setTag("Focus");
                        this.u.capture(this.t.build(), this.A, this.f1512g);
                        return;
                    }
                }
            }
            this.t.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.t.setTag("Regular");
            CameraCaptureSession cameraCaptureSession = this.u;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.setRepeatingRequest(this.t.build(), this.A, this.f1512g);
            }
        } catch (CameraAccessException e2) {
            g.Log(6, "Camera2: CameraAccessException " + e2);
        }
    }

    private void k() {
        try {
            CameraCaptureSession cameraCaptureSession = this.u;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
                this.t.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.t.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.t.setTag("Cancel focus");
                this.u.capture(this.t.build(), this.A, this.f1512g);
            }
        } catch (CameraAccessException e2) {
            g.Log(6, "Camera2: CameraAccessException " + e2);
        }
    }

    public final Rect a() {
        return this.f1513h;
    }

    public final boolean a(float f, float f2) {
        if (this.f1516k <= 0) {
            return false;
        }
        if (this.p) {
            g.Log(5, "Camera2: Setting manual focus point already started.");
            return false;
        }
        this.f1517l = f;
        this.f1518m = f2;
        synchronized (this.v) {
            if (this.u != null && this.z != EnumC0157a.b) {
                k();
            }
        }
        return true;
    }

    public final boolean a(Context context, int i2, int i3, int i4, int i5, int i6) {
        try {
            CameraCharacteristics cameraCharacteristics = b.getCameraCharacteristics(c(context)[i2]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                g.Log(5, "Camera2: only LEGACY hardware level is supported.");
                return false;
            }
            Size[] sizeArrA = a(cameraCharacteristics);
            if (sizeArrA != null && sizeArrA.length != 0) {
                this.f1513h = a(sizeArrA, i3, i4);
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null || rangeArr.length == 0) {
                    g.Log(6, "Camera2: target FPS ranges are not avialable.");
                } else {
                    int iA = a(rangeArr, i5);
                    this.q = new Range(Integer.valueOf(iA), Integer.valueOf(iA));
                    try {
                        Semaphore semaphore = e;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        if (!semaphore.tryAcquire(4L, timeUnit)) {
                            g.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                            return false;
                        }
                        try {
                            b.openCamera(c(context)[i2], this.B, this.f1512g);
                            try {
                                if (!e.tryAcquire(4L, timeUnit)) {
                                    g.Log(5, "Camera2: Timeout waiting to open camera.");
                                    return false;
                                }
                                e.release();
                                this.w = i6;
                                b(cameraCharacteristics);
                                return this.d != null;
                            } catch (InterruptedException e2) {
                                g.Log(6, "Camera2: Interrupted while waiting to open camera " + e2);
                            }
                        } catch (CameraAccessException e3) {
                            g.Log(6, "Camera2: CameraAccessException " + e3);
                            e.release();
                            return false;
                        }
                    } catch (InterruptedException e4) {
                        g.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e4);
                        return false;
                    }
                }
            }
            return false;
        } catch (CameraAccessException e5) {
            g.Log(6, "Camera2: CameraAccessException " + e5);
            return false;
        }
    }

    public final void b() {
        if (this.d != null) {
            e();
            i();
            this.A = null;
            this.y = null;
            this.x = null;
            Image image = this.s;
            if (image != null) {
                image.close();
                this.s = null;
            }
            ImageReader imageReader = this.r;
            if (imageReader != null) {
                imageReader.close();
                this.r = null;
            }
        }
        h();
    }

    public final void c() {
        if (this.r == null) {
            ImageReader imageReaderNewInstance = ImageReader.newInstance(this.f1513h.width(), this.f1513h.height(), 35, 2);
            this.r = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(this.C, this.f1512g);
            this.s = null;
            if (this.w != 0) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.w);
                this.x = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f1513h.width(), this.f1513h.height());
                this.x.setOnFrameAvailableListener(this.D, this.f1512g);
                this.y = new Surface(this.x);
            }
        }
        try {
            CameraCaptureSession cameraCaptureSession = this.u;
            if (cameraCaptureSession == null) {
                CameraDevice cameraDevice = this.d;
                Surface surface = this.y;
                cameraDevice.createCaptureSession(surface != null ? Arrays.asList(surface, this.r.getSurface()) : Arrays.asList(this.r.getSurface()), new CameraCaptureSession.StateCallback() { // from class: com.unity3d.player.a.2
                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession2) {
                        g.Log(6, "Camera2: CaptureSession configuration failed.");
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigured(CameraCaptureSession cameraCaptureSession2) {
                        if (a.this.d == null) {
                            return;
                        }
                        synchronized (a.this.v) {
                            a.this.u = cameraCaptureSession2;
                            try {
                                a aVar = a.this;
                                aVar.t = aVar.d.createCaptureRequest(1);
                                if (a.this.y != null) {
                                    a.this.t.addTarget(a.this.y);
                                }
                                a.this.t.addTarget(a.this.r.getSurface());
                                a.this.t.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a.this.q);
                                a.this.j();
                            } catch (CameraAccessException e2) {
                                g.Log(6, "Camera2: CameraAccessException " + e2);
                            }
                        }
                    }
                }, this.f1512g);
            } else if (this.z == EnumC0157a.b) {
                cameraCaptureSession.setRepeatingRequest(this.t.build(), this.A, this.f1512g);
            }
            this.z = EnumC0157a.a;
        } catch (CameraAccessException e2) {
            g.Log(6, "Camera2: CameraAccessException " + e2);
        }
    }

    public final void d() {
        synchronized (this.v) {
            CameraCaptureSession cameraCaptureSession = this.u;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.stopRepeating();
                    this.z = EnumC0157a.b;
                } catch (CameraAccessException e2) {
                    g.Log(6, "Camera2: CameraAccessException " + e2);
                }
            }
        }
    }

    public final void e() {
        synchronized (this.v) {
            CameraCaptureSession cameraCaptureSession = this.u;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.abortCaptures();
                } catch (CameraAccessException e2) {
                    g.Log(6, "Camera2: CameraAccessException " + e2);
                }
                this.u.close();
                this.u = null;
                this.z = EnumC0157a.c;
            }
        }
    }
}
