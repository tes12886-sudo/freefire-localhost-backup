package com.FF.voiceengine;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AudioPlayer {
    private static final int DEFAULT_BYTES_PER_SAMPLE = 2;
    private static final int DEFAULT_CHANNEL_NUM = 2;
    private static final int DEFAULT_MODE = 1;
    private static final int DEFAULT_SAMPLE_RATE = 44100;
    private static final int DEFAULT_STREAM_TYPE = 3;
    private static final String TAG = "FFVoiceAudioPlayer";
    private static AudioTrack mAudioTrack = null;
    private static int mBytesPerSample = 0;
    private static int mChannelNum = 0;
    public static ByteBuffer mInBuffer = null;
    private static int mInitStatus = 100;
    private static boolean mIsLoopExit;
    private static boolean mIsPlayerStarted;
    private static int mMinBufferSize;
    private static int mMode;
    private static int mPlayStatus;
    private static Thread mPlayerThread;
    private static int mSamplerate;
    private static int mStreamType;
    private static int usageAttribute;
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private static int audioRecordSessionID = -1;
    private static boolean mIsStreamVoice = true;

    private static class AudioPlayerRunnable implements Runnable {
        private AudioPlayerRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                int i2 = (((AudioPlayer.mSamplerate * AudioPlayer.mChannelNum) * AudioPlayer.mBytesPerSample) / 100) * 2;
                while (!AudioPlayer.mIsLoopExit && !Thread.interrupted()) {
                    if (i2 > AudioPlayer.mMinBufferSize) {
                        Log.e(AudioPlayer.TAG, "Error play buffer overflow!");
                    }
                    if (AudioPlayer.mInBuffer == null) {
                        AudioPlayer.mInBuffer = ByteBuffer.allocateDirect(i2);
                    }
                    int iWrite = 0;
                    Arrays.fill(AudioPlayer.mInBuffer.array(), (byte) 0);
                    AudioPlayer.mInBuffer.clear();
                    AudioPlayer.OnAudioPlayerRefresh(AudioPlayer.mInBuffer, AudioPlayer.mSamplerate, AudioPlayer.mChannelNum, AudioPlayer.mBytesPerSample);
                    if (AudioPlayer.mAudioTrack != null) {
                        try {
                            if (Build.VERSION.SDK_INT >= 21) {
                                AudioTrack audioTrack = AudioPlayer.mAudioTrack;
                                ByteBuffer byteBuffer = AudioPlayer.mInBuffer;
                                iWrite = audioTrack.write(byteBuffer, byteBuffer.capacity(), 0);
                            } else {
                                AudioPlayer.mAudioTrack.write(AudioPlayer.mInBuffer.array(), 0, i2);
                            }
                        } catch (NoSuchMethodError unused) {
                            AudioPlayer.mAudioTrack.write(AudioPlayer.mInBuffer.array(), 0, i2);
                        }
                        int playState = -3;
                        if (iWrite == -3) {
                            Log.e(AudioPlayer.TAG, "Error ERROR_INVALID_OPERATION");
                        } else {
                            playState = -2;
                            if (iWrite == -2) {
                                Log.e(AudioPlayer.TAG, "Error ERROR_BAD_VALUE");
                            } else {
                                playState = AudioPlayer.mAudioTrack.getPlayState();
                            }
                        }
                        int unused2 = AudioPlayer.mPlayStatus = playState;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                Log.e(AudioPlayer.TAG, "AudioPlayer thread exit!");
            }
        }
    }

    public static void OnAudioPlayer(int i2) {
        Log.d("AudioRecorder", "AudioRecorder : " + i2);
        if (i2 != 0) {
            startPlayer();
        } else {
            stopPlayer();
        }
    }

    public static void OnAudioPlayerRefresh(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        NativeEngine.AudioPlayerBufRefresh(byteBuffer, i2, i3, i4);
    }

    @TargetApi(21)
    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i2, int i3, int i4, int i5) {
        Log.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Log.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i2 != nativeOutputSampleRate) {
            Log.w(TAG, "Unable to use fast mode since requested sample rate is not native,native rate:" + nativeOutputSampleRate);
        }
        int defaultUsageAttribute = getDefaultUsageAttribute();
        usageAttribute = defaultUsageAttribute;
        if (defaultUsageAttribute != DEFAULT_USAGE) {
            Log.w(TAG, "A non default usage attribute is used: " + usageAttribute);
        }
        int i6 = 2;
        int i7 = 1;
        if (mStreamType != 0) {
            i6 = 1;
            i7 = 2;
        }
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(i6).setContentType(i7).build();
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setEncoding(i5).setSampleRate(i2).setChannelMask(i3).build();
        int i8 = mMode;
        int i9 = audioRecordSessionID;
        return new AudioTrack(audioAttributesBuild, audioFormatBuild, i4, i8, i9 == -1 ? 0 : i9);
    }

    private static int getDefaultUsageAttribute() {
        if (Build.VERSION.SDK_INT >= 21) {
            return getDefaultUsageAttributeOnLollipopOrHigher();
        }
        return 0;
    }

    @TargetApi(21)
    private static int getDefaultUsageAttributeOnLollipopOrHigher() {
        return mStreamType == 3 ? 1 : 2;
    }

    public static int getPlayerInitStatus() {
        return mInitStatus;
    }

    public static int getPlayerStatus() {
        return mPlayStatus;
    }

    public static void initPlayer() {
        initPlayer(DEFAULT_SAMPLE_RATE, 2, 2, false);
    }

    @TargetApi(9)
    public static void initPlayer(int i2, int i3, int i4, boolean z) {
        String str;
        AudioTrack audioTrack;
        mStreamType = 3;
        mSamplerate = i2;
        mChannelNum = i3;
        mBytesPerSample = i4;
        mMode = 1;
        mIsStreamVoice = z;
        if (z) {
            mStreamType = 0;
            str = "## player set voice stream:STREAM_VOICE_CALL";
        } else {
            mStreamType = 3;
            str = "## player set voice stream:STREAM_MUSIC";
        }
        Log.w(TAG, str);
        int i5 = (i3 == 1 || i3 != 2) ? 4 : 12;
        int i6 = i4 != 1 ? 2 : 3;
        int minBufferSize = AudioTrack.getMinBufferSize(mSamplerate, i5, i6);
        mMinBufferSize = minBufferSize;
        if (minBufferSize == -2) {
            Log.e(TAG, "Invalid parameter !");
            mInitStatus = -2;
            return;
        }
        Log.d(TAG, "getMinBufferSize = " + mMinBufferSize + " bytes samplerate:" + mSamplerate);
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                audioTrack = createAudioTrackOnLollipopOrHigher(mSamplerate, i5, mMinBufferSize, i6);
            } else {
                int i7 = mStreamType;
                int i8 = mSamplerate;
                int i9 = mMinBufferSize;
                int i10 = mMode;
                int i11 = audioRecordSessionID;
                audioTrack = new AudioTrack(i7, i8, i5, i6, i9, i10, i11 == -1 ? 0 : i11);
            }
            mAudioTrack = audioTrack;
            AudioTrack audioTrack2 = mAudioTrack;
            if (audioTrack2 != null && audioTrack2.getState() == 0) {
                Log.e(TAG, "AudioPlayer initialize fail !");
                mInitStatus = 0;
                mAudioTrack.release();
            } else {
                int i12 = (((mSamplerate * mChannelNum) * mBytesPerSample) / 100) * 2;
                if (i12 > mMinBufferSize) {
                    Log.e(TAG, "Error play buffer overflow!");
                }
                mInBuffer = ByteBuffer.allocateDirect(i12);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e(TAG, "AudioPlayer initialize fail !");
            mInitStatus = 0;
            AudioTrack audioTrack3 = mAudioTrack;
            if (audioTrack3 != null) {
                audioTrack3.release();
            }
        }
    }

    public static boolean isPlayerStarted() {
        return mIsPlayerStarted;
    }

    public static void setAudioRecordSessionID(int i2) {
        audioRecordSessionID = i2;
        if (mIsPlayerStarted) {
            OnAudioPlayer(0);
            initPlayer(mSamplerate, mChannelNum, mBytesPerSample, mIsStreamVoice);
            OnAudioPlayer(1);
        }
    }

    public static boolean startPlayer() {
        int i2;
        AudioTrack audioTrack = mAudioTrack;
        if (audioTrack == null || (i2 = mInitStatus) == -2 || i2 == 0) {
            Log.e(TAG, "Player cannot be started because initial fail !");
            mInBuffer = null;
            AudioTrack audioTrack2 = mAudioTrack;
            if (audioTrack2 != null) {
                audioTrack2.release();
            }
            return false;
        }
        if (mIsPlayerStarted) {
            Log.e(TAG, "Player already started !");
            return false;
        }
        audioTrack.play();
        mIsLoopExit = false;
        Thread thread = new Thread(new AudioPlayerRunnable());
        mPlayerThread = thread;
        thread.start();
        mIsPlayerStarted = true;
        Log.d(TAG, "Start audio player success !");
        return true;
    }

    public static void stopPlayer() {
        if (mIsPlayerStarted) {
            mIsLoopExit = true;
            try {
                mPlayerThread.interrupt();
                mPlayerThread.join(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AudioTrack audioTrack = mAudioTrack;
            if (audioTrack != null) {
                if (audioTrack.getPlayState() == 3) {
                    mAudioTrack.stop();
                }
                mAudioTrack.release();
            }
            mIsPlayerStarted = false;
            mInBuffer = null;
            Log.d(TAG, "Stop audio player success !");
        }
    }
}
