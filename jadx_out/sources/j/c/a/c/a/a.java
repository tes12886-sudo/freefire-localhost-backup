package j.c.a.c.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static void a(StringBuilder sb, String str, String str2, boolean z) {
        if (sb == null || TextUtils.isEmpty(str)) {
            return;
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append("=");
        sb.append(TextUtils.isEmpty(str2) ? "" : URLEncoder.encode(str2, "UTF-8"));
        if (z) {
            return;
        }
        sb.append("&");
    }

    public static boolean b(Context context, String str, String str2, String str3, String str4) throws IOException {
        String strC = e.c();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        StringBuilder sb = new StringBuilder();
        a(sb, "app_id", str, false);
        a(sb, "nonce", strC, false);
        a(sb, "timestamp", strValueOf, false);
        a(sb, "device_id", str3, false);
        a(sb, "tags", str4, true);
        JSONObject jSONObjectC = c(str2, c.b(), sb.toString());
        if (jSONObjectC != null && jSONObjectC.has("result") && jSONObjectC.getInt("result") == 0) {
            if (c.c) {
                Log.i(c.a, "delete tags success");
            }
            return true;
        }
        if (c.c) {
            Log.i(c.a, "delete tags failed");
        }
        return false;
    }

    private static JSONObject c(String str, String str2, String str3) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Authorization", "Signature " + e.d(str, str2, str3));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str3);
        bufferedWriter.flush();
        bufferedWriter.close();
        outputStream.close();
        if (httpURLConnection.getResponseCode() == 200) {
            return d(httpURLConnection.getInputStream());
        }
        return null;
    }

    private static JSONObject d(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
        }
        bufferedReader.close();
        if (c.c) {
            Log.d(c.a, "remote response: " + ((Object) sb));
        }
        return new JSONObject(sb.toString());
    }

    public static void e(Context context, String str, String str2, String str3, String str4, String str5, int i2, String str6) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) b.class);
        intent.putExtra("app_id", str);
        intent.putExtra("app_key", str2);
        intent.putExtra("account", str3);
        intent.putExtra("service_gcm_send_id", str5);
        intent.putExtra("service", i2);
        intent.putExtra("device_id", str6);
        if (!TextUtils.isEmpty(str4)) {
            intent.putExtra(j.c.a.a.EXTRA_TOKEN, str4);
        }
        context.startService(intent);
    }

    public static boolean f(Context context, String str, String str2, String str3, String str4) throws IOException {
        String strC = e.c();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        StringBuilder sb = new StringBuilder();
        a(sb, "app_id", str, false);
        a(sb, "nonce", strC, false);
        a(sb, "timestamp", strValueOf, false);
        a(sb, "device_id", str3, false);
        a(sb, "tags", str4, true);
        JSONObject jSONObjectC = c(str2, c.d(), sb.toString());
        if (jSONObjectC != null && jSONObjectC.has("result") && jSONObjectC.getInt("result") == 0) {
            if (c.c) {
                Log.i(c.a, "set tags success");
            }
            return true;
        }
        if (c.c) {
            Log.i(c.a, "set tags failed");
        }
        return false;
    }

    public static boolean g(Context context, String str, String str2, String str3, String str4, int i2, String str5) throws IOException {
        String strC = e.c();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String strE = e.e(str4.getBytes("UTF-8"));
        String strValueOf2 = String.valueOf(i2);
        StringBuilder sb = new StringBuilder();
        a(sb, "app_id", str, false);
        a(sb, "nonce", strC, false);
        a(sb, "timestamp", strValueOf, false);
        a(sb, "device_type", "2", false);
        a(sb, "device_id", str5, false);
        a(sb, "notify_type", strValueOf2, false);
        a(sb, "notify_token", strE, false);
        a(sb, "account", str3, true);
        JSONObject jSONObjectC = c(str2, c.c(), sb.toString());
        if (jSONObjectC != null && jSONObjectC.has("result") && jSONObjectC.getInt("result") == 0) {
            if (c.c) {
                Log.i(c.a, "push token registration completed");
            }
            return true;
        }
        if (c.c) {
            Log.i(c.a, "push token registration failed");
        }
        return false;
    }
}
