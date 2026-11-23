.class Lcom/beetalk/sdk/z/i/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/z/i/b;->q(Lcom/beetalk/sdk/u/i;Lcom/beetalk/sdk/z/e$h;)V
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
.field final synthetic a:Lcom/beetalk/sdk/u/i;

.field final synthetic b:Lcom/beetalk/sdk/z/e$h;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/u/i;Lcom/beetalk/sdk/z/e$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/z/i/b$a;->a:Lcom/beetalk/sdk/u/i;

    iput-object p2, p0, Lcom/beetalk/sdk/z/i/b$a;->b:Lcom/beetalk/sdk/z/e$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 6

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/beetalk/sdk/z/i/b$a;->a:Lcom/beetalk/sdk/u/i;

    iget-object v0, v0, Lcom/beetalk/sdk/u/i;->a:Ljava/lang/String;

    const-string v1, "password"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "client_type"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/beetalk/sdk/z/i/b$a;->a:Lcom/beetalk/sdk/u/i;

    iget-object v0, v0, Lcom/beetalk/sdk/u/i;->b:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "app_id"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/beetalk/sdk/z/i/b$a;->a:Lcom/beetalk/sdk/u/i;

    iget v0, v0, Lcom/beetalk/sdk/u/i;->c:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "source"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object v0

    invoke-static {}, Lcom/beetalk/sdk/p;->H()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/beetalk/sdk/z/i/b$a;->a:Lcom/beetalk/sdk/u/i;

    iget-object v2, v2, Lcom/beetalk/sdk/u/i;->d:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/beetalk/sdk/z/h;->k(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/z/i/b$a;->b:Lcom/beetalk/sdk/z/e$h;

    invoke-interface {v1, v0}, Lcom/beetalk/sdk/z/e$h;->onCompleted(Lorg/json/JSONObject;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/z/i/b$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
