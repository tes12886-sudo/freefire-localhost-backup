.class Lcom/beetalk/sdk/plugin/e/c/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/c/c;->j(Landroid/app/Activity;Ljava/lang/Void;)V
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
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/c/c;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/c/c;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/c/c$a;->b:Lcom/beetalk/sdk/plugin/e/c/c;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/c/c$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    invoke-static {}, Lcom/beetalk/sdk/z/i/d;->b()Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/c/c$a;->b:Lcom/beetalk/sdk/plugin/e/c/c;

    invoke-virtual {v1, v0}, Lcom/beetalk/sdk/plugin/e/c/a;->i(Lorg/json/JSONObject;)Lcom/garena/pay/android/b;

    move-result-object v1

    new-instance v2, Lcom/beetalk/sdk/u/c;

    invoke-direct {v2}, Lcom/beetalk/sdk/u/c;-><init>()V

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    sget-object v3, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    if-ne v1, v3, :cond_0

    invoke-virtual {v3}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    invoke-static {v0}, Lcom/beetalk/sdk/plugin/d;->a(Lorg/json/JSONObject;)Ljava/util/Vector;

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/c/c$a;->a:Landroid/app/Activity;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/c/c$a;->b:Lcom/beetalk/sdk/plugin/e/c/c;

    invoke-virtual {v3}, Lcom/beetalk/sdk/plugin/e/c/c;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v1, v3}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/c/c$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
