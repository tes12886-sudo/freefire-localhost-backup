.class Lcom/beetalk/sdk/g$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/g;->X(Lcom/beetalk/sdk/q;Lcom/beetalk/sdk/q;Ljava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Exception;

.field final synthetic b:Lcom/beetalk/sdk/g;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/g$c;->b:Lcom/beetalk/sdk/g;

    iput-object p2, p0, Lcom/beetalk/sdk/g$c;->a:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/beetalk/sdk/g$c;->b:Lcom/beetalk/sdk/g;

    invoke-static {v0}, Lcom/beetalk/sdk/g;->d(Lcom/beetalk/sdk/g;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/beetalk/sdk/g$n;

    new-instance v2, Lcom/beetalk/sdk/g$c$a;

    invoke-direct {v2, p0, v1}, Lcom/beetalk/sdk/g$c$a;-><init>(Lcom/beetalk/sdk/g$c;Lcom/beetalk/sdk/g$n;)V

    iget-object v1, p0, Lcom/beetalk/sdk/g$c;->b:Lcom/beetalk/sdk/g;

    invoke-static {v1}, Lcom/beetalk/sdk/g;->i(Lcom/beetalk/sdk/g;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/beetalk/sdk/g;->j(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method
