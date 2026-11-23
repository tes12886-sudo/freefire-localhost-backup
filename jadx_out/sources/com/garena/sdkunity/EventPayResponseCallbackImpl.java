package com.garena.sdkunity;

import com.beetalk.sdk.u.j;
import com.garena.pay.android.b;
import com.garena.pay.android.data.TransactionInfo;
import com.garena.pay.android.data.TransactionStatus;
import com.garena.pay.android.f;

/* JADX INFO: loaded from: classes.dex */
class EventPayResponseCallbackImpl implements f {
    EventPayResponseCallbackImpl() {
    }

    public void onEventPayInitFailure(int i2, Exception exc) {
        String str;
        ProcessPaymentResult processPaymentResult = new ProcessPaymentResult();
        if (i2 != 0) {
            switch (i2) {
                case 4001:
                    processPaymentResult.errorCode = 4500;
                    str = "invalid_event";
                    break;
                case 4002:
                    processPaymentResult.errorCode = 4501;
                    str = "txn_pending";
                    break;
                case 4003:
                    processPaymentResult.errorCode = 4502;
                    str = "unknown";
                    break;
                default:
                    processPaymentResult.errorCode = b.PAYMENT_GENERAL_ERROR.c().intValue();
                    break;
            }
            TransactionStatus transactionStatus = TransactionStatus.CLOSED_WITH_ERROR;
            processPaymentResult.status = transactionStatus.getValue().intValue();
            processPaymentResult.transactionStatus = transactionStatus.getValue().intValue();
            processPaymentResult.resultCode = j.a.ERROR.c().intValue();
            UnityMessgae.getInstance().sendToUnity("onEventPaymentProcessed_Exception", processPaymentResult);
        }
        processPaymentResult.errorCode = b.PAYMENT_INVALID_SERVER_RESPONSE.c().intValue();
        str = "false_init";
        processPaymentResult.errorMessage = str;
        TransactionStatus transactionStatus2 = TransactionStatus.CLOSED_WITH_ERROR;
        processPaymentResult.status = transactionStatus2.getValue().intValue();
        processPaymentResult.transactionStatus = transactionStatus2.getValue().intValue();
        processPaymentResult.resultCode = j.a.ERROR.c().intValue();
        UnityMessgae.getInstance().sendToUnity("onEventPaymentProcessed_Exception", processPaymentResult);
    }

    @Override // com.garena.pay.android.f
    public void onPaymentProcessed(TransactionStatus transactionStatus, Exception exc, TransactionInfo transactionInfo) {
        UnityMessgae.getInstance().sendToUnity(transactionStatus.getValue().intValue() >= TransactionStatus.CLOSED_WITH_ERROR.getValue().intValue() ? "onEventPaymentProcessed_Exception" : "onEventPaymentProcessed", IAP.Convert(transactionInfo, transactionStatus, exc));
    }
}
