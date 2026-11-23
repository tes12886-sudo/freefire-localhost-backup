.class Lcom/beetalk/sdk/g$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/g$c;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/g$n;

.field final synthetic b:Lcom/beetalk/sdk/g$c;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/g$c;Lcom/beetalk/sdk/g$n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/g$c$a;->b:Lcom/beetalk/sdk/g$c;

    iput-object p2, p0, Lcom/beetalk/sdk/g$c$a;->a:Lcom/beetalk/sdk/g$n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/beetalk/sdk/g$c$a;->a:Lcom/beetalk/sdk/g$n;

    iget-object v1, p0, Lcom/beetalk/sdk/g$c$a;->b:Lcom/beetalk/sdk/g$c;

    iget-object v2, v1, Lcom/beetalk/sdk/g$c;->b:Lcom/beetalk/sdk/g;

    iget-object v1, v1, Lcom/beetalk/sdk/g$c;->a:Ljava/lang/Exception;

    invoke-interface {v0, v2, v1}, Lcom/beetalk/sdk/g$n;->onSessionProcessed(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    return-void
.end method
