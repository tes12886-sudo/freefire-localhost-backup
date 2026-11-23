package com.garena.sdkunity;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.beetalk.sdk.i;
import com.beetalk.sdk.p;
import com.garena.pay.android.a;

/* JADX INFO: loaded from: classes.dex */
public class SdkUnity {
    private static boolean _ShouldWriteLog;
    private static boolean _ShouldWriteLogError;
    public static String appId;
    public static String appKey;
    private static Activity gameActivity;
    public static String pushAppKey;
    private Login loginMgr = new Login(this);
    private Bind bindMgr = new Bind(this);
    public Push pushMgr = new Push();

    public static void Log(String str) {
        if (_ShouldWriteLog) {
            Log.i(Const.LogTag, str);
        }
    }

    public static void LogError(String str) {
        if (_ShouldWriteLogError) {
            Log.e(Const.LogTag, str);
        }
    }

    public static void SetLog(boolean z, boolean z2) {
        _ShouldWriteLog = z;
        _ShouldWriteLogError = z2;
    }

    public static boolean ShouldLog() {
        return _ShouldWriteLog;
    }

    public static boolean ShouldLogError() {
        return _ShouldWriteLogError;
    }

    public static Activity getGameActivity() {
        return gameActivity;
    }

    public static void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
        Log("@SdkUnity.onActivityResult: " + i2 + ": " + i3);
        if (i2 == 1001) {
            Login.onMigrateGuestResult(i3, intent);
            return;
        }
        if (i2 == 2001) {
            Login.onBackupGuestResult(i3, intent);
            return;
        }
        if (i2 == 3001) {
            Login.onAutosaveGuestResult(i3, intent);
            return;
        }
        if (i2 == 4001) {
            Login.onResetGuestResult(i3, intent);
        } else if (i2 != 4658) {
            i.z(activity, i2, i3, intent);
        } else {
            a.s(intent);
        }
    }

    public static void setActivity(Activity activity) {
        gameActivity = activity;
    }

    public static void setEnvirment(int i2) {
        p.c cVar;
        if (i2 == 0) {
            cVar = p.c.TEST;
        } else if (i2 != 1) {
            return;
        } else {
            cVar = p.c.PRODUCTION;
        }
        i.p(cVar);
    }

    public static void setOverrideNewRootUrl(String str) {
        p.Q(str);
    }

    public static void setOverrideRootUrl(String str) {
        p.R(str);
    }

    public void autosaveGuest() {
        this.loginMgr.autosaveGuest();
    }

    public void backupGuest() {
        this.loginMgr.backupGuest();
    }

    public void clearThirdPartySession() {
        this.bindMgr.clearThirdPartySession();
    }

    public void enableDebugLog() {
        Log("open msdk debug log");
        i.a();
    }

    public void getBindSession(int i2) {
        this.bindMgr.getBindSession(i2);
    }

    public int getLoginRecord() {
        return this.loginMgr.getLoginRecord();
    }

    public void getPlatformBindingInfo() {
        this.bindMgr.getPlatformBindingInfo();
    }

    public void getPlatformBindingSession(int i2) {
        this.bindMgr.getPlatformBindingSession(i2);
    }

    public void init(String str, String str2, String str3, boolean z) {
        Log("init used activity: " + gameActivity.getClass().getSimpleName());
        appId = str;
        appKey = str2;
        pushAppKey = pushAppKey;
        i.A(gameActivity);
        i.G(str);
        i.H("user login");
        i.p(z ? p.c.PRODUCTION : p.c.TEST);
    }

    public boolean isPlatformInstalled(int i2) {
        return i.e(getGameActivity(), i2);
    }

    public void login(int i2, boolean z) {
        this.loginMgr.login(i2, z);
    }

    public void logout() {
        this.loginMgr.logout();
    }

    public void migrateGuest() {
        this.loginMgr.migrateGuest();
    }

    public boolean needGuestBackup() {
        return this.loginMgr.needGuestBackup();
    }

    public boolean needGuestMigration() {
        return this.loginMgr.needGuestMigration();
    }

    public void performPlatformBinding() {
        this.bindMgr.performPlatformBinding();
    }

    public void resetGuest() {
        this.bindMgr.resetGuest();
        this.loginMgr.resetGuest();
    }

    public void setGoogleClientID(String str) {
        this.loginMgr.setGoogleClientID(str);
    }

    public boolean supportGuestBackup() {
        return this.loginMgr.supportGuestBackup();
    }

    public boolean supportGuestMigration() {
        return this.loginMgr.supportGuestMigration();
    }
}
