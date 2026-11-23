package com.garena.pay.android.data;

import com.beetalk.sdk.u.j;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class TransactionInfo implements Serializable {
    private static final long serialVersionUID = -6266356721114414679L;
    private Integer appPoints;
    private Integer errorCode;
    private String icon;
    private String name;
    private GGPayment paymentRequest;
    private j.a resultCode;
    private String transactionError;
    private String transactionId;
    private TransactionStatus transactionStatus;
    private Long rebateId = 0L;
    private int remainingDays = 0;
    private int quantity = 0;

    public TransactionInfo(String str, TransactionStatus transactionStatus, Integer num, j.a aVar, GGPayment gGPayment) {
        this.transactionError = str;
        this.transactionStatus = transactionStatus;
        this.resultCode = aVar;
        this.paymentRequest = gGPayment;
        this.errorCode = num;
    }

    public Integer getAppPoints() {
        return this.appPoints;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public GGPayment getPaymentRequest() {
        return this.paymentRequest;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Long getRebateId() {
        return this.rebateId;
    }

    public int getRemainingDays() {
        return this.remainingDays;
    }

    public j.a getResultCode() {
        return this.resultCode;
    }

    public String getTransactionError() {
        return this.transactionError;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public TransactionStatus getTransactionStatus() {
        return this.transactionStatus;
    }

    public void setAppPoints(Integer num) {
        this.appPoints = num;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPaymentRequest(GGPayment gGPayment) {
        this.paymentRequest = gGPayment;
    }

    public void setQuantity(int i2) {
        this.quantity = i2;
    }

    public void setRebateId(Long l2) {
        this.rebateId = l2;
    }

    public void setRemainingDays(int i2) {
        this.remainingDays = i2;
    }

    public void setResultCode(j.a aVar) {
        this.resultCode = aVar;
    }

    public void setTransactionError(String str) {
        this.transactionError = str;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
