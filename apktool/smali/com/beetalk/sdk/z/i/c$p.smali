.class Lcom/beetalk/sdk/z/i/c$p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/z/i/c;->g(Ljava/util/Map;)Li/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Lcom/beetalk/sdk/z/e$m;",
        "Lcom/beetalk/sdk/networking/model/EventCancelResp;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/z/i/c$p;->b(Li/i;)Lcom/beetalk/sdk/networking/model/EventCancelResp;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Lcom/beetalk/sdk/networking/model/EventCancelResp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Lcom/beetalk/sdk/z/e$m;",
            ">;)",
            "Lcom/beetalk/sdk/networking/model/EventCancelResp;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/z/e$m;

    iget-boolean v0, p1, Lcom/beetalk/sdk/z/e$m;->a:Z

    if-nez v0, :cond_0

    iget-object p1, p1, Lcom/beetalk/sdk/z/e$m;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/beetalk/sdk/networking/model/EventCancelResp;->parse(Ljava/lang/String;)Lcom/beetalk/sdk/networking/model/EventCancelResp;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1
.end method
