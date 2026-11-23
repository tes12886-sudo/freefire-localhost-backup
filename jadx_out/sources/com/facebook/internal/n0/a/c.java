package com.facebook.internal.n0.a;

import android.content.res.Resources;
import com.appff.haptic.base.Utils;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    private c() {
    }

    private final String a(int i2) {
        return "#" + Integer.toHexString(i2);
    }

    public static final String b(Resources resources, int i2) {
        String str;
        if (resources == null) {
            return a.a(i2);
        }
        String resourcePackageName = "";
        if (a.d(i2) != 127) {
            resourcePackageName = resources.getResourcePackageName(i2);
            i.d(resourcePackageName, "r.getResourcePackageName(resourceId)");
            str = ":";
        } else {
            str = "";
        }
        String resourceTypeName = resources.getResourceTypeName(i2);
        String resourceEntryName = resources.getResourceEntryName(i2);
        StringBuilder sb = new StringBuilder(resourcePackageName.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(resourcePackageName);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        String string = sb.toString();
        i.d(string, "sb.toString()");
        return string;
    }

    public static final String c(Resources resources, int i2) {
        try {
            return b(resources, i2);
        } catch (Resources.NotFoundException unused) {
            return a.a(i2);
        }
    }

    private final int d(int i2) {
        return (i2 >>> 24) & Utils.MAX_STRENGTH_VALUE;
    }
}
