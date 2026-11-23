package com.garena.unity.webview;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class JavaScriptResult implements Parcelable {
    public static final Parcelable.Creator<JavaScriptResult> CREATOR = new Parcelable.Creator<JavaScriptResult>() { // from class: com.garena.unity.webview.JavaScriptResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JavaScriptResult createFromParcel(Parcel parcel) {
            return new JavaScriptResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JavaScriptResult[] newArray(int i2) {
            return new JavaScriptResult[i2];
        }
    };
    public static final String ERROR_API_LEVEL_TOO_LOW = "API level too low: ";
    public static final String ERROR_NO_WEB_VIEW = "WebView is null: ";
    public String callback;
    public String error;
    public String id;
    public String value;

    private JavaScriptResult() {
    }

    protected JavaScriptResult(Parcel parcel) {
        this.id = parcel.readString();
        this.callback = parcel.readString();
        this.error = parcel.readString();
        this.value = parcel.readString();
    }

    public static JavaScriptResult Error(String str, String str2, String str3) {
        JavaScriptResult javaScriptResult = new JavaScriptResult();
        javaScriptResult.error = str;
        javaScriptResult.callback = str2;
        javaScriptResult.id = str3;
        return javaScriptResult;
    }

    public static JavaScriptResult Result(String str, String str2, String str3) {
        JavaScriptResult javaScriptResult = new JavaScriptResult();
        javaScriptResult.value = str;
        javaScriptResult.callback = str2;
        javaScriptResult.id = str3;
        return javaScriptResult;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.id);
        parcel.writeString(this.callback);
        parcel.writeString(this.error);
        parcel.writeString(this.value);
    }
}
