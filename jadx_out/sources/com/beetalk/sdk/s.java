package com.beetalk.sdk;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class s extends e implements com.beetalk.sdk.b0.a.d {
    private final com.beetalk.sdk.b0.a b;

    class a implements DialogInterface.OnCancelListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            com.beetalk.sdk.b bVar = s.this.a;
            bVar.k(com.beetalk.sdk.b.e.a(bVar.i(), com.garena.pay.android.b.USER_CANCELLED.c().intValue()));
        }
    }

    class b implements i.g<com.beetalk.sdk.b.e, Void> {
        final /* synthetic */ Dialog a;

        b(Dialog dialog) {
            this.a = dialog;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<com.beetalk.sdk.b.e> iVar) {
            com.beetalk.sdk.b bVar;
            com.beetalk.sdk.b.e eVarT;
            try {
                this.a.dismiss();
            } catch (Exception unused) {
            }
            if (iVar.x()) {
                bVar = s.this.a;
                eVarT = com.beetalk.sdk.b.e.b(bVar.i(), "error", iVar.s().getMessage(), com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue());
            } else {
                bVar = s.this.a;
                eVarT = iVar.t();
            }
            bVar.k(eVarT);
            return null;
        }
    }

    class c implements Callable<com.beetalk.sdk.b.e> {
        final /* synthetic */ com.beetalk.sdk.b.c a;
        final /* synthetic */ String b;

        c(s sVar, com.beetalk.sdk.b.c cVar, String str) {
            this.a = cVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0097  */
        /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.b.e call() {
            com.garena.pay.android.b bVar;
            int iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
            JSONObject jSONObjectK = this.a.e() == p.f509i.intValue() ? com.beetalk.sdk.z.i.b.k(this.b, this.a.a()) : com.beetalk.sdk.z.i.b.j(this.b, this.a.a());
            com.beetalk.sdk.b.e eVarC = null;
            if (jSONObjectK != null) {
                if (jSONObjectK.has("open_id")) {
                    try {
                        String string = jSONObjectK.getString("open_id");
                        String string2 = jSONObjectK.getString("access_token");
                        int i2 = jSONObjectK.getInt("expiry_time");
                        int i3 = jSONObjectK.getInt("platform");
                        com.beetalk.sdk.u.a aVar = new com.beetalk.sdk.u.a(string2, com.beetalk.sdk.u.l.VK, i3);
                        aVar.k(i2);
                        eVarC = com.beetalk.sdk.b.e.c(this.a, aVar, string, i3);
                    } catch (JSONException e) {
                        com.beetalk.sdk.x.a.b(e);
                    }
                } else {
                    String strOptString = jSONObjectK.optString("error");
                    if ("error_user_ban".equals(strOptString)) {
                        bVar = com.garena.pay.android.b.ERROR_USER_BANNED;
                    } else if ("invalid_grant".equals(strOptString)) {
                        com.facebook.a.r(null);
                        bVar = com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT;
                    } else {
                        bVar = com.garena.pay.android.b.ACCESS_TOKEN_EXCHANGE_FAILED;
                    }
                }
                if (eVarC == null) {
                    return com.beetalk.sdk.b.e.a(this.a, iIntValue);
                }
                return eVarC;
            }
            bVar = com.garena.pay.android.b.NETWORK_EXCEPTION;
            iIntValue = bVar.c().intValue();
            if (eVarC == null) {
                return com.beetalk.sdk.b.e.a(this.a, iIntValue);
            }
            return eVarC;
        }
    }

    public s(com.beetalk.sdk.b bVar) {
        super(bVar);
        com.beetalk.sdk.b0.a aVar = new com.beetalk.sdk.b0.a(bVar.e().a());
        this.b = aVar;
        aVar.f(this);
    }

    private i.i<com.beetalk.sdk.b.e> f(String str) {
        return i.i.e(new c(this, this.a.i(), str));
    }

    @Override // com.beetalk.sdk.b0.a.d
    public void a(com.vk.sdk.k.c cVar) {
        String str;
        com.beetalk.sdk.x.a.a("vk auth err: %s", cVar);
        com.beetalk.sdk.b.c cVarI = this.a.i();
        if (cVar != null && cVar.e == -102) {
            this.a.k(com.beetalk.sdk.b.e.a(cVarI, com.garena.pay.android.b.USER_CANCELLED.c().intValue()));
            return;
        }
        com.beetalk.sdk.b bVar = this.a;
        if (cVar != null) {
            str = "(" + cVar.e + ") " + cVar.f;
        } else {
            str = "";
        }
        bVar.k(com.beetalk.sdk.b.e.b(cVarI, "error", str, com.garena.pay.android.b.LOGIN_FAILED.c().intValue()));
    }

    @Override // com.beetalk.sdk.b0.a.d
    public void b() {
        com.vk.sdk.e eVarB = com.vk.sdk.e.b();
        if (eVarB == null || TextUtils.isEmpty(eVarB.a)) {
            com.beetalk.sdk.b bVar = this.a;
            bVar.k(com.beetalk.sdk.b.e.b(bVar.i(), "error", "vk access token is null", com.garena.pay.android.b.LOGIN_FAILED.c().intValue()));
            return;
        }
        com.beetalk.sdk.x.a.a("vk auth success: %s", eVarB.a);
        Dialog dialog = new Dialog(this.a.f(), j.c.b.h.a);
        dialog.setContentView(j.c.b.f.d);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnCancelListener(new a());
        try {
            dialog.show();
        } catch (Exception unused) {
        }
        f(eVarB.a).j(new b(dialog), i.i.f1903k);
    }

    @Override // com.beetalk.sdk.e
    boolean d(int i2, int i3, Intent intent, com.beetalk.sdk.b.c cVar) {
        return this.b.e(i3, intent);
    }

    @Override // com.beetalk.sdk.e
    boolean e(com.beetalk.sdk.b.c cVar) {
        com.beetalk.sdk.x.a.a("start VK Auth", new Object[0]);
        if (cVar == null) {
            return false;
        }
        if (com.beetalk.sdk.b0.c.a(this.a.f()) == -1) {
            throw new IllegalStateException("Forget add <integer name=\"com_vk_sdk_AppId\">your_app_id</integer> in your values dir?");
        }
        this.b.g();
        return true;
    }
}
