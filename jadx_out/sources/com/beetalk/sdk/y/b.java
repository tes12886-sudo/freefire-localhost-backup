package com.beetalk.sdk.y;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static int a(Context context) {
        int identifier = context.getResources().getIdentifier("me_line_sdk_ChannelId", "integer", context.getPackageName());
        if (identifier > 0) {
            return context.getResources().getInteger(identifier);
        }
        throw new IllegalStateException("Forget add <integer name=\"me_line_sdk_ChannelId\">your_channel_id</integer> in your values dir?");
    }
}
