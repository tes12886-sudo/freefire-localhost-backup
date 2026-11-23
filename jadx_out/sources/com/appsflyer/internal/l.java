package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final String[] valueOf;

    public interface c {
        void AFKeystoreWrapper(String str);

        void values(String str, String str2, String str3);
    }

    l() {
    }

    public l(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.valueOf = null;
            return;
        }
        Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !patternCompile.matcher(str).matches()) {
                AFLogger.values("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase());
            }
        }
        if (arrayList.contains("all")) {
            this.valueOf = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.valueOf = null;
        } else {
            this.valueOf = (String[]) arrayList.toArray(new String[0]);
        }
    }
}
