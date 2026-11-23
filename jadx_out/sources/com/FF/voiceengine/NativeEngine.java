package com.FF.voiceengine;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class NativeEngine {
    public static final int SERVER_MODE_DEMO = 3;
    public static final int SERVER_MODE_DEV = 2;
    public static final int SERVER_MODE_FIXED_IP_MCU = 6;
    public static final int SERVER_MODE_FIXED_IP_REDIRECT = 5;
    public static final int SERVER_MODE_FIXED_IP_VALIDATE = 4;
    public static final int SERVER_MODE_FORMAL = 0;
    public static final int SERVER_MODE_TEST = 1;

    public static native void AudioPlayerBufRefresh(ByteBuffer byteBuffer, int i2, int i3, int i4);

    public static native void AudioRecorderBufRefresh(ByteBuffer byteBuffer, int i2, int i3, int i4);

    public static native void callbackPermissionStatus(int i2);

    public static native String getSoVersion();

    public static native void onHeadSetPlugin(int i2);

    public static native void onNetWorkChanged(int i2);

    public static native void resetMicrophone();

    public static native void setBrand(String str);

    public static native void setCPUArch(String str);

    public static native void setCPUChip(String str);

    public static native void setDeviceIMEI(String str);

    public static native void setDeviceURN(String str);

    public static native void setDocumentPath(String str);

    public static native void setModel(String str);

    public static native void setPackageName(String str);

    public static native void setPcmCallbackEnable(int i2);

    public static native void setServerIpPort(String str, int i2);

    public static native void setServerMode(int i2);

    public static native void setSysName(String str);

    public static native void setSysVersion(String str);

    public static native void setUUID(String str);

    public static native void setVersionName(String str);
}
