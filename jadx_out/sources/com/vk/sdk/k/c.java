package com.vk.sdk.k;

import android.net.Uri;
import com.FF.voiceengine.FFVoiceConst;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.vk.sdk.h {
    public c c;
    public f d;
    public int e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1545j;

    public c(int i2) {
        this.e = i2;
    }

    public c(Map<String, String> map) {
        this.e = FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_START_FAILED;
        this.f1542g = map.get("error_reason");
        this.f = Uri.decode(map.get("error_description"));
        if (map.containsKey("fail")) {
            this.f1542g = "Action failed";
        }
        if (map.containsKey("cancel")) {
            this.e = FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_STOP_FAILED;
            this.f1542g = "User canceled request";
        }
    }

    public c(JSONObject jSONObject) {
        c cVar = new c(jSONObject.getInt("error_code"));
        cVar.f = jSONObject.getString("error_msg");
        if (cVar.e == 14) {
            cVar.f1544i = jSONObject.getString("captcha_img");
            cVar.f1543h = jSONObject.getString("captcha_sid");
        }
        if (cVar.e == 17) {
            cVar.f1545j = jSONObject.getString("redirect_uri");
        }
        this.e = FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_START_FAILED;
        this.c = cVar;
    }

    private void e(StringBuilder sb) {
        String str = this.f1542g;
        if (str != null) {
            sb.append(String.format("; %s", str));
        }
        String str2 = this.f;
        if (str2 != null) {
            sb.append(String.format("; %s", str2));
        }
    }

    public void d(String str) {
        d dVar = new d();
        dVar.put("captcha_sid", this.f1543h);
        dVar.put("captcha_key", str);
        this.d.l(dVar);
        this.d.z();
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("VKError (");
        int i2 = this.e;
        switch (i2) {
            case FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_NETWORK_ERROR /* -105 */:
                string = "HTTP failed";
                sb.append(string);
                break;
            case FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_SERVER_INVALID /* -104 */:
                string = "JSON failed";
                sb.append(string);
                break;
            case FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_ILLEGAL_SDK /* -103 */:
                string = "Request wasn't prepared";
                sb.append(string);
                break;
            case FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_STOP_FAILED /* -102 */:
                string = "Canceled";
                sb.append(string);
                break;
            case FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_START_FAILED /* -101 */:
                sb.append("API error");
                c cVar = this.c;
                if (cVar != null) {
                    string = cVar.toString();
                    sb.append(string);
                }
                break;
            default:
                string = String.format("code: %d; ", Integer.valueOf(i2));
                sb.append(string);
                break;
        }
        e(sb);
        sb.append(")");
        return sb.toString();
    }
}
