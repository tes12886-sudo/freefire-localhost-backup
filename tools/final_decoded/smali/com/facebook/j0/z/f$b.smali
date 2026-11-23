.class final Lcom/facebook/j0/z/f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/z/f;->c(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j0/z/f;

.field final synthetic b:Lorg/json/JSONObject;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/j0/z/f;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/z/f$b;->a:Lcom/facebook/j0/z/f;

    iput-object p2, p0, Lcom/facebook/j0/z/f$b;->b:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/facebook/j0/z/f$b;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/j0/z/f$b;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/h0;->u(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "(this as java.lang.String).toLowerCase()"

    invoke-static {v0, v1}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/j0/z/f$b;->b:Lorg/json/JSONObject;

    invoke-static {v1, v0}, Lcom/facebook/j0/z/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)[F

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/j0/z/f$b;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/j0/z/f$b;->a:Lcom/facebook/j0/z/f;

    invoke-static {v3}, Lcom/facebook/j0/z/f;->a(Lcom/facebook/j0/z/f;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Lcom/facebook/j0/z/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v1, :cond_1

    return-void

    :cond_1
    sget-object v2, Lcom/facebook/j0/w/d$a;->b:Lcom/facebook/j0/w/d$a;

    const/4 v3, 0x1

    new-array v4, v3, [[F

    const/4 v5, 0x0

    aput-object v1, v4, v5

    new-array v6, v3, [Ljava/lang/String;

    aput-object v0, v6, v5

    invoke-static {v2, v4, v6}, Lcom/facebook/j0/w/d;->o(Lcom/facebook/j0/w/d$a;[[F[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    aget-object v0, v0, v5

    iget-object v2, p0, Lcom/facebook/j0/z/f$b;->d:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/facebook/j0/z/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "other"

    invoke-static {v0, v2}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v2, v3

    if-eqz v2, :cond_4

    sget-object v2, Lcom/facebook/j0/z/f;->f:Lcom/facebook/j0/z/f$a;

    iget-object v3, p0, Lcom/facebook/j0/z/f$b;->c:Ljava/lang/String;

    invoke-static {v2, v0, v3, v1}, Lcom/facebook/j0/z/f$a;->a(Lcom/facebook/j0/z/f$a;Ljava/lang/String;Ljava/lang/String;[F)V

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    :catch_0
    :cond_4
    :goto_0
    return-void
.end method
