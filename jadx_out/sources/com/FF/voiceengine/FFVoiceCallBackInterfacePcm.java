package com.FF.voiceengine;

/* JADX INFO: loaded from: classes.dex */
public interface FFVoiceCallBackInterfacePcm {
    void onPcmDataMix(int i2, int i3, int i4, byte[] bArr);

    void onPcmDataRecord(int i2, int i3, int i4, byte[] bArr);

    void onPcmDataRemote(int i2, int i3, int i4, byte[] bArr);
}
