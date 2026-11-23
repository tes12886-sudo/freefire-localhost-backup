package com.seagroup.gamesdk;

import j.d.d.y.c;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CheckChannelRequest implements Serializable {

    @c("device_id")
    private final String deviceId;

    @c("source_id")
    private final int sourceId = 1;

    @c("stream_key")
    private final String streamKey;

    public CheckChannelRequest(String str, String str2) {
        this.streamKey = str;
        this.deviceId = str2;
    }
}
