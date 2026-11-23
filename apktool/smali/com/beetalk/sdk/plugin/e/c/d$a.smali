.class Lcom/beetalk/sdk/plugin/e/c/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/c/d;->j(Landroid/app/Activity;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/beetalk/sdk/plugin/e/c/d;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/c/d;Ljava/util/List;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/c/d$a;->c:Lcom/beetalk/sdk/plugin/e/c/d;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/c/d$a;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/beetalk/sdk/plugin/e/c/d$a;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/c/d$a;->a:Ljava/util/List;

    invoke-static {v0}, Lcom/beetalk/sdk/z/i/d;->c(Ljava/util/List;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/c/d$a;->c:Lcom/beetalk/sdk/plugin/e/c/d;

    invoke-virtual {v1, v0}, Lcom/beetalk/sdk/plugin/e/c/a;->i(Lorg/json/JSONObject;)Lcom/garena/pay/android/b;

    move-result-object v1

    new-instance v2, Lcom/beetalk/sdk/u/e;

    invoke-direct {v2}, Lcom/beetalk/sdk/u/e;-><init>()V

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    sget-object v3, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    if-ne v1, v3, :cond_0

    invoke-static {v0}, Lcom/beetalk/sdk/plugin/d;->b(Lorg/json/JSONObject;)Ljava/util/Vector;

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/c/d$a;->b:Landroid/app/Activity;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/c/d$a;->c:Lcom/beetalk/sdk/plugin/e/c/d;

    invoke-virtual {v3}, Lcom/beetalk/sdk/plugin/e/c/d;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v1, v3}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/c/d$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
