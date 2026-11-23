package com.FF.voiceengine.mgr;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.FF.voiceengine.AppPara;
import com.FF.voiceengine.AudioMgr;
import com.FF.voiceengine.NetUtil;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class FFVoiceManager {
    private static final String TAG = "FFVoice";
    public static final String YOU_ME_LIB_NAME_STRING = "ff_voice_engine";
    private static String mCachePath;
    private static Context mContext;
    public static Boolean mInited;
    private static String mStrDownloadURL;
    private static String mStrFileMD5;
    private static Boolean m_bStopDownload;
    private static Boolean soLoaded;

    static {
        Boolean bool = Boolean.FALSE;
        m_bStopDownload = bool;
        mContext = null;
        mInited = bool;
        soLoaded = bool;
    }

    public FFVoiceManager(Context context) {
        mContext = context;
    }

    public static boolean DownloadFile(String str, String str2) {
        File file = new File(str2);
        file.delete();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            randomAccessFile.seek(0L);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                byte[] bArr = new byte[65536];
                while (!m_bStopDownload.booleanValue()) {
                    int i2 = inputStream.read(bArr);
                    if (i2 <= 0) {
                        inputStream.close();
                        httpURLConnection.disconnect();
                        randomAccessFile.close();
                        return true;
                    }
                    randomAccessFile.write(bArr, 0, i2);
                }
            }
            inputStream.close();
            httpURLConnection.disconnect();
            randomAccessFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        file.delete();
        return false;
    }

    public static boolean Init(Context context) {
        Boolean bool = Boolean.TRUE;
        Log.i(TAG, "start init");
        if (mInited.booleanValue()) {
            Log.e(TAG, "Init: Already initialzed");
            if (context instanceof Activity) {
                mContext = context;
                AudioMgr.init(context);
            }
            return true;
        }
        if (!soLoaded.booleanValue()) {
            m_bStopDownload = Boolean.FALSE;
            mContext = context;
            mCachePath = context.getDir("libs", 0).getAbsolutePath();
            Log.i(TAG, "start load:" + mCachePath);
            if (!LoadSO(context)) {
                Log.i(TAG, "Failed to load so");
                return false;
            }
            Log.i(TAG, "load complete");
            soLoaded = bool;
        }
        try {
            AppPara.initPara(context);
            AudioMgr.init(context);
            Log.i(TAG, "end init");
            mInited = bool;
            if (!(context instanceof Activity)) {
                Log.e(TAG, "context is not Activity");
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean Init(Context context, String str) {
        Boolean bool = Boolean.TRUE;
        Log.i(TAG, "load so:" + str);
        if (mInited.booleanValue()) {
            Log.e(TAG, "Init: Already initialzed");
            if (context instanceof Activity) {
                mContext = context;
                AudioMgr.init(context);
            }
            return true;
        }
        if (!soLoaded.booleanValue()) {
            mContext = context;
            Log.i(TAG, "start load:" + str);
            try {
                if (fileIsExists(str)) {
                    Log.i(TAG, "so exist: " + str);
                    System.load(str);
                } else {
                    Log.w(TAG, "so not find: ff_voice_engine");
                    System.loadLibrary(YOU_ME_LIB_NAME_STRING);
                }
                Log.i(TAG, "loaded");
                soLoaded = bool;
            } catch (Throwable th) {
                Log.i(TAG, "Failed to load so");
                th.printStackTrace();
                return false;
            }
        }
        try {
            AppPara.initPara(context);
            AudioMgr.init(context);
            Log.i(TAG, "end init");
            mInited = bool;
            if (!(context instanceof Activity)) {
                Log.e(TAG, "context is not Activity");
            }
            return true;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static boolean LoadSO(Context context) {
        String str = mCachePath + "/lib" + YOU_ME_LIB_NAME_STRING + ".so";
        try {
            int i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            String string = context.getSharedPreferences("FFVoiceUpdate", 0).getString("UpdateVercode", "");
            if (string.equals(String.valueOf(i2))) {
                Log.i(TAG, "versioncode: " + i2 + " new:" + string);
            } else {
                new File(str).delete();
            }
            try {
                if (!fileIsExists(str)) {
                    System.loadLibrary(YOU_ME_LIB_NAME_STRING);
                    return true;
                }
                Log.i(TAG, "load " + str);
                System.load(str);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            new File(str).delete();
            return false;
        }
    }

    public static void SaveLogcat(String str) {
        LogUtil.SaveLogcat(str);
    }

    public static void TriggerNetChange() {
        AppPara.onNetWorkChange(NetUtil.getNetworkState(mContext));
    }

    public static void Uninit() {
        try {
            m_bStopDownload = Boolean.TRUE;
            AudioMgr.uinit();
            mInited = Boolean.FALSE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void UpdateSelf(String str, String str2) {
        if (mStrDownloadURL != null) {
            return;
        }
        mStrDownloadURL = str + "/android/" + Build.CPU_ABI + "/libff_voice_engine.so";
        mStrFileMD5 = str2;
        Log.i(TAG, "UpdateSelf " + mStrDownloadURL + "\n MD5: " + str2);
        new Thread(new Runnable() { // from class: com.FF.voiceengine.mgr.FFVoiceManager.1
            @Override // java.lang.Runnable
            public void run() {
                String str3;
                String str4 = FFVoiceManager.mCachePath + "/lib" + FFVoiceManager.YOU_ME_LIB_NAME_STRING + ".so";
                String str5 = str4 + ".tmp";
                if (FFVoiceManager.DownloadFile(FFVoiceManager.mStrDownloadURL, str5)) {
                    try {
                        String fileMD5String = FileMD5.getFileMD5String(str5);
                        Log.i(FFVoiceManager.TAG, "MD5: " + fileMD5String);
                        if (fileMD5String.equalsIgnoreCase(FFVoiceManager.mStrFileMD5)) {
                            if (new File(str4).delete()) {
                                str3 = "remove:" + str4;
                            } else {
                                str3 = "remove fail:" + str4;
                            }
                            Log.i(FFVoiceManager.TAG, str3);
                            if (new File(str5).renameTo(new File(str4))) {
                                Log.i(FFVoiceManager.TAG, "rename done: " + str4);
                                SharedPreferences sharedPreferences = FFVoiceManager.mContext.getSharedPreferences("FFVoiceUpdate", 0);
                                int i2 = FFVoiceManager.mContext.getPackageManager().getPackageInfo(FFVoiceManager.mContext.getPackageName(), 0).versionCode;
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                editorEdit.putString("UpdateVercode", String.valueOf(i2));
                                editorEdit.commit();
                            } else {
                                Log.i(FFVoiceManager.TAG, "rename fail: " + str4);
                            }
                        } else {
                            Log.i(FFVoiceManager.TAG, "md5 not match " + fileMD5String + "  " + FFVoiceManager.mStrFileMD5);
                            new File(str5).delete();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    Log.i(FFVoiceManager.TAG, "download fail URL:" + FFVoiceManager.mStrDownloadURL);
                }
                String unused = FFVoiceManager.mStrDownloadURL = null;
            }
        }).start();
    }

    private static boolean fileIsExists(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }
}
