package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class i9 extends IOException {
    public i9(String str) {
        super(str);
    }

    static i9 a() {
        return new i9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static i9 b() {
        return new i9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static i9 c() {
        return new i9("Protocol message contained an invalid tag (zero).");
    }

    static h9 d() {
        return new h9("Protocol message tag had invalid wire type.");
    }

    static i9 e() {
        return new i9("Failed to parse the message.");
    }

    static i9 f() {
        return new i9("Protocol message had invalid UTF-8.");
    }
}
