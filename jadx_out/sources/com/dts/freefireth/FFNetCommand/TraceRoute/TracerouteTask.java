package com.dts.freefireth.FFNetCommand.TraceRoute;

import android.os.SystemClock;
import android.text.TextUtils;
import com.dts.freefireth.FFNetCommand.UCommandStatus;
import com.dts.freefireth.FFNetCommand.UCommandTask;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public class TracerouteTask extends UCommandTask<TracerouteNodeResult> {
    private TracerouteCallback2 callback;
    private int count;
    private int currentCount;
    private int hop;
    private InetAddress targetAddress;

    TracerouteTask(InetAddress inetAddress, int i2) {
        this(inetAddress, i2, 3, null);
    }

    TracerouteTask(InetAddress inetAddress, int i2, int i3, TracerouteCallback2 tracerouteCallback2) {
        this.targetAddress = inetAddress;
        this.hop = i2;
        this.count = i3;
        this.callback = tracerouteCallback2;
    }

    TracerouteTask(InetAddress inetAddress, int i2, TracerouteCallback2 tracerouteCallback2) {
        this(inetAddress, i2, 3, tracerouteCallback2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.dts.freefireth.FFNetCommand.TraceRoute.TracerouteNodeResult] */
    private TracerouteNodeResult running() {
        this.isRunning = true;
        InetAddress inetAddress = this.targetAddress;
        this.command = String.format("ping -c 1 -W 1 -t %d %s", Integer.valueOf(this.hop), inetAddress == null ? "" : inetAddress.getHostAddress());
        this.currentCount = 0;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        while (this.isRunning && this.currentCount < this.count) {
            try {
                SingleNodeResult singleNodeInfoInput = parseSingleNodeInfoInput(execCommand(this.command));
                float fElapsedRealtime = (SystemClock.elapsedRealtime() - jElapsedRealtime) / 2.0f;
                if (!singleNodeInfoInput.isFinalRoute() && singleNodeInfoInput.getStatus() == UCommandStatus.CMD_STATUS_SUCCESSFUL) {
                    singleNodeInfoInput.setDelay(fElapsedRealtime);
                }
                arrayList.add(singleNodeInfoInput);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            } finally {
                this.currentCount++;
            }
        }
        ?? tracerouteNodeResult = new TracerouteNodeResult(this.targetAddress.getHostAddress(), this.hop, arrayList);
        this.resultData = tracerouteNodeResult;
        return (TracerouteNodeResult) tracerouteNodeResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.dts.freefireth.FFNetCommand.TraceRoute.TracerouteNodeResult] */
    @Override // java.util.concurrent.Callable
    public TracerouteNodeResult call() {
        ?? Running = running();
        this.resultData = Running;
        TracerouteCallback2 tracerouteCallback2 = this.callback;
        if (tracerouteCallback2 != null) {
            tracerouteCallback2.onTracerouteNode((TracerouteNodeResult) Running);
        }
        return (TracerouteNodeResult) this.resultData;
    }

    @Override // com.dts.freefireth.FFNetCommand.UCommandTask
    protected void parseErrorInfo(String str) {
    }

    @Override // com.dts.freefireth.FFNetCommand.UCommandTask
    protected void parseInputInfo(String str) {
    }

    protected SingleNodeResult parseSingleNodeInfoInput(String str) {
        SingleNodeResult singleNodeResult = new SingleNodeResult(this.targetAddress.getHostAddress(), this.hop);
        if (TextUtils.isEmpty(str)) {
            singleNodeResult.setStatus(UCommandStatus.CMD_STATUS_NETWORK_ERROR);
            singleNodeResult.setDelay(0.0f);
            return singleNodeResult;
        }
        Matcher matcherMatcherRouteNode = matcherRouteNode(str);
        if (matcherMatcherRouteNode.find()) {
            singleNodeResult.setRouteIp(getIpFromMatcher(matcherMatcherRouteNode));
            singleNodeResult.setStatus(UCommandStatus.CMD_STATUS_SUCCESSFUL);
        } else {
            Matcher matcherMatcherIp = matcherIp(str);
            if (matcherMatcherIp.find()) {
                singleNodeResult.setRouteIp(matcherMatcherIp.group());
                singleNodeResult.setStatus(UCommandStatus.CMD_STATUS_SUCCESSFUL);
                singleNodeResult.setDelay(Float.parseFloat(getPingDelayFromMatcher(matcherTime(str))));
            } else {
                singleNodeResult.setStatus(UCommandStatus.CMD_STATUS_FAILED);
                singleNodeResult.setDelay(0.0f);
            }
        }
        return singleNodeResult;
    }

    @Override // com.dts.freefireth.FFNetCommand.UCommandTask
    protected void stop() {
        this.isRunning = false;
    }
}
