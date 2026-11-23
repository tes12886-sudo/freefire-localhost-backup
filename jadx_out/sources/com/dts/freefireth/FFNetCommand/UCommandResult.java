package com.dts.freefireth.FFNetCommand;

import j.d.d.y.c;

/* JADX INFO: loaded from: classes.dex */
public class UCommandResult {

    @c("status")
    protected UCommandStatus status;

    @c("target_ip")
    protected String targetIp;

    protected UCommandResult(String str) {
        this.targetIp = str;
    }

    public UCommandStatus getStatus() {
        return this.status;
    }

    public String getTargetIp() {
        return this.targetIp;
    }

    protected UCommandResult setTargetIp(String str) {
        this.targetIp = str;
        return this;
    }
}
