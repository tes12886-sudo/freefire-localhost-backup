package com.garena.unity.webview;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class WebViewActivityParameters implements Parcelable {
    public static final Parcelable.Creator<WebViewActivityParameters> CREATOR = new Parcelable.Creator<WebViewActivityParameters>() { // from class: com.garena.unity.webview.WebViewActivityParameters.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewActivityParameters createFromParcel(Parcel parcel) {
            return new WebViewActivityParameters(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewActivityParameters[] newArray(int i2) {
            return new WebViewActivityParameters[i2];
        }
    };
    public boolean auto_play_media;
    public boolean cookie;
    public boolean defer_display;
    public boolean extra_log;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f831h;
    public boolean hardware_acceleration;
    public int id;
    public boolean scaling;
    public String script_handler_name;
    public String unity_send_message_gameobject_name;
    public String url;
    public float w;
    public float x;
    public float y;

    public WebViewActivityParameters(int i2) {
        this.scaling = false;
        this.cookie = true;
        this.defer_display = false;
        this.extra_log = false;
        this.auto_play_media = true;
        this.hardware_acceleration = true;
        this.id = i2;
    }

    protected WebViewActivityParameters(Parcel parcel) {
        this.scaling = false;
        this.cookie = true;
        this.defer_display = false;
        this.extra_log = false;
        this.auto_play_media = true;
        this.hardware_acceleration = true;
        this.id = parcel.readInt();
        this.url = parcel.readString();
        this.x = parcel.readFloat();
        this.y = parcel.readFloat();
        this.w = parcel.readFloat();
        this.f831h = parcel.readFloat();
        this.scaling = parcel.readByte() != 0;
        this.cookie = parcel.readByte() != 0;
        this.defer_display = parcel.readByte() != 0;
        this.extra_log = parcel.readByte() != 0;
        this.auto_play_media = parcel.readByte() != 0;
        this.hardware_acceleration = parcel.readByte() != 0;
        this.unity_send_message_gameobject_name = parcel.readString();
        this.script_handler_name = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void merge(WebViewParameters webViewParameters) {
        this.scaling = webViewParameters.Scaling;
        this.cookie = webViewParameters.UseCookie;
        this.defer_display = webViewParameters.DeferredDisplay;
        this.extra_log = webViewParameters.ExtraLog;
        this.auto_play_media = webViewParameters.AutoPlayMedia;
        this.hardware_acceleration = webViewParameters.HardwareAcceleration;
        this.unity_send_message_gameobject_name = webViewParameters.UnitySendMessageGameObjectName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.id);
        parcel.writeString(this.url);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.w);
        parcel.writeFloat(this.f831h);
        parcel.writeByte(this.scaling ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.cookie ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.defer_display ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.extra_log ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.auto_play_media ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hardware_acceleration ? (byte) 1 : (byte) 0);
        parcel.writeString(this.unity_send_message_gameobject_name);
        parcel.writeString(this.script_handler_name);
    }
}
