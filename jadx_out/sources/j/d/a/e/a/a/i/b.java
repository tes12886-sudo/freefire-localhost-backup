package j.d.a.e.a.a.i;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Service {
    private static final String LOG_TAG = "CancellableIntentService";
    private static final int WHAT_MESSAGE = -10;
    private String mName;
    private boolean mRedelivery;
    private volatile a mServiceHandler;
    private volatile Looper mServiceLooper;

    private final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b.this.onHandleIntent((Intent) message.obj);
            if (b.this.shouldStop()) {
                Log.d(b.LOG_TAG, "stopSelf");
                b.this.stopSelf(message.arg1);
                Log.d(b.LOG_TAG, "afterStopSelf");
            }
        }
    }

    public b(String str) {
        this.mName = str;
    }

    @Override // android.app.Service
    public abstract IBinder onBind(Intent intent);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("IntentService[" + this.mName + "]");
        handlerThread.start();
        this.mServiceLooper = handlerThread.getLooper();
        this.mServiceHandler = new a(this.mServiceLooper);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Thread thread = this.mServiceLooper.getThread();
        if (thread != null && thread.isAlive()) {
            thread.interrupt();
        }
        this.mServiceLooper.quit();
        Log.d(LOG_TAG, "onDestroy");
    }

    protected abstract void onHandleIntent(Intent intent);

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        if (this.mServiceHandler.hasMessages(-10)) {
            return;
        }
        Message messageObtainMessage = this.mServiceHandler.obtainMessage();
        messageObtainMessage.arg1 = i2;
        messageObtainMessage.obj = intent;
        messageObtainMessage.what = -10;
        this.mServiceHandler.sendMessage(messageObtainMessage);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return this.mRedelivery ? 3 : 2;
    }

    public void setIntentRedelivery(boolean z) {
        this.mRedelivery = z;
    }

    protected abstract boolean shouldStop();
}
