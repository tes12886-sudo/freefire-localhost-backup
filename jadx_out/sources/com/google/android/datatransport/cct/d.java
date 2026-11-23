package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.FF.voiceengine.FFVoiceConst;
import com.appff.haptic.base.Utils;
import com.google.android.datatransport.cct.f.j;
import com.google.android.datatransport.cct.f.k;
import com.google.android.datatransport.cct.f.l;
import com.google.android.datatransport.cct.f.n;
import com.google.android.datatransport.cct.f.o;
import com.google.android.datatransport.cct.f.p;
import com.google.android.datatransport.h.h;
import com.google.android.datatransport.h.i;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class d implements m {
    private final com.google.firebase.i.a a;
    private final ConnectivityManager b;
    private final Context c;
    final URL d;
    private final com.google.android.datatransport.h.z.a e;
    private final com.google.android.datatransport.h.z.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f834g;

    static final class a {
        final URL a;
        final j b;
        final String c;

        a(URL url, j jVar, String str) {
            this.a = url;
            this.b = jVar;
            this.c = str;
        }

        a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i2, URL url, long j2) {
            this.a = i2;
            this.b = url;
            this.c = j2;
        }
    }

    d(Context context, com.google.android.datatransport.h.z.a aVar, com.google.android.datatransport.h.z.a aVar2) {
        this(context, aVar, aVar2, 40000);
    }

    d(Context context, com.google.android.datatransport.h.z.a aVar, com.google.android.datatransport.h.z.a aVar2, int i2) {
        this.a = j.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = m(c.c);
        this.e = aVar2;
        this.f = aVar;
        this.f834g = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b c(a aVar) throws IOException {
        com.google.android.datatransport.h.v.a.a("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(Utils.MAX_DURATION);
        httpURLConnection.setReadTimeout(this.f834g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.0.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.a.b(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    com.google.android.datatransport.h.v.a.e("CctTransportBackend", "Status Code: " + responseCode);
                    com.google.android.datatransport.h.v.a.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    com.google.android.datatransport.h.v.a.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (inputStreamL != null) {
                                try {
                                    inputStreamL.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        } catch (com.google.firebase.i.b e) {
            e = e;
            com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(Utils.HE_DEFAULT_RELATIVE_TIME, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(Utils.HE_DEFAULT_RELATIVE_TIME, null, 0L);
        }
    }

    private static int d(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (o.b.a(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = o.b.COMBINED;
        }
        return bVar.c();
    }

    private static int e(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.c() : networkInfo.getType();
    }

    private static int f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    private j g(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strJ = iVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            com.google.android.datatransport.cct.f.m.a aVarA = com.google.android.datatransport.cct.f.m.a();
            aVarA.f(p.DEFAULT);
            aVarA.g(this.f.a());
            aVarA.h(this.e.a());
            k.a aVarA2 = k.a();
            aVarA2.c(k.b.ANDROID_FIREBASE);
            com.google.android.datatransport.cct.f.a.AbstractC0115a abstractC0115aA = com.google.android.datatransport.cct.f.a.a();
            abstractC0115aA.m(Integer.valueOf(iVar2.g("sdk-version")));
            abstractC0115aA.j(iVar2.b("model"));
            abstractC0115aA.f(iVar2.b("hardware"));
            abstractC0115aA.d(iVar2.b("device"));
            abstractC0115aA.l(iVar2.b("product"));
            abstractC0115aA.k(iVar2.b("os-uild"));
            abstractC0115aA.h(iVar2.b("manufacturer"));
            abstractC0115aA.e(iVar2.b("fingerprint"));
            abstractC0115aA.c(iVar2.b("country"));
            abstractC0115aA.g(iVar2.b("locale"));
            abstractC0115aA.i(iVar2.b("mcc_mnc"));
            abstractC0115aA.b(iVar2.b("application_build"));
            aVarA2.b(abstractC0115aA.a());
            aVarA.b(aVarA2.a());
            try {
                aVarA.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarA.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                com.google.android.datatransport.b bVarB = hVarE.b();
                if (bVarB.equals(com.google.android.datatransport.b.b("proto"))) {
                    aVarJ = l.j(hVarE.a());
                } else if (bVarB.equals(com.google.android.datatransport.b.b("json"))) {
                    aVarJ = l.i(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    com.google.android.datatransport.h.v.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarJ.c(iVar3.f());
                aVarJ.d(iVar3.k());
                aVarJ.h(iVar3.h("tz-offset"));
                o.a aVarA3 = o.a();
                aVarA3.c(o.c.a(iVar3.g("net-type")));
                aVarA3.b(o.b.a(iVar3.g("mobile-subtype")));
                aVarJ.e(aVarA3.a());
                if (iVar3.d() != null) {
                    aVarJ.b(iVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarA.c(arrayList3);
            arrayList2.add(aVarA.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager h(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long i() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF;
    }

    static /* synthetic */ a k(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        com.google.android.datatransport.h.v.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    private static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        i.a aVarL = iVar.l();
        aVarL.a("sdk-version", Build.VERSION.SDK_INT);
        aVarL.c("model", Build.MODEL);
        aVarL.c("hardware", Build.HARDWARE);
        aVarL.c("device", Build.DEVICE);
        aVarL.c("product", Build.PRODUCT);
        aVarL.c("os-uild", Build.ID);
        aVarL.c("manufacturer", Build.MANUFACTURER);
        aVarL.c("fingerprint", Build.FINGERPRINT);
        aVarL.b("tz-offset", i());
        aVarL.a("net-type", e(activeNetworkInfo));
        aVarL.a("mobile-subtype", d(activeNetworkInfo));
        aVarL.c("country", Locale.getDefault().getCountry());
        aVarL.c("locale", Locale.getDefault().getLanguage());
        aVarL.c("mcc_mnc", h(this.c).getSimOperator());
        aVarL.c("application_build", Integer.toString(f(this.c)));
        return aVarL.d();
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public g b(f fVar) {
        j jVarG = g(fVar);
        URL urlM = this.d;
        String strF = null;
        if (fVar.c() != null) {
            try {
                c cVarE = c.e(fVar.c());
                strF = cVarE.f() != null ? cVarE.f() : null;
                if (cVarE.g() != null) {
                    urlM = m(cVarE.g());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) com.google.android.datatransport.h.w.b.a(5, new a(urlM, jVarG, strF), new com.google.android.datatransport.h.w.a() { // from class: com.google.android.datatransport.cct.b
                @Override // com.google.android.datatransport.h.w.a
                public final Object apply(Object obj) {
                    return this.a.c((d.a) obj);
                }
            }, new com.google.android.datatransport.h.w.c() { // from class: com.google.android.datatransport.cct.a
                @Override // com.google.android.datatransport.h.w.c
                public final Object a(Object obj, Object obj2) {
                    return d.k((d.a) obj, (d.b) obj2);
                }
            });
            int i2 = bVar.a;
            if (i2 == 200) {
                return g.d(bVar.c);
            }
            if (i2 < 500 && i2 != 404) {
                return g.a();
            }
            return g.e();
        } catch (IOException e) {
            com.google.android.datatransport.h.v.a.c("CctTransportBackend", "Could not make request to the backend", e);
            return g.e();
        }
    }
}
