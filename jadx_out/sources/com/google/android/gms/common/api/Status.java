package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.FF.voiceengine.FFVoiceConst;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.y.a implements j, ReflectedParcelable {
    final int a;
    private final int b;
    private final String c;
    private final PendingIntent d;
    private final ConnectionResult e;
    public static final Status f = new Status(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f920g = new Status(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f921h = new Status(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f922i = new Status(15);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Status f923j = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new s();

    public Status(int i2) {
        this(i2, (String) null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = pendingIntent;
        this.e = connectionResult;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent, null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i2) {
        this(1, i2, str, connectionResult.j(), connectionResult);
    }

    @Override // com.google.android.gms.common.api.j
    @CanIgnoreReturnValue
    public Status c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && this.b == status.b && com.google.android.gms.common.internal.o.a(this.c, status.c) && com.google.android.gms.common.internal.o.a(this.d, status.d) && com.google.android.gms.common.internal.o.a(this.e, status.e);
    }

    public ConnectionResult f() {
        return this.e;
    }

    public int h() {
        return this.b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.o.b(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    public String j() {
        return this.c;
    }

    public boolean l() {
        return this.d != null;
    }

    @CheckReturnValue
    public boolean n() {
        return this.b <= 0;
    }

    public final String q() {
        String str = this.c;
        return str != null ? str : d.a(this.b);
    }

    public String toString() {
        com.google.android.gms.common.internal.o.a aVarC = com.google.android.gms.common.internal.o.c(this);
        aVarC.a("statusCode", q());
        aVarC.a("resolution", this.d);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, h());
        com.google.android.gms.common.internal.y.c.n(parcel, 2, j(), false);
        com.google.android.gms.common.internal.y.c.m(parcel, 3, this.d, i2, false);
        com.google.android.gms.common.internal.y.c.m(parcel, 4, f(), i2, false);
        com.google.android.gms.common.internal.y.c.i(parcel, FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF, this.a);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
