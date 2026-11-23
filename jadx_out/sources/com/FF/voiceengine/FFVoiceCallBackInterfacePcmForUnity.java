package com.FF.voiceengine;

/* JADX INFO: loaded from: classes.dex */
public interface FFVoiceCallBackInterfacePcmForUnity {
    void onPcmDataMix(int i2, int i3, int i4, FFVoicePcmDataForUnity fFVoicePcmDataForUnity);

    void onPcmDataRecord(int i2, int i3, int i4, FFVoicePcmDataForUnity fFVoicePcmDataForUnity);

    void onPcmDataRemote(int i2, int i3, int i4, FFVoicePcmDataForUnity fFVoicePcmDataForUnity);
}
