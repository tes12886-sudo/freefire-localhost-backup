package com.unity3d.plugin.downloader;

import j.d.a.e.a.a.i.g;

/* JADX INFO: loaded from: classes.dex */
public class UnityDownloaderService extends g {
    static String BASE64_PUBLIC_KEY = "REPLACE THIS WITH YOUR PUBLIC KEY - DONE FROM C#";
    static byte[] SALT = {1, 43, -12, -1, 54, 98, -100, -12, 43, 2, -8, -4, 9, 5, -106, -108, -33, 45, -1, 84};

    @Override // j.d.a.e.a.a.i.g
    public String getAlarmReceiverClassName() {
        return UnityAlarmReceiver.class.getName();
    }

    @Override // j.d.a.e.a.a.i.g
    public String getPublicKey() {
        return BASE64_PUBLIC_KEY;
    }

    @Override // j.d.a.e.a.a.i.g
    public byte[] getSALT() {
        return SALT;
    }
}
