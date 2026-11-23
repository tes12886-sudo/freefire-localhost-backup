package com.seagroup.gamesdk;

import android.os.Parcelable;
import j.d.d.y.c;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class GameEvent implements Serializable {

    @c("data")
    private final Parcelable data;

    @c("ts")
    private final long timestamp;

    @c("type")
    private final String type;

    public GameEvent(String str, long j2, Parcelable parcelable) {
        this.type = str;
        this.timestamp = j2;
        this.data = parcelable;
    }
}
