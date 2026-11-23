.class Lcom/garena/pay/android/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/c;->B(Lcom/garena/pay/android/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Lcom/beetalk/sdk/networking/model/ChannelsResp;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/d;

.field final synthetic b:Lcom/garena/pay/android/c;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/c;Lcom/garena/pay/android/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/garena/pay/android/c$a;->b:Lcom/garena/pay/android/c;

    iput-object p2, p0, Lcom/garena/pay/android/c$a;->a:Lcom/garena/pay/android/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/pay/android/c$a;->b(Li/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/ChannelsResp;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    iget-object v0, p0, Lcom/garena/pay/android/c$a;->b:Lcom/garena/pay/android/c;

    invoke-static {v0}, Lcom/garena/pay/android/c;->a(Lcom/garena/pay/android/c;)V

    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/networking/model/ChannelsResp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    const-string v2, "Response Recd from Server: %s"

    invoke-static {v2, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/beetalk/sdk/networking/model/BaseResp;->getErrorCode()I

    move-result v0

    sget-object v2, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lcom/garena/pay/android/c$a;->b:Lcom/garena/pay/android/c;

    invoke-virtual {p1}, Lcom/beetalk/sdk/networking/model/BaseResp;->getErrorCode()I

    move-result p1

    invoke-static {p1}, Lcom/garena/pay/android/b;->d(I)Lcom/garena/pay/android/b;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/garena/pay/android/c;->b(Lcom/garena/pay/android/c;Lcom/garena/pay/android/b;)V

    return-object v1

    :cond_1
    iget-object v0, p0, Lcom/garena/pay/android/c$a;->b:Lcom/garena/pay/android/c;

    iget-object v2, p0, Lcom/garena/pay/android/c$a;->a:Lcom/garena/pay/android/d;

    invoke-static {v0, v2}, Lcom/garena/pay/android/c;->d(Lcom/garena/pay/android/c;Lcom/garena/pay/android/d;)Lcom/garena/pay/android/d;

    iget-object v0, p0, Lcom/garena/pay/android/c$a;->b:Lcom/garena/pay/android/c;

    invoke-static {v0}, Lcom/garena/pay/android/c;->c(Lcom/garena/pay/android/c;)Lcom/garena/pay/android/d;

    move-result-object v2

    invoke-static {v0, v2, p1}, Lcom/garena/pay/android/c;->f(Lcom/garena/pay/android/c;Lcom/garena/pay/android/d;Lcom/beetalk/sdk/networking/model/ChannelsResp;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/garena/pay/android/c;->e(Lcom/garena/pay/android/c;Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;

    iget-object p1, p0, Lcom/garena/pay/android/c$a;->b:Lcom/garena/pay/android/c;

    invoke-static {p1}, Lcom/garena/pay/android/c;->g(Lcom/garena/pay/android/c;)V

    return-object v1

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/garena/pay/android/c$a;->b:Lcom/garena/pay/android/c;

    sget-object v0, Lcom/garena/pay/android/b;->V:Lcom/garena/pay/android/b;

    invoke-static {p1, v0}, Lcom/garena/pay/android/c;->b(Lcom/garena/pay/android/c;Lcom/garena/pay/android/b;)V

    return-object v1
.end method
