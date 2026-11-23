package com.dts.freefireth.FFNetCommand.TraceRoute;

import j.d.d.e;
import j.d.d.y.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TracerouteResult {

    @c("target_ip")
    private String targetIp;

    @c("time_stamp")
    private long timestamp;

    @c("traceroute_node_results")
    private List<TracerouteNodeResult> tracerouteNodeResults = new ArrayList();

    public TracerouteResult(String str, long j2) {
        this.targetIp = str;
        this.timestamp = j2;
    }

    public String getTargetIp() {
        return this.targetIp;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public List<TracerouteNodeResult> getTracerouteNodeResults() {
        return this.tracerouteNodeResults;
    }

    public String toString() {
        return new e().t(this);
    }
}
