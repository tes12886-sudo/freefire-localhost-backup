package com.beetalk.sdk.t;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g extends k {
    private static volatile g b;
    private final j a = new j(com.beetalk.sdk.g.s(), "com.garena.msdk.persist.fallback");

    private g() {
    }

    private void A(Map<String, String> map, Map<String, String> map2) {
        long j2;
        String strG = g();
        String str = map2.get(strG);
        String str2 = map.get(strG);
        long j3 = 0;
        if (str != null) {
            try {
                j2 = Long.parseLong(str);
            } catch (Throwable unused) {
                j2 = 0;
            }
        } else {
            j2 = 0;
        }
        if (str2 != null) {
            try {
                j3 = Long.parseLong(str2);
            } catch (Throwable unused2) {
            }
        }
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null && !map.containsKey(entry.getKey())) {
                map5.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (entry2 != null && entry2.getKey() != null && entry2.getValue() != null) {
                if (!map2.containsKey(entry2.getKey())) {
                    map4.put(entry2.getKey(), entry2.getValue());
                } else if (!entry2.getValue().equals(map2.get(entry2.getKey()))) {
                    map3.put(entry2.getKey(), map2.get(entry2.getKey()));
                }
            }
        }
        map.putAll(map5);
        if (j2 <= j3) {
            if (!map3.isEmpty() || !map4.isEmpty()) {
                x(map);
            }
            if (map5.isEmpty()) {
                return;
            }
            this.a.o(map);
            return;
        }
        if (!map3.isEmpty() || !map5.isEmpty()) {
            map.putAll(map3);
            this.a.o(map);
        }
        if (map4.isEmpty()) {
            return;
        }
        x(map);
    }

    private String q() {
        return Environment.getExternalStorageDirectory().getAbsolutePath() + "/com.garena.msdk";
    }

    private String r() {
        Integer numC = com.beetalk.sdk.x.d.c(com.beetalk.sdk.g.s());
        if (numC.intValue() == -1 || numC.intValue() == 100006) {
            return "guest.dat";
        }
        return "guest" + com.beetalk.sdk.x.d.c(com.beetalk.sdk.g.s()) + ".dat";
    }

    public static g s() {
        if (b == null) {
            synchronized (g.class) {
                if (b == null) {
                    b = new g();
                }
            }
        }
        return b;
    }

    private boolean t() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private boolean u() {
        if (!t()) {
            return true;
        }
        Context contextS = com.beetalk.sdk.g.s();
        return contextS != null && contextS.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a7: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:38:0x00a7 */
    private Map<String, String> v() throws Throwable {
        BufferedReader bufferedReader;
        FileNotFoundException e;
        BufferedReader bufferedReader2;
        HashMap map = new HashMap();
        File file = new File(q());
        if (!file.exists()) {
            return map;
        }
        File file2 = new File(file, r());
        if (!file2.exists()) {
            return map;
        }
        BufferedReader bufferedReader3 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file2));
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        map.putAll(z(sb.toString()));
                        bufferedReader.close();
                    } catch (IOException e2) {
                        try {
                            e2.printStackTrace();
                            com.beetalk.sdk.x.a.c("read failed from file: " + file2.getAbsolutePath(), new Object[0]);
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            return null;
                        } catch (FileNotFoundException e4) {
                            e = e4;
                            e.printStackTrace();
                            com.beetalk.sdk.x.a.c("fail to read from file: " + file2.getAbsolutePath(), new Object[0]);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return map;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader3 = bufferedReader2;
                    if (bufferedReader3 != null) {
                        try {
                            bufferedReader3.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e6) {
                bufferedReader = null;
                e = e6;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader3 != null) {
                    bufferedReader3.close();
                }
                throw th;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        return map;
    }

    private String w(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("guest_account_info", new JSONObject(map));
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
        }
        return jSONObject.toString();
    }

    private void x(Map<String, String> map) {
        y(w(map));
    }

    private void y(String str) {
        File file = new File(q());
        if (!file.exists() && !file.mkdir()) {
            com.beetalk.sdk.x.a.c("can't create dir: " + file.getAbsolutePath(), new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, r()));
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.write(str);
            printWriter.flush();
            printWriter.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            com.beetalk.sdk.x.a.c("******* File not found. Did you add a WRITE_EXTERNAL_STORAGE permission to the   manifest?", new Object[0]);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private Map<String, String> z(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("guest_account_info");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
        }
        return map;
    }

    @Override // com.beetalk.sdk.t.k
    public Map i() {
        Map<String, String> mapI = this.a.i();
        if (u()) {
            A(mapI, v());
        }
        return mapI;
    }

    @Override // com.beetalk.sdk.t.k
    public void m(String str) throws Throwable {
        this.a.m(str);
        if (u()) {
            Map<String, String> mapV = v();
            if (mapV.remove(str) != null) {
                x(mapV);
            }
        }
    }

    @Override // com.beetalk.sdk.t.k
    public void o(Map<String, String> map) {
        this.a.o(map);
        if (!u()) {
            com.beetalk.sdk.x.a.a("external storage not accessible, save in internal storage only", new Object[0]);
            return;
        }
        HashMap map2 = (HashMap) i();
        for (String str : map.keySet()) {
            map2.put(str, map.get(str));
        }
        x(map2);
    }

    public String p() {
        if (!u()) {
            return super.b();
        }
        Map<String, String> mapI = this.a.i();
        Map<String, String> mapV = v();
        if (mapV == null) {
            return super.b();
        }
        String strG = g();
        String strD = d();
        String str = mapV.get(strG);
        String str2 = mapI.get(strG);
        String str3 = mapV.get(strD);
        String str4 = mapI.get(strD);
        if ((TextUtils.isEmpty(str2) || h.h.k.c.a(str2, str)) && (TextUtils.isEmpty(str4) || h.h.k.c.a(str4, str3))) {
            return super.b();
        }
        this.a.m(strG);
        this.a.m(strD);
        return str2;
    }
}
