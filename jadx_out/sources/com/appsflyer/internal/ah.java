package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appff.haptic.base.Utils;
import com.appsflyer.AFLogger;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class ah implements Runnable {
    private final bu values;

    public ah() {
    }

    public ah(bu buVar) {
        this.values = buVar;
    }

    public static String AFInAppEventParameterName(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return values(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.valueOf(sb.toString(), e);
            return null;
        }
    }

    private static String AFInAppEventParameterName(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b : bArr) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    public static String AFInAppEventType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.valueOf(sb.toString(), e);
            return null;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.valueOf(sb.toString(), e);
            return null;
        }
    }

    public static String valueOf(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            return values(mac.doFinal(str.getBytes())).toLowerCase();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.values(e.getMessage(), e);
            return e.getMessage();
        }
    }

    private static String values(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public HttpURLConnection AFInAppEventParameterName() {
        HttpURLConnection httpURLConnection;
        String strAFInAppEventParameterName = "";
        bu buVar = this.values;
        String str = buVar.onAppOpenAttributionNative;
        String strAFVersionDeclaration = buVar.AFVersionDeclaration();
        boolean level = this.values.getLevel();
        boolean zInit = this.values.init();
        boolean zAFLogger$LogLevel = this.values.AFLogger$LogLevel();
        boolean zAFInAppEventType = this.values.AFInAppEventType();
        byte[] bytes = strAFVersionDeclaration.getBytes();
        HttpURLConnection httpURLConnection2 = null;
        if (level) {
            return null;
        }
        boolean z = false;
        try {
            URL url = new URL(str);
            if (zAFLogger$LogLevel) {
                aj.AFInAppEventParameterName().AFInAppEventType("server_request", url.toString(), strAFVersionDeclaration);
                int length = strAFVersionDeclaration.getBytes("UTF-8").length;
                StringBuilder sb = new StringBuilder("call = ");
                sb.append(url);
                sb.append("; size = ");
                sb.append(length);
                sb.append(" byte");
                sb.append(length > 1 ? "s" : "");
                sb.append("; body = ");
                sb.append(strAFVersionDeclaration);
                al.values(sb.toString());
            }
            TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setReadTimeout(Utils.MAX_DURATION);
                httpURLConnection.setConnectTimeout(Utils.MAX_DURATION);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", zAFInAppEventType ? "application/octet-stream" : "application/json");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                if (zAFInAppEventType) {
                    try {
                        try {
                            bytes = (byte[]) ((Class) d.values((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 30710), 24 - TextUtils.indexOf("", ""), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getDeclaredMethod("valueOf", byte[].class).invoke(((Class) d.values((char) (30709 - ExpandableListView.getPackedPositionChild(0L)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, Color.green(0) + 24)).getMethod("AFKeystoreWrapper", String.class).invoke(null, this.values.AppsFlyer2dXConversionCallback), bytes);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                outputStream.write(bytes);
                outputStream.close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (zInit) {
                    ai.valueOf();
                    strAFInAppEventParameterName = ai.AFInAppEventParameterName(httpURLConnection);
                }
                if (zAFLogger$LogLevel) {
                    aj.AFInAppEventParameterName().AFInAppEventType("server_response", url.toString(), String.valueOf(responseCode), strAFInAppEventParameterName);
                }
                if (responseCode == 200) {
                    AFLogger.valueOf("Status 200 ok");
                } else {
                    z = true;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                AFLogger.valueOf("Error while calling ".concat(String.valueOf(str)), th);
                httpURLConnection = httpURLConnection2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        StringBuilder sb2 = new StringBuilder("Connection ");
        sb2.append(z ? "error" : "call succeeded");
        sb2.append(": ");
        sb2.append(strAFInAppEventParameterName);
        AFLogger.valueOf(sb2.toString());
        return httpURLConnection;
    }

    @Override // java.lang.Runnable
    public void run() {
        HttpURLConnection httpURLConnectionAFInAppEventParameterName = AFInAppEventParameterName();
        if (httpURLConnectionAFInAppEventParameterName != null) {
            httpURLConnectionAFInAppEventParameterName.disconnect();
        }
    }
}
