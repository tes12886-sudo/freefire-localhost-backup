package j.c.a.e.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static List<Integer> a() {
        ArrayList arrayList = new ArrayList();
        for (String str : b.a().c("ACK_MSG_LIST", "").split(";")) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            }
        }
        return arrayList;
    }

    public static String b() {
        return b.a().c("REGIONAL_SERVER_ADDRESS", "gpushsg1.beetalkmobile.com:10086");
    }

    public static String c() {
        return b.a().c("CONNECTION_ADDRESS", "");
    }

    public static long d() {
        return b.a().b("CONNECTION_ID", -1L);
    }

    public static long e(Context context) {
        return context.getSharedPreferences("SERVICE_PREF", 0).getLong("DEVICE_ID", -1L);
    }

    public static String f(Context context) {
        long j2 = context.getSharedPreferences("SERVICE_PREF", 0).getLong("DEVICE_ID", -1L);
        return j2 <= 0 ? "" : String.valueOf(j2);
    }

    public static long g() {
        return b.a().b("LAST_REGION_REFRESH_TIME", 0L);
    }

    public static void h(List<Integer> list) {
        StringBuilder sb = new StringBuilder("");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().intValue());
            sb.append(";");
        }
        b.a().e("ACK_MSG_LIST", sb.toString());
    }

    public static void i(String str) {
        b.a().e("CONNECTION_ADDRESS", str);
    }

    public static void j(long j2) {
        b.a().d("CONNECTION_ID", j2);
    }

    public static void k(String str) {
        b.a().e("REGIONAL_SERVER_ADDRESS", str);
    }

    public static void l(Context context, long j2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("SERVICE_PREF", 0).edit();
        editorEdit.putLong("DEVICE_ID", j2);
        editorEdit.commit();
    }

    public static void m(long j2) {
        b.a().d("LAST_REGION_REFRESH_TIME", j2);
    }
}
