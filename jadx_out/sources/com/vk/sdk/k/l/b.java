package com.vk.sdk.k.l;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.h;
import com.vk.sdk.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class b extends h implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final Bitmap c;
    public final com.vk.sdk.k.l.a d;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(Bitmap bitmap, com.vk.sdk.k.l.a aVar) {
        this.c = bitmap;
        this.d = aVar;
    }

    private b(Parcel parcel) {
        this.c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.d = (com.vk.sdk.k.l.a) parcel.readParcelable(com.vk.sdk.k.l.a.class.getClassLoader());
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public File d() {
        File externalCacheDir;
        Context contextA = j.a();
        File fileCreateTempFile = null;
        if (contextA != null) {
            externalCacheDir = contextA.getExternalCacheDir();
            if (externalCacheDir == null || !externalCacheDir.canWrite()) {
                externalCacheDir = contextA.getCacheDir();
            }
        } else {
            externalCacheDir = null;
        }
        try {
            fileCreateTempFile = File.createTempFile("tmpImg", String.format(".%s", this.d.d()), externalCacheDir);
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            com.vk.sdk.k.l.a aVar = this.d;
            if (aVar.c == com.vk.sdk.k.l.a.c.Png) {
                this.c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } else {
                this.c.compress(Bitmap.CompressFormat.JPEG, (int) (aVar.d * 100.0f), fileOutputStream);
            }
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        return fileCreateTempFile;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
