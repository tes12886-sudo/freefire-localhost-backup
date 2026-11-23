.class final Lcom/facebook/internal/u$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/u;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/u$c;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/internal/u$c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/internal/u$c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/internal/u$c;->a:Landroid/content/Context;

    const-string v1, "com.facebook.internal.preferences.APP_SETTINGS"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/internal/u$c;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_2

    if-eqz v1, :cond_1

    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    const-string v3, "FacebookSDK"

    invoke-static {v3, v1}, Lcom/facebook/internal/h0;->e0(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_2

    sget-object v1, Lcom/facebook/internal/u;->h:Lcom/facebook/internal/u;

    iget-object v2, p0, Lcom/facebook/internal/u$c;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/internal/u;->l(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/t;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_1
    sget-object v1, Lcom/facebook/internal/u;->h:Lcom/facebook/internal/u;

    iget-object v3, p0, Lcom/facebook/internal/u$c;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/facebook/internal/u;->a(Lcom/facebook/internal/u;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v4, p0, Lcom/facebook/internal/u$c;->c:Ljava/lang/String;

    invoke-virtual {v1, v4, v3}, Lcom/facebook/internal/u;->l(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/t;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v4, p0, Lcom/facebook/internal/u$c;->b:Ljava/lang/String;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_3
    const/4 v0, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/facebook/internal/t;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/facebook/internal/u;->d(Lcom/facebook/internal/u;)Z

    move-result v3

    if-nez v3, :cond_4

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_4

    invoke-static {v1, v0}, Lcom/facebook/internal/u;->g(Lcom/facebook/internal/u;Z)V

    invoke-static {v1}, Lcom/facebook/internal/u;->e(Lcom/facebook/internal/u;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object v2, p0, Lcom/facebook/internal/u$c;->c:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/facebook/internal/s;->m(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-static {}, Lcom/facebook/j0/v/d;->d()V

    invoke-static {v1}, Lcom/facebook/internal/u;->c(Lcom/facebook/internal/u;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v1}, Lcom/facebook/internal/u;->b(Lcom/facebook/internal/u;)Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/internal/u$c;->c:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v2, Lcom/facebook/internal/u$a;->c:Lcom/facebook/internal/u$a;

    goto :goto_2

    :cond_5
    sget-object v2, Lcom/facebook/internal/u$a;->d:Lcom/facebook/internal/u$a;

    :goto_2
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/facebook/internal/u;->f(Lcom/facebook/internal/u;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
