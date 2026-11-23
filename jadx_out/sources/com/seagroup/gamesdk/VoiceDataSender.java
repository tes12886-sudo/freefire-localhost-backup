package com.seagroup.gamesdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class VoiceDataSender {
    private static final String KEY_VOICE_BYTES_PER_SAMPLE = "b";
    private static final String KEY_VOICE_CHANNEL_NUM = "c";
    private static final String KEY_VOICE_DATA = "d";
    private static final String KEY_VOICE_SAMPLE_RATE = "s";
    private static final String KEY_VOICE_TIMESTAMP = "t";
    private static final int MSG_MIC_STATE = 9;
    private static final int MSG_ON_VOICE_DATA = 10;
    private static final int MSG_RELEASE_MIC = 12;
    private static final int MSG_REQUEST_MIC = 11;
    private static final int MSG_SDK_INIT = 7;
    private static final int MSG_SDK_UNINIT = 8;
    private static final int MTV_MIC_OFF = 0;
    private static final int MTV_MIC_OPEN = 1;
    private static final String MTV_PACKAGE_NAME = "com.mambet.tv";
    private static final String MTV_TEST_PACKAGE_NAME = "com.mambet.tv.test";
    private static final String TAG = "VoiceDataSender";
    public static final int VOICE_SOURCE_GAME = 3;
    public static final int VOICE_SOURCE_MIC = 0;
    public static final int VOICE_SOURCE_MIXED = 2;
    public static final int VOICE_SOURCE_REMOTE = 1;
    private static Handler clientHandler = new ClientHandler();
    private static WeakReference<VoiceDataSender> senderRef;
    private OnStatusCallback callback;
    private final boolean isTest;
    private Context context = null;
    private Messenger messenger = null;
    private Messenger client = new Messenger(clientHandler);
    private ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.seagroup.gamesdk.VoiceDataSender.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(VoiceDataSender.TAG, "stream service connected");
            VoiceDataSender.this.messenger = new Messenger(iBinder);
            Message messageObtain = Message.obtain();
            messageObtain.what = 7;
            messageObtain.replyTo = VoiceDataSender.this.client;
            VoiceDataSender.this.safeSendMessage(messageObtain);
            if (VoiceDataSender.this.callback != null) {
                VoiceDataSender.this.callback.onConnectChanged(true);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(VoiceDataSender.TAG, "stream service disconnected");
            VoiceDataSender.this.messenger = null;
            if (VoiceDataSender.this.callback != null) {
                VoiceDataSender.this.callback.onConnectChanged(false);
            }
            if (VoiceDataSender.this.context != null) {
                VoiceDataSender voiceDataSender = VoiceDataSender.this;
                voiceDataSender.start(voiceDataSender.context);
            }
        }
    };

    private static class ClientHandler extends Handler {
        private ClientHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Log.d(VoiceDataSender.TAG, "received message: " + message.what);
            if (message.what != 9) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("MTV mic is ");
            sb.append(message.arg1 == 1 ? "on" : "off");
            Log.d(VoiceDataSender.TAG, sb.toString());
            VoiceDataSender voiceDataSender = (VoiceDataSender) VoiceDataSender.senderRef.get();
            if (voiceDataSender == null || voiceDataSender.callback == null) {
                return;
            }
            voiceDataSender.callback.onMicFocusChanged(message.arg1 == 1);
        }
    }

    public interface OnStatusCallback {
        void onConnectChanged(boolean z);

        void onMicFocusChanged(boolean z);
    }

    public VoiceDataSender(OnStatusCallback onStatusCallback, boolean z) {
        senderRef = new WeakReference<>(this);
        this.callback = onStatusCallback;
        this.isTest = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeSendMessage(Message message) {
        try {
            Messenger messenger = this.messenger;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e) {
            Log.e(TAG, "messenger broken", e);
            this.messenger = null;
        }
    }

    public void releaseMic() {
        if (this.messenger != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 12;
            safeSendMessage(messageObtain);
        }
    }

    public void requestMic() {
        if (this.messenger != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 11;
            safeSendMessage(messageObtain);
        }
    }

    public void sendAudioData(int i2, int i3, int i4, byte[] bArr, int i5) {
        if (this.messenger != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putInt(KEY_VOICE_CHANNEL_NUM, i2);
            bundle.putInt(KEY_VOICE_SAMPLE_RATE, i3);
            bundle.putInt(KEY_VOICE_BYTES_PER_SAMPLE, i4);
            bundle.putByteArray(KEY_VOICE_DATA, bArr);
            bundle.putLong(KEY_VOICE_TIMESTAMP, jCurrentTimeMillis);
            messageObtain.what = 10;
            messageObtain.arg1 = i5;
            messageObtain.setData(bundle);
            safeSendMessage(messageObtain);
        }
    }

    public void sendUnityAudioData(int i2, int i3, float[] fArr) {
        if (this.messenger != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putInt(KEY_VOICE_CHANNEL_NUM, i2);
            bundle.putInt(KEY_VOICE_SAMPLE_RATE, i3);
            bundle.putFloatArray(KEY_VOICE_DATA, fArr);
            bundle.putLong(KEY_VOICE_TIMESTAMP, jCurrentTimeMillis);
            messageObtain.what = 10;
            messageObtain.arg1 = 3;
            messageObtain.setData(bundle);
            safeSendMessage(messageObtain);
        }
    }

    public boolean start(Context context) {
        Intent intent = new Intent("com.seagroup.spark.action.SEND_VOICE");
        intent.setPackage(this.isTest ? MTV_TEST_PACKAGE_NAME : MTV_PACKAGE_NAME);
        boolean zBindService = false;
        try {
            zBindService = context.bindService(intent, this.serviceConnection, 8);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "bind result: " + zBindService);
        if (zBindService) {
            this.context = context;
        }
        return zBindService;
    }

    public void stop() {
        if (this.context != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 8;
            safeSendMessage(messageObtain);
            this.context.unbindService(this.serviceConnection);
            this.context = null;
        }
    }
}
