package com.beetalk.sdk.account;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.FF.voiceengine.FFVoiceConst;
import com.beetalk.sdk.g;
import com.beetalk.sdk.x.d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MigrateGuestActivity extends Activity {
    private int a = 0;

    private boolean a() {
        String strF = f();
        if (strF == null) {
            strF = Uri.parse("content://com.android.externalstorage.documents/document/primary:com.garena.msdk").toString();
        }
        com.beetalk.sdk.x.a.a("checkSAFPermission: guest: " + strF, new Object[0]);
        for (UriPermission uriPermission : getContentResolver().getPersistedUriPermissions()) {
            com.beetalk.sdk.x.a.a("checkSAFPermission: " + uriPermission.getUri().toString(), new Object[0]);
            if (uriPermission.getUri().toString().equals(strF) && uriPermission.isReadPermission() && uriPermission.isWritePermission()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0190 A[Catch: IOException -> 0x015f, TRY_ENTER, TRY_LEAVE, TryCatch #16 {IOException -> 0x015f, blocks: (B:85:0x0190, B:70:0x015b), top: B:119:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0195  */
    private void b(Uri uri) throws Throwable {
        BufferedReader bufferedReader;
        h.k.a.a aVarA;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2;
        h.k.a.a aVarB = h.k.a.a.b(this, uri);
        boolean z = false;
        if (aVarB == null) {
            com.beetalk.sdk.x.a.c("documentFile is null", new Object[0]);
            j(1);
            return;
        }
        h.k.a.a[] aVarArrF = aVarB.f();
        String string = d.c(this).toString();
        int length = aVarArrF.length;
        int i2 = 0;
        while (true) {
            bufferedReader = null;
            bufferedWriter2 = null;
            bufferedReader = null;
            if (i2 >= length) {
                aVarA = null;
                break;
            }
            aVarA = aVarArrF[i2];
            com.beetalk.sdk.x.a.a("guestDatFile name is : " + aVarA.c(), new Object[0]);
            if (aVarA.e() && aVarA.c() != null && aVarA.c().contains(string)) {
                break;
            } else {
                i2++;
            }
        }
        if (aVarA == null) {
            aVarA = aVarB.a("application/dat", e());
        }
        try {
            try {
                FileDescriptor fileDescriptor = getContentResolver().openFileDescriptor(aVarA.d(), "rwt").getFileDescriptor();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileDescriptor)));
                try {
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        }
                        Map<String, String> mapN = n(sb.toString());
                        String strF = com.beetalk.sdk.t.a.s().f();
                        String strC = com.beetalk.sdk.t.a.s().c();
                        if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(strC)) {
                            String strG = com.beetalk.sdk.t.a.s().g();
                            String strD = com.beetalk.sdk.t.a.s().d();
                            mapN.put(strG, strF);
                            mapN.put(strD, strC);
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDescriptor)));
                            try {
                                try {
                                    bufferedWriter.write(h(mapN));
                                    bufferedWriter.flush();
                                    com.beetalk.sdk.x.a.a("doBackupeGuest success", new Object[0]);
                                    try {
                                        k(0, uri.toString());
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException e) {
                                            com.beetalk.sdk.x.a.b(e);
                                        }
                                        try {
                                            bufferedWriter.close();
                                            return;
                                        } catch (IOException e2) {
                                            com.beetalk.sdk.x.a.b(e2);
                                            return;
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        bufferedWriter2 = bufferedWriter;
                                        z = true;
                                        l("backup IO: " + e.getMessage());
                                        e.printStackTrace();
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException e4) {
                                            com.beetalk.sdk.x.a.b(e4);
                                        }
                                        if (bufferedWriter2 != null) {
                                            bufferedWriter2.close();
                                        }
                                        if (z) {
                                            return;
                                        }
                                        j(1);
                                        return;
                                    } catch (Exception e5) {
                                        e = e5;
                                        bufferedReader = bufferedReader2;
                                        z = true;
                                        try {
                                            l("backup: " + e.getMessage());
                                            com.beetalk.sdk.x.a.b(e);
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException e6) {
                                                    com.beetalk.sdk.x.a.b(e6);
                                                }
                                            }
                                            if (bufferedWriter != null) {
                                                bufferedWriter.close();
                                            }
                                            if (z) {
                                                j(1);
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException e7) {
                                                    com.beetalk.sdk.x.a.b(e7);
                                                }
                                            }
                                            if (bufferedWriter != null) {
                                                throw th;
                                            }
                                            try {
                                                bufferedWriter.close();
                                                throw th;
                                            } catch (IOException e8) {
                                                com.beetalk.sdk.x.a.b(e8);
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (bufferedWriter != null) {
                                        throw th;
                                    }
                                    bufferedWriter.close();
                                    throw th;
                                }
                            } catch (IOException e9) {
                                e = e9;
                                bufferedWriter2 = bufferedWriter;
                            } catch (Exception e10) {
                                e = e10;
                                bufferedReader = bufferedReader2;
                                l("backup: " + e.getMessage());
                                com.beetalk.sdk.x.a.b(e);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (bufferedWriter != null) {
                                    bufferedWriter.close();
                                }
                                if (z) {
                                    j(1);
                                    return;
                                }
                                return;
                            }
                        }
                        com.beetalk.sdk.x.a.c("strUid or strPwd is null", new Object[0]);
                        j(1);
                        try {
                            bufferedReader2.close();
                        } catch (IOException e11) {
                            com.beetalk.sdk.x.a.b(e11);
                        }
                    } catch (IOException e12) {
                        e = e12;
                    }
                } catch (Exception e13) {
                    e = e13;
                    bufferedWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter = null;
                }
            } catch (IOException e14) {
                com.beetalk.sdk.x.a.b(e14);
            }
        } catch (Exception e15) {
            e = e15;
            bufferedWriter = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x015b A[SYNTHETIC] */
    private void c(Uri uri) throws Throwable {
        h.k.a.a aVarB = h.k.a.a.b(this, uri);
        if (aVarB == null) {
            com.beetalk.sdk.x.a.c("documentFile is null", new Object[0]);
        } else {
            h.k.a.a[] aVarArrF = aVarB.f();
            if (aVarArrF.length > 0) {
                String string = d.c(this).toString();
                boolean z = false;
                for (h.k.a.a aVar : aVarArrF) {
                    com.beetalk.sdk.x.a.a("guestDatFile name is : " + aVar.c(), new Object[0]);
                    if (aVar.e() && aVar.c() != null && aVar.c().contains(string)) {
                        BufferedReader bufferedReader = null;
                        try {
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(getContentResolver().openFileDescriptor(aVar.d(), "r").getFileDescriptor())));
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader2.readLine();
                                        if (line == null) {
                                            break;
                                        } else {
                                            sb.append(line);
                                        }
                                    }
                                    Map<String, String> mapN = n(sb.toString());
                                    String strG = com.beetalk.sdk.t.a.s().g();
                                    String strD = com.beetalk.sdk.t.a.s().d();
                                    String str = mapN.get(strG);
                                    String str2 = mapN.get(strD);
                                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                                        com.beetalk.sdk.t.a.s().j(Long.parseLong(str), str2);
                                        com.beetalk.sdk.x.a.a("doMigrateGuest success", new Object[0]);
                                        try {
                                            k(0, uri.toString());
                                            try {
                                                bufferedReader2.close();
                                                return;
                                            } catch (IOException e) {
                                                com.beetalk.sdk.x.a.b(e);
                                                return;
                                            }
                                        } catch (IOException e2) {
                                            e = e2;
                                            z = true;
                                            try {
                                                try {
                                                    l("migrate IO: " + e.getMessage());
                                                    e.printStackTrace();
                                                    bufferedReader2.close();
                                                } catch (Throwable th) {
                                                    th = th;
                                                    bufferedReader = bufferedReader2;
                                                    if (bufferedReader != null) {
                                                        try {
                                                            bufferedReader.close();
                                                        } catch (IOException e3) {
                                                            com.beetalk.sdk.x.a.b(e3);
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                bufferedReader = bufferedReader2;
                                                l("migrate: " + e.getMessage());
                                                com.beetalk.sdk.x.a.b(e);
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e5) {
                                                        com.beetalk.sdk.x.a.b(e5);
                                                    }
                                                }
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            bufferedReader = bufferedReader2;
                                            z = true;
                                            l("migrate: " + e.getMessage());
                                            com.beetalk.sdk.x.a.b(e);
                                            if (bufferedReader != null) {
                                                bufferedReader.close();
                                            }
                                        }
                                    }
                                    com.beetalk.sdk.x.a.c("strUid or strPwd is null", new Object[0]);
                                    j(1);
                                    try {
                                        bufferedReader2.close();
                                        return;
                                    } catch (IOException e7) {
                                        com.beetalk.sdk.x.a.b(e7);
                                        return;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                }
                            } catch (Exception e9) {
                                e = e9;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                if (z) {
                    return;
                }
                j(1);
                return;
            }
            com.beetalk.sdk.x.a.c("documentFiles do not contain element", new Object[0]);
        }
        j(1);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0166 A[Catch: IOException -> 0x0135, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0135, blocks: (B:75:0x0166, B:60:0x0131), top: B:94:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:77:0x016b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void d(Uri uri) throws Throwable {
        BufferedReader bufferedReader;
        h.k.a.a aVar;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2;
        h.k.a.a aVarB = h.k.a.a.b(this, uri);
        boolean z = false;
        if (aVarB != null) {
            h.k.a.a[] aVarArrF = aVarB.f();
            String string = d.c(this).toString();
            int length = aVarArrF.length;
            int i2 = 0;
            while (true) {
                bufferedReader = null;
                bufferedWriter2 = null;
                bufferedWriter2 = null;
                bufferedWriter2 = null;
                bufferedReader = null;
                if (i2 >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrF[i2];
                com.beetalk.sdk.x.a.a("guestDatFile name is : " + aVar.c(), new Object[0]);
                if (aVar.e() && aVar.c() != null && aVar.c().contains(string)) {
                    break;
                } else {
                    i2++;
                }
            }
            try {
                if (aVar == null) {
                    aVarB.a("application/dat", e());
                    com.beetalk.sdk.x.a.c("guestFile does not exist.", new Object[0]);
                } else {
                    try {
                        FileDescriptor fileDescriptor = getContentResolver().openFileDescriptor(aVar.d(), "rwt").getFileDescriptor();
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileDescriptor)));
                        try {
                            try {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        sb.append(line);
                                    }
                                    l("reset IO: " + e.getMessage());
                                    e.printStackTrace();
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException e) {
                                        com.beetalk.sdk.x.a.b(e);
                                    }
                                    if (bufferedWriter2 != null) {
                                        bufferedWriter2.close();
                                    }
                                }
                                Map<String, String> mapN = n(sb.toString());
                                String strG = com.beetalk.sdk.t.a.s().g();
                                String strD = com.beetalk.sdk.t.a.s().d();
                                mapN.remove(strG);
                                mapN.remove(strD);
                                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDescriptor)));
                                try {
                                    try {
                                        bufferedWriter.write(h(mapN));
                                        bufferedWriter.flush();
                                        com.beetalk.sdk.x.a.a("doResetGuest success", new Object[0]);
                                        try {
                                            k(0, uri.toString());
                                            try {
                                                bufferedReader2.close();
                                            } catch (IOException e2) {
                                                com.beetalk.sdk.x.a.b(e2);
                                            }
                                            try {
                                                bufferedWriter.close();
                                                return;
                                            } catch (IOException e3) {
                                                com.beetalk.sdk.x.a.b(e3);
                                                return;
                                            }
                                        } catch (IOException e4) {
                                            e = e4;
                                            bufferedWriter2 = bufferedWriter;
                                            z = true;
                                        } catch (Exception e5) {
                                            e = e5;
                                            bufferedReader = bufferedReader2;
                                            z = true;
                                            try {
                                                l("reset: " + e.getMessage());
                                                com.beetalk.sdk.x.a.b(e);
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e6) {
                                                        com.beetalk.sdk.x.a.b(e6);
                                                    }
                                                }
                                                if (bufferedWriter != null) {
                                                    bufferedWriter.close();
                                                }
                                                if (z) {
                                                    return;
                                                }
                                                j(1);
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e7) {
                                                        com.beetalk.sdk.x.a.b(e7);
                                                    }
                                                }
                                                if (bufferedWriter != null) {
                                                    throw th;
                                                }
                                                try {
                                                    bufferedWriter.close();
                                                    throw th;
                                                } catch (IOException e8) {
                                                    com.beetalk.sdk.x.a.b(e8);
                                                    throw th;
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedReader = bufferedReader2;
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        if (bufferedWriter != null) {
                                            throw th;
                                        }
                                        bufferedWriter.close();
                                        throw th;
                                    }
                                } catch (IOException e9) {
                                    e = e9;
                                    bufferedWriter2 = bufferedWriter;
                                } catch (Exception e10) {
                                    e = e10;
                                    bufferedReader = bufferedReader2;
                                    l("reset: " + e.getMessage());
                                    com.beetalk.sdk.x.a.b(e);
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (bufferedWriter != null) {
                                        bufferedWriter.close();
                                    }
                                    if (z) {
                                        j(1);
                                        return;
                                    }
                                    return;
                                }
                            } catch (IOException e11) {
                                e = e11;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            bufferedWriter = bufferedWriter2;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedWriter = bufferedWriter2;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        bufferedWriter = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedWriter = null;
                    }
                }
            } catch (IOException e14) {
                com.beetalk.sdk.x.a.b(e14);
            }
            if (z) {
                j(1);
                return;
            }
            return;
        }
        com.beetalk.sdk.x.a.c("documentFile is null", new Object[0]);
        j(1);
    }

    private String e() {
        Integer numC = d.c(g.s());
        if (numC.intValue() == -1 || numC.intValue() == 100006) {
            return "guest.dat";
        }
        return "guest" + d.c(g.s()) + ".dat";
    }

    private String f() {
        return getPreferences(0).getString("last_guest_uri", null);
    }

    public static Intent g() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse("content://com.android.externalstorage.documents/document/primary:com.garena.msdk"));
        return intent;
    }

    private String h(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("guest_account_info", new JSONObject(map));
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
        }
        return jSONObject.toString();
    }

    private void i() {
        try {
            startActivityForResult(g(), FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF);
        } catch (ActivityNotFoundException e) {
            l("request: " + e.getMessage());
            finish();
        }
    }

    private void j(int i2) {
        k(i2, null);
    }

    private void k(int i2, String str) {
        Intent intent = new Intent();
        intent.putExtra("KEY_SAF_PERMISSION_RET", i2);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("KEY_SAF_REQ_URI", str);
        }
        com.beetalk.sdk.x.a.a("@MigrateGuestActivity.setActivityResult: " + i2, new Object[0]);
        setResult(-1, intent);
    }

    private void l(String str) {
        Intent intent = new Intent();
        intent.putExtra("KEY_SAF_PERMISSION_RET", 3);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("KEY_SAF_EXCEPTION", str);
        }
        com.beetalk.sdk.x.a.a("@MigrateGuestActivity.setExceptionResult: " + str, new Object[0]);
        setResult(-1, intent);
    }

    private void m(String str) {
        getPreferences(0).edit().putString("last_guest_uri", str).commit();
    }

    private Map<String, String> n(String str) {
        HashMap map = new HashMap();
        if (str != null && str.length() > 0) {
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
        }
        return map;
    }

    private void o() throws Throwable {
        Uri uri = Uri.parse(f());
        com.beetalk.sdk.x.a.a("workWithPermission: " + uri.toString(), new Object[0]);
        int i2 = this.a;
        if (i2 == 1001) {
            c(uri);
            return;
        }
        if (i2 == 2001 || i2 == 3001) {
            b(uri);
        } else {
            if (i2 != 4001) {
                return;
            }
            d(uri);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) throws Throwable {
        super.onActivityResult(i2, i3, intent);
        if (1000 == i2 && i3 == -1 && intent != null) {
            Uri data = intent.getData();
            if (data == null) {
                com.beetalk.sdk.x.a.c("treeUri is null", new Object[0]);
            } else {
                getContentResolver().takePersistableUriPermission(data, (intent.getFlags() & 1) | 2);
                m(data.toString());
                o();
            }
            finish();
        }
        com.beetalk.sdk.x.a.c("onActivityResult do not grant SAF permission from user", new Object[0]);
        j(2);
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            this.a = intent.getIntExtra("RequestCode", 0);
        }
        if (this.a == 0) {
            l("onCreate no intent");
        } else {
            if (!a()) {
                int i2 = this.a;
                if (i2 != 3001 && i2 != 4001) {
                    i();
                    return;
                } else {
                    j(2);
                    finish();
                    return;
                }
            }
            o();
        }
        finish();
    }
}
