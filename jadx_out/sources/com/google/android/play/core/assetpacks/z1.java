package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class z1 implements FilenameFilter {
    static final FilenameFilter a = new z1();

    private z1() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return a2.a.matcher(str).matches();
    }
}
