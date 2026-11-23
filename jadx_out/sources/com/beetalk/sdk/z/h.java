package com.beetalk.sdk.z;

import android.text.TextUtils;
import android.util.Log;
import com.beetalk.sdk.p;
import com.beetalk.sdk.t.i;
import com.beetalk.sdk.x.j;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static volatile h a;

    private h() {
    }

    private void a(HttpURLConnection httpURLConnection, String str) {
        if (p.f513m.contains(str)) {
            String strD = new i().d();
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            httpURLConnection.setRequestProperty("Cookie", strD);
        }
    }

    private static LinkedHashMap<String, List<String>> b(HttpURLConnection httpURLConnection) {
        LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
        int i2 = 0;
        while (true) {
            String headerFieldKey = httpURLConnection.getHeaderFieldKey(i2);
            String headerField = httpURLConnection.getHeaderField(i2);
            if (headerFieldKey == null && headerField == null) {
                return linkedHashMap;
            }
            i2++;
            if (headerFieldKey != null && headerField != null) {
                if (linkedHashMap.containsKey(headerFieldKey)) {
                    linkedHashMap.get(headerFieldKey).add(headerField);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(headerField);
                    linkedHashMap.put(headerFieldKey, arrayList);
                }
            }
        }
    }

    public static h c() {
        if (a == null) {
            synchronized (h.class) {
                if (a == null) {
                    a = new h();
                }
            }
        }
        return a;
    }

    private static boolean d() {
        return p.p() == p.c.TEST;
    }

    private void e(String str) {
        if (d()) {
            Log.d("SimpleNetworkClient", str);
        }
    }

    private void f(HttpURLConnection httpURLConnection) {
        List<String> value;
        if (d()) {
            for (Map.Entry<String, List<String>> entry : b(httpURLConnection).entrySet()) {
                String key = entry.getKey();
                if (key != null && (value = entry.getValue()) != null) {
                    e(key + ": " + TextUtils.join("; ", value));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private JSONObject i(String str, List<d> list, String str2, boolean z) throws Throwable {
        BufferedReader bufferedReader;
        JSONObject jSONObject;
        BufferedReader bufferedReader2 = null;
        try {
            e("--> POST " + str);
            HttpURLConnection httpURLConnectionA = c.a(str);
            if (httpURLConnectionA == null) {
                e("--> END POST Failed to build connection.");
                return null;
            }
            a(httpURLConnectionA, str);
            httpURLConnectionA.setRequestMethod("POST");
            if (list != null) {
                for (d dVar : list) {
                    httpURLConnectionA.setRequestProperty(dVar.a, dVar.b);
                    e(dVar.a + ": " + dVar.b);
                }
            }
            e(str2);
            httpURLConnectionA.setDoOutput(true);
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            e("--> END POST");
            httpURLConnectionA.connect();
            int responseCode = httpURLConnectionA.getResponseCode();
            int iOptInt = 0;
            com.beetalk.sdk.x.a.i("request code %d", Integer.valueOf(responseCode));
            e("<-- " + responseCode + " " + str);
            f(httpURLConnectionA);
            if (responseCode == 200 || z) {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionA.getInputStream()));
                try {
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        com.beetalk.sdk.x.a.a(sb.toString(), new Object[0]);
                        e(sb.toString());
                        try {
                            jSONObject = new JSONObject(sb.toString());
                            try {
                                if (jSONObject.has("platform")) {
                                    iOptInt = jSONObject.optInt("platform");
                                }
                            } catch (JSONException e) {
                                e = e;
                                com.beetalk.sdk.x.a.b(e);
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            jSONObject = null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        com.beetalk.sdk.x.a.b(e);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                com.beetalk.sdk.x.a.b(e4);
                            }
                        }
                        e("<-- END HTTP Failed to get response");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e5) {
                            com.beetalk.sdk.x.a.b(e5);
                        }
                    }
                    throw th;
                }
            } else {
                bufferedReader = null;
                jSONObject = null;
            }
            p(httpURLConnectionA, iOptInt);
            httpURLConnectionA.disconnect();
            e("<-- END HTTP");
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e6) {
                    com.beetalk.sdk.x.a.b(e6);
                }
            }
            return jSONObject;
        } catch (IOException e7) {
            e = e7;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    private String o(String str) {
        return str == null ? "" : str;
    }

    private void p(HttpURLConnection httpURLConnection, int i2) {
        List<String> list;
        LinkedHashMap<String, List<String>> linkedHashMapB = b(httpURLConnection);
        if (!linkedHashMapB.containsKey("Set-Cookie") || (list = linkedHashMapB.get("Set-Cookie")) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(str);
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        i iVar = new i();
        if (TextUtils.isEmpty(iVar.d()) || i2 == 4) {
            iVar.i(string);
        }
    }

    public JSONObject g(String str, Map<String, String> map) {
        return h(str, map, false);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public JSONObject h(String str, Map<String, String> map, boolean z) throws Throwable {
        BufferedReader bufferedReader;
        JSONObject jSONObject;
        BufferedReader bufferedReader2 = null;
        try {
            ArrayList arrayList = new ArrayList();
            if (!map.isEmpty()) {
                for (String str2 : map.keySet()) {
                    arrayList.add(new d(str2, o(map.get(str2))));
                }
            }
            String str3 = str + "?" + j.a(arrayList);
            int iOptInt = 0;
            com.beetalk.sdk.x.a.i("request url: %s", str3);
            e("--> GET " + str3);
            HttpURLConnection httpURLConnectionA = c.a(str3);
            if (httpURLConnectionA == null) {
                e("--> END GET Failed to build connection.");
                return null;
            }
            a(httpURLConnectionA, str);
            e("--> END GET");
            httpURLConnectionA.connect();
            InputStream inputStream = httpURLConnectionA.getInputStream();
            int responseCode = httpURLConnectionA.getResponseCode();
            com.beetalk.sdk.x.a.i("request code %d", Integer.valueOf(responseCode));
            e("<-- " + responseCode + " " + str3);
            f(httpURLConnectionA);
            if (responseCode == 200 || z) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        e(sb.toString());
                        try {
                            jSONObject = new JSONObject(sb.toString());
                            try {
                                if (jSONObject.has("platform")) {
                                    iOptInt = jSONObject.optInt("platform");
                                }
                            } catch (JSONException e) {
                                e = e;
                                com.beetalk.sdk.x.a.b(e);
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            jSONObject = null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        com.beetalk.sdk.x.a.b(e);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                com.beetalk.sdk.x.a.b(e4);
                            }
                        }
                        e("<-- END HTTP Failed to get response");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e5) {
                            com.beetalk.sdk.x.a.b(e5);
                        }
                    }
                    throw th;
                }
            } else {
                bufferedReader = null;
                jSONObject = null;
            }
            p(httpURLConnectionA, iOptInt);
            httpURLConnectionA.disconnect();
            e("<-- END HTTP");
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e6) {
                    com.beetalk.sdk.x.a.b(e6);
                }
            }
            return jSONObject;
        } catch (IOException e7) {
            e = e7;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    public JSONObject j(String str, List<d> list, Map<String, String> map) {
        return k(str, list, map, false, "");
    }

    public JSONObject k(String str, List<d> list, Map<String, String> map, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (String str3 : map.keySet()) {
                arrayList.add(new d(str3, o(map.get(str3))));
            }
        }
        try {
            String strA = j.a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new d("Content-Type", "application/x-www-form-urlencoded"));
            if (list != null) {
                arrayList2.addAll(list);
            }
            if (TextUtils.isEmpty(str2)) {
                com.beetalk.sdk.x.a.i("Making Request for url %s & params %s", str, strA);
            } else {
                String strA2 = com.beetalk.sdk.x.i.a(str2, strA);
                arrayList2.add(new d("Authorization", "Signature " + strA2));
                com.beetalk.sdk.x.a.i("Making Request for url %s & params %s & signature %s", str, strA, strA2);
            }
            return i(str, arrayList2, strA, z);
        } catch (Exception e) {
            com.beetalk.sdk.x.a.b(e);
            return null;
        }
    }

    public JSONObject l(String str, List<d> list, JSONObject jSONObject) {
        return m(str, list, jSONObject, false);
    }

    public JSONObject m(String str, List<d> list, JSONObject jSONObject, boolean z) {
        String string;
        if (jSONObject == null) {
            string = "";
        } else {
            try {
                string = jSONObject.toString();
            } catch (Exception e) {
                com.beetalk.sdk.x.a.b(e);
                return null;
            }
        }
        com.beetalk.sdk.x.a.i("Making Json Request for url %s & params %s", str, string);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d("Content-Type", "application/json"));
        if (list != null) {
            arrayList.addAll(list);
        }
        return i(str, arrayList, string, z);
    }

    public JSONObject n(String str, Map<String, String> map) {
        return j(str, null, map);
    }
}
