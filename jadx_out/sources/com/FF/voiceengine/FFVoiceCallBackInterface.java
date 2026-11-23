package com.FF.voiceengine;

/* JADX INFO: loaded from: classes.dex */
public interface FFVoiceCallBackInterface {
    void onBroadcast(int i2, String str, String str2, String str3, String str4);

    void onEvent(int i2, int i3, String str, Object obj);

    void onMemberChange(String str, MemberChange[] memberChangeArr, boolean z);

    void onRequestRestAPI(int i2, int i3, String str, String str2);
}
