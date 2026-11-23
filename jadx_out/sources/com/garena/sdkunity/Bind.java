package com.garena.sdkunity;

import com.beetalk.sdk.c;
import com.beetalk.sdk.g;
import com.beetalk.sdk.i;
import com.beetalk.sdk.p;
import com.beetalk.sdk.q;
import com.beetalk.sdk.z.e;
import com.beetalk.sdk.z.i.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Bind implements g.m {
    SdkUnity sdkUnity;
    private final String UnityOnBindSession = "OnGetBindSession";
    private final String UnityOnClearThirdPartySession = "OnClearThirdPartySession";
    private final String OnGetPlatformBindingInfoComplete = "OnGetPlatformBindingInfoComplete";
    private final String OnGetPlatformBindingSession = "OnGetPlatformBindingSession";
    private final String OnPerformPlatformBindingComplete = "OnPerformPlatformBindingComplete";

    public class BindSessionRsp {
        public String accessToken;
        public int errCode;
        public String exception;
        public String openID;
        public int platform;

        public BindSessionRsp() {
        }
    }

    public Bind(SdkUnity sdkUnity) {
        this.sdkUnity = sdkUnity;
    }

    public void clearThirdPartySession() {
        g.p(this);
    }

    public void getBindSession(int i2) {
        SdkUnity.Log("getBindSession");
        g.l lVar = new g.l(SdkUnity.getGameActivity());
        lVar.b(i.t());
        lVar.d(c.LEGACY_ENABLED);
        lVar.f(Utility.getProvider(i2));
        lVar.e(p.f508h.intValue());
        lVar.c(SdkUnity.appKey);
        i.D(lVar.a());
        i.d(SdkUnity.getGameActivity(), new g.n() { // from class: com.garena.sdkunity.Bind.1
            @Override // com.beetalk.sdk.g.n
            public void onSessionProcessed(g gVar, Exception exc) {
                if (gVar.G() == q.OPENING) {
                    SdkUnity.Log("opening new session");
                    return;
                }
                BindSessionRsp bindSessionRsp = Bind.this.new BindSessionRsp();
                if (exc != null) {
                    bindSessionRsp.exception = exc.getMessage();
                } else if (gVar.G() == q.TOKEN_AVAILABLE) {
                    SdkUnity.Log("Bind Login Success. Game can send the new token to game server");
                    bindSessionRsp.openID = gVar.C();
                    bindSessionRsp.accessToken = gVar.I().b();
                    bindSessionRsp.platform = gVar.D().intValue();
                } else if (gVar.G() == q.CLOSED_WITH_ERROR || gVar.G() == q.CLOSED) {
                    SdkUnity.LogError("Bind Login fail");
                    bindSessionRsp.errCode = gVar.z();
                } else {
                    SdkUnity.LogError("unprocess seesion status: " + gVar.G().toString());
                }
                UnityMessgae.getInstance().sendToUnity("OnGetBindSession", bindSessionRsp);
            }
        });
    }

    public void getPlatformBindingInfo() {
        try {
            b.l(g.y().I().b(), new e.h() { // from class: com.garena.sdkunity.Bind.2
                @Override // com.beetalk.sdk.z.e.h
                public void onCompleted(JSONObject jSONObject) {
                    UnityMessgae.getInstance().sendToUnity("OnGetPlatformBindingInfoComplete", jSONObject);
                }
            });
        } catch (Throwable unused) {
            UnityMessgae.getInstance().sendToUnity("OnGetPlatformBindingInfoComplete", "");
        }
    }

    public void getPlatformBindingSession(int i2) {
        try {
            g.l lVar = new g.l(SdkUnity.getGameActivity());
            lVar.b(i.t());
            lVar.c(SdkUnity.appKey);
            lVar.d(c.LEGACY_ENABLED);
            lVar.f(Utility.getProvider(i2));
            lVar.e(p.f509i.intValue());
            i.C(lVar.a());
            i.c(SdkUnity.getGameActivity(), new g.n() { // from class: com.garena.sdkunity.Bind.3
                @Override // com.beetalk.sdk.g.n
                public void onSessionProcessed(g gVar, Exception exc) {
                    if (gVar.G() == q.OPENING) {
                        return;
                    }
                    BindSessionRsp bindSessionRsp = Bind.this.new BindSessionRsp();
                    if (exc != null) {
                        bindSessionRsp.exception = exc.getMessage();
                    } else if (gVar.G() == q.TOKEN_AVAILABLE) {
                        bindSessionRsp.openID = gVar.C();
                        bindSessionRsp.accessToken = gVar.I().b();
                        bindSessionRsp.platform = gVar.D().intValue();
                    } else if (gVar.G() == q.CLOSED_WITH_ERROR || gVar.G() == q.CLOSED) {
                        bindSessionRsp.errCode = gVar.z();
                    } else {
                        SdkUnity.LogError("unprocess seesion status: " + gVar.G().toString());
                    }
                    UnityMessgae.getInstance().sendToUnity("OnGetPlatformBindingSession", bindSessionRsp);
                }
            });
        } catch (Throwable th) {
            BindSessionRsp bindSessionRsp = new BindSessionRsp();
            bindSessionRsp.exception = th.getMessage();
            UnityMessgae.getInstance().sendToUnity("OnGetPlatformBindingSession", bindSessionRsp);
        }
    }

    @Override // com.beetalk.sdk.g.m
    public void onComplete() {
        UnityMessgae.getInstance().sendToUnity("OnClearThirdPartySession", "");
    }

    public void performPlatformBinding() {
        try {
            if (g.y() != null && g.y().I() != null) {
                g gVarW = g.w();
                if (gVarW != null && gVarW.I() != null) {
                    b.a(g.y().I().b(), gVarW.I().b(), new e.h() { // from class: com.garena.sdkunity.Bind.4
                        @Override // com.beetalk.sdk.z.e.h
                        public void onCompleted(JSONObject jSONObject) {
                            UnityMessgae.getInstance().sendToUnity("OnPerformPlatformBindingComplete", jSONObject);
                        }
                    });
                    return;
                }
                UnityMessgae.getInstance().sendToUnity("OnPerformPlatformBindingComplete", "");
                return;
            }
            UnityMessgae.getInstance().sendToUnity("OnPerformPlatformBindingComplete", "");
        } catch (Throwable th) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error", th.getMessage());
            } catch (JSONException unused) {
            }
            UnityMessgae.getInstance().sendToUnity("OnPerformPlatformBindingComplete", jSONObject);
        }
    }

    public void resetGuest() {
        SdkUnity.Log("Bind.resetGuest");
        i.h(SdkUnity.getGameActivity());
    }
}
