package com.dts.freefireth;

import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class FFTraceRoute {
    private static final String Error = "network error";
    private static final String MATCH_PING_IP = "(?<=from ).*(?=: icmp_seq=1 ttl=)";
    private static final String MATCH_PING_TIME = "(?<=time=).*?ms";
    private static final String MATCH_TRACE_IP = "(?<=From )(?:[0-9]{1,3}\\.){3}[0-9]{1,3}";
    private static final int MaxHop = 31;
    private final String address;
    private final Callback complete;
    private volatile boolean stopped = false;
    private Result result = null;

    public interface Callback {
        void complete(Result result);
    }

    public static class Result {
        public final HashMap<Integer, RouteInfo> RouteInfos = new HashMap<>();
        public final String ip;

        public Result(String str) {
            this.ip = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void append(int i2, String str, long j2) {
            RouteInfo routeInfo;
            if (!this.RouteInfos.containsKey(Integer.valueOf(i2)) || (routeInfo = this.RouteInfos.get(Integer.valueOf(i2))) == null) {
                routeInfo = new RouteInfo(i2, str, j2);
            } else {
                routeInfo.append(j2);
            }
            this.RouteInfos.put(Integer.valueOf(i2), routeInfo);
        }
    }

    public static class RouteInfo {
        public final ArrayList<Long> PingTime;
        public final String ip;
        public int ttl;

        public RouteInfo(int i2, String str, long j2) {
            this.ttl = i2;
            this.ip = str;
            ArrayList<Long> arrayList = new ArrayList<>();
            this.PingTime = arrayList;
            arrayList.add(Long.valueOf(j2));
        }

        public void append(long j2) {
            this.PingTime.add(Long.valueOf(j2));
        }
    }

    private FFTraceRoute(String str, Callback callback) {
        this.address = str;
        this.complete = callback;
    }

    private Process executePingCmd(String str, int i2) {
        return Runtime.getRuntime().exec("ping -n -c 1 -t " + i2 + " " + str);
    }

    private static String getIp(String str) {
        return InetAddress.getByName(str).getHostAddress();
    }

    static String getIpFromTraceMatcher(Matcher matcher) {
        String strGroup = matcher.group();
        int iIndexOf = strGroup.indexOf(40);
        return iIndexOf >= 0 ? strGroup.substring(iIndexOf + 1) : strGroup;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:29:0x002f). Please report as a decompilation issue!!! */
    private String getPingtOutput(Process process) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                        bufferedReader.close();
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        bufferedReader.close();
        try {
            process.waitFor();
        } catch (InterruptedException e4) {
            e4.printStackTrace();
        }
        process.destroy();
        return sb.toString();
    }

    static Matcher ipMatcher(String str) {
        return Pattern.compile(MATCH_PING_IP).matcher(str);
    }

    private void printEnd(Matcher matcher, int i2, String str) {
        String strGroup = matcher.group();
        Matcher matcherTimeMatcher = timeMatcher(str);
        if (matcherTimeMatcher.find()) {
            this.result.append(i2, strGroup, Long.parseLong(matcherTimeMatcher.group()));
        }
    }

    private void printNormal(Matcher matcher, int i2, long j2) {
        this.result.append(i2, getIpFromTraceMatcher(matcher), j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() throws Exception {
        try {
            String ip = getIp(this.address);
            this.result = new Result(ip);
            for (int i2 = 1; i2 < 31 && !this.stopped; i2++) {
                boolean z = false;
                for (int i3 = 0; i3 < 3; i3++) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        Process processExecutePingCmd = executePingCmd(ip, i2);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        String pingtOutput = getPingtOutput(processExecutePingCmd);
                        if (pingtOutput.length() == 0) {
                            throw new Exception(Error);
                        }
                        Matcher matcherTraceMatcher = traceMatcher(pingtOutput);
                        if (matcherTraceMatcher.find()) {
                            printNormal(matcherTraceMatcher, i2, (jCurrentTimeMillis2 - jCurrentTimeMillis) / 2);
                        } else {
                            Matcher matcherIpMatcher = ipMatcher(pingtOutput);
                            if (matcherIpMatcher.find()) {
                                printEnd(matcherIpMatcher, i2, pingtOutput);
                                z = true;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new Exception("ping cmd error " + e.getMessage());
                    }
                }
                if (z) {
                    break;
                }
            }
            this.complete.complete(this.result);
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            Result result = new Result("");
            this.result = result;
            this.complete.complete(result);
        }
    }

    public static FFTraceRoute start(String str, Callback callback) {
        FFTraceRoute fFTraceRoute = new FFTraceRoute(str, callback);
        AsyncTask.execute(new Runnable() { // from class: com.dts.freefireth.FFTraceRoute.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FFTraceRoute.this.run();
                } catch (Exception e) {
                    Log.e("Unity", "<Tracert> TraceRoute.run have Exception " + e);
                }
            }
        });
        return fFTraceRoute;
    }

    static Matcher timeMatcher(String str) {
        return Pattern.compile(MATCH_PING_TIME).matcher(str);
    }

    static Matcher traceMatcher(String str) {
        return Pattern.compile(MATCH_TRACE_IP).matcher(str);
    }
}
