package com.google.android.gms.common.util;

import com.FF.voiceengine.FFVoiceConst;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static int a(int i2) {
        if (i2 == -1) {
            return -1;
        }
        return i2 / FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF;
    }
}
