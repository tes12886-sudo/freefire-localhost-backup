.class Lcom/beetalk/sdk/z/i/b$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/z/i/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/z/e$h;)V
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/beetalk/sdk/z/e$h;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/z/e$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/z/i/b$f;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/beetalk/sdk/z/i/b$f;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/beetalk/sdk/z/i/b$f;->c:Lcom/beetalk/sdk/z/e$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/beetalk/sdk/z/i/b$f;->a:Ljava/lang/String;

    const-string v2, "access_token"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/beetalk/sdk/z/i/b$f;->b:Ljava/lang/String;

    const-string v2, "secondary_access_token"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object v1

    invoke-static {}, Lcom/beetalk/sdk/p;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lcom/beetalk/sdk/z/h;->j(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/z/i/b$f;->c:Lcom/beetalk/sdk/z/e$h;

    invoke-interface {v1, v0}, Lcom/beetalk/sdk/z/e$h;->onCompleted(Lorg/json/JSONObject;)V

    return-object v3
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/z/i/b$f;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
