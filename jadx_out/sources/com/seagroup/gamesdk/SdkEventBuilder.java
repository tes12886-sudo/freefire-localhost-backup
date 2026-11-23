package com.seagroup.gamesdk;

/* JADX INFO: loaded from: classes.dex */
public class SdkEventBuilder {
    private static final int MAX_SIZE = 200;
    public static final int PLATFORM_ANDROID = 2;
    public static final int PLATFORM_IOS = 1;
    private final String deviceId;
    private final String gameAccountId;
    private final String packageName;
    private final String streamId;
    private final String streamKey;
    private final String version;
    private int platform = 2;
    private int eventCount = 0;
    private StringBuilder stringBuilder = new StringBuilder();

    public SdkEventBuilder(String str, String str2, String str3, String str4, String str5, String str6) {
        this.packageName = str;
        this.streamId = str2;
        this.streamKey = str3;
        this.version = str4;
        this.gameAccountId = str5;
        this.deviceId = str6;
    }

    public boolean addEvent(String str) {
        StringBuilder sb;
        String str2;
        if (this.eventCount == 0) {
            sb = this.stringBuilder;
            str2 = "{\"event_list\":[";
        } else {
            sb = this.stringBuilder;
            str2 = ",";
        }
        sb.append(str2);
        sb.append(str);
        int i2 = this.eventCount + 1;
        this.eventCount = i2;
        return i2 >= 200;
    }

    public String toString() {
        StringBuilder sb = this.stringBuilder;
        sb.append("],\"package_name\":\"");
        sb.append(this.packageName);
        sb.append("\",\"platform\":");
        sb.append(this.platform);
        sb.append(",\"stream_id\":\"");
        sb.append(this.streamId);
        sb.append("\",\"stream_key\":\"");
        sb.append(this.streamKey);
        sb.append("\",\"version\":\"");
        sb.append(this.version);
        sb.append("\",\"account_id\":\"");
        sb.append(this.gameAccountId);
        sb.append("\",\"device_id\": \"");
        sb.append(this.deviceId);
        sb.append("\"}");
        return sb.toString();
    }
}
