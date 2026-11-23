package com.beetalk.sdk;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n extends e {

    class a implements DialogInterface.OnCancelListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            com.beetalk.sdk.b bVar = n.this.a;
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
                com.beetalk.sdk.x.a.b(iVar.s());
                bVar = n.this.a;
                eVarT = com.beetalk.sdk.b.e.b(bVar.i(), "error", iVar.s().getMessage(), com.garena.pay.android.b.LOGIN_FAILED.c().intValue());
            } else {
                bVar = n.this.a;
                eVarT = iVar.t();
            }
            bVar.k(eVarT);
            return null;
        }
    }

    class c implements Callable<com.beetalk.sdk.b.e> {
        final /* synthetic */ com.beetalk.sdk.b.c a;
        final /* synthetic */ String b;

        c(n nVar, com.beetalk.sdk.b.c cVar, String str) {
            this.a = cVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.b.e call() {
            com.garena.pay.android.b bVar;
            int iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
            JSONObject jSONObjectH = this.a.e() == p.f509i.intValue() ? com.beetalk.sdk.z.i.b.h(this.b, this.a.a()) : com.beetalk.sdk.z.i.b.g(this.b, this.a.a());
            com.beetalk.sdk.x.a.a("response: %s", jSONObjectH);
            com.beetalk.sdk.b.e eVarC = null;
            if (jSONObjectH != null) {
                if (jSONObjectH.has("open_id")) {
                    try {
                        String string = jSONObjectH.getString("open_id");
                        String string2 = jSONObjectH.getString("access_token");
                        int i2 = jSONObjectH.getInt("expiry_time");
                        int i3 = jSONObjectH.getInt("platform");
                        com.beetalk.sdk.u.a aVar = new com.beetalk.sdk.u.a(string2, com.beetalk.sdk.u.l.LINE, i3);
                        aVar.k(i2);
                        eVarC = com.beetalk.sdk.b.e.c(this.a, aVar, string, i3);
                    } catch (JSONException e) {
                        com.beetalk.sdk.x.a.b(e);
                    }
                } else {
                    String strOptString = jSONObjectH.optString("error");
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

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.e.b.d.values().length];
            a = iArr;
            try {
                iArr[j.e.b.d.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.e.b.d.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.beetalk.sdk.b bVar) {
        super(bVar);
    }

    private i.i<com.beetalk.sdk.b.e> f(String str) {
        return i.i.e(new c(this, this.a.i(), str));
    }

    private void g(String str) {
        Dialog dialog = new Dialog(this.a.f(), j.c.b.h.a);
        dialog.setContentView(j.c.b.f.d);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnCancelListener(new a());
        try {
            dialog.show();
        } catch (Exception unused) {
        }
        f(str).j(new b(dialog), i.i.f1903k);
    }

    @Override // com.beetalk.sdk.e
    boolean d(int i2, int i3, Intent intent, com.beetalk.sdk.b.c cVar) {
        com.beetalk.sdk.b bVar;
        com.beetalk.sdk.b.c cVarI;
        com.garena.pay.android.b bVar2;
        if (i2 != 33058) {
            return false;
        }
        j.e.b.i.c cVarC = j.e.b.i.b.c(intent);
        int i4 = d.a[cVarC.c().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                String string = cVarC.a().toString();
                com.beetalk.sdk.x.a.a("line login failed: %s", string);
                com.beetalk.sdk.b bVar3 = this.a;
                bVar3.k(com.beetalk.sdk.b.e.b(bVar3.i(), "error", string, com.garena.pay.android.b.LOGIN_FAILED.c().intValue()));
            } else {
                com.beetalk.sdk.x.a.a("line login canceled", new Object[0]);
                bVar = this.a;
                cVarI = bVar.i();
                bVar2 = com.garena.pay.android.b.USER_CANCELLED;
            }
            return true;
        }
        j.e.b.e eVarB = cVarC.b();
        if (eVarB != null) {
            String strA = eVarB.a().a();
            if (!TextUtils.isEmpty(strA)) {
                com.beetalk.sdk.x.a.a("line login success, token: %s", strA);
                g(strA);
                return true;
            }
        }
        com.beetalk.sdk.x.a.c("line access token is null", new Object[0]);
        bVar = this.a;
        cVarI = bVar.i();
        bVar2 = com.garena.pay.android.b.LOGIN_FAILED;
        bVar.k(com.beetalk.sdk.b.e.a(cVarI, bVar2.c().intValue()));
        return true;
    }

    @Override // com.beetalk.sdk.e
    boolean e(com.beetalk.sdk.b.c cVar) {
        com.beetalk.sdk.x.a.a("start Line Auth", new Object[0]);
        if (cVar == null) {
            return false;
        }
        try {
            this.a.e().startActivityForResult(j.e.b.i.b.b(this.a.f(), String.valueOf(com.beetalk.sdk.y.b.a(this.a.f()))), 33058);
            return true;
        } catch (Exception e) {
            com.beetalk.sdk.x.a.b(e);
            return false;
        }
    }
}
