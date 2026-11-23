package com.garena.pay.android;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    SUCCESS(0, "No Error"),
    APP_NOT_INSTALLED(2000, "Application is not installed"),
    UNSUPPORTED_API(2001, "Unsupported API used"),
    USER_CANCELLED(2002, "User cancelled the request"),
    USER_DENIED_REQUEST(2003, "User denied the request"),
    LOGIN_FAILED(2004, "Login failed"),
    REFRESH_TOKEN_SUCCESS(2005, "Token refreshed successfully"),
    REFRESH_TOKEN_FAILED(2006, "Token refreshed failed"),
    ACCESS_TOKEN_EXPIRED(2007, "Access token expired"),
    NETWORK_EXCEPTION(2008, "Network error."),
    ACCESS_TOKEN_EXCHANGE_FAILED(2009, "Access token exchanged failed"),
    NETWORK_CONNECTION_EXCEPTION(2010, "Server cannot be reached. Check your network connection"),
    CANNOT_GET_RESULT(2011, "Unable to retrieve result"),
    ERROR_IN_PARAMS(2012, "Error in parameters"),
    CANNOT_START_ACTIVITY(2013, "Cannot start activity"),
    REQUEST_ID_MISMATCH(2014, "Request ID mismatch"),
    ACCESS_TOKEN_INSPECTION_FAILED(2015, "Token inspection failed"),
    SESSION_NOT_INITIALIZED(2016, "Session not initialized"),
    BATCH_SIZE_EXCEEDED(2102, "Batch size exceeded for the request"),
    BIND_FAILED(2201, "Bind failed but login success"),
    GUEST_ACCOUNT_INVALID(2202, "Fail to grant guest token"),
    REDEEM_NOT_AVAILABLE(2304, "Redeem not available"),
    ALREADY_REDEEMED(2305, "Already redeemed"),
    REDEEM_LIMIT_REACHED(2306, "Redeem limit reached"),
    ERROR_TOKEN_SESSION(2307, "Error token session"),
    NETWORK_RESPONSE_PARSE_FAIL(2308, "Network response parse failed"),
    NETWORK_REQUEST_TIME_OUT(2309, "Network request timeout"),
    GOP_ERROR_SERVER(2300, "Server error"),
    GOP_ERROR_TOKEN(2302, "Invalid token"),
    GOP_ERROR_SCOPE(2303, "Invalid scope"),
    ERROR(2999, "General error"),
    PAYMENT_NO_ERROR(7000, "No payment error"),
    PAYMENT_CANNOT_START_ACTIVITY(7001, "Cannot start payment activity"),
    PAYMENT_REQUEST_ID_MISMATCH(7002, "Request ID mismatch"),
    PAYMENT_USER_CANCELLED(7003, "User cancelled payment"),
    PAYMENT_INVALID_SERVER_RESPONSE(7004, "Payment recd. Invalid response from server"),
    PAYMENT_NETWORK_CONNECTION_EXCEPTION(7005, "Network connection exception with the server"),
    PAYMENT_BUNDLE_RESULT_INVALID(7006, "Bundle result cannot be read, did you call onActivityResult?"),
    PAYMENT_ERROR_IN_PARAMS(7007, "Invalid parameters"),
    PAYMENT_ERROR_IN_SCOPE(7008, "Scope does not authorize payment"),
    PAYMENT_ERROR_IN_TOKEN(7009, "Error in access token used for payment"),
    PAYMENT_ERROR_SUBSCRIPTION_BINDING(7010, "Error when server binding subscription"),
    PAYMENT_ERROR_PENDING_TRANSACTION(7011, "Pending transaction"),
    PAYMENT_GENERAL_ERROR(7999, "General payment error"),
    UNKNOWN_ERROR(-1, "Unknown error occurred"),
    ACCESS_TOKEN_INVALID_GRANT(2017, "Access token invalid grant"),
    ERROR_USER_BANNED(2018, "User banned"),
    ERROR_GUEST_LOGIN(2019, "Error guest login"),
    DECODE_IMAGE_FAILED(20000, "Failed to decode image");

    private final String a;
    private final Integer b;

    b(Integer num, String str) {
        this.a = str;
        this.b = num;
    }

    public static b d(int i2) {
        for (b bVar : values()) {
            if (i2 == bVar.c().intValue()) {
                return bVar;
            }
        }
        return UNKNOWN_ERROR;
    }

    public static boolean f(int i2) {
        return i2 == ACCESS_TOKEN_EXCHANGE_FAILED.c().intValue() || i2 == ACCESS_TOKEN_EXPIRED.c().intValue() || i2 == REFRESH_TOKEN_FAILED.c().intValue();
    }

    public Integer c() {
        return this.b;
    }

    public String e() {
        return this.a;
    }
}
