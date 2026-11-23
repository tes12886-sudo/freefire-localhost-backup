package com.appsflyer.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final boolean AFInAppEventParameterName;
    public final byte[] AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final String valueOf;
    public final Map<String, String> values;

    v() {
    }

    public v(String str, byte[] bArr, String str2, Map<String, String> map) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventType = bArr;
        this.valueOf = str2;
        this.values = map;
        this.AFInAppEventParameterName = false;
    }

    static Map<String, String> values(Context context) {
        HashMap map = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = context.getResources().getConfiguration().screenLayout & 15;
            map.put("x_px", String.valueOf(displayMetrics.widthPixels));
            map.put("y_px", String.valueOf(displayMetrics.heightPixels));
            map.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            map.put("size", String.valueOf(i2));
            map.put("xdp", String.valueOf(displayMetrics.xdpi));
            map.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.valueOf("Couldn't aggregate screen stats: ", th);
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.AFKeystoreWrapper.equals(vVar.AFKeystoreWrapper) && Arrays.equals(this.AFInAppEventType, vVar.AFInAppEventType) && this.valueOf.equals(vVar.valueOf)) {
            return this.values.equals(vVar.values);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.AFKeystoreWrapper.hashCode() * 31) + Arrays.hashCode(this.AFInAppEventType)) * 31) + this.valueOf.hashCode()) * 31) + this.values.hashCode()) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{url='");
        sb.append(this.AFKeystoreWrapper);
        sb.append('\'');
        sb.append(", body=");
        sb.append(Arrays.toString(this.AFInAppEventType));
        sb.append(", method='");
        sb.append(this.valueOf);
        sb.append('\'');
        sb.append(", headers=");
        sb.append(this.values);
        sb.append(", isEncrypted=false");
        sb.append('}');
        return sb.toString();
    }
}
