.class Li/i$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li/i$f;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "TTContinuationResult;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Li/i$f;


# direct methods
.method constructor <init>(Li/i$f;)V
    .locals 0

    iput-object p1, p0, Li/i$f$a;->a:Li/i$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li/i$f$a;->b(Li/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Ljava/lang/Void;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "TTContinuationResult;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    iget-object v0, p0, Li/i$f$a;->a:Li/i$f;

    iget-object v0, v0, Li/i$f;->a:Li/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Li/i$f$a;->a:Li/i$f;

    iget-object p1, p1, Li/i$f;->b:Li/j;

    invoke-virtual {p1}, Li/j;->b()V

    return-object v1

    :cond_0
    invoke-virtual {p1}, Li/i;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Li/i$f$a;->a:Li/i$f;

    iget-object p1, p1, Li/i$f;->b:Li/j;

    invoke-virtual {p1}, Li/j;->b()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Li/i$f$a;->a:Li/i$f;

    iget-object v0, v0, Li/i$f;->b:Li/j;

    invoke-virtual {p1}, Li/i;->s()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Li/j;->c(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Li/i$f$a;->a:Li/i$f;

    iget-object v0, v0, Li/i$f;->b:Li/j;

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Li/j;->d(Ljava/lang/Object;)V

    :goto_0
    return-object v1
.end method
