package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j.e.b.g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LineAuthenticationActivity extends Activity {
    private boolean a = false;
    private d b;
    private c c;

    public static Intent a(Context context, j.e.b.i.a aVar, List<String> list) {
        Intent intent = new Intent(context, (Class<?>) LineAuthenticationActivity.class);
        intent.putExtra("authentication_config", aVar);
        intent.putExtra("permissions", (String[]) list.toArray(new String[list.size()]));
        return intent;
    }

    public static j.e.b.i.c b(Intent intent) {
        j.e.b.i.c cVar = (j.e.b.i.c) intent.getParcelableExtra("authentication_result");
        return cVar == null ? new j.e.b.i.c(j.e.b.d.INTERNAL_ERROR, new j.e.b.b("Authentication result is not found.")) : cVar;
    }

    final void c(j.e.b.i.c cVar) {
        d dVar = this.b;
        if (dVar == null) {
            finish();
            return;
        }
        int i2 = dVar.d;
        if ((i2 != d.b.b || this.a) && i2 != d.b.d) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("authentication_result", cVar);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (this.b.d == d.b.b) {
            c cVar = this.c;
            if (i2 != 3 || cVar.f1480h.d == d.b.c) {
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new c.b(cVar, (byte) 0), 1000L);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        d dVar;
        super.onCreate(bundle);
        setContentView(g.a);
        Intent intent = getIntent();
        j.e.b.i.a aVar = (j.e.b.i.a) intent.getParcelableExtra("authentication_config");
        if (aVar == null) {
            c(new j.e.b.i.c(j.e.b.d.INTERNAL_ERROR, new j.e.b.b("The requested parameter is illegal.")));
            return;
        }
        if (bundle == null || (dVar = (d) bundle.getParcelable("authenticationStatus")) == null) {
            dVar = new d();
        }
        this.b = dVar;
        this.c = new c(this, aVar, dVar, intent.getStringArrayExtra("permissions"));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        String str;
        a.c cVar;
        c.a aVar;
        String[] strArr;
        j.e.b.d dVar;
        super.onNewIntent(intent);
        if (this.b.d == d.b.b) {
            c cVar2 = this.c;
            cVar2.f1480h.d = d.b.c;
            a aVar2 = cVar2.e;
            Uri data = intent.getData();
            if (data != null) {
                String str2 = aVar2.a.c;
                String queryParameter = data.getQueryParameter("state");
                if (str2 == null || !str2.equals(queryParameter)) {
                    str = "Illegal parameter value of 'state'.";
                } else {
                    String queryParameter2 = data.getQueryParameter("code");
                    cVar = !TextUtils.isEmpty(queryParameter2) ? new a.c(queryParameter2, null, null, null) : new a.c(null, data.getQueryParameter("error"), data.getQueryParameter("error_description"), null);
                }
                if (cVar.b()) {
                    aVar = new c.a(cVar2, (byte) 0);
                    strArr = new String[1];
                    if (!TextUtils.isEmpty(cVar.a)) {
                        throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
                    }
                    strArr[0] = cVar.a;
                    aVar.execute(strArr);
                }
                cVar2.f1480h.d = d.b.d;
                LineAuthenticationActivity lineAuthenticationActivity = cVar2.a;
                if (cVar.c()) {
                    dVar = j.e.b.d.AUTHENTICATION_AGENT_ERROR;
                } else {
                    dVar = j.e.b.d.INTERNAL_ERROR;
                }
                lineAuthenticationActivity.c(new j.e.b.i.c(dVar, cVar.d()));
                return;
            }
            str = "Illegal redirection from external application.";
            cVar = a.c.a(str);
            if (cVar.b()) {
                cVar2.f1480h.d = d.b.d;
                LineAuthenticationActivity lineAuthenticationActivity2 = cVar2.a;
                if (cVar.c()) {
                    dVar = j.e.b.d.AUTHENTICATION_AGENT_ERROR;
                } else {
                    dVar = j.e.b.d.INTERNAL_ERROR;
                }
                lineAuthenticationActivity2.c(new j.e.b.i.c(dVar, cVar.d()));
                return;
            }
            aVar = new c.a(cVar2, (byte) 0);
            strArr = new String[1];
            if (!TextUtils.isEmpty(cVar.a)) {
                throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
            }
            strArr[0] = cVar.a;
            aVar.execute(strArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        int i2 = this.b.d;
        byte b = 0;
        if (i2 == d.b.a) {
            c cVar = this.c;
            cVar.f1480h.d = d.b.b;
            new c.AsyncTaskC0155c(cVar, b).execute(new Void[0]);
        } else if (i2 != d.b.c) {
            new Handler(Looper.getMainLooper()).postDelayed(new c.b(this.c, b), 1000L);
        }
        this.a = false;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authenticationStatus", this.b);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.a = true;
    }
}
