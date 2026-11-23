.class final Lcom/facebook/internal/j0$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/j0$f;->b([Ljava/lang/Void;)[Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/internal/j0$f;

.field final synthetic b:[Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lcom/facebook/internal/j0$f;[Ljava/lang/String;ILjava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/j0$f$a;->a:Lcom/facebook/internal/j0$f;

    iput-object p2, p0, Lcom/facebook/internal/j0$f$a;->b:[Ljava/lang/String;

    iput p3, p0, Lcom/facebook/internal/j0$f$a;->c:I

    iput-object p4, p0, Lcom/facebook/internal/j0$f$a;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/facebook/x;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/x;->b()Lcom/facebook/q;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "Error staging photo."

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lcom/facebook/q;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    new-instance v0, Lcom/facebook/o;

    invoke-direct {v0, p1, v1}, Lcom/facebook/o;-><init>(Lcom/facebook/x;Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lcom/facebook/x;->c()Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v0, "uri"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/facebook/internal/j0$f$a;->b:[Ljava/lang/String;

    iget v1, p0, Lcom/facebook/internal/j0$f$a;->c:I

    aput-object p1, v0, v1

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/facebook/n;

    invoke-direct {p1, v1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Lcom/facebook/n;

    invoke-direct {p1, v1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/facebook/internal/j0$f$a;->a:Lcom/facebook/internal/j0$f;

    invoke-static {v0}, Lcom/facebook/internal/j0$f;->a(Lcom/facebook/internal/j0$f;)[Ljava/lang/Exception;

    move-result-object v0

    iget v1, p0, Lcom/facebook/internal/j0$f$a;->c:I

    aput-object p1, v0, v1

    :goto_1
    iget-object p1, p0, Lcom/facebook/internal/j0$f$a;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
