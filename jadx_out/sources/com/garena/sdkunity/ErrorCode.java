package com.garena.sdkunity;

/* JADX INFO: loaded from: classes.dex */
public enum ErrorCode {
    SUCCESS(0, "no error"),
    REFRESH_TOKEN_FAILED(2006, "Token refreshed failed"),
    NETWORK_EXCEPTION(2008, "Network error."),
    ACCESS_TOKEN_INVALID_GRANT(2017, "Access token invalid grant"),
    ERROR_USER_BANNED(2018, "User banned");

    private final int code;
    private final String value;

    ErrorCode(int i2, String str) {
        this.value = str;
        this.code = i2;
    }

    public int getCode() {
        return this.code;
    }
}
