package com.beetalk.sdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.os.Build;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k extends e {

    private class b extends AsyncTask<String, Void, com.beetalk.sdk.b.e> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.b.e doInBackground(String... strArr) {
            return k.this.i(strArr[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(com.beetalk.sdk.b.e eVar) {
            k.this.h(eVar);
        }
    }

    protected k(com.beetalk.sdk.b bVar) {
        super(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(com.beetalk.sdk.b.e eVar) {
        if (eVar == null) {
            this.a.p();
            return;
        }
        com.beetalk.sdk.x.a.a(eVar.toString(), new Object[0]);
        if (eVar.b != null) {
            g gVarY = g.y();
            if (this.a.i().e() == p.f509i.intValue()) {
                gVarY = g.w();
            } else if (this.a.i().e() == p.f508h.intValue()) {
                gVarY = g.x();
            }
            if (gVarY != null) {
                gVarY.v().l(eVar.b);
            }
        }
        this.a.k(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public com.beetalk.sdk.b.e i(String str) {
        Integer numC;
        com.beetalk.sdk.b.c cVarI = this.a.i();
        JSONObject jSONObjectD = com.beetalk.sdk.z.i.b.d(str, p.f511k + cVarI.a() + "://auth/", cVarI.a(), cVarI.b());
        int iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
        com.beetalk.sdk.b.e eVarC = null;
        try {
            if (jSONObjectD != null) {
                if (jSONObjectD.has("open_id")) {
                    String string = jSONObjectD.getString("open_id");
                    String string2 = jSONObjectD.getString("access_token");
                    String string3 = jSONObjectD.getString("refresh_token");
                    int i2 = jSONObjectD.getInt("expiry_time");
                    int iOptInt = jSONObjectD.optInt("platform");
                    com.beetalk.sdk.u.a aVar = new com.beetalk.sdk.u.a(string2, com.beetalk.sdk.u.l.GARENA_NATIVE_ANDROID, iOptInt);
                    if (iOptInt == 3) {
                        aVar.o(com.beetalk.sdk.u.l.FACEBOOK);
                    }
                    aVar.n(string3);
                    aVar.k(i2);
                    eVarC = com.beetalk.sdk.b.e.c(cVarI, aVar, string, iOptInt);
                } else {
                    String strOptString = jSONObjectD.optString("error");
                    if ("invalid_grant".equals(strOptString)) {
                        numC = com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT.c();
                    } else {
                        numC = "error_user_ban".equals(strOptString) ? com.garena.pay.android.b.ERROR_USER_BANNED.c() : com.garena.pay.android.b.ACCESS_TOKEN_EXCHANGE_FAILED.c();
                    }
                }
                if (eVarC == null) {
                    return com.beetalk.sdk.b.e.a(cVarI, iIntValue);
                }
                return eVarC;
            }
            numC = com.garena.pay.android.b.NETWORK_EXCEPTION.c();
            iIntValue = numC.intValue();
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
        }
        if (eVarC == null) {
            return com.beetalk.sdk.b.e.a(cVarI, iIntValue);
        }
        return eVarC;
    }

    private void j(com.beetalk.sdk.b.c cVar) {
        Intent intent = new Intent();
        intent.setClass(this.a.e().a(), GarenaAuthActivity.class);
        intent.putExtra("garena_request_info", cVar);
        this.a.e().startActivityForResult(intent, cVar.e());
    }

    protected static boolean k(Context context, String str) {
        String str2 = Build.BRAND;
        int i2 = context.getApplicationInfo().flags;
        if (str2.startsWith("generic") && (i2 & 2) != 0) {
            return true;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            for (Signature signature : packageManager.getPackageInfo(str, 64).signatures) {
                String charsString = signature.toCharsString();
                if ("3082030b308201f3a00302010202047a0636e6300d06092a864886f70d01010b05003036311e301c060355040b1315476172656e61204f6e6c696e6520507464204c7464311430120603550403130b476172656e6120506c7573301e170d3134303831393130323431345a170d3135303831393130323431345a3036311e301c060355040b1315476172656e61204f6e6c696e6520507464204c7464311430120603550403130b476172656e6120506c757330820122300d06092a864886f70d01010105000382010f003082010a028201010084f9e11b108453d15322f95c388cb9f10deded1953a1b2343835345e2bdd2509f390014167000b4e73f1cf302b4d4d173f37eefa986fe7c235741adac823ec50d98f980d5f80c8f2d9e54e0d9113afbd6530b1272299f8b32966405af143041050bc8ce9010ca59ddab081bdc080f95818f7511a2e0f9d754bcfd9b4b9cd54cb08c41a9e42e27ee73689c35262267765379651e0837bec77fdeb8f69fc4ff71ac140d41f620fe0943e5cb1466fd764d3d6822ef8663ed9521b279ba55ed897c9b067dcd15799fd1e1e6783aeeafe3de47e6e004cebcc41cc7472e2d78d52095bea62f5db81e0653db2c08227248d0abfe2c243d49521b645549e1d9b40d2830d0203010001a321301f301d0603551d0e0416041431118e3818aaad6f0025d4724af957f6d9a82e11300d06092a864886f70d01010b050003820101007689d7b46da6e227ffc6fc29f2d8f78d1b79b8fc265745efb461c985eb160a248ddb54601b203b70817838743061f4d20dc0ec68fdd2e7d2e2f268a4626f643cd91126e6c5956bddaefdf6186c9e89a3d300ea9d55065161969acd92e061c2993d8cac35e6517c49942944d54083ddd4f4503018f88d1f5028725a10f1f188a020ee62d72a523c29dae1f93eb657bfe04855d29f83c8964942958b4fea9a5c82a9a4fe5820df5a606e5b950ee809178d167f3e651c474bc5507efa6d935f02dc37dee116f5ed2657b1b53d3087c0f291e333c6726557e9977d64626b7e49f1de3b8fcf8df1d81c09768658300d5b8f06a81ed56a819fe7a34beafcac50f39f5a".equals(charsString)) {
                    return true;
                }
                if (("308203b53082029da00302010202041c5ce5b9300d06092a864886f70d01010b050030818a310b3009060355040613023635311230100603550408130953696e6761706f7265311230100603550407130953696e6761706f7265311e301c060355040a1315476172656e61204f6e6c696e6520507465204c7464311d301b060355040b1314536f66747761726520456e67696e656572696e67311430120603550403130b476172656e6120506c7573301e170d3134303831393130333330345a170d3339303831333130333330345a30818a310b3009060355040613023635311230100603550408130953696e6761706f7265311230100603550407130953696e6761706f7265311e301c060355040a1315476172656e61204f6e6c696e6520507465204c7464311d301b060355040b1314536f66747761726520456e67696e656572696e67311430120603550403130b476172656e6120506c757330820122300d06092a864886f70d01010105000382010f003082010a02820101008f7cec7d1529db09e6d8bb56b00ca4d2a9ca0ba1d3d17fe249ebcc39472cf1a5733cd9972f48bfc6e56c47d123d5d451ae15bff099d96ca22d9a3d9775e0d59b74a1b23cc7cc745fd29d5060a74d3a48246a82ddaac587a6cfffe0f264e16241b7a91bebd8db4589776e61b9916e20e0c749e205715930e9c54b5a5b5d7d14f3b27693eba1a3264eb0c0818ae11809b85bbe9e6099e641fb24940b534336fcc519e284e4d944a385732ae1a792025eadd49486a10a01b6d09c52bac1798d0d74c9e1ea07ae3b7ac20e0aee6ba9e23c402ae0cc047a8e11b96a47d4ebd4674d1e3c565bb5ca3ef8af9037df8f9d2e3b34b389cfe1fd4854b331f2735b6a8c01250203010001a321301f301d0603551d0e0416041466f6c0a324150c5c5b770186ba3e0d8efbec0e5f300d06092a864886f70d01010b0500038201010083e3ae177a46cf6a51b8f747f546d91a287db288c57553d36cbef7b7271e024cfba3f5b65b9b2fff74c25304da082bee95740ce61acf9bbbcc3004f976ca801244a1a62bcac998107b80f37c3b5b8361305817fa7ef2ba1c52d443228696bbd5d1220da5d5729dd034a01c2e702226d292e1eb00d3e554217934cb392623c06a15c9f0579f8e234f4ddf66077ee787953dc4a206dcef4799d9017b20df91b3098fa6ed640c51f2c215663f27a8dce98b6cf12d014522ad9be495a645cfffc66dac9bf984342161a4a60e06601622020ed9e49a3d886a408b89ae69e85bb903f0a38eb169ed7177a0848401862e96e6a8b6561d567311af414dc203686ea41ecf".equals(charsString) || "308205873082036fa00302010202150085da7daa7fb5c103987bba339a00f89579bb359d300d06092a864886f70d01010b05003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3137303830333033333431325a170d3437303830333033333431325a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820222300d06092a864886f70d01010105000382020f003082020a02820201009a34e999f1a0f4f2148b218cc057b60c9553ea1ca8ebdc2fcba8d781247e74d57455c9ffc32b14b2bc5b0345c003fd67f0aed8c86a497de486a537abbbd80551b3a8604dc3b07cc160a846ea2b4d2a996829d68405418e5756325623d6cde17b1a25a10c8a24acdbb07bd483eaa84718b71cb74894de35464571dcf84da4fe5709245a27763eebbc6580e85f749c46c509b5bd12ebaf9c9595b319778df08c7ff9a4c30b653d736b7b50134a5ee437d1dd3d93fe7c2ecd48318cf865d3c6b9440cea8e55c0ed26427540353c372e5df55a05fc66a4e8451b28f681f3ae90608a779a40336934daee6e0ab19dcdaea947592fb6fc2104fc9ae5a9bb3d1a65a50d5e6e77e4f9ffce6a881bc99dfe4bac6eef228f362b7b5ede79e9d487c31885a08380c1777abb8dd40cb08b2ed96671d12912337ae5ef808af421e402bcba3b8e1a1deb550f2e2c5b9de0b99eb7206385bc2ee1f5b9aa112cc6a92ae6e906d585b7b21a63db32b8417de6ce347dc582b5edfd7d216435b50bc4dafab09d45d0c8d55b4520891e7493880f860301f61b2b1aa40c943ea51784c18ed29256b5f83b4ed727a30e15d0788866de51272740079f437c52b9a52b24e95ce7257133ae2b7d886e89624387fc4f5990585e539ac708e088e2631dafa2432a73c4eb0f0cb5866138e674f1a422d7a6515fcd1d42fcd99dee81dbe092862077f882e32644410203010001a310300e300c0603551d13040530030101ff300d06092a864886f70d01010b050003820201008067799ce549eb1e16e6c0dc53df5c0b9d32db4649701aa57a7f655786bd53e39d6efb711be372a84f1e3a6724d016369ab45dfe73440fc8f758206b362e697a6da6d05b9cd243982dda6fe83c8fdae5f0e6e734867de6698dc172072b0ad8feaab32e33a543c7385ea79e47612242f3ad7d585738a0dee68bbec067f4904552e36c3e47e28fd87eeceb59b9bdc4e3582780c38ea6d3ea5d998076ddb84c054385a41fd18c4fb6242f990f5efd5c21f03aa77444207162276bd77a95510546c2ed653b2d5715f2c467f3808d8525a0ebe02fd9492803b1426bf423696262a493c54d87a069acf8a5917976d9b30dcbd0e60ad797a678a4faec00c34aa58d915efe861e197b832d171c1826e042761df310bf9919126e81e009319a985425539f73beced7a969569b54d0a768fc43cb58c9623e81fb5ba00cd1dc80807d84fa41e824e82ad9b5000b4ca0423b2380b274a7792559edb86d4934ee56a098f224e239a1d1bdcce4149bc0d7eadf977cd0467b777e723bfd14e241bc4adb21a508c2ed492f93959ae5b5695562ea99a4c58b8342f74ff702b4f3ddfecee1f330d44883de94da81d61f819a1541d9020d15510e05b7b9d8affa8266994b4843947ddb961c36336ab75d94cfecb9068f88c911144fd396a56a9d4a2977b6e7e458184b3049acdf975f0ae5ee18b4e7cc7159569bbbd3bc32af36f3fc5f1cb0c9d62c7b".equals(charsString)) && p.a) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean l(Context context, String str, int i2) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            return packageManager.getPackageInfo(str, 0).versionCode >= i2 || p.a;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    @Override // com.beetalk.sdk.e
    boolean d(int i2, int i3, Intent intent, com.beetalk.sdk.b.c cVar) {
        com.garena.pay.android.b bVar;
        if (i2 != cVar.e()) {
            return false;
        }
        com.beetalk.sdk.b.c cVarI = this.a.i();
        if (!cVarI.c().equals(cVar.c())) {
            h(com.beetalk.sdk.b.e.a(cVarI, com.garena.pay.android.b.REQUEST_ID_MISMATCH.c().intValue()));
            return true;
        }
        String stringExtra = (intent == null || !intent.hasExtra("error")) ? "" : intent.getStringExtra("error");
        if (i3 != 0) {
            if (i3 == 189) {
                j(cVar);
                return true;
            }
            switch (i3) {
                case 178:
                    bVar = com.garena.pay.android.b.NETWORK_EXCEPTION;
                    break;
                case 179:
                    bVar = !"error_user_ban".equals(stringExtra) ? com.garena.pay.android.b.ERROR : com.garena.pay.android.b.ERROR_USER_BANNED;
                    break;
                default:
                    switch (i3) {
                        case 182:
                            bVar = com.garena.pay.android.b.ACCESS_TOKEN_EXCHANGE_FAILED;
                            break;
                        case 183:
                        case 186:
                            bVar = com.garena.pay.android.b.REFRESH_TOKEN_FAILED;
                            break;
                        case 184:
                            bVar = com.garena.pay.android.b.USER_CANCELLED;
                            break;
                        case 185:
                            bVar = com.garena.pay.android.b.ERROR_IN_PARAMS;
                            break;
                        case 187:
                            bVar = com.garena.pay.android.b.UNSUPPORTED_API;
                            break;
                    }
                case 180:
                    bVar = com.garena.pay.android.b.UNKNOWN_ERROR;
                    break;
            }
        } else {
            bVar = com.garena.pay.android.b.USER_CANCELLED;
        }
        com.beetalk.sdk.b.e eVarA = com.beetalk.sdk.b.e.a(cVarI, bVar.c().intValue());
        if (i3 == -1) {
            if (intent == null || !intent.hasExtra("garena_auth_result")) {
                try {
                    new b().execute(intent.getExtras().getString("gg_token_value"));
                    return true;
                } catch (NullPointerException e) {
                    com.beetalk.sdk.x.a.b(e);
                }
            } else {
                eVarA = (com.beetalk.sdk.b.e) intent.getSerializableExtra("garena_auth_result");
            }
        }
        h(eVarA);
        return true;
    }

    @Override // com.beetalk.sdk.e
    boolean e(com.beetalk.sdk.b.c cVar) {
        String str;
        if (cVar == null) {
            return false;
        }
        com.beetalk.sdk.x.a.a("start gas auth", new Object[0]);
        Activity activityA = this.a.e().a();
        com.beetalk.sdk.x.k.b(activityA, "Auth Activity");
        String str2 = "com.garena.gas";
        Intent className = new Intent().setClassName("com.garena.gas", "com.garena.gameauth.GPProxyAuthActivity");
        className.putExtra("gg_request_code", cVar.e());
        className.putExtra("gg_application_id", cVar.a());
        className.putExtra("gg_application_key", cVar.b());
        className.putExtra("gg_app_redirect_url", p.f511k + cVar.a() + "://auth/");
        className.putExtra("gg_auth_id", cVar.c());
        className.putExtra("gg_key_hash", com.beetalk.sdk.x.d.j(activityA));
        className.putExtra("gg_sdk_env", p.p().toString());
        PackageManager packageManager = this.a.e().a().getPackageManager();
        if ((packageManager == null ? null : packageManager.resolveActivity(className, 0)) == null) {
            str2 = "com.garena.gaslite";
            className.setClassName("com.garena.gaslite", "com.garena.gameauth.GPProxyAuthActivity");
            if ((packageManager != null ? packageManager.resolveActivity(className, 0) : null) == null) {
                j(cVar);
                return true;
            }
        }
        if (this.a.i().e() == p.f509i.intValue()) {
            j(cVar);
            return true;
        }
        if (!k(activityA, str2)) {
            str = "No valid Gas Signature Found";
        } else {
            if (l(activityA, str2, p.f510j)) {
                try {
                    activityA.startActivityForResult(className, cVar.e());
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
            str = "Please upgrade the Gas app";
        }
        Toast.makeText(activityA, str, 0).show();
        return false;
    }
}
