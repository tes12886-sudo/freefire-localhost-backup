.class Lcom/beetalk/sdk/z/e$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/z/e;->j(Ljava/lang/String;)Lcom/beetalk/sdk/z/e$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/beetalk/sdk/z/e;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/z/e;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/z/e$d;->b:Lcom/beetalk/sdk/z/e;

    iput-object p2, p0, Lcom/beetalk/sdk/z/e$d;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 4

    sget-object v0, Lcom/beetalk/sdk/z/e$e;->a:[I

    iget-object v1, p0, Lcom/beetalk/sdk/z/e$d;->b:Lcom/beetalk/sdk/z/e;

    invoke-static {v1}, Lcom/beetalk/sdk/z/e;->c(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$k;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/z/e$d;->b:Lcom/beetalk/sdk/z/e;

    invoke-static {v0}, Lcom/beetalk/sdk/z/e;->e(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$g;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/z/e$g;->b:Lcom/beetalk/sdk/z/e$g;

    if-ne v0, v1, :cond_1

    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/z/e$d;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/beetalk/sdk/z/e$d;->b:Lcom/beetalk/sdk/z/e;

    invoke-static {v2}, Lcom/beetalk/sdk/z/e;->f(Lcom/beetalk/sdk/z/e;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/beetalk/sdk/z/e$d;->b:Lcom/beetalk/sdk/z/e;

    invoke-static {v3}, Lcom/beetalk/sdk/z/e;->g(Lcom/beetalk/sdk/z/e;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/beetalk/sdk/z/h;->l(Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/z/e$d;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/beetalk/sdk/z/e$d;->b:Lcom/beetalk/sdk/z/e;

    invoke-static {v2}, Lcom/beetalk/sdk/z/e;->f(Lcom/beetalk/sdk/z/e;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/beetalk/sdk/z/e$d;->b:Lcom/beetalk/sdk/z/e;

    invoke-static {v3}, Lcom/beetalk/sdk/z/e;->d(Lcom/beetalk/sdk/z/e;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/beetalk/sdk/z/h;->j(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/z/e$d;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/beetalk/sdk/z/e$d;->b:Lcom/beetalk/sdk/z/e;

    invoke-static {v2}, Lcom/beetalk/sdk/z/e;->d(Lcom/beetalk/sdk/z/e;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/beetalk/sdk/z/h;->g(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/z/e$d;->a()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
