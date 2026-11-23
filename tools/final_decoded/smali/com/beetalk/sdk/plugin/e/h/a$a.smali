.class Lcom/beetalk/sdk/plugin/e/h/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/h/a;->i(Landroid/app/Activity;Ljava/lang/Void;)V
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

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/h/a;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/h/a;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/h/a$a;->b:Lcom/beetalk/sdk/plugin/e/h/a;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/h/a$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    invoke-static {}, Lcom/beetalk/sdk/z/i/e;->a()Lorg/json/JSONObject;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/u/h;

    invoke-direct {v1}, Lcom/beetalk/sdk/u/h;-><init>()V

    sget-object v2, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beetalk/sdk/g;->D()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v3, "UserInfoPlugin: Received response from server %s"

    invoke-static {v3, v2}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/beetalk/sdk/x/d;->b(Lorg/json/JSONObject;)Lcom/garena/pay/android/b;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    goto :goto_1

    :cond_0
    :try_start_0
    sget-object v2, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    const-string v2, "platform"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    new-instance v2, Lcom/beetalk/sdk/u/g;

    invoke-direct {v2}, Lcom/beetalk/sdk/u/g;-><init>()V

    iput-object v2, v1, Lcom/beetalk/sdk/u/h;->a:Lcom/beetalk/sdk/u/g;

    const-string v2, "icon"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    iget-object v2, v1, Lcom/beetalk/sdk/u/h;->a:Lcom/beetalk/sdk/u/g;

    const-string v3, "gender"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    iput v3, v2, Lcom/beetalk/sdk/u/g;->c:I

    iget-object v2, v1, Lcom/beetalk/sdk/u/h;->a:Lcom/beetalk/sdk/u/g;

    const-string v3, "nickname"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/beetalk/sdk/u/g;->b:Ljava/lang/String;

    iget-object v2, v1, Lcom/beetalk/sdk/u/h;->a:Lcom/beetalk/sdk/u/g;

    const-string v3, "open_id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/beetalk/sdk/u/g;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    sget-object v0, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/h/a$a;->a:Landroid/app/Activity;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/h/a$a;->b:Lcom/beetalk/sdk/plugin/e/h/a;

    invoke-virtual {v3}, Lcom/beetalk/sdk/plugin/e/h/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/h/a$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
