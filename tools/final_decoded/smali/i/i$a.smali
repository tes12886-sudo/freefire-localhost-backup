.class Li/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li/i;->k(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "TTResult;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Li/j;

.field final synthetic b:Li/g;

.field final synthetic c:Ljava/util/concurrent/Executor;

.field final synthetic d:Li/d;


# direct methods
.method constructor <init>(Li/i;Li/j;Li/g;Ljava/util/concurrent/Executor;Li/d;)V
    .locals 0

    iput-object p2, p0, Li/i$a;->a:Li/j;

    iput-object p3, p0, Li/i$a;->b:Li/g;

    iput-object p4, p0, Li/i$a;->c:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Li/i$a;->d:Li/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li/i$a;->b(Li/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "TTResult;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    iget-object v0, p0, Li/i$a;->a:Li/j;

    iget-object v1, p0, Li/i$a;->b:Li/g;

    iget-object v2, p0, Li/i$a;->c:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Li/i$a;->d:Li/d;

    invoke-static {v0, v1, p1, v2, v3}, Li/i;->a(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V

    const/4 p1, 0x0

    return-object p1
.end method
