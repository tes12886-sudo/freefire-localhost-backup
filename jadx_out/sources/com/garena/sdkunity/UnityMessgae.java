package com.garena.sdkunity;

import com.unity3d.player.UnityPlayer;
import j.d.d.e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UnityMessgae {
    private static final UnityMessgae instance = new UnityMessgae();
    private final String SdkUnityObjectName = "GarenaMSDK";
    private e gson = new e();

    private UnityMessgae() {
    }

    public static UnityMessgae getInstance() {
        return instance;
    }

    public void sendToUnity(String str, Object obj) {
        sendToUnity(str, this.gson.t(obj));
    }

    public void sendToUnity(String str, String str2) {
        SdkUnity.Log("@UnityMessage.sendToUnity(): " + str + ": " + str2);
        UnityPlayer.UnitySendMessage("GarenaMSDK", str, str2);
    }

    public void sendToUnity(String str, JSONObject jSONObject) {
        sendToUnity(str, jSONObject.toString());
    }
}
