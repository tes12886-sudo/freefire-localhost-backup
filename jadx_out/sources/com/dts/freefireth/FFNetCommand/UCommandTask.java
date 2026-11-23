package com.dts.freefireth.FFNetCommand;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class UCommandTask<T> implements Callable<T> {
    protected static final String MATCH_PING_IP = "(?<=from ).*(?=: icmp_seq=1 ttl=)";
    protected static final String MATCH_PING_TIME = "(?<=time=).*?ms";
    protected static final String MATCH_PING_TTL = "(?<=ttl=).*(?= time)";
    protected static final String MATCH_TRACE_IP = "(?<=From )(?:[0-9]{1,3}\\.){3}[0-9]{1,3}";
    protected static final String MATCH_TTL_EXCEEDED = "Time to live exceeded";
    protected String command;
    protected Result originalResult;
    protected Process process;
    protected T resultData;
    protected final String TAG = getClass().getSimpleName();
    protected boolean isRunning = false;
    protected InputStream dataInputStream = null;
    protected InputStream errorInputStream = null;
    protected OutputStream outputStream = null;

    protected static class Result {
        protected String dataResult;
        protected String errorResult;

        protected Result() {
        }

        protected String getDataResult() {
            return this.dataResult;
        }

        protected String getErrorResult() {
            return this.errorResult;
        }

        protected Result setDataResult(String str) {
            this.dataResult = str;
            return this;
        }

        protected Result setErrorResult(String str) {
            this.errorResult = str;
            return this;
        }
    }

    protected Process createProcess(String str) {
        return Runtime.getRuntime().exec(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    protected String execCommand(String str) throws InterruptedException {
        String data;
        String data2 = "";
        Process processCreateProcess = createProcess(str);
        this.process = processCreateProcess;
        processCreateProcess.waitFor();
        this.dataInputStream = this.process.getInputStream();
        this.errorInputStream = this.process.getErrorStream();
        ?? bufferedInputStream = new BufferedInputStream(this.dataInputStream);
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(this.errorInputStream);
        int i2 = 4;
        try {
            try {
                data = readData(bufferedInputStream);
                try {
                    data2 = readData(bufferedInputStream);
                    ?? r6 = {bufferedInputStream, this.dataInputStream, bufferedInputStream2, this.errorInputStream};
                    BaseUtil.closeAllCloseable(r6);
                    i2 = r6;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    ?? r7 = {bufferedInputStream, this.dataInputStream, bufferedInputStream2, this.errorInputStream};
                    BaseUtil.closeAllCloseable(r7);
                    i2 = r7;
                }
            } finally {
                ?? r8 = new Closeable[i2];
                r8[0] = bufferedInputStream;
                r8[1] = this.dataInputStream;
                r8[2] = bufferedInputStream2;
                r8[3] = this.errorInputStream;
                BaseUtil.closeAllCloseable(r8);
                this.process.destroy();
                parseErrorInfo(data2);
            }
        } catch (IOException e2) {
            e = e2;
            data = "";
        }
        return data;
    }

    protected String getIpFromMatcher(Matcher matcher) {
        String strGroup = matcher.group();
        int iIndexOf = strGroup.indexOf(40);
        return iIndexOf >= 0 ? strGroup.substring(iIndexOf + 1) : strGroup;
    }

    protected String getPingDelayFromMatcher(Matcher matcher) {
        String strGroup;
        if (matcher.find()) {
            strGroup = matcher.group();
            if (!TextUtils.isEmpty(strGroup)) {
                strGroup = strGroup.replace(" ms", "");
            }
        } else {
            strGroup = "0";
        }
        return strGroup.trim();
    }

    protected String getPingTTLFromMatcher(Matcher matcher) {
        return (matcher.find() ? matcher.group() : "0").trim();
    }

    public T getResultData() {
        return this.resultData;
    }

    protected Matcher matcherIp(String str) {
        return Pattern.compile(MATCH_PING_IP).matcher(str);
    }

    protected Matcher matcherRouteNode(String str) {
        return Pattern.compile(MATCH_TRACE_IP).matcher(str);
    }

    protected Matcher matcherTTL(String str) {
        return Pattern.compile(MATCH_PING_TTL).matcher(str);
    }

    protected Matcher matcherTTLExceeded(String str) {
        return Pattern.compile(MATCH_TTL_EXCEEDED).matcher(str);
    }

    protected Matcher matcherTime(String str) {
        return Pattern.compile(MATCH_PING_TIME).matcher(str);
    }

    protected abstract void parseErrorInfo(String str);

    protected abstract void parseInputInfo(String str);

    protected String readData(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[1024];
        byte[] bArrCopyOf = null;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                break;
            }
            if (bArrCopyOf == null) {
                bArrCopyOf = Arrays.copyOf(bArr, i2);
            } else {
                int length = bArrCopyOf.length;
                byte[] bArr2 = new byte[length + i2];
                System.arraycopy(bArrCopyOf, 0, bArr2, 0, length);
                System.arraycopy(bArr, 0, bArr2, length, i2);
                bArrCopyOf = bArr2;
            }
        }
        if (bArrCopyOf == null) {
            return null;
        }
        return new String(bArrCopyOf, Charset.forName("UTF-8"));
    }

    protected abstract void stop();
}
