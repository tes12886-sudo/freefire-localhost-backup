package com.dts.freefireth.mambetwrapper;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.util.Log;
import com.dts.freefireth.FFAPI;
import com.seagroup.gamesdk.MambetInfo;
import com.seagroup.gamesdk.MambetSdkLibrary;
import com.seagroup.gamesdk.VoiceDataSender;
import j.d.d.e;

/* JADX INFO: loaded from: classes.dex */
public class MambetWrapper {
    public static String UnitySendMessageGameObjectName;
    private static Activity _Activity;
    private static IUnityMessenger _Messenger;
    private static FFStatusCallback _StatusCallback;
    private static VoiceDataSender _VoiceDataSender;
    private static MambetInfo _info;
    private static boolean _inited;
    private static e gsonExternal;
    private static e gsonUnity;
    private static AudioDataSent unityAudioDataSent = new AudioDataSent();
    private static AudioDataSent externalAudioDataSent = new AudioDataSent();

    public static void VoiceDataSender_ReleaseMic() {
        Activity activity = _Activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dts.freefireth.mambetwrapper.MambetWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                if (MambetWrapper._VoiceDataSender == null) {
                    return;
                }
                try {
                    MambetWrapper._VoiceDataSender.releaseMic();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void VoiceDataSender_RequestMic() {
        Activity activity = _Activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dts.freefireth.mambetwrapper.MambetWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (MambetWrapper._VoiceDataSender == null) {
                    return;
                }
                try {
                    MambetWrapper._VoiceDataSender.requestMic();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void VoiceDataSender_SendAudioData(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        VoiceDataSender voiceDataSender = _VoiceDataSender;
        if (voiceDataSender == null) {
            return;
        }
        try {
            voiceDataSender.sendAudioData(i2, i3, i4, bArr, i5);
        } catch (Throwable unused) {
        }
        if (gsonExternal == null) {
            gsonExternal = new e();
        }
        AudioDataSent audioDataSent = externalAudioDataSent;
        audioDataSent.id = i6;
        audioDataSent.length = bArr.length;
        String strT = gsonExternal.t(audioDataSent);
        IUnityMessenger iUnityMessenger = _Messenger;
        if (iUnityMessenger != null) {
            iUnityMessenger.Send(UnitySendMessageGameObjectName, "ExternalAudioDataSent", strT);
        }
    }

    public static void VoiceDataSender_SendUnityAudioData(int i2, int i3, float[] fArr, int i4) {
        VoiceDataSender voiceDataSender = _VoiceDataSender;
        if (voiceDataSender == null) {
            return;
        }
        try {
            voiceDataSender.sendUnityAudioData(i2, i3, fArr);
        } catch (Throwable unused) {
        }
        if (gsonUnity == null) {
            gsonUnity = new e();
        }
        AudioDataSent audioDataSent = unityAudioDataSent;
        audioDataSent.id = i4;
        audioDataSent.length = fArr.length;
        String strT = gsonUnity.t(audioDataSent);
        IUnityMessenger iUnityMessenger = _Messenger;
        if (iUnityMessenger != null) {
            iUnityMessenger.Send(UnitySendMessageGameObjectName, "UnityAudioDataSent", strT);
        }
    }

    public static void VoiceDataSender_Start(final boolean z) {
        Activity activity = _Activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dts.freefireth.mambetwrapper.MambetWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                if (MambetWrapper._StatusCallback == null) {
                    FFStatusCallback unused = MambetWrapper._StatusCallback = new FFStatusCallback();
                }
                if (MambetWrapper._VoiceDataSender == null) {
                    VoiceDataSender unused2 = MambetWrapper._VoiceDataSender = new VoiceDataSender(MambetWrapper._StatusCallback, z);
                }
                try {
                    MambetWrapper._VoiceDataSender.start(MambetWrapper._Activity);
                } catch (Throwable unused3) {
                }
            }
        });
    }

    public static void VoiceDataSender_Stop() {
        Activity activity = _Activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.dts.freefireth.mambetwrapper.MambetWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MambetWrapper._VoiceDataSender != null) {
                        MambetWrapper._VoiceDataSender.stop();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void _init(final Application application, final int i2, final boolean z) {
        _Activity.runOnUiThread(new Runnable() { // from class: com.dts.freefireth.mambetwrapper.MambetWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                if (application == null || MambetWrapper._inited) {
                    return;
                }
                try {
                    MambetSdkLibrary.init(application, i2, z);
                    boolean unused = MambetWrapper._inited = true;
                    if (MambetWrapper._info == null || MambetSdkLibrary.getInstance() == null) {
                        return;
                    }
                    try {
                        MambetSdkLibrary.getInstance().handleMambetInfo(MambetWrapper._info);
                    } catch (Throwable unused2) {
                    }
                    MambetInfo unused3 = MambetWrapper._info = null;
                } catch (Throwable th) {
                    Log.e("Mambet", "init throw", th);
                }
            }
        });
    }

    private static Runnable _pushEvent(final String str, final String str2) {
        return new Runnable() { // from class: com.dts.freefireth.mambetwrapper.MambetWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                if (MambetWrapper._inited && MambetSdkLibrary.getInstance() != null) {
                    try {
                        MambetSdkLibrary.getInstance().pushEvent(str, str2);
                    } catch (Throwable unused) {
                    }
                }
            }
        };
    }

    private static Runnable _setAccountID(final String str) {
        return new Runnable() { // from class: com.dts.freefireth.mambetwrapper.MambetWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (MambetWrapper._inited && MambetSdkLibrary.getInstance() != null) {
                    try {
                        MambetSdkLibrary.getInstance().setCurrentAccountID(str);
                    } catch (Throwable unused) {
                    }
                }
            }
        };
    }

    public static void handleintent(Intent intent) {
        if (!_inited) {
            _info = MambetSdkLibrary.parseIntent(intent);
        } else if (MambetSdkLibrary.getInstance() != null) {
            try {
                MambetSdkLibrary.getInstance().handleIntent(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public static void init(int i2, boolean z) {
        Activity activity = _Activity;
        if (activity == null) {
            return;
        }
        _init(activity.getApplication(), i2, z);
    }

    public static boolean inited() {
        return _inited;
    }

    public static void onConnectChanged(final boolean z) {
        Activity activity = _Activity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.dts.freefireth.mambetwrapper.MambetWrapper.8
                @Override // java.lang.Runnable
                public void run() {
                    if (MambetWrapper._Messenger == null) {
                        return;
                    }
                    MambetWrapper._Messenger.Send(MambetWrapper.UnitySendMessageGameObjectName, "onConnectChanged", (z + "").toLowerCase());
                }
            });
            return;
        }
        Log.w(FFAPI.LOG_TAG, "@FFStatusCallback.onConnectChanged(" + z + "): MainActivity is null!");
    }

    public static void onMicFocusChanged(final boolean z) {
        Activity activity = _Activity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.dts.freefireth.mambetwrapper.MambetWrapper.9
                @Override // java.lang.Runnable
                public void run() {
                    if (MambetWrapper._Messenger == null) {
                        return;
                    }
                    MambetWrapper._Messenger.Send(MambetWrapper.UnitySendMessageGameObjectName, "onMicFocusChanged", (z + "").toLowerCase());
                }
            });
            return;
        }
        Log.w(FFAPI.LOG_TAG, "@FFStatusCallback.onMicFocusChanged(" + z + "): MainActivity is null!");
    }

    public static void pushEvent(String str, String str2) {
        Activity activity = _Activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(_pushEvent(str, str2));
    }

    public static void setAccountID(String str) {
        Activity activity = _Activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(_setAccountID(str));
    }

    public static void setActivity(Activity activity) {
        _Activity = activity;
    }

    public static void setUnityMessenger(IUnityMessenger iUnityMessenger) {
        _Messenger = iUnityMessenger;
    }

    public static void setUnitySendMessageGameObjectName(String str) {
        UnitySendMessageGameObjectName = str;
    }
}
