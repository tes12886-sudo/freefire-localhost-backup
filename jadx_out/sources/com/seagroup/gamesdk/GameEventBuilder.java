package com.seagroup.gamesdk;

/* JADX INFO: loaded from: classes.dex */
public class GameEventBuilder {
    private final String dataJson;
    private final long time;
    private final String type;

    public GameEventBuilder(String str, long j2, String str2) {
        this.type = str;
        this.time = j2;
        this.dataJson = str2;
    }

    public String toString() {
        return "{\"data\":" + this.dataJson + ",\"ts\":" + this.time + ",\"type\":\"" + this.type + "\"}";
    }
}
