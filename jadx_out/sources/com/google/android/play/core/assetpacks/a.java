package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes.dex */
public class a extends j.d.a.d.a.f.q {
    a(int i2) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i2), com.google.android.play.core.assetpacks.m2.a.a(i2)));
        if (i2 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
