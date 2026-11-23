package com.FF.voiceengine;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class IFFVoiceEventCallback {
    public static FFVoiceCallBackInterface callBack;
    public static FFVoiceCallBackInterfacePcm mCallbackPcm;
    public static FFVoiceCallBackInterfacePcmForUnity mCallbackPcmForUntiy;

    public static void onBroadcast(int i2, String str, String str2, String str3, String str4) {
        FFVoiceCallBackInterface fFVoiceCallBackInterface = callBack;
        if (fFVoiceCallBackInterface != null) {
            fFVoiceCallBackInterface.onBroadcast(i2, str, str2, str3, str4);
        }
    }

    public static void onEvent(int i2, int i3, String str, String str2) {
        FFVoiceCallBackInterface fFVoiceCallBackInterface = callBack;
        if (fFVoiceCallBackInterface != null) {
            fFVoiceCallBackInterface.onEvent(i2, i3, str, str2);
        }
    }

    public static void onEventByte(int i2, int i3, String str, byte[] bArr) {
        if (callBack != null) {
            callBack.onEvent(i2, i3, str, new String(bArr));
        }
    }

    public static void onMemberChange(String str, String str2, boolean z) {
        if (callBack != null) {
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(str2).optJSONArray("memchange");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    MemberChange[] memberChangeArr = new MemberChange[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        memberChangeArr[i2] = new MemberChange();
                        memberChangeArr[i2].userID = jSONArrayOptJSONArray.optJSONObject(i2).optString("userid");
                        memberChangeArr[i2].isJoin = jSONArrayOptJSONArray.optJSONObject(i2).optBoolean("isJoin");
                    }
                    callBack.onMemberChange(str, memberChangeArr, z);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void onPcmDataMix(int i2, int i3, int i4, byte[] bArr) {
        FFVoiceCallBackInterfacePcm fFVoiceCallBackInterfacePcm = mCallbackPcm;
        if (fFVoiceCallBackInterfacePcm != null) {
            fFVoiceCallBackInterfacePcm.onPcmDataMix(i2, i3, i4, bArr);
            return;
        }
        FFVoiceCallBackInterfacePcmForUnity fFVoiceCallBackInterfacePcmForUnity = mCallbackPcmForUntiy;
        if (fFVoiceCallBackInterfacePcmForUnity != null) {
            fFVoiceCallBackInterfacePcmForUnity.onPcmDataMix(i2, i3, i4, new FFVoicePcmDataForUnity(bArr));
        }
    }

    public static void onPcmDataRecord(int i2, int i3, int i4, byte[] bArr) {
        FFVoiceCallBackInterfacePcm fFVoiceCallBackInterfacePcm = mCallbackPcm;
        if (fFVoiceCallBackInterfacePcm != null) {
            fFVoiceCallBackInterfacePcm.onPcmDataRecord(i2, i3, i4, bArr);
            return;
        }
        FFVoiceCallBackInterfacePcmForUnity fFVoiceCallBackInterfacePcmForUnity = mCallbackPcmForUntiy;
        if (fFVoiceCallBackInterfacePcmForUnity != null) {
            fFVoiceCallBackInterfacePcmForUnity.onPcmDataRecord(i2, i3, i4, new FFVoicePcmDataForUnity(bArr));
        }
    }

    public static void onPcmDataRemote(int i2, int i3, int i4, byte[] bArr) {
        FFVoiceCallBackInterfacePcm fFVoiceCallBackInterfacePcm = mCallbackPcm;
        if (fFVoiceCallBackInterfacePcm != null) {
            fFVoiceCallBackInterfacePcm.onPcmDataRemote(i2, i3, i4, bArr);
            return;
        }
        FFVoiceCallBackInterfacePcmForUnity fFVoiceCallBackInterfacePcmForUnity = mCallbackPcmForUntiy;
        if (fFVoiceCallBackInterfacePcmForUnity != null) {
            fFVoiceCallBackInterfacePcmForUnity.onPcmDataRemote(i2, i3, i4, new FFVoicePcmDataForUnity(bArr));
        }
    }

    public static void onRequestRestAPI(int i2, int i3, String str, String str2) {
        FFVoiceCallBackInterface fFVoiceCallBackInterface = callBack;
        if (fFVoiceCallBackInterface != null) {
            fFVoiceCallBackInterface.onRequestRestAPI(i2, i3, str, str2);
        }
    }
}
