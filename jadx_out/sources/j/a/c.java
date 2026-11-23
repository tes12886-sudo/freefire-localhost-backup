package j.a;

import com.appff.haptic.base.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private final String a;
    private HttpURLConnection b;
    private OutputStream c;
    private PrintWriter d;

    protected c(String str, String str2) {
        String str3 = "===" + System.currentTimeMillis() + "===";
        this.a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.b.setDoOutput(true);
        this.b.setDoInput(true);
        this.b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        this.c = this.b.getOutputStream();
        this.d = new PrintWriter((Writer) new OutputStreamWriter(this.c, str2), true);
    }

    protected void a(String str, File file) throws IOException {
        String name = file.getName();
        this.d.append((CharSequence) ("--" + this.a)).append((CharSequence) "\r\n");
        this.d.append((CharSequence) ("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + name + "\"")).append((CharSequence) "\r\n");
        PrintWriter printWriter = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Type: ");
        sb.append(URLConnection.guessContentTypeFromName(name));
        printWriter.append((CharSequence) sb.toString()).append((CharSequence) "\r\n");
        this.d.append((CharSequence) "Content-Transfer-Encoding: binary").append((CharSequence) "\r\n");
        this.d.append((CharSequence) "\r\n");
        this.d.flush();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[Utils.CONTINUOUS_EVENT];
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 == -1) {
                this.c.flush();
                fileInputStream.close();
                this.d.append((CharSequence) "\r\n");
                this.d.flush();
                return;
            }
            this.c.write(bArr, 0, i2);
        }
    }

    protected void b(String str, String str2) {
        this.d.append((CharSequence) (str + ": " + str2)).append((CharSequence) "\r\n");
        this.d.flush();
    }

    public boolean c() throws IOException {
        this.d.append((CharSequence) "\r\n").flush();
        this.d.append((CharSequence) ("--" + this.a + "--")).append((CharSequence) "\r\n");
        this.d.close();
        int responseCode = this.b.getResponseCode();
        if (responseCode == 200) {
            this.b.disconnect();
            return true;
        }
        throw new IOException("Server returned non-OK status: " + responseCode);
    }
}
