package com.FF.voiceengine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Display;
import androidx.core.content.a;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public class AudioMgr {
    private static String NET_CHANGE_ACTION = null;
    private static final int audioPermissionRequestCode = 1;
    private static DisplayManager.DisplayListener displayListener;
    private static DisplayManager displayManager;
    private static boolean isCheckedPermission;
    private static boolean isStopedByExternalNotify;
    private static AudioManager mAudioManager;
    private static Context mContext;
    private static Boolean mHasChangedBoolean;
    private static boolean mHasHeadSet;
    private static boolean mIsBluetoothOn;
    private static Boolean mIsBluetoothScoOn;
    private static Boolean mIsHDMIDisplay;
    private static Boolean mIsOutputToSpeaker;
    private static int mMode;
    private static PermissionCheckThread mPermissionCheckThread;
    private static BroadcastReceiver mReceiver;
    private static Boolean mSpeakerOnBoolean;
    private static int requestPermissionCount;

    private static class PermissionCheckThread extends Thread {
        private PermissionCheckThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.i("AudioMgr", "PermissionCheck starts...");
                while (!Thread.interrupted()) {
                    AudioMgr.access$608();
                    Thread.sleep(5000L);
                    if (AudioMgr.mContext != null && (AudioMgr.mContext instanceof Activity) && a.a((Activity) AudioMgr.mContext, "android.permission.RECORD_AUDIO") == 0) {
                        NativeEngine.resetMicrophone();
                        break;
                    } else if (AudioMgr.requestPermissionCount > 3) {
                        int unused = AudioMgr.requestPermissionCount = 0;
                        NativeEngine.callbackPermissionStatus(FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_REC_NO_PERMISSION);
                        break;
                    }
                }
            } catch (InterruptedException unused2) {
                Log.i("AudioMgr", "PermissionCheck interrupted");
            } catch (Throwable th) {
                Log.e("AudioMgr", "PermissionCheck caught a throwable:" + th.getMessage());
            }
            Log.i("AudioMgr", "PermissionCheck exit");
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        mSpeakerOnBoolean = bool;
        mIsOutputToSpeaker = bool;
        mMode = -1;
        mHasChangedBoolean = bool;
        NET_CHANGE_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
        mReceiver = null;
        displayManager = null;
        displayListener = null;
        mIsHDMIDisplay = bool;
        mContext = null;
        mIsBluetoothScoOn = bool;
        mHasHeadSet = false;
        mIsBluetoothOn = false;
        requestPermissionCount = 0;
        isStopedByExternalNotify = false;
        isCheckedPermission = false;
        mPermissionCheckThread = null;
    }

    public static void OnHeadsetChange(final AudioManager audioManager, final Boolean bool, final Boolean bool2) {
        StringBuilder sb;
        boolean zIsBluetoothScoOn = audioManager.isBluetoothScoOn();
        boolean zIsBluetoothA2dpOn = audioManager.isBluetoothA2dpOn();
        Log.i("AudioMgr", "OnHeadsetChange hasHeadSet:" + bool + ", isBluetoothOn:" + bool2 + ", isBluetoothScoOn:" + zIsBluetoothScoOn + ",  isBluetoothA2dpOn:" + zIsBluetoothA2dpOn);
        if (bool.booleanValue()) {
            audioManager.setSpeakerphoneOn(false);
            Log.i("AudioMgr", "setSpeakerphoneOn " + mSpeakerOnBoolean + " 4");
            audioManager.setBluetoothScoOn(false);
            AppPara.onHeadSetPlugin(1);
            sb = new StringBuilder();
            sb.append("hasHeadSet:");
            sb.append(bool);
            sb.append(" isBluetoothOn:");
            sb.append(bool2);
        } else {
            if (bool2.booleanValue()) {
                new Timer().schedule(new TimerTask() { // from class: com.FF.voiceengine.AudioMgr.3
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        try {
                            Boolean boolValueOf = Boolean.valueOf(audioManager.isBluetoothScoOn());
                            Log.i("AudioMgr", "mIsBluetoothOn:" + AudioMgr.mIsBluetoothOn + " isBluetoothScoOn:" + boolValueOf + " mode:" + AudioMgr.mMode);
                            if (AudioMgr.mIsBluetoothOn && AudioMgr.mMode > -1) {
                                Log.i("AudioMgr", "not isBluetoothScoOn, need to startBluetoothSco");
                                if (!boolValueOf.booleanValue()) {
                                    audioManager.startBluetoothSco();
                                }
                                audioManager.setSpeakerphoneOn(false);
                                Log.i("AudioMgr", "setSpeakerphoneOn false 5");
                                audioManager.setBluetoothScoOn(true);
                            }
                            AppPara.onHeadSetPlugin(0);
                            Log.i("AudioMgr", "hasHeadSet:" + bool + " isBluetoothOn:" + bool2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }, 200L);
                return;
            }
            audioManager.stopBluetoothSco();
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(mIsOutputToSpeaker.booleanValue());
            Log.i("AudioMgr", "setSpeakerphoneOn " + mIsOutputToSpeaker + " 6");
            AppPara.onHeadSetPlugin(0);
            sb = new StringBuilder();
            sb.append("hasHeadSet:");
            sb.append(bool);
            sb.append(" isBluetoothA2dpOn:");
            sb.append(zIsBluetoothA2dpOn);
            sb.append(" output2Speaker:");
            sb.append(mIsOutputToSpeaker);
        }
        Log.i("AudioMgr", sb.toString());
    }

    public static void OnReqeustPermissionResult(int i2, String[] strArr, int[] iArr) {
        if (iArr.length > 0) {
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (strArr[i3].equals("android.permission.RECORD_AUDIO")) {
                    isStopedByExternalNotify = true;
                    stopRequestPermissionForApi23();
                    Log.i("AudioMgr", iArr[i3] == 0 ? "OnReqeustPermissionResult Already got record permission" : "OnReqeustPermissionResult user not granted permission");
                    stopRequestPermissionForApi23();
                    NativeEngine.resetMicrophone();
                }
            }
        }
    }

    static /* synthetic */ int access$608() {
        int i2 = requestPermissionCount;
        requestPermissionCount = i2 + 1;
        return i2;
    }

    public static boolean hasChangedCoutum() {
        return mHasChangedBoolean.booleanValue();
    }

    public static void hdmiDisplayCheck() {
        if (mContext == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        displayManager = (DisplayManager) mContext.getSystemService("display");
        DisplayManager.DisplayListener displayListener2 = new DisplayManager.DisplayListener() { // from class: com.FF.voiceengine.AudioMgr.2
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int i2) {
                try {
                    String name = AudioMgr.displayManager.getDisplay(i2).getName();
                    Log.i("AudioMgr", "onDisplayAdded:" + i2 + ", name:" + name);
                    if (name.contains("HDMI")) {
                        api.pauseChannel();
                        api.resumeChannel();
                    }
                } catch (Throwable th) {
                    Log.e("AudioMgr", "onDisplayAdded fail:");
                    th.printStackTrace();
                }
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int i2) {
                Log.i("AudioMgr", "mark onDisplayChanged:" + i2);
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int i2) {
                Log.i("AudioMgr", "onDisplayRemoved:" + i2);
                if (AudioMgr.mIsHDMIDisplay.booleanValue()) {
                    api.pauseChannel();
                    api.resumeChannel();
                }
            }
        };
        displayListener = displayListener2;
        try {
            displayManager.registerDisplayListener(displayListener2, null);
        } catch (Throwable th) {
            Log.e("AudioMgr", "registerDisplayListener fail:");
            th.printStackTrace();
        }
    }

    public static void init(Context context) {
        if (mContext != null) {
            if (context instanceof Activity) {
                mContext = context;
                return;
            }
            return;
        }
        mContext = context;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        mAudioManager = audioManager;
        mIsOutputToSpeaker = Boolean.valueOf(audioManager.isSpeakerphoneOn());
        AppPara.onNetWorkChange(NetUtil.getNetworkState(mContext));
        mReceiver = new BroadcastReceiver() { // from class: com.FF.voiceengine.AudioMgr.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String str;
                Boolean boolValueOf;
                Boolean boolValueOf2;
                try {
                    if (com.FF.voiceengine.mgr.FFVoiceManager.mInited.booleanValue() && api.isJoined()) {
                        AudioManager audioManager2 = (AudioManager) AudioMgr.mContext.getSystemService("audio");
                        String action = intent.getAction();
                        Log.i("AudioMgr", "onReceive action: " + action + "  state: " + intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1));
                        if (action.equals(AudioMgr.NET_CHANGE_ACTION)) {
                            AppPara.onNetWorkChange(NetUtil.getNetworkState(AudioMgr.mContext));
                        }
                        if (action.equals("android.intent.action.HEADSET_PLUG")) {
                            boolean unused = AudioMgr.mHasHeadSet = intent.getIntExtra("state", 0) != 0;
                            AudioMgr.OnHeadsetChange(audioManager2, Boolean.valueOf(AudioMgr.mHasHeadSet), Boolean.valueOf(AudioMgr.mIsBluetoothOn));
                        }
                        if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            if (intExtra != 2) {
                                if (intExtra == 1) {
                                    str = "BluetoothProfile.STATE_CONNECTING";
                                } else if (intExtra == 0) {
                                    Log.i("AudioMgr", "BluetoothProfile.STATE_DISCONNECTED");
                                    boolean unused2 = AudioMgr.mIsBluetoothOn = false;
                                    boolValueOf = Boolean.valueOf(AudioMgr.mHasHeadSet);
                                    boolValueOf2 = Boolean.valueOf(AudioMgr.mIsBluetoothOn);
                                } else if (intExtra != 3) {
                                    return;
                                } else {
                                    str = "BluetoothProfile.STATE_DISCONNECTING";
                                }
                                Log.i("AudioMgr", str);
                                return;
                            }
                            Log.i("AudioMgr", "BluetoothProfile.STATE_CONNECTED");
                            boolean unused3 = AudioMgr.mIsBluetoothOn = true;
                            boolValueOf = Boolean.valueOf(AudioMgr.mHasHeadSet);
                            boolValueOf2 = Boolean.valueOf(AudioMgr.mIsBluetoothOn);
                            AudioMgr.OnHeadsetChange(audioManager2, boolValueOf, boolValueOf2);
                        }
                        if (!action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                            if (action.equals("android.intent.action.PHONE_STATE")) {
                                String string = intent.getExtras().getString("state");
                                Log.i("AudioMgr", "stateStr:" + string);
                                if (string.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                                    api.resumeChannel();
                                    return;
                                } else {
                                    if (string.equals(TelephonyManager.EXTRA_STATE_OFFHOOK) || string.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                                        api.pauseChannel();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                        if (intExtra2 == 12) {
                            Log.i("AudioMgr", "BluetoothHeadset.STATE_AUDIO_CONNECTED");
                            boolean unused4 = AudioMgr.mIsBluetoothOn = true;
                            boolValueOf = Boolean.valueOf(AudioMgr.mHasHeadSet);
                            boolValueOf2 = Boolean.valueOf(AudioMgr.mIsBluetoothOn);
                        } else {
                            if (intExtra2 != 10) {
                                if (intExtra2 == 11) {
                                    str = "BluetoothHeadset.STATE_AUDIO_CONNECTING";
                                    Log.i("AudioMgr", str);
                                    return;
                                }
                                return;
                            }
                            Log.i("AudioMgr", "BluetoothHeadset.STATE_AUDIO_DISCONNECTED");
                            boolean unused5 = AudioMgr.mIsBluetoothOn = audioManager2.isBluetoothScoOn();
                            boolValueOf = Boolean.valueOf(AudioMgr.mHasHeadSet);
                            boolValueOf2 = Boolean.valueOf(AudioMgr.mIsBluetoothOn);
                        }
                        AudioMgr.OnHeadsetChange(audioManager2, boolValueOf, boolValueOf2);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        try {
            context.registerReceiver(mReceiver, intentFilter);
        } catch (Throwable th) {
            Log.e("AudioMgr", "registerReceiver fail:");
            th.printStackTrace();
        }
        hdmiDisplayCheck();
    }

    public static void initAudioSettings(boolean z) {
        boolean zIsWiredHeadsetOn = mAudioManager.isWiredHeadsetOn();
        boolean zIsBluetoothScoOn = mAudioManager.isBluetoothScoOn();
        boolean zIsBluetoothA2dpOn = mAudioManager.isBluetoothA2dpOn();
        mIsOutputToSpeaker = Boolean.valueOf(z);
        try {
            if (zIsWiredHeadsetOn || zIsBluetoothScoOn || zIsBluetoothA2dpOn) {
                mAudioManager.setSpeakerphoneOn(false);
                Log.i("AudioMgr", "initAudioSettings setSpeakerphoneOn:false (isWiredHeadsetOn:" + zIsWiredHeadsetOn + " isBluetoothScoOn:" + zIsBluetoothScoOn + " isBluetoothA2dpOn:" + zIsBluetoothA2dpOn + ")");
            } else {
                Log.i("AudioMgr", "initAudioSetting setSpeakerphoneOn:" + z);
                mAudioManager.setSpeakerphoneOn(z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static int isBluetoothOn() {
        AudioManager audioManager = mAudioManager;
        if (audioManager != null) {
            return (audioManager.isBluetoothScoOn() || mAudioManager.isBluetoothA2dpOn()) ? 1 : 0;
        }
        return 0;
    }

    public static boolean isHdmiOutput() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                for (Display display : displayManager.getDisplays()) {
                    if (display.getName().contains("HDMI")) {
                        z = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                Log.e("AudioMgr", "catch isHdmiOutput fail:");
                th.printStackTrace();
            }
        }
        mIsHDMIDisplay = Boolean.valueOf(z);
        Log.e("AudioMgr", "mark hdmi:" + z);
        return z;
    }

    public static int isWiredHeadsetOn() {
        AudioManager audioManager = mAudioManager;
        if (audioManager != null) {
            return audioManager.isWiredHeadsetOn() ? 1 : 0;
        }
        return 0;
    }

    public static void restoreOldMode() {
        try {
            if (mAudioManager == null) {
                return;
            }
            mIsOutputToSpeaker = mSpeakerOnBoolean;
            if (mHasChangedBoolean.booleanValue()) {
                mHasChangedBoolean = Boolean.FALSE;
                mSpeakerOnBoolean = Boolean.valueOf(mAudioManager.isSpeakerphoneOn());
                Log.i("AudioMgr", "restoreOldMode old:" + mMode + ", mIsBluetoothScoOn:" + mAudioManager.isBluetoothScoOn());
                if (mMode != 0) {
                    Log.i("AudioMgr", "stop setmode:" + mMode + " setSpeakerphoneOn:" + mSpeakerOnBoolean);
                    mAudioManager.setMode(0);
                    mAudioManager.setSpeakerphoneOn(mSpeakerOnBoolean.booleanValue());
                    Log.i("AudioMgr", "setSpeakerphoneOn " + mSpeakerOnBoolean + " 3");
                }
                mMode = -1;
                if (mAudioManager.isBluetoothScoOn()) {
                    Log.i("AudioMgr", "restoreOldMode stop BluetoothSco");
                    mAudioManager.stopBluetoothSco();
                    mAudioManager.setBluetoothScoOn(false);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @TargetApi(16)
    public static void setVoiceModeRTCCoutum() {
        String str;
        try {
            AudioManager audioManager = mAudioManager;
            if (audioManager == null) {
                Log.e("AudioMgr", "mAudioManager is null");
                return;
            }
            mSpeakerOnBoolean = Boolean.valueOf(audioManager.isSpeakerphoneOn());
            mIsBluetoothScoOn = Boolean.valueOf(mAudioManager.isBluetoothScoOn());
            int i2 = Build.VERSION.SDK_INT >= 11 ? 3 : 2;
            Log.i("AudioMgr", "==mMode:" + mMode + " mSpeakerOnBoolean:" + mSpeakerOnBoolean + " mIsBluetoothScoOn:" + mIsBluetoothScoOn + " isBluetoothA2dpOn:" + mAudioManager.isBluetoothA2dpOn());
            if (mMode == -1) {
                int mode = mAudioManager.getMode();
                mMode = mode;
                if (mode != i2) {
                    Log.i("AudioMgr", "start setmode:" + i2);
                    mAudioManager.setMode(i2);
                    mMode = i2;
                } else {
                    Log.w("AudioMgr", "Already in MODE_IN_COMMUNICATION");
                }
            }
            boolean z = true;
            if (mAudioManager.isBluetoothA2dpOn() || mIsBluetoothScoOn.booleanValue()) {
                mAudioManager.startBluetoothSco();
                mAudioManager.setSpeakerphoneOn(false);
                Log.i("AudioMgr", "setSpeakerphoneOn false 1");
                mAudioManager.setBluetoothScoOn(true);
                str = "to bluetooth";
            } else {
                if (mAudioManager.isWiredHeadsetOn()) {
                    z = false;
                }
                Log.i("AudioMgr", "isToSpeaker:" + z);
                mAudioManager.setSpeakerphoneOn(z);
                str = "setSpeakerphoneOn " + z + " 2";
            }
            Log.i("AudioMgr", str);
            Log.i("AudioMgr", "set communication");
            mHasChangedBoolean = Boolean.TRUE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean startRequestPermissionForApi23() {
        Context context;
        boolean z = true;
        isCheckedPermission = true;
        if (isStopedByExternalNotify) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT < 23 || (context = mContext) == null || !(context instanceof Activity) || context.getApplicationInfo().targetSdkVersion < 23) {
                return false;
            }
            try {
                if (a.a((Activity) mContext, "android.permission.RECORD_AUDIO") == 0) {
                    Log.i("AudioMgr", "Already got record permission");
                    return true;
                }
                Log.e("AudioMgr", "Request for record permission");
                androidx.core.app.a.o((Activity) mContext, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                PermissionCheckThread permissionCheckThread = mPermissionCheckThread;
                if (permissionCheckThread != null) {
                    permissionCheckThread.interrupt();
                    mPermissionCheckThread.join(2000L);
                }
                PermissionCheckThread permissionCheckThread2 = new PermissionCheckThread();
                mPermissionCheckThread = permissionCheckThread2;
                permissionCheckThread2.start();
                return true;
            } catch (Throwable th) {
                th = th;
                Log.e("AudioMgr", "Exception for startRequirePermiForApi23");
                th.printStackTrace();
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public static void stopRequestPermissionForApi23() {
        try {
            PermissionCheckThread permissionCheckThread = mPermissionCheckThread;
            if (permissionCheckThread != null) {
                permissionCheckThread.interrupt();
                mPermissionCheckThread.join(2000L);
                mPermissionCheckThread = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void uinit() {
        Log.i("AudioMgr", "uinit");
        mContext.unregisterReceiver(mReceiver);
        mContext = null;
        mReceiver = null;
    }
}
