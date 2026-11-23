package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.internal.ac;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public class AFKeystoreWrapper {
    private Context AFInAppEventType;
    public KeyStore AFKeystoreWrapper;
    public final Object AFInAppEventParameterName = new Object();
    public String valueOf = "";
    public int values = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFInAppEventType = context;
        AFLogger.valueOf("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFKeystoreWrapper = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.valueOf("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    private static boolean valueOf(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String AFInAppEventParameterName() {
        String str;
        synchronized (this.AFInAppEventParameterName) {
            str = this.valueOf;
        }
        return str;
    }

    public final String AFInAppEventType() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.AFInAppEventParameterName) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.valueOf);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.values);
        }
        return sb.toString();
    }

    public final void AFKeystoreWrapper(String str) {
        AFLogger.valueOf("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpecBuild = null;
            synchronized (this.AFInAppEventParameterName) {
                if (this.AFKeystoreWrapper.containsAlias(str)) {
                    AFLogger.valueOf("Alias already exists: ".concat(String.valueOf(str)));
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23) {
                        algorithmParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    } else if (i2 >= 18 && !ac.AFInAppEventParameterName()) {
                        algorithmParameterSpecBuild = new KeyPairGeneratorSpec.Builder(this.AFInAppEventType).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(algorithmParameterSpecBuild);
                    keyPairGenerator.generateKeyPair();
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.valueOf(sb.toString(), th);
        }
    }

    public final int valueOf() {
        int i2;
        synchronized (this.AFInAppEventParameterName) {
            i2 = this.values;
        }
        return i2;
    }

    public final boolean values() {
        boolean z;
        synchronized (this.AFInAppEventParameterName) {
            KeyStore keyStore = this.AFKeystoreWrapper;
            z = true;
            if (keyStore != null) {
                try {
                    Enumeration<String> enumerationAliases = keyStore.aliases();
                    while (enumerationAliases.hasMoreElements()) {
                        String strNextElement = enumerationAliases.nextElement();
                        if (strNextElement != null && valueOf(strNextElement)) {
                            String[] strArrSplit = strNextElement.split(",");
                            if (strArrSplit.length == 3) {
                                AFLogger.valueOf("Found a matching AF key with alias:\n".concat(String.valueOf(strNextElement)));
                                try {
                                    String[] strArrSplit2 = strArrSplit[1].trim().split("=");
                                    String[] strArrSplit3 = strArrSplit[2].trim().split("=");
                                    if (strArrSplit2.length == 2 && strArrSplit3.length == 2) {
                                        this.valueOf = strArrSplit2[1].trim();
                                        this.values = Integer.parseInt(strArrSplit3[1].trim());
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    StringBuilder sb = new StringBuilder("Couldn't list KeyStore Aliases: ");
                                    sb.append(th.getClass().getName());
                                    AFLogger.valueOf(sb.toString(), th);
                                }
                            }
                        }
                        StringBuilder sb2 = new StringBuilder("Couldn't list KeyStore Aliases: ");
                        sb2.append(th.getClass().getName());
                        AFLogger.valueOf(sb2.toString(), th);
                    }
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }
}
