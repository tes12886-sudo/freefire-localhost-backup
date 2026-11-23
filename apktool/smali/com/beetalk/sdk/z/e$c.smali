.class Lcom/beetalk/sdk/z/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/z/e;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/beetalk/sdk/z/e$j;",
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

    iput-object p1, p0, Lcom/beetalk/sdk/z/e$c;->b:Lcom/beetalk/sdk/z/e;

    iput-object p2, p0, Lcom/beetalk/sdk/z/e$c;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/beetalk/sdk/z/e$j;
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/z/e$c;->b:Lcom/beetalk/sdk/z/e;

    iget-object v1, p0, Lcom/beetalk/sdk/z/e$c;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beetalk/sdk/z/e;->b(Lcom/beetalk/sdk/z/e;Ljava/lang/String;)Lcom/beetalk/sdk/z/e$j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/z/e$c;->a()Lcom/beetalk/sdk/z/e$j;

    move-result-object v0

    return-object v0
.end method
