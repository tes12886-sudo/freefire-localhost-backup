package com.beetalk.sdk.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class AccountAuthenticatorService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new a(this).getIBinder();
    }
}
