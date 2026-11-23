package com.garena.sdkunity;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import com.beetalk.sdk.account.MigrateGuestActivity;
import com.beetalk.sdk.account.b;
import com.beetalk.sdk.c;
import com.beetalk.sdk.g;
import com.beetalk.sdk.i;
import com.beetalk.sdk.l;
import com.beetalk.sdk.p;
import com.beetalk.sdk.q;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Login implements g.n {
    private final String UnityOnLogin = "OnLogin";
    private String onSessionProcessedCallback;
    SdkUnity sdkUnity;

    public class LoginRsp {
        public String accessToken;
        public int errCode;
        public int mainPlatform;
        public String openID;
        public int platform;

        public LoginRsp() {
        }
    }

    private static class SAFResult {
        public String msg;
        public int result;

        private SAFResult() {
        }
    }

    public Login(SdkUnity sdkUnity) {
        this.sdkUnity = sdkUnity;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x000d, B:6:0x0013, B:7:0x001f, B:8:0x0022), top: B:14:0x000d }] */
    public static void onAutosaveGuestResult(int i2, Intent intent) {
        String stringExtra;
        SAFResult sAFResult = new SAFResult();
        sAFResult.result = 3;
        if (intent != null) {
            try {
                if (intent.hasExtra("KEY_SAF_PERMISSION_RET")) {
                    sAFResult.result = intent.getIntExtra("KEY_SAF_PERMISSION_RET", 3);
                    stringExtra = intent.getStringExtra("KEY_SAF_EXCEPTION");
                } else {
                    sAFResult.result = 3;
                    stringExtra = "autosave returned null";
                }
                sAFResult.msg = stringExtra;
            } catch (Throwable th) {
                sAFResult.result = 3;
                sAFResult.msg = "autosave exception: " + th.getMessage();
            }
        } else {
            sAFResult.result = 3;
            stringExtra = "autosave returned null";
            sAFResult.msg = stringExtra;
        }
        UnityMessgae.getInstance().sendToUnity("OnAutosaveGuestResult", sAFResult);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x000d, B:6:0x0013, B:7:0x001f, B:8:0x0022), top: B:14:0x000d }] */
    public static void onBackupGuestResult(int i2, Intent intent) {
        String stringExtra;
        SAFResult sAFResult = new SAFResult();
        sAFResult.result = 3;
        if (intent != null) {
            try {
                if (intent.hasExtra("KEY_SAF_PERMISSION_RET")) {
                    sAFResult.result = intent.getIntExtra("KEY_SAF_PERMISSION_RET", 3);
                    stringExtra = intent.getStringExtra("KEY_SAF_EXCEPTION");
                } else {
                    sAFResult.result = 3;
                    stringExtra = "backup returned null";
                }
                sAFResult.msg = stringExtra;
            } catch (Throwable th) {
                sAFResult.result = 3;
                sAFResult.msg = "backup exception: " + th.getMessage();
            }
        } else {
            sAFResult.result = 3;
            stringExtra = "backup returned null";
            sAFResult.msg = stringExtra;
        }
        UnityMessgae.getInstance().sendToUnity("OnBackupGuestResult", sAFResult);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x000d, B:6:0x0013, B:7:0x001f, B:8:0x0022), top: B:14:0x000d }] */
    public static void onMigrateGuestResult(int i2, Intent intent) {
        String stringExtra;
        SAFResult sAFResult = new SAFResult();
        sAFResult.result = 3;
        if (intent != null) {
            try {
                if (intent.hasExtra("KEY_SAF_PERMISSION_RET")) {
                    sAFResult.result = intent.getIntExtra("KEY_SAF_PERMISSION_RET", 3);
                    stringExtra = intent.getStringExtra("KEY_SAF_EXCEPTION");
                } else {
                    sAFResult.result = 3;
                    stringExtra = "migrate returned null";
                }
                sAFResult.msg = stringExtra;
            } catch (Throwable th) {
                sAFResult.result = 3;
                sAFResult.msg = "migrate exception: " + th.getMessage();
            }
        } else {
            sAFResult.result = 3;
            stringExtra = "migrate returned null";
            sAFResult.msg = stringExtra;
        }
        UnityMessgae.getInstance().sendToUnity("OnMigrateGuestResult", sAFResult);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x000d, B:6:0x0013, B:7:0x001f, B:8:0x0022), top: B:14:0x000d }] */
    public static void onResetGuestResult(int i2, Intent intent) {
        String stringExtra;
        SAFResult sAFResult = new SAFResult();
        sAFResult.result = 3;
        if (intent != null) {
            try {
                if (intent.hasExtra("KEY_SAF_PERMISSION_RET")) {
                    sAFResult.result = intent.getIntExtra("KEY_SAF_PERMISSION_RET", 3);
                    stringExtra = intent.getStringExtra("KEY_SAF_EXCEPTION");
                } else {
                    sAFResult.result = 3;
                    stringExtra = "reset returned null";
                }
                sAFResult.msg = stringExtra;
            } catch (Throwable th) {
                sAFResult.result = 3;
                sAFResult.msg = "reset exception: " + th.getMessage();
            }
        } else {
            sAFResult.result = 3;
            stringExtra = "reset returned null";
            sAFResult.msg = stringExtra;
        }
        UnityMessgae.getInstance().sendToUnity("OnResetGuestResult", sAFResult);
    }

    private static boolean stringIsNullOrEmpty(String str) {
        return str == null || str.length() <= 0;
    }

    public void autosaveGuest() {
        b.a(SdkUnity.getGameActivity());
    }

    public void backupGuest() {
        b.b(SdkUnity.getGameActivity());
    }

    public int getLoginRecord() {
        if (i.y(SdkUnity.getGameActivity())) {
            return g.y().D().intValue();
        }
        return 0;
    }

    public void login(int i2, boolean z) {
        g.o oVar;
        Integer num;
        this.onSessionProcessedCallback = "OnLogin";
        if (!z) {
            g.l lVar = new g.l(SdkUnity.getGameActivity());
            lVar.b(SdkUnity.appId);
            lVar.c(SdkUnity.appKey);
            lVar.d(c.LEGACY_ENABLED);
            if (i2 != 1) {
                if (i2 == 8) {
                    lVar.f(g.o.GOOGLE);
                    num = p.f;
                } else if (i2 == 11) {
                    lVar.f(g.o.TWITTER);
                    num = p.f507g;
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        oVar = g.o.GUEST;
                    } else if (i2 == 5) {
                        lVar.f(g.o.VK);
                        num = p.e;
                    }
                    i.B(lVar.a());
                } else {
                    lVar.f(g.o.FACEBOOK);
                    num = p.d;
                }
                lVar.e(num.intValue());
                i.B(lVar.a());
            } else {
                oVar = g.o.GARENA;
            }
            lVar.f(oVar);
            i.B(lVar.a());
        }
        i.E(SdkUnity.getGameActivity(), this);
    }

    public void logout() {
        SdkUnity.getGameActivity().runOnUiThread(new Runnable() { // from class: com.garena.sdkunity.Login.1
            @Override // java.lang.Runnable
            public void run() {
                g.n();
            }
        });
    }

    public void migrateGuest() {
        b.c(SdkUnity.getGameActivity());
    }

    public boolean needGuestBackup() {
        return (stringIsNullOrEmpty(i.x()) || stringIsNullOrEmpty(i.w())) ? false : true;
    }

    public boolean needGuestMigration() {
        return stringIsNullOrEmpty(i.x()) || stringIsNullOrEmpty(i.w());
    }

    @Override // com.beetalk.sdk.g.n
    public void onSessionProcessed(g gVar, Exception exc) {
        if (gVar.G() == q.OPENING) {
            SdkUnity.Log("opening new session");
            return;
        }
        if (exc != null) {
            Toast.makeText(SdkUnity.getGameActivity(), "Exception" + exc.getMessage(), 0).show();
            return;
        }
        LoginRsp loginRsp = new LoginRsp();
        if (gVar.G() == q.TOKEN_AVAILABLE) {
            SdkUnity.Log("Login Success. Game can send the token to game server");
            loginRsp.openID = gVar.C();
            loginRsp.accessToken = gVar.I().b();
            SdkUnity.Log("session.getPlatform(): " + gVar.D());
            SdkUnity.Log("session.getTokenValue().getTokenProvider(): " + gVar.I().h().name() + "/" + gVar.I().h().c());
            StringBuilder sb = new StringBuilder();
            sb.append("session.getTokenValue().getMainPlatform(): ");
            sb.append(gVar.I().e());
            SdkUnity.Log(sb.toString());
            loginRsp.platform = gVar.D().intValue();
            loginRsp.mainPlatform = gVar.I().e();
        } else if (gVar.G() == q.CLOSED_WITH_ERROR || gVar.G() == q.CLOSED) {
            Log.e(Const.LogTag, "Login fail");
            loginRsp.errCode = gVar.z();
        } else {
            Log.e(Const.LogTag, "unprocess seesion status: " + gVar.G().toString());
        }
        UnityMessgae.getInstance().sendToUnity(this.onSessionProcessedCallback, loginRsp);
    }

    public void resetGuest() {
        b.d(SdkUnity.getGameActivity());
    }

    public void setGoogleClientID(String str) {
        l.n(str);
    }

    public boolean supportGuestBackup() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public boolean supportGuestMigration() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        try {
            List<ResolveInfo> listQueryIntentActivities = SdkUnity.getGameActivity().getPackageManager().queryIntentActivities(MigrateGuestActivity.g(), 0);
            return listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
