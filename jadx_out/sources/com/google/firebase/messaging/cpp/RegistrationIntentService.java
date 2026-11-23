package com.google.firebase.messaging.cpp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.JobIntentService;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes.dex */
public class RegistrationIntentService extends JobIntentService {
    private static final String TAG = "FirebaseRegService";

    class a implements OnCompleteListener<String> {
        final /* synthetic */ Context a;

        a(RegistrationIntentService registrationIntentService, Context context) {
            this.a = context;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void a(Task<String> task) {
            if (!task.isSuccessful()) {
                Log.w(RegistrationIntentService.TAG, "Fetching FCM registration token failed", task.getException());
                return;
            }
            String result = task.getResult();
            b.a(RegistrationIntentService.TAG, String.format("onHandleWork token=%s", result));
            if (result != null) {
                RegistrationIntentService.writeTokenToInternalStorage(this.a, result);
            }
        }
    }

    private static byte[] generateTokenByteBuffer(String str) {
        j.d.c.a aVar = new j.d.c.a(0);
        if (str == null) {
            str = "";
        }
        int iM = aVar.m(str);
        g.c(aVar);
        g.a(aVar, iM);
        int iB = g.b(aVar);
        d.d(aVar);
        d.b(aVar, (byte) 2);
        d.a(aVar, iB);
        aVar.p(d.c(aVar));
        return aVar.C();
    }

    public static void writeTokenToInternalStorage(Context context, String str) {
        byte[] bArrGenerateTokenByteBuffer = generateTokenByteBuffer(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(bArrGenerateTokenByteBuffer.length);
        FileLock fileLockLock = null;
        try {
            try {
                try {
                    fileLockLock = context.openFileOutput("FIREBASE_CLOUD_MESSAGING_LOCKFILE", 0).getChannel().lock();
                    FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("FIREBASE_CLOUD_MESSAGING_LOCAL_STORAGE", 32768);
                    fileOutputStreamOpenFileOutput.write(byteBufferAllocate.array());
                    fileOutputStreamOpenFileOutput.write(bArrGenerateTokenByteBuffer);
                    fileOutputStreamOpenFileOutput.close();
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (fileLockLock == null) {
                    } else {
                        fileLockLock.release();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            if (fileLockLock != null) {
                try {
                    fileLockLock.release();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    @Override // androidx.core.app.JobIntentService
    protected void onHandleWork(Intent intent) {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new a(this, this));
    }
}
