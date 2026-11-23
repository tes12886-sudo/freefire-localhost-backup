package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends Exception {
    n0(String str) {
        super(str);
        a(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    private int a(String str) {
        byte b;
        if (str == null) {
            return 0;
        }
        switch (str.toLowerCase(Locale.US)) {
            case "service_not_available":
                b = 3;
                break;
            case "toomanymessages":
                b = 4;
                break;
            case "invalid_parameters":
                b = 0;
                break;
            case "messagetoobig":
                b = 2;
                break;
            case "missing_to":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        if (b != 3) {
            return b != 4 ? 0 : 4;
        }
        return 3;
    }
}
