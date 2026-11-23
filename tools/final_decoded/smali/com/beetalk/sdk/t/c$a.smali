.class Lcom/beetalk/sdk/t/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/t/c;->c()V
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
.field final synthetic a:Lcom/beetalk/sdk/t/c;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/t/c;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 7

    iget-object v0, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    invoke-static {v0}, Lcom/beetalk/sdk/t/c;->a(Lcom/beetalk/sdk/t/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/x/d;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    iget-object v1, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    invoke-static {v1}, Lcom/beetalk/sdk/t/c;->a(Lcom/beetalk/sdk/t/c;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/beetalk/sdk/x/d;->g(Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v3, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    invoke-static {v3}, Lcom/beetalk/sdk/t/c;->a(Lcom/beetalk/sdk/t/c;)Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    invoke-static {v4}, Lcom/beetalk/sdk/t/c;->a(Lcom/beetalk/sdk/t/c;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/beetalk/sdk/x/d;->i(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    invoke-static {v0, v1, v3}, Lcom/beetalk/sdk/z/i/a;->a(Ljava/lang/String;II)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AppConfig:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v1, v4}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "error"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AppConfig Error:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :cond_1
    const-string v1, "client_log"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object v4

    sget-object v5, Lcom/beetalk/sdk/p$c;->a:Lcom/beetalk/sdk/p$c;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-object v5, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    invoke-static {v5, v1, v4}, Lcom/beetalk/sdk/t/c;->b(Lcom/beetalk/sdk/t/c;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    sget-boolean v4, Lcom/beetalk/sdk/p;->a:Z

    if-nez v4, :cond_3

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "Debug Build Skipping config value"

    invoke-static {v5, v4}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    iget-object v4, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_0
    invoke-static {v4, v1, v5}, Lcom/beetalk/sdk/t/c;->b(Lcom/beetalk/sdk/t/c;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    const-string v1, "overlay_config_url"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    invoke-static {v4, v1, v0}, Lcom/beetalk/sdk/t/c;->b(Lcom/beetalk/sdk/t/c;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/beetalk/sdk/t/c$a;->a:Lcom/beetalk/sdk/t/c;

    invoke-static {v1}, Lcom/beetalk/sdk/t/c;->a(Lcom/beetalk/sdk/t/c;)Landroid/content/Context;

    move-result-object v1

    const-string v4, "overlay_button_config"

    invoke-static {v1, v4}, Lcom/beetalk/sdk/x/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/beetalk/sdk/x/b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/beetalk/sdk/x/b;->e(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_4

    invoke-static {v0}, Lcom/beetalk/sdk/z/i/a;->b(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "OverLay Config:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v5, v3}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v3, 0xe10

    invoke-virtual {v1, v4, v0, v3}, Lcom/beetalk/sdk/x/b;->k(Ljava/lang/String;Lorg/json/JSONObject;I)V

    :cond_4
    return-object v2
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/c$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
