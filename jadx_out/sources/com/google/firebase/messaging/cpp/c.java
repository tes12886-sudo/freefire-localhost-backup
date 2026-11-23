package com.google.firebase.messaging.cpp;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.messaging.RemoteMessage;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileLock;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static final c a = new c();

    public static c a() {
        return a;
    }

    private static String b(String str) {
        return str != null ? str : "";
    }

    private static byte[] c(String str, String str2, String str3, String str4, String str5, Map<String, String> map, byte[] bArr, RemoteMessage.b bVar, boolean z, String str6, String str7, int i2, int i3, long j2, int i4) {
        int iP;
        int iP2;
        int iN;
        int iO;
        j.d.c.a aVar = new j.d.c.a(0);
        int iM = aVar.m(b(str));
        int iM2 = aVar.m(b(str2));
        int iM3 = aVar.m(b(str3));
        int iM4 = aVar.m(b(str4));
        int iM5 = aVar.m(b(str5));
        int iM6 = aVar.m(b(str6));
        int iM7 = aVar.m(b(str7));
        int iM8 = aVar.m(d(i2));
        int iM9 = aVar.m(d(i3));
        if (map != null) {
            int[] iArr = new int[map.size()];
            int i5 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                iArr[i5] = a.c(aVar, aVar.m(entry.getKey()), aVar.m(entry.getValue()));
                i5++;
            }
            iP = e.p(aVar, iArr);
        } else {
            iP = 0;
        }
        int iL = bArr != null ? aVar.l(bArr) : 0;
        if (bVar != null) {
            int iM10 = aVar.m(b(bVar.l()));
            int iM11 = aVar.m(b(bVar.a()));
            int iM12 = aVar.m(b(bVar.g()));
            int iM13 = aVar.m(b(bVar.j()));
            int iM14 = aVar.m("");
            int iM15 = aVar.m(b(bVar.k()));
            int iM16 = aVar.m(b(bVar.f()));
            int iM17 = aVar.m(b(bVar.e()));
            int iM18 = aVar.m(b(bVar.d()));
            int iM19 = aVar.m(b(bVar.c()));
            String[] strArrB = bVar.b();
            if (strArrB != null) {
                int[] iArr2 = new int[strArrB.length];
                int length = strArrB.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    iArr2[i7] = aVar.m(strArrB[i6]);
                    i6++;
                    length = length;
                    i7++;
                }
                iN = f.n(aVar, iArr2);
            } else {
                iN = 0;
            }
            int iM20 = aVar.m(b(bVar.n()));
            String[] strArrM = bVar.m();
            if (strArrM != null) {
                int[] iArr3 = new int[strArrM.length];
                int length2 = strArrM.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2) {
                    iArr3[i9] = aVar.m(strArrM[i8]);
                    i8++;
                    length2 = length2;
                    i9++;
                }
                iO = f.o(aVar, iArr3);
            } else {
                iO = 0;
            }
            f.q(aVar);
            f.k(aVar, iM10);
            f.c(aVar, iM11);
            f.h(aVar, iM12);
            f.i(aVar, iM13);
            f.b(aVar, iM14);
            f.j(aVar, iM15);
            f.g(aVar, iM16);
            f.f(aVar, iM17);
            f.a(aVar, iM18);
            f.e(aVar, iM19);
            f.d(aVar, iN);
            f.m(aVar, iM20);
            f.l(aVar, iO);
            iP2 = f.p(aVar);
        } else {
            iM = iM;
            iM2 = iM2;
            iM3 = iM3;
            iM4 = iM4;
            iP2 = 0;
        }
        e.r(aVar);
        e.d(aVar, iM);
        e.o(aVar, iM2);
        e.f(aVar, iM3);
        e.g(aVar, iM4);
        e.k(aVar, iM8);
        e.j(aVar, iM9);
        e.m(aVar, j2);
        e.n(aVar, i4);
        e.c(aVar, iM5);
        e.a(aVar, iM7);
        if (map != null) {
            e.b(aVar, iP);
        }
        if (bArr != null) {
            e.l(aVar, iL);
        }
        if (bVar != null) {
            e.h(aVar, iP2);
        }
        e.i(aVar, z);
        e.e(aVar, iM6);
        int iQ = e.q(aVar);
        d.d(aVar);
        d.b(aVar, (byte) 1);
        d.a(aVar, iQ);
        aVar.p(d.c(aVar));
        return aVar.C();
    }

    private static String d(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "" : "normal";
        }
        return "high";
    }

    public void e(Context context, RemoteMessage remoteMessage, boolean z, Uri uri) {
        String strJ = remoteMessage.j();
        String strW = remoteMessage.w();
        String strL = remoteMessage.l();
        String strQ = remoteMessage.q();
        Map<String, String> mapH = remoteMessage.h();
        byte[] bArrU = remoteMessage.u();
        RemoteMessage.b bVarR = remoteMessage.r();
        String strF = remoteMessage.f();
        int iT = remoteMessage.t();
        int iS = remoteMessage.s();
        long jV = remoteMessage.v();
        int iX = remoteMessage.x();
        Uri uriH = (uri != null || bVarR == null) ? uri : bVarR.h();
        String string = uriH != null ? uriH.toString() : null;
        Object[] objArr = new Object[4];
        objArr[0] = strJ;
        objArr[1] = strL;
        objArr[2] = mapH == null ? "(null)" : mapH.toString();
        objArr[3] = bVarR != null ? bVarR.toString() : "(null)";
        b.a("FIREBASE_MESSAGE_WRITER", String.format("onMessageReceived from=%s message_id=%s, data=%s, notification=%s", objArr));
        g(context, strJ, strW, strL, strQ, null, mapH, bArrU, bVarR, z, string, strF, iT, iS, jV, iX);
    }

    void f(Context context, String str, String str2, String str3) {
        g(context, null, null, str, str2, null, null, null, null, false, null, null, 0, 0, 0L, 0);
    }

    void g(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map, byte[] bArr, RemoteMessage.b bVar, boolean z, String str6, String str7, int i2, int i3, long j2, int i4) {
        byte[] bArrC = c(str, str2, str3, str4, str5, map, bArr, bVar, z, str6, str7, i2, i3, j2, i4);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(bArrC.length);
        FileLock fileLockLock = null;
        try {
            try {
                try {
                    fileLockLock = context.openFileOutput("FIREBASE_CLOUD_MESSAGING_LOCKFILE", 0).getChannel().lock();
                    FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("FIREBASE_CLOUD_MESSAGING_LOCAL_STORAGE", 32768);
                    fileOutputStreamOpenFileOutput.write(byteBufferAllocate.array());
                    fileOutputStreamOpenFileOutput.write(bArrC);
                    fileOutputStreamOpenFileOutput.close();
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (fileLockLock == null) {
                } else {
                    fileLockLock.release();
                }
            }
        } catch (Throwable th) {
            if (fileLockLock == null) {
                throw th;
            }
            try {
                fileLockLock.release();
                throw th;
            } catch (Exception e3) {
                e3.printStackTrace();
                throw th;
            }
        }
    }
}
