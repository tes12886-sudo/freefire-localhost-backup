.class Lcom/garena/pay/android/c$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/garena/pay/android/k/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/c;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/c;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/c;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/c$e;->a:Lcom/garena/pay/android/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "User Dismissed the Dialog Box. Therefore invoking failed to pay"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/garena/pay/android/c$e;->a:Lcom/garena/pay/android/c;

    sget-object v1, Lcom/garena/pay/android/b;->T:Lcom/garena/pay/android/b;

    invoke-static {v0, v1}, Lcom/garena/pay/android/c;->b(Lcom/garena/pay/android/c;Lcom/garena/pay/android/b;)V

    return-void
.end method

.method public b(Lcom/garena/pay/android/data/GGPayment$Denomination;)V
    .locals 2

    iget-object v0, p0, Lcom/garena/pay/android/c$e;->a:Lcom/garena/pay/android/c;

    sget-object v1, Lcom/garena/pay/android/c$h;->e:Lcom/garena/pay/android/c$h;

    invoke-static {v0, v1}, Lcom/garena/pay/android/c;->i(Lcom/garena/pay/android/c;Lcom/garena/pay/android/c$h;)Lcom/garena/pay/android/c$h;

    iget-object v0, p0, Lcom/garena/pay/android/c$e;->a:Lcom/garena/pay/android/c;

    invoke-static {v0}, Lcom/garena/pay/android/c;->c(Lcom/garena/pay/android/c;)Lcom/garena/pay/android/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/garena/pay/android/d;->h(Lcom/garena/pay/android/data/GGPayment$Denomination;)V

    iget-object v0, p0, Lcom/garena/pay/android/c$e;->a:Lcom/garena/pay/android/c;

    invoke-static {v0}, Lcom/garena/pay/android/c;->g(Lcom/garena/pay/android/c;)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/garena/pay/android/data/GGPayment$Denomination;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "We have a denomination chosen %s Continue with payment next step"

    invoke-static {p1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
