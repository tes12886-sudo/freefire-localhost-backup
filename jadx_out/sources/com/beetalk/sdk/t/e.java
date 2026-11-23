package com.beetalk.sdk.t;

import android.content.Context;
import com.beetalk.sdk.networking.model.ChannelsReq;
import com.beetalk.sdk.networking.model.ChannelsResp;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static volatile e d;
    private String a;
    private ChannelsResp b;
    private long c = 0;

    class a implements i.g<ChannelsResp, ChannelsResp> {
        a() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChannelsResp a(i.i<ChannelsResp> iVar) {
            if (!iVar.x() && iVar.t() != null) {
                ChannelsResp channelsRespT = iVar.t();
                if (channelsRespT.getErrorCode() == com.garena.pay.android.b.SUCCESS.c().intValue() && channelsRespT.getChannels() != null && !channelsRespT.getChannels().isEmpty()) {
                    e.this.b = channelsRespT;
                    e.this.c = System.currentTimeMillis();
                    return channelsRespT;
                }
            }
            e.this.c();
            return null;
        }
    }

    public static e d() {
        if (d == null) {
            synchronized (e.class) {
                if (d == null) {
                    d = new e();
                }
            }
        }
        return d;
    }

    public void c() {
        this.c = 0L;
        this.b = null;
        this.a = null;
    }

    public i.i<ChannelsResp> e(Context context, boolean z, com.garena.pay.android.d dVar) {
        com.beetalk.sdk.g gVarY = com.beetalk.sdk.g.y();
        if (gVarY == null || gVarY.H() == null) {
            c();
            return i.i.r(null);
        }
        Map<String, String> params = ChannelsReq.toParams(context, dVar);
        String str = new JSONObject(params).toString() + dVar.c().getRebateId();
        if (z || this.b == null || System.currentTimeMillis() - this.c > 60000 || !h.h.k.c.a(this.a, str)) {
            this.a = str;
            return com.beetalk.sdk.z.i.c.e(context, dVar, params).j(new a(), i.i.f1903k);
        }
        com.beetalk.sdk.x.a.a("Cache hit: " + this.a, new Object[0]);
        return i.i.r(this.b);
    }
}
