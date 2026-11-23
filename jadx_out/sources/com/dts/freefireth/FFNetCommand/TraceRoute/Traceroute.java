package com.dts.freefireth.FFNetCommand.TraceRoute;

import android.os.SystemClock;
import com.dts.freefireth.FFNetCommand.IPUtil;
import com.dts.freefireth.FFNetCommand.UCommandStatus;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class Traceroute implements Runnable {
    protected final String TAG;
    private TracerouteCallback callback;
    private Config config;
    private boolean isUserStop;
    private ExecutorService threadPool;

    public static class Config {
        private InetAddress targetAddress;
        private String targetHost;
        private int maxHop = 32;
        private int countPerRoute = 3;
        private int threadSize = 3;

        public Config(String str) {
            this.targetHost = str;
        }

        public int getCountPerRoute() {
            return this.countPerRoute;
        }

        public int getMaxHop() {
            return this.maxHop;
        }

        InetAddress getTargetAddress() {
            return this.targetAddress;
        }

        public String getTargetHost() {
            return this.targetHost;
        }

        public int getThreadSize() {
            return this.threadSize;
        }

        InetAddress parseTargetAddress() throws UnknownHostException {
            InetAddress iPv4Address = IPUtil.parseIPv4Address(this.targetHost);
            this.targetAddress = iPv4Address;
            return iPv4Address;
        }

        public Config setCountPerRoute(int i2) {
            this.countPerRoute = Math.max(1, Math.min(i2, 3));
            return this;
        }

        public Config setMaxHop(int i2) {
            this.maxHop = Math.max(1, Math.min(i2, 128));
            return this;
        }

        public Config setTargetHost(String str) {
            this.targetHost = str;
            return this;
        }

        public Config setThreadSize(int i2) {
            this.threadSize = Math.max(1, Math.min(i2, 5));
            return this;
        }
    }

    public Traceroute(Config config, TracerouteCallback tracerouteCallback) {
        this.TAG = getClass().getSimpleName();
        this.isUserStop = false;
        this.config = config == null ? new Config("") : config;
        this.callback = tracerouteCallback;
    }

    public Traceroute(String str, TracerouteCallback tracerouteCallback) {
        this(new Config(str), tracerouteCallback);
    }

    private TracerouteResult optResult(long j2, List<Future<TracerouteNodeResult>> list) {
        TracerouteResult tracerouteResult = new TracerouteResult(this.config.getTargetAddress().getHostAddress(), j2);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Future<TracerouteNodeResult> future = list.get(i2);
            if (future != null) {
                try {
                    TracerouteNodeResult tracerouteNodeResult = future.get();
                    if (tracerouteNodeResult != null) {
                        tracerouteResult.getTracerouteNodeResults().add(tracerouteNodeResult);
                        if (tracerouteNodeResult.isFinalRoute()) {
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return tracerouteResult;
    }

    private void stopTask() {
        ExecutorService executorService = this.threadPool;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.threadPool.shutdownNow();
    }

    public Config getConfig() {
        return this.config;
    }

    public boolean isRunning() {
        return !this.threadPool.isTerminated();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.threadPool = Executors.newFixedThreadPool(this.config.threadSize);
        this.isUserStop = false;
        ArrayList arrayList = new ArrayList();
        try {
            InetAddress targetAddress = this.config.parseTargetAddress();
            for (int i2 = 1; i2 <= this.config.maxHop; i2++) {
                int i3 = this.config.countPerRoute;
                TracerouteCallback tracerouteCallback = this.callback;
                arrayList.add(new TracerouteTask(targetAddress, i2, i3, tracerouteCallback instanceof TracerouteCallback2 ? (TracerouteCallback2) tracerouteCallback : null));
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            try {
                try {
                    SystemClock.elapsedRealtime();
                    List<Future<TracerouteNodeResult>> listInvokeAll = this.threadPool.invokeAll(arrayList);
                    stopTask();
                    if (listInvokeAll == null) {
                        TracerouteCallback tracerouteCallback2 = this.callback;
                        if (tracerouteCallback2 != null) {
                            tracerouteCallback2.onTracerouteFinish(null, UCommandStatus.CMD_STATUS_ERROR);
                            return;
                        }
                        return;
                    }
                    TracerouteResult tracerouteResultOptResult = optResult(jCurrentTimeMillis, listInvokeAll);
                    TracerouteCallback tracerouteCallback3 = this.callback;
                    if (tracerouteCallback3 != null) {
                        tracerouteCallback3.onTracerouteFinish(tracerouteResultOptResult, this.isUserStop ? UCommandStatus.CMD_STATUS_USER_STOP : UCommandStatus.CMD_STATUS_SUCCESSFUL);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    stopTask();
                    TracerouteCallback tracerouteCallback4 = this.callback;
                    if (tracerouteCallback4 != null) {
                        tracerouteCallback4.onTracerouteFinish(null, UCommandStatus.CMD_STATUS_ERROR);
                    }
                }
            } catch (Throwable unused) {
                stopTask();
                TracerouteCallback tracerouteCallback5 = this.callback;
                if (tracerouteCallback5 != null) {
                    tracerouteCallback5.onTracerouteFinish(null, UCommandStatus.CMD_STATUS_ERROR);
                }
            }
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            TracerouteCallback tracerouteCallback6 = this.callback;
            if (tracerouteCallback6 != null) {
                tracerouteCallback6.onTracerouteFinish(null, UCommandStatus.CMD_STATUS_ERROR_UNKNOW_HOST);
            }
        }
    }

    public void stop() {
        this.isUserStop = true;
        stopTask();
    }
}
