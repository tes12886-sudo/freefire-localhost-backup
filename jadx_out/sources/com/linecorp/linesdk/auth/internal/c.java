package com.linecorp.linesdk.auth.internal;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import j.e.b.h.a.e;
import j.e.b.h.f;
import j.e.b.h.g;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class c {
    final LineAuthenticationActivity a;
    final j.e.b.i.a b;
    final j.e.b.h.a.c c;
    final e d;
    final com.linecorp.linesdk.auth.internal.a e;
    final j.e.b.h.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String[] f1479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final d f1480h;

    /* JADX INFO: Access modifiers changed from: private */
    class a extends AsyncTask<String, Void, j.e.b.i.c> {
        private a() {
        }

        /* synthetic */ a(c cVar, byte b) {
            this();
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ j.e.b.i.c doInBackground(String[] strArr) {
            String[] strArr2 = strArr;
            String str = (strArr2 == null || strArr2.length != 1) ? null : strArr2[0];
            d dVar = c.this.f1480h;
            g gVar = dVar.a;
            String str2 = dVar.b;
            if (TextUtils.isEmpty(str) || gVar == null || TextUtils.isEmpty(str2)) {
                return new j.e.b.i.c(j.e.b.d.INTERNAL_ERROR, new j.e.b.b("Requested data is missing."));
            }
            c cVar = c.this;
            j.e.b.h.a.c cVar2 = cVar.c;
            String strA = cVar.b.a();
            Uri uriBuild = cVar2.a.buildUpon().appendPath("oauth").appendPath("accessToken").build();
            HashMap map = new HashMap(5);
            map.put("grant_type", "authorization_code");
            map.put("code", str);
            map.put("redirect_uri", str2);
            map.put("client_id", strA);
            map.put("otp", gVar.b);
            j.e.b.c cVarA = cVar2.b.a(uriBuild, Collections.emptyMap(), map, j.e.b.h.a.c.d);
            if (!cVarA.f()) {
                return c.a(cVarA);
            }
            f fVar = (f) cVarA.e();
            j.e.b.h.e eVar = fVar.a;
            j.e.b.c<j.e.b.f> cVarA2 = c.this.d.a(eVar);
            if (!cVarA2.f()) {
                return c.a(cVarA2);
            }
            c.this.f.c(eVar);
            return new j.e.b.i.c(cVarA2.e(), new j.e.b.e(new j.e.b.a(eVar.a, eVar.b, eVar.c), fVar.b));
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(j.e.b.i.c cVar) {
            c cVar2 = c.this;
            cVar2.f1480h.d = d.b.d;
            cVar2.a.c(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements Runnable {
        private b() {
        }

        /* synthetic */ b(c cVar, byte b) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.f1480h.d == d.b.c || cVar.a.isFinishing()) {
                return;
            }
            c.this.a.c(j.e.b.i.c.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.linecorp.linesdk.auth.internal.c$c, reason: collision with other inner class name */
    class AsyncTaskC0155c extends AsyncTask<Void, Void, j.e.b.c<g>> {
        private AsyncTaskC0155c() {
        }

        /* synthetic */ AsyncTaskC0155c(c cVar, byte b) {
            this();
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ j.e.b.c<g> doInBackground(Void[] voidArr) {
            c cVar = c.this;
            j.e.b.h.a.c cVar2 = cVar.c;
            String strA = cVar.b.a();
            Uri uriBuild = cVar2.a.buildUpon().appendPath("oauth").appendPath("otp").build();
            HashMap map = new HashMap(1);
            map.put("client_id", strA);
            return cVar2.b.a(uriBuild, Collections.emptyMap(), map, j.e.b.h.a.c.c);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0110  */
        /* JADX WARN: Code duplicated, block: B:44:0x0115  */
        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(j.e.b.c<g> cVar) {
            Intent data;
            Bundle bundle;
            boolean z;
            com.linecorp.linesdk.auth.internal.a.C0154a c0154a;
            boolean z2;
            j.e.b.c<g> cVar2 = cVar;
            if (!cVar2.f()) {
                c cVar3 = c.this;
                cVar3.f1480h.d = d.b.d;
                cVar3.a.c(c.a(cVar2));
                return;
            }
            g gVarE = cVar2.e();
            c cVar4 = c.this;
            cVar4.f1480h.a = gVarE;
            try {
                com.linecorp.linesdk.auth.internal.a aVar = cVar4.e;
                LineAuthenticationActivity lineAuthenticationActivity = cVar4.a;
                j.e.b.i.a aVar2 = cVar4.b;
                String[] strArr = cVar4.f1479g;
                byte[] bArr = new byte[8];
                long jNextLong = new SecureRandom().nextLong();
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i2] = (byte) jNextLong;
                    jNextLong >>= 8;
                }
                String strEncodeToString = Base64.encodeToString(bArr, 11);
                aVar.a.c = strEncodeToString;
                String str = "intent://result#Intent;package=" + lineAuthenticationActivity.getPackageName() + ";scheme=lineauth;end";
                Uri.Builder builderAppendQueryParameter = aVar2.c().buildUpon().appendQueryParameter("response_type", "code").appendQueryParameter("client_id", aVar2.a()).appendQueryParameter("state", strEncodeToString).appendQueryParameter("otpId", gVarE.a).appendQueryParameter("redirect_uri", str);
                if (strArr != null && strArr.length > 0) {
                    builderAppendQueryParameter.appendQueryParameter("scope", TextUtils.join(" ", strArr));
                }
                Uri uriBuild = builderAppendQueryParameter.build();
                boolean zE = aVar2.e();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 16) {
                    h.d.b.d.a aVar3 = new h.d.b.d.a();
                    aVar3.d(androidx.core.content.a.d(lineAuthenticationActivity, R.color.white));
                    h.d.b.d dVarA = aVar3.a();
                    data = dVarA.a.setData(uriBuild);
                    bundle = dVarA.b;
                } else {
                    data = new Intent("android.intent.action.VIEW").setData(uriBuild);
                    bundle = null;
                }
                com.linecorp.linesdk.auth.internal.b bVarA = com.linecorp.linesdk.auth.internal.b.a(lineAuthenticationActivity);
                if (bVarA == null) {
                    c0154a = new com.linecorp.linesdk.auth.internal.a.C0154a(data, bundle, false);
                } else {
                    if (zE) {
                        z = false;
                    } else {
                        com.linecorp.linesdk.auth.internal.b bVar = com.linecorp.linesdk.auth.internal.a.b;
                        if (bVar == null) {
                            z2 = false;
                        } else {
                            int i4 = bVarA.a;
                            int i5 = bVar.a;
                            if (i4 == i5) {
                                int i6 = bVarA.b;
                                int i7 = bVar.b;
                                if (i6 != i7) {
                                    if (i6 >= i7) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else if (bVarA.c >= bVar.c) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else if (i4 >= i5) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uriBuild);
                        intent.setPackage("jp.naver.line.android");
                        c0154a = new com.linecorp.linesdk.auth.internal.a.C0154a(intent, bundle, true);
                    } else {
                        List<Intent> listA = com.linecorp.linesdk.auth.internal.a.a(uriBuild, lineAuthenticationActivity.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0), data.getExtras());
                        int size = listA.size();
                        if (size == 0) {
                            throw new ActivityNotFoundException("Activity for LINE log-in is not found. uri=" + uriBuild);
                        }
                        if (size == 1) {
                            c0154a = new com.linecorp.linesdk.auth.internal.a.C0154a(listA.get(0), bundle, false);
                        } else {
                            Intent intentCreateChooser = Intent.createChooser(listA.remove(0), null);
                            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) listA.toArray(new Parcelable[listA.size()]));
                            c0154a = new com.linecorp.linesdk.auth.internal.a.C0154a(intentCreateChooser, bundle, false);
                        }
                    }
                }
                com.linecorp.linesdk.auth.internal.a.b bVar2 = new com.linecorp.linesdk.auth.internal.a.b(c0154a.a, c0154a.b, str, c0154a.c);
                if (bVar2.d) {
                    if (i3 >= 16) {
                        c.this.a.startActivity(bVar2.a, bVar2.b);
                    } else {
                        c.this.a.startActivity(bVar2.a);
                    }
                } else if (i3 >= 16) {
                    c.this.a.startActivityForResult(bVar2.a, 3, bVar2.b);
                } else {
                    c.this.a.startActivityForResult(bVar2.a, 3);
                }
                c.this.f1480h.b = bVar2.c;
            } catch (ActivityNotFoundException e) {
                c cVar5 = c.this;
                cVar5.f1480h.d = d.b.d;
                cVar5.a.c(new j.e.b.i.c(j.e.b.d.INTERNAL_ERROR, new j.e.b.b(e)));
            }
        }
    }

    c(LineAuthenticationActivity lineAuthenticationActivity, j.e.b.i.a aVar, d dVar, String[] strArr) {
        this(lineAuthenticationActivity, aVar, new j.e.b.h.a.c(lineAuthenticationActivity.getApplicationContext(), aVar.b()), new e(lineAuthenticationActivity.getApplicationContext(), aVar.b()), new com.linecorp.linesdk.auth.internal.a(dVar), new j.e.b.h.b(lineAuthenticationActivity.getApplicationContext(), aVar.a()), dVar, strArr);
    }

    private c(LineAuthenticationActivity lineAuthenticationActivity, j.e.b.i.a aVar, j.e.b.h.a.c cVar, e eVar, com.linecorp.linesdk.auth.internal.a aVar2, j.e.b.h.b bVar, d dVar, String[] strArr) {
        this.a = lineAuthenticationActivity;
        this.b = aVar;
        this.c = cVar;
        this.d = eVar;
        this.e = aVar2;
        this.f = bVar;
        this.f1480h = dVar;
        this.f1479g = strArr;
    }

    static /* synthetic */ j.e.b.i.c a(j.e.b.c cVar) {
        return new j.e.b.i.c(cVar.d(), cVar.c());
    }
}
