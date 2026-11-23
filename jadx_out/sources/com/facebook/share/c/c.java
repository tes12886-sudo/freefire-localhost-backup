package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    private final String a;
    private final String b;
    private final List<String> c;
    private final String d;
    private final String e;
    private final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<String> f750i;

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i2) {
            return new c[i2];
        }
    }

    public enum b {
        SEND,
        ASKFOR,
        TURN,
        INVITE
    }

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<com.facebook.share.c.c, com.facebook.share.c.c$c>] */
    /* JADX INFO: renamed from: com.facebook.share.c.c$c, reason: collision with other inner class name */
    public static class C0104c {
        private String a;
        private String b;
        private List<String> c;
        private String d;
        private String e;
        private b f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<String> f753i;

        public c j() {
            return new c(this, null);
        }

        public C0104c k(b bVar) {
            this.f = bVar;
            return this;
        }

        public C0104c l(String str) {
            this.d = str;
            return this;
        }

        public C0104c m(String str) {
            this.a = str;
            return this;
        }

        public C0104c n(String str) {
            this.f751g = str;
            return this;
        }

        public C0104c o(List<String> list) {
            this.c = list;
            return this;
        }

        public C0104c p(String str) {
            this.e = str;
            return this;
        }
    }

    public enum d {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY
    }

    c(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.createStringArrayList();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = (b) parcel.readSerializable();
        this.f748g = parcel.readString();
        this.f749h = (d) parcel.readSerializable();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f750i = arrayListCreateStringArrayList;
        parcel.readStringList(arrayListCreateStringArrayList);
    }

    private c(C0104c c0104c) {
        this.a = c0104c.a;
        this.b = c0104c.b;
        this.c = c0104c.c;
        this.d = c0104c.e;
        this.e = c0104c.d;
        this.f = c0104c.f;
        this.f748g = c0104c.f751g;
        this.f749h = c0104c.f752h;
        this.f750i = c0104c.f753i;
    }

    /* synthetic */ c(C0104c c0104c, a aVar) {
        this(c0104c);
    }

    public b a() {
        return this.f;
    }

    public String b() {
        return this.e;
    }

    public d c() {
        return this.f749h;
    }

    public String d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f748g;
    }

    public List<String> f() {
        return this.c;
    }

    public List<String> g() {
        return this.f750i;
    }

    public String h() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeString(this.f748g);
        parcel.writeSerializable(this.f749h);
        parcel.writeStringList(this.f750i);
    }
}
