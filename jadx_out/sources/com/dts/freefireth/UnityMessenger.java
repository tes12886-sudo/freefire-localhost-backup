package com.dts.freefireth;

import com.dts.freefireth.mambetwrapper.IUnityMessenger;

/* JADX INFO: loaded from: classes.dex */
class UnityMessenger implements IUnityMessenger, com.garena.unity.webview.IUnityMessenger {
    private static UnityMessenger _I;

    UnityMessenger() {
    }

    public static UnityMessenger I() {
        if (_I == null) {
            _I = new UnityMessenger();
        }
        return _I;
    }

    @Override // com.dts.freefireth.mambetwrapper.IUnityMessenger, com.garena.unity.webview.IUnityMessenger
    public void Send(String str, String str2, String str3) {
        FFMainActivity.FFSendToUnity(str, str2, str3);
    }
}
