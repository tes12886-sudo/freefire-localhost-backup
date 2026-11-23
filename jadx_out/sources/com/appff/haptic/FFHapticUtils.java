package com.appff.haptic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.MemoryFile;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import com.appff.haptic.base.ApiInfo;
import com.appff.haptic.base.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class FFHapticUtils extends ApiInfo {
    private static final int ACT_SAMPLE_RATE_24K = 1;
    private static final int ACT_SAMPLE_RATE_48K = 0;
    private static final int MAX_SCALE = 100;
    private static final int MAX_STRENGTH_VALUE = 255;
    private static final String SUFFIX_ACT = ".act";
    private static final String TAG = "FFHapticUtils";
    private static final ExecutorService mExcutor = Executors.newSingleThreadExecutor();

    @SuppressLint({"StaticFieldLeak"})
    private static FFHapticUtils sInstance;
    private Class clazzVibrationEffect;
    private Context mContext;
    private com.appff.haptic.base.c mNonFFLoopThread;
    private Vibrator vibrator;
    private boolean mFFEnable = true;
    private boolean mFFApiSupport = false;
    private boolean mHapticPlayerApiSupport = false;
    private MemoryFile mf = null;
    private final int mFFMajorVersion = 0;
    private final boolean DEBUG = true;

    @SuppressLint({"PrivateApi"})
    private FFHapticUtils() {
        try {
            this.clazzVibrationEffect = Class.forName("android.os.RichTapVibrationEffect");
        } catch (ClassNotFoundException unused) {
            Log.i(TAG, "failed to reflect class: ...VibrationEffect!");
        }
        if (this.clazzVibrationEffect == null) {
            try {
                this.clazzVibrationEffect = Class.forName("android.os.VibrationEffect");
            } catch (ClassNotFoundException unused2) {
                Log.i(TAG, "failed to reflect class:VibrationEffect!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void freeSharedMemory() {
        if (this.mf != null) {
            Log.d(TAG, "freeSharedMemory, length:" + this.mf.length());
            this.mf.close();
            this.mf = null;
        }
    }

    public static FFHapticUtils getInstance() {
        if (sInstance == null) {
            synchronized (FFHapticUtils.class) {
                if (sInstance == null) {
                    sInstance = new FFHapticUtils();
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRTPStreamDuration(byte[] bArr) {
        float f;
        float f2;
        byte b = bArr[5];
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 8, bArr2, 0, 4);
        int iByteArrayToLong = (int) Utils.byteArrayToLong(bArr2);
        if (b == 0) {
            f = iByteArrayToLong * 1.0f;
            f2 = 48.0f;
        } else {
            if (b != 1) {
                Log.e(TAG, "RTP sampleRate is invalid");
                return -1;
            }
            f = iByteArrayToLong * 1.0f;
            f2 = 24.0f;
        }
        double d = f / f2;
        Double.isNaN(d);
        int i2 = (int) (d + 0.5d);
        Log.d(TAG, "from byte,RTP data duration(ms) = " + i2 + ", sampleRate:" + ((int) b) + ", dataLength:" + Arrays.toString(bArr2));
        return i2;
    }

    private void playEnvelopeOnNonFF(int i2, int i3) {
        Log.w(TAG, "The system doesn't integrate FF software");
        if (!this.mFFEnable) {
            this.vibrator.cancel();
            this.mNonFFLoopThread.b();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.vibrator.vibrate(VibrationEffect.createOneShot(i2, Math.max(1, Math.min(i3, 255))));
        } else {
            this.vibrator.vibrate(i2);
        }
    }

    private void playExtPreBakedOnNonFF(int i2, int i3) {
        Vibrator vibrator = this.vibrator;
        if (vibrator == null) {
            Log.e(TAG, "Please call the init method");
            return;
        }
        if (!this.mFFEnable) {
            vibrator.cancel();
            this.mNonFFLoopThread.b();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.vibrator.vibrate(VibrationEffect.createOneShot(i2, Math.max(1, Math.min(i3, 255))));
        } else {
            this.vibrator.vibrate(i2);
        }
    }

    private void playHePatternOnNonFF(String str, int i2) {
        Log.w(TAG, "The system doesn't integrate FF software");
        com.appff.haptic.base.d.a(this.mContext).b(str, 1, 0, i2, 0);
    }

    private void playStreamOnNonFF(String str, int i2) throws Throwable {
        float f;
        float f2;
        Log.w(TAG, "The system doesn't integrate FF software");
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        fileInputStream2.read(new byte[5]);
                        int i3 = fileInputStream2.read();
                        fileInputStream2.read(new byte[2]);
                        byte[] bArr = new byte[4];
                        fileInputStream2.read(bArr);
                        int iByteArrayToLong = (int) Utils.byteArrayToLong(bArr);
                        Log.d(TAG, "data point number = " + iByteArrayToLong);
                        byte[] bArr2 = new byte[4];
                        fileInputStream2.read(bArr2);
                        int iByteArrayToLong2 = (int) Utils.byteArrayToLong(bArr2);
                        if (iByteArrayToLong2 == 0) {
                            try {
                                fileInputStream2.close();
                                return;
                            } catch (IOException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        Log.d(TAG, "google sin count = " + iByteArrayToLong2);
                        fileInputStream2.read(new byte[16]);
                        long[] jArr = new long[iByteArrayToLong2];
                        int[] iArr = new int[iByteArrayToLong2];
                        fileInputStream2.read(new byte[iByteArrayToLong]);
                        byte[] bArr3 = new byte[4];
                        fileInputStream2.read(bArr3);
                        if (Utils.byteArrayToLong(bArr3) != 538968870) {
                            try {
                                fileInputStream2.close();
                                return;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                        for (int i4 = 0; i4 < iByteArrayToLong2; i4++) {
                            byte[] bArr4 = new byte[2];
                            fileInputStream2.read(bArr4);
                            Log.d(TAG, "time[" + i4 + "] = " + Utils.byteArrayToLong(bArr4));
                            jArr[i4] = Utils.byteArrayToLong(bArr4);
                            byte[] bArr5 = new byte[2];
                            fileInputStream2.read(bArr5);
                            Log.d(TAG, "amplitude[" + i4 + "] = " + Utils.byteArrayToLong(bArr5));
                            iArr[i4] = (int) ((Utils.byteArrayToLong(bArr5) * ((long) i2)) / 255);
                        }
                        if (i3 == 0) {
                            f = iByteArrayToLong * 1.0f;
                            f2 = 48.0f;
                        } else {
                            if (i3 != 1) {
                                Log.e(TAG, "rtp sampleRate is invalid");
                                try {
                                    fileInputStream2.close();
                                    return;
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                    return;
                                }
                            }
                            f = iByteArrayToLong * 1.0f;
                            f2 = 24.0f;
                        }
                        double d = f / f2;
                        Double.isNaN(d);
                        Log.d(TAG, "rtp data duration(ms) = " + ((int) (d + 0.5d)));
                        if (!this.mFFEnable) {
                            this.vibrator.cancel();
                            this.mNonFFLoopThread.b();
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            this.vibrator.vibrate(VibrationEffect.createWaveform(jArr, iArr, -1));
                        } else {
                            this.vibrator.vibrate(jArr, -1);
                        }
                        fileInputStream2.close();
                    } catch (Exception e4) {
                        e = e4;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public FFHapticUtils init(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context shouldn't be null");
        }
        Log.d(TAG, "init ,version:" + ApiInfo.VERSION_NAME + " versionCode:" + ApiInfo.VERSION_CODE);
        this.vibrator = (Vibrator) context.getSystemService("vibrator");
        this.mContext = context;
        useNonFF(false);
        return sInstance;
    }

    public boolean isNonFFMode() {
        return (supportFF() && this.mFFEnable) ? false : true;
    }

    public void playEnvelope(int[] iArr, float[] fArr, int[] iArr2, boolean z) {
        playEnvelope(iArr, fArr, iArr2, z, 255);
    }

    public void playEnvelope(int[] iArr, float[] fArr, int[] iArr2, boolean z, int i2) {
        if (this.vibrator == null) {
            Log.e(TAG, "Please call the init method");
            return;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            if (iArr[i3] < 0) {
                throw new IllegalArgumentException("relative time can not be negative");
            }
            if (fArr[i3] < 0.0f) {
                throw new IllegalArgumentException("scale can not be negative");
            }
            if (iArr2[i3] < 0) {
                throw new IllegalArgumentException("freq must be positive");
            }
        }
        if (i2 < -1 || i2 == 0 || i2 > 255) {
            throw new IllegalArgumentException("amplitude must either be DEFAULT_AMPLITUDE, or between 1 and 255 inclusive (amplitude=" + i2 + ")");
        }
        int[] iArr3 = new int[fArr.length];
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, 0, 4);
        int i4 = iArrCopyOfRange[3];
        if (!this.mFFEnable || (!this.mFFApiSupport && this.mHapticPlayerApiSupport)) {
            playEnvelopeOnNonFF(i4, (int) (Math.max(fArr[1], fArr[2]) * i2));
            return;
        }
        for (int i5 = 0; i5 < fArr.length; i5++) {
            iArr3[i5] = (int) (fArr[i5] * 100.0f);
        }
        int[] iArrCopyOfRange2 = Arrays.copyOfRange(iArr2, 0, 4);
        if (!this.mFFApiSupport) {
            Log.e(TAG, "FF is enabled ,no api support playExtPreBakedForHe");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                mExcutor.execute(new e(this, iArrCopyOfRange, iArr3, iArrCopyOfRange2, z, i2));
            } else {
                Log.e(TAG, "The system is low than 26,does not support FF!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(TAG, "The system doesn't integrate FF software");
        }
    }

    public void playExtPreBaked(int i2, int i3) {
        boolean z;
        if (this.vibrator == null) {
            Log.e(TAG, "Please call the init method");
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Wrong parameter effect is null!");
        }
        if (i3 < 1 || i3 > 100) {
            throw new IllegalArgumentException("Wrong parameter {strength=" + i3 + "}, which should be between 1 and 100 included!");
        }
        if (!this.mFFEnable || (!(z = this.mFFApiSupport) && this.mHapticPlayerApiSupport)) {
            playExtPreBakedOnNonFF(65, (i3 * 255) / 100);
            return;
        }
        if (!z) {
            Log.e(TAG, "FF is enabled ,no api support playExtPreBaked");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                mExcutor.execute(new b(this, i2, i3));
            } else {
                Log.e(TAG, "The system is low than 26,does not support FF!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(TAG, "The system doesn't integrate FF software");
        }
    }

    public void playExtPreBakedForHe(int i2, int i3) {
        if (i2 < 0 || i2 > 100) {
            throw new IllegalArgumentException("Wrong parameter {intensity:" + i2 + "}, which should be between [1, 100]!");
        }
        if (i3 < 0 || i3 > 100) {
            throw new IllegalArgumentException("Wrong parameter {freq:" + i3 + "}, which should be between [1, 100]!");
        }
        if (!this.mFFEnable) {
            playExtPreBakedOnNonFF(com.appff.haptic.base.d.a(i2, i3), i2);
            return;
        }
        if (this.mFFApiSupport) {
            mExcutor.execute(new d(this, i2, i3));
        } else if (this.mHapticPlayerApiSupport) {
            l.a(Utils.getTransientJsonString(i2, i3), 1);
        } else {
            Log.e(TAG, "FF is enabled ,no api support playExtPreBakedForHe");
        }
    }

    public void playOneShot(long j2, int i2) {
        if (this.vibrator == null) {
            Log.e(TAG, "Please call the init method");
            return;
        }
        Log.d(TAG, "playOneShot amplitude:" + i2);
        if (!this.mFFEnable) {
            this.vibrator.cancel();
            this.mNonFFLoopThread.b();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.vibrator.vibrate(VibrationEffect.createOneShot(j2, i2));
        } else {
            this.vibrator.vibrate(j2);
        }
    }

    public void playPattern(File file, int i2) {
        playPattern(file, i2, 255);
    }

    public void playPattern(File file, int i2, int i3) {
        String str;
        if (this.vibrator == null) {
            Log.e(TAG, "Please call the init method");
            return;
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("Wrong parameter {loop: " + i2 + "} less than 1!");
        }
        if (!Utils.validatePath(file.getPath(), Utils.SUFFIX_HE)) {
            throw new IllegalArgumentException("Wrong parameter {patternFile: " + file.getPath() + "} doesn't exist or has wrong file format!");
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    sb.append(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!Utils.fileMatchSuffix(file.getPath(), Utils.SUFFIX_HE)) {
            str = "Input file is not he format!!";
        } else if (!this.mFFEnable) {
            stop();
            this.mNonFFLoopThread.a(new com.appff.haptic.base.b(sb.toString(), i2, 0, i3, 0));
            return;
        } else if (this.mFFApiSupport) {
            mExcutor.execute(new g(this, sb, i2, i3));
            return;
        } else {
            if (this.mHapticPlayerApiSupport) {
                l.a(file, i2, 0, i3, 0);
                return;
            }
            str = "no api support playPattern";
        }
        Log.e(TAG, str);
    }

    public void playPattern(File file, int i2, int i3, int i4, int i5) {
        String str;
        if (this.vibrator == null) {
            Log.e(TAG, "Please call the init method");
            return;
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("Wrong parameter {loop: " + i2 + "} less than 1!");
        }
        if (!Utils.validatePath(file.getPath(), Utils.SUFFIX_HE)) {
            throw new IllegalArgumentException("Wrong parameter {patternFile: " + file.getPath() + "} doesn't exist or has wrong file format!");
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    sb.append(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!Utils.fileMatchSuffix(file.getPath(), Utils.SUFFIX_HE)) {
            str = "Input file is not he format!!";
        } else if (!this.mFFEnable) {
            stop();
            this.mNonFFLoopThread.a(new com.appff.haptic.base.b(sb.toString(), i2, i3, i4, i5));
            return;
        } else if (this.mFFApiSupport) {
            mExcutor.execute(new h(this, sb, i2, i3, i4, i5));
            return;
        } else {
            if (this.mHapticPlayerApiSupport) {
                l.a(file, i2, i3, i4, i5);
                return;
            }
            str = "no api support playPattern(patternFile, loop, interval, amplitude, freq)";
        }
        Log.e(TAG, str);
    }

    public void playPattern(String str, int i2) {
        playPattern(str, i2, 255);
    }

    public void playPattern(String str, int i2, int i3) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Wrong parameter {string: " + str + "} is null!");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("Wrong parameter {loop: " + i2 + "} less than 1!");
        }
        if (!this.mFFEnable) {
            stop();
            this.mNonFFLoopThread.a(new com.appff.haptic.base.b(str, i2, 0, i3, 0));
        } else if (this.mFFApiSupport) {
            mExcutor.execute(new i(this, str, i2, i3));
        } else if (this.mHapticPlayerApiSupport) {
            l.a(str, i2, 0, i3, 0);
        } else {
            Log.e(TAG, "no api support playPattern(string, loop, amplitude)");
        }
    }

    public void playPattern(String str, int i2, int i3, int i4, int i5) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Wrong parameter {string: " + str + "} is null!");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("Wrong parameter {loop: " + i2 + "} less than 1!");
        }
        if (i3 < 0 || i3 > 1000) {
            throw new IllegalArgumentException("Wrong parameter {interval: " + i3 + "} less than 0, or greater than 1000!");
        }
        if (!this.mFFEnable) {
            stop();
            this.mNonFFLoopThread.a(new com.appff.haptic.base.b(str, i2, i3, i4, i5));
        } else if (this.mFFApiSupport) {
            mExcutor.execute(new j(this, str, i2, i3, i4, i5));
        } else if (this.mHapticPlayerApiSupport) {
            l.a(str, i2, i3, i4, i5);
        } else {
            Log.e(TAG, "no api support playPattern(string, loop, interval, amplitude, freq)");
        }
    }

    public void playRTPStream(String str) throws Throwable {
        playRTPStream(str, 255);
    }

    public void playRTPStream(String str, int i2) throws Throwable {
        boolean z;
        if (this.vibrator == null) {
            Log.e(TAG, "Please call the init method");
            return;
        }
        if (!Utils.validatePath(str, SUFFIX_ACT)) {
            throw new IllegalArgumentException("Wrong parameter {filePath: " + str + "} doesn't exist or has illegal format!");
        }
        if (!this.mFFEnable || (!(z = this.mFFApiSupport) && this.mHapticPlayerApiSupport)) {
            playStreamOnNonFF(str, i2);
        } else if (z) {
            mExcutor.execute(new f(this, str, i2));
        } else {
            Log.d(TAG, "FF is enabled ,use haptic player api ,but haven't api support playRTPStream");
        }
    }

    public void playWaveform(long[] jArr, int i2) {
        Vibrator vibrator = this.vibrator;
        if (vibrator == null) {
            Log.e(TAG, "Please call the init method");
            return;
        }
        if (!this.mFFEnable) {
            vibrator.cancel();
            this.mNonFFLoopThread.b();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.vibrator.vibrate(VibrationEffect.createWaveform(jArr, i2));
        } else {
            this.vibrator.vibrate(jArr, i2);
        }
    }

    public void playWaveform(long[] jArr, int[] iArr, int i2) {
        Vibrator vibrator = this.vibrator;
        if (vibrator == null) {
            Log.e(TAG, "Please call the init method");
            return;
        }
        if (!this.mFFEnable) {
            vibrator.cancel();
            this.mNonFFLoopThread.b();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.vibrator.vibrate(VibrationEffect.createWaveform(jArr, iArr, i2));
        } else {
            this.vibrator.vibrate(jArr, i2);
        }
    }

    public void quit() {
        com.appff.haptic.base.c cVar;
        freeSharedMemory();
        sInstance = null;
        this.mContext = null;
        if (!isNonFFMode() || (cVar = this.mNonFFLoopThread) == null) {
            return;
        }
        cVar.c();
        this.mNonFFLoopThread = null;
    }

    public void sendLoopParameter(int i2, int i3) {
        if (i2 < 1 || i2 > 255) {
            throw new IllegalArgumentException("Wrong parameter {amplitude: " + i2 + "}, which should be [1, 255]!");
        }
        if (i3 < 0 || i3 > 1000) {
            throw new IllegalArgumentException("Wrong parameter {interval: " + i3 + "}, which should be [0, 1000]!");
        }
        if (!this.mFFEnable) {
            this.mNonFFLoopThread.b(new com.appff.haptic.base.b(null, -1, i3, i2, -1));
        } else if (this.mFFApiSupport) {
            mExcutor.execute(new k(this, i3, i2));
        } else if (this.mHapticPlayerApiSupport) {
            l.a(i3, i2, 0);
        } else {
            Log.e(TAG, "no api support sendLoopParameter(amplitude, interval) ");
        }
    }

    public void sendLoopParameter(int i2, int i3, int i4) {
        if (i2 < 1 || i2 > 255) {
            throw new IllegalArgumentException("Wrong parameter {amplitude: " + i2 + "}, which should be [1, 255]!");
        }
        if (i3 < 0 || i3 > 1000) {
            throw new IllegalArgumentException("Wrong parameter {interval: " + i3 + "}, which should be [0, 1000]!");
        }
        if (!this.mFFEnable) {
            this.mNonFFLoopThread.b(new com.appff.haptic.base.b(null, -1, i3, i2, i4));
        } else if (this.mFFApiSupport) {
            mExcutor.execute(new c(this, i3, i2, i4));
        } else if (this.mHapticPlayerApiSupport) {
            l.a(i3, i2, i4);
        } else {
            Log.e(TAG, "no api support sendLoopParameter(amplitude, interval, freq)");
        }
    }

    public void stop() {
        Log.d(TAG, "stop");
        if (!this.mFFEnable) {
            com.appff.haptic.base.c cVar = this.mNonFFLoopThread;
            if (cVar != null) {
                cVar.b();
            }
        } else if (this.mFFApiSupport) {
            Context context = this.mContext;
            if (context != null) {
                com.appff.haptic.base.d.a(context).a();
            }
        } else if (this.mHapticPlayerApiSupport) {
            l.b();
        }
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    public boolean supportFF() {
        boolean z;
        Class cls;
        String str;
        if (this.vibrator == null) {
            str = "Please call the init method first";
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                Log.d(TAG, "clazzVibrationEffect:" + this.clazzVibrationEffect);
                Class cls2 = this.clazzVibrationEffect;
                if (cls2 != null) {
                    try {
                        Class<?> cls3 = Integer.TYPE;
                        cls2.getMethod("createPatternHeWithParam", int[].class, cls3, cls3, cls3, cls3);
                        z = true;
                    } catch (Exception unused) {
                        Log.e(TAG, "The system doesn't integrate ff software,getMethod exception");
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z && (cls = this.clazzVibrationEffect) != null) {
                    try {
                        int iIntValue = ((Integer) cls.getMethod("checkIfRichTapSupport", new Class[0]).invoke(null, new Object[0])).intValue();
                        Log.d(TAG, "check FF Support result:" + iIntValue);
                        if (2 == iIntValue) {
                            z = false;
                        } else if (1 == iIntValue) {
                            Utils.setNonFFVersionInFramework(true);
                        } else {
                            int i2 = (16711680 & iIntValue) >> 16;
                            int i3 = (65280 & iIntValue) >> 8;
                            int i4 = (iIntValue & 255) >> 0;
                            Utils.setMajorVersion(i3);
                            Utils.setMinorVersion(i4);
                            Utils.setNonFFVersionInFramework(false);
                            Log.d(TAG, "clientCode:" + i2 + " majorVersion:" + i3 + " minorVersion:" + i4);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                this.mFFApiSupport = z;
                Log.d(TAG, "support FF api:" + this.mFFApiSupport);
                boolean zSupportHapticPlayer = supportHapticPlayer();
                this.mHapticPlayerApiSupport = zSupportHapticPlayer;
                return this.mFFApiSupport || zSupportHapticPlayer;
            }
            str = "android api is lower than o,can not support!!";
        }
        Log.e(TAG, str);
        return false;
    }

    public boolean supportHapticPlayer() {
        boolean zA = l.a();
        Log.d(TAG, "support haptic player:" + zA);
        return zA;
    }

    public void useNonFF(boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        sb.append("useNonFF start nonFF = ");
        sb.append(!this.mFFEnable);
        Log.d(TAG, sb.toString());
        if (supportFF()) {
            z2 = !z;
        } else {
            Log.w(TAG, "the system doesn't integrate FF software");
            z2 = false;
        }
        this.mFFEnable = z2;
        if (!isNonFFMode()) {
            com.appff.haptic.base.c cVar = this.mNonFFLoopThread;
            if (cVar != null) {
                cVar.c();
                this.mNonFFLoopThread = null;
            }
        } else if (this.mNonFFLoopThread == null) {
            com.appff.haptic.base.c cVar2 = new com.appff.haptic.base.c(this.mContext);
            this.mNonFFLoopThread = cVar2;
            cVar2.start();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("useNonFF end nonFF = ");
        sb2.append(!this.mFFEnable);
        Log.d(TAG, sb2.toString());
    }
}
