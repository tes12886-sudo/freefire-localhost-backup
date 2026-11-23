package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n extends v5 {
    private long c;
    private String d;
    private AccountManager e;
    private Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1245g;

    n(a5 a5Var) {
        super(a5Var);
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.d = sb.toString();
        return false;
    }

    public final long o() {
        l();
        return this.c;
    }

    public final String p() {
        l();
        return this.d;
    }

    final long q() {
        h();
        return this.f1245g;
    }

    final void r() {
        h();
        this.f = null;
        this.f1245g = 0L;
    }

    final boolean s() {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        h();
        long jA = this.a.e().a();
        if (jA - this.f1245g > 86400000) {
            this.f = null;
        }
        Boolean bool3 = this.f;
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        if (androidx.core.content.a.a(this.a.c(), "android.permission.GET_ACCOUNTS") != 0) {
            this.a.d().s().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.e == null) {
                this.e = AccountManager.get(this.a.c());
            }
            try {
                Account[] result = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f = bool;
                    this.f1245g = jA;
                    return true;
                }
                Account[] result2 = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f = bool;
                    this.f1245g = jA;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                this.a.d().p().b("Exception checking account types", e);
            }
        }
        this.f1245g = jA;
        this.f = bool2;
        return false;
    }
}
