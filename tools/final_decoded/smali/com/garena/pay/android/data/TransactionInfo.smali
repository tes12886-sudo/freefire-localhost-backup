.class public Lcom/garena/pay/android/data/TransactionInfo;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x56f6923cbde7fe57L


# instance fields
.field private appPoints:Ljava/lang/Integer;

.field private errorCode:Ljava/lang/Integer;

.field private icon:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private paymentRequest:Lcom/garena/pay/android/data/GGPayment;

.field private quantity:I

.field private rebateId:Ljava/lang/Long;

.field private remainingDays:I

.field private resultCode:Lcom/beetalk/sdk/u/j$a;

.field private transactionError:Ljava/lang/String;

.field private transactionId:Ljava/lang/String;

.field private transactionStatus:Lcom/garena/pay/android/data/TransactionStatus;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/garena/pay/android/data/TransactionStatus;Ljava/lang/Integer;Lcom/beetalk/sdk/u/j$a;Lcom/garena/pay/android/data/GGPayment;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->rebateId:Ljava/lang/Long;

    const/4 v0, 0x0

    iput v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->remainingDays:I

    iput v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->quantity:I

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->transactionError:Ljava/lang/String;

    iput-object p2, p0, Lcom/garena/pay/android/data/TransactionInfo;->transactionStatus:Lcom/garena/pay/android/data/TransactionStatus;

    iput-object p4, p0, Lcom/garena/pay/android/data/TransactionInfo;->resultCode:Lcom/beetalk/sdk/u/j$a;

    iput-object p5, p0, Lcom/garena/pay/android/data/TransactionInfo;->paymentRequest:Lcom/garena/pay/android/data/GGPayment;

    iput-object p3, p0, Lcom/garena/pay/android/data/TransactionInfo;->errorCode:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getAppPoints()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->appPoints:Ljava/lang/Integer;

    return-object v0
.end method

.method public getErrorCode()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->errorCode:Ljava/lang/Integer;

    return-object v0
.end method

.method public getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPaymentRequest()Lcom/garena/pay/android/data/GGPayment;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->paymentRequest:Lcom/garena/pay/android/data/GGPayment;

    return-object v0
.end method

.method public getQuantity()I
    .locals 1

    iget v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->quantity:I

    return v0
.end method

.method public getRebateId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->rebateId:Ljava/lang/Long;

    return-object v0
.end method

.method public getRemainingDays()I
    .locals 1

    iget v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->remainingDays:I

    return v0
.end method

.method public getResultCode()Lcom/beetalk/sdk/u/j$a;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->resultCode:Lcom/beetalk/sdk/u/j$a;

    return-object v0
.end method

.method public getTransactionError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->transactionError:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->transactionId:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionStatus()Lcom/garena/pay/android/data/TransactionStatus;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/data/TransactionInfo;->transactionStatus:Lcom/garena/pay/android/data/TransactionStatus;

    return-object v0
.end method

.method public setAppPoints(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->appPoints:Ljava/lang/Integer;

    return-void
.end method

.method public setIcon(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->icon:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->name:Ljava/lang/String;

    return-void
.end method

.method public setPaymentRequest(Lcom/garena/pay/android/data/GGPayment;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->paymentRequest:Lcom/garena/pay/android/data/GGPayment;

    return-void
.end method

.method public setQuantity(I)V
    .locals 0

    iput p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->quantity:I

    return-void
.end method

.method public setRebateId(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->rebateId:Ljava/lang/Long;

    return-void
.end method

.method public setRemainingDays(I)V
    .locals 0

    iput p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->remainingDays:I

    return-void
.end method

.method public setResultCode(Lcom/beetalk/sdk/u/j$a;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->resultCode:Lcom/beetalk/sdk/u/j$a;

    return-void
.end method

.method public setTransactionError(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->transactionError:Ljava/lang/String;

    return-void
.end method

.method public setTransactionId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->transactionId:Ljava/lang/String;

    return-void
.end method

.method public setTransactionStatus(Lcom/garena/pay/android/data/TransactionStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/data/TransactionInfo;->transactionStatus:Lcom/garena/pay/android/data/TransactionStatus;

    return-void
.end method
