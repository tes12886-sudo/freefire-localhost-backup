package com.freefire.rootdetect;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.hardware.SensorManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RootCheck {
    public static String GetSensorInfo(Activity activity) {
        StringBuilder sb = new StringBuilder();
        SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
        if (sensorManager.getDefaultSensor(5) == null) {
            sb.append("0");
        } else {
            sb.append("1");
        }
        if (sensorManager.getDefaultSensor(6) == null) {
            sb.append("0");
        } else {
            sb.append("1");
        }
        if (sensorManager.getDefaultSensor(8) == null) {
            sb.append("0");
        } else {
            sb.append("1");
        }
        return sb.toString();
    }

    public static synchronized boolean checkAccessRootData() {
        try {
            writeFile("/data/su_test", "test_ok").booleanValue();
            return "test_ok".equals(readFile("/data/su_test"));
        } catch (Exception unused) {
            return false;
        }
    }

    public static synchronized boolean checkBusybox() {
        try {
        } catch (Exception unused) {
            return false;
        }
        return executeCommand(new String[]{"busybox", "df"}) != null;
    }

    public static boolean checkDeviceDebuggable() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public static synchronized boolean checkGetRootAuth() {
        Process processExec;
        DataOutputStream dataOutputStream = null;
        try {
            processExec = Runtime.getRuntime().exec("su");
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                try {
                    dataOutputStream2.writeBytes("exit\n");
                    dataOutputStream2.flush();
                    if (processExec.waitFor() == 0) {
                        try {
                            dataOutputStream2.close();
                            processExec.destroy();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return true;
                    }
                    try {
                        dataOutputStream2.close();
                        processExec.destroy();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return false;
                } catch (Exception unused) {
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            return false;
                        }
                    }
                    processExec.destroy();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            throw th;
                        }
                    }
                    processExec.destroy();
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            processExec = null;
        } catch (Throwable th3) {
            th = th3;
            processExec = null;
        }
        throw th;
    }

    public static boolean checkIsRealPhone() {
        String cpuInfo = readCpuInfo();
        return cpuInfo.contains("intel") || cpuInfo.contains("amd");
    }

    public static boolean checkRootPathSU() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                if (new File(strArr[i2] + "su").exists()) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean checkRootWhichSU() {
        return executeCommand(new String[]{"/system/xbin/which", "su"}) != null;
    }

    public static boolean checkSuperuserApk() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static ArrayList<String> executeCommand(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Process processExec = Runtime.getRuntime().exec(strArr);
            new BufferedWriter(new OutputStreamWriter(processExec.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    arrayList.add(line);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String readCpuInfo() {
        try {
            Process processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), "utf-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return stringBuffer.toString().toLowerCase();
                }
                stringBuffer.append(line);
            }
        } catch (IOException unused) {
            return "";
        }
    }

    public static String readFile(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    return new String(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Boolean writeFile(String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public String getProvidersName(TelephonyManager telephonyManager, Activity activity) {
        return null;
    }

    public boolean hasBlueTooth() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return (defaultAdapter == null || TextUtils.isEmpty(defaultAdapter.getName())) ? false : true;
    }
}
