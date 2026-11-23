package com.dts.freefireth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
class _FFLocalNotification implements Parcelable {
    public static final Parcelable.Creator<_FFLocalNotification> CREATOR = new Parcelable.Creator<_FFLocalNotification>() { // from class: com.dts.freefireth._FFLocalNotification.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public _FFLocalNotification createFromParcel(Parcel parcel) {
            return new _FFLocalNotification(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public _FFLocalNotification[] newArray(int i2) {
            return new _FFLocalNotification[i2];
        }
    };
    public String channel_id;
    public String content;
    public int notification_id;
    public int notify_type;
    public int repeat_interval_ms;
    public int repeat_times;
    public long time_ms;
    public String title;
    public String uri;

    public _FFLocalNotification() {
    }

    public _FFLocalNotification(Parcel parcel) {
        this.notification_id = parcel.readInt();
        this.time_ms = parcel.readLong();
        this.repeat_times = parcel.readInt();
        this.repeat_interval_ms = parcel.readInt();
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.uri = parcel.readString();
        this.channel_id = parcel.readString();
        this.notify_type = parcel.readInt();
    }

    public boolean IsExpired() {
        return System.currentTimeMillis() > this.time_ms + ((long) (this.repeat_times * this.repeat_interval_ms));
    }

    public long NextTime() {
        if (IsExpired()) {
            return -1L;
        }
        double dCurrentTimeMillis = System.currentTimeMillis() - this.time_ms;
        double d = this.repeat_interval_ms;
        Double.isNaN(dCurrentTimeMillis);
        Double.isNaN(d);
        return (((long) Math.ceil(dCurrentTimeMillis / d)) * ((long) this.repeat_interval_ms)) + this.time_ms;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.notification_id);
        parcel.writeLong(this.time_ms);
        parcel.writeInt(this.repeat_times);
        parcel.writeInt(this.repeat_interval_ms);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.uri);
        parcel.writeString(this.channel_id);
        parcel.writeInt(this.notify_type);
    }
}
