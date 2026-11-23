package com.garena.pay.android;

import com.garena.pay.android.data.TransactionInfo;
import com.garena.pay.android.data.TransactionStatus;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    void onPaymentProcessed(TransactionStatus transactionStatus, Exception exc, TransactionInfo transactionInfo);
}
