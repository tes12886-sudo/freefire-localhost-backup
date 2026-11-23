.class Lcom/beetalk/sdk/g$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/g;->K(Lcom/beetalk/sdk/g$n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/g$n;

.field final synthetic b:Lcom/beetalk/sdk/g;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/g$k;->b:Lcom/beetalk/sdk/g;

    iput-object p2, p0, Lcom/beetalk/sdk/g$k;->a:Lcom/beetalk/sdk/g$n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/beetalk/sdk/g$k;->b:Lcom/beetalk/sdk/g;

    iget-object v1, p0, Lcom/beetalk/sdk/g$k;->a:Lcom/beetalk/sdk/g$n;

    invoke-static {v0, v1}, Lcom/beetalk/sdk/g;->b(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/g$k;->b:Lcom/beetalk/sdk/g;

    sget-object v1, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/g$k;->b:Lcom/beetalk/sdk/g;

    sget-object v1, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    :goto_0
    invoke-static {v0, v1}, Lcom/beetalk/sdk/g;->e(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/q;)Lcom/beetalk/sdk/q;

    iget-object v0, p0, Lcom/beetalk/sdk/g$k;->b:Lcom/beetalk/sdk/g;

    iget-object v1, p0, Lcom/beetalk/sdk/g$k;->a:Lcom/beetalk/sdk/g$n;

    const/4 v2, 0x0

    invoke-static {v0, v1, v0, v2}, Lcom/beetalk/sdk/g;->f(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    return-void
.end method
