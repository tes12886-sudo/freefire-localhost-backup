package com.seagroup.gamesdk;

/* JADX INFO: loaded from: classes.dex */
public class MambetInfo {
    private final String deviceId;
    private final String streamKey;

    public MambetInfo(String str, String str2) {
        this.streamKey = str;
        this.deviceId = str2;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getStreamKey() {
        return this.streamKey;
    }
}
