package com.appff.haptic;

import android.os.Build;
import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class f implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ FFHapticUtils c;

    f(FFHapticUtils fFHapticUtils, String str, int i2) {
        this.c = fFHapticUtils;
        this.a = str;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorDup;
        VibrationEffect vibrationEffect;
        Vibrator vibrator;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(this.a);
                    try {
                        try {
                            int iAvailable = fileInputStream2.available();
                            byte[] bArr = new byte[iAvailable];
                            fileInputStream2.read(bArr);
                            Log.d("FFHapticUtils", "duration:" + this.c.getRTPStreamDuration(bArr));
                            this.c.freeSharedMemory();
                            this.c.mf = new MemoryFile("run-act", iAvailable);
                            this.c.mf.writeBytes(bArr, 0, 0, iAvailable);
                            Log.d("FFHapticUtils", "memory file buffer length:" + iAvailable);
                            try {
                                parcelFileDescriptorDup = ParcelFileDescriptor.dup((FileDescriptor) MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]).invoke(this.c.mf, new Object[0]));
                            } catch (Exception e) {
                                Log.w("FFHapticUtils", "Failed to get file descriptor.");
                                e.printStackTrace();
                                parcelFileDescriptorDup = null;
                            }
                            if (parcelFileDescriptorDup == null) {
                                Log.e("FFHapticUtils", "Failed to get file descriptor.");
                                try {
                                    fileInputStream2.close();
                                    return;
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            }
                            try {
                                int i2 = Build.VERSION.SDK_INT;
                                if (i2 < 29) {
                                    if (i2 >= 26) {
                                        vibrationEffect = (VibrationEffect) this.c.clazzVibrationEffect.getMethod("createStream", FileDescriptor.class, String.class, Integer.TYPE).invoke(null, parcelFileDescriptorDup.getFileDescriptor(), this.a, Integer.valueOf(this.b));
                                        vibrator = this.c.vibrator;
                                    } else {
                                        Log.e("FFHapticUtils", "The system is low than 26,does not support FF!!");
                                    }
                                    fileInputStream2.close();
                                }
                                vibrationEffect = (VibrationEffect) this.c.clazzVibrationEffect.getMethod("createStream", ParcelFileDescriptor.class, String.class, Integer.TYPE).invoke(null, parcelFileDescriptorDup, this.a, Integer.valueOf(this.b));
                                vibrator = this.c.vibrator;
                                vibrator.vibrate(vibrationEffect);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                Log.w("FFHapticUtils", "The system doesn't integrate FF software");
                            }
                            fileInputStream2.close();
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream == null) {
                        } else {
                            fileInputStream.close();
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }
}
