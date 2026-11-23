package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.g;
import com.beetalk.sdk.z.f;
import com.garena.pay.android.b;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class BaseResp implements Serializable {
    protected int errorCode;
    protected int resultCode;

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    int parseErrorCode(String str) {
        b bVar;
        if (str == null || !str.contains("error")) {
            bVar = b.SUCCESS;
        } else if (str.contains("error_params")) {
            bVar = b.ERROR_IN_PARAMS;
        } else if (str.contains("error_scope")) {
            bVar = b.GOP_ERROR_SCOPE;
        } else if (str.contains("server_error")) {
            bVar = b.GOP_ERROR_SERVER;
        } else if (str.contains("error_token")) {
            g.b0();
            bVar = b.GOP_ERROR_TOKEN;
        } else {
            bVar = b.UNKNOWN_ERROR;
        }
        return bVar.c().intValue();
    }

    int parseResultCode(JSONObject jSONObject) {
        return jSONObject.optInt("result", f.ERR_PARSE.c());
    }
}
