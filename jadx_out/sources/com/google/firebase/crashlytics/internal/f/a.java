package com.google.firebase.crashlytics.internal.f;

import com.FF.voiceengine.FFVoiceConst;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private final String a;
    private final Map<String, String> b;
    private final Map<String, String> c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.a = str;
        this.b = map;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e A[EDGE_INSN: B:15:0x002e->B:4:0x002e BREAK  A[LOOP:0: B:6:0x0036->B:5:0x0035], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:5:0x0035 A[LOOP:0: B:6:0x0036->B:5:0x0035, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0066 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private java.lang.String a(java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = "="
            r2.append(r3)
            java.lang.Object r4 = r1.getValue()
            java.lang.String r5 = ""
            if (r4 == 0) goto L35
        L2e:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            goto L36
        L35:
            r1 = r5
        L36:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "&"
            r2.append(r4)
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            r2.append(r3)
            java.lang.Object r4 = r1.getValue()
            if (r4 == 0) goto L35
            goto L2e
        L69:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.f.a.a(java.util.Map):java.lang.String");
    }

    private String b(String str, Map<String, String> map) {
        String strA = a(map);
        if (strA.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strA;
        }
        if (!str.endsWith("&")) {
            strA = "&" + strA;
        }
        return str + strA;
    }

    private String e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i2 = bufferedReader.read(cArr);
            if (i2 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i2);
        }
    }

    public c c() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String strE = null;
        inputStream = null;
        try {
            String strB = b(this.a, this.b);
            com.google.firebase.crashlytics.internal.a.f().i("GET Request URL: " + strB);
            httpsURLConnection = (HttpsURLConnection) new URL(strB).openConnection();
            try {
                httpsURLConnection.setReadTimeout(FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER);
                httpsURLConnection.setConnectTimeout(FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strE = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return new c(responseCode, strE);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.c.put(str, str2);
        return this;
    }
}
