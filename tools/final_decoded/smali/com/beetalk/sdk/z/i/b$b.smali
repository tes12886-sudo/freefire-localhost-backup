.class Lcom/beetalk/sdk/z/i/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/z/i/b;->m(JLjava/lang/String;Lcom/beetalk/sdk/a0/a;Ljava/lang/String;Lcom/beetalk/sdk/z/e$h;)V
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
.field final synthetic a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/beetalk/sdk/a0/a;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/beetalk/sdk/z/e$h;


# direct methods
.method constructor <init>(JLjava/lang/String;Lcom/beetalk/sdk/a0/a;Ljava/lang/String;Lcom/beetalk/sdk/z/e$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-wide p1, p0, Lcom/beetalk/sdk/z/i/b$b;->a:J

    iput-object p3, p0, Lcom/beetalk/sdk/z/i/b$b;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/beetalk/sdk/z/i/b$b;->c:Lcom/beetalk/sdk/a0/a;

    iput-object p5, p0, Lcom/beetalk/sdk/z/i/b$b;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/beetalk/sdk/z/i/b$b;->e:Lcom/beetalk/sdk/z/e$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 6

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iget-wide v0, p0, Lcom/beetalk/sdk/z/i/b$b;->a:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "uid"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/beetalk/sdk/z/i/b$b;->b:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "password"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/beetalk/sdk/z/i/b$b;->c:Lcom/beetalk/sdk/a0/a;

    invoke-virtual {v0}, Lcom/beetalk/sdk/a0/a;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "response_type"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "client_type"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/beetalk/sdk/z/i/b$b;->d:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "client_id"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->u()Ljava/lang/String;

    move-result-object v0

    const-string v1, "client_secret"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object v0

    invoke-static {}, Lcom/beetalk/sdk/p;->w()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x1

    const-string v5, ""

    invoke-virtual/range {v0 .. v5}, Lcom/beetalk/sdk/z/h;->k(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/z/i/b$b;->e:Lcom/beetalk/sdk/z/e$h;

    invoke-interface {v1, v0}, Lcom/beetalk/sdk/z/e$h;->onCompleted(Lorg/json/JSONObject;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/z/i/b$b;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
