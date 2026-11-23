.class Lcom/beetalk/sdk/plugin/e/b/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/u$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/i;->k(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/i;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/i;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/i$a;->b:Lcom/beetalk/sdk/plugin/e/b/i;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/i$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;Lcom/facebook/x;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/i$a;->b:Lcom/beetalk/sdk/plugin/e/b/i;

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/i$a;->a:Landroid/app/Activity;

    invoke-virtual {p2}, Lcom/facebook/x;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/beetalk/sdk/plugin/e/b/i;->m(Lcom/beetalk/sdk/plugin/e/b/i;Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/i$a;->b:Lcom/beetalk/sdk/plugin/e/b/i;

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/i$a;->a:Landroid/app/Activity;

    invoke-static {p2, v0, p1}, Lcom/beetalk/sdk/plugin/e/b/i;->n(Lcom/beetalk/sdk/plugin/e/b/i;Landroid/app/Activity;Lorg/json/JSONObject;)V

    :goto_0
    return-void
.end method
