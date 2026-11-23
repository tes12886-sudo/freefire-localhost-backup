package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import com.FF.voiceengine.FFVoiceConst;

/* JADX INFO: loaded from: classes.dex */
public class Camera2Wrapper implements d {
    private Context a;
    private a b = null;
    private final int c = 100;

    public Camera2Wrapper(Context context) {
        this.a = context;
        initCamera2Jni();
    }

    private static int a(float f) {
        return (int) Math.min(Math.max((f * 2000.0f) - 1000.0f, -900.0f), 900.0f);
    }

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i2, int i3, int i4);

    private final native void nativeSurfaceTextureReady(Object obj);

    public final void a() {
        closeCamera2();
    }

    @Override // com.unity3d.player.d
    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    @Override // com.unity3d.player.d
    public final void a(Object obj, Object obj2, Object obj3, int i2, int i3, int i4) {
        nativeFrameReady(obj, obj2, obj3, i2, i3, i4);
    }

    protected void closeCamera2() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.b();
        }
        this.b = null;
    }

    protected int getCamera2Count() {
        if (j.b) {
            return a.a(this.a);
        }
        return 0;
    }

    protected int[] getCamera2Resolutions(int i2) {
        if (j.b) {
            return a.d(this.a, i2);
        }
        return null;
    }

    protected int getCamera2SensorOrientation(int i2) {
        if (j.b) {
            return a.a(this.a, i2);
        }
        return 0;
    }

    protected Object getCameraFocusArea(float f, float f2) {
        int iA = a(f);
        int iA2 = a(1.0f - f2);
        return new Camera.Area(new Rect(iA - 100, iA2 - 100, iA + 100, iA2 + 100), FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF);
    }

    protected Rect getFrameSizeCamera2() {
        a aVar = this.b;
        return aVar != null ? aVar.a() : new Rect();
    }

    protected boolean initializeCamera2(int i2, int i3, int i4, int i5, int i6) {
        if (!j.b || this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        a aVar = new a(this);
        this.b = aVar;
        return aVar.a(this.a, i2, i3, i4, i5, i6);
    }

    protected boolean isCamera2AutoFocusPointSupported(int i2) {
        if (j.b) {
            return a.c(this.a, i2);
        }
        return false;
    }

    protected boolean isCamera2FrontFacing(int i2) {
        if (j.b) {
            return a.b(this.a, i2);
        }
        return false;
    }

    protected void pauseCamera2() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    protected boolean setAutoFocusPoint(float f, float f2) {
        a aVar;
        if (!j.b || (aVar = this.b) == null) {
            return false;
        }
        return aVar.a(f, f2);
    }

    protected void startCamera2() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.c();
        }
    }

    protected void stopCamera2() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.e();
        }
    }
}
