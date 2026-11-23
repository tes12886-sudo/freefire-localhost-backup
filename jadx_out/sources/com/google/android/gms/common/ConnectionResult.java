package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends com.google.android.gms.common.internal.y.a {
    final int a;
    private final int b;
    private final PendingIntent c;
    private final String d;
    public static final ConnectionResult e = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new s();

    public ConnectionResult(int i2) {
        this(i2, null, null);
    }

    ConnectionResult(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.a = i2;
        this.b = i3;
        this.c = pendingIntent;
        this.d = str;
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }

    static String q(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i2 + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.b == connectionResult.b && o.a(this.c, connectionResult.c) && o.a(this.d, connectionResult.d);
    }

    public int f() {
        return this.b;
    }

    public String h() {
        return this.d;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.b), this.c, this.d);
    }

    public PendingIntent j() {
        return this.c;
    }

    public boolean l() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public boolean n() {
        return this.b == 0;
    }

    public String toString() {
        o.a aVarC = o.c(this);
        aVarC.a("statusCode", q(this.b));
        aVarC.a("resolution", this.c);
        aVarC.a("message", this.d);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.i(parcel, 2, f());
        com.google.android.gms.common.internal.y.c.m(parcel, 3, j(), i2, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 4, h(), false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
