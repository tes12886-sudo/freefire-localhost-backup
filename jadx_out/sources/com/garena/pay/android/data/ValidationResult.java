package com.garena.pay.android.data;

/* JADX INFO: loaded from: classes.dex */
public class ValidationResult {
    public String errorMessage;
    public ResultCode resultCode;

    public enum ResultCode {
        SUCCESS,
        ERROR
    }

    public static ValidationResult createError(String str) {
        ValidationResult validationResult = new ValidationResult();
        validationResult.errorMessage = str;
        validationResult.resultCode = ResultCode.ERROR;
        return validationResult;
    }
}
