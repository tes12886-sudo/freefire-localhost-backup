package com.garena.unity.webview;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class WebViewStatus implements Parcelable {
    public static final Parcelable.Creator<WebViewStatus> CREATOR = new Parcelable.Creator<WebViewStatus>() { // from class: com.garena.unity.webview.WebViewStatus.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewStatus createFromParcel(Parcel parcel) {
            return new WebViewStatus(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewStatus[] newArray(int i2) {
            return new WebViewStatus[i2];
        }
    };
    public boolean DeferredDisplay;
    public boolean DeferringDisplay;
    public boolean ExtraLog;
    public boolean Hiding;
    public boolean IsLoading;
    public double LoadingProgress;
    public boolean Opening;
    public LinkedList<JavaScriptInvoke> PendingJavaScriptInvokes;
    public String UnitySendMessageGameObjectName;
    public String Url;
    public UnityWebChromeClient WebChromeClient;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f832h;
    public float w;
    public float x;
    public float y;

    public WebViewStatus() {
        this.Opening = false;
        this.DeferredDisplay = false;
        this.DeferringDisplay = false;
        this.Hiding = false;
        this.IsLoading = false;
        this.LoadingProgress = 0.0d;
        this.PendingJavaScriptInvokes = new LinkedList<>();
    }

    protected WebViewStatus(Parcel parcel) {
        this.Opening = false;
        this.DeferredDisplay = false;
        this.DeferringDisplay = false;
        this.Hiding = false;
        this.IsLoading = false;
        this.LoadingProgress = 0.0d;
        this.PendingJavaScriptInvokes = new LinkedList<>();
        this.UnitySendMessageGameObjectName = parcel.readString();
        this.Opening = parcel.readByte() != 0;
        this.DeferredDisplay = parcel.readByte() != 0;
        this.DeferringDisplay = parcel.readByte() != 0;
        this.Hiding = parcel.readByte() != 0;
        this.IsLoading = parcel.readByte() != 0;
        this.LoadingProgress = parcel.readDouble();
        this.Url = parcel.readString();
        this.ExtraLog = parcel.readByte() != 0;
        this.x = parcel.readFloat();
        this.y = parcel.readFloat();
        this.w = parcel.readFloat();
        this.f832h = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.UnitySendMessageGameObjectName);
        parcel.writeByte(this.Opening ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.DeferredDisplay ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.DeferringDisplay ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Hiding ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.IsLoading ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.LoadingProgress);
        parcel.writeString(this.Url);
        parcel.writeByte(this.ExtraLog ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.w);
        parcel.writeFloat(this.f832h);
    }
}
