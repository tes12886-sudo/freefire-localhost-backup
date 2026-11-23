.class Lcom/garena/pay/android/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILcom/garena/pay/android/h;)V
    .locals 3

    new-instance v0, Lcom/garena/pay/android/d;

    invoke-direct {v0}, Lcom/garena/pay/android/d;-><init>()V

    new-instance v1, Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;

    invoke-direct {v1}, Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;-><init>()V

    invoke-virtual {v1, p1}, Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;->setAppId(Ljava/lang/String;)Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;

    move-result-object p1

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beetalk/sdk/u/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;->setBuyerId(Ljava/lang/String;)Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;->setToken(Ljava/lang/String;)Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;->setServerId(I)Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;->setRoleId(I)Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;

    move-result-object p1

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object p2

    invoke-virtual {p2}, Lcom/beetalk/sdk/g;->D()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;->setPlatform(I)Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;

    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$GGPaymentBuilder;->build()Lcom/garena/pay/android/data/GGPayment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/garena/pay/android/d;->i(Lcom/garena/pay/android/data/GGPayment;)V

    new-instance p1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p0, p2, p3}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;-><init>(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->C()Li/i;

    move-result-object p0

    new-instance p2, Lcom/garena/pay/android/g$a;

    invoke-direct {p2, p5, p1}, Lcom/garena/pay/android/g$a;-><init>(Lcom/garena/pay/android/h;Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)V

    sget-object p1, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, p2, p1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    return-void
.end method
