package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends j.d.a.c.f.b.b implements q {
    public r() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // j.d.a.c.f.b.b
    protected final boolean j(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            f();
        } else {
            if (i2 != 2) {
                return false;
            }
            g();
        }
        return true;
    }
}
