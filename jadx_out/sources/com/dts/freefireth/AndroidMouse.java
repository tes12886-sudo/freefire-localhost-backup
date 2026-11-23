package com.dts.freefireth;

import android.os.Build;
import android.view.MotionEvent;
import j.d.d.e;

/* JADX INFO: loaded from: classes.dex */
public class AndroidMouse {
    public static final int PRIMARY_BUTTON = 0;
    public static final int SECONDARY_BUTTON = 1;
    public static final int TERTIARY_BUTTON = 2;
    private static MouseStatus_RealTime _InputStatus;
    private static MouseStatus_UnityFrame _OutputStatus;
    private static e gson = new e();

    private static class ButtonStatus {
        public boolean JustPressed;
        public boolean JustReleased;
        public boolean Pressing;

        private ButtonStatus() {
        }
    }

    private static class MotionEventJSON {
        public String action;
        public boolean left;
        public boolean mid;
        public boolean right;
        public float scroll_h;
        public float scroll_v;
        public String source;
        public float x;
        public float y;

        private MotionEventJSON() {
        }
    }

    private static class MouseStatus_RealTime {
        public boolean[] Buttons;
        public float CapturedPointer_DeltaX;
        public float CapturedPointer_DeltaY;
        public boolean Dirty;
        public float GenericMotionEvent_X;
        public float GenericMotionEvent_Y;
        public float ScrollH;
        public float ScrollV;

        private MouseStatus_RealTime() {
            this.Dirty = false;
            this.CapturedPointer_DeltaX = 0.0f;
            this.CapturedPointer_DeltaY = 0.0f;
            this.GenericMotionEvent_X = 0.0f;
            this.GenericMotionEvent_Y = 0.0f;
            this.ScrollH = 0.0f;
            this.ScrollV = 0.0f;
            this.Buttons = new boolean[]{false, false, false};
        }
    }

    private static class MouseStatus_UnityFrame {
        public ButtonStatus[] Buttons;
        public float DeltaScrollH;
        public float DeltaScrollV;
        public float DeltaX;
        public float DeltaY;
        public boolean HasPointerCapture;
        public float ScrollH;
        public float ScrollV;
        public float X;
        public float Y;

        private MouseStatus_UnityFrame() {
            this.Buttons = new ButtonStatus[]{new ButtonStatus(), new ButtonStatus(), new ButtonStatus()};
        }
    }

    static {
        _InputStatus = new MouseStatus_RealTime();
        _OutputStatus = new MouseStatus_UnityFrame();
    }

    private static boolean _hasPointerCapture() {
        FFMainActivity fFMainActivity = FFAPI.MainActivity;
        if (fFMainActivity == null) {
            return false;
        }
        return fFMainActivity.hasPointerCapture();
    }

    public static float getDeltaScrollHorizontal() {
        return _OutputStatus.DeltaScrollH;
    }

    public static float getDeltaScrollVertical() {
        return _OutputStatus.DeltaScrollV;
    }

    public static float getMouseDeltaX() {
        return _OutputStatus.DeltaX;
    }

    public static float getMouseDeltaY() {
        return _OutputStatus.DeltaY;
    }

    public static float getMouseX() {
        return _OutputStatus.X;
    }

    public static float getMouseY() {
        return _OutputStatus.Y;
    }

    public static float getScrollHorizontal() {
        return _OutputStatus.ScrollH;
    }

    public static float getScrollVertical() {
        return _OutputStatus.ScrollV;
    }

    public static boolean hasPointerCapture() {
        return _OutputStatus.HasPointerCapture;
    }

    public static boolean isPressingButton(int i2) {
        return _OutputStatus.Buttons[i2].Pressing;
    }

    public static boolean justPressedButton(int i2) {
        return _OutputStatus.Buttons[i2].JustPressed;
    }

    public static boolean justReleasedButton(int i2) {
        return _OutputStatus.Buttons[i2].JustReleased;
    }

    public static void onCapturedPointer(MotionEvent motionEvent) {
        synchronized (_InputStatus) {
            MouseStatus_RealTime mouseStatus_RealTime = _InputStatus;
            mouseStatus_RealTime.Dirty = true;
            mouseStatus_RealTime.CapturedPointer_DeltaX += motionEvent.getX();
            _InputStatus.CapturedPointer_DeltaY += motionEvent.getY();
            updateInputMouseStatus(motionEvent);
        }
    }

    public static void onGenericMotionEvent(MotionEvent motionEvent) {
        synchronized (_InputStatus) {
            MouseStatus_RealTime mouseStatus_RealTime = _InputStatus;
            mouseStatus_RealTime.Dirty = true;
            mouseStatus_RealTime.GenericMotionEvent_X = motionEvent.getX();
            _InputStatus.GenericMotionEvent_Y = motionEvent.getY();
            updateInputMouseStatus(motionEvent);
        }
    }

    public static void onUnityFrame() {
        MouseStatus_RealTime mouseStatus_RealTime;
        boolean z_hasPointerCapture = _hasPointerCapture();
        synchronized (_InputStatus) {
            MouseStatus_UnityFrame mouseStatus_UnityFrame = _OutputStatus;
            if (mouseStatus_UnityFrame.HasPointerCapture != z_hasPointerCapture) {
                mouseStatus_UnityFrame.HasPointerCapture = z_hasPointerCapture;
                mouseStatus_UnityFrame.DeltaX = 0.0f;
                mouseStatus_UnityFrame.DeltaY = 0.0f;
                mouseStatus_RealTime = _InputStatus;
                if (mouseStatus_RealTime.Dirty) {
                    if (z_hasPointerCapture) {
                        mouseStatus_UnityFrame.X = 0.0f;
                        mouseStatus_UnityFrame.Y = 0.0f;
                        mouseStatus_RealTime.CapturedPointer_DeltaX = 0.0f;
                        mouseStatus_RealTime.CapturedPointer_DeltaY = 0.0f;
                    } else {
                        mouseStatus_UnityFrame.X = mouseStatus_RealTime.GenericMotionEvent_X;
                        mouseStatus_UnityFrame.Y = mouseStatus_RealTime.GenericMotionEvent_Y;
                    }
                }
            } else {
                mouseStatus_RealTime = _InputStatus;
                if (!mouseStatus_RealTime.Dirty) {
                    mouseStatus_UnityFrame.DeltaX = 0.0f;
                    mouseStatus_UnityFrame.DeltaY = 0.0f;
                } else if (z_hasPointerCapture) {
                    float f = mouseStatus_RealTime.CapturedPointer_DeltaX;
                    mouseStatus_UnityFrame.DeltaX = f;
                    float f2 = mouseStatus_RealTime.CapturedPointer_DeltaY;
                    mouseStatus_UnityFrame.DeltaY = f2;
                    mouseStatus_UnityFrame.X += f;
                    mouseStatus_UnityFrame.Y += f2;
                    mouseStatus_RealTime.CapturedPointer_DeltaX = 0.0f;
                    mouseStatus_RealTime.CapturedPointer_DeltaY = 0.0f;
                } else {
                    float f3 = mouseStatus_RealTime.GenericMotionEvent_X;
                    mouseStatus_UnityFrame.DeltaX = f3 - mouseStatus_UnityFrame.X;
                    float f4 = mouseStatus_RealTime.GenericMotionEvent_Y;
                    mouseStatus_UnityFrame.DeltaY = f4 - mouseStatus_UnityFrame.Y;
                    mouseStatus_UnityFrame.X = f3;
                    mouseStatus_UnityFrame.Y = f4;
                }
            }
            MouseStatus_RealTime mouseStatus_RealTime2 = _InputStatus;
            if (mouseStatus_RealTime2.Dirty) {
                float f5 = mouseStatus_RealTime2.ScrollH;
                mouseStatus_UnityFrame.DeltaScrollH = f5 - mouseStatus_UnityFrame.DeltaScrollH;
                float f6 = mouseStatus_RealTime2.ScrollV;
                mouseStatus_UnityFrame.DeltaScrollV = f6 - mouseStatus_UnityFrame.DeltaScrollV;
                mouseStatus_UnityFrame.ScrollH = f5;
                mouseStatus_UnityFrame.ScrollV = f6;
                int i2 = 0;
                while (true) {
                    boolean[] zArr = _InputStatus.Buttons;
                    if (i2 >= zArr.length) {
                        break;
                    }
                    ButtonStatus[] buttonStatusArr = _OutputStatus.Buttons;
                    boolean z = true;
                    buttonStatusArr[i2].JustPressed = !buttonStatusArr[i2].Pressing && zArr[i2];
                    ButtonStatus buttonStatus = buttonStatusArr[i2];
                    if (!buttonStatusArr[i2].Pressing || zArr[i2]) {
                        z = false;
                    }
                    buttonStatus.JustReleased = z;
                    buttonStatusArr[i2].Pressing = zArr[i2];
                    zArr[i2] = false;
                    i2++;
                }
            } else {
                mouseStatus_UnityFrame.DeltaScrollH = 0.0f;
                mouseStatus_UnityFrame.DeltaScrollV = 0.0f;
                for (int i3 = 0; i3 < _InputStatus.Buttons.length; i3++) {
                    ButtonStatus[] buttonStatusArr2 = _OutputStatus.Buttons;
                    buttonStatusArr2[i3].JustPressed = false;
                    buttonStatusArr2[i3].JustReleased = false;
                }
            }
            _InputStatus.Dirty = false;
        }
    }

    public static void registerCapturedPointerListener() {
        FFMainActivity fFMainActivity = FFAPI.MainActivity;
        if (fFMainActivity == null) {
            return;
        }
        fFMainActivity.registerCapturedPointerListener();
    }

    public static void registerGenericMotionEventListener() {
        FFMainActivity fFMainActivity = FFAPI.MainActivity;
        if (fFMainActivity == null) {
            return;
        }
        fFMainActivity.registerGenericMotionEventListener();
    }

    public static void releasePointerCapture() {
        FFMainActivity fFMainActivity = FFAPI.MainActivity;
        if (fFMainActivity == null) {
            return;
        }
        fFMainActivity.releasePointerCapture();
    }

    public static void requestPointerCapture() {
        FFMainActivity fFMainActivity = FFAPI.MainActivity;
        if (fFMainActivity == null) {
            return;
        }
        fFMainActivity.requestPointerCapture();
    }

    private static void sendMotionEventToUnity(String str, MotionEvent motionEvent) {
    }

    public static void unregisterCapturedPointerListener() {
        FFMainActivity fFMainActivity = FFAPI.MainActivity;
        if (fFMainActivity == null) {
            return;
        }
        fFMainActivity.unregisterCapturedPointerListener();
    }

    public static void unregisterGenericMotionEventListener() {
        FFMainActivity fFMainActivity = FFAPI.MainActivity;
        if (fFMainActivity == null) {
            return;
        }
        fFMainActivity.registerGenericMotionEventListener();
    }

    private static void updateInputMouseStatus(MotionEvent motionEvent) {
        _InputStatus.ScrollH = motionEvent.getAxisValue(10);
        _InputStatus.ScrollV = motionEvent.getAxisValue(9);
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        int i2 = 0;
        while (true) {
            boolean[] zArr = _InputStatus.Buttons;
            if (i2 >= zArr.length) {
                return;
            }
            zArr[i2] = zArr[i2] | motionEvent.isButtonPressed(1 << i2);
            i2++;
        }
    }
}
