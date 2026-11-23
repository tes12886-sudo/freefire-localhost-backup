.class final Lo/i$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/Executor;

.field final b:Lo/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lo/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo/d<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/i$b;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lo/i$b;->b:Lo/d;

    return-void
.end method


# virtual methods
.method public Q(Lo/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/f<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Le;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lo/i$b;->b:Lo/d;

    new-instance v1, Lo/i$b$a;

    invoke-direct {v1, p0, p1}, Lo/i$b$a;-><init>(Lo/i$b;Lo/f;)V

    invoke-interface {v0, v1}, Lo/d;->Q(Lo/f;)V

    return-void
.end method

.method public b()Lo/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/t<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lo/i$b;->b:Lo/d;

    invoke-interface {v0}, Lo/d;->b()Lo/t;

    move-result-object v0

    return-object v0
.end method

.method public c()Lm/b0;
    .locals 1

    iget-object v0, p0, Lo/i$b;->b:Lo/d;

    invoke-interface {v0}, Lo/d;->c()Lm/b0;

    move-result-object v0

    return-object v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lo/i$b;->b:Lo/d;

    invoke-interface {v0}, Lo/d;->cancel()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo/i$b;->j()Lo/d;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lo/i$b;->b:Lo/d;

    invoke-interface {v0}, Lo/d;->f()Z

    move-result v0

    return v0
.end method

.method public j()Lo/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lo/i$b;

    iget-object v1, p0, Lo/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lo/i$b;->b:Lo/d;

    invoke-interface {v2}, Lo/d;->j()Lo/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/i$b;-><init>(Ljava/util/concurrent/Executor;Lo/d;)V

    return-object v0
.end method
