.class Lcom/beetalk/sdk/z/i/b$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/z/i/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Li/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/beetalk/sdk/z/e$m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/z/i/b$d;->a:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/beetalk/sdk/z/e$m;
    .locals 3

    new-instance v0, Lcom/beetalk/sdk/z/e;

    sget-object v1, Lcom/beetalk/sdk/z/e$k;->b:Lcom/beetalk/sdk/z/e$k;

    iget-object v2, p0, Lcom/beetalk/sdk/z/i/b$d;->a:Ljava/util/HashMap;

    invoke-direct {v0, v1, v2}, Lcom/beetalk/sdk/z/e;-><init>(Lcom/beetalk/sdk/z/e$k;Ljava/util/Map;)V

    invoke-static {}, Lcom/beetalk/sdk/p;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/z/e;->i(Ljava/lang/String;)Lcom/beetalk/sdk/z/e$m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/z/i/b$d;->a()Lcom/beetalk/sdk/z/e$m;

    move-result-object v0

    return-object v0
.end method
