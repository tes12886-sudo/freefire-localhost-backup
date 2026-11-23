package com.dts.freefireth.FFNetCommand.TraceRoute;

import android.text.TextUtils;
import com.dts.freefireth.FFNetCommand.UCommandResult;
import com.dts.freefireth.FFNetCommand.UCommandStatus;
import j.d.d.e;
import j.d.d.y.c;

/* JADX INFO: loaded from: classes.dex */
public class SingleNodeResult extends UCommandResult {

    @c("delay")
    protected float delay;

    @c("hop")
    private int hop;

    @c("isFinalRoute")
    private boolean isFinalRoute;

    @c("routeIp")
    private String routeIp;

    protected SingleNodeResult(String str, int i2) {
        super(str);
        this.hop = i2;
        this.isFinalRoute = false;
        this.routeIp = "*";
        this.delay = 0.0f;
    }

    public float getDelay() {
        return this.delay;
    }

    public int getHop() {
        return this.hop;
    }

    public String getRouteIp() {
        return this.routeIp;
    }

    public boolean isFinalRoute() {
        return this.isFinalRoute;
    }

    public void setDelay(float f) {
        this.delay = f;
    }

    SingleNodeResult setFinalRoute(boolean z) {
        this.isFinalRoute = z;
        return this;
    }

    SingleNodeResult setHop(int i2) {
        this.hop = i2;
        return this;
    }

    SingleNodeResult setRouteIp(String str) {
        this.routeIp = str;
        this.isFinalRoute = TextUtils.equals(this.targetIp, str);
        return this;
    }

    SingleNodeResult setStatus(UCommandStatus uCommandStatus) {
        this.status = uCommandStatus;
        return this;
    }

    public String toString() {
        return new e().t(this);
    }
}
