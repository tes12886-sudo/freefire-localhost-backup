.class Lcom/beetalk/sdk/g$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/g;->O(Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/g$n;

.field final synthetic b:Lcom/beetalk/sdk/g;

.field final synthetic c:Ljava/lang/Exception;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/beetalk/sdk/g$j;->a:Lcom/beetalk/sdk/g$n;

    iput-object p3, p0, Lcom/beetalk/sdk/g$j;->b:Lcom/beetalk/sdk/g;

    iput-object p4, p0, Lcom/beetalk/sdk/g$j;->c:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/beetalk/sdk/g$j;->a:Lcom/beetalk/sdk/g$n;

    iget-object v1, p0, Lcom/beetalk/sdk/g$j;->b:Lcom/beetalk/sdk/g;

    iget-object v2, p0, Lcom/beetalk/sdk/g$j;->c:Ljava/lang/Exception;

    invoke-interface {v0, v1, v2}, Lcom/beetalk/sdk/g$n;->onSessionProcessed(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    return-void
.end method
