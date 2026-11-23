package com.beetalk.sdk.x;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private static final char[] a;

    static {
        StringBuilder sb = new StringBuilder();
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            sb.append(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            sb.append(c2);
        }
        for (int i2 = 0; i2 < 10; i2++) {
            sb.append("!@#$%^&*()".charAt(i2));
        }
        a = sb.toString().toCharArray();
    }

    public static String a(String str, String str2) {
        return b(str2, str, "HMACSHA256");
    }

    private static String b(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), str3);
            Mac mac = Mac.getInstance(str3);
            mac.init(secretKeySpec);
            byte[] bArrDoFinal = mac.doFinal(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static String c() {
        return e.a(e(d(64)));
    }

    public static String d(int i2) {
        char[] cArr = new char[i2];
        Random random = new Random();
        for (int i3 = 0; i3 < i2; i3++) {
            char[] cArr2 = a;
            cArr[i3] = cArr2[random.nextInt(cArr2.length)];
        }
        return new String(cArr);
    }

    public static byte[] e(String str) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String f(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            a.b(e);
            return null;
        }
    }
}
