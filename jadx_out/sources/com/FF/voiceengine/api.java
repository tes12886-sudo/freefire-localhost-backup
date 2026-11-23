package com.FF.voiceengine;

/* JADX INFO: loaded from: classes.dex */
public class api {
    public static final int RTC_BGM_TO_MIC = 1;
    public static final int RTC_BGM_TO_SPEAKER = 0;
    public static String m_strCallbackName;

    public static void SetCallback(FFVoiceCallBackInterface fFVoiceCallBackInterface) {
        IFFVoiceEventCallback.callBack = fFVoiceCallBackInterface;
    }

    public static native int getBackgroundMusicVolume();

    public static native int getChannelUserList(String str, int i2, boolean z);

    public static native int getEffectVolume();

    public static native int getMicVolume();

    public static native boolean getMicrophoneMute();

    public static native String getSdkInfo();

    public static native float getSoundtouchPitchSemiTones();

    public static native boolean getSpeakerMute();

    public static native boolean getUseMobileNetworkEnabled();

    public static native int getUserRole();

    public static native int getVolume();

    public static native int init(String str, String str2, int i2, String str3);

    public static native boolean isBackgroundMusicPlaying();

    public static native boolean isInChannel(String str);

    public static native boolean isInited();

    public static native boolean isJoined();

    public static native int joinChannelMultiMode(String str, String str2, int i2);

    public static native int joinChannelMultiMode(String str, String str2, int i2, boolean z);

    public static native int joinChannelSingleMode(String str, String str2, int i2);

    public static native int joinChannelSingleMode(String str, String str2, int i2, boolean z);

    public static native int kickOtherFromChannel(String str, String str2, int i2);

    public static native int leaveChannelAll();

    public static native int leaveChannelMultiMode(String str);

    public static native int pauseAllEffects();

    public static native int pauseBackgroundMusic();

    public static native int pauseChannel();

    public static native int pauseEffect(int i2);

    public static native int playBackgroundMusic(String str, boolean z);

    public static native int playEffect(String str, int i2);

    public static native int releaseGrabMic(String str);

    public static boolean releaseMicSync() {
        AudioRecorder.OnAudioRecorderTmp(0);
        return true;
    }

    public static native int reportUserAudio(String str, String str2);

    public static native int requestGrabMic(String str, int i2, boolean z, String str2);

    public static native int requestInviteMic(String str, String str2, String str3);

    public static native int requestRestApi(String str, String str2);

    public static native int responseInviteMic(String str, boolean z, String str2);

    public static native int resumeAllEffects();

    public static native int resumeBackgroundMusic();

    public static native int resumeChannel();

    public static native int resumeEffect(int i2);

    public static boolean resumeMicSync() {
        AudioRecorder.OnAudioRecorderTmp(1);
        return true;
    }

    public static native int sendMessage(String str, String str2);

    public static native int setAudioEffectType(int i2);

    public static native void setAutoSendStatus(boolean z);

    public static native int setBackgroundMusicVolume(int i2);

    public static native int setChannelAudioMode(int i2);

    public static native int setConfig(String str, String str2, String str3, String str4);

    public static native int setEffectVolume(int i2);

    public static native int setExitCommModeWhenHeadsetPlugin(boolean z);

    public static native int setExternalSoundCardMode(boolean z);

    public static native int setFarendVoiceLevelCallback(int i2, int i3);

    public static native int setForceDisableAEC(boolean z);

    public static native int setForceDisableAGC(boolean z);

    public static native int setGrabMicOption(String str, int i2, int i3, int i4, int i5);

    public static native int setHeadsetMonitorOn(boolean z);

    public static native int setHeadsetMonitorOn(boolean z, boolean z2);

    public static native int setInviteMicOption(String str, int i2, int i3);

    public static native int setListenOtherVoice(String str, boolean z);

    public static native int setMagicVoiceEnable(boolean z);

    public static native int setMicLevelCallback(int i2);

    public static native void setMicVolume(int i2);

    public static native void setMicrophoneMute(boolean z);

    public static native int setOtherMicMute(String str, boolean z);

    public static native int setOtherSpeakerMute(String str, boolean z);

    public static native int setOutputToSpeaker(boolean z);

    public static void setPcmCallbackEnable(FFVoiceCallBackInterfacePcm fFVoiceCallBackInterfacePcm, int i2) {
        IFFVoiceEventCallback.mCallbackPcm = fFVoiceCallBackInterfacePcm;
        NativeEngine.setPcmCallbackEnable(i2);
    }

    public static void setPcmCallbackEnableForUnity3D(FFVoiceCallBackInterfacePcmForUnity fFVoiceCallBackInterfacePcmForUnity, int i2) {
        IFFVoiceEventCallback.mCallbackPcmForUntiy = fFVoiceCallBackInterfacePcmForUnity;
        NativeEngine.setPcmCallbackEnable(i2);
    }

    public static native void setPlayingTimeMs(int i2);

    public static native void setRecordingTimeMs(int i2);

    public static native int setReleaseMicWhenMute(boolean z);

    public static native int setReportInfo(int i2, String str);

    public static native int setReverbEnabled(boolean z);

    public static native void setServerRegion(int i2, String str, boolean z);

    public static native int setSoundtouchPitchSemiTones(float f);

    public static native void setSpeakerMute(boolean z);

    public static native void setToken(String str);

    public static native void setUseMobileNetworkEnabled(boolean z);

    public static native int setUserRole(int i2);

    public static native int setUserVolume(String str, int i2);

    public static native int setVadCallbackEnabled(boolean z);

    public static native void setVolume(int i2);

    public static native int setWhiteUserList(String str, String str2);

    public static native int speakToChannel(String str);

    public static native int startGrabMicAction(String str, String str2);

    public static native int stopAllEffects();

    public static native int stopBackgroundMusic();

    public static native int stopEffect(int i2);

    public static native int stopGrabMicAction(String str, String str2);

    public static native int stopInviteMic();

    public static native int unInit();
}
