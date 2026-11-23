package com.FF.voiceengine;

import android.annotation.TargetApi;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.os.Build;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class AudioRecorder {
    private static String AudioName = null;
    private static String AudioRecordError = null;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_BYTES_PER_SAMPLE = 2;
    private static final int DEFAULT_CHANNEL_NUM = 2;
    private static final int DEFAULT_SAMPLE_RATE = 44100;
    private static final int DEFAULT_SOURCE = 1;
    private static final String TAG = "FFVoiceAudioRecorder";
    private static boolean isReleased = true;
    private static AudioRecord mAudioRecord = null;
    private static int mBytesPerSample = 0;
    private static int mChannelNum = 0;
    private static int mCounter = 1;
    private static int mInitStatus = 100;
    private static boolean mInitSuceed = false;
    private static boolean mIsLoopExit = false;
    private static boolean mIsRecorderStarted = false;
    private static int mLoopCounter = 1;
    private static int mMicSource = 0;
    private static int mMinBufferSize = 0;
    public static ByteBuffer mOutBuffer = null;
    private static int mRecordStatus = 0;
    private static Thread mRecorderThread = null;
    private static int mSamplerate = 0;
    private static int mTypeSpeech = 1;
    private static boolean needChangeMode;
    private static boolean pauseRecord;
    private static int readBufSize;

    private static class AudioRecorderRunnable implements Runnable {
        private AudioRecorderRunnable() {
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00bd A[Catch: all -> 0x013c, TryCatch #0 {all -> 0x013c, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0010, B:9:0x0016, B:11:0x0020, B:12:0x0025, B:14:0x002e, B:16:0x0032, B:17:0x004c, B:19:0x005d, B:21:0x0063, B:23:0x0069, B:24:0x007d, B:45:0x00f4, B:39:0x00bd, B:40:0x00c1, B:42:0x00e7, B:44:0x00ed, B:33:0x009f, B:34:0x00a5, B:35:0x00a9, B:36:0x00af, B:37:0x00b5, B:46:0x00f9, B:48:0x00fd, B:49:0x0117, B:51:0x011b, B:52:0x0133, B:53:0x0138), top: B:58:0x0004 }] */
        @Override // java.lang.Runnable
        public void run() {
            String str;
            while (!AudioRecorder.mIsLoopExit && !Thread.interrupted()) {
                try {
                    if (AudioRecorder.mInitSuceed && AudioRecorder.readBufSize > AudioRecorder.mMinBufferSize) {
                        Log.e(AudioRecorder.TAG, "Error record buffer overflow!");
                    }
                    if (AudioRecorder.mInitSuceed) {
                        if (AudioRecorder.mOutBuffer == null) {
                            AudioRecorder.mOutBuffer = ByteBuffer.allocateDirect((((AudioRecorder.mSamplerate * AudioRecorder.mChannelNum) * AudioRecorder.mBytesPerSample) / 100) * 2);
                        }
                        AudioRecord audioRecord = AudioRecorder.mAudioRecord;
                        ByteBuffer byteBuffer = AudioRecorder.mOutBuffer;
                        int i2 = audioRecord.read(byteBuffer, byteBuffer.capacity());
                        if (i2 > 0) {
                            if (AudioRecorder.mLoopCounter < 5 && AudioRecorder.mLoopCounter >= 0) {
                                Log.e(AudioRecorder.TAG, "Record success: ret=" + i2);
                            }
                            AudioRecorder.OnAudioRecorderRefresh(AudioRecorder.mOutBuffer, AudioRecorder.mSamplerate, AudioRecorder.mChannelNum, AudioRecorder.mBytesPerSample);
                            int unused = AudioRecorder.mRecordStatus = 3;
                        } else {
                            if (i2 == -3) {
                                int unused2 = AudioRecorder.mInitStatus = i2;
                                str = "Error ERROR_INVALID_OPERATION";
                            } else if (i2 == -2) {
                                int unused3 = AudioRecorder.mInitStatus = i2;
                                str = "Error ERROR_BAD_VALUE";
                            } else if (i2 != -1) {
                                if (i2 == 0) {
                                    int unused4 = AudioRecorder.mInitStatus = -5;
                                    str = "Error Record Size=0, maybe record right NOT be enabled in some special android phone!!";
                                }
                                if (i2 == 0) {
                                    int unused5 = AudioRecorder.mRecordStatus = -4;
                                }
                                int unused6 = AudioRecorder.mRecordStatus = i2;
                                Arrays.fill(AudioRecorder.mOutBuffer.array(), (byte) 0);
                                AudioRecorder.OnAudioRecorderRefresh(AudioRecorder.mOutBuffer, AudioRecorder.mSamplerate, AudioRecorder.mChannelNum, AudioRecorder.mBytesPerSample);
                                Thread.sleep(20L);
                                if (AudioRecorder.mLoopCounter < 5 && AudioRecorder.mLoopCounter >= 0) {
                                    Log.e(AudioRecorder.TAG, AudioRecorder.AudioRecordError);
                                }
                            } else {
                                int unused7 = AudioRecorder.mInitStatus = i2;
                                str = "Error Other ERRORs";
                            }
                            String unused8 = AudioRecorder.AudioRecordError = str;
                            if (i2 == 0) {
                                int unused9 = AudioRecorder.mRecordStatus = -4;
                            }
                            int unused10 = AudioRecorder.mRecordStatus = i2;
                            Arrays.fill(AudioRecorder.mOutBuffer.array(), (byte) 0);
                            AudioRecorder.OnAudioRecorderRefresh(AudioRecorder.mOutBuffer, AudioRecorder.mSamplerate, AudioRecorder.mChannelNum, AudioRecorder.mBytesPerSample);
                            Thread.sleep(20L);
                            if (AudioRecorder.mLoopCounter < 5) {
                                Log.e(AudioRecorder.TAG, AudioRecorder.AudioRecordError);
                            }
                        }
                        AudioRecorder.access$908();
                    } else {
                        if (AudioRecorder.mOutBuffer == null) {
                            AudioRecorder.mOutBuffer = ByteBuffer.allocateDirect((((AudioRecorder.mSamplerate * AudioRecorder.mChannelNum) * AudioRecorder.mBytesPerSample) / 100) * 2);
                        }
                        ByteBuffer byteBuffer2 = AudioRecorder.mOutBuffer;
                        if (byteBuffer2 != null) {
                            Arrays.fill(byteBuffer2.array(), (byte) 0);
                            AudioRecorder.OnAudioRecorderRefresh(AudioRecorder.mOutBuffer, AudioRecorder.mSamplerate, AudioRecorder.mChannelNum, AudioRecorder.mBytesPerSample);
                        }
                        Thread.sleep(20L);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    Log.e(AudioRecorder.TAG, "Recorder thread exit!");
                    return;
                }
            }
            Log.d(AudioRecorder.TAG, "Recorder thread exit!");
        }
    }

    public static void OnAudioRecorder(int i2) {
        try {
            if (i2 != 0) {
                startRecorder();
            } else {
                stopRecorder();
                mInitSuceed = false;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void OnAudioRecorderRefresh(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            NativeEngine.AudioRecorderBufRefresh(byteBuffer, i2, i3, i4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void OnAudioRecorderTmp(int i2) {
        try {
            Log.d(TAG, "enter OnAudioRecorderTmp : " + i2);
            if (!mInitSuceed) {
                Log.e(TAG, "OnAudioRecorderTmp return because already stop avsessionMgr");
                return;
            }
            if (i2 != 0) {
                if (pauseRecord) {
                    if (AudioMgr.hasChangedCoutum()) {
                        needChangeMode = true;
                        AudioMgr.restoreOldMode();
                    } else {
                        needChangeMode = false;
                    }
                    Log.e(TAG, "delay  150ms");
                    new Timer().schedule(new TimerTask() { // from class: com.FF.voiceengine.AudioRecorder.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            try {
                                if (AudioRecorder.pauseRecord) {
                                    AudioRecorder.startRecorder();
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }, 150L);
                }
            } else if (mIsRecorderStarted) {
                stopRecorder();
                pauseRecord = true;
            }
            Log.d(TAG, "leave OnAudioRecorderTmp : " + i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ int access$908() {
        int i2 = mLoopCounter;
        mLoopCounter = i2 + 1;
        return i2;
    }

    @TargetApi(23)
    private static AudioRecord createAudioRecordOnMarshmallowOrHigher(int i2, int i3, int i4, int i5) {
        Log.d(TAG, "createAudioRecordOnMarshmallowOrHigher audioSource:" + i2);
        return new AudioRecord.Builder().setAudioSource(i2).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i3).setChannelMask(i4).build()).setBufferSizeInBytes(i5).build();
    }

    public static int getRecorderInitStatus() {
        return mInitStatus;
    }

    public static int getRecorderStatus() {
        return mRecordStatus;
    }

    public static void initRecorder() {
        initRecorder(DEFAULT_SAMPLE_RATE, 2, 2, mTypeSpeech);
    }

    public static void initRecorder(int i2, int i3, int i4, int i5) {
        int i6;
        try {
            if (pauseRecord) {
                pauseRecord = false;
                if (needChangeMode) {
                    AudioMgr.setVoiceModeRTCCoutum();
                }
            }
            mTypeSpeech = i5;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 11) {
                i6 = i5 == 1 ? 7 : 1;
            } else {
                i6 = i5 == 1 ? 4 : 1;
            }
            mMicSource = i6;
            int i8 = mMicSource;
            Log.i(TAG, (i8 == 7 || i8 == 4) ? "Record: stream type: voip" : "Record: stream type: mic");
            mSamplerate = i2;
            mChannelNum = i3;
            mBytesPerSample = i4;
            mLoopCounter = 1;
            mInitSuceed = true;
            mRecordStatus = 0;
            isReleased = false;
            int i9 = (i3 == 1 || i3 != 2) ? 16 : 12;
            int i10 = i4 != 1 ? 2 : 3;
            int i11 = (((i2 * i3) * i4) / 100) * 2;
            readBufSize = i11;
            mOutBuffer = ByteBuffer.allocateDirect(i11);
            int minBufferSize = AudioRecord.getMinBufferSize(mSamplerate, i9, i10);
            mMinBufferSize = minBufferSize;
            if (minBufferSize == -2) {
                Log.e(TAG, "Invalid parameter !");
                mInitStatus = -2;
                mInitSuceed = false;
                isReleased = true;
            }
            mMinBufferSize *= 2;
            Log.d(TAG, "getMinBufferSize = " + mMinBufferSize + " bytes");
            mAudioRecord = i7 >= 23 ? createAudioRecordOnMarshmallowOrHigher(mMicSource, mSamplerate, i9, mMinBufferSize) : new AudioRecord(mMicSource, mSamplerate, i9, i10, mMinBufferSize);
            if (mAudioRecord.getState() == 0) {
                Log.e(TAG, "AudioRecord initialize fail !");
                mInitStatus = 0;
                mAudioRecord.release();
                mInitSuceed = false;
                isReleased = true;
            }
            if (!mInitSuceed || readBufSize <= mMinBufferSize) {
                return;
            }
            Log.e(TAG, "Error record buffer overflow!");
        } catch (Throwable th) {
            Log.e(TAG, "Error create record");
            mInitSuceed = false;
            isReleased = true;
            th.printStackTrace();
        }
    }

    private static void initWithLatestParm() {
        initRecorder(mSamplerate, mChannelNum, mBytesPerSample, mTypeSpeech);
    }

    public static boolean isRecorderStarted() {
        return mIsRecorderStarted;
    }

    public static boolean startRecorder() {
        if (mIsRecorderStarted) {
            Log.e(TAG, "Recorder already started !");
            return false;
        }
        if (mInitSuceed) {
            if (isReleased) {
                initWithLatestParm();
            }
            mAudioRecord.startRecording();
        } else {
            Log.e(TAG, "Recorder not init successed.");
            Log.e(TAG, "Output mute data");
        }
        mIsLoopExit = false;
        Thread thread = new Thread(new AudioRecorderRunnable());
        mRecorderThread = thread;
        thread.start();
        mIsRecorderStarted = true;
        Log.d(TAG, "Start audio recorder success !");
        return true;
    }

    public static void stopRecorder() {
        if (mIsRecorderStarted) {
            mIsLoopExit = true;
            try {
                mRecorderThread.interrupt();
                mRecorderThread.join(5000L);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (mInitSuceed && mAudioRecord.getRecordingState() == 3) {
                try {
                    mAudioRecord.stop();
                    mAudioRecord.release();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            isReleased = true;
            mIsRecorderStarted = false;
            mOutBuffer = null;
            Log.d(TAG, "Stop audio recorder success !");
        }
    }
}
