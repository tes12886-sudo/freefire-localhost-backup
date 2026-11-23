.class Li/i$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li/i;->z(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;
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
        "Li/i<",
        "TTContinuationResult;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Li/d;

.field final synthetic b:Li/g;


# direct methods
.method constructor <init>(Li/i;Li/d;Li/g;)V
    .locals 0

    iput-object p2, p0, Li/i$c;->a:Li/d;

    iput-object p3, p0, Li/i$c;->b:Li/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li/i$c;->b(Li/i;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "TTResult;>;)",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    iget-object v0, p0, Li/i$c;->a:Li/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Li/i;->f()Li/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li/i;->s()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Li/i;->q(Ljava/lang/Exception;)Li/i;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Li/i;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Li/i;->f()Li/i;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Li/i$c;->b:Li/g;

    invoke-virtual {p1, v0}, Li/i;->i(Li/g;)Li/i;

    move-result-object p1

    return-object p1
.end method
