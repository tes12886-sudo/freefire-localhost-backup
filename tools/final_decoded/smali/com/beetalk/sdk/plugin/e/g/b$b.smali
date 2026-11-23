.class Lcom/beetalk/sdk/plugin/e/g/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/g/b;->i(Landroid/app/Activity;Lcom/beetalk/sdk/u/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/u/k;

.field final synthetic c:Lcom/beetalk/sdk/plugin/e/g/b;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/g/b;Landroid/app/Activity;Lcom/beetalk/sdk/u/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/g/b$b;->c:Lcom/beetalk/sdk/plugin/e/g/b;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/g/b$b;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/beetalk/sdk/plugin/e/g/b$b;->b:Lcom/beetalk/sdk/u/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 6

    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/g/b$b;->c:Lcom/beetalk/sdk/plugin/e/g/b;

    invoke-virtual {v1}, Lcom/beetalk/sdk/plugin/e/g/b;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    :try_start_0
    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/g/b$b;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/g/b$b;->b:Lcom/beetalk/sdk/u/k;

    iget-object v3, v2, Lcom/beetalk/sdk/u/k;->a:Ljava/lang/String;

    iget-object v2, v2, Lcom/beetalk/sdk/u/k;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/beetalk/sdk/plugin/e/g/b$b;->a:Landroid/app/Activity;

    invoke-static {v4}, Lj/c/a/e/l/c;->a(Landroid/content/Context;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/beetalk/sdk/plugin/e/g/b$b;->b:Lcom/beetalk/sdk/u/k;

    iget-object v5, v5, Lcom/beetalk/sdk/u/k;->c:Ljava/lang/String;

    invoke-static {v1, v3, v2, v4, v5}, Lj/c/a/c/a/a;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_0
    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    sget-object v2, Lcom/garena/pay/android/b;->P:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :catch_1
    move-exception v1

    sget-object v2, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    :goto_1
    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    :goto_2
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/g/b$b;->a()Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v0

    return-object v0
.end method
