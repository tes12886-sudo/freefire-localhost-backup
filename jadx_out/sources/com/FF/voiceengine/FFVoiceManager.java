package com.FF.voiceengine;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class FFVoiceManager {
    public static boolean Init(Context context) {
        com.FF.voiceengine.mgr.FFVoiceManager.Init(context);
        return true;
    }

    public static boolean Init(Context context, String str) {
        com.FF.voiceengine.mgr.FFVoiceManager.Init(context, str);
        return true;
    }
}
