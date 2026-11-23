package com.garena.unity.webview;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class JavaScriptInvoke implements Parcelable {
    public static final Parcelable.Creator<JavaScriptInvoke> CREATOR = new Parcelable.Creator<JavaScriptInvoke>() { // from class: com.garena.unity.webview.JavaScriptInvoke.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JavaScriptInvoke createFromParcel(Parcel parcel) {
            return new JavaScriptInvoke(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JavaScriptInvoke[] newArray(int i2) {
            return new JavaScriptInvoke[i2];
        }
    };
    public String callback;
    public String code;
    public String id;
    public int webViewId;

    public JavaScriptInvoke() {
    }

    protected JavaScriptInvoke(Parcel parcel) {
        this.webViewId = parcel.readInt();
        this.code = parcel.readString();
        this.callback = parcel.readString();
        this.id = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.webViewId);
        parcel.writeString(this.code);
        parcel.writeString(this.callback);
        parcel.writeString(this.id);
    }
}
