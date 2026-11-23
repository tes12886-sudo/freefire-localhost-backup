package com.dts.freefireth.FFNetCommand.TraceRoute;

import android.text.TextUtils;
import com.dts.freefireth.FFNetCommand.UCommandResult;
import com.dts.freefireth.FFNetCommand.UCommandStatus;
import j.d.d.e;
import j.d.d.y.c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TracerouteNodeResult extends UCommandResult {

    @c("average_delay")
    private int averageDelay;

    @c("hop")
    private int hop;

    @c("is_final_route")
    private boolean isFinalRoute;

    @c("loss_rate")
    private int lossRate;

    @c("route_ip")
    private String routeIp;
    private List<SingleNodeResult> singleNodeList;

    protected TracerouteNodeResult(String str, int i2, List<SingleNodeResult> list) {
        super(str);
        this.hop = i2;
        this.isFinalRoute = false;
        this.routeIp = "*";
        setSingleNodeList(list);
        this.averageDelay = averageDelay();
        this.lossRate = lossRate();
    }

    public int averageDelay() {
        List<SingleNodeResult> list = this.singleNodeList;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        float f = 0.0f;
        for (SingleNodeResult singleNodeResult : this.singleNodeList) {
            if (singleNodeResult != null) {
                float f2 = singleNodeResult.delay;
                if (f2 > 0.0f) {
                    i2++;
                    f += f2;
                }
            }
        }
        return Math.round(f / i2);
    }

    public int getHop() {
        return this.hop;
    }

    public String getRouteIp() {
        return this.routeIp;
    }

    public List<SingleNodeResult> getSingleNodeList() {
        return this.singleNodeList;
    }

    public boolean isFinalRoute() {
        return this.isFinalRoute;
    }

    public int lossRate() {
        List<SingleNodeResult> list = this.singleNodeList;
        if (list == null || list.isEmpty()) {
            return 100;
        }
        int i2 = 0;
        float size = this.singleNodeList.size();
        for (SingleNodeResult singleNodeResult : this.singleNodeList) {
            if (singleNodeResult == null || singleNodeResult.getStatus() != UCommandStatus.CMD_STATUS_SUCCESSFUL || singleNodeResult.delay == 0.0f) {
                i2++;
            }
        }
        return Math.round((i2 / size) * 100.0f);
    }

    TracerouteNodeResult setFinalRoute(boolean z) {
        this.isFinalRoute = z;
        return this;
    }

    TracerouteNodeResult setHop(int i2) {
        this.hop = i2;
        return this;
    }

    TracerouteNodeResult setRouteIp(String str) {
        this.routeIp = str;
        this.isFinalRoute = TextUtils.equals(this.targetIp, str);
        return this;
    }

    void setSingleNodeList(List<SingleNodeResult> list) {
        this.singleNodeList = list;
        if (list == null) {
            return;
        }
        for (SingleNodeResult singleNodeResult : list) {
            if (!TextUtils.equals("*", singleNodeResult.getRouteIp())) {
                setRouteIp(singleNodeResult.getRouteIp());
                return;
            }
        }
    }

    public String toString() {
        return new e().t(this);
    }
}
