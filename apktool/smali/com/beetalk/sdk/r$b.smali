.class Lcom/beetalk/sdk/r$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/r;->i(Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/b$c;

.field final synthetic b:Lcom/beetalk/sdk/r;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/r;Lcom/beetalk/sdk/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/r$b;->b:Lcom/beetalk/sdk/r;

    iput-object p2, p0, Lcom/beetalk/sdk/r$b;->a:Lcom/beetalk/sdk/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/r$b;->b(Li/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Ljava/lang/Void;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Li/i;->v()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Li/i;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;

    invoke-virtual {p1}, Lcom/beetalk/sdk/networking/model/BaseResp;->getErrorCode()I

    move-result v0

    sget-object v2, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lcom/beetalk/sdk/r$b;->a:Lcom/beetalk/sdk/b$c;

    invoke-virtual {p1}, Lcom/beetalk/sdk/networking/model/BaseResp;->getErrorCode()I

    move-result p1

    invoke-static {v0, p1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/beetalk/sdk/u/a;

    invoke-virtual {p1}, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/beetalk/sdk/u/l;->k:Lcom/beetalk/sdk/u/l;

    invoke-virtual {p1}, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->getPlatform()I

    move-result v4

    invoke-direct {v0, v2, v3, v4}, Lcom/beetalk/sdk/u/a;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V

    invoke-virtual {p1}, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->getExpireTime()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/beetalk/sdk/u/a;->k(I)V

    iget-object v2, p0, Lcom/beetalk/sdk/r$b;->a:Lcom/beetalk/sdk/b$c;

    invoke-virtual {p1}, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->getOpenId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->getPlatform()I

    move-result p1

    invoke-static {v2, v0, v3, p1}, Lcom/beetalk/sdk/b$e;->c(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/u/a;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lcom/beetalk/sdk/r$b;->b:Lcom/beetalk/sdk/r;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/r;->h(Lcom/beetalk/sdk/r;Lcom/beetalk/sdk/b$e;)V

    return-object v1

    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/beetalk/sdk/r$b;->a:Lcom/beetalk/sdk/b$c;

    sget-object v0, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {p1, v0}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    goto :goto_0
.end method
