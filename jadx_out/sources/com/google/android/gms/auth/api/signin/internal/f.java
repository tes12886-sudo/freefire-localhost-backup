package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {
    private static final com.google.android.gms.common.l.a c = new com.google.android.gms.common.l.a("RevokeAccessOperation", new String[0]);
    private final String a;
    private final com.google.android.gms.common.api.internal.q b;

    private f(String str) {
        com.google.android.gms.common.internal.q.g(str);
        this.a = str;
        this.b = new com.google.android.gms.common.api.internal.q(null);
    }

    public static com.google.android.gms.common.api.f<Status> a(String str) {
        if (str == null) {
            return com.google.android.gms.common.api.g.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f921h;
        try {
            String strValueOf = String.valueOf(this.a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f;
            } else {
                c.b("Unable to revoke access!", new Object[0]);
            }
            com.google.android.gms.common.l.a aVar = c;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            com.google.android.gms.common.l.a aVar2 = c;
            String strValueOf2 = String.valueOf(e.toString());
            aVar2.b(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            com.google.android.gms.common.l.a aVar3 = c;
            String strValueOf3 = String.valueOf(e2.toString());
            aVar3.b(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.b.j(status);
    }
}
