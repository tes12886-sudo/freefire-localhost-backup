package j.e.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a extends SSLSocketFactory {
    private static final String[] e = {"RC4", "DES", "PSK", "_DHE_"};
    private final SSLSocketFactory a;
    private boolean b;
    private Class<?> c;
    private Method d;

    /* JADX INFO: renamed from: j.e.a.a.a$a, reason: collision with other inner class name */
    private static class C0246a extends SSLSocket {
        protected final SSLSocket a;

        C0246a(SSLSocket sSLSocket) {
            this.a = sSLSocket;
        }

        @Override // javax.net.ssl.SSLSocket
        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.a.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void bind(SocketAddress socketAddress) {
            this.a.bind(socketAddress);
        }

        @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.a.close();
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress) {
            this.a.connect(socketAddress);
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress, int i2) {
            this.a.connect(socketAddress, i2);
        }

        public boolean equals(Object obj) {
            return this.a.equals(obj);
        }

        @Override // java.net.Socket
        public SocketChannel getChannel() {
            return this.a.getChannel();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getEnableSessionCreation() {
            return this.a.getEnableSessionCreation();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledCipherSuites() {
            return this.a.getEnabledCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledProtocols() {
            return this.a.getEnabledProtocols();
        }

        @Override // java.net.Socket
        public InetAddress getInetAddress() {
            return this.a.getInetAddress();
        }

        @Override // java.net.Socket
        public InputStream getInputStream() {
            return this.a.getInputStream();
        }

        @Override // java.net.Socket
        public boolean getKeepAlive() {
            return this.a.getKeepAlive();
        }

        @Override // java.net.Socket
        public InetAddress getLocalAddress() {
            return this.a.getLocalAddress();
        }

        @Override // java.net.Socket
        public int getLocalPort() {
            return this.a.getLocalPort();
        }

        @Override // java.net.Socket
        public SocketAddress getLocalSocketAddress() {
            return this.a.getLocalSocketAddress();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getNeedClientAuth() {
            return this.a.getNeedClientAuth();
        }

        @Override // java.net.Socket
        public boolean getOOBInline() {
            return this.a.getOOBInline();
        }

        @Override // java.net.Socket
        public OutputStream getOutputStream() {
            return this.a.getOutputStream();
        }

        @Override // java.net.Socket
        public int getPort() {
            return this.a.getPort();
        }

        @Override // java.net.Socket
        public synchronized int getReceiveBufferSize() {
            return this.a.getReceiveBufferSize();
        }

        @Override // java.net.Socket
        public SocketAddress getRemoteSocketAddress() {
            return this.a.getRemoteSocketAddress();
        }

        @Override // java.net.Socket
        public boolean getReuseAddress() {
            return this.a.getReuseAddress();
        }

        @Override // java.net.Socket
        public synchronized int getSendBufferSize() {
            return this.a.getSendBufferSize();
        }

        @Override // javax.net.ssl.SSLSocket
        public SSLSession getSession() {
            return this.a.getSession();
        }

        @Override // java.net.Socket
        public int getSoLinger() {
            return this.a.getSoLinger();
        }

        @Override // java.net.Socket
        public synchronized int getSoTimeout() {
            return this.a.getSoTimeout();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedCipherSuites() {
            return this.a.getSupportedCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedProtocols() {
            return this.a.getSupportedProtocols();
        }

        @Override // java.net.Socket
        public boolean getTcpNoDelay() {
            return this.a.getTcpNoDelay();
        }

        @Override // java.net.Socket
        public int getTrafficClass() {
            return this.a.getTrafficClass();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getUseClientMode() {
            return this.a.getUseClientMode();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getWantClientAuth() {
            return this.a.getWantClientAuth();
        }

        @Override // java.net.Socket
        public boolean isBound() {
            return this.a.isBound();
        }

        @Override // java.net.Socket
        public boolean isClosed() {
            return this.a.isClosed();
        }

        @Override // java.net.Socket
        public boolean isConnected() {
            return this.a.isConnected();
        }

        @Override // java.net.Socket
        public boolean isInputShutdown() {
            return this.a.isInputShutdown();
        }

        @Override // java.net.Socket
        public boolean isOutputShutdown() {
            return this.a.isOutputShutdown();
        }

        @Override // javax.net.ssl.SSLSocket
        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.a.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void sendUrgentData(int i2) {
            this.a.sendUrgentData(i2);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnableSessionCreation(boolean z) {
            this.a.setEnableSessionCreation(z);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledCipherSuites(String[] strArr) {
            this.a.setEnabledCipherSuites(strArr);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
            this.a.setEnabledProtocols(strArr);
        }

        @Override // java.net.Socket
        public void setKeepAlive(boolean z) {
            this.a.setKeepAlive(z);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setNeedClientAuth(boolean z) {
            this.a.setNeedClientAuth(z);
        }

        @Override // java.net.Socket
        public void setOOBInline(boolean z) {
            this.a.setOOBInline(z);
        }

        @Override // java.net.Socket
        public void setPerformancePreferences(int i2, int i3, int i4) {
            this.a.setPerformancePreferences(i2, i3, i4);
        }

        @Override // java.net.Socket
        public synchronized void setReceiveBufferSize(int i2) {
            this.a.setReceiveBufferSize(i2);
        }

        @Override // java.net.Socket
        public void setReuseAddress(boolean z) {
            this.a.setReuseAddress(z);
        }

        @Override // java.net.Socket
        public synchronized void setSendBufferSize(int i2) {
            this.a.setSendBufferSize(i2);
        }

        @Override // java.net.Socket
        public void setSoLinger(boolean z, int i2) {
            this.a.setSoLinger(z, i2);
        }

        @Override // java.net.Socket
        public synchronized void setSoTimeout(int i2) {
            this.a.setSoTimeout(i2);
        }

        @Override // java.net.Socket
        public void setTcpNoDelay(boolean z) {
            this.a.setTcpNoDelay(z);
        }

        @Override // java.net.Socket
        public void setTrafficClass(int i2) {
            this.a.setTrafficClass(i2);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setUseClientMode(boolean z) {
            this.a.setUseClientMode(z);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setWantClientAuth(boolean z) {
            this.a.setWantClientAuth(z);
        }

        @Override // java.net.Socket
        public void shutdownInput() {
            this.a.shutdownInput();
        }

        @Override // java.net.Socket
        public void shutdownOutput() {
            this.a.shutdownOutput();
        }

        @Override // javax.net.ssl.SSLSocket
        public void startHandshake() throws IOException {
            this.a.startHandshake();
        }

        @Override // javax.net.ssl.SSLSocket, java.net.Socket
        public String toString() {
            return this.a.toString();
        }
    }

    private static class b extends C0246a {
        private b(SSLSocket sSLSocket) {
            super(sSLSocket);
        }

        /* synthetic */ b(SSLSocket sSLSocket, byte b) {
            this(sSLSocket);
        }

        @Override // j.e.a.a.a.C0246a, javax.net.ssl.SSLSocket
        public final void setEnabledProtocols(String[] strArr) {
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            super.setEnabledProtocols(strArr);
        }
    }

    public final class c extends RuntimeException {
        public c(Throwable th) {
            super(th);
        }
    }

    public final class d {
        private final String b;
        private final SecureRandom d;
        private final SecretKeyFactory e;
        private final Cipher f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Mac f2138g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private C0247a f2139h;
        private final Object a = new Object();
        private final int c = 5000;

        /* JADX INFO: renamed from: j.e.a.a.a$d$a, reason: collision with other inner class name */
        private static class C0247a {
            final SecretKey a;
            final SecretKey b;

            C0247a(SecretKey secretKey, SecretKey secretKey2) {
                this.a = secretKey;
                this.b = secretKey2;
            }
        }

        public d(String str) {
            this.b = str;
            try {
                this.d = new SecureRandom();
                this.e = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                this.f = Cipher.getInstance("AES/CBC/PKCS5Padding");
                this.f2138g = Mac.getInstance("HmacSHA256");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new RuntimeException(e);
            }
        }

        private C0247a c(Context context) {
            byte[] bArrDecode;
            String str = Build.MODEL + Build.MANUFACTURER + Build.SERIAL + Settings.Secure.getString(context.getContentResolver(), "android_id") + context.getPackageName();
            SharedPreferences sharedPreferences = context.getSharedPreferences(this.b, 0);
            String string = sharedPreferences.getString("salt", null);
            if (TextUtils.isEmpty(string)) {
                byte[] bArr = new byte[16];
                this.d.nextBytes(bArr);
                sharedPreferences.edit().putString("salt", Base64.encodeToString(bArr, 0)).apply();
                bArrDecode = bArr;
            } else {
                bArrDecode = Base64.decode(string, 0);
            }
            try {
                byte[] encoded = this.e.generateSecret(new PBEKeySpec(str.toCharArray(), bArrDecode, this.c, 512)).getEncoded();
                return new C0247a(new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), "AES"), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
            } catch (InvalidKeySpecException e) {
                throw new RuntimeException(e);
            }
        }

        public final String a(Context context, String str) {
            String strEncodeToString;
            synchronized (this.a) {
                b(context);
                try {
                    int blockSize = this.f.getBlockSize();
                    byte[] bArr = new byte[blockSize];
                    this.d.nextBytes(bArr);
                    this.f.init(1, this.f2139h.a, new IvParameterSpec(bArr));
                    byte[] bArrDoFinal = this.f.doFinal(str.getBytes("UTF-8"));
                    byte[] bArr2 = new byte[bArrDoFinal.length + blockSize + 32];
                    System.arraycopy(bArr, 0, bArr2, 0, blockSize);
                    int i2 = blockSize + 0;
                    System.arraycopy(bArrDoFinal, 0, bArr2, i2, bArrDoFinal.length);
                    this.f2138g.init(this.f2139h.b);
                    this.f2138g.update(bArr2, 0, blockSize + bArrDoFinal.length);
                    byte[] bArrDoFinal2 = this.f2138g.doFinal();
                    System.arraycopy(bArrDoFinal2, 0, bArr2, i2 + bArrDoFinal.length, bArrDoFinal2.length);
                    strEncodeToString = Base64.encodeToString(bArr2, 0);
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (InvalidKeyException e3) {
                    e = e3;
                    throw new RuntimeException(e);
                } catch (BadPaddingException e4) {
                    throw new c(e4);
                } catch (IllegalBlockSizeException e5) {
                    e = e5;
                    throw new RuntimeException(e);
                }
            }
            return strEncodeToString;
        }

        public final void b(Context context) {
            synchronized (this.a) {
                if (this.f2139h == null) {
                    this.f2139h = c(context);
                }
            }
        }
    }

    public a(SSLSocketFactory sSLSocketFactory) {
        this(sSLSocketFactory, (byte) 0);
    }

    private a(SSLSocketFactory sSLSocketFactory, byte b2) {
        this.b = true;
        this.a = sSLSocketFactory;
        this.b = true;
        try {
            try {
                this.c = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                this.c = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            this.d = this.c.getMethod("setHostname", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
    }

    private Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        byte b2 = 0;
        sSLSocket.setEnabledProtocols(Build.VERSION.SDK_INT < 16 ? new String[]{"TLSv1"} : new String[]{"TLSv1.2"});
        if (this.b) {
            sSLSocket.setEnabledCipherSuites(c(sSLSocket.getEnabledCipherSuites()));
        }
        return new b(sSLSocket, b2);
    }

    private void b(Socket socket, String str) {
        Method method;
        if (!this.c.isInstance(socket) || (method = this.d) == null) {
            return;
        }
        try {
            method.invoke(socket, str);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static String[] c(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        for (String str : strArr) {
            for (String str2 : e) {
                if (str.contains(str2)) {
                    arrayList.remove(str);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return a(this.a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) {
        Socket socketCreateSocket = this.a.createSocket(str, i2);
        b(socketCreateSocket, str);
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        Socket socketCreateSocket = this.a.createSocket(str, i2, inetAddress, i3);
        b(socketCreateSocket, str);
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) {
        return a(this.a.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return a(this.a.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        Socket socketCreateSocket = this.a.createSocket(socket, str, i2, z);
        b(socketCreateSocket, str);
        return a(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.b ? c(this.a.getDefaultCipherSuites()) : this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.b ? c(this.a.getSupportedCipherSuites()) : this.a.getSupportedCipherSuites();
    }
}
